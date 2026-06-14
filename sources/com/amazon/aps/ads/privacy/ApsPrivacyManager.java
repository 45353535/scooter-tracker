package com.amazon.aps.ads.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DtbSharedPreferences;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\bJ\u001d\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0002\u0010\u001aJ\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010 \u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0012J\u0010\u0010\"\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$J\u0006\u0010%\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/amazon/aps/ads/privacy/ApsPrivacyManager;", "", "<init>", "()V", "keysInterested", "", "", "value", "", "isInitialized", "()Z", "gdprHandler", "Lcom/amazon/aps/ads/privacy/ApsGdprHandler;", "isGdprToBeAppliedFromConfig", "Ljava/lang/Boolean;", "prefChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "init", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "isGdprConsentRequired", "getBooleanValue", "prefs", "Landroid/content/SharedPreferences;", C4240b4.i.W, "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Boolean;", "getIntValue", "", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Integer;", "getStringValue", "setGdprConsent", "removeStoragesByApsIfNoConsent", "removeConfigFileIfExists", "setGdprConfiguration", "jsonArray", "Lorg/json/JSONArray;", "isSystemResourceAccessAllowed", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsPrivacyManager {

    @NotNull
    public static final ApsPrivacyManager INSTANCE = new ApsPrivacyManager();

    @Nullable
    private Boolean isGdprToBeAppliedFromConfig;
    private boolean isInitialized;

    @NotNull
    private final Set<String> keysInterested = SetsKt.setOf((Object[]) new String[]{"IABTCF_TCString", "IABTCF_gdprApplies"});

    @NotNull
    private final ApsGdprHandler gdprHandler = new ApsGdprHandler();

    @NotNull
    private final SharedPreferences.OnSharedPreferenceChangeListener prefChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: u0.a
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            ApsPrivacyManager.prefChangeListener$lambda$0(this.f105178a, sharedPreferences, str);
        }
    };

    private ApsPrivacyManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prefChangeListener$lambda$0(ApsPrivacyManager apsPrivacyManager, SharedPreferences sharedPreferences, String str) {
        ApsAdExtensionsKt.d(apsPrivacyManager, "Received the shared preference changed event");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 83641339) {
                if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    ApsGdprHandler apsGdprHandler = apsPrivacyManager.gdprHandler;
                    Intrinsics.checkNotNull(sharedPreferences);
                    apsGdprHandler.setGdprConsent(apsPrivacyManager.getStringValue(sharedPreferences, "IABTCF_TCString"));
                }
            } else if (str.equals("IABTCF_gdprApplies")) {
                ApsGdprHandler apsGdprHandler2 = apsPrivacyManager.gdprHandler;
                Intrinsics.checkNotNull(sharedPreferences);
                apsGdprHandler2.setGdprApplies(apsPrivacyManager.getBooleanValue(sharedPreferences, "IABTCF_gdprApplies"));
            }
        }
        if (CollectionsKt.contains(apsPrivacyManager.keysInterested, str)) {
            apsPrivacyManager.removeStoragesByApsIfNoConsent();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean getBooleanValue(@org.jetbrains.annotations.NotNull android.content.SharedPreferences r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "prefs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.contains(r4)
            r1 = 0
            if (r0 == 0) goto L5f
            java.util.Map r3 = r3.getAll()
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L28
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L28:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L43
            boolean r4 = androidx.activity.s.a(r3)
            if (r4 != 0) goto L33
            goto L3d
        L33:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = 1
            if (r4 != r3) goto L3d
            goto L3e
        L3d:
            r4 = 0
        L3e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            return r3
        L43:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L5f
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = r3.equals(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.ads.privacy.ApsPrivacyManager.getBooleanValue(android.content.SharedPreferences, java.lang.String):java.lang.Boolean");
    }

    @Nullable
    public final Integer getIntValue(@NotNull SharedPreferences prefs, @NotNull String key) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (prefs.contains(key)) {
                return Integer.valueOf(prefs.getInt(key, 0));
            }
            return null;
        } catch (Exception e10) {
            ApsAdExtensionsKt.remoteLog(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error reading the shared pref value", e10);
            return null;
        }
    }

    @Nullable
    public final String getStringValue(@NotNull SharedPreferences prefs, @NotNull String key) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return prefs.getString(key, null);
        } catch (Exception e10) {
            ApsAdExtensionsKt.remoteLog(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error reading the shared pref value", e10);
            return null;
        }
    }

    public final void init(@Nullable Context context) {
        if (this.isInitialized || context == null) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences != null) {
            setGdprConsent(defaultSharedPreferences);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.prefChangeListener);
        }
        this.isInitialized = true;
    }

    public final boolean isGdprConsentRequired() {
        Boolean bool = this.isGdprToBeAppliedFromConfig;
        if (bool == null || !bool.booleanValue()) {
            return (this.gdprHandler.getIsGdprApplies() != null && Intrinsics.areEqual(this.gdprHandler.getIsGdprApplies(), Boolean.TRUE)) || this.gdprHandler.getIsTcfStringFound();
        }
        return true;
    }

    /* JADX INFO: renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    public final boolean isSystemResourceAccessAllowed() {
        if (!isGdprConsentRequired()) {
            return true;
        }
        ApsGdprHandler apsGdprHandler = this.gdprHandler;
        return apsGdprHandler != null && apsGdprHandler.getIsPurpose1Consented();
    }

    public final void removeConfigFileIfExists() {
        File filesDir;
        Context context = AdRegistration.getContext();
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return;
        }
        File file = new File(filesDir.getAbsolutePath() + "/config/aps_mobile_client_config.json");
        if (file.exists()) {
            file.delete();
        }
    }

    public final void removeStoragesByApsIfNoConsent() {
        if (isSystemResourceAccessAllowed()) {
            return;
        }
        DtbSharedPreferences.clearStorage();
        removeConfigFileIfExists();
    }

    public final void setGdprConfiguration(@Nullable JSONArray jsonArray) {
        if (jsonArray == null) {
            this.isGdprToBeAppliedFromConfig = Boolean.FALSE;
            return;
        }
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (Intrinsics.areEqual("gdprtcfv2", jsonArray.get(i10))) {
                this.isGdprToBeAppliedFromConfig = Boolean.TRUE;
                return;
            }
        }
    }

    public final void setGdprConsent(@NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.gdprHandler.setGdprConsent(getStringValue(prefs, "IABTCF_TCString"));
        this.gdprHandler.setGdprApplies(getIntValue(prefs, "IABTCF_gdprApplies"));
        removeStoragesByApsIfNoConsent();
    }
}
