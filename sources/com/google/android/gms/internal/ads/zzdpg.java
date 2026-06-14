package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdpg {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfjk zzc;
    private final zzdom zzd;
    private final zzdoh zze;

    @Nullable
    private final zzdpu zzf;

    @Nullable
    private final zzdqc zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbkh zzj;
    private final zzdoe zzk;

    public zzdpg(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfjk zzfjkVar, zzdom zzdomVar, zzdoh zzdohVar, @Nullable zzdpu zzdpuVar, @Nullable zzdqc zzdqcVar, Executor executor, Executor executor2, zzdoe zzdoeVar) {
        this.zzb = zzgVar;
        this.zzc = zzfjkVar;
        this.zzj = zzfjkVar.zzj;
        this.zzd = zzdomVar;
        this.zze = zzdohVar;
        this.zzf = zzdpuVar;
        this.zzg = zzdqcVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdoeVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(@NonNull ViewGroup viewGroup, boolean z10) {
        View viewZzJ = z10 ? this.zze.zzJ() : this.zze.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeJ)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdqe zzdqeVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdqeVar);
            }
        });
    }

    public final void zzb(@Nullable zzdqe zzdqeVar) {
        zzdpu zzdpuVar;
        if (zzdqeVar == null || (zzdpuVar = this.zzf) == null || zzdqeVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdqeVar.zzdA().addView(zzdpuVar.zza());
        } catch (zzcka e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
        }
    }

    public final void zzc(@Nullable zzdqe zzdqeVar) {
        if (zzdqeVar == null) {
            return;
        }
        Context context = zzdqeVar.zzdE().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdqc zzdqcVar = this.zzg;
            if (zzdqcVar == null || zzdqeVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdqcVar.zza(zzdqeVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzcka e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
            }
        }
    }

    public final boolean zzd(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzdqe r11) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpg.zzf(com.google.android.gms.internal.ads.zzdqe):void");
    }

    final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdoh zzdohVar = this.zze;
        if (zzdohVar.zzJ() != null) {
            boolean z10 = viewGroup != null;
            if (zzdohVar.zzx() == 2 || zzdohVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdohVar.zzx()), z10);
            } else if (zzdohVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z10);
                zzgVar.zzr(str, "1", z10);
            }
        }
    }
}
