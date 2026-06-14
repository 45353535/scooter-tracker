package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbwr extends zzbwx {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcjl zzj;
    private final Activity zzk;
    private zzclv zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbwy zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf(C4240b4.e.f42563c, C4240b4.e.f42562b, "top-center", "center", C4240b4.e.f42565e, C4240b4.e.f42564d, "bottom-center");
    }

    public zzbwr(zzcjl zzcjlVar, zzbwy zzbwyVar) {
        super(zzcjlVar, "resize");
        this.zza = C4240b4.e.f42562b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcjlVar;
        this.zzk = zzcjlVar.zzj();
        this.zzo = zzbwyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmn)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmo)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmp)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcjl zzcjlVar = this.zzj;
                    viewGroup2.addView((View) zzcjlVar);
                    zzcjlVar.zzaf(this.zzl);
                } catch (IllegalStateException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e10);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcjl zzcjlVar2 = this.zzj;
                viewGroup3.addView((View) zzcjlVar2);
                zzcjlVar2.zzaf(this.zzl);
            }
        }
        if (z10) {
            zzk("default");
            zzbwy zzbwyVar = this.zzo;
            if (zzbwyVar != null) {
                zzbwyVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b A[PHI: r18
  0x019b: PHI (r18v12 int) = (r18v5 int), (r18v6 int), (r18v7 int), (r18v8 int), (r18v9 int), (r18v10 int), (r18v13 int) binds: [B:85:0x0197, B:82:0x018a, B:79:0x017e, B:76:0x0172, B:73:0x0166, B:70:0x015a, B:68:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwr.zza(java.util.Map):void");
    }

    public final void zzb(final boolean z10) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmm)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z10);
                    } else {
                        zzcei.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf(z10);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(int i10, int i11, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zzi) {
            z10 = this.zzp != null;
        }
        return z10;
    }

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }
}
