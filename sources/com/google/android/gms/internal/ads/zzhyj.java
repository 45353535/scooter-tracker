package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhyj {
    public static final zzhyj zza = new zzhyj("", "", false);
    private final String zzb;
    private final String zzc;
    private final boolean zzd;

    static {
        new zzhyj(IOUtils.LINE_SEPARATOR_UNIX, "  ", true);
    }

    private zzhyj(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z10;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
