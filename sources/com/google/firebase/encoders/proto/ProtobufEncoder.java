package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ProtobufEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ObjectEncoder f32792c;

    ProtobufEncoder(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f32790a = map;
        this.f32791b = map2;
        this.f32792c = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new ProtobufDataEncoderContext(outputStream, this.f32790a, this.f32791b, this.f32792c).l(obj);
    }

    public static final class Builder implements EncoderConfig<Builder> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ObjectEncoder f32793d = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.b
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
                ProtobufEncoder.Builder.a(obj, objectEncoderContext);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f32794a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f32795b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ObjectEncoder f32796c = f32793d;

        public static /* synthetic */ void a(Object obj, ObjectEncoderContext objectEncoderContext) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.f32794a), new HashMap(this.f32795b), this.f32796c);
        }

        @NonNull
        public Builder configureWith(@NonNull Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        @NonNull
        public Builder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
            this.f32796c = objectEncoder;
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.f32794a.put(cls, objectEncoder);
            this.f32795b.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder) {
            this.f32795b.put(cls, valueEncoder);
            this.f32794a.remove(cls);
            return this;
        }
    }

    @NonNull
    public byte[] encode(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
