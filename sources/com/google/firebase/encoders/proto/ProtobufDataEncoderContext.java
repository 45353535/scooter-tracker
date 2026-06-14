package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.WorkInfo;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.proto.Protobuf;
import com.ironsource.C4240b4;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f32780f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final FieldDescriptor f32781g = FieldDescriptor.builder(C4240b4.i.W).withProperty(AtProtobuf.builder().tag(1).build()).build();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final FieldDescriptor f32782h = FieldDescriptor.builder("value").withProperty(AtProtobuf.builder().tag(2).build()).build();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ObjectEncoder f32783i = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.a
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            ProtobufDataEncoderContext.a((Map.Entry) obj, objectEncoderContext);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f32784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ObjectEncoder f32787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ProtobufValueEncoderContext f32788e = new ProtobufValueEncoderContext(this);

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32789a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f32789a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32789a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32789a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ProtobufDataEncoderContext(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f32784a = outputStream;
        this.f32785b = map;
        this.f32786c = map2;
        this.f32787d = objectEncoder;
    }

    public static /* synthetic */ void a(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(f32781g, entry.getKey());
        objectEncoderContext.add(f32782h, entry.getValue());
    }

    private static ByteBuffer h(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long i(ObjectEncoder objectEncoder, Object obj) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.f32784a;
            this.f32784a = lengthCountingOutputStream;
            try {
                objectEncoder.encode(obj, this);
                this.f32784a = outputStream;
                long jM = lengthCountingOutputStream.m();
                lengthCountingOutputStream.close();
                return jM;
            } catch (Throwable th2) {
                this.f32784a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private ProtobufDataEncoderContext j(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z10) throws IOException {
        long jI = i(objectEncoder, obj);
        if (z10 && jI == 0) {
            return this;
        }
        o((n(fieldDescriptor) << 3) | 2);
        p(jI);
        objectEncoder.encode(obj, this);
        return this;
    }

    private ProtobufDataEncoderContext k(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z10) {
        this.f32788e.b(fieldDescriptor, z10);
        valueEncoder.encode(obj, this.f32788e);
        return this;
    }

    private static Protobuf m(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int n(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void o(int i10) throws IOException {
        while ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            this.f32784a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f32784a.write(i10 & 127);
    }

    private void p(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f32784a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f32784a.write(((int) j10) & 127);
    }

    ObjectEncoderContext b(FieldDescriptor fieldDescriptor, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        o((n(fieldDescriptor) << 3) | 1);
        this.f32784a.write(h(8).putDouble(d10).array());
        return this;
    }

    ObjectEncoderContext c(FieldDescriptor fieldDescriptor, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        o((n(fieldDescriptor) << 3) | 5);
        this.f32784a.write(h(4).putFloat(f10).array());
        return this;
    }

    ObjectEncoderContext d(FieldDescriptor fieldDescriptor, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    o((n(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f32780f);
                    o(bytes.length);
                    this.f32784a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    d(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    j(f32783i, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return b(fieldDescriptor, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return c(fieldDescriptor, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return f(fieldDescriptor, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return g(fieldDescriptor, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder objectEncoder = (ObjectEncoder) this.f32785b.get(obj.getClass());
                    if (objectEncoder != null) {
                        return j(objectEncoder, fieldDescriptor, obj, z10);
                    }
                    ValueEncoder valueEncoder = (ValueEncoder) this.f32786c.get(obj.getClass());
                    return valueEncoder != null ? k(valueEncoder, fieldDescriptor, obj, z10) : obj instanceof ProtoEnum ? add(fieldDescriptor, ((ProtoEnum) obj).getNumber()) : obj instanceof Enum ? add(fieldDescriptor, ((Enum) obj).ordinal()) : j(this.f32787d, fieldDescriptor, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    o((n(fieldDescriptor) << 3) | 2);
                    o(bArr.length);
                    this.f32784a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    ProtobufDataEncoderContext e(FieldDescriptor fieldDescriptor, int i10, boolean z10) {
        if (!z10 || i10 != 0) {
            Protobuf protobufM = m(fieldDescriptor);
            int i11 = AnonymousClass1.f32789a[protobufM.intEncoding().ordinal()];
            if (i11 == 1) {
                o(protobufM.tag() << 3);
                o(i10);
                return this;
            }
            if (i11 == 2) {
                o(protobufM.tag() << 3);
                o((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                o((protobufM.tag() << 3) | 5);
                this.f32784a.write(h(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    ProtobufDataEncoderContext f(FieldDescriptor fieldDescriptor, long j10, boolean z10) {
        if (!z10 || j10 != 0) {
            Protobuf protobufM = m(fieldDescriptor);
            int i10 = AnonymousClass1.f32789a[protobufM.intEncoding().ordinal()];
            if (i10 == 1) {
                o(protobufM.tag() << 3);
                p(j10);
                return this;
            }
            if (i10 == 2) {
                o(protobufM.tag() << 3);
                p((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                o((protobufM.tag() << 3) | 1);
                this.f32784a.write(h(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    ProtobufDataEncoderContext g(FieldDescriptor fieldDescriptor, boolean z10, boolean z11) {
        return e(fieldDescriptor, z10 ? 1 : 0, z11);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        return l(obj);
    }

    ProtobufDataEncoderContext l(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f32785b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        return add(FieldDescriptor.of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, double d10) throws IOException {
        return add(FieldDescriptor.of(str), d10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, int i10) throws IOException {
        return add(FieldDescriptor.of(str), i10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, long j10) throws IOException {
        return add(FieldDescriptor.of(str), j10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, boolean z10) throws IOException {
        return add(FieldDescriptor.of(str), z10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return d(fieldDescriptor, obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d10) throws IOException {
        return b(fieldDescriptor, d10, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f10) throws IOException {
        return c(fieldDescriptor, f10, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i10) throws IOException {
        return e(fieldDescriptor, i10, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j10) throws IOException {
        return f(fieldDescriptor, j10, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z10) throws IOException {
        return g(fieldDescriptor, z10, true);
    }
}
