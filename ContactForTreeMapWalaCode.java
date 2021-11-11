package java_Assignments;

public class ContactForTreeMapWalaCode implements Comparable<ContactForTreeMapWalaCode>
{
	
		private Long PhoneNo;
		private String Name;
		private String Email;
		enum Gender
		{
			male,female;
		}
		 private Gender gen;
		
		
		public ContactForTreeMapWalaCode(Long PhoneNo, String Name, String Email, Gender gen) {
			super();
			this.PhoneNo = PhoneNo;
			this.Name = Name;
			this.Email = Email;
			this.gen = gen;
		}
		


		public Long getPhno() {
			return PhoneNo;
		}



		public void setPhno(Long PhoneNo) {
			this.PhoneNo = PhoneNo;
		}



		public String getName() {
			return Name;
		}



		public void setName(String name) {
			this.Name = Name;
		}



		public String getEmail() {
			return Email;
		}



		public void setEmail(String email) {
			this.Email = Email;
		}



		public Gender getGen() {
			return gen;
		}



		public void setGen(Gender gen) {
			this.gen = gen;
		}



		@Override
		public String toString() {
			return "Contact [PhoneNo.=" + PhoneNo + ", Name=" + Name + ", Email Address=" + Email + ", Gender=" + gen + "]";
		}


		@Override
		public int compareTo(ContactForTreeMapWalaCode o) {
			// TODO Auto-generated method stub
			return this.getPhno().compareTo(o.getPhno());
			
		}


		

		
	

}
