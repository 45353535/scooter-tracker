package qg;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final String a(a aVar, Charset charset) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(aVar.e(), charset);
    }
}
