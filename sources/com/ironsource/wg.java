package com.ironsource;

import com.ironsource.AbstractC4478p3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class wg<Smash extends AbstractC4478p3<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final xg<Smash> f45800a;

    public wg(@NotNull xg<Smash> smashPicker) {
        Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.f45800a = smashPicker;
    }

    @NotNull
    public final List<Smash> a() {
        return this.f45800a.c();
    }

    public final boolean b() {
        return this.f45800a.c().isEmpty() && this.f45800a.a().isEmpty();
    }

    public final boolean c() {
        return this.f45800a.d() == 0;
    }
}
