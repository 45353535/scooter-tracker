package yads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class ad0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc0 f108638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f108639b = new AtomicBoolean(false);

    public ad0(zc0 zc0Var) {
        this.f108638a = zc0Var;
    }

    public final xo0 a(Object... objArr) {
        Constructor constructorA;
        synchronized (this.f108639b) {
            if (!this.f108639b.get()) {
                try {
                    constructorA = this.f108638a.a();
                } catch (ClassNotFoundException unused) {
                    this.f108639b.set(true);
                    constructorA = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (xo0) constructorA.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }
}
