package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfa extends IOException {
    zzfa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzfa(long j10, long j11, int i10, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10))), th2);
    }

    zzfa(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
