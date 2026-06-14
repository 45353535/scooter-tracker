package yads;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f118281a = new CopyOnWriteArrayList();

    public final void a(final int i10, final long j10, final long j11) {
        for (final xl xlVar : this.f118281a) {
            if (!xlVar.f117861c) {
                xlVar.f117859a.post(new Runnable() { // from class: yads.h71
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((xa0) xlVar.f117860b).b(i10, j10, j11);
                    }
                });
            }
        }
    }
}
