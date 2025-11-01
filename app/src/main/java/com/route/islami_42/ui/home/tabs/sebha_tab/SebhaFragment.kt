import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_42.databinding.FragmentSebhaBinding
class SebhaFragment : Fragment() {

    lateinit var binding: FragmentSebhaBinding

    private var count: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSebhaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.sebhaBody.setOnClickListener {
            handleSebhaClick()
            binding.sebhaBody.animate().rotationBy(45f)
        }
    }

    private fun handleSebhaClick() {
        ++count
        binding.counter.text = count.toString()
        if (count == 33) {
            binding.tvzikr.text = "الحمد لله"
        } else if (count == 66) {
            binding.tvzikr.text = "الله أكبر"
        } else if (count == 99) {
            count = 0
            binding.tvzikr.text = "سبحان الله"
        }
    }
}