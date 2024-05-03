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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eliasapp.ui.theme.ELIASAPPTheme

class TristanActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTristan()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTristan(){
    Column(
        modifier = Modifier
            .fillMaxSize()) {

        val mContext = LocalContext.current

        //top up bar
        TopAppBar(title = { Text(text = "Dog Centre", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notification",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Color.Black
                    )
                }

            }
        )
        //end of top up bar
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center) {
                Row {
                    Image(painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier.size(90.dp))

                    Spacer(modifier = Modifier.width(15.dp))

                    Column {
                        Text(text = "Woof", fontWeight = FontWeight.Bold, fontSize = 30.sp)
                    }
                }

            }
            //card 1

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Koda", fontWeight = FontWeight.ExtraBold)
                        Text(text = "2 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))
            //card 2

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Loda", fontWeight = FontWeight.ExtraBold)
                        Text(text = "12 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))
            //card 3

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Frankie", fontWeight = FontWeight.ExtraBold)
                        Text(text = "2 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))
            //card 4

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Nox", fontWeight = FontWeight.ExtraBold)
                        Text(text = "8 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))
            //card 5

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Faye", fontWeight = FontWeight.ExtraBold)
                        Text(text = "8 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))

            //card 6

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Bella", fontWeight = FontWeight.ExtraBold)
                        Text(text = "14 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))
            //card 7

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Moana", fontWeight = FontWeight.ExtraBold)
                        Text(text = "2 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))
            //card 8

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Tzeitel", fontWeight = FontWeight.ExtraBold)
                        Text(text = "7 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))
            //card 9

            Card(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.download3),
                        contentDescription = "download",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Michael", fontWeight = FontWeight.ExtraBold)
                        Text(text = "6 years old")

                    }
                }

            }
            //end of Card
            Spacer(modifier = Modifier.height(10.dp))

        }

    }
}

@Preview(showBackground = true)
@Composable
fun TristanPreview(){
    MyTristan()
}