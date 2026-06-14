package g0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f72063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f72064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f72065c;

    public h(List list) {
        this.f72065c = list;
        this.f72063a = new ArrayList(list.size());
        this.f72064b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f72063a.add(((l0.i) list.get(i10)).b().a());
            this.f72064b.add(((l0.i) list.get(i10)).c().a());
        }
    }

    public List a() {
        return this.f72063a;
    }

    public List b() {
        return this.f72065c;
    }

    public List c() {
        return this.f72064b;
    }
}
