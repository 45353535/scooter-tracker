package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JsonValueObjectEncoderContext f32767a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32768b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f32769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f32770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f32771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ObjectEncoder f32772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f32773g;

    JsonValueObjectEncoderContext(Writer writer, Map map, Map map2, ObjectEncoder objectEncoder, boolean z10) {
        this.f32769c = new JsonWriter(writer);
        this.f32770d = map;
        this.f32771e = map2;
        this.f32772f = objectEncoder;
        this.f32773g = z10;
    }

    private boolean b(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private JsonValueObjectEncoderContext e(String str, Object obj) throws IOException {
        g();
        this.f32769c.name(str);
        if (obj != null) {
            return a(obj, false);
        }
        this.f32769c.nullValue();
        return this;
    }

    private JsonValueObjectEncoderContext f(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        g();
        this.f32769c.name(str);
        return a(obj, false);
    }

    private void g() throws IOException {
        if (!this.f32768b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.f32767a;
        if (jsonValueObjectEncoderContext != null) {
            jsonValueObjectEncoderContext.g();
            this.f32767a.f32768b = false;
            this.f32767a = null;
            this.f32769c.endObject();
        }
    }

    JsonValueObjectEncoderContext a(Object obj, boolean z10) {
        int i10 = 0;
        if (z10 && b(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f32769c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f32769c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f32769c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next(), false);
                }
                this.f32769c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f32769c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        add((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f32769c.endObject();
                return this;
            }
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f32770d.get(obj.getClass());
            if (objectEncoder != null) {
                return d(objectEncoder, obj, z10);
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f32771e.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return d(this.f32772f, obj, z10);
            }
            if (obj instanceof NumberedEnum) {
                add(((NumberedEnum) obj).getNumber());
                return this;
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return add((byte[]) obj);
        }
        this.f32769c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f32769c.value(r7[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                add(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f32769c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f32769c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                a(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                a(obj2, false);
            }
        }
        this.f32769c.endArray();
        return this;
    }

    void c() {
        g();
        this.f32769c.flush();
    }

    JsonValueObjectEncoderContext d(ObjectEncoder objectEncoder, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f32769c.beginObject();
        }
        objectEncoder.encode(obj, this);
        if (!z10) {
            this.f32769c.endObject();
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        return a(obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        g();
        this.f32767a = new JsonValueObjectEncoderContext(this);
        this.f32769c.name(str);
        this.f32769c.beginObject();
        return this.f32767a;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        return nested(fieldDescriptor.getName());
    }

    private JsonValueObjectEncoderContext(JsonValueObjectEncoderContext jsonValueObjectEncoderContext) {
        this.f32769c = jsonValueObjectEncoderContext.f32769c;
        this.f32770d = jsonValueObjectEncoderContext.f32770d;
        this.f32771e = jsonValueObjectEncoderContext.f32771e;
        this.f32772f = jsonValueObjectEncoderContext.f32772f;
        this.f32773g = jsonValueObjectEncoderContext.f32773g;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        if (this.f32773g) {
            return f(str, obj);
        }
        return e(str, obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, double d10) throws IOException {
        g();
        this.f32769c.name(str);
        return add(d10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, int i10) throws IOException {
        g();
        this.f32769c.name(str);
        return add(i10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, long j10) throws IOException {
        g();
        this.f32769c.name(str);
        return add(j10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, boolean z10) throws IOException {
        g();
        this.f32769c.name(str);
        return add(z10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return add(fieldDescriptor.getName(), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f10) throws IOException {
        return add(fieldDescriptor.getName(), f10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d10) throws IOException {
        return add(fieldDescriptor.getName(), d10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i10) throws IOException {
        return add(fieldDescriptor.getName(), i10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j10) throws IOException {
        return add(fieldDescriptor.getName(), j10);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z10) throws IOException {
        return add(fieldDescriptor.getName(), z10);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@Nullable String str) throws IOException {
        g();
        this.f32769c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(float f10) throws IOException {
        g();
        this.f32769c.value(f10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(double d10) throws IOException {
        g();
        this.f32769c.value(d10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(int i10) throws IOException {
        g();
        this.f32769c.value(i10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(long j10) throws IOException {
        g();
        this.f32769c.value(j10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(boolean z10) throws IOException {
        g();
        this.f32769c.value(z10);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@Nullable byte[] bArr) throws IOException {
        g();
        if (bArr == null) {
            this.f32769c.nullValue();
            return this;
        }
        this.f32769c.value(Base64.encodeToString(bArr, 2));
        return this;
    }
}
