package com.my.tracker.ads;

import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.e1;

/* JADX INFO: loaded from: classes11.dex */
public final class AdEvent extends e1 {

    @Nullable
    public final String adFormat;

    @Nullable
    public final String adId;

    @Nullable
    public final String currency;
    public final int network;

    @Nullable
    public final String placementId;
    public final double revenue;

    @Nullable
    public final String source;

    AdEvent(int i10, int i11, double d10, String str, String str2, String str3, String str4, String str5) {
        super(i10);
        this.network = i11;
        this.revenue = d10;
        this.currency = str;
        this.source = str2;
        this.placementId = str3;
        this.adId = str4;
        this.adFormat = str5;
    }
}
