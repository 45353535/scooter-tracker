package c0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.e;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements ComponentCallbacks2, e.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f6456g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f6458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x.e f6459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f6460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f6461f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public s(o.g gVar, Context context, boolean z10) {
        x.e cVar;
        this.f6457b = context;
        this.f6458c = new WeakReference(gVar);
        if (z10) {
            gVar.h();
            cVar = x.f.a(context, this, null);
        } else {
            cVar = new x.c();
        }
        this.f6459d = cVar;
        this.f6460e = cVar.a();
        this.f6461f = new AtomicBoolean(false);
    }

    @Override // x.e.a
    public void a(boolean z10) {
        Unit unit;
        o.g gVar = (o.g) this.f6458c.get();
        if (gVar != null) {
            gVar.h();
            this.f6460e = z10;
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            d();
        }
    }

    public final boolean b() {
        return this.f6460e;
    }

    public final void c() {
        this.f6457b.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this.f6461f.getAndSet(true)) {
            return;
        }
        this.f6457b.unregisterComponentCallbacks(this);
        this.f6459d.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (((o.g) this.f6458c.get()) == null) {
            d();
            Unit unit = Unit.f93236a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        Unit unit;
        o.g gVar = (o.g) this.f6458c.get();
        if (gVar != null) {
            gVar.h();
            gVar.l(i10);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            d();
        }
    }
}
