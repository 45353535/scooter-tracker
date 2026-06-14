package com.yandex.div.core.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/util/AccessibilityStateProvider;", "", "", "a11yConfigurationEnabled", "<init>", "(Z)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "isAccessibilityEnabled", "(Landroid/content/Context;)Z", "Z", "getA11yConfigurationEnabled", "()Z", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AccessibilityStateProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static Boolean touchExplorationEnabled;
    private final boolean a11yConfigurationEnabled;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/util/AccessibilityStateProvider$Companion;", "", "()V", "touchExplorationEnabled", "", "getTouchExplorationEnabled", "()Ljava/lang/Boolean;", "setTouchExplorationEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "evaluateTouchModeEnabled", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void evaluateTouchModeEnabled(@NotNull Context context) {
            if (getTouchExplorationEnabled() != null) {
                return;
            }
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            setTouchExplorationEnabled(accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE);
        }

        @Nullable
        public final Boolean getTouchExplorationEnabled() {
            return AccessibilityStateProvider.touchExplorationEnabled;
        }

        public final void setTouchExplorationEnabled(@Nullable Boolean bool) {
            AccessibilityStateProvider.touchExplorationEnabled = bool;
        }

        private Companion() {
        }
    }

    public AccessibilityStateProvider(boolean z10) {
        this.a11yConfigurationEnabled = z10;
    }

    public final boolean isAccessibilityEnabled(@NotNull Context context) {
        if (!this.a11yConfigurationEnabled) {
            return false;
        }
        Boolean bool = touchExplorationEnabled;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            return bool.booleanValue();
        }
        INSTANCE.evaluateTouchModeEnabled(context);
        Boolean bool2 = touchExplorationEnabled;
        Intrinsics.checkNotNull(bool2);
        return bool2.booleanValue();
    }
}
