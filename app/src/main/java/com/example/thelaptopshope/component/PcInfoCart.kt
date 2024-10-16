package com.example.thelaptopshope.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun PcInfoKart(name:String,location:String)
{
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(text = name,
                color = MaterialTheme.colors.surface,

                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h5)
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = location,
                modifier = Modifier.padding(8.dp, 12.dp, 12.dp, 0.dp),
                color = MaterialTheme.colors.surface,
                style = MaterialTheme.typography.caption)
            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "15 mins ago",
                modifier = Modifier.padding(0.dp, 0.dp, 12.dp, 0.dp),
                color = MaterialTheme.colors.surface,
                style = MaterialTheme.typography.overline)
        }

        Spacer(modifier = Modifier.width(140.dp))

        Text(text = "$485",
            color = MaterialTheme.colors.surface,

            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h5)



    }



}


@Preview
@Composable
fun PcInfoKartPreiew(){
    PcInfoKart("sujal","10m")
}