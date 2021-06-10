package com.danshouseproject.project.hypertensionapp.view.sign.up

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
                        it.signUpInpUname.text.isEmpty() -> {}
                        it.signUpInpEmail.text.isEmpty() -> {}
                        it.signUpInpPwd.text.isEmpty() -> {}
                        it.reSignUpInpPwd.text.isEmpty() -> {}
                    }
                }
                R.id.btn_sign_in ->
                    startActivity(Intent(this, SignInActivity::class.java))
            }
        }
    }
}