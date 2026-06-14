package com.appodeal.ads.analytics.impl;

import com.appodeal.ads.analytics.models.GeneralParams;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final Map a(GeneralParams generalParams) {
        Intrinsics.checkNotNullParameter(generalParams, "<this>");
        return MapsKt.mapOf(TuplesKt.to(EidRequestBuilder.REQUEST_FIELD_IFA, generalParams.getIfa()), TuplesKt.to("session_id", Long.valueOf(generalParams.getSessionId())), TuplesKt.to("session_uuid", generalParams.getSessionUuid()), TuplesKt.to("session_uptime", Long.valueOf(generalParams.getSessionUptimeMonoMs())), TuplesKt.to("app_uptime", Long.valueOf(generalParams.getAppUptimeMonoMs())), TuplesKt.to("app_session_average_length", Long.valueOf(generalParams.getAppSessionAverageLengthMs())), TuplesKt.to("package", generalParams.getPackageName()), TuplesKt.to("package_version", generalParams.getPackageVersion()), TuplesKt.to("version_code", Integer.valueOf(generalParams.getVersionCode())), TuplesKt.to("segment_id", Long.valueOf(generalParams.getSegmentId())), TuplesKt.to("timestamp", Long.valueOf(generalParams.getTimestampMs())));
    }
}
