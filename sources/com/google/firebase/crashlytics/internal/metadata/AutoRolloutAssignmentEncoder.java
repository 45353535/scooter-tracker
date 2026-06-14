package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoRolloutAssignmentEncoder();

    private static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final RolloutAssignmentEncoder f32158a = new RolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32159b = FieldDescriptor.of(ConfigContainer.ROLLOUT_METADATA_ID);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32160c = FieldDescriptor.of("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32161d = FieldDescriptor.of("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32162e = FieldDescriptor.of("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32163f = FieldDescriptor.of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32159b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f32160c, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f32161d, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f32162e, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f32163f, rolloutAssignment.getTemplateVersion());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.f32158a;
        encoderConfig.registerEncoder(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
