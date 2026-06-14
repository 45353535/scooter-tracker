package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19784b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f19785a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e0() {
        SharedPreferences sharedPreferences = s.m().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.f19785a = sharedPreferences;
    }

    public final void a() {
        this.f19785a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final Profile b() {
        String string = this.f19785a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        JSONObject jSONObjectD = profile.d();
        if (jSONObjectD != null) {
            this.f19785a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectD.toString()).apply();
        }
    }
}
