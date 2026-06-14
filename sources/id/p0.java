package id;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f74594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f74595b;

    public p0(String name, Map map) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f74594a = name;
        this.f74595b = map;
    }

    public final String a() {
        return this.f74594a;
    }

    public final Map b() {
        return this.f74595b;
    }
}
