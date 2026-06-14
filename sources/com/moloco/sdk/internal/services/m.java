package com.moloco.sdk.internal.services;

import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f55702b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55703c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55704a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55704a = context;
    }

    @Override // com.moloco.sdk.internal.services.l
    public boolean a() {
        try {
            return Settings.Secure.getInt(this.f55704a.getContentResolver(), "reduce_bright_colors_activated") == 1;
        } catch (Settings.SettingNotFoundException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.moloco.sdk.internal.services.l
    public boolean b() {
        Object systemService = this.f55704a.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isEnabled() && Settings.Secure.getInt(this.f55704a.getContentResolver(), "accessibility_large_pointer_icon", 0) == 1;
    }

    @Override // com.moloco.sdk.internal.services.l
    public boolean c() {
        try {
            Object systemService = this.f55704a.getSystemService("captioning");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
            return ((CaptioningManager) systemService).isEnabled();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.moloco.sdk.internal.services.l
    public float getFontScale() {
        Object systemService = this.f55704a.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (((AccessibilityManager) systemService).isEnabled()) {
            return this.f55704a.getResources().getConfiguration().fontScale;
        }
        return 1.0f;
    }
}
