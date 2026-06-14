package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends d implements w {
    private final int arity;

    public k(int i10, Continuation continuation) {
        super(continuation);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.w
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strL = v0.l(this);
        Intrinsics.checkNotNullExpressionValue(strL, "renderLambdaToString(...)");
        return strL;
    }
}
