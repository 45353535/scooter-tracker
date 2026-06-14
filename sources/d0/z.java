package d0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f68420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f68421b;

    public z(Object obj) {
        this.f68420a = obj;
        this.f68421b = null;
    }

    public Throwable a() {
        return this.f68421b;
    }

    public Object b() {
        return this.f68420a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (b() != null && b().equals(zVar.b())) {
            return true;
        }
        if (a() == null || zVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public z(Throwable th2) {
        this.f68421b = th2;
        this.f68420a = null;
    }
}
