package com.jetictors.app.androiddemolist.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Desc           :  基类Activity
 * Author         :  Jetictors
 * Time           :  2019/4/11 15:41
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
abstract class BaseActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (getLayoutRes() > 0){
            setContentView(getLayoutRes())
            initViewAndData(savedInstanceState)
            initListener()
        }
    }

    /**
     * 获取布局文件
     */
    abstract fun getLayoutRes() : Int

    /**
     * 初始化view/data等
     */
    abstract fun initViewAndData(savedInstanceState: Bundle?)

    /**
     * 事件处理
     */
    abstract fun initListener()

    /**
     * 设置语言
     */
    private fun changeAppLanguage(){

    }

}
