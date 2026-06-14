package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class py2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new qy2(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new qy2[i10];
    }
}
