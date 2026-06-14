package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4305f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final We f43074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T7 f43075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f43076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f43077d;

    public C4305f1(@NotNull We recordType, @NotNull T7 adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f43074a = recordType;
        this.f43075b = adProvider;
        this.f43076c = adInstanceId;
        this.f43077d = Calendar.getInstance().getTimeInMillis() / ((long) 1000);
    }

    @NotNull
    public final String a() {
        return this.f43076c;
    }

    @NotNull
    public final T7 b() {
        return this.f43075b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return MapsKt.mapOf(TuplesKt.to(C4569ua.f45542c, Integer.valueOf(this.f43075b.b())), TuplesKt.to("ts", String.valueOf(this.f43077d)));
    }

    @NotNull
    public final Map<String, Object> d() {
        return MapsKt.mapOf(TuplesKt.to("aid", this.f43076c), TuplesKt.to(C4569ua.f45542c, Integer.valueOf(this.f43075b.b())), TuplesKt.to("ts", String.valueOf(this.f43077d)), TuplesKt.to("rt", Integer.valueOf(this.f43074a.ordinal())));
    }

    @NotNull
    public final We e() {
        return this.f43074a;
    }

    public final long f() {
        return this.f43077d;
    }
}
