package gf;

import hf.e;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import pg.q;
import pg.r;
import pg.s;
import pg.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final int a(CharsetDecoder charsetDecoder, s input, Appendable dst, int i10) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (Intrinsics.areEqual(f(charsetDecoder), Charsets.UTF_8)) {
            String strC = u.c(input);
            dst.append(strC);
            return strC.length();
        }
        long jB = e.b(input);
        dst.append(qg.b.a(pg.d.a(input), f(charsetDecoder)));
        return (int) jB;
    }

    public static final int b(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11, r dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        byte[] bArrC = c(charsetEncoder, input, i10, i11);
        q.a(dst, bArrC, 0, 0, 6, null);
        return bArrC.length;
    }

    public static final byte[] c(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (!(input instanceof String)) {
            return d(charsetEncoder, input, i10, i11);
        }
        if (i10 == 0) {
            String str = (String) input;
            if (i11 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return bytes;
            }
        }
        String strSubstring = ((String) input).substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        return bytes2;
    }

    private static final byte[] d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i10, i11));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final Charset e(Charsets charsets, String name) {
        Intrinsics.checkNotNullParameter(charsets, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Charset charsetForName = Charset.forName(name);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return charsetForName;
    }

    public static final Charset f(CharsetDecoder charsetDecoder) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Charset charset = charsetDecoder.charset();
        Intrinsics.checkNotNull(charset);
        return charset;
    }

    public static final String g(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String strName = charset.name();
        Intrinsics.checkNotNullExpressionValue(strName, "name(...)");
        return strName;
    }
}
