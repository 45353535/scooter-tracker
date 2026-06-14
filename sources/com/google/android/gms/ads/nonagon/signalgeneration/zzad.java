package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
final class zzad implements zzgzl {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcdh zzb;
    final /* synthetic */ zzcda zzc;
    final /* synthetic */ zzfoe zzd;
    final /* synthetic */ zzau zze;

    zzad(zzau zzauVar, ListenableFuture listenableFuture, zzcdh zzcdhVar, zzcda zzcdaVar, zzfoe zzfoeVar) {
        this.zza = listenableFuture;
        this.zzb = zzcdhVar;
        this.zzc = zzcdaVar;
        this.zzd = zzfoeVar;
        Objects.requireNonNull(zzauVar);
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "SignalGeneratorImpl.generateSignals");
        }
        zzfoo zzfooVarZzy = zzau.zzy(this.zza, this.zzb);
        if (((Boolean) zzbix.zze.zze()).booleanValue() && zzfooVarZzy != null) {
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzj(th2);
            zzfoeVar.zzd(false);
            zzfooVarZzy.zza(zzfoeVar);
            zzfooVarZzy.zzh();
        }
        zzcda zzcdaVar = this.zzc;
        if (zzcdaVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                sb2.append("Internal error. ");
                sb2.append(message);
                message = sb2.toString();
            }
            zzcdaVar.zzb(message);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        ListenableFuture listenableFuture = this.zza;
        AtomicBoolean atomicBooleanZzN = this.zze.zzN();
        zzbj zzbjVar = (zzbj) obj;
        zzfoo zzfooVarZzy = zzau.zzy(listenableFuture, this.zzb);
        atomicBooleanZzN.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            try {
                zzcda zzcdaVar = this.zzc;
                if (zzcdaVar != null) {
                    zzcdaVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e10) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e10.toString());
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
            }
            if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                return;
            }
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzk("QueryInfo generation has been disabled.");
            zzfoeVar.zzd(false);
            zzfooVarZzy.zza(zzfoeVar);
            zzfooVarZzy.zzh();
            return;
        }
        try {
            try {
                if (zzbjVar == null) {
                    zzcda zzcdaVar2 = this.zzc;
                    if (zzcdaVar2 != null) {
                        zzcdaVar2.zzc(null, null, null);
                    }
                    zzfoe zzfoeVar2 = this.zzd;
                    zzfoeVar2.zzd(true);
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                        return;
                    }
                    zzfooVarZzy.zza(zzfoeVar2);
                    zzfooVarZzy.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbjVar.zzc) ? new JSONObject(zzbjVar.zzc) : new JSONObject(zzbjVar.zzb)).optString(CommonUrlParts.REQUEST_ID, ""))) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        zzcda zzcdaVar3 = this.zzc;
                        if (zzcdaVar3 != null) {
                            zzcdaVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfoe zzfoeVar3 = this.zzd;
                        zzfoeVar3.zzk("Request ID empty");
                        zzfoeVar3.zzd(false);
                        if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                            return;
                        }
                        zzfooVarZzy.zza(zzfoeVar3);
                        zzfooVarZzy.zzh();
                        return;
                    }
                    Bundle bundle = zzbjVar.zzf;
                    zzau zzauVar = this.zze;
                    if (zzauVar.zzF() && bundle != null && bundle.getInt(zzauVar.zzH(), -1) == -1) {
                        bundle.putInt(zzauVar.zzH(), zzauVar.zzI().get());
                    }
                    if (zzauVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzG()))) {
                        if (TextUtils.isEmpty(zzauVar.zzK())) {
                            zzauVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzauVar.zzz(), zzauVar.zzJ().afmaVersion));
                        }
                        bundle.putString(zzauVar.zzG(), zzauVar.zzK());
                    }
                    zzcda zzcdaVar4 = this.zzc;
                    if (zzcdaVar4 != null) {
                        if (TextUtils.isEmpty(zzbjVar.zzc)) {
                            zzcdaVar4.zzc(zzbjVar.zza, zzbjVar.zzb, bundle);
                        } else {
                            zzcdaVar4.zzc(zzbjVar.zza, zzbjVar.zzc, bundle);
                        }
                    }
                    this.zzd.zzd(true);
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                        return;
                    }
                    zzfooVarZzy.zza(this.zzd);
                    zzfooVarZzy.zzh();
                } catch (JSONException e11) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    zzcda zzcdaVar5 = this.zzc;
                    if (zzcdaVar5 != null) {
                        String string = e11.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 33);
                        sb2.append("Internal error for request JSON: ");
                        sb2.append(string);
                        zzcdaVar5.zzb(sb2.toString());
                    }
                    zzfoe zzfoeVar4 = this.zzd;
                    zzfoeVar4.zzj(e11);
                    zzfoeVar4.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                        return;
                    }
                    zzfooVarZzy.zza(zzfoeVar4);
                    zzfooVarZzy.zzh();
                }
            } catch (RemoteException e12) {
                zzfoe zzfoeVar5 = this.zzd;
                zzfoeVar5.zzj(e12);
                zzfoeVar5.zzd(false);
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e12);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                    return;
                }
                zzfooVarZzy.zza(this.zzd);
                zzfooVarZzy.zzh();
            }
        } catch (Throwable th2) {
            if (((Boolean) zzbix.zze.zze()).booleanValue() && zzfooVarZzy != null) {
                zzfooVarZzy.zza(this.zzd);
                zzfooVarZzy.zzh();
            }
            throw th2;
        }
    }
}
