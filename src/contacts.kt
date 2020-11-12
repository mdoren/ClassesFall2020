class employeeContacts(var fullName: String, //All that are needed is their name, employee number and shift number
                       var empNumber: Int? = 0,
                       var empShift: Int){
    fun printInfo(){ //function to print the info neatly
        println(fullName + "\nEmployee Number: " + empNumber + "\nEmployee Shift: "+ empShift + "\n")
    }


}
