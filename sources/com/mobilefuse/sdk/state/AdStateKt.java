package com.mobilefuse.sdk.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"hasAd", "", "Lcom/mobilefuse/sdk/state/Stateful;", "Lcom/mobilefuse/sdk/state/AdState;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class AdStateKt {
    public static final boolean hasAd(@NotNull Stateful<AdState> hasAd) {
        Intrinsics.checkNotNullParameter(hasAd, "$this$hasAd");
        return hasAd.stateIsNot(AdState.IDLE, AdState.NOT_FILLED, AdState.CLOSED, AdState.DESTROYED);
    }
}
