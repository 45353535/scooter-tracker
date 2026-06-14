package com.appodeal.consent.cache;

import android.content.SharedPreferences;
import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f15383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f15384s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f15383r = pVar;
        this.f15384s = iVar;
    }

    public static final Unit c(i iVar, String str, JsonObjectBuilder jsonObjectBuilder) throws JSONException {
        SharedPreferences sharedPreferences = iVar.f15392b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iabPreferences");
            sharedPreferences = null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNull(key);
            if (StringsKt.a0(key, str, false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.checkNotNull(str2);
            jsonObjectBuilder.hasValue(str2, value);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f15383r, this.f15384s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f15383r, this.f15384s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        com.appodeal.consent.logger.a.b("[PrivacyPreferences] - getIabConsent: " + this.f15383r.a(), null);
        final String strB = this.f15383r.b();
        if (strB == null) {
            return null;
        }
        final i iVar = this.f15384s;
        JSONObject jsonObject = JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.consent.cache.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return f.c(iVar, strB, (JsonObjectBuilder) obj2);
            }
        });
        if (jsonObject.length() > 0) {
            return jsonObject;
        }
        return null;
    }
}
