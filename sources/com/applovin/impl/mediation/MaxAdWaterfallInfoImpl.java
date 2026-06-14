package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f9366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f9370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a3 f9371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f9372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f9374i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(y2Var, y2Var.U(), y2Var.V(), j10, list, y2Var.N(), y2Var.T(), str, y2Var.Q());
    }

    public String getEventId() {
        return this.f9374i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f9370e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f9366a;
    }

    public String getMCode() {
        return this.f9373h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f9367b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f9369d;
    }

    public List<String> getPostbackUrls() {
        return this.f9372g;
    }

    public a3 getRequestParameters() {
        return this.f9371f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f9368c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f9367b + ", testName=" + this.f9368c + ", networkResponses=" + this.f9369d + ", latencyMillis=" + this.f9370e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable y2 y2Var, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, a3 a3Var, List<String> list2, String str3, String str4) {
        this.f9366a = y2Var;
        this.f9367b = str;
        this.f9368c = str2;
        this.f9370e = j10;
        this.f9369d = list;
        this.f9371f = a3Var;
        this.f9372g = list2;
        this.f9373h = str3;
        this.f9374i = str4;
    }
}
