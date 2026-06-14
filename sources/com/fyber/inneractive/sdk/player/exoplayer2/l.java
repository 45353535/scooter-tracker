package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements Handler.Callback, com.fyber.inneractive.sdk.player.exoplayer2.source.r, com.fyber.inneractive.sdk.player.exoplayer2.source.t {
    public h A;
    public h B;
    public x C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f22691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f22692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f22693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f22694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.u f22695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f22696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HandlerThread f22697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f22698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f22699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f22700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f22701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f22702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f22703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.h f22704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u f22705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a[] f22706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22711u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f22712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f22714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f22715y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f22716z;

    public l(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar, boolean z10, f fVar, i iVar, g gVar) {
        this.f22691a = aVarArr;
        this.f22693c = dVar;
        this.f22694d = cVar;
        this.f22708r = z10;
        this.f22698h = fVar;
        this.f22701k = iVar;
        this.f22692b = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            aVar.getClass();
            this.f22692b[i10] = aVar;
        }
        this.f22695e = new com.fyber.inneractive.sdk.player.exoplayer2.util.u();
        this.f22706p = new a[0];
        this.f22699i = new w();
        this.f22700j = new v();
        this.f22702l = s.f22815d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f22697g = handlerThread;
        handlerThread.start();
        this.f22696f = new Handler(handlerThread.getLooper(), this);
    }

    public static void a(a aVar) {
        int i10 = aVar.f21575c;
        if (i10 == 2) {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            aVar.f21575c = 1;
            aVar.j();
        }
    }

    public final void b(boolean z10) {
        if (this.f22710t != z10) {
            this.f22710t = z10;
            this.f22698h.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void c(boolean z10) {
        this.f22709s = false;
        this.f22708r = z10;
        if (!z10) {
            g();
            h();
            a(false);
            return;
        }
        int i10 = this.f22711u;
        if (i10 != 3) {
            if (i10 == 2) {
                this.f22696f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f22709s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f22695e;
        if (!uVar.f23154a) {
            uVar.f23156c = SystemClock.elapsedRealtime();
            uVar.f23154a = true;
        }
        for (a aVar : this.f22706p) {
            if (aVar.f21575c != 1) {
                throw new IllegalStateException();
            }
            aVar.f21575c = 2;
            aVar.i();
        }
        this.f22696f.sendEmptyMessage(2);
    }

    public final synchronized void d() {
        if (this.f22707q) {
            return;
        }
        this.f22696f.sendEmptyMessage(6);
        while (!this.f22707q) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f22697g.quit();
    }

    public final void e() {
        a(true);
        this.f22694d.a(true);
        a(1);
        synchronized (this) {
            this.f22707q = true;
            notifyAll();
        }
    }

    public final void f() throws d {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        boolean z10 = true;
        while (hVar != null && hVar.f22670i) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f22677p.a(hVar.f22676o, hVar.f22662a.a());
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f22680s;
            if (jVar != null) {
                for (int i10 = 0; i10 < jVarA.f22938b.f22934a; i10++) {
                    if (jVarA.a(jVar, i10)) {
                    }
                }
                if (hVar == this.A) {
                    z10 = false;
                }
                hVar = hVar.f22672k;
            }
            hVar.f22674m = jVarA;
            if (z10) {
                h hVar2 = this.A;
                h hVar3 = this.B;
                boolean z11 = hVar2 != hVar3;
                for (h hVar4 = hVar3.f22672k; hVar4 != null; hVar4 = hVar4.f22672k) {
                    hVar4.a();
                }
                h hVar5 = this.B;
                hVar5.f22672k = null;
                this.f22716z = hVar5;
                this.A = hVar5;
                boolean[] zArr = new boolean[this.f22691a.length];
                long jA = hVar5.a(this.f22701k.f22683c, z11, zArr);
                if (jA != this.f22701k.f22683c) {
                    this.f22701k.f22683c = jA;
                    a(jA);
                }
                boolean[] zArr2 = new boolean[this.f22691a.length];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    a[] aVarArr = this.f22691a;
                    if (i11 >= aVarArr.length) {
                        break;
                    }
                    a aVar = aVarArr[i11];
                    boolean z12 = aVar.f21575c != 0;
                    zArr2[i11] = z12;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.B.f22664c[i11];
                    if (vVar != null) {
                        i12++;
                    }
                    if (z12) {
                        if (vVar != aVar.f21576d) {
                            if (aVar == this.f22703m) {
                                if (vVar == null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f22695e;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar6 = this.f22704n;
                                    uVar.getClass();
                                    uVar.a(hVar6.b());
                                    uVar.f23157d = hVar6.a();
                                }
                                this.f22704n = null;
                                this.f22703m = null;
                            }
                            a(aVar);
                            aVar.c();
                        } else if (zArr[i11]) {
                            long j10 = this.f22715y;
                            aVar.f21579g = false;
                            aVar.f21578f = false;
                            aVar.a(false, j10);
                        }
                    }
                    i11++;
                }
                this.f22698h.obtainMessage(3, hVar.f22674m).sendToTarget();
                a(zArr2, i12);
            } else {
                this.f22716z = hVar;
                for (h hVar7 = hVar.f22672k; hVar7 != null; hVar7 = hVar7.f22672k) {
                    hVar7.a();
                }
                h hVar8 = this.f22716z;
                hVar8.f22672k = null;
                if (hVar8.f22670i) {
                    long j11 = hVar8.f22668g;
                    long jMax = Math.max(j11, Math.abs(this.f22715y - (hVar8.f22666e - j11)));
                    h hVar9 = this.f22716z;
                    hVar9.a(jMax, false, new boolean[hVar9.f22675n.length]);
                }
            }
            b();
            h();
            this.f22696f.sendEmptyMessage(2);
            return;
        }
    }

    public final void g() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f22695e;
        if (uVar.f23154a) {
            uVar.a(uVar.b());
            uVar.f23154a = false;
        }
        for (a aVar : this.f22706p) {
            a(aVar);
        }
    }

    public final void h() {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        long jG = hVar.f22662a.g();
        if (jG != -9223372036854775807L) {
            a(jG);
        } else {
            a aVar = this.f22703m;
            if (aVar == null || aVar.e()) {
                this.f22715y = this.f22695e.b();
            } else {
                long jB = this.f22704n.b();
                this.f22715y = jB;
                this.f22695e.a(jB);
            }
            h hVar2 = this.B;
            jG = Math.abs(this.f22715y - (hVar2.f22666e - hVar2.f22668g));
        }
        this.f22701k.f22683c = jG;
        this.f22712v = SystemClock.elapsedRealtime() * 1000;
        long jC = this.f22706p.length == 0 ? Long.MIN_VALUE : this.B.f22662a.c();
        i iVar = this.f22701k;
        if (jC == Long.MIN_VALUE) {
            long j10 = this.C.a(this.B.f22667f, this.f22700j, false).f23173d;
        }
        iVar.getClass();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.u) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    c(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((j) message.obj);
                    return true;
                case 4:
                    a((s) message.obj);
                    return true;
                case 5:
                    a(true);
                    this.f22694d.a(true);
                    a(1);
                    return true;
                case 6:
                    e();
                    return true;
                case 7:
                    a((Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj;
                    h hVar = this.f22716z;
                    if (hVar != null && hVar.f22662a == sVar) {
                        b();
                    }
                    return true;
                case 10:
                    f();
                    return true;
                case 11:
                    a((e[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (d e10) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e10);
            this.f22698h.obtainMessage(8, e10).sendToTarget();
            a(true);
            this.f22694d.a(true);
            a(1);
            return true;
        } catch (IOException e11) {
            Log.e("ExoPlayerImplInternal", "Source error.", e11);
            this.f22698h.obtainMessage(8, new d(e11)).sendToTarget();
            a(true);
            this.f22694d.a(true);
            a(1);
            return true;
        } catch (RuntimeException e12) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e12);
            this.f22698h.obtainMessage(8, new d(e12)).sendToTarget();
            a(true);
            this.f22694d.a(true);
            a(1);
            return true;
        }
    }

    public final void b(j jVar) {
        if (this.C == null) {
            this.f22713w++;
            this.f22714x = jVar;
            return;
        }
        Pair pairA = a(jVar);
        if (pairA == null) {
            i iVar = new i(0, 0L);
            this.f22701k = iVar;
            this.f22698h.obtainMessage(4, 1, 0, iVar).sendToTarget();
            this.f22701k = new i(0, -9223372036854775807L);
            a(4);
            a(false);
            return;
        }
        int i10 = jVar.f22686c == -9223372036854775807L ? 1 : 0;
        int iIntValue = ((Integer) pairA.first).intValue();
        long jLongValue = ((Long) pairA.second).longValue();
        try {
            i iVar2 = this.f22701k;
            if (iIntValue == iVar2.f22681a && jLongValue / 1000 == iVar2.f22683c / 1000) {
                return;
            }
            long jA = a(iIntValue, jLongValue);
            int i11 = i10 | (jLongValue == jA ? 0 : 1);
            i iVar3 = new i(iIntValue, jA);
            this.f22701k = iVar3;
            this.f22698h.obtainMessage(4, i11, 0, iVar3).sendToTarget();
        } finally {
            i iVar4 = new i(iIntValue, jLongValue);
            this.f22701k = iVar4;
            this.f22698h.obtainMessage(4, i10, 0, iVar4).sendToTarget();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        this.f22696f.obtainMessage(7, Pair.create(xVar, gVar)).sendToTarget();
    }

    public final void a(int i10) {
        if (this.f22711u != i10) {
            this.f22711u = i10;
            this.f22698h.obtainMessage(1, i10, 0).sendToTarget();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, boolean z10) {
        this.f22698h.sendEmptyMessage(0);
        a(true);
        this.f22694d.a(false);
        if (z10) {
            this.f22701k = new i(0, -9223372036854775807L);
        }
        this.f22705o = uVar;
        uVar.a(this);
        a(2);
        this.f22696f.sendEmptyMessage(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a A[LOOP:3: B:74:0x018a->B:78:0x019a, LOOP_START] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.l.a():void");
    }

    public final void c() {
        h hVar = this.f22716z;
        if (hVar == null || hVar.f22670i) {
            return;
        }
        h hVar2 = this.A;
        if (hVar2 == null || hVar2.f22672k == hVar) {
            for (a aVar : this.f22706p) {
                if (!aVar.f21578f) {
                    return;
                }
            }
            this.f22716z.f22662a.d();
        }
    }

    public final void b() {
        int i10;
        h hVar = this.f22716z;
        long jF = !hVar.f22670i ? 0L : hVar.f22662a.f();
        if (jF == Long.MIN_VALUE) {
            b(false);
            return;
        }
        h hVar2 = this.f22716z;
        long jAbs = Math.abs(this.f22715y - (hVar2.f22666e - hVar2.f22668g));
        long j10 = jF - jAbs;
        c cVar = this.f22694d;
        char c10 = j10 > cVar.f21707c ? (char) 0 : j10 < cVar.f21706b ? (char) 2 : (char) 1;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = cVar.f21705a;
        synchronized (lVar) {
            i10 = lVar.f23044c * 65536;
        }
        boolean z10 = c10 == 2 || (c10 == 1 && cVar.f21711g && !(i10 >= cVar.f21710f));
        cVar.f21711g = z10;
        b(z10);
        if (z10) {
            h hVar3 = this.f22716z;
            hVar3.f22673l = false;
            hVar3.f22662a.b(jAbs);
            return;
        }
        this.f22716z.f22673l = true;
    }

    public final void a(long j10, long j11) {
        this.f22696f.removeMessages(2);
        long jElapsedRealtime = (j10 + j11) - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            this.f22696f.sendEmptyMessage(2);
        } else {
            this.f22696f.sendEmptyMessageDelayed(2, jElapsedRealtime);
        }
    }

    public final long a(int i10, long j10) throws d {
        h hVar;
        g();
        this.f22709s = false;
        a(2);
        h hVar2 = this.B;
        if (hVar2 == null) {
            h hVar3 = this.f22716z;
            if (hVar3 != null) {
                hVar3.a();
            }
            hVar = null;
        } else {
            hVar = null;
            while (hVar2 != null) {
                if (hVar2.f22667f == i10 && hVar2.f22670i) {
                    hVar = hVar2;
                } else {
                    hVar2.a();
                }
                hVar2 = hVar2.f22672k;
            }
        }
        h hVar4 = this.B;
        if (hVar4 != hVar || hVar4 != this.A) {
            for (a aVar : this.f22706p) {
                aVar.c();
            }
            this.f22706p = new a[0];
            this.f22704n = null;
            this.f22703m = null;
            this.B = null;
        }
        if (hVar != null) {
            hVar.f22672k = null;
            this.f22716z = hVar;
            this.A = hVar;
            a(hVar);
            h hVar5 = this.B;
            if (hVar5.f22671j) {
                j10 = hVar5.f22662a.a(j10);
            }
            a(j10);
            b();
        } else {
            this.f22716z = null;
            this.A = null;
            this.B = null;
            a(j10);
        }
        this.f22696f.sendEmptyMessage(2);
        return j10;
    }

    public final void a(long j10) {
        h hVar = this.B;
        long j11 = hVar == null ? j10 + 60000000 : j10 + (hVar.f22666e - hVar.f22668g);
        this.f22715y = j11;
        this.f22695e.a(j11);
        for (a aVar : this.f22706p) {
            long j12 = this.f22715y;
            aVar.f21579g = false;
            aVar.f21578f = false;
            aVar.a(false, j12);
        }
    }

    public final void a(s sVar) {
        s sVarA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar = this.f22704n;
        if (hVar != null) {
            sVarA = hVar.a(sVar);
        } else {
            sVarA = this.f22695e.a(sVar);
        }
        this.f22702l = sVarA;
        this.f22698h.obtainMessage(7, sVarA).sendToTarget();
    }

    public final void a(boolean z10) {
        this.f22696f.removeMessages(2);
        this.f22709s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f22695e;
        if (uVar.f23154a) {
            uVar.a(uVar.b());
            uVar.f23154a = false;
        }
        this.f22704n = null;
        this.f22703m = null;
        this.f22715y = 60000000L;
        for (a aVar : this.f22706p) {
            try {
                a(aVar);
                aVar.c();
            } catch (d | RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e10);
            }
        }
        this.f22706p = new a[0];
        h hVar = this.B;
        if (hVar == null) {
            hVar = this.f22716z;
        }
        while (hVar != null) {
            hVar.a();
            hVar = hVar.f22672k;
        }
        this.f22716z = null;
        this.A = null;
        this.B = null;
        b(false);
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar2 = this.f22705o;
            if (uVar2 != null) {
                uVar2.b();
                this.f22705o = null;
            }
            this.C = null;
        }
    }

    public final void a(e[] eVarArr) {
        try {
            for (e eVar : eVarArr) {
                eVar.f21732a.a(eVar.f21733b, eVar.f21734c);
            }
            if (this.f22705o != null) {
                this.f22696f.sendEmptyMessage(2);
            }
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th2) {
            synchronized (this) {
                notifyAll();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.l] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.util.Pair r18) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.l.a(android.util.Pair):void");
    }

    public final Pair a(j jVar) {
        x xVar = jVar.f22684a;
        if (xVar.c()) {
            xVar = this.C;
        }
        x xVar2 = xVar;
        try {
            Pair pairA = a(xVar2, jVar.f22685b, jVar.f22686c, 0L);
            x xVar3 = this.C;
            if (xVar3 == xVar2) {
                return pairA;
            }
            int iA = xVar3.a(xVar2.a(((Integer) pairA.first).intValue(), this.f22700j, true).f23171b);
            if (iA != -1) {
                return Pair.create(Integer.valueOf(iA), (Long) pairA.second);
            }
            int iIntValue = ((Integer) pairA.first).intValue();
            x xVar4 = this.C;
            int iA2 = -1;
            while (iA2 == -1 && iIntValue < xVar2.a() - 1) {
                iIntValue++;
                iA2 = xVar4.a(xVar2.a(iIntValue, this.f22700j, true).f23171b);
            }
            if (iA2 == -1) {
                return null;
            }
            int i10 = this.C.a(iA2, this.f22700j, false).f23172c;
            return a(this.C, 0, -9223372036854775807L, 0L);
        } catch (IndexOutOfBoundsException unused) {
            throw new q();
        }
    }

    public final Pair a(x xVar, int i10, long j10, long j11) {
        int iB = xVar.b();
        if (i10 >= 0 && i10 < iB) {
            xVar.a(i10, this.f22699i, j11);
            if (j10 == -9223372036854775807L) {
                j10 = this.f22699i.f23248e;
                if (j10 == -9223372036854775807L) {
                    return null;
                }
            }
            w wVar = this.f22699i;
            int i11 = wVar.f23246c;
            long j12 = wVar.f23250g + j10;
            long j13 = xVar.a(i11, this.f22700j, false).f23173d;
            while (j13 != -9223372036854775807L && j12 >= j13 && i11 < this.f22699i.f23247d) {
                j12 -= j13;
                i11++;
                j13 = xVar.a(i11, this.f22700j, false).f23173d;
            }
            return Pair.create(Integer.valueOf(i11), Long.valueOf(j12));
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar2;
        h hVar = this.f22716z;
        if (hVar == null || (sVar2 = hVar.f22662a) != sVar) {
            return;
        }
        hVar.f22670i = true;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f22677p.a(hVar.f22676o, sVar2.a());
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f22680s;
        if (jVar != null) {
            for (int i10 = 0; i10 < jVarA.f22938b.f22934a; i10++) {
                if (!jVarA.a(jVar, i10)) {
                    hVar.f22674m = jVarA;
                    break;
                }
            }
        } else {
            hVar.f22674m = jVarA;
            break;
        }
        hVar.f22668g = hVar.a(hVar.f22668g, false, new boolean[hVar.f22675n.length]);
        if (this.B == null) {
            h hVar2 = this.f22716z;
            this.A = hVar2;
            a(hVar2.f22668g);
            a(this.A);
        }
        b();
    }

    public final void a(h hVar) throws d {
        if (this.B == hVar) {
            return;
        }
        boolean[] zArr = new boolean[this.f22691a.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f22691a;
            if (i10 < aVarArr.length) {
                a aVar = aVarArr[i10];
                boolean z10 = aVar.f21575c != 0;
                zArr[i10] = z10;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f22674m.f22938b.f22935b[i10];
                if (bVar != null) {
                    i11++;
                }
                if (z10 && (bVar == null || (aVar.f21579g && aVar.f21576d == this.B.f22664c[i10]))) {
                    if (aVar == this.f22703m) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f22695e;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar2 = this.f22704n;
                        uVar.getClass();
                        uVar.a(hVar2.b());
                        uVar.f23157d = hVar2.a();
                        this.f22704n = null;
                        this.f22703m = null;
                    }
                    a(aVar);
                    aVar.c();
                }
                i10++;
            } else {
                this.B = hVar;
                this.f22698h.obtainMessage(3, hVar.f22674m).sendToTarget();
                a(zArr, i11);
                return;
            }
        }
    }

    public final void a(boolean[] zArr, int i10) throws d {
        int i11;
        this.f22706p = new a[i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            a[] aVarArr = this.f22691a;
            if (i12 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i12];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = this.B.f22674m;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar.f22938b.f22935b[i12];
            if (bVar != null) {
                int i14 = i13 + 1;
                this.f22706p[i13] = aVar;
                if (aVar.f21575c == 0) {
                    t tVar = jVar.f22940d[i12];
                    boolean z10 = this.f22708r && this.f22711u == 3;
                    boolean z11 = !zArr[i12] && z10;
                    int length = bVar.f22927c.length;
                    o[] oVarArr = new o[length];
                    for (int i15 = 0; i15 < length; i15++) {
                        oVarArr[i15] = bVar.f22928d[i15];
                    }
                    h hVar = this.B;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = hVar.f22664c[i12];
                    long j10 = this.f22715y;
                    i11 = i12;
                    long j11 = hVar.f22666e - hVar.f22668g;
                    if (aVar.f21575c == 0) {
                        aVar.f21574b = tVar;
                        aVar.f21575c = 1;
                        aVar.h();
                        if (!aVar.f21579g) {
                            aVar.f21576d = vVar;
                            aVar.f21578f = false;
                            aVar.f21577e = j11;
                            aVar.a(oVarArr);
                            aVar.a(z11, j10);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.h hVarD = aVar.d();
                            if (hVarD != null) {
                                if (this.f22704n == null) {
                                    this.f22704n = hVarD;
                                    this.f22703m = aVar;
                                    ((MediaCodecAudioRenderer) hVarD).Q.a(this.f22702l);
                                } else {
                                    throw new d(new IllegalStateException("Multiple renderer media clocks enabled."));
                                }
                            }
                            if (z10) {
                                if (aVar.f21575c == 1) {
                                    aVar.f21575c = 2;
                                    aVar.i();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    i11 = i12;
                }
                i13 = i14;
            } else {
                i11 = i12;
            }
            i12 = i11 + 1;
        }
    }
}
