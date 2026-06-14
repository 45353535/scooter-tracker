package y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import hh.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f108299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap.Config f108300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorSpace f108301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z.i f108302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z.h f108303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f108304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f108305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f108306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f108307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f108308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final q f108309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n f108310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f108311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f108312n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f108313o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, z.i iVar, z.h hVar, boolean z10, boolean z11, boolean z12, String str, t tVar, q qVar, n nVar, a aVar, a aVar2, a aVar3) {
        this.f108299a = context;
        this.f108300b = config;
        this.f108301c = colorSpace;
        this.f108302d = iVar;
        this.f108303e = hVar;
        this.f108304f = z10;
        this.f108305g = z11;
        this.f108306h = z12;
        this.f108307i = str;
        this.f108308j = tVar;
        this.f108309k = qVar;
        this.f108310l = nVar;
        this.f108311m = aVar;
        this.f108312n = aVar2;
        this.f108313o = aVar3;
    }

    public final m a(Context context, Bitmap.Config config, ColorSpace colorSpace, z.i iVar, z.h hVar, boolean z10, boolean z11, boolean z12, String str, t tVar, q qVar, n nVar, a aVar, a aVar2, a aVar3) {
        return new m(context, config, colorSpace, iVar, hVar, z10, z11, z12, str, tVar, qVar, nVar, aVar, aVar2, aVar3);
    }

    public final boolean c() {
        return this.f108304f;
    }

    public final boolean d() {
        return this.f108305g;
    }

    public final ColorSpace e() {
        return this.f108301c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Intrinsics.areEqual(this.f108299a, mVar.f108299a) && this.f108300b == mVar.f108300b) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f108301c, mVar.f108301c)) && Intrinsics.areEqual(this.f108302d, mVar.f108302d) && this.f108303e == mVar.f108303e && this.f108304f == mVar.f108304f && this.f108305g == mVar.f108305g && this.f108306h == mVar.f108306h && Intrinsics.areEqual(this.f108307i, mVar.f108307i) && Intrinsics.areEqual(this.f108308j, mVar.f108308j) && Intrinsics.areEqual(this.f108309k, mVar.f108309k) && Intrinsics.areEqual(this.f108310l, mVar.f108310l) && this.f108311m == mVar.f108311m && this.f108312n == mVar.f108312n && this.f108313o == mVar.f108313o;
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.f108300b;
    }

    public final Context g() {
        return this.f108299a;
    }

    public final String h() {
        return this.f108307i;
    }

    public int hashCode() {
        int iHashCode = ((this.f108299a.hashCode() * 31) + this.f108300b.hashCode()) * 31;
        ColorSpace colorSpace = this.f108301c;
        int iHashCode2 = (((((((((((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f108302d.hashCode()) * 31) + this.f108303e.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f108304f)) * 31) + androidx.compose.foundation.c.a(this.f108305g)) * 31) + androidx.compose.foundation.c.a(this.f108306h)) * 31;
        String str = this.f108307i;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f108308j.hashCode()) * 31) + this.f108309k.hashCode()) * 31) + this.f108310l.hashCode()) * 31) + this.f108311m.hashCode()) * 31) + this.f108312n.hashCode()) * 31) + this.f108313o.hashCode();
    }

    public final a i() {
        return this.f108312n;
    }

    public final t j() {
        return this.f108308j;
    }

    public final a k() {
        return this.f108313o;
    }

    public final boolean l() {
        return this.f108306h;
    }

    public final z.h m() {
        return this.f108303e;
    }

    public final z.i n() {
        return this.f108302d;
    }

    public final q o() {
        return this.f108309k;
    }
}
