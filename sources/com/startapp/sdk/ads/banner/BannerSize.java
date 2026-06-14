package com.startapp.sdk.ads.banner;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class BannerSize {

    @Keep
    public static final BannerSize ZERO = new BannerSize(0, 0);
    private final int height;
    private final int width;

    @Keep
    public BannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    @Keep
    public int getHeight() {
        return this.height;
    }

    @Keep
    public int getWidth() {
        return this.width;
    }
}
