package senai.jandira.sp.telacategoria

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp


@Composable
fun Telacategoria() {
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
                    text = "Qual seu objetivo?",
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
                Row {
                    Text(
                        text = "Estou buscando\n alguém para\n conversar e me\n ajudar",
                        fontSize = 15.sp,
                        color = Color(0xFF2755B2),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 30.dp, top = 17.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.paciente),
                        contentDescription = "imagem de perfil",
                        modifier = Modifier
                            .size(170.dp)
                            .padding(start = 80.dp)

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
                        text = "Desejo ajudar\npessoas,oferecendo\nsuporte",
                        fontSize = 16.sp,
                        color = Color(0xFF2755B2),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 30.dp, top = 25.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ouvintes),
                        contentDescription = "imagem de perfil",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(start = 55.dp, bottom = 10.dp)

                    )
                }
            }


            Spacer(modifier = Modifier.height(100.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults
                    .buttonColors(
                        containerColor = Color(0XFFE2EFFF)
                    ),
                modifier = Modifier
                    .width(300.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(size = 32.dp)
            ) {
                Text(
                    fontWeight = FontWeight.Medium,
                    text = "Continuar",
                    color = Color(0xFF1F55C6),
                    fontSize = 20.sp,
                    modifier = Modifier
                )


            }
            Card(
                modifier = Modifier
                    .height(17.dp)
                    .width(230.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0x800B4ED7)),
                shape = RoundedCornerShape(
                    bottomEnd = 32.dp,
                    bottomStart = 32.dp,
                )
            ) {
            }
        }
            }



        }






@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewMain() {
    Telacategoria()
}