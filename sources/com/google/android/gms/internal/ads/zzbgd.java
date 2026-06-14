package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbgd {
    private final zzbgi zza;
    private final zzbgj.zzt.zza zzb;
    private final boolean zzc;

    private zzbgd() {
        this.zzb = zzbgj.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbgi();
    }

    public static zzbgd zza() {
        return new zzbgd();
    }

    private final synchronized void zzd(int i10) {
        zzbgj.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzk());
        zzbgh zzbghVar = new zzbgh(this.zza, zzaVar.zzbu().zzaN(), null);
        int i11 = i10 - 1;
        zzbghVar.zzb(i11);
        zzbghVar.zza();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    private final synchronized void zze(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfxl.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzf(i10).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i10) {
        zzbgj.zzt.zza zzaVar;
        zzaVar = this.zzb;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", zzaVar.zzf(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(zzaVar.zzbu().zzaN(), 3));
    }

    public final synchronized void zzb(zzbgc zzbgcVar) {
        if (this.zzc) {
            try {
                zzbgcVar.zza(this.zzb);
            } catch (NullPointerException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzge)).booleanValue()) {
                zze(i10);
            } else {
                zzd(i10);
            }
        }
    }

    public zzbgd(zzbgi zzbgiVar) {
        this.zzb = zzbgj.zzt.zzx();
        this.zza = zzbgiVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgd)).booleanValue();
    }
}
