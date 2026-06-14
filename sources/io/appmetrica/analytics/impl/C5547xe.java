package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5547xe extends Ch {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Gf f78557e;

    public C5547xe(@NotNull C5334p0 c5334p0, @Nullable InterfaceC5049dl interfaceC5049dl, @NotNull Gf gf2) {
        super(c5334p0, interfaceC5049dl);
        this.f78557e = gf2;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Gf gf2 = this.f78557e;
        synchronized (gf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf2);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
