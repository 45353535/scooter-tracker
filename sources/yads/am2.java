package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class am2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f108722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f108723b;

    public /* synthetic */ am2(Map map, int i10) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map, (c) null);
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f108722a.put(str, obj);
        }
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.f108722a.put(str, "undefined");
        } else {
            this.f108722a.put(str, obj);
        }
    }

    public am2(Map map, c cVar) {
        map = kotlin.jvm.internal.b1.q(map) ? map : null;
        this.f108722a = map == null ? new LinkedHashMap() : map;
        this.f108723b = cVar;
    }
}
