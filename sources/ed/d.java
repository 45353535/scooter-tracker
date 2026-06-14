package ed;

import ed.a;
import ic.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pd.z;

/* JADX INFO: loaded from: classes3.dex */
public class d implements ed.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f69070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f69071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f69072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f69073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f69074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f69075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f69076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f69077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f69078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f69079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f69080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f69081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f69082m;

    public static final class a implements a.b {
        a() {
        }

        @Override // ed.a.b
        public void a(ed.a source, a.EnumC0868a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            v.g(d.this.f69070a, "Event: " + event, new Object[0]);
        }
    }

    public d(String parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f69070a = new z("DefaultAdState(" + parent + ')');
        this.f69071b = new AtomicBoolean(false);
        this.f69072c = new AtomicBoolean(false);
        this.f69073d = new AtomicBoolean(false);
        this.f69074e = new AtomicBoolean(false);
        this.f69075f = new AtomicBoolean(false);
        this.f69076g = new AtomicBoolean(false);
        this.f69077h = new AtomicBoolean(false);
        this.f69078i = new AtomicBoolean(false);
        this.f69079j = new AtomicBoolean(false);
        this.f69080k = new AtomicBoolean(false);
        this.f69081l = new AtomicBoolean(false);
        this.f69082m = new LinkedHashSet();
        a(new a());
    }

    @Override // ed.a
    public final void a(a.b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (h()) {
            return;
        }
        synchronized (this.f69082m) {
            this.f69082m.add(observer);
        }
    }

    @Override // ed.a
    public boolean b() {
        return this.f69071b.get() && !h();
    }

    @Override // ed.a
    public boolean d() {
        return this.f69073d.get();
    }

    @Override // ed.a
    public boolean e() {
        boolean zCompareAndSet = this.f69078i.compareAndSet(false, true);
        if (zCompareAndSet) {
            d(a.EnumC0868a.Clicked);
        }
        return zCompareAndSet;
    }

    @Override // ed.a
    public boolean f() {
        boolean zCompareAndSet = this.f69077h.compareAndSet(false, true);
        if (zCompareAndSet) {
            d(a.EnumC0868a.FailedToShow);
        }
        return zCompareAndSet;
    }

    @Override // ed.a
    public boolean g() {
        return this.f69079j.get();
    }

    @Override // ed.a
    public boolean h() {
        return this.f69074e.get();
    }

    @Override // ed.a
    public boolean i() {
        boolean zCompareAndSet = this.f69076g.compareAndSet(false, true);
        if (zCompareAndSet) {
            d(a.EnumC0868a.Shown);
        }
        return zCompareAndSet;
    }

    @Override // ed.a
    public boolean j() {
        boolean zCompareAndSet = this.f69079j.compareAndSet(false, true);
        if (zCompareAndSet) {
            d(a.EnumC0868a.Finished);
        }
        return zCompareAndSet;
    }

    @Override // ed.a
    public boolean k() {
        boolean zCompareAndSet = this.f69081l.compareAndSet(false, true);
        if (zCompareAndSet) {
            d(a.EnumC0868a.Expired);
        }
        return zCompareAndSet;
    }

    @Override // ed.a
    public void l() {
        this.f69073d.set(true);
        d(a.EnumC0868a.ShowInitiated);
    }

    @Override // ed.a
    public boolean m() {
        return this.f69076g.get();
    }

    private final void d(a.EnumC0868a enumC0868a) {
        synchronized (this.f69082m) {
            try {
                Iterator it = this.f69082m.iterator();
                while (it.hasNext()) {
                    ((a.b) it.next()).a(this, enumC0868a);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ed.a
    public final void b(a.b observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f69082m) {
            this.f69082m.remove(observer);
        }
    }

    @Override // ed.a
    public boolean c() {
        boolean zCompareAndSet = this.f69072c.compareAndSet(false, true);
        if (zCompareAndSet) {
            d(a.EnumC0868a.LoadingStarted);
        }
        return zCompareAndSet;
    }

    @Override // ed.a
    public boolean a(boolean z10) {
        boolean z11 = false;
        this.f69072c.set(false);
        this.f69071b.set(z10);
        if (this.f69075f.compareAndSet(false, true) && !h()) {
            z11 = true;
        }
        if (z11) {
            d(z10 ? a.EnumC0868a.Loaded : a.EnumC0868a.FailedToLoad);
        }
        return z11;
    }

    @Override // ed.a
    public boolean b(boolean z10) {
        boolean zCompareAndSet = this.f69080k.compareAndSet(!z10, z10);
        if (zCompareAndSet) {
            d(z10 ? a.EnumC0868a.Appeared : a.EnumC0868a.Disappeared);
        }
        return zCompareAndSet;
    }

    @Override // ed.a
    public void a() {
        this.f69074e.set(true);
        this.f69071b.set(false);
        this.f69072c.set(false);
        this.f69073d.set(false);
        this.f69075f.set(false);
        this.f69076g.set(false);
        this.f69077h.set(false);
        this.f69078i.set(false);
        this.f69079j.set(false);
        this.f69080k.set(false);
        this.f69081l.set(false);
        d(a.EnumC0868a.Destroyed);
        synchronized (this.f69082m) {
            this.f69082m.clear();
            Unit unit = Unit.f93236a;
        }
    }
}
