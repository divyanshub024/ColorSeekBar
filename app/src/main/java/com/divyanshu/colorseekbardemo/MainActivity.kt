package com.divyanshu.colorseekbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.divyanshu.colorseekbar.ColorSeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        color_seek_bar.setOnColorChangeListener(object: ColorSeekBar.OnColorChangeListener{
            override fun onColorChangeListener(color: Int) {
                view.setBackgroundColor(color)
            }

        })
    }
}
