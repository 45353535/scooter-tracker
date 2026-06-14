package com.appodeal.ads.services.adjust.util;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.adjust.sdk.Util;
import com.appodeal.ads.ext.LogExtKt;
import com.taurusx.tax.y.z.w.z;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f14566s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Continuation continuation) {
        super(2, continuation);
        this.f14566s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f14566s, continuation);
        cVar.f14565r = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        c cVar = new c(this.f14566s, (Continuation) obj2);
        cVar.f14565r = (CoroutineScope) obj;
        return cVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        pf.b.g();
        kotlin.d.b(obj);
        Context context = this.f14566s;
        try {
            Result.Companion companion = Result.f93230c;
            Object object = Util.readObject(context, Constants.ACTIVITY_STATE_FILENAME, "Activity state", Object.class);
            Field declaredField = object.getClass().getDeclaredField(z.C0835z.f67724y);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(object);
            objB = Result.b(obj2 instanceof String ? (String) obj2 : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logInternal("AdjustService", "[AdjustAdIdReader] Failed to read object from storage", thG);
        }
        if (Result.i(objB)) {
            return null;
        }
        return objB;
    }
}
