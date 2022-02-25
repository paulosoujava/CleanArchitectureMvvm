package com.paulo.cryptocurrencyapp.feature_note.presenter.notes

import com.paulo.cryptocurrencyapp.feature_note.domain.model.Note
import com.paulo.cryptocurrencyapp.feature_note.domain.util.NoteOrder
import com.paulo.cryptocurrencyapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)