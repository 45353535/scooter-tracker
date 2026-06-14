package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C5187j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5136h5 f77485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5162i5 f77486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected final Context f77487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X4 f77488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5487v4 f77489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC5007c5 f77490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    protected final C5204jm f77491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC5276mh f77492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M8 f77493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f77494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Mb f77495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC5592z9 f77496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f77497m;

    public C5187j5(Context context, X4 x42, C5487v4 c5487v4, AbstractC5007c5 abstractC5007c5, C5204jm c5204jm, InterfaceC5276mh interfaceC5276mh, ICommonExecutor iCommonExecutor, int i10, Mb mb2, InterfaceC5592z9 interfaceC5592z9) {
        this(context, x42, c5487v4, abstractC5007c5, c5204jm, interfaceC5276mh, iCommonExecutor, new M8(), i10, new C5136h5(c5487v4.f78409a), new C5162i5(context, x42), mb2, interfaceC5592z9);
    }

    public static C5062e9 c(C5058e5 c5058e5) {
        return new C5062e9(c5058e5);
    }

    public final R8 a() {
        Context context = this.f77487c;
        X4 x42 = this.f77488d;
        return new R8(new W8(context, x42), this.f77497m);
    }

    public final S6 b(C5058e5 c5058e5) {
        return new S6(c5058e5, C5112g7.a(this.f77487c).c(this.f77488d), new O6(c5058e5.c()), new C5291n7());
    }

    public final C5136h5 d() {
        return this.f77485a;
    }

    public final C5162i5 e() {
        return this.f77486b;
    }

    public final zo f() {
        zo zoVar;
        Do c5167ia;
        Co coD = C5468ua.H.D();
        X4 x42 = this.f77488d;
        synchronized (coD) {
            try {
                String strValueOf = String.valueOf(x42);
                LinkedHashMap linkedHashMap = coD.f75640b;
                Object zoVar2 = linkedHashMap.get(strValueOf);
                if (zoVar2 == null) {
                    C4991bf c4991bf = new C4991bf(C5112g7.a(coD.f75639a).b(x42));
                    if (x42.d()) {
                        String str = "appmetrica_vital_" + x42.f76663b + ".dat";
                        c5167ia = new C5289n5(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(str, new C5167ia(coD.f75639a, str)), TuplesKt.to("appmetrica_vital_main.dat", new C5167ia(coD.f75639a, "appmetrica_vital_main.dat"))}));
                    } else {
                        c5167ia = new C5167ia(coD.f75639a, "appmetrica_vital_" + x42.f76663b + ".dat");
                    }
                    zoVar2 = new zo(c4991bf, c5167ia, strValueOf);
                    linkedHashMap.put(strValueOf, zoVar2);
                }
                zoVar = (zo) zoVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zoVar;
    }

    public C5187j5(Context context, X4 x42, C5487v4 c5487v4, AbstractC5007c5 abstractC5007c5, C5204jm c5204jm, InterfaceC5276mh interfaceC5276mh, ICommonExecutor iCommonExecutor, M8 m82, int i10, C5136h5 c5136h5, C5162i5 c5162i5, Mb mb2, InterfaceC5592z9 interfaceC5592z9) {
        this.f77487c = context;
        this.f77488d = x42;
        this.f77489e = c5487v4;
        this.f77490f = abstractC5007c5;
        this.f77491g = c5204jm;
        this.f77492h = interfaceC5276mh;
        this.f77494j = iCommonExecutor;
        this.f77493i = m82;
        this.f77497m = i10;
        this.f77485a = c5136h5;
        this.f77486b = c5162i5;
        this.f77495k = mb2;
        this.f77496l = interfaceC5592z9;
    }

    public final Ok c() {
        return new Ok(this.f77487c, this.f77488d);
    }

    public final Ai d(C5058e5 c5058e5) {
        Ai ai2 = new Ai(c5058e5, this.f77490f.a(), this.f77494j);
        Mb mb2 = this.f77495k;
        synchronized (mb2) {
            mb2.f76124c.add(ai2);
        }
        return ai2;
    }

    public final Vg a(C5058e5 c5058e5) {
        return new Vg(new C5301nh(c5058e5, this.f77492h, new K3()), this.f77491g, new C5225kh(this.f77489e));
    }

    public static Wk a(C5058e5 c5058e5, zo zoVar, C5033d5 c5033d5) {
        Vk vk = new Vk(zoVar);
        return new Wk(c5058e5, vk, c5033d5, new C5319oa(c5058e5, vk, new Zk(c5058e5.h(), "foreground"), AbstractC5509w1.a(), new SystemTimeProvider()), new H2(c5058e5, vk, new Zk(c5058e5.h(), H2.f75840g), AbstractC5509w1.a(), new SystemTimeProvider()));
    }

    public static Z4 b() {
        return new Z4();
    }

    public final C5461u3 b(C4991bf c4991bf) {
        Context context = this.f77487c;
        return new C5461u3(context, c4991bf, context.getPackageName(), new SafePackageManager());
    }

    public final C5392r9 a(C4991bf c4991bf, zo zoVar, Wk wk, S6 s62, C5182j0 c5182j0, Ok ok, Ai ai2) {
        return new C5392r9(c4991bf, zoVar, wk, s62, c5182j0, this.f77493i, ok, this.f77497m, new C5110g5(ai2), new Y8(zoVar, new Z8(zoVar)), new SystemTimeProvider());
    }

    public static C5576yi a(C5058e5 c5058e5, C5062e9 c5062e9) {
        return new C5576yi(c5062e9, c5058e5);
    }

    public InterfaceC5542x9 a(C9 c92, S6 s62, Vg vg2, C5487v4 c5487v4, X4 x42, C4991bf c4991bf) {
        return this.f77496l.a(c92, s62, vg2, c5487v4, x42, c4991bf).a();
    }

    public final C5535x2 a(C4991bf c4991bf) {
        return new C5535x2(this.f77488d, c4991bf);
    }
}
