package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f116876a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za2 f116877b = new za2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f116878c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f116879d = new ArrayList();

    public final void a() {
        synchronized (this.f116876a) {
            this.f116878c.clear();
            this.f116879d.clear();
            Unit unit = Unit.f93236a;
        }
    }

    public final void b(u5 u5Var) {
        a(u5Var, null);
    }

    public final void a(u5 u5Var) {
        a(u5Var, this.f116877b, null);
    }

    public final void a(u5 u5Var, ab2 ab2Var, ea3 ea3Var) {
        Long l10;
        synchronized (this.f116876a) {
            try {
                Map map = (Map) this.f116878c.get(u5Var);
                Long lValueOf = (map == null || (l10 = (Long) map.get(ea3Var)) == null) ? null : Long.valueOf(SystemClock.elapsedRealtime() - l10.longValue());
                if (lValueOf != null) {
                    this.f116879d.add(new t5(u5Var, ab2Var.a(lValueOf.longValue())));
                }
                Map map2 = (Map) this.f116878c.get(u5Var);
                if (map2 != null) {
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(u5 u5Var, ea3 ea3Var) {
        synchronized (this.f116876a) {
            try {
                Map linkedHashMap = (Map) this.f116878c.get(u5Var);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                this.f116878c.put(u5Var, linkedHashMap);
                linkedHashMap.put(ea3Var, Long.valueOf(SystemClock.elapsedRealtime()));
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
