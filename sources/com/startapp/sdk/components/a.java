package com.startapp.sdk.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.room.FtsOptions;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.startapp.sdk.adsbase.n;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import com.startapp.sdk.internal.a4;
import com.startapp.sdk.internal.a5;
import com.startapp.sdk.internal.a6;
import com.startapp.sdk.internal.al;
import com.startapp.sdk.internal.b4;
import com.startapp.sdk.internal.b5;
import com.startapp.sdk.internal.b6;
import com.startapp.sdk.internal.d5;
import com.startapp.sdk.internal.e4;
import com.startapp.sdk.internal.e5;
import com.startapp.sdk.internal.f5;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.gc;
import com.startapp.sdk.internal.h4;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.i5;
import com.startapp.sdk.internal.j3;
import com.startapp.sdk.internal.j5;
import com.startapp.sdk.internal.k4;
import com.startapp.sdk.internal.k7;
import com.startapp.sdk.internal.kb;
import com.startapp.sdk.internal.l3;
import com.startapp.sdk.internal.l5;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.m4;
import com.startapp.sdk.internal.n3;
import com.startapp.sdk.internal.o4;
import com.startapp.sdk.internal.o5;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.p3;
import com.startapp.sdk.internal.p4;
import com.startapp.sdk.internal.p5;
import com.startapp.sdk.internal.q3;
import com.startapp.sdk.internal.r3;
import com.startapp.sdk.internal.r4;
import com.startapp.sdk.internal.r5;
import com.startapp.sdk.internal.s3;
import com.startapp.sdk.internal.t3;
import com.startapp.sdk.internal.t5;
import com.startapp.sdk.internal.tk;
import com.startapp.sdk.internal.u4;
import com.startapp.sdk.internal.u5;
import com.startapp.sdk.internal.v3;
import com.startapp.sdk.internal.v4;
import com.startapp.sdk.internal.v5;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.w3;
import com.startapp.sdk.internal.w4;
import com.startapp.sdk.internal.w5;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.x4;
import com.startapp.sdk.internal.x5;
import com.startapp.sdk.internal.xk;
import com.startapp.sdk.internal.y4;
import com.startapp.sdk.internal.y5;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.yk;
import com.startapp.sdk.internal.z4;
import com.startapp.sdk.internal.z5;
import com.startapp.sdk.internal.z6;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static final w3 U = new w3();
    public final lb A;
    public final lb B;
    public final lb C;
    public final lb D;
    public final lb E;
    public final lb F;
    public final lb G;
    public final lb H;
    public final lb I;
    public final lb J;
    public final lb K;
    public final lb L;
    public final lb M;
    public final lb N;
    public final lb O;
    public final lb P;
    public final lb Q;
    public final lb R;
    public final lb S;
    public final lb T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f64174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f64176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb f64177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f64178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb f64179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb f64180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f64181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f64182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f64183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lb f64184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lb f64185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lb f64186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lb f64187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lb f64188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lb f64189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lb f64190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lb f64191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lb f64192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lb f64193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final lb f64194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final lb f64195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lb f64196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final lb f64197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final lb f64198y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final lb f64199z;

    public a(final Context context) {
        this.L = new lb(new v4(context));
        this.f64174a = new lb(new j5(this, context));
        this.f64175b = new lb(new k7() { // from class: com.startapp.sdk.components.f
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return this.f64202a.e(context);
            }
        });
        this.f64176c = new lb(new w5(this, context));
        lb lbVar = new lb(new x5());
        lb lbVar2 = new lb(new y5());
        this.f64177d = new lb(new z5(context));
        this.f64178e = new lb(new a6(context));
        b6 b6Var = new b6();
        this.f64179f = new lb(new j3(this, context, b6Var));
        this.f64180g = new lb(new l3(this, context, b6Var));
        this.f64181h = new lb(new n3(context));
        this.f64182i = new lb(new p3(context));
        this.f64183j = new lb(new q3(this, context));
        this.f64184k = new lb(new r3(context));
        this.f64185l = new lb(new s3());
        new Exception();
        this.f64186m = new lb(new t3(context));
        this.f64187n = new lb(new v3(this));
        this.f64188o = new lb(new a4(context));
        this.f64189p = new lb(new b4(context));
        this.f64190q = new lb(new e4(this, context, lbVar));
        this.f64191r = new lb(new h4(this, context));
        this.f64192s = new lb(new k4(this, context));
        this.f64193t = new lb(new m4(context));
        this.f64194u = new lb(new o4(this, context));
        this.f64195v = new lb(new p4(context));
        this.f64196w = new lb(new r4(context));
        this.f64197x = new lb(new u4(this, context));
        this.f64198y = new lb(new w4());
        this.f64199z = new lb(new k7() { // from class: com.startapp.sdk.components.g
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return a.c();
            }
        });
        this.A = lbVar2;
        this.B = lbVar2;
        this.C = lbVar2;
        this.D = new lb(new x4());
        this.E = new lb(new y4());
        this.F = new lb(new z4());
        this.G = new lb(new a5(context));
        this.H = new lb(new b5(context));
        this.I = new lb(new d5(context));
        this.J = new lb(new e5(context));
        this.K = new lb(new k7() { // from class: com.startapp.sdk.components.h
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return this.f64204a.e();
            }
        });
        this.M = new lb(new k7() { // from class: com.startapp.sdk.components.i
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return this.f64205a.c(context);
            }
        });
        this.N = new lb(new f5(this, context));
        this.O = new lb(new i5());
        this.P = new lb(new l5(this, context));
        this.Q = new lb(new o5());
        this.R = new lb(new p5(this));
        this.S = new lb(new r5(this, context));
        this.T = new lb(new t5(this, context));
    }

    public static /* synthetic */ WvfMetadata a(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static /* synthetic */ WvfMetadata b(WvfMetadata wvfMetadata) {
        return wvfMetadata;
    }

    public static ScheduledExecutorService c() {
        return Executors.newScheduledThreadPool(0, new v5("scheduled"));
    }

    public static /* synthetic */ vf d(Context context) {
        return new vf(context.getSharedPreferences("StartApp-fb8245cb9af2e955", 0));
    }

    public final tk e(final Context context) {
        final WvfMetadata wvfMetadataE0 = MetaData.E().e0();
        WeightedChoice weightedChoiceC = wvfMetadataE0 != null ? wvfMetadataE0.c() : null;
        String strA = weightedChoiceC != null ? weightedChoiceC.a() : null;
        return FtsOptions.TOKENIZER_SIMPLE.equals(strA) ? new yk(context) : POBAdDescriptor.DYNAMIC_PRICE_BID.equals(strA) ? new xk(context, this.D, this.F, new lb(new k7() { // from class: com.startapp.sdk.components.j
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return a.a();
            }
        }), new k7() { // from class: com.startapp.sdk.components.k
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return a.a(wvfMetadataE0);
            }
        }) : new al(context, new lb(new k7() { // from class: com.startapp.sdk.components.l
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return a.d(context);
            }
        }), this.D, this.F, new lb(new k7() { // from class: com.startapp.sdk.components.m
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return a.b();
            }
        }), new k7() { // from class: com.startapp.sdk.components.c
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return a.b(wvfMetadataE0);
            }
        }, new n());
    }

    public static a a(Context context) {
        a aVar;
        w3 w3Var = U;
        a aVar2 = w3Var.f65426a;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (w3Var) {
            try {
                aVar = w3Var.f65426a;
                if (aVar == null) {
                    Context contextA = x0.a(context);
                    if (contextA != null) {
                        context = contextA;
                    }
                    aVar = new a(context);
                    w3Var.f65426a = aVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static /* synthetic */ gc b() {
        return new gc(Looper.getMainLooper());
    }

    public static /* synthetic */ SharedPreferences b(Context context) {
        return new vf(context.getSharedPreferences("StartApp-3389de2c2d518660", 0));
    }

    public final p c(final Context context) {
        return new p(context, new lb(new k7() { // from class: com.startapp.sdk.components.d
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return a.b(context);
            }
        }), this.G, this.C, this.K, this.f64183j, this.R, this.N, this.f64175b, this.f64186m, this.f64187n, this.A, this.f64196w, this.f64176c);
    }

    public static /* synthetic */ gc a() {
        return new gc(Looper.getMainLooper());
    }

    public static Unit a(String str, String str2) {
        g9 g9Var = new g9(h9.f64609d);
        g9Var.f64553d = "EVT";
        g9Var.f64558i = str;
        g9Var.f64554e = str2;
        g9Var.a();
        return Unit.f93236a;
    }

    public final y6 e() {
        return new z6(new n(), new kb(new k7() { // from class: com.startapp.sdk.components.b
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return MetaData.E().t();
            }
        }), this.D, new Function2() { // from class: com.startapp.sdk.components.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return a.a((String) obj, (String) obj2);
            }
        });
    }

    public static ThreadPoolExecutor a(String str, int i10, long j10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i10, j10, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() { // from class: com.startapp.sdk.components.ComponentLocator$45
            @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
            public final boolean offer(Object obj) {
                return tryTransfer((Runnable) obj);
            }
        }, new v5(str), new u5());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
