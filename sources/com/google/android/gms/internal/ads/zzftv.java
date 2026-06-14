package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzftv implements zzftt {
    private final zzftt zza;

    public zzftv(zzftt zzfttVar) {
        this.zza = zzfttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZzb = zzfud.zzb(0, 0, 0, 0);
        int iZzb = zzfug.zzb();
        int i10 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i10 == 0);
            return jSONObjectZzb;
        } catch (JSONException e10) {
            zzfue.zza("Error with setting output device status", e10);
            return jSONObjectZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb(View view, JSONObject jSONObject, zzfts zzftsVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfth zzfthVarZza = zzfth.zza();
        if (zzfthVarZza != null) {
            Collection collectionZzf = zzfthVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfsn) it.next()).zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z12) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzftsVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
