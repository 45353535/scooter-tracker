package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.appevents.o;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19689b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f19690a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m0 a(String activityName, String str, AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            return new m0(activityName, str, accessToken);
        }

        public final Executor b() {
            return r.f19718c.i();
        }

        public final o.b c() {
            return r.f19718c.k();
        }

        public final String d() {
            return r.f19718c.m();
        }

        public final void e(Map ud2) {
            Intrinsics.checkNotNullParameter(ud2, "ud");
            t0.g(ud2);
        }

        private a() {
        }
    }

    public m0(r loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.f19690a = loggerImpl;
    }

    public final void a() {
        this.f19690a.j();
    }

    public final void b(Bundle parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (((parameters.getInt("previous") & 2) != 0) || com.facebook.s.q()) {
            this.f19690a.p("fb_sdk_settings_changed", null, parameters);
        }
    }

    public final void c(String str, double d10, Bundle bundle) {
        if (com.facebook.s.q()) {
            this.f19690a.k(str, d10, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (com.facebook.s.q()) {
            this.f19690a.l(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.f19690a.o(str, str2);
    }

    public final void f(String str, Bundle bundle) {
        if (com.facebook.s.q()) {
            this.f19690a.p(str, null, bundle);
        }
    }

    public final void g(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, n0 n0Var) {
        if (com.facebook.s.q()) {
            this.f19690a.q(str, bigDecimal, currency, bundle, n0Var);
        }
    }

    public final void h(BigDecimal bigDecimal, Currency currency, Bundle bundle, n0 n0Var) {
        if (com.facebook.s.q()) {
            this.f19690a.s(bigDecimal, currency, bundle, n0Var);
        }
    }

    public m0(Context context) {
        this(new r(context, (String) null, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(String activityName, String str, AccessToken accessToken) {
        this(new r(activityName, str, accessToken));
        Intrinsics.checkNotNullParameter(activityName, "activityName");
    }
}
