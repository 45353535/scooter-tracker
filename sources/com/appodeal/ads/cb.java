package com.appodeal.ads;

import android.os.Handler;
import com.appodeal.ads.networking.LoadingError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cb implements AdNetworkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.context.o f13170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te f13171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bd f13172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa f13173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc f13174e;

    public cb(uc ucVar, com.appodeal.ads.context.o oVar, te teVar, bd bdVar, wa waVar) {
        this.f13174e = ucVar;
        this.f13170a = oVar;
        this.f13171b = teVar;
        this.f13172c = bdVar;
        this.f13173d = waVar;
    }

    public static void a(bc bcVar, te teVar, LoadingError loadingError) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdAdObjectLoadAbort", "name");
        ((bd) bcVar).f13147a.b(loadingError);
    }

    @Override // com.appodeal.ads.AdNetworkInitializationListener
    public final void onInitializationFailed(final LoadingError loadingError) {
        final bd bdVar = this.f13172c;
        final te teVar = this.f13171b;
        Runnable task = new Runnable() { // from class: com.appodeal.ads.xa
            @Override // java.lang.Runnable
            public final void run() {
                cb.a(bdVar, teVar, loadingError);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    @Override // com.appodeal.ads.AdNetworkInitializationListener
    public final void onInitializationFinished() {
        this.f13174e.d(this.f13170a, this.f13171b, this.f13172c, this.f13173d);
    }
}
