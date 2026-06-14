package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzcy {
    public static final /* synthetic */ int zza = 0;

    static {
        int i10 = zzcz.zza;
    }

    @Nullable
    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + StringUtils.PROCESS_POSTFIX_DELIMITER + com.google.android.gms.internal.play_billing.zzbm.zzc(exc.getMessage());
            int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    @Nullable
    public static zziw zzb(@Nullable zzjd zzjdVar, int i10, BillingResult billingResult, @Nullable String str, zzjk zzjkVar) {
        try {
            zzjb zzjbVarZza = zzjf.zza();
            zzjbVarZza.zzp(billingResult.getResponseCode());
            zzjbVarZza.zzb(billingResult.getDebugMessage());
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                zzjbVarZza.zzd(billingResult.getOnPurchasesUpdatedSubResponseCode());
            }
            if (zzjdVar != null) {
                zzjbVarZza.zze(zzjdVar);
            }
            if (str != null) {
                zzjbVarZza.zza(str);
            }
            zziu zziuVarZza = zziw.zza();
            zziuVarZza.zzb(zzjbVarZza);
            zziuVarZza.zzp(i10);
            if (!zzjkVar.equals(zzjk.BROADCAST_ACTION_UNSPECIFIED)) {
                zziuVarZza.zza(zzjkVar);
            }
            return (zziw) zziuVarZza.zzi();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    @Nullable
    public static zzja zzc(int i10, zzjk zzjkVar) {
        try {
            zziy zziyVarZza = zzja.zza();
            zziyVarZza.zze(i10);
            if (!zzjkVar.equals(zzjk.BROADCAST_ACTION_UNSPECIFIED)) {
                zziyVarZza.zza(zzjkVar);
            }
            return (zzja) zziyVarZza.zzi();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
