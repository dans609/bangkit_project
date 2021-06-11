package com.danshouseproject.project.hypertensionapp.view.sign.up

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.danshouseproject.project.hypertensionapp.R
import com.danshouseproject.project.hypertensionapp.databinding.ActivitySignUpBinding
import com.danshouseproject.project.hypertensionapp.view.sign.`in`.SignInActivity
import kotlinx.android.synthetic.main.display_sign_up.view.*

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.elevation = 0f

        binding.formSignUp.let {
            it.btnSignUp.setOnClickListener(this)
            it.btnSignIn.setOnClickListener(this)
        }

    }

    override fun onClick(v: View?) {
        binding.formSignUp.let {
            when (v?.id) {
                R.id.btn_sign_up -> {
                    when {
                        it.signUpInpUname.text.checkInp() -> it.signUpInpUname.displayNoInpError()
                        it.signUpInpEmail.text.checkInp() -> it.signUpInpEmail.displayNoInpError()
                        it.signUpInpPwd.text.checkInp() -> it.signUpInpPwd.displayNoInpError()
                        it.reSignUpInpPwd.text.checkInp() -> it.reSignUpInpPwd.displayNoInpError()
                        else -> Toast.makeText(this, "SUCCESS", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.btn_sign_in ->
                    startActivity(Intent(this, SignInActivity::class.java))
            }
        }
    }

    private fun Editable.checkInp(): Boolean =
        this.toString().trim().isEmpty()

    private fun EditText.displayNoInpError() {
        this.error = "Please fill this input"
    }

}