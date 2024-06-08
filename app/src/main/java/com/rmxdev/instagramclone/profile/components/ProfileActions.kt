package com.rmxdev.instagramclone.profile.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProfileAction(
    followClick: () -> Unit,
    messageClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        ProfileButton(text = "Follow", onClick = followClick, modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.width(8.dp))
        ProfileButton(text = "Message", onClick = messageClick, modifier = Modifier.weight(1f))
    }
}

@Composable
private fun ProfileButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black,
        ),
        shape = RoundedCornerShape(10.dp),
    ) {
        Text(text = text)
    }
}