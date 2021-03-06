package com.chen.jetpackmvvm.base

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.IntRange
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.getBinding
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

/**
 * @author Created by CHEN on 2020/5/10
 * @email 188669@163.com
 */
abstract class BaseBindingAdapter<M>(context : Context) : BaseBindingDBAdapter<M, ViewDataBinding>(context)