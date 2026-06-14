package y;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f108321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f108322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q.f f108323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MemoryCache.Key f108324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f108325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f108326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f108327g;

    public p(Drawable drawable, h hVar, q.f fVar, MemoryCache.Key key, String str, boolean z10, boolean z11) {
        super(null);
        this.f108321a = drawable;
        this.f108322b = hVar;
        this.f108323c = fVar;
        this.f108324d = key;
        this.f108325e = str;
        this.f108326f = z10;
        this.f108327g = z11;
    }

    @Override // y.i
    public Drawable a() {
        return this.f108321a;
    }

    @Override // y.i
    public h b() {
        return this.f108322b;
    }

    public final q.f c() {
        return this.f108323c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(a(), pVar.a()) && Intrinsics.areEqual(b(), pVar.b()) && this.f108323c == pVar.f108323c && Intrinsics.areEqual(this.f108324d, pVar.f108324d) && Intrinsics.areEqual(this.f108325e, pVar.f108325e) && this.f108326f == pVar.f108326f && this.f108327g == pVar.f108327g;
    }

    public int hashCode() {
        int iHashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f108323c.hashCode()) * 31;
        MemoryCache.Key key = this.f108324d;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f108325e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + androidx.compose.foundation.c.a(this.f108326f)) * 31) + androidx.compose.foundation.c.a(this.f108327g);
    }
}
