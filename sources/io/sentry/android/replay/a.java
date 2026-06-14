package io.sentry.android.replay;

import io.sentry.b4;
import io.sentry.i0;
import io.sentry.v7;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class a implements b4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f82859d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f82860e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f82861f = lf.i.b(lf.l.f94211d, C0993a.f82866f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashSet f82862g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v7 f82863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f82864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f82865c;

    /* JADX INFO: renamed from: io.sentry.android.replay.a$a, reason: collision with other inner class name */
    static final class C0993a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0993a f82866f = new C0993a();

        C0993a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Regex invoke() {
            return new Regex("_[a-z]");
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex b() {
            return (Regex) a.f82861f.getValue();
        }

        private b() {
        }
    }

    private final class c implements v7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v7.a f82867a;

        public c(v7.a aVar) {
            this.f82867a = aVar;
        }

        private final io.sentry.util.network.a b(io.sentry.e eVar, i0 i0Var) {
            if (!Intrinsics.areEqual(eVar.q(), "http") && !Intrinsics.areEqual(eVar.k(), "http")) {
                return null;
            }
            i0Var.c("sentry:replayNetworkDetails");
            return null;
        }

        @Override // io.sentry.v7.a
        public io.sentry.e a(io.sentry.e breadcrumb, i0 hint) {
            Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
            Intrinsics.checkNotNullParameter(hint, "hint");
            v7.a aVar = this.f82867a;
            if (aVar != null) {
                breadcrumb = aVar.a(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                b(breadcrumb, hint);
            }
            return breadcrumb;
        }
    }

    public static final class d extends LinkedHashMap implements j$.util.Map {
        d() {
        }

        public /* bridge */ boolean a(io.sentry.e eVar) {
            return super.containsKey(eVar);
        }

        public /* bridge */ io.sentry.util.network.a b(io.sentry.e eVar) {
            androidx.privacysandbox.ads.adservices.topics.a.a(super.get(eVar));
            return null;
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
            return Map.CC.$default$compute(this, obj, biFunction);
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
            return Map.CC.$default$computeIfAbsent(this, obj, function);
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
            return Map.CC.$default$computeIfPresent(this, obj, biFunction);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof io.sentry.e) {
                return a((io.sentry.e) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return i();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ void forEach(BiConsumer biConsumer) {
            Map.CC.$default$forEach(this, biConsumer);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof io.sentry.e)) {
                return null;
            }
            b((io.sentry.e) obj);
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof io.sentry.e)) {
                return obj2;
            }
            androidx.privacysandbox.ads.adservices.topics.a.a(obj2);
            k((io.sentry.e) obj, null);
            return null;
        }

        public /* bridge */ Set i() {
            return super.entrySet();
        }

        public /* bridge */ Set j() {
            return super.keySet();
        }

        public /* bridge */ io.sentry.util.network.a k(io.sentry.e eVar, io.sentry.util.network.a aVar) {
            androidx.privacysandbox.ads.adservices.topics.a.a(Map.CC.$default$getOrDefault(this, eVar, aVar));
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return j();
        }

        public /* bridge */ int l() {
            return super.size();
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
            return Map.CC.$default$merge(this, obj, obj2, biFunction);
        }

        public /* bridge */ Collection n() {
            return super.values();
        }

        public /* bridge */ io.sentry.util.network.a o(io.sentry.e eVar) {
            androidx.privacysandbox.ads.adservices.topics.a.a(super.remove(eVar));
            return null;
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
            return Map.CC.$default$putIfAbsent(this, obj, obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof io.sentry.e)) {
                return null;
            }
            o((io.sentry.e) obj);
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 32;
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object replace(Object obj, Object obj2) {
            return Map.CC.$default$replace(this, obj, obj2);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ void replaceAll(BiFunction biFunction) {
            Map.CC.$default$replaceAll(this, biFunction);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return l();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return n();
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            boolean z10 = obj instanceof io.sentry.e;
            return false;
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
            return Map.CC.$default$replace(this, obj, obj2, obj3);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f82869f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String upperCase = String.valueOf(StringsKt.E1(it.getValue())).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f82862g = hashSet;
    }

    public a() {
        this.f82865c = DesugarCollections.synchronizedMap(new d());
    }

    private final boolean c(io.sentry.e eVar) {
        Object obj = eVar.m().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.util.Map mapM = eVar.m();
        Intrinsics.checkNotNullExpressionValue(mapM, "getData(...)");
        if (!mapM.containsKey("http.start_timestamp")) {
            return false;
        }
        java.util.Map mapM2 = eVar.m();
        Intrinsics.checkNotNullExpressionValue(mapM2, "getData(...)");
        return mapM2.containsKey("http.end_timestamp");
    }

    private final String d(String str) {
        return f82859d.b().h(str, e.f82869f);
    }

    private final io.sentry.rrweb.i e(io.sentry.e eVar) {
        double dLongValue;
        double dLongValue2;
        Object obj = eVar.m().get("http.start_timestamp");
        Object obj2 = eVar.m().get("http.end_timestamp");
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.f(eVar.p().getTime());
        iVar.s("resource.http");
        Object obj3 = eVar.m().get("url");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        iVar.q((String) obj3);
        if (obj instanceof Double) {
            dLongValue = ((Number) obj).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            dLongValue = ((Long) obj).longValue();
        }
        iVar.u(dLongValue / 1000.0d);
        if (obj2 instanceof Double) {
            dLongValue2 = ((Number) obj2).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            dLongValue2 = ((Long) obj2).longValue();
        }
        iVar.r(dLongValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        androidx.privacysandbox.ads.adservices.topics.a.a(this.f82865c.remove(eVar));
        java.util.Map mapM = eVar.m();
        Intrinsics.checkNotNullExpressionValue(mapM, "getData(...)");
        for (Map.Entry entry : mapM.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (f82862g.contains(str)) {
                Intrinsics.checkNotNull(str);
                linkedHashMap.put(d(StringsKt.h1(StringsKt.W(str, "content_length", "body_size", false, 4, null), ".", null, 2, null)), value);
            }
        }
        iVar.o(linkedHashMap);
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    @Override // io.sentry.b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.rrweb.b a(io.sentry.e r10) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.a.a(io.sentry.e):io.sentry.rrweb.b");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(v7 options) {
        this();
        Intrinsics.checkNotNullParameter(options, "options");
        this.f82863a = options;
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new c(options.getBeforeBreadcrumb()));
    }
}
