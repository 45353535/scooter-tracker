package oe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.d f96917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final se.c f96918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f96919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f96920d;

    public t0(re.d request, se.c cVar, Throwable th2, int i10) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f96917a = request;
        this.f96918b = cVar;
        this.f96919c = th2;
        this.f96920d = i10;
    }

    public final re.d a() {
        return this.f96917a;
    }

    public final int b() {
        return this.f96920d;
    }
}
