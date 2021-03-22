package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.denii.R

import kotlinx.android.synthetic.main.item_soura.view.*

class SourasAdapter(val items:List<String>):RecyclerView.Adapter<SourasAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val  view= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_soura,parent,false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val souraname=items.get(position)
        holder.souraname.setText(souraname)
        if (onItemClickListener!=null){
            holder.itemView.setOnClickListener {
                onItemClickListener?.onItemClick(position,souraname)
            }
        }
    }
    var onItemClickListener: OnItemClickListener?=null
    interface OnItemClickListener{
        fun onItemClick(position: Int,name:String)
    }
    class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val souraname=itemView.sura_name
    }

}

