package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e0 {
    public static final d0 a(String adUnitId, MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        return new d0(new MolocoAdError("Moloco", adUnitId, errorType, null, 8, null), subErrorType);
    }
}
