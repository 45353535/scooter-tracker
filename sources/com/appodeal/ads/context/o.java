package com.appodeal.ads.context;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements ContextProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f13205b = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f13206a = (t) q.f13207a.getValue();

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Object awaitResumedActivity(Continuation continuation) {
        return this.f13206a.awaitResumedActivity(continuation);
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Flow getActivityFlow() {
        return this.f13206a.f13213a.getActivityFlow();
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Context getApplicationContext() {
        return this.f13206a.getApplicationContext();
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Context getApplicationContextOrNull() {
        return this.f13206a.f13214b;
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ContextProvider
    public final Activity getResumedActivity() {
        return this.f13206a.f13213a.getResumedActivity();
    }
}
