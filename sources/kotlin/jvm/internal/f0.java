package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 extends i0 implements KMutableProperty1 {
    public f0() {
    }

    @Override // kotlin.jvm.internal.o
    protected KCallable computeReflected() {
        return v0.f(this);
    }

    @Override // kotlin.reflect.KProperty1
    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public f0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty1.Getter getGetter() {
        return ((KMutableProperty1) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public KMutableProperty1.Setter getSetter() {
        return ((KMutableProperty1) getReflected()).getSetter();
    }
}
