package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhfv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhfu.zza, zzhfr.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzhas.class, zzhqb.SYMMETRIC, zzhry.zze());
    private static final zzhjy zzd = zzhfs.zza;
    private static final zzhjb zze = zzhft.zza;

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = zzhhw.zza;
        zzhhw.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzhfx.zzb(zzhfw.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzhfx.zzb(zzhfw.zzc));
        zzhkcVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhjx.zza().zzb(zze, zzhfx.class);
        zzhjz.zza().zzb(zzd, zzhfx.class);
        zzhjc.zza().zzb(zzc, true);
    }
}
