package yads;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class z13 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile z13 f118512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f118513c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f118514a = new LinkedHashMap();

    public final void a(tc1 tc1Var, Object obj) {
        synchronized (f118513c) {
            Set set = (Set) this.f118514a.get(tc1Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(tc1 tc1Var, Object obj) {
        synchronized (f118513c) {
            try {
                Set linkedHashSet = (Set) this.f118514a.get(tc1Var);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f118514a.put(tc1Var, linkedHashSet);
                }
                linkedHashSet.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
