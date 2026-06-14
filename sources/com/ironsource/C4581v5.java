package com.ironsource;

import com.ironsource.C4406l1;
import com.ironsource.InterfaceC4356i1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4581v5 implements InterfaceC4655zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f45618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4273d3 f45619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f45620c;

    public C4581v5(@NotNull IronSourceError error, @NotNull C4273d3 adLoadTaskListener, @NotNull InterfaceC4476p1 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f45618a = error;
        this.f45619b = adLoadTaskListener;
        this.f45620c = analytics;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f45618a;
    }

    @Override // com.ironsource.InterfaceC4655zb
    public void start() {
        InterfaceC4356i1.c.a aVar = InterfaceC4356i1.c.f43316a;
        aVar.a().a(this.f45620c);
        aVar.a(new C4406l1.j(this.f45618a.getErrorCode()), new C4406l1.k(this.f45618a.getErrorMessage()), new C4406l1.f(0L)).a(this.f45620c);
        this.f45619b.b(this.f45618a);
    }
}
