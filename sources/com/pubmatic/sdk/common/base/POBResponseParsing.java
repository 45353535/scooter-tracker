package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface POBResponseParsing<T extends POBAdDescriptor> {

    public interface POBResponseParserListener<T extends POBAdDescriptor> {
        void parserOnError(@NonNull POBError pOBError);

        void parserOnSuccess(@NonNull POBAdResponse<T> pOBAdResponse);
    }

    void parse(@Nullable JSONObject jSONObject);

    void setListener(@NonNull POBResponseParserListener<T> pOBResponseParserListener);
}
