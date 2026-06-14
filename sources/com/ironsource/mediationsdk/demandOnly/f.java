package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.A5;
import com.ironsource.C4427m5;
import com.ironsource.C4462o4;
import com.ironsource.E9;
import com.ironsource.K9;
import com.ironsource.R4;
import com.ironsource.Y7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class f implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R4 f43921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, g> f43922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y7<ISDemandOnlyInterstitialListener> f43923c;

    public f(List<NetworkSettings> list, E9 e92, com.ironsource.mediationsdk.c cVar, Y7<ISDemandOnlyInterstitialListener> y72, String str, String str2, R4 r42) {
        String strD = IronSourceUtils.d();
        boolean zJ = e92.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(e92.g(), strD);
        this.f43922b = new ConcurrentHashMap<>();
        this.f43921a = r42;
        this.f43923c = y72;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (abstractAdapterA != null) {
                    g gVar = new g(str, str2, networkSettings, this.f43923c.a(networkSettings.getSubProviderId()), e92.e(), abstractAdapterA, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(zJ);
                    this.f43922b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(@NotNull h.d dVar) {
        String strE = dVar.e();
        String strB = dVar.b();
        try {
            g gVar = this.f43922b.get(strE);
            if (gVar == null) {
                this.f43921a.a(A5.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, strE);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f43923c.a(strE).onInterstitialAdLoadFailed(strE, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(strB)) {
                gVar.b();
            } else {
                gVar.a(new o.a(K9.b(C4427m5.b().c(), strB)));
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f43923c.a(strE).onInterstitialAdLoadFailed(strE, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.f43922b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.f43921a.a(A5.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.f43922b.get(str);
            if (gVar == null) {
                this.f43921a.a(A5.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f43923c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            gVar.e();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f43923c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.f43922b;
    }
}
