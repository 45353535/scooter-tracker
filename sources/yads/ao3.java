package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ao3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ co3 f108741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f108742c = "Cannot load bidder token. Token generation failed";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao3(co3 co3Var) {
        super(0);
        this.f108741b = co3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f108741b.f109501a.onBidderTokenFailedToLoad(this.f108742c);
        return Unit.f93236a;
    }
}
