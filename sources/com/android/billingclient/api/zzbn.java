package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzbn extends ResultReceiver {
    final /* synthetic */ InAppMessageResponseListener zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbn(BillingClientImpl billingClientImpl, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.zza = inAppMessageResponseListener;
        Objects.requireNonNull(billingClientImpl);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, @Nullable Bundle bundle) {
        this.zza.onInAppMessageResponse(com.google.android.gms.internal.play_billing.zzc.zzj(bundle, "BillingClient"));
    }
}
