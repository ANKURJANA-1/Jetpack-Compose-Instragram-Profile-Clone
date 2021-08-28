package com.example.instragramclone.ui.theme

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.instragramclone.R
import androidx.compose.material.IconButton as IconButton1

@Composable
fun MeditationDashboard() {
    layout()
}


@Composable
fun layout() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            TopSection()
            SelectionSection()
            DailyThoughtSection()
            FeaturedSection()
        }
    }
}


@Composable
fun TopSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
        ) {
            Text(
                text = "Good Morning....",
                color = Color.White,
                fontWeight = FontWeight(700),
                fontSize = 30.sp
            )
            Text(
                text = "we wish you have a good day!",
                color = Color.White,
                fontSize = 15.sp
            )
        }

        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search",
            tint = Color.White,

            )
    }
}


@Composable
fun SelectionSection() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(onClick = {}, shape = Shapes.small) {
            Text(text = "Sweet sleep", color = Color.White)
        }

        Button(onClick = {}, shape = Shapes.small) {
            Text(text = "Insomnia", color = Color.White)
        }

        Button(onClick = {}, shape = Shapes.small) {
            Text(text = "Depression", color = Color.White)
        }
    }

}

@Composable
fun DailyThoughtSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
            .background(color = Color.Red, shape = CircleShape),

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)
                .padding(top = 5.dp, bottom = 5.dp, start = 5.dp, end = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column() {
                Text(
                    text = "Daily Thought",
                    color = Color.White,
                    fontWeight = FontWeight(700),
                    fontSize = 30.sp
                )
                Text(
                    text = "Meditation 3-10 min ",
                    color = Color.White,
                    fontSize = 15.sp
                )
            }

            Image(
                painter = painterResource(id = R.drawable.ic_baseline_play_circle_filled_24),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .height(40.dp)
                    .width(40.dp)
                    .border(2.dp, color = Color.Red, CircleShape)
            )


        }
    }
}

@Composable
fun FeaturedSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Featured",
            color = Color.White,
            fontWeight = FontWeight(700),
            fontSize = 30.sp
        )

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultProfileScreen() {
    layout()

}