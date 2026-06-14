package lf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Lazy, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Function0 f94206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f94207c;

    public b0(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f94206b = initializer;
        this.f94207c = x.f94237a;
    }

    private final Object writeReplace() {
        return new f(getValue());
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        if (this.f94207c == x.f94237a) {
            Function0 function0 = this.f94206b;
            Intrinsics.checkNotNull(function0);
            this.f94207c = function0.invoke();
            this.f94206b = null;
        }
        return this.f94207c;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f94207c != x.f94237a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
