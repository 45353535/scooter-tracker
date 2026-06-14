package m0;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import java.util.Locale;
import k0.j;
import k0.k;
import k0.n;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f94348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0.i f94349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f94350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f94351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f94352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f94353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f94354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f94355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f94356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f94357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f94358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f94359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f94360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f94361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f94362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f94363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f94364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f94365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final k0.b f94366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f94367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b f94368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f94369v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final l0.a f94370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final o0.j f94371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final l0.h f94372y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List list, d0.i iVar, String str, long j10, a aVar, long j11, String str2, List list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List list3, b bVar, k0.b bVar2, boolean z10, l0.a aVar2, o0.j jVar2, l0.h hVar) {
        this.f94348a = list;
        this.f94349b = iVar;
        this.f94350c = str;
        this.f94351d = j10;
        this.f94352e = aVar;
        this.f94353f = j11;
        this.f94354g = str2;
        this.f94355h = list2;
        this.f94356i = nVar;
        this.f94357j = i10;
        this.f94358k = i11;
        this.f94359l = i12;
        this.f94360m = f10;
        this.f94361n = f11;
        this.f94362o = f12;
        this.f94363p = f13;
        this.f94364q = jVar;
        this.f94365r = kVar;
        this.f94367t = list3;
        this.f94368u = bVar;
        this.f94366s = bVar2;
        this.f94369v = z10;
        this.f94370w = aVar2;
        this.f94371x = jVar2;
        this.f94372y = hVar;
    }

    public l0.h a() {
        return this.f94372y;
    }

    public l0.a b() {
        return this.f94370w;
    }

    d0.i c() {
        return this.f94349b;
    }

    public o0.j d() {
        return this.f94371x;
    }

    public long e() {
        return this.f94351d;
    }

    List f() {
        return this.f94367t;
    }

    public a g() {
        return this.f94352e;
    }

    List h() {
        return this.f94355h;
    }

    b i() {
        return this.f94368u;
    }

    public String j() {
        return this.f94350c;
    }

    long k() {
        return this.f94353f;
    }

    float l() {
        return this.f94363p;
    }

    float m() {
        return this.f94362o;
    }

    public String n() {
        return this.f94354g;
    }

    List o() {
        return this.f94348a;
    }

    int p() {
        return this.f94359l;
    }

    int q() {
        return this.f94358k;
    }

    int r() {
        return this.f94357j;
    }

    float s() {
        return this.f94361n / this.f94349b.e();
    }

    j t() {
        return this.f94364q;
    }

    public String toString() {
        return z("");
    }

    k u() {
        return this.f94365r;
    }

    k0.b v() {
        return this.f94366s;
    }

    float w() {
        return this.f94360m;
    }

    n x() {
        return this.f94356i;
    }

    public boolean y() {
        return this.f94369v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        e eVarT = this.f94349b.t(k());
        if (eVarT != null) {
            sb2.append("\t\tParents: ");
            sb2.append(eVarT.j());
            e eVarT2 = this.f94349b.t(eVarT.k());
            while (eVarT2 != null) {
                sb2.append("->");
                sb2.append(eVarT2.j());
                eVarT2 = this.f94349b.t(eVarT2.k());
            }
            sb2.append(str);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f94348a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (Object obj : this.f94348a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(obj);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sb2.toString();
    }
}
