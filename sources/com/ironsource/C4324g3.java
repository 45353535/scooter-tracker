package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4324g3 extends AbstractC4545t3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4324g3(int i10, @NotNull String placementName, boolean z10, @Nullable C4300ed c4300ed) {
        super(i10, placementName, z10, c4300ed);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC4545t3
    @NotNull
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
