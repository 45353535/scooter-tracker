package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4068u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new C4093v0(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C4093v0[i10];
    }
}
