package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5044dg implements InterfaceC4992bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5198jg f77018a;

    public C5044dg(C5198jg c5198jg) {
        this.f77018a = c5198jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4992bg
    @WorkerThread
    public final void a() {
        C5198jg c5198jg = this.f77018a;
        Ga ga2 = c5198jg.f77524b;
        C5018cg c5018cg = new C5018cg(c5198jg);
        ga2.getClass();
        try {
            FutureTask futureTask = new FutureTask(new Fa(ga2));
            C5468ua.H.f78355d.f77921a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR" + TokenBuilder.TOKEN_DELIMITER + Gd.f75819a.incrementAndGet()).start();
            C5424sg c5424sg = (C5424sg) futureTask.get(5L, TimeUnit.SECONDS);
            no.a(ga2.f75818b);
            C5198jg.a(c5198jg, c5424sg, C5198jg.a(c5198jg));
        } catch (Throwable th2) {
            try {
                c5018cg.a(th2);
            } finally {
                no.a(ga2.f75818b);
            }
        }
    }
}
