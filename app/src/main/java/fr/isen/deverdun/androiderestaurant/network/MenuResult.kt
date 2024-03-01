package fr.isen.deverdun.androiderestaurant.network

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MenuResult (
    val data: List<Category>
)