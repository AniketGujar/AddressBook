import java.util.*;

class UserInformation {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phone;

	UserInformation(String firstName, String lastName, String address, String city, String state, String zip, String phone) {
		this.firstName=firstName;
		this.lastName=lastName;
	        this.address=address;
        	this.city=city;
	        this.state=state;
        	this.zip=zip;
	        this.phone=phone;
	}
}

class AddressBook {
        static int user_choice;

        public static LinkedList<UserInformation> userData;

        public static void main(String[] args){
            AddressBook info = new AddressBook();
 	    userData = new LinkedList<>();
            userInput();
	}

	public static  void print() {
		for(int i = 0; i< userData.size(); i++){
	        System.out.print("Entry No." + (i+1)+": ");
		System.out.println(userData.get(i).firstName +" " +userData.get(i).lastName);
                System.out.println(userData.get(i).address+" "+userData.get(i).city+" "+userData.get(i).state+ " "+userData.get(i).zip);
                System.out.println(userData.get(i).phone);
		System.out.println();
		}
		if (userData.size() == 0){
		System.out.println("NO Data!");
		}
	userInput();
	}

	public static void editExisting(){
	System.out.println(userData.get(0).firstName +" "+userData.get(0).lastName);
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter a Number to edit the Entry: 1.FirstName 2.LastName, 3.Address 4.City 5.State 6.Zip 7.Phone");
            int user_choice_to_edit = myObj2.nextInt();

        switch(user_choice_to_edit) {
        case 1:
	System.out.println("Input: "+ user_choice_to_edit);
        break;
        case 2:
        System.out.println("Input: "+ user_choice_to_edit);
        break;
        case 3:
        System.out.println("Input: "+ user_choice_to_edit);
        break;
        case 4:
        System.out.println("Input: "+ user_choice_to_edit);
        break;
        case 5:
        System.out.println("Input: "+ user_choice_to_edit);
        break;
        case 6:
        System.out.println("Input: "+ user_choice_to_edit);
        break;
        case 7:
        System.out.println("Input: "+ user_choice_to_edit);
        break;
           default :
        System.out.println("Invalid Input: "+ user_choice_to_edit);
        }

	print();
	}

	public static void deleteEntry(){
	print();

            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter a Number to Delete the Entry: 1.FirstEntry 2.SecondEntry ...");
            int user_choice_to_delete = myObj1.nextInt();

        switch(user_choice_to_delete) {
        case 1:
        System.out.println("Input: "+ user_choice_to_delete);
        break;
        case 2:
        System.out.println("Input: "+ user_choice_to_delete);
        break;
        case 3:
        System.out.println("Input: "+ user_choice_to_delete);
        break;
           default :
        System.out.println("Invalid Input: "+ user_choice_to_delete);
        }
	}

	public static void userInput(){
            Scanner myObj = new Scanner(System.in);
	    System.out.println("Please Enter a Number: 1.Create New   2.Edit Existing   3.View Entry   4.Delete Entry");
	    user_choice = myObj.nextInt();
            menu(user_choice);
	}

	public static void menu(int user_choice){
	switch(user_choice) {
   	case 1:
	createNew();
	break;
	case 2:
	editExisting();
      	break;
	case 3:
	print();
	break;
        case 4:
        deleteEntry();
        break;
   	   default :
	System.out.println("Invalid Input: "+ user_choice);
	}
	}

	static void createNew(){
		System.out.println("Enter Data FirstName");
                Scanner myObj = new Scanner(System.in);
                String firstName = myObj.nextLine();
		 System.out.println("Enter Data LastName");
                myObj = new Scanner(System.in);
                String lastName = myObj.nextLine();
 		System.out.println("Enter Data Address");
                myObj = new Scanner(System.in);
                String address = myObj.nextLine();
		 System.out.println("Enter Data City");
                myObj = new Scanner(System.in);
                String city = myObj.nextLine();
 		System.out.println("Enter Data  State");
                 myObj = new Scanner(System.in);
                String state = myObj.nextLine();
 		System.out.println("Enter Data  ZipCode");
                 myObj = new Scanner(System.in);
                String zip = myObj.nextLine();
 		System.out.println("Enter Data Phone Number");
                 myObj = new Scanner(System.in);
                String phone = myObj.nextLine();

		addInfo( firstName, lastName, address, city,  state, zip, phone);
	}
        static void addInfo(String firstName, String lastName, String address, String city, String state, String zip, String phone) {
                UserInformation info = new UserInformation(firstName,lastName,address,city,state,zip,phone);
                userData.add(info);
		print();
        }

}
