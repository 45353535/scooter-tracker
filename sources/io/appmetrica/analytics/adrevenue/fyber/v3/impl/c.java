package io.appmetrica.analytics.adrevenue.fyber.v3.impl;

import androidx.annotation.NonNull;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.PlacementType;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements ModuleAdRevenueProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f74943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClientContext f74944b;

    public c(@NonNull b bVar, @NonNull ClientContext clientContext) {
        this.f74943a = bVar;
        this.f74944b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NonNull
    public final String getDescription() {
        return "Fyber";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        ModuleAdType moduleAdType;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, ImpressionData.class)) {
            return false;
        }
        ImpressionData impressionData = (ImpressionData) objArr[0];
        InternalClientModuleFacade internalClientModuleFacade = this.f74944b.getInternalClientModuleFacade();
        this.f74943a.getClass();
        PlacementType placementType = impressionData.getPlacementType();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getNetPayout(), 0.0d));
        Currency currency = Currency.getInstance(impressionData.getCurrency());
        if (placementType == null) {
            moduleAdType = null;
        } else {
            int i10 = a.f74942a[placementType.ordinal()];
            moduleAdType = i10 != 1 ? i10 != 2 ? i10 != 3 ? ModuleAdType.OTHER : ModuleAdType.INTERSTITIAL : ModuleAdType.REWARDED : ModuleAdType.BANNER;
        }
        String demandSource = impressionData.getDemandSource();
        String creativeId = impressionData.getCreativeId();
        String string = impressionData.getPriceAccuracy().toString();
        HashMap map = new HashMap();
        map.put("source", "fyber");
        map.put(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-fyber-v3");
        map.put(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, placementType == null ? "null" : placementType.name());
        internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, demandSource, creativeId, null, null, null, string, map, false));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from Fyber was reported", new Object[0]);
        return true;
    }
}
