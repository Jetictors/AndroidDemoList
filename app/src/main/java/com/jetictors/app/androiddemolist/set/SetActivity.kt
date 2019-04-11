package com.jetictors.app.androiddemolist.set

import android.content.Intent
import android.os.Bundle
import com.jetictors.app.androiddemolist.R
import com.jetictors.app.androiddemolist.base.BaseActivity
import kotlinx.android.synthetic.main.act_set.*

/**
 * Desc           :  设置页
 * Author         :  Jetictors
 * Time           :  2019/4/11 15:41
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class SetActivity : BaseActivity(){

    override fun getLayoutRes(): Int {
        return R.layout.act_set
    }

    override fun initViewAndData(savedInstanceState: Bundle?) {
    }

    override fun initListener() {

        this.btn_multi_language.setOnClickListener {
            startActivity(Intent(this, MultiLanguageActivity::class.java))
        }

    }

}
