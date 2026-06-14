package io.sentry;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f83594h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f83595a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f83596b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f83597c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f83598d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f83599e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f83600f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d4 f83601g = null;

    static {
        HashMap map = new HashMap();
        f83594h = map;
        map.put(TypedValues.Custom.S_BOOLEAN, Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put(Constants.LONG, Long.class);
        map.put(TypedValues.Custom.S_FLOAT, Float.class);
        map.put("double", Double.class);
    }

    private boolean j(Object obj, Class cls) {
        Class cls2 = (Class) f83594h.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public void a(List list) {
        if (list != null) {
            this.f83596b.addAll(list);
        }
    }

    public void b() {
        g1 g1VarD = this.f83597c.d();
        try {
            Iterator it = this.f83595a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
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

    public Object c(String str) {
        g1 g1VarD = this.f83597c.d();
        try {
            Object obj = this.f83595a.get(str);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return obj;
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

    public Object d(String str, Class cls) {
        g1 g1VarD = this.f83597c.d();
        try {
            Object obj = this.f83595a.get(str);
            if (cls.isInstance(obj)) {
                if (g1VarD != null) {
                    g1VarD.close();
                    return obj;
                }
            } else {
                if (!j(obj, cls)) {
                    if (g1VarD != null) {
                        g1VarD.close();
                    }
                    return null;
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            }
            return obj;
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

    public List e() {
        return new ArrayList(this.f83596b);
    }

    public d4 f() {
        return this.f83601g;
    }

    public b g() {
        return this.f83598d;
    }

    public b h() {
        return this.f83600f;
    }

    public b i() {
        return this.f83599e;
    }

    public void k(String str, Object obj) {
        g1 g1VarD = this.f83597c.d();
        try {
            this.f83595a.put(str, obj);
            if (g1VarD != null) {
                g1VarD.close();
            }
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

    public void l(d4 d4Var) {
        this.f83601g = d4Var;
    }

    public void m(b bVar) {
        this.f83598d = bVar;
    }

    public void n(b bVar) {
        this.f83600f = bVar;
    }

    public void o(b bVar) {
        this.f83599e = bVar;
    }
}
