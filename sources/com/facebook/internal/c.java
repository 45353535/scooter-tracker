package com.facebook.internal;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.FacebookRequestError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f19855g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static c f19856h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f19858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f19861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f19862f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final c c() {
            return new c(null, MapsKt.hashMapOf(TuplesKt.to(2, null), TuplesKt.to(4, null), TuplesKt.to(9, null), TuplesKt.to(17, null), TuplesKt.to(341, null)), MapsKt.hashMapOf(TuplesKt.to(102, null), TuplesKt.to(190, null), TuplesKt.to(Integer.valueOf(TTAdConstant.IMAGE_URL_CODE), null)), null, null, null);
        }

        private final Map d(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS);
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            int iOptInt2 = jSONArrayOptJSONArray2.optInt(i11);
                            if (iOptInt2 != 0) {
                                hashSet.add(Integer.valueOf(iOptInt2));
                            }
                        }
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
            }
            return map;
        }

        public final c a(JSONArray jSONArray) {
            String strOptString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map mapD = null;
            Map mapD2 = null;
            Map mapD3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                    if (StringsKt.N(strOptString, "other", true)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD = d(jSONObjectOptJSONObject);
                    } else if (StringsKt.N(strOptString, "transient", true)) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD2 = d(jSONObjectOptJSONObject);
                    } else if (StringsKt.N(strOptString, "login_recoverable", true)) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapD3 = d(jSONObjectOptJSONObject);
                    }
                }
            }
            return new c(mapD, mapD2, mapD3, strOptString2, strOptString3, strOptString4);
        }

        public final synchronized c b() {
            c cVar;
            try {
                if (c.f19856h == null) {
                    c.f19856h = c();
                }
                cVar = c.f19856h;
                Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            } catch (Throwable th2) {
                throw th2;
            }
            return cVar;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FacebookRequestError.a.values().length];
            try {
                iArr[FacebookRequestError.a.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FacebookRequestError.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FacebookRequestError.a.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.f19857a = map;
        this.f19858b = map2;
        this.f19859c = map3;
        this.f19860d = str;
        this.f19861e = str2;
        this.f19862f = str3;
    }

    public final FacebookRequestError.a c(int i10, int i11, boolean z10) {
        Set set;
        Set set2;
        Set set3;
        if (z10) {
            return FacebookRequestError.a.TRANSIENT;
        }
        Map map = this.f19857a;
        if (map != null && map.containsKey(Integer.valueOf(i10)) && ((set3 = (Set) this.f19857a.get(Integer.valueOf(i10))) == null || set3.contains(Integer.valueOf(i11)))) {
            return FacebookRequestError.a.OTHER;
        }
        Map map2 = this.f19859c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set2 = (Set) this.f19859c.get(Integer.valueOf(i10))) == null || set2.contains(Integer.valueOf(i11)))) {
            return FacebookRequestError.a.LOGIN_RECOVERABLE;
        }
        Map map3 = this.f19858b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i10)) && ((set = (Set) this.f19858b.get(Integer.valueOf(i10))) == null || set.contains(Integer.valueOf(i11)))) ? FacebookRequestError.a.TRANSIENT : FacebookRequestError.a.OTHER;
    }

    public final String d(FacebookRequestError.a aVar) {
        int i10 = aVar == null ? -1 : b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i10 == 1) {
            return this.f19860d;
        }
        if (i10 == 2) {
            return this.f19862f;
        }
        if (i10 != 3) {
            return null;
        }
        return this.f19861e;
    }
}
