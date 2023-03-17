package com.example.mynoactivitiytest

/*fun main(){
    //Creating instances of classes
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")

}

class Person(firstName: String = "John", lastName: String = "Doe"){
    //Initializer Block
    init{
        println("Initialized a new Person object with " +
        "firstName = $firstName and lastName = $lastName")
        /*WILL print
        *Initialized a new Person object with
        firstName = Denis and lastName = Panjuta
        * Initialized a new Person object with
        firstName = John and lastName = Doe
        * Initialized a new Person object with
        firstName = John and lastName = Peterson */
    }
}*/

/*Please create a class called MobilePhone.
It should have three primary constructor variables, osName, brand and model.

Use the initializer to print those details.

Create three objects of that class in the Main function.

Examples of phones would be:
Samsung Galaxy S20 Ultra. Here the osName is Android, brand is Samsung, model is Galaxy S20 Ultra*/

/*fun main(){
    //3 objects
    //var SamsungGalaxyS20Ultra = MobilePhone( "Android", "Samsung", "Galaxy S Ultra")
    var test = MobilePhone( "SamsungGalaxyS20Ultra","Android", "Samsung", "Galaxy S Ultra")
    //var IphoneCatorze = MobilePhone("IOS", "Apple", "AppleUltra")
    var test2 = MobilePhone("Iphone14","IOS", "Apple", "AppleUltra")
    //var XAOMIvinte = MobilePhone("XaoChina", "Xaomi", "XaomiUltra")
    var test3 = MobilePhone("XAOM20","XaoChina", "Xaomi", "XaomiUltra")
    var test4 = MobilePhone()
}
//class and constructors
class MobilePhone(NameMobile: String = "Huawei10", osName: String = "HarmonyOS", brand: String ="HTC", model: String = "HuaweiUltra"){
    //Initializer Block
    init {

        println(" Santa Claus initialized my new year of 2024 with the best $NameMobile, and best operation system $osName, $brand, $model pleaseeee!!")
    }

}*/

//Solution for Exercise Classes and Objects
fun main(){
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}
