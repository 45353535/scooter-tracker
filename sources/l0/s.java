package l0;

import android.graphics.Paint;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class s implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0.b f93833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f93834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0.a f93835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0.d f93836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0.b f93837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f93838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f93839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f93840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f93841j;

    public enum a {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap g() {
            int iOrdinal = ordinal();
            return iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum b {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join g() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return Paint.Join.MITER;
            }
            if (iOrdinal == 1) {
                return Paint.Join.ROUND;
            }
            if (iOrdinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public s(String str, k0.b bVar, List list, k0.a aVar, k0.d dVar, k0.b bVar2, a aVar2, b bVar3, float f10, boolean z10) {
        this.f93832a = str;
        this.f93833b = bVar;
        this.f93834c = list;
        this.f93835d = aVar;
        this.f93836e = dVar;
        this.f93837f = bVar2;
        this.f93838g = aVar2;
        this.f93839h = bVar3;
        this.f93840i = f10;
        this.f93841j = z10;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        return new f0.t(oVar, bVar, this);
    }

    public a b() {
        return this.f93838g;
    }

    public k0.a c() {
        return this.f93835d;
    }

    public k0.b d() {
        return this.f93833b;
    }

    public b e() {
        return this.f93839h;
    }

    public List f() {
        return this.f93834c;
    }

    public float g() {
        return this.f93840i;
    }

    public String h() {
        return this.f93832a;
    }

    public k0.d i() {
        return this.f93836e;
    }

    public k0.b j() {
        return this.f93837f;
    }

    public boolean k() {
        return this.f93841j;
    }
}
