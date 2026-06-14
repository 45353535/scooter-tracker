package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbbn extends zzbby {
    public zzbbn(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        super(zzbakVar, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", zzawgVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i10 = 1;
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzawg zzawgVar = this.zzd;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            zzawgVar.zzah(i10);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
