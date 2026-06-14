package ze;

import com.ironsource.D5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import yf.e;

/* JADX INFO: loaded from: classes3.dex */
final class r implements Map.Entry, e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f119361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f119362c;

    public r(Object obj, Object obj2) {
        this.f119361b = obj;
        this.f119362c = obj2;
    }

    public void a(Object obj) {
        this.f119362c = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f119361b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f119362c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Intrinsics.checkNotNull(key);
        int iHashCode = key.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        Object value = getValue();
        Intrinsics.checkNotNull(value);
        return iHashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        a(obj);
        return getValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(D5.T);
        sb2.append(getValue());
        return sb2.toString();
    }
}
