package yads;

import com.ironsource.C4240b4;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (y72.a(getKey(), entry.getKey()) && y72.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + C4240b4.j.f42668b + getValue();
    }
}
