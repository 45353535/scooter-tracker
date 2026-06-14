package com.appodeal.advertising;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.o0;
import hg.l0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "getAdvertisingProfile", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fetchAdvertisingProfile", "", "defaultAdvertisingId", "Ljava/lang/String;", "AdvertisingProfile", "DefaultAdvertisingProfile", "GoogleAdvertisingProfile", "HuaweiAdvertisingProfile", "AmazonAdvertisingProfile", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdvertisingInfo {

    @NotNull
    public static final AdvertisingInfo INSTANCE = new AdvertisingInfo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f15324a = CollectionsKt.listOf((Object[]) new AdvertisingProfile[]{new GoogleAdvertisingProfile(), new AmazonAdvertisingProfile(), new HuaweiAdvertisingProfile(), DefaultAdvertisingProfile.INSTANCE});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MutableStateFlow f15325b = l0.a(g.f15338a);

    @NotNull
    public static final String defaultAdvertisingId = "00000000-0000-0000-0000-000000000000";

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019R*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\"\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006$"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "isEnabled$advertising_release", "(Landroid/content/Context;)Z", "isEnabled", "", "extractParams$advertising_release", "(Landroid/content/Context;)V", "extractParams", "", "getUUID$advertising_release", "(Landroid/content/Context;)Ljava/lang/String;", "getUUID", "toString", "()Ljava/lang/String;", "value", "a", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "id", "b", "Z", C4240b4.j.M, "()Z", "setLimitAdTrackingEnabled", "(Z)V", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "isAdvertisingIdWasGenerated", "setAdvertisingIdWasGenerated", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class AdvertisingProfile {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public String id = "00000000-0000-0000-0000-000000000000";

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean isLimitAdTrackingEnabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean isAdvertisingIdWasGenerated;

        public void extractParams$advertising_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!this.isLimitAdTrackingEnabled && !Intrinsics.areEqual(this.id, "00000000-0000-0000-0000-000000000000") && !StringsKt.y0(this.id)) {
                if (d.f15335a.matcher(this.id).matches()) {
                    return;
                }
            }
            this.id = getUUID$advertising_release(context);
            this.isAdvertisingIdWasGenerated = true;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public String getUUID$advertising_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("appodeal", 0);
            String string = sharedPreferences.getString(CommonUrlParts.UUID, null);
            if (string != null) {
                return string;
            }
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(CommonUrlParts.UUID, string2);
            editorEdit.apply();
            return string2;
        }

        /* JADX INFO: renamed from: isAdvertisingIdWasGenerated, reason: from getter */
        public final boolean getIsAdvertisingIdWasGenerated() {
            return this.isAdvertisingIdWasGenerated;
        }

        public boolean isEnabled$advertising_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return true;
        }

        /* JADX INFO: renamed from: isLimitAdTrackingEnabled, reason: from getter */
        public final boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @NotNull
        public String toString() {
            return getClass().getSimpleName() + "(id='" + this.id + "', isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", isAdvertisingIdWasGenerated=" + this.isAdvertisingIdWasGenerated + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$AmazonAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "<init>", "()V", "isEnabled", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "isEnabled$advertising_release", "extractParams", "", "extractParams$advertising_release", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AmazonAdvertisingProfile extends AdvertisingProfile {
        @Override // com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile
        public void extractParams$advertising_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            Intrinsics.checkNotNullParameter(string, "<set-?>");
            this.id = string;
            this.isLimitAdTrackingEnabled = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
            super.extractParams$advertising_release(context);
        }

        @Override // com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile
        public boolean isEnabled$advertising_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Intrinsics.areEqual("Amazon", Build.MANUFACTURER);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$DefaultAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultAdvertisingProfile extends AdvertisingProfile {

        @NotNull
        public static final DefaultAdvertisingProfile INSTANCE = new DefaultAdvertisingProfile();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$GoogleAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "<init>", "()V", "isEnabled", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "isEnabled$advertising_release", "extractParams", "", "extractParams$advertising_release", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdvertisingProfile extends AdvertisingProfile {
        @Override // com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile
        public void extractParams$advertising_release(@NotNull Context context) throws IllegalAccessException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(context, "context");
            int i10 = AdvertisingIdClient.f25284a;
            Object objInvoke = AdvertisingIdClient.class.getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            Object objInvoke2 = AdvertisingIdClient.Info.class.getDeclaredMethod("getId", null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) objInvoke2;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
            Object objInvoke3 = AdvertisingIdClient.Info.class.getDeclaredMethod(C4240b4.j.M, null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke3, "null cannot be cast to non-null type kotlin.Boolean");
            this.isLimitAdTrackingEnabled = ((Boolean) objInvoke3).booleanValue();
            super.extractParams$advertising_release(context);
        }

        @Override // com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile
        public boolean isEnabled$advertising_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i10 = AdvertisingIdClient.f25284a;
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$HuaweiAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "<init>", "()V", "isEnabled", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "isEnabled$advertising_release", "extractParams", "", "extractParams$advertising_release", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HuaweiAdvertisingProfile extends AdvertisingProfile {
        @Override // com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile
        public void extractParams$advertising_release(@NotNull Context context) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(context, "context");
            Object objInvoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            Class<?> cls = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient$Info");
            Object objInvoke2 = cls.getDeclaredMethod("getId", null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) objInvoke2;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
            Object objInvoke3 = cls.getDeclaredMethod(C4240b4.j.M, null).invoke(objInvoke, null);
            Intrinsics.checkNotNull(objInvoke3, "null cannot be cast to non-null type kotlin.Boolean");
            this.isLimitAdTrackingEnabled = ((Boolean) objInvoke3).booleanValue();
            super.extractParams$advertising_release(context);
        }

        @Override // com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile
        public boolean isEnabled$advertising_release(@NotNull Context context) throws ClassNotFoundException {
            Intrinsics.checkNotNullParameter(context, "context");
            Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            return true;
        }
    }

    public static final DefaultAdvertisingProfile access$getDefaultProfile(AdvertisingInfo advertisingInfo, Context context) {
        advertisingInfo.getClass();
        DefaultAdvertisingProfile defaultAdvertisingProfile = DefaultAdvertisingProfile.INSTANCE;
        defaultAdvertisingProfile.extractParams$advertising_release(context);
        return defaultAdvertisingProfile;
    }

    @Nullable
    public final Object fetchAdvertisingProfile(@NotNull Context context, @NotNull Continuation continuation) {
        Object objG = eg.g.g(o0.b(), new a(context, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Nullable
    public final Object getAdvertisingProfile(@NotNull Context context, @NotNull Continuation continuation) {
        return eg.g.g(o0.b(), new c(context, null), continuation);
    }
}
