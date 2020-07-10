package com.example.androidflavours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<FlavourDataType> flavours = new ArrayList<FlavourDataType>();
        flavours.add(new FlavourDataType(R.drawable.th, "No codename", "1.0", R.string.info_1_0, R.drawable.th));
        flavours.add(new FlavourDataType(R.drawable.th, "No codename", "1.1", R.string.info_1_0, R.drawable.th));
        flavours.add(new FlavourDataType(R.drawable.cupcake, "Cupcake", "1.5", R.string.info_1_5, R.drawable.cupcake));
        flavours.add(new FlavourDataType(R.drawable.donut, "Donut", "1.6", R.string.info_1_6, R.drawable.donut));
        flavours.add(new FlavourDataType(R.drawable.eclair, "Eclair", "2.0-2.1", R.string.info_2_0_2_1, R.drawable.eclair));
        flavours.add(new FlavourDataType(R.drawable.froyo, "Froyo", "2.2-2.2.3", R.string.info_2_2_2_2_3, R.drawable.froyo));
        flavours.add(new FlavourDataType(R.drawable.gingerbread, "Gingerbread", "2.3-2.3.7", R.string.info_2_3_2_3_7, R.drawable.gingerbread));
        flavours.add(new FlavourDataType(R.drawable.honeycomb, "Honeycomb", "3.0-3.2.6", R.string.info_3_0_3_2_6, R.drawable.honeycomb));
        flavours.add(new FlavourDataType(R.drawable.icecreamsandwich, "Ice Cream Sandwich", "4.0-4.0.4", R.string.info_4_0_4_0_4, R.drawable.ics_big));
        flavours.add(new FlavourDataType(R.drawable.jellybean, "Jelly Bean", "4.1-4.3.1", R.string.info_4_1_4_3_1, R.drawable.jellybean_big));
        flavours.add(new FlavourDataType(R.drawable.kitkat, "KitKat", "4.4-4.4.4", R.string.info_4_4_4_4_4, R.drawable.kitkat_big));
        flavours.add(new FlavourDataType(R.drawable.lollipop, "Lollipop", "5.0-5.1.1", R.string.info_5_0_5_1_1, R.drawable.lollipop_big));
        flavours.add(new FlavourDataType(R.drawable.marshmallow, "Marshmallow", "6.0-6.0.1", R.string.info_6_0_6_0_1, R.drawable.marshmallow));
        flavours.add(new FlavourDataType(R.drawable.xx, "Nougat", "7.0-7.1.2", R.string.info_7_0_7_1_2, R.drawable.nougat_big));
        flavours.add(new FlavourDataType(R.drawable.oreo, "Oreo", "8.0-8.1", R.string.info_8_0_8_1, R.drawable.oreo_big));
        flavours.add(new FlavourDataType(R.drawable.pie, "Pie", "9.0", R.string.info_9_0, R.drawable.pie_big));
        flavours.add(new FlavourDataType(R.drawable.q, "Q", "10.0", R.string.info_10_0, R.drawable.q_big));


        FlavourAdapter flavourAdapter = new FlavourAdapter(this, R.layout.list, flavours);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(flavourAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int minfo = flavours.get(position).info;
                int mimg = flavours.get(position).bigimg;
                String mname = flavours.get(position).name;
                Intent intent = new Intent(MainActivity.this, Flavour_info.class);
                intent.putExtra("flavour_info", minfo);
                intent.putExtra("flavour_img", mimg);
                intent.putExtra("flavour_name", mname);



                startActivity(intent);

            }
        });
    }

}

