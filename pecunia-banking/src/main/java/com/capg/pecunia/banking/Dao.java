package com.capg.pecunia.banking;

import java.util.HashMap;

public class Dao {
	static HashMap<String,Bean>hm=new HashMap<String,Bean>();
	public static String addAccount(Bean b)
	{
		hm.put(b.getAccountNo(), b);
		String r=  b.getAccountNo();
		System.out.println(hm.containsKey(r));
		return r;
	}
	

}
