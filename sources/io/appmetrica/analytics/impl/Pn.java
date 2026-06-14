package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Pn extends Ch {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f76269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f76270f;

    public Pn(@NotNull C5334p0 c5334p0, @Nullable InterfaceC5049dl interfaceC5049dl, int i10, @NotNull Bundle bundle) {
        super(c5334p0, interfaceC5049dl);
        this.f76269e = i10;
        this.f76270f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.f76269e, this.f76270f);
    }
}
