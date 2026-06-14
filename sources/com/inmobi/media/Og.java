package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Og;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Og {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C4209zg f37499d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f37497b = {kotlin.jvm.internal.v0.j(new kotlin.jvm.internal.n0(Og.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), kotlin.jvm.internal.v0.j(new kotlin.jvm.internal.n0(Og.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Og f37496a = new Og();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f37498c = CollectionsKt.listOf((Object[]) new String[]{"ban", "int", "rew", "nat"});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I1 f37500e = new I1(new JSONObject(), new Function0() { // from class: w3.v3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Og.a();
        }
    }, true, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I1 f37501f = new I1(new JSONObject(), new Function0() { // from class: w3.w3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Og.f();
        }
    }, true, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Mutex f37502g = ng.f.b(false, 1, null);

    public static final JSONObject a(Og og2) throws JSONException {
        og2.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = f37496a.b().keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            if (StringsKt.a0(next, "obj_", false, 2, null) || StringsKt.a0(next, "auto_", false, 2, null) || StringsKt.a0(next, "dir_", false, 2, null)) {
                jSONObject.put(next, f37496a.b().opt(next));
            }
        }
        return jSONObject;
    }

    public static final Object b(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws JSONException {
        og2.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            Kb.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return Unit.f93236a;
        }
        int count = publisherConfig.getDirect().getCount();
        Triple tripleC = Pg.c(map, publisherConfig);
        String str = (String) tripleC.d();
        JSONObject jSONObject = (JSONObject) tripleC.g();
        String str2 = (String) tripleC.h();
        if (jSONObject == null) {
            return Unit.f93236a;
        }
        og2.a(str2, "d_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static final Object c(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws JSONException {
        og2.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            Kb.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return Unit.f93236a;
        }
        int count = publisherConfig.getObj().getCount();
        Triple tripleB = Pg.b(map, publisherConfig);
        String str = (String) tripleB.d();
        JSONObject jSONObject = (JSONObject) tripleB.g();
        String str2 = (String) tripleB.h();
        if (jSONObject == null) {
            return Unit.f93236a;
        }
        og2.a(str2, "o_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static final JSONObject f() {
        f37496a.getClass();
        Context context = Ji.f37157a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (f37499d == null) {
                f37499d = new C4209zg(context, "pub_signals_store");
            }
            C4209zg c4209zg = f37499d;
            if (c4209zg == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                c4209zg = null;
            }
            String strA = c4209zg.a(Reporting.Key.IMP_DEPTH);
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final LinkedHashMap d() {
        JSONObject jSONObjectB = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
        List<String> list = f37498c;
        SignalsConfig.PublisherConfig publisherConfigC = c();
        for (String str : list) {
            Pg.a(Pg.a(Pg.a(linkedHashMap, jSONObjectB, "obj_", str, Pg.c(allowedKeysAnd)), jSONObjectB, "auto_", str, Pg.c(allowedKeys)), jSONObjectB, "dir_", str, publisherConfigC.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectB = b();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = jSONObjectB.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            if (!StringsKt.a0(next, "obj_", false, 2, null) && !StringsKt.a0(next, "auto_", false, 2, null) && !StringsKt.a0(next, "dir_", false, 2, null)) {
                jSONObject.put(next, jSONObjectB.opt(next));
            }
        }
        for (String str : f37498c) {
            f37496a.getClass();
            if (c().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                Pg.a(jSONObject, jSONObjectB, str, "obj_", CollectionsKt.toSet(arrayList));
            }
            f37496a.getClass();
            if (c().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                Pg.a(jSONObject, jSONObjectB, str, "auto_", CollectionsKt.toSet(arrayList2));
            }
            f37496a.getClass();
            if (c().getDirect().getEnabled()) {
                Pg.a(jSONObject, jSONObjectB, str, "dir_", c().getDirect().getAllowedKeys().keySet());
            }
        }
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(c().getObj(), "o_i_dep"), TuplesKt.to(c().getDirect(), "d_i_dep"), TuplesKt.to(c().getAuto(), "a_i_dep")})) {
            SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
            String str2 = (String) pair.component2();
            if (baseInputData.getDepth().getEnabled()) {
                Og og2 = f37496a;
                og2.getClass();
                JSONArray jSONArrayOptJSONArray = ((JSONObject) f37501f.getValue(og2, f37497b[1])).optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    Map map = Pg.f37545a;
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                }
                jSONObject.put(str2, jSONArrayOptJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public static final Object a(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws JSONException {
        og2.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return Unit.f93236a;
        }
        int count = publisherConfig.getAuto().getCount();
        Triple tripleA = Pg.a(map, publisherConfig);
        String str = (String) tripleA.d();
        JSONObject jSONObject = (JSONObject) tripleA.g();
        String str2 = (String) tripleA.h();
        if (jSONObject == null) {
            return Unit.f93236a;
        }
        og2.a(str2, "a_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static SignalsConfig.PublisherConfig c() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getPublisher();
    }

    public final JSONObject b() {
        return (JSONObject) f37500e.getValue(this, f37497b[0]);
    }

    public static final JSONObject a() {
        f37496a.getClass();
        Context context = Ji.f37157a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (f37499d == null) {
                f37499d = new C4209zg(context, "pub_signals_store");
            }
            C4209zg c4209zg = f37499d;
            if (c4209zg == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                c4209zg = null;
            }
            String strA = c4209zg.a("saved_signals");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void a(Map signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        try {
            SignalsConfig.PublisherConfig publisherConfigC = c();
            Map map = Pg.f37545a;
            Intrinsics.checkNotNullParameter(publisherConfigC, "<this>");
            if (!publisherConfigC.getEnableMCO() && !publisherConfigC.getEnableAB()) {
                Kb.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            eg.i.d(A9.f36559e, null, null, new Mg(signals, publisherConfigC, null), 3, null);
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            Kb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(org.json.JSONObject r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.Ng
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.Ng r0 = (com.inmobi.media.Ng) r0
            int r1 = r0.f37455e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37455e = r1
            goto L18
        L13:
            com.inmobi.media.Ng r0 = new com.inmobi.media.Ng
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f37453c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37455e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlinx.coroutines.sync.Mutex r7 = r0.f37452b
            org.json.JSONObject r0 = r0.f37451a
            kotlin.d.b(r8)
            goto L60
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.d.b(r8)
            android.content.Context r8 = com.inmobi.media.Ji.f37157a
            if (r8 == 0) goto La9
            com.inmobi.media.Og r2 = com.inmobi.media.Og.f37496a
            r2.getClass()
            com.inmobi.media.zg r2 = com.inmobi.media.Og.f37499d
            if (r2 != 0) goto L4f
            com.inmobi.media.zg r2 = new com.inmobi.media.zg
            java.lang.String r5 = "pub_signals_store"
            r2.<init>(r8, r5)
            com.inmobi.media.Og.f37499d = r2
        L4f:
            kotlinx.coroutines.sync.Mutex r8 = com.inmobi.media.Og.f37502g
            r0.f37451a = r7
            r0.f37452b = r8
            r0.f37455e = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L5e
            return r1
        L5e:
            r0 = r7
            r7 = r8
        L60:
            com.inmobi.media.zg r8 = com.inmobi.media.Og.f37499d     // Catch: java.lang.Throwable -> L6b
            if (r8 != 0) goto L6d
            java.lang.String r8 = "prefDao"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)     // Catch: java.lang.Throwable -> L6b
            r8 = r4
            goto L6d
        L6b:
            r8 = move-exception
            goto La5
        L6d:
            java.lang.String r1 = "saved_signals"
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Throwable -> L6b
            r8.getClass()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)     // Catch: java.lang.Throwable -> L6b
            com.inmobi.media.Ea r8 = r8.f40054a     // Catch: java.lang.Throwable -> L6b
            r8.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L6b
            kotlin.Unit r8 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L6b
            r7.unlock(r4)
            com.inmobi.media.I1 r7 = com.inmobi.media.Og.f37500e
            kotlin.jvm.functions.Function0 r8 = r7.f37040a
            java.lang.Object r8 = r8.invoke()
            r7.f37042c = r8
            java.lang.String r7 = "PubSignals"
            java.lang.String r8 = "Publisher Signals saved successfully."
            r1 = 2
            com.inmobi.media.Kb.a(r1, r7, r8)
            r0.toString()
            goto La9
        La5:
            r7.unlock(r4)
            throw r8
        La9:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Og.a(org.json.JSONObject, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static void a(JSONObject jSONObject, String key, JSONArray value) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        jSONObject.put(key, value);
        Context context = Ji.f37157a;
        if (context != null) {
            f37496a.getClass();
            if (f37499d == null) {
                f37499d = new C4209zg(context, "pub_signals_store");
            }
            jSONObject.toString();
            C4209zg c4209zg = f37499d;
            if (c4209zg == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                c4209zg = null;
            }
            String value2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
            c4209zg.getClass();
            Intrinsics.checkNotNullParameter(Reporting.Key.IMP_DEPTH, C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value2, "value");
            Ea ea2 = c4209zg.f40054a;
            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
            ea2.a(Reporting.Key.IMP_DEPTH, value2, false);
            I1 i12 = f37501f;
            i12.f37042c = i12.f37040a.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r8, java.lang.String r9) throws org.json.JSONException {
        /*
            r7 = this;
            java.lang.String r0 = "adFormat"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.inmobi.media.I1 r0 = com.inmobi.media.Og.f37501f
            kotlin.jvm.functions.Function0 r1 = r0.f37040a
            java.lang.Object r1 = r1.invoke()
            r0.f37042c = r1
            kotlin.reflect.KProperty[] r1 = com.inmobi.media.Og.f37497b
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = r0.getValue(r7, r1)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            org.json.JSONArray r1 = r0.optJSONArray(r9)
            r3 = 0
            if (r1 != 0) goto L39
            java.util.Map r1 = com.inmobi.media.Pg.f37545a
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r1.put(r3)
            r1.put(r3)
            r1.put(r3)
            r1.put(r3)
        L39:
            int r4 = r8.hashCode()
            r5 = 97295(0x17c0f, float:1.3634E-40)
            r6 = -1
            if (r4 == r5) goto L74
            r5 = 104431(0x197ef, float:1.46339E-40)
            if (r4 == r5) goto L69
            r5 = 108833(0x1a921, float:1.52508E-40)
            if (r4 == r5) goto L5e
            r5 = 112804(0x1b8a4, float:1.58072E-40)
            if (r4 == r5) goto L53
            goto L7c
        L53:
            java.lang.String r4 = "rew"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L5c
            goto L7c
        L5c:
            r8 = 2
            goto L7f
        L5e:
            java.lang.String r4 = "nat"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L67
            goto L7c
        L67:
            r8 = 3
            goto L7f
        L69:
            java.lang.String r4 = "int"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L72
            goto L7c
        L72:
            r8 = r2
            goto L7f
        L74:
            java.lang.String r4 = "ban"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L7e
        L7c:
            r8 = r6
            goto L7f
        L7e:
            r8 = r3
        L7f:
            if (r8 == r6) goto L8c
            int r3 = r1.optInt(r8, r3)
            int r3 = r3 + r2
            r1.put(r8, r3)
            a(r0, r9, r1)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Og.a(java.lang.String, java.lang.String):void");
    }
}
