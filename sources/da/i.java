package da;

import android.content.Context;
import com.google.common.base.Supplier;
import da.b;
import da.e0;
import da.n;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements n.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f68522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Supplier f68523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Supplier f68524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f68526f;

    public i() {
        this.f68525e = 0;
        this.f68526f = false;
        this.f68522b = null;
        this.f68523c = null;
        this.f68524d = null;
    }

    private boolean b() {
        int i10 = o0.f98837a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f68522b;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // da.n.b
    public n a(n.a aVar) {
        int i10;
        Supplier supplier;
        if (o0.f98837a < 23 || !((i10 = this.f68525e) == 1 || (i10 == 0 && b()))) {
            return new e0.b().a(aVar);
        }
        int iK = n9.w.k(aVar.f68534c.f80561o);
        q9.u.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + o0.t0(iK));
        Supplier supplier2 = this.f68523c;
        b.C0854b c0854b = (supplier2 == null || (supplier = this.f68524d) == null) ? new b.C0854b(iK) : new b.C0854b(supplier2, supplier);
        c0854b.e(this.f68526f);
        return c0854b.a(aVar);
    }

    public i(Context context) {
        this(context, null, null);
    }

    public i(Context context, Supplier supplier, Supplier supplier2) {
        this.f68522b = context;
        this.f68525e = 0;
        this.f68526f = false;
        this.f68523c = supplier;
        this.f68524d = supplier2;
    }
}
