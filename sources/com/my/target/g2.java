package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class g2 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f59689a;

    public g2(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f59689a = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(@Nullable Bitmap bitmap) {
        this.f59689a.setImageBitmap(bitmap);
    }
}
