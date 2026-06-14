package com.mobilefuse.sdk.identity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class EidService$initServiceImpl$1$3 extends y implements Function0<Unit> {
    EidService$initServiceImpl$1$3(EidService eidService) {
        super(0, eidService, EidService.class, "onEidRefreshTimeout", "onEidRefreshTimeout$mobilefuse_sdk_core_release()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EidService) this.receiver).onEidRefreshTimeout$mobilefuse_sdk_core_release();
    }
}
