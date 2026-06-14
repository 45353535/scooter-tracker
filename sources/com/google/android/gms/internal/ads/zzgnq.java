package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgnq implements zzgnb {
    private final List zza = new ArrayList();

    zzgnq() {
    }

    public final synchronized void zza(List list) {
        List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final synchronized void zzc(Map map, Context context, View view) {
        List list = this.zza;
        map.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, new ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
    }
}
