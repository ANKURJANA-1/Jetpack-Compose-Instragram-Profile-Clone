package com.example.instragramclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar()
        ProfileBar()
        IntroBar()
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
        Text(text = "Ankur Jana")
        Icon(imageVector = Icons.Default.Notifications, contentDescription = null)
        Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
    }
}

@Composable
fun ProfileBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .height(90.dp)
                .width(90.dp)
                .border(2.dp, color = Color.Red, CircleShape)
        )

        Column() {
            Text(
                text = "601",
                style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "Posts",
                style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold)
            )
        }
        Column() {
            Text(
                text = "99.8k",
                style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "Followers",
                style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold)
            )
        }
        Column() {
            Text(
                text = "72",
                style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "Following",
                style = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold)
            )
        }

    }
}

@Composable
fun IntroBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp,end = 15.dp),
    ) {
        Text(
            text = "Developer...................",
            style = TextStyle(
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = "No Experience",
            style = TextStyle(
                color = Color.Black,
            )
        )
        Text(
            text = "Want to make app",
            style = TextStyle(
                color = Color.Black,
            )
        )
        Text(
            text = "https://developer.android.com/jetpack/compose/tutorial",
            style = TextStyle(
                color = Color.Magenta,
            )
        )

        Text(
            text = "Followed By.................",
            style = TextStyle(
                color = Color.Black,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar()
        ProfileBar()
        IntroBar()
    }
}