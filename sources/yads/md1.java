package yads;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class md1 implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet f113432b = new TreeSet(new Comparator() { // from class: yads.xm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return md1.a((qr) obj, (qr) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f113433c;

    public md1(long j10) {
        this.f113431a = j10;
    }

    public static int a(qr qrVar, qr qrVar2) {
        long j10 = qrVar.f115136g;
        long j11 = qrVar2.f115136g;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!qrVar.f115131b.equals(qrVar2.f115131b)) {
            return qrVar.f115131b.compareTo(qrVar2.f115131b);
        }
        long j12 = qrVar.f115132c - qrVar2.f115132c;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public final void a(er erVar, long j10) {
        while (this.f113433c + j10 > this.f113431a && !this.f113432b.isEmpty()) {
            qr qrVar = (qr) this.f113432b.first();
            iw2 iw2Var = (iw2) erVar;
            synchronized (iw2Var) {
                iw2Var.b(qrVar);
            }
        }
    }
}
