package com.ironsource;

import com.ironsource.C4406l1;
import com.ironsource.InterfaceC4356i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4547t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f45478a;

    public C4547t5(@NotNull InterfaceC4476p1 analytics, @NotNull String adRequestAdId, @NotNull InterfaceC4521rd adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.f45478a = analytics;
        analytics.a(new C4406l1.s(adRequestProviderName.value()), new C4406l1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC4356i1.c.f43316a.a().a(this.f45478a);
    }

    public final void a(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4356i1.c.f43316a.a(new C4406l1.j(error.getErrorCode()), new C4406l1.k(error.getErrorMessage()), new C4406l1.f(0L)).a(this.f45478a);
    }
}
