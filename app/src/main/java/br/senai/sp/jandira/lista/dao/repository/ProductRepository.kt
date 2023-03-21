package br.senai.sp.jandira.lista.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.senai.sp.jandira.lista.R
import br.senai.sp.jandira.lista.model.Product

class ProductRepository {

    //no static
    var teste = "Teste"

    //tudo que for colocado aqui vai virar static(estatico)
    companion object{

        //static
        //var teste2 = "Teste 2"

        @Composable
        fun getProductList() : List<Product>{
            return listOf<Product>(
                Product(
                    id = 1,
                    name = "Mouse",
                    price = 29.99,
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when"
                ),
                Product(
                    id = 2,
                    name = "Teclado",
                    price = 128.66,
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when"
                ),
                Product(
                    id = 3,
                    name = "Mickey Mouse",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when"
                ),
                Product(
                    id = 4,
                    name = "Caneca Java",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when",
                    image = painterResource(id = R.drawable.caneca_java)
                ),
                Product(
                    id = 5,
                    name = "Camiseta JavaScript",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when",
                    image = painterResource(id = R.drawable.camisa_js)
                ),Product(
                    id = 6,
                    name = "Apontador Laser",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when"
                ),Product(
                    id = 7,
                    name = "Notebook Asus",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when"
                )

            )
        }
    }

}