package www.bryansteven.ec.platzigram.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import www.bryansteven.ec.platzigram.Model.Picture;
import www.bryansteven.ec.platzigram.R;
import www.bryansteven.ec.platzigram.Views.PictureDetailActivity;

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
        Picasso.get().load(picture.getImage()).into(holder.imageView);
        holder.nameCard.setText(picture.getName());
        holder.timeCard.setText(picture.getTime());
        holder.likesCard.setText(picture.getLike());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PictureDetailActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView nameCard, timeCard, likesCard;


        public PictureViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img_card);
            nameCard = (TextView) itemView.findViewById(R.id.ed_name_card);
            timeCard = (TextView) itemView.findViewById(R.id.ed_time2_card);
            likesCard = (TextView) itemView.findViewById(R.id.ed_count_likes_card);

        }
    }

}
