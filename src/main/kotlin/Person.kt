class Person(var Firstname: String, var Surname: String, var Phonenumber: String, var Email: String)
{
    init {
        Firstname = readln()
        Surname = readln()
        Phonenumber = readln()
        Email = readln()

        println("Kontakt skapad")
    }


}