package com.example.appecommerce.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appecommerce.R
import com.example.appecommerce.component.ButtonBase
import com.example.appecommerce.component.LogoApp
import com.example.appecommerce.component.TextClick
import com.example.appecommerce.component.TextFieldBase
import com.example.appecommerce.component.TextFieldPassword


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun SignUpSreen() {
    val nameValue = remember { mutableStateOf("")}
    val emailValue = remember { mutableStateOf("") }
    val phoneValue = remember { mutableStateOf("")}
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val passwordConfirmValue = remember { mutableStateOf("") }
    val passwordConfirmVisible = remember { mutableStateOf(false) }

    Scaffold(containerColor = MaterialTheme.colorScheme.background)
    {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            item {
                LogoApp()
                Spacer(modifier = Modifier.padding(20.dp))
                TextFieldBase("Nombre",nameValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase("Correo",emailValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase("Telefono",phoneValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassword("Contraseña",passwordValue,passwordVisible)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassword("Confirmar Contraseña",passwordConfirmValue,passwordConfirmVisible)
                Spacer(modifier = Modifier.padding(20.dp))
                ButtonBase("Registrar",onClick={})
                Spacer(modifier = Modifier.padding(5.dp))
                TextClick("Iniciar sesion", onClick = {})


            }
        }
    }

}
