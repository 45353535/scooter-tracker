package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhzy implements zzidk {
    static {
        int i10 = zzibb.zzb;
        int i11 = zziaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidk
    public final /* synthetic */ Object zza(InputStream inputStream, zzibb zzibbVar) throws zzicg {
        zziee zzieeVarZzaU;
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        zzidc zzidcVar = (zzidc) zzb(zziaqVarZzF, zzibbVar);
        zziaqVarZzF.zzb(0);
        if (zzidcVar == null || zzidcVar.zzbi()) {
            return zzidcVar;
        }
        if (zzidcVar instanceof zzhzw) {
            zzieeVarZzaU = ((zzhzw) zzidcVar).zzaU();
        } else {
            if (zzidcVar instanceof zzhzx) {
                throw null;
            }
            zzieeVarZzaU = new zziee(zzidcVar);
        }
        throw zzieeVarZzaU.zza();
    }
}
