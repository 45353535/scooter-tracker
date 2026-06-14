package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4424m2;
import com.ironsource.U2;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBBid implements POBAdDescriptor {
    private boolean C;
    private String D;
    private List E;
    private POBCTAOverlayData F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f62737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f62739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f62740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f62742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f62743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f62744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f62745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f62746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f62747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f62748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f62749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f62750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f62751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f62752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f62753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f62754u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f62755v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f62756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f62757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f62758y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f62759z;
    private POBImpressionCountingMethod B = POBImpressionCountingMethod.ON_LOAD;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f62734a = System.currentTimeMillis();
    private String A = POBAdDescriptor.DYNAMIC_PRICE_BID;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final POBBid f62760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f62761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f62762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f62763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f62764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f62765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f62766g;

        public Builder(@NonNull POBBid pOBBid) {
            this.f62760a = pOBBid;
            this.f62761b = pOBBid.f62752s;
            this.f62762c = pOBBid.f62741h;
            this.f62763d = pOBBid.f62746m;
            this.f62764e = pOBBid.f62747n;
            this.f62765f = pOBBid.A;
            this.f62766g = pOBBid.f62738e;
        }

        @NonNull
        public POBBid build() {
            POBBid pOBBid = this.f62760a;
            POBBid pOBBidCreate = POBBid.create(pOBBid, pOBBid.f62749p);
            pOBBidCreate.f62752s = this.f62761b;
            pOBBidCreate.f62741h = this.f62762c;
            pOBBidCreate.f62746m = this.f62763d;
            pOBBidCreate.f62747n = this.f62764e;
            pOBBidCreate.A = this.f62765f;
            pOBBidCreate.f62738e = this.f62766g;
            return pOBBidCreate;
        }

        @NonNull
        public Builder setBidStatus(int i10) {
            this.f62766g = i10;
            return this;
        }

        @NonNull
        public Builder setBidType(@NonNull String str) {
            this.f62765f = str;
            return this;
        }

        @NonNull
        public Builder setCreativeType(@NonNull String str) {
            this.f62761b = str;
            return this;
        }

        @NonNull
        public Builder setHeight(int i10) {
            this.f62764e = i10;
            return this;
        }

        @NonNull
        public Builder setPartnerId(@NonNull String str) {
            this.f62762c = str;
            return this;
        }

        @NonNull
        public Builder setWidth(int i10) {
            this.f62763d = i10;
            return this;
        }
    }

    private POBBid() {
    }

    @NonNull
    public static POBBid build(@NonNull String str, @NonNull JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONArray jSONArrayOptJSONArray;
        int i10;
        List list;
        POBBid pOBBid = new POBBid();
        pOBBid.f62750q = jSONObject;
        pOBBid.f62735b = jSONObject.optString("impid");
        pOBBid.f62736c = jSONObject.optString("id");
        pOBBid.f62743j = jSONObject.optString("adm");
        pOBBid.f62742i = jSONObject.optString("crid");
        pOBBid.f62740g = str;
        double dOptDouble = jSONObject.optDouble("price", 0.0d);
        pOBBid.f62737d = dOptDouble;
        pOBBid.f62738e = dOptDouble > 0.0d ? 1 : 0;
        String strOptString = jSONObject.optString("dealid");
        if (!POBUtils.isNullOrEmpty(strOptString)) {
            pOBBid.f62744k = strOptString;
        }
        pOBBid.f62745l = jSONObject.optString(C4424m2.A);
        pOBBid.f62746m = jSONObject.optInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
        pOBBid.f62747n = jSONObject.optInt("h");
        pOBBid.f62751r = jSONObject.optString(C4424m2.f43627z);
        pOBBid.D = jSONObject.optString("bundle", null);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("ext");
        if (jSONObjectOptJSONObject5 != null) {
            pOBBid.f62759z = jSONObjectOptJSONObject5.optInt(Reporting.EventType.WINNER) == 1;
            String strOptString2 = jSONObjectOptJSONObject5.optString("crtype");
            pOBBid.f62752s = strOptString2;
            pOBBid.f62757x = "video".equals(strOptString2);
            if (jSONObjectOptJSONObject5.optInt("imp_ct_mthd", 0) == 1) {
                pOBBid.B = POBImpressionCountingMethod.ONE_PX_VIEWABLE;
            } else {
                pOBBid.B = POBImpressionCountingMethod.ON_LOAD;
            }
            int iOptInt = jSONObjectOptJSONObject5.optInt(U2.f41830b, 0);
            JSONObject jSONObjectOptJSONObject6 = pOBBid.f62757x ? jSONObjectOptJSONObject5.optJSONObject("video") : jSONObjectOptJSONObject5.optJSONObject("banner");
            if (jSONObjectOptJSONObject6 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject6.optJSONObject("clientconfig")) != null) {
                iOptInt = jSONObjectOptJSONObject3.optInt("refreshinterval", iOptInt);
                if (pOBBid.f62757x && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("reward")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("rewards")) != null && jSONArrayOptJSONArray.length() > 0) {
                    pOBBid.f62748o = new ArrayList(jSONArrayOptJSONArray.length());
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray.optJSONObject(i11);
                        if (jSONObjectOptJSONObject7 != null && jSONObjectOptJSONObject7.has("type") && jSONObjectOptJSONObject7.has("value")) {
                            String strOptString3 = jSONObjectOptJSONObject7.optString("type", "");
                            try {
                                i10 = Integer.parseInt(jSONObjectOptJSONObject7.optString("value"));
                            } catch (NumberFormatException unused) {
                                POBLog.warn("POBBid", "Received invalid reward values", new Object[0]);
                                i10 = 0;
                            }
                            if (i10 > 0 && (list = pOBBid.f62748o) != null) {
                                list.add(new POBReward(strOptString3, i10));
                            }
                        }
                    }
                }
            }
            pOBBid.f62739f = POBUtils.getValidRefreshInterval(iOptInt, 5);
            JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject5.optJSONObject("prebid");
            if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject8.optJSONObject("targeting")) != null) {
                try {
                    pOBBid.f62749p = new HashMap(4);
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObjectOptJSONObject2.getString(next);
                        Map map = pOBBid.f62749p;
                        if (map != null) {
                            map.put(next, string);
                        }
                    }
                } catch (JSONException e10) {
                    POBLog.error("POBBid", "Exception on parsing prebid object : " + e10.getMessage(), new Object[0]);
                }
            }
            JSONObject jSONObjectOptJSONObject9 = jSONObjectOptJSONObject5.optJSONObject("dsa");
            if (jSONObjectOptJSONObject9 != null) {
                pOBBid.f62753t = jSONObjectOptJSONObject9.optString("behalf");
                pOBBid.f62754u = jSONObjectOptJSONObject9.optString("paid");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject9.optJSONArray("transparency");
                if (jSONArrayOptJSONArray2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                        POBDSATransparencyInfo pOBDSATransparencyInfoBuild = POBDSATransparencyInfo.build(jSONArrayOptJSONArray2.optJSONObject(i12));
                        if (pOBDSATransparencyInfoBuild != null) {
                            arrayList.add(pOBDSATransparencyInfoBuild);
                        }
                    }
                    pOBBid.f62756w = arrayList;
                }
                pOBBid.f62755v = jSONObjectOptJSONObject9.optInt("adrender", 1) == 0;
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject5.optJSONArray("clicktrackers");
            if (!POBUtils.isJsonArrayNullOrEmpty(jSONArrayOptJSONArray3)) {
                pOBBid.E = new ArrayList(jSONArrayOptJSONArray3.length());
                for (int i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                    pOBBid.E.add(jSONArrayOptJSONArray3.optString(i13));
                }
            }
            JSONObject jSONObjectOptJSONObject10 = jSONObjectOptJSONObject5.optJSONObject("owsdk");
            if (jSONObjectOptJSONObject10 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject10.optJSONObject("ctaoverlay")) != null) {
                pOBBid.F = POBCTAOverlayData.parse(jSONObjectOptJSONObject);
            }
        }
        return pOBBid;
    }

    @NonNull
    public static POBBid create(@NonNull POBBid pOBBid, @Nullable Map<String, String> map) {
        POBBid pOBBid2 = new POBBid();
        a(pOBBid2, pOBBid);
        Map map2 = pOBBid.f62749p;
        if (map2 == null || map2.isEmpty()) {
            pOBBid2.f62749p = map;
            return pOBBid2;
        }
        pOBBid2.f62749p = pOBBid.f62749p;
        return pOBBid2;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public POBAdDescriptor buildWithRefreshAndExpiryTimeout(int i10, int i11) {
        POBBid pOBBidCreate = create(this, this.f62749p);
        pOBBidCreate.f62739f = i10;
        pOBBidCreate.f62758y = i11;
        return pOBBidCreate;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean enableDsaInfoIcon() {
        if (this.f62755v) {
            return (POBUtils.isNullOrEmpty(this.f62753t) && POBUtils.isNullOrEmpty(this.f62754u)) ? false : true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POBBid) || (str = this.f62736c) == null) {
            return false;
        }
        return str.equals(((POBBid) obj).getId());
    }

    @Nullable
    public List<POBReward> getAllRewards() {
        return this.f62748o;
    }

    @NonNull
    public String getBidType() {
        return this.A;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getBundle() {
        return this.D;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public POBCTAOverlayData getCTAOverlayData() {
        return this.F;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.E;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.f62747n;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.f62746m;
    }

    @Nullable
    public String getCreative() {
        return this.f62743j;
    }

    @Nullable
    public String getCreativeId() {
        return this.f62742i;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return this.f62752s;
    }

    @Nullable
    public String getDealId() {
        return this.f62744k;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return this.f62753t;
    }

    @Nullable
    public POBReward getFirstReward() {
        List list = this.f62748o;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (POBReward) this.f62748o.get(0);
    }

    public int getHeight() {
        return this.f62747n;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getId() {
        return this.f62736c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @NonNull
    public POBImpressionCountingMethod getImpressionCountingMethod() {
        return this.B;
    }

    @Nullable
    public String getImpressionId() {
        return this.f62735b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return this.f62754u;
    }

    @Nullable
    public String getPartnerId() {
        return this.f62741h;
    }

    @Nullable
    public String getPartnerName() {
        return this.f62740g;
    }

    public double getPrice() {
        return this.f62737d;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getRawBid() {
        return this.f62750q;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getRefreshInterval() {
        return this.f62739f;
    }

    public int getRemainingExpirationTime() {
        return (int) (this.f62758y - (System.currentTimeMillis() - this.f62734a));
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getRenderableContent() {
        return this.f62743j;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getStatus() {
        return this.f62738e;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public Map<String, String> getTargetingInfo() {
        if (this.f62738e == 1) {
            return this.f62749p;
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return this.f62756w;
    }

    public int getWidth() {
        return this.f62746m;
    }

    @Nullable
    public String getlURL() {
        return this.f62751r;
    }

    @Nullable
    public String getnURL() {
        return this.f62745l;
    }

    public boolean hasWon() {
        return this.C;
    }

    public int hashCode() {
        return (this.f62750q + this.f62735b + this.f62738e).hashCode();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return false;
    }

    public boolean isExpired() {
        return getRemainingExpirationTime() <= 0;
    }

    public boolean isServerSideAuctionWinner() {
        return this.f62759z;
    }

    public boolean isStaticBid() {
        return "static".equals(this.A);
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return this.f62757x;
    }

    public void setHasWon(boolean z10) {
        this.C = z10;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Price=");
        sb2.append(this.f62737d);
        sb2.append("PartnerName=");
        sb2.append(this.f62740g);
        sb2.append("impressionId");
        sb2.append(this.f62735b);
        sb2.append("bidId");
        sb2.append(this.f62736c);
        sb2.append("creativeId=");
        sb2.append(this.f62742i);
        if (this.f62748o != null) {
            sb2.append("Reward List:");
            sb2.append(this.f62748o.toString());
        }
        if (this.f62749p != null) {
            sb2.append(" Prebid targeting Info:");
            sb2.append(this.f62749p.toString());
        }
        return sb2.toString();
    }

    private static void a(POBBid pOBBid, POBBid pOBBid2) {
        pOBBid.f62735b = pOBBid2.f62735b;
        pOBBid.f62736c = pOBBid2.f62736c;
        pOBBid.f62737d = pOBBid2.f62737d;
        pOBBid.f62738e = pOBBid2.f62738e;
        pOBBid.f62739f = pOBBid2.f62739f;
        pOBBid.f62758y = pOBBid2.f62758y;
        pOBBid.f62740g = pOBBid2.f62740g;
        pOBBid.f62742i = pOBBid2.f62742i;
        pOBBid.f62743j = pOBBid2.f62743j;
        pOBBid.f62744k = pOBBid2.f62744k;
        pOBBid.f62745l = pOBBid2.f62745l;
        pOBBid.f62746m = pOBBid2.f62746m;
        pOBBid.f62747n = pOBBid2.f62747n;
        pOBBid.f62748o = pOBBid2.f62748o;
        pOBBid.f62757x = pOBBid2.f62757x;
        pOBBid.f62752s = pOBBid2.f62752s;
        pOBBid.f62741h = pOBBid2.f62741h;
        pOBBid.f62759z = pOBBid2.f62759z;
        pOBBid.f62750q = pOBBid2.f62750q;
        pOBBid.f62751r = pOBBid2.f62751r;
        pOBBid.A = pOBBid2.A;
        pOBBid.D = pOBBid2.D;
        pOBBid.C = pOBBid2.C;
        pOBBid.f62749p = pOBBid2.f62749p;
        pOBBid.f62753t = pOBBid2.f62753t;
        pOBBid.f62754u = pOBBid2.f62754u;
        pOBBid.f62755v = pOBBid2.f62755v;
        pOBBid.f62756w = pOBBid2.f62756w;
        pOBBid.B = pOBBid2.B;
        pOBBid.E = pOBBid2.E;
        pOBBid.F = pOBBid2.F;
    }
}
