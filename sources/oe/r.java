package oe;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f96874a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f96875b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f96876c = true;

    public final boolean a() {
        return this.f96876c;
    }

    public final List b() {
        return this.f96875b;
    }

    public final List c() {
        return this.f96874a;
    }

    public final void d(boolean z10) {
        this.f96876c = z10;
    }

    public final void e(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f96874a.add(block);
    }
}
