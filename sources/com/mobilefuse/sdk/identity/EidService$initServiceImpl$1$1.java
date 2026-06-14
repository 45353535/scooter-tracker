package com.mobilefuse.sdk.identity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p1", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class EidService$initServiceImpl$1$1 extends y implements Function1<Boolean, Unit> {
    EidService$initServiceImpl$1$1(EidService eidService) {
        super(1, eidService, EidService.class, "onAppVisibilityChanged", "onAppVisibilityChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f93236a;
    }

    public final void invoke(boolean z10) {
        ((EidService) this.receiver).onAppVisibilityChanged(z10);
    }
}
