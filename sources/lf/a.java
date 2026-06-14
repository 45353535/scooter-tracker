package lf;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function3 f94205a;

    public a(Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f94205a = block;
    }

    public final Function3 a() {
        return this.f94205a;
    }
}
