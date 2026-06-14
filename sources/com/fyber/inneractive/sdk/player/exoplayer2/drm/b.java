package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new c[i10];
    }
}
