package org.bidon.startio.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParamSource;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final d d(AdAuctionParamSource adAuctionParamSource, AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new d(adAuctionParamSource.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f f(AdAuctionParamSource adAuctionParamSource, AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        Context applicationContext = adAuctionParamSource.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new f(applicationContext, auctionParamsScope.getAdUnit());
    }

    public final Object c(final AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.startio.impl.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.d(auctionParamsScope, (AdAuctionParamSource) obj);
            }
        });
    }

    public final Object e(final AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.startio.impl.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.f(auctionParamsScope, (AdAuctionParamSource) obj);
            }
        });
    }
}
