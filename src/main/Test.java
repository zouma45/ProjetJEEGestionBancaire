package main;

import beans.client.Client;
import beans.client.ClientServicesImpl;
import util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		HibernateUtil hb = new HibernateUtil();
		
		ClientServicesImpl clt = new ClientServicesImpl() ; 
		clt.add(new Client("mahdi", "zouch"));

	}

}
