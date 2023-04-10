package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppLayout()
                }
            }
        }
    }
}

@Composable
fun StyledImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun StyledTitle(text: String) {
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)
    )
}

@Composable
fun StyledText(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        modifier = Modifier
            .padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun AppLayout() {
    Column {
        StyledImage()
        StyledTitle(text = stringResource(R.string.app_title))
        StyledText(text = stringResource(R.string.text1))
        StyledText(text = stringResource(R.string.text2))
    }
}

@Preview(showBackground = true)
@Composable
fun AppLayoutPreview() {
    LearnTogetherTheme {
        AppLayout()
    }
}