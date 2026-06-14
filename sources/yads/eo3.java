package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class eo3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ko3 f110430b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo3(ko3 ko3Var) {
        super(0);
        this.f110430b = ko3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f110430b.f112799a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onAdClicked();
        }
        return Unit.f93236a;
    }
}
