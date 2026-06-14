package f1;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f69794f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f69795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f69796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9 f69797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f69798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r4 f69799e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f3(Context context, y base64Wrapper, h9 identity, AtomicReference sdkConfiguration, r4 openMeasurementManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        this.f69795a = context;
        this.f69796b = base64Wrapper;
        this.f69797c = identity;
        this.f69798d = sdkConfiguration;
        this.f69799e = openMeasurementManager;
    }
}
