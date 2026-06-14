package com.google.common.io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.ironsource.D5;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BaseEncoding f30838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BaseEncoding f30839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BaseEncoding f30840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BaseEncoding f30841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BaseEncoding f30842e;

    static final class Alphabet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f30856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f30857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f30858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f30859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f30860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f30861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f30862h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f30863i;

        Alphabet(String str, char[] cArr) {
            this(str, cArr, c(cArr), false);
        }

        private static byte[] c(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                boolean z10 = true;
                Preconditions.checkArgument(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                Preconditions.checkArgument(z10, "Duplicate character: %s", c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }

        private boolean f() {
            for (char c10 : this.f30856b) {
                if (Ascii.isLowerCase(c10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean g() {
            for (char c10 : this.f30856b) {
                if (Ascii.isUpperCase(c10)) {
                    return true;
                }
            }
            return false;
        }

        boolean b(char c10) {
            return c10 <= 127 && this.f30861g[c10] != -1;
        }

        int d(char c10) throws DecodingException {
            if (c10 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            byte b10 = this.f30861g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            throw new DecodingException("Unrecognized character: " + c10);
        }

        char e(int i10) {
            return this.f30856b[i10];
        }

        public boolean equals(Object obj) {
            if (obj instanceof Alphabet) {
                Alphabet alphabet = (Alphabet) obj;
                if (this.f30863i == alphabet.f30863i && Arrays.equals(this.f30856b, alphabet.f30856b)) {
                    return true;
                }
            }
            return false;
        }

        Alphabet h() {
            if (this.f30863i) {
                return this;
            }
            byte[] bArr = this.f30861g;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i10 = 65;
            while (true) {
                if (i10 > 90) {
                    return new Alphabet(this.f30855a + ".ignoreCase()", this.f30856b, bArrCopyOf, true);
                }
                int i11 = i10 | 32;
                byte[] bArr2 = this.f30861g;
                byte b10 = bArr2[i10];
                byte b11 = bArr2[i11];
                if (b10 == -1) {
                    bArrCopyOf[i10] = b11;
                } else {
                    Preconditions.checkState(b11 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i10, (char) i11);
                    bArrCopyOf[i11] = b10;
                }
                i10++;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.f30856b) + (this.f30863i ? 1231 : 1237);
        }

        boolean i(int i10) {
            return this.f30862h[i10 % this.f30859e];
        }

        Alphabet j() {
            if (!g()) {
                return this;
            }
            Preconditions.checkState(!f(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f30856b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f30856b;
                if (i10 >= cArr2.length) {
                    break;
                }
                cArr[i10] = Ascii.toLowerCase(cArr2[i10]);
                i10++;
            }
            Alphabet alphabet = new Alphabet(this.f30855a + ".lowerCase()", cArr);
            return this.f30863i ? alphabet.h() : alphabet;
        }

        Alphabet k() {
            if (!f()) {
                return this;
            }
            Preconditions.checkState(!g(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f30856b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f30856b;
                if (i10 >= cArr2.length) {
                    break;
                }
                cArr[i10] = Ascii.toUpperCase(cArr2[i10]);
                i10++;
            }
            Alphabet alphabet = new Alphabet(this.f30855a + ".upperCase()", cArr);
            return this.f30863i ? alphabet.h() : alphabet;
        }

        public boolean matches(char c10) {
            byte[] bArr = this.f30861g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public String toString() {
            return this.f30855a;
        }

        private Alphabet(String str, char[] cArr, byte[] bArr, boolean z10) {
            this.f30855a = (String) Preconditions.checkNotNull(str);
            this.f30856b = (char[]) Preconditions.checkNotNull(cArr);
            try {
                int iLog2 = IntMath.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.f30858d = iLog2;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iLog2);
                int i10 = 1 << (3 - iNumberOfTrailingZeros);
                this.f30859e = i10;
                this.f30860f = iLog2 >> iNumberOfTrailingZeros;
                this.f30857c = cArr.length - 1;
                this.f30861g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f30860f; i11++) {
                    zArr[IntMath.divide(i11 * 8, this.f30858d, RoundingMode.CEILING)] = true;
                }
                this.f30862h = zArr;
                this.f30863i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }
    }

    private static final class Base16Encoding extends StandardBaseEncoding {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final char[] f30864k;

        Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException("Invalid input length " + charSequence.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f30868f.d(charSequence.charAt(i10)) << 4) | this.f30868f.d(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void c(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f30864k[i13]);
                appendable.append(this.f30864k[i13 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        BaseEncoding l(Alphabet alphabet, Character ch2) {
            return new Base16Encoding(alphabet);
        }

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.f30864k = new char[512];
            Preconditions.checkArgument(alphabet.f30856b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f30864k[i10] = alphabet.e(i10 >>> 4);
                this.f30864k[i10 | 256] = alphabet.e(i10 & 15);
            }
        }
    }

    private static final class Base64Encoding extends StandardBaseEncoding {
        Base64Encoding(String str, String str2, Character ch2) {
            this(new Alphabet(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f30868f.i(charSequenceJ.length())) {
                throw new DecodingException("Invalid input length " + charSequenceJ.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceJ.length()) {
                int i12 = i10 + 2;
                int iD = (this.f30868f.d(charSequenceJ.charAt(i10)) << 18) | (this.f30868f.d(charSequenceJ.charAt(i10 + 1)) << 12);
                int i13 = i11 + 1;
                bArr[i11] = (byte) (iD >>> 16);
                if (i12 < charSequenceJ.length()) {
                    int i14 = i10 + 3;
                    int iD2 = iD | (this.f30868f.d(charSequenceJ.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    bArr[i13] = (byte) ((iD2 >>> 8) & 255);
                    if (i14 < charSequenceJ.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((iD2 | this.f30868f.d(charSequenceJ.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i11 = i13;
                    i10 = i12;
                }
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void c(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            Preconditions.checkNotNull(appendable);
            int i12 = i10 + i11;
            Preconditions.checkPositionIndexes(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 2;
                int i14 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
                i10 += 3;
                int i15 = i14 | (bArr[i13] & 255);
                appendable.append(this.f30868f.e(i15 >>> 18));
                appendable.append(this.f30868f.e((i15 >>> 12) & 63));
                appendable.append(this.f30868f.e((i15 >>> 6) & 63));
                appendable.append(this.f30868f.e(i15 & 63));
                i11 -= 3;
            }
            if (i10 < i12) {
                k(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        BaseEncoding l(Alphabet alphabet, Character ch2) {
            return new Base64Encoding(alphabet, ch2);
        }

        private Base64Encoding(Alphabet alphabet, Character ch2) {
            super(alphabet, ch2);
            Preconditions.checkArgument(alphabet.f30856b.length == 64);
        }
    }

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    static final class SeparatedBaseEncoding extends BaseEncoding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final BaseEncoding f30865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f30866g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f30867h;

        SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i10) {
            this.f30865f = (BaseEncoding) Preconditions.checkNotNull(baseEncoding);
            this.f30866g = (String) Preconditions.checkNotNull(str);
            this.f30867h = i10;
            Preconditions.checkArgument(i10 > 0, "Cannot add a separator after every %s chars", i10);
        }

        @Override // com.google.common.io.BaseEncoding
        int b(byte[] bArr, CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder(charSequence.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                char cCharAt = charSequence.charAt(i10);
                if (this.f30866g.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.f30865f.b(bArr, sb2);
        }

        @Override // com.google.common.io.BaseEncoding
        void c(Appendable appendable, byte[] bArr, int i10, int i11) {
            this.f30865f.c(BaseEncoding.h(appendable, this.f30866g, this.f30867h), bArr, i10, i11);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                char cCharAt = charSequence.charAt(i10);
                if (this.f30866g.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.f30865f.canDecode(sb2);
        }

        @Override // com.google.common.io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
            return this.f30865f.decodingStream(BaseEncoding.e(reader, this.f30866g));
        }

        @Override // com.google.common.io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
            return this.f30865f.encodingStream(BaseEncoding.i(writer, this.f30866g, this.f30867h));
        }

        @Override // com.google.common.io.BaseEncoding
        int f(int i10) {
            return this.f30865f.f(i10);
        }

        @Override // com.google.common.io.BaseEncoding
        int g(int i10) {
            int iG = this.f30865f.g(i10);
            return iG + (this.f30866g.length() * IntMath.divide(Math.max(0, iG - 1), this.f30867h, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding ignoreCase() {
            return this.f30865f.ignoreCase().withSeparator(this.f30866g, this.f30867h);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence j(CharSequence charSequence) {
            return this.f30865f.j(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.f30865f.lowerCase().withSeparator(this.f30866g, this.f30867h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.f30865f.omitPadding().withSeparator(this.f30866g, this.f30867h);
        }

        public String toString() {
            return this.f30865f + ".withSeparator(\"" + this.f30866g + "\", " + this.f30867h + ")";
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.f30865f.upperCase().withSeparator(this.f30866g, this.f30867h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c10) {
            return this.f30865f.withPadChar(c10).withSeparator(this.f30866g, this.f30867h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i10) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    private static class StandardBaseEncoding extends BaseEncoding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Alphabet f30868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Character f30869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile BaseEncoding f30870h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile BaseEncoding f30871i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile BaseEncoding f30872j;

        StandardBaseEncoding(String str, String str2, Character ch2) {
            this(new Alphabet(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Alphabet alphabet;
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f30868f.i(charSequenceJ.length())) {
                throw new DecodingException("Invalid input length " + charSequenceJ.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceJ.length()) {
                long jD = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    alphabet = this.f30868f;
                    if (i12 >= alphabet.f30859e) {
                        break;
                    }
                    jD <<= alphabet.f30858d;
                    if (i10 + i12 < charSequenceJ.length()) {
                        jD |= (long) this.f30868f.d(charSequenceJ.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = alphabet.f30860f;
                int i15 = (i14 * 8) - (i13 * alphabet.f30858d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((jD >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f30868f.f30859e;
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding
        void c(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                k(appendable, bArr, i10 + i12, Math.min(this.f30868f.f30860f, i11 - i12));
                i12 += this.f30868f.f30860f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f30868f.i(charSequenceJ.length())) {
                return false;
            }
            for (int i10 = 0; i10 < charSequenceJ.length(); i10++) {
                if (!this.f30868f.b(charSequenceJ.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public InputStream decodingStream(final Reader reader) {
            Preconditions.checkNotNull(reader);
            return new InputStream(this) { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f30878b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f30879c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f30880d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                boolean f30881e = false;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ StandardBaseEncoding f30883g;

                {
                    this.f30883g = this;
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    reader.close();
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
                
                    throw new com.google.common.io.BaseEncoding.DecodingException("Padding cannot start at index " + r4.f30880d);
                 */
                @Override // java.io.InputStream
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public int read() throws java.io.IOException {
                    /*
                        r4 = this;
                    L0:
                        java.io.Reader r0 = r2
                        int r0 = r0.read()
                        r1 = -1
                        if (r0 != r1) goto L34
                        boolean r0 = r4.f30881e
                        if (r0 != 0) goto L33
                        com.google.common.io.BaseEncoding$StandardBaseEncoding r0 = r4.f30883g
                        com.google.common.io.BaseEncoding$Alphabet r0 = r0.f30868f
                        int r2 = r4.f30880d
                        boolean r0 = r0.i(r2)
                        if (r0 == 0) goto L1a
                        goto L33
                    L1a:
                        com.google.common.io.BaseEncoding$DecodingException r0 = new com.google.common.io.BaseEncoding$DecodingException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Invalid input length "
                        r1.append(r2)
                        int r2 = r4.f30880d
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                    L33:
                        return r1
                    L34:
                        int r1 = r4.f30880d
                        r2 = 1
                        int r1 = r1 + r2
                        r4.f30880d = r1
                        char r0 = (char) r0
                        com.google.common.io.BaseEncoding$StandardBaseEncoding r1 = r4.f30883g
                        java.lang.Character r1 = r1.f30869g
                        if (r1 == 0) goto L78
                        char r1 = r1.charValue()
                        if (r1 != r0) goto L78
                        boolean r0 = r4.f30881e
                        if (r0 != 0) goto L75
                        int r0 = r4.f30880d
                        if (r0 == r2) goto L5c
                        com.google.common.io.BaseEncoding$StandardBaseEncoding r1 = r4.f30883g
                        com.google.common.io.BaseEncoding$Alphabet r1 = r1.f30868f
                        int r0 = r0 + (-1)
                        boolean r0 = r1.i(r0)
                        if (r0 == 0) goto L5c
                        goto L75
                    L5c:
                        com.google.common.io.BaseEncoding$DecodingException r0 = new com.google.common.io.BaseEncoding$DecodingException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Padding cannot start at index "
                        r1.append(r2)
                        int r2 = r4.f30880d
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                    L75:
                        r4.f30881e = r2
                        goto L0
                    L78:
                        boolean r1 = r4.f30881e
                        if (r1 != 0) goto La4
                        int r1 = r4.f30878b
                        com.google.common.io.BaseEncoding$StandardBaseEncoding r2 = r4.f30883g
                        com.google.common.io.BaseEncoding$Alphabet r2 = r2.f30868f
                        int r3 = r2.f30858d
                        int r1 = r1 << r3
                        r4.f30878b = r1
                        int r0 = r2.d(r0)
                        r0 = r0 | r1
                        r4.f30878b = r0
                        int r1 = r4.f30879c
                        com.google.common.io.BaseEncoding$StandardBaseEncoding r2 = r4.f30883g
                        com.google.common.io.BaseEncoding$Alphabet r2 = r2.f30868f
                        int r2 = r2.f30858d
                        int r1 = r1 + r2
                        r4.f30879c = r1
                        r2 = 8
                        if (r1 < r2) goto L0
                        int r1 = r1 - r2
                        r4.f30879c = r1
                        int r0 = r0 >> r1
                        r0 = r0 & 255(0xff, float:3.57E-43)
                        return r0
                    La4:
                        com.google.common.io.BaseEncoding$DecodingException r1 = new com.google.common.io.BaseEncoding$DecodingException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Expected padding character but found '"
                        r2.append(r3)
                        r2.append(r0)
                        java.lang.String r0 = "' at index "
                        r2.append(r0)
                        int r0 = r4.f30880d
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.StandardBaseEncoding.AnonymousClass2.read():int");
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i10, int i11) throws IOException {
                    int i12 = i11 + i10;
                    Preconditions.checkPositionIndexes(i10, i12, bArr.length);
                    int i13 = i10;
                    while (i13 < i12) {
                        int i14 = read();
                        if (i14 == -1) {
                            int i15 = i13 - i10;
                            if (i15 == 0) {
                                return -1;
                            }
                            return i15;
                        }
                        bArr[i13] = (byte) i14;
                        i13++;
                    }
                    return i13 - i10;
                }
            };
        }

        @Override // com.google.common.io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public OutputStream encodingStream(final Writer writer) {
            Preconditions.checkNotNull(writer);
            return new OutputStream(this) { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f30873b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f30874c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f30875d = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ StandardBaseEncoding f30877f;

                {
                    this.f30877f = this;
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    int i10 = this.f30874c;
                    if (i10 > 0) {
                        int i11 = this.f30873b;
                        Alphabet alphabet = this.f30877f.f30868f;
                        writer.write(alphabet.e((i11 << (alphabet.f30858d - i10)) & alphabet.f30857c));
                        this.f30875d++;
                        if (this.f30877f.f30869g != null) {
                            while (true) {
                                int i12 = this.f30875d;
                                StandardBaseEncoding standardBaseEncoding = this.f30877f;
                                if (i12 % standardBaseEncoding.f30868f.f30859e == 0) {
                                    break;
                                }
                                writer.write(standardBaseEncoding.f30869g.charValue());
                                this.f30875d++;
                            }
                        }
                    }
                    writer.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws IOException {
                    writer.flush();
                }

                @Override // java.io.OutputStream
                public void write(int i10) throws IOException {
                    this.f30873b = (i10 & 255) | (this.f30873b << 8);
                    this.f30874c += 8;
                    while (true) {
                        int i11 = this.f30874c;
                        Alphabet alphabet = this.f30877f.f30868f;
                        int i12 = alphabet.f30858d;
                        if (i11 < i12) {
                            return;
                        }
                        writer.write(alphabet.e((this.f30873b >> (i11 - i12)) & alphabet.f30857c));
                        this.f30875d++;
                        this.f30874c -= this.f30877f.f30868f.f30858d;
                    }
                }
            };
        }

        public boolean equals(Object obj) {
            if (obj instanceof StandardBaseEncoding) {
                StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
                if (this.f30868f.equals(standardBaseEncoding.f30868f) && Objects.equals(this.f30869g, standardBaseEncoding.f30869g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        int f(int i10) {
            return (int) (((((long) this.f30868f.f30858d) * ((long) i10)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        int g(int i10) {
            Alphabet alphabet = this.f30868f;
            return alphabet.f30859e * IntMath.divide(i10, alphabet.f30860f, RoundingMode.CEILING);
        }

        public int hashCode() {
            return this.f30868f.hashCode() ^ Objects.hashCode(this.f30869g);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding ignoreCase() {
            BaseEncoding baseEncodingL = this.f30872j;
            if (baseEncodingL == null) {
                Alphabet alphabetH = this.f30868f.h();
                baseEncodingL = alphabetH == this.f30868f ? this : l(alphabetH, this.f30869g);
                this.f30872j = baseEncodingL;
            }
            return baseEncodingL;
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence j(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch2 = this.f30869g;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void k(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
            int i12 = 0;
            Preconditions.checkArgument(i11 <= this.f30868f.f30860f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f30868f.f30858d;
            while (i12 < i11 * 8) {
                Alphabet alphabet = this.f30868f;
                appendable.append(alphabet.e(((int) (j10 >>> (i14 - i12))) & alphabet.f30857c));
                i12 += this.f30868f.f30858d;
            }
            if (this.f30869g != null) {
                while (i12 < this.f30868f.f30860f * 8) {
                    appendable.append(this.f30869g.charValue());
                    i12 += this.f30868f.f30858d;
                }
            }
        }

        BaseEncoding l(Alphabet alphabet, Character ch2) {
            return new StandardBaseEncoding(alphabet, ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncodingL = this.f30871i;
            if (baseEncodingL == null) {
                Alphabet alphabetJ = this.f30868f.j();
                baseEncodingL = alphabetJ == this.f30868f ? this : l(alphabetJ, this.f30869g);
                this.f30871i = baseEncodingL;
            }
            return baseEncodingL;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.f30869g == null ? this : l(this.f30868f, null);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f30868f);
            if (8 % this.f30868f.f30858d != 0) {
                if (this.f30869g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f30869g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncodingL = this.f30870h;
            if (baseEncodingL == null) {
                Alphabet alphabetK = this.f30868f.k();
                baseEncodingL = alphabetK == this.f30868f ? this : l(alphabetK, this.f30869g);
                this.f30870h = baseEncodingL;
            }
            return baseEncodingL;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c10) {
            Character ch2;
            return (8 % this.f30868f.f30858d == 0 || ((ch2 = this.f30869g) != null && ch2.charValue() == c10)) ? this : l(this.f30868f, Character.valueOf(c10));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i10) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                Preconditions.checkArgument(!this.f30868f.matches(str.charAt(i11)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch2 = this.f30869g;
            if (ch2 != null) {
                Preconditions.checkArgument(str.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new SeparatedBaseEncoding(this, str, i10);
        }

        StandardBaseEncoding(Alphabet alphabet, Character ch2) {
            this.f30868f = (Alphabet) Preconditions.checkNotNull(alphabet);
            Preconditions.checkArgument(ch2 == null || !alphabet.matches(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f30869g = ch2;
        }
    }

    static {
        Character chValueOf = Character.valueOf(D5.T);
        f30838a = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        f30839b = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        f30840c = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        f30841d = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        f30842e = new Base16Encoding("base16()", "0123456789ABCDEF");
    }

    BaseEncoding() {
    }

    public static BaseEncoding base16() {
        return f30842e;
    }

    public static BaseEncoding base32() {
        return f30840c;
    }

    public static BaseEncoding base32Hex() {
        return f30841d;
    }

    public static BaseEncoding base64() {
        return f30838a;
    }

    public static BaseEncoding base64Url() {
        return f30839b;
    }

    private static byte[] d(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    static Reader e(final Reader reader, final String str) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(str);
        return new Reader() { // from class: com.google.common.io.BaseEncoding.3
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                reader.close();
            }

            @Override // java.io.Reader
            public int read() throws IOException {
                int i10;
                do {
                    i10 = reader.read();
                    if (i10 == -1) {
                        break;
                    }
                } while (str.indexOf((char) i10) >= 0);
                return i10;
            }

            @Override // java.io.Reader
            public int read(char[] cArr, int i10, int i11) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    static Appendable h(Appendable appendable, String str, int i10) {
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(i10 > 0);
        return new Appendable(i10, appendable, str) { // from class: com.google.common.io.BaseEncoding.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f30849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f30850c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Appendable f30851d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f30852e;

            {
                this.f30850c = i10;
                this.f30851d = appendable;
                this.f30852e = str;
                this.f30849b = i10;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c10) throws IOException {
                if (this.f30849b == 0) {
                    this.f30851d.append(this.f30852e);
                    this.f30849b = this.f30850c;
                }
                this.f30851d.append(c10);
                this.f30849b--;
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i11, int i12) {
                throw new UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) {
                throw new UnsupportedOperationException();
            }
        };
    }

    static Writer i(final Writer writer, String str, int i10) {
        final Appendable appendableH = h(writer, str, i10);
        return new Writer() { // from class: com.google.common.io.BaseEncoding.5
            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                writer.close();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() throws IOException {
                writer.flush();
            }

            @Override // java.io.Writer
            public void write(int i11) throws IOException {
                appendableH.append((char) i11);
            }

            @Override // java.io.Writer
            public void write(char[] cArr, int i11, int i12) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    final byte[] a(CharSequence charSequence) {
        CharSequence charSequenceJ = j(charSequence);
        byte[] bArr = new byte[f(charSequenceJ.length())];
        return d(bArr, b(bArr, charSequenceJ));
    }

    abstract int b(byte[] bArr, CharSequence charSequence);

    abstract void c(Appendable appendable, byte[] bArr, int i10, int i11);

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
        try {
            return a(charSequence);
        } catch (DecodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public final ByteSource decodingSource(final CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        return new ByteSource(this) { // from class: com.google.common.io.BaseEncoding.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BaseEncoding f30846b;

            {
                this.f30846b = this;
            }

            @Override // com.google.common.io.ByteSource
            public InputStream openStream() throws IOException {
                return this.f30846b.decodingStream(charSource.openStream());
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public final ByteSink encodingSink(final CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        return new ByteSink(this) { // from class: com.google.common.io.BaseEncoding.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BaseEncoding f30844b;

            {
                this.f30844b = this;
            }

            @Override // com.google.common.io.ByteSink
            public OutputStream openStream() throws IOException {
                return this.f30844b.encodingStream(charSink.openStream());
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    abstract int f(int i10);

    abstract int g(int i10);

    public abstract BaseEncoding ignoreCase();

    CharSequence j(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    public abstract BaseEncoding lowerCase();

    public abstract BaseEncoding omitPadding();

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c10);

    public abstract BaseEncoding withSeparator(String str, int i10);

    public final String encode(byte[] bArr, int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(g(i11));
        try {
            c(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
