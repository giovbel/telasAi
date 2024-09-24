package senai.jandira.sp.telacategoria.ui.theme

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import senai.jandira.sp.telacategoria.R


@Composable
fun TelaOuvinte() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFE3EFFF),
                        Color(0xFF275BC8)

                    ),
                )
            )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp)
                    .padding(top = 16.dp),
                alignment = Alignment.Center
            )
            Spacer(modifier = Modifier.height(100.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    textAlign = TextAlign.Center,
                    text = "A sua presença faz a diferença ! Assinale a opção a qual condiz\n" +
                            " com a sua relação com a\n" +
                            " psicologia:",
                    fontSize = 22.sp,
                    color = Color(0xFF04276D),
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(60.dp))
            Card(
                elevation = CardDefaults.elevatedCardElevation(20.dp),
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(320.dp)
                    .height(105.dp)
                    .align(Alignment.CenterHorizontally),
                colors = CardDefaults
                    .cardColors(containerColor = Color(0xFFFFFDFD)),
                shape = RoundedCornerShape(28.dp)
            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Atualmente\nestou cursando\npsicologia",
                        fontSize = 15.sp,
                        color = Color(0xFF2755B2),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 30.dp)//, top = 25.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.cursantes),
                        contentDescription = "livros",
                        modifier = Modifier
                            .size(90.dp)
                            .padding(end = 30.dp)


                    )


                }
            }
            Spacer(modifier = Modifier.height(35.dp))
            Card(
                elevation = CardDefaults.elevatedCardElevation(20.dp),
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(320.dp)
                    .height(105.dp)
                    .align(Alignment.CenterHorizontally),
                colors = CardDefaults
                    .cardColors(containerColor = Color(0xFFFFFDFD)),
                shape = RoundedCornerShape(28.dp)
            ) {
                Row {
                    Text(
                        text = "Sou formado na\nárea de\npsicologia",
                        fontSize = 16.sp,
                        color = Color(0xFF2755B2),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 30.dp, top = 25.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.formandos),
                        contentDescription = "imagem de perfil",
                        modifier = Modifier
                            .size(130.dp)
                            .padding(start = 55.dp, bottom = 10.dp)

                    )
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
          @Composable
            private fun PreviewMain() {
              TelaOuvinte()
            }