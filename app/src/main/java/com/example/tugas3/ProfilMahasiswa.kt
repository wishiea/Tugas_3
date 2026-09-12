package com.example.tugas3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilMahasiswa() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Foto profil dan tombol edit
        Box(
            contentAlignment = Alignment.TopEnd
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Cyan)
                    .padding(20.dp)
            )

            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit Profil",
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Denisha Firdianti",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "245150407111045",
            fontSize = 16.sp
        )

        Text(
            text = "Sistem Informasi",
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        InfoProfil(
            icon = Icons.Default.Email,
            title = "Email",
            value = "denisha24@student.ub.ac.id"
        )

        Spacer(modifier = Modifier.height(16.dp))

        InfoProfil(
            icon = Icons.Default.Phone,
            title = "No. HP",
            value = "0812345678910"
        )

        Spacer(modifier = Modifier.height(16.dp))

        InfoProfil(
            icon = Icons.Default.School,
            title = "Universitas",
            value = "Universitas Brawijaya"
        )
    }
}

@Composable
fun InfoProfil(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = icon,
            contentDescription = title,
            modifier = Modifier.size(32.dp)
        )

        Spacer(modifier = Modifier.size(16.dp))

        Column {
            Text(
                text = title,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = value
            )
        }
    }
}