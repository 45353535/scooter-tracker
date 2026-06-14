package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbyp;

/* JADX INFO: loaded from: classes7.dex */
public final class AdManagerAdView extends BaseAdView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25283b = 0;

    public AdManagerAdView(@NonNull Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @Nullable
    public AdSize[] getAdSizes() {
        return this.zza.zzd();
    }

    @Nullable
    public AppEventListener getAppEventListener() {
        return this.zza.zzf();
    }

    @NonNull
    public VideoController getVideoController() {
        return this.zza.zzy();
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.zza.zzB();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhe.zza(getContext());
        if (((Boolean) zzbjc.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.zza.zzg(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzi();
    }

    public void setAdSizes(@NonNull AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzn(adSizeArr);
    }

    public void setAppEventListener(@Nullable AppEventListener appEventListener) {
        this.zza.zzp(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.zza.zzq(z10);
    }

    public void setVideoOptions(@NonNull VideoOptions videoOptions) {
        this.zza.zzA(videoOptions);
    }

    public final boolean zza(zzbx zzbxVar) {
        return this.zza.zzC(zzbxVar);
    }

    final /* synthetic */ void zzb(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzg(adManagerAdRequest.zza());
        } catch (IllegalStateException e10) {
            zzbyp.zza(getContext()).zzh(e10, "AdManagerAdView.loadAd");
        }
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
