package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class mr3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ or3 f113596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f113597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr3(or3 or3Var, AdRequestError adRequestError) {
        super(0);
        this.f113596b = or3Var;
        this.f113597c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.f113596b.f114403a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdFailedToLoad(this.f113597c);
        }
        return Unit.f93236a;
    }
}
