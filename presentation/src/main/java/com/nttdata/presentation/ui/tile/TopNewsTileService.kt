package com.nttdata.presentation.ui.tile

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.*
import androidx.glance.action.actionStartActivity
import androidx.glance.action.clickable
import androidx.glance.layout.*
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextAlign
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import androidx.glance.wear.tiles.GlanceTileService
import androidx.glance.wear.tiles.curved.*
import com.nttdata.presentation.R
import com.nttdata.presentation.MainActivity

class TopNewsTileService : GlanceTileService() {

    @Composable
    @GlanceComposable
    override fun Content() {
        TileContent()
    }


}

@Composable
@GlanceComposable
fun TileContent() {
    CurvedRow(
        anchorType = AnchorType.Center
    ) {
        curvedText(
            text = "NYT",
            style = CurvedTextStyle(
                color = ColorProvider(Color.Green)
            )
        )
        curvedSpacer(
            curvedModifier = GlanceCurvedModifier.sweepAngleDegrees(2f)
        )
        curvedLine(
            color = ColorProvider(Color.Cyan),
            curvedModifier =
            GlanceCurvedModifier.sweepAngleDegrees(5f).thickness(2.dp)
        )
        curvedComposable {
            Text(
                text = "Tile",
                style = TextStyle(color = ColorProvider(Color.Yellow))
            )
        }

        curvedComposable(false) {
            Image(
                provider = ImageProvider(R.mipmap.ic_laucher),
                modifier = GlanceModifier
                    .size(30.dp, 30.dp)
                    .clickable(actionStartActivity(MainActivity::class.java)),
                contentScale = ContentScale.FillBounds,
                contentDescription = "Hello tile icon"
            )
        }

        curvedSpacer(
            curvedModifier = GlanceCurvedModifier.sweepAngleDegrees(5f)
        )
    }

    Column{

        NotificationItem(text = "How to Download Your Twitter Archive")

        Spacer(modifier = GlanceModifier.height(6.dp))

        NotificationItem(text = "A Beloved Show Gets Another Life")

        Spacer(modifier = GlanceModifier.height(16.dp))

        Button(
            text = "Open application",
            modifier = GlanceModifier
                .padding(10.dp),
            onClick = actionStartActivity(MainActivity::class.java)
        )


    }


}

@GlanceComposable
@Composable
fun NotificationItem(text: String) {
    Row(modifier = GlanceModifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(provider = ImageProvider(R.drawable.ic_breaking_news),
            modifier = GlanceModifier.size(24.dp, 24.dp),
            contentScale = ContentScale.FillBounds,
            contentDescription = "Hello tile icon")

        Spacer(modifier = GlanceModifier.width(4.dp))

        Text(
            text = text,
            style = TextStyle(
                color = ColorProvider(Color.White),
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            )
        )


    }
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
@GlanceComposable
fun TilePreview() {
    TileContent()
}