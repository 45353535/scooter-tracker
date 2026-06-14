package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ObjectEncoder f32757e = new ObjectEncoder() { // from class: com.google.firebase.encoders.json.a
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            JsonDataEncoderBuilder.b(obj, objectEncoderContext);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ValueEncoder f32758f = new ValueEncoder() { // from class: com.google.firebase.encoders.json.b
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ValueEncoder f32759g = new ValueEncoder() { // from class: com.google.firebase.encoders.json.c
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final TimestampEncoder f32760h = new TimestampEncoder();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32761a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32762b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectEncoder f32763c = f32757e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32764d = false;

    private static final class TimestampEncoder implements ValueEncoder<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f32766a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f32766a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(@NonNull Date date, @NonNull ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add(f32766a.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, f32758f);
        registerEncoder(Boolean.class, f32759g);
        registerEncoder(Date.class, (ValueEncoder) f32760h);
    }

    public static /* synthetic */ void b(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    public DataEncoder build() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public void encode(@NonNull Object obj, @NonNull Writer writer) throws IOException {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.f32761a, JsonDataEncoderBuilder.this.f32762b, JsonDataEncoderBuilder.this.f32763c, JsonDataEncoderBuilder.this.f32764d);
                jsonValueObjectEncoderContext.a(obj, false);
                jsonValueObjectEncoderContext.c();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public String encode(@NonNull Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    encode(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    @NonNull
    public JsonDataEncoderBuilder configureWith(@NonNull Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder ignoreNullValues(boolean z10) {
        this.f32764d = z10;
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
        this.f32763c = objectEncoder;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ObjectEncoder<? super T> objectEncoder) {
        this.f32761a.put(cls, objectEncoder);
        this.f32762b.remove(cls);
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ValueEncoder<? super T> valueEncoder) {
        this.f32762b.put(cls, valueEncoder);
        this.f32761a.remove(cls);
        return this;
    }
}
