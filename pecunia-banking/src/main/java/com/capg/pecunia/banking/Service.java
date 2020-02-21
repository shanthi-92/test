package com.capg.pecunia.banking;

public class Service {
	public static String addAccount(String accountName,String accountNo, String aadharNo, String panNo)
	{
		Bean b=new Bean(accountName,accountNo,aadharNo,panNo);
		b.setAadharNo(aadharNo);
		b.setAccountName(accountName);
		b.setPanNo(panNo);
		b.setAccountNo(accountNo);
		Dao d=new Dao();
		String result=null;
		try
		{
			result=Dao.addAccount(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}

}
