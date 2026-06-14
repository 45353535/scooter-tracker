package zg;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f119478a = m.f119446c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119479b;

    private final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= j1.a().length || (b10 = j1.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f119478a[iF] = cCharAt;
                i11 = i12;
                i10++;
            } else {
                if (b10 == 1) {
                    String str2 = j1.b()[cCharAt];
                    Intrinsics.checkNotNull(str2);
                    int iF2 = f(iF, str2.length());
                    str2.getChars(0, str2.length(), this.f119478a, iF2);
                    i11 = iF2 + str2.length();
                    this.f119479b = i11;
                } else {
                    char[] cArr = this.f119478a;
                    cArr[iF] = IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr[iF + 1] = (char) b10;
                    i11 = iF + 2;
                    this.f119479b = i11;
                }
                i10++;
            }
        }
        int iF3 = f(i11, 1);
        this.f119478a[iF3] = '\"';
        this.f119479b = iF3 + 1;
    }

    private final void e(int i10) {
        f(this.f119479b, i10);
    }

    private final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f119478a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, kotlin.ranges.g.e(i12, i10 * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f119478a = cArrCopyOf;
        }
        return i10;
    }

    @Override // zg.b0
    public void a(char c10) {
        e(1);
        char[] cArr = this.f119478a;
        int i10 = this.f119479b;
        this.f119479b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // zg.b0
    public void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f119478a;
        int i10 = this.f119479b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < j1.a().length && j1.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f119479b = i12 + 1;
    }

    @Override // zg.b0
    public void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f119478a, this.f119479b);
        this.f119479b += length;
    }

    public void g() {
        m.f119446c.c(this.f119478a);
    }

    public String toString() {
        return new String(this.f119478a, 0, this.f119479b);
    }

    @Override // zg.b0
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
