package com.appodeal.ads.services.adjust;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j extends y implements Function1 {
    public j(AdjustService adjustService) {
        super(1, adjustService, AdjustService.class, "getEventToken", "getEventToken(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p02 = (String) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        AdjustService adjustService = (AdjustService) this.receiver;
        String str = (String) adjustService.f14523c.get(p02);
        return str == null ? (String) adjustService.f14523c.get("hs_sdk_unknown") : str;
    }
}
