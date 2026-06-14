package yads;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f112556b = new j2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k2 f112557c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f112558a = new LinkedHashMap();

    public k2() {
        a("window_type_browser", new u1());
        a("window_type_activity_result", new n2());
    }

    public final synchronized void a(String str, i2 i2Var) {
        if (!this.f112558a.containsKey(str)) {
            this.f112558a.put(str, i2Var);
        }
    }
}
