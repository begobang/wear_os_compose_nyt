package com.nttdata.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import com.nttdata.presentation.R
import com.nttdata.presentation.ui.views.ChipView


@ExperimentalCoilApi
@Composable
fun Splash(onEnd: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(R.drawable.ic_ny),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )

        ChipView(
            modifier = Modifier.padding(bottom = 8.dp),
            iconModifier = Modifier.size(18.dp).wrapContentSize(align = Alignment.Center),
            label = stringResource(R.string.log_in),
            imageVector = Icons.Default.Newspaper,
            onClick = {
                onEnd()
            }
        )






    }


}