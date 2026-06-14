package org.bidon.sdk.databinders.user.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import hg.l0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bidon.sdk.databinders.user.AdvertisingData;
import org.bidon.sdk.databinders.user.AdvertisingProfile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/databinders/user/impl/AdvertisingDataImpl;", "Lorg/bidon/sdk/databinders/user/AdvertisingData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "advertisingProfile", "Lorg/bidon/sdk/databinders/user/AdvertisingProfile;", "getAdvertisingProfile", "()Lorg/bidon/sdk/databinders/user/AdvertisingProfile;", "advertisingProfileFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInitialState", "getGoogleAdId", "getHuaweiAdId", "getAmazonAdId", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdvertisingDataImpl implements AdvertisingData {

    @NotNull
    private final MutableStateFlow advertisingProfileFlow;

    @NotNull
    private final Context context;

    public AdvertisingDataImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.advertisingProfileFlow = l0.a(getInitialState());
    }

    private final AdvertisingProfile getAmazonAdId() {
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = MANUFACTURER.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!Intrinsics.areEqual("amazon", lowerCase)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ContentResolver contentResolver = this.context.getContentResolver();
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            boolean z10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
            Intrinsics.checkNotNull(string);
            return new AdvertisingProfile.Amazon(string, z10);
        } catch (Exception unused) {
            return null;
        }
    }

    private final AdvertisingProfile getGoogleAdId() {
        try {
            int i10 = AdvertisingIdClient.f25284a;
            Object objInvoke = AdvertisingIdClient.class.getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.context);
            Object objInvoke2 = AdvertisingIdClient.Info.class.getDeclaredMethod("getId", null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            Object objInvoke3 = AdvertisingIdClient.Info.class.getDeclaredMethod(C4240b4.j.M, null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke3, "null cannot be cast to non-null type kotlin.Boolean");
            return new AdvertisingProfile.Google((String) objInvoke2, ((Boolean) objInvoke3).booleanValue());
        } catch (Exception unused) {
            return null;
        }
    }

    private final AdvertisingProfile getHuaweiAdId() {
        try {
            Object objInvoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.context);
            Class<?> cls = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient$Info");
            Object objInvoke2 = cls.getDeclaredMethod("getId", null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            Object objInvoke3 = cls.getDeclaredMethod(C4240b4.j.M, null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke3, "null cannot be cast to non-null type kotlin.Boolean");
            return new AdvertisingProfile.Huawei((String) objInvoke2, ((Boolean) objInvoke3).booleanValue());
        } catch (Exception unused) {
            return null;
        }
    }

    private final AdvertisingProfile getInitialState() {
        AdvertisingProfile googleAdId = getGoogleAdId();
        if (googleAdId != null) {
            return googleAdId;
        }
        AdvertisingProfile huaweiAdId = getHuaweiAdId();
        if (huaweiAdId != null) {
            return huaweiAdId;
        }
        AdvertisingProfile amazonAdId = getAmazonAdId();
        return amazonAdId == null ? AdvertisingProfile.Denied.INSTANCE : amazonAdId;
    }

    @Override // org.bidon.sdk.databinders.user.AdvertisingData
    @NotNull
    public AdvertisingProfile getAdvertisingProfile() {
        return (AdvertisingProfile) this.advertisingProfileFlow.getValue();
    }
}
