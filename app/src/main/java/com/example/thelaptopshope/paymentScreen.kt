package com.example.thelaptopshope

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.thelaptopshope.Dta.FakeDTABASE
import com.example.thelaptopshope.Dta.Paymentdb


@Composable
fun paymentScreen(navController: NavController)
{
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Payment Methods") },
                backgroundColor = colorResource(id = R.color.background),
                contentColor = colorResource(id = R.color.white),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp, 24.dp)
                            .clickable {
                                navController.navigateUp()
                            },
                        tint = colorResource(id = R.color.white)
                    )
                }
            )
        },

        content = {

            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)){
                 item {
                     Card(modifier = Modifier
                         .fillMaxWidth()
                         .padding(it)
                         .clickable { }, backgroundColor = Color.White )
                     {
                         Row (modifier = Modifier.fillMaxWidth())
                         {
                             Image(painter = painterResource(id = R.drawable.bankc), modifier = Modifier.size(70.dp,70.dp), contentDescription =null )
                             Spacer(modifier = Modifier.width(16.dp))
                             Text(text ="Bank-1234" ,
                                 modifier = Modifier.padding(40.dp,20.dp,12.dp,0.dp),
                                 fontWeight = FontWeight.ExtraBold,
                                 style = MaterialTheme.typography.h5

                             )

                         }
                     }
                     Spacer(modifier = Modifier.padding(20.dp))
                     Text(text = "Add More Payment Methods", modifier = Modifier.padding(30.dp,0.dp,0.dp,0.dp), fontWeight = FontWeight.W500)
                     Spacer(modifier = Modifier.padding(20.dp))
                     Card(modifier = Modifier
                         .fillMaxWidth()
                         .padding(it)
                         .clickable { }, backgroundColor = Color.White )
                     {
                         Row (modifier = Modifier.fillMaxWidth())
                         {
                             Image(painter = painterResource(id = R.drawable.gpay1), modifier = Modifier.size(70.dp,70.dp), contentDescription =null )
                             Spacer(modifier = Modifier.width(16.dp))
                             Text(text ="Google Pay" ,
                                 modifier = Modifier.padding(40.dp,20.dp,12.dp,0.dp),
                                 fontWeight = FontWeight.ExtraBold,
                                 style = MaterialTheme.typography.h5

                             )

                         }
                     }
                     Spacer(modifier = Modifier.height(25.dp))
                     Card(modifier = Modifier
                         .fillMaxWidth()
                         .padding(it)
                         .clickable { }, backgroundColor = Color.White )
                     {
                         Row (modifier = Modifier.fillMaxWidth())
                         {
                             Image(painter = painterResource(id = R.drawable.phnepe1), modifier = Modifier.size(70.dp,70.dp), contentDescription =null )
                             Spacer(modifier = Modifier.width(16.dp))
                             Text(text ="Phone Pe" ,
                                 modifier = Modifier.padding(40.dp,20.dp,12.dp,0.dp),
                                 fontWeight = FontWeight.ExtraBold,
                                 style = MaterialTheme.typography.h5

                             )

                         }
                     }
                     Spacer(modifier = Modifier.height(25.dp))
                     Card(modifier = Modifier
                         .fillMaxWidth()
                         .padding(it)
                         .clickable { }, backgroundColor = Color.White )
                     {
                         Row (modifier = Modifier.fillMaxWidth())
                         {
                             Image(painter = painterResource(id = R.drawable.paypa), modifier = Modifier.size(70.dp,70.dp), contentDescription =null )
                             Spacer(modifier = Modifier.width(16.dp))
                             Text(text ="PayPal" ,
                                 modifier = Modifier.padding(40.dp,20.dp,12.dp,0.dp),
                                 fontWeight = FontWeight.ExtraBold,
                                 style = MaterialTheme.typography.h5

                             )

                         }
                     }
                     Spacer(modifier = Modifier.height(25.dp))
                     Card(modifier = Modifier
                         .fillMaxWidth()
                         .padding(it)
                         .clickable { }, backgroundColor = Color.White )
                     {
                         Row (modifier = Modifier.fillMaxWidth())
                         {
                             Image(painter = painterResource(id = R.drawable.paytm), modifier = Modifier.size(70.dp,70.dp), contentDescription =null )
                             Spacer(modifier = Modifier.width(16.dp))
                             Text(text ="Paytm" ,
                                 modifier = Modifier.padding(40.dp,20.dp,12.dp,0.dp),
                                 fontWeight = FontWeight.ExtraBold,
                                 style = MaterialTheme.typography.h5

                             )

                         }
                     }
                     Spacer(modifier = Modifier.padding(15.dp))
                     Text(text = "More Option", modifier = Modifier.padding(30.dp,0.dp,0.dp,0.dp), fontWeight = FontWeight.W500)
                     Spacer(modifier = Modifier.padding(15.dp))
                     Card(modifier = Modifier
                         .fillMaxWidth()
                         .padding(it)
                         .clickable { }, backgroundColor = Color.White )
                     {
                         Row (modifier = Modifier.fillMaxWidth())
                         {
                             Image(painter = painterResource(id = R.drawable.seti), modifier = Modifier.size(70.dp,70.dp), contentDescription =null )
                             Spacer(modifier = Modifier.width(16.dp))
                             Text(text ="More Options" ,
                                 modifier = Modifier.padding(40.dp,20.dp,12.dp,0.dp),
                                 fontWeight = FontWeight.ExtraBold,
                                 style = MaterialTheme.typography.h5

                             )

                         }
                     }
                 }







            }


        }
    )
}


