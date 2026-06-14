package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f84865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile k f84866d;

    public k(int i10, Object obj, Object obj2) {
        this.f84863a = i10;
        this.f84864b = obj;
        this.f84865c = obj2;
    }

    public k(int i10, Object obj, Object obj2, k kVar) {
        this(i10, obj, obj2);
        this.f84866d = kVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f84864b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f84865c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f84864b.hashCode() ^ this.f84865c.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.B(this.f84864b, this.f84865c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f84864b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f84865c;
        return value == obj3 || value.equals(obj3);
    }

    public k a(int i10, Object obj) {
        Object obj2;
        k kVar = this;
        do {
            if (kVar.f84863a == i10 && ((obj2 = kVar.f84864b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return kVar;
            }
            kVar = kVar.f84866d;
        } while (kVar != null);
        return null;
    }
}
