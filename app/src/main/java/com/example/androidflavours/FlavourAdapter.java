package com.example.androidflavours;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import static android.media.CamcorderProfile.get;

public class FlavourAdapter extends ArrayAdapter<FlavourDataType> {
    Context context;
    int resource;

    public FlavourAdapter(@NonNull Context context, int resource, List<FlavourDataType> flavours) {
        super(context, resource, flavours);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource, parent, false);

        ImageView image = convertView.findViewById(R.id.image_in_list);
        image.setImageResource(getItem(position).getImage());

        TextView name = convertView.findViewById(R.id.name_in_list);
        name.setText(getItem(position).getName());

        TextView version = convertView.findViewById(R.id.version_in_list);
        version.setText(getItem(position).getVersion());


        return convertView;
    }
}
