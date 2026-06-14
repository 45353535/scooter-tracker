package y;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import b0.b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lifecycle f108225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z.j f108226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z.h f108227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineDispatcher f108228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CoroutineDispatcher f108229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CoroutineDispatcher f108230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineDispatcher f108231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b.a f108232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z.e f108233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Bitmap.Config f108234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Boolean f108235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Boolean f108236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f108237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f108238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f108239o;

    public c(Lifecycle lifecycle, z.j jVar, z.h hVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, b.a aVar, z.e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, a aVar2, a aVar3, a aVar4) {
        this.f108225a = lifecycle;
        this.f108226b = jVar;
        this.f108227c = hVar;
        this.f108228d = coroutineDispatcher;
        this.f108229e = coroutineDispatcher2;
        this.f108230f = coroutineDispatcher3;
        this.f108231g = coroutineDispatcher4;
        this.f108232h = aVar;
        this.f108233i = eVar;
        this.f108234j = config;
        this.f108235k = bool;
        this.f108236l = bool2;
        this.f108237m = aVar2;
        this.f108238n = aVar3;
        this.f108239o = aVar4;
    }

    public final Boolean a() {
        return this.f108235k;
    }

    public final Boolean b() {
        return this.f108236l;
    }

    public final Bitmap.Config c() {
        return this.f108234j;
    }

    public final CoroutineDispatcher d() {
        return this.f108230f;
    }

    public final a e() {
        return this.f108238n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f108225a, cVar.f108225a) && Intrinsics.areEqual(this.f108226b, cVar.f108226b) && this.f108227c == cVar.f108227c && Intrinsics.areEqual(this.f108228d, cVar.f108228d) && Intrinsics.areEqual(this.f108229e, cVar.f108229e) && Intrinsics.areEqual(this.f108230f, cVar.f108230f) && Intrinsics.areEqual(this.f108231g, cVar.f108231g) && Intrinsics.areEqual(this.f108232h, cVar.f108232h) && this.f108233i == cVar.f108233i && this.f108234j == cVar.f108234j && Intrinsics.areEqual(this.f108235k, cVar.f108235k) && Intrinsics.areEqual(this.f108236l, cVar.f108236l) && this.f108237m == cVar.f108237m && this.f108238n == cVar.f108238n && this.f108239o == cVar.f108239o;
    }

    public final CoroutineDispatcher f() {
        return this.f108229e;
    }

    public final CoroutineDispatcher g() {
        return this.f108228d;
    }

    public final Lifecycle h() {
        return this.f108225a;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.f108225a;
        int iHashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        z.j jVar = this.f108226b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        z.h hVar = this.f108227c;
        int iHashCode3 = (iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f108228d;
        int iHashCode4 = (iHashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.f108229e;
        int iHashCode5 = (iHashCode4 + (coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f108230f;
        int iHashCode6 = (iHashCode5 + (coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.f108231g;
        int iHashCode7 = (iHashCode6 + (coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0)) * 31;
        b.a aVar = this.f108232h;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        z.e eVar = this.f108233i;
        int iHashCode9 = (iHashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f108234j;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f108235k;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f108236l;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        a aVar2 = this.f108237m;
        int iHashCode13 = (iHashCode12 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a aVar3 = this.f108238n;
        int iHashCode14 = (iHashCode13 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a aVar4 = this.f108239o;
        return iHashCode14 + (aVar4 != null ? aVar4.hashCode() : 0);
    }

    public final a i() {
        return this.f108237m;
    }

    public final a j() {
        return this.f108239o;
    }

    public final z.e k() {
        return this.f108233i;
    }

    public final z.h l() {
        return this.f108227c;
    }

    public final z.j m() {
        return this.f108226b;
    }

    public final CoroutineDispatcher n() {
        return this.f108231g;
    }

    public final b.a o() {
        return this.f108232h;
    }
}
