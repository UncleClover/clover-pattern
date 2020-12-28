package com.clover.pattern.chain.impl;

import com.clover.pattern.chain.inter.Approver;
import com.clover.pattern.chain.model.PurchaseRequest;

public class President extends Approver {

	public President(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 20000) {
			System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
					+ "元，采购目的：" + request.getPurpose());
		} else {
			this.successor.processRequest(request);
		}
	}
}
