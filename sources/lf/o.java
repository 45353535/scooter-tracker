package lf;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class o implements Lazy, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f94214e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f94215f = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Function0 f94216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f94217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f94218d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f94216b = initializer;
        x xVar = x.f94237a;
        this.f94217c = xVar;
        this.f94218d = xVar;
    }

    private final Object writeReplace() {
        return new f(getValue());
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this.f94217c;
        x xVar = x.f94237a;
        if (obj != xVar) {
            return obj;
        }
        Function0 function0 = this.f94216b;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            if (androidx.concurrent.futures.a.a(f94215f, this, xVar, objInvoke)) {
                this.f94216b = null;
                return objInvoke;
            }
        }
        return this.f94217c;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f94217c != x.f94237a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
