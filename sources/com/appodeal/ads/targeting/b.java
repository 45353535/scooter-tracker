package com.appodeal.ads.targeting;

import eg.i;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14880r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ JSONObject f14881s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f14882t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JSONObject jSONObject, c cVar, Continuation continuation) {
        super(2, continuation);
        this.f14881s = jSONObject;
        this.f14882t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f14881s, this.f14882t, continuation);
        bVar.f14880r = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f14880r;
        Iterator<String> itKeys = this.f14881s.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        JSONObject jSONObject = this.f14881s;
        c cVar = this.f14882t;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                i.d(coroutineScope, null, null, new a(cVar, next, jSONObjectOptJSONObject, null), 3, null);
            }
        }
        return Unit.f93236a;
    }
}
