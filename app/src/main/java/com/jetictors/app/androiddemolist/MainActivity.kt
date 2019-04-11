package com.jetictors.app.androiddemolist

import android.content.Intent
import android.os.Bundle
import com.jetictors.app.androiddemolist.base.BaseActivity
import com.jetictors.app.androiddemolist.set.SetActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }

    override fun initViewAndData(savedInstanceState: Bundle?) {

    }

    override fun initListener() {
        this.btn_set.setOnClickListener {
            startActivity(Intent(this, SetActivity::class.java))
        }
    }

}
