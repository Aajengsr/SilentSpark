package app.silentspark.silentspark.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import app.silentspark.silentspark.R
import androidx.compose.ui.res.painterResource as painterResource1


@Composable
fun BackButton(onClick: () -> Unit) {
    Column {
        Row (modifier = Modifier
            .padding(top = 15.dp, start = 15.dp)
        ) {
            Image(
                modifier = Modifier
                    .width(38.dp)
                    .height(39.dp),
                painter = painterResource1(id = R.drawable.buttonhijau),
                contentDescription = "navigation kembali",
            )
        }
    }
    Spacer(modifier = Modifier.height(32.dp))
}

@Preview(showBackground = true)
@Composable
fun BackButtonPreview() {
    MaterialTheme {
        BackButton(onClick = {})
    }
}