package br.senai.sp.jandira.lista

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lista.dao.repository.ProductRepository
import br.senai.sp.jandira.lista.model.Product
import br.senai.sp.jandira.lista.ui.theme.ListaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // val = variavel imultavel
//        val p2= Product()
//        p2.name = "Mouse"

//        val p = Product(1, "Mouse")
//        val p2 = Product(id = 2, price = 45.98)
//        val p3 = Product(description = "ijdfnjisdn", id = 5)

//        val pr = ProductRepository()
//        pr.getProductList()
//        ProductRepository.teste2

        setContent {
            ListaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(ProductRepository.getProductList())
                }
            }
        }
    }
}

@Composable
fun Greeting(products: List<Product>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        //call-back chama e volta (exatamente igual o map do JS)
        LazyColumn(){
            items(products){ product ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    backgroundColor = Color(255, 230, 0, 255)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier.size(100.dp),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = product.image ?: painterResource(id = R.drawable.no_image),
                                contentDescription = ""
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = product.name,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = product.description,
                                color = Color.White,
                                fontSize = 12.sp
                            )
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = "${product.price}",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(103, 58, 183, 255),
                                textAlign = TextAlign.End
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ListaTheme {
        Greeting(ProductRepository.getProductList())
    }
}