package yads;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f110138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f110140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f110141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f110142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f110143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f110144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f110145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f110146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f110147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f110148k;

    public e03(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f110138a = j10;
        this.f110139b = z10;
        this.f110140c = z11;
        this.f110141d = z12;
        this.f110143f = DesugarCollections.unmodifiableList(arrayList);
        this.f110142e = j11;
        this.f110144g = z13;
        this.f110145h = j12;
        this.f110146i = i10;
        this.f110147j = i11;
        this.f110148k = i12;
    }

    public static e03 a(Parcel parcel) {
        return new e03(parcel);
    }

    public e03(Parcel parcel) {
        this.f110138a = parcel.readLong();
        this.f110139b = parcel.readByte() == 1;
        this.f110140c = parcel.readByte() == 1;
        this.f110141d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(d03.a(parcel));
        }
        this.f110143f = DesugarCollections.unmodifiableList(arrayList);
        this.f110142e = parcel.readLong();
        this.f110144g = parcel.readByte() == 1;
        this.f110145h = parcel.readLong();
        this.f110146i = parcel.readInt();
        this.f110147j = parcel.readInt();
        this.f110148k = parcel.readInt();
    }
}
