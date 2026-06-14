package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class fr3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lr3 f110840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr3(lr3 lr3Var) {
        super(0);
        this.f110840b = lr3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f110840b.f113203a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdClicked();
        }
        return Unit.f93236a;
    }
}
