package com.appodeal.ads.analytics.breadcrumbs;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.LogConstants;
import eg.x1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f12673s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f12674t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Throwable f12675u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.f12674t = mVar;
        this.f12675u = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f12674t, this.f12675u, continuation);
        lVar.f12673s = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objG = pf.b.g();
        int i10 = this.f12672r;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                m mVar = this.f12674t;
                Throwable th2 = this.f12675u;
                Result.Companion companion = Result.f93230c;
                k kVar = new k(mVar, th2, null);
                this.f12672r = 1;
                obj = x1.e(20000L, kVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            objB = Result.b((Unit) obj);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th3));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logInternal$default(LogConstants.KEY_SDK, "Error during error reporting: " + thG.getMessage(), null, 4, null);
        }
        return Unit.f93236a;
    }
}
