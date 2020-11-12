class contacts constructor(var contactID: Int = 999,
                           var firstName: String? = "Dave",
                           var lastName: String? = "Boesen",
                           var emailAddress: String? = "home@home.com",
                           var phoneHome: String? = "815-555-5555",
                           var phoneWork: String?= "815-555-5555",
                           var phoneCell: String? = "815-555-5555"
                           ){
    init{
        println("New contact added: $firstName $lastName")
    }

    fun printAll(){
        println(contactID.toString() + "\n" + firstName + " " + lastName + "\nEmail: " + emailAddress + "\nHome Phone: " +
                phoneHome + "\nWork Phone: " + phoneWork + "\nCell Phone: " + phoneCell + "\n")
        //println("${contactID.toString()} \n$firstName $lastName")
    }
}