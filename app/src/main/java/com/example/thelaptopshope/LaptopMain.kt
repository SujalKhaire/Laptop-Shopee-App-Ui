package com.example.thelaptopshope

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import com.example.thelaptopshope.Dta.FakeDTABASE
import com.example.thelaptopshope.Dta.Pc
import com.example.thelaptopshope.component.itemPcKart
import com.example.thelaptopshope.component.topbr

@Composable
fun Home(navController: NavController , doglist:List<Pc>)
{

    data class BottomNavigationIcon(
        val title:String,
        val selectedIcon:ImageVector,
        val unSelcectedIcon:ImageVector
    )

    val items = listOf(BottomNavigationIcon("Home",Icons.Filled.Home,Icons.Outlined.Home),
                       BottomNavigationIcon("Chat",Icons.Filled.Email,Icons.Outlined.Email),
                       BottomNavigationIcon("Setting",Icons.Filled.Settings,Icons.Outlined.Settings))
    var selectedItemIndex by remember {
        mutableStateOf(0)
    }

    Scaffold (bottomBar = {
        NavigationBar(modifier = Modifier.background(color = colorResource(id = R.color.background))) {
            items.forEachIndexed() {
                index,item->
                NavigationBarItem(selected = selectedItemIndex == index, onClick = { selectedItemIndex= index; if (index == 1){
                    navController.navigate(Screen.Homies.route)
                } }, label = {item.title}, icon = { Icon(
                    imageVector = if (index == selectedItemIndex){item.selectedIcon } else {item.unSelcectedIcon},
                    contentDescription = null, modifier = Modifier
                        .wrapContentSize()
                        .padding(8.dp)
                ) })
            }
        }
    }){
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .background(color = colorResource(id = R.color.background)))
        {
            item {
                topbr()
            }
            items(doglist){
                    item->
                itemPcKart(pc = item, onItemClick ={pc->
                    navController.navigate("details/${pc.id}/${pc.name}/${pc.location}")
                } )
            }





        }
    }



}

