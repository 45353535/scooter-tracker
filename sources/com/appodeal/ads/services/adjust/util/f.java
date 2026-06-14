package com.appodeal.ads.services.adjust.util;

import android.content.Context;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.Constants;
import com.adjust.sdk.Util;
import com.appodeal.ads.ext.LogExtKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f14570s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, Continuation continuation) {
        super(2, continuation);
        this.f14570s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f14570s, continuation);
        fVar.f14569r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        f fVar = new f(this.f14570s, (Continuation) obj2);
        fVar.f14569r = (CoroutineScope) obj;
        return fVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        pf.b.g();
        kotlin.d.b(obj);
        Context context = this.f14570s;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b((AdjustAttribution) Util.readObject(context, Constants.ATTRIBUTION_FILENAME, "Attribution", AdjustAttribution.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logInternal("AdjustService", "[AdjustAttributionReader] Failed to read object from storage", thG);
        }
        if (Result.i(objB)) {
            return null;
        }
        return objB;
    }
}
