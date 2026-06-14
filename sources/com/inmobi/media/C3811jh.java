package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.inmobi.media.AbstractC3685eh;
import com.inmobi.media.C3811jh;
import com.inmobi.media.Wg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3811jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f38821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BillingClient f38822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f38823c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wg f38824d = new Wg();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38825e = 2;

    public static final void a(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static final void b(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new PurchasesUpdatedListener() { // from class: w3.z8
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                    C3811jh.b(billingResult, list);
                }
            }).build();
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            e10.getMessage();
            return null;
        } catch (NoClassDefFoundError e11) {
            Lazy lazy2 = P9.f37527a;
            P9.a(new L2(e11));
            e11.getMessage();
            return null;
        }
    }

    public final void a(Context context, Function1 onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        try {
            this.f38821a = onComplete;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new Yg((short) 2236), (Wg) null);
                return;
            }
            BillingClient billingClient = (BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new Yg((short) 2233), (Wg) null);
                return;
            }
            this.f38822b = billingClient;
            Function1 onComplete2 = new Function1() { // from class: w3.c9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3811jh.a(this.f107008b, (AbstractC3685eh) obj);
                }
            };
            Intrinsics.checkNotNullParameter(onComplete2, "onComplete");
            BillingClient billingClient2 = this.f38822b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new C3711fh(onComplete2, this));
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            e10.getMessage();
            a(new Yg((short) 2237), (Wg) null);
        }
    }

    public static final void b(final C3811jh c3811jh, final Function1 function1, BillingResult billingResult, List purchasesResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        Wg wg2 = c3811jh.f38824d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        wg2.f37954a = arrayList.size();
        Runnable runnable = new Runnable() { // from class: w3.b9
            @Override // java.lang.Runnable
            public final void run() {
                C3811jh.b(function1, c3811jh);
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final Unit a(final C3811jh c3811jh, AbstractC3685eh result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof C3634ch) {
            c3811jh.a(new Xg(String.valueOf(((C3634ch) result).f38343a)), (Wg) null);
            return Unit.f93236a;
        }
        c3811jh.a(new Function1() { // from class: w3.v8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3811jh.a(this.f107350b, (Wg) obj);
            }
        });
        return Unit.f93236a;
    }

    public static final void b(Function1 function1, C3811jh c3811jh) {
        function1.invoke(c3811jh.f38824d);
    }

    public static final Unit a(C3811jh c3811jh, Wg data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (c3811jh.f38823c.incrementAndGet() != c3811jh.f38825e) {
            return Unit.f93236a;
        }
        int i10 = data.f37954a;
        if (i10 == 0 && data.f37955b == 0) {
            c3811jh.a(new Yg((short) 2234), (Wg) null);
            return Unit.f93236a;
        }
        StringsKt.p("No of In-App Purchases: " + i10 + "\n                                    | and No of Subscriptions: " + data.f37955b + "\n                                ", null, 1, null);
        c3811jh.a(Zg.f38125a, data);
        return Unit.f93236a;
    }

    public final Function1 a(String str) {
        if (StringsKt.a0(str, "6", false, 2, null)) {
            return new C3737gh(this);
        }
        if (StringsKt.a0(str, "7", false, 2, null)) {
            return new C3762hh(this);
        }
        return new C3786ih(this);
    }

    public final void a(AbstractC3582ah abstractC3582ah, Wg wg2) {
        AbstractC3608bh.a(abstractC3582ah);
        Function1 function1 = this.f38821a;
        if (function1 != null) {
            function1.invoke(wg2);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new PurchasesUpdatedListener() { // from class: w3.a9
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                    C3811jh.a(billingResult, list);
                }
            }).build();
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            e10.getMessage();
            return null;
        } catch (NoClassDefFoundError e11) {
            Lazy lazy2 = P9.f37527a;
            P9.a(new L2(e11));
            e11.getMessage();
            return null;
        }
    }

    public final void a(final Function1 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductType("inapp");
        QueryPurchasesParams.Builder builderNewBuilder2 = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder(...)");
        builderNewBuilder2.setProductType("subs");
        BillingClient billingClient = this.f38822b;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(builderNewBuilder.build(), new PurchasesResponseListener() { // from class: w3.x8
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    C3811jh.b(this.f107380a, onComplete, billingResult, list);
                }
            });
        }
        BillingClient billingClient2 = this.f38822b;
        if (billingClient2 != null) {
            billingClient2.queryPurchasesAsync(builderNewBuilder2.build(), new PurchasesResponseListener() { // from class: w3.y8
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    C3811jh.a(this.f107398a, onComplete, billingResult, list);
                }
            });
        }
    }

    public static final void a(final C3811jh c3811jh, final Function1 function1, BillingResult billingResult, List purchasesResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        Wg wg2 = c3811jh.f38824d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        wg2.f37955b = arrayList.size();
        Runnable runnable = new Runnable() { // from class: w3.w8
            @Override // java.lang.Runnable
            public final void run() {
                C3811jh.a(function1, c3811jh);
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void a(Function1 function1, C3811jh c3811jh) {
        function1.invoke(c3811jh.f38824d);
    }
}
