package oe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.d f96877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final se.c f96878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f96879c;

    public r0(re.d request, se.c cVar, Throwable th2) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f96877a = request;
        this.f96878b = cVar;
        this.f96879c = th2;
    }

    public final se.c a() {
        return this.f96878b;
    }
}
