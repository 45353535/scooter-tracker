package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4954a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f76779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f76780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f76781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f76782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f76783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f76784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f76785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f76786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f76787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f76788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f76789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f76790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f76791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C5012ca f76792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f76793o;

    public C4954a4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j10, long j11, C5012ca c5012ca, Bundle bundle) {
        this.f76779a = identifiersResult;
        this.f76780b = identifiersResult2;
        this.f76781c = identifiersResult3;
        this.f76782d = identifiersResult4;
        this.f76783e = identifiersResult5;
        this.f76784f = identifiersResult6;
        this.f76785g = identifiersResult7;
        this.f76786h = identifiersResult8;
        this.f76787i = identifiersResult9;
        this.f76788j = identifiersResult10;
        this.f76789k = identifiersResult11;
        this.f76790l = j10;
        this.f76791m = j11;
        this.f76792n = c5012ca;
        this.f76793o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f76779a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f76780b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f76781c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f76782d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f76783e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f76784f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f76785g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f76786h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle(IronSourceConstants.TYPE_GAID, bundle9);
        IdentifiersResult identifiersResult9 = this.f76787i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f76788j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f76789k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f76790l);
        bundle.putLong("NextStartupTime", this.f76791m);
        C5012ca c5012ca = this.f76792n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c5012ca);
        bundle.putBundle(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY, bundle13);
        bundle.putBundle("module_configs", C5468ua.H.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f76779a + ", mDeviceIdData=" + this.f76780b + ", mDeviceIdHashData=" + this.f76781c + ", mReportAdUrlData=" + this.f76782d + ", mGetAdUrlData=" + this.f76783e + ", mResponseClidsData=" + this.f76784f + ", mClientClidsForRequestData=" + this.f76785g + ", mGaidData=" + this.f76786h + ", mHoaidData=" + this.f76787i + ", yandexAdvIdData=" + this.f76788j + ", customSdkHostsData=" + this.f76789k + ", mServerTimeOffset=" + this.f76790l + ", nextStartupTime=" + this.f76791m + ", features=" + this.f76792n + ", modulesConfig=" + this.f76793o + '}';
    }

    public static C5012ca a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY);
        ClassLoader classLoader = C5012ca.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C5012ca c5012ca = (C5012ca) parcelable;
        return c5012ca == null ? new C5012ca(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c5012ca;
    }

    public static IdentifiersResult a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    public static C5012ca a(Boolean bool) {
        boolean z10 = bool != null;
        return new C5012ca(bool, z10 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z10 ? null : "no identifier in startup state");
    }
}
