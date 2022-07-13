package ramizbek.aliyev.myapplication

import android.bluetooth.BluetoothAdapter
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import ramizbek.aliyev.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnDilaog.setOnClickListener {
            val mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
            if (mBluetoothAdapter == null) {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.setTitle("Bluetooth")
                alertDialog.setMessage("Not Enabled ")
                alertDialog.show()
            } else {
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.setTitle("Bluetooth")
                alertDialog.setMessage("Enabled")
                alertDialog.show()

            }
        }
    }
}