package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class kc1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new lc1(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new lc1[i10];
    }
}
