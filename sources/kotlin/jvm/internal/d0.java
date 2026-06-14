package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 extends i0 implements KMutableProperty0 {
    public d0() {
    }

    @Override // kotlin.jvm.internal.o
    protected KCallable computeReflected() {
        return v0.e(this);
    }

    @Override // kotlin.reflect.KProperty0
    public Object getDelegate() {
        return ((KMutableProperty0) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public d0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty0.Getter getGetter() {
        return ((KMutableProperty0) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public KMutableProperty0.Setter getSetter() {
        return ((KMutableProperty0) getReflected()).getSetter();
    }
}
