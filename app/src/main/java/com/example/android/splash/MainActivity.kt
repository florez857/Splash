package com.example.android.splash

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    private var isRunning: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_NO_TITLE)
        //making this activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_main)

        initDataBindings()

      //  initActions()

    }


    private fun initDataBindings() {
      //  Utils.setImageToImageView(this, s2bgImageView, R.drawable.star_bg)
    }

//    private fun initActions() {
//      //  exploreButton.setOnClickListener {
//
//            this.finish() }
//    }

    override fun onBackPressed() {

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        //Here you can get the size!

        if (!isRunning) {
            isRunning = true

            iconImageView.animate().scaleX(4f).scaleY(4f).alpha(0f).setDuration(0).setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animator: Animator) {

                }

                override fun onAnimationEnd(animator: Animator) {

                    iconImageView.animate().scaleX(1f).scaleY(1f).alpha(1f).setDuration(1500).setListener(object : Animator.AnimatorListener {
                        override fun onAnimationStart(animator: Animator) {

                        }

                        override fun onAnimationEnd(animator: Animator) {
                         nameTextView.animate().scaleX(3f).scaleY(3f).alpha(0f).setDuration(0).setListener(object : Animator.AnimatorListener {
                                override fun onAnimationStart(animator: Animator) {

                                }

                                override fun onAnimationEnd(animator: Animator) {

                                    nameTextView.animate().scaleX(1f).scaleY(1f).alpha(1f).setDuration(800).setListener(object : Animator.AnimatorListener {
                                        override fun onAnimationRepeat(p0: Animator?) {

                                        }

                                        override fun onAnimationCancel(p0: Animator?) {

                                        }

                                        override fun onAnimationStart(p0: Animator?) {

                                        }

                                        override fun onAnimationEnd(p0: Animator?) {
                                            val intent:Intent= Intent(this@MainActivity,Main2Activity::class.java)
                                            this@MainActivity.finish()
                                            startActivity(intent)
                                        }


                                    }).start()


                                   // exploreButton.animate().alpha(1f).setDuration(400).start()
                                }

                                override fun onAnimationCancel(animator: Animator) {

                                }

                                override fun onAnimationRepeat(animator: Animator) {

                                }
                            }).start()

                        }

                        override fun onAnimationCancel(animator: Animator) {

                        }

                        override fun onAnimationRepeat(animator: Animator) {

                        }
                    }).start()

                }

                override fun onAnimationCancel(animator: Animator) {

                }

                override fun onAnimationRepeat(animator: Animator) {

                }
            }).start()

        }
    }




}
