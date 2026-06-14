package hh;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okio.Utf8;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.common.base.Ascii;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f73749k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f73750l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f73751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f73752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f73753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f73754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f73755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f73756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f73757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f73758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f73759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f73760j;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0914a f73761i = new C0914a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f73762a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f73765d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f73767f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f73768g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f73769h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f73763b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f73764c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f73766e = -1;

        /* JADX INFO: renamed from: hh.u$a$a, reason: collision with other inner class name */
        public static final class C0914a {
            public /* synthetic */ C0914a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                int i12;
                try {
                    i12 = Integer.parseInt(b.b(u.f73749k, str, i10, i11, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i12 || i12 >= 65536) {
                    return -1;
                }
                return i12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, 122) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
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

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
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

            private C0914a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f73767f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i10 = this.f73766e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.f73749k;
            String str = this.f73762a;
            Intrinsics.checkNotNull(str);
            return bVar.c(str);
        }

        private final boolean f(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt.N(str, "%2e", true);
        }

        private final boolean g(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt.N(str, "%2e.", true) || StringsKt.N(str, ".%2e", true) || StringsKt.N(str, "%2e%2e", true);
        }

        private final void j() {
            if (((String) this.f73767f.remove(r0.size() - 1)).length() != 0 || this.f73767f.isEmpty()) {
                this.f73767f.add("");
            } else {
                this.f73767f.set(r0.size() - 1, "");
            }
        }

        private final void l(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = b.b(u.f73749k, str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, false, null, 240, null);
            if (f(strB)) {
                return;
            }
            if (g(strB)) {
                j();
                return;
            }
            if (((CharSequence) this.f73767f.get(r14.size() - 1)).length() == 0) {
                this.f73767f.set(r14.size() - 1, strB);
            } else {
                this.f73767f.add(strB);
            }
            if (z10) {
                this.f73767f.add("");
            }
        }

        private final void n(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f73767f.clear();
                this.f73767f.add("");
                i10++;
            } else {
                List list = this.f73767f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iQ = ih.d.q(str, "/\\", i12, i11);
                boolean z10 = iQ < i11;
                String str2 = str;
                l(str2, i12, iQ, z10, true);
                if (z10) {
                    i12 = iQ + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iQ;
                }
            }
        }

        public final u a() {
            ArrayList arrayList;
            String str = this.f73762a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f73749k;
            String strH = b.h(bVar, this.f73763b, 0, 0, false, 7, null);
            String strH2 = b.h(bVar, this.f73764c, 0, 0, false, 7, null);
            String str2 = this.f73765d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f73767f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.h(u.f73749k, (String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.f73768g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? b.h(u.f73749k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f73769h;
            return new u(str, strH, strH2, str2, iB, arrayList2, arrayList, str4 != null ? b.h(u.f73749k, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final a c(String str) {
            b bVar;
            String strB;
            this.f73768g = (str == null || (strB = b.b((bVar = u.f73749k), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null)) == null) ? null : bVar.j(strB);
            return this;
        }

        public final List d() {
            return this.f73767f;
        }

        public final a e(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strE = ih.a.e(b.h(u.f73749k, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.f73765d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a h(u uVar, String str) {
            String str2;
            int iQ;
            int i10;
            int i11;
            boolean z10;
            int i12;
            int i13;
            char c10;
            int i14;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int iA = ih.d.A(input, 0, 0, 3, null);
            int iC = ih.d.C(input, iA, 0, 2, null);
            C0914a c0914a = f73761i;
            int iG = c0914a.g(input, iA, iC);
            boolean z11 = true;
            byte b10 = -1;
            if (iG != -1) {
                if (StringsKt.X(input, "https:", iA, true)) {
                    this.f73762a = "https";
                    iA += 6;
                } else {
                    if (!StringsKt.X(input, "http:", iA, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f73762a = "http";
                    iA += 5;
                }
            } else {
                if (uVar == null) {
                    if (input.length() > 6) {
                        str2 = StringsKt.J1(input, 6) + APSSharedUtil.TRUNCATE_SEPARATOR;
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f73762a = uVar.p();
            }
            int iH = c0914a.h(input, iA, iC);
            byte b11 = Utf8.REPLACEMENT_BYTE;
            byte b12 = 35;
            if (iH >= 2 || uVar == null || !Intrinsics.areEqual(uVar.p(), this.f73762a)) {
                int i15 = iA + iH;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    iQ = ih.d.q(input, "@/\\?#", i15, iC);
                    byte bCharAt = iQ != iC ? input.charAt(iQ) : b10;
                    if (bCharAt == b10 || bCharAt == b12 || bCharAt == 47 || bCharAt == 92 || bCharAt == b11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z12) {
                            i11 = iC;
                            z10 = z11;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f73764c);
                            sb3.append("%40");
                            input = str;
                            i12 = iQ;
                            sb3.append(b.b(u.f73749k, input, i15, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f73764c = sb3.toString();
                        } else {
                            int iP = ih.d.p(input, ':', i15, iQ);
                            b bVar = u.f73749k;
                            i11 = iC;
                            z10 = z11;
                            String strB = b.b(bVar, input, i15, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z13) {
                                strB = this.f73763b + "%40" + strB;
                            }
                            this.f73763b = strB;
                            if (iP != iQ) {
                                i13 = iQ;
                                this.f73764c = b.b(bVar, str, iP + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = z10;
                            } else {
                                i13 = iQ;
                            }
                            input = str;
                            i12 = i13;
                            z13 = z10;
                        }
                        i15 = i12 + 1;
                        iC = i11;
                        z11 = z10;
                        b11 = Utf8.REPLACEMENT_BYTE;
                        b10 = -1;
                        b12 = 35;
                    }
                }
                i10 = iC;
                C0914a c0914a2 = f73761i;
                int iF = c0914a2.f(input, i15, iQ);
                int i16 = iF + 1;
                if (i16 < iQ) {
                    this.f73765d = ih.a.e(b.h(u.f73749k, input, i15, iF, false, 4, null));
                    int iE = c0914a2.e(input, i16, iQ);
                    this.f73766e = iE;
                    if (iE == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i16, iQ);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    b bVar2 = u.f73749k;
                    this.f73765d = ih.a.e(b.h(bVar2, input, i15, iF, false, 4, null));
                    String str3 = this.f73762a;
                    Intrinsics.checkNotNull(str3);
                    this.f73766e = bVar2.c(str3);
                }
                if (this.f73765d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i15, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iA = iQ;
            } else {
                this.f73763b = uVar.g();
                this.f73764c = uVar.c();
                this.f73765d = uVar.h();
                this.f73766e = uVar.l();
                this.f73767f.clear();
                this.f73767f.addAll(uVar.e());
                if (iA == iC || input.charAt(iA) == '#') {
                    c(uVar.f());
                }
                i10 = iC;
            }
            int i17 = i10;
            int iQ2 = ih.d.q(input, "?#", iA, i17);
            n(input, iA, iQ2);
            if (iQ2 >= i17 || input.charAt(iQ2) != '?') {
                c10 = '#';
                i14 = iQ2;
            } else {
                c10 = '#';
                int iP2 = ih.d.p(input, '#', iQ2, i17);
                b bVar3 = u.f73749k;
                this.f73768g = bVar3.j(b.b(bVar3, input, iQ2 + 1, iP2, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i14 = iP2;
            }
            if (i14 < i17 && input.charAt(i14) == c10) {
                this.f73769h = b.b(u.f73749k, input, i14 + 1, i17, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a i(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.f73764c = b.b(u.f73749k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a k(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f73766e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a m() {
            String str = this.f73765d;
            this.f73765d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f73767f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f73767f;
                list.set(i10, b.b(u.f73749k, (String) list.get(i10), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List list2 = this.f73768g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? b.b(u.f73749k, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f73769h;
            this.f73769h = str3 != null ? b.b(u.f73749k, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a o(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.N(scheme, "http", true)) {
                this.f73762a = "http";
                return this;
            }
            if (StringsKt.N(scheme, "https", true)) {
                this.f73762a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void p(String str) {
            this.f73769h = str;
        }

        public final void q(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f73764c = str;
        }

        public final void r(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f73763b = str;
        }

        public final void s(String str) {
            this.f73765d = str;
        }

        public final void t(int i10) {
            this.f73766e = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f73762a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f73763b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f73764c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f73763b
                r0.append(r1)
                java.lang.String r1 = r6.f73764c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f73764c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f73765d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.f0(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f73765d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f73765d
                r0.append(r1)
            L69:
                int r1 = r6.f73766e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f73762a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.b()
                java.lang.String r3 = r6.f73762a
                if (r3 == 0) goto L85
                hh.u$b r4 = hh.u.f73749k
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r4.c(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                hh.u$b r1 = hh.u.f73749k
                java.util.List r2 = r6.f73767f
                r1.i(r2, r0)
                java.util.List r2 = r6.f73768g
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f73768g
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r1.k(r2, r0)
            La3:
                java.lang.String r1 = r6.f73769h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f73769h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hh.u.a.toString():java.lang.String");
        }

        public final void u(String str) {
            this.f73762a = str;
        }

        public final a v(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f73763b = b.b(u.f73749k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return bVar.a(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && ih.d.I(str.charAt(i10 + 1)) != -1 && ih.d.I(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        private final void l(vh.e eVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            int iCharCount = i10;
            vh.e eVar2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        eVar.writeUtf8(z10 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z13)) {
                            if (!StringsKt.f0(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z10 && (!z11 || e(str, iCharCount, i11))))) {
                                eVar.H0(iCodePointAt);
                            }
                        }
                        if (eVar2 == null) {
                            eVar2 = new vh.e();
                        }
                        if (charset == null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            eVar2.H0(iCodePointAt);
                        } else {
                            eVar2.D0(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!eVar2.exhausted()) {
                            byte b10 = eVar2.readByte();
                            eVar.writeByte(37);
                            eVar.writeByte(u.f73750l[((b10 & 255) >> 4) & 15]);
                            eVar.writeByte(u.f73750l[b10 & Ascii.SI]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void m(vh.e eVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int I = ih.d.I(str.charAt(i10 + 1));
                    int I2 = ih.d.I(str.charAt(i12));
                    if (I == -1 || I2 == -1) {
                        eVar.H0(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        eVar.writeByte((I << 4) + I2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    eVar.writeByte(32);
                    i10++;
                } else {
                    eVar.H0(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        public final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.f0(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    vh.e eVar = new vh.e();
                    eVar.writeUtf8(str, i10, iCharCount);
                    l(eVar, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                    return eVar.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        public final u d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().h(null, str).a();
        }

        public final u f(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    vh.e eVar = new vh.e();
                    eVar.writeUtf8(str, i10, i12);
                    m(eVar, str, i12, i11, z10);
                    return eVar.readUtf8();
                }
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append(IOUtils.DIR_SEPARATOR_UNIX);
                out.append((String) list.get(i10));
            }
        }

        public final List j(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iU0 = StringsKt.u0(str2, '&', i10, false, 4, null);
                if (iU0 == -1) {
                    iU0 = str2.length();
                }
                int iU02 = StringsKt.u0(str2, D5.T, i10, false, 4, null);
                if (iU02 == -1 || iU02 > iU0) {
                    String strSubstring = str2.substring(i10, iU0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iU02);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iU02 + 1, iU0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iU0 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            kotlin.ranges.d dVarT = kotlin.ranges.g.t(kotlin.ranges.g.v(0, list.size()), 2);
            int iE = dVarT.e();
            int iF = dVarT.f();
            int iG = dVarT.g();
            if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iE);
                String str2 = (String) list.get(iE + 1);
                if (iE > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append(D5.T);
                    out.append(str2);
                }
                if (iE == iF) {
                    return;
                } else {
                    iE += iG;
                }
            }
        }

        private b() {
        }
    }

    public u(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f73751a = scheme;
        this.f73752b = username;
        this.f73753c = password;
        this.f73754d = host;
        this.f73755e = i10;
        this.f73756f = pathSegments;
        this.f73757g = list;
        this.f73758h = str;
        this.f73759i = url;
        this.f73760j = Intrinsics.areEqual(scheme, "https");
    }

    public final String b() {
        if (this.f73758h == null) {
            return null;
        }
        String strSubstring = this.f73759i.substring(StringsKt.u0(this.f73759i, '#', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f73753c.length() == 0) {
            return "";
        }
        String strSubstring = this.f73759i.substring(StringsKt.u0(this.f73759i, ':', this.f73751a.length() + 3, false, 4, null) + 1, StringsKt.u0(this.f73759i, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iU0 = StringsKt.u0(this.f73759i, IOUtils.DIR_SEPARATOR_UNIX, this.f73751a.length() + 3, false, 4, null);
        String str = this.f73759i;
        String strSubstring = this.f73759i.substring(iU0, ih.d.q(str, "?#", iU0, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iU0 = StringsKt.u0(this.f73759i, IOUtils.DIR_SEPARATOR_UNIX, this.f73751a.length() + 3, false, 4, null);
        String str = this.f73759i;
        int iQ = ih.d.q(str, "?#", iU0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iU0 < iQ) {
            int i10 = iU0 + 1;
            int iP = ih.d.p(this.f73759i, IOUtils.DIR_SEPARATOR_UNIX, i10, iQ);
            String strSubstring = this.f73759i.substring(i10, iP);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iU0 = iP;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Intrinsics.areEqual(((u) obj).f73759i, this.f73759i);
    }

    public final String f() {
        if (this.f73757g == null) {
            return null;
        }
        int iU0 = StringsKt.u0(this.f73759i, '?', 0, false, 6, null) + 1;
        String str = this.f73759i;
        String strSubstring = this.f73759i.substring(iU0, ih.d.p(str, '#', iU0, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f73752b.length() == 0) {
            return "";
        }
        int length = this.f73751a.length() + 3;
        String str = this.f73759i;
        String strSubstring = this.f73759i.substring(length, ih.d.q(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f73754d;
    }

    public int hashCode() {
        return this.f73759i.hashCode();
    }

    public final boolean i() {
        return this.f73760j;
    }

    public final a j() {
        a aVar = new a();
        aVar.u(this.f73751a);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f73754d);
        aVar.t(this.f73755e != f73749k.c(this.f73751a) ? this.f73755e : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final a k(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f73755e;
    }

    public final String m() {
        if (this.f73757g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f73749k.k(this.f73757g, sb2);
        return sb2.toString();
    }

    public final String n() {
        a aVarK = k("/...");
        Intrinsics.checkNotNull(aVarK);
        return aVarK.v("").i("").a().toString();
    }

    public final u o(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarK = k(link);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final String p() {
        return this.f73751a;
    }

    public final URI q() {
        String string = j().m().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f73759i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f73759i;
    }
}
