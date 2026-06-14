package com.pubmatic.sdk.openwrap.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBResponseParsing;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.openwrap.core.POBBid;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBResponseParser implements POBResponseParsing<POBBid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBResponseParsing.POBResponseParserListener f62840a;

    @Override // com.pubmatic.sdk.common.base.POBResponseParsing
    public void parse(@Nullable JSONObject jSONObject) {
        POBLog.debug("POBResponseParser", "response :%s", jSONObject);
        if (jSONObject != null) {
            POBAdResponse.Builder builder = new POBAdResponse.Builder(jSONObject);
            POBResponseParsing.POBResponseParserListener pOBResponseParserListener = this.f62840a;
            if (pOBResponseParserListener != null) {
                pOBResponseParserListener.parserOnSuccess(builder.build());
                return;
            }
            return;
        }
        POBLog.error("POBResponseParser", "Listener not set to respond back for invalid input", new Object[0]);
        POBResponseParsing.POBResponseParserListener pOBResponseParserListener2 = this.f62840a;
        if (pOBResponseParserListener2 != null) {
            pOBResponseParserListener2.parserOnError(new POBError(1007, "Listener not set to respond back for invalid input"));
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBResponseParsing
    public void setListener(@NonNull POBResponseParsing.POBResponseParserListener<POBBid> pOBResponseParserListener) {
        this.f62840a = pOBResponseParserListener;
    }
}
