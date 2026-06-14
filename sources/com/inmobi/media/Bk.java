package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Bk extends AbstractC4124w6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bk(Ec nativeAdUnitComponent, AbstractC3669e1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
    }

    @Override // com.inmobi.media.AbstractC4124w6
    public final Object a(Continuation continuation) {
        return new B6();
    }
}
