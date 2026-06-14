package l0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f93826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f93827c;

    public q(String str, List list, boolean z10) {
        this.f93825a = str;
        this.f93826b = list;
        this.f93827c = z10;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.d(oVar, bVar, this, iVar);
    }

    public List b() {
        return this.f93826b;
    }

    public String c() {
        return this.f93825a;
    }

    public boolean d() {
        return this.f93827c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f93825a + "' Shapes: " + Arrays.toString(this.f93826b.toArray()) + '}';
    }
}
