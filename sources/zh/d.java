package zh;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.helpers.j;
import yh.g;

/* JADX INFO: loaded from: classes4.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f119525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List f119526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f119527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    j f119528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f119529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f119530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object[] f119531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f119532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Throwable f119533i;

    public void a(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f119526b == null) {
            this.f119526b = new ArrayList(2);
        }
        this.f119526b.add(gVar);
    }

    public b b() {
        return this.f119525a;
    }

    public j c() {
        return this.f119528d;
    }

    public void d(Object[] objArr) {
        this.f119531g = objArr;
    }

    public void e(b bVar) {
        this.f119525a = bVar;
    }

    public void f(j jVar) {
        this.f119528d = jVar;
    }

    public void g(String str) {
        this.f119527c = str;
    }

    public void h(String str) {
        this.f119530f = str;
    }

    public void i(String str) {
        this.f119529e = str;
    }

    public void j(Throwable th2) {
        this.f119533i = th2;
    }

    public void k(long j10) {
        this.f119532h = j10;
    }
}
