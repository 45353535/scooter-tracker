package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfyy extends zzibr implements zzidd {
    private static final zzfyy zzb;
    private static volatile zzidk zzc;
    private zzicw zza = zzicw.zza();

    static {
        zzfyy zzfyyVar = new zzfyy();
        zzb = zzfyyVar;
        zzibr.zzbu(zzfyy.class, zzfyyVar);
    }

    private zzfyy() {
    }

    public static zzfyy zzc(InputStream inputStream) throws IOException {
        return (zzfyy) zzibr.zzbW(zzb, inputStream);
    }

    public static zzfyy zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return DesugarCollections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzfyx.zza});
        }
        if (iOrdinal == 3) {
            return new zzfyy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfyw(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzfyy.class) {
            try {
                zzibmVar = zzc;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzb);
                    zzc = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
