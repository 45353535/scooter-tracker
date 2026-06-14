package com.my.target.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ShoppableAdsItem {

    @Nullable
    public final String deeplink;

    @Nullable
    public final String deeplinkFallbackUrl;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    public final String f59433id;

    @Nullable
    public final String oldPrice;

    @NonNull
    public final String picture;

    @Nullable
    public final String price;

    @NonNull
    public final String text;

    @NonNull
    public final String url;

    public ShoppableAdsItem(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.url = str;
        this.f59433id = str2;
        this.picture = str3;
        this.text = str4;
        this.price = str5;
        this.oldPrice = str6;
        this.deeplink = str7;
        this.deeplinkFallbackUrl = str8;
    }
}
