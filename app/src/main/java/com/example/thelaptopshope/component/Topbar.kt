package com.example.thelaptopshope.component

import android.graphics.Paint.Align
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.DrawerValue
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ModalDrawer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.rememberDrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text


import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thelaptopshope.R
import kotlinx.coroutines.launch


@Composable
fun topbr(){



    Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {


            Text(
                text = "Hey Dude!",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.h5,
                color = colorResource(id = R.color.white)
                )

            Spacer(modifier = Modifier.width(16.dp))

            Text(text = "Top Best Gameing Laptop",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.subtitle1,
                color = colorResource(id = R.color.white)
                )

        }

            Spacer(modifier = Modifier.width(125.dp))
            IconButton(onClick = {  }, modifier = Modifier.padding(0.dp,16.dp,0.dp,0.dp)) {
                Icon(imageVector = Icons.Default.Menu, contentDescription =null, tint = colorResource(
                    id = R.color.white
                ), modifier = Modifier.size(35.dp))
            }

    }
}
@Composable
fun lain ()
{

}

@Composable
fun DrawerContent(){
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Box (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 16.dp)
            .clickable { }){
            Row {
                Icon(imageVector = Icons.Default.Place, contentDescription = null)
                Spacer(modifier = Modifier.padding(16.dp))
                Text(text = "Lcation",
                    style = MaterialTheme.typography.h5
                )
            }
        }
        Box (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 16.dp)
            .clickable { }){
            Row {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
                Spacer(modifier = Modifier.padding(16.dp))
                Text(text = "Cart",
                    style = MaterialTheme.typography.h5
                )
            }
        }
        Box (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 16.dp)
            .clickable { }){
            Row {
                Icon(imageVector = Icons.Default.Settings, contentDescription = null)
                Spacer(modifier = Modifier.padding(16.dp))
                Text(text = "Settings",
                    style = MaterialTheme.typography.h5
                )
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun topbrPreview() {
    topbr()
}