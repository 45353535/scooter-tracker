package com.yandex.div.data;

import androidx.collection.a;
import androidx.collection.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0001R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/data/StoredValue;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "getType", "Lcom/yandex/div/data/StoredValue$Type;", "getValue", "ArrayStoredValue", "BooleanStoredValue", "ColorStoredValue", "DictStoredValue", "DoubleStoredValue", "IntegerStoredValue", "StringStoredValue", "Type", "UrlStoredValue", "Lcom/yandex/div/data/StoredValue$ArrayStoredValue;", "Lcom/yandex/div/data/StoredValue$BooleanStoredValue;", "Lcom/yandex/div/data/StoredValue$ColorStoredValue;", "Lcom/yandex/div/data/StoredValue$DictStoredValue;", "Lcom/yandex/div/data/StoredValue$DoubleStoredValue;", "Lcom/yandex/div/data/StoredValue$IntegerStoredValue;", "Lcom/yandex/div/data/StoredValue$StringStoredValue;", "Lcom/yandex/div/data/StoredValue$UrlStoredValue;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class StoredValue {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/data/StoredValue$ArrayStoredValue;", "Lcom/yandex/div/data/StoredValue;", "", "name", "Lorg/json/JSONArray;", "value", "<init>", "(Ljava/lang/String;Lorg/json/JSONArray;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lorg/json/JSONArray;", "getValue", "()Lorg/json/JSONArray;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ArrayStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final JSONArray value;

        public ArrayStoredValue(@NotNull String str, @NotNull JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.value = jSONArray;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArrayStoredValue)) {
                return false;
            }
            ArrayStoredValue arrayStoredValue = (ArrayStoredValue) other;
            return Intrinsics.areEqual(this.name, arrayStoredValue.name) && Intrinsics.areEqual(this.value, arrayStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final JSONArray getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "ArrayStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/data/StoredValue$BooleanStoredValue;", "Lcom/yandex/div/data/StoredValue;", "", "name", "", "value", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Z", "getValue", "()Z", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BooleanStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final boolean value;

        public BooleanStoredValue(@NotNull String str, boolean z10) {
            super(null);
            this.name = str;
            this.value = z10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BooleanStoredValue)) {
                return false;
            }
            BooleanStoredValue booleanStoredValue = (BooleanStoredValue) other;
            return Intrinsics.areEqual(this.name, booleanStoredValue.name) && this.value == booleanStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            boolean z10 = this.value;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        @NotNull
        public String toString() {
            return "BooleanStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/data/StoredValue$ColorStoredValue;", "Lcom/yandex/div/data/StoredValue;", "", "name", "Lcom/yandex/div/evaluable/types/Color;", "value", "<init>", "(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "I", "getValue-WpymAT4", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ColorStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final int value;

        public /* synthetic */ ColorStoredValue(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorStoredValue)) {
                return false;
            }
            ColorStoredValue colorStoredValue = (ColorStoredValue) other;
            return Intrinsics.areEqual(this.name, colorStoredValue.name) && Color.m7662equalsimpl0(this.value, colorStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue-WpymAT4, reason: not valid java name and from getter */
        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Color.m7664hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return "ColorStoredValue(name=" + this.name + ", value=" + ((Object) Color.m7666toStringimpl(this.value)) + ')';
        }

        private ColorStoredValue(String str, int i10) {
            super(null);
            this.name = str;
            this.value = i10;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/data/StoredValue$DictStoredValue;", "Lcom/yandex/div/data/StoredValue;", "", "name", "Lorg/json/JSONObject;", "value", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lorg/json/JSONObject;", "getValue", "()Lorg/json/JSONObject;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DictStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final JSONObject value;

        public DictStoredValue(@NotNull String str, @NotNull JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.value = jSONObject;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DictStoredValue)) {
                return false;
            }
            DictStoredValue dictStoredValue = (DictStoredValue) other;
            return Intrinsics.areEqual(this.name, dictStoredValue.name) && Intrinsics.areEqual(this.value, dictStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final JSONObject getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "DictStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/data/StoredValue$DoubleStoredValue;", "Lcom/yandex/div/data/StoredValue;", "", "name", "", "value", "<init>", "(Ljava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "D", "getValue", "()D", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DoubleStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final double value;

        public DoubleStoredValue(@NotNull String str, double d10) {
            super(null);
            this.name = str;
            this.value = d10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DoubleStoredValue)) {
                return false;
            }
            DoubleStoredValue doubleStoredValue = (DoubleStoredValue) other;
            return Intrinsics.areEqual(this.name, doubleStoredValue.name) && Double.compare(this.value, doubleStoredValue.value) == 0;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + a.a(this.value);
        }

        @NotNull
        public String toString() {
            return "DoubleStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/data/StoredValue$IntegerStoredValue;", "Lcom/yandex/div/data/StoredValue;", "", "name", "", "value", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "J", "getValue", "()J", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IntegerStoredValue extends StoredValue {

        @NotNull
        private final String name;
        private final long value;

        public IntegerStoredValue(@NotNull String str, long j10) {
            super(null);
            this.name = str;
            this.value = j10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegerStoredValue)) {
                return false;
            }
            IntegerStoredValue integerStoredValue = (IntegerStoredValue) other;
            return Intrinsics.areEqual(this.name, integerStoredValue.name) && this.value == integerStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + b.a(this.value);
        }

        @NotNull
        public String toString() {
            return "IntegerStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/data/StoredValue$StringStoredValue;", "Lcom/yandex/div/data/StoredValue;", "", "name", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StringStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public StringStoredValue(@NotNull String str, @NotNull String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringStoredValue)) {
                return false;
            }
            StringStoredValue stringStoredValue = (StringStoredValue) other;
            return Intrinsics.areEqual(this.name, stringStoredValue.name) && Intrinsics.areEqual(this.value, stringStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "StringStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/data/StoredValue$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "STRING", "INTEGER", "BOOLEAN", "NUMBER", "COLOR", TaxBrowserActivity.f66923n, "ARRAY", "DICT", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        STRING(TypedValues.Custom.S_STRING),
        INTEGER(TypedValues.Custom.S_INT),
        BOOLEAN(TypedValues.Custom.S_BOOLEAN),
        NUMBER("number"),
        COLOR("color"),
        URL("url"),
        ARRAY("array"),
        DICT("dict");


        /* JADX INFO: renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String value;

        /* JADX INFO: renamed from: com.yandex.div.data.StoredValue$Type$Converter, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/yandex/div/data/StoredValue$Type$Converter;", "", "()V", "fromString", "Lcom/yandex/div/data/StoredValue$Type;", TypedValues.Custom.S_STRING, "", "toString", "obj", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final Type fromString(@NotNull String string) {
                Type type = Type.STRING;
                if (Intrinsics.areEqual(string, type.value)) {
                    return type;
                }
                Type type2 = Type.INTEGER;
                if (Intrinsics.areEqual(string, type2.value)) {
                    return type2;
                }
                Type type3 = Type.BOOLEAN;
                if (Intrinsics.areEqual(string, type3.value)) {
                    return type3;
                }
                Type type4 = Type.NUMBER;
                if (Intrinsics.areEqual(string, type4.value)) {
                    return type4;
                }
                Type type5 = Type.COLOR;
                if (Intrinsics.areEqual(string, type5.value)) {
                    return type5;
                }
                Type type6 = Type.URL;
                if (Intrinsics.areEqual(string, type6.value)) {
                    return type6;
                }
                Type type7 = Type.ARRAY;
                if (Intrinsics.areEqual(string, type7.value)) {
                    return type7;
                }
                Type type8 = Type.DICT;
                if (Intrinsics.areEqual(string, type8.value)) {
                    return type8;
                }
                return null;
            }

            @NotNull
            public final String toString(@NotNull Type obj) {
                return obj.value;
            }

            private Companion() {
            }
        }

        Type(String str) {
            this.value = str;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0014\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/data/StoredValue$UrlStoredValue;", "Lcom/yandex/div/data/StoredValue;", "", "name", "Lcom/yandex/div/evaluable/types/Url;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue-OXPJC6E", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UrlStoredValue extends StoredValue {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public /* synthetic */ UrlStoredValue(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UrlStoredValue)) {
                return false;
            }
            UrlStoredValue urlStoredValue = (UrlStoredValue) other;
            return Intrinsics.areEqual(this.name, urlStoredValue.name) && Url.m7673equalsimpl0(this.value, urlStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: getValue-OXPJC6E, reason: not valid java name and from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Url.m7674hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return "UrlStoredValue(name=" + this.name + ", value=" + ((Object) Url.m7675toStringimpl(this.value)) + ')';
        }

        private UrlStoredValue(String str, String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }
    }

    public /* synthetic */ StoredValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public final Type getType() {
        if (this instanceof StringStoredValue) {
            return Type.STRING;
        }
        if (this instanceof IntegerStoredValue) {
            return Type.INTEGER;
        }
        if (this instanceof BooleanStoredValue) {
            return Type.BOOLEAN;
        }
        if (this instanceof DoubleStoredValue) {
            return Type.NUMBER;
        }
        if (this instanceof ColorStoredValue) {
            return Type.COLOR;
        }
        if (this instanceof UrlStoredValue) {
            return Type.URL;
        }
        if (this instanceof ArrayStoredValue) {
            return Type.ARRAY;
        }
        if (this instanceof DictStoredValue) {
            return Type.DICT;
        }
        throw new m();
    }

    @NotNull
    public final Object getValue() {
        if (this instanceof StringStoredValue) {
            return ((StringStoredValue) this).getValue();
        }
        if (this instanceof IntegerStoredValue) {
            return Long.valueOf(((IntegerStoredValue) this).getValue());
        }
        if (this instanceof BooleanStoredValue) {
            return Boolean.valueOf(((BooleanStoredValue) this).getValue());
        }
        if (this instanceof DoubleStoredValue) {
            return Double.valueOf(((DoubleStoredValue) this).getValue());
        }
        if (this instanceof ColorStoredValue) {
            return Color.m7659boximpl(((ColorStoredValue) this).getValue());
        }
        if (this instanceof UrlStoredValue) {
            return Url.m7670boximpl(((UrlStoredValue) this).getValue());
        }
        if (this instanceof ArrayStoredValue) {
            return ((ArrayStoredValue) this).getValue();
        }
        if (this instanceof DictStoredValue) {
            return ((DictStoredValue) this).getValue();
        }
        throw new m();
    }

    private StoredValue() {
    }
}
