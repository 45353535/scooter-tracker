package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vq3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f117156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.yandex.mobile.ads.nativeads.d f117157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq3(wq3 wq3Var, com.yandex.mobile.ads.nativeads.d dVar) {
        super(0);
        this.f117156b = wq3Var;
        this.f117157c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f117156b.f117533a.onAdLoaded(this.f117157c);
        return Unit.f93236a;
    }
}
