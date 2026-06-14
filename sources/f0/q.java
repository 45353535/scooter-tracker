package f0;

import android.graphics.PointF;
import g0.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class q implements s, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.o f69322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0.a f69324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0.o f69325d;

    public q(com.airbnb.lottie.o oVar, m0.b bVar, l0.n nVar) {
        this.f69322a = oVar;
        this.f69323b = nVar.c();
        g0.a aVarA = nVar.b().a();
        this.f69324c = aVarA;
        bVar.j(aVarA);
        aVarA.a(this);
    }

    private static int b(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int e(int i10, int i11) {
        return i10 - (b(i10, i11) * i11);
    }

    private l0.o j(l0.o oVar) {
        List listA = oVar.a();
        boolean zD = oVar.d();
        int size = listA.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            j0.a aVar = (j0.a) listA.get(size);
            j0.a aVar2 = (j0.a) listA.get(e(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? aVar2.c() : oVar.b();
            i10 = (((size != 0 || zD) ? aVar2.b() : pointFC).equals(pointFC) && aVar.a().equals(pointFC) && !(!oVar.d() && (size == 0 || size == listA.size() - 1))) ? i10 + 2 : i10 + 1;
            size--;
        }
        l0.o oVar2 = this.f69325d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new j0.a());
            }
            this.f69325d = new l0.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f69325d.e(zD);
        return this.f69325d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    @Override // f0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l0.o a(l0.o r19) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.q.a(l0.o):l0.o");
    }

    @Override // f0.s
    public void c(a.b bVar) {
        this.f69324c.a(bVar);
    }

    @Override // g0.a.b
    public void f() {
        this.f69322a.invalidateSelf();
    }

    public g0.a i() {
        return this.f69324c;
    }

    @Override // f0.c
    public void g(List list, List list2) {
    }
}
