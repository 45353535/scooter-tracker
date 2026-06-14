package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class Java8Compatibility {
    static void a(Buffer buffer) {
        buffer.clear();
    }

    static void b(Buffer buffer) {
        buffer.flip();
    }

    static void c(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    static void d(Buffer buffer, int i10) {
        buffer.position(i10);
    }
}
