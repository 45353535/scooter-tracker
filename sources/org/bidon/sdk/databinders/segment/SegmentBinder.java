package org.bidon.sdk.databinders.segment;

import com.ironsource.A1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bidon.sdk.databinders.DataBinder;
import org.bidon.sdk.segment.SegmentSynchronizer;
import org.bidon.sdk.segment.models.Gender;
import org.bidon.sdk.segment.models.SegmentAttributes;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/databinders/segment/SegmentBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "Lorg/json/JSONObject;", "segmentSynchronizer", "Lorg/bidon/sdk/segment/SegmentSynchronizer;", "<init>", "(Lorg/bidon/sdk/segment/SegmentSynchronizer;)V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SegmentBinder implements DataBinder<JSONObject> {

    @NotNull
    private final String fieldName;

    @NotNull
    private final SegmentSynchronizer segmentSynchronizer;

    public SegmentBinder(@NotNull SegmentSynchronizer segmentSynchronizer) {
        Intrinsics.checkNotNullParameter(segmentSynchronizer, "segmentSynchronizer");
        this.segmentSynchronizer = segmentSynchronizer;
        this.fieldName = A1.f40174i;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        SegmentAttributesRequestBody segmentAttributesRequestBody;
        JSONObject jSONObjectSerialize;
        String segmentUid = this.segmentSynchronizer.getSegmentUid();
        SegmentAttributes attributes = this.segmentSynchronizer.getAttributes();
        String string = null;
        if (attributes.getAge() == null && attributes.getGender() == null && attributes.getCustomAttributes().isEmpty() && attributes.getInAppAmount() == null && attributes.isPaying() == null && attributes.getGameLevel() == null) {
            segmentAttributesRequestBody = null;
        } else {
            Integer age = attributes.getAge();
            Gender gender = attributes.getGender();
            segmentAttributesRequestBody = new SegmentAttributesRequestBody(age, gender != null ? gender.getCode() : null, attributes.getCustomAttributes(), attributes.getInAppAmount(), attributes.isPaying(), attributes.getGameLevel());
        }
        if (segmentAttributesRequestBody == null && (segmentUid == null || StringsKt.y0(segmentUid))) {
            return null;
        }
        if (segmentAttributesRequestBody != null && (jSONObjectSerialize = SerializerKt.serialize(segmentAttributesRequestBody)) != null) {
            string = jSONObjectSerialize.toString();
        }
        return SerializerKt.serialize(new SegmentRequestBody(segmentUid, string));
    }
}
