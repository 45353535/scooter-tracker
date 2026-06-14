package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzekl {
    private final String zzc;

    @Nullable
    private zzfiu zzd = null;

    @Nullable
    private zzfir zze = null;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = DesugarCollections.synchronizedMap(new HashMap());
    private final List zza = DesugarCollections.synchronizedList(new ArrayList());

    public zzekl(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfir zzfirVar, int i10) {
        Map map = this.zzb;
        String strZzl = zzl(zzfirVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfirVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfirVar.zzE, 0L, null, bundle, zzfirVar.zzF, zzfirVar.zzG, zzfirVar.zzH, zzfirVar.zzI);
        try {
            this.zza.add(i10, zzvVar);
        } catch (IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, zzvVar);
    }

    private final void zzk(zzfir zzfirVar, long j10, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        Map map = this.zzb;
        String strZzl = zzl(zzfirVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzfirVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strZzl);
            zzvVar.zzb = j10;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhH)).booleanValue() && z10) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzfir zzfirVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue() ? zzfirVar.zzap : zzfirVar.zzw;
    }

    public final void zza(zzfiu zzfiuVar) {
        this.zzd = zzfiuVar;
    }

    public final void zzb(zzfir zzfirVar) {
        zzj(zzfirVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
            List list2 = this.zza;
            int iIndexOf = list2.indexOf(zzvVar);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzfir) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzd(zzfir zzfirVar, long j10, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfirVar, j10, null, true);
    }

    public final void zze(zzfir zzfirVar, long j10, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfirVar, j10, zzeVar, false);
    }

    public final zzday zzf() {
        return new zzday(this.zze, "", this, this.zzd, this.zzc);
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfir zzfirVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfirVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
