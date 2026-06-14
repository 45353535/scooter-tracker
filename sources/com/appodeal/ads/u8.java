package com.appodeal.ads;

import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AppEvent;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes6.dex */
public final class u8 implements z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f14926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.appodeal.ads.utils.session.r f14927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.appodeal.ads.context.o f14928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f14931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Job f14932g;

    public u8(CoroutineScope scope, com.appodeal.ads.utils.session.r sessionManager, com.appodeal.ads.context.o contextProvider) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f14926a = scope;
        this.f14927b = sessionManager;
        this.f14928c = contextProvider;
        this.f14931f = new AtomicBoolean(false);
    }

    public static final void b(u8 u8Var) {
        Job job = u8Var.f14932g;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        u8Var.f14932g = eg.i.d(u8Var.f14926a, eg.o0.a(), null, new k8(u8Var, null), 2, null);
    }

    public static final Event c() {
        return AppEvent.Resume.INSTANCE;
    }

    public final void a() {
        this.f14930e = System.currentTimeMillis();
        if (this.f14931f.getAndSet(false)) {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_RESUME);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.p8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u8.c();
                }
            });
            Iterator it = ((List) h2.f13375i.getValue()).iterator();
            while (it.hasNext()) {
                ((l0) it.next()).E();
            }
            eg.i.d(this.f14926a, null, null, new o8(this, null), 3, null);
        }
    }
}
