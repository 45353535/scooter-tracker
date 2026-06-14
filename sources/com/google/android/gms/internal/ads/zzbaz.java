package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbaz extends zzbby {
    public zzbaz(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        super(zzbakVar, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", zzawgVar, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzd(-1L);
        zzawgVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzd(iArr[0]);
                zzawgVar.zze(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    zzawgVar.zzO(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
