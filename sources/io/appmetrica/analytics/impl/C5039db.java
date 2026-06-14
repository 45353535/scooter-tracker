package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5039db implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C5064eb(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C5064eb[i10];
    }
}
