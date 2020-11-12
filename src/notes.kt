fun main(){
    val person1 = contacts(1, "Barney", "Rubble", "barney@aol.com", "825-555-2345",
     "815-555-1111", "815-555-2222")
    val person2 = contacts(2, "Fred", "Flintstone", "fflint@aol.com", "815-555-3334",
        "815-555-3111", "815-555-5552")

    person1.printAll()
    println("\n")
    person2.printAll()
}