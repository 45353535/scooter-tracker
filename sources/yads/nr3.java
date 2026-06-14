package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nr3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ or3 f114006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ er3 f114007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr3(or3 or3Var, er3 er3Var) {
        super(0);
        this.f114006b = or3Var;
        this.f114007c = er3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.f114006b.f114403a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdLoaded(this.f114007c);
        }
        return Unit.f93236a;
    }
}
