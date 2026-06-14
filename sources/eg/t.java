package eg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f69172b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f69173a;

    public t(Throwable th2, boolean z10) {
        this.f69173a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f69172b.get(this) == 1;
    }

    public final boolean c() {
        return f69172b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return h0.a(this) + '[' + this.f69173a + ']';
    }

    public /* synthetic */ t(Throwable th2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
