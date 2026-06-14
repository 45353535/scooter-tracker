package com.google.android.gms.internal.ads;

import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import net.pubnative.lite.sdk.utils.AtomManager;

/* JADX INFO: loaded from: classes8.dex */
final class zzbnu implements zzboh {
    zzbnu() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (map.containsKey("start")) {
            zzcjlVar.zzP().zzr();
        } else if (map.containsKey(AtomManager.ATOM_STOP_METHOD_NAME)) {
            zzcjlVar.zzP().zzs();
        } else if (map.containsKey(MenuActionType.CANCEL)) {
            zzcjlVar.zzP().zzt();
        }
    }
}
