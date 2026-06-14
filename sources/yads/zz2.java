package yads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zz2 extends vz2 {
    public static final Parcelable.Creator<zz2> CREATOR = new xz2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f118880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f118881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f118882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f118883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f118884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f118885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f118886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f118887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f118888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f118889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f118890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f118891n;

    public zz2(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f118879b = j10;
        this.f118880c = z10;
        this.f118881d = z11;
        this.f118882e = z12;
        this.f118883f = z13;
        this.f118884g = j11;
        this.f118885h = j12;
        this.f118886i = DesugarCollections.unmodifiableList(list);
        this.f118887j = z14;
        this.f118888k = j13;
        this.f118889l = i10;
        this.f118890m = i11;
        this.f118891n = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f118879b);
        parcel.writeByte(this.f118880c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f118881d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f118882e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f118883f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f118884g);
        parcel.writeLong(this.f118885h);
        int size = this.f118886i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            yz2 yz2Var = (yz2) this.f118886i.get(i11);
            parcel.writeInt(yz2Var.f118470a);
            parcel.writeLong(yz2Var.f118471b);
            parcel.writeLong(yz2Var.f118472c);
        }
        parcel.writeByte(this.f118887j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f118888k);
        parcel.writeInt(this.f118889l);
        parcel.writeInt(this.f118890m);
        parcel.writeInt(this.f118891n);
    }

    public zz2(Parcel parcel) {
        this.f118879b = parcel.readLong();
        this.f118880c = parcel.readByte() == 1;
        this.f118881d = parcel.readByte() == 1;
        this.f118882e = parcel.readByte() == 1;
        this.f118883f = parcel.readByte() == 1;
        this.f118884g = parcel.readLong();
        this.f118885h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(yz2.a(parcel));
        }
        this.f118886i = DesugarCollections.unmodifiableList(arrayList);
        this.f118887j = parcel.readByte() == 1;
        this.f118888k = parcel.readLong();
        this.f118889l = parcel.readInt();
        this.f118890m = parcel.readInt();
        this.f118891n = parcel.readInt();
    }
}
