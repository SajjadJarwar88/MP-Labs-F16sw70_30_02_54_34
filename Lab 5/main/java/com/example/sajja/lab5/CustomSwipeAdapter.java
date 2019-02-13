package com.example.sajja.lab5;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class CustomSwipeAdapter extends PagerAdapter
{
    private int[] image={R.drawable.sample1,R.drawable.sample2,
            R.drawable.sample3,R.drawable.sample4,R.drawable.sample5,
            R.drawable.sample6,R.drawable.sample9,R.drawable.sample10};
    private Context context;
    private LayoutInflater layoutInflater;
    public CustomSwipeAdapter(Context context)
    {
        this.context=context;

    }
    @Override
    public int getCount()
    {
        return image.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object o)
    {


        return (view==(LinearLayout)o);
    }
    @Override
    public Object instantiateItem(ViewGroup container,int position)
    {
        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView=view.findViewById(R.id.Img1);
        imageView.setImageResource(image[position]);
        container.addView(view);
        return view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position,Object object)
    {
        container.removeView((LinearLayout) object);

    }

}
