package com.my.target.instreamads.postview.models;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public final class PostViewData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageData f59911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f59913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f59914d;

    public PostViewData(ImageData imageData, String str, double d10, Integer num) {
        this.f59911a = imageData;
        this.f59912b = str;
        this.f59913c = d10;
        this.f59914d = num;
    }

    public static PostViewData a(ImageData imageData, String str, double d10, Integer num) {
        return new PostViewData(imageData, str, d10, num);
    }

    @Nullable
    public ImageData getBackgroundImage() {
        return this.f59911a;
    }

    public double getDuration() {
        return this.f59913c;
    }

    @Nullable
    @ColorInt
    public Integer getOverlay() {
        return this.f59914d;
    }

    @Nullable
    public String getText() {
        return this.f59912b;
    }
}
