package com.example.thelaptopshope.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thelaptopshope.R

@Composable
fun pciconBox(title:String,value:String)
{
    Box(modifier = Modifier
        .size(90.dp)
        .clip(RoundedCornerShape(12.dp))
        .background(color = colorResource(id = R.color.box))
        .padding(12.dp))
    {
        Column(verticalArrangement = Arrangement.Center) {
            Text(text = value,
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colors.surface,
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.W800,
                textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = title,
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colors.surface,
                style = MaterialTheme.typography.overline ,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center)
        }
    }
}

@Preview
@Composable
fun pciconBoxPreview(){
    pciconBox("title","value")
}