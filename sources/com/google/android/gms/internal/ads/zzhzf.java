package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes8.dex */
final class zzhzf extends Writer implements AutoCloseable {
    private final Appendable zza;
    private final zzhze zzb = new zzhze(null);

    zzhzf(Appendable appendable) {
        this.zza = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.zza.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(int i10) throws IOException {
        this.zza.append((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) throws IOException {
        Objects.requireNonNull(str);
        this.zza.append(str, i10, i11 + i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        this.zza.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        zzhze zzhzeVar = this.zzb;
        zzhzeVar.zza(cArr);
        this.zza.append(zzhzeVar, i10, i11 + i10);
    }
}
