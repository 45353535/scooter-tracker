package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes12.dex */
public final class mo implements NetworkTask.ShouldTryNextHostCondition {
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition
    public final boolean shouldTryNextHost(int i10) {
        return !(i10 == 400);
    }
}
