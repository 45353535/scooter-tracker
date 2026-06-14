package org.bidon.moloco.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParamSource;

/* JADX INFO: loaded from: classes11.dex */
public final class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final a d(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new a(auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e f(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new e(auctionParamsScope.getAdUnit());
    }

    public final Object c(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.moloco.impl.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.d((AdAuctionParamSource) obj);
            }
        });
    }

    public final Object e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.moloco.impl.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.f((AdAuctionParamSource) obj);
            }
        });
    }
}
