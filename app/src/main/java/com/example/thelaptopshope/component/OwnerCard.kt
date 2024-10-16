package com.example.thelaptopshope.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Icon
import com.example.thelaptopshope.Dta.Owner
import com.example.thelaptopshope.R

@Composable
fun OwnerCard(name:String,bio:String,image:Int)
{
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        val personImage:Painter = painterResource(id = image)
        Image(painter = personImage, contentDescription =null,
            modifier = Modifier
                .size(60.dp, 60.dp)
                .clip(RoundedCornerShape(16.dp)),
            alignment = Alignment.CenterStart)
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = name,
                color = MaterialTheme.colors.surface,
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.W600,

            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = bio,
                color = MaterialTheme.colors.surface,
                style = MaterialTheme.typography.caption)
        }
        Spacer(modifier = Modifier.width(80.dp))
        IconButton(onClick = { /*TODO*/ },Modifier.align(Alignment.CenterVertically)) {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null,Modifier.size(50.dp))
        }

    }
}

@Preview
@Composable
fun OwnerCardPreview(){
    OwnerCard("Sujal","Developer & Love to pc build", R.drawable.kwner)
}