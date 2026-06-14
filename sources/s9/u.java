package s9;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f99891a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f99892b;

    public synchronized Map a() {
        try {
            if (this.f99892b == null) {
                this.f99892b = DesugarCollections.unmodifiableMap(new HashMap(this.f99891a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f99892b;
    }
}
