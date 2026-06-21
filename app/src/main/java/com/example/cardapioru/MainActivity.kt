package com.example.cardapioru

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardapioru.R.string.titulo_salada
import com.example.cardapioru.ui.theme.BackgroundColor
import com.example.cardapioru.ui.theme.CardapioRuTheme

class MainActivity : ComponentActivity() {
    data class Cardapio(
        val salada: String,
        val pratoPrincipal: String,
        val opcao: String,
        val acompanhamento: String,
        val guarnicao: String,
        val sobremesa: String,
        val suco: String
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardapioRuTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home() {
    var abaSelecionada by remember { mutableStateOf(0) }
    var tituloAba = listOf("Menu do Almoço", "Menu do Jantar")

    val cardapio = MainActivity.Cardapio(
        salada = "SaladaPlaceHolder",
        pratoPrincipal = "PratoPrincipalPlaceHolder",
        opcao = "OpcaoPlaceHolder",
        acompanhamento ="AcompanhamentoPlaceHolder",
        guarnicao = "GuarnicaoPlaceHolder",
        sobremesa = "SobremesaPlaceHolder",
        suco = "SucoPlaceHolder"
    )

    // Cabeçalho
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Cardápio RU",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        )
        Text(
            text = "Menu do Almoço: 12/02/2020",
            fontSize = 16.sp
        )
        // Cardapio
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = stringResource(titulo_salada),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                text = "SaladaPlaceHolder"
            )
            Text(
                text = stringResource(R.string.titulo_prato_principal),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                text = stringResource(R.string.titulo_opcao),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp)
            Text(
                text = stringResource(R.string.titulo_acompanhamento),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                text = stringResource(R.string.titulo_guarnicao),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                text = stringResource(R.string.titulo_sobremesa),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                text = stringResource(R.string.titulo_suco),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )

        }
    }

}


