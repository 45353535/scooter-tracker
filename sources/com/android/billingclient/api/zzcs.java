package com.android.billingclient.api;

import androidx.core.util.Consumer;
import com.google.android.gms.internal.play_billing.zzjd;
import j$.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
final class zzcs implements com.google.android.gms.internal.play_billing.zzcv {
    final /* synthetic */ Consumer zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzcw zzc;
    final /* synthetic */ int zzd;

    zzcs(zzcw zzcwVar, int i10, Consumer consumer, Runnable runnable) {
        this.zzd = i10;
        this.zza = consumer;
        this.zzb = runnable;
        Objects.requireNonNull(zzcwVar);
        this.zzc = zzcwVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public final void zza(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            this.zzc.zzaN(zzjd.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, zzdc.zzE);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            this.zzc.zzaN(zzjd.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, zzdc.zzE);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.zzb.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        zzcw zzcwVar = this.zzc;
        if (!zzcw.zzaK(iIntValue)) {
            this.zzb.run();
        } else {
            this.zza.accept(zzcwVar.zzaL(this.zzd, num.intValue()));
        }
    }
}
