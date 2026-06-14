package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bo3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ co3 f109073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f109074c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo3(co3 co3Var, String str) {
        super(0);
        this.f109073b = co3Var;
        this.f109074c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f109073b.f109501a.onBidderTokenLoaded(this.f109074c);
        return Unit.f93236a;
    }
}
