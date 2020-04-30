package com.chen.jetpackmvvm.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.Factory
import com.chen.jetpackmvvm.ext.getClazz

/**
 * @author Created by CHEN on 2020/4/30
 * @email 188669@163.com
 */
abstract class BaseVmDbActivity <VM : ViewModel, DB : ViewDataBinding> : AppCompatActivity() {

    lateinit var mViewModel: VM

    lateinit var mDatabind: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDatabind = initViewDataBinding()
        mViewModel = initViewModel()
        initView()
        initListener()
        initData()
    }

    private fun initViewDataBinding() : DB{
        return DataBindingUtil.setContentView(this, getLayoutId())
    }

    private fun initViewModel() : VM{
        return ViewModelProvider(this).get(getClazz(this) as Class<VM>)
    }
    protected abstract fun getLayoutId() : Int

    protected abstract fun initView()

    protected abstract fun initListener()

    protected abstract fun initData()
}