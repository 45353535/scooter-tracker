package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4462o4;
import com.ironsource.C4638yb;
import com.ironsource.W8;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class AdInfo {

    @Nullable
    private final W8 impressionData;

    @Nullable
    private final C4638yb loadArmData;

    public AdInfo(@Nullable W8 w82, @Nullable C4638yb c4638yb) {
        this.impressionData = w82;
        this.loadArmData = c4638yb;
    }

    @NotNull
    public final String getAb() {
        W8 w82 = this.impressionData;
        return (w82 == null || w82.a() == null) ? "" : this.impressionData.a();
    }

    @NotNull
    public final String getAdNetwork() {
        W8 w82 = this.impressionData;
        return (w82 == null || w82.c() == null) ? "" : this.impressionData.c();
    }

    @NotNull
    public final String getAuctionId() {
        W8 w82 = this.impressionData;
        return (w82 == null || w82.e() == null) ? "" : this.impressionData.e();
    }

    @NotNull
    public final String getCountry() {
        W8 w82 = this.impressionData;
        return (w82 == null || w82.f() == null) ? "" : this.impressionData.f();
    }

    @NotNull
    public final String getEncryptedCPM() {
        W8 w82 = this.impressionData;
        return (w82 == null || w82.h() == null) ? "" : this.impressionData.h();
    }

    @NotNull
    public final String getInstanceId() {
        W8 w82 = this.impressionData;
        return (w82 == null || w82.i() == null) ? "" : this.impressionData.i();
    }

    @NotNull
    public final String getInstanceName() {
        W8 w82 = this.impressionData;
        return (w82 == null || w82.j() == null) ? "" : this.impressionData.j();
    }

    @NotNull
    public final String getPrecision() {
        C4638yb c4638yb = this.loadArmData;
        if (c4638yb != null) {
            return c4638yb.c();
        }
        W8 w82 = this.impressionData;
        return (w82 == null || w82.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        C4638yb c4638yb = this.loadArmData;
        if (c4638yb != null) {
            return c4638yb.d();
        }
        W8 w82 = this.impressionData;
        if (w82 == null) {
            return 0.0d;
        }
        w82.o();
        return this.impressionData.o();
    }

    @NotNull
    public final String getSegmentName() {
        W8 w82 = this.impressionData;
        return (w82 == null || w82.p() == null) ? "" : this.impressionData.p();
    }

    @NotNull
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("country", getCountry());
            jSONObject.put("ab", getAb());
            jSONObject.put("segmentName", getSegmentName());
            jSONObject.put("adNetwork", getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("error while parsing ad info " + e10.getMessage());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInfoData.toString()");
        return string;
    }
}
