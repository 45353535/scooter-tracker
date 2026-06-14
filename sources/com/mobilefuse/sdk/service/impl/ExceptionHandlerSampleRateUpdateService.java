package com.mobilefuse.sdk.service.impl;

import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0010¢\u0006\u0002\b\bJ\b\u0010\t\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/service/impl/ExceptionHandlerSampleRateUpdateService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "()V", "initServiceImpl", "", "completeAction", "Lkotlin/Function2;", "", "initServiceImpl$mobilefuse_sdk_core_release", "resetImpl", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class ExceptionHandlerSampleRateUpdateService extends MobileFuseService {

    @NotNull
    public static final ExceptionHandlerSampleRateUpdateService INSTANCE = new ExceptionHandlerSampleRateUpdateService();

    private ExceptionHandlerSampleRateUpdateService() {
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull Function2<? super MobileFuseService, ? super Boolean, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        TelemetryManager.INSTANCE.updateSampleRateFromServer();
        completeAction.invoke(this, Boolean.TRUE);
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
    }
}
