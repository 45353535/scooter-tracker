package sg.bigo.ads.common.h.b;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, a> f102523a = new HashMap();

    protected static void a() {
        f102523a.clear();
    }

    protected static Collection<a> b() {
        return f102523a.values();
    }

    public static a c(String str) {
        if (f102523a.containsKey(str)) {
            return f102523a.get(str);
        }
        return null;
    }

    public static void a(String str) {
        a aVarC = c(str);
        if (aVarC == null) {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
            return;
        }
        int i10 = aVarC.f102504e;
        if (i10 == h.f102518d || i10 == h.f102520f) {
            sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", "start downloadBean = ".concat(String.valueOf(aVarC)));
            return;
        }
        aVarC.f102504e = h.f102516b;
        f.a().a(aVarC.f102500a);
        g.f102514a.execute(aVarC.f102502c);
    }

    protected static void b(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            a(aVarC);
        } else {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
        }
        if (f102523a.containsKey(str)) {
            f102523a.remove(str);
        }
    }

    protected static void a(a aVar) {
        aVar.f102505f = "It's remove !!!";
        if (aVar.f102504e != h.f102520f) {
            aVar.f102504e = h.f102521g;
            f.a().a(aVar.f102500a);
        }
        f.a().b(aVar.f102500a);
        g.a(aVar.f102502c);
    }

    public static void b(a aVar) {
        if (f102523a.containsKey(aVar.f102500a)) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", " " + f102523a.keySet().size());
        f102523a.put(aVar.f102500a, aVar);
    }
}
