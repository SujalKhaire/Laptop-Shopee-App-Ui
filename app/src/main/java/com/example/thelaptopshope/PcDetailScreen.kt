package com.example.thelaptopshope

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.thelaptopshope.Dta.FakeDTABASE
import com.example.thelaptopshope.component.OwnerCard
import com.example.thelaptopshope.component.PcInfoKart
import com.example.thelaptopshope.component.pciconBox


@Composable
fun Details(navController: NavController,id:Int) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Details") },
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
            DetailsView(id,navController)
        }
    )
}

@Composable
fun DetailsView(id:Int,navController: NavController ){
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.background))
    ){
        val myPc = FakeDTABASE.pcList[id]

        item {
            myPc.apply {
                val pcImage:Painter = painterResource(id = myPc.image)
                Image(painter = pcImage,
                    contentDescription =null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(346.dp),
                    contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.height(16.dp))
                PcInfoKart(name = name, location = location)
            }
        }

        item {
            myPc.apply {
                Spacer(modifier = Modifier.height(24.dp))
                Title(title = "Specification")
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = about,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp, 0.dp, 16.dp, 0.dp),
                    color = colorResource(id = R.color.white),
                    style = MaterialTheme.typography.body2,
                    textAlign = TextAlign.Start)
            }
        }

        item {
            myPc.apply {
                Spacer(modifier = Modifier.height(24.dp))
                Title(title = "Basic Info")
                Spacer(modifier = Modifier.height(16.dp))

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, 0.dp, 16.dp, 0.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    pciconBox(title = "Ram", value ="8 GB" )
                    pciconBox(title = "SSD", value ="1 TB" )
                    pciconBox(title = "Color", value ="Grey" )
                }

            }
        }

        item {
            myPc.apply {
                Spacer(modifier = Modifier.height(24.dp))
                Title(title = "Owner info")
                Spacer(modifier = Modifier.height(16.dp))
                owner.apply {
                    OwnerCard(name, bio, image)
                }


            }
        }

        item {
            Spacer(modifier = Modifier.height(36.dp))
            Button(
                onClick = {navController.navigate(Screen.Payment.route)  },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(16.dp, 0.dp, 16.dp, 0.dp),
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = colorResource(id = R.color.blue),
                    contentColor = Color.White
                )
            ) {
                Text("Buy Now")
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}




@Composable
fun Title(title:String)
{
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, 0.dp, 0.dp, 0.dp),
        color = colorResource(id = R.color.white),
        style = MaterialTheme.typography.subtitle1,
        fontWeight = FontWeight.W600,
        textAlign = TextAlign.Start
    )
}




