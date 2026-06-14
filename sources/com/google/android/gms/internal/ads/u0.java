package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class u0 {
    public static zzfoe a(Context context, int i10) {
        boolean zBooleanValue;
        if (zzfor.zza()) {
            int i11 = i10 - 2;
            if (i11 == 20 || i11 == 21) {
                zBooleanValue = ((Boolean) zzbix.zze.zze()).booleanValue();
            } else if (i11 != 110) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbix.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbix.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbix.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkm)).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfog(context, i10);
            }
        }
        return new zzfph();
    }

    public static zzfoe b(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfoe zzfoeVarA = a(context, i10);
        if (zzfoeVarA instanceof zzfog) {
            zzfoeVarA.zza();
            zzfoeVarA.zzp(i11);
            zzfoeVarA.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfon.zza(str)) {
                zzfoeVarA.zze(str);
            }
        }
        return zzfoeVarA;
    }
}
