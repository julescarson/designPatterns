package designPatterns.proxy

fun proxyMain() {
    println("Proxy main:")
    var image : Image = ProxyImage("imageFileName.png")
    image.display()

    image.display()
    println("-")


}