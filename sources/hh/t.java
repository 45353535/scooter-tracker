package hh;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements Iterable, yf.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f73746c = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f73747b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f73748a = new ArrayList(20);

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = t.f73746c;
            bVar.d(name);
            bVar.e(value, name);
            c(name, value);
            return this;
        }

        public final a b(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iU0 = StringsKt.u0(line, ':', 1, false, 4, null);
            if (iU0 != -1) {
                String strSubstring = line.substring(0, iU0);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iU0 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
            return this;
        }

        public final a c(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f73748a.add(name);
            this.f73748a.add(StringsKt.v1(value).toString());
            return this;
        }

        public final a d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            t.f73746c.d(name);
            c(name, value);
            return this;
        }

        public final t e() {
            return new t((String[]) this.f73748a.toArray(new String[0]), null);
        }

        public final String f(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.f73748a.size() - 2;
            int iC = rf.c.c(size, 0, -2);
            if (iC > size) {
                return null;
            }
            while (!StringsKt.N(name, (String) this.f73748a.get(size), true)) {
                if (size == iC) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f73748a.get(size + 1);
        }

        public final List g() {
            return this.f73748a;
        }

        public final a h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i10 = 0;
            while (i10 < this.f73748a.size()) {
                if (StringsKt.N(name, (String) this.f73748a.get(i10), true)) {
                    this.f73748a.remove(i10);
                    this.f73748a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = t.f73746c;
            bVar.d(name);
            bVar.e(value, name);
            h(name);
            c(name, value);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(ih.d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ih.d.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(ih.d.H(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iC = rf.c.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (!StringsKt.N(str, strArr[length], true)) {
                if (length == iC) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final t g(Map map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = StringsKt.v1(str).toString();
                String string2 = StringsKt.v1(str2).toString();
                d(string);
                e(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new t(strArr, null);
        }

        public final t h(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = StringsKt.v1(str).toString();
            }
            int iC = rf.c.c(0, strArr.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i10 == iC) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new t(strArr, null);
        }

        private b() {
        }
    }

    public /* synthetic */ t(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f73746c.f(this.f73747b, name);
    }

    public final Date b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = a(name);
        if (strA != null) {
            return nh.c.a(strA);
        }
        return null;
    }

    public final String e(int i10) {
        return this.f73747b[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f73747b, ((t) obj).f73747b);
    }

    public final a f() {
        a aVar = new a();
        CollectionsKt.addAll(aVar.g(), this.f73747b);
        return aVar;
    }

    public final Map g() {
        TreeMap treeMap = new TreeMap(StringsKt.P(a1.f93282a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = e(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strE.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(i(i10));
        }
        return treeMap;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f73747b);
    }

    public final String i(int i10) {
        return this.f73747b[(i10 * 2) + 1];
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = TuplesKt.to(e(i10), i(i10));
        }
        return kotlin.jvm.internal.i.a(pairArr);
    }

    public final List j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.N(name, e(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i10));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f73747b.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = e(i10);
            String strI = i(i10);
            sb2.append(strE);
            sb2.append(": ");
            if (ih.d.H(strE)) {
                strI = "██";
            }
            sb2.append(strI);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private t(String[] strArr) {
        this.f73747b = strArr;
    }
}
