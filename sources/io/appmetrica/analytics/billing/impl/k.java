package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements BillingInfoStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f74977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4945a f74978b;

    public k(@NotNull ProtobufStateStorage<C4945a> protobufStateStorage) {
        this.f74977a = protobufStateStorage;
        this.f74978b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    @NotNull
    public final List<BillingInfo> getBillingInfo() {
        return this.f74978b.f74958a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f74978b.f74959b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(@NotNull List<? extends BillingInfo> list, boolean z10) {
        for (BillingInfo billingInfo : list) {
        }
        C4945a c4945a = new C4945a(list, z10);
        this.f74978b = c4945a;
        this.f74977a.save(c4945a);
    }
}
