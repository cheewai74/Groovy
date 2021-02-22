class helloWorld {
    static void main(String[] args) {
        println "Hello World"

        int age = 45

        println age

        println age.getClass()

        def name = "John"

        println name

        println name.getClass()

        Person person = new Person()
        person.setFirstName("Moses")
        person.setLastName("Wong")
        person.setAge(46)

        println person.getFullName()
        println person.getAge()

        if (person.getAge() >= 45 && person.getAge() <= 60) {
            println person.getFullName() + " is middle age"
        } else {
            println person.getFullName() + " is " + person.getAge() + " years old"
        }

        def persons = [person, new Person(firstName: "Rick", lastName: "koh", age: 40)]

        for (Person p : persons) {
            println p.getFullName()
        }

        try {

            person.getFirstName().toLong()
        }
        catch(NumberFormatException e){
            assert e instanceof  NumberFormatException
            println "Cannot convert a string into a Long"
        }


       // println person.getFirstName().dropRight(num:2)


    }
}
