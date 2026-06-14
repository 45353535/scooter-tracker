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
import com.explorestack.protobuf.o0;
import com.explorestack.protobuf.p0;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.t1;
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
public final class Request extends h0 implements c {
    public static final int AT_FIELD_NUMBER = 4;
    public static final int CDATA_FIELD_NUMBER = 8;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CUR_FIELD_NUMBER = 5;
    public static final int EXT_FIELD_NUMBER = 14;
    public static final int EXT_PROTO_FIELD_NUMBER = 13;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 10;
    public static final int PACKAGE_FIELD_NUMBER = 11;
    public static final int SEAT_FIELD_NUMBER = 6;
    public static final int SOURCE_FIELD_NUMBER = 9;
    public static final int TEST_FIELD_NUMBER = 2;
    public static final int TMAX_FIELD_NUMBER = 3;
    public static final int WSEAT_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private int at_;
    private volatile Object cdata_;
    private Any context_;
    private p0 cur_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private List<Item> item_;
    private byte memoizedIsInitialized;
    private int package_;
    private p0 seat_;
    private Source source_;
    private boolean test_;
    private int tmax_;
    private boolean wseat_;
    private static final Request DEFAULT_INSTANCE = new Request();
    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Request.1
        @Override // com.explorestack.protobuf.p1
        public Request parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Request(lVar, wVar);
        }
    };

    public static final class Builder extends h0.b implements c {
        private int at_;
        private int bitField0_;
        private Object cdata_;
        private a2 contextBuilder_;
        private Any context_;
        private p0 cur_;
        private a2 extBuilder_;
        private v1 extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private v1 itemBuilder_;
        private List<Item> item_;
        private int package_;
        private p0 seat_;
        private a2 sourceBuilder_;
        private Source source_;
        private boolean test_;
        private int tmax_;
        private boolean wseat_;

        private void ensureCurIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.cur_ = new o0(this.cur_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 8;
            }
        }

        private void ensureItemIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.item_ = new ArrayList(this.item_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureSeatIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.seat_ = new o0(this.seat_);
                this.bitField0_ |= 2;
            }
        }

        private a2 getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new a2(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f19281c;
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
                this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private v1 getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
                this.itemBuilder_ = new v1(this.item_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.item_ = null;
            }
            return this.itemBuilder_;
        }

        private a2 getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
                this.sourceBuilder_ = new a2(getSource(), getParentForChildren(), isClean());
                this.source_ = null;
            }
            return this.sourceBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getItemFieldBuilder();
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAllCur(Iterable<String> iterable) {
            ensureCurIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.cur_);
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

        public Builder addAllItem(Iterable<? extends Item> iterable) {
            v1 v1Var = this.itemBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureItemIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.item_);
            onChanged();
            return this;
        }

        public Builder addAllSeat(Iterable<String> iterable) {
            ensureSeatIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.seat_);
            onChanged();
            return this;
        }

        public Builder addCur(String str) {
            str.getClass();
            ensureCurIsMutable();
            this.cur_.add(str);
            onChanged();
            return this;
        }

        public Builder addCurBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureCurIsMutable();
            this.cur_.c(byteString);
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

        public Builder addItem(Item item) {
            v1 v1Var = this.itemBuilder_;
            if (v1Var != null) {
                v1Var.e(item);
                return this;
            }
            item.getClass();
            ensureItemIsMutable();
            this.item_.add(item);
            onChanged();
            return this;
        }

        public Item.Builder addItemBuilder() {
            return (Item.Builder) getItemFieldBuilder().c(Item.getDefaultInstance());
        }

        public Builder addSeat(String str) {
            str.getClass();
            ensureSeatIsMutable();
            this.seat_.add(str);
            onChanged();
            return this;
        }

        public Builder addSeatBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureSeatIsMutable();
            this.seat_.c(byteString);
            onChanged();
            return this;
        }

        public Builder clearAt() {
            this.at_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCdata() {
            this.cdata_ = Request.getDefaultInstance().getCdata();
            onChanged();
            return this;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
                return this;
            }
            this.context_ = null;
            this.contextBuilder_ = null;
            return this;
        }

        public Builder clearCur() {
            this.cur_ = o0.f19269e;
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
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.id_ = Request.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearItem() {
            v1 v1Var = this.itemBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.item_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearPackage() {
            this.package_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSeat() {
            this.seat_ = o0.f19269e;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearSource() {
            if (this.sourceBuilder_ == null) {
                this.source_ = null;
                onChanged();
                return this;
            }
            this.source_ = null;
            this.sourceBuilder_ = null;
            return this;
        }

        public Builder clearTest() {
            this.test_ = false;
            onChanged();
            return this;
        }

        public Builder clearTmax() {
            this.tmax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearWseat() {
            this.wseat_ = false;
            onChanged();
            return this;
        }

        public int getAt() {
            return this.at_;
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

        public Any getContext() {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                return (Any) a2Var.e();
            }
            Any any = this.context_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        public Any.Builder getContextBuilder() {
            onChanged();
            return (Any.Builder) getContextFieldBuilder().d();
        }

        public e getContextOrBuilder() {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                return (e) a2Var.f();
            }
            Any any = this.context_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        public String getCur(int i10) {
            return (String) this.cur_.get(i10);
        }

        public ByteString getCurBytes(int i10) {
            return this.cur_.getByteString(i10);
        }

        public int getCurCount() {
            return this.cur_.size();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f19281c;
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

        public Item getItem(int i10) {
            v1 v1Var = this.itemBuilder_;
            return v1Var == null ? this.item_.get(i10) : (Item) v1Var.n(i10);
        }

        public Item.Builder getItemBuilder(int i10) {
            return (Item.Builder) getItemFieldBuilder().k(i10);
        }

        public List<Item.Builder> getItemBuilderList() {
            return getItemFieldBuilder().l();
        }

        public int getItemCount() {
            v1 v1Var = this.itemBuilder_;
            return v1Var == null ? this.item_.size() : v1Var.m();
        }

        public List<Item> getItemList() {
            v1 v1Var = this.itemBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.item_) : v1Var.p();
        }

        public ItemOrBuilder getItemOrBuilder(int i10) {
            v1 v1Var = this.itemBuilder_;
            return v1Var == null ? this.item_.get(i10) : (ItemOrBuilder) v1Var.q(i10);
        }

        public List<? extends ItemOrBuilder> getItemOrBuilderList() {
            v1 v1Var = this.itemBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.item_);
        }

        public int getPackage() {
            return this.package_;
        }

        public String getSeat(int i10) {
            return (String) this.seat_.get(i10);
        }

        public ByteString getSeatBytes(int i10) {
            return this.seat_.getByteString(i10);
        }

        public int getSeatCount() {
            return this.seat_.size();
        }

        public Source getSource() {
            a2 a2Var = this.sourceBuilder_;
            if (a2Var != null) {
                return (Source) a2Var.e();
            }
            Source source = this.source_;
            return source == null ? Source.getDefaultInstance() : source;
        }

        public Source.Builder getSourceBuilder() {
            onChanged();
            return (Source.Builder) getSourceFieldBuilder().d();
        }

        public SourceOrBuilder getSourceOrBuilder() {
            a2 a2Var = this.sourceBuilder_;
            if (a2Var != null) {
                return (SourceOrBuilder) a2Var.f();
            }
            Source source = this.source_;
            return source == null ? Source.getDefaultInstance() : source;
        }

        public boolean getTest() {
            return this.test_;
        }

        public int getTmax() {
            return this.tmax_;
        }

        public boolean getWseat() {
            return this.wseat_;
        }

        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public boolean hasSource() {
            return (this.sourceBuilder_ == null && this.source_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return b.f19282d.d(Request.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeContext(Any any) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                a2Var.g(any);
                return this;
            }
            Any any2 = this.context_;
            if (any2 != null) {
                this.context_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
            } else {
                this.context_ = any;
            }
            onChanged();
            return this;
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

        public Builder mergeSource(Source source) {
            a2 a2Var = this.sourceBuilder_;
            if (a2Var != null) {
                a2Var.g(source);
                return this;
            }
            Source source2 = this.source_;
            if (source2 != null) {
                this.source_ = Source.newBuilder(source2).mergeFrom(source).buildPartial();
            } else {
                this.source_ = source;
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

        public Builder removeItem(int i10) {
            v1 v1Var = this.itemBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureItemIsMutable();
            this.item_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setAt(int i10) {
            this.at_ = i10;
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

        public Builder setContext(Any any) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                a2Var.i(any);
                return this;
            }
            any.getClass();
            this.context_ = any;
            onChanged();
            return this;
        }

        public Builder setCur(int i10, String str) {
            str.getClass();
            ensureCurIsMutable();
            this.cur_.set(i10, str);
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

        public Builder setItem(int i10, Item item) {
            v1 v1Var = this.itemBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, item);
                return this;
            }
            item.getClass();
            ensureItemIsMutable();
            this.item_.set(i10, item);
            onChanged();
            return this;
        }

        public Builder setPackage(int i10) {
            this.package_ = i10;
            onChanged();
            return this;
        }

        public Builder setSeat(int i10, String str) {
            str.getClass();
            ensureSeatIsMutable();
            this.seat_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setSource(Source source) {
            a2 a2Var = this.sourceBuilder_;
            if (a2Var != null) {
                a2Var.i(source);
                return this;
            }
            source.getClass();
            this.source_ = source;
            onChanged();
            return this;
        }

        public Builder setTest(boolean z10) {
            this.test_ = z10;
            onChanged();
            return this;
        }

        public Builder setTmax(int i10) {
            this.tmax_ = i10;
            onChanged();
            return this;
        }

        public Builder setWseat(boolean z10) {
            this.wseat_ = z10;
            onChanged();
            return this;
        }

        /* JADX INFO: renamed from: getCurList, reason: merged with bridge method [inline-methods] */
        public t1 m4484getCurList() {
            return this.cur_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getSeatList, reason: merged with bridge method [inline-methods] */
        public t1 m4485getSeatList() {
            return this.seat_.getUnmodifiableView();
        }

        private Builder() {
            this.id_ = "";
            p0 p0Var = o0.f19269e;
            this.cur_ = p0Var;
            this.seat_ = p0Var;
            this.cdata_ = "";
            List list = Collections.EMPTY_LIST;
            this.item_ = list;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Request build() {
            Request requestBuildPartial = buildPartial();
            if (requestBuildPartial.isInitialized()) {
                return requestBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Request buildPartial() {
            Request request = new Request(this);
            request.id_ = this.id_;
            request.test_ = this.test_;
            request.tmax_ = this.tmax_;
            request.at_ = this.at_;
            if ((this.bitField0_ & 1) != 0) {
                this.cur_ = this.cur_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            request.cur_ = this.cur_;
            if ((this.bitField0_ & 2) != 0) {
                this.seat_ = this.seat_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            request.seat_ = this.seat_;
            request.wseat_ = this.wseat_;
            request.cdata_ = this.cdata_;
            a2 a2Var = this.sourceBuilder_;
            if (a2Var == null) {
                request.source_ = this.source_;
            } else {
                request.source_ = (Source) a2Var.a();
            }
            v1 v1Var = this.itemBuilder_;
            if (v1Var != null) {
                request.item_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 4) != 0) {
                    this.item_ = DesugarCollections.unmodifiableList(this.item_);
                    this.bitField0_ &= -5;
                }
                request.item_ = this.item_;
            }
            request.package_ = this.package_;
            a2 a2Var2 = this.contextBuilder_;
            if (a2Var2 == null) {
                request.context_ = this.context_;
            } else {
                request.context_ = (Any) a2Var2.a();
            }
            a2 a2Var3 = this.extBuilder_;
            if (a2Var3 == null) {
                request.ext_ = this.ext_;
            } else {
                request.ext_ = (Struct) a2Var3.a();
            }
            v1 v1Var2 = this.extProtoBuilder_;
            if (v1Var2 != null) {
                request.extProto_ = v1Var2.f();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -9;
                }
                request.extProto_ = this.extProto_;
            }
            onBuilt();
            return request;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Request getDefaultInstanceForType() {
            return Request.getDefaultInstance();
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

        public Item.Builder addItemBuilder(int i10) {
            return (Item.Builder) getItemFieldBuilder().b(i10, Item.getDefaultInstance());
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
            this.test_ = false;
            this.tmax_ = 0;
            this.at_ = 0;
            p0 p0Var = o0.f19269e;
            this.cur_ = p0Var;
            int i10 = this.bitField0_;
            this.seat_ = p0Var;
            this.bitField0_ = i10 & (-4);
            this.wseat_ = false;
            this.cdata_ = "";
            if (this.sourceBuilder_ == null) {
                this.source_ = null;
            } else {
                this.source_ = null;
                this.sourceBuilder_ = null;
            }
            v1 v1Var = this.itemBuilder_;
            if (v1Var == null) {
                this.item_ = Collections.EMPTY_LIST;
                this.bitField0_ = i10 & (-8);
            } else {
                v1Var.g();
            }
            this.package_ = 0;
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
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
                this.bitField0_ &= -9;
                return this;
            }
            v1Var2.g();
            return this;
        }

        public Builder setContext(Any.Builder builder) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var == null) {
                this.context_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
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

        public Builder setSource(Source.Builder builder) {
            a2 a2Var = this.sourceBuilder_;
            if (a2Var == null) {
                this.source_ = builder.build();
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

        public Builder addItem(int i10, Item item) {
            v1 v1Var = this.itemBuilder_;
            if (v1Var == null) {
                item.getClass();
                ensureItemIsMutable();
                this.item_.add(i10, item);
                onChanged();
                return this;
            }
            v1Var.d(i10, item);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Request) {
                return mergeFrom((Request) message);
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

        public Builder setItem(int i10, Item.Builder builder) {
            v1 v1Var = this.itemBuilder_;
            if (v1Var == null) {
                ensureItemIsMutable();
                this.item_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(Request request) {
            if (request == Request.getDefaultInstance()) {
                return this;
            }
            if (!request.getId().isEmpty()) {
                this.id_ = request.id_;
                onChanged();
            }
            if (request.getTest()) {
                setTest(request.getTest());
            }
            if (request.getTmax() != 0) {
                setTmax(request.getTmax());
            }
            if (request.getAt() != 0) {
                setAt(request.getAt());
            }
            if (!request.cur_.isEmpty()) {
                if (this.cur_.isEmpty()) {
                    this.cur_ = request.cur_;
                    this.bitField0_ &= -2;
                } else {
                    ensureCurIsMutable();
                    this.cur_.addAll(request.cur_);
                }
                onChanged();
            }
            if (!request.seat_.isEmpty()) {
                if (this.seat_.isEmpty()) {
                    this.seat_ = request.seat_;
                    this.bitField0_ &= -3;
                } else {
                    ensureSeatIsMutable();
                    this.seat_.addAll(request.seat_);
                }
                onChanged();
            }
            if (request.getWseat()) {
                setWseat(request.getWseat());
            }
            if (!request.getCdata().isEmpty()) {
                this.cdata_ = request.cdata_;
                onChanged();
            }
            if (request.hasSource()) {
                mergeSource(request.getSource());
            }
            if (this.itemBuilder_ == null) {
                if (!request.item_.isEmpty()) {
                    if (this.item_.isEmpty()) {
                        this.item_ = request.item_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureItemIsMutable();
                        this.item_.addAll(request.item_);
                    }
                    onChanged();
                }
            } else if (!request.item_.isEmpty()) {
                if (!this.itemBuilder_.t()) {
                    this.itemBuilder_.a(request.item_);
                } else {
                    this.itemBuilder_.h();
                    this.itemBuilder_ = null;
                    this.item_ = request.item_;
                    this.bitField0_ &= -5;
                    this.itemBuilder_ = h0.alwaysUseFieldBuilders ? getItemFieldBuilder() : null;
                }
            }
            if (request.getPackage() != 0) {
                setPackage(request.getPackage());
            }
            if (request.hasContext()) {
                mergeContext(request.getContext());
            }
            if (request.hasExt()) {
                mergeExt(request.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!request.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = request.extProto_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(request.extProto_);
                    }
                    onChanged();
                }
            } else if (!request.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.t()) {
                    this.extProtoBuilder_.a(request.extProto_);
                } else {
                    this.extProtoBuilder_.h();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = request.extProto_;
                    this.bitField0_ &= -9;
                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) request).unknownFields);
            onChanged();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.id_ = "";
            p0 p0Var = o0.f19269e;
            this.cur_ = p0Var;
            this.seat_ = p0Var;
            this.cdata_ = "";
            List list = Collections.EMPTY_LIST;
            this.item_ = list;
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

        public Builder addItem(Item.Builder builder) {
            v1 v1Var = this.itemBuilder_;
            if (v1Var == null) {
                ensureItemIsMutable();
                this.item_.add(builder.build());
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

        public Builder addItem(int i10, Item.Builder builder) {
            v1 v1Var = this.itemBuilder_;
            if (v1Var == null) {
                ensureItemIsMutable();
                this.item_.add(i10, builder.build());
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
        public com.explorestack.protobuf.openrtb.Request.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Request.access$10400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.openrtb.Request r3 = (com.explorestack.protobuf.openrtb.Request) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.openrtb.Request r4 = (com.explorestack.protobuf.openrtb.Request) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Request$Builder");
        }
    }

    public static final class Item extends h0 implements ItemOrBuilder {
        public static final int DEAL_FIELD_NUMBER = 11;
        public static final int DLVY_FIELD_NUMBER = 9;
        public static final int DT_FIELD_NUMBER = 8;
        public static final int EXP_FIELD_NUMBER = 7;
        public static final int EXT_FIELD_NUMBER = 15;
        public static final int EXT_PROTO_FIELD_NUMBER = 14;
        public static final int FLRCUR_FIELD_NUMBER = 6;
        public static final int FLR_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METRIC_FIELD_NUMBER = 10;
        public static final int PRIVATE_FIELD_NUMBER = 12;
        public static final int QTY_FIELD_NUMBER = 2;
        public static final int SEQ_FIELD_NUMBER = 3;
        public static final int SPEC_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private List<Deal> deal_;
        private int dlvy_;
        private volatile Object dt_;
        private int exp_;
        private List<Any> extProto_;
        private Struct ext_;
        private double flr_;
        private volatile Object flrcur_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private List<Metric> metric_;
        private boolean private_;
        private int qty_;
        private int seq_;
        private Any spec_;
        private static final Item DEFAULT_INSTANCE = new Item();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Request.Item.1
            @Override // com.explorestack.protobuf.p1
            public Item parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Item(lVar, wVar);
            }
        };

        public static final class Deal extends h0 implements DealOrBuilder {
            public static final int AT_FIELD_NUMBER = 4;
            public static final int EXT_FIELD_NUMBER = 8;
            public static final int EXT_PROTO_FIELD_NUMBER = 7;
            public static final int FLRCUR_FIELD_NUMBER = 3;
            public static final int FLR_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int WADOMAIN_FIELD_NUMBER = 6;
            public static final int WSEAT_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private int at_;
            private List<Any> extProto_;
            private Struct ext_;
            private double flr_;
            private volatile Object flrcur_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private p0 wadomain_;
            private p0 wseat_;
            private static final Deal DEFAULT_INSTANCE = new Deal();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Request.Item.Deal.1
                @Override // com.explorestack.protobuf.p1
                public Deal parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Deal(lVar, wVar);
                }
            };

            public static final class Builder extends h0.b implements DealOrBuilder {
                private int at_;
                private int bitField0_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private double flr_;
                private Object flrcur_;
                private Object id_;
                private p0 wadomain_;
                private p0 wseat_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 4;
                    }
                }

                private void ensureWadomainIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.wadomain_ = new o0(this.wadomain_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureWseatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.wseat_ = new o0(this.wseat_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f19289k;
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
                        this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
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

                public Builder addAllWadomain(Iterable<String> iterable) {
                    ensureWadomainIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.wadomain_);
                    onChanged();
                    return this;
                }

                public Builder addAllWseat(Iterable<String> iterable) {
                    ensureWseatIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.wseat_);
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

                public Builder addWadomain(String str) {
                    str.getClass();
                    ensureWadomainIsMutable();
                    this.wadomain_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addWadomainBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    ensureWadomainIsMutable();
                    this.wadomain_.c(byteString);
                    onChanged();
                    return this;
                }

                public Builder addWseat(String str) {
                    str.getClass();
                    ensureWseatIsMutable();
                    this.wseat_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addWseatBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    ensureWseatIsMutable();
                    this.wseat_.c(byteString);
                    onChanged();
                    return this;
                }

                public Builder clearAt() {
                    this.at_ = 0;
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
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearFlr() {
                    this.flr_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearFlrcur() {
                    this.flrcur_ = Deal.getDefaultInstance().getFlrcur();
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Deal.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearWadomain() {
                    this.wadomain_ = o0.f19269e;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearWseat() {
                    this.wseat_ = o0.f19269e;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public int getAt() {
                    return this.at_;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f19289k;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public double getFlr() {
                    return this.flr_;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public String getFlrcur() {
                    Object obj = this.flrcur_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.flrcur_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ByteString getFlrcurBytes() {
                    Object obj = this.flrcur_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.flrcur_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public String getWadomain(int i10) {
                    return (String) this.wadomain_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ByteString getWadomainBytes(int i10) {
                    return this.wadomain_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public int getWadomainCount() {
                    return this.wadomain_.size();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public String getWseat(int i10) {
                    return (String) this.wseat_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ByteString getWseatBytes(int i10) {
                    return this.wseat_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public int getWseatCount() {
                    return this.wseat_.size();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f19290l.d(Deal.class, Builder.class);
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

                public Builder setAt(int i10) {
                    this.at_ = i10;
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

                public Builder setFlr(double d10) {
                    this.flr_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setFlrcur(String str) {
                    str.getClass();
                    this.flrcur_ = str;
                    onChanged();
                    return this;
                }

                public Builder setFlrcurBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.flrcur_ = byteString;
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

                public Builder setWadomain(int i10, String str) {
                    str.getClass();
                    ensureWadomainIsMutable();
                    this.wadomain_.set(i10, str);
                    onChanged();
                    return this;
                }

                public Builder setWseat(int i10, String str) {
                    str.getClass();
                    ensureWseatIsMutable();
                    this.wseat_.set(i10, str);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public t1 getWadomainList() {
                    return this.wadomain_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public t1 getWseatList() {
                    return this.wseat_.getUnmodifiableView();
                }

                private Builder() {
                    this.id_ = "";
                    this.flrcur_ = "";
                    p0 p0Var = o0.f19269e;
                    this.wseat_ = p0Var;
                    this.wadomain_ = p0Var;
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Deal build() {
                    Deal dealBuildPartial = buildPartial();
                    if (dealBuildPartial.isInitialized()) {
                        return dealBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) dealBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Deal buildPartial() {
                    Deal deal = new Deal(this);
                    deal.id_ = this.id_;
                    deal.flr_ = this.flr_;
                    deal.flrcur_ = this.flrcur_;
                    deal.at_ = this.at_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.wseat_ = this.wseat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    deal.wseat_ = this.wseat_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.wadomain_ = this.wadomain_.getUnmodifiableView();
                        this.bitField0_ &= -3;
                    }
                    deal.wadomain_ = this.wadomain_;
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        deal.ext_ = this.ext_;
                    } else {
                        deal.ext_ = (Struct) a2Var.a();
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        deal.extProto_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 4) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -5;
                        }
                        deal.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return deal;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Deal getDefaultInstanceForType() {
                    return Deal.getDefaultInstance();
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
                    this.id_ = "";
                    this.flr_ = 0.0d;
                    this.flrcur_ = "";
                    this.at_ = 0;
                    p0 p0Var = o0.f19269e;
                    this.wseat_ = p0Var;
                    int i10 = this.bitField0_;
                    this.wadomain_ = p0Var;
                    this.bitField0_ = i10 & (-4);
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var == null) {
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ = i10 & (-8);
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
                    if (message instanceof Deal) {
                        return mergeFrom((Deal) message);
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
                    this.id_ = "";
                    this.flrcur_ = "";
                    p0 p0Var = o0.f19269e;
                    this.wseat_ = p0Var;
                    this.wadomain_ = p0Var;
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Deal deal) {
                    if (deal == Deal.getDefaultInstance()) {
                        return this;
                    }
                    if (!deal.getId().isEmpty()) {
                        this.id_ = deal.id_;
                        onChanged();
                    }
                    if (deal.getFlr() != 0.0d) {
                        setFlr(deal.getFlr());
                    }
                    if (!deal.getFlrcur().isEmpty()) {
                        this.flrcur_ = deal.flrcur_;
                        onChanged();
                    }
                    if (deal.getAt() != 0) {
                        setAt(deal.getAt());
                    }
                    if (!deal.wseat_.isEmpty()) {
                        if (this.wseat_.isEmpty()) {
                            this.wseat_ = deal.wseat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureWseatIsMutable();
                            this.wseat_.addAll(deal.wseat_);
                        }
                        onChanged();
                    }
                    if (!deal.wadomain_.isEmpty()) {
                        if (this.wadomain_.isEmpty()) {
                            this.wadomain_ = deal.wadomain_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureWadomainIsMutable();
                            this.wadomain_.addAll(deal.wadomain_);
                        }
                        onChanged();
                    }
                    if (deal.hasExt()) {
                        mergeExt(deal.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!deal.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = deal.extProto_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(deal.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!deal.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(deal.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = deal.extProto_;
                            this.bitField0_ &= -5;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) deal).unknownFields);
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
                public com.explorestack.protobuf.openrtb.Request.Item.Deal.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Request.Item.Deal.access$5000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.openrtb.Request$Item$Deal r3 = (com.explorestack.protobuf.openrtb.Request.Item.Deal) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.openrtb.Request$Item$Deal r4 = (com.explorestack.protobuf.openrtb.Request.Item.Deal) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Deal.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Request$Item$Deal$Builder");
                }
            }

            public static Deal getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f19289k;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Deal parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Deal) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Deal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Deal)) {
                    return super.equals(obj);
                }
                Deal deal = (Deal) obj;
                if (getId().equals(deal.getId()) && Double.doubleToLongBits(getFlr()) == Double.doubleToLongBits(deal.getFlr()) && getFlrcur().equals(deal.getFlrcur()) && getAt() == deal.getAt() && getWseatList().equals(deal.getWseatList()) && getWadomainList().equals(deal.getWadomainList()) && hasExt() == deal.hasExt()) {
                    return (!hasExt() || getExt().equals(deal.getExt())) && getExtProtoList().equals(deal.getExtProtoList()) && this.unknownFields.equals(deal.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public int getAt() {
                return this.at_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public double getFlr() {
                return this.flr_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public String getFlrcur() {
                Object obj = this.flrcur_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.flrcur_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ByteString getFlrcurBytes() {
                Object obj = this.flrcur_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.flrcur_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
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
                int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
                double d10 = this.flr_;
                if (d10 != 0.0d) {
                    iComputeStringSize += n.j(2, d10);
                }
                if (!getFlrcurBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(3, this.flrcur_);
                }
                int i11 = this.at_;
                if (i11 != 0) {
                    iComputeStringSize += n.Y(4, i11);
                }
                int iComputeStringSizeNoTag = 0;
                for (int i12 = 0; i12 < this.wseat_.size(); i12++) {
                    iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.wseat_.getRaw(i12));
                }
                int size = iComputeStringSize + iComputeStringSizeNoTag + getWseatList().size();
                int iComputeStringSizeNoTag2 = 0;
                for (int i13 = 0; i13 < this.wadomain_.size(); i13++) {
                    iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.wadomain_.getRaw(i13));
                }
                int size2 = size + iComputeStringSizeNoTag2 + getWadomainList().size();
                for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                    size2 += n.G(7, this.extProto_.get(i14));
                }
                if (this.ext_ != null) {
                    size2 += n.G(8, getExt());
                }
                int serializedSize = size2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public String getWadomain(int i10) {
                return (String) this.wadomain_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ByteString getWadomainBytes(int i10) {
                return this.wadomain_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public int getWadomainCount() {
                return this.wadomain_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public String getWseat(int i10) {
                return (String) this.wseat_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ByteString getWseatBytes(int i10) {
                return this.wseat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public int getWseatCount() {
                return this.wseat_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getFlr()))) * 37) + 3) * 53) + getFlrcur().hashCode()) * 37) + 4) * 53) + getAt();
                if (getWseatCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getWseatList().hashCode();
                }
                if (getWadomainCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getWadomainList().hashCode();
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
                return b.f19290l.d(Deal.class, Builder.class);
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
                return new Deal();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.id_);
                }
                double d10 = this.flr_;
                if (d10 != 0.0d) {
                    nVar.t0(2, d10);
                }
                if (!getFlrcurBytes().isEmpty()) {
                    h0.writeString(nVar, 3, this.flrcur_);
                }
                int i10 = this.at_;
                if (i10 != 0) {
                    nVar.W0(4, i10);
                }
                for (int i11 = 0; i11 < this.wseat_.size(); i11++) {
                    h0.writeString(nVar, 5, this.wseat_.getRaw(i11));
                }
                for (int i12 = 0; i12 < this.wadomain_.size(); i12++) {
                    h0.writeString(nVar, 6, this.wadomain_.getRaw(i12));
                }
                for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                    nVar.J0(7, this.extProto_.get(i13));
                }
                if (this.ext_ != null) {
                    nVar.J0(8, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static Builder newBuilder(Deal deal) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(deal);
            }

            public static Deal parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(byteBuffer, wVar);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public t1 getWadomainList() {
                return this.wadomain_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public t1 getWseatList() {
                return this.wseat_;
            }

            private Deal(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Deal parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Deal) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Deal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Deal getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Deal parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Deal() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.flrcur_ = "";
                p0 p0Var = o0.f19269e;
                this.wseat_ = p0Var;
                this.wadomain_ = p0Var;
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Deal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Deal parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(bArr, wVar);
            }

            public static Deal parseFrom(InputStream inputStream) throws IOException {
                return (Deal) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Deal parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Deal) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Deal parseFrom(l lVar) throws IOException {
                return (Deal) h0.parseWithIOException(PARSER, lVar);
            }

            private Deal(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                } else if (iK == 17) {
                                    this.flr_ = lVar.s();
                                } else if (iK == 26) {
                                    this.flrcur_ = lVar.J();
                                } else if (iK == 32) {
                                    this.at_ = lVar.L();
                                } else if (iK == 42) {
                                    String strJ = lVar.J();
                                    if ((i10 & 1) == 0) {
                                        this.wseat_ = new o0();
                                        i10 |= 1;
                                    }
                                    this.wseat_.add(strJ);
                                } else if (iK == 50) {
                                    String strJ2 = lVar.J();
                                    if ((i10 & 2) == 0) {
                                        this.wadomain_ = new o0();
                                        i10 |= 2;
                                    }
                                    this.wadomain_.add(strJ2);
                                } else if (iK == 58) {
                                    if ((i10 & 4) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 4;
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
                            this.wseat_ = this.wseat_.getUnmodifiableView();
                        }
                        if ((i10 & 2) != 0) {
                            this.wadomain_ = this.wadomain_.getUnmodifiableView();
                        }
                        if ((i10 & 4) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.wseat_ = this.wseat_.getUnmodifiableView();
                }
                if ((i10 & 2) != 0) {
                    this.wadomain_ = this.wadomain_.getUnmodifiableView();
                }
                if ((i10 & 4) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Deal parseFrom(l lVar, w wVar) throws IOException {
                return (Deal) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface DealOrBuilder extends MessageOrBuilder {
            int getAt();

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

            double getFlr();

            String getFlrcur();

            ByteString getFlrcurBytes();

            String getId();

            ByteString getIdBytes();

            String getWadomain(int i10);

            ByteString getWadomainBytes(int i10);

            int getWadomainCount();

            List<String> getWadomainList();

            String getWseat(int i10);

            ByteString getWseatBytes(int i10);

            int getWseatCount();

            List<String> getWseatList();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Metric extends h0 implements MetricOrBuilder {
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            public static final int VENDOR_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private byte memoizedIsInitialized;
            private volatile Object type_;
            private float value_;
            private volatile Object vendor_;
            private static final Metric DEFAULT_INSTANCE = new Metric();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Request.Item.Metric.1
                @Override // com.explorestack.protobuf.p1
                public Metric parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Metric(lVar, wVar);
                }
            };

            public static Metric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f19287i;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Metric) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Metric)) {
                    return super.equals(obj);
                }
                Metric metric = (Metric) obj;
                if (getType().equals(metric.getType()) && Float.floatToIntBits(getValue()) == Float.floatToIntBits(metric.getValue()) && getVendor().equals(metric.getVendor()) && hasExt() == metric.hasExt()) {
                    return (!hasExt() || getExt().equals(metric.getExt())) && getExtProtoList().equals(metric.getExtProtoList()) && this.unknownFields.equals(metric.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
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
                int iComputeStringSize = !getTypeBytes().isEmpty() ? h0.computeStringSize(1, this.type_) : 0;
                float f10 = this.value_;
                if (f10 != 0.0f) {
                    iComputeStringSize += n.r(2, f10);
                }
                if (!getVendorBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(3, this.vendor_);
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    iComputeStringSize += n.G(4, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    iComputeStringSize += n.G(5, getExt());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public float getValue() {
                return this.value_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public String getVendor() {
                Object obj = this.vendor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.vendor_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public ByteString getVendorBytes() {
                Object obj = this.vendor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.vendor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode()) * 37) + 2) * 53) + Float.floatToIntBits(getValue())) * 37) + 3) * 53) + getVendor().hashCode();
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
                return b.f19288j.d(Metric.class, Builder.class);
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
                return new Metric();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getTypeBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.type_);
                }
                float f10 = this.value_;
                if (f10 != 0.0f) {
                    nVar.B0(2, f10);
                }
                if (!getVendorBytes().isEmpty()) {
                    h0.writeString(nVar, 3, this.vendor_);
                }
                for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                    nVar.J0(4, this.extProto_.get(i10));
                }
                if (this.ext_ != null) {
                    nVar.J0(5, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements MetricOrBuilder {
                private int bitField0_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object type_;
                private float value_;
                private Object vendor_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f19287i;
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

                public Builder clearType() {
                    this.type_ = Metric.getDefaultInstance().getType();
                    onChanged();
                    return this;
                }

                public Builder clearValue() {
                    this.value_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearVendor() {
                    this.vendor_ = Metric.getDefaultInstance().getVendor();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f19287i;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public String getType() {
                    Object obj = this.type_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.type_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public ByteString getTypeBytes() {
                    Object obj = this.type_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.type_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public float getValue() {
                    return this.value_;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public String getVendor() {
                    Object obj = this.vendor_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.vendor_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public ByteString getVendorBytes() {
                    Object obj = this.vendor_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.vendor_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f19288j.d(Metric.class, Builder.class);
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

                public Builder setType(String str) {
                    str.getClass();
                    this.type_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTypeBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.type_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setValue(float f10) {
                    this.value_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setVendor(String str) {
                    str.getClass();
                    this.vendor_ = str;
                    onChanged();
                    return this;
                }

                public Builder setVendorBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.vendor_ = byteString;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.type_ = "";
                    this.vendor_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Metric build() {
                    Metric metricBuildPartial = buildPartial();
                    if (metricBuildPartial.isInitialized()) {
                        return metricBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Metric buildPartial() {
                    Metric metric = new Metric(this);
                    metric.type_ = this.type_;
                    metric.value_ = this.value_;
                    metric.vendor_ = this.vendor_;
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        metric.ext_ = this.ext_;
                    } else {
                        metric.ext_ = (Struct) a2Var.a();
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        metric.extProto_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        metric.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return metric;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Metric getDefaultInstanceForType() {
                    return Metric.getDefaultInstance();
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
                    this.type_ = "";
                    this.value_ = 0.0f;
                    this.vendor_ = "";
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
                    if (message instanceof Metric) {
                        return mergeFrom((Metric) message);
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
                    this.type_ = "";
                    this.vendor_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Metric metric) {
                    if (metric == Metric.getDefaultInstance()) {
                        return this;
                    }
                    if (!metric.getType().isEmpty()) {
                        this.type_ = metric.type_;
                        onChanged();
                    }
                    if (metric.getValue() != 0.0f) {
                        setValue(metric.getValue());
                    }
                    if (!metric.getVendor().isEmpty()) {
                        this.vendor_ = metric.vendor_;
                        onChanged();
                    }
                    if (metric.hasExt()) {
                        mergeExt(metric.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!metric.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = metric.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(metric.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!metric.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(metric.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = metric.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) metric).unknownFields);
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
                public com.explorestack.protobuf.openrtb.Request.Item.Metric.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Request.Item.Metric.access$3200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.openrtb.Request$Item$Metric r3 = (com.explorestack.protobuf.openrtb.Request.Item.Metric) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.openrtb.Request$Item$Metric r4 = (com.explorestack.protobuf.openrtb.Request.Item.Metric) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Metric.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Request$Item$Metric$Builder");
                }
            }

            public static Builder newBuilder(Metric metric) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metric);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Metric(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Metric parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Metric) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Metric getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Metric parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Metric() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = "";
                this.vendor_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Metric parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(bArr, wVar);
            }

            public static Metric parseFrom(InputStream inputStream) throws IOException {
                return (Metric) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Metric parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Metric) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            private Metric(l lVar, w wVar) throws InvalidProtocolBufferException {
                this();
                wVar.getClass();
                r2.b bVarG = r2.g();
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            try {
                                int iK = lVar.K();
                                if (iK != 0) {
                                    if (iK == 10) {
                                        this.type_ = lVar.J();
                                    } else if (iK == 21) {
                                        this.value_ = lVar.w();
                                    } else if (iK == 26) {
                                        this.vendor_ = lVar.J();
                                    } else if (iK == 34) {
                                        if (!z11) {
                                            this.extProto_ = new ArrayList();
                                            z11 = true;
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

            public static Metric parseFrom(l lVar) throws IOException {
                return (Metric) h0.parseWithIOException(PARSER, lVar);
            }

            public static Metric parseFrom(l lVar, w wVar) throws IOException {
                return (Metric) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface MetricOrBuilder extends MessageOrBuilder {
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

            String getType();

            ByteString getTypeBytes();

            float getValue();

            String getVendor();

            ByteString getVendorBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Item getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f19285g;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Item parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Item) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Item parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return super.equals(obj);
            }
            Item item = (Item) obj;
            if (!getId().equals(item.getId()) || getQty() != item.getQty() || getSeq() != item.getSeq() || Double.doubleToLongBits(getFlr()) != Double.doubleToLongBits(item.getFlr()) || !getFlrcur().equals(item.getFlrcur()) || getExp() != item.getExp() || !getDt().equals(item.getDt()) || getDlvy() != item.getDlvy() || !getMetricList().equals(item.getMetricList()) || !getDealList().equals(item.getDealList()) || getPrivate() != item.getPrivate() || hasSpec() != item.hasSpec()) {
                return false;
            }
            if ((!hasSpec() || getSpec().equals(item.getSpec())) && hasExt() == item.hasExt()) {
                return (!hasExt() || getExt().equals(item.getExt())) && getExtProtoList().equals(item.getExtProtoList()) && this.unknownFields.equals(item.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Deal getDeal(int i10) {
            return this.deal_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getDealCount() {
            return this.deal_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<Deal> getDealList() {
            return this.deal_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public DealOrBuilder getDealOrBuilder(int i10) {
            return this.deal_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<? extends DealOrBuilder> getDealOrBuilderList() {
            return this.deal_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getDlvy() {
            return this.dlvy_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public String getDt() {
            Object obj = this.dt_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.dt_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public ByteString getDtBytes() {
            Object obj = this.dt_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dt_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getExp() {
            return this.exp_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public double getFlr() {
            return this.flr_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public String getFlrcur() {
            Object obj = this.flrcur_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.flrcur_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public ByteString getFlrcurBytes() {
            Object obj = this.flrcur_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.flrcur_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Metric getMetric(int i10) {
            return this.metric_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getMetricCount() {
            return this.metric_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<Metric> getMetricList() {
            return this.metric_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public MetricOrBuilder getMetricOrBuilder(int i10) {
            return this.metric_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<? extends MetricOrBuilder> getMetricOrBuilderList() {
            return this.metric_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public boolean getPrivate() {
            return this.private_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getQty() {
            return this.qty_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getSeq() {
            return this.seq_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
            int i11 = this.qty_;
            if (i11 != 0) {
                iComputeStringSize += n.Y(2, i11);
            }
            int i12 = this.seq_;
            if (i12 != 0) {
                iComputeStringSize += n.Y(3, i12);
            }
            double d10 = this.flr_;
            if (d10 != 0.0d) {
                iComputeStringSize += n.j(4, d10);
            }
            if (!getFlrcurBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(6, this.flrcur_);
            }
            int i13 = this.exp_;
            if (i13 != 0) {
                iComputeStringSize += n.Y(7, i13);
            }
            if (!getDtBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(8, this.dt_);
            }
            int i14 = this.dlvy_;
            if (i14 != 0) {
                iComputeStringSize += n.Y(9, i14);
            }
            for (int i15 = 0; i15 < this.metric_.size(); i15++) {
                iComputeStringSize += n.G(10, this.metric_.get(i15));
            }
            for (int i16 = 0; i16 < this.deal_.size(); i16++) {
                iComputeStringSize += n.G(11, this.deal_.get(i16));
            }
            boolean z10 = this.private_;
            if (z10) {
                iComputeStringSize += n.e(12, z10);
            }
            if (this.spec_ != null) {
                iComputeStringSize += n.G(13, getSpec());
            }
            for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
                iComputeStringSize += n.G(14, this.extProto_.get(i17));
            }
            if (this.ext_ != null) {
                iComputeStringSize += n.G(15, getExt());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Any getSpec() {
            Any any = this.spec_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public e getSpecOrBuilder() {
            return getSpec();
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public boolean hasSpec() {
            return this.spec_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getQty()) * 37) + 3) * 53) + getSeq()) * 37) + 4) * 53) + j0.i(Double.doubleToLongBits(getFlr()))) * 37) + 6) * 53) + getFlrcur().hashCode()) * 37) + 7) * 53) + getExp()) * 37) + 8) * 53) + getDt().hashCode()) * 37) + 9) * 53) + getDlvy();
            if (getMetricCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getMetricList().hashCode();
            }
            if (getDealCount() > 0) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getDealList().hashCode();
            }
            int iD = (((iHashCode * 37) + 12) * 53) + j0.d(getPrivate());
            if (hasSpec()) {
                iD = (((iD * 37) + 13) * 53) + getSpec().hashCode();
            }
            if (hasExt()) {
                iD = (((iD * 37) + 15) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iD = (((iD * 37) + 14) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (iD * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.f19286h.d(Item.class, Builder.class);
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
            return new Item();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.id_);
            }
            int i10 = this.qty_;
            if (i10 != 0) {
                nVar.W0(2, i10);
            }
            int i11 = this.seq_;
            if (i11 != 0) {
                nVar.W0(3, i11);
            }
            double d10 = this.flr_;
            if (d10 != 0.0d) {
                nVar.t0(4, d10);
            }
            if (!getFlrcurBytes().isEmpty()) {
                h0.writeString(nVar, 6, this.flrcur_);
            }
            int i12 = this.exp_;
            if (i12 != 0) {
                nVar.W0(7, i12);
            }
            if (!getDtBytes().isEmpty()) {
                h0.writeString(nVar, 8, this.dt_);
            }
            int i13 = this.dlvy_;
            if (i13 != 0) {
                nVar.W0(9, i13);
            }
            for (int i14 = 0; i14 < this.metric_.size(); i14++) {
                nVar.J0(10, this.metric_.get(i14));
            }
            for (int i15 = 0; i15 < this.deal_.size(); i15++) {
                nVar.J0(11, this.deal_.get(i15));
            }
            boolean z10 = this.private_;
            if (z10) {
                nVar.n0(12, z10);
            }
            if (this.spec_ != null) {
                nVar.J0(13, getSpec());
            }
            for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
                nVar.J0(14, this.extProto_.get(i16));
            }
            if (this.ext_ != null) {
                nVar.J0(15, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ItemOrBuilder {
            private int bitField0_;
            private v1 dealBuilder_;
            private List<Deal> deal_;
            private int dlvy_;
            private Object dt_;
            private int exp_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private double flr_;
            private Object flrcur_;
            private Object id_;
            private v1 metricBuilder_;
            private List<Metric> metric_;
            private boolean private_;
            private int qty_;
            private int seq_;
            private a2 specBuilder_;
            private Any spec_;

            private void ensureDealIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.deal_ = new ArrayList(this.deal_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureMetricIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.metric_ = new ArrayList(this.metric_);
                    this.bitField0_ |= 1;
                }
            }

            private v1 getDealFieldBuilder() {
                if (this.dealBuilder_ == null) {
                    this.dealBuilder_ = new v1(this.deal_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.deal_ = null;
                }
                return this.dealBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f19285g;
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
                    this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private v1 getMetricFieldBuilder() {
                if (this.metricBuilder_ == null) {
                    this.metricBuilder_ = new v1(this.metric_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.metric_ = null;
                }
                return this.metricBuilder_;
            }

            private a2 getSpecFieldBuilder() {
                if (this.specBuilder_ == null) {
                    this.specBuilder_ = new a2(getSpec(), getParentForChildren(), isClean());
                    this.spec_ = null;
                }
                return this.specBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getMetricFieldBuilder();
                    getDealFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllDeal(Iterable<? extends Deal> iterable) {
                v1 v1Var = this.dealBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureDealIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.deal_);
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

            public Builder addAllMetric(Iterable<? extends Metric> iterable) {
                v1 v1Var = this.metricBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureMetricIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.metric_);
                onChanged();
                return this;
            }

            public Builder addDeal(Deal deal) {
                v1 v1Var = this.dealBuilder_;
                if (v1Var != null) {
                    v1Var.e(deal);
                    return this;
                }
                deal.getClass();
                ensureDealIsMutable();
                this.deal_.add(deal);
                onChanged();
                return this;
            }

            public Deal.Builder addDealBuilder() {
                return (Deal.Builder) getDealFieldBuilder().c(Deal.getDefaultInstance());
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

            public Builder addMetric(Metric metric) {
                v1 v1Var = this.metricBuilder_;
                if (v1Var != null) {
                    v1Var.e(metric);
                    return this;
                }
                metric.getClass();
                ensureMetricIsMutable();
                this.metric_.add(metric);
                onChanged();
                return this;
            }

            public Metric.Builder addMetricBuilder() {
                return (Metric.Builder) getMetricFieldBuilder().c(Metric.getDefaultInstance());
            }

            public Builder clearDeal() {
                v1 v1Var = this.dealBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.deal_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearDlvy() {
                this.dlvy_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDt() {
                this.dt_ = Item.getDefaultInstance().getDt();
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
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearFlr() {
                this.flr_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearFlrcur() {
                this.flrcur_ = Item.getDefaultInstance().getFlrcur();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = Item.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearMetric() {
                v1 v1Var = this.metricBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.metric_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearPrivate() {
                this.private_ = false;
                onChanged();
                return this;
            }

            public Builder clearQty() {
                this.qty_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSeq() {
                this.seq_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSpec() {
                if (this.specBuilder_ == null) {
                    this.spec_ = null;
                    onChanged();
                    return this;
                }
                this.spec_ = null;
                this.specBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public Deal getDeal(int i10) {
                v1 v1Var = this.dealBuilder_;
                return v1Var == null ? this.deal_.get(i10) : (Deal) v1Var.n(i10);
            }

            public Deal.Builder getDealBuilder(int i10) {
                return (Deal.Builder) getDealFieldBuilder().k(i10);
            }

            public List<Deal.Builder> getDealBuilderList() {
                return getDealFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getDealCount() {
                v1 v1Var = this.dealBuilder_;
                return v1Var == null ? this.deal_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<Deal> getDealList() {
                v1 v1Var = this.dealBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.deal_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public DealOrBuilder getDealOrBuilder(int i10) {
                v1 v1Var = this.dealBuilder_;
                return v1Var == null ? this.deal_.get(i10) : (DealOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<? extends DealOrBuilder> getDealOrBuilderList() {
                v1 v1Var = this.dealBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.deal_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f19285g;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getDlvy() {
                return this.dlvy_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public String getDt() {
                Object obj = this.dt_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.dt_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public ByteString getDtBytes() {
                Object obj = this.dt_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.dt_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getExp() {
                return this.exp_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public double getFlr() {
                return this.flr_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public String getFlrcur() {
                Object obj = this.flrcur_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.flrcur_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public ByteString getFlrcurBytes() {
                Object obj = this.flrcur_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.flrcur_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public Metric getMetric(int i10) {
                v1 v1Var = this.metricBuilder_;
                return v1Var == null ? this.metric_.get(i10) : (Metric) v1Var.n(i10);
            }

            public Metric.Builder getMetricBuilder(int i10) {
                return (Metric.Builder) getMetricFieldBuilder().k(i10);
            }

            public List<Metric.Builder> getMetricBuilderList() {
                return getMetricFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getMetricCount() {
                v1 v1Var = this.metricBuilder_;
                return v1Var == null ? this.metric_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<Metric> getMetricList() {
                v1 v1Var = this.metricBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.metric_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public MetricOrBuilder getMetricOrBuilder(int i10) {
                v1 v1Var = this.metricBuilder_;
                return v1Var == null ? this.metric_.get(i10) : (MetricOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<? extends MetricOrBuilder> getMetricOrBuilderList() {
                v1 v1Var = this.metricBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.metric_);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public boolean getPrivate() {
                return this.private_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getQty() {
                return this.qty_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getSeq() {
                return this.seq_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public Any getSpec() {
                a2 a2Var = this.specBuilder_;
                if (a2Var != null) {
                    return (Any) a2Var.e();
                }
                Any any = this.spec_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Any.Builder getSpecBuilder() {
                onChanged();
                return (Any.Builder) getSpecFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public e getSpecOrBuilder() {
                a2 a2Var = this.specBuilder_;
                if (a2Var != null) {
                    return (e) a2Var.f();
                }
                Any any = this.spec_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public boolean hasSpec() {
                return (this.specBuilder_ == null && this.spec_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f19286h.d(Item.class, Builder.class);
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

            public Builder mergeSpec(Any any) {
                a2 a2Var = this.specBuilder_;
                if (a2Var != null) {
                    a2Var.g(any);
                    return this;
                }
                Any any2 = this.spec_;
                if (any2 != null) {
                    this.spec_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                } else {
                    this.spec_ = any;
                }
                onChanged();
                return this;
            }

            public Builder removeDeal(int i10) {
                v1 v1Var = this.dealBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureDealIsMutable();
                this.deal_.remove(i10);
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

            public Builder removeMetric(int i10) {
                v1 v1Var = this.metricBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureMetricIsMutable();
                this.metric_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setDeal(int i10, Deal deal) {
                v1 v1Var = this.dealBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, deal);
                    return this;
                }
                deal.getClass();
                ensureDealIsMutable();
                this.deal_.set(i10, deal);
                onChanged();
                return this;
            }

            public Builder setDlvy(int i10) {
                this.dlvy_ = i10;
                onChanged();
                return this;
            }

            public Builder setDt(String str) {
                str.getClass();
                this.dt_ = str;
                onChanged();
                return this;
            }

            public Builder setDtBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.dt_ = byteString;
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

            public Builder setFlr(double d10) {
                this.flr_ = d10;
                onChanged();
                return this;
            }

            public Builder setFlrcur(String str) {
                str.getClass();
                this.flrcur_ = str;
                onChanged();
                return this;
            }

            public Builder setFlrcurBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.flrcur_ = byteString;
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

            public Builder setMetric(int i10, Metric metric) {
                v1 v1Var = this.metricBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, metric);
                    return this;
                }
                metric.getClass();
                ensureMetricIsMutable();
                this.metric_.set(i10, metric);
                onChanged();
                return this;
            }

            public Builder setPrivate(boolean z10) {
                this.private_ = z10;
                onChanged();
                return this;
            }

            public Builder setQty(int i10) {
                this.qty_ = i10;
                onChanged();
                return this;
            }

            public Builder setSeq(int i10) {
                this.seq_ = i10;
                onChanged();
                return this;
            }

            public Builder setSpec(Any any) {
                a2 a2Var = this.specBuilder_;
                if (a2Var != null) {
                    a2Var.i(any);
                    return this;
                }
                any.getClass();
                this.spec_ = any;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.flrcur_ = "";
                this.dt_ = "";
                List list = Collections.EMPTY_LIST;
                this.metric_ = list;
                this.deal_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Item build() {
                Item itemBuildPartial = buildPartial();
                if (itemBuildPartial.isInitialized()) {
                    return itemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Item buildPartial() {
                Item item = new Item(this);
                item.id_ = this.id_;
                item.qty_ = this.qty_;
                item.seq_ = this.seq_;
                item.flr_ = this.flr_;
                item.flrcur_ = this.flrcur_;
                item.exp_ = this.exp_;
                item.dt_ = this.dt_;
                item.dlvy_ = this.dlvy_;
                v1 v1Var = this.metricBuilder_;
                if (v1Var != null) {
                    item.metric_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.metric_ = DesugarCollections.unmodifiableList(this.metric_);
                        this.bitField0_ &= -2;
                    }
                    item.metric_ = this.metric_;
                }
                v1 v1Var2 = this.dealBuilder_;
                if (v1Var2 != null) {
                    item.deal_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.deal_ = DesugarCollections.unmodifiableList(this.deal_);
                        this.bitField0_ &= -3;
                    }
                    item.deal_ = this.deal_;
                }
                item.private_ = this.private_;
                a2 a2Var = this.specBuilder_;
                if (a2Var == null) {
                    item.spec_ = this.spec_;
                } else {
                    item.spec_ = (Any) a2Var.a();
                }
                a2 a2Var2 = this.extBuilder_;
                if (a2Var2 == null) {
                    item.ext_ = this.ext_;
                } else {
                    item.ext_ = (Struct) a2Var2.a();
                }
                v1 v1Var3 = this.extProtoBuilder_;
                if (v1Var3 != null) {
                    item.extProto_ = v1Var3.f();
                } else {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -5;
                    }
                    item.extProto_ = this.extProto_;
                }
                onBuilt();
                return item;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Item getDefaultInstanceForType() {
                return Item.getDefaultInstance();
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

            public Deal.Builder addDealBuilder(int i10) {
                return (Deal.Builder) getDealFieldBuilder().b(i10, Deal.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
            }

            public Metric.Builder addMetricBuilder(int i10) {
                return (Metric.Builder) getMetricFieldBuilder().b(i10, Metric.getDefaultInstance());
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
                this.qty_ = 0;
                this.seq_ = 0;
                this.flr_ = 0.0d;
                this.flrcur_ = "";
                this.exp_ = 0;
                this.dt_ = "";
                this.dlvy_ = 0;
                v1 v1Var = this.metricBuilder_;
                if (v1Var == null) {
                    this.metric_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    v1Var.g();
                }
                v1 v1Var2 = this.dealBuilder_;
                if (v1Var2 == null) {
                    this.deal_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                } else {
                    v1Var2.g();
                }
                this.private_ = false;
                if (this.specBuilder_ == null) {
                    this.spec_ = null;
                } else {
                    this.spec_ = null;
                    this.specBuilder_ = null;
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                v1 v1Var3 = this.extProtoBuilder_;
                if (v1Var3 == null) {
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -5;
                    return this;
                }
                v1Var3.g();
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

            public Builder setSpec(Any.Builder builder) {
                a2 a2Var = this.specBuilder_;
                if (a2Var == null) {
                    this.spec_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addDeal(int i10, Deal deal) {
                v1 v1Var = this.dealBuilder_;
                if (v1Var == null) {
                    deal.getClass();
                    ensureDealIsMutable();
                    this.deal_.add(i10, deal);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, deal);
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

            public Builder addMetric(int i10, Metric metric) {
                v1 v1Var = this.metricBuilder_;
                if (v1Var == null) {
                    metric.getClass();
                    ensureMetricIsMutable();
                    this.metric_.add(i10, metric);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, metric);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Item) {
                    return mergeFrom((Item) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDeal(int i10, Deal.Builder builder) {
                v1 v1Var = this.dealBuilder_;
                if (v1Var == null) {
                    ensureDealIsMutable();
                    this.deal_.set(i10, builder.build());
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

            public Builder setMetric(int i10, Metric.Builder builder) {
                v1 v1Var = this.metricBuilder_;
                if (v1Var == null) {
                    ensureMetricIsMutable();
                    this.metric_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Item item) {
                if (item == Item.getDefaultInstance()) {
                    return this;
                }
                if (!item.getId().isEmpty()) {
                    this.id_ = item.id_;
                    onChanged();
                }
                if (item.getQty() != 0) {
                    setQty(item.getQty());
                }
                if (item.getSeq() != 0) {
                    setSeq(item.getSeq());
                }
                if (item.getFlr() != 0.0d) {
                    setFlr(item.getFlr());
                }
                if (!item.getFlrcur().isEmpty()) {
                    this.flrcur_ = item.flrcur_;
                    onChanged();
                }
                if (item.getExp() != 0) {
                    setExp(item.getExp());
                }
                if (!item.getDt().isEmpty()) {
                    this.dt_ = item.dt_;
                    onChanged();
                }
                if (item.getDlvy() != 0) {
                    setDlvy(item.getDlvy());
                }
                if (this.metricBuilder_ == null) {
                    if (!item.metric_.isEmpty()) {
                        if (this.metric_.isEmpty()) {
                            this.metric_ = item.metric_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMetricIsMutable();
                            this.metric_.addAll(item.metric_);
                        }
                        onChanged();
                    }
                } else if (!item.metric_.isEmpty()) {
                    if (!this.metricBuilder_.t()) {
                        this.metricBuilder_.a(item.metric_);
                    } else {
                        this.metricBuilder_.h();
                        this.metricBuilder_ = null;
                        this.metric_ = item.metric_;
                        this.bitField0_ &= -2;
                        this.metricBuilder_ = h0.alwaysUseFieldBuilders ? getMetricFieldBuilder() : null;
                    }
                }
                if (this.dealBuilder_ == null) {
                    if (!item.deal_.isEmpty()) {
                        if (this.deal_.isEmpty()) {
                            this.deal_ = item.deal_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureDealIsMutable();
                            this.deal_.addAll(item.deal_);
                        }
                        onChanged();
                    }
                } else if (!item.deal_.isEmpty()) {
                    if (!this.dealBuilder_.t()) {
                        this.dealBuilder_.a(item.deal_);
                    } else {
                        this.dealBuilder_.h();
                        this.dealBuilder_ = null;
                        this.deal_ = item.deal_;
                        this.bitField0_ &= -3;
                        this.dealBuilder_ = h0.alwaysUseFieldBuilders ? getDealFieldBuilder() : null;
                    }
                }
                if (item.getPrivate()) {
                    setPrivate(item.getPrivate());
                }
                if (item.hasSpec()) {
                    mergeSpec(item.getSpec());
                }
                if (item.hasExt()) {
                    mergeExt(item.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!item.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = item.extProto_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(item.extProto_);
                        }
                        onChanged();
                    }
                } else if (!item.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(item.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = item.extProto_;
                        this.bitField0_ &= -5;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) item).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.flrcur_ = "";
                this.dt_ = "";
                List list = Collections.EMPTY_LIST;
                this.metric_ = list;
                this.deal_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addDeal(Deal.Builder builder) {
                v1 v1Var = this.dealBuilder_;
                if (v1Var == null) {
                    ensureDealIsMutable();
                    this.deal_.add(builder.build());
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

            public Builder addMetric(Metric.Builder builder) {
                v1 v1Var = this.metricBuilder_;
                if (v1Var == null) {
                    ensureMetricIsMutable();
                    this.metric_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addDeal(int i10, Deal.Builder builder) {
                v1 v1Var = this.dealBuilder_;
                if (v1Var == null) {
                    ensureDealIsMutable();
                    this.deal_.add(i10, builder.build());
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

            public Builder addMetric(int i10, Metric.Builder builder) {
                v1 v1Var = this.metricBuilder_;
                if (v1Var == null) {
                    ensureMetricIsMutable();
                    this.metric_.add(i10, builder.build());
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
            public com.explorestack.protobuf.openrtb.Request.Item.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Request.Item.access$7800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.openrtb.Request$Item r3 = (com.explorestack.protobuf.openrtb.Request.Item) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.openrtb.Request$Item r4 = (com.explorestack.protobuf.openrtb.Request.Item) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Request$Item$Builder");
            }
        }

        public static Builder newBuilder(Item item) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(item);
        }

        public static Item parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Item(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Item parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Item) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Item parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Item getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Item parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Item() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.flrcur_ = "";
            this.dt_ = "";
            List list = Collections.EMPTY_LIST;
            this.metric_ = list;
            this.deal_ = list;
            this.extProto_ = list;
        }

        public static Item parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Item parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(bArr, wVar);
        }

        public static Item parseFrom(InputStream inputStream) throws IOException {
            return (Item) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Item parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Item) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Item parseFrom(l lVar) throws IOException {
            return (Item) h0.parseWithIOException(PARSER, lVar);
        }

        private Item(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            case 16:
                                this.qty_ = lVar.L();
                                break;
                            case 24:
                                this.seq_ = lVar.L();
                                break;
                            case 33:
                                this.flr_ = lVar.s();
                                break;
                            case 50:
                                this.flrcur_ = lVar.J();
                                break;
                            case 56:
                                this.exp_ = lVar.L();
                                break;
                            case 66:
                                this.dt_ = lVar.J();
                                break;
                            case 72:
                                this.dlvy_ = lVar.L();
                                break;
                            case 82:
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.metric_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.metric_.add((Metric) lVar.A(Metric.parser(), wVar));
                                break;
                            case 90:
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.deal_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.deal_.add((Deal) lVar.A(Deal.parser(), wVar));
                                break;
                            case 96:
                                this.private_ = lVar.q();
                                break;
                            case 106:
                                Any any = this.spec_;
                                Any.Builder builder = any != null ? any.toBuilder() : null;
                                Any any2 = (Any) lVar.A(Any.parser(), wVar);
                                this.spec_ = any2;
                                if (builder != null) {
                                    builder.mergeFrom(any2);
                                    this.spec_ = builder.buildPartial();
                                }
                                break;
                            case 114:
                                int i13 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i13 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4;
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
                        this.metric_ = DesugarCollections.unmodifiableList(this.metric_);
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.deal_ = DesugarCollections.unmodifiableList(this.deal_);
                    }
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.metric_ = DesugarCollections.unmodifiableList(this.metric_);
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.deal_ = DesugarCollections.unmodifiableList(this.deal_);
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Item parseFrom(l lVar, w wVar) throws IOException {
            return (Item) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ItemOrBuilder extends MessageOrBuilder {
        Item.Deal getDeal(int i10);

        int getDealCount();

        List<Item.Deal> getDealList();

        Item.DealOrBuilder getDealOrBuilder(int i10);

        List<? extends Item.DealOrBuilder> getDealOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        int getDlvy();

        String getDt();

        ByteString getDtBytes();

        int getExp();

        Struct getExt();

        e2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        double getFlr();

        String getFlrcur();

        ByteString getFlrcurBytes();

        String getId();

        ByteString getIdBytes();

        Item.Metric getMetric(int i10);

        int getMetricCount();

        List<Item.Metric> getMetricList();

        Item.MetricOrBuilder getMetricOrBuilder(int i10);

        List<? extends Item.MetricOrBuilder> getMetricOrBuilderList();

        boolean getPrivate();

        int getQty();

        int getSeq();

        Any getSpec();

        e getSpecOrBuilder();

        boolean hasExt();

        boolean hasSpec();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Source extends h0 implements SourceOrBuilder {
        public static final int CERT_FIELD_NUMBER = 5;
        public static final int DIGEST_FIELD_NUMBER = 4;
        public static final int DSGVER_FIELD_NUMBER = 3;
        public static final int DS_FIELD_NUMBER = 2;
        public static final int EXT_FIELD_NUMBER = 8;
        public static final int EXT_PROTO_FIELD_NUMBER = 7;
        public static final int PCHAIN_FIELD_NUMBER = 6;
        public static final int TID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object cert_;
        private volatile Object digest_;
        private volatile Object ds_;
        private int dsgver_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private volatile Object pchain_;
        private volatile Object tid_;
        private static final Source DEFAULT_INSTANCE = new Source();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.openrtb.Request.Source.1
            @Override // com.explorestack.protobuf.p1
            public Source parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Source(lVar, wVar);
            }
        };

        public static Source getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f19283e;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Source parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Source) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Source parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Source)) {
                return super.equals(obj);
            }
            Source source = (Source) obj;
            if (getTid().equals(source.getTid()) && getDs().equals(source.getDs()) && getDsgver() == source.getDsgver() && getDigest().equals(source.getDigest()) && getCert().equals(source.getCert()) && getPchain().equals(source.getPchain()) && hasExt() == source.hasExt()) {
                return (!hasExt() || getExt().equals(source.getExt())) && getExtProtoList().equals(source.getExtProtoList()) && this.unknownFields.equals(source.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getCert() {
            Object obj = this.cert_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cert_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getCertBytes() {
            Object obj = this.cert_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cert_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getDigest() {
            Object obj = this.digest_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.digest_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getDigestBytes() {
            Object obj = this.digest_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.digest_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getDs() {
            Object obj = this.ds_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ds_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getDsBytes() {
            Object obj = this.ds_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ds_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public int getDsgver() {
            return this.dsgver_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getPchain() {
            Object obj = this.pchain_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.pchain_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getPchainBytes() {
            Object obj = this.pchain_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pchain_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getTidBytes().isEmpty() ? h0.computeStringSize(1, this.tid_) : 0;
            if (!getDsBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.ds_);
            }
            int i11 = this.dsgver_;
            if (i11 != 0) {
                iComputeStringSize += n.Y(3, i11);
            }
            if (!getDigestBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(4, this.digest_);
            }
            if (!getCertBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(5, this.cert_);
            }
            if (!getPchainBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(6, this.pchain_);
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

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getTid() {
            Object obj = this.tid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getTidBytes() {
            Object obj = this.tid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTid().hashCode()) * 37) + 2) * 53) + getDs().hashCode()) * 37) + 3) * 53) + getDsgver()) * 37) + 4) * 53) + getDigest().hashCode()) * 37) + 5) * 53) + getCert().hashCode()) * 37) + 6) * 53) + getPchain().hashCode();
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
            return b.f19284f.d(Source.class, Builder.class);
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
            return new Source();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getTidBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.tid_);
            }
            if (!getDsBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.ds_);
            }
            int i10 = this.dsgver_;
            if (i10 != 0) {
                nVar.W0(3, i10);
            }
            if (!getDigestBytes().isEmpty()) {
                h0.writeString(nVar, 4, this.digest_);
            }
            if (!getCertBytes().isEmpty()) {
                h0.writeString(nVar, 5, this.cert_);
            }
            if (!getPchainBytes().isEmpty()) {
                h0.writeString(nVar, 6, this.pchain_);
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                nVar.J0(7, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                nVar.J0(8, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements SourceOrBuilder {
            private int bitField0_;
            private Object cert_;
            private Object digest_;
            private Object ds_;
            private int dsgver_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object pchain_;
            private Object tid_;

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f19283e;
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

            public Builder clearCert() {
                this.cert_ = Source.getDefaultInstance().getCert();
                onChanged();
                return this;
            }

            public Builder clearDigest() {
                this.digest_ = Source.getDefaultInstance().getDigest();
                onChanged();
                return this;
            }

            public Builder clearDs() {
                this.ds_ = Source.getDefaultInstance().getDs();
                onChanged();
                return this;
            }

            public Builder clearDsgver() {
                this.dsgver_ = 0;
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
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearPchain() {
                this.pchain_ = Source.getDefaultInstance().getPchain();
                onChanged();
                return this;
            }

            public Builder clearTid() {
                this.tid_ = Source.getDefaultInstance().getTid();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getCert() {
                Object obj = this.cert_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cert_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getCertBytes() {
                Object obj = this.cert_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cert_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f19283e;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getDigest() {
                Object obj = this.digest_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.digest_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getDigestBytes() {
                Object obj = this.digest_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.digest_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getDs() {
                Object obj = this.ds_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ds_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getDsBytes() {
                Object obj = this.ds_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ds_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public int getDsgver() {
                return this.dsgver_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getPchain() {
                Object obj = this.pchain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.pchain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getPchainBytes() {
                Object obj = this.pchain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pchain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getTid() {
                Object obj = this.tid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getTidBytes() {
                Object obj = this.tid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f19284f.d(Source.class, Builder.class);
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

            public Builder setCert(String str) {
                str.getClass();
                this.cert_ = str;
                onChanged();
                return this;
            }

            public Builder setCertBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.cert_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDigest(String str) {
                str.getClass();
                this.digest_ = str;
                onChanged();
                return this;
            }

            public Builder setDigestBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.digest_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDs(String str) {
                str.getClass();
                this.ds_ = str;
                onChanged();
                return this;
            }

            public Builder setDsBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.ds_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDsgver(int i10) {
                this.dsgver_ = i10;
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

            public Builder setPchain(String str) {
                str.getClass();
                this.pchain_ = str;
                onChanged();
                return this;
            }

            public Builder setPchainBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.pchain_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTid(String str) {
                str.getClass();
                this.tid_ = str;
                onChanged();
                return this;
            }

            public Builder setTidBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.tid_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.tid_ = "";
                this.ds_ = "";
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Source build() {
                Source sourceBuildPartial = buildPartial();
                if (sourceBuildPartial.isInitialized()) {
                    return sourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sourceBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Source buildPartial() {
                Source source = new Source(this);
                source.tid_ = this.tid_;
                source.ds_ = this.ds_;
                source.dsgver_ = this.dsgver_;
                source.digest_ = this.digest_;
                source.cert_ = this.cert_;
                source.pchain_ = this.pchain_;
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    source.ext_ = this.ext_;
                } else {
                    source.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    source.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    source.extProto_ = this.extProto_;
                }
                onBuilt();
                return source;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Source getDefaultInstanceForType() {
                return Source.getDefaultInstance();
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
                this.tid_ = "";
                this.ds_ = "";
                this.dsgver_ = 0;
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
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
                if (message instanceof Source) {
                    return mergeFrom((Source) message);
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

            public Builder mergeFrom(Source source) {
                if (source == Source.getDefaultInstance()) {
                    return this;
                }
                if (!source.getTid().isEmpty()) {
                    this.tid_ = source.tid_;
                    onChanged();
                }
                if (!source.getDs().isEmpty()) {
                    this.ds_ = source.ds_;
                    onChanged();
                }
                if (source.getDsgver() != 0) {
                    setDsgver(source.getDsgver());
                }
                if (!source.getDigest().isEmpty()) {
                    this.digest_ = source.digest_;
                    onChanged();
                }
                if (!source.getCert().isEmpty()) {
                    this.cert_ = source.cert_;
                    onChanged();
                }
                if (!source.getPchain().isEmpty()) {
                    this.pchain_ = source.pchain_;
                    onChanged();
                }
                if (source.hasExt()) {
                    mergeExt(source.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!source.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = source.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(source.extProto_);
                        }
                        onChanged();
                    }
                } else if (!source.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(source.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = source.extProto_;
                        this.bitField0_ &= -2;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) source).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.tid_ = "";
                this.ds_ = "";
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
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
            public com.explorestack.protobuf.openrtb.Request.Source.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.openrtb.Request.Source.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.openrtb.Request$Source r3 = (com.explorestack.protobuf.openrtb.Request.Source) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.openrtb.Request$Source r4 = (com.explorestack.protobuf.openrtb.Request.Source) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Source.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.openrtb.Request$Source$Builder");
            }
        }

        public static Builder newBuilder(Source source) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(source);
        }

        public static Source parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Source(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Source parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Source) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Source parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Source getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Source parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Source() {
            this.memoizedIsInitialized = (byte) -1;
            this.tid_ = "";
            this.ds_ = "";
            this.digest_ = "";
            this.cert_ = "";
            this.pchain_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Source parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Source parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(bArr, wVar);
        }

        public static Source parseFrom(InputStream inputStream) throws IOException {
            return (Source) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Source parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Source) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Source parseFrom(l lVar) throws IOException {
            return (Source) h0.parseWithIOException(PARSER, lVar);
        }

        private Source(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.tid_ = lVar.J();
                            } else if (iK == 18) {
                                this.ds_ = lVar.J();
                            } else if (iK == 24) {
                                this.dsgver_ = lVar.L();
                            } else if (iK == 34) {
                                this.digest_ = lVar.J();
                            } else if (iK == 42) {
                                this.cert_ = lVar.J();
                            } else if (iK == 50) {
                                this.pchain_ = lVar.J();
                            } else if (iK == 58) {
                                if (!z11) {
                                    this.extProto_ = new ArrayList();
                                    z11 = true;
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

        public static Source parseFrom(l lVar, w wVar) throws IOException {
            return (Source) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface SourceOrBuilder extends MessageOrBuilder {
        String getCert();

        ByteString getCertBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getDigest();

        ByteString getDigestBytes();

        String getDs();

        ByteString getDsBytes();

        int getDsgver();

        Struct getExt();

        e2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        String getPchain();

        ByteString getPchainBytes();

        String getTid();

        ByteString getTidBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Request getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f19281c;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Request) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return super.equals(obj);
        }
        Request request = (Request) obj;
        if (!getId().equals(request.getId()) || getTest() != request.getTest() || getTmax() != request.getTmax() || getAt() != request.getAt() || !m4482getCurList().equals(request.m4482getCurList()) || !m4483getSeatList().equals(request.m4483getSeatList()) || getWseat() != request.getWseat() || !getCdata().equals(request.getCdata()) || hasSource() != request.hasSource()) {
            return false;
        }
        if ((hasSource() && !getSource().equals(request.getSource())) || !getItemList().equals(request.getItemList()) || getPackage() != request.getPackage() || hasContext() != request.hasContext()) {
            return false;
        }
        if ((!hasContext() || getContext().equals(request.getContext())) && hasExt() == request.hasExt()) {
            return (!hasExt() || getExt().equals(request.getExt())) && getExtProtoList().equals(request.getExtProtoList()) && this.unknownFields.equals(request.unknownFields);
        }
        return false;
    }

    public int getAt() {
        return this.at_;
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

    public Any getContext() {
        Any any = this.context_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public e getContextOrBuilder() {
        return getContext();
    }

    public String getCur(int i10) {
        return (String) this.cur_.get(i10);
    }

    public ByteString getCurBytes(int i10) {
        return this.cur_.getByteString(i10);
    }

    public int getCurCount() {
        return this.cur_.size();
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

    public Item getItem(int i10) {
        return this.item_.get(i10);
    }

    public int getItemCount() {
        return this.item_.size();
    }

    public List<Item> getItemList() {
        return this.item_;
    }

    public ItemOrBuilder getItemOrBuilder(int i10) {
        return this.item_.get(i10);
    }

    public List<? extends ItemOrBuilder> getItemOrBuilderList() {
        return this.item_;
    }

    public int getPackage() {
        return this.package_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    public String getSeat(int i10) {
        return (String) this.seat_.get(i10);
    }

    public ByteString getSeatBytes(int i10) {
        return this.seat_.getByteString(i10);
    }

    public int getSeatCount() {
        return this.seat_.size();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
        boolean z10 = this.test_;
        if (z10) {
            iComputeStringSize += n.e(2, z10);
        }
        int i11 = this.tmax_;
        if (i11 != 0) {
            iComputeStringSize += n.Y(3, i11);
        }
        int i12 = this.at_;
        if (i12 != 0) {
            iComputeStringSize += n.Y(4, i12);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i13 = 0; i13 < this.cur_.size(); i13++) {
            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.cur_.getRaw(i13));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + m4482getCurList().size();
        int iComputeStringSizeNoTag2 = 0;
        for (int i14 = 0; i14 < this.seat_.size(); i14++) {
            iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.seat_.getRaw(i14));
        }
        int size2 = size + iComputeStringSizeNoTag2 + m4483getSeatList().size();
        boolean z11 = this.wseat_;
        if (z11) {
            size2 += n.e(7, z11);
        }
        if (!getCdataBytes().isEmpty()) {
            size2 += h0.computeStringSize(8, this.cdata_);
        }
        if (this.source_ != null) {
            size2 += n.G(9, getSource());
        }
        for (int i15 = 0; i15 < this.item_.size(); i15++) {
            size2 += n.G(10, this.item_.get(i15));
        }
        int i16 = this.package_;
        if (i16 != 0) {
            size2 += n.Y(11, i16);
        }
        if (this.context_ != null) {
            size2 += n.G(12, getContext());
        }
        for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
            size2 += n.G(13, this.extProto_.get(i17));
        }
        if (this.ext_ != null) {
            size2 += n.G(14, getExt());
        }
        int serializedSize = size2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public Source getSource() {
        Source source = this.source_;
        return source == null ? Source.getDefaultInstance() : source;
    }

    public SourceOrBuilder getSourceOrBuilder() {
        return getSource();
    }

    public boolean getTest() {
        return this.test_;
    }

    public int getTmax() {
        return this.tmax_;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public boolean getWseat() {
        return this.wseat_;
    }

    public boolean hasContext() {
        return this.context_ != null;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public boolean hasSource() {
        return this.source_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + j0.d(getTest())) * 37) + 3) * 53) + getTmax()) * 37) + 4) * 53) + getAt();
        if (getCurCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + m4482getCurList().hashCode();
        }
        if (getSeatCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + m4483getSeatList().hashCode();
        }
        int iD = (((((((iHashCode * 37) + 7) * 53) + j0.d(getWseat())) * 37) + 8) * 53) + getCdata().hashCode();
        if (hasSource()) {
            iD = (((iD * 37) + 9) * 53) + getSource().hashCode();
        }
        if (getItemCount() > 0) {
            iD = (((iD * 37) + 10) * 53) + getItemList().hashCode();
        }
        int iHashCode2 = (((iD * 37) + 11) * 53) + getPackage();
        if (hasContext()) {
            iHashCode2 = (((iHashCode2 * 37) + 12) * 53) + getContext().hashCode();
        }
        if (hasExt()) {
            iHashCode2 = (((iHashCode2 * 37) + 14) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 13) * 53) + getExtProtoList().hashCode();
        }
        int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return b.f19282d.d(Request.class, Builder.class);
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
        return new Request();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getIdBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.id_);
        }
        boolean z10 = this.test_;
        if (z10) {
            nVar.n0(2, z10);
        }
        int i10 = this.tmax_;
        if (i10 != 0) {
            nVar.W0(3, i10);
        }
        int i11 = this.at_;
        if (i11 != 0) {
            nVar.W0(4, i11);
        }
        for (int i12 = 0; i12 < this.cur_.size(); i12++) {
            h0.writeString(nVar, 5, this.cur_.getRaw(i12));
        }
        for (int i13 = 0; i13 < this.seat_.size(); i13++) {
            h0.writeString(nVar, 6, this.seat_.getRaw(i13));
        }
        boolean z11 = this.wseat_;
        if (z11) {
            nVar.n0(7, z11);
        }
        if (!getCdataBytes().isEmpty()) {
            h0.writeString(nVar, 8, this.cdata_);
        }
        if (this.source_ != null) {
            nVar.J0(9, getSource());
        }
        for (int i14 = 0; i14 < this.item_.size(); i14++) {
            nVar.J0(10, this.item_.get(i14));
        }
        int i15 = this.package_;
        if (i15 != 0) {
            nVar.W0(11, i15);
        }
        if (this.context_ != null) {
            nVar.J0(12, getContext());
        }
        for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
            nVar.J0(13, this.extProto_.get(i16));
        }
        if (this.ext_ != null) {
            nVar.J0(14, getExt());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static Builder newBuilder(Request request) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(request);
    }

    public static Request parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(byteBuffer, wVar);
    }

    /* JADX INFO: renamed from: getCurList, reason: merged with bridge method [inline-methods] */
    public t1 m4482getCurList() {
        return this.cur_;
    }

    /* JADX INFO: renamed from: getSeatList, reason: merged with bridge method [inline-methods] */
    public t1 m4483getSeatList() {
        return this.seat_;
    }

    private Request(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Request parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Request) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Request getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Request parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Request() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        p0 p0Var = o0.f19269e;
        this.cur_ = p0Var;
        this.seat_ = p0Var;
        this.cdata_ = "";
        List list = Collections.EMPTY_LIST;
        this.item_ = list;
        this.extProto_ = list;
    }

    public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Request parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(bArr, wVar);
    }

    public static Request parseFrom(InputStream inputStream) throws IOException {
        return (Request) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Request parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Request) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Request parseFrom(l lVar) throws IOException {
        return (Request) h0.parseWithIOException(PARSER, lVar);
    }

    private Request(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                        case 16:
                            this.test_ = lVar.q();
                            break;
                        case 24:
                            this.tmax_ = lVar.L();
                            break;
                        case 32:
                            this.at_ = lVar.L();
                            break;
                        case 42:
                            String strJ = lVar.J();
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.cur_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.cur_.add(strJ);
                            break;
                        case 50:
                            String strJ2 = lVar.J();
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.seat_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.seat_.add(strJ2);
                            break;
                        case 56:
                            this.wseat_ = lVar.q();
                            break;
                        case 66:
                            this.cdata_ = lVar.J();
                            break;
                        case 74:
                            Source source = this.source_;
                            Source.Builder builder = source != null ? source.toBuilder() : null;
                            Source source2 = (Source) lVar.A(Source.parser(), wVar);
                            this.source_ = source2;
                            if (builder != null) {
                                builder.mergeFrom(source2);
                                this.source_ = builder.buildPartial();
                            }
                            break;
                        case 82:
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 == 0) {
                                this.item_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.item_.add((Item) lVar.A(Item.parser(), wVar));
                            break;
                        case 88:
                            this.package_ = lVar.L();
                            break;
                        case 98:
                            Any any = this.context_;
                            Any.Builder builder2 = any != null ? any.toBuilder() : null;
                            Any any2 = (Any) lVar.A(Any.parser(), wVar);
                            this.context_ = any2;
                            if (builder2 != null) {
                                builder2.mergeFrom(any2);
                                this.context_ = builder2.buildPartial();
                            }
                            break;
                        case 106:
                            int i14 = (i10 == true ? 1 : 0) & 8;
                            i10 = i10;
                            if (i14 == 0) {
                                this.extProto_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 8;
                            }
                            this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                            break;
                        case 114:
                            Struct struct = this.ext_;
                            Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.ext_ = struct2;
                            if (builder3 != null) {
                                builder3.mergeFrom(struct2);
                                this.ext_ = builder3.buildPartial();
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
                    this.cur_ = this.cur_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.seat_ = this.seat_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 4) != 0) {
                    this.item_ = DesugarCollections.unmodifiableList(this.item_);
                }
                if (((i10 == true ? 1 : 0) & 8) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.cur_ = this.cur_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 2) != 0) {
            this.seat_ = this.seat_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 4) != 0) {
            this.item_ = DesugarCollections.unmodifiableList(this.item_);
        }
        if (((i10 == true ? 1 : 0) & 8) != 0) {
            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Request parseFrom(l lVar, w wVar) throws IOException {
        return (Request) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
