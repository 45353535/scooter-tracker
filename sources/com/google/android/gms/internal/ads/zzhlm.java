package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhlm extends RuntimeException {
    public zzhlm(String str) {
        super(str);
    }

    public static Object zza(zzhll zzhllVar) {
        try {
            return zzhllVar.zza();
        } catch (Exception e10) {
            throw new zzhlm(e10);
        }
    }

    public zzhlm(String str, Throwable th2) {
        super(str, th2);
    }

    public zzhlm(Throwable th2) {
        super(th2);
    }
}
