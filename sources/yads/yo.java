package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            arrayList.add(eb.CREATOR.createFromParcel(parcel));
        }
        return new zo(arrayList, parcel.readInt() == 0 ? null : sq1.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new zo[i10];
    }
}
