package io.bidmachine;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"getTargetingParams", "Lio/bidmachine/TargetingParams;", "bidmachine_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BidMachineExt {
    @NotNull
    public static final TargetingParams getTargetingParams() {
        TargetingParams targetingParamsU = j2.e().u();
        Intrinsics.checkNotNullExpressionValue(targetingParamsU, "getTargetingParams(...)");
        return targetingParamsU;
    }
}
