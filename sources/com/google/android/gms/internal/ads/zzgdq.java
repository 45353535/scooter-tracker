package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgdq implements zzgdh, zzgdd, zzgdw {
    private static final zzifd zza;
    private final Context zzb;
    private final zzgcl zzc;
    private final ExecutorService zzd;
    private final zzgce zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzavj zzq = zzavk.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zzifc zzifcVarZzc = zzifd.zzc();
        zzifcVarZzc.zza(17);
        zza = (zzifd) zzifcVarZzc.zzbu();
    }

    public zzgdq(Context context, zzgcl zzgclVar, ExecutorService executorService, zzgce zzgceVar, Random random, String str, long j10, long j11, double d10, String str2, long j12) {
        this.zzb = context;
        this.zzc = zzgclVar;
        this.zzd = executorService;
        this.zze = zzgceVar;
        this.zzg = str;
        this.zzh = j10;
        this.zzi = j11;
        this.zzj = d10;
        this.zzk = str2;
        this.zzl = j12;
        this.zzf = random.nextDouble() < d10;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final ListenableFuture zza() {
        return zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zzb(int i10, long j10, Throwable th2, String str) {
        long jLongValue;
        if (this.zzf) {
            synchronized (this.zzo) {
                try {
                    List list = this.zzr;
                    synchronized (this.zzp) {
                        try {
                            HashMap map = this.zzt;
                            Integer numValueOf = Integer.valueOf(i10);
                            Long l10 = (Long) map.get(numValueOf);
                            if (l10 == null) {
                                l10 = 0L;
                            }
                            jLongValue = 1 + l10.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } finally {
                        }
                    }
                    list.add(new zzgdn(i10, j10, th2, str, jLongValue));
                    if (!this.zzs) {
                        this.zzs = true;
                        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdp
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzd();
                            }
                        }, this.zzi);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdw
    public final void zzc(zzgdv zzgdvVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgdvVar.zza());
        }
    }

    final void zzd() {
        zzavj zzavjVar;
        zzguf zzgufVarZzq;
        String string;
        StringWriter stringWriter;
        synchronized (this.zzn) {
            zzavjVar = (zzavj) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzgufVarZzq = zzguf.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzgufVarZzq.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            zzgdn zzgdnVar = (zzgdn) zzgufVarZzq.get(i10);
            if (i11 >= this.zzh) {
                zze((zzavk) zzavjVar.zzbu());
                zzavjVar.zzb();
                i11 = 0;
            }
            zzawb zzawbVarZza = zzawc.zza();
            zzawbVarZza.zza(zzgdnVar.zza);
            zzawbVarZza.zzb(zzgdnVar.zzb);
            zzawbVarZza.zze(zzgdnVar.zze);
            String str = zzgdnVar.zzd;
            if (str != null) {
                zzawbVarZza.zzf(str);
            }
            Throwable th2 = zzgdnVar.zzc;
            zzawbVarZza.zzg(th2 == null ? 2 : 3);
            if (th2 != null) {
                zzawbVarZza.zzc(th2.getClass().getName());
                try {
                    stringWriter = new StringWriter();
                } catch (IOException unused) {
                    string = "";
                }
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        th2.printStackTrace(printWriter);
                        string = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                        zzawbVarZza.zzd(string);
                    } catch (Throwable th3) {
                        try {
                            printWriter.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        stringWriter.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
            zzavjVar.zza((zzawc) zzawbVarZza.zzbu());
            i10++;
            i11++;
        }
        if (i11 > 0) {
            zze((zzavk) zzavjVar.zzbu());
            zzavjVar.zzb();
        }
    }

    protected final void zze(zzavk zzavkVar) {
        try {
            zzgdl zzgdlVarZza = zzgdm.zza();
            zzgdlVarZza.zzb(zza);
            zzgdj zzgdjVarZza = zzgdk.zza();
            zzgdjVarZza.zza(zzavkVar);
            zzgdlVarZza.zza((zzgdk) zzgdjVarZza.zzbu());
            this.zze.zzb(this.zzg, ((zzgdm) zzgdlVarZza.zzbu()).zzaN(), CommonGatewayClient.HEADER_PROTOBUF);
        } catch (RuntimeException unused) {
        }
    }

    final /* synthetic */ void zzf() {
        int i10;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d10 = this.zzj;
        long j10 = this.zzl;
        Locale locale = Locale.getDefault();
        zzavj zzavjVarZza = zzavk.zza();
        zzavjVarZza.zzc(Build.VERSION.SDK_INT);
        zzavjVarZza.zzd(Build.MODEL);
        zzavjVarZza.zze(locale.getLanguage());
        zzavjVarZza.zzf(locale.getCountry());
        zzavjVarZza.zzi(str);
        zzavjVarZza.zzg(context.getPackageName());
        zzavjVarZza.zzl(j10);
        if (d10 > 0.0d) {
            zzavjVarZza.zzk((int) (1.0d / d10));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zzavjVarZza.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i10 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i10 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i10 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i10 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zzavjVarZza.zzm(i10);
        } catch (RuntimeException unused2) {
        }
        zzavk zzavkVar = (zzavk) zzavjVarZza.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzavkVar);
        }
    }
}
