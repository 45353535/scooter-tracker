package com.pubmatic.sdk.common.network;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class POBImageRequest extends POBHttpRequest {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f62437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f62438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageView.ScaleType f62439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bitmap.Config f62440l;

    @Nullable
    public Bitmap.Config getDecodeConfig() {
        return this.f62440l;
    }

    public int getMaxHeight() {
        return this.f62438j;
    }

    public int getMaxWidth() {
        return this.f62437i;
    }

    @Nullable
    public ImageView.ScaleType getScaleType() {
        return this.f62439k;
    }

    public void setDecodeConfig(@Nullable Bitmap.Config config) {
        this.f62440l = config;
    }

    public void setMaxHeight(int i10) {
        this.f62438j = i10;
    }

    public void setMaxWidth(int i10) {
        this.f62437i = i10;
    }

    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
        this.f62439k = scaleType;
    }
}
