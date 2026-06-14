package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"fromPurchaseState", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "state", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransactionStateExtensionsKt {
    @NotNull
    public static final TransactionEventRequestOuterClass.TransactionState fromPurchaseState(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED : TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PENDING : TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_UNSPECIFIED : TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PURCHASED;
    }
}
