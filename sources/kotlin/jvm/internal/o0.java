package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 extends q0 implements KProperty2 {
    public o0() {
    }

    @Override // kotlin.jvm.internal.o
    protected KCallable computeReflected() {
        return v0.k(this);
    }

    @Override // kotlin.reflect.KProperty2
    public Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public o0(Class cls, String str, String str2, int i10) {
        super(o.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
