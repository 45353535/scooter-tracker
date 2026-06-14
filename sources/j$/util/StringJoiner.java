package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class StringJoiner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f84811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84813f;

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.requireNonNull(charSequence2, "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull(charSequence3, "The suffix must not be null");
        this.f84808a = charSequence2.toString();
        this.f84809b = charSequence.toString();
        this.f84810c = charSequence3.toString();
    }

    public static int a(String str, char[] cArr, int i10) {
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return length;
    }

    public String toString() {
        String[] strArr;
        String[] strArr2 = this.f84811d;
        int i10 = this.f84812e;
        String str = this.f84808a;
        int length = str.length();
        String str2 = this.f84810c;
        int length2 = str2.length() + length;
        String str3 = this.f84809b;
        if (length2 != 0) {
            char[] cArr = new char[this.f84813f + length2];
            int iA = a(str, cArr, 0);
            if (i10 > 0) {
                iA = a(strArr2[0], cArr, iA) + iA;
                for (int i11 = 1; i11 < i10; i11++) {
                    int iA2 = a(str3, cArr, iA) + iA;
                    iA = a(strArr2[i11], cArr, iA2) + iA2;
                }
            }
            a(str2, cArr, iA);
            return new String(cArr);
        }
        if (this.f84812e > 1) {
            char[] cArr2 = new char[this.f84813f];
            int iA3 = a(this.f84811d[0], cArr2, 0);
            int i12 = 1;
            do {
                int iA4 = a(str3, cArr2, iA3) + iA3;
                iA3 = a(this.f84811d[i12], cArr2, iA4) + iA4;
                strArr = this.f84811d;
                strArr[i12] = null;
                i12++;
            } while (i12 < this.f84812e);
            this.f84812e = 1;
            strArr[0] = new String(cArr2);
        }
        return i10 == 0 ? "" : strArr2[0];
    }

    public StringJoiner add(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.f84811d;
        if (strArr == null) {
            this.f84811d = new String[8];
        } else {
            int i10 = this.f84812e;
            if (i10 == strArr.length) {
                this.f84811d = (String[]) Arrays.copyOf(strArr, i10 * 2);
            }
            this.f84813f = this.f84809b.length() + this.f84813f;
        }
        this.f84813f = strValueOf.length() + this.f84813f;
        String[] strArr2 = this.f84811d;
        int i11 = this.f84812e;
        this.f84812e = i11 + 1;
        strArr2[i11] = strValueOf;
        return this;
    }
}
