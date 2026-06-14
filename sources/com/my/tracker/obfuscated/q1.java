package com.my.tracker.obfuscated;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final q f61791a = new q(16384);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final q f61792b = new q(4096);

    protected static void a(r1 r1Var, g gVar, z zVar, q qVar, q qVar2) throws IOException {
        qVar.a();
        if (gVar != null) {
            qVar2.a();
            qVar2.a(1, gVar.f61517a);
            int i10 = gVar.f61518b;
            if (i10 != -1) {
                qVar2.a(2, i10);
            }
            if (qVar2.b() > 0) {
                qVar.a(31, qVar2);
            }
        }
        qVar.a(1, zVar.f61964g);
        qVar.a(2, zVar.f61963f);
        qVar.a(3, zVar.f61968k);
        qVar.a(4, zVar.f61962e);
        r1Var.a(21, qVar);
    }

    protected static void a(r1 r1Var, boolean z10, b3 b3Var, q qVar) throws IOException {
        int i10;
        qVar.a();
        if (!z10 && ((i10 = b3Var.f61281b) == 0 || i10 == 1 || i10 == 2)) {
            qVar.a(1, i10);
        }
        int i11 = b3Var.f61280a;
        if (i11 > -1) {
            qVar.a(2, i11);
        }
        if (!z10) {
            qVar.a(3, b3Var.f61282c);
            qVar.a(4, b3Var.f61283d);
            qVar.a(5, b3Var.f61284e);
            qVar.a(6, b3Var.f61285f);
            qVar.a(7, b3Var.f61286g);
            qVar.a(8, b3Var.f61287h);
            qVar.a(9, b3Var.f61288i);
        }
        if (qVar.b() > 0) {
            r1Var.a(22, qVar);
        }
    }

    protected static void a(r1 r1Var, String str, String str2, f0 f0Var, q qVar, q qVar2) throws IOException {
        z zVar = f0Var.f61485c;
        qVar.a();
        a(qVar, str, f0Var.f61486d, f0Var.f61487e, qVar2);
        int i10 = zVar.f61958a;
        if (i10 != -1) {
            qVar.a(1, i10);
        }
        if (!TextUtils.isEmpty(zVar.f61961d)) {
            qVar.a(2, zVar.f61961d);
        }
        if (!TextUtils.isEmpty(zVar.f61967j)) {
            qVar.a(3, zVar.f61967j);
        }
        if (!TextUtils.isEmpty(zVar.f61973p)) {
            qVar.a(4, zVar.f61973p);
        }
        if (!TextUtils.isEmpty(zVar.f61959b)) {
            qVar.a(5, zVar.f61959b);
        }
        if (!TextUtils.isEmpty(zVar.f61960c)) {
            qVar.a(6, zVar.f61960c);
        }
        if (!TextUtils.isEmpty(zVar.f61966i)) {
            qVar.a(7, zVar.f61966i);
        }
        if (!TextUtils.isEmpty(zVar.f61965h)) {
            qVar.a(8, zVar.f61965h);
        }
        int i11 = zVar.f61980w;
        if (i11 != -1) {
            qVar.a(9, i11);
        }
        int i12 = zVar.f61974q;
        if (i12 != -1) {
            qVar.a(10, i12);
        }
        int i13 = zVar.f61975r;
        if (i13 != -1) {
            qVar.a(11, i13);
        }
        int i14 = zVar.f61976s;
        if (i14 != -1) {
            qVar.a(12, i14);
        }
        if (!Float.isNaN(zVar.f61978u)) {
            qVar.a(13, zVar.f61978u);
        }
        if (!Float.isNaN(zVar.f61979v)) {
            qVar.a(14, zVar.f61979v);
        }
        if (!Float.isNaN(zVar.f61977t)) {
            qVar.a(15, zVar.f61977t);
        }
        qVar.a(16, str2);
        o oVar = f0Var.f61492j;
        if (oVar != null) {
            int i15 = oVar.f61729a;
            if (i15 != -1) {
                qVar.a(17, i15);
            }
            int i16 = oVar.f61730b;
            if (i16 >= 0) {
                qVar.a(18, i16);
            }
        }
        long j10 = zVar.f61981x;
        if (j10 != -1) {
            qVar.a(19, j10);
        }
        long j11 = zVar.f61982y;
        if (j11 != -1) {
            qVar.a(20, j11);
        }
        int i17 = zVar.f61983z;
        if (i17 != -1) {
            qVar.a(23, i17);
        }
        int i18 = zVar.A;
        if (i18 != -1) {
            qVar.a(24, i18);
        }
        h0 h0Var = f0Var.f61493k;
        if (h0Var != null && !TextUtils.isEmpty(h0Var.f61549a)) {
            qVar.a(25, f0Var.f61493k.f61549a);
        }
        if (qVar.b() > 0) {
            r1Var.a(23, qVar);
        }
    }

    protected static void a(r1 r1Var, String str, k0 k0Var, t0 t0Var, q qVar) throws IOException {
        qVar.a();
        qVar.a(1, str);
        if (k0Var != null && !TextUtils.isEmpty(k0Var.f61617a)) {
            boolean z10 = k0Var.f61618b;
            qVar.a(2, k0Var.f61617a);
            qVar.a(3, z10 ? 1 : 0);
        }
        if (t0Var != null && !TextUtils.isEmpty(t0Var.f61835a)) {
            boolean z11 = t0Var.f61836b;
            qVar.a(4, t0Var.f61835a);
            qVar.a(5, z11 ? 1 : 0);
        }
        if (qVar.b() > 0) {
            r1Var.a(31, qVar);
        }
    }

    protected static void a(r1 r1Var, h1 h1Var, x0 x0Var, z zVar, q qVar) throws IOException {
        qVar.a();
        int i10 = h1Var.f61550a;
        if (i10 != -1) {
            qVar.a(1, i10);
        }
        Boolean bool = h1Var.f61552c;
        if (bool != null) {
            qVar.a(7, bool == Boolean.TRUE ? 1 : 0);
        }
        qVar.a(2, h1Var.f61551b);
        if (!TextUtils.isEmpty(zVar.f61969l)) {
            qVar.a(3, zVar.f61969l);
        }
        if (!TextUtils.isEmpty(zVar.f61970m)) {
            qVar.a(4, zVar.f61970m);
        }
        if (!TextUtils.isEmpty(zVar.f61971n)) {
            qVar.a(5, zVar.f61971n);
        }
        if (!TextUtils.isEmpty(zVar.f61972o)) {
            qVar.a(6, zVar.f61972o);
        }
        if (x0Var != null) {
            qVar.a(8, x0Var.f61894a);
        }
        qVar.a(11, h1Var.f61553d != 2 ? 0 : 1);
        if (qVar.b() > 0) {
            r1Var.a(25, qVar);
        }
    }

    protected static void a(r1 r1Var, z0 z0Var, q qVar) throws IOException {
        if (z0Var.equals(z0.f61984g)) {
            return;
        }
        qVar.a();
        if (!Double.isNaN(z0Var.f61986b)) {
            qVar.a(1, z0Var.f61986b);
        }
        if (!Double.isNaN(z0Var.f61987c)) {
            qVar.a(2, z0Var.f61987c);
        }
        if (!Float.isNaN(z0Var.f61988d)) {
            qVar.a(3, z0Var.f61988d);
        }
        if (!Float.isNaN(z0Var.f61989e)) {
            qVar.a(4, z0Var.f61989e);
        }
        long j10 = z0Var.f61990f;
        if (j10 > 0) {
            qVar.a(5, v2.b(j10));
        }
        int i10 = z0Var.f61985a;
        if (i10 != -1) {
            qVar.a(6, i10);
        }
        if (qVar.b() > 0) {
            r1Var.a(26, qVar);
        }
    }

    public synchronized void a() {
        this.f61791a.d();
        this.f61792b.d();
    }
}
