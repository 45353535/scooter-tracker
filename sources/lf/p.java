package lf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class p implements Lazy, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Function0 f94219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f94220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f94221d;

    public p(Function0 initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f94219b = initializer;
        this.f94220c = x.f94237a;
        this.f94221d = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new f(getValue());
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f94220c;
        x xVar = x.f94237a;
        if (obj != xVar) {
            return obj;
        }
        synchronized (this.f94221d) {
            objInvoke = this.f94220c;
            if (objInvoke == xVar) {
                Function0 function0 = this.f94219b;
                Intrinsics.checkNotNull(function0);
                objInvoke = function0.invoke();
                this.f94220c = objInvoke;
                this.f94219b = null;
            }
        }
        return objInvoke;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f94220c != x.f94237a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(Function0 function0, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i10 & 2) != 0 ? null : obj);
    }
}
