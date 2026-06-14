package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.A5;
import com.ironsource.C4427m5;
import com.ironsource.C4462o4;
import com.ironsource.K9;
import com.ironsource.R4;
import com.ironsource.Rd;
import com.ironsource.Y7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class k implements i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R4 f43959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f43960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y7<ISDemandOnlyRewardedVideoListener> f43961c;

    public k(List<NetworkSettings> list, Rd rd2, com.ironsource.mediationsdk.c cVar, Y7<ISDemandOnlyRewardedVideoListener> y72, String str, String str2, R4 r42) {
        String strD = IronSourceUtils.d();
        boolean zD = rd2.d();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(rd2.k(), strD);
        this.f43960b = new ConcurrentHashMap<>();
        this.f43959a = r42;
        this.f43961c = y72;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (abstractAdapterA != null) {
                    l lVar = new l(str, str2, networkSettings, this.f43961c.a(networkSettings.getSubProviderId()), rd2.i(), abstractAdapterA, new com.ironsource.mediationsdk.e(fVar));
                    lVar.a(zD);
                    this.f43960b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(@NotNull h.d dVar) {
        String strE = dVar.e();
        try {
            l lVar = this.f43960b.get(strE);
            if (lVar == null) {
                this.f43959a.a(A5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_LOAD, strE);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f43961c.a(strE).onRewardedVideoAdLoadFailed(strE, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (dVar.c()) {
                lVar.b(new o.a(K9.b(C4427m5.b().c(), dVar.b())));
            } else {
                lVar.c();
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f43961c.a(strE).onRewardedVideoAdLoadFailed(strE, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(String str) {
        try {
            l lVar = this.f43960b.get(str);
            if (lVar != null) {
                lVar.d();
                return;
            }
            this.f43959a.a(A5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_SHOW, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.f43961c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f43961c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(String str) {
        l lVar = this.f43960b.get(str);
        if (lVar == null) {
            this.f43959a.a(A5.RV_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
            return false;
        }
        return lVar.a();
    }

    public ConcurrentHashMap<String, l> a() {
        return this.f43960b;
    }
}
