package www.bryansteven.ec.platzigram.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import www.bryansteven.ec.platzigram.Model.Picture;
import www.bryansteven.ec.platzigram.R;

/**
 * Created by dell on 10/05/2018.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private List<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(List<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
//        holder.nameCard.setText(picture.getName());
        holder.nameCard.setText(picture.getName());
        holder.timeCard.setText(picture.getTime());
        holder.likeCountCard.setText(picture.getLike());

    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageCard;
        private TextView nameCard, timeCard, likeCountCard;

        public PictureViewHolder(View itemView) {
            super(itemView);

            imageCard = (ImageView) itemView.findViewById(R.id.img_card);
            nameCard = (TextView) itemView.findViewById(R.id.ed_name_card);
            timeCard = (TextView) itemView.findViewById(R.id.ed_time2_card);
            likeCountCard = (TextView) itemView.findViewById(R.id.ed_count_likes_card);



        }
    }
}
