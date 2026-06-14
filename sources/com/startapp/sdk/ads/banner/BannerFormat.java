package com.startapp.sdk.ads.banner;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public enum BannerFormat {
    BANNER(0, 320, 50),
    MREC(1, 300, 250),
    COVER(2, 300, 157);

    final int heightDp;
    final int type;
    final int widthDp;

    BannerFormat(int i10, int i11, int i12) {
        this.type = i10;
        this.widthDp = i11;
        this.heightDp = i12;
    }
}
