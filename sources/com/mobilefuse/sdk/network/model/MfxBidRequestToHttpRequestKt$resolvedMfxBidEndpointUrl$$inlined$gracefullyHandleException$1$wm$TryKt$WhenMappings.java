package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3}, xi = 128)
public final /* synthetic */ class MfxBidRequestToHttpRequestKt$resolvedMfxBidEndpointUrl$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ExceptionHandlingStrategy.values().length];
        $EnumSwitchMapping$1 = iArr;
        iArr[ExceptionHandlingStrategy.LogAndIgnore.ordinal()] = 1;
        iArr[ExceptionHandlingStrategy.Ignore.ordinal()] = 2;
    }
}
