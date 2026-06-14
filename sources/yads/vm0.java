package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class vm0 extends io implements om0 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public fw2 E;
    public nc2 F;
    public vk1 G;
    public AudioTrack H;
    public Object I;
    public Surface J;
    public SurfaceHolder K;
    public boolean M;
    public TextureView N;
    public final int O;
    public int P;
    public int Q;
    public final int R;
    public final hk S;
    public float T;
    public boolean U;
    public final boolean V;
    public boolean W;
    public qf0 X;
    public vk1 Y;
    public ec2 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f117093a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g53 f117094b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f117095b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nc2 f117096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hy f117097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qc2 f117098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jo[] f117099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f53 f117100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u23 f117101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cn0 f117102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae1 f117103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet f117104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c43 f117105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f117106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f117107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final me f117108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Looper f117109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final am f117110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r23 f117111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sm0 f117112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tm0 f117113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final kk f117114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final qk f117115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o13 f117116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final lk3 f117117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final am3 f117118y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f117119z;

    static {
        dn0.a("goog.exo.exoplayer");
    }

    public vm0(nm0 nm0Var) {
        hy hyVar = new hy();
        this.f117097d = hyVar;
        try {
            uf1.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + w83.f117345e + C4240b4.j.f42674e);
            Context applicationContext = nm0Var.f113961a.getApplicationContext();
            me meVar = (me) nm0Var.f113968h.apply(nm0Var.f113962b);
            this.f117108o = meVar;
            hk hkVar = nm0Var.f113970j;
            this.S = hkVar;
            int i10 = nm0Var.f113971k;
            this.O = i10;
            this.U = false;
            this.f117119z = nm0Var.f113976p;
            sm0 sm0Var = new sm0(this);
            this.f117112s = sm0Var;
            tm0 tm0Var = new tm0();
            this.f117113t = tm0Var;
            Handler handler = new Handler(nm0Var.f113969i);
            jo[] joVarArrA = ((yd0) nm0Var.f113963c.get()).a(handler, sm0Var, sm0Var, sm0Var, sm0Var);
            this.f117099f = joVarArrA;
            fi.b(joVarArrA.length > 0);
            f53 f53Var = (f53) nm0Var.f113965e.get();
            this.f117100g = f53Var;
            am amVar = (am) nm0Var.f113967g.get();
            this.f117110q = amVar;
            this.f117107n = nm0Var.f113972l;
            ou2 ou2Var = nm0Var.f113973m;
            Looper looper = nm0Var.f113969i;
            this.f117109p = looper;
            r23 r23Var = nm0Var.f113962b;
            this.f117111r = r23Var;
            this.f117098e = this;
            this.f117103j = new ae1(looper, r23Var, new yd1() { // from class: yads.vr0
                @Override // yads.yd1
                public final void a(Object obj, pu0 pu0Var) {
                    this.f117158a.a((oc2) obj, pu0Var);
                }
            });
            this.f117104k = new CopyOnWriteArraySet();
            this.f117106m = new ArrayList();
            this.E = new fw2();
            g53 g53Var = new g53(new hl2[joVarArrA.length], new bo0[joVarArrA.length], b63.f108915c, null);
            this.f117094b = g53Var;
            this.f117105l = new c43();
            mc2 mc2VarA = new mc2().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            f53Var.getClass();
            nc2 nc2VarA = mc2VarA.a(true, 29).a();
            this.f117096c = nc2VarA;
            this.F = new mc2().a(nc2VarA).a(4).a(10).a();
            this.f117101h = r23Var.a(looper, null);
            zm0 zm0Var = new zm0() { // from class: yads.gs0
                @Override // yads.zm0
                public final void a(ym0 ym0Var) {
                    this.f111326a.b(ym0Var);
                }
            };
            this.Z = ec2.a(g53Var);
            ((xa0) meVar).a(this, looper);
            int i11 = w83.f117341a;
            this.f117102i = new cn0(joVarArrA, f53Var, g53Var, (kd0) nm0Var.f113966f.get(), amVar, 0, meVar, ou2Var, nm0Var.f113974n, nm0Var.f113975o, looper, r23Var, zm0Var, i11 < 31 ? new wc2() : rm0.a(applicationContext, this, nm0Var.f113977q));
            this.T = 1.0f;
            vk1 vk1Var = vk1.H;
            this.G = vk1Var;
            this.Y = vk1Var;
            this.f117093a0 = -1;
            if (i11 < 21) {
                this.R = m();
            } else {
                this.R = w83.a(applicationContext);
            }
            int i12 = c20.f109181b;
            this.V = true;
            a(meVar);
            ((qb0) amVar).a(new Handler(looper), meVar);
            a(sm0Var);
            kk kkVar = new kk(nm0Var.f113961a, handler, sm0Var);
            this.f117114u = kkVar;
            kkVar.a();
            qk qkVar = new qk(nm0Var.f113961a, handler, sm0Var);
            this.f117115v = qkVar;
            qkVar.b();
            o13 o13Var = new o13(nm0Var.f113961a, handler, sm0Var);
            this.f117116w = o13Var;
            o13Var.a(w83.c(hkVar.f111610d));
            lk3 lk3Var = new lk3(nm0Var.f113961a);
            this.f117117x = lk3Var;
            lk3Var.a();
            am3 am3Var = new am3(nm0Var.f113961a);
            this.f117118y = am3Var;
            am3Var.a();
            this.X = a(o13Var);
            int i13 = tg3.f116239f;
            f53Var.a(hkVar);
            a(1, 10, Integer.valueOf(this.R));
            a(2, 10, Integer.valueOf(this.R));
            a(1, 3, hkVar);
            a(2, 4, Integer.valueOf(i10));
            a(2, 5, (Object) 0);
            a(1, 9, Boolean.valueOf(this.U));
            a(2, 7, tm0Var);
            a(6, 8, tm0Var);
            hyVar.d();
        } catch (Throwable th2) {
            this.f117097d.d();
            throw th2;
        }
    }

    public static long b(ec2 ec2Var) {
        e43 e43Var = new e43();
        c43 c43Var = new c43();
        ec2Var.f110310a.a(ec2Var.f110311b.f109962a, c43Var);
        long j10 = ec2Var.f110312c;
        return j10 == -9223372036854775807L ? ec2Var.f110310a.a(c43Var.f109216d, e43Var, 0L).f110199n : c43Var.f109218f + j10;
    }

    public final void a(sm0 sm0Var) {
        this.f117104k.add(sm0Var);
    }

    public final vk1 c() {
        u();
        f43 f43Var = this.Z.f110310a;
        if (f43Var.c()) {
            return this.Y;
        }
        rk1 rk1Var = f43Var.a(g(), this.f112066a, 0L).f110189d;
        vk1 vk1Var = this.Y;
        vk1Var.getClass();
        uk1 uk1Var = new uk1(vk1Var);
        vk1 vk1Var2 = rk1Var.f115477e;
        if (vk1Var2 != null) {
            CharSequence charSequence = vk1Var2.f117021b;
            if (charSequence != null) {
                uk1Var.f116677a = charSequence;
            }
            CharSequence charSequence2 = vk1Var2.f117022c;
            if (charSequence2 != null) {
                uk1Var.f116678b = charSequence2;
            }
            CharSequence charSequence3 = vk1Var2.f117023d;
            if (charSequence3 != null) {
                uk1Var.f116679c = charSequence3;
            }
            CharSequence charSequence4 = vk1Var2.f117024e;
            if (charSequence4 != null) {
                uk1Var.f116680d = charSequence4;
            }
            CharSequence charSequence5 = vk1Var2.f117025f;
            if (charSequence5 != null) {
                uk1Var.f116681e = charSequence5;
            }
            CharSequence charSequence6 = vk1Var2.f117026g;
            if (charSequence6 != null) {
                uk1Var.f116682f = charSequence6;
            }
            CharSequence charSequence7 = vk1Var2.f117027h;
            if (charSequence7 != null) {
                uk1Var.f116683g = charSequence7;
            }
            mj2 mj2Var = vk1Var2.f117028i;
            if (mj2Var != null) {
                uk1Var.f116684h = mj2Var;
            }
            mj2 mj2Var2 = vk1Var2.f117029j;
            if (mj2Var2 != null) {
                uk1Var.f116685i = mj2Var2;
            }
            byte[] bArr = vk1Var2.f117030k;
            if (bArr != null) {
                Integer num = vk1Var2.f117031l;
                uk1Var.f116686j = (byte[]) bArr.clone();
                uk1Var.f116687k = num;
            }
            Uri uri = vk1Var2.f117032m;
            if (uri != null) {
                uk1Var.f116688l = uri;
            }
            Integer num2 = vk1Var2.f117033n;
            if (num2 != null) {
                uk1Var.f116689m = num2;
            }
            Integer num3 = vk1Var2.f117034o;
            if (num3 != null) {
                uk1Var.f116690n = num3;
            }
            Integer num4 = vk1Var2.f117035p;
            if (num4 != null) {
                uk1Var.f116691o = num4;
            }
            Boolean bool = vk1Var2.f117036q;
            if (bool != null) {
                uk1Var.f116692p = bool;
            }
            Integer num5 = vk1Var2.f117037r;
            if (num5 != null) {
                uk1Var.f116693q = num5;
            }
            Integer num6 = vk1Var2.f117038s;
            if (num6 != null) {
                uk1Var.f116693q = num6;
            }
            Integer num7 = vk1Var2.f117039t;
            if (num7 != null) {
                uk1Var.f116694r = num7;
            }
            Integer num8 = vk1Var2.f117040u;
            if (num8 != null) {
                uk1Var.f116695s = num8;
            }
            Integer num9 = vk1Var2.f117041v;
            if (num9 != null) {
                uk1Var.f116696t = num9;
            }
            Integer num10 = vk1Var2.f117042w;
            if (num10 != null) {
                uk1Var.f116697u = num10;
            }
            Integer num11 = vk1Var2.f117043x;
            if (num11 != null) {
                uk1Var.f116698v = num11;
            }
            CharSequence charSequence8 = vk1Var2.f117044y;
            if (charSequence8 != null) {
                uk1Var.f116699w = charSequence8;
            }
            CharSequence charSequence9 = vk1Var2.f117045z;
            if (charSequence9 != null) {
                uk1Var.f116700x = charSequence9;
            }
            CharSequence charSequence10 = vk1Var2.A;
            if (charSequence10 != null) {
                uk1Var.f116701y = charSequence10;
            }
            Integer num12 = vk1Var2.B;
            if (num12 != null) {
                uk1Var.f116702z = num12;
            }
            Integer num13 = vk1Var2.C;
            if (num13 != null) {
                uk1Var.A = num13;
            }
            CharSequence charSequence11 = vk1Var2.D;
            if (charSequence11 != null) {
                uk1Var.B = charSequence11;
            }
            CharSequence charSequence12 = vk1Var2.E;
            if (charSequence12 != null) {
                uk1Var.C = charSequence12;
            }
            CharSequence charSequence13 = vk1Var2.F;
            if (charSequence13 != null) {
                uk1Var.D = charSequence13;
            }
            Bundle bundle = vk1Var2.G;
            if (bundle != null) {
                uk1Var.E = bundle;
            }
        }
        return new vk1(uk1Var);
    }

    public final long d() {
        u();
        u();
        if (!this.Z.f110311b.a()) {
            u();
            return w83.b(a(this.Z));
        }
        ec2 ec2Var = this.Z;
        ec2Var.f110310a.a(ec2Var.f110311b.f109962a, this.f117105l);
        ec2 ec2Var2 = this.Z;
        if (ec2Var2.f110312c == -9223372036854775807L) {
            return w83.b(ec2Var2.f110310a.a(g(), this.f112066a, 0L).f110199n);
        }
        return w83.b(this.Z.f110312c) + w83.b(this.f117105l.f109218f);
    }

    public final int e() {
        u();
        u();
        if (this.Z.f110311b.a()) {
            return this.Z.f110311b.f109963b;
        }
        return -1;
    }

    public final int f() {
        u();
        u();
        if (this.Z.f110311b.a()) {
            return this.Z.f110311b.f109964c;
        }
        return -1;
    }

    public final int g() {
        u();
        int iK = k();
        if (iK == -1) {
            return 0;
        }
        return iK;
    }

    public final int h() {
        u();
        if (this.Z.f110310a.c()) {
            return 0;
        }
        ec2 ec2Var = this.Z;
        return ec2Var.f110310a.a(ec2Var.f110311b.f109962a);
    }

    public final long i() {
        u();
        return w83.b(a(this.Z));
    }

    public final f43 j() {
        u();
        return this.Z.f110310a;
    }

    public final int k() {
        if (this.Z.f110310a.c()) {
            return this.f117093a0;
        }
        ec2 ec2Var = this.Z;
        return ec2Var.f110310a.a(ec2Var.f110311b.f109962a, this.f117105l).f109216d;
    }

    public final long l() {
        u();
        u();
        if (this.Z.f110311b.a()) {
            ec2 ec2Var = this.Z;
            kl1 kl1Var = ec2Var.f110311b;
            ec2Var.f110310a.a(kl1Var.f109962a, this.f117105l);
            return w83.b(this.f117105l.a(kl1Var.f109963b, kl1Var.f109964c));
        }
        u();
        f43 f43Var = this.Z.f110310a;
        if (f43Var.c()) {
            return -9223372036854775807L;
        }
        return w83.b(f43Var.a(g(), this.f112066a, 0L).f110200o);
    }

    public final int m() {
        AudioTrack audioTrack = this.H;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.H.release();
            this.H = null;
        }
        if (this.H == null) {
            this.H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.H.getAudioSessionId();
    }

    public final boolean n() {
        u();
        return this.Z.f110311b.a();
    }

    public final void o() {
        u();
        u();
        boolean z10 = this.Z.f110321l;
        int iA = this.f117115v.a(z10, 2);
        a(iA, (!z10 || iA == 1) ? 1 : 2, z10);
        ec2 ec2Var = this.Z;
        if (ec2Var.f110314e != 1) {
            return;
        }
        ec2 ec2VarA = ec2Var.a((lm0) null);
        ec2 ec2VarA2 = ec2VarA.a(ec2VarA.f110310a.c() ? 4 : 2);
        this.A++;
        u23 u23Var = this.f117102i.f109471i;
        u23Var.getClass();
        t23 t23VarA = u23.a();
        t23VarA.f116042a = u23Var.f116471a.obtainMessage(0);
        t23VarA.b();
        a(ec2VarA2, 1, 1, false, 5, -9223372036854775807L);
    }

    public final void p() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.1] [");
        sb2.append(w83.f117345e);
        sb2.append("] [");
        synchronized (dn0.class) {
            str = dn0.f109985b;
        }
        sb2.append(str);
        sb2.append(C4240b4.j.f42674e);
        uf1.c("ExoPlayerImpl", sb2.toString());
        u();
        if (w83.f117341a < 21 && (audioTrack = this.H) != null) {
            audioTrack.release();
            this.H = null;
        }
        this.f117114u.a();
        this.f117116w.b();
        lk3 lk3Var = this.f117117x;
        lk3Var.f113140b = false;
        lk3Var.b();
        am3 am3Var = this.f117118y;
        am3Var.f108725b = false;
        am3Var.b();
        qk qkVar = this.f117115v;
        qkVar.f115038c = null;
        qkVar.a();
        if (!this.f117102i.h()) {
            ae1 ae1Var = this.f117103j;
            ae1Var.a(10, new xd1() { // from class: yads.es0
                @Override // yads.xd1
                public final void invoke(Object obj) {
                    vm0.b((oc2) obj);
                }
            });
            ae1Var.a();
        }
        ae1 ae1Var2 = this.f117103j;
        for (zd1 zd1Var : ae1Var2.f108656d) {
            yd1 yd1Var = ae1Var2.f108655c;
            zd1Var.f118631d = true;
            if (zd1Var.f118630c) {
                yd1Var.a(zd1Var.f118628a, zd1Var.f118629b.a());
            }
        }
        ae1Var2.f108656d.clear();
        ae1Var2.f108659g = true;
        this.f117101h.f116471a.removeCallbacksAndMessages(null);
        am amVar = this.f117110q;
        me meVar = this.f117108o;
        yl ylVar = ((qb0) amVar).f114917b;
        for (xl xlVar : ylVar.f118281a) {
            if (xlVar.f117860b == meVar) {
                xlVar.f117861c = true;
                ylVar.f118281a.remove(xlVar);
            }
        }
        ec2 ec2VarA = this.Z.a(1);
        this.Z = ec2VarA;
        ec2 ec2VarA2 = ec2VarA.a(ec2VarA.f110311b);
        this.Z = ec2VarA2;
        ec2VarA2.f110325p = ec2VarA2.f110327r;
        this.Z.f110326q = 0L;
        ((xa0) this.f117108o).c();
        this.f117100g.a();
        q();
        Surface surface = this.J;
        if (surface != null) {
            surface.release();
            this.J = null;
        }
        int i10 = c20.f109181b;
    }

    public final void q() {
        TextureView textureView = this.N;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f117112s) {
                uf1.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.N.setSurfaceTextureListener(null);
            }
            this.N = null;
        }
        SurfaceHolder surfaceHolder = this.K;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f117112s);
            this.K = null;
        }
    }

    public final void r() {
        u();
        u();
        qk qkVar = this.f117115v;
        u();
        qkVar.a(this.Z.f110321l, 1);
        a((lm0) null);
        int i10 = c20.f109181b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vm0.s():void");
    }

    public final void t() {
        u();
        int i10 = this.Z.f110314e;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                u();
                boolean z10 = this.Z.f110324o;
                lk3 lk3Var = this.f117117x;
                u();
                lk3Var.f113140b = this.Z.f110321l && !z10;
                lk3Var.b();
                am3 am3Var = this.f117118y;
                u();
                am3Var.f108725b = this.Z.f110321l;
                am3Var.b();
                return;
            }
            if (i10 != 4) {
                throw new IllegalStateException();
            }
        }
        lk3 lk3Var2 = this.f117117x;
        lk3Var2.f113140b = false;
        lk3Var2.b();
        am3 am3Var2 = this.f117118y;
        am3Var2.f108725b = false;
        am3Var2.b();
    }

    public final void u() {
        this.f117097d.b();
        if (Thread.currentThread() != this.f117109p.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f117109p.getThread().getName();
            int i10 = w83.f117341a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
            if (this.V) {
                throw new IllegalStateException(str);
            }
            uf1.d("ExoPlayerImpl", uf1.a(str, this.W ? null : new IllegalStateException()));
            this.W = true;
        }
    }

    public final void a(oc2 oc2Var) {
        oc2Var.getClass();
        ae1 ae1Var = this.f117103j;
        if (ae1Var.f108659g) {
            return;
        }
        ae1Var.f108656d.add(new zd1(oc2Var));
    }

    public static void h(ec2 ec2Var, oc2 oc2Var) {
        oc2Var.onIsPlayingChanged(ec2Var.f110314e == 3 && ec2Var.f110321l && ec2Var.f110322m == 0);
    }

    public final zc2 a(yc2 yc2Var) {
        int iK = k();
        cn0 cn0Var = this.f117102i;
        f43 f43Var = this.Z.f110310a;
        if (iK == -1) {
            iK = 0;
        }
        return new zc2(cn0Var, yc2Var, f43Var, iK, this.f117111r, cn0Var.f109473k);
    }

    public final void b(final ym0 ym0Var) {
        u23 u23Var = this.f117101h;
        u23Var.f116471a.post(new Runnable() { // from class: yads.fs0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110842b.a(ym0Var);
            }
        });
    }

    public final long a(ec2 ec2Var) {
        if (ec2Var.f110310a.c()) {
            return w83.a(this.f117095b0);
        }
        if (ec2Var.f110311b.a()) {
            return ec2Var.f110327r;
        }
        f43 f43Var = ec2Var.f110310a;
        kl1 kl1Var = ec2Var.f110311b;
        long j10 = ec2Var.f110327r;
        f43Var.a(kl1Var.f109962a, this.f117105l);
        return j10 + this.f117105l.f109218f;
    }

    public static void b(oc2 oc2Var) {
        oc2Var.a(new lm0(2, new yn0(1), 1003, 0));
    }

    public static /* synthetic */ void d(ec2 ec2Var, oc2 oc2Var) {
        boolean z10 = ec2Var.f110316g;
        oc2Var.getClass();
        oc2Var.onIsLoadingChanged(ec2Var.f110316g);
    }

    public final void b(int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            this.f117106m.remove(i11);
        }
        fw2 fw2Var = this.E;
        int[] iArr = new int[fw2Var.f110953b.length - i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr2 = fw2Var.f110953b;
            if (i12 < iArr2.length) {
                int i14 = iArr2[i12];
                if (i14 < 0 || i14 >= i10) {
                    int i15 = i12 - i13;
                    if (i14 >= 0) {
                        i14 -= i10;
                    }
                    iArr[i15] = i14;
                } else {
                    i13++;
                }
                i12++;
            } else {
                this.E = new fw2(iArr, new Random(fw2Var.f110952a.nextLong()));
                return;
            }
        }
    }

    public final void d(oc2 oc2Var) {
        oc2Var.getClass();
        ae1 ae1Var = this.f117103j;
        for (zd1 zd1Var : ae1Var.f108656d) {
            if (zd1Var.f118628a.equals(oc2Var)) {
                yd1 yd1Var = ae1Var.f108655c;
                zd1Var.f118631d = true;
                if (zd1Var.f118630c) {
                    yd1Var.a(zd1Var.f118628a, zd1Var.f118629b.a());
                }
                ae1Var.f108656d.remove(zd1Var);
            }
        }
    }

    public final /* synthetic */ void a(oc2 oc2Var, pu0 pu0Var) {
        oc2Var.getClass();
    }

    public final void a(ym0 ym0Var) {
        boolean z10;
        long j10;
        int i10 = this.A - ym0Var.f118294c;
        this.A = i10;
        boolean z11 = true;
        if (ym0Var.f118295d) {
            this.B = ym0Var.f118296e;
            this.C = true;
        }
        if (ym0Var.f118297f) {
            this.D = ym0Var.f118298g;
        }
        if (i10 == 0) {
            f43 f43Var = ym0Var.f118293b.f110310a;
            if (!this.Z.f110310a.c() && f43Var.c()) {
                this.f117093a0 = -1;
                this.f117095b0 = 0L;
            }
            if (!f43Var.c()) {
                List listAsList = Arrays.asList(((sd2) f43Var).f115760j);
                if (listAsList.size() == this.f117106m.size()) {
                    for (int i11 = 0; i11 < listAsList.size(); i11++) {
                        ((um0) this.f117106m.get(i11)).f116713b = (f43) listAsList.get(i11);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            long j11 = -9223372036854775807L;
            if (this.C) {
                if (ym0Var.f118293b.f110311b.equals(this.Z.f110311b) && ym0Var.f118293b.f110313d == this.Z.f110327r) {
                    z11 = false;
                }
                if (z11) {
                    if (!f43Var.c() && !ym0Var.f118293b.f110311b.a()) {
                        ec2 ec2Var = ym0Var.f118293b;
                        kl1 kl1Var = ec2Var.f110311b;
                        long j12 = ec2Var.f110313d;
                        f43Var.a(kl1Var.f109962a, this.f117105l);
                        j10 = this.f117105l.f109218f + j12;
                        z10 = z11;
                        this.C = false;
                        a(ym0Var.f118293b, 1, this.D, z10, this.B, j10);
                    }
                    j11 = ym0Var.f118293b.f110313d;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            j10 = j11;
            this.C = false;
            a(ym0Var.f118293b, 1, this.D, z10, this.B, j10);
        }
    }

    public static /* synthetic */ void a(ec2 ec2Var, int i10, oc2 oc2Var) {
        f43 f43Var = ec2Var.f110310a;
        oc2Var.a(i10);
    }

    public static /* synthetic */ void a(int i10, pc2 pc2Var, pc2 pc2Var2, oc2 oc2Var) {
        oc2Var.getClass();
        oc2Var.a(pc2Var, pc2Var2, i10);
    }

    public final ec2 a(ec2 ec2Var, sd2 sd2Var, Pair pair) {
        List list;
        long jA;
        if (!sd2Var.c() && pair == null) {
            throw new IllegalArgumentException();
        }
        f43 f43Var = ec2Var.f110310a;
        ec2 ec2VarA = ec2Var.a(sd2Var);
        if (sd2Var.c()) {
            kl1 kl1Var = ec2.f110309s;
            long jA2 = w83.a(this.f117095b0);
            ec2 ec2VarA2 = ec2VarA.a(kl1Var, jA2, jA2, jA2, 0L, v43.f116871e, this.f117094b, nk2.f113952f).a(kl1Var);
            ec2VarA2.f110325p = ec2VarA2.f110327r;
            return ec2VarA2;
        }
        Object obj = ec2VarA.f110311b.f109962a;
        int i10 = w83.f117341a;
        boolean zEquals = obj.equals(pair.first);
        kl1 kl1Var2 = !zEquals ? new kl1(pair.first) : ec2VarA.f110311b;
        long jLongValue = ((Long) pair.second).longValue();
        long jA3 = w83.a(d());
        if (!f43Var.c()) {
            jA3 -= f43Var.a(obj, this.f117105l).f109218f;
        }
        if (!zEquals || jLongValue < jA3) {
            kl1 kl1Var3 = kl1Var2;
            if (!kl1Var3.a()) {
                v43 v43Var = !zEquals ? v43.f116871e : ec2VarA.f110317h;
                g53 g53Var = !zEquals ? this.f117094b : ec2VarA.f110318i;
                if (!zEquals) {
                    v31 v31Var = y31.f118068c;
                    list = nk2.f113952f;
                } else {
                    list = ec2VarA.f110319j;
                }
                ec2 ec2VarA3 = ec2VarA.a(kl1Var3, jLongValue, jLongValue, jLongValue, 0L, v43Var, g53Var, list).a(kl1Var3);
                ec2VarA3.f110325p = jLongValue;
                return ec2VarA3;
            }
            throw new IllegalStateException();
        }
        if (jLongValue == jA3) {
            int iA = sd2Var.a(ec2VarA.f110320k.f109962a);
            if (iA != -1 && sd2Var.a(iA, this.f117105l, false).f109216d == sd2Var.a(kl1Var2.f109962a, this.f117105l).f109216d) {
                return ec2VarA;
            }
            sd2Var.a(kl1Var2.f109962a, this.f117105l);
            if (kl1Var2.a()) {
                jA = this.f117105l.a(kl1Var2.f109963b, kl1Var2.f109964c);
            } else {
                jA = this.f117105l.f109217e;
            }
            kl1 kl1Var4 = kl1Var2;
            ec2 ec2VarA4 = ec2VarA.a(kl1Var4, ec2VarA.f110327r, ec2VarA.f110327r, ec2VarA.f110313d, jA - ec2VarA.f110327r, ec2VarA.f110317h, ec2VarA.f110318i, ec2VarA.f110319j).a(kl1Var4);
            ec2VarA4.f110325p = jA;
            return ec2VarA4;
        }
        kl1 kl1Var5 = kl1Var2;
        if (!kl1Var5.a()) {
            long jMax = Math.max(0L, ec2VarA.f110326q - (jLongValue - jA3));
            long j10 = ec2VarA.f110325p;
            if (ec2VarA.f110320k.equals(ec2VarA.f110311b)) {
                j10 = jLongValue + jMax;
            }
            ec2 ec2VarA5 = ec2VarA.a(kl1Var5, jLongValue, jLongValue, jLongValue, jMax, ec2VarA.f110317h, ec2VarA.f110318i, ec2VarA.f110319j);
            ec2VarA5.f110325p = j10;
            return ec2VarA5;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ void c(oc2 oc2Var) {
        oc2Var.a(this.F);
    }

    public final Pair a(sd2 sd2Var, int i10, long j10) {
        if (sd2Var.c()) {
            this.f117093a0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f117095b0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= sd2Var.f115756f) {
            i10 = sd2Var.a(false);
            j10 = w83.b(sd2Var.a(i10, this.f112066a, 0L).f110199n);
        }
        return sd2Var.a(this.f112066a, this.f117105l, i10, w83.a(j10));
    }

    public final void a(final int i10, final int i11) {
        if (i10 == this.P && i11 == this.Q) {
            return;
        }
        this.P = i10;
        this.Q = i11;
        ae1 ae1Var = this.f117103j;
        ae1Var.a(24, new xd1() { // from class: yads.ks0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                ((oc2) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        ae1Var.a();
    }

    public final void a(int i10, int i11, Object obj) {
        for (jo joVar : this.f117099f) {
            if (joVar.f112407b == i10) {
                zc2 zc2VarA = a(joVar);
                boolean z10 = zc2VarA.f118619g;
                if (!z10) {
                    zc2VarA.f118616d = i11;
                    if (!z10) {
                        zc2VarA.f118617e = obj;
                        zc2VarA.a();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    public final void a(ml1 ml1Var) {
        u();
        List listSingletonList = Collections.singletonList(ml1Var);
        u();
        u();
        k();
        u();
        a(this.Z);
        int i10 = w83.f117341a;
        this.A++;
        if (!this.f117106m.isEmpty()) {
            b(this.f117106m.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            tl1 tl1Var = new tl1((ml1) listSingletonList.get(i11), this.f117107n);
            arrayList.add(tl1Var);
            this.f117106m.add(i11, new um0(tl1Var.f116286a.f112341h, tl1Var.f116287b));
        }
        this.E = this.E.a(arrayList.size());
        sd2 sd2Var = new sd2(this.f117106m, this.E);
        if (!sd2Var.c() && -1 >= sd2Var.f115756f) {
            throw new q11();
        }
        int iA = sd2Var.a(false);
        ec2 ec2VarA = a(this.Z, sd2Var, a(sd2Var, iA, -9223372036854775807L));
        int i12 = ec2VarA.f110314e;
        if (iA != -1 && i12 != 1) {
            i12 = (sd2Var.c() || iA >= sd2Var.f115756f) ? 4 : 2;
        }
        ec2 ec2VarA2 = ec2VarA.a(i12);
        this.f117102i.f109471i.a(17, new xm0(iA, w83.a(-9223372036854775807L), this.E, arrayList)).b();
        a(ec2VarA2, 0, 1, (this.Z.f110311b.f109962a.equals(ec2VarA2.f110311b.f109962a) || this.Z.f110310a.c()) ? false : true, 4, a(ec2VarA2));
    }

    public final void a(boolean z10) {
        u();
        qk qkVar = this.f117115v;
        u();
        int iA = qkVar.a(z10, this.Z.f110314e);
        int i10 = 1;
        if (z10 && iA != 1) {
            i10 = 2;
        }
        a(iA, i10, z10);
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.J = surface;
    }

    public final void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        jo[] joVarArr = this.f117099f;
        int length = joVarArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                jo joVar = joVarArr[i10];
                if (joVar.f112407b == 2) {
                    zc2 zc2VarA = a(joVar);
                    boolean z11 = zc2VarA.f118619g;
                    if (!z11) {
                        zc2VarA.f118616d = 1;
                        if (!z11) {
                            zc2VarA.f118617e = surface;
                            arrayList.add(zc2VarA.a());
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i10++;
            } else {
                Object obj = this.I;
                if (obj == null || obj == surface) {
                    z10 = false;
                } else {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((zc2) it.next()).a(this.f117119z);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (TimeoutException unused2) {
                    }
                    z10 = false;
                    Object obj2 = this.I;
                    Surface surface2 = this.J;
                    if (obj2 == surface2) {
                        surface2.release();
                        this.J = null;
                    }
                }
                this.I = surface;
                if (z10) {
                    a(new lm0(2, new yn0(3), 1003, 0));
                    return;
                }
                return;
            }
        }
    }

    public final void a(TextureView textureView) {
        u();
        if (textureView == null) {
            u();
            q();
            a((Surface) null);
            a(0, 0);
            return;
        }
        q();
        this.N = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            uf1.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f117112s);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.J = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void a(float f10) {
        u();
        int i10 = w83.f117341a;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.T == fMax) {
            return;
        }
        this.T = fMax;
        a(1, 2, Float.valueOf(this.f117115v.f115042g * fMax));
        ae1 ae1Var = this.f117103j;
        ae1Var.a(22, new xd1() { // from class: yads.js0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                ((oc2) obj).onVolumeChanged(fMax);
            }
        });
        ae1Var.a();
    }

    public final void a(lm0 lm0Var) {
        ec2 ec2Var = this.Z;
        ec2 ec2VarA = ec2Var.a(ec2Var.f110311b);
        ec2VarA.f110325p = ec2VarA.f110327r;
        ec2VarA.f110326q = 0L;
        ec2 ec2VarA2 = ec2VarA.a(1);
        if (lm0Var != null) {
            ec2VarA2 = ec2VarA2.a(lm0Var);
        }
        ec2 ec2Var2 = ec2VarA2;
        this.A++;
        u23 u23Var = this.f117102i.f109471i;
        u23Var.getClass();
        t23 t23VarA = u23.a();
        t23VarA.f116042a = u23Var.f116471a.obtainMessage(6);
        t23VarA.b();
        a(ec2Var2, 0, 1, ec2Var2.f110310a.c() && !this.Z.f110310a.c(), 4, a(ec2Var2));
    }

    public final void a(int i10, int i11, boolean z10) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        ec2 ec2Var = this.Z;
        if (ec2Var.f110321l == z11 && ec2Var.f110322m == i12) {
            return;
        }
        this.A++;
        int i13 = i12;
        boolean z12 = z11;
        ec2 ec2Var2 = new ec2(ec2Var.f110310a, ec2Var.f110311b, ec2Var.f110312c, ec2Var.f110313d, ec2Var.f110314e, ec2Var.f110315f, ec2Var.f110316g, ec2Var.f110317h, ec2Var.f110318i, ec2Var.f110319j, ec2Var.f110320k, z12, i13, ec2Var.f110323n, ec2Var.f110325p, ec2Var.f110326q, ec2Var.f110327r, ec2Var.f110324o);
        u23 u23Var = this.f117102i.f109471i;
        u23Var.getClass();
        t23 t23VarA = u23.a();
        t23VarA.f116042a = u23Var.f116471a.obtainMessage(1, z12 ? 1 : 0, i13);
        t23VarA.b();
        a(ec2Var2, 0, i11, false, 5, -9223372036854775807L);
    }

    public final void a(final ec2 ec2Var, final int i10, final int i11, boolean z10, final int i12, long j10) {
        int i13;
        Pair pair;
        int i14;
        final rk1 rk1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj;
        int i15;
        rk1 rk1Var2;
        Object obj2;
        int i16;
        long j11;
        long j12;
        long jB;
        long jB2;
        Object obj3;
        rk1 rk1Var3;
        Object obj4;
        int iA;
        ec2 ec2Var2 = this.Z;
        this.Z = ec2Var;
        boolean zEquals = ec2Var2.f110310a.equals(ec2Var.f110310a);
        f43 f43Var = ec2Var2.f110310a;
        f43 f43Var2 = ec2Var.f110310a;
        if (f43Var2.c() && f43Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
            i13 = 3;
        } else {
            i13 = 3;
            if (f43Var2.c() != f43Var.c()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!f43Var.a(f43Var.a(ec2Var2.f110311b.f109962a, this.f117105l).f109216d, this.f112066a, 0L).f110187b.equals(f43Var2.a(f43Var2.a(ec2Var.f110311b.f109962a, this.f117105l).f109216d, this.f112066a, 0L).f110187b)) {
                if (z10 && i12 == 0) {
                    i14 = 1;
                } else if (z10 && i12 == 1) {
                    i14 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i14 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
            } else if (z10 && i12 == 0 && ec2Var2.f110311b.f109965d < ec2Var.f110311b.f109965d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        vk1 vk1VarC = this.G;
        if (zBooleanValue) {
            rk1Var = !ec2Var.f110310a.c() ? ec2Var.f110310a.a(ec2Var.f110310a.a(ec2Var.f110311b.f109962a, this.f117105l).f109216d, this.f112066a, 0L).f110189d : null;
            this.Y = vk1.H;
        } else {
            rk1Var = null;
        }
        if (zBooleanValue || !ec2Var2.f110319j.equals(ec2Var.f110319j)) {
            vk1 vk1Var = this.Y;
            vk1Var.getClass();
            uk1 uk1Var = new uk1(vk1Var);
            List list = ec2Var.f110319j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                fr1 fr1Var = (fr1) list.get(i17);
                int i18 = 0;
                while (true) {
                    er1[] er1VarArr = fr1Var.f110835b;
                    if (i18 < er1VarArr.length) {
                        er1VarArr[i18].a(uk1Var);
                        i18++;
                    }
                }
            }
            this.Y = new vk1(uk1Var);
            vk1VarC = c();
        }
        boolean zEquals2 = vk1VarC.equals(this.G);
        this.G = vk1VarC;
        boolean z15 = ec2Var2.f110321l != ec2Var.f110321l;
        boolean z16 = ec2Var2.f110314e != ec2Var.f110314e;
        if (z16 || z15) {
            t();
        }
        boolean z17 = ec2Var2.f110316g != ec2Var.f110316g;
        if (!ec2Var2.f110310a.equals(ec2Var.f110310a)) {
            this.f117103j.a(0, new xd1() { // from class: yads.ls0
                @Override // yads.xd1
                public final void invoke(Object obj5) {
                    vm0.a(ec2Var, i10, (oc2) obj5);
                }
            });
        }
        if (z10) {
            c43 c43Var = new c43();
            if (ec2Var2.f110310a.c()) {
                z11 = zBooleanValue;
                z12 = zEquals2;
                z13 = z16;
                obj = null;
                i15 = -1;
                rk1Var2 = null;
                obj2 = null;
                i16 = -1;
            } else {
                Object obj5 = ec2Var2.f110311b.f109962a;
                ec2Var2.f110310a.a(obj5, c43Var);
                int i19 = c43Var.f109216d;
                int iA2 = ec2Var2.f110310a.a(obj5);
                z11 = zBooleanValue;
                z12 = zEquals2;
                z13 = z16;
                obj = ec2Var2.f110310a.a(i19, this.f112066a, 0L).f110187b;
                rk1Var2 = this.f112066a.f110189d;
                obj2 = obj5;
                i15 = i19;
                i16 = iA2;
            }
            if (i12 == 0) {
                if (ec2Var2.f110311b.a()) {
                    kl1 kl1Var = ec2Var2.f110311b;
                    jB = c43Var.a(kl1Var.f109963b, kl1Var.f109964c);
                    jB2 = b(ec2Var2);
                } else if (ec2Var2.f110311b.f109966e != -1) {
                    jB = b(this.Z);
                    jB2 = jB;
                } else {
                    j11 = c43Var.f109218f;
                    j12 = c43Var.f109217e;
                    jB = j11 + j12;
                    jB2 = jB;
                }
            } else if (ec2Var2.f110311b.a()) {
                jB = ec2Var2.f110327r;
                jB2 = b(ec2Var2);
            } else {
                j11 = c43Var.f109218f;
                j12 = ec2Var2.f110327r;
                jB = j11 + j12;
                jB2 = jB;
            }
            long jB3 = w83.b(jB);
            long jB4 = w83.b(jB2);
            kl1 kl1Var2 = ec2Var2.f110311b;
            final pc2 pc2Var = new pc2(obj, i15, rk1Var2, obj2, i16, jB3, jB4, kl1Var2.f109963b, kl1Var2.f109964c);
            int iG = g();
            if (this.Z.f110310a.c()) {
                obj3 = null;
                rk1Var3 = null;
                obj4 = null;
                iA = -1;
            } else {
                ec2 ec2Var3 = this.Z;
                Object obj6 = ec2Var3.f110311b.f109962a;
                ec2Var3.f110310a.a(obj6, this.f117105l);
                iA = this.Z.f110310a.a(obj6);
                obj4 = obj6;
                obj3 = this.Z.f110310a.a(iG, this.f112066a, 0L).f110187b;
                rk1Var3 = this.f112066a.f110189d;
            }
            long jB5 = w83.b(j10);
            long jB6 = this.Z.f110311b.a() ? w83.b(b(this.Z)) : jB5;
            kl1 kl1Var3 = this.Z.f110311b;
            final pc2 pc2Var2 = new pc2(obj3, iG, rk1Var3, obj4, iA, jB5, jB6, kl1Var3.f109963b, kl1Var3.f109964c);
            this.f117103j.a(11, new xd1() { // from class: yads.us0
                @Override // yads.xd1
                public final void invoke(Object obj7) {
                    vm0.a(i12, pc2Var, pc2Var2, (oc2) obj7);
                }
            });
        } else {
            z11 = zBooleanValue;
            z12 = zEquals2;
            z13 = z16;
        }
        if (z11) {
            ae1 ae1Var = this.f117103j;
            xd1 xd1Var = new xd1() { // from class: yads.wr0
                @Override // yads.xd1
                public final void invoke(Object obj7) {
                    ((oc2) obj7).a(rk1Var, iIntValue);
                }
            };
            z14 = true;
            ae1Var.a(1, xd1Var);
        } else {
            z14 = true;
        }
        if (ec2Var2.f110315f != ec2Var.f110315f) {
            this.f117103j.a(10, new xd1() { // from class: yads.xr0
                @Override // yads.xd1
                public final void invoke(Object obj7) {
                    ((oc2) obj7).b(ec2Var.f110315f);
                }
            });
            if (ec2Var.f110315f != null) {
                this.f117103j.a(10, new xd1() { // from class: yads.yr0
                    @Override // yads.xd1
                    public final void invoke(Object obj7) {
                        ((oc2) obj7).a(ec2Var.f110315f);
                    }
                });
            }
        }
        g53 g53Var = ec2Var2.f110318i;
        g53 g53Var2 = ec2Var.f110318i;
        if (g53Var != g53Var2) {
            f53 f53Var = this.f117100g;
            Object obj7 = g53Var2.f111080e;
            ((ah1) f53Var).getClass();
            this.f117103j.a(2, new xd1() { // from class: yads.zr0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    ((oc2) obj8).a(ec2Var.f110318i.f111079d);
                }
            });
        }
        if (!z12) {
            final vk1 vk1Var2 = this.G;
            this.f117103j.a(14, new xd1() { // from class: yads.as0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    ((oc2) obj8).a(vk1Var2);
                }
            });
        }
        if (z17) {
            this.f117103j.a(i13, new xd1() { // from class: yads.bs0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    vm0.d(ec2Var, (oc2) obj8);
                }
            });
        }
        if (z13 || z15) {
            this.f117103j.a(-1, new xd1() { // from class: yads.cs0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    ec2 ec2Var4 = ec2Var;
                    ((oc2) obj8).onPlayerStateChanged(ec2Var4.f110321l, ec2Var4.f110314e);
                }
            });
        }
        if (z13) {
            this.f117103j.a(4, new xd1() { // from class: yads.ds0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    ((oc2) obj8).onPlaybackStateChanged(ec2Var.f110314e);
                }
            });
        }
        if (z15) {
            this.f117103j.a(5, new xd1() { // from class: yads.ms0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    oc2 oc2Var = (oc2) obj8;
                    oc2Var.onPlayWhenReadyChanged(ec2Var.f110321l, i11);
                }
            });
        }
        if (ec2Var2.f110322m != ec2Var.f110322m) {
            this.f117103j.a(6, new xd1() { // from class: yads.ns0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    ((oc2) obj8).onPlaybackSuppressionReasonChanged(ec2Var.f110322m);
                }
            });
        }
        if (((ec2Var2.f110314e == 3 && ec2Var2.f110321l && ec2Var2.f110322m == 0) ? z14 : false) != ((ec2Var.f110314e == 3 && ec2Var.f110321l && ec2Var.f110322m == 0) ? z14 : false)) {
            this.f117103j.a(7, new xd1() { // from class: yads.os0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    vm0.h(ec2Var, (oc2) obj8);
                }
            });
        }
        if (!ec2Var2.f110323n.equals(ec2Var.f110323n)) {
            this.f117103j.a(12, new xd1() { // from class: yads.ps0
                @Override // yads.xd1
                public final void invoke(Object obj8) {
                    ((oc2) obj8).a(ec2Var.f110323n);
                }
            });
        }
        s();
        this.f117103j.a();
        if (ec2Var2.f110324o != ec2Var.f110324o) {
            Iterator it = this.f117104k.iterator();
            while (it.hasNext()) {
                ((sm0) ((mm0) it.next())).f115875a.t();
            }
        }
    }

    public static qf0 a(o13 o13Var) {
        return new qf0(0, o13Var.a(), o13Var.f114154d.getStreamMaxVolume(o13Var.f114157g));
    }
}
