package www.bryansteven.ec.platzigram.Views.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import www.bryansteven.ec.platzigram.Adapter.PictureAdapterRecyclerView;
import www.bryansteven.ec.platzigram.Model.Picture;
import www.bryansteven.ec.platzigram.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar("Home", false, view);

        RecyclerView pictureRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_picture);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        pictureRecyclerView.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(getPictures(),R.layout.cardview_picture, getActivity());
        pictureRecyclerView.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> getPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("","Bryan Rodríguez","5 días","10 Me gusta"));
        pictures.add(new Picture("","Steven Morales","3 días","5 Me gusta"));
        pictures.add(new Picture("","Michael Andres","8 días","2 Me gusta"));
        return pictures;
    }

    public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar= (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
