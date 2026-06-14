package com.appodeal.ads.analytics;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J(\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nH&¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/analytics/SdkAnalytics;", "", "registerServices", "", "services", "", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "setGeneralParamsProvider", "params", "Lkotlin/Function0;", "Lcom/appodeal/ads/analytics/models/GeneralParams;", s.z.f67719y, C4240b4.i.f42633j0, "", "", "internalEvent", IronSourceConstants.EVENTS_PROVIDER, "Lcom/appodeal/ads/analytics/models/Event;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SdkAnalytics {
    void internalEvent(Function0<? extends Event> provider);

    void log(String eventName, Map<String, ? extends Object> params);

    void registerServices(List<? extends Service<? extends ServiceOptions>> services);

    void setGeneralParamsProvider(Function0<GeneralParams> params);
}
