package designPatterns.observer

//class is open, so that it may be extended
open class Observer {

    var subject : Subject? = null //we try null instead of late init here
    open fun update(){}; //definition only, open required for override later
}