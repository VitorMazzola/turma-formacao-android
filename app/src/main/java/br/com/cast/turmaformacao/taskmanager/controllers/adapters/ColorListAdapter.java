package br.com.cast.turmaformacao.taskmanager.controllers.adapters;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import br.com.cast.turmaformacao.taskmanager.R;
import br.com.cast.turmaformacao.taskmanager.model.entities.Color;

public class ColorListAdapter extends BaseAdapter {

    private Color[] values;
    private Activity context;


    public ColorListAdapter(Activity context, Color[] values) {
        super();
        this.context = context;
        this.values = Color.values();
    }

    @Override
    public int getCount() {
        return this.values.length;
    }

    @Override
    public Color getItem(int position) {
        return this.values[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Color color = getItem(position);

        View listItem = context.getLayoutInflater().inflate(R.layout.list_item_spinner_color, parent, false);

        int cor = 0;
        try {
            cor = android.graphics.Color.parseColor(color.getHex());
        }catch (Exception e){
            Log.e("task manager", "Cor Errada : " + color);
        }
        TextView background = (TextView) listItem.findViewById(R.id.spinnerItemColor);
        background.setBackgroundColor(cor);
        background.setText(color.toString());


        return listItem;

    }
}