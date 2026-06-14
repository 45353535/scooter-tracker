package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class fo3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ko3 f110817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f110818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo3(ko3 ko3Var, AdRequestError adRequestError) {
        super(0);
        this.f110817b = ko3Var;
        this.f110818c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f110817b.f112799a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onAdFailedToLoad(this.f110818c);
        }
        return Unit.f93236a;
    }
}
