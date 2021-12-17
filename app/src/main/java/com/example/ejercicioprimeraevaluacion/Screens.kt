package com.example.ejercicioprimeraevaluacion

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.firestore.FirebaseFirestore

@Composable
fun HomeScreen() {
        var textFieldValueEquipo by rememberSaveable { mutableStateOf("") }
        var textFieldValueConferencia  by rememberSaveable { mutableStateOf("") }

        Column(modifier = Modifier
            .fillMaxSize()


        ) {
            Text(
                text = "SQL INSERT",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Green,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )


            TextField(
                value = textFieldValueEquipo,
                onValueChange = { nuevo ->
                    textFieldValueEquipo = nuevo
                },
                label = {
                    Text(text = "Introducir Equipo")
                },
                modifier = Modifier
                    .padding(10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                textStyle = TextStyle(textAlign = TextAlign.Right)
            )


            TextField(
                value = textFieldValueConferencia,
                onValueChange = { nuevo ->
                    textFieldValueConferencia = nuevo
                },
                label = {
                    Text(text = "Introducir Conferencia")
                },
                modifier = Modifier
                    .padding( 10.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                textStyle = TextStyle(textAlign = TextAlign.Right)
            )


            Spacer(Modifier.height(20.dp) )


            Button(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .size(width = 100.dp, height = 50.dp)
                ,


                onClick = {
                    insertar(textFieldValueEquipo,textFieldValueConferencia)
                    textFieldValueEquipo=""
                    textFieldValueConferencia=""
                }
            ){
                Text(text = "Insert"
                )
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
fun EquiposScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Equipos",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EquiposScreenPreview() {
    EquiposScreen()
}