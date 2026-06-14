package zg;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f119472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f119473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char[] f119474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f119475d;

    public q0(OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f119472a = stream;
        this.f119473b = k.f119436c.d();
        this.f119474c = m.f119446c.d();
    }

    private final void d(int i10, String str) throws IOException {
        byte b10;
        int length = str.length();
        for (int i11 = i10 - 1; i11 < length; i11++) {
            int iE = e(i10, 2);
            char cCharAt = str.charAt(i11);
            if (cCharAt >= j1.a().length || (b10 = j1.a()[cCharAt]) == 0) {
                int i12 = iE + 1;
                this.f119474c[iE] = cCharAt;
                i10 = i12;
            } else {
                if (b10 == 1) {
                    String str2 = j1.b()[cCharAt];
                    Intrinsics.checkNotNull(str2);
                    int iE2 = e(iE, str2.length());
                    str2.getChars(0, str2.length(), this.f119474c, iE2);
                    i10 = iE2 + str2.length();
                } else {
                    char[] cArr = this.f119474c;
                    cArr[iE] = IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr[iE + 1] = (char) b10;
                    i10 = iE + 2;
                }
            }
        }
        e(i10, 1);
        char[] cArr2 = this.f119474c;
        cArr2[i10] = '\"';
        h(cArr2, i10 + 1);
        f();
    }

    private final int e(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f119474c;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, kotlin.ranges.g.e(i12, i10 * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f119474c = cArrCopyOf;
        }
        return i10;
    }

    private final void f() throws IOException {
        this.f119472a.write(this.f119473b, 0, this.f119475d);
        this.f119475d = 0;
    }

    private final void h(char[] cArr, int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i10 > cArr.length) {
            throw new IllegalArgumentException(("count > string.length: " + i10 + " > " + cArr.length).toString());
        }
        int i11 = 0;
        while (i11 < i10) {
            char c10 = cArr[i11];
            if (c10 < 128) {
                if (this.f119473b.length - this.f119475d < 1) {
                    f();
                }
                byte[] bArr = this.f119473b;
                int i12 = this.f119475d;
                int i13 = i12 + 1;
                this.f119475d = i13;
                bArr[i12] = (byte) c10;
                i11++;
                int iMin = Math.min(i10, (bArr.length - i13) + i11);
                while (i11 < iMin) {
                    char c11 = cArr[i11];
                    if (c11 < 128) {
                        byte[] bArr2 = this.f119473b;
                        int i14 = this.f119475d;
                        this.f119475d = i14 + 1;
                        bArr2[i14] = (byte) c11;
                        i11++;
                    }
                }
            } else {
                if (c10 < 2048) {
                    if (this.f119473b.length - this.f119475d < 2) {
                        f();
                    }
                    byte[] bArr3 = this.f119473b;
                    int i15 = this.f119475d;
                    int i16 = i15 + 1;
                    this.f119475d = i16;
                    bArr3[i15] = (byte) ((c10 >> 6) | 192);
                    this.f119475d = i15 + 2;
                    bArr3[i16] = (byte) ((c10 & '?') | 128);
                } else if (c10 < 55296 || c10 > 57343) {
                    if (this.f119473b.length - this.f119475d < 3) {
                        f();
                    }
                    byte[] bArr4 = this.f119473b;
                    int i17 = this.f119475d;
                    int i18 = i17 + 1;
                    this.f119475d = i18;
                    bArr4[i17] = (byte) ((c10 >> '\f') | 224);
                    int i19 = i17 + 2;
                    this.f119475d = i19;
                    bArr4[i18] = (byte) (((c10 >> 6) & 63) | 128);
                    this.f119475d = i17 + 3;
                    bArr4[i19] = (byte) ((c10 & '?') | 128);
                } else {
                    int i20 = i11 + 1;
                    char c12 = i20 < i10 ? cArr[i20] : (char) 0;
                    if (c10 > 56319 || 56320 > c12 || c12 >= 57344) {
                        if (this.f119473b.length - this.f119475d < 1) {
                            f();
                        }
                        byte[] bArr5 = this.f119473b;
                        int i21 = this.f119475d;
                        this.f119475d = i21 + 1;
                        bArr5[i21] = (byte) 63;
                        i11 = i20;
                    } else {
                        int i22 = (((c10 & 1023) << 10) | (c12 & 1023)) + 65536;
                        if (this.f119473b.length - this.f119475d < 4) {
                            f();
                        }
                        byte[] bArr6 = this.f119473b;
                        int i23 = this.f119475d;
                        int i24 = i23 + 1;
                        this.f119475d = i24;
                        bArr6[i23] = (byte) ((i22 >> 18) | 240);
                        int i25 = i23 + 2;
                        this.f119475d = i25;
                        bArr6[i24] = (byte) (((i22 >> 12) & 63) | 128);
                        int i26 = i23 + 3;
                        this.f119475d = i26;
                        bArr6[i25] = (byte) (((i22 >> 6) & 63) | 128);
                        this.f119475d = i23 + 4;
                        bArr6[i26] = (byte) ((i22 & 63) | 128);
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
    }

    private final void i(int i10) throws IOException {
        if (i10 < 128) {
            if (this.f119473b.length - this.f119475d < 1) {
                f();
            }
            byte[] bArr = this.f119473b;
            int i11 = this.f119475d;
            this.f119475d = i11 + 1;
            bArr[i11] = (byte) i10;
            return;
        }
        if (i10 < 2048) {
            if (this.f119473b.length - this.f119475d < 2) {
                f();
            }
            byte[] bArr2 = this.f119473b;
            int i12 = this.f119475d;
            int i13 = i12 + 1;
            this.f119475d = i13;
            bArr2[i12] = (byte) ((i10 >> 6) | 192);
            this.f119475d = i12 + 2;
            bArr2[i13] = (byte) ((i10 & 63) | 128);
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            if (this.f119473b.length - this.f119475d < 1) {
                f();
            }
            byte[] bArr3 = this.f119473b;
            int i14 = this.f119475d;
            this.f119475d = i14 + 1;
            bArr3[i14] = (byte) 63;
            return;
        }
        if (i10 < 65536) {
            if (this.f119473b.length - this.f119475d < 3) {
                f();
            }
            byte[] bArr4 = this.f119473b;
            int i15 = this.f119475d;
            int i16 = i15 + 1;
            this.f119475d = i16;
            bArr4[i15] = (byte) ((i10 >> 12) | 224);
            int i17 = i15 + 2;
            this.f119475d = i17;
            bArr4[i16] = (byte) (((i10 >> 6) & 63) | 128);
            this.f119475d = i15 + 3;
            bArr4[i17] = (byte) ((i10 & 63) | 128);
            return;
        }
        if (i10 > 1114111) {
            throw new g0("Unexpected code point: " + i10);
        }
        if (this.f119473b.length - this.f119475d < 4) {
            f();
        }
        byte[] bArr5 = this.f119473b;
        int i18 = this.f119475d;
        int i19 = i18 + 1;
        this.f119475d = i19;
        bArr5[i18] = (byte) ((i10 >> 18) | 240);
        int i20 = i18 + 2;
        this.f119475d = i20;
        bArr5[i19] = (byte) (((i10 >> 12) & 63) | 128);
        int i21 = i18 + 3;
        this.f119475d = i21;
        bArr5[i20] = (byte) (((i10 >> 6) & 63) | 128);
        this.f119475d = i18 + 4;
        bArr5[i21] = (byte) ((i10 & 63) | 128);
    }

    @Override // zg.b0
    public void a(char c10) throws IOException {
        i(c10);
    }

    @Override // zg.b0
    public void b(String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        e(0, text.length() + 2);
        char[] cArr = this.f119474c;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i10 = length + 1;
        for (int i11 = 1; i11 < i10; i11++) {
            char c10 = cArr[i11];
            if (c10 < j1.a().length && j1.a()[c10] != 0) {
                d(i11, text);
                return;
            }
        }
        cArr[i10] = '\"';
        h(cArr, length + 2);
        f();
    }

    @Override // zg.b0
    public void c(String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        e(0, length);
        text.getChars(0, length, this.f119474c, 0);
        h(this.f119474c, length);
    }

    public void g() throws IOException {
        f();
        m.f119446c.c(this.f119474c);
        k.f119436c.c(this.f119473b);
    }

    @Override // zg.b0
    public void writeLong(long j10) throws IOException {
        c(String.valueOf(j10));
    }
}
