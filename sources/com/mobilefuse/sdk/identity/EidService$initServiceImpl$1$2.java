package com.mobilefuse.sdk.identity;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidSdkData;", "p1", "", "Lcom/mobilefuse/sdk/identity/IdentifierUpdateSignal;", "p2", "", "invoke", "(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class EidService$initServiceImpl$1$2 extends y implements Function2<EidSdkData, Set<? extends IdentifierUpdateSignal>, Unit> {
    EidService$initServiceImpl$1$2(EidService eidService) {
        super(2, eidService, EidService.class, "onEidRequest", "onEidRequest$mobilefuse_sdk_core_release(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/util/Set;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(EidSdkData eidSdkData, Set<? extends IdentifierUpdateSignal> set) {
        invoke2(eidSdkData, set);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull EidSdkData p12, @NotNull Set<? extends IdentifierUpdateSignal> p22) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((EidService) this.receiver).onEidRequest$mobilefuse_sdk_core_release(p12, p22);
    }
}
