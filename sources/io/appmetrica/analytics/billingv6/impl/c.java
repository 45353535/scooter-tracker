package io.appmetrica.analytics.billingv6.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements BillingInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f75064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f75066c;

    public c(@NotNull BillingInfoStorage billingInfoStorage) {
        this.f75064a = billingInfoStorage;
        this.f75065b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f75066c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    @Nullable
    public final BillingInfo get(@NotNull String str) {
        return (BillingInfo) this.f75066c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final boolean isFirstInappCheckOccurred() {
        return this.f75065b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void markFirstInappCheckOccurred() {
        if (this.f75065b) {
            return;
        }
        this.f75065b = true;
        this.f75064a.saveInfo(CollectionsKt.toList(this.f75066c.values()), this.f75065b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void update(@NotNull Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f75066c.put(billingInfo.productId, billingInfo);
        }
        this.f75064a.saveInfo(CollectionsKt.toList(this.f75066c.values()), this.f75065b);
    }
}
