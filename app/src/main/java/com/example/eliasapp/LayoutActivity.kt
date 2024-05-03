package com.example.eliasapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eliasapp.ui.theme.ELIASAPPTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(
        modifier = Modifier
            .paint(painterResource(id = R.drawable.background6),
                contentScale = ContentScale.FillBounds)
            .fillMaxSize()) {

        val mContext = LocalContext.current

        //top up bar
        TopAppBar(title = { Text(text = "HomeScreen", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arowback",
                        tint = Color.Magenta)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Magenta)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.Magenta)
                }

            }
        )
        //end of top up bar

        Text(
            text = "Destination",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive)

        //First Row
        Row {
            Image(painter = painterResource(id = R.drawable.download3),
                contentDescription = "download",
                modifier = Modifier.size(width = 200.dp,height = 150.dp))

            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "Travelling", fontWeight = FontWeight.Bold)
                Text(text = "Many of us have been there, pricing up the value of doing a holiday self-catered vs going all in with the all-inclusive package - the added bonus with the latter being unlimited booze, of course.")

            }
        }
        //end of row
        Spacer(modifier = Modifier.height(15.dp))
        //Second Row
        Row {
            Image(painter = painterResource(id = R.drawable.download1),
                contentDescription = "download",
                modifier = Modifier.size(width = 200.dp,height = 150.dp))

            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "Travelling", fontWeight = FontWeight.Bold)
                Text(text = "In fact, it's quite the opposite and is also not in place on the mainland.\n" +
                        "\n" +
                        "There's actually 151 islands in total.")

            }
        }
        //end of row
        Spacer(modifier = Modifier.height(15.dp))
        //Third Row
        Row {
            Image(painter = painterResource(id = R.drawable.download2),
                contentDescription = "download",
                modifier = Modifier.size(width = 200.dp,height = 150.dp))

            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(text = "Travelling", fontWeight = FontWeight.Bold)
                Text(text = "In fact, it's quite the opposite and is also not in place on the mainland.\n" +
                        "\n" +
                        "There's actually 151 islands in total.")

            }
        }
        //end of row
        Spacer(modifier = Modifier.height(15.dp))
        //button
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,IntentActivity::class.java))

            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)) {
                Text(text = "View More")

            }

        }
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,AnimationActivity::class.java))

            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)) {
                Text(text = "LottieActivity")

            }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}