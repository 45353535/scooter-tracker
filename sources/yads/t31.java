package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class t31 extends b0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f116043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f116044c;

    public t31(Object obj, Object obj2) {
        this.f116043b = obj;
        this.f116044c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f116043b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f116044c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
