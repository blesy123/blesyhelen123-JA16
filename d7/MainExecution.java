package d7;

public class MainExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Question 1
				//Following is the new requirement from Client
				// Print employee id with their respective job location 
				// for example
				// 101 : Delhi 
				// 102 : Mumbai 
				// and so on
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		String city[] = service.getCityCodes();
		String cities[] = {"Delhi","011","Mumbai","022","Banglore","080","Pune","021"};
		boolean cityFound = false;
        for(int i = 0;i<codes.length;i++) {
        	try {
				System.out.println(codes[i]+":"+searchCity(codes[i],city[i],cities));
			} catch (Exception e) {
				e.printStackTrace();
			}
     
        }
	
	}
	public static String searchCity(String code,String cty_code,String c[]) throws Exception {

	for(int i=1;i<c.length;i=i+2) {
     		if(cty_code.equals(c[i])) {
     		
     			return c[i-1];

     		}
     	
     }
		
	throw new InvalidPincode("Invalid pincode");
	
}

}

		class InvalidPincode extends RuntimeException {
	public InvalidPincode(String msg) {
		super(msg);
	}
	}


