package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
final class zzghg extends zzghb {
    private final DisplayMetrics zza;
    private final View zzb;

    zzghg(zzawg zzawgVar, zzgfx zzgfxVar, DisplayMetrics displayMetrics, View view, zzgoe zzgoeVar) {
        super("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", zzawgVar, zzgfxVar, zzgoeVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.zza, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        zzaxe zzaxeVarZza = zzaxf.zza();
        zzaxeVarZza.zzb(lArr[2].longValue());
        zzaxeVarZza.zzc(lArr[1].longValue());
        zzaxeVarZza.zzd(lArr[0].longValue());
        zzaxeVarZza.zza(lArr[3].longValue());
        zzaxeVarZza.zze(lArr[4].longValue());
        zzawgVar.zzM((zzaxf) zzaxeVarZza.zzbu());
    }
}
