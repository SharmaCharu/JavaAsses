package commerce;

public class Customer {
    private String name="";
    private String gender="";
    private String phoneNo= "" ;
     
    public Customer(){}
    	 
    	public Customer(String name, String gender, String phoneNo) {
    		this.name=name;
    		this.gender=gender;
    		this.phoneNo=phoneNo;	
   
    	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
    	
    }

