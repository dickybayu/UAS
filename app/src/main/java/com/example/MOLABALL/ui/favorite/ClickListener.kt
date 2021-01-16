package com.example.MOLABALL.ui.favorite

import com.example.MOLABALL.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}