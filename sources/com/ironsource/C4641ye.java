package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4641ye implements InterfaceC4624xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final K8 f45888a;

    /* JADX INFO: renamed from: com.ironsource.ye$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f45889a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f45890b = "sessionNumber";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f45891c = "firstSessionTimestamp";

        private a() {
        }
    }

    public C4641ye() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC4658ze
    public void a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45888a.a(context, a.f45890b, i10);
    }

    @Override // com.ironsource.InterfaceC4658ze
    public int b(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f45888a.b(context, a.f45890b, i10);
    }

    public C4641ye(@NotNull K8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f45888a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC4335ge
    public long a(@NotNull Context context, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f45888a.b(context, "firstSessionTimestamp", j10);
    }

    @Override // com.ironsource.InterfaceC4335ge
    public void b(@NotNull Context context, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45888a.a(context, "firstSessionTimestamp", j10);
    }

    public /* synthetic */ C4641ye(K8 k82, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Ae() : k82);
    }
}
