package com.google.firebase.remoteconfig.interop.rollouts;

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
        static final RolloutAssignmentEncoder f33163a = new RolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f33164b = FieldDescriptor.of(ConfigContainer.ROLLOUT_METADATA_ID);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f33165c = FieldDescriptor.of("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f33166d = FieldDescriptor.of("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f33167e = FieldDescriptor.of("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f33168f = FieldDescriptor.of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f33164b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f33165c, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f33166d, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f33167e, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f33168f, rolloutAssignment.getTemplateVersion());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.f33163a;
        encoderConfig.registerEncoder(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
