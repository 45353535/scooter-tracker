package io.appmetrica.analytics.impl;

import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class Ug extends Ch {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ah f76564e;

    public Ug(@NotNull C5334p0 c5334p0, @Nullable InterfaceC5049dl interfaceC5049dl, @NotNull Ah ah2) {
        super(c5334p0, interfaceC5049dl);
        this.f76564e = ah2;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(@Nullable Throwable th2) {
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        Ah ah2 = this.f76564e;
        iAppMetricaService.reportData(ah2.f75525c, ah2.f75523a.d(ah2.f75527e.c()));
    }
}
