package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appodeal.ads.modules.common.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5070eh implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f77126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f77127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5440t7 f77128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ob f77129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f77130e;

    public C5070eh(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Ob());
    }

    public final void a(@NonNull C5440t7 c5440t7) {
        this.f77128c = c5440t7;
    }

    public C5070eh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Ob ob2) {
        this.f77126a = advIdWithLimitedAppender;
        this.f77127b = networkTaskForSendingDataParamsAppender;
        this.f77129d = ob2;
    }

    public final void a(long j10) {
        this.f77130e = j10;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C5351ph c5351ph) {
        builder.path(Constants.REPORT);
        this.f77127b.appendEncryptedData(builder);
        C5440t7 c5440t7 = this.f77128c;
        if (c5440t7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c5440t7.f78262a, c5351ph.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f77128c.f78263b, c5351ph.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f77128c.f78264c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f77128c.f78267f, c5351ph.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f77128c.f78269h, c5351ph.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f77128c.f78270i, c5351ph.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f77128c.f78271j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f77128c.f78265d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f77128c.f78266e);
            a(builder, "app_debuggable", this.f77128c.f78268g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f77128c.f78272k, c5351ph.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f77128c.f78273l, c5351ph.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f77128c.f78274m, c5351ph.getAppFramework()));
            a(builder, "attribution_id", this.f77128c.f78275n);
        }
        builder.appendQueryParameter("api_key_128", c5351ph.f77992m);
        builder.appendQueryParameter("app_id", c5351ph.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c5351ph.getAppPlatform());
        builder.appendQueryParameter("model", c5351ph.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c5351ph.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c5351ph.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c5351ph.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c5351ph.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c5351ph.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c5351ph.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c5351ph.f77995p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c5351ph.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c5351ph.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f77126a;
        this.f77129d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C5468ua.H.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f77130e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
