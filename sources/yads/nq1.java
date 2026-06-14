package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class nq1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        int i10 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new oq1(string, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new oq1[i10];
    }
}
