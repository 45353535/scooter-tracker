package u5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.e;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f105235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f105236b;

    public b(Object obj, Function0 invalidator) {
        Intrinsics.checkNotNullParameter(invalidator, "invalidator");
        this.f105235a = invalidator;
        this.f105236b = obj;
    }

    @Override // kotlin.properties.e, kotlin.properties.d
    public Object getValue(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f105236b;
    }

    @Override // kotlin.properties.e
    public void setValue(Object obj, KProperty property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (Intrinsics.areEqual(this.f105236b, obj2)) {
            return;
        }
        this.f105236b = obj2;
        this.f105235a.invoke();
    }
}
