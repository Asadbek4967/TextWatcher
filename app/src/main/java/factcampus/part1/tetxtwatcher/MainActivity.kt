package factcampus.part1.tetxtwatcher

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import factcampus.part1.tetxtwatcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText.addTextChangedListener(CreditCardNumberFormattingTextWatcher())

//        binding.editText.addTextChangedListener{
//            if (it.toString().length == 16){
//                binding.editText.setTextColor(Color.parseColor("#3F704D"))
//            }
//            else if (it.toString().length > 16){
//                binding.editText.setTextColor(Color.RED)
//            }
//            else{
//                binding.editText.setTextColor(Color.BLACK)
//            }
//            when{
//                it.toString().startsWith("4430") ->{
//                    binding.icCard.setImageResource(R.drawable.visa)
//                }
//                it.toString().startsWith("4770") ->{
//                    binding.icCard.setImageResource(R.drawable.mastercard)
//                }
//                it.toString().startsWith("3362") ->{
//                    binding.icCard.setImageResource(R.drawable.paypal)
//                }
//                else -> binding.icCard.setImageResource(0)
//
//            }
////            binding.txtCounter.text = "${it.toString().length}/16"
//        }
//
//





    }

}