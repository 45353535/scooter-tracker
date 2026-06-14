package com.mbridge.msdk.thrid.okhttp;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.common.base.Ascii;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.DesugarCollections;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f51609j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f51610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f51613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f51614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f51615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f51616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f51617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f51618i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f51619a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f51622d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<String> f51624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<String> f51625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f51626h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f51620b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f51621c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51623e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f51624f = arrayList;
            arrayList.add("");
        }

        private boolean c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public a a(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f51623e = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA != null) {
                this.f51622d = strA;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        a d() {
            int size = this.f51624f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f51624f.set(i10, s.a(this.f51624f.get(i10), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
            }
            List<String> list = this.f51625g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f51625g.get(i11);
                    if (str != null) {
                        this.f51625g.set(i11, s.a(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                    }
                }
            }
            String str2 = this.f51626h;
            if (str2 != null) {
                this.f51626h = s.a(str2, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f51621c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f51619a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f51619a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f51620b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f51619a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f51620b.isEmpty() || !this.f51621c.isEmpty()) {
                sb2.append(this.f51620b);
                if (!this.f51621c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f51621c);
                }
                sb2.append('@');
            }
            String str2 = this.f51622d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f51622d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f51622d);
                }
            }
            if (this.f51623e != -1 || this.f51619a != null) {
                int iB = b();
                String str3 = this.f51619a;
                if (str3 == null || iB != s.a(str3)) {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            s.b(sb2, this.f51624f);
            if (this.f51625g != null) {
                sb2.append('?');
                s.a(sb2, this.f51625g);
            }
            if (this.f51626h != null) {
                sb2.append('#');
                sb2.append(this.f51626h);
            }
            return sb2.toString();
        }

        private void c() {
            if (!this.f51624f.remove(r0.size() - 1).isEmpty() || this.f51624f.isEmpty()) {
                this.f51624f.add("");
            } else {
                this.f51624f.set(r0.size() - 1, "");
            }
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public a a(String str) {
            this.f51625g = str != null ? s.d(s.a(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.f51619a != null) {
                if (this.f51622d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int b() {
            int i10 = this.f51623e;
            return i10 != -1 ? i10 : s.a(this.f51619a);
        }

        private static int b(String str, int i10, int i11) {
            int i12;
            try {
                i12 = Integer.parseInt(s.a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        private static int c(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private static int f(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        a a(s sVar, String str) {
            int iA;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iB = com.mbridge.msdk.thrid.okhttp.internal.c.b(str4, 0, str4.length());
            int iC = com.mbridge.msdk.thrid.okhttp.internal.c.c(str4, iB, str4.length());
            int iE = e(str4, iB, iC);
            if (iE != -1) {
                if (str4.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f51619a = "https";
                    iB += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iB, "http:", 0, 5)) {
                        this.f51619a = "http";
                        iB += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, iE) + "'");
                    }
                }
            } else if (sVar != null) {
                this.f51619a = sVar.f51610a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iF = f(str4, iB, iC);
            char c10 = '#';
            if (iF < 2 && sVar != null && sVar.f51610a.equals(this.f51619a)) {
                this.f51620b = sVar.f();
                this.f51621c = sVar.b();
                this.f51622d = sVar.f51613d;
                this.f51623e = sVar.f51614e;
                this.f51624f.clear();
                this.f51624f.addAll(sVar.d());
                if (iB == iC || str4.charAt(iB) == '#') {
                    a(sVar.e());
                }
                str2 = str4;
            } else {
                int i11 = iB + iF;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iC, "@/\\?#");
                    byte bCharAt = iA != iC ? str4.charAt(iA) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iA, ':');
                            String strA = s.a(str, i11, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strA = this.f51620b + "%40" + strA;
                            }
                            this.f51620b = strA;
                            if (iA2 != iA) {
                                i10 = iA;
                                this.f51621c = s.a(str, iA2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iA;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iA;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f51621c);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(s.a(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f51621c = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iC2 = c(str2, i12, iA);
                int i13 = iC2 + 1;
                if (i13 < iA) {
                    this.f51622d = a(str2, i12, iC2);
                    int iB2 = b(str2, i13, iA);
                    this.f51623e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i13, iA) + '\"');
                    }
                } else {
                    this.f51622d = a(str2, i12, iC2);
                    this.f51623e = s.a(this.f51619a);
                }
                if (this.f51622d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i12, iC2) + '\"');
                }
                iB = iA;
            }
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iB, iC, "?#");
            d(str2, iB, iA3);
            if (iA3 < iC && str2.charAt(iA3) == '?') {
                int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iA3, iC, '#');
                this.f51625g = s.d(s.a(str2, iA3 + 1, iA4, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str2.charAt(iA3) == '#') {
                this.f51626h = s.a(str2, iA3 + 1, iC, "", true, false, false, false, null);
            }
            return this;
        }

        private void d(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f51624f;
                list.set(list.size() - 1, "");
            } else {
                this.f51624f.clear();
                this.f51624f.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i12, i11, "/\\");
                boolean z10 = iA < i11;
                String str2 = str;
                a(str2, i12, iA, z10, true);
                if (z10) {
                    i12 = iA + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iA;
                }
            }
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String strA = s.a(str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, true, null);
            if (c(strA)) {
                return;
            }
            if (d(strA)) {
                c();
                return;
            }
            if (this.f51624f.get(r11.size() - 1).isEmpty()) {
                this.f51624f.set(r11.size() - 1, strA);
            } else {
                this.f51624f.add(strA);
            }
            if (z10) {
                this.f51624f.add("");
            }
        }

        private static String a(String str, int i10, int i11) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(s.a(str, i10, i11, false));
        }
    }

    s(a aVar) {
        this.f51610a = aVar.f51619a;
        this.f51611b = a(aVar.f51620b, false);
        this.f51612c = a(aVar.f51621c, false);
        this.f51613d = aVar.f51622d;
        this.f51614e = aVar.b();
        this.f51615f = a(aVar.f51624f, false);
        List<String> list = aVar.f51625g;
        this.f51616g = list != null ? a(list, true) : null;
        String str = aVar.f51626h;
        this.f51617h = str != null ? a(str, false) : null;
        this.f51618i = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public String b() {
        if (this.f51612c.isEmpty()) {
            return "";
        }
        return this.f51618i.substring(this.f51618i.indexOf(58, this.f51610a.length() + 3) + 1, this.f51618i.indexOf(64));
    }

    public String c() {
        int iIndexOf = this.f51618i.indexOf(47, this.f51610a.length() + 3);
        String str = this.f51618i;
        return this.f51618i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int iIndexOf = this.f51618i.indexOf(47, this.f51610a.length() + 3);
        String str = this.f51618i;
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f51618i, i10, iA, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.f51618i.substring(i10, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    public String e() {
        if (this.f51616g == null) {
            return null;
        }
        int iIndexOf = this.f51618i.indexOf(63) + 1;
        String str = this.f51618i;
        return this.f51618i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f51618i.equals(this.f51618i);
    }

    public String f() {
        if (this.f51611b.isEmpty()) {
            return "";
        }
        int length = this.f51610a.length() + 3;
        String str = this.f51618i;
        return this.f51618i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f51613d;
    }

    public boolean h() {
        return this.f51610a.equals("https");
    }

    public int hashCode() {
        return this.f51618i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f51619a = this.f51610a;
        aVar.f51620b = f();
        aVar.f51621c = b();
        aVar.f51622d = this.f51613d;
        aVar.f51623e = this.f51614e != a(this.f51610a) ? this.f51614e : -1;
        aVar.f51624f.clear();
        aVar.f51624f.addAll(d());
        aVar.a(e());
        aVar.f51626h = a();
        return aVar;
    }

    public int j() {
        return this.f51614e;
    }

    public String k() {
        if (this.f51616g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        a(sb2, this.f51616g);
        return sb2.toString();
    }

    public String l() {
        return c("/...").g("").e("").a().toString();
    }

    public String m() {
        return this.f51610a;
    }

    public URI n() {
        String string = i().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String toString() {
        return this.f51618i;
    }

    static void a(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append(D5.T);
                sb2.append(str2);
            }
        }
    }

    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(list.get(i10));
        }
    }

    public s e(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static s b(String str) {
        return new a().a(null, str).a();
    }

    public String a() {
        if (this.f51617h == null) {
            return null;
        }
        return this.f51618i.substring(this.f51618i.indexOf(35) + 1);
    }

    static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, i12);
                a(cVar, str, i12, i11, z10);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(com.mbridge.msdk.thrid.okio.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.writeByte(r1)
            goto L3c
        L39:
            r5.f(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.s.a(com.mbridge.msdk.thrid.okio.c, java.lang.String, int, int, boolean):void");
    }

    static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12)) != -1;
    }

    static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || a(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, iCharCount);
                a(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    cVar.a(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || a(str, i10, i11)))))) {
                    cVar.f(iCodePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset != null && !charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.f51210j)) {
                        cVar2.a(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        cVar2.f(iCodePointAt);
                    }
                    while (!cVar2.f()) {
                        byte b10 = cVar2.readByte();
                        cVar.writeByte(37);
                        char[] cArr = f51609j;
                        cVar.writeByte((int) cArr[((b10 & 255) >> 4) & 15]);
                        cVar.writeByte((int) cArr[b10 & Ascii.SI]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
