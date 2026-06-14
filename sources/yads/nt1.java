package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nt1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static nt1 f114026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f114027c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f114028a = new ArrayDeque();

    public final void a(ps1 ps1Var, String str, String str2) {
        if (qs1.f115144a.a()) {
            lt1 lt1Var = new lt1(System.currentTimeMillis(), ps1Var.name(), str, str2);
            synchronized (f114027c) {
                try {
                    if (this.f114028a.size() > 5000) {
                        this.f114028a.removeFirst();
                    }
                    this.f114028a.add(lt1Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final List b() {
        List list;
        synchronized (f114027c) {
            list = CollectionsKt.toList(this.f114028a);
        }
        return list;
    }

    public final void a() {
        synchronized (f114027c) {
            this.f114028a.clear();
            Unit unit = Unit.f93236a;
        }
    }
}
