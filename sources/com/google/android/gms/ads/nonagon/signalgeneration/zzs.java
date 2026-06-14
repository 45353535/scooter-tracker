package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zzs extends LinkedHashMap {
    final /* synthetic */ zzv zza;

    zzs(zzv zzvVar) {
        Objects.requireNonNull(zzvVar);
        this.zza = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        zzv zzvVar = this.zza;
        synchronized (zzvVar) {
            try {
                if (size() <= zzvVar.zzg()) {
                    return false;
                }
                zzvVar.zzh().add(new Pair((String) entry.getKey(), ((zzt) entry.getValue()).zzb));
                return size() > zzvVar.zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
