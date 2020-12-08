package id.putraprima.mygoldtracker.screen.harga;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import id.putraprima.mygoldtracker.R;

public class HargaAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] tvHarga1;
    private final String[] tvHarga2;
    private final Integer[] menuGambar;

    public HargaAdapter(Context context, int resource, Activity context1, String[] tvHarga1, String[] tvHarga2, Integer[] menuGambar){
        super(context, resource);
        this.context = context1;
        this.tvHarga1 = tvHarga1;
        this.tvHarga2 = tvHarga2;
        this.menuGambar = menuGambar;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.fragment_harga, null, true);

        TextView tvHarga1 = (TextView)rowView.findViewById(R.id.tvHarga1);
        TextView tvHarga2 = (TextView)rowView.findViewById(R.id.tvHarga2);
        ImageView imgMenu = (ImageView)rowView.findViewById(R.id.imageView);

//        tvHarga1.setText(tvHarga1[position]);
//        tvHarga2.setText(tvHarga2[position]);
        imgMenu.setImageResource(menuGambar[position]);

        return rowView;
    }
}
