package hh;

import com.ironsource.D5;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f73619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f73620b;

    public h(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f73619a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f73620b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f73620b.get(D5.M);
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.f73620b.get("realm");
    }

    public final String c() {
        return this.f73619a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(hVar.f73619a, this.f73619a) && Intrinsics.areEqual(hVar.f73620b, this.f73620b);
    }

    public int hashCode() {
        return ((899 + this.f73619a.hashCode()) * 31) + this.f73620b.hashCode();
    }

    public String toString() {
        return this.f73619a + " authParams=" + this.f73620b;
    }
}
