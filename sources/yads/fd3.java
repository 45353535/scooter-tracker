package yads;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class fd3 implements ed3, gd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f110692a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f110693b = new LinkedHashSet();

    @Override // yads.ed3
    public final void a(long j10, long j11) {
        Iterator it = this.f110692a.iterator();
        while (it.hasNext()) {
            ((ed3) it.next()).a(j10, j11);
        }
    }

    @Override // yads.gd3
    public final void b() {
        Iterator it = this.f110693b.iterator();
        while (it.hasNext()) {
            ((gd3) it.next()).b();
        }
    }

    @Override // yads.gd3
    public final void a() {
        Iterator it = this.f110693b.iterator();
        while (it.hasNext()) {
            ((gd3) it.next()).a();
        }
    }
}
