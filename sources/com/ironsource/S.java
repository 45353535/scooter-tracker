package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class S implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final InterfaceC4397k9 f41687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41688c;

    static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41689a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.r();
        }
    }

    static final class b extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f41690a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.o();
        }
    }

    static final class c extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f41691a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.n();
        }
    }

    static final class d extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f41692a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.q();
        }
    }

    static final class e extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f41693a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.o();
        }
    }

    static final class f extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f41694a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4598w5.f45712a.g();
        }
    }

    public S(@NotNull String adm, @Nullable InterfaceC4397k9 interfaceC4397k9, boolean z10) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.f41686a = adm;
        this.f41687b = interfaceC4397k9;
        this.f41688c = z10;
    }

    @Override // com.ironsource.bg
    public /* synthetic */ void a(boolean z10, Function0 function0) {
        lk.a(this, z10, function0);
    }

    @Override // com.ironsource.bg
    public void a() throws C4352he {
        a(this.f41688c, a.f41689a);
        a(this.f41687b != null, b.f41690a);
        InterfaceC4397k9 interfaceC4397k9 = this.f41687b;
        if (interfaceC4397k9 != null) {
            if (interfaceC4397k9.f() == EnumC4431m9.NonBidder) {
                a(this.f41686a.length() == 0, c.f41691a);
            }
            if (interfaceC4397k9.f() == EnumC4431m9.Bidder) {
                a(this.f41686a.length() > 0, d.f41692a);
            }
            a(interfaceC4397k9.f() != EnumC4431m9.NotSupported, e.f41693a);
            a(interfaceC4397k9.e().length() > 0, f.f41694a);
        }
    }
}
