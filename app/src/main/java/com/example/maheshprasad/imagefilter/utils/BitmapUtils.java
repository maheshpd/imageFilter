package com.example.maheshprasad.imagefilter.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by maheshprasad on 17/01/18.
 */

public class BitmapUtils {

    private static final String TAG = BitmapUtils.class.getSimpleName();

    public static Bitmap getBitmapFromAssets(Context context,String fileName,int width,int height) throws IOException {
        AssetManager assetManager=context.getAssets();

        InputStream istr;
        Bitmap bitmap=null;

        BitmapFactory.Options options=new BitmapFactory.Options();
        options.inJustDecodeBounds=true;

        istr=assetManager.open(fileName);
return null;

    }
}
