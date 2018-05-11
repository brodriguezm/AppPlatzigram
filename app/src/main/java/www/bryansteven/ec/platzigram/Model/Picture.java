package www.bryansteven.ec.platzigram.Model;

import android.widget.ImageView;

/**
 * Created by dell on 10/05/2018.
 */

public class Picture {

    private String image;
    private String name;
    private String time;
    private String like;

    public Picture(String image, String name, String time, String like) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.like = like;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
