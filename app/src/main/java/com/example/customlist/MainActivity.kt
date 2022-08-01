package com.example.customlist


import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView= findViewById<ListView>(R.id.listview)
        var list= mutableListOf<model>()


        //adding images
        list.add(model("Facebook","facebook is for dummies", R.drawable.facebook))
        list.add(model("Whatsapp", "Whatsapp = time wastage", R.drawable.whatsapp))
        list.add(model("Youtube", "youtube is not badly off", R.drawable.youtube))
        list.add(model("Instagram", "instagram the real deal", R.drawable.instagram1))
        list.add(model("Twitter", "fear KOT", R.drawable.twitter))

        listView.adapter=MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->

            if (position==0){
                Toast.makeText(this@MainActivity,"You have clicked on Facebook! Are you even serious",Toast.LENGTH_LONG).show()

            }
            if (position==1){
                Toast.makeText(this@MainActivity,"You have clicked on Whatsapp! Just log out",Toast.LENGTH_LONG).show()

            }
            if (position==2){
                Toast.makeText(this@MainActivity,"You have clicked on Youtube! Watch ancestor",Toast.LENGTH_LONG).show()

            }
            if (position==3){
                Toast.makeText(this@MainActivity,"You have clicked on Instagram! Follow ancestor",Toast.LENGTH_LONG).show()

            }
            if (position==4){
                Toast.makeText(this@MainActivity,"You have clicked on Twitter! dont mess with KOT",Toast.LENGTH_LONG).show()

            }



        }
    }
}