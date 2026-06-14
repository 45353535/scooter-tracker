package io.appmetrica.analytics.billingv6.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements UpdatePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f75100a;

    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy
    @WorkerThread
    @NotNull
    public final Map<String, BillingInfo> getBillingInfoToUpdate(@NotNull BillingConfig billingConfig, @NotNull Map<String, ? extends BillingInfo> map, @NotNull BillingInfoManager billingInfoManager) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends BillingInfo> entry : map.entrySet()) {
            BillingInfo value = entry.getValue();
            if (value.type != ProductType.INAPP || billingInfoManager.isFirstInappCheckOccurred()) {
                BillingInfo billingInfo = billingInfoManager.get(value.productId);
                if (((billingInfo == null || !Intrinsics.areEqual(billingInfo.purchaseToken, value.purchaseToken)) && (this.f75100a.currentTimeMillis() - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds) || value.type == ProductType.SUBS)) || (billingInfo != null && value.type == ProductType.SUBS && this.f75100a.currentTimeMillis() - billingInfo.sendTime >= TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (this.f75100a.currentTimeMillis() - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public o(@NotNull SystemTimeProvider systemTimeProvider) {
        this.f75100a = systemTimeProvider;
    }

    public /* synthetic */ o(SystemTimeProvider systemTimeProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new SystemTimeProvider() : systemTimeProvider);
    }
}
