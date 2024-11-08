package com.ndege.foodapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
// This is an Adapter that Creates The data to Put in Our Recycler View.
class RecyclerAdapter(var context: Context) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    // Array of Food titles    
    private val titles = arrayOf("French", "American", "spanish", "Italian", "Japanese", "Brazilian", "Indian", "Korean", "Russian", "African")
    // Array of Food Details  
    private val details = arrayOf("This classic dish features tender chicken pieces stir-fried with crunchy peanuts, vibrant bell peppers, and fresh scallions. It’s coated in a savory and slightly spicy sauce made from soy sauce, vinegar, and chili paste, served over fluffy steamed rice for a satisfying meal.", "A traditional French favorite, this dish consists of chicken braised slowly in a rich red wine sauce, complemented by mushrooms, smoky lardons, and aromatic herbs. The long cooking process ensures the chicken is incredibly tender, making it perfect for cozy dinners.", "This creamy and luxurious dish is made with Arborio rice, which absorbs flavors beautifully. Cooked slowly with saffron, white wine, and rich chicken broth, it’s finished with a generous amount of Parmesan cheese, resulting in a comforting and elegantly golden meal.", "A beloved street food, these tacos feature marinated pork cooked on a vertical spit, giving it a unique smoky flavor. Served in soft corn tortillas and topped with fresh cilantro, diced onions, and a squeeze of lime, they deliver a perfect balance of savory and zesty flavors.", "A beloved street food, these tacos feature marinated pork cooked on a vertical spit, giving it a unique smoky flavor. Served in soft corn tortillas and topped with fresh cilantro, diced onions, and a squeeze of lime, they deliver a perfect balance of savory and zesty flavors.", "A hearty and flavorful noodle soup, ramen consists of wheat noodles in a deeply savory broth, which can be soy-based or miso-based. Topped with succulent slices of pork, a soft-boiled egg, seaweed, and green onions, it’s a beloved comfort food that warms the soul.","A popular street food dish, Pad Thai features stir-fried rice noodles tossed with shrimp or chicken, bean sprouts, and eggs, all enveloped in a tangy tamarind sauce. Finished with crushed peanuts, lime, and fresh cilantro, it offers a delightful combination of textures and flavors."," This hearty, layered dish is made with thin slices of eggplant, spiced ground meat (often lamb or beef), and a creamy béchamel sauce. Baked until golden, it’s a comforting meal that showcases the rich flavors of Mediterranean cuisine.", "A vibrant saffron-infused rice dish, paella is traditionally cooked in a wide, shallow pan. It combines succulent seafood, chicken, and seasonal vegetables, creating a colorful and flavorful feast that’s perfect for sharing with family and friends.", "These crispy, golden-brown chickpea balls are seasoned with fresh herbs like parsley and cilantro, along with garlic and spices. Served in warm pita bread with creamy tahini sauce, pickles, and fresh vegetables, falafel offers a delicious and satisfying vegetarian option.")
    // Array of Food costs
    private val cost = arrayOf("1,500 KSH", "2,600 KSH", "2,000 KSH", "1,200 KSH", "2,000 KSH", "1,500 KSH", "1,200 KSH", "2,200 KSH", "2,800 KSH", "1,000 KSH")

    // Array of Food images  
    private val images = intArrayOf(
        R.drawable.image1,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image9,
        R.drawable.image8,
        R.drawable.image4
    )

    // Access the Single item XML Layout
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.singleitem, viewGroup, false)
        return ViewHolder(v)
    }
    
    //View Holder that does find Views in single item XML, 1 ImageView, 3 TextView    
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemCost: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_description)
            itemCost = itemView.findViewById(R.id.item_cost)
        

        }
    }

    //Set Items from Arrays and Put/Bind them in respectives Views    
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemImage.setImageResource(images[i])
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemCost.text = cost[i]
        
        //Below to be Done At the End to demonstrate how to move to Next Page on Item Click
        viewHolder.itemView.setOnClickListener {           

      }
    }

    // Get how many items the array have, All arrays must have equal sizes
    override fun getItemCount(): Int {
        return titles.size
    }
}
