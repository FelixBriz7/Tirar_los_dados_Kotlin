package com.evaluable.lanzador_de_dados

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.evaluable.lanzador_de_dados.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val paises : MutableList<String>

    init {
        paises = Paises.listaPaises.toMutableList()
    }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        }

    }


object Paises {
    val listaPaises = arrayOf("España", "Portugal", "Francia", "Italia", "Alemania",
        "Reino Unido", "Irlanda", "Países Bajos", "Bélgica", "Suiza",
        "Austria", "Suecia", "Noruega", "Dinamarca", "Finlandia",
        "Polonia", "Grecia", "Turquía", "Rusia", "Ucrania",
        "Marruecos", "Egipto", "Sudáfrica", "Nigeria", "Kenia",
        "Estados Unidos", "Canadá", "México", "Colombia", "Argentina",
        "Chile", "Perú", "Brasil", "Venezuela", "Uruguay",
        "Japón", "China", "India", "Corea del Sur", "Australia")

}