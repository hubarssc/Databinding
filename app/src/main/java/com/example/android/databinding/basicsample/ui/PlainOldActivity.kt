package com.example.android.databinding.basicsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.data.SimpleViewModel
import com.example.android.databinding.basicsample.databinding.PlainActivityBinding

/**
 * Plain old activity with lots of problems to fix.
 */
class PlainOldActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity)
        binding.lifecycleOwner = this

        binding.viewmodel = viewModel

    }
}

