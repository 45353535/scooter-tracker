package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ta0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ua0 f116141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(ua0 ua0Var) {
        super(0);
        this.f116141b = ua0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(this.f116141b.f116584a.toMillis(1L));
    }
}
