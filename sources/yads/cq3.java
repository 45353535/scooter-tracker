package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class cq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fq3 f109521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cn3 f109522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq3(fq3 fq3Var, cn3 cn3Var) {
        super(0);
        this.f109521b = fq3Var;
        this.f109522c = cn3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f109521b.f110832a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdFailedToShow(this.f109522c);
        }
        return Unit.f93236a;
    }
}
