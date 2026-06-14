package com.mobilefuse.sdk.telemetry.metricslogging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/DefaultMetricIdGenerator;", "", "()V", "nextId", "", "getNextId", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class DefaultMetricIdGenerator {

    @NotNull
    public static final DefaultMetricIdGenerator INSTANCE = new DefaultMetricIdGenerator();
    private static int nextId = 1;

    private DefaultMetricIdGenerator() {
    }

    public final int getNextId() {
        int i10 = nextId;
        nextId = i10 + 1;
        return i10;
    }
}
