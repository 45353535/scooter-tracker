package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b62 implements w82, ht1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f108914a = new CopyOnWriteArrayList();

    @Override // yads.ht1
    public final void a() {
        Iterator it = this.f108914a.iterator();
        while (it.hasNext()) {
            ((c62) it.next()).a();
        }
    }

    @Override // yads.w82
    public final void c() {
    }

    @Override // yads.w82
    public final void a(boolean z10) {
        Iterator it = this.f108914a.iterator();
        while (it.hasNext()) {
            ((c62) it.next()).a(z10);
        }
    }
}
