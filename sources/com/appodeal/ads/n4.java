package com.appodeal.ads;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.utils.Log;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.initializing.h f13799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f13800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ JSONObject f13801v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j5 f13802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ContextProvider f13803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.utils.session.g f13804y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.appodeal.ads.initializing.h hVar, String str, JSONObject jSONObject, j5 j5Var, ContextProvider contextProvider, com.appodeal.ads.utils.session.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f13799t = hVar;
        this.f13800u = str;
        this.f13801v = jSONObject;
        this.f13802w = j5Var;
        this.f13803x = contextProvider;
        this.f13804y = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n4(this.f13799t, this.f13800u, this.f13801v, this.f13802w, this.f13803x, this.f13804y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n4 n4Var;
        long j10;
        Object objG = pf.b.g();
        int i10 = this.f13798s;
        if (i10 == 0) {
            kotlin.d.b(obj);
            com.appodeal.ads.initializing.h hVar = this.f13799t;
            String str = this.f13800u;
            Intrinsics.checkNotNull(str);
            AdNetwork adNetworkA = hVar.a(str);
            if (adNetworkA == null) {
                throw new IllegalStateException(("AdNetwork " + this.f13800u + " not found").toString());
            }
            InitializeParams initializeParams = adNetworkA.getInitializeParams(this.f13801v);
            if (initializeParams == null) {
                throw new IllegalStateException(("AdNetwork " + this.f13800u + " init params not found").toString());
            }
            String str2 = this.f13800u;
            j5 j5Var = this.f13802w;
            ContextProvider contextProvider = this.f13803x;
            com.appodeal.ads.utils.session.g gVar = this.f13804y;
            long jCurrentTimeMillis = System.currentTimeMillis();
            LogExtKt.logInternal$default("InitRequestUseCase", "Initialization " + str2 + ": " + initializeParams, null, 4, null);
            this.f13797r = jCurrentTimeMillis;
            this.f13798s = 1;
            n4Var = this;
            if (j5.c(j5Var, contextProvider, gVar, adNetworkA, initializeParams, n4Var) == objG) {
                return objG;
            }
            j10 = jCurrentTimeMillis;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f13797r;
            kotlin.d.b(obj);
            n4Var = this;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j10;
        Log.log("Network", LogConstants.EVENT_INFO, z6.d(n4Var.f13800u) + " initialization finished in " + jCurrentTimeMillis2 + " ms.", Log.LogLevel.verbose);
        return Unit.f93236a;
    }
}
