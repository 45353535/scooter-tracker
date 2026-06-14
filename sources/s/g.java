package s;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f99510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f99511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q.f f99512c;

    public g(Drawable drawable, boolean z10, q.f fVar) {
        super(null);
        this.f99510a = drawable;
        this.f99511b = z10;
        this.f99512c = fVar;
    }

    public final q.f a() {
        return this.f99512c;
    }

    public final Drawable b() {
        return this.f99510a;
    }

    public final boolean c() {
        return this.f99511b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f99510a, gVar.f99510a) && this.f99511b == gVar.f99511b && this.f99512c == gVar.f99512c;
    }

    public int hashCode() {
        return (((this.f99510a.hashCode() * 31) + androidx.compose.foundation.c.a(this.f99511b)) * 31) + this.f99512c.hashCode();
    }
}
