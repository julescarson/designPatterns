package designPatterns.adapter

interface AdvancedMediaPlayer {
    fun playVLC(fileName: String)
    fun playMP4(fileName: String)
}