package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class jb1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new kb1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new kb1[i10];
    }
}
