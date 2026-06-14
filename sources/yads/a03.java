package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class a03 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new b03();
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new b03[i10];
    }
}
