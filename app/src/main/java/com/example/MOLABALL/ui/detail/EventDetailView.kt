package com.example.MOLABALL.ui.detail


import com.example.MOLABALL.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}