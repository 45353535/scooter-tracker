package yads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f03 extends vz2 {
    public static final Parcelable.Creator<f03> CREATOR = new c03();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110571b;

    public f03(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(e03.a(parcel));
        }
        this.f110571b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.f110571b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            e03 e03Var = (e03) this.f110571b.get(i11);
            parcel.writeLong(e03Var.f110138a);
            parcel.writeByte(e03Var.f110139b ? (byte) 1 : (byte) 0);
            parcel.writeByte(e03Var.f110140c ? (byte) 1 : (byte) 0);
            parcel.writeByte(e03Var.f110141d ? (byte) 1 : (byte) 0);
            int size2 = e03Var.f110143f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                d03 d03Var = (d03) e03Var.f110143f.get(i12);
                parcel.writeInt(d03Var.f109686a);
                parcel.writeLong(d03Var.f109687b);
            }
            parcel.writeLong(e03Var.f110142e);
            parcel.writeByte(e03Var.f110144g ? (byte) 1 : (byte) 0);
            parcel.writeLong(e03Var.f110145h);
            parcel.writeInt(e03Var.f110146i);
            parcel.writeInt(e03Var.f110147j);
            parcel.writeInt(e03Var.f110148k);
        }
    }

    public f03(ArrayList arrayList) {
        this.f110571b = DesugarCollections.unmodifiableList(arrayList);
    }
}
