package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19698b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f19699c = o.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f19700a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            r.f19718c.f(application, str);
        }

        public final String b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return r.f19718c.j(context);
        }

        public final b c() {
            return r.f19718c.k();
        }

        public final String d() {
            return c.b();
        }

        public final void e(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            r.f19718c.n(context, str);
        }

        public final o f(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new o(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void g() {
            r.f19718c.t();
        }

        private a() {
        }
    }

    public enum b {
        AUTO,
        EXPLICIT_ONLY
    }

    public /* synthetic */ o(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    public final void a() {
        this.f19700a.j();
    }

    public final void b(String str, Bundle bundle) {
        this.f19700a.l(str, bundle);
    }

    private o(Context context, String str, AccessToken accessToken) {
        this.f19700a = new r(context, str, accessToken);
    }
}
