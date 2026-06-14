package com.google.android.odml.image;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
final class zzf implements zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f28615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageProperties f28616b;

    public zzf(ByteBuffer byteBuffer, int i10) {
        this.f28615a = byteBuffer;
        zzb zzbVar = new zzb();
        zzbVar.b(2);
        zzbVar.a(i10);
        this.f28616b = zzbVar.c();
    }

    public final ByteBuffer zza() {
        return this.f28615a;
    }

    @Override // com.google.android.odml.image.zzg
    public final ImageProperties zzb() {
        return this.f28616b;
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
    }
}
