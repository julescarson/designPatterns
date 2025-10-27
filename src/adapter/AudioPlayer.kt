package designPatterns.adapter

class AudioPlayer : MediaPlayer {
    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "mp3" -> println("Playing mp3 file. Name: $fileName")
            "vlc" -> {
                val mediaAdapter = MediaAdapter(audioType)
                mediaAdapter.play(audioType, fileName)
            }
            "mp4" -> {
                val mediaAdapter = MediaAdapter(audioType)
                mediaAdapter.play(audioType, fileName)
            }
            else -> println("Invalid media. $audioType format not supported")
        }
    }
}