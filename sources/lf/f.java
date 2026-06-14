package lf;

import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Lazy, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f94208b;

    public f(Object obj) {
        this.f94208b = obj;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        return this.f94208b;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
