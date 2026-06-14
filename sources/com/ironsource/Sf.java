package com.ironsource;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class Sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0 f41770a;

    public Sf(D0 d02) {
        this.f41770a = d02;
    }

    public void a(int i10, String str, String str2) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f41770a.a(A0.TROUBLESHOOT_NOTIFICATION_ERROR, map);
    }

    public void b(int i10, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_LOAD_FAILED, map);
    }

    public void c() {
        this.f41770a.a(A0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.f41770a.a(A0.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.f41770a.a(A0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(@NotNull String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_ILLEGAL_STATE, map);
    }

    public void g(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_INTERNAL_ERROR, map);
    }

    public void h(@NotNull String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_LOAD_SKIPPED, map);
    }

    public void i(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, map);
    }

    public void j(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, map);
    }

    public void k(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, map);
    }

    public void l(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_CLOSED, map);
    }

    public void m(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, map);
    }

    public void n(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, map);
    }

    public void o(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, map);
    }

    public void p(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, map);
    }

    public void q(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_OPENED, map);
    }

    public void r(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, map);
    }

    public void s(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, map);
    }

    public void t(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, map);
    }

    public void u(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, map);
    }

    public void v(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_WATERFALL_OVERHEAD, map);
    }

    public void c(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, map);
    }

    public void d(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, map);
    }

    public void e(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, map);
    }

    public void b() {
        this.f41770a.a(A0.TROUBLESHOOT_LOAD, null);
    }

    public void a(Long l10) {
        HashMap map = new HashMap();
        map.put("duration", l10);
        this.f41770a.a(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, map);
    }

    public void b(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_IMPRESSION_TIMEOUT, map);
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(levelPlayAdError.getErrorCode()));
        map.put("reason", levelPlayAdError.getErrorMessage());
        this.f41770a.a(A0.TROUBLESHOOT_SHOW_FAILED, map);
    }

    public void b(String str, long j10, long j11, long j12) {
        HashMap map = new HashMap();
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, a(j10, j11, j12));
        this.f41770a.a(A0.TROUBLESHOOT_BANNER_REFRESH_RESUMED, map);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        this.f41770a.a(A0.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(@NotNull String str, long j10) {
        String str2;
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "provider=" + str + ";";
        }
        sb2.append(str2);
        sb2.append("expirationDuration=");
        sb2.append(j10);
        map.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
        this.f41770a.a(A0.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(String str, long j10, long j11, long j12) {
        HashMap map = new HashMap();
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, a(j10, j11, j12));
        this.f41770a.a(A0.TROUBLESHOOT_BANNER_REFRESH_PAUSED, map);
    }

    public void a(boolean z10, long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z10 ? 1 : 0));
        map.put("duration", Long.valueOf(j10));
        this.f41770a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f41770a.a(A0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, map);
    }

    private String a(long j10, long j11, long j12) {
        return "interval: " + j10 + ", remainingTime: " + j11 + ", timePassed: " + j12;
    }

    public void a(@NonNull LevelPlayAdInfo levelPlayAdInfo, @NonNull LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f41770a.a(A0.TROUBLESHOOT_AD_INFO_CHANGED, map);
    }

    public void a() {
        this.f41770a.a(A0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, null);
    }

    public void a(W8 w82) {
        HashMap map = new HashMap();
        double dO = w82.o();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "revenue=%.3f,auctionId=%s", Double.valueOf(dO), w82.e()));
        this.f41770a.a(A0.TROUBLESHOOT_ILR_REVENUE, map);
    }

    public void a(long j10, long j11, @NotNull String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "refreshDuration=%d;notVisibleDuration=%d;reason=%s", Long.valueOf(j10), Long.valueOf(j11), str));
        this.f41770a.a(A0.TROUBLESHOOT_RELOAD, map);
    }
}
