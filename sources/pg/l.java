package pg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f98332b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f98333c = AtomicIntegerFieldUpdater.newUpdater(l.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f98334a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // pg.n
    public void a() {
        f98333c.incrementAndGet(this);
    }

    @Override // pg.n
    public boolean b() {
        return this.f98334a > 0;
    }

    @Override // pg.n
    public boolean c() {
        if (this.f98334a == 0) {
            return false;
        }
        int iDecrementAndGet = f98333c.decrementAndGet(this);
        if (iDecrementAndGet >= 0) {
            return true;
        }
        if (iDecrementAndGet == -1) {
            this.f98334a = 0;
            return false;
        }
        throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
    }
}
