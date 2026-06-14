package f0;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import l0.j;

/* JADX INFO: loaded from: classes5.dex */
public class l implements m, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69278d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l0.j f69280f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f69275a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f69276b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f69277c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f69279e = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69281a;

        static {
            int[] iArr = new int[j.a.values().length];
            f69281a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69281a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69281a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69281a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69281a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(l0.j jVar) {
        this.f69278d = jVar.c();
        this.f69280f = jVar;
    }

    private void b() {
        for (int i10 = 0; i10 < this.f69279e.size(); i10++) {
            this.f69277c.addPath(((m) this.f69279e.get(i10)).getPath());
        }
    }

    private void f(Path.Op op) {
        this.f69276b.reset();
        this.f69275a.reset();
        for (int size = this.f69279e.size() - 1; size >= 1; size--) {
            m mVar = (m) this.f69279e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List listL = dVar.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path path = ((m) listL.get(size2)).getPath();
                    path.transform(dVar.m());
                    this.f69276b.addPath(path);
                }
            } else {
                this.f69276b.addPath(mVar.getPath());
            }
        }
        m mVar2 = (m) this.f69279e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List listL2 = dVar2.l();
            for (int i10 = 0; i10 < listL2.size(); i10++) {
                Path path2 = ((m) listL2.get(i10)).getPath();
                path2.transform(dVar2.m());
                this.f69275a.addPath(path2);
            }
        } else {
            this.f69275a.set(mVar2.getPath());
        }
        this.f69277c.op(this.f69275a, this.f69276b, op);
    }

    @Override // f0.j
    public void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f69279e.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // f0.c
    public void g(List list, List list2) {
        for (int i10 = 0; i10 < this.f69279e.size(); i10++) {
            ((m) this.f69279e.get(i10)).g(list, list2);
        }
    }

    @Override // f0.m
    public Path getPath() {
        this.f69277c.reset();
        if (this.f69280f.d()) {
            return this.f69277c;
        }
        int i10 = a.f69281a[this.f69280f.b().ordinal()];
        if (i10 == 1) {
            b();
        } else if (i10 == 2) {
            f(Path.Op.UNION);
        } else if (i10 == 3) {
            f(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            f(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            f(Path.Op.XOR);
        }
        return this.f69277c;
    }
}
