package com.jetictors.app.androiddemolist.adapter

import android.support.annotation.LayoutRes
import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.jetictors.app.androiddemolist.R
import com.jetictors.app.androiddemolist.bean.MultiLanguage

/**
 * Desc           :  多语言切换页列表适配器
 * Author         :  Jetictors
 * Time           :  2019/4/11 17:08
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class MultiLanguageAdapter(@LayoutRes private val layoutRes: Int, private val itemData : MutableList<MultiLanguage>)
    : BaseQuickAdapter<MultiLanguage, BaseViewHolder>(layoutRes, itemData){

    override fun convert(helper: BaseViewHolder?, item: MultiLanguage?) {
        helper?.let {
            it.setText(R.id.tv_language, item?.title ?: "")
            val ivSelect = it.getView<ImageView>(R.id.iv_select)
        }
    }

}