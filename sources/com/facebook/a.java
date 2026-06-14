package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0326a f19585d = new C0326a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f19586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0 f19588c;

    /* JADX INFO: renamed from: com.facebook.a$a, reason: collision with other inner class name */
    public static final class C0326a {
        public /* synthetic */ C0326a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0326a() {
        }
    }

    public static final class b {
        public final c0 a() {
            return new c0(s.m(), null, 2, null);
        }
    }

    public a(SharedPreferences sharedPreferences, b tokenCachingStrategyFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f19586a = sharedPreferences;
        this.f19587b = tokenCachingStrategyFactory;
    }

    private final AccessToken b() {
        String string = this.f19586a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.INSTANCE.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final AccessToken c() {
        Bundle bundleC = d().c();
        if (bundleC == null || !c0.f19758c.g(bundleC)) {
            return null;
        }
        return AccessToken.INSTANCE.c(bundleC);
    }

    private final c0 d() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            if (this.f19588c == null) {
                synchronized (this) {
                    try {
                        if (this.f19588c == null) {
                            this.f19588c = this.f19587b.a();
                        }
                        Unit unit = Unit.f93236a;
                    } finally {
                    }
                }
            }
            c0 c0Var = this.f19588c;
            if (c0Var != null) {
                return c0Var;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final boolean e() {
        return this.f19586a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        return s.E();
    }

    public final void a() {
        this.f19586a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final AccessToken f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        AccessToken accessTokenC = c();
        if (accessTokenC != null) {
            g(accessTokenC);
            d().a();
        }
        return accessTokenC;
    }

    public final void g(AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        try {
            this.f19586a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.o().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        SharedPreferences sharedPreferences = s.m().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new b());
    }
}
