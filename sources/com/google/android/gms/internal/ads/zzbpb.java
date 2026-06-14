package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.webkit.internal.AssetHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbpb implements zzboh {
    private final Context zza;

    public zzbpb(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzaa(this.zza, intent);
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to open Share Sheet", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
