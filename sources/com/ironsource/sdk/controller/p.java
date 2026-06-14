package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4462o4;
import com.ironsource.InterfaceC4320g;
import com.ironsource.InterfaceC4337h;
import com.ironsource.Oc;
import com.ironsource.Pc;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface p {

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Pc f45216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC4320g f45217b;

            public a(@NotNull Pc configurations, @NotNull InterfaceC4320g intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f45216a = configurations;
                this.f45217b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Oc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent intentA = this.f45217b.a();
                intentA.setData(Uri.parse(openUrl.d()));
                String strC = openUrl.c();
                if (strC != null && strC.length() != 0) {
                    intentA = intentA.setPackage(openUrl.c());
                    Intrinsics.checkNotNullExpressionValue(intentA, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    intentA = intentA.addFlags(this.f45216a.c());
                }
                Intrinsics.checkNotNullExpressionValue(intentA, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(intentA);
                return c.b.f45224a;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0477b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f45218a;

            public C0477b(@NotNull String method) {
                Intrinsics.checkNotNullParameter(method, "method");
                this.f45218a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Oc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new c.a("method " + this.f45218a + " is unsupported");
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Pc f45219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC4337h f45220b;

            public c(@NotNull Pc configurations, @NotNull InterfaceC4337h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f45219a = configurations;
                this.f45220b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Oc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f45220b).a(this.f45219a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.f45224a;
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Pc f45221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final InterfaceC4337h f45222b;

            public d(@NotNull Pc configurations, @NotNull InterfaceC4337h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f45221a = configurations;
                this.f45222b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            @NotNull
            public c a(@NotNull Context context, @NotNull Oc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f45222b).a(this.f45221a.c()).a(openUrl.d()).a(this.f45221a.d()).b(true).a(context));
                return c.b.f45224a;
            }
        }

        @NotNull
        c a(@NotNull Context context, @NotNull Oc oc2);
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f45223a;

            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @NotNull
            public final String a() {
                return this.f45223a;
            }

            @NotNull
            public final String b() {
                return this.f45223a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f45223a, ((a) obj).f45223a);
            }

            public int hashCode() {
                return this.f45223a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorMessage=" + this.f45223a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f45223a = errorMessage;
            }

            @NotNull
            public final a a(@NotNull String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f45223a;
                }
                return aVar.a(str);
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f45224a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @NotNull
    c a(@NotNull Context context, @NotNull Oc oc2);

    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private b f45215a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull com.ironsource.Pc r4, @org.jetbrains.annotations.NotNull com.ironsource.InterfaceC4337h r5, @org.jetbrains.annotations.NotNull com.ironsource.InterfaceC4320g r6) {
            /*
                r2 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "openUrlConfigurations"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "activityIntentFactory"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "actionIntentFactory"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r2.<init>()
                int r0 = r3.hashCode()
                r1 = -1455867212(0xffffffffa9393ab4, float:-4.112917E-14)
                if (r0 == r1) goto L49
                r6 = 109770977(0x68af8e1, float:5.2275525E-35)
                if (r0 == r6) goto L3a
                r6 = 1224424441(0x48fb3bf9, float:514527.78)
                if (r0 == r6) goto L2b
                goto L57
            L2b:
                java.lang.String r6 = "webview"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L34
                goto L57
            L34:
                com.ironsource.sdk.controller.p$b$d r3 = new com.ironsource.sdk.controller.p$b$d
                r3.<init>(r4, r5)
                goto L5d
            L3a:
                java.lang.String r6 = "store"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L43
                goto L57
            L43:
                com.ironsource.sdk.controller.p$b$c r3 = new com.ironsource.sdk.controller.p$b$c
                r3.<init>(r4, r5)
                goto L5d
            L49:
                java.lang.String r5 = "external_browser"
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L57
                com.ironsource.sdk.controller.p$b$a r3 = new com.ironsource.sdk.controller.p$b$a
                r3.<init>(r4, r6)
                goto L5d
            L57:
                com.ironsource.sdk.controller.p$b$b r4 = new com.ironsource.sdk.controller.p$b$b
                r4.<init>(r3)
                r3 = r4
            L5d:
                r2.f45215a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.p.a.<init>(java.lang.String, com.ironsource.Pc, com.ironsource.h, com.ironsource.g):void");
        }

        @Override // com.ironsource.sdk.controller.p
        @NotNull
        public c a(@NotNull Context context, @NotNull Oc openUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.f45215a.a(context, openUrl);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                String message = e10.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e10.getMessage();
                Intrinsics.checkNotNull(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String method, @NotNull Pc openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.c(), new k.a());
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }
    }
}
