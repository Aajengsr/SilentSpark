package app.silentspark.silentspark.ui.theme.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun KelasSiswa(){

    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding()
    )   {
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewKelasSiswa() {
    KelasSiswa()
}