package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ir3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lr3 f112113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ro3 f112114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir3(lr3 lr3Var, ro3 ro3Var) {
        super(0);
        this.f112113b = lr3Var;
        this.f112114c = ro3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f112113b.f113203a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdImpression(this.f112114c);
        }
        return Unit.f93236a;
    }
}
