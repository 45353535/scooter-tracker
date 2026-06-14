package ve;

import androidx.webkit.ProxyConfig;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ve.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f106625f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final g f106626g = new g(ProxyConfig.MATCH_ALL_SCHEMES, ProxyConfig.MATCH_ALL_SCHEMES, null, 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f106627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f106628e;

    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final g f106635g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final g f106642n;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final g f106649u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f106629a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g f106630b = new g("application", ProxyConfig.MATCH_ALL_SCHEMES, null, 4, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final g f106631c = new g("application", "atom+xml", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final g f106632d = new g("application", "cbor", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final g f106633e = new g("application", "json", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final g f106634f = new g("application", "hal+json", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final g f106636h = new g("application", "octet-stream", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final g f106637i = new g("application", "rss+xml", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final g f106638j = new g("application", "soap+xml", null, 4, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final g f106639k = new g("application", "xml", null, 4, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final g f106640l = new g("application", "xml-dtd", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final g f106641m = new g("application", "yaml", null, 4, null);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final g f106643o = new g("application", "gzip", null, 4, null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final g f106644p = new g("application", "x-www-form-urlencoded", null, 4, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final g f106645q = new g("application", "pdf", null, 4, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final g f106646r = new g("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final g f106647s = new g("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final g f106648t = new g("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final g f106650v = new g("application", "wasm", null, 4, null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final g f106651w = new g("application", "problem+json", null, 4, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final g f106652x = new g("application", "problem+xml", null, 4, null);

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            f106635g = new g("application", "javascript", null, 4, defaultConstructorMarker);
            f106642n = new g("application", "zip", null, 4, defaultConstructorMarker);
            f106649u = new g("application", "protobuf", null, 4, defaultConstructorMarker);
        }

        private a() {
        }

        public final g a() {
            return f106636h;
        }

        public final g b() {
            return f106649u;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f106626g;
        }

        public final g b(String value) throws ve.a {
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.y0(value)) {
                return a();
            }
            m.a aVar = m.f106688c;
            k kVar = (k) CollectionsKt.last(t.d(value));
            String strB = kVar.b();
            List listA = kVar.a();
            int iU0 = StringsKt.u0(strB, IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null);
            if (iU0 == -1) {
                if (Intrinsics.areEqual(StringsKt.v1(strB).toString(), ProxyConfig.MATCH_ALL_SCHEMES)) {
                    return g.f106625f.a();
                }
                throw new ve.a(value);
            }
            String strSubstring = strB.substring(0, iU0);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String string = StringsKt.v1(strSubstring).toString();
            if (string.length() == 0) {
                throw new ve.a(value);
            }
            String strSubstring2 = strB.substring(iU0 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String string2 = StringsKt.v1(strSubstring2).toString();
            if (StringsKt.f0(string, ' ', false, 2, null) || StringsKt.f0(string2, ' ', false, 2, null)) {
                throw new ve.a(value);
            }
            if (string2.length() == 0 || StringsKt.f0(string2, IOUtils.DIR_SEPARATOR_UNIX, false, 2, null)) {
                throw new ve.a(value);
            }
            return new g(string, string2, listA);
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f106653a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g f106654b = new g("multipart", ProxyConfig.MATCH_ALL_SCHEMES, null, 4, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final g f106655c = new g("multipart", "mixed", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final g f106656d = new g("multipart", "alternative", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final g f106657e = new g("multipart", "related", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final g f106658f = new g("multipart", "form-data", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final g f106659g = new g("multipart", "signed", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final g f106660h = new g("multipart", "encrypted", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final g f106661i = new g("multipart", "byteranges", null, 4, null);

        private c() {
        }

        public final boolean a(CharSequence contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return StringsKt.a1(contentType, "multipart/", true);
        }

        public final g b() {
            return f106658f;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f106662a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g f106663b = new g("text", ProxyConfig.MATCH_ALL_SCHEMES, null, 4, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final g f106664c = new g("text", "plain", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final g f106665d = new g("text", "css", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final g f106666e = new g("text", com.taurusx.tax.g.a.f66075g, null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final g f106667f = new g("text", "html", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final g f106668g = new g("text", "javascript", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final g f106669h = new g("text", "vcard", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final g f106670i = new g("text", "xml", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final g f106671j = new g("text", "event-stream", null, 4, null);

        private d() {
        }

        public final g a() {
            return f106664c;
        }
    }

    private g(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f106627d = str;
        this.f106628e = str2;
    }

    private final boolean f(String str, String str2) {
        int size = b().size();
        if (size != 0) {
            if (size != 1) {
                List<l> listB = b();
                if ((listB instanceof Collection) && listB.isEmpty()) {
                    return false;
                }
                for (l lVar : listB) {
                    if (StringsKt.N(lVar.c(), str, true) && StringsKt.N(lVar.d(), str2, true)) {
                        return true;
                    }
                }
                return false;
            }
            l lVar2 = (l) b().get(0);
            if (StringsKt.N(lVar2.c(), str, true) && StringsKt.N(lVar2.d(), str2, true)) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f106627d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return StringsKt.N(this.f106627d, gVar.f106627d, true) && StringsKt.N(this.f106628e, gVar.f106628e, true) && Intrinsics.areEqual(b(), gVar.b());
    }

    public final boolean g(g pattern) {
        boolean zN;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (!Intrinsics.areEqual(pattern.f106627d, ProxyConfig.MATCH_ALL_SCHEMES) && !StringsKt.N(pattern.f106627d, this.f106627d, true)) {
            return false;
        }
        if (!Intrinsics.areEqual(pattern.f106628e, ProxyConfig.MATCH_ALL_SCHEMES) && !StringsKt.N(pattern.f106628e, this.f106628e, true)) {
            return false;
        }
        for (l lVar : pattern.b()) {
            String strA = lVar.a();
            String strB = lVar.b();
            if (Intrinsics.areEqual(strA, ProxyConfig.MATCH_ALL_SCHEMES)) {
                if (!Intrinsics.areEqual(strB, ProxyConfig.MATCH_ALL_SCHEMES)) {
                    List listB = b();
                    if (!(listB instanceof Collection) || !listB.isEmpty()) {
                        Iterator it = listB.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.N(((l) it.next()).d(), strB, true)) {
                            }
                        }
                    }
                    zN = false;
                }
                zN = true;
                break;
            }
            String strC = c(strA);
            if (!Intrinsics.areEqual(strB, ProxyConfig.MATCH_ALL_SCHEMES)) {
                zN = StringsKt.N(strC, strB, true);
            } else {
                if (strC != null) {
                    zN = true;
                    break;
                    break;
                }
                zN = false;
            }
            if (!zN) {
                return false;
            }
        }
        return true;
    }

    public final g h(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return f(name, value) ? this : new g(this.f106627d, this.f106628e, a(), CollectionsKt.plus((Collection<? extends l>) b(), new l(name, value)));
    }

    public int hashCode() {
        String str = this.f106627d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f106628e.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (b().hashCode() * 31);
    }

    public /* synthetic */ g(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + IOUtils.DIR_SEPARATOR_UNIX + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
