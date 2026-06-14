package k0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f85950a;

    p(List list) {
        this.f85950a = list;
    }

    @Override // k0.o
    public List b() {
        return this.f85950a;
    }

    @Override // k0.o
    public boolean isStatic() {
        return this.f85950a.isEmpty() || (this.f85950a.size() == 1 && ((r0.a) this.f85950a.get(0)).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f85950a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f85950a.toArray()));
        }
        return sb2.toString();
    }
}
