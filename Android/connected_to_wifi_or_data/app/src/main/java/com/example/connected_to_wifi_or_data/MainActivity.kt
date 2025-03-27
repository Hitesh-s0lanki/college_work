package com.example.connected_to_wifi_or_data

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkInfo
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var manager: ConnectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        var networkinfo:NetworkInfo? = manager.activeNetworkInfo

        if(networkinfo != null && networkinfo.isConnectedOrConnecting){
            if(networkinfo.type == ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(this, "You are Connected to Mobile Network", Toast.LENGTH_SHORT).show()
            }
            else if(networkinfo.type == ConnectivityManager.TYPE_WIFI){
                Toast.makeText(this, "You are Connected to wifi Network", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Offline", Toast.LENGTH_SHORT).show()
        }

    }
}