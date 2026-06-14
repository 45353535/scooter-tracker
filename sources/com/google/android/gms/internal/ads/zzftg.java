package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzftg extends zzftj {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzftg zzb = new zzftg();

    private zzftg() {
    }

    public static zzftg zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final boolean zzb() {
        Iterator it = zzfth.zza().zzf().iterator();
        while (it.hasNext()) {
            View viewZzi = ((zzfsn) it.next()).zzi();
            if (viewZzi != null && viewZzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final void zzc(boolean z10) {
        Iterator it = zzfth.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfsn) it.next()).zzg().zzf(z10);
        }
    }
}
