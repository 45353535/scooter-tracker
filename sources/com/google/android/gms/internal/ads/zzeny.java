package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeny implements zzgyw {
    private final zzfnu zza;
    private final zzdbh zzb;
    private final zzfqg zzc;
    private final zzfqk zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcwi zzg;
    private final zzenr zzh;
    private final zzekl zzi;
    private final Context zzj;
    private final zzfoo zzk;
    private final zzenb zzl;
    private final zzdxt zzm;

    zzeny(Context context, zzfnu zzfnuVar, zzenr zzenrVar, zzdbh zzdbhVar, zzfqg zzfqgVar, zzfqk zzfqkVar, zzcwi zzcwiVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzekl zzeklVar, zzfoo zzfooVar, zzenb zzenbVar, zzdxt zzdxtVar) {
        this.zzj = context;
        this.zza = zzfnuVar;
        this.zzh = zzenrVar;
        this.zzb = zzdbhVar;
        this.zzc = zzfqgVar;
        this.zzd = zzfqkVar;
        this.zzg = zzcwiVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeklVar;
        this.zzk = zzfooVar;
        this.zzl = zzenbVar;
        this.zzm = zzdxtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String zzb(com.google.android.gms.internal.ads.zzfjc r5) {
        /*
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzgA
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfjb r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfiu r5 = r5.zzb
            int r2 = r5.zzf
            if (r2 == 0) goto L61
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzgz
            com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L61
            goto L62
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L62
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L62
        L61:
            r1 = r0
        L62:
            com.google.android.gms.internal.ads.zzfit r5 = r5.zzj
            if (r5 == 0) goto L6b
            java.lang.String r5 = r5.zza()
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeny.zzb(com.google.android.gms.internal.ads.zzfjc):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i10;
        Bundle bundle;
        final zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzfjcVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcL)).booleanValue()) {
            this.zzm.zze().putLong(zzdxh.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String strZzb = zzb(zzfjcVar);
        zzekl zzeklVar = this.zzi;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzfiu zzfiuVar = zzfjbVar.zzb;
        zzeklVar.zza(zzfiuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjE)).booleanValue() && (i10 = zzfiuVar.zzf) != 0 && (i10 < 200 || i10 >= 300)) {
            return zzgzo.zzc(new zzenv(3, strZzb));
        }
        String str = zzfiuVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfir zzfirVar : zzfjbVar.zza) {
                zzeklVar.zzb(zzfirVar);
                Iterator it = zzfirVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeklVar.zze(zzfirVar, 0L, zzfkm.zzd(1, null, null));
                        break;
                    }
                    zzekg zzekgVarZza = this.zzg.zza(zzfirVar.zzb, (String) it.next());
                    if (zzekgVarZza == null || !zzekgVarZza.zza(zzfjcVar, zzfirVar)) {
                    }
                }
            }
        } else {
            zzeklVar.zzc(str, zzfjbVar.zza);
        }
        zzdbh zzdbhVar = this.zzb;
        zzcrz zzcrzVar = new zzcrz(zzfjcVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdbhVar.zzq(zzcrzVar, executor);
        if (zzfiuVar.zzr > 1) {
            return this.zzl.zza(zzfjcVar);
        }
        String strZzb2 = zzb(zzfjcVar);
        zzfnu zzfnuVar = this.zza;
        zzfno zzfnoVar = zzfno.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfnuVar);
        zzfnb zzfnbVarZzi = zzfnf.zza(zzgzo.zzc(new zzenv(3, strZzb2)), zzfnoVar, zzfnuVar).zzi();
        final zzenr zzenrVar = this.zzh;
        zzenrVar.zza();
        int i11 = 0;
        for (final zzfir zzfirVar2 : zzfjbVar.zza) {
            Iterator it2 = zzfirVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzekg zzekgVarZza2 = this.zzg.zza(zzfirVar2.zzb, str2);
                if (zzekgVarZza2 != null && zzekgVarZza2.zza(zzfjcVar, zzfirVar2)) {
                    zzfnl zzfnlVarZza = zzfnuVar.zza(zzfno.RENDER_CONFIG_WATERFALL, zzfnbVarZzi);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(str2).length());
                    sb2.append("render-config-");
                    sb2.append(i11);
                    sb2.append(TokenBuilder.TOKEN_DELIMITER);
                    sb2.append(str2);
                    zzfnbVarZzi = zzfnlVarZza.zza(sb2.toString()).zzg(Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzenx
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return this.zza.zzc(zzfirVar2, zzfjcVar, zzekgVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i11++;
        }
        zzfnbVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzenrVar.zzb();
            }
        }, executor);
        return zzfnbVarZzi;
    }

    final /* synthetic */ ListenableFuture zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzekg zzekgVar, Throwable th2) {
        zzfoe zzfoeVarA = u0.a(this.zzj, 12);
        zzfoeVarA.zzi(zzfirVar.zzE);
        zzfoeVarA.zza();
        ListenableFuture listenableFutureZzi = zzgzo.zzi(zzekgVar.zzb(zzfjcVar, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfjcVar, zzfirVar, listenableFutureZzi, this.zzc);
        zzfon.zzd(listenableFutureZzi, this.zzk, zzfoeVarA);
        return listenableFutureZzi;
    }
}
