package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.e;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Response extends h0 implements d {
    public static final int BIDID_FIELD_NUMBER = 2;
    public static final int CDATA_FIELD_NUMBER = 5;
    public static final int CUR_FIELD_NUMBER = 4;
    public static final int EXT_FIELD_NUMBER = 8;
    public static final int EXT_PROTO_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NBR_FIELD_NUMBER = 3;
    public static final int SEATBID_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private volatile Object bidid_;
    private volatile Object cdata_;
    private volatile Object cur_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private byte memoizedIsInitialized;
    private int nbr_;
    private List<Seatbid> seatbid_;
    private static final Response DEFAULT_INSTANCE = new Response();
    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Response.1
        @Override // com.explorestack.protobuf.p1
        public Response parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Response(lVar, wVar);
        }
    };

    public static final class Seatbid extends h0 implements SeatbidOrBuilder {
        public static final int BID_FIELD_NUMBER = 3;
        public static final int EXT_FIELD_NUMBER = 5;
        public static final int EXT_PROTO_FIELD_NUMBER = 4;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        public static final int SEAT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Bid> bid_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private boolean package_;
        private volatile Object seat_;
        private static final Seatbid DEFAULT_INSTANCE = new Seatbid();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.1
            @Override // com.explorestack.protobuf.p1
            public Seatbid parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Seatbid(lVar, wVar);
            }
        };

        public static final class Bid extends h0 implements BidOrBuilder {
            public static final int BURL_FIELD_NUMBER = 8;
            public static final int CID_FIELD_NUMBER = 5;
            public static final int DEAL_FIELD_NUMBER = 4;
            public static final int EXP_FIELD_NUMBER = 10;
            public static final int EXT_FIELD_NUMBER = 15;
            public static final int EXT_PROTO_FIELD_NUMBER = 14;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ITEM_FIELD_NUMBER = 2;
            public static final int LURL_FIELD_NUMBER = 9;
            public static final int MACRO_FIELD_NUMBER = 12;
            public static final int MEDIA_FIELD_NUMBER = 13;
            public static final int MID_FIELD_NUMBER = 11;
            public static final int PRICE_FIELD_NUMBER = 3;
            public static final int PURL_FIELD_NUMBER = 7;
            public static final int TACTIC_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private volatile Object burl_;
            private volatile Object cid_;
            private volatile Object deal_;
            private int exp_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private volatile Object item_;
            private volatile Object lurl_;
            private List<Macro> macro_;
            private Any media_;
            private byte memoizedIsInitialized;
            private volatile Object mid_;
            private double price_;
            private volatile Object purl_;
            private volatile Object tactic_;
            private static final Bid DEFAULT_INSTANCE = new Bid();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.1
                @Override // com.explorestack.protobuf.p1
                public Bid parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Bid(lVar, wVar);
                }
            };

            public static final class Macro extends h0 implements MacroOrBuilder {
                public static final int EXT_FIELD_NUMBER = 4;
                public static final int EXT_PROTO_FIELD_NUMBER = 3;
                public static final int KEY_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private List<Any> extProto_;
                private Struct ext_;
                private volatile Object key_;
                private byte memoizedIsInitialized;
                private volatile Object value_;
                private static final Macro DEFAULT_INSTANCE = new Macro();
                private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.1
                    @Override // com.explorestack.protobuf.p1
                    public Macro parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new Macro(lVar, wVar);
                    }
                };

                public static Macro getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f19297s;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Macro parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Macro) h0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Macro parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(byteBuffer);
                }

                public static p1 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Macro)) {
                        return super.equals(obj);
                    }
                    Macro macro = (Macro) obj;
                    if (getKey().equals(macro.getKey()) && getValue().equals(macro.getValue()) && hasExt() == macro.hasExt()) {
                        return (!hasExt() || getExt().equals(macro.getExt())) && getExtProtoList().equals(macro.getExtProtoList()) && this.unknownFields.equals(macro.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public e2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public String getKey() {
                    Object obj = this.key_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.key_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public ByteString getKeyBytes() {
                    Object obj = this.key_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.key_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
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
                    int iComputeStringSize = !getKeyBytes().isEmpty() ? h0.computeStringSize(1, this.key_) : 0;
                    if (!getValueBytes().isEmpty()) {
                        iComputeStringSize += h0.computeStringSize(2, this.value_);
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        iComputeStringSize += n.G(3, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        iComputeStringSize += n.G(4, getExt());
                    }
                    int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final r2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getKey().hashCode()) * 37) + 2) * 53) + getValue().hashCode();
                    if (hasExt()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.h0
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f19298t.d(Macro.class, Builder.class);
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
                    return new Macro();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(n nVar) throws IOException {
                    if (!getKeyBytes().isEmpty()) {
                        h0.writeString(nVar, 1, this.key_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        h0.writeString(nVar, 2, this.value_);
                    }
                    for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                        nVar.J0(3, this.extProto_.get(i10));
                    }
                    if (this.ext_ != null) {
                        nVar.J0(4, getExt());
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static final class Builder extends h0.b implements MacroOrBuilder {
                    private int bitField0_;
                    private a2 extBuilder_;
                    private v1 extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private Object key_;
                    private Object value_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f19297s;
                    }

                    private a2 getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private v1 getExtProtoFieldBuilder() {
                        if (this.extProtoBuilder_ == null) {
                            this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (h0.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            v1Var.a(iterable);
                            return this;
                        }
                        ensureExtProtoIsMutable();
                        a.AbstractC0320a.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            v1Var.e(any);
                            return this;
                        }
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                        return this;
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                    }

                    public Builder clearExt() {
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                            onChanged();
                            return this;
                        }
                        this.ext_ = null;
                        this.extBuilder_ = null;
                        return this;
                    }

                    public Builder clearExtProto() {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            v1Var.g();
                            return this;
                        }
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearKey() {
                        this.key_ = Macro.getDefaultInstance().getKey();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = Macro.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f19297s;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public Struct getExt() {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var != null) {
                            return (Struct) a2Var.e();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    public Struct.Builder getExtBuilder() {
                        onChanged();
                        return (Struct.Builder) getExtFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public e2 getExtOrBuilder() {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var != null) {
                            return (e2) a2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public Any getExtProto(int i10) {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.get(i10) : (Any) v1Var.n(i10);
                    }

                    public Any.Builder getExtProtoBuilder(int i10) {
                        return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().l();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public int getExtProtoCount() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.size() : v1Var.m();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public List<Any> getExtProtoList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public String getKey() {
                        Object obj = this.key_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.key_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public ByteString getKeyBytes() {
                        Object obj = this.key_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.key_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.h0.b
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.f19298t.d(Macro.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeExt(Struct struct) {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var != null) {
                            a2Var.g(struct);
                            return this;
                        }
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder removeExtProto(int i10) {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            v1Var.v(i10);
                            return this;
                        }
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i10);
                        onChanged();
                        return this;
                    }

                    public Builder setExt(Struct struct) {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var != null) {
                            a2Var.i(struct);
                            return this;
                        }
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                        return this;
                    }

                    public Builder setExtProto(int i10, Any any) {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            v1Var.w(i10, any);
                            return this;
                        }
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, any);
                        onChanged();
                        return this;
                    }

                    public Builder setKey(String str) {
                        str.getClass();
                        this.key_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setKeyBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.key_ = byteString;
                        onChanged();
                        return this;
                    }

                    public Builder setValue(String str) {
                        str.getClass();
                        this.value_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.key_ = "";
                        this.value_ = "";
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Macro build() {
                        Macro macroBuildPartial = buildPartial();
                        if (macroBuildPartial.isInitialized()) {
                            return macroBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) macroBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Macro buildPartial() {
                        Macro macro = new Macro(this);
                        macro.key_ = this.key_;
                        macro.value_ = this.value_;
                        a2 a2Var = this.extBuilder_;
                        if (a2Var == null) {
                            macro.ext_ = this.ext_;
                        } else {
                            macro.ext_ = (Struct) a2Var.a();
                        }
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            macro.extProto_ = v1Var.f();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            macro.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return macro;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Macro getDefaultInstanceForType() {
                        return Macro.getDefaultInstance();
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

                    public Any.Builder addExtProtoBuilder(int i10) {
                        return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                        this.key_ = "";
                        this.value_ = "";
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var == null) {
                            this.extProto_ = Collections.EMPTY_LIST;
                            this.bitField0_ &= -2;
                            return this;
                        }
                        v1Var.g();
                        return this;
                    }

                    public Builder setExt(Struct.Builder builder) {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var == null) {
                            this.ext_ = builder.build();
                            onChanged();
                            return this;
                        }
                        a2Var.i(builder.build());
                        return this;
                    }

                    public Builder addExtProto(int i10, Any any) {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i10, any);
                            onChanged();
                            return this;
                        }
                        v1Var.d(i10, any);
                        return this;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo4427clone() {
                        return (Builder) super.mo4427clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Macro) {
                            return mergeFrom((Macro) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder setExtProto(int i10, Any.Builder builder) {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i10, builder.build());
                            onChanged();
                            return this;
                        }
                        v1Var.w(i10, builder.build());
                        return this;
                    }

                    private Builder(h0.c cVar) {
                        super(cVar);
                        this.key_ = "";
                        this.value_ = "";
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Builder mergeFrom(Macro macro) {
                        if (macro == Macro.getDefaultInstance()) {
                            return this;
                        }
                        if (!macro.getKey().isEmpty()) {
                            this.key_ = macro.key_;
                            onChanged();
                        }
                        if (!macro.getValue().isEmpty()) {
                            this.value_ = macro.value_;
                            onChanged();
                        }
                        if (macro.hasExt()) {
                            mergeExt(macro.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!macro.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = macro.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(macro.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!macro.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(macro.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = macro.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((h0) macro).unknownFields);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                            return this;
                        }
                        v1Var.e(builder.build());
                        return this;
                    }

                    public Builder addExtProto(int i10, Any.Builder builder) {
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i10, builder.build());
                            onChanged();
                            return this;
                        }
                        v1Var.d(i10, builder.build());
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro$Builder");
                    }
                }

                public static Builder newBuilder(Macro macro) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(macro);
                }

                public static Macro parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(byteBuffer, wVar);
                }

                private Macro(h0.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Macro parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Macro) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                }

                public static Macro parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Macro getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Macro parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(byteString, wVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Macro() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.key_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static Macro parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.h0
                public Builder newBuilderForType(h0.c cVar) {
                    return new Builder(cVar);
                }

                public static Macro parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(bArr, wVar);
                }

                public static Macro parseFrom(InputStream inputStream) throws IOException {
                    return (Macro) h0.parseWithIOException(PARSER, inputStream);
                }

                public static Macro parseFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Macro) h0.parseWithIOException(PARSER, inputStream, wVar);
                }

                private Macro(l lVar, w wVar) throws InvalidProtocolBufferException {
                    this();
                    wVar.getClass();
                    r2.b bVarG = r2.g();
                    boolean z10 = false;
                    boolean z11 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = lVar.K();
                                if (iK != 0) {
                                    if (iK == 10) {
                                        this.key_ = lVar.J();
                                    } else if (iK == 18) {
                                        this.value_ = lVar.J();
                                    } else if (iK == 26) {
                                        if (!z11) {
                                            this.extProto_ = new ArrayList();
                                            z11 = true;
                                        }
                                        this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                    } else if (iK != 34) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        Struct struct = this.ext_;
                                        Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                        this.ext_ = struct2;
                                        if (builder != null) {
                                            builder.mergeFrom(struct2);
                                            this.ext_ = builder.buildPartial();
                                        }
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.setUnfinishedMessage(this);
                            } catch (IOException e11) {
                                throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                            }
                        } catch (Throwable th2) {
                            if (z11) {
                                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = bVarG.build();
                            makeExtensionsImmutable();
                            throw th2;
                        }
                    }
                    if (z11) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                }

                public static Macro parseFrom(l lVar) throws IOException {
                    return (Macro) h0.parseWithIOException(PARSER, lVar);
                }

                public static Macro parseFrom(l lVar, w wVar) throws IOException {
                    return (Macro) h0.parseWithIOException(PARSER, lVar, wVar);
                }
            }

            public interface MacroOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

                Struct getExt();

                e2 getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                e getExtProtoOrBuilder(int i10);

                List<? extends e> getExtProtoOrBuilderList();

                String getKey();

                ByteString getKeyBytes();

                String getValue();

                ByteString getValueBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static Bid getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f19295q;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Bid parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Bid) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Bid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Bid)) {
                    return super.equals(obj);
                }
                Bid bid = (Bid) obj;
                if (!getId().equals(bid.getId()) || !getItem().equals(bid.getItem()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(bid.getPrice()) || !getDeal().equals(bid.getDeal()) || !getCid().equals(bid.getCid()) || !getTactic().equals(bid.getTactic()) || !getPurl().equals(bid.getPurl()) || !getBurl().equals(bid.getBurl()) || !getLurl().equals(bid.getLurl()) || getExp() != bid.getExp() || !getMid().equals(bid.getMid()) || !getMacroList().equals(bid.getMacroList()) || hasMedia() != bid.hasMedia()) {
                    return false;
                }
                if ((!hasMedia() || getMedia().equals(bid.getMedia())) && hasExt() == bid.hasExt()) {
                    return (!hasExt() || getExt().equals(bid.getExt())) && getExtProtoList().equals(bid.getExtProtoList()) && this.unknownFields.equals(bid.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getBurl() {
                Object obj = this.burl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.burl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getBurlBytes() {
                Object obj = this.burl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.burl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getCid() {
                Object obj = this.cid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getCidBytes() {
                Object obj = this.cid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getDeal() {
                Object obj = this.deal_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.deal_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getDealBytes() {
                Object obj = this.deal_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deal_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getExp() {
                return this.exp_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getItem() {
                Object obj = this.item_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.item_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getItemBytes() {
                Object obj = this.item_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.item_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getLurl() {
                Object obj = this.lurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lurl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getLurlBytes() {
                Object obj = this.lurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lurl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Macro getMacro(int i10) {
                return this.macro_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getMacroCount() {
                return this.macro_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<Macro> getMacroList() {
                return this.macro_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public MacroOrBuilder getMacroOrBuilder(int i10) {
                return this.macro_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<? extends MacroOrBuilder> getMacroOrBuilderList() {
                return this.macro_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Any getMedia() {
                Any any = this.media_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public e getMediaOrBuilder() {
                return getMedia();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getMid() {
                Object obj = this.mid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getMidBytes() {
                Object obj = this.mid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getPurl() {
                Object obj = this.purl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.purl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getPurlBytes() {
                Object obj = this.purl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.purl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
                if (!getItemBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(2, this.item_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iComputeStringSize += n.j(3, d10);
                }
                if (!getDealBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(4, this.deal_);
                }
                if (!getCidBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(5, this.cid_);
                }
                if (!getTacticBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(6, this.tactic_);
                }
                if (!getPurlBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(7, this.purl_);
                }
                if (!getBurlBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(8, this.burl_);
                }
                if (!getLurlBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(9, this.lurl_);
                }
                int i11 = this.exp_;
                if (i11 != 0) {
                    iComputeStringSize += n.Y(10, i11);
                }
                if (!getMidBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(11, this.mid_);
                }
                for (int i12 = 0; i12 < this.macro_.size(); i12++) {
                    iComputeStringSize += n.G(12, this.macro_.get(i12));
                }
                if (this.media_ != null) {
                    iComputeStringSize += n.G(13, getMedia());
                }
                for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                    iComputeStringSize += n.G(14, this.extProto_.get(i13));
                }
                if (this.ext_ != null) {
                    iComputeStringSize += n.G(15, getExt());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getTactic() {
                Object obj = this.tactic_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tactic_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getTacticBytes() {
                Object obj = this.tactic_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tactic_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public boolean hasMedia() {
                return this.media_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getItem().hashCode()) * 37) + 3) * 53) + j0.i(Double.doubleToLongBits(getPrice()))) * 37) + 4) * 53) + getDeal().hashCode()) * 37) + 5) * 53) + getCid().hashCode()) * 37) + 6) * 53) + getTactic().hashCode()) * 37) + 7) * 53) + getPurl().hashCode()) * 37) + 8) * 53) + getBurl().hashCode()) * 37) + 9) * 53) + getLurl().hashCode()) * 37) + 10) * 53) + getExp()) * 37) + 11) * 53) + getMid().hashCode();
                if (getMacroCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 12) * 53) + getMacroList().hashCode();
                }
                if (hasMedia()) {
                    iHashCode = (((iHashCode * 37) + 13) * 53) + getMedia().hashCode();
                }
                if (hasExt()) {
                    iHashCode = (((iHashCode * 37) + 15) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 14) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return b.f19296r.d(Bid.class, Builder.class);
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
                return new Bid();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.id_);
                }
                if (!getItemBytes().isEmpty()) {
                    h0.writeString(nVar, 2, this.item_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    nVar.t0(3, d10);
                }
                if (!getDealBytes().isEmpty()) {
                    h0.writeString(nVar, 4, this.deal_);
                }
                if (!getCidBytes().isEmpty()) {
                    h0.writeString(nVar, 5, this.cid_);
                }
                if (!getTacticBytes().isEmpty()) {
                    h0.writeString(nVar, 6, this.tactic_);
                }
                if (!getPurlBytes().isEmpty()) {
                    h0.writeString(nVar, 7, this.purl_);
                }
                if (!getBurlBytes().isEmpty()) {
                    h0.writeString(nVar, 8, this.burl_);
                }
                if (!getLurlBytes().isEmpty()) {
                    h0.writeString(nVar, 9, this.lurl_);
                }
                int i10 = this.exp_;
                if (i10 != 0) {
                    nVar.W0(10, i10);
                }
                if (!getMidBytes().isEmpty()) {
                    h0.writeString(nVar, 11, this.mid_);
                }
                for (int i11 = 0; i11 < this.macro_.size(); i11++) {
                    nVar.J0(12, this.macro_.get(i11));
                }
                if (this.media_ != null) {
                    nVar.J0(13, getMedia());
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    nVar.J0(14, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    nVar.J0(15, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements BidOrBuilder {
                private int bitField0_;
                private Object burl_;
                private Object cid_;
                private Object deal_;
                private int exp_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object item_;
                private Object lurl_;
                private v1 macroBuilder_;
                private List<Macro> macro_;
                private a2 mediaBuilder_;
                private Any media_;
                private Object mid_;
                private double price_;
                private Object purl_;
                private Object tactic_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureMacroIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.macro_ = new ArrayList(this.macro_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f19295q;
                }

                private a2 getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private v1 getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private v1 getMacroFieldBuilder() {
                    if (this.macroBuilder_ == null) {
                        this.macroBuilder_ = new v1(this.macro_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.macro_ = null;
                    }
                    return this.macroBuilder_;
                }

                private a2 getMediaFieldBuilder() {
                    if (this.mediaBuilder_ == null) {
                        this.mediaBuilder_ = new a2(getMedia(), getParentForChildren(), isClean());
                        this.media_ = null;
                    }
                    return this.mediaBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        getMacroFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                    return this;
                }

                public Builder addAllMacro(Iterable<? extends Macro> iterable) {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureMacroIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.macro_);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any any) {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        v1Var.e(any);
                        return this;
                    }
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                public Builder addMacro(Macro macro) {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var != null) {
                        v1Var.e(macro);
                        return this;
                    }
                    macro.getClass();
                    ensureMacroIsMutable();
                    this.macro_.add(macro);
                    onChanged();
                    return this;
                }

                public Macro.Builder addMacroBuilder() {
                    return (Macro.Builder) getMacroFieldBuilder().c(Macro.getDefaultInstance());
                }

                public Builder clearBurl() {
                    this.burl_ = Bid.getDefaultInstance().getBurl();
                    onChanged();
                    return this;
                }

                public Builder clearCid() {
                    this.cid_ = Bid.getDefaultInstance().getCid();
                    onChanged();
                    return this;
                }

                public Builder clearDeal() {
                    this.deal_ = Bid.getDefaultInstance().getDeal();
                    onChanged();
                    return this;
                }

                public Builder clearExp() {
                    this.exp_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                        return this;
                    }
                    this.ext_ = null;
                    this.extBuilder_ = null;
                    return this;
                }

                public Builder clearExtProto() {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Bid.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearItem() {
                    this.item_ = Bid.getDefaultInstance().getItem();
                    onChanged();
                    return this;
                }

                public Builder clearLurl() {
                    this.lurl_ = Bid.getDefaultInstance().getLurl();
                    onChanged();
                    return this;
                }

                public Builder clearMacro() {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.macro_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearMedia() {
                    if (this.mediaBuilder_ == null) {
                        this.media_ = null;
                        onChanged();
                        return this;
                    }
                    this.media_ = null;
                    this.mediaBuilder_ = null;
                    return this;
                }

                public Builder clearMid() {
                    this.mid_ = Bid.getDefaultInstance().getMid();
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearPurl() {
                    this.purl_ = Bid.getDefaultInstance().getPurl();
                    onChanged();
                    return this;
                }

                public Builder clearTactic() {
                    this.tactic_ = Bid.getDefaultInstance().getTactic();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getBurl() {
                    Object obj = this.burl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.burl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getBurlBytes() {
                    Object obj = this.burl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.burl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getCid() {
                    Object obj = this.cid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.cid_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getCidBytes() {
                    Object obj = this.cid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.cid_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getDeal() {
                    Object obj = this.deal_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.deal_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getDealBytes() {
                    Object obj = this.deal_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.deal_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f19295q;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getExp() {
                    return this.exp_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Struct getExt() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (Struct) a2Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Any getExtProto(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (Any) v1Var.n(i10);
                }

                public Any.Builder getExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getItem() {
                    Object obj = this.item_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.item_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getItemBytes() {
                    Object obj = this.item_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.item_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getLurl() {
                    Object obj = this.lurl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lurl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getLurlBytes() {
                    Object obj = this.lurl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lurl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Macro getMacro(int i10) {
                    v1 v1Var = this.macroBuilder_;
                    return v1Var == null ? this.macro_.get(i10) : (Macro) v1Var.n(i10);
                }

                public Macro.Builder getMacroBuilder(int i10) {
                    return (Macro.Builder) getMacroFieldBuilder().k(i10);
                }

                public List<Macro.Builder> getMacroBuilderList() {
                    return getMacroFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getMacroCount() {
                    v1 v1Var = this.macroBuilder_;
                    return v1Var == null ? this.macro_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<Macro> getMacroList() {
                    v1 v1Var = this.macroBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.macro_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public MacroOrBuilder getMacroOrBuilder(int i10) {
                    v1 v1Var = this.macroBuilder_;
                    return v1Var == null ? this.macro_.get(i10) : (MacroOrBuilder) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<? extends MacroOrBuilder> getMacroOrBuilderList() {
                    v1 v1Var = this.macroBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.macro_);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Any getMedia() {
                    a2 a2Var = this.mediaBuilder_;
                    if (a2Var != null) {
                        return (Any) a2Var.e();
                    }
                    Any any = this.media_;
                    return any == null ? Any.getDefaultInstance() : any;
                }

                public Any.Builder getMediaBuilder() {
                    onChanged();
                    return (Any.Builder) getMediaFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public e getMediaOrBuilder() {
                    a2 a2Var = this.mediaBuilder_;
                    if (a2Var != null) {
                        return (e) a2Var.f();
                    }
                    Any any = this.media_;
                    return any == null ? Any.getDefaultInstance() : any;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getMid() {
                    Object obj = this.mid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.mid_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getMidBytes() {
                    Object obj = this.mid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.mid_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getPurl() {
                    Object obj = this.purl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.purl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getPurlBytes() {
                    Object obj = this.purl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.purl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getTactic() {
                    Object obj = this.tactic_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.tactic_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getTacticBytes() {
                    Object obj = this.tactic_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.tactic_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public boolean hasMedia() {
                    return (this.mediaBuilder_ == null && this.media_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f19296r.d(Bid.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeExt(Struct struct) {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        a2Var.g(struct);
                        return this;
                    }
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeMedia(Any any) {
                    a2 a2Var = this.mediaBuilder_;
                    if (a2Var != null) {
                        a2Var.g(any);
                        return this;
                    }
                    Any any2 = this.media_;
                    if (any2 != null) {
                        this.media_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                    } else {
                        this.media_ = any;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeExtProto(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder removeMacro(int i10) {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureMacroIsMutable();
                    this.macro_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setBurl(String str) {
                    str.getClass();
                    this.burl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setBurlBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.burl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setCid(String str) {
                    str.getClass();
                    this.cid_ = str;
                    onChanged();
                    return this;
                }

                public Builder setCidBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.cid_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setDeal(String str) {
                    str.getClass();
                    this.deal_ = str;
                    onChanged();
                    return this;
                }

                public Builder setDealBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.deal_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setExp(int i10) {
                    this.exp_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setExt(Struct struct) {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        a2Var.i(struct);
                        return this;
                    }
                    struct.getClass();
                    this.ext_ = struct;
                    onChanged();
                    return this;
                }

                public Builder setExtProto(int i10, Any any) {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, any);
                        return this;
                    }
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, any);
                    onChanged();
                    return this;
                }

                public Builder setId(String str) {
                    str.getClass();
                    this.id_ = str;
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setItem(String str) {
                    str.getClass();
                    this.item_ = str;
                    onChanged();
                    return this;
                }

                public Builder setItemBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.item_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLurl(String str) {
                    str.getClass();
                    this.lurl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLurlBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.lurl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setMacro(int i10, Macro macro) {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, macro);
                        return this;
                    }
                    macro.getClass();
                    ensureMacroIsMutable();
                    this.macro_.set(i10, macro);
                    onChanged();
                    return this;
                }

                public Builder setMedia(Any any) {
                    a2 a2Var = this.mediaBuilder_;
                    if (a2Var != null) {
                        a2Var.i(any);
                        return this;
                    }
                    any.getClass();
                    this.media_ = any;
                    onChanged();
                    return this;
                }

                public Builder setMid(String str) {
                    str.getClass();
                    this.mid_ = str;
                    onChanged();
                    return this;
                }

                public Builder setMidBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.mid_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setPurl(String str) {
                    str.getClass();
                    this.purl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setPurlBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.purl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTactic(String str) {
                    str.getClass();
                    this.tactic_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTacticBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.tactic_ = byteString;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.id_ = "";
                    this.item_ = "";
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.mid_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.macro_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Bid build() {
                    Bid bidBuildPartial = buildPartial();
                    if (bidBuildPartial.isInitialized()) {
                        return bidBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) bidBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Bid buildPartial() {
                    Bid bid = new Bid(this);
                    bid.id_ = this.id_;
                    bid.item_ = this.item_;
                    bid.price_ = this.price_;
                    bid.deal_ = this.deal_;
                    bid.cid_ = this.cid_;
                    bid.tactic_ = this.tactic_;
                    bid.purl_ = this.purl_;
                    bid.burl_ = this.burl_;
                    bid.lurl_ = this.lurl_;
                    bid.exp_ = this.exp_;
                    bid.mid_ = this.mid_;
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var != null) {
                        bid.macro_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.macro_ = DesugarCollections.unmodifiableList(this.macro_);
                            this.bitField0_ &= -2;
                        }
                        bid.macro_ = this.macro_;
                    }
                    a2 a2Var = this.mediaBuilder_;
                    if (a2Var == null) {
                        bid.media_ = this.media_;
                    } else {
                        bid.media_ = (Any) a2Var.a();
                    }
                    a2 a2Var2 = this.extBuilder_;
                    if (a2Var2 == null) {
                        bid.ext_ = this.ext_;
                    } else {
                        bid.ext_ = (Struct) a2Var2.a();
                    }
                    v1 v1Var2 = this.extProtoBuilder_;
                    if (v1Var2 != null) {
                        bid.extProto_ = v1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        bid.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return bid;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Bid getDefaultInstanceForType() {
                    return Bid.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
                }

                public Macro.Builder addMacroBuilder(int i10) {
                    return (Macro.Builder) getMacroFieldBuilder().b(i10, Macro.getDefaultInstance());
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
                    this.id_ = "";
                    this.item_ = "";
                    this.price_ = 0.0d;
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.exp_ = 0;
                    this.mid_ = "";
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var == null) {
                        this.macro_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        v1Var.g();
                    }
                    if (this.mediaBuilder_ == null) {
                        this.media_ = null;
                    } else {
                        this.media_ = null;
                        this.mediaBuilder_ = null;
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    v1 v1Var2 = this.extProtoBuilder_;
                    if (v1Var2 == null) {
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -3;
                        return this;
                    }
                    v1Var2.g();
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        this.ext_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setMedia(Any.Builder builder) {
                    a2 a2Var = this.mediaBuilder_;
                    if (a2Var == null) {
                        this.media_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder addExtProto(int i10, Any any) {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, any);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, any);
                    return this;
                }

                public Builder addMacro(int i10, Macro macro) {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var == null) {
                        macro.getClass();
                        ensureMacroIsMutable();
                        this.macro_.add(i10, macro);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, macro);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Bid) {
                        return mergeFrom((Bid) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setExtProto(int i10, Any.Builder builder) {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                public Builder setMacro(int i10, Macro.Builder builder) {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var == null) {
                        ensureMacroIsMutable();
                        this.macro_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(Bid bid) {
                    if (bid == Bid.getDefaultInstance()) {
                        return this;
                    }
                    if (!bid.getId().isEmpty()) {
                        this.id_ = bid.id_;
                        onChanged();
                    }
                    if (!bid.getItem().isEmpty()) {
                        this.item_ = bid.item_;
                        onChanged();
                    }
                    if (bid.getPrice() != 0.0d) {
                        setPrice(bid.getPrice());
                    }
                    if (!bid.getDeal().isEmpty()) {
                        this.deal_ = bid.deal_;
                        onChanged();
                    }
                    if (!bid.getCid().isEmpty()) {
                        this.cid_ = bid.cid_;
                        onChanged();
                    }
                    if (!bid.getTactic().isEmpty()) {
                        this.tactic_ = bid.tactic_;
                        onChanged();
                    }
                    if (!bid.getPurl().isEmpty()) {
                        this.purl_ = bid.purl_;
                        onChanged();
                    }
                    if (!bid.getBurl().isEmpty()) {
                        this.burl_ = bid.burl_;
                        onChanged();
                    }
                    if (!bid.getLurl().isEmpty()) {
                        this.lurl_ = bid.lurl_;
                        onChanged();
                    }
                    if (bid.getExp() != 0) {
                        setExp(bid.getExp());
                    }
                    if (!bid.getMid().isEmpty()) {
                        this.mid_ = bid.mid_;
                        onChanged();
                    }
                    if (this.macroBuilder_ == null) {
                        if (!bid.macro_.isEmpty()) {
                            if (this.macro_.isEmpty()) {
                                this.macro_ = bid.macro_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureMacroIsMutable();
                                this.macro_.addAll(bid.macro_);
                            }
                            onChanged();
                        }
                    } else if (!bid.macro_.isEmpty()) {
                        if (!this.macroBuilder_.t()) {
                            this.macroBuilder_.a(bid.macro_);
                        } else {
                            this.macroBuilder_.h();
                            this.macroBuilder_ = null;
                            this.macro_ = bid.macro_;
                            this.bitField0_ &= -2;
                            this.macroBuilder_ = h0.alwaysUseFieldBuilders ? getMacroFieldBuilder() : null;
                        }
                    }
                    if (bid.hasMedia()) {
                        mergeMedia(bid.getMedia());
                    }
                    if (bid.hasExt()) {
                        mergeExt(bid.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!bid.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = bid.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(bid.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!bid.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(bid.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = bid.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) bid).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                public Builder addMacro(Macro.Builder builder) {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var == null) {
                        ensureMacroIsMutable();
                        this.macro_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.id_ = "";
                    this.item_ = "";
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.mid_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.macro_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addExtProto(int i10, Any.Builder builder) {
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, builder.build());
                    return this;
                }

                public Builder addMacro(int i10, Macro.Builder builder) {
                    v1 v1Var = this.macroBuilder_;
                    if (v1Var == null) {
                        ensureMacroIsMutable();
                        this.macro_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, builder.build());
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.access$3600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.openrtb.Response$Seatbid$Bid r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.openrtb.Response$Seatbid$Bid r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Builder");
                }
            }

            public static Builder newBuilder(Bid bid) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(bid);
            }

            public static Bid parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Bid(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Bid parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Bid) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Bid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Bid getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Bid parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Bid() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.item_ = "";
                this.deal_ = "";
                this.cid_ = "";
                this.tactic_ = "";
                this.purl_ = "";
                this.burl_ = "";
                this.lurl_ = "";
                this.mid_ = "";
                List list = Collections.EMPTY_LIST;
                this.macro_ = list;
                this.extProto_ = list;
            }

            public static Bid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Bid parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(bArr, wVar);
            }

            public static Bid parseFrom(InputStream inputStream) throws IOException {
                return (Bid) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Bid parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Bid) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Bid parseFrom(l lVar) throws IOException {
                return (Bid) h0.parseWithIOException(PARSER, lVar);
            }

            public static Bid parseFrom(l lVar, w wVar) throws IOException {
                return (Bid) h0.parseWithIOException(PARSER, lVar, wVar);
            }

            private Bid(l lVar, w wVar) throws InvalidProtocolBufferException {
                this();
                wVar.getClass();
                r2.b bVarG = r2.g();
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iK = lVar.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                    break;
                                case 10:
                                    this.id_ = lVar.J();
                                    break;
                                case 18:
                                    this.item_ = lVar.J();
                                    break;
                                case 25:
                                    this.price_ = lVar.s();
                                    break;
                                case 34:
                                    this.deal_ = lVar.J();
                                    break;
                                case 42:
                                    this.cid_ = lVar.J();
                                    break;
                                case 50:
                                    this.tactic_ = lVar.J();
                                    break;
                                case 58:
                                    this.purl_ = lVar.J();
                                    break;
                                case 66:
                                    this.burl_ = lVar.J();
                                    break;
                                case 74:
                                    this.lurl_ = lVar.J();
                                    break;
                                case 80:
                                    this.exp_ = lVar.L();
                                    break;
                                case 90:
                                    this.mid_ = lVar.J();
                                    break;
                                case 98:
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 == 0) {
                                        this.macro_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.macro_.add((Macro) lVar.A(Macro.parser(), wVar));
                                    break;
                                case 106:
                                    Any any = this.media_;
                                    Any.Builder builder = any != null ? any.toBuilder() : null;
                                    Any any2 = (Any) lVar.A(Any.parser(), wVar);
                                    this.media_ = any2;
                                    if (builder != null) {
                                        builder.mergeFrom(any2);
                                        this.media_ = builder.buildPartial();
                                    }
                                    break;
                                case 114:
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                    break;
                                case 122:
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
                                    }
                                    break;
                                default:
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        z10 = true;
                                    }
                                    break;
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if (((i10 == true ? 1 : 0) & 1) != 0) {
                            this.macro_ = DesugarCollections.unmodifiableList(this.macro_);
                        }
                        if (((i10 == true ? 1 : 0) & 2) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.macro_ = DesugarCollections.unmodifiableList(this.macro_);
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }
        }

        public interface BidOrBuilder extends MessageOrBuilder {
            String getBurl();

            ByteString getBurlBytes();

            String getCid();

            ByteString getCidBytes();

            String getDeal();

            ByteString getDealBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            int getExp();

            Struct getExt();

            e2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getItem();

            ByteString getItemBytes();

            String getLurl();

            ByteString getLurlBytes();

            Bid.Macro getMacro(int i10);

            int getMacroCount();

            List<Bid.Macro> getMacroList();

            Bid.MacroOrBuilder getMacroOrBuilder(int i10);

            List<? extends Bid.MacroOrBuilder> getMacroOrBuilderList();

            Any getMedia();

            e getMediaOrBuilder();

            String getMid();

            ByteString getMidBytes();

            double getPrice();

            String getPurl();

            ByteString getPurlBytes();

            String getTactic();

            ByteString getTacticBytes();

            boolean hasExt();

            boolean hasMedia();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Seatbid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f19293o;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Seatbid parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Seatbid) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Seatbid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Seatbid)) {
                return super.equals(obj);
            }
            Seatbid seatbid = (Seatbid) obj;
            if (getSeat().equals(seatbid.getSeat()) && getPackage() == seatbid.getPackage() && getBidList().equals(seatbid.getBidList()) && hasExt() == seatbid.hasExt()) {
                return (!hasExt() || getExt().equals(seatbid.getExt())) && getExtProtoList().equals(seatbid.getExtProtoList()) && this.unknownFields.equals(seatbid.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Bid getBid(int i10) {
            return this.bid_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public int getBidCount() {
            return this.bid_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<Bid> getBidList() {
            return this.bid_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public BidOrBuilder getBidOrBuilder(int i10) {
            return this.bid_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<? extends BidOrBuilder> getBidOrBuilderList() {
            return this.bid_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public boolean getPackage() {
            return this.package_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public String getSeat() {
            Object obj = this.seat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.seat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public ByteString getSeatBytes() {
            Object obj = this.seat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.seat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getSeatBytes().isEmpty() ? h0.computeStringSize(1, this.seat_) : 0;
            boolean z10 = this.package_;
            if (z10) {
                iComputeStringSize += n.e(2, z10);
            }
            for (int i11 = 0; i11 < this.bid_.size(); i11++) {
                iComputeStringSize += n.G(3, this.bid_.get(i11));
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                iComputeStringSize += n.G(4, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                iComputeStringSize += n.G(5, getExt());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSeat().hashCode()) * 37) + 2) * 53) + j0.d(getPackage());
            if (getBidCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getBidList().hashCode();
            }
            if (hasExt()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.f19294p.d(Seatbid.class, Builder.class);
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
            return new Seatbid();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getSeatBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.seat_);
            }
            boolean z10 = this.package_;
            if (z10) {
                nVar.n0(2, z10);
            }
            for (int i10 = 0; i10 < this.bid_.size(); i10++) {
                nVar.J0(3, this.bid_.get(i10));
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                nVar.J0(4, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                nVar.J0(5, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements SeatbidOrBuilder {
            private v1 bidBuilder_;
            private List<Bid> bid_;
            private int bitField0_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private boolean package_;
            private Object seat_;

            private void ensureBidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.bid_ = new ArrayList(this.bid_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private v1 getBidFieldBuilder() {
                if (this.bidBuilder_ == null) {
                    this.bidBuilder_ = new v1(this.bid_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.bid_ = null;
                }
                return this.bidBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f19293o;
            }

            private a2 getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private v1 getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getBidFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllBid(Iterable<? extends Bid> iterable) {
                v1 v1Var = this.bidBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureBidIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.bid_);
                onChanged();
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureExtProtoIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.extProto_);
                onChanged();
                return this;
            }

            public Builder addBid(Bid bid) {
                v1 v1Var = this.bidBuilder_;
                if (v1Var != null) {
                    v1Var.e(bid);
                    return this;
                }
                bid.getClass();
                ensureBidIsMutable();
                this.bid_.add(bid);
                onChanged();
                return this;
            }

            public Bid.Builder addBidBuilder() {
                return (Bid.Builder) getBidFieldBuilder().c(Bid.getDefaultInstance());
            }

            public Builder addExtProto(Any any) {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    v1Var.e(any);
                    return this;
                }
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Builder clearBid() {
                v1 v1Var = this.bidBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.bid_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                    return this;
                }
                this.ext_ = null;
                this.extBuilder_ = null;
                return this;
            }

            public Builder clearExtProto() {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.extProto_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearPackage() {
                this.package_ = false;
                onChanged();
                return this;
            }

            public Builder clearSeat() {
                this.seat_ = Seatbid.getDefaultInstance().getSeat();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public Bid getBid(int i10) {
                v1 v1Var = this.bidBuilder_;
                return v1Var == null ? this.bid_.get(i10) : (Bid) v1Var.n(i10);
            }

            public Bid.Builder getBidBuilder(int i10) {
                return (Bid.Builder) getBidFieldBuilder().k(i10);
            }

            public List<Bid.Builder> getBidBuilderList() {
                return getBidFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public int getBidCount() {
                v1 v1Var = this.bidBuilder_;
                return v1Var == null ? this.bid_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<Bid> getBidList() {
                v1 v1Var = this.bidBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.bid_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public BidOrBuilder getBidOrBuilder(int i10) {
                v1 v1Var = this.bidBuilder_;
                return v1Var == null ? this.bid_.get(i10) : (BidOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<? extends BidOrBuilder> getBidOrBuilderList() {
                v1 v1Var = this.bidBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.bid_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f19293o;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public Struct getExt() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (Struct) a2Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return (Struct.Builder) getExtFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public Any getExtProto(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (Any) v1Var.n(i10);
            }

            public Any.Builder getExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().k(i10);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public boolean getPackage() {
                return this.package_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public String getSeat() {
                Object obj = this.seat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.seat_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public ByteString getSeatBytes() {
                Object obj = this.seat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.seat_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f19294p.d(Seatbid.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExt(Struct struct) {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    a2Var.g(struct);
                    return this;
                }
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.ext_ = struct;
                }
                onChanged();
                return this;
            }

            public Builder removeBid(int i10) {
                v1 v1Var = this.bidBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureBidIsMutable();
                this.bid_.remove(i10);
                onChanged();
                return this;
            }

            public Builder removeExtProto(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureExtProtoIsMutable();
                this.extProto_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setBid(int i10, Bid bid) {
                v1 v1Var = this.bidBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, bid);
                    return this;
                }
                bid.getClass();
                ensureBidIsMutable();
                this.bid_.set(i10, bid);
                onChanged();
                return this;
            }

            public Builder setExt(Struct struct) {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    a2Var.i(struct);
                    return this;
                }
                struct.getClass();
                this.ext_ = struct;
                onChanged();
                return this;
            }

            public Builder setExtProto(int i10, Any any) {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, any);
                    return this;
                }
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.set(i10, any);
                onChanged();
                return this;
            }

            public Builder setPackage(boolean z10) {
                this.package_ = z10;
                onChanged();
                return this;
            }

            public Builder setSeat(String str) {
                str.getClass();
                this.seat_ = str;
                onChanged();
                return this;
            }

            public Builder setSeatBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.seat_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.seat_ = "";
                List list = Collections.EMPTY_LIST;
                this.bid_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Seatbid build() {
                Seatbid seatbidBuildPartial = buildPartial();
                if (seatbidBuildPartial.isInitialized()) {
                    return seatbidBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) seatbidBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Seatbid buildPartial() {
                Seatbid seatbid = new Seatbid(this);
                seatbid.seat_ = this.seat_;
                seatbid.package_ = this.package_;
                v1 v1Var = this.bidBuilder_;
                if (v1Var != null) {
                    seatbid.bid_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.bid_ = DesugarCollections.unmodifiableList(this.bid_);
                        this.bitField0_ &= -2;
                    }
                    seatbid.bid_ = this.bid_;
                }
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    seatbid.ext_ = this.ext_;
                } else {
                    seatbid.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var2 = this.extProtoBuilder_;
                if (v1Var2 != null) {
                    seatbid.extProto_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    seatbid.extProto_ = this.extProto_;
                }
                onBuilt();
                return seatbid;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Seatbid getDefaultInstanceForType() {
                return Seatbid.getDefaultInstance();
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

            public Bid.Builder addBidBuilder(int i10) {
                return (Bid.Builder) getBidFieldBuilder().b(i10, Bid.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                this.seat_ = "";
                this.package_ = false;
                v1 v1Var = this.bidBuilder_;
                if (v1Var == null) {
                    this.bid_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    v1Var.g();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                v1 v1Var2 = this.extProtoBuilder_;
                if (v1Var2 == null) {
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    return this;
                }
                v1Var2.g();
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    this.ext_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addBid(int i10, Bid bid) {
                v1 v1Var = this.bidBuilder_;
                if (v1Var == null) {
                    bid.getClass();
                    ensureBidIsMutable();
                    this.bid_.add(i10, bid);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, bid);
                return this;
            }

            public Builder addExtProto(int i10, Any any) {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, any);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, any);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Seatbid) {
                    return mergeFrom((Seatbid) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setBid(int i10, Bid.Builder builder) {
                v1 v1Var = this.bidBuilder_;
                if (v1Var == null) {
                    ensureBidIsMutable();
                    this.bid_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder setExtProto(int i10, Any.Builder builder) {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.seat_ = "";
                List list = Collections.EMPTY_LIST;
                this.bid_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Seatbid seatbid) {
                if (seatbid == Seatbid.getDefaultInstance()) {
                    return this;
                }
                if (!seatbid.getSeat().isEmpty()) {
                    this.seat_ = seatbid.seat_;
                    onChanged();
                }
                if (seatbid.getPackage()) {
                    setPackage(seatbid.getPackage());
                }
                if (this.bidBuilder_ == null) {
                    if (!seatbid.bid_.isEmpty()) {
                        if (this.bid_.isEmpty()) {
                            this.bid_ = seatbid.bid_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureBidIsMutable();
                            this.bid_.addAll(seatbid.bid_);
                        }
                        onChanged();
                    }
                } else if (!seatbid.bid_.isEmpty()) {
                    if (!this.bidBuilder_.t()) {
                        this.bidBuilder_.a(seatbid.bid_);
                    } else {
                        this.bidBuilder_.h();
                        this.bidBuilder_ = null;
                        this.bid_ = seatbid.bid_;
                        this.bitField0_ &= -2;
                        this.bidBuilder_ = h0.alwaysUseFieldBuilders ? getBidFieldBuilder() : null;
                    }
                }
                if (seatbid.hasExt()) {
                    mergeExt(seatbid.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!seatbid.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = seatbid.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(seatbid.extProto_);
                        }
                        onChanged();
                    }
                } else if (!seatbid.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(seatbid.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = seatbid.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) seatbid).unknownFields);
                onChanged();
                return this;
            }

            public Builder addBid(Bid.Builder builder) {
                v1 v1Var = this.bidBuilder_;
                if (v1Var == null) {
                    ensureBidIsMutable();
                    this.bid_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addBid(int i10, Bid.Builder builder) {
                v1 v1Var = this.bidBuilder_;
                if (v1Var == null) {
                    ensureBidIsMutable();
                    this.bid_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.d(i10, builder.build());
                return this;
            }

            public Builder addExtProto(int i10, Any.Builder builder) {
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.d(i10, builder.build());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.openrtb.Response.Seatbid.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.access$5900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.openrtb.Response$Seatbid r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.openrtb.Response$Seatbid r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Response$Seatbid$Builder");
            }
        }

        public static Builder newBuilder(Seatbid seatbid) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(seatbid);
        }

        public static Seatbid parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Seatbid(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Seatbid parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Seatbid) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Seatbid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Seatbid getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Seatbid parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Seatbid() {
            this.memoizedIsInitialized = (byte) -1;
            this.seat_ = "";
            List list = Collections.EMPTY_LIST;
            this.bid_ = list;
            this.extProto_ = list;
        }

        public static Seatbid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Seatbid parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(bArr, wVar);
        }

        public static Seatbid parseFrom(InputStream inputStream) throws IOException {
            return (Seatbid) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Seatbid parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Seatbid) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        private Seatbid(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = lVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.seat_ = lVar.J();
                                } else if (iK == 16) {
                                    this.package_ = lVar.q();
                                } else if (iK == 26) {
                                    if ((i10 & 1) == 0) {
                                        this.bid_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.bid_.add((Bid) lVar.A(Bid.parser(), wVar));
                                } else if (iK == 34) {
                                    if ((i10 & 2) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                } else if (iK != 42) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
                                    }
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) != 0) {
                        this.bid_ = DesugarCollections.unmodifiableList(this.bid_);
                    }
                    if ((i10 & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.bid_ = DesugarCollections.unmodifiableList(this.bid_);
            }
            if ((i10 & 2) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Seatbid parseFrom(l lVar) throws IOException {
            return (Seatbid) h0.parseWithIOException(PARSER, lVar);
        }

        public static Seatbid parseFrom(l lVar, w wVar) throws IOException {
            return (Seatbid) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface SeatbidOrBuilder extends MessageOrBuilder {
        Seatbid.Bid getBid(int i10);

        int getBidCount();

        List<Seatbid.Bid> getBidList();

        Seatbid.BidOrBuilder getBidOrBuilder(int i10);

        List<? extends Seatbid.BidOrBuilder> getBidOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        Struct getExt();

        e2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        boolean getPackage();

        String getSeat();

        ByteString getSeatBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f19291m;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Response) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return super.equals(obj);
        }
        Response response = (Response) obj;
        if (getId().equals(response.getId()) && getBidid().equals(response.getBidid()) && this.nbr_ == response.nbr_ && getCur().equals(response.getCur()) && getCdata().equals(response.getCdata()) && getSeatbidList().equals(response.getSeatbidList()) && hasExt() == response.hasExt()) {
            return (!hasExt() || getExt().equals(response.getExt())) && getExtProtoList().equals(response.getExtProtoList()) && this.unknownFields.equals(response.unknownFields);
        }
        return false;
    }

    public String getBidid() {
        Object obj = this.bidid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBididBytes() {
        Object obj = this.bidid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getCdata() {
        Object obj = this.cdata_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cdata_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCdataBytes() {
        Object obj = this.cdata_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cdata_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getCur() {
        Object obj = this.cur_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cur_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCurBytes() {
        Object obj = this.cur_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cur_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public e2 getExtOrBuilder() {
        return getExt();
    }

    public Any getExtProto(int i10) {
        return this.extProto_.get(i10);
    }

    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    public e getExtProtoOrBuilder(int i10) {
        return this.extProto_.get(i10);
    }

    public List<? extends e> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public NoBidReason getNbr() {
        NoBidReason noBidReasonValueOf = NoBidReason.valueOf(this.nbr_);
        return noBidReasonValueOf == null ? NoBidReason.UNRECOGNIZED : noBidReasonValueOf;
    }

    public int getNbrValue() {
        return this.nbr_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    public Seatbid getSeatbid(int i10) {
        return this.seatbid_.get(i10);
    }

    public int getSeatbidCount() {
        return this.seatbid_.size();
    }

    public List<Seatbid> getSeatbidList() {
        return this.seatbid_;
    }

    public SeatbidOrBuilder getSeatbidOrBuilder(int i10) {
        return this.seatbid_.get(i10);
    }

    public List<? extends SeatbidOrBuilder> getSeatbidOrBuilderList() {
        return this.seatbid_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
        if (!getBididBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.bidid_);
        }
        if (this.nbr_ != NoBidReason.NO_BID_REASON_INVALID.getNumber()) {
            iComputeStringSize += n.l(3, this.nbr_);
        }
        if (!getCurBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(4, this.cur_);
        }
        if (!getCdataBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(5, this.cdata_);
        }
        for (int i11 = 0; i11 < this.seatbid_.size(); i11++) {
            iComputeStringSize += n.G(6, this.seatbid_.get(i11));
        }
        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
            iComputeStringSize += n.G(7, this.extProto_.get(i12));
        }
        if (this.ext_ != null) {
            iComputeStringSize += n.G(8, getExt());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getBidid().hashCode()) * 37) + 3) * 53) + this.nbr_) * 37) + 4) * 53) + getCur().hashCode()) * 37) + 5) * 53) + getCdata().hashCode();
        if (getSeatbidCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getSeatbidList().hashCode();
        }
        if (hasExt()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getExtProtoList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return b.f19292n.d(Response.class, Builder.class);
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
        return new Response();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getIdBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.id_);
        }
        if (!getBididBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.bidid_);
        }
        if (this.nbr_ != NoBidReason.NO_BID_REASON_INVALID.getNumber()) {
            nVar.v0(3, this.nbr_);
        }
        if (!getCurBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.cur_);
        }
        if (!getCdataBytes().isEmpty()) {
            h0.writeString(nVar, 5, this.cdata_);
        }
        for (int i10 = 0; i10 < this.seatbid_.size(); i10++) {
            nVar.J0(6, this.seatbid_.get(i10));
        }
        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
            nVar.J0(7, this.extProto_.get(i11));
        }
        if (this.ext_ != null) {
            nVar.J0(8, getExt());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements d {
        private Object bidid_;
        private int bitField0_;
        private Object cdata_;
        private Object cur_;
        private a2 extBuilder_;
        private v1 extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private int nbr_;
        private v1 seatbidBuilder_;
        private List<Seatbid> seatbid_;

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureSeatbidIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.seatbid_ = new ArrayList(this.seatbid_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f19291m;
        }

        private a2 getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private v1 getExtProtoFieldBuilder() {
            if (this.extProtoBuilder_ == null) {
                this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private v1 getSeatbidFieldBuilder() {
            if (this.seatbidBuilder_ == null) {
                this.seatbidBuilder_ = new v1(this.seatbid_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.seatbid_ = null;
            }
            return this.seatbidBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getSeatbidFieldBuilder();
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureExtProtoIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.extProto_);
            onChanged();
            return this;
        }

        public Builder addAllSeatbid(Iterable<? extends Seatbid> iterable) {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureSeatbidIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.seatbid_);
            onChanged();
            return this;
        }

        public Builder addExtProto(Any any) {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var != null) {
                v1Var.e(any);
                return this;
            }
            any.getClass();
            ensureExtProtoIsMutable();
            this.extProto_.add(any);
            onChanged();
            return this;
        }

        public Any.Builder addExtProtoBuilder() {
            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
        }

        public Builder addSeatbid(Seatbid seatbid) {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var != null) {
                v1Var.e(seatbid);
                return this;
            }
            seatbid.getClass();
            ensureSeatbidIsMutable();
            this.seatbid_.add(seatbid);
            onChanged();
            return this;
        }

        public Seatbid.Builder addSeatbidBuilder() {
            return (Seatbid.Builder) getSeatbidFieldBuilder().c(Seatbid.getDefaultInstance());
        }

        public Builder clearBidid() {
            this.bidid_ = Response.getDefaultInstance().getBidid();
            onChanged();
            return this;
        }

        public Builder clearCdata() {
            this.cdata_ = Response.getDefaultInstance().getCdata();
            onChanged();
            return this;
        }

        public Builder clearCur() {
            this.cur_ = Response.getDefaultInstance().getCur();
            onChanged();
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
                return this;
            }
            this.ext_ = null;
            this.extBuilder_ = null;
            return this;
        }

        public Builder clearExtProto() {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.extProto_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.id_ = Response.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearNbr() {
            this.nbr_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSeatbid() {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.seatbid_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public String getBidid() {
            Object obj = this.bidid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBididBytes() {
            Object obj = this.bidid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getCdata() {
            Object obj = this.cdata_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cdata_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCdataBytes() {
            Object obj = this.cdata_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cdata_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getCur() {
            Object obj = this.cur_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cur_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCurBytes() {
            Object obj = this.cur_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cur_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f19291m;
        }

        public Struct getExt() {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return (Struct.Builder) getExtFieldBuilder().d();
        }

        public e2 getExtOrBuilder() {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Any getExtProto(int i10) {
            v1 v1Var = this.extProtoBuilder_;
            return v1Var == null ? this.extProto_.get(i10) : (Any) v1Var.n(i10);
        }

        public Any.Builder getExtProtoBuilder(int i10) {
            return (Any.Builder) getExtProtoFieldBuilder().k(i10);
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().l();
        }

        public int getExtProtoCount() {
            v1 v1Var = this.extProtoBuilder_;
            return v1Var == null ? this.extProto_.size() : v1Var.m();
        }

        public List<Any> getExtProtoList() {
            v1 v1Var = this.extProtoBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
        }

        public e getExtProtoOrBuilder(int i10) {
            v1 v1Var = this.extProtoBuilder_;
            return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
        }

        public List<? extends e> getExtProtoOrBuilderList() {
            v1 v1Var = this.extProtoBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public NoBidReason getNbr() {
            NoBidReason noBidReasonValueOf = NoBidReason.valueOf(this.nbr_);
            return noBidReasonValueOf == null ? NoBidReason.UNRECOGNIZED : noBidReasonValueOf;
        }

        public int getNbrValue() {
            return this.nbr_;
        }

        public Seatbid getSeatbid(int i10) {
            v1 v1Var = this.seatbidBuilder_;
            return v1Var == null ? this.seatbid_.get(i10) : (Seatbid) v1Var.n(i10);
        }

        public Seatbid.Builder getSeatbidBuilder(int i10) {
            return (Seatbid.Builder) getSeatbidFieldBuilder().k(i10);
        }

        public List<Seatbid.Builder> getSeatbidBuilderList() {
            return getSeatbidFieldBuilder().l();
        }

        public int getSeatbidCount() {
            v1 v1Var = this.seatbidBuilder_;
            return v1Var == null ? this.seatbid_.size() : v1Var.m();
        }

        public List<Seatbid> getSeatbidList() {
            v1 v1Var = this.seatbidBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.seatbid_) : v1Var.p();
        }

        public SeatbidOrBuilder getSeatbidOrBuilder(int i10) {
            v1 v1Var = this.seatbidBuilder_;
            return v1Var == null ? this.seatbid_.get(i10) : (SeatbidOrBuilder) v1Var.q(i10);
        }

        public List<? extends SeatbidOrBuilder> getSeatbidOrBuilderList() {
            v1 v1Var = this.seatbidBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.seatbid_);
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return b.f19292n.d(Response.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeExt(Struct struct) {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.ext_;
            if (struct2 != null) {
                this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.ext_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder removeExtProto(int i10) {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureExtProtoIsMutable();
            this.extProto_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeSeatbid(int i10) {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureSeatbidIsMutable();
            this.seatbid_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setBidid(String str) {
            str.getClass();
            this.bidid_ = str;
            onChanged();
            return this;
        }

        public Builder setBididBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.bidid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCdata(String str) {
            str.getClass();
            this.cdata_ = str;
            onChanged();
            return this;
        }

        public Builder setCdataBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.cdata_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCur(String str) {
            str.getClass();
            this.cur_ = str;
            onChanged();
            return this;
        }

        public Builder setCurBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.cur_ = byteString;
            onChanged();
            return this;
        }

        public Builder setExt(Struct struct) {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.ext_ = struct;
            onChanged();
            return this;
        }

        public Builder setExtProto(int i10, Any any) {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, any);
                return this;
            }
            any.getClass();
            ensureExtProtoIsMutable();
            this.extProto_.set(i10, any);
            onChanged();
            return this;
        }

        public Builder setId(String str) {
            str.getClass();
            this.id_ = str;
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString;
            onChanged();
            return this;
        }

        public Builder setNbr(NoBidReason noBidReason) {
            noBidReason.getClass();
            this.nbr_ = noBidReason.getNumber();
            onChanged();
            return this;
        }

        public Builder setNbrValue(int i10) {
            this.nbr_ = i10;
            onChanged();
            return this;
        }

        public Builder setSeatbid(int i10, Seatbid seatbid) {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, seatbid);
                return this;
            }
            seatbid.getClass();
            ensureSeatbidIsMutable();
            this.seatbid_.set(i10, seatbid);
            onChanged();
            return this;
        }

        private Builder() {
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            List list = Collections.EMPTY_LIST;
            this.seatbid_ = list;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Response build() {
            Response responseBuildPartial = buildPartial();
            if (responseBuildPartial.isInitialized()) {
                return responseBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) responseBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Response buildPartial() {
            Response response = new Response(this);
            response.id_ = this.id_;
            response.bidid_ = this.bidid_;
            response.nbr_ = this.nbr_;
            response.cur_ = this.cur_;
            response.cdata_ = this.cdata_;
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var != null) {
                response.seatbid_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.seatbid_ = DesugarCollections.unmodifiableList(this.seatbid_);
                    this.bitField0_ &= -2;
                }
                response.seatbid_ = this.seatbid_;
            }
            a2 a2Var = this.extBuilder_;
            if (a2Var == null) {
                response.ext_ = this.ext_;
            } else {
                response.ext_ = (Struct) a2Var.a();
            }
            v1 v1Var2 = this.extProtoBuilder_;
            if (v1Var2 != null) {
                response.extProto_ = v1Var2.f();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -3;
                }
                response.extProto_ = this.extProto_;
            }
            onBuilt();
            return response;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Response getDefaultInstanceForType() {
            return Response.getDefaultInstance();
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

        public Any.Builder addExtProtoBuilder(int i10) {
            return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
        }

        public Seatbid.Builder addSeatbidBuilder(int i10) {
            return (Seatbid.Builder) getSeatbidFieldBuilder().b(i10, Seatbid.getDefaultInstance());
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
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var == null) {
                this.seatbid_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                v1Var.g();
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            v1 v1Var2 = this.extProtoBuilder_;
            if (v1Var2 == null) {
                this.extProto_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                return this;
            }
            v1Var2.g();
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            a2 a2Var = this.extBuilder_;
            if (a2Var == null) {
                this.ext_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder addExtProto(int i10, Any any) {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(i10, any);
                onChanged();
                return this;
            }
            v1Var.d(i10, any);
            return this;
        }

        public Builder addSeatbid(int i10, Seatbid seatbid) {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var == null) {
                seatbid.getClass();
                ensureSeatbidIsMutable();
                this.seatbid_.add(i10, seatbid);
                onChanged();
                return this;
            }
            v1Var.d(i10, seatbid);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Response) {
                return mergeFrom((Response) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setExtProto(int i10, Any.Builder builder) {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder setSeatbid(int i10, Seatbid.Builder builder) {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(Response response) {
            if (response == Response.getDefaultInstance()) {
                return this;
            }
            if (!response.getId().isEmpty()) {
                this.id_ = response.id_;
                onChanged();
            }
            if (!response.getBidid().isEmpty()) {
                this.bidid_ = response.bidid_;
                onChanged();
            }
            if (response.nbr_ != 0) {
                setNbrValue(response.getNbrValue());
            }
            if (!response.getCur().isEmpty()) {
                this.cur_ = response.cur_;
                onChanged();
            }
            if (!response.getCdata().isEmpty()) {
                this.cdata_ = response.cdata_;
                onChanged();
            }
            if (this.seatbidBuilder_ == null) {
                if (!response.seatbid_.isEmpty()) {
                    if (this.seatbid_.isEmpty()) {
                        this.seatbid_ = response.seatbid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSeatbidIsMutable();
                        this.seatbid_.addAll(response.seatbid_);
                    }
                    onChanged();
                }
            } else if (!response.seatbid_.isEmpty()) {
                if (!this.seatbidBuilder_.t()) {
                    this.seatbidBuilder_.a(response.seatbid_);
                } else {
                    this.seatbidBuilder_.h();
                    this.seatbidBuilder_ = null;
                    this.seatbid_ = response.seatbid_;
                    this.bitField0_ &= -2;
                    this.seatbidBuilder_ = h0.alwaysUseFieldBuilders ? getSeatbidFieldBuilder() : null;
                }
            }
            if (response.hasExt()) {
                mergeExt(response.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!response.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = response.extProto_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(response.extProto_);
                    }
                    onChanged();
                }
            } else if (!response.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.t()) {
                    this.extProtoBuilder_.a(response.extProto_);
                } else {
                    this.extProtoBuilder_.h();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = response.extProto_;
                    this.bitField0_ &= -3;
                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) response).unknownFields);
            onChanged();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            List list = Collections.EMPTY_LIST;
            this.seatbid_ = list;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder addExtProto(Any.Builder builder) {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addSeatbid(Seatbid.Builder builder) {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addExtProto(int i10, Any.Builder builder) {
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        public Builder addSeatbid(int i10, Seatbid.Builder builder) {
            v1 v1Var = this.seatbidBuilder_;
            if (v1Var == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.openrtb.Response.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Response.access$7700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.openrtb.Response r3 = (com.explorestack.protobuf.openrtb.Response) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.openrtb.Response r4 = (com.explorestack.protobuf.openrtb.Response) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Response$Builder");
        }
    }

    public static Builder newBuilder(Response response) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(response);
    }

    public static Response parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Response(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Response parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Response) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Response getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Response parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Response() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        this.bidid_ = "";
        this.nbr_ = 0;
        this.cur_ = "";
        this.cdata_ = "";
        List list = Collections.EMPTY_LIST;
        this.seatbid_ = list;
        this.extProto_ = list;
    }

    public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Response parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(bArr, wVar);
    }

    public static Response parseFrom(InputStream inputStream) throws IOException {
        return (Response) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Response parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Response) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Response parseFrom(l lVar) throws IOException {
        return (Response) h0.parseWithIOException(PARSER, lVar);
    }

    public static Response parseFrom(l lVar, w wVar) throws IOException {
        return (Response) h0.parseWithIOException(PARSER, lVar, wVar);
    }

    private Response(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            this.id_ = lVar.J();
                        } else if (iK == 18) {
                            this.bidid_ = lVar.J();
                        } else if (iK == 24) {
                            this.nbr_ = lVar.t();
                        } else if (iK == 34) {
                            this.cur_ = lVar.J();
                        } else if (iK == 42) {
                            this.cdata_ = lVar.J();
                        } else if (iK == 50) {
                            if ((i10 & 1) == 0) {
                                this.seatbid_ = new ArrayList();
                                i10 |= 1;
                            }
                            this.seatbid_.add((Seatbid) lVar.A(Seatbid.parser(), wVar));
                        } else if (iK == 58) {
                            if ((i10 & 2) == 0) {
                                this.extProto_ = new ArrayList();
                                i10 |= 2;
                            }
                            this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                        } else if (iK != 66) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Struct struct = this.ext_;
                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.ext_ = struct2;
                            if (builder != null) {
                                builder.mergeFrom(struct2);
                                this.ext_ = builder.buildPartial();
                            }
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 1) != 0) {
                    this.seatbid_ = DesugarCollections.unmodifiableList(this.seatbid_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.seatbid_ = DesugarCollections.unmodifiableList(this.seatbid_);
        }
        if ((i10 & 2) != 0) {
            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
