package com.mbridge.msdk.thrid.okhttp;

import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f51573j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f51574k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f51575l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f51576m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f51579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f51580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f51581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f51582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f51583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f51584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f51585i;

    private k(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f51577a = str;
        this.f51578b = str2;
        this.f51579c = j10;
        this.f51580d = str3;
        this.f51581e = str4;
        this.f51582f = z10;
        this.f51583g = z11;
        this.f51585i = z12;
        this.f51584h = z13;
    }

    public String a() {
        return this.f51577a;
    }

    public String b() {
        return this.f51578b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f51577a.equals(this.f51577a) && kVar.f51578b.equals(this.f51578b) && kVar.f51580d.equals(this.f51580d) && kVar.f51581e.equals(this.f51581e) && kVar.f51579c == this.f51579c && kVar.f51582f == this.f51582f && kVar.f51583g == this.f51583g && kVar.f51584h == this.f51584h && kVar.f51585i == this.f51585i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f51577a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f51578b.hashCode()) * 31) + this.f51580d.hashCode()) * 31) + this.f51581e.hashCode()) * 31;
        long j10 = this.f51579c;
        return ((((((((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f51582f ? 1 : 0)) * 31) + (!this.f51583g ? 1 : 0)) * 31) + (!this.f51584h ? 1 : 0)) * 31) + (!this.f51585i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.mbridge.msdk.thrid.okhttp.internal.c.d(str);
    }

    private static long b(String str) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 <= 0) {
                return Long.MIN_VALUE;
            }
            return j10;
        } catch (NumberFormatException e10) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(TokenBuilder.TOKEN_DELIMITER) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    public static k a(s sVar, String str) {
        return a(System.currentTimeMillis(), sVar, str);
    }

    static k a(long j10, s sVar, String str) {
        long j11;
        String str2;
        String str3;
        int length = str.length();
        char c10 = ';';
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, length, ';');
        int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, iA, D5.T);
        String strA = null;
        if (iA2 == iA) {
            return null;
        }
        String strD = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, 0, iA2);
        if (strD.isEmpty() || com.mbridge.msdk.thrid.okhttp.internal.c.c(strD) != -1) {
            return null;
        }
        String strD2 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA2 + 1, iA);
        if (com.mbridge.msdk.thrid.okhttp.internal.c.c(strD2) != -1) {
            return null;
        }
        int i10 = iA + 1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        long jA = 253402300799999L;
        long jB = -1;
        String strSubstring = null;
        while (i10 < length) {
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i10, length, c10);
            int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i10, iA3, D5.T);
            String strD3 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, i10, iA4);
            String strD4 = iA4 < iA3 ? com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA4 + 1, iA3) : "";
            if (strD3.equalsIgnoreCase("expires")) {
                try {
                    jA = a(strD4, 0, strD4.length());
                    z10 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strD3.equalsIgnoreCase("max-age")) {
                jB = b(strD4);
                z10 = true;
            } else if (strD3.equalsIgnoreCase(C4240b4.j.D)) {
                strA = a(strD4);
                z13 = false;
            } else if (strD3.equalsIgnoreCase("path")) {
                strSubstring = strD4;
            } else if (strD3.equalsIgnoreCase("secure")) {
                z11 = true;
            } else if (strD3.equalsIgnoreCase("httponly")) {
                z12 = true;
            }
            i10 = iA3 + 1;
            c10 = ';';
        }
        if (jB == Long.MIN_VALUE) {
            j11 = Long.MIN_VALUE;
        } else if (jB != -1) {
            long j12 = j10 + (jB <= 9223372036854775L ? jB * 1000 : Long.MAX_VALUE);
            j11 = (j12 < j10 || j12 > DatesKt.MAX_DATE) ? 253402300799999L : j12;
        } else {
            j11 = jA;
        }
        String strG = sVar.g();
        if (strA == null) {
            str2 = strG;
        } else {
            if (!a(strG, strA)) {
                return null;
            }
            str2 = strA;
        }
        if (strG.length() != str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
            return null;
        }
        if (strSubstring == null || !strSubstring.startsWith("/")) {
            String strC = sVar.c();
            int iLastIndexOf = strC.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strC.substring(0, iLastIndexOf);
                str3 = strSubstring;
            } else {
                str3 = "/";
            }
        } else {
            str3 = strSubstring;
        }
        return new k(strD, strD2, j11, str2, str3, z11, z12, z13, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long a(java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.k.a(java.lang.String, int, int):long");
    }

    private static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static String a(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String strA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str);
            if (strA != null) {
                return strA;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<k> a(s sVar, r rVar) {
        List<String> listC = rVar.c(HttpHeaders.SET_COOKIE);
        int size = listC.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            k kVarA = a(sVar, listC.get(i10));
            if (kVarA != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVarA);
            }
        }
        if (arrayList != null) {
            return DesugarCollections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    String a(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51577a);
        sb2.append(D5.T);
        sb2.append(this.f51578b);
        if (this.f51584h) {
            if (this.f51579c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(com.mbridge.msdk.thrid.okhttp.internal.http.d.a(new Date(this.f51579c)));
            }
        }
        if (!this.f51585i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f51580d);
        }
        sb2.append("; path=");
        sb2.append(this.f51581e);
        if (this.f51582f) {
            sb2.append("; secure");
        }
        if (this.f51583g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}
