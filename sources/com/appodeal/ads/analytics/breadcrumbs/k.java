package com.appodeal.ads.analytics.breadcrumbs;

import com.appodeal.ads.modules.common.internal.service.CrashReportingService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f12670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Throwable f12671t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.f12670s = mVar;
        this.f12671t = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f12670s, this.f12671t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.f12670s, this.f12671t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12669r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableStateFlow mutableStateFlow = this.f12670s.f12677b;
            j jVar = new j(null);
            this.f12669r = 1;
            obj = hg.i.y(mutableStateFlow, jVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (obj2 instanceof CrashReportingService) {
                arrayList.add(obj2);
            }
        }
        Throwable th2 = this.f12671t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((CrashReportingService) it.next()).reportThrowable(th2);
        }
        return Unit.f93236a;
    }
}
