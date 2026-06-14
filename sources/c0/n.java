package c0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q.l f6451e;

    public n(boolean z10, boolean z11, boolean z12, int i10, q.l lVar) {
        this.f6447a = z10;
        this.f6448b = z11;
        this.f6449c = z12;
        this.f6450d = i10;
        this.f6451e = lVar;
    }

    public final boolean a() {
        return this.f6447a;
    }

    public final q.l b() {
        return this.f6451e;
    }

    public final int c() {
        return this.f6450d;
    }

    public final boolean d() {
        return this.f6448b;
    }

    public final boolean e() {
        return this.f6449c;
    }

    public /* synthetic */ n(boolean z10, boolean z11, boolean z12, int i10, q.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? 4 : i10, (i11 & 16) != 0 ? q.l.RESPECT_PERFORMANCE : lVar);
    }
}
