package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class eg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        return new fg(parcel.readInt(), string);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new fg[i10];
    }
}
