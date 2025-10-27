package designPatterns.adapter

interface MediaPlayer {
    fun play(audioType : String, fileName : String)
}