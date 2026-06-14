package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tn3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn3 f116305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn3(zn3 zn3Var) {
        super(0);
        this.f116305b = zn3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f116305b.f118745a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdClicked();
        }
        return Unit.f93236a;
    }
}
