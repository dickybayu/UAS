package com.example.MOLABALL.ui.event

import com.example.MOLABALL.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}