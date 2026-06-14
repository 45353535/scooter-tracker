package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4233af implements G3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f42432d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42433e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f42434f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f42435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f42436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final K8 f42437c;

    /* JADX INFO: renamed from: com.ironsource.af$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4233af(@NotNull Context context, @NotNull String baseName, @NotNull K8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f42435a = context;
        this.f42436b = baseName;
        this.f42437c = sdkSharedPref;
    }

    @Override // com.ironsource.G3
    public void a(@NotNull String identifier, int i10) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f42437c.a(this.f42435a, new C4251bf(identifier, this.f42436b + ".show_count_show_counter").a(), i10);
    }

    @Override // com.ironsource.G3
    @Nullable
    public Long b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.f42437c.b(this.f42435a, new C4251bf(identifier, this.f42436b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.G3
    @Nullable
    public Integer c(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Integer.valueOf(this.f42437c.b(this.f42435a, new C4251bf(identifier, this.f42436b + ".show_count_show_counter").a(), -1)));
    }

    @Override // com.ironsource.G3
    public void a(@NotNull String identifier, long j10) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f42437c.a(this.f42435a, new C4251bf(identifier, this.f42436b + ".pacing_last_show_time").a(), j10);
    }

    @Override // com.ironsource.G3
    public void b(@NotNull String identifier, long j10) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f42437c.a(this.f42435a, new C4251bf(identifier, this.f42436b + ".show_count_threshold").a(), j10);
    }

    public /* synthetic */ C4233af(Context context, String str, K8 k82, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? new Ae() : k82);
    }

    @Override // com.ironsource.G3
    @Nullable
    public Long a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.f42437c.b(this.f42435a, new C4251bf(identifier, this.f42436b + ".show_count_threshold").a(), -1L)));
    }

    private final Long a(Long l10) {
        if (l10 != null && l10.longValue() == -1) {
            return null;
        }
        return l10;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
