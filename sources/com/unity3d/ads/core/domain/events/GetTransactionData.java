package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "purchaseDetail", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "productDetailJson", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GetTransactionData {
    @NotNull
    TransactionEventRequestOuterClass.TransactionData invoke(@NotNull PurchaseBridge purchaseDetail, @NotNull String productDetailJson);
}
