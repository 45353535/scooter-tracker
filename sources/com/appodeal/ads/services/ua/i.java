package com.appodeal.ads.services.ua;

import com.appodeal.ads.ext.JsonExtKt;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.k7;
import com.appodeal.ads.services.r;
import com.taurusx.tax.w.s.s;
import eg.o0;
import hg.c0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f14773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f14774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f14775c;

    public i(CoroutineScope scope, r servicesSolution) {
        k7 api = k7.f13545a;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(servicesSolution, "servicesSolution");
        this.f14773a = servicesSolution;
        MutableSharedFlow mutableSharedFlowB = c0.b(1, 0, gg.a.f72766c, 2, null);
        this.f14774b = mutableSharedFlowB;
        this.f14775c = new LinkedHashSet();
        hg.i.F(hg.i.h(hg.i.E(hg.i.K(new h(hg.i.h(hg.i.E(hg.i.K(mutableSharedFlowB, new b(this, null)), o0.c()), new c(null))), new d(this, null)), o0.b()), new e(null)), scope);
    }

    public final void b(JSONArray eventsJsonArray) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(eventsJsonArray, "eventsJsonArray");
        if (eventsJsonArray.length() == 0) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(eventsJsonArray.length());
            int length = eventsJsonArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = eventsJsonArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                    String strOptString2 = jSONObjectOptJSONObject.optString("service_name");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                    String strOptString3 = jSONObjectOptJSONObject.optString(s.I);
                    Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                    arrayList.add(new a(strOptString, strOptString3, JsonExtKt.toMap(jSONObjectOptJSONObject.optJSONObject("event_payload")), strOptString2));
                }
            }
            listEmptyList = arrayList;
        }
        LogExtKt.logInternal$default("ServicesEventManager", "add events: " + listEmptyList, null, 4, null);
        this.f14774b.g(listEmptyList);
    }
}
