package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final e a(pg.s source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new g0(source);
    }

    public static final e b(byte[] content, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        pg.a aVar = new pg.a();
        aVar.write(content, i10, i11 + i10);
        return a(aVar);
    }

    public static /* synthetic */ e c(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return b(bArr, i10, i11);
    }
}
