package yads;

import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f112365a;

    public jj2(Map map) {
        this.f112365a = MapsKt.toMutableMap(map);
    }

    public final void a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        this.f112365a.put(str, str2);
    }
}
