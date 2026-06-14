package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bx2 extends f43 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f109136h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f109137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f109138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f109139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rk1 f109140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kk1 f109141g;

    static {
        hk1 hk1Var = new hk1();
        List list = Collections.EMPTY_LIST;
        nk2 nk2Var = nk2.f113952f;
        ok1 ok1Var = ok1.f114343d;
        Uri uri = Uri.EMPTY;
        if (hk1Var.f111617b != null && hk1Var.f111616a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            new mk1(uri, null, hk1Var.f111616a != null ? new ik1(hk1Var) : null, list, null, nk2Var, null);
        }
        vk1 vk1Var = vk1.H;
    }

    public bx2(long j10, long j11, boolean z10, rk1 rk1Var, kk1 kk1Var) {
        this.f109137c = j10;
        this.f109138d = j11;
        this.f109139e = z10;
        this.f109140f = (rk1) fi.a(rk1Var);
        this.f109141g = kk1Var;
    }

    @Override // yads.f43
    public final int a() {
        return 1;
    }

    @Override // yads.f43
    public final int b() {
        return 1;
    }

    @Override // yads.f43
    public final c43 a(int i10, c43 c43Var, boolean z10) {
        fi.a(i10, 1);
        Object obj = z10 ? f109136h : null;
        long j10 = this.f109137c;
        c43Var.getClass();
        return c43Var.a(null, obj, 0, j10, 0L, d6.f109796h, false);
    }

    @Override // yads.f43
    public final Object a(int i10) {
        fi.a(i10, 1);
        return f109136h;
    }

    public bx2(long j10, long j11, boolean z10, boolean z11, rk1 rk1Var) {
        this(j10, j11, z10, rk1Var, z11 ? rk1Var.f115476d : null);
    }

    @Override // yads.f43
    public final e43 a(int i10, e43 e43Var, long j10) {
        fi.a(i10, 1);
        return e43Var.a(e43.f110183s, this.f109140f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f109139e, false, this.f109141g, 0L, this.f109138d, 0, 0, 0L);
    }

    @Override // yads.f43
    public final int a(Object obj) {
        return f109136h.equals(obj) ? 0 : -1;
    }
}
