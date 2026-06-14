package com.pubmatic.sdk.openwrap.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdBuilding;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBBid;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBBidsBuilder implements POBAdBuilding<POBBid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBAdBuilding.POBAdBuilderListener f62839f;

    private JSONArray a(JSONObject jSONObject) {
        if (POBUtils.isJsonObjectNullOrEmpty(jSONObject)) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("prebid");
        if (POBUtils.isJsonObjectNullOrEmpty(jSONObjectOptJSONObject)) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONArray("seatnonbid");
    }

    @Override // com.pubmatic.sdk.common.base.POBAdBuilding
    public void build(@NonNull POBAdResponse<POBBid> pOBAdResponse) {
        JSONObject jSONObject;
        if (this.f62839f == null) {
            POBLog.error("POBBidsBuilder", "Listener is null, execution of Wrapper ad builder gets break.", new Object[0]);
            return;
        }
        POBAdResponse.Builder builder = new POBAdResponse.Builder(pOBAdResponse);
        JSONObject customData = pOBAdResponse.getCustomData();
        if (customData != null) {
            try {
                builder.setNbrCode(Integer.valueOf(customData.getInt("nbr")));
            } catch (ClassCastException | JSONException unused) {
                POBLog.info("POBBidsBuilder", "Unable to fetch nbr error code from the ad response", new Object[0]);
            }
            try {
                jSONObject = customData.getJSONObject("ext");
                try {
                    builder.setSendAllBidsState(jSONObject.optInt("sendallbids") != 0);
                } catch (JSONException unused2) {
                    POBLog.error("POBBidsBuilder", "Unable to fetch logger and tracker details", new Object[0]);
                }
            } catch (JSONException unused3) {
                jSONObject = null;
            }
            List<T> bids = pOBAdResponse.getBids();
            JSONArray jSONArrayOptJSONArray = customData.optJSONArray("seatbid");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("bid");
                        String strOptString = jSONObjectOptJSONObject.optString("seat");
                        if (strOptString.isEmpty()) {
                            strOptString = this.f62834a;
                        }
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                                POBBid pOBBidBuild = POBBid.build(strOptString, jSONArrayOptJSONArray2.optJSONObject(i11));
                                if (POBUtils.isNullOrEmpty(pOBBidBuild.getId())) {
                                    POBLog.warn("POBBidsBuilder", "Bid id is invalid and hence ignoring this OW bid.", new Object[0]);
                                } else {
                                    POBBid.Builder builder2 = new POBBid.Builder(pOBBidBuild);
                                    if (POBUtils.isNullOrEmpty(pOBBidBuild.getCreativeType())) {
                                        builder2.setCreativeType(this.f62838e);
                                    }
                                    if (POBUtils.isNullOrEmpty(pOBBidBuild.getPartnerId())) {
                                        builder2.setPartnerId(this.f62835b);
                                    }
                                    if (pOBBidBuild.getWidth() == 0) {
                                        builder2.setWidth(this.f62836c);
                                    }
                                    if (pOBBidBuild.getHeight() == 0) {
                                        builder2.setHeight(this.f62837d);
                                    }
                                    bids.add(builder2.build());
                                }
                            }
                        }
                    }
                }
            }
            JSONArray jSONArrayA = a(jSONObject);
            if (!POBUtils.isJsonArrayNullOrEmpty(jSONArrayA)) {
                POBLog.debug("POBBidsBuilder", "Received Seat Non Bids: %s", jSONArrayA.toString());
            }
            if (bids.size() > 0) {
                builder.setRefreshInterval(((POBBid) bids.get(0)).getRefreshInterval());
            }
            this.f62839f.adBuilderOnSuccess(builder.build());
        }
    }

    @Nullable
    public String getPartnerId() {
        return this.f62835b;
    }

    public void setCreativeType(@Nullable String str) {
        this.f62838e = str;
    }

    public void setHeight(int i10) {
        this.f62837d = i10;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdBuilding
    public void setListener(@Nullable POBAdBuilding.POBAdBuilderListener<POBBid> pOBAdBuilderListener) {
        this.f62839f = pOBAdBuilderListener;
    }

    public void setPartnerId(@Nullable String str) {
        this.f62835b = str;
    }

    public void setPartnerName(@Nullable String str) {
        this.f62834a = str;
    }

    public void setWidth(int i10) {
        this.f62836c = i10;
    }
}
