package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class q42 implements z42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f114874a = new CopyOnWriteArrayList();

    @Override // yads.z42
    public final void a(long j10, long j11) {
        Iterator it = this.f114874a.iterator();
        while (it.hasNext()) {
            ((z42) it.next()).a(j10, j11);
        }
    }

    @Override // yads.z42
    public final void b() {
        Iterator it = this.f114874a.iterator();
        while (it.hasNext()) {
            ((z42) it.next()).b();
        }
    }

    @Override // yads.z42
    public final void a() {
        Iterator it = this.f114874a.iterator();
        while (it.hasNext()) {
            ((z42) it.next()).a();
        }
    }
}
