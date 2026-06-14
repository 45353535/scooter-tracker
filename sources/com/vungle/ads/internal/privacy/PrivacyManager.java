package com.vungle.ads.internal.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C4240b4;
import com.ironsource.X1;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001CB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fJ\u0006\u0010$\u001a\u00020\fJ\u0006\u0010%\u001a\u00020\fJ\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010+J\u0006\u0010-\u001a\u00020\fJ\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u0004H\u0002J\u0010\u00104\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u00105\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0007H\u0007J(\u00106\u001a\u00020/2\u0006\u00103\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0010H\u0002J\r\u0010:\u001a\u00020\u0007H\u0000¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0007J\u0006\u0010=\u001a\u00020\u0007J\u000e\u0010>\u001a\u00020/2\u0006\u00103\u001a\u00020\u0004J\u000e\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020\u0007J\u000e\u0010A\u001a\u00020/2\u0006\u0010@\u001a\u00020\u0007J \u0010B\u001a\u00020/2\u0006\u00103\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006D"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager;", "", "()V", "ccpaConsent", "Lcom/vungle/ads/internal/privacy/PrivacyConsent;", "coppaStatus", "Ljava/util/concurrent/atomic/AtomicReference;", "", "disableAdId", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "gdprConsent", "", "gdprConsentMessageVersion", "gdprConsentSource", "gdprConsentTimestamp", "", "Ljava/lang/Long;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "value", "previousTcfToken", "getPreviousTcfToken", "()Ljava/lang/String;", "setPreviousTcfToken", "(Ljava/lang/String;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "allowDeviceIDFromTCF", "Lcom/vungle/ads/internal/privacy/PrivacyManager$DeviceIdAllowed;", "getCcpaStatus", "getConsentMessageVersion", "getConsentSource", "getConsentStatus", "getConsentTimestamp", "getCoppaStatus", "Lcom/vungle/ads/internal/privacy/COPPA;", "getDisableAdId", "getDisableAdId$vungle_ads_release", "()Ljava/lang/Boolean;", "getGdprAppliesFromPreferences", "getIABTCFString", "init", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "saveCcpaConsent", C4240b4.j.f42669b0, "saveCoppaConsent", "saveDisableAdId", "saveGdprConsent", "source", "consentMessageVersion", "consentTimestamp", "shouldReturnTrueForLegacy", "shouldReturnTrueForLegacy$vungle_ads_release", "shouldSendAdIds", "shouldSendTCFString", "updateCcpaConsent", "updateCoppaConsent", "newValue", "updateDisableAdId", "updateGdprConsent", "DeviceIdAllowed", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PrivacyManager {

    @Nullable
    private static PrivacyConsent ccpaConsent;

    @Nullable
    private static FilePreferences filePreferences;

    @Nullable
    private static String gdprConsent;

    @Nullable
    private static String gdprConsentMessageVersion;

    @Nullable
    private static String gdprConsentSource;

    @Nullable
    private static Long gdprConsentTimestamp;

    @Nullable
    private static SharedPreferences sharedPreferences;

    @NotNull
    public static final PrivacyManager INSTANCE = new PrivacyManager();

    @NotNull
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();

    @NotNull
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();

    @NotNull
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager$DeviceIdAllowed;", "", "(Ljava/lang/String;I)V", "ALLOW_ID", "DISABLE_ID", "FALLBACK", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeviceIdAllowed {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceIdAllowed.values().length];
            iArr[DeviceIdAllowed.DISABLE_ID.ordinal()] = 1;
            iArr[DeviceIdAllowed.FALLBACK.ordinal()] = 2;
            iArr[DeviceIdAllowed.ALLOW_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfigPayload.IABSettings.TcfStatus.values().length];
            iArr2[ConfigPayload.IABSettings.TcfStatus.DISABLE_ID.ordinal()] = 1;
            iArr2[ConfigPayload.IABSettings.TcfStatus.ALLOW_ID.ordinal()] = 2;
            iArr2[ConfigPayload.IABSettings.TcfStatus.LEGACY.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private PrivacyManager() {
    }

    private final void saveCcpaConsent(PrivacyConsent consent) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.CCPA_CONSENT_STATUS, consent.getValue())) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    private final void saveCoppaConsent(boolean value) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put("is_coppa", value)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    private final void saveGdprConsent(String consent, String source, String consentMessageVersion, long consentTimestamp) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferencesPut2;
        FilePreferences filePreferencesPut3;
        FilePreferences filePreferencesPut4;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.GDPR_CONSENT_STATUS, consent)) == null || (filePreferencesPut2 = filePreferencesPut.put(Cookie.GDPR_CONSENT_SOURCE, source)) == null || (filePreferencesPut3 = filePreferencesPut2.put(Cookie.GDPR_CONSENT_MESSAGE_VERSION, consentMessageVersion)) == null || (filePreferencesPut4 = filePreferencesPut3.put(Cookie.GDPR_CONSENT_TIMESTAMP, consentTimestamp)) == null) {
            return;
        }
        filePreferencesPut4.apply();
    }

    @NotNull
    public final DeviceIdAllowed allowDeviceIDFromTCF() {
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (!Intrinsics.areEqual(gdprAppliesFromPreferences, Boolean.TRUE)) {
            return gdprAppliesFromPreferences == null ? DeviceIdAllowed.FALLBACK : DeviceIdAllowed.ALLOW_ID;
        }
        ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return DeviceIdAllowed.DISABLE_ID;
            }
            if (i10 == 2) {
                return DeviceIdAllowed.ALLOW_ID;
            }
            if (i10 != 3) {
                throw new m();
            }
        }
        return DeviceIdAllowed.FALLBACK;
    }

    @NotNull
    public final String getCcpaStatus() {
        String value;
        PrivacyConsent privacyConsent = ccpaConsent;
        return (privacyConsent == null || (value = privacyConsent.getValue()) == null) ? PrivacyConsent.UNKNOWN.getValue() : value;
    }

    @NotNull
    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    @NotNull
    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final long getConsentTimestamp() {
        Long l10 = gdprConsentTimestamp;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @NotNull
    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        return atomicReference.get() == null ? COPPA.COPPA_NOTSET : Intrinsics.areEqual(atomicReference.get(), Boolean.TRUE) ? COPPA.COPPA_ENABLED : Intrinsics.areEqual(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    @VisibleForTesting
    @Nullable
    public final Boolean getDisableAdId$vungle_ads_release() {
        return disableAdId.get();
    }

    @Nullable
    public final Boolean getGdprAppliesFromPreferences() {
        Object objB;
        Object objB2;
        Integer numValueOf;
        String string;
        try {
            Result.Companion companion = Result.f93230c;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            objB = Result.b(sharedPreferences2 != null ? Integer.valueOf(sharedPreferences2.getInt("IABTCF_gdprApplies", -1)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.g(objB) != null) {
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 == null || (string = sharedPreferences3.getString("IABTCF_gdprApplies", X1.f42014f)) == null) {
                    numValueOf = null;
                } else {
                    Intrinsics.checkNotNullExpressionValue(string, "getString(IABTCF_GDPR_APPLIES, \"-1\")");
                    numValueOf = Integer.valueOf(Integer.parseInt(string));
                }
                objB2 = Result.b(numValueOf);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.f93230c;
                objB2 = Result.b(d.a(th3));
            }
            objB = objB2;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    @NotNull
    public final String getIABTCFString() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String string = sharedPreferences2 != null ? sharedPreferences2.getString("IABTCF_TCString", "") : null;
        return string == null ? "" : string;
    }

    @Nullable
    public final String getPreviousTcfToken() {
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null) {
            return filePreferences2.getString("previous_tcf_token", "");
        }
        return null;
    }

    @Nullable
    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public final synchronized void init(@NotNull Context context) throws Throwable {
        Throwable th2;
        try {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                AtomicBoolean atomicBoolean = initialized;
                try {
                    if (atomicBoolean.get()) {
                        Logger.INSTANCE.w("PrivacyManager", "PrivacyManager already initialized");
                        return;
                    }
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    FilePreferences filePreferences2 = (FilePreferences) ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
                    filePreferences = filePreferences2;
                    AtomicReference<Boolean> atomicReference = disableAdId;
                    Boolean bool = atomicReference.get();
                    if (bool != null) {
                        saveDisableAdId(bool.booleanValue());
                    } else {
                        Boolean bool2 = filePreferences2.getBoolean(Cookie.COPPA_DISABLE_AD_ID);
                        if (bool2 != null) {
                            atomicReference.set(bool2);
                        }
                    }
                    String str = gdprConsent;
                    if (str != null) {
                        String str2 = gdprConsentSource;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = gdprConsentMessageVersion;
                        if (str3 == null) {
                            str3 = "";
                        }
                        Long l10 = gdprConsentTimestamp;
                        saveGdprConsent(str, str2, str3, l10 != null ? l10.longValue() : 0L);
                    } else {
                        String string = filePreferences2.getString(Cookie.GDPR_CONSENT_STATUS);
                        PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
                        if (Intrinsics.areEqual(string, privacyConsent.getValue())) {
                            string = privacyConsent.getValue();
                        } else {
                            PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                            if (Intrinsics.areEqual(string, privacyConsent2.getValue())) {
                                string = privacyConsent2.getValue();
                            }
                        }
                        gdprConsent = string;
                        gdprConsentSource = filePreferences2.getString(Cookie.GDPR_CONSENT_SOURCE);
                        gdprConsentMessageVersion = filePreferences2.getString(Cookie.GDPR_CONSENT_MESSAGE_VERSION);
                        gdprConsentTimestamp = Long.valueOf(filePreferences2.getLong(Cookie.GDPR_CONSENT_TIMESTAMP, 0L));
                    }
                    PrivacyConsent privacyConsent3 = ccpaConsent;
                    if (privacyConsent3 != null) {
                        saveCcpaConsent(privacyConsent3);
                    } else {
                        String string2 = filePreferences2.getString(Cookie.CCPA_CONSENT_STATUS);
                        PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
                        if (!Intrinsics.areEqual(privacyConsent4.getValue(), string2)) {
                            privacyConsent4 = PrivacyConsent.OPT_IN;
                        }
                        ccpaConsent = privacyConsent4;
                    }
                    AtomicReference<Boolean> atomicReference2 = coppaStatus;
                    Boolean bool3 = atomicReference2.get();
                    if (bool3 != null) {
                        saveCoppaConsent(bool3.booleanValue());
                    } else {
                        Boolean bool4 = filePreferences2.getBoolean("is_coppa");
                        if (bool4 != null) {
                            atomicReference2.set(bool4);
                        }
                    }
                    atomicBoolean.set(true);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    @VisibleForTesting
    public final void saveDisableAdId(boolean value) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.COPPA_DISABLE_AD_ID, value)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void setPreviousTcfToken(@Nullable String str) {
        FilePreferences filePreferences2;
        FilePreferences filePreferencesPut;
        if (str == null || str.length() == 0 || (filePreferences2 = filePreferences) == null || (filePreferencesPut = filePreferences2.put("previous_tcf_token", str)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void setSharedPreferences(@Nullable SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (Intrinsics.areEqual(getPreviousTcfToken(), iABTCFString)) {
            return false;
        }
        setPreviousTcfToken(iABTCFString);
        return true;
    }

    public final boolean shouldSendAdIds() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new m();
            }
            Boolean disableAdId$vungle_ads_release = getDisableAdId$vungle_ads_release();
            if (disableAdId$vungle_ads_release != null && !disableAdId$vungle_ads_release.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldSendTCFString() {
        if (!Intrinsics.areEqual(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            return false;
        }
        ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1 || i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new m();
            }
        }
        return shouldReturnTrueForLegacy$vungle_ads_release();
    }

    public final void updateCcpaConsent(@NotNull PrivacyConsent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final void updateCoppaConsent(boolean newValue) {
        coppaStatus.set(Boolean.valueOf(newValue));
        saveCoppaConsent(newValue);
    }

    public final void updateDisableAdId(boolean newValue) {
        disableAdId.set(Boolean.valueOf(newValue));
        saveDisableAdId(newValue);
    }

    public final void updateGdprConsent(@NotNull String consent, @NotNull String source, @Nullable String consentMessageVersion) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = consentMessageVersion;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        gdprConsentTimestamp = Long.valueOf(jCurrentTimeMillis);
        String str = gdprConsentMessageVersion;
        if (str == null) {
            str = "";
        }
        saveGdprConsent(consent, source, str, jCurrentTimeMillis);
    }
}
