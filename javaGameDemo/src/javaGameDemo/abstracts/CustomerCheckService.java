package javaGameDemo.abstracts;

import javaGameDemo.entities.Customer;

public interface CustomerCheckService {
	
	boolean customerCheck(Customer customer) throws Exception;
}
