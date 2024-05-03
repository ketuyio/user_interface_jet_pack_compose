package com.example.eliasapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDestination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyDestination(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //top up bar
        TopAppBar(title = { Text(text = "HomeScreen", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,FormActivity::class.java))
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

        //start of box

        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.background7),
                contentDescription = "picture",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)

            Text(text = "Lets plan your next Vacation",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
                textAlign = TextAlign.Center)
        }
        //end of box

        Spacer(modifier = Modifier.height(10.dp))

        //search bar

        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = {search = it} ,
            placeholder = { Text(text = "What's your destination")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "searchbar")},
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth())

        //end of searchbar
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Recently viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //card one

            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(150.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.background3),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                }
                }
                Text(
                    text = "Boston",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card two

            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(150.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.background),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                }
                Text(
                    text = "Romania",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card three

            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(150.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.background2),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                }
                Text(
                    text = "Thailand",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card four

            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(150.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.background4),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                }
                Text(
                    text = "Mongolia",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Modern page",
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier
                    .clickable {
                        mContext.startActivity(Intent(mContext,ModernActivity::class.java))
                    }
                    .fillMaxWidth(),
                textAlign = TextAlign.Center)
        }
        Text(text = "Go to Dog Centre",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .clickable {
                    mContext.startActivity(Intent(mContext,TristanActivity::class.java))
                }
                .fillMaxWidth(),
            textAlign = TextAlign.Center)
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,ModernActivity::class.java))

            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)) {
                Text(text = "Tourist Destinations")

            }

        }



    }

}

@Preview(showBackground = true)
@Composable
fun MyDestinationPreview(){
    MyDestination()
}