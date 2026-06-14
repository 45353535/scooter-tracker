package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vs1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static vs1 f117164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f117165c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f117166a = new ArrayDeque();

    public final void a() {
        synchronized (f117165c) {
            this.f117166a.clear();
            Unit unit = Unit.f93236a;
        }
    }

    public final List b() {
        List list;
        synchronized (f117165c) {
            list = CollectionsKt.toList(this.f117166a);
        }
        return list;
    }
}
