package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5261m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5296nc f77730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f77731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77733d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f77734e = new Runnable() { // from class: io.appmetrica.analytics.impl.mq
        @Override // java.lang.Runnable
        public final void run() {
            C5261m2.a(this.f77796b);
        }
    };

    public C5261m2(C5296nc c5296nc, IHandlerExecutor iHandlerExecutor, long j10) {
        this.f77730a = c5296nc;
        this.f77731b = iHandlerExecutor;
        this.f77732c = j10;
    }

    public static final void a(C5261m2 c5261m2) {
        C5321oc c5321oc = c5261m2.f77730a.f77834a;
        Bi bi2 = c5321oc.f76285h;
        bi2.f75594c.a(c5321oc.f76279b.f76217a);
    }
}
