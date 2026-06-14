package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f84860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f84861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f84862c;

    public j(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f84860a = obj;
        this.f84861b = obj2;
        this.f84862c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f84860a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f84861b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f84860a.hashCode() ^ this.f84861b.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.B(this.f84860a, this.f84861b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f84860a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f84861b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f84861b;
        this.f84861b = obj;
        this.f84862c.put(this.f84860a, obj);
        return obj2;
    }
}
