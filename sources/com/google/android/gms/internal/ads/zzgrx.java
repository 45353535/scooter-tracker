package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzgrx implements zzgru {
    private static final zzgru zzb = zzgrw.zza;
    private final zzgsb zza = new zzgsb();
    private volatile zzgru zzc;
    private Object zzd;

    zzgrx(zzgru zzgruVar) {
        this.zzc = zzgruVar;
    }

    public final String toString() {
        Object string = this.zzc;
        if (string == zzb) {
            String strValueOf = String.valueOf(this.zzd);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final Object zza() {
        zzgru zzgruVar = this.zzc;
        zzgru zzgruVar2 = zzb;
        if (zzgruVar != zzgruVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzgruVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzgruVar2;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
