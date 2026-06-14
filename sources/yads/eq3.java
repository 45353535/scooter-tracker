package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class eq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fq3 f110440b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq3(fq3 fq3Var) {
        super(0);
        this.f110440b = fq3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f110440b.f110832a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdShown();
        }
        return Unit.f93236a;
    }
}
