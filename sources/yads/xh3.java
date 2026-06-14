package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class xh3 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ci3 f117820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh3(ci3 ci3Var) {
        super(2);
        this.f117820b = ci3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (wh3.f117458a[((m90) obj).ordinal()] == 1) {
            this.f117820b.f109418a.invoke(new p80(zBooleanValue));
        }
        return Unit.f93236a;
    }
}
