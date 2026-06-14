package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(19)
final class zzi implements zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Image f28617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageProperties f28618b;

    public zzi(Image image) {
        this.f28617a = image;
        zzb zzbVar = new zzb();
        zzbVar.b(3);
        int format = image.getFormat();
        zzbVar.a(format == 42 ? 1 : format == 41 ? 2 : format != 35 ? format != 256 ? 0 : 9 : 7);
        this.f28618b = zzbVar.c();
    }

    public final Image zza() {
        return this.f28617a;
    }

    @Override // com.google.android.odml.image.zzg
    public final ImageProperties zzb() {
        return this.f28618b;
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
        this.f28617a.close();
    }
}
