package io.appmetrica.analytics.impl;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5440t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f78266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f78267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f78268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f78269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f78270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f78271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f78272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f78273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f78274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f78275n;

    public C5440t7(C5270mb c5270mb) {
        this.f78262a = c5270mb.b("dId");
        this.f78263b = c5270mb.b("uId");
        this.f78264c = c5270mb.b("analyticsSdkVersionName");
        this.f78265d = c5270mb.b("kitBuildNumber");
        this.f78266e = c5270mb.b("kitBuildType");
        this.f78267f = c5270mb.b("appVer");
        this.f78268g = c5270mb.optString("app_debuggable", "0");
        this.f78269h = c5270mb.b(RemoteConfigConstants.RequestFieldKey.APP_BUILD);
        this.f78270i = c5270mb.b("osVer");
        this.f78272k = c5270mb.b(com.ironsource.N6.f41413q);
        this.f78273l = c5270mb.b("root");
        this.f78274m = c5270mb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c5270mb.optInt("osApiLev", -1);
        this.f78271j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c5270mb.optInt("attribution_id", 0);
        this.f78275n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f78262a + "', uuid='" + this.f78263b + "', analyticsSdkVersionName='" + this.f78264c + "', kitBuildNumber='" + this.f78265d + "', kitBuildType='" + this.f78266e + "', appVersion='" + this.f78267f + "', appDebuggable='" + this.f78268g + "', appBuildNumber='" + this.f78269h + "', osVersion='" + this.f78270i + "', osApiLevel='" + this.f78271j + "', locale='" + this.f78272k + "', deviceRootStatus='" + this.f78273l + "', appFramework='" + this.f78274m + "', attributionId='" + this.f78275n + "'}";
    }

    public C5440t7() {
        this.f78262a = null;
        this.f78263b = null;
        this.f78264c = null;
        this.f78265d = null;
        this.f78266e = null;
        this.f78267f = null;
        this.f78268g = null;
        this.f78269h = null;
        this.f78270i = null;
        this.f78271j = null;
        this.f78272k = null;
        this.f78273l = null;
        this.f78274m = null;
        this.f78275n = null;
    }
}
