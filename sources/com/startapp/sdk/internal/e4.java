package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class e4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb f64444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64445c;

    public e4(com.startapp.sdk.components.a aVar, Context context, lb lbVar) {
        this.f64445c = aVar;
        this.f64443a = context;
        this.f64444b = lbVar;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new v5("info"));
        k9 k9Var = new k9(this.f64443a);
        m8 m8Var = (m8) this.f64444b.a();
        c4 c4Var = new c4(threadPoolExecutor);
        com.startapp.sdk.components.a aVar = this.f64445c;
        return new w9(k9Var, m8Var, threadPoolExecutor, c4Var, aVar.f64193t, new aa(this.f64443a, aVar.f64187n, aVar.f64182i), new d4());
    }
}
