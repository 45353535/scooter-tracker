package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfd extends zzmf implements zznn {
    private static final zzfd zzi;
    private int zzb;
    private int zzd;
    private zzmo zze = zzmf.zzcv();
    private zzmo zzf = zzmf.zzcv();
    private boolean zzg;
    private boolean zzh;

    static {
        zzfd zzfdVar = new zzfd();
        zzi = zzfdVar;
        zzmf.zzcp(zzfd.class, zzfdVar);
    }

    private zzfd() {
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final List zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfn zze(int i10) {
        return (zzfn) this.zze.get(i10);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzf.size();
    }

    public final zzff zzh(int i10) {
        return (zzff) this.zzf.get(i10);
    }

    final /* synthetic */ void zzi(int i10, zzfn zzfnVar) {
        zzfnVar.getClass();
        zzmo zzmoVar = this.zze;
        if (!zzmoVar.zza()) {
            this.zze = zzmf.zzcw(zzmoVar);
        }
        this.zze.set(i10, zzfnVar);
    }

    final /* synthetic */ void zzj(int i10, zzff zzffVar) {
        zzffVar.getClass();
        zzmo zzmoVar = this.zzf;
        if (!zzmoVar.zza()) {
            this.zzf = zzmf.zzcw(zzmoVar);
        }
        this.zzf.set(i10, zzffVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", zzfn.class, "zzf", zzff.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzfd();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfc(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }
}
