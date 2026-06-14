package zg;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.adjust.sdk.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import wg.l;
import wg.m;
import yg.p1;

/* JADX INFO: loaded from: classes3.dex */
abstract class c extends p1 implements kotlinx.serialization.json.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlinx.serialization.json.b f119387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JsonElement f119388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f119389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final kotlinx.serialization.json.g f119390g;

    public /* synthetic */ c(kotlinx.serialization.json.b bVar, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jsonElement, str);
    }

    private final Void B0(JsonPrimitive jsonPrimitive, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (StringsKt.a0(str, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw i0.f(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + sb2.toString() + " value at element: " + A0(str2), m0().toString());
    }

    public final String A0(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return i0() + '.' + currentTag;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean E() {
        return !(m0() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder, xg.d
    public ah.b a() {
        return d().a();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public xg.d b(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementM0 = m0();
        wg.l kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, m.b.f108009a) || (kind instanceof wg.d)) {
            kotlinx.serialization.json.b bVarD = d();
            String strH = descriptor.h();
            if (jsonElementM0 instanceof JsonArray) {
                return new u0(bVarD, (JsonArray) jsonElementM0);
            }
            throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonArray.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + i0(), jsonElementM0.toString());
        }
        if (!Intrinsics.areEqual(kind, m.c.f108010a)) {
            kotlinx.serialization.json.b bVarD2 = d();
            String strH2 = descriptor.h();
            if (jsonElementM0 instanceof JsonObject) {
                return new s0(bVarD2, (JsonObject) jsonElementM0, this.f119389f, null, 8, null);
            }
            throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + strH2 + " at element: " + i0(), jsonElementM0.toString());
        }
        kotlinx.serialization.json.b bVarD3 = d();
        SerialDescriptor serialDescriptorA = o1.a(descriptor.d(0), bVarD3.a());
        wg.l kind2 = serialDescriptorA.getKind();
        if ((kind2 instanceof wg.e) || Intrinsics.areEqual(kind2, l.b.f108007a)) {
            kotlinx.serialization.json.b bVarD4 = d();
            String strH3 = descriptor.h();
            if (jsonElementM0 instanceof JsonObject) {
                return new w0(bVarD4, (JsonObject) jsonElementM0);
            }
            throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + strH3 + " at element: " + i0(), jsonElementM0.toString());
        }
        if (!bVarD3.e().c()) {
            throw i0.d(serialDescriptorA);
        }
        kotlinx.serialization.json.b bVarD5 = d();
        String strH4 = descriptor.h();
        if (jsonElementM0 instanceof JsonArray) {
            return new u0(bVarD5, (JsonArray) jsonElementM0);
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonArray.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + strH4 + " at element: " + i0(), jsonElementM0.toString());
    }

    @Override // xg.d
    public void c(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.h
    public kotlinx.serialization.json.b d() {
        return this.f119387d;
    }

    @Override // yg.p1
    protected String e0(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // yg.b3, kotlinx.serialization.encoding.Decoder
    public Object k(ug.c deserializer) {
        JsonPrimitive jsonPrimitiveJ;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof yg.b) || d().e().p()) {
            return deserializer.deserialize(this);
        }
        yg.b bVar = (yg.b) deserializer;
        String strC = z0.c(bVar.getDescriptor(), d());
        JsonElement jsonElementU = u();
        String strH = bVar.getDescriptor().h();
        if (jsonElementU instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementU;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strC);
            try {
                ug.c cVarA = ug.i.a((yg.b) deserializer, this, (jsonElement == null || (jsonPrimitiveJ = kotlinx.serialization.json.j.j(jsonElement)) == null) ? null : kotlinx.serialization.json.j.f(jsonPrimitiveJ));
                Intrinsics.checkNotNull(cVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return k1.b(d(), strC, jsonObject, cVarA);
            } catch (ug.m e10) {
                String message = e10.getMessage();
                Intrinsics.checkNotNull(message);
                throw i0.f(-1, message, jsonObject.toString());
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementU.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + i0(), jsonElementU.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract JsonElement l0(String str);

    protected final JsonElement m0() {
        JsonElement jsonElementL0;
        String str = (String) Y();
        return (str == null || (jsonElementL0 = l0(str)) == null) ? z0() : jsonElementL0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public boolean N(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                Boolean boolE = kotlinx.serialization.json.j.e(jsonPrimitive);
                if (boolE != null) {
                    return boolE.booleanValue();
                }
                B0(jsonPrimitive, TypedValues.Custom.S_BOOLEAN, tag);
                throw new lf.g();
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, TypedValues.Custom.S_BOOLEAN, tag);
                throw new lf.g();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_BOOLEAN + " at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public byte O(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                long jL = kotlinx.serialization.json.j.l(jsonPrimitive);
                Byte bValueOf = (-128 > jL || jL > 127) ? null : Byte.valueOf((byte) jL);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                B0(jsonPrimitive, "byte", tag);
                throw new lf.g();
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "byte", tag);
                throw new lf.g();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of byte at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public char P(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                return StringsKt.I1(jsonPrimitive.e());
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "char", tag);
                throw new lf.g();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of char at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public double Q(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                double dG = kotlinx.serialization.json.j.g(jsonPrimitive);
                if (d().e().b() || Math.abs(dG) <= Double.MAX_VALUE) {
                    return dG;
                }
                throw i0.a(Double.valueOf(dG), tag, m0().toString());
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "double", tag);
                throw new lf.g();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of double at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public int R(String tag, SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        kotlinx.serialization.json.b bVarD = d();
        JsonElement jsonElementL0 = l0(tag);
        String strH = enumDescriptor.h();
        if (jsonElementL0 instanceof JsonPrimitive) {
            return k0.k(enumDescriptor, bVarD, ((JsonPrimitive) jsonElementL0).e(), null, 4, null);
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public float S(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                float fH = kotlinx.serialization.json.j.h(jsonPrimitive);
                if (d().e().b() || Math.abs(fH) <= Float.MAX_VALUE) {
                    return fH;
                }
                throw i0.a(Float.valueOf(fH), tag, m0().toString());
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, TypedValues.Custom.S_FLOAT, tag);
                throw new lf.g();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_FLOAT + " at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public Decoder T(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!f1.b(inlineDescriptor)) {
            return super.T(tag, inlineDescriptor);
        }
        kotlinx.serialization.json.b bVarD = d();
        JsonElement jsonElementL0 = l0(tag);
        String strH = inlineDescriptor.h();
        if (jsonElementL0 instanceof JsonPrimitive) {
            return new d0(h1.a(bVarD, ((JsonPrimitive) jsonElementL0).e()), d());
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + A0(tag), jsonElementL0.toString());
    }

    @Override // kotlinx.serialization.json.h
    public JsonElement u() {
        return m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public int U(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                long jL = kotlinx.serialization.json.j.l(jsonPrimitive);
                Integer numValueOf = (SieveCacheKt.NodeMetaAndPreviousMask > jL || jL > SieveCacheKt.NodeLinkMask) ? null : Integer.valueOf((int) jL);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                B0(jsonPrimitive, "int", tag);
                throw new lf.g();
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "int", tag);
                throw new lf.g();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of int at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public long V(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                return kotlinx.serialization.json.j.l(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, Constants.LONG, tag);
                throw new lf.g();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of " + Constants.LONG + " at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public short W(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                long jL = kotlinx.serialization.json.j.l(jsonPrimitive);
                Short shValueOf = (-32768 > jL || jL > 32767) ? null : Short.valueOf((short) jL);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                B0(jsonPrimitive, "short", tag);
                throw new lf.g();
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "short", tag);
                throw new lf.g();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of short at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public String X(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (!(jsonElementL0 instanceof JsonPrimitive)) {
            throw i0.f(-1, "Expected " + kotlin.jvm.internal.v0.b(JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.v0.b(jsonElementL0.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_STRING + " at element: " + A0(tag), jsonElementL0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
        if (!(jsonPrimitive instanceof kotlinx.serialization.json.w)) {
            throw i0.f(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + A0(tag), m0().toString());
        }
        kotlinx.serialization.json.w wVar = (kotlinx.serialization.json.w) jsonPrimitive;
        if (wVar.g() || d().e().q()) {
            return wVar.e();
        }
        throw i0.f(-1, "String literal for key '" + tag + "' should be quoted at element: " + A0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m0().toString());
    }

    @Override // yg.b3, kotlinx.serialization.encoding.Decoder
    public Decoder y(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Y() != null ? super.y(descriptor) : new m0(d(), z0(), this.f119389f).y(descriptor);
    }

    protected final String y0() {
        return this.f119389f;
    }

    public abstract JsonElement z0();

    public /* synthetic */ c(kotlinx.serialization.json.b bVar, JsonElement jsonElement, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jsonElement, (i10 & 4) != 0 ? null : str, null);
    }

    private c(kotlinx.serialization.json.b bVar, JsonElement jsonElement, String str) {
        this.f119387d = bVar;
        this.f119388e = jsonElement;
        this.f119389f = str;
        this.f119390g = d().e();
    }
}
