package kotlinx.coroutines;

import eg.f1;
import eg.y0;

/* JADX INFO: loaded from: classes3.dex */
final class p implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f93630b;

    public p(boolean z10) {
        this.f93630b = z10;
    }

    @Override // eg.y0
    public f1 b() {
        return null;
    }

    @Override // eg.y0
    public boolean isActive() {
        return this.f93630b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
