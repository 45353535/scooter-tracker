package com.appodeal.ads.targeting;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.initializing.h;
import com.appodeal.ads.initializing.j;
import com.appodeal.ads.unified.SupportsTargetingParams;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f14877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f14878t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JSONObject f14879u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.f14877s = cVar;
        this.f14878t = str;
        this.f14879u = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(this.f14877s, this.f14878t, this.f14879u, continuation);
        aVar.f14876r = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        pf.b.g();
        kotlin.d.b(obj);
        c cVar = this.f14877s;
        String str = this.f14878t;
        JSONObject jSONObject = this.f14879u;
        try {
            Result.Companion companion = Result.f93230c;
            h hVar = cVar.f14883a;
            Intrinsics.checkNotNull(str);
            Object objA = ((j) hVar).a(str);
            if (objA instanceof SupportsTargetingParams) {
                ((SupportsTargetingParams) objA).updateTargetingParams(jSONObject);
                LogExtKt.logInternal$default("TargetingParams", str + " targeting params updated", null, 4, null);
            } else if (objA == null) {
                LogExtKt.logInternal$default("TargetingParams", "Network " + str + " not found", null, 4, null);
            } else {
                LogExtKt.logInternal$default("TargetingParams", str + " does not support targeting params", null, 4, null);
            }
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        String str2 = this.f14878t;
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logInternal("TargetingParams", "Failed to update targeting params for " + str2, thG);
        }
        return Unit.f93236a;
    }
}
