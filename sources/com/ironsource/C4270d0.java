package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4270d0 implements InterfaceC4287e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42848b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f42849c = "ext_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f42850a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.d0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC4287e0
    @NotNull
    public Map<String, String> a() {
        return this.f42850a;
    }

    @Override // com.ironsource.InterfaceC4287e0
    public void b(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42850a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC4287e0
    public void a(@NotNull HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f42850a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC4287e0
    public void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42850a.put(key, value);
    }
}
