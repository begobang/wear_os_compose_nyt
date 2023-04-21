package com.nttdata.presentation.entities

import com.nttdata.domain.model.SectionBusiness


data class SectionViewEntity(
    val id: String,
    var displayName: String
)

fun SectionBusiness.toPresentation(): SectionViewEntity = SectionViewEntity(id, displayName)
