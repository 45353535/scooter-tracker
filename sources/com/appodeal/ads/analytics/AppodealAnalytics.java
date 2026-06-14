package com.appodeal.ads.analytics;

import com.appodeal.ads.analytics.impl.l;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.GeneralParams;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.taurusx.tax.y.z.w.s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0001J'\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0096\u0001J\u001f\u0010\u000f\u001a\u00020\u00052\u0014\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u0011H\u0096\u0001J\u0017\u0010\u0014\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0096\u0001¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/analytics/AppodealAnalytics;", "Lcom/appodeal/ads/analytics/SdkAnalytics;", "<init>", "()V", "internalEvent", "", IronSourceConstants.EVENTS_PROVIDER, "Lkotlin/Function0;", "Lcom/appodeal/ads/analytics/models/Event;", s.z.f67719y, C4240b4.i.f42633j0, "", "params", "", "", "registerServices", "services", "", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "setGeneralParamsProvider", "Lcom/appodeal/ads/analytics/models/GeneralParams;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppodealAnalytics implements SdkAnalytics {
    public static final AppodealAnalytics INSTANCE = new AppodealAnalytics();
    private final /* synthetic */ l $$delegate_0 = new l();

    private AppodealAnalytics() {
    }

    @Override // com.appodeal.ads.analytics.SdkAnalytics
    public void internalEvent(Function0<? extends Event> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.$$delegate_0.internalEvent(provider);
    }

    @Override // com.appodeal.ads.analytics.SdkAnalytics
    public void log(String eventName, Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        this.$$delegate_0.log(eventName, params);
    }

    @Override // com.appodeal.ads.analytics.SdkAnalytics
    public void registerServices(List<? extends Service<? extends ServiceOptions>> services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.$$delegate_0.registerServices(services);
    }

    @Override // com.appodeal.ads.analytics.SdkAnalytics
    public void setGeneralParamsProvider(Function0<GeneralParams> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        l lVar = this.$$delegate_0;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        lVar.f12707c = params;
    }
}
