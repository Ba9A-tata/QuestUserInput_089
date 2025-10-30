package com.example.userinput

import android.R.attr.value
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Outline
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember {mutableStateOf("") }
    var textJK by remember {mutableListOf("")}

    var nama by remember {mutableListOf("")}
    var alamat by remember {mutableListOf("")}
    var jenis by remember {mutableListOf("")}

    val gender.List<String> = listOf("Laki-laki" ,"Perempuan")

    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment =  Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifer.width(250.dp),
            label = { Text("Nama Lengkap") },
            onValueChange = {
                textNama it
            }
        )

    }

}