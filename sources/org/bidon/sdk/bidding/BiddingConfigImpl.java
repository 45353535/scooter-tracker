package org.bidon.sdk.bidding;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/bidding/BiddingConfigImpl;", "Lorg/bidon/sdk/bidding/BiddingConfig;", "Lorg/bidon/sdk/bidding/BiddingConfigSynchronizer;", "tokenTimeout", "", "<init>", "(J)V", "getTokenTimeout", "()J", "setTokenTimeout", "parse", "", "rootJsonResponse", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BiddingConfigImpl implements BiddingConfig, BiddingConfigSynchronizer {
    private long tokenTimeout;

    public BiddingConfigImpl() {
        this(0L, 1, null);
    }

    @Override // org.bidon.sdk.bidding.BiddingConfig
    public long getTokenTimeout() {
        return this.tokenTimeout;
    }

    @Override // org.bidon.sdk.bidding.BiddingConfigSynchronizer
    public void parse(@NotNull String rootJsonResponse) {
        Intrinsics.checkNotNullParameter(rootJsonResponse, "rootJsonResponse");
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObjectOptJSONObject = new JSONObject(rootJsonResponse).optJSONObject("bidding");
            setTokenTimeout(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong("token_timeout_ms", 10000L) : 10000L);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(d.a(th2));
        }
    }

    public void setTokenTimeout(long j10) {
        this.tokenTimeout = j10;
    }

    public BiddingConfigImpl(long j10) {
        this.tokenTimeout = j10;
    }

    public /* synthetic */ BiddingConfigImpl(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 10000L : j10);
    }
}
