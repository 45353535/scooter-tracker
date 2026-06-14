package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class B0 extends G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4441n0 f40415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4304f0 f40416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f40417c;

    public /* synthetic */ B0(C4441n0 c4441n0, C4304f0 c4304f0, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4441n0, c4304f0, (i10 & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.C0
    @NotNull
    public Map<String, Object> a(@Nullable A0 a02) {
        Map<String, Object> mapA = a(this.f40416b);
        mapA.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", Integer.valueOf(this.f40415a.f()));
        String str = this.f40417c;
        if (str != null) {
            mapA.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }

    public B0(@NotNull C4441n0 adTools, @NotNull C4304f0 adProperties, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f40415a = adTools;
        this.f40416b = adProperties;
        this.f40417c = str;
    }
}
