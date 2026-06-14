package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5300ng implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f77837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f77838b;

    public C5300ng(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor) {
        this.f77837a = iCommonExecutor;
        this.f77838b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC5549xg interfaceC5549xg, Throwable th2) {
        interfaceC5549xg.a(th2);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(@NotNull InterfaceC5549xg interfaceC5549xg) throws Throwable {
        this.f77838b.startConnection(new C5275mg(this, interfaceC5549xg));
    }

    public final void a(final InterfaceC5549xg interfaceC5549xg, final Throwable th2) {
        this.f77837a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.oq
            @Override // java.lang.Runnable
            public final void run() {
                C5300ng.b(interfaceC5549xg, th2);
            }
        });
    }
}
