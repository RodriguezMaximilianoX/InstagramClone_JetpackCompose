package com.rmxdev.instagramclone.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import coil.compose.AsyncImage

@Composable
fun ProfileInformation(
    profileImageUrl: String,
    posts: Int,
    followers: Int,
    following: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        AsyncImage(
            model = profileImageUrl,
            contentDescription = "Profile Image",
            modifier = Modifier.clip(CircleShape)
        )
        ProfileItem(posts, "Posts")
        ProfileItem(followers, "Followers")
        ProfileItem(following, "Following")
    }
}

@Composable
private fun ProfileItem(amount: Int, type: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = amount.toString(), fontWeight = FontWeight.Bold)
        Text(text = type)
    }
}