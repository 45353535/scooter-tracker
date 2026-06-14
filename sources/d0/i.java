package d0;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f68345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f68346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f68347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f68348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f68349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SparseArrayCompat f68350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LongSparseArray f68351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f68352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f68353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f68354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f68355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f68356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f68357o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f68359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f68360r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f68343a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f68344b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f68358p = 0;

    public void a(String str) {
        q0.g.c(str);
        this.f68344b.add(str);
    }

    public Rect b() {
        return this.f68353k;
    }

    public SparseArrayCompat c() {
        return this.f68350h;
    }

    public float d() {
        return (long) ((e() / this.f68356n) * 1000.0f);
    }

    public float e() {
        return this.f68355m - this.f68354l;
    }

    public float f() {
        return this.f68355m;
    }

    public Map g() {
        return this.f68348f;
    }

    public float h(float f10) {
        return q0.l.i(this.f68354l, this.f68355m, f10);
    }

    public float i() {
        return this.f68356n;
    }

    public Map j() {
        float fE = q0.p.e();
        if (fE != this.f68347e) {
            for (Map.Entry entry : this.f68346d.entrySet()) {
                this.f68346d.put((String) entry.getKey(), ((v) entry.getValue()).a(this.f68347e / fE));
            }
        }
        this.f68347e = fE;
        return this.f68346d;
    }

    public List k() {
        return this.f68352j;
    }

    public j0.h l(String str) {
        int size = this.f68349g.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0.h hVar = (j0.h) this.f68349g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f68358p;
    }

    public b0 n() {
        return this.f68343a;
    }

    public List o(String str) {
        return (List) this.f68345c.get(str);
    }

    public float p() {
        return this.f68354l;
    }

    public boolean q() {
        return this.f68357o;
    }

    public void r(int i10) {
        this.f68358p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List list, LongSparseArray longSparseArray, Map map, Map map2, float f13, SparseArrayCompat sparseArrayCompat, Map map3, List list2, int i10, int i11) {
        this.f68353k = rect;
        this.f68354l = f10;
        this.f68355m = f11;
        this.f68356n = f12;
        this.f68352j = list;
        this.f68351i = longSparseArray;
        this.f68345c = map;
        this.f68346d = map2;
        this.f68347e = f13;
        this.f68350h = sparseArrayCompat;
        this.f68348f = map3;
        this.f68349g = list2;
        this.f68359q = i10;
        this.f68360r = i11;
    }

    public m0.e t(long j10) {
        return (m0.e) this.f68351i.get(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f68352j.iterator();
        while (it.hasNext()) {
            sb2.append(((m0.e) it.next()).z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f68357o = z10;
    }

    public void v(boolean z10) {
        this.f68343a.b(z10);
    }
}
