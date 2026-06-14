package com.my.tracker.personalize;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public final class PersonalizeItem {
    public final double discountPrice;
    public final int discountValue;

    @NonNull
    public final String payload;
    public final double price;

    @NonNull
    public final String sku;
    public final int value;

    PersonalizeItem(String str, String str2, double d10, double d11, int i10, int i11) {
        this.sku = str;
        this.payload = str2;
        this.price = d10;
        this.discountPrice = d11;
        this.value = i10;
        this.discountValue = i11;
    }
}
