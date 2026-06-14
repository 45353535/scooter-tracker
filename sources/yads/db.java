package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class db implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            arrayList.add(cp1.CREATOR.createFromParcel(parcel));
        }
        return new eb(string, parcel.readString(), arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new eb[i10];
    }
}
