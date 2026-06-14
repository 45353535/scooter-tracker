package io.appmetrica.analytics.adrevenue.ironsource.v7.impl;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements ImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f74945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f74946b = new b();

    public c(ClientContext clientContext) {
        this.f74945a = clientContext;
    }

    public final void onImpressionSuccess(ImpressionData impressionData) {
        ModuleAdType moduleAdType;
        if (impressionData != null) {
            InternalClientModuleFacade internalClientModuleFacade = this.f74945a.getInternalClientModuleFacade();
            this.f74946b.getClass();
            String adUnit = impressionData.getAdUnit();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getRevenue().doubleValue(), 0.0d));
            Currency currency = Currency.getInstance("USD");
            if (adUnit != null) {
                switch (adUnit) {
                    case "Rewarded Video":
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case "Interstitial":
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    case "Banner":
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, impressionData.getAdNetwork(), null, null, null, impressionData.getPlacement(), impressionData.getPrecision(), new a(adUnit), true));
        }
    }
}
