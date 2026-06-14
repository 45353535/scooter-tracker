package com.mbridge.msdk.thrid.okhttp;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f51607a;

    r(a aVar) {
        List<String> list = aVar.f51608a;
        this.f51607a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(int i10) {
        return this.f51607a[i10 * 2];
    }

    public String b(String str) {
        return a(this.f51607a, str);
    }

    public List<String> c(String str) {
        int iB = b();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < iB; i10++) {
            if (str.equalsIgnoreCase(a(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i10));
            }
        }
        return arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).f51607a, this.f51607a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f51607a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iB = b();
        for (int i10 = 0; i10 < iB; i10++) {
            sb2.append(a(i10));
            sb2.append(": ");
            sb2.append(b(i10));
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb2.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f51608a = new ArrayList(20);

        a a(String str) {
            int iIndexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER, 1);
            return iIndexOf != -1 ? b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : str.startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER) ? b("", str.substring(1)) : b("", str);
        }

        a b(String str, String str2) {
            this.f51608a.add(str);
            this.f51608a.add(str2.trim());
            return this;
        }

        public a c(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            b(str);
            b(str, str2);
            return this;
        }

        public a b(String str) {
            int i10 = 0;
            while (i10 < this.f51608a.size()) {
                if (str.equalsIgnoreCase(this.f51608a.get(i10))) {
                    this.f51608a.remove(i10);
                    this.f51608a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public a a(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            return b(str, str2);
        }

        public r a() {
            return new r(this);
        }
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.f51608a, this.f51607a);
        return aVar;
    }

    public int b() {
        return this.f51607a.length / 2;
    }

    public String b(int i10) {
        return this.f51607a[(i10 * 2) + 1];
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    static void a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }
}
