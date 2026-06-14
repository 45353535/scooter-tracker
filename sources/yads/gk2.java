package yads;

import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class gk2 implements kotlin.properties.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f111244a;

    public gk2(Object obj) {
        this.f111244a = new WeakReference(obj);
    }

    @Override // kotlin.properties.e, kotlin.properties.d
    public final Object getValue(Object obj, KProperty kProperty) {
        return this.f111244a.get();
    }

    @Override // kotlin.properties.e
    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        this.f111244a = new WeakReference(obj2);
    }
}
