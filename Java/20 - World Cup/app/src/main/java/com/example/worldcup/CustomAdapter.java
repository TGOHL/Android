package com.example.worldcup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountryModel> {
    private Context context;
    private ArrayList<CountryModel> data;

    public CustomAdapter(ArrayList<CountryModel> data, Context context) {
        super(context, R.layout.my_list_item, data);
        this.data = data;
        this.context = context;
    }

    private class ViewHolder {
        TextView tvName;
        TextView tvWinCount;
        ImageView imgCountryFlag;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CountryModel item = getItem(position);

        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_list_item, parent, false);

            viewHolder.tvName = convertView.findViewById(R.id.tv_name);
            viewHolder.tvWinCount = convertView.findViewById(R.id.tv_win_count);
            viewHolder.imgCountryFlag = convertView.findViewById(R.id.imageView);

            result = convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.tvName.setText(item.getName());
        viewHolder.tvWinCount.setText(item.getWinCount());
        viewHolder.imgCountryFlag.setImageResource(item.getImgId());


        return convertView;
    }
}
