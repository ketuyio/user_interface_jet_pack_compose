package com.example.eliasapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
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
import androidx.core.net.toUri
import com.example.eliasapp.ui.theme.ELIASAPPTheme

class ModernActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Modern()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Modern(){
    Column(
        modifier = Modifier
            .fillMaxSize()) {

        val mContext = LocalContext.current

        //top up bar
        TopAppBar(title = { Text(text = "Cities", color = Color.Black) },
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
            Text(text = "Tickets",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp))



            Spacer(modifier = Modifier.height(10.dp))

            //row 1
            Row {
                //column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.background4),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(15.dp)
                                    .align(Alignment.TopEnd)
                            )


                        }


                    }
                    Text(
                        text = "Colossium, ",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Text(
                        text = "Roman Form",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Text(
                        text = "and Pallentine Hill...",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "443 Reviews",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "From KSH:7000.000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        OutlinedButton(
                            onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("akinyiglory2@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Hello, this is the email body"
                                )
                                mContext.startActivity(shareIntent)
                            },
                        ) {
                            Text(text = "EMAIL")

                        }

                        OutlinedButton(
                            onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                        ) {
                            Text(text = "CALL")


                        }
                    }
                }
                //end of Column1
                Spacer(modifier = Modifier.width(10.dp))

                //column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.background5),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(15.dp)
                                    .align(Alignment.TopEnd)
                            )


                        }


                    }
                    Text(
                        text = "Self Guided Tour",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Text(
                        text = "Colosuem Skip",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Text(
                        text = "the Line Ticket",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "1,952 Reviews",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "From KSH:18000.000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        OutlinedButton(
                            onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("akinyiglory2@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Hello, this is the email body"
                                )
                                mContext.startActivity(shareIntent)
                            },
                        ) {
                            Text(text = "EMAIL")

                        }

                        OutlinedButton(
                            onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                        ) {
                            Text(text = "CALL")


                        }
                    }
                }
                //end of Column1
            }
            //end row
            //row 1
            Row {
                //column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.background6),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(15.dp)
                                    .align(Alignment.TopEnd)
                            )


                        }


                    }
                    Text(
                        text = "The VIP",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Text(
                        text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Text(
                        text = "Unerground &...",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "547 Reviews",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "From KSH:156000.000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        OutlinedButton(
                            onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("akinyiglory2@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Hello, this is the email body"
                                )
                                mContext.startActivity(shareIntent)
                            },
                        ) {
                            Text(text = "EMAIL")

                        }

                        OutlinedButton(
                            onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                        ) {
                            Text(text = "CALL")


                        }
                    }
                }
                //end of Column1
                Spacer(modifier = Modifier.width(10.dp))

                //column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.background7),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(15.dp)
                                    .align(Alignment.TopEnd)
                            )


                        }


                    }
                    Text(
                        text = "Exclusive",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Text(
                        text = "Gladiator Arena-",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Text(
                        text = "The Colossium,...",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "548 Reviews",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "From KSH:278000.000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        OutlinedButton(
                            onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("akinyiglory2@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Hello, this is the email body"
                                )
                                mContext.startActivity(shareIntent)
                            },
                        ) {
                            Text(text = "EMAIL")

                        }

                        OutlinedButton(
                            onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                        ) {
                            Text(text = "CALL")


                        }
                    }
                }
                //end of Column1
            }
            //end row
            Spacer(modifier = Modifier.height(20.dp))
            //row 1
            Row {
                //column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.download),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(15.dp)
                                    .align(Alignment.TopEnd)
                            )


                        }


                    }
                    Text(
                        text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "443 Reviews",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "From KSH:7000.000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        OutlinedButton(
                            onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("akinyiglory2@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Hello, this is the email body"
                                )
                                mContext.startActivity(shareIntent)
                            },
                        ) {
                            Text(text = "EMAIL")

                        }

                        OutlinedButton(
                            onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                        ) {
                            Text(text = "CALL")


                        }
                    }
                }
                //end of Column1
                Spacer(modifier = Modifier.width(10.dp))

                //column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.download1),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(15.dp)
                                    .align(Alignment.TopEnd)
                            )


                        }


                    }
                    Text(
                        text = "Colossium",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Rates",tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "443 Reviews",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "From KSH:7000.000",
                        fontFamily = FontFamily.Serif,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        OutlinedButton(
                            onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("akinyiglory2@gmail.com")
                                )
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                                shareIntent.putExtra(
                                    Intent.EXTRA_TEXT,
                                    "Hello, this is the email body"
                                )
                                mContext.startActivity(shareIntent)
                            },
                        ) {
                            Text(text = "EMAIL")

                        }

                        OutlinedButton(
                            onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                        ) {
                            Text(text = "CALL")


                        }
                    }
                }
                //end of Column1
            }
            //end row





        }
    }

}

@Preview(showBackground = true)
@Composable
fun ModernPreview() {
    Modern()
}