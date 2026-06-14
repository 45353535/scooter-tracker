package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfth {
    private static final zzfth zza = new zzfth();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfth() {
    }

    public static zzfth zza() {
        return zza;
    }

    public final void zzb(zzfsn zzfsnVar) {
        this.zzb.add(zzfsnVar);
    }

    public final void zzc(zzfsn zzfsnVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfsnVar);
        if (zZzg) {
            return;
        }
        zzftp.zza().zzc();
    }

    public final void zzd(zzfsn zzfsnVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfsnVar);
        this.zzc.remove(zzfsnVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzftp.zza().zze();
    }

    public final Collection zze() {
        return DesugarCollections.unmodifiableCollection(this.zzb);
    }

    public final Collection zzf() {
        return DesugarCollections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
