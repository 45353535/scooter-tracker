package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hr3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lr3 f111767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cn3 f111768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr3(lr3 lr3Var, cn3 cn3Var) {
        super(0);
        this.f111767b = lr3Var;
        this.f111768c = cn3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f111767b.f113203a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToShow(this.f111768c);
        }
        return Unit.f93236a;
    }
}
