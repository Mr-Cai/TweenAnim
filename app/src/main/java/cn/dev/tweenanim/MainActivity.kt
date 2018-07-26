package cn.dev.tweenanim

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = Color.TRANSPARENT
        btnTranslate.setOnClickListener(this)
        btnRotate.setOnClickListener(this)
        btnScale.setOnClickListener(this)
        btnAlpha.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnTranslate -> {
                val animOffset = AnimationUtils.loadAnimation(this, R.anim.translate)//加载平移动画
                gifView.startAnimation(animOffset)//启动平移动画
            }
            R.id.btnRotate -> {
                val animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)//加载旋转动画
                gifView.startAnimation(animRotate)//启动旋转动画
            }
            R.id.btnScale -> {
                val animScale = AnimationUtils.loadAnimation(this, R.anim.scale)//加载缩放动画
                gifView.startAnimation(animScale)//启动缩放动画
            }
            R.id.btnAlpha -> {
                val animTransition = AnimationUtils.loadAnimation(this, R.anim.alpha)//加载渐变动画
                gifView.startAnimation(animTransition)//启动渐变动画
            }
        }
    }

}
