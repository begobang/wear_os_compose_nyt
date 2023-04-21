package com.nttdata.presentation.ui.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipColors
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text

@Composable
fun ChipView(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    label: String,
    secondaryLabel: String = "",
    imageVector: ImageVector,
    onClick: () -> Unit,
) {
    Chip(
        modifier = modifier,
        onClick = { onClick() },
        label = { Text(text = label, maxLines = 1, overflow = TextOverflow.Ellipsis) },
        secondaryLabel = {
            if (secondaryLabel.isNotEmpty()) Text(text = secondaryLabel,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis)
        },
        icon = {
            Icon(
                imageVector = imageVector,
                contentDescription = "triggers $label",
                modifier = iconModifier
            )
        },
    )
}