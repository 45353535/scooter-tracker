package androidx.work;

import android.annotation.SuppressLint;
import androidx.activity.s;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.TypeConverter;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 Q2\u00020\u0001:\u0002RQB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ,\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082\b¢\u0006\u0004\b\f\u0010\rJR\u0010\u0013\u001a\u0004\u0018\u00018\u0001\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0001\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00062$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u00010\u000fH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020,2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u0002022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u000202¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010:2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001e¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020\u0015\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00062\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?¢\u0006\u0004\bA\u0010BJ \u0010E\u001a\u00020\u0015\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0080\b¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020\u0010H\u0007¢\u0006\u0004\bF\u0010GJ\u001a\u0010H\u001a\u00020\u00152\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0010H\u0016¢\u0006\u0004\bJ\u0010GJ\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010LR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010MR\u001f\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Landroidx/work/Data;", "", "other", "<init>", "(Landroidx/work/Data;)V", "", "", "values", "(Ljava/util/Map;)V", "T", C4240b4.i.W, "defaultValue", "getOrDefault", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "TArray", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "constructor", "getTypedArray", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getBooleanArray", "(Ljava/lang/String;)[Z", "", "getByte", "(Ljava/lang/String;B)B", "", "getByteArray", "(Ljava/lang/String;)[B", "getInt", "(Ljava/lang/String;I)I", "", "getIntArray", "(Ljava/lang/String;)[I", "", "getLong", "(Ljava/lang/String;J)J", "", "getLongArray", "(Ljava/lang/String;)[J", "", "getFloat", "(Ljava/lang/String;F)F", "", "getFloatArray", "(Ljava/lang/String;)[F", "", "getDouble", "(Ljava/lang/String;D)D", "", "getDoubleArray", "(Ljava/lang/String;)[D", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "", "getStringArray", "(Ljava/lang/String;)[Ljava/lang/String;", "toByteArray", "()[B", "Ljava/lang/Class;", "klass", "hasKeyWithValueOfType", "(Ljava/lang/String;Ljava/lang/Class;)Z", "hasKey$work_runtime_release", "(Ljava/lang/String;)Z", "hasKey", "size", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getKeyValueMap", "()Ljava/util/Map;", "keyValueMap", y.f66058y, "Builder", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Data {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Data EMPTY = new Builder().build();

    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_DATA_BYTES = 10240;

    @NotNull
    private static final String NULL_STRING_V1 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    private static final short STREAM_MAGIC = -21521;
    private static final short STREAM_VERSION = 1;
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;

    @NotNull
    private final Map<String, Object> values;

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020!J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006J#\u0010#\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060$¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(J\u001c\u0010&\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010)J\u001a\u0010*\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0007J\u0006\u0010+\u001a\u00020(R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/work/Data$Builder;", "", "<init>", "()V", "values", "", "", "putDirect", C4240b4.i.W, "value", "putBoolean", "", "putBooleanArray", "", "putByte", "", "putByteArray", "", "putInt", "", "putIntArray", "", "putLong", "", "putLongArray", "", "putFloat", "", "putFloatArray", "", "putDouble", "", "putDoubleArray", "", "putString", "putStringArray", "", "(Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/Data$Builder;", "putAll", "data", "Landroidx/work/Data;", "", "put", "build", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final Map<String, Object> values = new LinkedHashMap();

        private final Builder putDirect(String key, Object value) {
            this.values.put(key, value);
            return this;
        }

        @NotNull
        public final Data build() {
            Data data = new Data((Map<String, ?>) this.values);
            Data.INSTANCE.toByteArrayInternalV1(data);
            return data;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final Builder put(@NotNull String key, @Nullable Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Map<String, Object> map = this.values;
            if (value == null) {
                value = null;
            } else {
                KClass kClassB = v0.b(value.getClass());
                if (!Intrinsics.areEqual(kClassB, v0.b(Boolean.TYPE)) && !Intrinsics.areEqual(kClassB, v0.b(Byte.TYPE)) && !Intrinsics.areEqual(kClassB, v0.b(Integer.TYPE)) && !Intrinsics.areEqual(kClassB, v0.b(Long.TYPE)) && !Intrinsics.areEqual(kClassB, v0.b(Float.TYPE)) && !Intrinsics.areEqual(kClassB, v0.b(Double.TYPE)) && !Intrinsics.areEqual(kClassB, v0.b(String.class)) && !Intrinsics.areEqual(kClassB, v0.b(Boolean[].class)) && !Intrinsics.areEqual(kClassB, v0.b(Byte[].class)) && !Intrinsics.areEqual(kClassB, v0.b(Integer[].class)) && !Intrinsics.areEqual(kClassB, v0.b(Long[].class)) && !Intrinsics.areEqual(kClassB, v0.b(Float[].class)) && !Intrinsics.areEqual(kClassB, v0.b(Double[].class)) && !Intrinsics.areEqual(kClassB, v0.b(String[].class))) {
                    if (Intrinsics.areEqual(kClassB, v0.b(boolean[].class))) {
                        value = Data_Kt.convertPrimitiveArray((boolean[]) value);
                    } else if (Intrinsics.areEqual(kClassB, v0.b(byte[].class))) {
                        value = Data_Kt.convertPrimitiveArray((byte[]) value);
                    } else if (Intrinsics.areEqual(kClassB, v0.b(int[].class))) {
                        value = Data_Kt.convertPrimitiveArray((int[]) value);
                    } else if (Intrinsics.areEqual(kClassB, v0.b(long[].class))) {
                        value = Data_Kt.convertPrimitiveArray((long[]) value);
                    } else if (Intrinsics.areEqual(kClassB, v0.b(float[].class))) {
                        value = Data_Kt.convertPrimitiveArray((float[]) value);
                    } else {
                        if (!Intrinsics.areEqual(kClassB, v0.b(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + kClassB);
                        }
                        value = Data_Kt.convertPrimitiveArray((double[]) value);
                    }
                }
            }
            map.put(key, value);
            return this;
        }

        @NotNull
        public final Builder putAll(@NotNull Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            putAll(data.values);
            return this;
        }

        @NotNull
        public final Builder putBoolean(@NotNull String key, boolean value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putDirect(key, Boolean.valueOf(value));
        }

        @NotNull
        public final Builder putBooleanArray(@NotNull String key, @NotNull boolean[] value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        @NotNull
        public final Builder putByte(@NotNull String key, byte value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putDirect(key, Byte.valueOf(value));
        }

        @NotNull
        public final Builder putByteArray(@NotNull String key, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        @NotNull
        public final Builder putDouble(@NotNull String key, double value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putDirect(key, Double.valueOf(value));
        }

        @NotNull
        public final Builder putDoubleArray(@NotNull String key, @NotNull double[] value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        @NotNull
        public final Builder putFloat(@NotNull String key, float value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putDirect(key, Float.valueOf(value));
        }

        @NotNull
        public final Builder putFloatArray(@NotNull String key, @NotNull float[] value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        @NotNull
        public final Builder putInt(@NotNull String key, int value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putDirect(key, Integer.valueOf(value));
        }

        @NotNull
        public final Builder putIntArray(@NotNull String key, @NotNull int[] value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        @NotNull
        public final Builder putLong(@NotNull String key, long value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putDirect(key, Long.valueOf(value));
        }

        @NotNull
        public final Builder putLongArray(@NotNull String key, @NotNull long[] value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        @NotNull
        public final Builder putString(@NotNull String key, @Nullable String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putDirect(key, value);
        }

        @NotNull
        public final Builder putStringArray(@NotNull String key, @NotNull String[] value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return putDirect(key, value);
        }

        @NotNull
        public final Builder putAll(@NotNull Map<String, ? extends Object> values) {
            Intrinsics.checkNotNullParameter(values, "values");
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u0007J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u0007J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u001eH\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/work/Data$Companion;", "", "<init>", "()V", "EMPTY", "Landroidx/work/Data;", "MAX_DATA_BYTES", "", "TYPE_NULL", "", "TYPE_BOOLEAN", "TYPE_BYTE", "TYPE_INTEGER", "TYPE_LONG", "TYPE_FLOAT", "TYPE_DOUBLE", "TYPE_STRING", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE_ARRAY", "TYPE_INTEGER_ARRAY", "TYPE_LONG_ARRAY", "TYPE_FLOAT_ARRAY", "TYPE_DOUBLE_ARRAY", "TYPE_STRING_ARRAY", "NULL_STRING_V1", "", "STREAM_MAGIC", "", "STREAM_VERSION", "toByteArrayInternalV0", "", "data", "toByteArrayInternalV1", "fromByteArray", "bytes", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final boolean fromByteArray$isObjectStream(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b10 = (byte) (-21267);
            boolean z10 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b10) {
                z10 = true;
            }
            byteArrayInputStream.reset();
            return z10;
        }

        private static final void fromByteArray$readHeader(DataInputStream dataInputStream) throws IOException {
            short s10 = dataInputStream.readShort();
            if (s10 != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) s10)).toString());
            }
            short s11 = dataInputStream.readShort();
            if (s11 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) s11)).toString());
        }

        private static final Object fromByteArray$readValue(DataInputStream dataInputStream, byte b10) throws IOException {
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b10 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b10 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b10 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b10 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b10 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b10 == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b10 == 8) {
                int i11 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i11];
                while (i10 < i11) {
                    boolArr[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return boolArr;
            }
            if (b10 == 9) {
                int i12 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i12];
                while (i10 < i12) {
                    bArr[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return bArr;
            }
            if (b10 == 10) {
                int i13 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i13];
                while (i10 < i13) {
                    numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return numArr;
            }
            if (b10 == 11) {
                int i14 = dataInputStream.readInt();
                Long[] lArr = new Long[i14];
                while (i10 < i14) {
                    lArr[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return lArr;
            }
            if (b10 == 12) {
                int i15 = dataInputStream.readInt();
                Float[] fArr = new Float[i15];
                while (i10 < i15) {
                    fArr[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return fArr;
            }
            if (b10 == 13) {
                int i16 = dataInputStream.readInt();
                Double[] dArr = new Double[i16];
                while (i10 < i16) {
                    dArr[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return dArr;
            }
            if (b10 != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b10));
            }
            int i17 = dataInputStream.readInt();
            String[] strArr = new String[i17];
            while (i10 < i17) {
                String utf = dataInputStream.readUTF();
                if (Intrinsics.areEqual(utf, Data.NULL_STRING_V1)) {
                    utf = null;
                }
                strArr[i10] = utf;
                i10++;
            }
            return strArr;
        }

        private static final void toByteArrayInternalV1$writeArray(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i10;
            KClass kClassB = v0.b(objArr.getClass());
            if (Intrinsics.areEqual(kClassB, v0.b(Boolean[].class))) {
                i10 = 8;
            } else if (Intrinsics.areEqual(kClassB, v0.b(Byte[].class))) {
                i10 = 9;
            } else if (Intrinsics.areEqual(kClassB, v0.b(Integer[].class))) {
                i10 = 10;
            } else if (Intrinsics.areEqual(kClassB, v0.b(Long[].class))) {
                i10 = 11;
            } else if (Intrinsics.areEqual(kClassB, v0.b(Float[].class))) {
                i10 = 12;
            } else if (Intrinsics.areEqual(kClassB, v0.b(Double[].class))) {
                i10 = 13;
            } else {
                if (!Intrinsics.areEqual(kClassB, v0.b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + v0.b(objArr.getClass()).getQualifiedName());
                }
                i10 = 14;
            }
            dataOutputStream.writeByte(i10);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i10 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i10 == 9) {
                    Byte b10 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                } else if (i10 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i10 == 11) {
                    Long l10 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                } else if (i10 == 12) {
                    Float f10 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
                } else if (i10 == 13) {
                    Double d10 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                } else if (i10 == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = Data.NULL_STRING_V1;
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + v0.b(obj.getClass()).getSimpleName());
                }
                toByteArrayInternalV1$writeArray(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void toByteArrayInternalV1$writeHeader(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        @TypeConverter
        @NotNull
        public final Data fromByteArray(@NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return Data.EMPTY;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i10 = 0;
                if (fromByteArray$isObjectStream(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i11 = objectInputStream.readInt();
                        while (i10 < i11) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i10++;
                        }
                        uf.c.a(objectInputStream, null);
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        fromByteArray$readHeader(dataInputStream);
                        int i12 = dataInputStream.readInt();
                        while (i10 < i12) {
                            linkedHashMap.put(dataInputStream.readUTF(), fromByteArray$readValue(dataInputStream, dataInputStream.readByte()));
                            i10++;
                        }
                        uf.c.a(dataInputStream, null);
                    } finally {
                    }
                }
            } catch (IOException e10) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e10);
            } catch (ClassNotFoundException e11) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e11);
            }
            return new Data(linkedHashMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final byte[] toByteArrayInternalV0(@NotNull Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeInt(data.size());
                        for (Map.Entry entry : data.values.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            objectOutputStream.writeUTF(str);
                            objectOutputStream.writeObject(value);
                        }
                        Unit unit = Unit.f93236a;
                        uf.c.a(objectOutputStream, null);
                        uf.c.a(byteArrayOutputStream, null);
                        if (byteArrayOutputStream.size() > 10240) {
                            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        Intrinsics.checkNotNull(byteArray);
                        return byteArray;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e10) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        @TypeConverter
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final byte[] toByteArrayInternalV1(@NotNull Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    toByteArrayInternalV1$writeHeader(dataOutputStream);
                    dataOutputStream.writeInt(data.size());
                    for (Map.Entry entry : data.values.entrySet()) {
                        toByteArrayInternalV1$writeEntry(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    uf.c.a(dataOutputStream, null);
                    Intrinsics.checkNotNull(byteArray);
                    return byteArray;
                } finally {
                }
            } catch (IOException e10) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        private Companion() {
        }
    }

    public Data(@NotNull Data other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.values = new HashMap(other.values);
    }

    @TypeConverter
    @NotNull
    public static final Data fromByteArray(@NotNull byte[] bArr) {
        return INSTANCE.fromByteArray(bArr);
    }

    private final /* synthetic */ <T> T getOrDefault(String key, T defaultValue) {
        T t10 = (T) this.values.get(key);
        Intrinsics.reifiedOperationMarker(3, "T");
        return s.a(t10) ? t10 : defaultValue;
    }

    private final /* synthetic */ <T, TArray> TArray getTypedArray(String key, Function2<? super Integer, ? super Function1<? super Integer, ? extends T>, ? extends TArray> constructor) {
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!s.a(objArr)) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(objArr.length);
        Intrinsics.needClassReification();
        return constructor.invoke(numValueOf, new Function1<Integer, T>() { // from class: androidx.work.Data.getTypedArray.1
            public final T invoke(int i10) {
                T t10 = (T) ((Object[]) obj)[i10];
                Intrinsics.reifiedOperationMarker(1, "T");
                return t10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final byte[] toByteArrayInternalV0(@NotNull Data data) {
        return INSTANCE.toByteArrayInternalV0(data);
    }

    @TypeConverter
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final byte[] toByteArrayInternalV1(@NotNull Data data) {
        return INSTANCE.toByteArrayInternalV1(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$7$lambda$6(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
        }
        sb2.append(value);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L6a
            java.lang.Class r2 = r8.getClass()
            java.lang.Class<androidx.work.Data> r3 = androidx.work.Data.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
            if (r2 != 0) goto L14
            goto L6a
        L14:
            androidx.work.Data r8 = (androidx.work.Data) r8
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.util.Set r2 = r2.keySet()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.values
            java.util.Set r3 = r3.keySet()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 != 0) goto L29
            return r1
        L29:
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.values
            java.lang.Object r4 = r4.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.values
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L61
            if (r3 != 0) goto L4a
            goto L61
        L4a:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5c
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = kotlin.collections.ArraysKt.contentDeepEquals(r5, r3)
            goto L66
        L5c:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            goto L66
        L61:
            if (r4 != r3) goto L65
            r3 = r0
            goto L66
        L65:
            r3 = r1
        L66:
            if (r3 != 0) goto L2d
            return r1
        L69:
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.equals(java.lang.Object):boolean");
    }

    public final boolean getBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Boolean.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    @Nullable
    public final boolean[] getBooleanArray(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!s.a(objArr)) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Boolean> function1 = new Function1<Integer, Boolean>() { // from class: androidx.work.Data$getBooleanArray$$inlined$getTypedArray$1
            public final Boolean invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = function1.invoke(Integer.valueOf(i10)).booleanValue();
        }
        return zArr;
    }

    public final byte getByte(@NotNull String key, byte defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Byte.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Byte) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).byteValue();
    }

    @Nullable
    public final byte[] getByteArray(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!s.a(objArr)) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Byte> function1 = new Function1<Integer, Byte>() { // from class: androidx.work.Data$getByteArray$$inlined$getTypedArray$1
            public final Byte invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Byte) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Byte, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Byte invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = function1.invoke(Integer.valueOf(i10)).byteValue();
        }
        return bArr;
    }

    public final double getDouble(@NotNull String key, double defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Double.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Double) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).doubleValue();
    }

    @Nullable
    public final double[] getDoubleArray(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!s.a(objArr)) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Double> function1 = new Function1<Integer, Double>() { // from class: androidx.work.Data$getDoubleArray$$inlined$getTypedArray$1
            public final Double invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Double) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Double, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = function1.invoke(Integer.valueOf(i10)).doubleValue();
        }
        return dArr;
    }

    public final float getFloat(@NotNull String key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Float.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Float) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).floatValue();
    }

    @Nullable
    public final float[] getFloatArray(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!s.a(objArr)) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Float> function1 = new Function1<Integer, Float>() { // from class: androidx.work.Data$getFloatArray$$inlined$getTypedArray$1
            public final Float invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Float) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Float, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = function1.invoke(Integer.valueOf(i10)).floatValue();
        }
        return fArr;
    }

    public final int getInt(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Integer.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    @Nullable
    public final int[] getIntArray(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!s.a(objArr)) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: androidx.work.Data$getIntArray$$inlined$getTypedArray$1
            public final Integer invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Integer) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = function1.invoke(Integer.valueOf(i10)).intValue();
        }
        return iArr;
    }

    @NotNull
    public final Map<String, Object> getKeyValueMap() {
        Map<String, Object> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(this.values);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final long getLong(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objValueOf = Long.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    @Nullable
    public final long[] getLongArray(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!s.a(objArr)) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, Long> function1 = new Function1<Integer, Long>() { // from class: androidx.work.Data$getLongArray$$inlined$getTypedArray$1
            public final Long invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Long) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Long, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = function1.invoke(Integer.valueOf(i10)).longValue();
        }
        return jArr;
    }

    @Nullable
    public final String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public final String[] getStringArray(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (!s.a(objArr)) {
            return null;
        }
        int length = objArr.length;
        Function1<Integer, String> function1 = new Function1<Integer, String>() { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
            public final String invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (String) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = function1.invoke(Integer.valueOf(i10));
        }
        return strArr;
    }

    public final /* synthetic */ <T> boolean hasKey$work_runtime_release(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return hasKeyWithValueOfType(key, Object.class);
    }

    public final <T> boolean hasKeyWithValueOfType(@NotNull String key, @NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ ArraysKt.contentDeepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final int size() {
        return this.values.size();
    }

    @NotNull
    public final byte[] toByteArray() {
        return INSTANCE.toByteArrayInternalV1(this);
    }

    @NotNull
    public String toString() {
        return "Data {" + CollectionsKt.joinToString$default(this.values.entrySet(), null, null, null, 0, null, new Function1() { // from class: androidx.work.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Data.toString$lambda$7$lambda$6((Map.Entry) obj);
            }
        }, 31, null) + "}";
    }

    public Data(@NotNull Map<String, ?> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = new HashMap(values);
    }
}
