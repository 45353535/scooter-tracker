package com.appodeal.ads;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.ironsource.C4424m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a5 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j5 f11874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Iterator f11875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JSONObject f11877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j5 f11878v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(JSONObject jSONObject, j5 j5Var, Continuation continuation) {
        super(2, continuation);
        this.f11877u = jSONObject;
        this.f11878v = j5Var;
    }

    public static final CharSequence c(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("status");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return strOptString;
    }

    public static final CharSequence i(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("status");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return strOptString;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a5(this.f11877u, this.f11878v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a5(this.f11877u, this.f11878v, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j5 j5Var;
        Iterator it;
        a5 a5Var = this;
        Object objG = pf.b.g();
        int i10 = a5Var.f11876t;
        if (i10 == 0) {
            kotlin.d.b(obj);
            JSONArray jSONArrayOptJSONArray = a5Var.f11877u.optJSONArray("init");
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            int length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(i11) : null;
                if (jSONObjectOptJSONObject != null) {
                    setCreateSetBuilder.add(jSONObjectOptJSONObject);
                }
            }
            Set setBuild = SetsKt.build(setCreateSetBuilder);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : setBuild) {
                Integer numD = kotlin.coroutines.jvm.internal.b.d(((JSONObject) obj2).optInt(C4424m2.f43622u, 0));
                Object arrayList = linkedHashMap.get(numD);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(numD, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            SortedMap sortedMap = MapsKt.toSortedMap(linkedHashMap);
            for (Map.Entry entry : sortedMap.entrySet()) {
                Integer num = (Integer) entry.getKey();
                List list = (List) entry.getValue();
                Intrinsics.checkNotNull(list);
                LogExtKt.logInternal$default("InitRequestUseCase", "Initialization order #" + num + ": " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.appodeal.ads.y4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return a5.c((JSONObject) obj3);
                    }
                }, 31, null), null, 4, null);
            }
            j5Var = a5Var.f11878v;
            it = sortedMap.entrySet().iterator();
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = a5Var.f11875s;
            j5Var = a5Var.f11874r;
            kotlin.d.b(obj);
        }
        Iterator it2 = it;
        j5 j5Var2 = j5Var;
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Integer num2 = (Integer) entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            List list2 = (List) value;
            LogExtKt.logInternal$default("InitRequestUseCase", "Initialization start order #" + num2 + ": " + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1() { // from class: com.appodeal.ads.z4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return a5.i((JSONObject) obj3);
                }
            }, 31, null), null, 4, null);
            ContextProvider contextProvider = j5Var2.f13504b;
            com.appodeal.ads.initializing.h hVar = j5Var2.f13506d;
            com.appodeal.ads.utils.session.g gVar = j5Var2.f13505c;
            a5Var.f11874r = j5Var2;
            a5Var.f11875s = it2;
            a5Var.f11876t = 1;
            if (j5.b(j5Var2, contextProvider, hVar, gVar, list2, a5Var) == objG) {
                return objG;
            }
            a5Var = this;
        }
        return Unit.f93236a;
    }
}
