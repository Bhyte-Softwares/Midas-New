package com.bhyte.midas.presentation.common

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit
) {
    Surface(color = MaterialTheme.colorScheme.background) {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFC815),
                contentColor = Color.Black
            ),
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(size = 1000.dp)
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.labelMedium.copy(
                    fontFamily = archivoFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun PrimaryButtonPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            PrimaryButton(text = "Get Started") {

            }
        }
    }
}