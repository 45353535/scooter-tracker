package sg.bigo.ads.api.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T extends Ad, U extends sg.bigo.ads.api.core.b> implements Ad, d<T> {

    @NonNull
    protected final sg.bigo.ads.api.b X;

    @NonNull
    protected sg.bigo.ads.common.v.a Y;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    protected a f102138aa;
    public int U = 0;
    public int V = 0;
    public int W = 0;
    protected int Z = sg.bigo.ads.common.v.a.f102845a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected int f102139ab = 0;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    protected final o f102140ac = new o();

    /* JADX INFO: renamed from: sg.bigo.ads.api.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC1252a {
        void a(sg.bigo.ads.api.core.c cVar);

        void b();
    }

    public a(@NonNull sg.bigo.ads.api.b bVar) {
        this.X = bVar;
    }

    public final a O() {
        return this.f102138aa;
    }

    @Nullable
    public final p P() {
        sg.bigo.ads.api.core.b bVarF = f();
        if (bVarF != null) {
            return bVarF.Y();
        }
        return null;
    }

    public final int Q() {
        return this.Z;
    }

    @NonNull
    public final sg.bigo.ads.api.b R() {
        return this.X;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Ad ad2) {
        if (ad2 == null) {
            return 1;
        }
        return g() >= (ad2 instanceof a ? ((a) ad2).g() : 0.0d) ? 1 : -1;
    }

    public abstract void a(int i10, int i11, String str);

    public abstract void b();

    public void b(int i10) {
        this.W = i10;
    }

    public o b_() {
        return this.f102140ac;
    }

    public abstract void c();

    public abstract String d();

    public abstract long e();

    @NonNull
    public abstract U f();

    public double g() {
        AdBid bid = getBid();
        return bid != null ? bid.getPrice() : (sg.bigo.ads.common.j.a.a(d(), e()) * 1.0d) / 1.0E8d;
    }

    public int z() {
        int i10 = this.f102139ab + 1;
        this.f102139ab = i10;
        return i10;
    }

    public void a(int i10) {
        this.V = i10;
    }

    public final void g(int i10) {
        this.Z = i10;
    }

    public void a(String str, String str2, int i10) {
    }

    public void a(boolean z10, boolean z11) {
        this.U = z11 ? 1 : !z10 ? 2 : 3;
    }
}
