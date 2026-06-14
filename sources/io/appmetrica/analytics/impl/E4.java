package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class E4 implements La, Ul, Na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X4 f75710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Em f75711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Eh f75712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L4 f75713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5332on f75714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f75715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y4 f75716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5375qg f75717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4980b4 f75718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5499vg f75719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f75720l;

    public E4(@NonNull Context context, @NonNull Ll ll, @NonNull X4 x42, @NonNull C5512w4 c5512w4, @NonNull C5375qg c5375qg) {
        this(context, ll, x42, c5512w4, new Eh(c5512w4.f78481b), c5375qg, new Y4(), new G4(), new C5499vg());
    }

    public static void b(C5512w4 c5512w4) {
        C5468ua.H.c().b(!Boolean.FALSE.equals(c5512w4.f78481b.f78422n));
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a(@NonNull C5487v4 c5487v4) {
        Eh eh2 = this.f75712d;
        eh2.f75740a = eh2.f75740a.mergeFrom(c5487v4);
    }

    @Override // io.appmetrica.analytics.impl.La
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final C5487v4 d() {
        return this.f75712d.f75740a;
    }

    @NonNull
    public final C5375qg e() {
        return this.f75717i;
    }

    @Override // io.appmetrica.analytics.impl.La
    @NonNull
    public final Context getContext() {
        return this.f75709a;
    }

    public E4(Context context, Ll ll, X4 x42, C5512w4 c5512w4, Eh eh2, C5375qg c5375qg, Y4 y42, G4 g42, C5499vg c5499vg) {
        this.f75715g = new ArrayList();
        this.f75720l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f75709a = applicationContext;
        this.f75710b = x42;
        this.f75712d = eh2;
        this.f75716h = y42;
        this.f75713e = G4.a(this);
        b(c5512w4);
        Em emA = ll.a(applicationContext, x42, c5512w4.f78480a);
        this.f75711c = emA;
        this.f75718j = AbstractC5006c4.a(emA, C5468ua.k().c());
        this.f75714f = g42.a(this, emA);
        this.f75717i = c5375qg;
        this.f75719k = c5499vg;
        ll.a(x42, this);
    }

    public final synchronized void a(@NonNull B4 b42) {
        this.f75716h.f76689a.add(b42);
        I6.a(b42.f75571c, this.f75718j.a(Jm.a(this.f75711c.e().f77551l)));
    }

    public final synchronized void b(@NonNull B4 b42) {
        this.f75716h.f76689a.remove(b42);
    }

    @Override // io.appmetrica.analytics.impl.La
    @NonNull
    public final X4 b() {
        return this.f75710b;
    }

    public final void a(@NonNull W5 w52, @NonNull B4 b42) {
        L4 l42 = this.f75713e;
        l42.getClass();
        l42.a(w52, new K4(b42));
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(@NonNull Nl nl, @Nullable C5204jm c5204jm) {
        synchronized (this.f75720l) {
            try {
                for (C5064eb c5064eb : this.f75715g) {
                    I6.a(c5064eb.f77103a, nl, this.f75718j.a(c5064eb.f77105c));
                }
                this.f75715g.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(@NonNull C5204jm c5204jm) {
        synchronized (this.f75720l) {
            try {
                for (B4 b42 : this.f75716h.f76689a) {
                    I6.a(b42.f75571c, this.f75718j.a(Jm.a(c5204jm.f77551l)));
                }
                ArrayList arrayList = new ArrayList();
                for (C5064eb c5064eb : this.f75715g) {
                    if (AbstractC5127gm.a(c5204jm, c5064eb.f77104b, c5064eb.f77105c, new C5013cb())) {
                        I6.a(c5064eb.f77103a, this.f75718j.a(c5064eb.f77105c));
                    } else {
                        arrayList.add(c5064eb);
                    }
                }
                this.f75715g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f75714f.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(@Nullable C5064eb c5064eb) {
        ResultReceiver resultReceiver;
        HashMap map;
        List<String> list;
        HashMap map2 = new HashMap();
        if (c5064eb != null) {
            list = c5064eb.f77104b;
            resultReceiver = c5064eb.f77103a;
            map = c5064eb.f77105c;
        } else {
            resultReceiver = null;
            map = map2;
            list = null;
        }
        boolean zA = this.f75711c.a(list, map);
        if (!zA) {
            I6.a(resultReceiver, this.f75718j.a(map));
        }
        if (!this.f75711c.g()) {
            if (zA) {
                I6.a(resultReceiver, this.f75718j.a(map));
                return;
            }
            return;
        }
        synchronized (this.f75720l) {
            if (zA && c5064eb != null) {
                try {
                    this.f75715g.add(c5064eb);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f75714f.c();
    }

    public final void a(@Nullable ResultReceiver resultReceiver) {
        this.f75719k.a(new D4(resultReceiver));
    }

    @NonNull
    public final C4980b4 a() {
        return this.f75718j;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(@NonNull C5512w4 c5512w4) {
        this.f75711c.a(c5512w4.f78480a);
        a(c5512w4.f78481b);
    }
}
