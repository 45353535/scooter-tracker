package io.sentry.featureflags;

import io.sentry.g1;
import io.sentry.protocol.f;
import io.sentry.protocol.g;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f83501a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f83502b = new io.sentry.util.a();

    private d() {
    }

    public static b a() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    public g getFeatureFlags() {
        g1 g1VarD = this.f83502b.d();
        try {
            Map map = this.f83501a;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f83501a.size());
                for (Map.Entry entry : this.f83501a.entrySet()) {
                    arrayList.add(new f((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                g gVar = new g(arrayList);
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return gVar;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            return null;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m7811clone() {
        return a();
    }
}
