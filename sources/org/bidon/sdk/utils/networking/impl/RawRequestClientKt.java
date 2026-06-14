package org.bidon.sdk.utils.networking.impl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"DefaultConnectTimeoutMs", "", "BufferSize", "EndOfStream", "NoResponseCode", "TAG", "", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RawRequestClientKt {
    private static final int BufferSize = 1024;
    private static final int DefaultConnectTimeoutMs = 40000;
    public static final int EndOfStream = -1;
    public static final int NoResponseCode = -1;

    @NotNull
    private static final String TAG = "RawRequestClient";
}
