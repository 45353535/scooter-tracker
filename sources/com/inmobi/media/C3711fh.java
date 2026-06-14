package com.inmobi.media;

import android.content.Context;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.inmobi.media.C3711fh;
import j$.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3711fh implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3811jh f38584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f38585b;

    public C3711fh(Function1 function1, C3811jh c3811jh) {
        this.f38584a = c3811jh;
        this.f38585b = function1;
    }

    public static final void a(Function1 function1, AbstractC3685eh abstractC3685eh) {
        function1.invoke(abstractC3685eh);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        this.f38584a.getClass();
        final Function1 function1 = this.f38585b;
        final C3811jh c3811jh = this.f38584a;
        Runnable runnable = new Runnable() { // from class: w3.d7
            @Override // java.lang.Runnable
            public final void run() {
                C3711fh.a(function1, c3811jh);
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        final AbstractC3685eh c3634ch;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f38584a.getClass();
        Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            c3634ch = C3660dh.f38451a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
            c3634ch = new C3634ch(debugMessage, responseCode);
        }
        final Function1 function1 = this.f38585b;
        Runnable runnable = new Runnable() { // from class: w3.c7
            @Override // java.lang.Runnable
            public final void run() {
                C3711fh.a(function1, c3634ch);
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void a(Function1 function1, C3811jh c3811jh) {
        c3811jh.getClass();
        function1.invoke(new C3634ch("Billing Service Disconnected", -1));
    }
}
