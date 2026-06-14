package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5195jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f77519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5579yl f77520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f77522d;

    public C5195jd(IHandlerExecutor iHandlerExecutor, Fd fd2, String str, SystemTimeProvider systemTimeProvider) {
        this.f77519a = iHandlerExecutor;
        this.f77520b = fd2;
        this.f77521c = str;
        this.f77522d = systemTimeProvider;
    }

    public static final void a(C5195jd c5195jd, List list) {
        Vj vj = AbstractC5452tj.f78304a;
        C5247ld c5247ld = new C5247ld(c5195jd.f77520b, c5195jd.f77521c, c5195jd.f77522d, list);
        vj.getClass();
        vj.a(new Jj(c5247ld));
    }

    public final void a(final ArrayList arrayList) {
        this.f77519a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.kq
            @Override // java.lang.Runnable
            public final void run() {
                C5195jd.a(this.f77635b, arrayList);
            }
        });
    }
}
