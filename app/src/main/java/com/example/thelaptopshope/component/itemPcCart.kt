package com.example.thelaptopshope.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thelaptopshope.Dta.FakeDTABASE
import com.example.thelaptopshope.Dta.Pc
import com.example.thelaptopshope.R

@Composable
fun itemPcKart(pc:Pc,onItemClick:(pc:Pc)->Unit)
{
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .clip(RoundedCornerShape(16.dp))
        .clickable { onItemClick(pc) }, elevation = 10.dp,
        backgroundColor = colorResource(id = R.color.fentback))
    {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp))
        {
            val image:Painter = painterResource(id = pc.image)
            Image(modifier = Modifier.size(80.dp,80.dp),alignment = Alignment.CenterStart,
                painter = image,
                contentDescription = null,
                )
            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(text = pc.name,
                    modifier = Modifier.padding(0.dp,0.dp,12.dp,0.dp),
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.white),
                    style = MaterialTheme.typography.subtitle1

                    )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = pc.location,
                    modifier = Modifier.padding(0.dp,0.dp,12.dp,0.dp),

                    color = colorResource(id = R.color.white),
                    style = MaterialTheme.typography.caption)
            }
        }
    }
}

@Composable
@Preview
fun itemPcCartPreview(){
    itemPcKart(pc = Pc(0,"Legion Pro 5 Gen 8 (16″ AMD) Gaming Laptop","340m away",
        R.drawable.lenovoleg,
        FakeDTABASE.owner,"Given the Legion Slim 5 Gen 8's reasonable \$1,299 starting price, wealth of configuration options, and sturdy build, we can comfortably recommend this model to the average gamer. Our configuration (at \$1,549) is a little pricier than the base model, which gives you an idea of how it can scale up without coming close to high-end pricing. With an AMD Ryzen 7 7840HS CPU and Nvidia GeForce RTX 4060 GPU for speedy midrange gaming performance—alongside a sharp 165Hz display, a comfortable keyboard, and efficient cooling—this Legion is a worthy selection."), onItemClick ={} )
}