package y;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f108240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f108241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f108242c;

    public e(Drawable drawable, h hVar, Throwable th2) {
        super(null);
        this.f108240a = drawable;
        this.f108241b = hVar;
        this.f108242c = th2;
    }

    @Override // y.i
    public Drawable a() {
        return this.f108240a;
    }

    @Override // y.i
    public h b() {
        return this.f108241b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(a(), eVar.a()) && Intrinsics.areEqual(b(), eVar.b()) && Intrinsics.areEqual(this.f108242c, eVar.f108242c);
    }

    public int hashCode() {
        Drawable drawableA = a();
        return ((((drawableA != null ? drawableA.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.f108242c.hashCode();
    }
}
