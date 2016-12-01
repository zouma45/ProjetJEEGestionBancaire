package main;

import beans.client.Client;
import beans.client.ClientServicesImpl;
import util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		//HibernateUtil hb = new HibernateUtil();
		Client c1=new Client("mahdi", "zouch");
		ClientServicesImpl clt = new ClientServicesImpl() ; 
		clt.add(c1);

	}

}
