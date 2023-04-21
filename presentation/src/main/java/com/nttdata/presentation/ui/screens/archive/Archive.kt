package com.nttdata.presentation.ui.screens.archive


import androidx.compose.runtime.Composable
import androidx.wear.compose.material.*
import com.google.android.horologist.composables.DatePicker
import com.nttdata.domain.archive.ArchiveInput
import java.time.LocalDate


@Composable
fun Archive(onDateSelected: (ArchiveInput) -> Unit){
    Scaffold(
        vignette = { Vignette(vignettePosition = VignettePosition.TopAndBottom) },
    ) {
        DatePicker(
            onDateConfirm = {
                onDateSelected(ArchiveInput("${it.year}", "${it.monthValue}"))
            },
            date = LocalDate.of(2022, 1, 1)
        )

    }

}