package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ho3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ko3 f111652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ro3 f111653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho3(ko3 ko3Var, ro3 ro3Var) {
        super(0);
        this.f111652b = ko3Var;
        this.f111653c = ro3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f111652b.f112799a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onImpression(this.f111653c);
        }
        return Unit.f93236a;
    }
}
