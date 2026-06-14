package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeha implements zzfmu {
    protected final Context zza;
    protected final String zzb;

    @Nullable
    private final String zzc;

    public zzeha(Context context, String str, zzcac zzcacVar, int i10, @Nullable String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzegz zza(zzegy zzegyVar) throws zzecr {
        return zzc(zzegyVar.zza, zzegyVar.zzb, zzegyVar.zzc, zzegyVar.zzd, zzegyVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x029a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bd, code lost:
    
        r12.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023f, code lost:
    
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(r3.toString());
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0279, code lost:
    
        throw new com.google.android.gms.internal.ads.zzecr(1, r4.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.zzegz zzc(java.lang.String r19, int r20, java.util.Map r21, byte[] r22, java.lang.String r23, long r24) throws java.net.MalformedURLException, com.google.android.gms.internal.ads.zzecr {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeha.zzc(java.lang.String, int, java.util.Map, byte[], java.lang.String, long):com.google.android.gms.internal.ads.zzegz");
    }
}
