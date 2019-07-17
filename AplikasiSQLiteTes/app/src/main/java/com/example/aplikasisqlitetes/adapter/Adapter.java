package com.example.aplikasisqlitetes.adapter;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.aplikasisqlitetes.R;

import com.example.aplikasisqlitetes.model.Data;

import java.util.Date;
import java.util.List;

public class Adapter extends BaseAdapter{
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> item;

    public Adapter (Activity activity, List<Data>item){
        this.activity = activity;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int location){
        return item.get(location);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView address = (TextView) convertView.findViewById(R.id.address);

        Data data = item.get(position);

        id.setText(data.getId());
        name.setText(data.getName());
        address.setText(data.getAddress());

        return convertView;
    }
}
