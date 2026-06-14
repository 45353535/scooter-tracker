package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iq3 f111302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f111303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq3(iq3 iq3Var, AdRequestError adRequestError) {
        super(0);
        this.f111302b = iq3Var;
        this.f111303c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.f111302b.f112087a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdFailedToLoad(this.f111303c);
        }
        return Unit.f93236a;
    }
}
