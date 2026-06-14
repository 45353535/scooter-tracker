package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 extends i0 implements KMutableProperty2 {
    @Override // kotlin.jvm.internal.o
    protected KCallable computeReflected() {
        return v0.g(this);
    }

    @Override // kotlin.reflect.KProperty2
    public Object getDelegate(Object obj, Object obj2) {
        return ((KMutableProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty2.Getter getGetter() {
        return ((KMutableProperty2) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public KMutableProperty2.Setter getSetter() {
        return ((KMutableProperty2) getReflected()).getSetter();
    }
}
