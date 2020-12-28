package com.clover.pattern.chain.impl;

import com.clover.pattern.chain.inter.Approver;
import com.clover.pattern.chain.model.PurchaseRequest;

public class VicePresident extends Approver {

	public VicePresident(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 10000) {
			System.out.println("董事会" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
					+ "元，采购目的：" + request.getPurpose());
		} else {
			this.successor.processRequest(request);
		}
	}
}
