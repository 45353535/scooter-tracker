package y;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import b0.b;
import eg.o0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineDispatcher f108210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineDispatcher f108211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineDispatcher f108212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineDispatcher f108213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b.a f108214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z.e f108215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bitmap.Config f108216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f108217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f108218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Drawable f108219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f108220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Drawable f108221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f108222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f108223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f108224o;

    public b(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, b.a aVar, z.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, a aVar2, a aVar3, a aVar4) {
        this.f108210a = coroutineDispatcher;
        this.f108211b = coroutineDispatcher2;
        this.f108212c = coroutineDispatcher3;
        this.f108213d = coroutineDispatcher4;
        this.f108214e = aVar;
        this.f108215f = eVar;
        this.f108216g = config;
        this.f108217h = z10;
        this.f108218i = z11;
        this.f108219j = drawable;
        this.f108220k = drawable2;
        this.f108221l = drawable3;
        this.f108222m = aVar2;
        this.f108223n = aVar3;
        this.f108224o = aVar4;
    }

    public final boolean a() {
        return this.f108217h;
    }

    public final boolean b() {
        return this.f108218i;
    }

    public final Bitmap.Config c() {
        return this.f108216g;
    }

    public final CoroutineDispatcher d() {
        return this.f108212c;
    }

    public final a e() {
        return this.f108223n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f108210a, bVar.f108210a) && Intrinsics.areEqual(this.f108211b, bVar.f108211b) && Intrinsics.areEqual(this.f108212c, bVar.f108212c) && Intrinsics.areEqual(this.f108213d, bVar.f108213d) && Intrinsics.areEqual(this.f108214e, bVar.f108214e) && this.f108215f == bVar.f108215f && this.f108216g == bVar.f108216g && this.f108217h == bVar.f108217h && this.f108218i == bVar.f108218i && Intrinsics.areEqual(this.f108219j, bVar.f108219j) && Intrinsics.areEqual(this.f108220k, bVar.f108220k) && Intrinsics.areEqual(this.f108221l, bVar.f108221l) && this.f108222m == bVar.f108222m && this.f108223n == bVar.f108223n && this.f108224o == bVar.f108224o;
    }

    public final Drawable f() {
        return this.f108220k;
    }

    public final Drawable g() {
        return this.f108221l;
    }

    public final CoroutineDispatcher h() {
        return this.f108211b;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f108210a.hashCode() * 31) + this.f108211b.hashCode()) * 31) + this.f108212c.hashCode()) * 31) + this.f108213d.hashCode()) * 31) + this.f108214e.hashCode()) * 31) + this.f108215f.hashCode()) * 31) + this.f108216g.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f108217h)) * 31) + androidx.compose.foundation.c.a(this.f108218i)) * 31;
        Drawable drawable = this.f108219j;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f108220k;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f108221l;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f108222m.hashCode()) * 31) + this.f108223n.hashCode()) * 31) + this.f108224o.hashCode();
    }

    public final CoroutineDispatcher i() {
        return this.f108210a;
    }

    public final a j() {
        return this.f108222m;
    }

    public final a k() {
        return this.f108224o;
    }

    public final Drawable l() {
        return this.f108219j;
    }

    public final z.e m() {
        return this.f108215f;
    }

    public final CoroutineDispatcher n() {
        return this.f108213d;
    }

    public final b.a o() {
        return this.f108214e;
    }

    public /* synthetic */ b(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, b.a aVar, z.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, a aVar2, a aVar3, a aVar4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? o0.c().w() : coroutineDispatcher, (i10 & 2) != 0 ? o0.b() : coroutineDispatcher2, (i10 & 4) != 0 ? o0.b() : coroutineDispatcher3, (i10 & 8) != 0 ? o0.b() : coroutineDispatcher4, (i10 & 16) != 0 ? b.a.f5782b : aVar, (i10 & 32) != 0 ? z.e.AUTOMATIC : eVar, (i10 & 64) != 0 ? c0.i.f() : config, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : drawable, (i10 & 1024) != 0 ? null : drawable2, (i10 & 2048) == 0 ? drawable3 : null, (i10 & 4096) != 0 ? a.ENABLED : aVar2, (i10 & 8192) != 0 ? a.ENABLED : aVar3, (i10 & 16384) != 0 ? a.ENABLED : aVar4);
    }
}
