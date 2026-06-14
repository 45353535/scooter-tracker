package zg;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f119466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f119467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharsetDecoder f119468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteBuffer f119469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f119470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private char f119471f;

    public q(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f119466a = inputStream;
        this.f119467b = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        Intrinsics.checkNotNullExpressionValue(charsetDecoderOnUnmappableCharacter, "onUnmappableCharacter(...)");
        this.f119468c = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(j.f119431c.d());
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        this.f119469d = byteBufferWrap;
        byteBufferWrap.flip();
    }

    private final int a(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.f119468c.decode(this.f119469d, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (!z10 && charBufferWrap.hasRemaining()) {
                    if (b() < 0) {
                        if (charBufferWrap.position() == 0 && !this.f119469d.hasRemaining()) {
                            z10 = true;
                            break;
                        }
                        this.f119468c.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.f119468c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    private final int b() {
        this.f119469d.compact();
        try {
            int iLimit = this.f119469d.limit();
            int iPosition = this.f119469d.position();
            int i10 = this.f119466a.read(this.f119469d.array(), this.f119469d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i10 < 0) {
                return i10;
            }
            ByteBuffer byteBuffer = this.f119469d;
            Intrinsics.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i10);
            this.f119469d.flip();
            return this.f119469d.remaining();
        } finally {
            this.f119469d.flip();
        }
    }

    private final int c() {
        if (this.f119470e) {
            this.f119470e = false;
            return this.f119471f;
        }
        char[] cArr = new char[2];
        int iD = d(cArr, 0, 2);
        if (iD == -1) {
            return -1;
        }
        if (iD == 1) {
            return cArr[0];
        }
        if (iD == 2) {
            this.f119471f = cArr[1];
            this.f119470e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iD).toString());
    }

    public final int d(char[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= array.length || i11 < 0 || i10 + i11 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + array.length).toString());
        }
        if (this.f119470e) {
            array[i10] = this.f119471f;
            i10++;
            i11--;
            this.f119470e = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return a(array, i10, i11) + i12;
        }
        int iC = c();
        if (iC != -1) {
            array[i10] = (char) iC;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public final void e() {
        j jVar = j.f119431c;
        byte[] bArrArray = this.f119469d.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        jVar.c(bArrArray);
    }
}
