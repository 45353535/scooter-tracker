package com.pubmatic.sdk.openwrap.core.nativead;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.pubmatic.sdk.common.log.POBLog;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestTitleAsset;", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestAsset;", "", "id", "", "isRequired", SessionDescription.ATTR_LENGTH, "<init>", "(IZI)V", "getLength", "()I", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "I", "Lorg/json/JSONObject;", "getRTBJSON", "()Lorg/json/JSONObject;", "RTBJSON", y.f66058y, "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public final class POBCoreNativeRequestTitleAsset extends POBCoreNativeRequestAsset {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int length;

    public /* synthetic */ POBCoreNativeRequestTitleAsset(int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, (i12 & 4) != 0 ? 0 : i11);
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
            int i10 = this.length;
            if (i10 > 0) {
                jSONObject2.put(POBCoreNativeConstants.NATIVE_LENGTH, i10);
            }
            jSONObject.put("title", jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            StringBuilder sb2 = new StringBuilder();
            a1 a1Var = a1.f93282a;
            String str = String.format("JSON exception encountered while creating the JSONObject of %s class.", Arrays.copyOf(new Object[]{"POBCNativeReqTitleAsset"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb2.append(str);
            sb2.append(e10.getMessage());
            POBLog.error("POBCNativeReqTitleAsset", sb2.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public POBCoreNativeRequestTitleAsset(int i10, boolean z10, int i11) {
        super(i10, z10);
        this.length = i11;
    }
}
