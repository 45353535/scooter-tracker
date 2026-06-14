package ka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import ka.u;

/* JADX INFO: loaded from: classes12.dex */
public class u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f93139h = new Comparator() { // from class: ka.s
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return u.b((u.b) obj, (u.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f93140i = new Comparator() { // from class: ka.t
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((u.b) obj).f93150c, ((u.b) obj2).f93150c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f93141a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f93145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f93146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f93147g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f93143c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f93142b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f93144d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f93149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f93150c;

        private b() {
        }
    }

    public u(int i10) {
        this.f93141a = i10;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f93148a - bVar2.f93148a;
    }

    private void d() {
        if (this.f93144d != 1) {
            Collections.sort(this.f93142b, f93139h);
            this.f93144d = 1;
        }
    }

    private void e() {
        if (this.f93144d != 0) {
            Collections.sort(this.f93142b, f93140i);
            this.f93144d = 0;
        }
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f93147g;
        if (i11 > 0) {
            b[] bVarArr = this.f93143c;
            int i12 = i11 - 1;
            this.f93147g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f93145e;
        this.f93145e = i13 + 1;
        bVar.f93148a = i13;
        bVar.f93149b = i10;
        bVar.f93150c = f10;
        this.f93142b.add(bVar);
        this.f93146f += i10;
        while (true) {
            int i14 = this.f93146f;
            int i15 = this.f93141a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = (b) this.f93142b.get(0);
            int i17 = bVar2.f93149b;
            if (i17 <= i16) {
                this.f93146f -= i17;
                this.f93142b.remove(0);
                int i18 = this.f93147g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f93143c;
                    this.f93147g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f93149b = i17 - i16;
                this.f93146f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f93146f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f93142b.size(); i11++) {
            b bVar = (b) this.f93142b.get(i11);
            i10 += bVar.f93149b;
            if (i10 >= f11) {
                return bVar.f93150c;
            }
        }
        if (this.f93142b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f93142b.get(r5.size() - 1)).f93150c;
    }

    public void g() {
        this.f93142b.clear();
        this.f93144d = -1;
        this.f93145e = 0;
        this.f93146f = 0;
    }
}
