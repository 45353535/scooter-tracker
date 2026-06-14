package com.appodeal.ads.utils.session;

import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import eg.e0;
import eg.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f15109b = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f15110a;

    public r() {
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(o0.a().plus(new e0("ApdSessionManager")));
        this.f15110a = new q(coroutineScopeA, com.appodeal.ads.context.o.f13205b, new d0(new z(com.appodeal.ads.storage.e0.f14799b)), new w(coroutineScopeA));
    }

    @Override // com.appodeal.ads.utils.session.s
    public final long a() {
        return this.f15110a.a();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void b() {
        this.f15110a.b();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final StateFlow c() {
        return this.f15110a.c();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void d() {
        this.f15110a.d();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final StateFlow e() {
        return this.f15110a.e();
    }

    @Override // com.appodeal.ads.utils.session.g
    public final f f() {
        return this.f15110a.f();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void g() {
        this.f15110a.g();
    }

    public final void h() {
        q qVar = this.f15110a;
        qVar.f15099a.d();
        Job job = qVar.f15106h;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        qVar.f15106h = eg.i.d(qVar.f15101c, null, null, new k(qVar, null), 3, null);
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        q qVar = this.f15110a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        qVar.f15099a.a(jsonObject);
    }

    public final void b(ActivityProvider.LifecycleCallback lifecycleCallback) {
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        this.f15110a.b(lifecycleCallback);
    }
}
