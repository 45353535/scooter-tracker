package com.bytedance.sdk.component.ud.qdl;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.common.base.Ascii;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.DesugarCollections;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wd {
    private static final char[] mml = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final List<String> jpc;
    final int lnr;
    private final String mo;
    private final String mzz;
    final String qdl;
    private final String to;
    private final String tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    final String f16716ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final List<String> f16717wd;

    public static final class qdl {
        String jpc;
        String mml;
        final List<String> mo;
        String qdl;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        List<String> f16719wd;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        String f16718ud = "";
        String lnr = "";
        int mzz = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.ud.qdl.wd$qdl$qdl, reason: collision with other inner class name */
        enum EnumC0238qdl {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public qdl() {
            ArrayList arrayList = new ArrayList();
            this.mo = arrayList;
            arrayList.add("");
        }

        private boolean mo(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean mzz(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public qdl lnr(String str) {
            if (str != null) {
                return qdl(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public qdl mml(String str) {
            this.f16719wd = str != null ? wd.ud(wd.qdl(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public qdl qdl(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.qdl = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.qdl = "https";
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.qdl);
            sb2.append("://");
            if (!this.f16718ud.isEmpty() || !this.lnr.isEmpty()) {
                sb2.append(this.f16718ud);
                if (!this.lnr.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.lnr);
                }
                sb2.append('@');
            }
            if (this.mml.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.mml);
                sb2.append(']');
            } else {
                sb2.append(this.mml);
            }
            int iQdl = qdl();
            if (iQdl != wd.qdl(this.qdl)) {
                sb2.append(':');
                sb2.append(iQdl);
            }
            wd.qdl(sb2, this.mo);
            if (this.f16719wd != null) {
                sb2.append('?');
                wd.ud(sb2, this.f16719wd);
            }
            if (this.jpc != null) {
                sb2.append('#');
                sb2.append(this.jpc);
            }
            return sb2.toString();
        }

        public qdl ud(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strMzz = mzz(str, 0, str.length());
            if (strMzz == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.mml = strMzz;
            return this;
        }

        private static String mzz(String str, int i10, int i11) {
            return com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(wd.qdl(str, i10, i11, false));
        }

        private void lnr() {
            if (this.mo.remove(r0.size() - 1).isEmpty() && !this.mo.isEmpty()) {
                this.mo.set(r0.size() - 1, "");
            } else {
                this.mo.add("");
            }
        }

        private static int mml(String str, int i10, int i11) {
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

        private static int mo(String str, int i10, int i11) {
            int i12;
            try {
                i12 = Integer.parseInt(wd.qdl(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        public wd ud() {
            if (this.qdl != null) {
                if (this.mml != null) {
                    return new wd(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int lnr(String str, int i10, int i11) {
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

        int qdl() {
            int i10 = this.mzz;
            return i10 != -1 ? i10 : wd.qdl(this.qdl);
        }

        private qdl qdl(String str, boolean z10) {
            boolean z11;
            qdl qdlVar;
            String str2;
            boolean z12;
            int i10 = 0;
            while (true) {
                int iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, i10, str.length(), "/\\");
                if (iQdl < str.length()) {
                    z11 = true;
                    str2 = str;
                    z12 = z10;
                    qdlVar = this;
                } else {
                    z11 = false;
                    qdlVar = this;
                    str2 = str;
                    z12 = z10;
                }
                qdlVar.qdl(str2, i10, iQdl, z11, z12);
                i10 = iQdl + 1;
                if (i10 > str2.length()) {
                    return qdlVar;
                }
                str = str2;
                z10 = z12;
            }
        }

        private static int ud(String str, int i10, int i11) {
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

        public qdl qdl(String str, String str2) {
            if (str != null) {
                if (this.f16719wd == null) {
                    this.f16719wd = new ArrayList();
                }
                this.f16719wd.add(wd.qdl(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
                this.f16719wd.add(str2 != null ? wd.qdl(str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        EnumC0238qdl qdl(wd wdVar, String str) {
            int iQdl;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iQdl2 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str4, 0, str4.length());
            int iUd = com.bytedance.sdk.component.ud.qdl.ud.tvp.ud(str4, iQdl2, str4.length());
            if (ud(str4, iQdl2, iUd) != -1) {
                if (str4.regionMatches(true, iQdl2, "https:", 0, 6)) {
                    this.qdl = "https";
                    iQdl2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iQdl2, "http:", 0, 5)) {
                        this.qdl = "http";
                        iQdl2 += 5;
                    } else {
                        return EnumC0238qdl.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (wdVar != null) {
                this.qdl = wdVar.qdl;
            } else {
                return EnumC0238qdl.MISSING_SCHEME;
            }
            int iLnr = lnr(str4, iQdl2, iUd);
            char c10 = '#';
            if (iLnr < 2 && wdVar != null && wdVar.qdl.equals(this.qdl)) {
                this.f16718ud = wdVar.ud();
                this.lnr = wdVar.lnr();
                this.mml = wdVar.f16716ud;
                this.mzz = wdVar.lnr;
                this.mo.clear();
                this.mo.addAll(wdVar.mml());
                if (iQdl2 == iUd || str4.charAt(iQdl2) == '#') {
                    mml(wdVar.mzz());
                }
                str2 = str4;
            } else {
                int i11 = iQdl2 + iLnr;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str4, i11, iUd, "@/\\?#");
                    byte bCharAt = iQdl != iUd ? str4.charAt(iQdl) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iQdl3 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str4, i11, iQdl, ':');
                            String strQdl = wd.qdl(str, i11, iQdl3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strQdl = this.f16718ud + "%40" + strQdl;
                            }
                            this.f16718ud = strQdl;
                            if (iQdl3 != iQdl) {
                                i10 = iQdl;
                                this.lnr = wd.qdl(str, iQdl3 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iQdl;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iQdl;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.lnr);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(wd.qdl(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.lnr = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iMml = mml(str2, i12, iQdl);
                int i13 = iMml + 1;
                if (i13 < iQdl) {
                    this.mml = mzz(str2, i12, iMml);
                    int iMo = mo(str2, i13, iQdl);
                    this.mzz = iMo;
                    if (iMo == -1) {
                        return EnumC0238qdl.INVALID_PORT;
                    }
                } else {
                    this.mml = mzz(str2, i12, iMml);
                    this.mzz = wd.qdl(this.qdl);
                }
                if (this.mml == null) {
                    return EnumC0238qdl.INVALID_HOST;
                }
                iQdl2 = iQdl;
            }
            int iQdl4 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str2, iQdl2, iUd, "?#");
            qdl(str2, iQdl2, iQdl4);
            if (iQdl4 < iUd && str2.charAt(iQdl4) == '?') {
                int iQdl5 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str2, iQdl4, iUd, '#');
                this.f16719wd = wd.ud(wd.qdl(str2, iQdl4 + 1, iQdl5, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iQdl4 = iQdl5;
            }
            if (iQdl4 < iUd && str2.charAt(iQdl4) == '#') {
                this.jpc = wd.qdl(str2, iQdl4 + 1, iUd, "", true, false, false, false, null);
            }
            return EnumC0238qdl.SUCCESS;
        }

        private void qdl(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.mo;
                list.set(list.size() - 1, "");
            } else {
                this.mo.clear();
                this.mo.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, i12, i11, "/\\");
                boolean z10 = iQdl < i11;
                String str2 = str;
                qdl(str2, i12, iQdl, z10, true);
                if (z10) {
                    iQdl++;
                }
                i12 = iQdl;
                str = str2;
            }
        }

        private void qdl(String str, int i10, int i11, boolean z10, boolean z11) {
            String strQdl = wd.qdl(str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, true, null);
            if (mzz(strQdl)) {
                return;
            }
            if (mo(strQdl)) {
                lnr();
                return;
            }
            if (this.mo.get(r11.size() - 1).isEmpty()) {
                this.mo.set(r11.size() - 1, strQdl);
            } else {
                this.mo.add(strQdl);
            }
            if (z10) {
                this.mo.add("");
            }
        }
    }

    wd(qdl qdlVar) {
        this.qdl = qdlVar.qdl;
        this.mzz = qdl(qdlVar.f16718ud, false);
        this.mo = qdl(qdlVar.lnr, false);
        this.f16716ud = qdlVar.mml;
        this.lnr = qdlVar.qdl();
        this.f16717wd = qdl(qdlVar.mo, false);
        List<String> list = qdlVar.f16719wd;
        this.jpc = list != null ? qdl(list, true) : null;
        String str = qdlVar.jpc;
        this.tvp = str != null ? qdl(str, false) : null;
        this.to = qdlVar.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof wd) && ((wd) obj).to.equals(this.to);
    }

    public int hashCode() {
        return this.to.hashCode();
    }

    public String lnr() {
        if (this.mo.isEmpty()) {
            return "";
        }
        return this.to.substring(this.to.indexOf(58, this.qdl.length() + 3) + 1, this.to.indexOf(64));
    }

    public List<String> mml() {
        int iIndexOf = this.to.indexOf(47, this.qdl.length() + 3);
        String str = this.to;
        int iQdl = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iQdl) {
            int i10 = iIndexOf + 1;
            int iQdl2 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(this.to, i10, iQdl, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.to.substring(i10, iQdl2));
            iIndexOf = iQdl2;
        }
        return arrayList;
    }

    public String mzz() {
        if (this.jpc == null) {
            return null;
        }
        int iIndexOf = this.to.indexOf(63) + 1;
        String str = this.to;
        return this.to.substring(iIndexOf, com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, iIndexOf, str.length(), '#'));
    }

    public URL qdl() {
        try {
            return new URL(this.to);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.to;
    }

    public String ud() {
        if (this.mzz.isEmpty()) {
            return "";
        }
        int length = this.qdl.length() + 3;
        String str = this.to;
        return this.to.substring(length, com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str, length, str.length(), ":@"));
    }

    public static int qdl(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static wd lnr(String str) {
        qdl qdlVar = new qdl();
        if (qdlVar.qdl((wd) null, str) == qdl.EnumC0238qdl.SUCCESS) {
            return qdlVar.ud();
        }
        return null;
    }

    static void qdl(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(list.get(i10));
        }
    }

    static void ud(StringBuilder sb2, List<String> list) {
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

    static String qdl(String str, boolean z10) {
        return qdl(str, 0, str.length(), z10);
    }

    private List<String> qdl(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? qdl(str, z10) : null);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    static List<String> ud(String str) {
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

    static String qdl(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar = new com.bytedance.sdk.component.ud.qdl.ud.qdl();
                qdlVar.qdl(str, i10, i12);
                qdl(qdlVar, str, i12, i11, z10);
                return qdlVar.lnr();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void qdl(com.bytedance.sdk.component.ud.qdl.ud.qdl r5, java.lang.String r6, int r7, int r8, boolean r9) {
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
            int r2 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.ud(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.ud(r1)
            goto L3c
        L39:
            r5.qdl(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ud.qdl.wd.qdl(com.bytedance.sdk.component.ud.qdl.ud.qdl, java.lang.String, int, int, boolean):void");
    }

    static boolean qdl(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl(str.charAt(i12)) != -1;
    }

    static String qdl(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || qdl(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar = new com.bytedance.sdk.component.ud.qdl.ud.qdl();
                qdlVar.qdl(str, i10, iCharCount);
                qdl(qdlVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return qdlVar.lnr();
            }
        }
        return str.substring(i10, i11);
    }

    static void qdl(com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.ud.qdl.ud.qdl qdlVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    qdlVar.qdl(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || qdl(str, i10, i11)))))) {
                    qdlVar.qdl(iCodePointAt);
                } else {
                    if (qdlVar2 == null) {
                        qdlVar2 = new com.bytedance.sdk.component.ud.qdl.ud.qdl();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl)) {
                        qdlVar2.qdl(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        qdlVar2.qdl(iCodePointAt);
                    }
                    while (!qdlVar2.qdl()) {
                        byte bUd = qdlVar2.ud();
                        qdlVar.ud(37);
                        char[] cArr = mml;
                        qdlVar.ud((int) cArr[((bUd & 255) >> 4) & 15]);
                        qdlVar.ud((int) cArr[bUd & Ascii.SI]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static String qdl(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return qdl(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
