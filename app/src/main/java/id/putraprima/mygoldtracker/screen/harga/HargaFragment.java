package id.putraprima.mygoldtracker.screen.harga;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import id.putraprima.mygoldtracker.R;

public class HargaFragment extends Fragment {

    ListView listView;

    public HargaFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_harga, container, false);

        String[] menuItems ={ "Rp.444.000", "Rp.424.000", "0", "p", "p"};
        int[] image ={R.drawable.bitcoin};




        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_activated_1,
                menuItems

        );

        listView.setAdapter(listViewAdapter);
        return view;
    }
}