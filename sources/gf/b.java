package gf;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;
import pg.r;
import pg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final String a(CharsetDecoder charsetDecoder, s input, int i10) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, input.getBuffer().s()));
        a.a(charsetDecoder, input, sb2, i10);
        return sb2.toString();
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, s sVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, sVar, i10);
    }

    public static final s c(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        pg.a aVar = new pg.a();
        e(charsetEncoder, aVar, input, i10, i11);
        return aVar;
    }

    public static /* synthetic */ s d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i10, i11);
    }

    public static final void e(CharsetEncoder charsetEncoder, r destination, CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i10 >= i11) {
            return;
        }
        do {
            int iB = a.b(charsetEncoder, input, i10, i11, destination);
            if (iB < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i10 += iB;
        } while (i10 < i11);
    }
}
