package k3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f85970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List f85971b = new ArrayList();

    @Override // k3.c
    public b a() {
        if (this.f85970a == null) {
            this.f85970a = new b();
        }
        return this.f85970a;
    }

    @Override // k3.c
    public void b(b bVar) {
        this.f85970a = bVar;
        this.f85971b.clear();
    }

    @Override // k3.c
    public List c() {
        return this.f85971b;
    }

    protected int e(float f10, float f11) {
        return Math.max(1, (int) ((3.063052912151454d / Math.asin(f11 / f10)) + 0.5d));
    }

    protected int f() {
        return Math.round(this.f85970a.f85976e * 255.0f);
    }
}
