package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f116345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f116346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq3(wq3 wq3Var, AdRequestError adRequestError) {
        super(0);
        this.f116345b = wq3Var;
        this.f116346c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f116345b.f117533a.onAdFailedToLoad(this.f116346c);
        return Unit.f93236a;
    }
}
