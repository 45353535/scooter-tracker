package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzghc extends zzghb {
    private final Map zza;
    private final zzgcc zzb;

    zzghc(zzawg zzawgVar, zzgfx zzgfxVar, zzgcc zzgccVar, Map map, zzgoe zzgoeVar) {
        super("+PmnicIB6Ggxqdcyc5KXYWsM1j/GXRihAyryrcphzvI3AMIT+uhHMqbkBoIk/Q9k", "+zCNZC90FxKlnODut7cZO0wgbMEddS2/rBQzUBv6at4=", zzawgVar, zzgfxVar, zzgoeVar.zza(122));
        this.zza = map;
        this.zzb = zzgccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.zza;
        lArr[0] = (Long) zzgqz.zza((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) zzgqz.zza((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) zzgqz.zza((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) zzgqz.zza((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) zzgqz.zza((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) zzgqz.zza((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) zzgqz.zza((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) zzgqz.zza((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) zzgqz.zza((Long) map.get("tst"), -1L);
        for (int i10 = 0; i10 < 9; i10++) {
            if (lArr[i10] == null) {
                lArr[i10] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zzac(lArr2[0].longValue());
            zzawgVar.zzs(lArr2[1].longValue());
            zzawgVar.zzn(lArr2[2].longValue());
            zzawgVar.zzk(lArr2[3].longValue());
            zzawgVar.zzY(lArr2[4].longValue());
            zzawgVar.zzZ(lArr2[5].longValue());
            zzawgVar.zzF(lArr2[6].longValue());
            zzawgVar.zzG(lArr2[7].longValue());
        }
    }
}
