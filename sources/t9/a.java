package t9;

import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f104973b;

    public final void a(int i10) {
        this.f104973b = i10 | this.f104973b;
    }

    public void c() {
        this.f104973b = 0;
    }

    protected final boolean d(int i10) {
        return (this.f104973b & i10) == i10;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(134217728);
    }

    public final boolean h() {
        return d(1);
    }

    public final boolean i() {
        return d(536870912);
    }

    public final boolean j() {
        return d(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    public final void k(int i10) {
        this.f104973b = i10;
    }
}
