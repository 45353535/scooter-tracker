package org.bidon.mobilefuse.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParamSource;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final a d(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new a(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c f(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new c(auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
    }

    public final Object c(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.mobilefuse.impl.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.d((AdAuctionParamSource) obj);
            }
        });
    }

    public final Object e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.mobilefuse.impl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.f((AdAuctionParamSource) obj);
            }
        });
    }
}
