package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzabh implements Comparator {
    static final /* synthetic */ zzabh zza = new zzabh();

    private /* synthetic */ zzabh() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(((zzabg) obj).zzc, ((zzabg) obj2).zzc);
    }
}
