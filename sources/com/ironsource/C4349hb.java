package com.ironsource;

import com.ironsource.InterfaceC4366ib;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4349hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4382jb f43259a;

    /* JADX INFO: renamed from: com.ironsource.hb$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private C4349hb f43260a = new C4349hb(null);

        @NotNull
        public final a a(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f43260a.a(adUnitId);
            return this;
        }

        @NotNull
        public final a b(@NotNull String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            this.f43260a.b(placementName);
            return this;
        }

        @NotNull
        public final a a(@NotNull InterfaceC4416lb listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f43260a.a(listener);
            return this;
        }

        @NotNull
        public final C4349hb a() {
            return this.f43260a;
        }
    }

    public /* synthetic */ C4349hb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final String c() {
        return this.f43259a.i();
    }

    @Nullable
    public final String d() {
        return this.f43259a.j();
    }

    @Nullable
    public final InterfaceC4366ib.a e() {
        return this.f43259a.k();
    }

    @Nullable
    public final AdapterNativeAdViewBinder f() {
        return this.f43259a.l();
    }

    @Nullable
    public final String g() {
        return this.f43259a.m();
    }

    public final void h() {
        this.f43259a.n();
    }

    private C4349hb() {
        this.f43259a = new C4382jb(C4600w7.f45720a.a(), this);
    }

    public final void a() {
        this.f43259a.f();
    }

    @Nullable
    public final String b() {
        return this.f43259a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f43259a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.f43259a.b(str);
    }

    public final void a(@Nullable InterfaceC4416lb interfaceC4416lb) {
        this.f43259a.a(interfaceC4416lb);
    }
}
