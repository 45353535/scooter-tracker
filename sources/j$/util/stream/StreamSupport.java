package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamSupport {
    public static IntStream intStream(Spliterator.OfInt ofInt, boolean z10) {
        return new X(ofInt, EnumC5671a3.m(ofInt), z10);
    }
}
