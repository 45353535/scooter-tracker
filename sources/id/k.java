package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f74570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f74571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0 f74572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f74573d;

    public k(float f10, l lVar, x0 x0Var) {
        this.f74570a = f10;
        this.f74571b = lVar;
        this.f74572c = x0Var;
        this.f74573d = (lVar instanceof w) && ((w) lVar).a().b();
    }

    public final float a() {
        return this.f74570a;
    }

    public final x0 b() {
        return this.f74572c;
    }

    public final l c() {
        return this.f74571b;
    }

    public final boolean d() {
        return this.f74573d;
    }

    public /* synthetic */ k(float f10, l lVar, x0 x0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? null : x0Var);
    }
}
