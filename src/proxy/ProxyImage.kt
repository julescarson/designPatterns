package designPatterns.proxy



class ProxyImage (fileName : String) : Image {
    var realImage : RealImage ?= null
    var fileName: String ?= fileName


    override fun display() {
        if (realImage == null) {
            //guarantee not null !!
            realImage = RealImage(fileName!!)
        }
        realImage!!.display()
    }
}