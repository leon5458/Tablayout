package fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hly.tablayout.R;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/9/14~~~~~~
 * ~~~~~~更改时间:2018/9/14~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class ThiredFrgment extends Fragment {
    private Bitmap bitmap;
    private ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.thired_fragment_layout, container, false);
        int tab = getArguments().getInt("tab");
        imageView = view.findViewById(R.id.img);
        if (tab ==0){
            bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.jt);
        }else if (tab ==1){
            bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.fx);
        }else if (tab ==2){
            bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.xsea);
        }else if (tab==3){
            bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.pg);
        }
        imageView.setImageBitmap(bitmap);

        return view;

    }
}
