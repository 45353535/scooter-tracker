package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class un3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn3 f116726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f116727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un3(zn3 zn3Var, AdRequestError adRequestError) {
        super(0);
        this.f116726b = zn3Var;
        this.f116727c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f116726b.f118745a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(this.f116727c);
        }
        return Unit.f93236a;
    }
}
