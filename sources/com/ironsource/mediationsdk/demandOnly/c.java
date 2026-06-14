package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.A5;
import com.ironsource.C4427m5;
import com.ironsource.K9;
import com.ironsource.R4;
import com.ironsource.T2;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, d> f43896a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private R4 f43897b;

    public c(List<NetworkSettings> list, T2 t22, String str, String str2, R4 r42) {
        String strD = IronSourceUtils.d();
        boolean zK = t22.k();
        this.f43897b = r42;
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(t22.d(), strD));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (abstractAdapterA != null) {
                    d dVar = new d(str, str2, networkSettings, t22.b(), abstractAdapterA, eVar);
                    dVar.a(zK);
                    this.f43896a.put(dVar.l(), dVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        d dVar = this.f43896a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.f43897b.a(A5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        d dVar = this.f43896a.get(str);
        if (dVar == null) {
            this.f43897b.a(A5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
            return;
        }
        dVar.a(iSDemandOnlyBannerLayout, new o.a(K9.b(C4427m5.b().c(), str2)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(String str) {
        d dVar = this.f43896a.get(str);
        if (dVar == null) {
            this.f43897b.a(A5.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
            return;
        }
        dVar.r();
    }
}
