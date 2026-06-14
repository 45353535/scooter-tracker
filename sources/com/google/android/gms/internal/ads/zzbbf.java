package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbbf extends zzbby {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzbbf(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11, Map map, View view, Context context) {
        super(zzbakVar, "mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", zzawgVar, i10, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzb(int i10) {
        Map map = this.zzh;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) map.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzb(1), zzb(2)};
        Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, contextZzb, this.zzi);
        long j10 = jArr2[0];
        Map map = this.zzh;
        map.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzY(j10);
            zzawgVar.zzZ(j11);
        }
    }
}
