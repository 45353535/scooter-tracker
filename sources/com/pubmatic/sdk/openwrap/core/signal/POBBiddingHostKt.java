package com.pubmatic.sdk.openwrap.core.signal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isAdMob", "", "Lcom/pubmatic/sdk/openwrap/core/signal/POBBiddingHost;", "openwrapcore_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public abstract class POBBiddingHostKt {
    public static final boolean isAdMob(@NotNull POBBiddingHost pOBBiddingHost) {
        Intrinsics.checkNotNullParameter(pOBBiddingHost, "<this>");
        return pOBBiddingHost == POBBiddingHost.ADMOB;
    }
}
