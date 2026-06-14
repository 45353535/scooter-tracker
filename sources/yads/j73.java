package yads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j73 implements d23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f73 f112257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f112258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f112259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f112260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f112261f;

    public j73(f73 f73Var, HashMap map, HashMap map2, HashMap map3) {
        this.f112257b = f73Var;
        this.f112260e = map2;
        this.f112261f = map3;
        this.f112259d = DesugarCollections.unmodifiableMap(map);
        this.f112258c = f73Var.a();
    }

    @Override // yads.d23
    public final long a(int i10) {
        return this.f112258c[i10];
    }

    @Override // yads.d23
    public final List b(long j10) {
        return this.f112257b.a(j10, this.f112259d, this.f112260e, this.f112261f);
    }

    @Override // yads.d23
    public final int a() {
        return this.f112258c.length;
    }

    @Override // yads.d23
    public final int a(long j10) {
        int iA = w83.a(this.f112258c, j10, false);
        if (iA < this.f112258c.length) {
            return iA;
        }
        return -1;
    }
}
