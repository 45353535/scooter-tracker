package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@AutoValue
@Encodable
public abstract class RolloutAssignment {
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = new JsonDataEncoderBuilder().configureWith(AutoRolloutAssignmentEncoder.CONFIG).build();

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract RolloutAssignment build();

        @NonNull
        public abstract Builder setParameterKey(@NonNull String str);

        @NonNull
        public abstract Builder setParameterValue(@NonNull String str);

        @NonNull
        public abstract Builder setRolloutId(@NonNull String str);

        @NonNull
        public abstract Builder setTemplateVersion(long j10);

        @NonNull
        public abstract Builder setVariantId(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_RolloutAssignment.Builder();
    }

    @NonNull
    public static RolloutAssignment create(@NonNull JSONObject jSONObject) throws JSONException {
        return builder().setRolloutId(jSONObject.getString(ConfigContainer.ROLLOUT_METADATA_ID)).setVariantId(jSONObject.getString("variantId")).setParameterKey(jSONObject.getString("parameterKey")).setParameterValue(jSONObject.getString("parameterValue")).setTemplateVersion(jSONObject.getLong(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER)).build();
    }

    @NonNull
    public abstract String getParameterKey();

    @NonNull
    public abstract String getParameterValue();

    @NonNull
    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    @NonNull
    public abstract String getVariantId();

    @NonNull
    public static RolloutAssignment create(@NonNull String str) throws JSONException {
        return create(new JSONObject(str));
    }
}
