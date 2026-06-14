package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC4370j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface h extends q {

    public static abstract class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f43934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f43935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f43936c;

        public a(@Nullable String str, @Nullable String str2, boolean z10) {
            this.f43934a = str;
            this.f43935b = str2;
            this.f43936c = z10;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String b() {
            return this.f43935b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.f43936c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String e() {
            return this.f43934a;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f43937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Activity f43938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final ISDemandOnlyBannerLayout f43939f;

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.a(this.f43937d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Nullable
        public final Activity f() {
            return this.f43938e;
        }

        @Nullable
        public final ISDemandOnlyBannerLayout g() {
            return this.f43939f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String adFormat, @Nullable Activity activity, @Nullable String str, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str2, boolean z10) {
            super(str, str2, z10);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f43937d = adFormat;
            this.f43938e = activity;
            this.f43939f = iSDemandOnlyBannerLayout;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f43940a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Activity f43941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f43942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f43943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private String f43944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private ISDemandOnlyBannerLayout f43945f;

        @NotNull
        public final c a(@NotNull IronSource.a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            String string = adFormat.toString();
            Intrinsics.checkNotNullExpressionValue(string, "adFormat.toString()");
            this.f43940a = string;
            return this;
        }

        @NotNull
        public final c b(@Nullable String str) {
            this.f43942c = str;
            return this;
        }

        @NotNull
        public final c a(@Nullable Activity activity) {
            this.f43941b = activity;
            return this;
        }

        @NotNull
        public final d b() {
            return new d(this.f43940a, this.f43941b, this.f43942c, this.f43944e, this.f43943d);
        }

        @NotNull
        public final c a(@Nullable Activity activity, @Nullable Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f43941b = activity;
            return this;
        }

        @NotNull
        public final c a(boolean z10) {
            this.f43943d = z10;
            return this;
        }

        @NotNull
        public final c a(@Nullable String str) {
            this.f43944e = str;
            return this;
        }

        @NotNull
        public final c a(@Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f43945f = iSDemandOnlyBannerLayout;
            return this;
        }

        @NotNull
        public final b a() {
            return new b(this.f43940a, this.f43941b, this.f43942c, this.f43945f, this.f43944e, this.f43943d);
        }
    }

    public static final class d extends a implements InterfaceC4370j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f43946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Activity f43947e;

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.b(this.f43946d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC4370j
        @Nullable
        public Activity d() {
            return this.f43947e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String adFormat, @Nullable Activity activity, @Nullable String str, @Nullable String str2, boolean z10) {
            super(str, str2, z10);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f43946d = adFormat;
            this.f43947e = activity;
        }
    }

    @Nullable
    String b();

    boolean c();

    @Nullable
    String e();
}
