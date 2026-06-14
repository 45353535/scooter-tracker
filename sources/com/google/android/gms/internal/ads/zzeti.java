package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeti implements zzfax {
    private final zzfax zza;
    private final zzfjk zzb;
    private final Context zzc;
    private final zzcdu zzd;

    zzeti(zzevl zzevlVar, zzfjk zzfjkVar, Context context, zzcdu zzcduVar) {
        this.zza = zzevlVar;
        this.zzb = zzfjkVar;
        this.zzc = context;
        this.zzd = zzcduVar;
    }

    @RequiresApi(api = 31)
    private static final int zzd(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i10, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i10 / f10);
    }

    private static final Insets zzf(Insets insets, float f10) {
        return f10 == 0.0f ? Insets.NONE : Insets.of((int) Math.ceil(insets.left / f10), (int) Math.ceil(insets.top / f10), (int) Math.ceil(insets.right / f10), (int) Math.ceil(insets.bottom / f10));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zzk(this.zza.zza(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzfbg) obj);
            }
        }, zzcei.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.google.android.gms.internal.ads.zzetj, still in use, count: 4, list:
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x02d9: MOVE (r19v0 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:730)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x01a5: MOVE (r19v4 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:422)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x01ce: MOVE (r19v5 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:463)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x0180: MOVE (r19v7 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:385)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    final /* synthetic */ com.google.android.gms.internal.ads.zzetj zzc(com.google.android.gms.internal.ads.zzfbg r22) {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzc(com.google.android.gms.internal.ads.zzfbg):com.google.android.gms.internal.ads.zzetj");
    }
}
