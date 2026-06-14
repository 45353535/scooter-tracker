package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.WinningBidInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"winningBidInfo", "Lcom/mobilefuse/sdk/WinningBidInfo;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "getWinningBidInfo", "(Lcom/mobilefuse/sdk/network/model/MfxBidResponse;)Lcom/mobilefuse/sdk/WinningBidInfo;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MfxBidResponseToWinningBidInfoKt {
    @NotNull
    public static final WinningBidInfo getWinningBidInfo(@NotNull MfxBidResponse winningBidInfo) {
        Intrinsics.checkNotNullParameter(winningBidInfo, "$this$winningBidInfo");
        return new WinningBidInfo((float) winningBidInfo.getCpm(), winningBidInfo.getCrid(), null, 4, null);
    }
}
