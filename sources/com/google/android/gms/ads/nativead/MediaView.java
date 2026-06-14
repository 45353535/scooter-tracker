package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzblm;

/* JADX INFO: loaded from: classes7.dex */
public class MediaView extends FrameLayout {

    @Nullable
    private MediaContent zza;
    private boolean zzb;
    private zzbke zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzbkg zzf;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    @Nullable
    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzbkg zzbkgVar = this.zzf;
        if (zzbkgVar != null) {
            zzbkgVar.zza(scaleType);
        }
    }

    public void setMediaContent(@Nullable MediaContent mediaContent) {
        boolean zZzt;
        this.zzb = true;
        this.zza = mediaContent;
        zzbke zzbkeVar = this.zzc;
        if (zzbkeVar != null) {
            zzbkeVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzblm zzblmVarZzb = mediaContent.zzb();
            if (zzblmVarZzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zZzt = zzblmVarZzb.zzt(ObjectWrapper.wrap(this));
                    }
                    removeAllViews();
                }
                zZzt = zzblmVarZzb.zzn(ObjectWrapper.wrap(this));
                if (zZzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            zzo.zzg("", e10);
        }
    }

    protected final synchronized void zza(zzbke zzbkeVar) {
        this.zzc = zzbkeVar;
        if (this.zzb) {
            zzbkeVar.zza(this.zza);
        }
    }

    protected final synchronized void zzb(zzbkg zzbkgVar) {
        this.zzf = zzbkgVar;
        if (this.zze) {
            zzbkgVar.zza(this.zzd);
        }
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
