package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNetworkResponseInfo.AdLoadState f9388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxMediatedNetworkInfo f9389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f9390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f9392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f9393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MaxError f9394g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9395a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f9395a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9395a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z10, long j10, String str, @Nullable MaxError maxError) {
        this.f9388a = adLoadState;
        this.f9389b = maxMediatedNetworkInfo;
        this.f9390c = bundle;
        this.f9391d = z10;
        this.f9392e = j10;
        this.f9393f = str;
        this.f9394g = maxError;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f9388a;
    }

    public String getBCode() {
        return this.f9393f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f9390c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    @Nullable
    public MaxError getError() {
        return this.f9394g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f9392e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f9389b;
    }

    public int hashCode() {
        int i10 = isBidding() ? 79 : 97;
        long latencyMillis = getLatencyMillis();
        int i11 = ((i10 + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int iHashCode = (i11 * 59) + (adLoadState == null ? 43 : adLoadState.hashCode());
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int iHashCode2 = (iHashCode * 59) + (mediatedNetwork == null ? 43 : mediatedNetwork.hashCode());
        Bundle credentials = getCredentials();
        int iHashCode3 = (iHashCode2 * 59) + (credentials == null ? 43 : credentials.hashCode());
        String bCode = getBCode();
        int iHashCode4 = (iHashCode3 * 59) + (bCode == null ? 43 : bCode.hashCode());
        MaxError error = getError();
        return (iHashCode4 * 59) + (error != null ? error.hashCode() : 43);
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.f9391d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxResponseInfo{adLoadState=" + this.f9388a + ", mediatedNetwork=" + this.f9389b + ", credentials=" + this.f9390c + ", isBidding=" + this.f9391d);
        int i10 = a.f9395a[this.f9388a.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
            }
            sb2.append("}");
            return sb2.toString();
        }
        sb2.append(", error=");
        sb2.append(this.f9394g);
        sb2.append(", latencyMillis=");
        sb2.append(this.f9392e);
        sb2.append("}");
        return sb2.toString();
    }
}
