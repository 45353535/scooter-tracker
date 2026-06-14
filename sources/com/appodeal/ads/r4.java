package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.utils.Log;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f14318t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.initializing.h f14319u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f14320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JSONObject f14321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j5 f14322x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ContextProvider f14323y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.utils.session.g f14324z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(long j10, com.appodeal.ads.initializing.h hVar, String str, JSONObject jSONObject, j5 j5Var, ContextProvider contextProvider, com.appodeal.ads.utils.session.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f14318t = j10;
        this.f14319u = hVar;
        this.f14320v = str;
        this.f14321w = jSONObject;
        this.f14322x = j5Var;
        this.f14323y = contextProvider;
        this.f14324z = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        r4 r4Var = new r4(this.f14318t, this.f14319u, this.f14320v, this.f14321w, this.f14322x, this.f14323y, this.f14324z, continuation);
        r4Var.f14317s = obj;
        return r4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objG = pf.b.g();
        int i10 = this.f14316r;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                long j10 = this.f14318t;
                com.appodeal.ads.initializing.h hVar = this.f14319u;
                String str = this.f14320v;
                JSONObject jSONObject = this.f14321w;
                j5 j5Var = this.f14322x;
                ContextProvider contextProvider = this.f14323y;
                com.appodeal.ads.utils.session.g gVar = this.f14324z;
                Result.Companion companion = Result.f93230c;
                n4 n4Var = new n4(hVar, str, jSONObject, j5Var, contextProvider, gVar, null);
                this.f14316r = 1;
                if (eg.x1.c(j10, n4Var, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        String str2 = this.f14320v;
        Throwable thG = Result.g(objB);
        if (thG != null) {
            Log.log("Network", LogConstants.EVENT_INFO, z6.d(str2) + " initialization failed with error: " + thG, Log.LogLevel.verbose);
        }
        if (Result.i(objB)) {
            return null;
        }
        return objB;
    }
}
