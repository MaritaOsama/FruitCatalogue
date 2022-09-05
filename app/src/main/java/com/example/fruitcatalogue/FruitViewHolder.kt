import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitcatalogue.R

class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val fruitName: TextView
    private val fruitImage: ImageView

    init{
        fruitName = itemView.findViewById(R.id.fruit_name_label)
        fruitImage = itemView.findViewById(R.id.fruit_image)
    }

    fun bind(fruit: Fruit){
        fruitName.text = fruit.fruitName
        fruitImage.setImageResource(fruit.fruitImage)
    }
}