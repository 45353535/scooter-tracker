package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wn3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn3 f117522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ro3 f117523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn3(zn3 zn3Var, ro3 ro3Var) {
        super(0);
        this.f117522b = zn3Var;
        this.f117523c = ro3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f117522b.f118745a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(this.f117523c);
        }
        return Unit.f93236a;
    }
}
