package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class cz2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new dz2(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new dz2[i10];
    }
}
