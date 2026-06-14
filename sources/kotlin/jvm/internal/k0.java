package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 extends q0 implements KProperty0 {
    public k0() {
    }

    @Override // kotlin.jvm.internal.o
    protected KCallable computeReflected() {
        return v0.i(this);
    }

    @Override // kotlin.reflect.KProperty0
    public Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public k0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty0.Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }
}
