package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* JADX INFO: loaded from: classes4.dex */
public final class or3 implements c10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardedAdLoadListener f114403a;

    public or3(RewardedAdLoadListener rewardedAdLoadListener) {
        this.f114403a = rewardedAdLoadListener;
    }

    @Override // yads.c10
    public final void a(k4 k4Var) {
        new CallbackStackTraceMarker(new mr3(this, new AdRequestError(k4Var.f112578a, k4Var.f112580c, k4Var.f112581d)));
    }

    @Override // yads.c10
    public final void a(yo2 yo2Var) {
        new CallbackStackTraceMarker(new nr3(this, new er3(yo2Var, new dn3(), new dk())));
    }
}
