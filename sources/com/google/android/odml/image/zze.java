package com.google.android.odml.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes9.dex */
final class zze implements zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f28613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageProperties f28614b;

    public zze(Bitmap bitmap) {
        this.f28613a = bitmap;
        zzb zzbVar = new zzb();
        int i10 = zzd.f28612a[bitmap.getConfig().ordinal()];
        zzbVar.a(i10 != 1 ? i10 != 2 ? 0 : 1 : 8);
        zzbVar.b(1);
        this.f28614b = zzbVar.c();
    }

    public final Bitmap zza() {
        return this.f28613a;
    }

    @Override // com.google.android.odml.image.zzg
    public final ImageProperties zzb() {
        return this.f28614b;
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
        this.f28613a.recycle();
    }
}
