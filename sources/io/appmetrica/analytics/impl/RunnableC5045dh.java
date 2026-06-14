package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5045dh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C5068ef c5068efZ = C5468ua.H.z();
        if (timePassedChecker.didTimePassMillis(c5068efZ.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pair = TuplesKt.to("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pair2 = TuplesKt.to("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pair3 = TuplesKt.to("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kotlinVersion.getMajor());
            sb2.append('.');
            sb2.append(kotlinVersion.getMinor());
            sb2.append('.');
            sb2.append(kotlinVersion.getPatch());
            Map mapMapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("version", sb2.toString()));
            Vj vj = AbstractC5452tj.f78304a;
            vj.getClass();
            vj.a(new Uj("kotlin_version", mapMapOf));
            c5068efZ.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
