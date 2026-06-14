package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class tg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ug(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ug[i10];
    }
}
