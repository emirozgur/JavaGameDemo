package javaGameDemo.adapters;

import javaGameDemo.abstracts.CustomerCheckService;
import javaGameDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean customerCheck(Customer customer) throws Exception {
		
			boolean result;
			
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			
			result= kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
			return result;
	}
		
	

}
