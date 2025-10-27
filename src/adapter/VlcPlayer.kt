package designPatterns.adapter

class VlcPlayer : AdvancedMediaPlayer {
    override fun playVLC(fileName: String) {
        println("Playing vlc file. Name: $fileName")
    }

    override fun playMP4(fileName: String) {
        TODO("Not yet implemented")
    }
}