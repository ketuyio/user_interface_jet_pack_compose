package com.example.eliasapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.eliasapp.ui.theme.ELIASAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.background1),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize()) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        )  {

            val mContext = LocalContext.current

            Text(text = "Welcome to Android",
                fontSize = 30.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                textDecoration = TextDecoration.Underline)
            Text(text = "Android is an app platform with refined user interface that eases compatablity with functions that makes day to day life easy to humanity.")
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center) {
                //Lottie Animation
                val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.letters))
                val progress by animateLottieCompositionAsState(composition)
                LottieAnimation(
                    composition, progress,
                    modifier = Modifier.size(300.dp)

                )
                //end of lottie animation

            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Type of Cars",
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier
                    .background(Color.Blue)
                    .height(30.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center)
            Text(text = "1.Subaru")
            Text(text = "2.Mercedes Benz")
            Text(text = "3.Ford Mustang")
            Text(text = "4.Audi")

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "Types of Web Browsers",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .background(Color.Black)
                    .height(30.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center)
            Text(text = "1.Chrome")
            Text(text = "2.OperaOne")
            Text(text = "3.Mozilla Firefox")
            Text(text = "3.Internet Explorer")
            Text(text = "4.Microsoft Edge")
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center) {
                Button(onClick = {
                    mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
                },
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    modifier = Modifier
                        .padding(start = 30.dp, end = 30.dp)) {
                    Text(text = "Destination")

                }

            }
            Spacer(modifier = Modifier.height(10.dp))

            Divider()
            Spacer(modifier = Modifier.height(5.dp))

            Text(text = "eMobilis mobile training institute",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,)

            Spacer(modifier = Modifier.height(5.dp))

            //centering an image,making it circular

            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center) {
                Image(painter = painterResource(id = R.drawable.download),
                    contentDescription = "Nairobi exchange",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(200.dp),
                    contentScale = ContentScale.Crop)
            }
            //end centering image
            Button(onClick = {
                mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)

                    .fillMaxWidth()

            ) {
                Text(text = "Continue")

            }
        }



    }

}


@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}
