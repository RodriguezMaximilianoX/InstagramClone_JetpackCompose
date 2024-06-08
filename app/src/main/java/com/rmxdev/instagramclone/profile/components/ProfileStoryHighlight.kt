package com.rmxdev.instagramclone.profile.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.rmxdev.instagramclone.profile.Story

@Composable
fun ProfileStoryHighlight(
    storyClick: () -> Unit,
    modifier: Modifier = Modifier,
    stories: List<Story>
) {
    LazyRow(modifier = modifier.padding(horizontal = 16.dp, vertical = 4.dp)) {
        items(stories) {
            StoryHighlight(it, modifier = modifier.clickable { storyClick() })
            Spacer(modifier = modifier.width(8.dp))
        }
    }
}

@Composable
private fun StoryHighlight(
    story: Story,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = CenterHorizontally) {
        AsyncImage(
            model = story.image,
            contentDescription = "Story Highlight",
            modifier = modifier.clip(CircleShape)
        )
        Text(text = story.text)
    }
}