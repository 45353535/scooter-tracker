package yads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f110129a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f110130b;

    public final synchronized Map a() {
        try {
            if (this.f110130b == null) {
                this.f110130b = DesugarCollections.unmodifiableMap(new HashMap(this.f110129a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f110130b;
    }
}
