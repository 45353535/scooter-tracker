package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nf extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ of f113850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(of ofVar) {
        super(1);
        this.f113850b = ofVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f113850b.f114296i.set(false);
        return Unit.f93236a;
    }
}
