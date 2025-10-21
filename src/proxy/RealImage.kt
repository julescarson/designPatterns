package designPatterns.proxy

class RealImage(fileName : String) : Image {

    var fileName : String = fileName

    //when we instantiate a RealImage, we run this init code
    init {
        loadFromDisk(fileName)
    }

    fun loadFromDisk(fileName: String) {
        println("Loading '$fileName' from disk")
    }

    override fun display() {
        println("Displaying image + $fileName")
    }
}