package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;
import com.taurusx.tax.g.a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzv {
    private final zzdye zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhP)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhQ)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhU)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhT)).booleanValue();
    private final Map zze = DesugarCollections.synchronizedMap(new zzs(this));

    public zzv(zzdye zzdyeVar) {
        this.zzh = zzdyeVar;
    }

    private final synchronized void zzi() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((zzt) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzt) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private final synchronized void zzj(final zzdxt zzdxtVar) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzdxtVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzk(zzdxt zzdxtVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdxtVar.zzc());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", a.f66078s);
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzb(this.zzi);
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized void zza(String str, String str2, zzdxt zzdxtVar) {
        this.zze.put(str, new zzt(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), str2, new HashSet()));
        zzi();
        zzj(zzdxtVar);
    }

    @Nullable
    public final synchronized String zzb(String str, zzdxt zzdxtVar) {
        zzt zztVar = (zzt) this.zze.get(str);
        zzdxtVar.zzc().put(CommonUrlParts.REQUEST_ID, str);
        if (zztVar == null) {
            zzdxtVar.zzc().put("mhit", "false");
            return null;
        }
        zzdxtVar.zzc().put("mhit", "true");
        return zztVar.zzb;
    }

    public final synchronized void zzc(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzd(String str, String str2) {
        zzt zztVar = (zzt) this.zze.get(str);
        if (zztVar != null) {
            if (zztVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean zze(String str, String str2, int i10) {
        zzt zztVar = (zzt) this.zze.get(str);
        if (zztVar == null) {
            return false;
        }
        Set set = zztVar.zzc;
        set.add(str2);
        return set.size() < i10;
    }

    final /* synthetic */ void zzf(zzdxt zzdxtVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzk(zzdxtVar, arrayDeque, TypedValues.TransitionType.S_TO);
        zzk(zzdxtVar, arrayDeque2, "of");
    }

    final /* synthetic */ int zzg() {
        return this.zza;
    }

    final /* synthetic */ ArrayDeque zzh() {
        return this.zzf;
    }
}
