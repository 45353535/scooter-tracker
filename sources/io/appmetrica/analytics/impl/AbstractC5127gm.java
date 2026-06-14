package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Set;
import kotlin.collections.SetsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5127gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f77275a = SetsKt.setOf((Object[]) new String[]{"appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f77276b = new SystemTimeProvider();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K3 f77277c = new K3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(io.appmetrica.analytics.impl.C5204jm r5, java.util.Collection r6, java.util.Map r7, kotlin.jvm.functions.Function0 r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.AbstractC5127gm.a(io.appmetrica.analytics.impl.jm, java.util.Collection, java.util.Map, kotlin.jvm.functions.Function0):boolean");
    }
}
