package com.example.robotminisumo.appUI.app.view.componentes


import android.os.CountDownTimer
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoaderView(
    modifier: Modifier = Modifier
) {
    val sizes = listOf(6.dp, 12.dp, 20.dp, 12.dp, 8.5.dp)
    var selectedIndex by remember { mutableStateOf(0) }

    LaunchedEffect(Unit) {
        object : CountDownTimer(1000, 200) {
            override fun onTick(millisUntilFinished: Long) {
                selectedIndex = (selectedIndex + 1) % 5
            }
            override fun onFinish() {
                start()
            }
        }.start()
    }

    Row(
        modifier = modifier.wrapContentHeight(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        sizes.forEachIndexed { index, size ->
            val animatedSize by animateDpAsState(
                targetValue = when {
                    index == selectedIndex && index == 2 -> size * 1.2f
                    index == selectedIndex -> size * 1.5f
                    else -> size
                }
            )
            Box(
                modifier = Modifier
                    .size(animatedSize)
                    .clip(CircleShape)
                    .background(Color(0xFF4285F4))
            )
        }
    }
}

@Preview(showBackground = true, name = "X990", device = "spec:width=360dp,height=640dp,dpi=320")
@Composable
fun LoaderViewPreview() {
    LoaderView()
}
