package q;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f98571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f98572b;

    public g(Drawable drawable, boolean z10) {
        this.f98571a = drawable;
        this.f98572b = z10;
    }

    public final Drawable a() {
        return this.f98571a;
    }

    public final boolean b() {
        return this.f98572b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f98571a, gVar.f98571a) && this.f98572b == gVar.f98572b;
    }

    public int hashCode() {
        return (this.f98571a.hashCode() * 31) + androidx.compose.foundation.c.a(this.f98572b);
    }
}
