package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3762hh extends kotlin.jvm.internal.y implements Function1 {
    public C3762hh(C3811jh c3811jh) {
        super(1, c3811jh, C3811jh.class, "instantiateBillingClientV7", "instantiateBillingClientV7(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context p02 = (Context) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((C3811jh) this.receiver).getClass();
        return C3811jh.b(p02);
    }
}
