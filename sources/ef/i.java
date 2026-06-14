package ef;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69111a;

    public i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f69111a = name;
    }

    public final String a() {
        return this.f69111a;
    }

    public String toString() {
        return "Phase('" + this.f69111a + "')";
    }
}
