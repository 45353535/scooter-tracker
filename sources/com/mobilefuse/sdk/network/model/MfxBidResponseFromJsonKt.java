package com.mobilefuse.sdk.network.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.json.JSONObjectGetValueOrNullKt;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.sdk.video.ClickthroughBehaviourKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"fromJson", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse$Companion;", "jsonText", "", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MfxBidResponseFromJsonKt {
    @NotNull
    public static final Either<BaseError, MfxBidResponse> fromJson(@NotNull MfxBidResponse.Companion fromJson, @NotNull String jsonText) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(fromJson, "$this$fromJson");
        Intrinsics.checkNotNullParameter(jsonText, "jsonText");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            JSONObject jSONObject = new JSONObject(jsonText);
            String string = jSONObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(\"id\")");
            double d10 = jSONObject.getDouble("cpm");
            String string2 = jSONObject.getString("crid");
            Intrinsics.checkNotNullExpressionValue(string2, "json.getString(\"crid\")");
            AdmMediaType.Companion companion = AdmMediaType.INSTANCE;
            String string3 = jSONObject.getString("type");
            Intrinsics.checkNotNullExpressionValue(string3, "json.getString(\"type\")");
            AdmMediaType admMediaTypeFromValue = companion.fromValue(string3);
            Intrinsics.checkNotNull(admMediaTypeFromValue);
            String string4 = StringsKt.v1(jSONObject.get("adm").toString()).toString();
            int i10 = jSONObject.getInt("expires");
            String stringOrNull = JSONObjectGetValueOrNullKt.getStringOrNull(jSONObject, FirebaseAnalytics.Param.CREATIVE_FORMAT);
            AdmCreativeFormat admCreativeFormatFromValue = stringOrNull != null ? AdmCreativeFormat.INSTANCE.fromValue(stringOrNull) : null;
            String stringOrNull2 = JSONObjectGetValueOrNullKt.getStringOrNull(jSONObject, "click_behavior");
            ClickthroughBehaviour clickthroughBehaviourFromValue = stringOrNull2 != null ? ClickthroughBehaviourKt.fromValue(ClickthroughBehaviour.INSTANCE, stringOrNull2) : null;
            Integer intOrNull = JSONObjectGetValueOrNullKt.getIntOrNull(jSONObject, "max_end_cards");
            Float floatOrNull = JSONObjectGetValueOrNullKt.getFloatOrNull(jSONObject, "end_card_close_seconds");
            String stringOrNull3 = JSONObjectGetValueOrNullKt.getStringOrNull(jSONObject, "loss_url");
            Boolean booleanOrNull = JSONObjectGetValueOrNullKt.getBooleanOrNull(jSONObject, "muted");
            Float floatOrNull2 = JSONObjectGetValueOrNullKt.getFloatOrNull(jSONObject, "force_skip_seconds");
            Float floatOrNull3 = JSONObjectGetValueOrNullKt.getFloatOrNull(jSONObject, "block_skip_seconds");
            Boolean booleanOrNull2 = JSONObjectGetValueOrNullKt.getBooleanOrNull(jSONObject, "should_stream_video");
            errorResult = new SuccessResult(new SuccessResult(new MfxBidResponse(string, d10, string2, admMediaTypeFromValue, string4, i10, admCreativeFormatFromValue, stringOrNull3, booleanOrNull, clickthroughBehaviourFromValue, intOrNull, floatOrNull, floatOrNull2, floatOrNull3, booleanOrNull2 != null ? booleanOrNull2.booleanValue() : false, JSONObjectGetValueOrNullKt.getBooleanOrNull(jSONObject, "force_test_mode"), JSONObjectGetValueOrNullKt.getBooleanOrNull(jSONObject, "force_structured_logging"), JSONObjectGetValueOrNullKt.getBooleanOrNull(jSONObject, "allow_clickthrough_without_tap"))));
        } catch (Throwable th2) {
            if (MfxBidResponseFromJsonKt$fromJson$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Either) value;
    }
}
