package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
final class zzn implements Parcelable.Creator {
    zzn() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzq(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
