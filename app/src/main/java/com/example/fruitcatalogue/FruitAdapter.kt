import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitcatalogue.R
import android.content.Intent


class FruitAdapter(
    private val fruitList: List<Fruit>
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
        return FruitViewHolder(itemFruitView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentFruit = fruitList[position]
        holder.bindFruit(currentFruit)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val fruitName: TextView
        private val fruitImage: ImageView

        init{
            fruitName = itemView.findViewById(R.id.fruit_name_label)
            fruitImage = itemView.findViewById(R.id.fruit_image)

            itemView.setOnClickListener{
                val currentFruit = fruitList[layoutPosition]
                Toast.makeText(
                    itemView.context, currentFruit.fruitName, Toast.LENGTH_SHORT
                ).show()
            }
        }

        fun bindFruit(fruit: Fruit){
            fruitName.text = fruit.fruitName
            fruitImage.setImageResource(fruit.fruitImage)
        }
    }
}