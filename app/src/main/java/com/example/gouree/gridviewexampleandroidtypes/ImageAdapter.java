package com.example.gouree.gridviewexampleandroidtypes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by omsai on 03/09/2017.
 */

public class ImageAdapter extends BaseAdapter {

    //context object
    private Context CTX;

    //images to be displayed
    private Integer image_id[] =
                  { R.drawable.z1,
                    R.drawable.z2,
                    R.drawable.z3,
                    R.drawable.z4,
                    R.drawable.z5,
                    R.drawable.z6
                  };



    ImageAdapter(Context CTX)

    {
        this.CTX=CTX;
    }
    @Override
    public int getCount()
    {
        return image_id.length;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ImageView img;

        //if view is null
        if(convertView == null)
        {
            img= new ImageView(CTX);
            img.setLayoutParams(new GridView.LayoutParams(160,160));
            img.setScaleType(ImageView.ScaleType.CENTER_CROP);
            img.setPadding(8,8,8,8);


        }

        else {
            img = (ImageView) convertView;
        }

        img.setImageResource(image_id[position]);

        return (img);

        //return null;
    }
}
