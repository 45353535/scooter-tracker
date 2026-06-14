package l2;

import com.facebook.d0;
import com.facebook.internal.r;
import com.facebook.internal.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l2.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f93899a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f93900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f93901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f93902d;

    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1074a f93903c = new C1074a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f93908b;

        /* JADX INFO: renamed from: l2.e$a$a, reason: collision with other inner class name */
        public static final class C1074a {
            public /* synthetic */ C1074a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                for (a aVar : a.values()) {
                    if (Intrinsics.areEqual(aVar.g(), rawValue)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C1074a() {
            }
        }

        a(String str) {
            this.f93908b = str;
        }

        public final String g() {
            return this.f93908b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k f93909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f93910b;

        public b(k kVar, i field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.f93909a = kVar;
            this.f93910b = field;
        }

        public final i a() {
            return this.f93910b;
        }

        public final k b() {
            return this.f93909a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f93909a == bVar.f93909a && this.f93910b == bVar.f93910b;
        }

        public int hashCode() {
            k kVar = this.f93909a;
            return ((kVar == null ? 0 : kVar.hashCode()) * 31) + this.f93910b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f93909a + ", field=" + this.f93910b + ')';
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k f93911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f93912b;

        public c(k section, l lVar) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.f93911a = section;
            this.f93912b = lVar;
        }

        public final l a() {
            return this.f93912b;
        }

        public final k b() {
            return this.f93911a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f93911a == cVar.f93911a && this.f93912b == cVar.f93912b;
        }

        public int hashCode() {
            int iHashCode = this.f93911a.hashCode() * 31;
            l lVar = this.f93912b;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f93911a + ", field=" + this.f93912b + ')';
        }
    }

    public enum d {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f93913b = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                if (Intrinsics.areEqual(rawValue, l2.b.EXT_INFO.g())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, l2.b.URL_SCHEMES.g())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, m.CONTENT_IDS.g())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, m.CONTENTS.g())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, a.OPTIONS.g())) {
                    return d.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, l2.b.ADV_TE.g())) {
                    return d.BOOL;
                }
                if (Intrinsics.areEqual(rawValue, l2.b.APP_TE.g())) {
                    return d.BOOL;
                }
                if (Intrinsics.areEqual(rawValue, m.EVENT_TIME.g())) {
                    return d.INT;
                }
                return null;
            }

            private a() {
            }
        }
    }

    /* JADX INFO: renamed from: l2.e$e, reason: collision with other inner class name */
    public /* synthetic */ class C1075e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[l2.a.values().length];
            try {
                iArr3[l2.a.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[l2.a.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        l2.b bVar = l2.b.ANON_ID;
        k kVar = k.USER_DATA;
        Pair pair = TuplesKt.to(bVar, new c(kVar, l.ANON_ID));
        Pair pair2 = TuplesKt.to(l2.b.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID));
        Pair pair3 = TuplesKt.to(l2.b.ADVERTISER_ID, new c(kVar, l.MAD_ID));
        Pair pair4 = TuplesKt.to(l2.b.PAGE_ID, new c(kVar, l.PAGE_ID));
        Pair pair5 = TuplesKt.to(l2.b.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID));
        l2.b bVar2 = l2.b.ADV_TE;
        k kVar2 = k.APP_DATA;
        f93900b = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to(bVar2, new c(kVar2, l.ADV_TE)), TuplesKt.to(l2.b.APP_TE, new c(kVar2, l.APP_TE)), TuplesKt.to(l2.b.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), TuplesKt.to(l2.b.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), TuplesKt.to(l2.b.EXT_INFO, new c(kVar2, l.EXT_INFO)), TuplesKt.to(l2.b.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), TuplesKt.to(l2.b.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), TuplesKt.to(l2.b.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), TuplesKt.to(l2.b.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), TuplesKt.to(l2.b.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), TuplesKt.to(l2.b.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), TuplesKt.to(l2.b.USER_DATA, new c(kVar, null)));
        Pair pair6 = TuplesKt.to(m.EVENT_TIME, new b(null, i.EVENT_TIME));
        Pair pair7 = TuplesKt.to(m.EVENT_NAME, new b(null, i.EVENT_NAME));
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        f93901c = MapsKt.mapOf(pair6, pair7, TuplesKt.to(mVar, new b(kVar3, i.VALUE_TO_SUM)), TuplesKt.to(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), TuplesKt.to(m.CONTENTS, new b(kVar3, i.CONTENTS)), TuplesKt.to(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), TuplesKt.to(m.CURRENCY, new b(kVar3, i.CURRENCY)), TuplesKt.to(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), TuplesKt.to(m.LEVEL, new b(kVar3, i.LEVEL)), TuplesKt.to(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), TuplesKt.to(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), TuplesKt.to(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), TuplesKt.to(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), TuplesKt.to(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), TuplesKt.to(m.SUCCESS, new b(kVar3, i.SUCCESS)), TuplesKt.to(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), TuplesKt.to(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
        f93902d = MapsKt.mapOf(TuplesKt.to("fb_mobile_achievement_unlocked", j.UNLOCKED_ACHIEVEMENT), TuplesKt.to("fb_mobile_activate_app", j.ACTIVATED_APP), TuplesKt.to("fb_mobile_add_payment_info", j.ADDED_PAYMENT_INFO), TuplesKt.to("fb_mobile_add_to_cart", j.ADDED_TO_CART), TuplesKt.to("fb_mobile_add_to_wishlist", j.ADDED_TO_WISHLIST), TuplesKt.to("fb_mobile_complete_registration", j.COMPLETED_REGISTRATION), TuplesKt.to("fb_mobile_content_view", j.VIEWED_CONTENT), TuplesKt.to("fb_mobile_initiated_checkout", j.INITIATED_CHECKOUT), TuplesKt.to("fb_mobile_level_achieved", j.ACHIEVED_LEVEL), TuplesKt.to("fb_mobile_purchase", j.PURCHASED), TuplesKt.to("fb_mobile_rate", j.RATED), TuplesKt.to("fb_mobile_search", j.SEARCHED), TuplesKt.to("fb_mobile_spent_credits", j.SPENT_CREDITS), TuplesKt.to("fb_mobile_tutorial_completion", j.COMPLETED_TUTORIAL));
    }

    private e() {
    }

    private final List b(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List c(Map map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.g(), n.MOBILE_APP_INSTALL.g());
        linkedHashMap.put(i.EVENT_TIME.g(), obj);
        return CollectionsKt.listOf(linkedHashMap);
    }

    private final l2.a f(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object obj = map.get(n.EVENT.g());
        a.C1073a c1073a = l2.a.f93871b;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        l2.a aVarA = c1073a.a((String) obj);
        if (aVarA != l2.a.OTHER) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                l2.b bVarA = l2.b.f93876c.a(str);
                if (bVarA != null) {
                    f93899a.g(map2, map3, bVarA, value);
                } else {
                    boolean zAreEqual = Intrinsics.areEqual(str, k.CUSTOM_EVENTS.g());
                    boolean z10 = value instanceof String;
                    if (aVarA == l2.a.CUSTOM && zAreEqual && z10) {
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                        ArrayList arrayListK = k((String) value);
                        if (arrayListK != null) {
                            arrayList.addAll(arrayListK);
                        }
                    } else if (a.f93903c.a(str) != null) {
                        map4.put(str, value);
                    }
                }
            }
        }
        return aVarA;
    }

    private final void h(Map map, l2.b bVar, Object obj) {
        l lVarA;
        String strG;
        c cVar = (c) f93900b.get(bVar);
        if (cVar == null || (lVarA = cVar.a()) == null || (strG = lVarA.g()) == null) {
            return;
        }
        map.put(strG, obj);
    }

    private final void i(Map map, l2.b bVar, Object obj) {
        l lVarA;
        String strG;
        if (bVar == l2.b.USER_DATA) {
            try {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                map.putAll(z.n(new JSONObject((String) obj)));
                return;
            } catch (JSONException e10) {
                r.f19964e.c(d0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return;
            }
        }
        c cVar = (c) f93900b.get(bVar);
        if (cVar == null || (lVarA = cVar.a()) == null || (strG = lVarA.g()) == null) {
            return;
        }
        map.put(strG, obj);
    }

    private final String j(String str) {
        String strG;
        Map map = f93902d;
        if (!map.containsKey(str)) {
            return str;
        }
        j jVar = (j) map.get(str);
        return (jVar == null || (strG = jVar.g()) == null) ? "" : strG;
    }

    public static final ArrayList k(String appEvents) {
        Intrinsics.checkNotNullParameter(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            Iterator it = z.m(new JSONArray(appEvents)).iterator();
            while (it.hasNext()) {
                arrayList.add(z.n(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str : map.keySet()) {
                    m mVarA = m.f93991c.a(str);
                    b bVar = (b) f93901c.get(mVarA);
                    if (mVarA != null && bVar != null) {
                        k kVarB = bVar.b();
                        if (kVarB == null) {
                            try {
                                String strG = bVar.a().g();
                                if (mVarA == m.EVENT_NAME && ((String) map.get(str)) != null) {
                                    e eVar = f93899a;
                                    Object obj = map.get(str);
                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                                    linkedHashMap2.put(strG, eVar.j((String) obj));
                                } else if (mVarA == m.EVENT_TIME && ((Integer) map.get(str)) != null) {
                                    Object obj2 = map.get(str);
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                                    Object objL = l(str, obj2);
                                    Intrinsics.checkNotNull(objL, "null cannot be cast to non-null type kotlin.Any");
                                    linkedHashMap2.put(strG, objL);
                                }
                            } catch (ClassCastException e10) {
                                r.f19964e.c(d0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", lf.c.b(e10));
                            }
                        } else if (kVarB == k.CUSTOM_DATA) {
                            String strG2 = bVar.a().g();
                            Object obj3 = map.get(str);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object objL2 = l(str, obj3);
                            Intrinsics.checkNotNull(objL2, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(strG2, objL2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.g(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            r.f19964e.c(d0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Map] */
    public static final Object l(String field, Object value) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        d dVarA = d.f93913b.a(field);
        String str = value instanceof String ? (String) value : null;
        if (dVarA == null || str == null) {
            return value;
        }
        int i10 = C1075e.$EnumSwitchMapping$0[dVarA.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return StringsKt.toIntOrNull(value.toString());
                }
                throw new lf.m();
            }
            Integer intOrNull = StringsKt.toIntOrNull(str.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            List<??> listM = z.m(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            for (?? M : listM) {
                try {
                    try {
                        M = z.n(new JSONObject((String) M));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    M = z.m(new JSONArray((String) M));
                }
                arrayList.add(M);
            }
            return arrayList;
        } catch (JSONException e10) {
            r.f19964e.c(d0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
            return Unit.f93236a;
        }
    }

    public final List a(l2.a eventType, Map userData, Map appData, Map restOfData, List customEvents, Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        Intrinsics.checkNotNullParameter(customEvents, "customEvents");
        Map mapD = d(userData, appData, restOfData);
        int i10 = C1075e.$EnumSwitchMapping$2[eventType.ordinal()];
        if (i10 == 1) {
            return c(mapD, obj);
        }
        if (i10 != 2) {
            return null;
        }
        return b(mapD, customEvents);
    }

    public final Map d(Map userData, Map appData, Map restOfData) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.g(), n.APP.g());
        linkedHashMap.put(k.USER_DATA.g(), userData);
        linkedHashMap.put(k.APP_DATA.g(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    public final List e(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        l2.a aVarF = f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (aVarF == l2.a.OTHER) {
            return null;
        }
        return a(aVarF, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(n.INSTALL_EVENT_TIME.g()));
    }

    public final void g(Map userData, Map appData, l2.b field, Object value) {
        k kVarB;
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        c cVar = (c) f93900b.get(field);
        if (cVar == null || (kVarB = cVar.b()) == null) {
            return;
        }
        int i10 = C1075e.$EnumSwitchMapping$1[kVarB.ordinal()];
        if (i10 == 1) {
            h(appData, field, value);
        } else {
            if (i10 != 2) {
                return;
            }
            i(userData, field, value);
        }
    }
}
