package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class kv2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new lv2(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new lv2[i10];
    }
}
