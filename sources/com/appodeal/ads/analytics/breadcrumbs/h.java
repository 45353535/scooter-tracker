package com.appodeal.ads.analytics.breadcrumbs;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.service.CrashReportingService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f12662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f12663t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function0 f12664u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f12663t = mVar;
        this.f12664u = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f12663t, this.f12664u, continuation);
        hVar.f12662s = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Function0 function0;
        Object objG = pf.b.g();
        int i10 = this.f12661r;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                m mVar = this.f12663t;
                Function0 function02 = this.f12664u;
                Result.Companion companion = Result.f93230c;
                MutableStateFlow mutableStateFlow = mVar.f12677b;
                g gVar = new g(null);
                this.f12662s = function02;
                this.f12661r = 1;
                obj = hg.i.y(mutableStateFlow, gVar, this);
                if (obj == objG) {
                    return objG;
                }
                function0 = function02;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) this.f12662s;
                kotlin.d.b(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof CrashReportingService) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((CrashReportingService) obj3).isBreadcrumbsEnabled()) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                e eVar = (e) function0.invoke();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((CrashReportingService) it.next()).addBreadcrumb(eVar.getKey(), eVar.a());
                }
            }
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logInternal$default(LogConstants.KEY_SDK, "Error during breadcrumb adding: " + thG.getMessage(), null, 4, null);
        }
        return Result.a(objB);
    }
}
