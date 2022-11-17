package com.example.coroutinesvalen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import com.example.coroutinesvalen.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val link = "https://otobalancing.net/wp-content/uploads/2019/11/honda-cbr100rr_2020-3_full.jpg"
// menampilkan gambar dari internet dengan memasukan url dari link gambar//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.image1.load(link){
            placeholder(R.drawable.ic_launcher_background)
            crossfade(true)
            crossfade(500)
            transformations(
                CircleCropTransformation(),
                GrayscaleTransformation()

            )
        }
    // menginisialisasi gambar pertama dimana gambar tersebut akan didapatkan dari internet//

    binding.image2.load(R.drawable.kumlol){
            crossfade(true)
            crossfade(1000)
            transformations(RoundedCornersTransformation(100f))
            transformations(CircleCropTransformation())
        }
    }
}
// menginisialisasi gambar 2 yang di import dari file local drawable//

// untuk menampilkan gambar ini, menggunakan coroutines dimana coroutine berguna untuk mengelola tugas yang berjalan lama dan mungkin memblokir thread utama serta menyebabkan aplikasi tidak responsif. Lebih dari 50% developer profesional yang menggunakan coroutine telah melaporkan peningkatan produktivitas//