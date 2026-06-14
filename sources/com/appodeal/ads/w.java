package com.appodeal.ads;

import android.os.Handler;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f15164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f15166c;

    public w(l0 l0Var, te teVar, String str) {
        this.f15166c = l0Var;
        this.f15164a = teVar;
        this.f15165b = str;
    }

    public static void a() {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdTestActivity", "name");
        TestActivity testActivity = h2.f13369c;
        testActivity.i();
        testActivity.e();
    }

    public final void b(JSONObject jSONObject) {
        try {
            if (jSONObject == null) {
                this.f15166c.f13567g.Q(this.f15164a, null, LoadingError.RequestError);
                return;
            }
            if (!this.f15166c.f13569i && !jSONObject.optBoolean(this.f15165b) && !com.appodeal.ads.segments.s0.g().f14484b.e(this.f15166c.f13566f)) {
                if (jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS) && jSONObject.has("main_id")) {
                    AdType adType = this.f15166c.f13566f;
                    if ((adType == AdType.Interstitial || adType == AdType.Rewarded) && this.f15164a.G != null && q3.f14290a.get()) {
                        this.f15166c.f13567g.Q(this.f15164a, null, LoadingError.RequestError);
                        return;
                    }
                    db.c(jSONObject);
                    this.f15166c.n(jSONObject);
                    com.appodeal.ads.waterfall_filter.a aVar = new com.appodeal.ads.waterfall_filter.a(jSONObject, this.f15166c.f13566f);
                    aVar.a(null);
                    te teVar = this.f15164a;
                    if (teVar.G == null) {
                        this.f15166c.f13575o = aVar;
                    }
                    teVar.f14898j = aVar.f15205g;
                    com.appodeal.ads.waterfall_filter.d dVar = aVar.f15203e;
                    teVar.f14889a = dVar.f15215b;
                    teVar.f14890b = dVar.f15214a;
                    teVar.f14899k = Long.valueOf(com.appodeal.ads.segments.s0.g().f14483a);
                    te teVar2 = this.f15164a;
                    if (!teVar2.f14895g) {
                        this.f15166c.B(teVar2);
                        return;
                    }
                    if (teVar2.f14896h && h2.f13369c != null) {
                        Runnable task = new Runnable() { // from class: com.appodeal.ads.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                w.a();
                            }
                        };
                        Handler handler = b6.f13134a;
                        Intrinsics.checkNotNullParameter(task, "task");
                        b6.f13134a.post(task);
                        return;
                    }
                    Runnable task2 = new Runnable() { // from class: com.appodeal.ads.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14311b.c();
                        }
                    };
                    Handler handler2 = b6.f13134a;
                    Intrinsics.checkNotNullParameter(task2, "task");
                    b6.f13134a.post(task2);
                    new D0(new C0());
                    h hVar = new h();
                    hVar.f13360a = this.f15164a;
                    hVar.f13361b = this.f15166c;
                    zc restrictedData = zc.f15321a;
                    com.appodeal.ads.utils.session.r sessionManager = com.appodeal.ads.utils.session.r.f15109b;
                    Intrinsics.checkNotNullParameter(restrictedData, "restrictedData");
                    Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
                    D0.a(com.appodeal.ads.context.o.f13205b, hVar, new p());
                    return;
                }
                if (jSONObject.has(PglCryptUtils.KEY_MESSAGE)) {
                    this.f15166c.m(LogConstants.EVENT_REQUEST_FAILED, jSONObject.getString(PglCryptUtils.KEY_MESSAGE));
                }
                this.f15166c.f13567g.Q(this.f15164a, null, LoadingError.RequestError);
                return;
            }
            l0 l0Var = this.f15166c;
            l0Var.f13569i = true;
            l0Var.m(LogConstants.EVENT_REQUEST_FAILED, "disabled");
        } catch (Exception e10) {
            Log.log(e10);
            this.f15166c.f13567g.Q(this.f15164a, null, LoadingError.InternalError);
        }
    }

    public final void c() {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdDebugNetwork", "name");
        d9 d9Var = (d9) h2.f13370d.getValue();
        AdType adType = this.f15166c.f13566f;
        d9Var.getClass();
        Intrinsics.checkNotNullParameter(adType, "adType");
        eg.i.d((CoroutineScope) d9Var.f13236a.getValue(), null, null, new v8(d9Var, adType, null), 3, null);
    }
}
