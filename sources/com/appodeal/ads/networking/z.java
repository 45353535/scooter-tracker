package com.appodeal.ads.networking;

import com.appodeal.ads.a6;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.ads.network.HttpClient;
import com.appodeal.ads.network.HttpError;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.w5;
import eg.x1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f14191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a6 f14194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a6 f14195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.networking.processors.a f14196w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a6 a6Var, a6 a6Var2, com.appodeal.ads.networking.processors.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f14194u = a6Var;
        this.f14195v = a6Var2;
        this.f14196w = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        z zVar = new z(this.f14194u, this.f14195v, this.f14196w, continuation);
        zVar.f14193t = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objAsFailure;
        Object objG = pf.b.g();
        int i10 = this.f14192s;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f14193t;
            String str2 = ((HttpClient.Proto) this.f14194u.a()).getHost() + "/" + ((w5) this.f14195v).c();
            y yVar = new y(this.f14194u, this.f14195v, this.f14196w, null);
            this.f14193t = coroutineScope;
            this.f14191r = str2;
            this.f14192s = 1;
            obj = x1.e(20000L, yVar, this);
            if (obj == objG) {
                return objG;
            }
            str = str2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f14191r;
            kotlin.d.b(obj);
        }
        Result result = (Result) obj;
        if (result != null) {
            objAsFailure = result.l();
        } else {
            HttpError.TimeoutError timeoutError = new HttpError.TimeoutError("Request failed by timeout: 20000. " + str);
            Log.log(timeoutError);
            objAsFailure = ResultExtKt.asFailure(timeoutError);
        }
        return Result.a(objAsFailure);
    }
}
