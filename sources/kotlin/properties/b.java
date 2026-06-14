package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f93339a;

    @Override // kotlin.properties.e, kotlin.properties.d
    public Object getValue(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj2 = this.f93339a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.e
    public void setValue(Object obj, KProperty property, Object value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f93339a = value;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NotNullProperty(");
        if (this.f93339a != null) {
            str = "value=" + this.f93339a;
        } else {
            str = "value not initialized yet";
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }
}
