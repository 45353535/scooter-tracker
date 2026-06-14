package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10 = parcel.readByte() != 0;
        List listCreateStringArrayList = parcel.createStringArrayList();
        if (listCreateStringArrayList == null) {
            listCreateStringArrayList = CollectionsKt.emptyList();
        }
        return new B(z10, listCreateStringArrayList, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new B[i10];
    }
}
