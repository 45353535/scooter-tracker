package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5188j6 extends Ug {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f77498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ah f77499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5564y6 f77500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U1 f77501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5464u6 f77502j;

    public C5188j6(@NotNull Context context, @NotNull C5334p0 c5334p0, @Nullable InterfaceC5049dl interfaceC5049dl, @NotNull Ah ah2) {
        super(c5334p0, interfaceC5049dl, ah2);
        this.f77498f = context;
        this.f77499g = ah2;
        this.f77500h = C5186j4.l().i();
        this.f77501i = C5186j4.l().f();
        this.f77502j = new C5464u6(context);
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final synchronized void a() {
        try {
            if (this.f75626c) {
                return;
            }
            this.f75626c = true;
            String strA = this.f77500h.f78574a.a();
            U1 u12 = this.f77501i;
            Context context = this.f77498f;
            u12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (Intrinsics.areEqual(strA, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f77502j.a(this.f77499g);
            } else {
                this.f75624a.c();
                this.f75626c = false;
                super.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final boolean c() {
        this.f77502j.a(this.f77499g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Ch, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.f93236a;
    }
}
