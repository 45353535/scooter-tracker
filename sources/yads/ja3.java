package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ja3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new la3(parcel.readInt() == -1 ? null : ka3.values()[parcel.readInt()], parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new la3[i10];
    }
}
