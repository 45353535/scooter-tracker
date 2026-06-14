package j$.util;

import java.util.Map;

/* JADX INFO: renamed from: j$.util.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5664p implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f84966a;

    public C5664p(Map.Entry entry) {
        this.f84966a = (Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f84966a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f84966a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f84966a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this != obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = this.f84966a;
                Object key = entry2.getKey();
                Object key2 = entry.getKey();
                if (key == null) {
                    zEquals = key2 == null;
                } else {
                    zEquals = key.equals(key2);
                }
                if (zEquals) {
                    Object value = entry2.getValue();
                    Object value2 = entry.getValue();
                    if (value == null) {
                        zEquals2 = value2 == null;
                    } else {
                        zEquals2 = value.equals(value2);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f84966a.toString();
    }
}
