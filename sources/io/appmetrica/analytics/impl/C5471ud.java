package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5471ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5533x0 f78378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5272md f78379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd f78380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f78381d;

    public C5471ud() {
        C5533x0 c5533x0D = C5186j4.l().d();
        this.f78378a = c5533x0D;
        this.f78379b = new C5272md(c5533x0D);
        this.f78380c = new Bd();
        this.f78381d = C5186j4.l().g().a();
    }

    public static final Pa a(C5471ud c5471ud) {
        c5471ud.f78378a.getClass();
        C5508w0 c5508w0 = C5508w0.f78473e;
        Intrinsics.checkNotNull(c5508w0);
        C5371qc c5371qcI = c5508w0.f().i();
        Intrinsics.checkNotNull(c5371qcI);
        return c5371qcI.f78069a;
    }
}
