package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5476ui implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSendingRestrictionController f78391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78392b = "data restriction based";

    public C5476ui(@NotNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.f78391a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f78391a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f78392b;
    }
}
