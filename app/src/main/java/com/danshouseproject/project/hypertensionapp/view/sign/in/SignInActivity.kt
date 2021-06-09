package com.danshouseproject.project.hypertensionapp.view.sign.`in`

import android.content.Context
import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.danshouseproject.project.hypertensionapp.R
import com.danshouseproject.project.hypertensionapp.databinding.ActivitySignInBinding
import com.danshouseproject.project.hypertensionapp.view.home.HomeActivity
import com.danshouseproject.project.hypertensionapp.view.sign.up.SignUpActivity
import kotlinx.android.synthetic.main.display_sign_in.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SignInActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var context: Context

    companion object {
        private const val USERNAME = "admin"
        private const val PASSWORD = "chopper"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        context = this

        binding.formSignIn.let { form ->
            form.tvForgotPassword.underline()
            form.btnSignIn.setOnClickListener(this)
            form.btnSignUp.setOnClickListener(this)
        }

    }

    private fun TextView.underline() {
        this.paintFlags = paintFlags or Paint.UNDERLINE_TEXT_FLAG
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_sign_in -> {
                val username = binding.formSignIn.inpUsername.text.toString()
                val password = binding.formSignIn.inpPassword.text.toString()

                lifecycleScope.launch(Dispatchers.Default) {
                    if (username.isNotEmpty() && password.isNotEmpty()) {
                        if ((username == USERNAME) && (password == PASSWORD)) {
                            withContext(Dispatchers.Main) {
                                binding.formSignIn.tvStateSign.visibility = View.INVISIBLE
                                binding.progressBar.visibility = View.VISIBLE
                                startActivity(Intent(context, HomeActivity::class.java))
                                finish()
                            }
                        } else {
                            withContext(Dispatchers.Main) {
                                binding.formSignIn.tvStateSign.visibility = View.VISIBLE
                                binding.progressBar.visibility = View.INVISIBLE
                            }
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            binding.formSignIn.tvStateSign.visibility = View.VISIBLE
                            binding.progressBar.visibility = View.INVISIBLE
                        }
                    }
                }
            }
            R.id.btn_sign_up -> startActivity(Intent(context, SignUpActivity::class.java))
        }
    }

}