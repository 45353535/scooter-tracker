package com.appodeal.consent;

import android.app.Activity;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB=\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/appodeal/consent/ConsentUpdateRequestParameters;", "", "", C4240b4.i.W, "", "tagForUnderAgeOfConsent", "sdk", "sdkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "getTagForUnderAgeOfConsent", "()Ljava/lang/Boolean;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getSdk", "d", "getSdkVersion", "getRequiredActivity", "()Landroid/app/Activity;", "requiredActivity", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ConsentUpdateRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Boolean tagForUnderAgeOfConsent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String sdk;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String sdkVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Activity f15372e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConsentUpdateRequestParameters(@NotNull Activity activity, @NotNull String key) {
        this(activity, key, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Activity getRequiredActivity() {
        Activity activity = this.f15372e;
        if (activity != null) {
            return activity;
        }
        throw new IllegalArgumentException(LogConstants.MSG_ACTIVITY_IS_NULL);
    }

    @Nullable
    public final String getSdk() {
        return this.sdk;
    }

    @Nullable
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public final Boolean getTagForUnderAgeOfConsent() {
        return this.tagForUnderAgeOfConsent;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConsentUpdateRequestParameters(@NotNull Activity activity, @NotNull String key, @Nullable Boolean bool) {
        this(activity, key, bool, null, null, 24, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConsentUpdateRequestParameters(@NotNull Activity activity, @NotNull String key, @Nullable Boolean bool, @Nullable String str) {
        this(activity, key, bool, str, null, 16, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    public ConsentUpdateRequestParameters(@NotNull String key, @Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.tagForUnderAgeOfConsent = bool;
        this.sdk = str;
        this.sdkVersion = str2;
    }

    public /* synthetic */ ConsentUpdateRequestParameters(String str, Boolean bool, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }

    public /* synthetic */ ConsentUpdateRequestParameters(Activity activity, String str, Boolean bool, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, str, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConsentUpdateRequestParameters(@NotNull Activity activity, @NotNull String key, @Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this(key, bool, str, str2);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f15372e = activity;
    }
}
