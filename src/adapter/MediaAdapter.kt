package designPatterns.adapter

import java.util.Locale
import java.util.Locale.getDefault

class MediaAdapter(audioType : String) : MediaPlayer {
    val advancedMediaPlayer = when(audioType.lowercase(getDefault())) {
        "vlc" -> VlcPlayer()
        "mp4" -> Mp4Player()
        else -> throw Exception("Invalid media. Only vlc and mp4 formats are supported")
    }

    override fun play(audioType: String, fileName: String) {
        when(audioType.lowercase(getDefault())) {
            "vlc" -> advancedMediaPlayer.playVLC(fileName)
            "mp4" -> advancedMediaPlayer.playMP4(fileName)
            else -> throw Exception("Invalid media. Only vlc and mp4 formats are supported")
        }
    }
}