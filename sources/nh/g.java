package nh;

import hh.b0;
import hh.v;
import hh.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mh.e f96157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f96158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f96159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mh.c f96160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f96161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f96162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f96163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f96164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f96165i;

    public g(mh.e call, List interceptors, int i10, mh.c cVar, z request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f96157a = call;
        this.f96158b = interceptors;
        this.f96159c = i10;
        this.f96160d = cVar;
        this.f96161e = request;
        this.f96162f = i11;
        this.f96163g = i12;
        this.f96164h = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, mh.c cVar, z zVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f96159c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f96160d;
        }
        if ((i14 & 4) != 0) {
            zVar = gVar.f96161e;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.f96162f;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.f96163g;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.f96164h;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.b(i10, cVar, zVar, i11, i15, i16);
    }

    @Override // hh.v.a
    public b0 a(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f96159c >= this.f96158b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f96165i++;
        mh.c cVar = this.f96160d;
        if (cVar != null) {
            if (!cVar.j().g(request.l())) {
                throw new IllegalStateException(("network interceptor " + this.f96158b.get(this.f96159c - 1) + " must retain the same host and port").toString());
            }
            if (this.f96165i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f96158b.get(this.f96159c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarC = c(this, this.f96159c + 1, null, request, 0, 0, 0, 58, null);
        v vVar = (v) this.f96158b.get(this.f96159c);
        b0 b0VarIntercept = vVar.intercept(gVarC);
        if (b0VarIntercept == null) {
            throw new NullPointerException("interceptor " + vVar + " returned null");
        }
        if (this.f96160d != null && this.f96159c + 1 < this.f96158b.size() && gVarC.f96165i != 1) {
            throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
        }
        if (b0VarIntercept.m() != null) {
            return b0VarIntercept;
        }
        throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
    }

    public final g b(int i10, mh.c cVar, z request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new g(this.f96157a, this.f96158b, i10, cVar, request, i11, i12, i13);
    }

    @Override // hh.v.a
    public hh.e call() {
        return this.f96157a;
    }

    public final mh.e d() {
        return this.f96157a;
    }

    public final int e() {
        return this.f96162f;
    }

    public final mh.c f() {
        return this.f96160d;
    }

    public final int g() {
        return this.f96163g;
    }

    public final z h() {
        return this.f96161e;
    }

    public final int i() {
        return this.f96164h;
    }

    public int j() {
        return this.f96163g;
    }

    @Override // hh.v.a
    public z request() {
        return this.f96161e;
    }
}
