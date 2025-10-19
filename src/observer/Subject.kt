package designPatterns.observer

class Subject {
    private val observers = mutableListOf<Observer>()
    //lateint can require later initialization (required before first access / at init)
    //or just init 0
    var state : Int = 0
        //directly for value above, works for get also
        set(value) {
            field = value
            notifyAllObservers()
        }

    fun attach(observer : Observer) {
        observers.add(observer)
    }

    private fun notifyAllObservers() {
        for (obs in observers) {
            obs.update();
        }
    }
}