package com.appodeal.ads.utils.session;

import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f15073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15075c;

    public f(b appTimes, e activeSession, List previousSessions) {
        Intrinsics.checkNotNullParameter(appTimes, "appTimes");
        Intrinsics.checkNotNullParameter(activeSession, "activeSession");
        Intrinsics.checkNotNullParameter(previousSessions, "previousSessions");
        this.f15073a = appTimes;
        this.f15074b = activeSession;
        this.f15075c = previousSessions;
    }

    public static f b(f fVar, b appTimes, e activeSession, List previousSessions, int i10) {
        if ((i10 & 1) != 0) {
            appTimes = fVar.f15073a;
        }
        if ((i10 & 2) != 0) {
            activeSession = fVar.f15074b;
        }
        if ((i10 & 4) != 0) {
            previousSessions = fVar.f15075c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(appTimes, "appTimes");
        Intrinsics.checkNotNullParameter(activeSession, "activeSession");
        Intrinsics.checkNotNullParameter(previousSessions, "previousSessions");
        return new f(appTimes, activeSession, previousSessions);
    }

    public final e a() {
        return this.f15074b;
    }

    public final long c() {
        b bVar = this.f15073a;
        Long l10 = bVar.f15052a != 0 ? null : 0L;
        if (l10 != null) {
            return l10.longValue();
        }
        return ((this.f15074b.f15071h != 0 ? SystemClock.elapsedRealtime() - this.f15074b.f15071h : 0L) + bVar.f15054c) / ((long) this.f15073a.f15052a);
    }

    public final long d() {
        b bVar = this.f15073a;
        Long l10 = bVar.f15052a != 0 ? null : 0L;
        if (l10 != null) {
            return l10.longValue();
        }
        return ((this.f15074b.f15070g != 0 ? System.currentTimeMillis() - this.f15074b.f15070g : 0L) + bVar.f15053b) / ((long) this.f15073a.f15052a);
    }

    public final List e() {
        return this.f15075c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f15073a, fVar.f15073a) && Intrinsics.areEqual(this.f15074b, fVar.f15074b) && Intrinsics.areEqual(this.f15075c, fVar.f15075c);
    }

    public final int hashCode() {
        return this.f15075c.hashCode() + ((this.f15074b.hashCode() + (this.f15073a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(appTimes=" + this.f15073a + ", activeSession=" + this.f15074b + ", previousSessions=" + this.f15075c + ")";
    }
}
