package com.clover.pattern.chain;

import com.clover.pattern.chain.impl.Congress;
import com.clover.pattern.chain.impl.Director;
import com.clover.pattern.chain.impl.President;
import com.clover.pattern.chain.impl.VicePresident;
import com.clover.pattern.chain.inter.Approver;
import com.clover.pattern.chain.model.PurchaseRequest;

public class Client {
	public static void main(String[] args) {
		Approver director = new Director("小李");
		Approver vicePresident = new VicePresident("鸣人");
		Approver president = new President("七代目");
		Approver congress = new Congress("火影");

		director.setSuccessor(vicePresident);
		vicePresident.setSuccessor(president);
		president.setSuccessor(congress);

		PurchaseRequest request = new PurchaseRequest(2000, 100, "买团子吃");
		director.processRequest(request);
		
		request = new PurchaseRequest(5000, 1200, "买九尾当仙人");
		director.processRequest(request);
		
		request = new PurchaseRequest(12000, 1010, "重建村子");
		director.processRequest(request);
		
		request = new PurchaseRequest(112000, 1000, "发动战争");
		director.processRequest(request);
	}
}
