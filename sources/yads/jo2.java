package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class jo2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new lo2(parcel.readInt() != 0, parcel.readInt() == 0 ? null : bv.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? lv2.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new lo2[i10];
    }
}
