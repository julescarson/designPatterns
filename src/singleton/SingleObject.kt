package designPatterns.singleton

// in Kotlin we can use object to create a single instance
object SingleObject{
    fun display() {
        println("I am a function inside the object SingleObject, using object keyword for instantiation.")
    }
}


//java uses class and private values for ctor and the instance, with a getter
// in kotlin, using class we can use a companion object inside the class
//class SingleObject2 private constructor() {
//    companion object {
//        private val instance = SingleObject2()
//        fun getInstance() {
//            return instance
//        }
//    }
//    fun display() {
//        println("I am a function inside the class SingleObject2, created using a companion object within the class.")
//    }
//}