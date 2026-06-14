package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.a.j;
import sg.bigo.ads.common.l;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements sg.bigo.ads.common.f, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103170a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103171b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103172c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f103173d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f103174e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f103175f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f103176g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sg.bigo.ads.api.a.h f103177h;

    public d(sg.bigo.ads.api.a.h hVar) {
        this.f103177h = hVar;
    }

    @Override // sg.bigo.ads.common.l
    public final int a() {
        return this.f103170a;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f103170a = n.a(parcel, 3);
        this.f103171b = n.a(parcel, 2);
        this.f103172c = n.a(parcel, 12);
        this.f103173d = n.a(parcel, 3);
        this.f103174e = n.a(parcel, 3);
        this.f103175f = n.a(parcel, 10);
        this.f103176g = n.a(parcel, 5);
    }

    @Override // sg.bigo.ads.common.l
    public final int c() {
        return this.f103171b;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean d() {
        return a(13);
    }

    @Override // sg.bigo.ads.common.l
    public final int e() {
        return this.f103172c;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean f() {
        return a(10);
    }

    @Override // sg.bigo.ads.common.l
    public final int g() {
        return this.f103173d;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean h() {
        return a(11);
    }

    @Override // sg.bigo.ads.common.l
    public final int i() {
        return this.f103174e;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean j() {
        return a(12);
    }

    @Override // sg.bigo.ads.common.l
    public final int k() {
        return this.f103175f;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean l() {
        return a(11);
    }

    @Override // sg.bigo.ads.common.l
    public final int m() {
        return this.f103176g;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean n() {
        return a(12);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean o() {
        return a(18);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean p() {
        return a(13);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeInt(this.f103170a);
            parcel.writeInt(this.f103171b);
            parcel.writeInt(this.f103172c);
            parcel.writeInt(this.f103173d);
            parcel.writeInt(this.f103174e);
            parcel.writeInt(this.f103175f);
            parcel.writeInt(this.f103176g);
        }
    }

    @Override // sg.bigo.ads.common.l
    public final boolean b() {
        return a(13);
    }

    private boolean a(int i10) {
        sg.bigo.ads.api.a.h hVar = this.f103177h;
        j jVarN = hVar != null ? hVar.n() : null;
        if (jVarN != null) {
            return jVarN.a(i10);
        }
        return false;
    }
}
