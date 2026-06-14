package com.my.target.common.models.videomotion;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class VideoMotionItem {

    @NonNull
    public final String ctaText;

    @NonNull
    public final String currency;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    public final String f59436id;

    @NonNull
    public final String image;

    @Nullable
    public final String oldPrice;

    @Nullable
    public final String price;

    @NonNull
    public final String text;

    public VideoMotionItem(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7) {
        this.f59436id = str;
        this.price = str2;
        this.oldPrice = str3;
        this.currency = str4;
        this.image = str5;
        this.text = str6;
        this.ctaText = str7;
    }

    @NonNull
    public String toString() {
        return "VideoMotionItem{id='" + this.f59436id + "', price='" + this.price + "', oldPrice='" + this.oldPrice + "', currency='" + this.currency + "', image='" + this.image + "', text='" + this.text + "', ctaText='" + this.ctaText + "'}";
    }
}
