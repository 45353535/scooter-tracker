package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class oy2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, qy2.class.getClassLoader());
        return new ry2(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ry2[i10];
    }
}
