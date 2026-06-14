package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f23558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f23560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23561d;

    public r2(d2 d2Var, String str, Object[] objArr) {
        char cCharAt;
        this.f23558a = d2Var;
        this.f23559b = str;
        this.f23560c = objArr;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            str = new String(charArray);
            try {
                try {
                    cCharAt = str.charAt(0);
                } catch (ArrayIndexOutOfBoundsException e10) {
                    e = e10;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str, Integer.valueOf(charArray.length)), e);
                } catch (StringIndexOutOfBoundsException e11) {
                    e = e11;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str, Integer.valueOf(charArray.length)), e);
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                char[] cArr = new char[str.length()];
                str.getChars(0, str.length(), cArr, 0);
                String str2 = new String(cArr);
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e12) {
                    e = e12;
                    str = str2;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str, Integer.valueOf(charArray.length)), e);
                }
            }
        }
        if (cCharAt < 55296) {
            this.f23561d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f23561d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }
}
