package com.example.thelaptopshope

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun homies(navController: NavController){
    val categoties = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    val grouped = listOf("New Release","Favorites","Top  Rated")

    LazyColumn{
        grouped.forEach {
            stickyHeader {
                Text(text = it, modifier = Modifier.padding(16.dp))
                LazyRow{
                    items(categoties){
                            cata->
                        homiesItem(cata = cata, drawable = androidx.core.R.drawable.ic_call_answer)
                    }
                }
            }

        }

    }
}

@Composable
fun homiesItem(cata:String,drawable:Int){
    Card(modifier = Modifier
        .padding(16.dp)
        .size(200.dp)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(text = cata)
            Image(painter = painterResource(id = drawable), contentDescription = null)
        }
    }
}