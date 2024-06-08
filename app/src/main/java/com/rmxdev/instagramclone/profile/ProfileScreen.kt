package com.rmxdev.instagramclone.profile

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.rmxdev.instagramclone.profile.components.ProfileAction
import com.rmxdev.instagramclone.profile.components.ProfileDescription
import com.rmxdev.instagramclone.profile.components.ProfileHeader
import com.rmxdev.instagramclone.profile.components.ProfileInformation
import com.rmxdev.instagramclone.profile.components.ProfilePostImage
import com.rmxdev.instagramclone.profile.components.ProfileStoryHighlight

@Composable
fun ProfileScreen() {

    val user = User(
        username = "maxi._.rodriguez",
        name = "Maxi Rodriguez",
        profileImageUrl = "https://via.placeholder.com/200",
        followers = 350,
        following = 245,
        description = "Android Developer",
        stories = listOf(
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 1"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 2"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 3"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 4"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 5"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 6"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 7"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 8"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 9"
            ),
            Story(
                image = "https://via.placeholder.com/150",
                text = "Story 10"
            )
        ),
        posts = listOf(
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000"
        )
    )

    val size = 3
    val context = LocalContext.current
    Column{
        Spacer(modifier = Modifier.height(32.dp))
        ProfileHeader(
            backClick = { showToast(context, "Back button") },
            notificationClick = { showToast(context, "Notification button") },
            optionClick = { showToast(context, "Option button") },
            username = user.username
        )
        LazyVerticalGrid(columns = GridCells.Fixed(size)) {
            item(span = { GridItemSpan(size) }) {
                ProfileInformation(
                    profileImageUrl = user.profileImageUrl,
                    posts = user.posts.size,
                    followers = user.followers,
                    following = user.following
                )
            }
            item(span = { GridItemSpan(size) }) {
                ProfileDescription(
                    name = user.name,
                    description = user.description
                )
            }
            item(span = { GridItemSpan(size) }) {
                ProfileAction(
                    followClick = { showToast(context, "Follow button") },
                    messageClick = {showToast(context, "Message button")},
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
            item(span = { GridItemSpan(size) }) {
                ProfileStoryHighlight(
                    storyClick = { showToast(context, "Story button") },
                    stories = user.stories,
                    modifier = Modifier
                )
            }
            items(user.posts) {
                ProfilePostImage(
                    postClick = { showToast(context, "Post button") },
                    imageUrl = it,
                    modifier = Modifier
                )
            }
        }
    }
}

private fun showToast(context: Context, clickedItem: String){
    Toast.makeText(context, "Clicked on: $clickedItem", Toast.LENGTH_SHORT).show()
}