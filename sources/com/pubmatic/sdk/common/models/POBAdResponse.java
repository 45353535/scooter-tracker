package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBAdResponse<T extends POBAdDescriptor> implements POBBidsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f62337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f62338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f62339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBAdDescriptor f62340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBAdDescriptor f62341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f62342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f62343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f62344h;

    @NonNull
    public static <T extends POBAdDescriptor> POBAdResponse<T> defaultResponse() {
        POBAdResponse<T> pOBAdResponse = new POBAdResponse<>();
        ((POBAdResponse) pOBAdResponse).f62337a = new ArrayList();
        ((POBAdResponse) pOBAdResponse).f62342f = 30;
        return pOBAdResponse;
    }

    @Nullable
    public POBAdDescriptor getBid(@Nullable String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            return null;
        }
        for (POBAdDescriptor pOBAdDescriptor : this.f62337a) {
            if (str.equals(pOBAdDescriptor.getId())) {
                return pOBAdDescriptor;
            }
        }
        return null;
    }

    @NonNull
    public List<T> getBids() {
        return this.f62337a;
    }

    @Nullable
    public JSONObject getCustomData() {
        return this.f62343g;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidsProvider
    @Nullable
    public Integer getNbrCode() {
        return this.f62338b;
    }

    @Nullable
    public T getNextHighestDynamicBid() {
        return (T) this.f62341e;
    }

    public int getRefreshInterval() {
        return this.f62342f;
    }

    @Nullable
    public List<T> getServerSidePartnerBids() {
        return this.f62339c;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidsProvider
    @Nullable
    public Map<String, String> getTargetingInfo() {
        Map<String, String> targetingInfo;
        Map<String, String> targetingInfo2;
        HashMap map = new HashMap();
        if (this.f62344h) {
            for (T t10 : getBids()) {
                if (t10 != null && (targetingInfo2 = t10.getTargetingInfo()) != null) {
                    try {
                        map.putAll(targetingInfo2);
                    } catch (ClassCastException | IllegalArgumentException | NullPointerException | UnsupportedOperationException unused) {
                        POBLog.error("POBAdResponse", "Failed to add targeting info", new Object[0]);
                    }
                }
            }
        } else {
            POBAdDescriptor pOBAdDescriptor = this.f62340d;
            if (pOBAdDescriptor != null && (targetingInfo = pOBAdDescriptor.getTargetingInfo()) != null) {
                map.putAll(targetingInfo);
            }
        }
        if (map.size() == 0) {
            return null;
        }
        return map;
    }

    @Nullable
    public T getWinningBid() {
        return (T) this.f62340d;
    }

    public boolean isSendAllBidsEnabled() {
        return this.f62344h;
    }

    public static class Builder<T extends POBAdDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f62345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f62346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f62347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private POBAdDescriptor f62348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private POBAdDescriptor f62349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f62350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private JSONObject f62351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f62352h;

        public Builder(@NonNull List<T> list) {
            this.f62345a = list;
        }

        private List a(List list, String str) {
            POBAdDescriptor pOBAdDescriptorBuildWithRefreshAndExpiryTimeout;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                POBAdDescriptor pOBAdDescriptor = (POBAdDescriptor) it.next();
                if (pOBAdDescriptor != null && (pOBAdDescriptorBuildWithRefreshAndExpiryTimeout = pOBAdDescriptor.buildWithRefreshAndExpiryTimeout(this.f62350f, a(pOBAdDescriptor, str))) != null) {
                    arrayList.add(pOBAdDescriptorBuildWithRefreshAndExpiryTimeout);
                }
            }
            list.clear();
            list.addAll(arrayList);
            return list;
        }

        @NonNull
        public POBAdResponse<T> build() {
            POBAdResponse<T> pOBAdResponse = new POBAdResponse<>();
            ((POBAdResponse) pOBAdResponse).f62337a = this.f62345a;
            ((POBAdResponse) pOBAdResponse).f62338b = this.f62346b;
            ((POBAdResponse) pOBAdResponse).f62339c = this.f62347c;
            ((POBAdResponse) pOBAdResponse).f62340d = this.f62348d;
            ((POBAdResponse) pOBAdResponse).f62342f = this.f62350f;
            ((POBAdResponse) pOBAdResponse).f62343g = this.f62351g;
            ((POBAdResponse) pOBAdResponse).f62344h = this.f62352h;
            ((POBAdResponse) pOBAdResponse).f62341e = this.f62349e;
            return pOBAdResponse;
        }

        public Builder<T> setNbrCode(@Nullable Integer num) {
            this.f62346b = num;
            return this;
        }

        @NonNull
        public Builder<T> setNextHighestDynamicBid(@Nullable T t10) {
            this.f62349e = t10;
            return this;
        }

        public Builder<T> setRefreshInterval(int i10) {
            this.f62350f = i10;
            return this;
        }

        public Builder<T> setSendAllBidsState(boolean z10) {
            this.f62352h = z10;
            return this;
        }

        public Builder<T> setServerSidePartnerBids(List<T> list) {
            this.f62347c = list;
            return this;
        }

        public Builder<T> setWinningBid(@Nullable T t10) {
            this.f62348d = t10;
            return this;
        }

        public Builder<T> updateWinningBid(@NonNull T t10) {
            if (this.f62345a.remove(t10)) {
                this.f62345a.add(t10);
            }
            List list = this.f62347c;
            if (list != null && list.remove(t10)) {
                this.f62347c.add(t10);
            }
            this.f62348d = t10;
            return this;
        }

        public Builder<T> updateWithRefreshIntervalAndExpiryTimeout(@NonNull String str) {
            List list = this.f62347c;
            if (list != null) {
                a(list, str);
            }
            a(this.f62345a, str);
            POBAdDescriptor pOBAdDescriptor = this.f62348d;
            if (pOBAdDescriptor != null) {
                this.f62348d = pOBAdDescriptor.buildWithRefreshAndExpiryTimeout(this.f62350f, a(pOBAdDescriptor, str));
            }
            return this;
        }

        public Builder(@NonNull POBAdResponse<T> pOBAdResponse) {
            this.f62345a = ((POBAdResponse) pOBAdResponse).f62337a;
            this.f62346b = ((POBAdResponse) pOBAdResponse).f62338b;
            this.f62347c = ((POBAdResponse) pOBAdResponse).f62339c;
            this.f62348d = ((POBAdResponse) pOBAdResponse).f62340d;
            this.f62350f = ((POBAdResponse) pOBAdResponse).f62342f;
            this.f62351g = ((POBAdResponse) pOBAdResponse).f62343g;
            this.f62352h = ((POBAdResponse) pOBAdResponse).f62344h;
            this.f62349e = ((POBAdResponse) pOBAdResponse).f62341e;
        }

        private int a(POBAdDescriptor pOBAdDescriptor, String str) {
            String str2;
            int iHashCode = str.hashCode();
            if (iHashCode == -1183997287) {
                if (!str.equals("inline") || pOBAdDescriptor.isVideo()) {
                    return Constants.ONE_HOUR;
                }
                return 300000;
            }
            if (iHashCode == -1052618729) {
                str2 = "native";
            } else {
                if (iHashCode != 604727084) {
                    return Constants.ONE_HOUR;
                }
                str2 = "interstitial";
            }
            str.equals(str2);
            return Constants.ONE_HOUR;
        }

        public Builder(@NonNull JSONObject jSONObject) {
            this.f62345a = new ArrayList();
            this.f62351g = jSONObject;
        }
    }

    private POBAdResponse() {
        this.f62337a = new ArrayList();
    }
}
