package com.ironsource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0 f41604a;

    public Q1(D0 d02) {
        this.f41604a = d02;
    }

    public void a(@Nullable Double d10) {
        HashMap map;
        if (d10 != null) {
            map = new HashMap();
            map.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10);
        } else {
            map = null;
        }
        this.f41604a.a(A0.AUCTION_REQUEST, map);
    }

    public void b(String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f41604a.a(A0.AUCTION_REQUEST_WATERFALL, map);
    }

    public void c(String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f41604a.a(A0.AUCTION_RESULT_WATERFALL, map);
    }

    String a(int i10, int i11, int i12, int i13) {
        return "interstitial" + C4240b4.j.f42668b + i10 + ";rewarded" + C4240b4.j.f42668b + i11 + ";banner" + C4240b4.j.f42668b + i12 + ";native" + C4240b4.j.f42668b + i13;
    }

    public void a(long j10, int i10, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f41604a.a(A0.AUCTION_FAILED, map);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f41604a.a(A0.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    public void a(long j10, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f41604a.a(A0.AUCTION_SUCCESS, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        map.put("auctionId", str);
        this.f41604a.a(A0.AD_FORMAT_CAPPED, map);
    }
}
