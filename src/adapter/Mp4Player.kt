package designPatterns.adapter

class Mp4Player : AdvancedMediaPlayer {
    override fun playVLC(fileName: String) {
        TODO("Not yet implemented")
    }

    override fun playMP4(fileName: String) {
        println("Playing mp4 file. Name: $fileName")
    }
}