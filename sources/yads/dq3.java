package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class dq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fq3 f110030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ro3 f110031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq3(fq3 fq3Var, ro3 ro3Var) {
        super(0);
        this.f110030b = fq3Var;
        this.f110031c = ro3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f110030b.f110832a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdImpression(this.f110031c);
        }
        return Unit.f93236a;
    }
}
