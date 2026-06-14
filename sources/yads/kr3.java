package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class kr3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lr3 f112827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dr3 f112828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr3(lr3 lr3Var, dr3 dr3Var) {
        super(0);
        this.f112827b = lr3Var;
        this.f112828c = dr3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f112827b.f113203a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onRewarded(this.f112828c);
        }
        return Unit.f93236a;
    }
}
