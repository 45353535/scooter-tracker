package yads;

import com.ironsource.N6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class yb implements ab2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl2 f118130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118131b;

    public yb(yl2 yl2Var, String str) {
        this.f118130a = yl2Var;
        this.f118131b = str;
    }

    @Override // yads.ab2
    public final Map a(long j10) {
        Map mapEmptyMap = MapsKt.emptyMap();
        if (!kotlin.jvm.internal.b1.q(mapEmptyMap)) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap == null) {
            mapEmptyMap = new LinkedHashMap();
        }
        String str = this.f118131b;
        if (str == null) {
            mapEmptyMap.put(N6.G1, "undefined");
        } else {
            mapEmptyMap.put(N6.G1, str);
        }
        String str2 = this.f118130a.f118289b;
        if (str2 == null) {
            mapEmptyMap.put("status", "undefined");
        } else {
            mapEmptyMap.put("status", str2);
        }
        mapEmptyMap.put("duration", Long.valueOf(j10));
        return mapEmptyMap;
    }
}
