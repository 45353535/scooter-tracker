package com.moloco.sdk.publisher.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mobilefuse.sdk.privacy.IabString;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/moloco/sdk/publisher/privacy/InternalMolocoPrivacySettingsImpl;", "Lcom/moloco/sdk/publisher/privacy/InternalMolocoPrivacySettings;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getUpdatedPrivacySettings", "Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;", "privacySettings", "getTCFConsent", "", "gdprApplies", "", "(Landroid/content/Context;)Ljava/lang/Boolean;", "getUSPrivacyConsentString", "userSetUsPrivacy", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalMolocoPrivacySettingsImpl implements InternalMolocoPrivacySettings {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    public InternalMolocoPrivacySettingsImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Boolean gdprApplies(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (!defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
            return null;
        }
        try {
            int i10 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            if (i10 == 0) {
                return Boolean.FALSE;
            }
            if (i10 != 1) {
                return null;
            }
            return Boolean.TRUE;
        } catch (ClassCastException unused) {
            return Boolean.valueOf(defaultSharedPreferences.getBoolean("IABTCF_gdprApplies", false));
        }
    }

    private final String getTCFConsent(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABTCF_TCString", null);
        if (string == null || StringsKt.y0(string)) {
            return null;
        }
        return string;
    }

    private final String getUSPrivacyConsentString(Context context, String userSetUsPrivacy) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(IabString.IAB_US_PRIVACY_STRING, null);
        return (string == null || StringsKt.y0(string)) ? userSetUsPrivacy : string;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings
    @NotNull
    public MolocoPrivacy.PrivacySettings getUpdatedPrivacySettings(@NotNull MolocoPrivacy.PrivacySettings privacySettings) {
        Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        Boolean boolGdprApplies = gdprApplies(this.context);
        if (boolGdprApplies == null) {
            boolGdprApplies = privacySettings.getIsUserConsent();
        }
        return new MolocoPrivacy.PrivacySettings(boolGdprApplies, privacySettings.getIsAgeRestrictedUser(), privacySettings.getIsDoNotSell(), getTCFConsent(this.context), getUSPrivacyConsentString(this.context, privacySettings.get_usPrivacy()));
    }
}
