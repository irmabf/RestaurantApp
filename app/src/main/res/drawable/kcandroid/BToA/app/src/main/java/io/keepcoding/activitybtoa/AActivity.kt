package io.keepcoding.activitybtoa

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {

    val REQUEST_B = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        button.setOnClickListener {
            startActivityForResult(BActivity.intent(this), REQUEST_B)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            REQUEST_B -> {
                if (resultCode == Activity.RESULT_OK && data != null) {
                    val number = data.getIntExtra(BActivity.EXTRA_NUMBER, 0)
                    val string = data.getStringExtra(BActivity.EXTRA_STRING)
                    result.text = "He recibido esto de B: ${string}, ${number}"
                }
                else {
                    result.text = "No me han devuelto nada :'("
                }
            }
        }
    }
}
