package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4384jd implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43422a;

    public C4384jd(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f43422a = placementName;
    }

    @Override // com.ironsource.C0
    @NotNull
    public Map<String, Object> a(@Nullable A0 a02) {
        HashMap map = new HashMap();
        map.put("placement", this.f43422a);
        return map;
    }
}
