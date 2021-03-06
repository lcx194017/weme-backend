package cn.seu.weme.entity;

import javax.persistence.*;

/**
 * Created by LCN on 2016-12-21.
 */
@Entity
@Table(name = "t_activity_image")
public class ActivityImage extends BaseImage {



    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
