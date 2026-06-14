package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class so1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            arrayList.add(cp1.CREATOR.createFromParcel(parcel));
        }
        int i12 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
        for (int i13 = 0; i13 != i12; i13++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new to1(arrayList, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new to1[i10];
    }
}
