package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.r2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class Value extends h0 implements y2 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int kindCase_;
    private Object kind_;
    private byte memoizedIsInitialized;
    private static final Value DEFAULT_INSTANCE = new Value();
    private static final p1 PARSER = new b() { // from class: com.explorestack.protobuf.Value.1
        @Override // com.explorestack.protobuf.p1
        public Value parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Value(lVar, wVar);
        }
    };

    /* JADX INFO: renamed from: com.explorestack.protobuf.Value$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Value$KindCase;

        static {
            int[] iArr = new int[KindCase.values().length];
            $SwitchMap$com$google$protobuf$Value$KindCase = iArr;
            try {
                iArr[KindCase.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.NUMBER_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.STRING_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.BOOL_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.STRUCT_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.LIST_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.KIND_NOT_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum KindCase implements j0.c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i10) {
            this.value = i10;
        }

        public static KindCase forNumber(int i10) {
            switch (i10) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Override // com.explorestack.protobuf.j0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return f2.f19016e;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return super.equals(obj);
        }
        Value value = (Value) obj;
        if (!getKindCase().equals(value.getKindCase())) {
            return false;
        }
        switch (this.kindCase_) {
            case 1:
                if (getNullValueValue() != value.getNullValueValue()) {
                    return false;
                }
                break;
            case 2:
                if (Double.doubleToLongBits(getNumberValue()) != Double.doubleToLongBits(value.getNumberValue())) {
                    return false;
                }
                break;
            case 3:
                if (!getStringValue().equals(value.getStringValue())) {
                    return false;
                }
                break;
            case 4:
                if (getBoolValue() != value.getBoolValue()) {
                    return false;
                }
                break;
            case 5:
                if (!getStructValue().equals(value.getStructValue())) {
                    return false;
                }
                break;
            case 6:
                if (!getListValue().equals(value.getListValue())) {
                    return false;
                }
                break;
        }
        return this.unknownFields.equals(value.unknownFields);
    }

    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    public r0 getListValueOrBuilder() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueValueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
        return nullValueValueOf == null ? NullValue.UNRECOGNIZED : nullValueValueOf;
    }

    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iL = this.kindCase_ == 1 ? n.l(1, ((Integer) this.kind_).intValue()) : 0;
        if (this.kindCase_ == 2) {
            iL += n.j(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            iL += h0.computeStringSize(3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            iL += n.e(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            iL += n.G(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            iL += n.G(6, (ListValue) this.kind_);
        }
        int serializedSize = iL + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getStringValue() {
        String str = this.kindCase_ == 3 ? this.kind_ : "";
        if (str instanceof String) {
            return (String) str;
        }
        String stringUtf8 = ((ByteString) str).toStringUtf8();
        if (this.kindCase_ == 3) {
            this.kind_ = stringUtf8;
        }
        return stringUtf8;
    }

    public ByteString getStringValueBytes() {
        String str = this.kindCase_ == 3 ? this.kind_ : "";
        if (!(str instanceof String)) {
            return (ByteString) str;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
        if (this.kindCase_ == 3) {
            this.kind_ = byteStringCopyFromUtf8;
        }
        return byteStringCopyFromUtf8;
    }

    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    public e2 getStructValueOrBuilder() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int nullValueValue;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        switch (this.kindCase_) {
            case 1:
                i10 = ((iHashCode * 37) + 1) * 53;
                nullValueValue = getNullValueValue();
                break;
            case 2:
                i10 = ((iHashCode * 37) + 2) * 53;
                nullValueValue = j0.i(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                i10 = ((iHashCode * 37) + 3) * 53;
                nullValueValue = getStringValue().hashCode();
                break;
            case 4:
                i10 = ((iHashCode * 37) + 4) * 53;
                nullValueValue = j0.d(getBoolValue());
                break;
            case 5:
                i10 = ((iHashCode * 37) + 5) * 53;
                nullValueValue = getStructValue().hashCode();
                break;
            case 6:
                i10 = ((iHashCode * 37) + 6) * 53;
                nullValueValue = getListValue().hashCode();
                break;
            default:
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
        }
        iHashCode = i10 + nullValueValue;
        int iHashCode22 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return f2.f19017f.d(Value.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new Value();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.kindCase_ == 1) {
            nVar.v0(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            nVar.t0(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            h0.writeString(nVar, 3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            nVar.n0(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            nVar.J0(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            nVar.J0(6, (ListValue) this.kind_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements y2 {
        private int kindCase_;
        private Object kind_;
        private a2 listValueBuilder_;
        private a2 structValueBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return f2.f19016e;
        }

        private a2 getListValueFieldBuilder() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6) {
                    this.kind_ = ListValue.getDefaultInstance();
                }
                this.listValueBuilder_ = new a2((ListValue) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 6;
            onChanged();
            return this.listValueBuilder_;
        }

        private a2 getStructValueFieldBuilder() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5) {
                    this.kind_ = Struct.getDefaultInstance();
                }
                this.structValueBuilder_ = new a2((Struct) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 5;
            onChanged();
            return this.structValueBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean z10 = h0.alwaysUseFieldBuilders;
        }

        public Builder clearBoolValue() {
            if (this.kindCase_ == 4) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearKind() {
            this.kindCase_ = 0;
            this.kind_ = null;
            onChanged();
            return this;
        }

        public Builder clearListValue() {
            a2 a2Var = this.listValueBuilder_;
            if (a2Var == null) {
                if (this.kindCase_ == 6) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.kindCase_ == 6) {
                this.kindCase_ = 0;
                this.kind_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearNullValue() {
            if (this.kindCase_ == 1) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearNumberValue() {
            if (this.kindCase_ == 2) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearStringValue() {
            if (this.kindCase_ == 3) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearStructValue() {
            a2 a2Var = this.structValueBuilder_;
            if (a2Var == null) {
                if (this.kindCase_ == 5) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.kindCase_ == 5) {
                this.kindCase_ = 0;
                this.kind_ = null;
            }
            a2Var.b();
            return this;
        }

        public boolean getBoolValue() {
            if (this.kindCase_ == 4) {
                return ((Boolean) this.kind_).booleanValue();
            }
            return false;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return f2.f19016e;
        }

        public KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
        }

        public ListValue getListValue() {
            a2 a2Var = this.listValueBuilder_;
            return a2Var == null ? this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : this.kindCase_ == 6 ? (ListValue) a2Var.e() : ListValue.getDefaultInstance();
        }

        public ListValue.Builder getListValueBuilder() {
            return (ListValue.Builder) getListValueFieldBuilder().d();
        }

        public r0 getListValueOrBuilder() {
            a2 a2Var;
            int i10 = this.kindCase_;
            return (i10 != 6 || (a2Var = this.listValueBuilder_) == null) ? i10 == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : (r0) a2Var.f();
        }

        public NullValue getNullValue() {
            if (this.kindCase_ != 1) {
                return NullValue.NULL_VALUE;
            }
            NullValue nullValueValueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
            return nullValueValueOf == null ? NullValue.UNRECOGNIZED : nullValueValueOf;
        }

        public int getNullValueValue() {
            if (this.kindCase_ == 1) {
                return ((Integer) this.kind_).intValue();
            }
            return 0;
        }

        public double getNumberValue() {
            if (this.kindCase_ == 2) {
                return ((Double) this.kind_).doubleValue();
            }
            return 0.0d;
        }

        public String getStringValue() {
            String str = this.kindCase_ == 3 ? this.kind_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((ByteString) str).toStringUtf8();
            if (this.kindCase_ == 3) {
                this.kind_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getStringValueBytes() {
            String str = this.kindCase_ == 3 ? this.kind_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.kindCase_ == 3) {
                this.kind_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        public Struct getStructValue() {
            a2 a2Var = this.structValueBuilder_;
            return a2Var == null ? this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : this.kindCase_ == 5 ? (Struct) a2Var.e() : Struct.getDefaultInstance();
        }

        public Struct.Builder getStructValueBuilder() {
            return (Struct.Builder) getStructValueFieldBuilder().d();
        }

        public e2 getStructValueOrBuilder() {
            a2 a2Var;
            int i10 = this.kindCase_;
            return (i10 != 5 || (a2Var = this.structValueBuilder_) == null) ? i10 == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : (e2) a2Var.f();
        }

        public boolean hasBoolValue() {
            return this.kindCase_ == 4;
        }

        public boolean hasListValue() {
            return this.kindCase_ == 6;
        }

        public boolean hasNullValue() {
            return this.kindCase_ == 1;
        }

        public boolean hasNumberValue() {
            return this.kindCase_ == 2;
        }

        public boolean hasStringValue() {
            return this.kindCase_ == 3;
        }

        public boolean hasStructValue() {
            return this.kindCase_ == 5;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return f2.f19017f.d(Value.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeListValue(ListValue listValue) {
            a2 a2Var = this.listValueBuilder_;
            if (a2Var == null) {
                if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
                    this.kind_ = listValue;
                } else {
                    this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
                }
                onChanged();
            } else {
                if (this.kindCase_ == 6) {
                    a2Var.g(listValue);
                }
                this.listValueBuilder_.i(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder mergeStructValue(Struct struct) {
            a2 a2Var = this.structValueBuilder_;
            if (a2Var == null) {
                if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
                    this.kind_ = struct;
                } else {
                    this.kind_ = Struct.newBuilder((Struct) this.kind_).mergeFrom(struct).buildPartial();
                }
                onChanged();
            } else {
                if (this.kindCase_ == 5) {
                    a2Var.g(struct);
                }
                this.structValueBuilder_.i(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        public Builder setBoolValue(boolean z10) {
            this.kindCase_ = 4;
            this.kind_ = Boolean.valueOf(z10);
            onChanged();
            return this;
        }

        public Builder setListValue(ListValue listValue) {
            a2 a2Var = this.listValueBuilder_;
            if (a2Var == null) {
                listValue.getClass();
                this.kind_ = listValue;
                onChanged();
            } else {
                a2Var.i(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder setNullValue(NullValue nullValue) {
            nullValue.getClass();
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(nullValue.getNumber());
            onChanged();
            return this;
        }

        public Builder setNullValueValue(int i10) {
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(i10);
            onChanged();
            return this;
        }

        public Builder setNumberValue(double d10) {
            this.kindCase_ = 2;
            this.kind_ = Double.valueOf(d10);
            onChanged();
            return this;
        }

        public Builder setStringValue(String str) {
            str.getClass();
            this.kindCase_ = 3;
            this.kind_ = str;
            onChanged();
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.kindCase_ = 3;
            this.kind_ = byteString;
            onChanged();
            return this;
        }

        public Builder setStructValue(Struct struct) {
            a2 a2Var = this.structValueBuilder_;
            if (a2Var == null) {
                struct.getClass();
                this.kind_ = struct;
                onChanged();
            } else {
                a2Var.i(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        private Builder() {
            this.kindCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Value build() {
            Value valueBuildPartial = buildPartial();
            if (valueBuildPartial.isInitialized()) {
                return valueBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) valueBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Value buildPartial() {
            Value value = new Value(this);
            if (this.kindCase_ == 1) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 2) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 3) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 4) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 5) {
                a2 a2Var = this.structValueBuilder_;
                if (a2Var == null) {
                    value.kind_ = this.kind_;
                } else {
                    value.kind_ = a2Var.a();
                }
            }
            if (this.kindCase_ == 6) {
                a2 a2Var2 = this.listValueBuilder_;
                if (a2Var2 == null) {
                    value.kind_ = this.kind_;
                } else {
                    value.kind_ = a2Var2.a();
                }
            }
            value.kindCase_ = this.kindCase_;
            onBuilt();
            return value;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Value getDefaultInstanceForType() {
            return Value.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(r2 r2Var) {
            return (Builder) super.setUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(r2 r2Var) {
            return (Builder) super.mergeUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.kindCase_ = 0;
            this.kind_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.kindCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Value) {
                return mergeFrom((Value) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setListValue(ListValue.Builder builder) {
            a2 a2Var = this.listValueBuilder_;
            if (a2Var == null) {
                this.kind_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder setStructValue(Struct.Builder builder) {
            a2 a2Var = this.structValueBuilder_;
            if (a2Var == null) {
                this.kind_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.kindCase_ = 5;
            return this;
        }

        public Builder mergeFrom(Value value) {
            if (value == Value.getDefaultInstance()) {
                return this;
            }
            switch (AnonymousClass2.$SwitchMap$com$google$protobuf$Value$KindCase[value.getKindCase().ordinal()]) {
                case 1:
                    setNullValueValue(value.getNullValueValue());
                    break;
                case 2:
                    setNumberValue(value.getNumberValue());
                    break;
                case 3:
                    this.kindCase_ = 3;
                    this.kind_ = value.kind_;
                    onChanged();
                    break;
                case 4:
                    setBoolValue(value.getBoolValue());
                    break;
                case 5:
                    mergeStructValue(value.getStructValue());
                    break;
                case 6:
                    mergeListValue(value.getListValue());
                    break;
            }
            mergeUnknownFields(value.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.Value.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.Value.access$500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.Value r3 = (com.explorestack.protobuf.Value) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.explorestack.protobuf.Value r4 = (com.explorestack.protobuf.Value) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.Value.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.Value$Builder");
        }
    }

    public static Builder newBuilder(Value value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Value(h0.b bVar) {
        super(bVar);
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Value) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Value parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private Value() {
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(bArr, wVar);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) h0.parseWithIOException(PARSER, inputStream);
    }

    private Value(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            int iT = lVar.t();
                            this.kindCase_ = 1;
                            this.kind_ = Integer.valueOf(iT);
                        } else if (iK == 17) {
                            this.kindCase_ = 2;
                            this.kind_ = Double.valueOf(lVar.s());
                        } else if (iK == 26) {
                            String strJ = lVar.J();
                            this.kindCase_ = 3;
                            this.kind_ = strJ;
                        } else if (iK != 32) {
                            if (iK == 42) {
                                Struct.Builder builder = this.kindCase_ == 5 ? ((Struct) this.kind_).toBuilder() : null;
                                MessageLite messageLiteA = lVar.A(Struct.parser(), wVar);
                                this.kind_ = messageLiteA;
                                if (builder != null) {
                                    builder.mergeFrom((Struct) messageLiteA);
                                    this.kind_ = builder.buildPartial();
                                }
                                this.kindCase_ = 5;
                            } else if (iK != 50) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                ListValue.Builder builder2 = this.kindCase_ == 6 ? ((ListValue) this.kind_).toBuilder() : null;
                                MessageLite messageLiteA2 = lVar.A(ListValue.parser(), wVar);
                                this.kind_ = messageLiteA2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((ListValue) messageLiteA2);
                                    this.kind_ = builder2.buildPartial();
                                }
                                this.kindCase_ = 6;
                            }
                        } else {
                            this.kindCase_ = 4;
                            this.kind_ = Boolean.valueOf(lVar.q());
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Value parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Value) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Value parseFrom(l lVar) throws IOException {
        return (Value) h0.parseWithIOException(PARSER, lVar);
    }

    public static Value parseFrom(l lVar, w wVar) throws IOException {
        return (Value) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
