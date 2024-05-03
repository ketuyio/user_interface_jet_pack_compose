package com.example.eliasapp

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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
import androidx.core.net.toUri
import com.example.eliasapp.ui.theme.ELIASAPPTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIntents()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntents(){
    val mContext= LocalContext.current
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.background3),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize()) {
        //top up bar
        TopAppBar(title = { Text(text = "Intents", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {

                }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Magenta)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Place,
                        contentDescription = "Place",
                        tint = Color.Magenta)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Favorite,
                        contentDescription = "favourite",
                        tint = Color.Magenta)
                }

            }
        )
        //end of top up bar

        OutlinedButton(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

            },
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp,Color.Cyan)
        ) {
            Text(text = "Mpesa",color = Color.Black,fontWeight = FontWeight.Bold )

        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {
                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }
            },
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp,Color.Cyan)
        ) {
            Text(text = "CAMERA",color = Color.Black,fontWeight = FontWeight.Bold )

        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {
                val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0720245837".toUri()
                smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                mContext.startActivity(smsIntent)
            },
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp,Color.Cyan)
        ) {
            Text(text = "SMS",color = Color.Black,fontWeight = FontWeight.Bold )

        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0720245837".toUri()
                mContext.startActivity(callIntent)
            },
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp,Color.Cyan)
        ) {
            Text(text = "CALL",color = Color.Black,fontWeight = FontWeight.Bold )

        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)
            },
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp,Color.Cyan)
        ) {
            Text(text = "EMAIL",color = Color.Black,fontWeight = FontWeight.Bold )

        }
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
            },
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp,Color.Cyan)
        ) {
            Text(text = "SHARE",color = Color.Black,fontWeight = FontWeight.Bold )

        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Do not have an account? Register",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .clickable {
                    mContext.startActivity(Intent(mContext,FormActivity::class.java))
                }
                .fillMaxWidth(),
            textAlign = TextAlign.Center)

    }

}

@Preview(showBackground = true)
@Composable
fun MyIntentsPreview(){
    MyIntents()

}
