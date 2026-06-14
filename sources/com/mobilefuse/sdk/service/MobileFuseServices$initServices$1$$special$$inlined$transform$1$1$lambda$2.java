package com.mobilefuse.sdk.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "p2", "", "invoke", "com/mobilefuse/sdk/service/MobileFuseServices$initServices$1$2$2"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$2 extends y implements Function2<MobileFuseService, Boolean, Unit> {
    final /* synthetic */ MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1 $serviceCallback$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$2(MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1 mobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1) {
        super(2, null, "serviceCallback", "invoke(Lcom/mobilefuse/sdk/service/MobileFuseService;Z)V", 0);
        this.$serviceCallback$1 = mobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MobileFuseService mobileFuseService, Boolean bool) {
        invoke(mobileFuseService, bool.booleanValue());
        return Unit.f93236a;
    }

    public final void invoke(@NotNull MobileFuseService p12, boolean z10) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        this.$serviceCallback$1.invoke(p12, z10);
    }
}
