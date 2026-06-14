package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes9.dex */
public final class aj implements an {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f28777c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile an f28778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f28779b = f28777c;

    private aj(an anVar) {
        this.f28778a = anVar;
    }

    public static an b(an anVar) {
        return anVar instanceof aj ? anVar : new aj(anVar);
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        Object objA;
        Object obj = this.f28779b;
        Object obj2 = f28777c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f28779b;
                if (objA == obj2) {
                    objA = this.f28778a.a();
                    Object obj3 = this.f28779b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f28779b = objA;
                    this.f28778a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
