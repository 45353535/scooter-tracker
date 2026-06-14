package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class io3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ko3 f112073b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io3(ko3 ko3Var) {
        super(0);
        this.f112073b = ko3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f112073b.f112799a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onLeftApplication();
        }
        return Unit.f93236a;
    }
}
