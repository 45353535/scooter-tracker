package com.facebook;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ironsource.C4424m2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f19802d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile f0 f19803e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalBroadcastManager f19804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f19805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Profile f19806c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized f0 a() {
            f0 f0Var;
            try {
                if (f0.f19803e == null) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(s.m());
                    Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                    f0.f19803e = new f0(localBroadcastManager, new e0());
                }
                f0Var = f0.f19803e;
                if (f0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(C4424m2.f43617p);
                    f0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return f0Var;
        }

        private a() {
        }
    }

    public f0(LocalBroadcastManager localBroadcastManager, e0 profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.f19804a = localBroadcastManager;
        this.f19805b = profileCache;
    }

    private final void e(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f19804a.sendBroadcast(intent);
    }

    private final void g(Profile profile, boolean z10) {
        Profile profile2 = this.f19806c;
        this.f19806c = profile;
        if (z10) {
            if (profile != null) {
                this.f19805b.c(profile);
            } else {
                this.f19805b.a();
            }
        }
        if (com.facebook.internal.z.e(profile2, profile)) {
            return;
        }
        e(profile2, profile);
    }

    public final Profile c() {
        return this.f19806c;
    }

    public final boolean d() {
        Profile profileB = this.f19805b.b();
        if (profileB == null) {
            return false;
        }
        g(profileB, false);
        return true;
    }

    public final void f(Profile profile) {
        g(profile, true);
    }
}
