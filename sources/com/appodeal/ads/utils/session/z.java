package com.appodeal.ads.utils.session;

import com.appodeal.ads.ext.JsonArrayBuilder;
import com.appodeal.ads.ext.JsonExtKt;
import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.storage.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f15129a;

    public z(e0 keyValueStorage) {
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        this.f15129a = keyValueStorage;
    }

    public static e b(JSONObject jSONObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            String string = jSONObject.getString("session_uuid");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            objB = Result.b(new e(jSONObject.getInt("session_id"), string, jSONObject.getLong("session_start_ts"), jSONObject.getLong("session_start_ts_m"), jSONObject.getLong("session_uptime"), jSONObject.getLong("session_uptime_m"), 0L, 0L, 0L));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (e) objB;
    }

    public static final Unit c(e eVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("session_uuid", eVar.f15065b);
        jsonObject.hasValue("session_id", Integer.valueOf(eVar.f15064a));
        jsonObject.hasValue("session_uptime", Long.valueOf(eVar.f15068e));
        jsonObject.hasValue("session_uptime_m", Long.valueOf(eVar.f15069f));
        jsonObject.hasValue("session_start_ts", Long.valueOf(eVar.f15066c));
        jsonObject.hasValue("session_start_ts_m", Long.valueOf(eVar.f15067d));
        return Unit.f93236a;
    }

    public static final Unit d(List list, z zVar, JsonArrayBuilder jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "$this$jsonArray");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            zVar.getClass();
            arrayList.add(e(eVar));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            jsonArray.putValues(arrayList);
        }
        return Unit.f93236a;
    }

    public static JSONObject e(final e eVar) {
        return JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.utils.session.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.c(eVar, (JsonObjectBuilder) obj);
            }
        });
    }

    public final b a() {
        com.appodeal.ads.storage.a0 a0Var = this.f15129a.f14800a;
        a0Var.getClass();
        com.appodeal.ads.storage.d dVar = com.appodeal.ads.storage.d.f14788c;
        Long lValueOf = !a0Var.c(dVar).contains("first_ad_session_launch_time") ? null : Long.valueOf(a0Var.c(dVar).getLong("first_ad_session_launch_time", 0L));
        if (lValueOf == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f15129a.f14800a.i(jCurrentTimeMillis);
            return new b(0, 0L, 0L, jCurrentTimeMillis);
        }
        long jLongValue = lValueOf.longValue();
        int iK = this.f15129a.f14800a.k();
        com.appodeal.ads.storage.a0 a0Var2 = this.f15129a.f14800a;
        a0Var2.getClass();
        long j10 = a0Var2.c(dVar).getLong("app_uptime", 0L);
        com.appodeal.ads.storage.a0 a0Var3 = this.f15129a.f14800a;
        a0Var3.getClass();
        return new b(iK, j10, a0Var3.c(dVar).getLong("app_uptime_m", 0L), jLongValue);
    }

    public final void f(final List sessions) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        JSONArray jsonArray = JsonObjectBuilderKt.jsonArray(new Function1() { // from class: com.appodeal.ads.utils.session.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.d(sessions, this, (JsonArrayBuilder) obj);
            }
        });
        LogExtKt.logInternal$default("SessionStorageInteractor", "Sessions list saved: " + jsonArray, null, 4, null);
        e0 e0Var = this.f15129a;
        String string = jsonArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        e0Var.g(string);
    }

    public final e g() {
        com.appodeal.ads.storage.a0 a0Var = this.f15129a.f14800a;
        a0Var.getClass();
        com.appodeal.ads.storage.d dVar = com.appodeal.ads.storage.d.f14788c;
        String string = a0Var.c(dVar).getString("session_uuid", null);
        if (string != null) {
            String str = !StringsKt.y0(string) ? string : null;
            if (str != null) {
                return new e(a0Var.k(), str, a0Var.c(dVar).getLong("session_start_ts", 0L), a0Var.c(dVar).getLong("session_start_ts_m", 0L), a0Var.c(dVar).getLong("session_uptime", 0L), a0Var.c(dVar).getLong("session_uptime_m", 0L), 0L, 0L, 0L);
            }
        }
        return null;
    }

    public final List h() {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            List listAsList = JsonExtKt.asList(new JSONArray(this.f15129a.f()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                e eVarB = b((JSONObject) it.next());
                if (eVarB != null) {
                    arrayList.add(eVarB);
                }
            }
            LogExtKt.logInternal$default("SessionStorageInteractor", "Sessions list retrieved: " + arrayList, null, 4, null);
            objB = Result.b(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        List list = (List) (Result.i(objB) ? null : objB);
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
