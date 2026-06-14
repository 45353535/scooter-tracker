package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import hg.c0;
import hg.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "", "()V", "_operativeEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getOperativeEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "addOperativeEvent", "", "operativeEventRequest", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OperativeEventRepository {

    @NotNull
    private final MutableSharedFlow _operativeEvents;

    @NotNull
    private final SharedFlow operativeEvents;

    public OperativeEventRepository() {
        MutableSharedFlow mutableSharedFlowA = c0.a(10, 10, gg.a.f72766c);
        this._operativeEvents = mutableSharedFlowA;
        this.operativeEvents = i.b(mutableSharedFlowA);
    }

    public final void addOperativeEvent(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        Intrinsics.checkNotNullParameter(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.g(operativeEventRequest);
    }

    @NotNull
    public final SharedFlow getOperativeEvents() {
        return this.operativeEvents;
    }
}
