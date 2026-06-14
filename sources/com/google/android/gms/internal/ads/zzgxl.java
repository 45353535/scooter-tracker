package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
final class zzgxl extends zzgxc {
    private final File zza;

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 20);
        sb2.append("Files.asByteSource(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final /* bridge */ /* synthetic */ InputStream zza() throws IOException {
        return new FileInputStream(this.zza);
    }
}
