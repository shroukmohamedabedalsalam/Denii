package adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.denii.R
import kotlinx.android.synthetic.main.aya.view.*

class AyaAdapter(val items:List<String>):RecyclerView.Adapter<AyaAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val  view= LayoutInflater.from(parent.context)
            .inflate(R.layout.aya,parent,false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val aya= items.get(position)
        holder.aya.setText(aya+"{"+(position+1)+"}")

    }

    class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val aya=itemView.aya
    }}


