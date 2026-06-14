package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f117590a = new v5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za2 f117591b = new za2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u5 f117592c = u5.A;

    public final Long a() {
        List list;
        Object next;
        v5 v5Var = this.f117590a;
        synchronized (v5Var.f116876a) {
            list = CollectionsKt.toList(v5Var.f116879d);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((t5) next).f116068a == this.f117592c) {
                break;
            }
        }
        t5 t5Var = (t5) next;
        if (t5Var == null) {
            return null;
        }
        Object obj = t5Var.f116069b.get("duration");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }
}
