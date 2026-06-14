package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zo1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        int i10 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
        LinkedHashMap linkedHashMap2 = null;
        i5 i5VarCreateFromParcel = parcel.readInt() == 0 ? null : i5.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
            }
            linkedHashMap2 = linkedHashMap3;
        }
        return new cp1(string, linkedHashMap, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, i5VarCreateFromParcel, linkedHashMap2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new cp1[i10];
    }
}
