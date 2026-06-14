package com.pubmatic.sdk.openwrap.core.nativead;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.pubmatic.sdk.common.log.POBLog;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestDataAsset;", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestAsset;", "", "id", "", "isRequired", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeDataAssetType;", "type", "<init>", "(IZLcom/pubmatic/sdk/openwrap/core/nativead/POBNativeDataAssetType;)V", SessionDescription.ATTR_LENGTH, "", "setLength", "(I)V", "getLength", "()I", "getType", "()Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeDataAssetType;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeDataAssetType;", "d", "I", "Lorg/json/JSONObject;", "getRTBJSON", "()Lorg/json/JSONObject;", "RTBJSON", y.f66058y, "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public final class POBCoreNativeRequestDataAsset extends POBCoreNativeRequestAsset {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final POBNativeDataAssetType type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBCoreNativeRequestDataAsset(int i10, boolean z10, @NotNull POBNativeDataAssetType type) {
        super(i10, z10);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    public final int getLength() {
        return this.length;
    }

    @Override // com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestAsset
    @NotNull
    public JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", getId());
            jSONObject.put(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, getIsRequired() ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", this.type.getDataAssetTypeValue());
            int i10 = this.length;
            if (i10 > 0) {
                jSONObject2.put(POBCoreNativeConstants.NATIVE_LENGTH, i10);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            StringBuilder sb2 = new StringBuilder();
            a1 a1Var = a1.f93282a;
            String str = String.format("JSON exception encountered while creating the JSONObject of %s class.", Arrays.copyOf(new Object[]{"POBCNativeReqDataAsset"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb2.append(str);
            sb2.append(e10.getMessage());
            POBLog.error("POBCNativeReqDataAsset", sb2.toString(), new Object[0]);
            return jSONObject;
        }
    }

    @NotNull
    public final POBNativeDataAssetType getType() {
        return this.type;
    }

    public final void setLength(int length) {
        this.length = length;
    }
}
