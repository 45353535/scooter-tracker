package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new o(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new o[i10];
    }
}
