package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 extends q0 implements KProperty1 {
    public m0() {
    }

    @Override // kotlin.jvm.internal.o
    protected KCallable computeReflected() {
        return v0.j(this);
    }

    @Override // kotlin.reflect.KProperty1
    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public m0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty1.Getter getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }
}
