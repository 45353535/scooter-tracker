package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class np0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new op0(parcel.readString(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new op0[i10];
    }
}
