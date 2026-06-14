package com.explorestack.protobuf.adcom;

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
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Ad extends h0 implements a {
    public static final int ADOMAIN_FIELD_NUMBER = 2;
    public static final int AUDIT_FIELD_NUMBER = 16;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    public static final int CATTAX_FIELD_NUMBER = 6;
    public static final int CAT_FIELD_NUMBER = 5;
    public static final int DISPLAY_FIELD_NUMBER = 13;
    public static final int EXT_FIELD_NUMBER = 18;
    public static final int EXT_PROTO_FIELD_NUMBER = 17;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INIT_FIELD_NUMBER = 11;
    public static final int IURL_FIELD_NUMBER = 4;
    public static final int LANG_FIELD_NUMBER = 7;
    public static final int LASTMOD_FIELD_NUMBER = 12;
    public static final int MRATING_FIELD_NUMBER = 10;
    public static final int SECURE_FIELD_NUMBER = 9;
    public static final int VIDEO_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    private p0 adomain_;
    private Audit audit_;
    private p0 bundle_;
    private p0 cat_;
    private int cattax_;
    private Display display_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private volatile Object init_;
    private volatile Object iurl_;
    private volatile Object lang_;
    private volatile Object lastmod_;
    private byte memoizedIsInitialized;
    private int mrating_;
    private boolean secure_;
    private Video video_;
    private static final Ad DEFAULT_INSTANCE = new Ad();
    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.1
        @Override // com.explorestack.protobuf.p1
        public Ad parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Ad(lVar, wVar);
        }
    };

    public static final class Audit extends h0 implements AuditOrBuilder {
        public static final int CORR_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int FEEDBACK_FIELD_NUMBER = 2;
        public static final int INIT_FIELD_NUMBER = 3;
        public static final int LASTMOD_FIELD_NUMBER = 4;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Ad corr_;
        private List<Any> extProto_;
        private Struct ext_;
        private p0 feedback_;
        private volatile Object init_;
        private volatile Object lastmod_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final Audit DEFAULT_INSTANCE = new Audit();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Audit.1
            @Override // com.explorestack.protobuf.p1
            public Audit parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Audit(lVar, wVar);
            }
        };

        public static final class Builder extends h0.b implements AuditOrBuilder {
            private int bitField0_;
            private a2 corrBuilder_;
            private Ad corr_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private p0 feedback_;
            private Object init_;
            private Object lastmod_;
            private int status_;

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureFeedbackIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.feedback_ = new o0(this.feedback_);
                    this.bitField0_ |= 1;
                }
            }

            private a2 getCorrFieldBuilder() {
                if (this.corrBuilder_ == null) {
                    this.corrBuilder_ = new a2(getCorr(), getParentForChildren(), isClean());
                    this.corr_ = null;
                }
                return this.corrBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.C0;
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

            public Builder addAllFeedback(Iterable<String> iterable) {
                ensureFeedbackIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.feedback_);
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

            public Builder addFeedback(String str) {
                str.getClass();
                ensureFeedbackIsMutable();
                this.feedback_.add(str);
                onChanged();
                return this;
            }

            public Builder addFeedbackBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureFeedbackIsMutable();
                this.feedback_.c(byteString);
                onChanged();
                return this;
            }

            public Builder clearCorr() {
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                    onChanged();
                    return this;
                }
                this.corr_ = null;
                this.corrBuilder_ = null;
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

            public Builder clearFeedback() {
                this.feedback_ = o0.f19269e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearInit() {
                this.init_ = Audit.getDefaultInstance().getInit();
                onChanged();
                return this;
            }

            public Builder clearLastmod() {
                this.lastmod_ = Audit.getDefaultInstance().getLastmod();
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public Ad getCorr() {
                a2 a2Var = this.corrBuilder_;
                if (a2Var != null) {
                    return (Ad) a2Var.e();
                }
                Ad ad2 = this.corr_;
                return ad2 == null ? Ad.getDefaultInstance() : ad2;
            }

            public Builder getCorrBuilder() {
                onChanged();
                return (Builder) getCorrFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public a getCorrOrBuilder() {
                a2 a2Var = this.corrBuilder_;
                if (a2Var != null) {
                    return (a) a2Var.f();
                }
                Ad ad2 = this.corr_;
                return ad2 == null ? Ad.getDefaultInstance() : ad2;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.C0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getFeedback(int i10) {
                return (String) this.feedback_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getFeedbackBytes(int i10) {
                return this.feedback_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getFeedbackCount() {
                return this.feedback_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getInit() {
                Object obj = this.init_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.init_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getInitBytes() {
                Object obj = this.init_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.init_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getLastmod() {
                Object obj = this.lastmod_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastmod_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getLastmodBytes() {
                Object obj = this.lastmod_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastmod_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public AuditStatusCode getStatus() {
                AuditStatusCode auditStatusCodeValueOf = AuditStatusCode.valueOf(this.status_);
                return auditStatusCodeValueOf == null ? AuditStatusCode.UNRECOGNIZED : auditStatusCodeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getStatusValue() {
                return this.status_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public boolean hasCorr() {
                return (this.corrBuilder_ == null && this.corr_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.D0.d(Audit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCorr(Ad ad2) {
                a2 a2Var = this.corrBuilder_;
                if (a2Var != null) {
                    a2Var.g(ad2);
                    return this;
                }
                Ad ad3 = this.corr_;
                if (ad3 != null) {
                    this.corr_ = Ad.newBuilder(ad3).mergeFrom(ad2).buildPartial();
                } else {
                    this.corr_ = ad2;
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

            public Builder setCorr(Ad ad2) {
                a2 a2Var = this.corrBuilder_;
                if (a2Var != null) {
                    a2Var.i(ad2);
                    return this;
                }
                ad2.getClass();
                this.corr_ = ad2;
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

            public Builder setFeedback(int i10, String str) {
                str.getClass();
                ensureFeedbackIsMutable();
                this.feedback_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setInit(String str) {
                str.getClass();
                this.init_ = str;
                onChanged();
                return this;
            }

            public Builder setInitBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.init_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLastmod(String str) {
                str.getClass();
                this.lastmod_ = str;
                onChanged();
                return this;
            }

            public Builder setLastmodBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.lastmod_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStatus(AuditStatusCode auditStatusCode) {
                auditStatusCode.getClass();
                this.status_ = auditStatusCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatusValue(int i10) {
                this.status_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public t1 getFeedbackList() {
                return this.feedback_.getUnmodifiableView();
            }

            private Builder() {
                this.status_ = 0;
                this.feedback_ = o0.f19269e;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Audit build() {
                Audit auditBuildPartial = buildPartial();
                if (auditBuildPartial.isInitialized()) {
                    return auditBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) auditBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Audit buildPartial() {
                Audit audit = new Audit(this);
                audit.status_ = this.status_;
                if ((this.bitField0_ & 1) != 0) {
                    this.feedback_ = this.feedback_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                audit.feedback_ = this.feedback_;
                audit.init_ = this.init_;
                audit.lastmod_ = this.lastmod_;
                a2 a2Var = this.corrBuilder_;
                if (a2Var == null) {
                    audit.corr_ = this.corr_;
                } else {
                    audit.corr_ = (Ad) a2Var.a();
                }
                a2 a2Var2 = this.extBuilder_;
                if (a2Var2 == null) {
                    audit.ext_ = this.ext_;
                } else {
                    audit.ext_ = (Struct) a2Var2.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    audit.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    audit.extProto_ = this.extProto_;
                }
                onBuilt();
                return audit;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Audit getDefaultInstanceForType() {
                return Audit.getDefaultInstance();
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
                this.status_ = 0;
                this.feedback_ = o0.f19269e;
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                this.init_ = "";
                this.lastmod_ = "";
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                } else {
                    this.corr_ = null;
                    this.corrBuilder_ = null;
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var == null) {
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ = i10 & (-4);
                    return this;
                }
                v1Var.g();
                return this;
            }

            public Builder setCorr(Builder builder) {
                a2 a2Var = this.corrBuilder_;
                if (a2Var == null) {
                    this.corr_ = builder.build();
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
                if (message instanceof Audit) {
                    return mergeFrom((Audit) message);
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
                this.status_ = 0;
                this.feedback_ = o0.f19269e;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Audit audit) {
                if (audit == Audit.getDefaultInstance()) {
                    return this;
                }
                if (audit.status_ != 0) {
                    setStatusValue(audit.getStatusValue());
                }
                if (!audit.feedback_.isEmpty()) {
                    if (this.feedback_.isEmpty()) {
                        this.feedback_ = audit.feedback_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeedbackIsMutable();
                        this.feedback_.addAll(audit.feedback_);
                    }
                    onChanged();
                }
                if (!audit.getInit().isEmpty()) {
                    this.init_ = audit.init_;
                    onChanged();
                }
                if (!audit.getLastmod().isEmpty()) {
                    this.lastmod_ = audit.lastmod_;
                    onChanged();
                }
                if (audit.hasCorr()) {
                    mergeCorr(audit.getCorr());
                }
                if (audit.hasExt()) {
                    mergeExt(audit.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!audit.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = audit.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(audit.extProto_);
                        }
                        onChanged();
                    }
                } else if (!audit.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(audit.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = audit.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) audit).unknownFields);
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
            public com.explorestack.protobuf.adcom.Ad.Audit.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Audit.access$20800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Audit r3 = (com.explorestack.protobuf.adcom.Ad.Audit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Audit r4 = (com.explorestack.protobuf.adcom.Ad.Audit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Audit.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Audit$Builder");
            }
        }

        public static Audit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.C0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Audit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Audit) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Audit)) {
                return super.equals(obj);
            }
            Audit audit = (Audit) obj;
            if (this.status_ != audit.status_ || !getFeedbackList().equals(audit.getFeedbackList()) || !getInit().equals(audit.getInit()) || !getLastmod().equals(audit.getLastmod()) || hasCorr() != audit.hasCorr()) {
                return false;
            }
            if ((!hasCorr() || getCorr().equals(audit.getCorr())) && hasExt() == audit.hasExt()) {
                return (!hasExt() || getExt().equals(audit.getExt())) && getExtProtoList().equals(audit.getExtProtoList()) && this.unknownFields.equals(audit.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Ad getCorr() {
            Ad ad2 = this.corr_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public a getCorrOrBuilder() {
            return getCorr();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getFeedback(int i10) {
            return (String) this.feedback_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getFeedbackBytes(int i10) {
            return this.feedback_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getFeedbackCount() {
            return this.feedback_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = byteStringCopyFromUtf8;
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
            int iL = this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber() ? n.l(1, this.status_) : 0;
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.feedback_.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.feedback_.getRaw(i11));
            }
            int size = iL + iComputeStringSizeNoTag + getFeedbackList().size();
            if (!getInitBytes().isEmpty()) {
                size += h0.computeStringSize(3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                size += h0.computeStringSize(4, this.lastmod_);
            }
            if (this.corr_ != null) {
                size += n.G(5, getCorr());
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                size += n.G(6, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                size += n.G(7, getExt());
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public AuditStatusCode getStatus() {
            AuditStatusCode auditStatusCodeValueOf = AuditStatusCode.valueOf(this.status_);
            return auditStatusCodeValueOf == null ? AuditStatusCode.UNRECOGNIZED : auditStatusCodeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public boolean hasCorr() {
            return this.corr_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.status_;
            if (getFeedbackCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getFeedbackList().hashCode();
            }
            int iHashCode2 = (((((((iHashCode * 37) + 3) * 53) + getInit().hashCode()) * 37) + 4) * 53) + getLastmod().hashCode();
            if (hasCorr()) {
                iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getCorr().hashCode();
            }
            if (hasExt()) {
                iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.D0.d(Audit.class, Builder.class);
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
            return new Audit();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber()) {
                nVar.v0(1, this.status_);
            }
            for (int i10 = 0; i10 < this.feedback_.size(); i10++) {
                h0.writeString(nVar, 2, this.feedback_.getRaw(i10));
            }
            if (!getInitBytes().isEmpty()) {
                h0.writeString(nVar, 3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                h0.writeString(nVar, 4, this.lastmod_);
            }
            if (this.corr_ != null) {
                nVar.J0(5, getCorr());
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                nVar.J0(6, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                nVar.J0(7, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(Audit audit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audit);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(byteBuffer, wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public t1 getFeedbackList() {
            return this.feedback_;
        }

        private Audit(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Audit parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Audit) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Audit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Audit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Audit parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Audit() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.feedback_ = o0.f19269e;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Audit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Audit parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(bArr, wVar);
        }

        public static Audit parseFrom(InputStream inputStream) throws IOException {
            return (Audit) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Audit) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Audit parseFrom(l lVar) throws IOException {
            return (Audit) h0.parseWithIOException(PARSER, lVar);
        }

        private Audit(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            if (iK == 8) {
                                this.status_ = lVar.t();
                            } else if (iK == 18) {
                                String strJ = lVar.J();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.feedback_ = new o0();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.feedback_.add(strJ);
                            } else if (iK == 26) {
                                this.init_ = lVar.J();
                            } else if (iK != 34) {
                                if (iK == 42) {
                                    Ad ad2 = this.corr_;
                                    Builder builder = ad2 != null ? ad2.toBuilder() : null;
                                    Ad ad3 = (Ad) lVar.A(Ad.parser(), wVar);
                                    this.corr_ = ad3;
                                    if (builder != null) {
                                        builder.mergeFrom(ad3);
                                        this.corr_ = builder.buildPartial();
                                    }
                                } else if (iK == 50) {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                } else if (iK != 58) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
                                    }
                                }
                            } else {
                                this.lastmod_ = lVar.J();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 1) != 0) {
                        this.feedback_ = this.feedback_.getUnmodifiableView();
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
                this.feedback_ = this.feedback_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Audit parseFrom(l lVar, w wVar) throws IOException {
            return (Audit) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface AuditOrBuilder extends MessageOrBuilder {
        Ad getCorr();

        a getCorrOrBuilder();

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

        String getFeedback(int i10);

        ByteString getFeedbackBytes(int i10);

        int getFeedbackCount();

        List<String> getFeedbackList();

        String getInit();

        ByteString getInitBytes();

        String getLastmod();

        ByteString getLastmodBytes();

        AuditStatusCode getStatus();

        int getStatusValue();

        boolean hasCorr();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Builder extends h0.b implements a {
        private p0 adomain_;
        private a2 auditBuilder_;
        private Audit audit_;
        private int bitField0_;
        private p0 bundle_;
        private p0 cat_;
        private int cattax_;
        private a2 displayBuilder_;
        private Display display_;
        private a2 extBuilder_;
        private v1 extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private Object init_;
        private Object iurl_;
        private Object lang_;
        private Object lastmod_;
        private int mrating_;
        private boolean secure_;
        private a2 videoBuilder_;
        private Video video_;

        private void ensureAdomainIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adomain_ = new o0(this.adomain_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureBundleIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.bundle_ = new o0(this.bundle_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureCatIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.cat_ = new o0(this.cat_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 8;
            }
        }

        private a2 getAuditFieldBuilder() {
            if (this.auditBuilder_ == null) {
                this.auditBuilder_ = new a2(getAudit(), getParentForChildren(), isClean());
                this.audit_ = null;
            }
            return this.auditBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18804a0;
        }

        private a2 getDisplayFieldBuilder() {
            if (this.displayBuilder_ == null) {
                this.displayBuilder_ = new a2(getDisplay(), getParentForChildren(), isClean());
                this.display_ = null;
            }
            return this.displayBuilder_;
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

        private a2 getVideoFieldBuilder() {
            if (this.videoBuilder_ == null) {
                this.videoBuilder_ = new a2(getVideo(), getParentForChildren(), isClean());
                this.video_ = null;
            }
            return this.videoBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAdomain(String str) {
            str.getClass();
            ensureAdomainIsMutable();
            this.adomain_.add(str);
            onChanged();
            return this;
        }

        public Builder addAdomainBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureAdomainIsMutable();
            this.adomain_.c(byteString);
            onChanged();
            return this;
        }

        public Builder addAllAdomain(Iterable<String> iterable) {
            ensureAdomainIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.adomain_);
            onChanged();
            return this;
        }

        public Builder addAllBundle(Iterable<String> iterable) {
            ensureBundleIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.bundle_);
            onChanged();
            return this;
        }

        public Builder addAllCat(Iterable<String> iterable) {
            ensureCatIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.cat_);
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

        public Builder addBundle(String str) {
            str.getClass();
            ensureBundleIsMutable();
            this.bundle_.add(str);
            onChanged();
            return this;
        }

        public Builder addBundleBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureBundleIsMutable();
            this.bundle_.c(byteString);
            onChanged();
            return this;
        }

        public Builder addCat(String str) {
            str.getClass();
            ensureCatIsMutable();
            this.cat_.add(str);
            onChanged();
            return this;
        }

        public Builder addCatBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureCatIsMutable();
            this.cat_.c(byteString);
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

        public Builder clearAdomain() {
            this.adomain_ = o0.f19269e;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearAudit() {
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
                onChanged();
                return this;
            }
            this.audit_ = null;
            this.auditBuilder_ = null;
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = o0.f19269e;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearCat() {
            this.cat_ = o0.f19269e;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearCattax() {
            this.cattax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDisplay() {
            if (this.displayBuilder_ == null) {
                this.display_ = null;
                onChanged();
                return this;
            }
            this.display_ = null;
            this.displayBuilder_ = null;
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
            this.id_ = Ad.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearInit() {
            this.init_ = Ad.getDefaultInstance().getInit();
            onChanged();
            return this;
        }

        public Builder clearIurl() {
            this.iurl_ = Ad.getDefaultInstance().getIurl();
            onChanged();
            return this;
        }

        public Builder clearLang() {
            this.lang_ = Ad.getDefaultInstance().getLang();
            onChanged();
            return this;
        }

        public Builder clearLastmod() {
            this.lastmod_ = Ad.getDefaultInstance().getLastmod();
            onChanged();
            return this;
        }

        public Builder clearMrating() {
            this.mrating_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
            onChanged();
            return this;
        }

        public Builder clearVideo() {
            if (this.videoBuilder_ == null) {
                this.video_ = null;
                onChanged();
                return this;
            }
            this.video_ = null;
            this.videoBuilder_ = null;
            return this;
        }

        public String getAdomain(int i10) {
            return (String) this.adomain_.get(i10);
        }

        public ByteString getAdomainBytes(int i10) {
            return this.adomain_.getByteString(i10);
        }

        public int getAdomainCount() {
            return this.adomain_.size();
        }

        public Audit getAudit() {
            a2 a2Var = this.auditBuilder_;
            if (a2Var != null) {
                return (Audit) a2Var.e();
            }
            Audit audit = this.audit_;
            return audit == null ? Audit.getDefaultInstance() : audit;
        }

        public Audit.Builder getAuditBuilder() {
            onChanged();
            return (Audit.Builder) getAuditFieldBuilder().d();
        }

        public AuditOrBuilder getAuditOrBuilder() {
            a2 a2Var = this.auditBuilder_;
            if (a2Var != null) {
                return (AuditOrBuilder) a2Var.f();
            }
            Audit audit = this.audit_;
            return audit == null ? Audit.getDefaultInstance() : audit;
        }

        public String getBundle(int i10) {
            return (String) this.bundle_.get(i10);
        }

        public ByteString getBundleBytes(int i10) {
            return this.bundle_.getByteString(i10);
        }

        public int getBundleCount() {
            return this.bundle_.size();
        }

        public String getCat(int i10) {
            return (String) this.cat_.get(i10);
        }

        public ByteString getCatBytes(int i10) {
            return this.cat_.getByteString(i10);
        }

        public int getCatCount() {
            return this.cat_.size();
        }

        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f18804a0;
        }

        public Display getDisplay() {
            a2 a2Var = this.displayBuilder_;
            if (a2Var != null) {
                return (Display) a2Var.e();
            }
            Display display = this.display_;
            return display == null ? Display.getDefaultInstance() : display;
        }

        public Display.Builder getDisplayBuilder() {
            onChanged();
            return (Display.Builder) getDisplayFieldBuilder().d();
        }

        public DisplayOrBuilder getDisplayOrBuilder() {
            a2 a2Var = this.displayBuilder_;
            if (a2Var != null) {
                return (DisplayOrBuilder) a2Var.f();
            }
            Display display = this.display_;
            return display == null ? Display.getDefaultInstance() : display;
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

        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getIurl() {
            Object obj = this.iurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.iurl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIurlBytes() {
            Object obj = this.iurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iurl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getLang() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lang_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public MediaRating getMrating() {
            MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
            return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
        }

        public int getMratingValue() {
            return this.mrating_;
        }

        public boolean getSecure() {
            return this.secure_;
        }

        public Video getVideo() {
            a2 a2Var = this.videoBuilder_;
            if (a2Var != null) {
                return (Video) a2Var.e();
            }
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        public Video.Builder getVideoBuilder() {
            onChanged();
            return (Video.Builder) getVideoFieldBuilder().d();
        }

        public VideoOrBuilder getVideoOrBuilder() {
            a2 a2Var = this.videoBuilder_;
            if (a2Var != null) {
                return (VideoOrBuilder) a2Var.f();
            }
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        public boolean hasAudit() {
            return (this.auditBuilder_ == null && this.audit_ == null) ? false : true;
        }

        public boolean hasDisplay() {
            return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public boolean hasVideo() {
            return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return b.f18806b0.d(Ad.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAudit(Audit audit) {
            a2 a2Var = this.auditBuilder_;
            if (a2Var != null) {
                a2Var.g(audit);
                return this;
            }
            Audit audit2 = this.audit_;
            if (audit2 != null) {
                this.audit_ = Audit.newBuilder(audit2).mergeFrom(audit).buildPartial();
            } else {
                this.audit_ = audit;
            }
            onChanged();
            return this;
        }

        public Builder mergeDisplay(Display display) {
            a2 a2Var = this.displayBuilder_;
            if (a2Var != null) {
                a2Var.g(display);
                return this;
            }
            Display display2 = this.display_;
            if (display2 != null) {
                this.display_ = Display.newBuilder(display2).mergeFrom(display).buildPartial();
            } else {
                this.display_ = display;
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

        public Builder mergeVideo(Video video) {
            a2 a2Var = this.videoBuilder_;
            if (a2Var != null) {
                a2Var.g(video);
                return this;
            }
            Video video2 = this.video_;
            if (video2 != null) {
                this.video_ = Video.newBuilder(video2).mergeFrom(video).buildPartial();
            } else {
                this.video_ = video;
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

        public Builder setAdomain(int i10, String str) {
            str.getClass();
            ensureAdomainIsMutable();
            this.adomain_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setAudit(Audit audit) {
            a2 a2Var = this.auditBuilder_;
            if (a2Var != null) {
                a2Var.i(audit);
                return this;
            }
            audit.getClass();
            this.audit_ = audit;
            onChanged();
            return this;
        }

        public Builder setBundle(int i10, String str) {
            str.getClass();
            ensureBundleIsMutable();
            this.bundle_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setCat(int i10, String str) {
            str.getClass();
            ensureCatIsMutable();
            this.cat_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
            categoryTaxonomy.getClass();
            this.cattax_ = categoryTaxonomy.getNumber();
            onChanged();
            return this;
        }

        public Builder setCattaxValue(int i10) {
            this.cattax_ = i10;
            onChanged();
            return this;
        }

        public Builder setDisplay(Display display) {
            a2 a2Var = this.displayBuilder_;
            if (a2Var != null) {
                a2Var.i(display);
                return this;
            }
            display.getClass();
            this.display_ = display;
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

        public Builder setInit(String str) {
            str.getClass();
            this.init_ = str;
            onChanged();
            return this;
        }

        public Builder setInitBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.init_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIurl(String str) {
            str.getClass();
            this.iurl_ = str;
            onChanged();
            return this;
        }

        public Builder setIurlBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.iurl_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLang(String str) {
            str.getClass();
            this.lang_ = str;
            onChanged();
            return this;
        }

        public Builder setLangBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.lang_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLastmod(String str) {
            str.getClass();
            this.lastmod_ = str;
            onChanged();
            return this;
        }

        public Builder setLastmodBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.lastmod_ = byteString;
            onChanged();
            return this;
        }

        public Builder setMrating(MediaRating mediaRating) {
            mediaRating.getClass();
            this.mrating_ = mediaRating.getNumber();
            onChanged();
            return this;
        }

        public Builder setMratingValue(int i10) {
            this.mrating_ = i10;
            onChanged();
            return this;
        }

        public Builder setSecure(boolean z10) {
            this.secure_ = z10;
            onChanged();
            return this;
        }

        public Builder setVideo(Video video) {
            a2 a2Var = this.videoBuilder_;
            if (a2Var != null) {
                a2Var.i(video);
                return this;
            }
            video.getClass();
            this.video_ = video;
            onChanged();
            return this;
        }

        /* JADX INFO: renamed from: getAdomainList, reason: merged with bridge method [inline-methods] */
        public t1 m4444getAdomainList() {
            return this.adomain_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getBundleList, reason: merged with bridge method [inline-methods] */
        public t1 m4445getBundleList() {
            return this.bundle_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getCatList, reason: merged with bridge method [inline-methods] */
        public t1 m4446getCatList() {
            return this.cat_.getUnmodifiableView();
        }

        private Builder() {
            this.id_ = "";
            p0 p0Var = o0.f19269e;
            this.adomain_ = p0Var;
            this.bundle_ = p0Var;
            this.iurl_ = "";
            this.cat_ = p0Var;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Ad build() {
            Ad adBuildPartial = buildPartial();
            if (adBuildPartial.isInitialized()) {
                return adBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Ad buildPartial() {
            Ad ad2 = new Ad(this);
            ad2.id_ = this.id_;
            if ((this.bitField0_ & 1) != 0) {
                this.adomain_ = this.adomain_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            ad2.adomain_ = this.adomain_;
            if ((this.bitField0_ & 2) != 0) {
                this.bundle_ = this.bundle_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            ad2.bundle_ = this.bundle_;
            ad2.iurl_ = this.iurl_;
            if ((this.bitField0_ & 4) != 0) {
                this.cat_ = this.cat_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            ad2.cat_ = this.cat_;
            ad2.cattax_ = this.cattax_;
            ad2.lang_ = this.lang_;
            ad2.secure_ = this.secure_;
            ad2.mrating_ = this.mrating_;
            ad2.init_ = this.init_;
            ad2.lastmod_ = this.lastmod_;
            a2 a2Var = this.displayBuilder_;
            if (a2Var == null) {
                ad2.display_ = this.display_;
            } else {
                ad2.display_ = (Display) a2Var.a();
            }
            a2 a2Var2 = this.videoBuilder_;
            if (a2Var2 == null) {
                ad2.video_ = this.video_;
            } else {
                ad2.video_ = (Video) a2Var2.a();
            }
            a2 a2Var3 = this.auditBuilder_;
            if (a2Var3 == null) {
                ad2.audit_ = this.audit_;
            } else {
                ad2.audit_ = (Audit) a2Var3.a();
            }
            a2 a2Var4 = this.extBuilder_;
            if (a2Var4 == null) {
                ad2.ext_ = this.ext_;
            } else {
                ad2.ext_ = (Struct) a2Var4.a();
            }
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var != null) {
                ad2.extProto_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -9;
                }
                ad2.extProto_ = this.extProto_;
            }
            onBuilt();
            return ad2;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Ad getDefaultInstanceForType() {
            return Ad.getDefaultInstance();
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
            p0 p0Var = o0.f19269e;
            this.adomain_ = p0Var;
            int i10 = this.bitField0_;
            this.bundle_ = p0Var;
            this.iurl_ = "";
            this.cat_ = p0Var;
            this.bitField0_ = i10 & (-8);
            this.cattax_ = 0;
            this.lang_ = "";
            this.secure_ = false;
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            if (this.displayBuilder_ == null) {
                this.display_ = null;
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            if (this.videoBuilder_ == null) {
                this.video_ = null;
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
            } else {
                this.audit_ = null;
                this.auditBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var == null) {
                this.extProto_ = Collections.EMPTY_LIST;
                this.bitField0_ = i10 & (-16);
                return this;
            }
            v1Var.g();
            return this;
        }

        public Builder setAudit(Audit.Builder builder) {
            a2 a2Var = this.auditBuilder_;
            if (a2Var == null) {
                this.audit_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setDisplay(Display.Builder builder) {
            a2 a2Var = this.displayBuilder_;
            if (a2Var == null) {
                this.display_ = builder.build();
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

        public Builder setVideo(Video.Builder builder) {
            a2 a2Var = this.videoBuilder_;
            if (a2Var == null) {
                this.video_ = builder.build();
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
            if (message instanceof Ad) {
                return mergeFrom((Ad) message);
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

        public Builder mergeFrom(Ad ad2) {
            if (ad2 == Ad.getDefaultInstance()) {
                return this;
            }
            if (!ad2.getId().isEmpty()) {
                this.id_ = ad2.id_;
                onChanged();
            }
            if (!ad2.adomain_.isEmpty()) {
                if (this.adomain_.isEmpty()) {
                    this.adomain_ = ad2.adomain_;
                    this.bitField0_ &= -2;
                } else {
                    ensureAdomainIsMutable();
                    this.adomain_.addAll(ad2.adomain_);
                }
                onChanged();
            }
            if (!ad2.bundle_.isEmpty()) {
                if (this.bundle_.isEmpty()) {
                    this.bundle_ = ad2.bundle_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBundleIsMutable();
                    this.bundle_.addAll(ad2.bundle_);
                }
                onChanged();
            }
            if (!ad2.getIurl().isEmpty()) {
                this.iurl_ = ad2.iurl_;
                onChanged();
            }
            if (!ad2.cat_.isEmpty()) {
                if (this.cat_.isEmpty()) {
                    this.cat_ = ad2.cat_;
                    this.bitField0_ &= -5;
                } else {
                    ensureCatIsMutable();
                    this.cat_.addAll(ad2.cat_);
                }
                onChanged();
            }
            if (ad2.cattax_ != 0) {
                setCattaxValue(ad2.getCattaxValue());
            }
            if (!ad2.getLang().isEmpty()) {
                this.lang_ = ad2.lang_;
                onChanged();
            }
            if (ad2.getSecure()) {
                setSecure(ad2.getSecure());
            }
            if (ad2.mrating_ != 0) {
                setMratingValue(ad2.getMratingValue());
            }
            if (!ad2.getInit().isEmpty()) {
                this.init_ = ad2.init_;
                onChanged();
            }
            if (!ad2.getLastmod().isEmpty()) {
                this.lastmod_ = ad2.lastmod_;
                onChanged();
            }
            if (ad2.hasDisplay()) {
                mergeDisplay(ad2.getDisplay());
            }
            if (ad2.hasVideo()) {
                mergeVideo(ad2.getVideo());
            }
            if (ad2.hasAudit()) {
                mergeAudit(ad2.getAudit());
            }
            if (ad2.hasExt()) {
                mergeExt(ad2.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!ad2.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = ad2.extProto_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(ad2.extProto_);
                    }
                    onChanged();
                }
            } else if (!ad2.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.t()) {
                    this.extProtoBuilder_.a(ad2.extProto_);
                } else {
                    this.extProtoBuilder_.h();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = ad2.extProto_;
                    this.bitField0_ &= -9;
                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) ad2).unknownFields);
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

        private Builder(h0.c cVar) {
            super(cVar);
            this.id_ = "";
            p0 p0Var = o0.f19269e;
            this.adomain_ = p0Var;
            this.bundle_ = p0Var;
            this.iurl_ = "";
            this.cat_ = p0Var;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
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

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.adcom.Ad.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.access$23500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.adcom.Ad r3 = (com.explorestack.protobuf.adcom.Ad) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.adcom.Ad r4 = (com.explorestack.protobuf.adcom.Ad) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Builder");
        }
    }

    public static final class Display extends h0 implements DisplayOrBuilder {
        public static final int ADM_FIELD_NUMBER = 8;
        public static final int API_FIELD_NUMBER = 2;
        public static final int BANNER_FIELD_NUMBER = 10;
        public static final int CURL_FIELD_NUMBER = 9;
        public static final int EVENT_FIELD_NUMBER = 12;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int HRATIO_FIELD_NUMBER = 7;
        public static final int H_FIELD_NUMBER = 5;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int NATIVE_FIELD_NUMBER = 11;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int WRATIO_FIELD_NUMBER = 6;
        public static final int W_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object adm_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private Banner banner_;
        private volatile Object curl_;
        private List<Event> event_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private int hratio_;
        private byte memoizedIsInitialized;
        private p0 mime_;
        private Native native_;
        private int typeMemoizedSerializedSize;
        private List<Integer> type_;
        private int w_;
        private int wratio_;
        private static final j0.h.a api_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Ad.Display.1
            @Override // com.explorestack.protobuf.j0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final j0.h.a type_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Ad.Display.2
            @Override // com.explorestack.protobuf.j0.h.a
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType displayCreativeTypeValueOf = DisplayCreativeType.valueOf(num.intValue());
                return displayCreativeTypeValueOf == null ? DisplayCreativeType.UNRECOGNIZED : displayCreativeTypeValueOf;
            }
        };
        private static final Display DEFAULT_INSTANCE = new Display();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.3
            @Override // com.explorestack.protobuf.p1
            public Display parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Display(lVar, wVar);
            }
        };

        public static final class Banner extends h0 implements BannerOrBuilder {
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int IMG_FIELD_NUMBER = 1;
            public static final int LINK_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object img_;
            private volatile Object link_;
            private byte memoizedIsInitialized;
            private static final Banner DEFAULT_INSTANCE = new Banner();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Banner.1
                @Override // com.explorestack.protobuf.p1
                public Banner parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Banner(lVar, wVar);
                }
            };

            public static Banner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18820i0;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Banner) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Banner)) {
                    return super.equals(obj);
                }
                Banner banner = (Banner) obj;
                if (getImg().equals(banner.getImg()) && getLink().equals(banner.getLink()) && hasExt() == banner.hasExt()) {
                    return (!hasExt() || getExt().equals(banner.getExt())) && getExtProtoList().equals(banner.getExtProtoList()) && this.unknownFields.equals(banner.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public String getImg() {
                Object obj = this.img_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.img_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public ByteString getImgBytes() {
                Object obj = this.img_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.img_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public String getLink() {
                Object obj = this.link_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.link_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public ByteString getLinkBytes() {
                Object obj = this.link_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.link_ = byteStringCopyFromUtf8;
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
                int iComputeStringSize = !getImgBytes().isEmpty() ? h0.computeStringSize(1, this.img_) : 0;
                if (!getLinkBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(2, this.link_);
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

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImg().hashCode()) * 37) + 2) * 53) + getLink().hashCode();
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
                return b.f18822j0.d(Banner.class, Builder.class);
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
                return new Banner();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getImgBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.img_);
                }
                if (!getLinkBytes().isEmpty()) {
                    h0.writeString(nVar, 2, this.link_);
                }
                for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                    nVar.J0(3, this.extProto_.get(i10));
                }
                if (this.ext_ != null) {
                    nVar.J0(4, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements BannerOrBuilder {
                private int bitField0_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object img_;
                private Object link_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18820i0;
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

                public Builder clearImg() {
                    this.img_ = Banner.getDefaultInstance().getImg();
                    onChanged();
                    return this;
                }

                public Builder clearLink() {
                    this.link_ = Banner.getDefaultInstance().getLink();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f18820i0;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public String getImg() {
                    Object obj = this.img_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.img_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public ByteString getImgBytes() {
                    Object obj = this.img_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.img_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public String getLink() {
                    Object obj = this.link_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.link_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public ByteString getLinkBytes() {
                    Object obj = this.link_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.link_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18822j0.d(Banner.class, Builder.class);
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

                public Builder setImg(String str) {
                    str.getClass();
                    this.img_ = str;
                    onChanged();
                    return this;
                }

                public Builder setImgBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.img_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLink(String str) {
                    str.getClass();
                    this.link_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLinkBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.link_ = byteString;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Banner build() {
                    Banner bannerBuildPartial = buildPartial();
                    if (bannerBuildPartial.isInitialized()) {
                        return bannerBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) bannerBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Banner buildPartial() {
                    Banner banner = new Banner(this);
                    banner.img_ = this.img_;
                    banner.link_ = this.link_;
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        banner.ext_ = this.ext_;
                    } else {
                        banner.ext_ = (Struct) a2Var.a();
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        banner.extProto_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        banner.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return banner;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Banner getDefaultInstanceForType() {
                    return Banner.getDefaultInstance();
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
                    this.img_ = "";
                    this.link_ = "";
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
                    if (message instanceof Banner) {
                        return mergeFrom((Banner) message);
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
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Banner banner) {
                    if (banner == Banner.getDefaultInstance()) {
                        return this;
                    }
                    if (!banner.getImg().isEmpty()) {
                        this.img_ = banner.img_;
                        onChanged();
                    }
                    if (!banner.getLink().isEmpty()) {
                        this.link_ = banner.link_;
                        onChanged();
                    }
                    if (banner.hasExt()) {
                        mergeExt(banner.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!banner.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = banner.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(banner.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!banner.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(banner.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = banner.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) banner).unknownFields);
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
                public com.explorestack.protobuf.adcom.Ad.Display.Banner.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Banner.access$2800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Ad$Display$Banner r3 = (com.explorestack.protobuf.adcom.Ad.Display.Banner) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Ad$Display$Banner r4 = (com.explorestack.protobuf.adcom.Ad.Display.Banner) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Banner.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Banner$Builder");
                }
            }

            public static Builder newBuilder(Banner banner) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(banner);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Banner(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Banner parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Banner) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Banner getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Banner parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Banner() {
                this.memoizedIsInitialized = (byte) -1;
                this.img_ = "";
                this.link_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Banner parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(bArr, wVar);
            }

            public static Banner parseFrom(InputStream inputStream) throws IOException {
                return (Banner) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Banner) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            private Banner(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.img_ = lVar.J();
                                } else if (iK == 18) {
                                    this.link_ = lVar.J();
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

            public static Banner parseFrom(l lVar) throws IOException {
                return (Banner) h0.parseWithIOException(PARSER, lVar);
            }

            public static Banner parseFrom(l lVar, w wVar) throws IOException {
                return (Banner) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface BannerOrBuilder extends MessageOrBuilder {
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

            String getImg();

            ByteString getImgBytes();

            String getLink();

            ByteString getLinkBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends h0.b implements DisplayOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private a2 bannerBuilder_;
            private Banner banner_;
            private int bitField0_;
            private Object curl_;
            private v1 eventBuilder_;
            private List<Event> event_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int hratio_;
            private p0 mime_;
            private a2 nativeBuilder_;
            private Native native_;
            private List<Integer> type_;
            private int w_;
            private int wratio_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new o0(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            private a2 getBannerFieldBuilder() {
                if (this.bannerBuilder_ == null) {
                    this.bannerBuilder_ = new a2(getBanner(), getParentForChildren(), isClean());
                    this.banner_ = null;
                }
                return this.bannerBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18816g0;
            }

            private v1 getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new v1(this.event_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.event_ = null;
                }
                return this.eventBuilder_;
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
                    this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private a2 getNativeFieldBuilder() {
                if (this.nativeBuilder_ == null) {
                    this.nativeBuilder_ = new a2(getNative(), getParentForChildren(), isClean());
                    this.native_ = null;
                }
                return this.nativeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getEventFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.api_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllEvent(Iterable<? extends Event> iterable) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureEventIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.event_);
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

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addAllType(Iterable<? extends DisplayCreativeType> iterable) {
                ensureTypeIsMutable();
                Iterator<? extends DisplayCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.type_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addEvent(Event event) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var != null) {
                    v1Var.e(event);
                    return this;
                }
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(event);
                onChanged();
                return this;
            }

            public Event.Builder addEventBuilder() {
                return (Event.Builder) getEventFieldBuilder().c(Event.getDefaultInstance());
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

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add(str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.c(byteString);
                onChanged();
                return this;
            }

            public Builder addType(DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i10) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder clearAdm() {
                this.adm_ = Display.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearBanner() {
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                    onChanged();
                    return this;
                }
                this.banner_ = null;
                this.bannerBuilder_ = null;
                return this;
            }

            public Builder clearCurl() {
                this.curl_ = Display.getDefaultInstance().getCurl();
                onChanged();
                return this;
            }

            public Builder clearEvent() {
                v1 v1Var = this.eventBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.event_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
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
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHratio() {
                this.hratio_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = o0.f19269e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearNative() {
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                    onChanged();
                    return this;
                }
                this.native_ = null;
                this.nativeBuilder_ = null;
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWratio() {
                this.wratio_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getAdm() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adm_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Display.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<ApiFramework> getApiList() {
                return new j0.h(this.api_, Display.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Integer> getApiValueList() {
                return DesugarCollections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Banner getBanner() {
                a2 a2Var = this.bannerBuilder_;
                if (a2Var != null) {
                    return (Banner) a2Var.e();
                }
                Banner banner = this.banner_;
                return banner == null ? Banner.getDefaultInstance() : banner;
            }

            public Banner.Builder getBannerBuilder() {
                onChanged();
                return (Banner.Builder) getBannerFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public BannerOrBuilder getBannerOrBuilder() {
                a2 a2Var = this.bannerBuilder_;
                if (a2Var != null) {
                    return (BannerOrBuilder) a2Var.f();
                }
                Banner banner = this.banner_;
                return banner == null ? Banner.getDefaultInstance() : banner;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getCurl() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.curl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f18816g0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Event getEvent(int i10) {
                v1 v1Var = this.eventBuilder_;
                return v1Var == null ? this.event_.get(i10) : (Event) v1Var.n(i10);
            }

            public Event.Builder getEventBuilder(int i10) {
                return (Event.Builder) getEventFieldBuilder().k(i10);
            }

            public List<Event.Builder> getEventBuilderList() {
                return getEventFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getEventCount() {
                v1 v1Var = this.eventBuilder_;
                return v1Var == null ? this.event_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Event> getEventList() {
                v1 v1Var = this.eventBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.event_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public EventOrBuilder getEventOrBuilder(int i10) {
                v1 v1Var = this.eventBuilder_;
                return v1Var == null ? this.event_.get(i10) : (EventOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<? extends EventOrBuilder> getEventOrBuilderList() {
                v1 v1Var = this.eventBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.event_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getHratio() {
                return this.hratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getMime(int i10) {
                return (String) this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Native getNative() {
                a2 a2Var = this.nativeBuilder_;
                if (a2Var != null) {
                    return (Native) a2Var.e();
                }
                Native r02 = this.native_;
                return r02 == null ? Native.getDefaultInstance() : r02;
            }

            public Native.Builder getNativeBuilder() {
                onChanged();
                return (Native.Builder) getNativeFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public NativeOrBuilder getNativeOrBuilder() {
                a2 a2Var = this.nativeBuilder_;
                if (a2Var != null) {
                    return (NativeOrBuilder) a2Var.f();
                }
                Native r02 = this.native_;
                return r02 == null ? Native.getDefaultInstance() : r02;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public DisplayCreativeType getType(int i10) {
                return (DisplayCreativeType) Display.type_converter_.convert(this.type_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<DisplayCreativeType> getTypeList() {
                return new j0.h(this.type_, Display.type_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getTypeValue(int i10) {
                return this.type_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Integer> getTypeValueList() {
                return DesugarCollections.unmodifiableList(this.type_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getWratio() {
                return this.wratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasBanner() {
                return (this.bannerBuilder_ == null && this.banner_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasNative() {
                return (this.nativeBuilder_ == null && this.native_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18818h0.d(Display.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBanner(Banner banner) {
                a2 a2Var = this.bannerBuilder_;
                if (a2Var != null) {
                    a2Var.g(banner);
                    return this;
                }
                Banner banner2 = this.banner_;
                if (banner2 != null) {
                    this.banner_ = Banner.newBuilder(banner2).mergeFrom(banner).buildPartial();
                } else {
                    this.banner_ = banner;
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

            public Builder mergeNative(Native r22) {
                a2 a2Var = this.nativeBuilder_;
                if (a2Var != null) {
                    a2Var.g(r22);
                    return this;
                }
                Native r02 = this.native_;
                if (r02 != null) {
                    this.native_ = Native.newBuilder(r02).mergeFrom(r22).buildPartial();
                } else {
                    this.native_ = r22;
                }
                onChanged();
                return this;
            }

            public Builder removeEvent(int i10) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureEventIsMutable();
                this.event_.remove(i10);
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

            public Builder setAdm(String str) {
                str.getClass();
                this.adm_ = str;
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.adm_ = byteString;
                onChanged();
                return this;
            }

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setBanner(Banner banner) {
                a2 a2Var = this.bannerBuilder_;
                if (a2Var != null) {
                    a2Var.i(banner);
                    return this;
                }
                banner.getClass();
                this.banner_ = banner;
                onChanged();
                return this;
            }

            public Builder setCurl(String str) {
                str.getClass();
                this.curl_ = str;
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.curl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEvent(int i10, Event event) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, event);
                    return this;
                }
                event.getClass();
                ensureEventIsMutable();
                this.event_.set(i10, event);
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

            public Builder setH(int i10) {
                this.h_ = i10;
                onChanged();
                return this;
            }

            public Builder setHratio(int i10) {
                this.hratio_ = i10;
                onChanged();
                return this;
            }

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setNative(Native r22) {
                a2 a2Var = this.nativeBuilder_;
                if (a2Var != null) {
                    a2Var.i(r22);
                    return this;
                }
                r22.getClass();
                this.native_ = r22;
                onChanged();
                return this;
            }

            public Builder setType(int i10, DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10, int i11) {
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            public Builder setWratio(int i10) {
                this.wratio_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public t1 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.mime_ = o0.f19269e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Display build() {
                Display displayBuildPartial = buildPartial();
                if (displayBuildPartial.isInitialized()) {
                    return displayBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Display buildPartial() {
                Display display = new Display(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                display.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                display.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = DesugarCollections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                display.type_ = this.type_;
                display.w_ = this.w_;
                display.h_ = this.h_;
                display.wratio_ = this.wratio_;
                display.hratio_ = this.hratio_;
                display.adm_ = this.adm_;
                display.curl_ = this.curl_;
                a2 a2Var = this.bannerBuilder_;
                if (a2Var == null) {
                    display.banner_ = this.banner_;
                } else {
                    display.banner_ = (Banner) a2Var.a();
                }
                a2 a2Var2 = this.nativeBuilder_;
                if (a2Var2 == null) {
                    display.native_ = this.native_;
                } else {
                    display.native_ = (Native) a2Var2.a();
                }
                v1 v1Var = this.eventBuilder_;
                if (v1Var != null) {
                    display.event_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.event_ = DesugarCollections.unmodifiableList(this.event_);
                        this.bitField0_ &= -9;
                    }
                    display.event_ = this.event_;
                }
                a2 a2Var3 = this.extBuilder_;
                if (a2Var3 == null) {
                    display.ext_ = this.ext_;
                } else {
                    display.ext_ = (Struct) a2Var3.a();
                }
                v1 v1Var2 = this.extProtoBuilder_;
                if (v1Var2 != null) {
                    display.extProto_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    display.extProto_ = this.extProto_;
                }
                onBuilt();
                return display;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Display getDefaultInstanceForType() {
                return Display.getDefaultInstance();
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

            public Event.Builder addEventBuilder(int i10) {
                return (Event.Builder) getEventFieldBuilder().b(i10, Event.getDefaultInstance());
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
                this.mime_ = o0.f19269e;
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.bitField0_ = i10 & (-8);
                this.w_ = 0;
                this.h_ = 0;
                this.wratio_ = 0;
                this.hratio_ = 0;
                this.adm_ = "";
                this.curl_ = "";
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                } else {
                    this.banner_ = null;
                    this.bannerBuilder_ = null;
                }
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                } else {
                    this.native_ = null;
                    this.nativeBuilder_ = null;
                }
                v1 v1Var = this.eventBuilder_;
                if (v1Var == null) {
                    this.event_ = list;
                    this.bitField0_ = i10 & (-16);
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
                    this.extProto_ = list;
                    this.bitField0_ &= -17;
                    return this;
                }
                v1Var2.g();
                return this;
            }

            public Builder setBanner(Banner.Builder builder) {
                a2 a2Var = this.bannerBuilder_;
                if (a2Var == null) {
                    this.banner_ = builder.build();
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

            public Builder setNative(Native.Builder builder) {
                a2 a2Var = this.nativeBuilder_;
                if (a2Var == null) {
                    this.native_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addEvent(int i10, Event event) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var == null) {
                    event.getClass();
                    ensureEventIsMutable();
                    this.event_.add(i10, event);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, event);
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
                if (message instanceof Display) {
                    return mergeFrom((Display) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEvent(int i10, Event.Builder builder) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var == null) {
                    ensureEventIsMutable();
                    this.event_.set(i10, builder.build());
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

            public Builder mergeFrom(Display display) {
                if (display == Display.getDefaultInstance()) {
                    return this;
                }
                if (!display.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = display.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(display.mime_);
                    }
                    onChanged();
                }
                if (!display.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = display.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(display.api_);
                    }
                    onChanged();
                }
                if (!display.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = display.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(display.type_);
                    }
                    onChanged();
                }
                if (display.getW() != 0) {
                    setW(display.getW());
                }
                if (display.getH() != 0) {
                    setH(display.getH());
                }
                if (display.getWratio() != 0) {
                    setWratio(display.getWratio());
                }
                if (display.getHratio() != 0) {
                    setHratio(display.getHratio());
                }
                if (!display.getAdm().isEmpty()) {
                    this.adm_ = display.adm_;
                    onChanged();
                }
                if (!display.getCurl().isEmpty()) {
                    this.curl_ = display.curl_;
                    onChanged();
                }
                if (display.hasBanner()) {
                    mergeBanner(display.getBanner());
                }
                if (display.hasNative()) {
                    mergeNative(display.getNative());
                }
                if (this.eventBuilder_ == null) {
                    if (!display.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = display.event_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(display.event_);
                        }
                        onChanged();
                    }
                } else if (!display.event_.isEmpty()) {
                    if (!this.eventBuilder_.t()) {
                        this.eventBuilder_.a(display.event_);
                    } else {
                        this.eventBuilder_.h();
                        this.eventBuilder_ = null;
                        this.event_ = display.event_;
                        this.bitField0_ &= -9;
                        this.eventBuilder_ = h0.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    }
                }
                if (display.hasExt()) {
                    mergeExt(display.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!display.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = display.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(display.extProto_);
                        }
                        onChanged();
                    }
                } else if (!display.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(display.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = display.extProto_;
                        this.bitField0_ &= -17;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) display).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.mime_ = o0.f19269e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addEvent(Event.Builder builder) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var == null) {
                    ensureEventIsMutable();
                    this.event_.add(builder.build());
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

            public Builder addEvent(int i10, Event.Builder builder) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var == null) {
                    ensureEventIsMutable();
                    this.event_.add(i10, builder.build());
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
            public com.explorestack.protobuf.adcom.Ad.Display.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.access$16800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Display r3 = (com.explorestack.protobuf.adcom.Ad.Display) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Display r4 = (com.explorestack.protobuf.adcom.Ad.Display) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Builder");
            }
        }

        public static final class Native extends h0 implements NativeOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 2;
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int LINK_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private List<Asset> asset_;
            private List<Any> extProto_;
            private Struct ext_;
            private LinkAsset link_;
            private byte memoizedIsInitialized;
            private static final Native DEFAULT_INSTANCE = new Native();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.1
                @Override // com.explorestack.protobuf.p1
                public Native parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Native(lVar, wVar);
                }
            };

            public static final class Asset extends h0 implements AssetOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                public static final int EXT_FIELD_NUMBER = 9;
                public static final int EXT_PROTO_FIELD_NUMBER = 8;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMAGE_FIELD_NUMBER = 4;
                public static final int LABEL_FIELD_NUMBER = 10;
                public static final int LINK_FIELD_NUMBER = 7;
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                private DataAsset data_;
                private List<Any> extProto_;
                private Struct ext_;
                private int id_;
                private ImageAsset image_;
                private LabelAsset label_;
                private LinkAsset link_;
                private byte memoizedIsInitialized;
                private boolean req_;
                private TitleAsset title_;
                private VideoAsset video_;
                private static final Asset DEFAULT_INSTANCE = new Asset();
                private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.1
                    @Override // com.explorestack.protobuf.p1
                    public Asset parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new Asset(lVar, wVar);
                    }
                };

                public static final class DataAsset extends h0 implements DataAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 5;
                    public static final int EXT_PROTO_FIELD_NUMBER = 4;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 3;
                    public static final int VALUE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private volatile Object value_;
                    private static final DataAsset DEFAULT_INSTANCE = new DataAsset();
                    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.1
                        @Override // com.explorestack.protobuf.p1
                        public DataAsset parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                            return new DataAsset(lVar, wVar);
                        }
                    };

                    public static DataAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f18848w0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) h0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static p1 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataAsset)) {
                            return super.equals(obj);
                        }
                        DataAsset dataAsset = (DataAsset) obj;
                        if (getValue().equals(dataAsset.getValue()) && getLen() == dataAsset.getLen() && this.type_ == dataAsset.type_ && hasExt() == dataAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(dataAsset.getExt())) && getExtProtoList().equals(dataAsset.getExtProtoList()) && this.unknownFields.equals(dataAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public e2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getLen() {
                        return this.len_;
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
                        int iComputeStringSize = !getValueBytes().isEmpty() ? h0.computeStringSize(1, this.value_) : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iComputeStringSize += n.Y(2, i11);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            iComputeStringSize += n.l(3, this.type_);
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                        return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final r2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue().hashCode()) * 37) + 2) * 53) + getLen()) * 37) + 3) * 53) + this.type_;
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
                        return b.f18850x0.d(DataAsset.class, Builder.class);
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
                        return new DataAsset();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(n nVar) throws IOException {
                        if (!getValueBytes().isEmpty()) {
                            h0.writeString(nVar, 1, this.value_);
                        }
                        int i10 = this.len_;
                        if (i10 != 0) {
                            nVar.W0(2, i10);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            nVar.v0(3, this.type_);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            nVar.J0(4, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            nVar.J0(5, getExt());
                        }
                        this.unknownFields.writeTo(nVar);
                    }

                    public static final class Builder extends h0.b implements DataAssetOrBuilder {
                        private int bitField0_;
                        private a2 extBuilder_;
                        private v1 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;
                        private Object value_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f18848w0;
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

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearValue() {
                            this.value_ = DataAsset.getDefaultInstance().getValue();
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f18848w0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public e2 getExtOrBuilder() {
                            a2 a2Var = this.extBuilder_;
                            if (a2Var != null) {
                                return (e2) a2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getExtProtoCount() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.size() : v1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                            return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public String getValue() {
                            Object obj = this.value_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.value_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public ByteString getValueBytes() {
                            Object obj = this.value_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.value_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.h0.b
                        protected h0.f internalGetFieldAccessorTable() {
                            return b.f18850x0.d(DataAsset.class, Builder.class);
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

                        public Builder setLen(int i10) {
                            this.len_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeDataAssetType nativeDataAssetType) {
                            nativeDataAssetType.getClass();
                            this.type_ = nativeDataAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
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
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAsset build() {
                            DataAsset dataAssetBuildPartial = buildPartial();
                            if (dataAssetBuildPartial.isInitialized()) {
                                return dataAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAsset buildPartial() {
                            DataAsset dataAsset = new DataAsset(this);
                            dataAsset.value_ = this.value_;
                            dataAsset.len_ = this.len_;
                            dataAsset.type_ = this.type_;
                            a2 a2Var = this.extBuilder_;
                            if (a2Var == null) {
                                dataAsset.ext_ = this.ext_;
                            } else {
                                dataAsset.ext_ = (Struct) a2Var.a();
                            }
                            v1 v1Var = this.extProtoBuilder_;
                            if (v1Var != null) {
                                dataAsset.extProto_ = v1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                dataAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return dataAsset;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public DataAsset getDefaultInstanceForType() {
                            return DataAsset.getDefaultInstance();
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
                            this.value_ = "";
                            this.len_ = 0;
                            this.type_ = 0;
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
                            if (message instanceof DataAsset) {
                                return mergeFrom((DataAsset) message);
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
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(DataAsset dataAsset) {
                            if (dataAsset == DataAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!dataAsset.getValue().isEmpty()) {
                                this.value_ = dataAsset.value_;
                                onChanged();
                            }
                            if (dataAsset.getLen() != 0) {
                                setLen(dataAsset.getLen());
                            }
                            if (dataAsset.type_ != 0) {
                                setTypeValue(dataAsset.getTypeValue());
                            }
                            if (dataAsset.hasExt()) {
                                mergeExt(dataAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(dataAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((h0) dataAsset).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(DataAsset dataAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAsset);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(byteBuffer, wVar);
                    }

                    private DataAsset(h0.b bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                        return (DataAsset) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                    }

                    public static DataAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public DataAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static DataAsset parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(byteString, wVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private DataAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.value_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static DataAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.h0
                    public Builder newBuilderForType(h0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static DataAsset parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(bArr, wVar);
                    }

                    public static DataAsset parseFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) h0.parseWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(InputStream inputStream, w wVar) throws IOException {
                        return (DataAsset) h0.parseWithIOException(PARSER, inputStream, wVar);
                    }

                    private DataAsset(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                                this.value_ = lVar.J();
                                            } else if (iK == 16) {
                                                this.len_ = lVar.L();
                                            } else if (iK == 24) {
                                                this.type_ = lVar.t();
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

                    public static DataAsset parseFrom(l lVar) throws IOException {
                        return (DataAsset) h0.parseWithIOException(PARSER, lVar);
                    }

                    public static DataAsset parseFrom(l lVar, w wVar) throws IOException {
                        return (DataAsset) h0.parseWithIOException(PARSER, lVar, wVar);
                    }
                }

                public interface DataAssetOrBuilder extends MessageOrBuilder {
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

                    int getLen();

                    NativeDataAssetType getType();

                    int getTypeValue();

                    String getValue();

                    ByteString getValueBytes();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class ImageAsset extends h0 implements ImageAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 6;
                    public static final int EXT_PROTO_FIELD_NUMBER = 5;
                    public static final int H_FIELD_NUMBER = 3;
                    public static final int TYPE_FIELD_NUMBER = 4;
                    public static final int URL_FIELD_NUMBER = 1;
                    public static final int W_FIELD_NUMBER = 2;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int h_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private volatile Object url_;
                    private int w_;
                    private static final ImageAsset DEFAULT_INSTANCE = new ImageAsset();
                    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.1
                        @Override // com.explorestack.protobuf.p1
                        public ImageAsset parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                            return new ImageAsset(lVar, wVar);
                        }
                    };

                    public static ImageAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f18840s0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) h0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static p1 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAsset)) {
                            return super.equals(obj);
                        }
                        ImageAsset imageAsset = (ImageAsset) obj;
                        if (getUrl().equals(imageAsset.getUrl()) && getW() == imageAsset.getW() && getH() == imageAsset.getH() && this.type_ == imageAsset.type_ && hasExt() == imageAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(imageAsset.getExt())) && getExtProtoList().equals(imageAsset.getExtProtoList()) && this.unknownFields.equals(imageAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public e2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getH() {
                        return this.h_;
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
                        int iComputeStringSize = !getUrlBytes().isEmpty() ? h0.computeStringSize(1, this.url_) : 0;
                        int i11 = this.w_;
                        if (i11 != 0) {
                            iComputeStringSize += n.Y(2, i11);
                        }
                        int i12 = this.h_;
                        if (i12 != 0) {
                            iComputeStringSize += n.Y(3, i12);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            iComputeStringSize += n.l(4, this.type_);
                        }
                        for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                            iComputeStringSize += n.G(5, this.extProto_.get(i13));
                        }
                        if (this.ext_ != null) {
                            iComputeStringSize += n.G(6, getExt());
                        }
                        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public NativeImageAssetType getType() {
                        NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                        return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final r2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.url_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public ByteString getUrlBytes() {
                        Object obj = this.url_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.url_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getW()) * 37) + 3) * 53) + getH()) * 37) + 4) * 53) + this.type_;
                        if (hasExt()) {
                            iHashCode = (((iHashCode * 37) + 6) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            iHashCode = (((iHashCode * 37) + 5) * 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.h0
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.f18842t0.d(ImageAsset.class, Builder.class);
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
                        return new ImageAsset();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(n nVar) throws IOException {
                        if (!getUrlBytes().isEmpty()) {
                            h0.writeString(nVar, 1, this.url_);
                        }
                        int i10 = this.w_;
                        if (i10 != 0) {
                            nVar.W0(2, i10);
                        }
                        int i11 = this.h_;
                        if (i11 != 0) {
                            nVar.W0(3, i11);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            nVar.v0(4, this.type_);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            nVar.J0(5, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            nVar.J0(6, getExt());
                        }
                        this.unknownFields.writeTo(nVar);
                    }

                    public static final class Builder extends h0.b implements ImageAssetOrBuilder {
                        private int bitField0_;
                        private a2 extBuilder_;
                        private v1 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int type_;
                        private Object url_;
                        private int w_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f18840s0;
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

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearUrl() {
                            this.url_ = ImageAsset.getDefaultInstance().getUrl();
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f18840s0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public e2 getExtOrBuilder() {
                            a2 a2Var = this.extBuilder_;
                            if (a2Var != null) {
                                return (e2) a2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getExtProtoCount() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.size() : v1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public NativeImageAssetType getType() {
                            NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                            return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public String getUrl() {
                            Object obj = this.url_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.url_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public ByteString getUrlBytes() {
                            Object obj = this.url_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.url_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.h0.b
                        protected h0.f internalGetFieldAccessorTable() {
                            return b.f18842t0.d(ImageAsset.class, Builder.class);
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

                        public Builder setH(int i10) {
                            this.h_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeImageAssetType nativeImageAssetType) {
                            nativeImageAssetType.getClass();
                            this.type_ = nativeImageAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setUrl(String str) {
                            str.getClass();
                            this.url_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setUrlBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.url_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAsset build() {
                            ImageAsset imageAssetBuildPartial = buildPartial();
                            if (imageAssetBuildPartial.isInitialized()) {
                                return imageAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) imageAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAsset buildPartial() {
                            ImageAsset imageAsset = new ImageAsset(this);
                            imageAsset.url_ = this.url_;
                            imageAsset.w_ = this.w_;
                            imageAsset.h_ = this.h_;
                            imageAsset.type_ = this.type_;
                            a2 a2Var = this.extBuilder_;
                            if (a2Var == null) {
                                imageAsset.ext_ = this.ext_;
                            } else {
                                imageAsset.ext_ = (Struct) a2Var.a();
                            }
                            v1 v1Var = this.extProtoBuilder_;
                            if (v1Var != null) {
                                imageAsset.extProto_ = v1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                imageAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return imageAsset;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public ImageAsset getDefaultInstanceForType() {
                            return ImageAsset.getDefaultInstance();
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
                            this.url_ = "";
                            this.w_ = 0;
                            this.h_ = 0;
                            this.type_ = 0;
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
                            if (message instanceof ImageAsset) {
                                return mergeFrom((ImageAsset) message);
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
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(ImageAsset imageAsset) {
                            if (imageAsset == ImageAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!imageAsset.getUrl().isEmpty()) {
                                this.url_ = imageAsset.url_;
                                onChanged();
                            }
                            if (imageAsset.getW() != 0) {
                                setW(imageAsset.getW());
                            }
                            if (imageAsset.getH() != 0) {
                                setH(imageAsset.getH());
                            }
                            if (imageAsset.type_ != 0) {
                                setTypeValue(imageAsset.getTypeValue());
                            }
                            if (imageAsset.hasExt()) {
                                mergeExt(imageAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(imageAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((h0) imageAsset).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.access$7300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(ImageAsset imageAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAsset);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(byteBuffer, wVar);
                    }

                    private ImageAsset(h0.b bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                        return (ImageAsset) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                    }

                    public static ImageAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public ImageAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static ImageAsset parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(byteString, wVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private ImageAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.url_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static ImageAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.h0
                    public Builder newBuilderForType(h0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static ImageAsset parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(bArr, wVar);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) h0.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream, w wVar) throws IOException {
                        return (ImageAsset) h0.parseWithIOException(PARSER, inputStream, wVar);
                    }

                    private ImageAsset(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                            this.url_ = lVar.J();
                                        } else if (iK == 16) {
                                            this.w_ = lVar.L();
                                        } else if (iK == 24) {
                                            this.h_ = lVar.L();
                                        } else if (iK == 32) {
                                            this.type_ = lVar.t();
                                        } else if (iK == 42) {
                                            if (!z11) {
                                                this.extProto_ = new ArrayList();
                                                z11 = true;
                                            }
                                            this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                        } else if (iK != 50) {
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

                    public static ImageAsset parseFrom(l lVar) throws IOException {
                        return (ImageAsset) h0.parseWithIOException(PARSER, lVar);
                    }

                    public static ImageAsset parseFrom(l lVar, w wVar) throws IOException {
                        return (ImageAsset) h0.parseWithIOException(PARSER, lVar, wVar);
                    }
                }

                public interface ImageAssetOrBuilder extends MessageOrBuilder {
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

                    int getH();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    String getUrl();

                    ByteString getUrlBytes();

                    int getW();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class LabelAsset extends h0 implements LabelAssetOrBuilder {
                    public static final int CONTENT_FIELD_NUMBER = 1;
                    public static final int H_FIELD_NUMBER = 3;
                    public static final int POS_FIELD_NUMBER = 4;
                    public static final int W_FIELD_NUMBER = 2;
                    private static final long serialVersionUID = 0;
                    private volatile Object content_;
                    private int h_;
                    private byte memoizedIsInitialized;
                    private int pos_;
                    private int w_;
                    private static final LabelAsset DEFAULT_INSTANCE = new LabelAsset();
                    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.1
                        @Override // com.explorestack.protobuf.p1
                        public LabelAsset parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                            return new LabelAsset(lVar, wVar);
                        }
                    };

                    public static LabelAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f18852y0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static LabelAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (LabelAsset) h0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static LabelAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static p1 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof LabelAsset)) {
                            return super.equals(obj);
                        }
                        LabelAsset labelAsset = (LabelAsset) obj;
                        return getContent().equals(labelAsset.getContent()) && getW() == labelAsset.getW() && getH() == labelAsset.getH() && this.pos_ == labelAsset.pos_ && this.unknownFields.equals(labelAsset.unknownFields);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public String getContent() {
                        Object obj = this.content_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.content_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public ByteString getContentBytes() {
                        Object obj = this.content_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.content_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getH() {
                        return this.h_;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public p1 getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public NativeAssetPosition getPos() {
                        NativeAssetPosition nativeAssetPositionValueOf = NativeAssetPosition.valueOf(this.pos_);
                        return nativeAssetPositionValueOf == null ? NativeAssetPosition.UNRECOGNIZED : nativeAssetPositionValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getPosValue() {
                        return this.pos_;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iComputeStringSize = !getContentBytes().isEmpty() ? h0.computeStringSize(1, this.content_) : 0;
                        int i11 = this.w_;
                        if (i11 != 0) {
                            iComputeStringSize += n.Y(2, i11);
                        }
                        int i12 = this.h_;
                        if (i12 != 0) {
                            iComputeStringSize += n.Y(3, i12);
                        }
                        if (this.pos_ != NativeAssetPosition.ASSET_POSITION_TOP_LEFT.getNumber()) {
                            iComputeStringSize += n.l(4, this.pos_);
                        }
                        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final r2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getW()) * 37) + 3) * 53) + getH()) * 37) + 4) * 53) + this.pos_) * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.h0
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.f18854z0.d(LabelAsset.class, Builder.class);
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
                        return new LabelAsset();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(n nVar) throws IOException {
                        if (!getContentBytes().isEmpty()) {
                            h0.writeString(nVar, 1, this.content_);
                        }
                        int i10 = this.w_;
                        if (i10 != 0) {
                            nVar.W0(2, i10);
                        }
                        int i11 = this.h_;
                        if (i11 != 0) {
                            nVar.W0(3, i11);
                        }
                        if (this.pos_ != NativeAssetPosition.ASSET_POSITION_TOP_LEFT.getNumber()) {
                            nVar.v0(4, this.pos_);
                        }
                        this.unknownFields.writeTo(nVar);
                    }

                    public static final class Builder extends h0.b implements LabelAssetOrBuilder {
                        private Object content_;
                        private int h_;
                        private int pos_;
                        private int w_;

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f18852y0;
                        }

                        private void maybeForceBuilderInitialization() {
                            boolean unused = h0.alwaysUseFieldBuilders;
                        }

                        public Builder clearContent() {
                            this.content_ = LabelAsset.getDefaultInstance().getContent();
                            onChanged();
                            return this;
                        }

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearPos() {
                            this.pos_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public String getContent() {
                            Object obj = this.content_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.content_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public ByteString getContentBytes() {
                            Object obj = this.content_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.content_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f18852y0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public NativeAssetPosition getPos() {
                            NativeAssetPosition nativeAssetPositionValueOf = NativeAssetPosition.valueOf(this.pos_);
                            return nativeAssetPositionValueOf == null ? NativeAssetPosition.UNRECOGNIZED : nativeAssetPositionValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getPosValue() {
                            return this.pos_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.h0.b
                        protected h0.f internalGetFieldAccessorTable() {
                            return b.f18854z0.d(LabelAsset.class, Builder.class);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        public Builder setContent(String str) {
                            str.getClass();
                            this.content_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setContentBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.content_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setH(int i10) {
                            this.h_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setPos(NativeAssetPosition nativeAssetPosition) {
                            nativeAssetPosition.getClass();
                            this.pos_ = nativeAssetPosition.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setPosValue(int i10) {
                            this.pos_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.content_ = "";
                            this.pos_ = 0;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public LabelAsset build() {
                            LabelAsset labelAssetBuildPartial = buildPartial();
                            if (labelAssetBuildPartial.isInitialized()) {
                                return labelAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) labelAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public LabelAsset buildPartial() {
                            LabelAsset labelAsset = new LabelAsset(this);
                            labelAsset.content_ = this.content_;
                            labelAsset.w_ = this.w_;
                            labelAsset.h_ = this.h_;
                            labelAsset.pos_ = this.pos_;
                            onBuilt();
                            return labelAsset;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public LabelAsset getDefaultInstanceForType() {
                            return LabelAsset.getDefaultInstance();
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
                            this.content_ = "";
                            this.w_ = 0;
                            this.h_ = 0;
                            this.pos_ = 0;
                            return this;
                        }

                        private Builder(h0.c cVar) {
                            super(cVar);
                            this.content_ = "";
                            this.pos_ = 0;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder
                        /* JADX INFO: renamed from: clone */
                        public Builder mo4427clone() {
                            return (Builder) super.mo4427clone();
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(Message message) {
                            if (message instanceof LabelAsset) {
                                return mergeFrom((LabelAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(LabelAsset labelAsset) {
                            if (labelAsset == LabelAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!labelAsset.getContent().isEmpty()) {
                                this.content_ = labelAsset.content_;
                                onChanged();
                            }
                            if (labelAsset.getW() != 0) {
                                setW(labelAsset.getW());
                            }
                            if (labelAsset.getH() != 0) {
                                setH(labelAsset.getH());
                            }
                            if (labelAsset.pos_ != 0) {
                                setPosValue(labelAsset.getPosValue());
                            }
                            mergeUnknownFields(((h0) labelAsset).unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.access$11300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$LabelAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$LabelAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$LabelAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(LabelAsset labelAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(labelAsset);
                    }

                    public static LabelAsset parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(byteBuffer, wVar);
                    }

                    private LabelAsset(h0.b bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static LabelAsset parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                        return (LabelAsset) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                    }

                    public static LabelAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public LabelAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static LabelAsset parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(byteString, wVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private LabelAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.content_ = "";
                        this.pos_ = 0;
                    }

                    public static LabelAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.h0
                    public Builder newBuilderForType(h0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static LabelAsset parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(bArr, wVar);
                    }

                    public static LabelAsset parseFrom(InputStream inputStream) throws IOException {
                        return (LabelAsset) h0.parseWithIOException(PARSER, inputStream);
                    }

                    private LabelAsset(l lVar, w wVar) throws InvalidProtocolBufferException {
                        this();
                        wVar.getClass();
                        r2.b bVarG = r2.g();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int iK = lVar.K();
                                    if (iK != 0) {
                                        if (iK == 10) {
                                            this.content_ = lVar.J();
                                        } else if (iK == 16) {
                                            this.w_ = lVar.L();
                                        } else if (iK == 24) {
                                            this.h_ = lVar.L();
                                        } else if (iK != 32) {
                                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                            }
                                        } else {
                                            this.pos_ = lVar.t();
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

                    public static LabelAsset parseFrom(InputStream inputStream, w wVar) throws IOException {
                        return (LabelAsset) h0.parseWithIOException(PARSER, inputStream, wVar);
                    }

                    public static LabelAsset parseFrom(l lVar) throws IOException {
                        return (LabelAsset) h0.parseWithIOException(PARSER, lVar);
                    }

                    public static LabelAsset parseFrom(l lVar, w wVar) throws IOException {
                        return (LabelAsset) h0.parseWithIOException(PARSER, lVar, wVar);
                    }
                }

                public interface LabelAssetOrBuilder extends MessageOrBuilder {
                    String getContent();

                    ByteString getContentBytes();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

                    int getH();

                    NativeAssetPosition getPos();

                    int getPosValue();

                    int getW();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class TitleAsset extends h0 implements TitleAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TEXT_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private volatile Object text_;
                    private static final TitleAsset DEFAULT_INSTANCE = new TitleAsset();
                    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.1
                        @Override // com.explorestack.protobuf.p1
                        public TitleAsset parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                            return new TitleAsset(lVar, wVar);
                        }
                    };

                    public static TitleAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f18836q0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) h0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static p1 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAsset)) {
                            return super.equals(obj);
                        }
                        TitleAsset titleAsset = (TitleAsset) obj;
                        if (getText().equals(titleAsset.getText()) && getLen() == titleAsset.getLen() && hasExt() == titleAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(titleAsset.getExt())) && getExtProtoList().equals(titleAsset.getExtProtoList()) && this.unknownFields.equals(titleAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public e2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public int getLen() {
                        return this.len_;
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
                        int iComputeStringSize = !getTextBytes().isEmpty() ? h0.computeStringSize(1, this.text_) : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iComputeStringSize += n.Y(2, i11);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iComputeStringSize += n.G(3, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iComputeStringSize += n.G(4, getExt());
                        }
                        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public String getText() {
                        Object obj = this.text_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.text_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public ByteString getTextBytes() {
                        Object obj = this.text_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.text_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final r2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode()) * 37) + 2) * 53) + getLen();
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
                        return b.f18838r0.d(TitleAsset.class, Builder.class);
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
                        return new TitleAsset();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(n nVar) throws IOException {
                        if (!getTextBytes().isEmpty()) {
                            h0.writeString(nVar, 1, this.text_);
                        }
                        int i10 = this.len_;
                        if (i10 != 0) {
                            nVar.W0(2, i10);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            nVar.J0(3, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            nVar.J0(4, getExt());
                        }
                        this.unknownFields.writeTo(nVar);
                    }

                    public static final class Builder extends h0.b implements TitleAssetOrBuilder {
                        private int bitField0_;
                        private a2 extBuilder_;
                        private v1 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private Object text_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f18836q0;
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

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearText() {
                            this.text_ = TitleAsset.getDefaultInstance().getText();
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f18836q0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public e2 getExtOrBuilder() {
                            a2 a2Var = this.extBuilder_;
                            if (a2Var != null) {
                                return (e2) a2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public int getExtProtoCount() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.size() : v1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public String getText() {
                            Object obj = this.text_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.text_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public ByteString getTextBytes() {
                            Object obj = this.text_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.text_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.h0.b
                        protected h0.f internalGetFieldAccessorTable() {
                            return b.f18838r0.d(TitleAsset.class, Builder.class);
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

                        public Builder setLen(int i10) {
                            this.len_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setText(String str) {
                            str.getClass();
                            this.text_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setTextBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.text_ = byteString;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.text_ = "";
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAsset build() {
                            TitleAsset titleAssetBuildPartial = buildPartial();
                            if (titleAssetBuildPartial.isInitialized()) {
                                return titleAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAsset buildPartial() {
                            TitleAsset titleAsset = new TitleAsset(this);
                            titleAsset.text_ = this.text_;
                            titleAsset.len_ = this.len_;
                            a2 a2Var = this.extBuilder_;
                            if (a2Var == null) {
                                titleAsset.ext_ = this.ext_;
                            } else {
                                titleAsset.ext_ = (Struct) a2Var.a();
                            }
                            v1 v1Var = this.extProtoBuilder_;
                            if (v1Var != null) {
                                titleAsset.extProto_ = v1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                titleAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return titleAsset;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public TitleAsset getDefaultInstanceForType() {
                            return TitleAsset.getDefaultInstance();
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
                            this.text_ = "";
                            this.len_ = 0;
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

                        private Builder(h0.c cVar) {
                            super(cVar);
                            this.text_ = "";
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
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
                            if (message instanceof TitleAsset) {
                                return mergeFrom((TitleAsset) message);
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

                        public Builder mergeFrom(TitleAsset titleAsset) {
                            if (titleAsset == TitleAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!titleAsset.getText().isEmpty()) {
                                this.text_ = titleAsset.text_;
                                onChanged();
                            }
                            if (titleAsset.getLen() != 0) {
                                setLen(titleAsset.getLen());
                            }
                            if (titleAsset.hasExt()) {
                                mergeExt(titleAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(titleAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((h0) titleAsset).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.access$5800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(TitleAsset titleAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAsset);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(byteBuffer, wVar);
                    }

                    private TitleAsset(h0.b bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                        return (TitleAsset) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                    }

                    public static TitleAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public TitleAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static TitleAsset parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(byteString, wVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private TitleAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.text_ = "";
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static TitleAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.h0
                    public Builder newBuilderForType(h0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static TitleAsset parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(bArr, wVar);
                    }

                    public static TitleAsset parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) h0.parseWithIOException(PARSER, inputStream);
                    }

                    private TitleAsset(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                            this.text_ = lVar.J();
                                        } else if (iK == 16) {
                                            this.len_ = lVar.L();
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

                    public static TitleAsset parseFrom(InputStream inputStream, w wVar) throws IOException {
                        return (TitleAsset) h0.parseWithIOException(PARSER, inputStream, wVar);
                    }

                    public static TitleAsset parseFrom(l lVar) throws IOException {
                        return (TitleAsset) h0.parseWithIOException(PARSER, lVar);
                    }

                    public static TitleAsset parseFrom(l lVar, w wVar) throws IOException {
                        return (TitleAsset) h0.parseWithIOException(PARSER, lVar, wVar);
                    }
                }

                public interface TitleAssetOrBuilder extends MessageOrBuilder {
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

                    int getLen();

                    String getText();

                    ByteString getTextBytes();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class VideoAsset extends h0 implements VideoAssetOrBuilder {
                    public static final int ADM_FIELD_NUMBER = 1;
                    public static final int CURL_FIELD_NUMBER = 2;
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private volatile Object adm_;
                    private volatile Object curl_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private byte memoizedIsInitialized;
                    private static final VideoAsset DEFAULT_INSTANCE = new VideoAsset();
                    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.1
                        @Override // com.explorestack.protobuf.p1
                        public VideoAsset parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                            return new VideoAsset(lVar, wVar);
                        }
                    };

                    public static VideoAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f18844u0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) h0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static p1 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof VideoAsset)) {
                            return super.equals(obj);
                        }
                        VideoAsset videoAsset = (VideoAsset) obj;
                        if (getAdm().equals(videoAsset.getAdm()) && getCurl().equals(videoAsset.getCurl()) && hasExt() == videoAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(videoAsset.getExt())) && getExtProtoList().equals(videoAsset.getExtProtoList()) && this.unknownFields.equals(videoAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public String getAdm() {
                        Object obj = this.adm_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.adm_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public ByteString getAdmBytes() {
                        Object obj = this.adm_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.adm_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public String getCurl() {
                        Object obj = this.curl_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.curl_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public ByteString getCurlBytes() {
                        Object obj = this.curl_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.curl_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public e2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
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
                        int iComputeStringSize = !getAdmBytes().isEmpty() ? h0.computeStringSize(1, this.adm_) : 0;
                        if (!getCurlBytes().isEmpty()) {
                            iComputeStringSize += h0.computeStringSize(2, this.curl_);
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdm().hashCode()) * 37) + 2) * 53) + getCurl().hashCode();
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
                        return b.f18846v0.d(VideoAsset.class, Builder.class);
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
                        return new VideoAsset();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(n nVar) throws IOException {
                        if (!getAdmBytes().isEmpty()) {
                            h0.writeString(nVar, 1, this.adm_);
                        }
                        if (!getCurlBytes().isEmpty()) {
                            h0.writeString(nVar, 2, this.curl_);
                        }
                        for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                            nVar.J0(3, this.extProto_.get(i10));
                        }
                        if (this.ext_ != null) {
                            nVar.J0(4, getExt());
                        }
                        this.unknownFields.writeTo(nVar);
                    }

                    public static final class Builder extends h0.b implements VideoAssetOrBuilder {
                        private Object adm_;
                        private int bitField0_;
                        private Object curl_;
                        private a2 extBuilder_;
                        private v1 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f18844u0;
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

                        public Builder clearAdm() {
                            this.adm_ = VideoAsset.getDefaultInstance().getAdm();
                            onChanged();
                            return this;
                        }

                        public Builder clearCurl() {
                            this.curl_ = VideoAsset.getDefaultInstance().getCurl();
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public String getAdm() {
                            Object obj = this.adm_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.adm_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public ByteString getAdmBytes() {
                            Object obj = this.adm_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.adm_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public String getCurl() {
                            Object obj = this.curl_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.curl_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public ByteString getCurlBytes() {
                            Object obj = this.curl_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.curl_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f18844u0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public e2 getExtOrBuilder() {
                            a2 a2Var = this.extBuilder_;
                            if (a2Var != null) {
                                return (e2) a2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public int getExtProtoCount() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.size() : v1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.h0.b
                        protected h0.f internalGetFieldAccessorTable() {
                            return b.f18846v0.d(VideoAsset.class, Builder.class);
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

                        public Builder setAdm(String str) {
                            str.getClass();
                            this.adm_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setAdmBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.adm_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setCurl(String str) {
                            str.getClass();
                            this.curl_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setCurlBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.curl_ = byteString;
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

                        private Builder() {
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public VideoAsset build() {
                            VideoAsset videoAssetBuildPartial = buildPartial();
                            if (videoAssetBuildPartial.isInitialized()) {
                                return videoAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public VideoAsset buildPartial() {
                            VideoAsset videoAsset = new VideoAsset(this);
                            videoAsset.adm_ = this.adm_;
                            videoAsset.curl_ = this.curl_;
                            a2 a2Var = this.extBuilder_;
                            if (a2Var == null) {
                                videoAsset.ext_ = this.ext_;
                            } else {
                                videoAsset.ext_ = (Struct) a2Var.a();
                            }
                            v1 v1Var = this.extProtoBuilder_;
                            if (v1Var != null) {
                                videoAsset.extProto_ = v1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                videoAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return videoAsset;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public VideoAsset getDefaultInstanceForType() {
                            return VideoAsset.getDefaultInstance();
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
                            this.adm_ = "";
                            this.curl_ = "";
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
                            if (message instanceof VideoAsset) {
                                return mergeFrom((VideoAsset) message);
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
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(VideoAsset videoAsset) {
                            if (videoAsset == VideoAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!videoAsset.getAdm().isEmpty()) {
                                this.adm_ = videoAsset.adm_;
                                onChanged();
                            }
                            if (!videoAsset.getCurl().isEmpty()) {
                                this.curl_ = videoAsset.curl_;
                                onChanged();
                            }
                            if (videoAsset.hasExt()) {
                                mergeExt(videoAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!videoAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = videoAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(videoAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!videoAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(videoAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = videoAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((h0) videoAsset).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.access$8600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(VideoAsset videoAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoAsset);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(byteBuffer, wVar);
                    }

                    private VideoAsset(h0.b bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                        return (VideoAsset) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                    }

                    public static VideoAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public VideoAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static VideoAsset parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(byteString, wVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private VideoAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.adm_ = "";
                        this.curl_ = "";
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static VideoAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.h0
                    public Builder newBuilderForType(h0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static VideoAsset parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(bArr, wVar);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) h0.parseWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream, w wVar) throws IOException {
                        return (VideoAsset) h0.parseWithIOException(PARSER, inputStream, wVar);
                    }

                    private VideoAsset(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                            this.adm_ = lVar.J();
                                        } else if (iK == 18) {
                                            this.curl_ = lVar.J();
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

                    public static VideoAsset parseFrom(l lVar) throws IOException {
                        return (VideoAsset) h0.parseWithIOException(PARSER, lVar);
                    }

                    public static VideoAsset parseFrom(l lVar, w wVar) throws IOException {
                        return (VideoAsset) h0.parseWithIOException(PARSER, lVar, wVar);
                    }
                }

                public interface VideoAssetOrBuilder extends MessageOrBuilder {
                    String getAdm();

                    ByteString getAdmBytes();

                    String getCurl();

                    ByteString getCurlBytes();

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

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static Asset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18832o0;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Asset) h0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(byteBuffer);
                }

                public static p1 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Asset)) {
                        return super.equals(obj);
                    }
                    Asset asset = (Asset) obj;
                    if (getId() != asset.getId() || getReq() != asset.getReq() || hasTitle() != asset.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(asset.getTitle())) || hasImage() != asset.hasImage()) {
                        return false;
                    }
                    if ((hasImage() && !getImage().equals(asset.getImage())) || hasVideo() != asset.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(asset.getVideo())) || hasData() != asset.hasData()) {
                        return false;
                    }
                    if ((hasData() && !getData().equals(asset.getData())) || hasLink() != asset.hasLink()) {
                        return false;
                    }
                    if ((hasLink() && !getLink().equals(asset.getLink())) || hasLabel() != asset.hasLabel()) {
                        return false;
                    }
                    if ((!hasLabel() || getLabel().equals(asset.getLabel())) && hasExt() == asset.hasExt()) {
                        return (!hasExt() || getExt().equals(asset.getExt())) && getExtProtoList().equals(asset.getExtProtoList()) && this.unknownFields.equals(asset.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public DataAsset getData() {
                    DataAsset dataAsset = this.data_;
                    return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public DataAssetOrBuilder getDataOrBuilder() {
                    return getData();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public e2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public ImageAsset getImage() {
                    ImageAsset imageAsset = this.image_;
                    return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public ImageAssetOrBuilder getImageOrBuilder() {
                    return getImage();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LabelAsset getLabel() {
                    LabelAsset labelAsset = this.label_;
                    return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LabelAssetOrBuilder getLabelOrBuilder() {
                    return getLabel();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LinkAsset getLink() {
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LinkAssetOrBuilder getLinkOrBuilder() {
                    return getLink();
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public p1 getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean getReq() {
                    return this.req_;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int i11 = this.id_;
                    int iY = i11 != 0 ? n.Y(1, i11) : 0;
                    boolean z10 = this.req_;
                    if (z10) {
                        iY += n.e(2, z10);
                    }
                    if (this.title_ != null) {
                        iY += n.G(3, getTitle());
                    }
                    if (this.image_ != null) {
                        iY += n.G(4, getImage());
                    }
                    if (this.video_ != null) {
                        iY += n.G(5, getVideo());
                    }
                    if (this.data_ != null) {
                        iY += n.G(6, getData());
                    }
                    if (this.link_ != null) {
                        iY += n.G(7, getLink());
                    }
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        iY += n.G(8, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        iY += n.G(9, getExt());
                    }
                    if (this.label_ != null) {
                        iY += n.G(10, getLabel());
                    }
                    int serializedSize = iY + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public TitleAsset getTitle() {
                    TitleAsset titleAsset = this.title_;
                    return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public TitleAssetOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final r2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public VideoAsset getVideo() {
                    VideoAsset videoAsset = this.video_;
                    return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public VideoAssetOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasData() {
                    return this.data_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasImage() {
                    return this.image_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasLabel() {
                    return this.label_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasLink() {
                    return this.link_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasTitle() {
                    return this.title_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasVideo() {
                    return this.video_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId()) * 37) + 2) * 53) + j0.d(getReq());
                    if (hasTitle()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + getTitle().hashCode();
                    }
                    if (hasImage()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + getImage().hashCode();
                    }
                    if (hasVideo()) {
                        iHashCode = (((iHashCode * 37) + 5) * 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        iHashCode = (((iHashCode * 37) + 6) * 53) + getData().hashCode();
                    }
                    if (hasLink()) {
                        iHashCode = (((iHashCode * 37) + 7) * 53) + getLink().hashCode();
                    }
                    if (hasLabel()) {
                        iHashCode = (((iHashCode * 37) + 10) * 53) + getLabel().hashCode();
                    }
                    if (hasExt()) {
                        iHashCode = (((iHashCode * 37) + 9) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashCode = (((iHashCode * 37) + 8) * 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.h0
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18834p0.d(Asset.class, Builder.class);
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
                    return new Asset();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(n nVar) throws IOException {
                    int i10 = this.id_;
                    if (i10 != 0) {
                        nVar.W0(1, i10);
                    }
                    boolean z10 = this.req_;
                    if (z10) {
                        nVar.n0(2, z10);
                    }
                    if (this.title_ != null) {
                        nVar.J0(3, getTitle());
                    }
                    if (this.image_ != null) {
                        nVar.J0(4, getImage());
                    }
                    if (this.video_ != null) {
                        nVar.J0(5, getVideo());
                    }
                    if (this.data_ != null) {
                        nVar.J0(6, getData());
                    }
                    if (this.link_ != null) {
                        nVar.J0(7, getLink());
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        nVar.J0(8, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        nVar.J0(9, getExt());
                    }
                    if (this.label_ != null) {
                        nVar.J0(10, getLabel());
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static final class Builder extends h0.b implements AssetOrBuilder {
                    private int bitField0_;
                    private a2 dataBuilder_;
                    private DataAsset data_;
                    private a2 extBuilder_;
                    private v1 extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private a2 imageBuilder_;
                    private ImageAsset image_;
                    private a2 labelBuilder_;
                    private LabelAsset label_;
                    private a2 linkBuilder_;
                    private LinkAsset link_;
                    private boolean req_;
                    private a2 titleBuilder_;
                    private TitleAsset title_;
                    private a2 videoBuilder_;
                    private VideoAsset video_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    private a2 getDataFieldBuilder() {
                        if (this.dataBuilder_ == null) {
                            this.dataBuilder_ = new a2(getData(), getParentForChildren(), isClean());
                            this.data_ = null;
                        }
                        return this.dataBuilder_;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f18832o0;
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

                    private a2 getImageFieldBuilder() {
                        if (this.imageBuilder_ == null) {
                            this.imageBuilder_ = new a2(getImage(), getParentForChildren(), isClean());
                            this.image_ = null;
                        }
                        return this.imageBuilder_;
                    }

                    private a2 getLabelFieldBuilder() {
                        if (this.labelBuilder_ == null) {
                            this.labelBuilder_ = new a2(getLabel(), getParentForChildren(), isClean());
                            this.label_ = null;
                        }
                        return this.labelBuilder_;
                    }

                    private a2 getLinkFieldBuilder() {
                        if (this.linkBuilder_ == null) {
                            this.linkBuilder_ = new a2(getLink(), getParentForChildren(), isClean());
                            this.link_ = null;
                        }
                        return this.linkBuilder_;
                    }

                    private a2 getTitleFieldBuilder() {
                        if (this.titleBuilder_ == null) {
                            this.titleBuilder_ = new a2(getTitle(), getParentForChildren(), isClean());
                            this.title_ = null;
                        }
                        return this.titleBuilder_;
                    }

                    private a2 getVideoFieldBuilder() {
                        if (this.videoBuilder_ == null) {
                            this.videoBuilder_ = new a2(getVideo(), getParentForChildren(), isClean());
                            this.video_ = null;
                        }
                        return this.videoBuilder_;
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

                    public Builder clearData() {
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                            onChanged();
                            return this;
                        }
                        this.data_ = null;
                        this.dataBuilder_ = null;
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

                    public Builder clearId() {
                        this.id_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearImage() {
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                            onChanged();
                            return this;
                        }
                        this.image_ = null;
                        this.imageBuilder_ = null;
                        return this;
                    }

                    public Builder clearLabel() {
                        if (this.labelBuilder_ == null) {
                            this.label_ = null;
                            onChanged();
                            return this;
                        }
                        this.label_ = null;
                        this.labelBuilder_ = null;
                        return this;
                    }

                    public Builder clearLink() {
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                            onChanged();
                            return this;
                        }
                        this.link_ = null;
                        this.linkBuilder_ = null;
                        return this;
                    }

                    public Builder clearReq() {
                        this.req_ = false;
                        onChanged();
                        return this;
                    }

                    public Builder clearTitle() {
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                            onChanged();
                            return this;
                        }
                        this.title_ = null;
                        this.titleBuilder_ = null;
                        return this;
                    }

                    public Builder clearVideo() {
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                            onChanged();
                            return this;
                        }
                        this.video_ = null;
                        this.videoBuilder_ = null;
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public DataAsset getData() {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var != null) {
                            return (DataAsset) a2Var.e();
                        }
                        DataAsset dataAsset = this.data_;
                        return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                    }

                    public DataAsset.Builder getDataBuilder() {
                        onChanged();
                        return (DataAsset.Builder) getDataFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public DataAssetOrBuilder getDataOrBuilder() {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var != null) {
                            return (DataAssetOrBuilder) a2Var.f();
                        }
                        DataAsset dataAsset = this.data_;
                        return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f18832o0;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public e2 getExtOrBuilder() {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var != null) {
                            return (e2) a2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public int getExtProtoCount() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.size() : v1Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public List<Any> getExtProtoList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public ImageAsset getImage() {
                        a2 a2Var = this.imageBuilder_;
                        if (a2Var != null) {
                            return (ImageAsset) a2Var.e();
                        }
                        ImageAsset imageAsset = this.image_;
                        return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                    }

                    public ImageAsset.Builder getImageBuilder() {
                        onChanged();
                        return (ImageAsset.Builder) getImageFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public ImageAssetOrBuilder getImageOrBuilder() {
                        a2 a2Var = this.imageBuilder_;
                        if (a2Var != null) {
                            return (ImageAssetOrBuilder) a2Var.f();
                        }
                        ImageAsset imageAsset = this.image_;
                        return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LabelAsset getLabel() {
                        a2 a2Var = this.labelBuilder_;
                        if (a2Var != null) {
                            return (LabelAsset) a2Var.e();
                        }
                        LabelAsset labelAsset = this.label_;
                        return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                    }

                    public LabelAsset.Builder getLabelBuilder() {
                        onChanged();
                        return (LabelAsset.Builder) getLabelFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LabelAssetOrBuilder getLabelOrBuilder() {
                        a2 a2Var = this.labelBuilder_;
                        if (a2Var != null) {
                            return (LabelAssetOrBuilder) a2Var.f();
                        }
                        LabelAsset labelAsset = this.label_;
                        return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LinkAsset getLink() {
                        a2 a2Var = this.linkBuilder_;
                        if (a2Var != null) {
                            return (LinkAsset) a2Var.e();
                        }
                        LinkAsset linkAsset = this.link_;
                        return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                    }

                    public LinkAsset.Builder getLinkBuilder() {
                        onChanged();
                        return (LinkAsset.Builder) getLinkFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LinkAssetOrBuilder getLinkOrBuilder() {
                        a2 a2Var = this.linkBuilder_;
                        if (a2Var != null) {
                            return (LinkAssetOrBuilder) a2Var.f();
                        }
                        LinkAsset linkAsset = this.link_;
                        return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean getReq() {
                        return this.req_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public TitleAsset getTitle() {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var != null) {
                            return (TitleAsset) a2Var.e();
                        }
                        TitleAsset titleAsset = this.title_;
                        return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                    }

                    public TitleAsset.Builder getTitleBuilder() {
                        onChanged();
                        return (TitleAsset.Builder) getTitleFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public TitleAssetOrBuilder getTitleOrBuilder() {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var != null) {
                            return (TitleAssetOrBuilder) a2Var.f();
                        }
                        TitleAsset titleAsset = this.title_;
                        return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public VideoAsset getVideo() {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var != null) {
                            return (VideoAsset) a2Var.e();
                        }
                        VideoAsset videoAsset = this.video_;
                        return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                    }

                    public VideoAsset.Builder getVideoBuilder() {
                        onChanged();
                        return (VideoAsset.Builder) getVideoFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public VideoAssetOrBuilder getVideoOrBuilder() {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var != null) {
                            return (VideoAssetOrBuilder) a2Var.f();
                        }
                        VideoAsset videoAsset = this.video_;
                        return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasImage() {
                        return (this.imageBuilder_ == null && this.image_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasLabel() {
                        return (this.labelBuilder_ == null && this.label_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasLink() {
                        return (this.linkBuilder_ == null && this.link_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasTitle() {
                        return (this.titleBuilder_ == null && this.title_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.h0.b
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.f18834p0.d(Asset.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeData(DataAsset dataAsset) {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var != null) {
                            a2Var.g(dataAsset);
                            return this;
                        }
                        DataAsset dataAsset2 = this.data_;
                        if (dataAsset2 != null) {
                            this.data_ = DataAsset.newBuilder(dataAsset2).mergeFrom(dataAsset).buildPartial();
                        } else {
                            this.data_ = dataAsset;
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

                    public Builder mergeImage(ImageAsset imageAsset) {
                        a2 a2Var = this.imageBuilder_;
                        if (a2Var != null) {
                            a2Var.g(imageAsset);
                            return this;
                        }
                        ImageAsset imageAsset2 = this.image_;
                        if (imageAsset2 != null) {
                            this.image_ = ImageAsset.newBuilder(imageAsset2).mergeFrom(imageAsset).buildPartial();
                        } else {
                            this.image_ = imageAsset;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeLabel(LabelAsset labelAsset) {
                        a2 a2Var = this.labelBuilder_;
                        if (a2Var != null) {
                            a2Var.g(labelAsset);
                            return this;
                        }
                        LabelAsset labelAsset2 = this.label_;
                        if (labelAsset2 != null) {
                            this.label_ = LabelAsset.newBuilder(labelAsset2).mergeFrom(labelAsset).buildPartial();
                        } else {
                            this.label_ = labelAsset;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeLink(LinkAsset linkAsset) {
                        a2 a2Var = this.linkBuilder_;
                        if (a2Var != null) {
                            a2Var.g(linkAsset);
                            return this;
                        }
                        LinkAsset linkAsset2 = this.link_;
                        if (linkAsset2 != null) {
                            this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                        } else {
                            this.link_ = linkAsset;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeTitle(TitleAsset titleAsset) {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var != null) {
                            a2Var.g(titleAsset);
                            return this;
                        }
                        TitleAsset titleAsset2 = this.title_;
                        if (titleAsset2 != null) {
                            this.title_ = TitleAsset.newBuilder(titleAsset2).mergeFrom(titleAsset).buildPartial();
                        } else {
                            this.title_ = titleAsset;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeVideo(VideoAsset videoAsset) {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var != null) {
                            a2Var.g(videoAsset);
                            return this;
                        }
                        VideoAsset videoAsset2 = this.video_;
                        if (videoAsset2 != null) {
                            this.video_ = VideoAsset.newBuilder(videoAsset2).mergeFrom(videoAsset).buildPartial();
                        } else {
                            this.video_ = videoAsset;
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

                    public Builder setData(DataAsset dataAsset) {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var != null) {
                            a2Var.i(dataAsset);
                            return this;
                        }
                        dataAsset.getClass();
                        this.data_ = dataAsset;
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

                    public Builder setId(int i10) {
                        this.id_ = i10;
                        onChanged();
                        return this;
                    }

                    public Builder setImage(ImageAsset imageAsset) {
                        a2 a2Var = this.imageBuilder_;
                        if (a2Var != null) {
                            a2Var.i(imageAsset);
                            return this;
                        }
                        imageAsset.getClass();
                        this.image_ = imageAsset;
                        onChanged();
                        return this;
                    }

                    public Builder setLabel(LabelAsset labelAsset) {
                        a2 a2Var = this.labelBuilder_;
                        if (a2Var != null) {
                            a2Var.i(labelAsset);
                            return this;
                        }
                        labelAsset.getClass();
                        this.label_ = labelAsset;
                        onChanged();
                        return this;
                    }

                    public Builder setLink(LinkAsset linkAsset) {
                        a2 a2Var = this.linkBuilder_;
                        if (a2Var != null) {
                            a2Var.i(linkAsset);
                            return this;
                        }
                        linkAsset.getClass();
                        this.link_ = linkAsset;
                        onChanged();
                        return this;
                    }

                    public Builder setReq(boolean z10) {
                        this.req_ = z10;
                        onChanged();
                        return this;
                    }

                    public Builder setTitle(TitleAsset titleAsset) {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var != null) {
                            a2Var.i(titleAsset);
                            return this;
                        }
                        titleAsset.getClass();
                        this.title_ = titleAsset;
                        onChanged();
                        return this;
                    }

                    public Builder setVideo(VideoAsset videoAsset) {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var != null) {
                            a2Var.i(videoAsset);
                            return this;
                        }
                        videoAsset.getClass();
                        this.video_ = videoAsset;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Asset build() {
                        Asset assetBuildPartial = buildPartial();
                        if (assetBuildPartial.isInitialized()) {
                            return assetBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Asset buildPartial() {
                        Asset asset = new Asset(this);
                        asset.id_ = this.id_;
                        asset.req_ = this.req_;
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var == null) {
                            asset.title_ = this.title_;
                        } else {
                            asset.title_ = (TitleAsset) a2Var.a();
                        }
                        a2 a2Var2 = this.imageBuilder_;
                        if (a2Var2 == null) {
                            asset.image_ = this.image_;
                        } else {
                            asset.image_ = (ImageAsset) a2Var2.a();
                        }
                        a2 a2Var3 = this.videoBuilder_;
                        if (a2Var3 == null) {
                            asset.video_ = this.video_;
                        } else {
                            asset.video_ = (VideoAsset) a2Var3.a();
                        }
                        a2 a2Var4 = this.dataBuilder_;
                        if (a2Var4 == null) {
                            asset.data_ = this.data_;
                        } else {
                            asset.data_ = (DataAsset) a2Var4.a();
                        }
                        a2 a2Var5 = this.linkBuilder_;
                        if (a2Var5 == null) {
                            asset.link_ = this.link_;
                        } else {
                            asset.link_ = (LinkAsset) a2Var5.a();
                        }
                        a2 a2Var6 = this.labelBuilder_;
                        if (a2Var6 == null) {
                            asset.label_ = this.label_;
                        } else {
                            asset.label_ = (LabelAsset) a2Var6.a();
                        }
                        a2 a2Var7 = this.extBuilder_;
                        if (a2Var7 == null) {
                            asset.ext_ = this.ext_;
                        } else {
                            asset.ext_ = (Struct) a2Var7.a();
                        }
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            asset.extProto_ = v1Var.f();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            asset.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return asset;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Asset getDefaultInstanceForType() {
                        return Asset.getDefaultInstance();
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
                        this.id_ = 0;
                        this.req_ = false;
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                        } else {
                            this.image_ = null;
                            this.imageBuilder_ = null;
                        }
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                        } else {
                            this.link_ = null;
                            this.linkBuilder_ = null;
                        }
                        if (this.labelBuilder_ == null) {
                            this.label_ = null;
                        } else {
                            this.label_ = null;
                            this.labelBuilder_ = null;
                        }
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

                    private Builder(h0.c cVar) {
                        super(cVar);
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Builder setData(DataAsset.Builder builder) {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var == null) {
                            this.data_ = builder.build();
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

                    public Builder setImage(ImageAsset.Builder builder) {
                        a2 a2Var = this.imageBuilder_;
                        if (a2Var == null) {
                            this.image_ = builder.build();
                            onChanged();
                            return this;
                        }
                        a2Var.i(builder.build());
                        return this;
                    }

                    public Builder setLabel(LabelAsset.Builder builder) {
                        a2 a2Var = this.labelBuilder_;
                        if (a2Var == null) {
                            this.label_ = builder.build();
                            onChanged();
                            return this;
                        }
                        a2Var.i(builder.build());
                        return this;
                    }

                    public Builder setLink(LinkAsset.Builder builder) {
                        a2 a2Var = this.linkBuilder_;
                        if (a2Var == null) {
                            this.link_ = builder.build();
                            onChanged();
                            return this;
                        }
                        a2Var.i(builder.build());
                        return this;
                    }

                    public Builder setTitle(TitleAsset.Builder builder) {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var == null) {
                            this.title_ = builder.build();
                            onChanged();
                            return this;
                        }
                        a2Var.i(builder.build());
                        return this;
                    }

                    public Builder setVideo(VideoAsset.Builder builder) {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var == null) {
                            this.video_ = builder.build();
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
                        if (message instanceof Asset) {
                            return mergeFrom((Asset) message);
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

                    public Builder mergeFrom(Asset asset) {
                        if (asset == Asset.getDefaultInstance()) {
                            return this;
                        }
                        if (asset.getId() != 0) {
                            setId(asset.getId());
                        }
                        if (asset.getReq()) {
                            setReq(asset.getReq());
                        }
                        if (asset.hasTitle()) {
                            mergeTitle(asset.getTitle());
                        }
                        if (asset.hasImage()) {
                            mergeImage(asset.getImage());
                        }
                        if (asset.hasVideo()) {
                            mergeVideo(asset.getVideo());
                        }
                        if (asset.hasData()) {
                            mergeData(asset.getData());
                        }
                        if (asset.hasLink()) {
                            mergeLink(asset.getLink());
                        }
                        if (asset.hasLabel()) {
                            mergeLabel(asset.getLabel());
                        }
                        if (asset.hasExt()) {
                            mergeExt(asset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!asset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = asset.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(asset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!asset.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(asset.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = asset.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((h0) asset).unknownFields);
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
                    public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.access$13200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Ad$Display$Native$Asset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Ad$Display$Native$Asset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$Builder");
                    }
                }

                public static Builder newBuilder(Asset asset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(asset);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(byteBuffer, wVar);
                }

                private Asset(h0.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Asset parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Asset) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                }

                public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Asset getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Asset parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(byteString, wVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Asset() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.h0
                public Builder newBuilderForType(h0.c cVar) {
                    return new Builder(cVar);
                }

                public static Asset parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(bArr, wVar);
                }

                public static Asset parseFrom(InputStream inputStream) throws IOException {
                    return (Asset) h0.parseWithIOException(PARSER, inputStream);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private Asset(l lVar, w wVar) throws InvalidProtocolBufferException {
                    this();
                    wVar.getClass();
                    r2.b bVarG = r2.g();
                    boolean z10 = false;
                    byte b10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = lVar.K();
                                switch (iK) {
                                    case 0:
                                        z10 = true;
                                        break;
                                    case 8:
                                        this.id_ = lVar.L();
                                        break;
                                    case 16:
                                        this.req_ = lVar.q();
                                        break;
                                    case 26:
                                        TitleAsset titleAsset = this.title_;
                                        TitleAsset.Builder builder = titleAsset != null ? titleAsset.toBuilder() : null;
                                        TitleAsset titleAsset2 = (TitleAsset) lVar.A(TitleAsset.parser(), wVar);
                                        this.title_ = titleAsset2;
                                        if (builder != null) {
                                            builder.mergeFrom(titleAsset2);
                                            this.title_ = builder.buildPartial();
                                        }
                                        break;
                                    case 34:
                                        ImageAsset imageAsset = this.image_;
                                        ImageAsset.Builder builder2 = imageAsset != null ? imageAsset.toBuilder() : null;
                                        ImageAsset imageAsset2 = (ImageAsset) lVar.A(ImageAsset.parser(), wVar);
                                        this.image_ = imageAsset2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(imageAsset2);
                                            this.image_ = builder2.buildPartial();
                                        }
                                        break;
                                    case 42:
                                        VideoAsset videoAsset = this.video_;
                                        VideoAsset.Builder builder3 = videoAsset != null ? videoAsset.toBuilder() : null;
                                        VideoAsset videoAsset2 = (VideoAsset) lVar.A(VideoAsset.parser(), wVar);
                                        this.video_ = videoAsset2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(videoAsset2);
                                            this.video_ = builder3.buildPartial();
                                        }
                                        break;
                                    case 50:
                                        DataAsset dataAsset = this.data_;
                                        DataAsset.Builder builder4 = dataAsset != null ? dataAsset.toBuilder() : null;
                                        DataAsset dataAsset2 = (DataAsset) lVar.A(DataAsset.parser(), wVar);
                                        this.data_ = dataAsset2;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(dataAsset2);
                                            this.data_ = builder4.buildPartial();
                                        }
                                        break;
                                    case 58:
                                        LinkAsset linkAsset = this.link_;
                                        LinkAsset.Builder builder5 = linkAsset != null ? linkAsset.toBuilder() : null;
                                        LinkAsset linkAsset2 = (LinkAsset) lVar.A(LinkAsset.parser(), wVar);
                                        this.link_ = linkAsset2;
                                        if (builder5 != null) {
                                            builder5.mergeFrom(linkAsset2);
                                            this.link_ = builder5.buildPartial();
                                        }
                                        break;
                                    case 66:
                                        if (b10 == false) {
                                            this.extProto_ = new ArrayList();
                                            b10 = true;
                                        }
                                        this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                        break;
                                    case 74:
                                        Struct struct = this.ext_;
                                        Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                        this.ext_ = struct2;
                                        if (builder6 != null) {
                                            builder6.mergeFrom(struct2);
                                            this.ext_ = builder6.buildPartial();
                                        }
                                        break;
                                    case 82:
                                        LabelAsset labelAsset = this.label_;
                                        LabelAsset.Builder builder7 = labelAsset != null ? labelAsset.toBuilder() : null;
                                        LabelAsset labelAsset2 = (LabelAsset) lVar.A(LabelAsset.parser(), wVar);
                                        this.label_ = labelAsset2;
                                        if (builder7 != null) {
                                            builder7.mergeFrom(labelAsset2);
                                            this.label_ = builder7.buildPartial();
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
                            if (b10 != false) {
                                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = bVarG.build();
                            makeExtensionsImmutable();
                            throw th2;
                        }
                    }
                    if (b10 != false) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                }

                public static Asset parseFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Asset) h0.parseWithIOException(PARSER, inputStream, wVar);
                }

                public static Asset parseFrom(l lVar) throws IOException {
                    return (Asset) h0.parseWithIOException(PARSER, lVar);
                }

                public static Asset parseFrom(l lVar, w wVar) throws IOException {
                    return (Asset) h0.parseWithIOException(PARSER, lVar, wVar);
                }
            }

            public interface AssetOrBuilder extends MessageOrBuilder {
                Asset.DataAsset getData();

                Asset.DataAssetOrBuilder getDataOrBuilder();

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

                int getId();

                Asset.ImageAsset getImage();

                Asset.ImageAssetOrBuilder getImageOrBuilder();

                Asset.LabelAsset getLabel();

                Asset.LabelAssetOrBuilder getLabelOrBuilder();

                LinkAsset getLink();

                LinkAssetOrBuilder getLinkOrBuilder();

                boolean getReq();

                Asset.TitleAsset getTitle();

                Asset.TitleAssetOrBuilder getTitleOrBuilder();

                Asset.VideoAsset getVideo();

                Asset.VideoAssetOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImage();

                boolean hasLabel();

                boolean hasLink();

                boolean hasTitle();

                boolean hasVideo();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static final class LinkAsset extends h0 implements LinkAssetOrBuilder {
                public static final int EXT_FIELD_NUMBER = 5;
                public static final int EXT_PROTO_FIELD_NUMBER = 4;
                public static final int TRKR_FIELD_NUMBER = 3;
                public static final int URLFB_FIELD_NUMBER = 2;
                public static final int URL_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private List<Any> extProto_;
                private Struct ext_;
                private byte memoizedIsInitialized;
                private p0 trkr_;
                private volatile Object url_;
                private volatile Object urlfb_;
                private static final LinkAsset DEFAULT_INSTANCE = new LinkAsset();
                private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.1
                    @Override // com.explorestack.protobuf.p1
                    public LinkAsset parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new LinkAsset(lVar, wVar);
                    }
                };

                public static final class Builder extends h0.b implements LinkAssetOrBuilder {
                    private int bitField0_;
                    private a2 extBuilder_;
                    private v1 extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private p0 trkr_;
                    private Object url_;
                    private Object urlfb_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 2) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 2;
                        }
                    }

                    private void ensureTrkrIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.trkr_ = new o0(this.trkr_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f18828m0;
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

                    public Builder addAllTrkr(Iterable<String> iterable) {
                        ensureTrkrIsMutable();
                        a.AbstractC0320a.addAll((Iterable) iterable, (List) this.trkr_);
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

                    public Builder addTrkr(String str) {
                        str.getClass();
                        ensureTrkrIsMutable();
                        this.trkr_.add(str);
                        onChanged();
                        return this;
                    }

                    public Builder addTrkrBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        ensureTrkrIsMutable();
                        this.trkr_.c(byteString);
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

                    public Builder clearTrkr() {
                        this.trkr_ = o0.f19269e;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearUrl() {
                        this.url_ = LinkAsset.getDefaultInstance().getUrl();
                        onChanged();
                        return this;
                    }

                    public Builder clearUrlfb() {
                        this.urlfb_ = LinkAsset.getDefaultInstance().getUrlfb();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f18828m0;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public e2 getExtOrBuilder() {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var != null) {
                            return (e2) a2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public int getExtProtoCount() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.size() : v1Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getTrkr(int i10) {
                        return (String) this.trkr_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getTrkrBytes(int i10) {
                        return this.trkr_.getByteString(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public int getTrkrCount() {
                        return this.trkr_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.url_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getUrlBytes() {
                        Object obj = this.url_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.url_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getUrlfb() {
                        Object obj = this.urlfb_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.urlfb_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getUrlfbBytes() {
                        Object obj = this.urlfb_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.urlfb_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.h0.b
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.f18830n0.d(LinkAsset.class, Builder.class);
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

                    public Builder setTrkr(int i10, String str) {
                        str.getClass();
                        ensureTrkrIsMutable();
                        this.trkr_.set(i10, str);
                        onChanged();
                        return this;
                    }

                    public Builder setUrl(String str) {
                        str.getClass();
                        this.url_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.url_ = byteString;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlfb(String str) {
                        str.getClass();
                        this.urlfb_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlfbBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.urlfb_ = byteString;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public t1 getTrkrList() {
                        return this.trkr_.getUnmodifiableView();
                    }

                    private Builder() {
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = o0.f19269e;
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public LinkAsset build() {
                        LinkAsset linkAssetBuildPartial = buildPartial();
                        if (linkAssetBuildPartial.isInitialized()) {
                            return linkAssetBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) linkAssetBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public LinkAsset buildPartial() {
                        LinkAsset linkAsset = new LinkAsset(this);
                        linkAsset.url_ = this.url_;
                        linkAsset.urlfb_ = this.urlfb_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.trkr_ = this.trkr_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        linkAsset.trkr_ = this.trkr_;
                        a2 a2Var = this.extBuilder_;
                        if (a2Var == null) {
                            linkAsset.ext_ = this.ext_;
                        } else {
                            linkAsset.ext_ = (Struct) a2Var.a();
                        }
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            linkAsset.extProto_ = v1Var.f();
                        } else {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            linkAsset.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return linkAsset;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public LinkAsset getDefaultInstanceForType() {
                        return LinkAsset.getDefaultInstance();
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
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = o0.f19269e;
                        int i10 = this.bitField0_;
                        this.bitField0_ = i10 & (-2);
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var == null) {
                            this.extProto_ = Collections.EMPTY_LIST;
                            this.bitField0_ = i10 & (-4);
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
                        if (message instanceof LinkAsset) {
                            return mergeFrom((LinkAsset) message);
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
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = o0.f19269e;
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Builder mergeFrom(LinkAsset linkAsset) {
                        if (linkAsset == LinkAsset.getDefaultInstance()) {
                            return this;
                        }
                        if (!linkAsset.getUrl().isEmpty()) {
                            this.url_ = linkAsset.url_;
                            onChanged();
                        }
                        if (!linkAsset.getUrlfb().isEmpty()) {
                            this.urlfb_ = linkAsset.urlfb_;
                            onChanged();
                        }
                        if (!linkAsset.trkr_.isEmpty()) {
                            if (this.trkr_.isEmpty()) {
                                this.trkr_ = linkAsset.trkr_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureTrkrIsMutable();
                                this.trkr_.addAll(linkAsset.trkr_);
                            }
                            onChanged();
                        }
                        if (linkAsset.hasExt()) {
                            mergeExt(linkAsset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!linkAsset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = linkAsset.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(linkAsset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!linkAsset.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(linkAsset.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = linkAsset.extProto_;
                                this.bitField0_ &= -3;
                                this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((h0) linkAsset).unknownFields);
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
                    public com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.access$4300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset$Builder");
                    }
                }

                public static LinkAsset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18828m0;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) h0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(byteBuffer);
                }

                public static p1 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof LinkAsset)) {
                        return super.equals(obj);
                    }
                    LinkAsset linkAsset = (LinkAsset) obj;
                    if (getUrl().equals(linkAsset.getUrl()) && getUrlfb().equals(linkAsset.getUrlfb()) && getTrkrList().equals(linkAsset.getTrkrList()) && hasExt() == linkAsset.hasExt()) {
                        return (!hasExt() || getExt().equals(linkAsset.getExt())) && getExtProtoList().equals(linkAsset.getExtProtoList()) && this.unknownFields.equals(linkAsset.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public e2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
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
                    int iComputeStringSize = !getUrlBytes().isEmpty() ? h0.computeStringSize(1, this.url_) : 0;
                    if (!getUrlfbBytes().isEmpty()) {
                        iComputeStringSize += h0.computeStringSize(2, this.urlfb_);
                    }
                    int iComputeStringSizeNoTag = 0;
                    for (int i11 = 0; i11 < this.trkr_.size(); i11++) {
                        iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.trkr_.getRaw(i11));
                    }
                    int size = iComputeStringSize + iComputeStringSizeNoTag + getTrkrList().size();
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        size += n.G(4, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        size += n.G(5, getExt());
                    }
                    int serializedSize = size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getTrkr(int i10) {
                    return (String) this.trkr_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getTrkrBytes(int i10) {
                    return this.trkr_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public int getTrkrCount() {
                    return this.trkr_.size();
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final r2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.url_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getUrlfb() {
                    Object obj = this.urlfb_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urlfb_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getUrlfbBytes() {
                    Object obj = this.urlfb_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.urlfb_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getUrlfb().hashCode();
                    if (getTrkrCount() > 0) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + getTrkrList().hashCode();
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
                    return b.f18830n0.d(LinkAsset.class, Builder.class);
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
                    return new LinkAsset();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(n nVar) throws IOException {
                    if (!getUrlBytes().isEmpty()) {
                        h0.writeString(nVar, 1, this.url_);
                    }
                    if (!getUrlfbBytes().isEmpty()) {
                        h0.writeString(nVar, 2, this.urlfb_);
                    }
                    for (int i10 = 0; i10 < this.trkr_.size(); i10++) {
                        h0.writeString(nVar, 3, this.trkr_.getRaw(i10));
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        nVar.J0(4, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        nVar.J0(5, getExt());
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static Builder newBuilder(LinkAsset linkAsset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(linkAsset);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(byteBuffer, wVar);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public t1 getTrkrList() {
                    return this.trkr_;
                }

                private LinkAsset(h0.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                    return (LinkAsset) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                }

                public static LinkAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public LinkAsset getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static LinkAsset parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(byteString, wVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private LinkAsset() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.url_ = "";
                    this.urlfb_ = "";
                    this.trkr_ = o0.f19269e;
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static LinkAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.h0
                public Builder newBuilderForType(h0.c cVar) {
                    return new Builder(cVar);
                }

                public static LinkAsset parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(bArr, wVar);
                }

                public static LinkAsset parseFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) h0.parseWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(InputStream inputStream, w wVar) throws IOException {
                    return (LinkAsset) h0.parseWithIOException(PARSER, inputStream, wVar);
                }

                private LinkAsset(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                            this.url_ = lVar.J();
                                        } else if (iK == 18) {
                                            this.urlfb_ = lVar.J();
                                        } else if (iK == 26) {
                                            String strJ = lVar.J();
                                            if ((i10 & 1) == 0) {
                                                this.trkr_ = new o0();
                                                i10 |= 1;
                                            }
                                            this.trkr_.add(strJ);
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
                                this.trkr_ = this.trkr_.getUnmodifiableView();
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
                        this.trkr_ = this.trkr_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                }

                public static LinkAsset parseFrom(l lVar) throws IOException {
                    return (LinkAsset) h0.parseWithIOException(PARSER, lVar);
                }

                public static LinkAsset parseFrom(l lVar, w wVar) throws IOException {
                    return (LinkAsset) h0.parseWithIOException(PARSER, lVar, wVar);
                }
            }

            public interface LinkAssetOrBuilder extends MessageOrBuilder {
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

                String getTrkr(int i10);

                ByteString getTrkrBytes(int i10);

                int getTrkrCount();

                List<String> getTrkrList();

                String getUrl();

                ByteString getUrlBytes();

                String getUrlfb();

                ByteString getUrlfbBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18824k0;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Native) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Native)) {
                    return super.equals(obj);
                }
                Native r52 = (Native) obj;
                if (hasLink() != r52.hasLink()) {
                    return false;
                }
                if ((!hasLink() || getLink().equals(r52.getLink())) && getAssetList().equals(r52.getAssetList()) && hasExt() == r52.hasExt()) {
                    return (!hasExt() || getExt().equals(r52.getExt())) && getExtProtoList().equals(r52.getExtProtoList()) && this.unknownFields.equals(r52.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Asset getAsset(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public int getAssetCount() {
                return this.asset_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<Asset> getAssetList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public AssetOrBuilder getAssetOrBuilder(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public LinkAsset getLink() {
                LinkAsset linkAsset = this.link_;
                return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public LinkAssetOrBuilder getLinkOrBuilder() {
                return getLink();
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
                int iG = this.link_ != null ? n.G(1, getLink()) : 0;
                for (int i11 = 0; i11 < this.asset_.size(); i11++) {
                    iG += n.G(2, this.asset_.get(i11));
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    iG += n.G(3, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    iG += n.G(4, getExt());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public boolean hasLink() {
                return this.link_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasLink()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getLink().hashCode();
                }
                if (getAssetCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getAssetList().hashCode();
                }
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
                return b.f18826l0.d(Native.class, Builder.class);
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
                return new Native();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (this.link_ != null) {
                    nVar.J0(1, getLink());
                }
                for (int i10 = 0; i10 < this.asset_.size(); i10++) {
                    nVar.J0(2, this.asset_.get(i10));
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    nVar.J0(3, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    nVar.J0(4, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements NativeOrBuilder {
                private v1 assetBuilder_;
                private List<Asset> asset_;
                private int bitField0_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private a2 linkBuilder_;
                private LinkAsset link_;

                private void ensureAssetIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.asset_ = new ArrayList(this.asset_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private v1 getAssetFieldBuilder() {
                    if (this.assetBuilder_ == null) {
                        this.assetBuilder_ = new v1(this.asset_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.asset_ = null;
                    }
                    return this.assetBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18824k0;
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

                private a2 getLinkFieldBuilder() {
                    if (this.linkBuilder_ == null) {
                        this.linkBuilder_ = new a2(getLink(), getParentForChildren(), isClean());
                        this.link_ = null;
                    }
                    return this.linkBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllAsset(Iterable<? extends Asset> iterable) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureAssetIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.asset_);
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

                public Builder addAsset(Asset asset) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var != null) {
                        v1Var.e(asset);
                        return this;
                    }
                    asset.getClass();
                    ensureAssetIsMutable();
                    this.asset_.add(asset);
                    onChanged();
                    return this;
                }

                public Asset.Builder addAssetBuilder() {
                    return (Asset.Builder) getAssetFieldBuilder().c(Asset.getDefaultInstance());
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

                public Builder clearAsset() {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.asset_ = Collections.EMPTY_LIST;
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

                public Builder clearLink() {
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                        onChanged();
                        return this;
                    }
                    this.link_ = null;
                    this.linkBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public Asset getAsset(int i10) {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var == null ? this.asset_.get(i10) : (Asset) v1Var.n(i10);
                }

                public Asset.Builder getAssetBuilder(int i10) {
                    return (Asset.Builder) getAssetFieldBuilder().k(i10);
                }

                public List<Asset.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public int getAssetCount() {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var == null ? this.asset_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<Asset> getAssetList() {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.asset_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public AssetOrBuilder getAssetOrBuilder(int i10) {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var == null ? this.asset_.get(i10) : (AssetOrBuilder) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.asset_);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f18824k0;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public LinkAsset getLink() {
                    a2 a2Var = this.linkBuilder_;
                    if (a2Var != null) {
                        return (LinkAsset) a2Var.e();
                    }
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                public LinkAsset.Builder getLinkBuilder() {
                    onChanged();
                    return (LinkAsset.Builder) getLinkFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public LinkAssetOrBuilder getLinkOrBuilder() {
                    a2 a2Var = this.linkBuilder_;
                    if (a2Var != null) {
                        return (LinkAssetOrBuilder) a2Var.f();
                    }
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public boolean hasLink() {
                    return (this.linkBuilder_ == null && this.link_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18826l0.d(Native.class, Builder.class);
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

                public Builder mergeLink(LinkAsset linkAsset) {
                    a2 a2Var = this.linkBuilder_;
                    if (a2Var != null) {
                        a2Var.g(linkAsset);
                        return this;
                    }
                    LinkAsset linkAsset2 = this.link_;
                    if (linkAsset2 != null) {
                        this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                    } else {
                        this.link_ = linkAsset;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeAsset(int i10) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureAssetIsMutable();
                    this.asset_.remove(i10);
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

                public Builder setAsset(int i10, Asset asset) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, asset);
                        return this;
                    }
                    asset.getClass();
                    ensureAssetIsMutable();
                    this.asset_.set(i10, asset);
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

                public Builder setLink(LinkAsset linkAsset) {
                    a2 a2Var = this.linkBuilder_;
                    if (a2Var != null) {
                        a2Var.i(linkAsset);
                        return this;
                    }
                    linkAsset.getClass();
                    this.link_ = linkAsset;
                    onChanged();
                    return this;
                }

                private Builder() {
                    List list = Collections.EMPTY_LIST;
                    this.asset_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Native build() {
                    Native nativeBuildPartial = buildPartial();
                    if (nativeBuildPartial.isInitialized()) {
                        return nativeBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Native buildPartial() {
                    Native r02 = new Native(this);
                    a2 a2Var = this.linkBuilder_;
                    if (a2Var == null) {
                        r02.link_ = this.link_;
                    } else {
                        r02.link_ = (LinkAsset) a2Var.a();
                    }
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var != null) {
                        r02.asset_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.asset_ = DesugarCollections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        r02.asset_ = this.asset_;
                    }
                    a2 a2Var2 = this.extBuilder_;
                    if (a2Var2 == null) {
                        r02.ext_ = this.ext_;
                    } else {
                        r02.ext_ = (Struct) a2Var2.a();
                    }
                    v1 v1Var2 = this.extProtoBuilder_;
                    if (v1Var2 != null) {
                        r02.extProto_ = v1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        r02.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return r02;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Native getDefaultInstanceForType() {
                    return Native.getDefaultInstance();
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

                public Asset.Builder addAssetBuilder(int i10) {
                    return (Asset.Builder) getAssetFieldBuilder().b(i10, Asset.getDefaultInstance());
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
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                    } else {
                        this.link_ = null;
                        this.linkBuilder_ = null;
                    }
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var == null) {
                        this.asset_ = Collections.EMPTY_LIST;
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

                public Builder setLink(LinkAsset.Builder builder) {
                    a2 a2Var = this.linkBuilder_;
                    if (a2Var == null) {
                        this.link_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    List list = Collections.EMPTY_LIST;
                    this.asset_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addAsset(int i10, Asset asset) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var == null) {
                        asset.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(i10, asset);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, asset);
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
                    if (message instanceof Native) {
                        return mergeFrom((Native) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAsset(int i10, Asset.Builder builder) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i10, builder.build());
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

                public Builder mergeFrom(Native r42) {
                    if (r42 == Native.getDefaultInstance()) {
                        return this;
                    }
                    if (r42.hasLink()) {
                        mergeLink(r42.getLink());
                    }
                    if (this.assetBuilder_ == null) {
                        if (!r42.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = r42.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(r42.asset_);
                            }
                            onChanged();
                        }
                    } else if (!r42.asset_.isEmpty()) {
                        if (!this.assetBuilder_.t()) {
                            this.assetBuilder_.a(r42.asset_);
                        } else {
                            this.assetBuilder_.h();
                            this.assetBuilder_ = null;
                            this.asset_ = r42.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = h0.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        }
                    }
                    if (r42.hasExt()) {
                        mergeExt(r42.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!r42.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = r42.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(r42.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!r42.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(r42.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = r42.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) r42).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAsset(Asset.Builder builder) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(builder.build());
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

                public Builder addAsset(int i10, Asset.Builder builder) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i10, builder.build());
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
                public com.explorestack.protobuf.adcom.Ad.Display.Native.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.access$14500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Ad$Display$Native r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Ad$Display$Native r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Display$Native$Builder");
                }
            }

            public static Builder newBuilder(Native r12) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(r12);
            }

            public static Native parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Native(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Native parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Native) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Native getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Native parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Native() {
                this.memoizedIsInitialized = (byte) -1;
                List list = Collections.EMPTY_LIST;
                this.asset_ = list;
                this.extProto_ = list;
            }

            public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Native parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(bArr, wVar);
            }

            public static Native parseFrom(InputStream inputStream) throws IOException {
                return (Native) h0.parseWithIOException(PARSER, inputStream);
            }

            private Native(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    LinkAsset linkAsset = this.link_;
                                    LinkAsset.Builder builder = linkAsset != null ? linkAsset.toBuilder() : null;
                                    LinkAsset linkAsset2 = (LinkAsset) lVar.A(LinkAsset.parser(), wVar);
                                    this.link_ = linkAsset2;
                                    if (builder != null) {
                                        builder.mergeFrom(linkAsset2);
                                        this.link_ = builder.buildPartial();
                                    }
                                } else if (iK == 18) {
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 == 0) {
                                        this.asset_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.asset_.add((Asset) lVar.A(Asset.parser(), wVar));
                                } else if (iK == 26) {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                } else if (iK != 34) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
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
                        if (((i10 == true ? 1 : 0) & 1) != 0) {
                            this.asset_ = DesugarCollections.unmodifiableList(this.asset_);
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
                    this.asset_ = DesugarCollections.unmodifiableList(this.asset_);
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Native parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Native) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Native parseFrom(l lVar) throws IOException {
                return (Native) h0.parseWithIOException(PARSER, lVar);
            }

            public static Native parseFrom(l lVar, w wVar) throws IOException {
                return (Native) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface NativeOrBuilder extends MessageOrBuilder {
            Native.Asset getAsset(int i10);

            int getAssetCount();

            List<Native.Asset> getAssetList();

            Native.AssetOrBuilder getAssetOrBuilder(int i10);

            List<? extends Native.AssetOrBuilder> getAssetOrBuilderList();

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

            Native.LinkAsset getLink();

            Native.LinkAssetOrBuilder getLinkOrBuilder();

            boolean hasExt();

            boolean hasLink();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Display getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18816g0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Display parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Display) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return super.equals(obj);
            }
            Display display = (Display) obj;
            if (!getMimeList().equals(display.getMimeList()) || !this.api_.equals(display.api_) || !this.type_.equals(display.type_) || getW() != display.getW() || getH() != display.getH() || getWratio() != display.getWratio() || getHratio() != display.getHratio() || !getAdm().equals(display.getAdm()) || !getCurl().equals(display.getCurl()) || hasBanner() != display.hasBanner()) {
                return false;
            }
            if ((hasBanner() && !getBanner().equals(display.getBanner())) || hasNative() != display.hasNative()) {
                return false;
            }
            if ((!hasNative() || getNative().equals(display.getNative())) && getEventList().equals(display.getEventList()) && hasExt() == display.hasExt()) {
                return (!hasExt() || getExt().equals(display.getExt())) && getExtProtoList().equals(display.getExtProtoList()) && this.unknownFields.equals(display.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adm_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<ApiFramework> getApiList() {
            return new j0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Banner getBanner() {
            Banner banner = this.banner_;
            return banner == null ? Banner.getDefaultInstance() : banner;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public BannerOrBuilder getBannerOrBuilder() {
            return getBanner();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.curl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Event getEvent(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getEventCount() {
            return this.event_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Event> getEventList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public EventOrBuilder getEventOrBuilder(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<? extends EventOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getHratio() {
            return this.hratio_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getMime(int i10) {
            return (String) this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Native getNative() {
            Native r02 = this.native_;
            return r02 == null ? Native.getDefaultInstance() : r02;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public NativeOrBuilder getNativeOrBuilder() {
            return getNative();
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
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.mime_.getRaw(i11));
            }
            int size = iComputeStringSizeNoTag + getMimeList().size();
            int iM = 0;
            for (int i12 = 0; i12 < this.api_.size(); i12++) {
                iM += n.m(this.api_.get(i12).intValue());
            }
            int iZ = size + iM;
            if (!getApiList().isEmpty()) {
                iZ = iZ + 1 + n.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            int iM2 = 0;
            for (int i13 = 0; i13 < this.type_.size(); i13++) {
                iM2 += n.m(this.type_.get(i13).intValue());
            }
            int iG = iZ + iM2;
            if (!getTypeList().isEmpty()) {
                iG = iG + 1 + n.Z(iM2);
            }
            this.typeMemoizedSerializedSize = iM2;
            int i14 = this.w_;
            if (i14 != 0) {
                iG += n.Y(4, i14);
            }
            int i15 = this.h_;
            if (i15 != 0) {
                iG += n.Y(5, i15);
            }
            int i16 = this.wratio_;
            if (i16 != 0) {
                iG += n.Y(6, i16);
            }
            int i17 = this.hratio_;
            if (i17 != 0) {
                iG += n.Y(7, i17);
            }
            if (!getAdmBytes().isEmpty()) {
                iG += h0.computeStringSize(8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                iG += h0.computeStringSize(9, this.curl_);
            }
            if (this.banner_ != null) {
                iG += n.G(10, getBanner());
            }
            if (this.native_ != null) {
                iG += n.G(11, getNative());
            }
            for (int i18 = 0; i18 < this.event_.size(); i18++) {
                iG += n.G(12, this.event_.get(i18));
            }
            for (int i19 = 0; i19 < this.extProto_.size(); i19++) {
                iG += n.G(13, this.extProto_.get(i19));
            }
            if (this.ext_ != null) {
                iG += n.G(14, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public DisplayCreativeType getType(int i10) {
            return (DisplayCreativeType) type_converter_.convert(this.type_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<DisplayCreativeType> getTypeList() {
            return new j0.h(this.type_, type_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getTypeValue(int i10) {
            return this.type_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getWratio() {
            return this.wratio_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasBanner() {
            return this.banner_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasNative() {
            return this.native_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getMimeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.type_.hashCode();
            }
            int w10 = (((((((((((((((((((((((iHashCode * 37) + 4) * 53) + getW()) * 37) + 5) * 53) + getH()) * 37) + 6) * 53) + getWratio()) * 37) + 7) * 53) + getHratio()) * 37) + 8) * 53) + getAdm().hashCode()) * 37) + 9) * 53) + getCurl().hashCode();
            if (hasBanner()) {
                w10 = (((w10 * 37) + 10) * 53) + getBanner().hashCode();
            }
            if (hasNative()) {
                w10 = (((w10 * 37) + 11) * 53) + getNative().hashCode();
            }
            if (getEventCount() > 0) {
                w10 = (((w10 * 37) + 12) * 53) + getEventList().hashCode();
            }
            if (hasExt()) {
                w10 = (((w10 * 37) + 14) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                w10 = (((w10 * 37) + 13) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (w10 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.f18818h0.d(Display.class, Builder.class);
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
            return new Display();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.mime_.size(); i10++) {
                h0.writeString(nVar, 1, this.mime_.getRaw(i10));
            }
            if (getApiList().size() > 0) {
                nVar.X0(18);
                nVar.X0(this.apiMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.api_.size(); i11++) {
                nVar.w0(this.api_.get(i11).intValue());
            }
            if (getTypeList().size() > 0) {
                nVar.X0(26);
                nVar.X0(this.typeMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.type_.size(); i12++) {
                nVar.w0(this.type_.get(i12).intValue());
            }
            int i13 = this.w_;
            if (i13 != 0) {
                nVar.W0(4, i13);
            }
            int i14 = this.h_;
            if (i14 != 0) {
                nVar.W0(5, i14);
            }
            int i15 = this.wratio_;
            if (i15 != 0) {
                nVar.W0(6, i15);
            }
            int i16 = this.hratio_;
            if (i16 != 0) {
                nVar.W0(7, i16);
            }
            if (!getAdmBytes().isEmpty()) {
                h0.writeString(nVar, 8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                h0.writeString(nVar, 9, this.curl_);
            }
            if (this.banner_ != null) {
                nVar.J0(10, getBanner());
            }
            if (this.native_ != null) {
                nVar.J0(11, getNative());
            }
            for (int i17 = 0; i17 < this.event_.size(); i17++) {
                nVar.J0(12, this.event_.get(i17));
            }
            for (int i18 = 0; i18 < this.extProto_.size(); i18++) {
                nVar.J0(13, this.extProto_.get(i18));
            }
            if (this.ext_ != null) {
                nVar.J0(14, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(Display display) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(display);
        }

        public static Display parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(byteBuffer, wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public t1 getMimeList() {
            return this.mime_;
        }

        private Display(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Display parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Display) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Display parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Display getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Display parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Display() {
            this.memoizedIsInitialized = (byte) -1;
            this.mime_ = o0.f19269e;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.type_ = list;
            this.adm_ = "";
            this.curl_ = "";
            this.event_ = list;
            this.extProto_ = list;
        }

        public static Display parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Display parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(bArr, wVar);
        }

        public static Display parseFrom(InputStream inputStream) throws IOException {
            return (Display) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Display) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Display parseFrom(l lVar) throws IOException {
            return (Display) h0.parseWithIOException(PARSER, lVar);
        }

        public static Display parseFrom(l lVar, w wVar) throws IOException {
            return (Display) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private Display(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                String strJ = lVar.J();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.mime_ = new o0();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.mime_.add(strJ);
                                break;
                            case 16:
                                int iT = lVar.t();
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.api_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.api_.add(Integer.valueOf(iT));
                                break;
                            case 18:
                                int iP = lVar.p(lVar.C());
                                i10 = i10;
                                while (lVar.d() > 0) {
                                    int iT2 = lVar.t();
                                    if (((i10 == true ? 1 : 0) & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.api_.add(Integer.valueOf(iT2));
                                    i10 = i10;
                                }
                                lVar.o(iP);
                                break;
                            case 24:
                                int iT3 = lVar.t();
                                int i13 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i13 == 0) {
                                    this.type_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.type_.add(Integer.valueOf(iT3));
                                break;
                            case 26:
                                int iP2 = lVar.p(lVar.C());
                                i10 = i10;
                                while (lVar.d() > 0) {
                                    int iT4 = lVar.t();
                                    if (((i10 == true ? 1 : 0) & 4) == 0) {
                                        this.type_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.type_.add(Integer.valueOf(iT4));
                                    i10 = i10;
                                }
                                lVar.o(iP2);
                                break;
                            case 32:
                                this.w_ = lVar.L();
                                break;
                            case 40:
                                this.h_ = lVar.L();
                                break;
                            case 48:
                                this.wratio_ = lVar.L();
                                break;
                            case 56:
                                this.hratio_ = lVar.L();
                                break;
                            case 66:
                                this.adm_ = lVar.J();
                                break;
                            case 74:
                                this.curl_ = lVar.J();
                                break;
                            case 82:
                                Banner banner = this.banner_;
                                Banner.Builder builder = banner != null ? banner.toBuilder() : null;
                                Banner banner2 = (Banner) lVar.A(Banner.parser(), wVar);
                                this.banner_ = banner2;
                                if (builder != null) {
                                    builder.mergeFrom(banner2);
                                    this.banner_ = builder.buildPartial();
                                }
                                break;
                            case 90:
                                Native r32 = this.native_;
                                Native.Builder builder2 = r32 != null ? r32.toBuilder() : null;
                                Native r33 = (Native) lVar.A(Native.parser(), wVar);
                                this.native_ = r33;
                                if (builder2 != null) {
                                    builder2.mergeFrom(r33);
                                    this.native_ = builder2.buildPartial();
                                }
                                break;
                            case 98:
                                int i14 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i14 == 0) {
                                    this.event_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.event_.add((Event) lVar.A(Event.parser(), wVar));
                                break;
                            case 106:
                                int i15 = (i10 == true ? 1 : 0) & 16;
                                i10 = i10;
                                if (i15 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 16;
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
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    }
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.type_ = DesugarCollections.unmodifiableList(this.type_);
                    }
                    if (((i10 == true ? 1 : 0) & 8) != 0) {
                        this.event_ = DesugarCollections.unmodifiableList(this.event_);
                    }
                    if (((i10 == true ? 1 : 0) & 16) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.api_ = DesugarCollections.unmodifiableList(this.api_);
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.type_ = DesugarCollections.unmodifiableList(this.type_);
            }
            if (((i10 == true ? 1 : 0) & 8) != 0) {
                this.event_ = DesugarCollections.unmodifiableList(this.event_);
            }
            if (((i10 == true ? 1 : 0) & 16) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface DisplayOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        Display.Banner getBanner();

        Display.BannerOrBuilder getBannerOrBuilder();

        String getCurl();

        ByteString getCurlBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        Event getEvent(int i10);

        int getEventCount();

        List<Event> getEventList();

        EventOrBuilder getEventOrBuilder(int i10);

        List<? extends EventOrBuilder> getEventOrBuilderList();

        Struct getExt();

        e2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        int getH();

        int getHratio();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        Display.Native getNative();

        Display.NativeOrBuilder getNativeOrBuilder();

        DisplayCreativeType getType(int i10);

        int getTypeCount();

        List<DisplayCreativeType> getTypeList();

        int getTypeValue(int i10);

        List<Integer> getTypeValueList();

        int getW();

        int getWratio();

        boolean hasBanner();

        boolean hasExt();

        boolean hasNative();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Event extends h0 implements EventOrBuilder {
        public static final int API_FIELD_NUMBER = 3;
        public static final int CDATA_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private w0 cdata_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private int method_;
        private int type_;
        private volatile Object url_;
        private static final j0.h.a api_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Ad.Event.1
            @Override // com.explorestack.protobuf.j0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final Event DEFAULT_INSTANCE = new Event();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Event.2
            @Override // com.explorestack.protobuf.p1
            public Event parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Event(lVar, wVar);
            }
        };

        private static final class CdataDefaultEntryHolder {
            static final u0 defaultEntry;

            static {
                Descriptors.Descriptor descriptor = b.f18812e0;
                z2.b bVar = z2.b.f19481l;
                defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
            }

            private CdataDefaultEntryHolder() {
            }
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18808c0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w0 internalGetCdata() {
            w0 w0Var = this.cdata_;
            return w0Var == null ? w0.g(CdataDefaultEntryHolder.defaultEntry) : w0Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Event) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public boolean containsCdata(String str) {
            str.getClass();
            return internalGetCdata().i().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return super.equals(obj);
            }
            Event event = (Event) obj;
            if (this.type_ == event.type_ && this.method_ == event.method_ && this.api_.equals(event.api_) && getUrl().equals(event.getUrl()) && internalGetCdata().equals(event.internalGetCdata()) && hasExt() == event.hasExt()) {
                return (!hasExt() || getExt().equals(event.getExt())) && getExtProtoList().equals(event.getExtProtoList()) && this.unknownFields.equals(event.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<ApiFramework> getApiList() {
            return new j0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        @Deprecated
        public Map<String, String> getCdata() {
            return getCdataMap();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getCdataCount() {
            return internalGetCdata().i().size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Map<String, String> getCdataMap() {
            return internalGetCdata().i();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getCdataOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetCdata().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getCdataOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetCdata().i();
            if (mapI.containsKey(str)) {
                return (String) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public EventTrackingMethod getMethod() {
            EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(this.method_);
            return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getMethodValue() {
            return this.method_;
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
            int iL = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? n.l(1, this.type_) : 0;
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                iL += n.l(2, this.method_);
            }
            int iM = 0;
            for (int i11 = 0; i11 < this.api_.size(); i11++) {
                iM += n.m(this.api_.get(i11).intValue());
            }
            int iG = iL + iM;
            if (!getApiList().isEmpty()) {
                iG = iG + 1 + n.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            if (!getUrlBytes().isEmpty()) {
                iG += h0.computeStringSize(4, this.url_);
            }
            for (Map.Entry entry : internalGetCdata().i().entrySet()) {
                iG += n.G(5, CdataDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                iG += n.G(6, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                iG += n.G(7, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public EventType getType() {
            EventType eventTypeValueOf = EventType.valueOf(this.type_);
            return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + this.method_;
            if (getApiCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.api_.hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getUrl().hashCode();
            if (!internalGetCdata().i().isEmpty()) {
                iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + internalGetCdata().hashCode();
            }
            if (hasExt()) {
                iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.f18810d0.d(Event.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0
        protected w0 internalGetMapField(int i10) {
            if (i10 == 5) {
                return internalGetCdata();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
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
            return new Event();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                nVar.v0(1, this.type_);
            }
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                nVar.v0(2, this.method_);
            }
            if (getApiList().size() > 0) {
                nVar.X0(26);
                nVar.X0(this.apiMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.api_.size(); i10++) {
                nVar.w0(this.api_.get(i10).intValue());
            }
            if (!getUrlBytes().isEmpty()) {
                h0.writeString(nVar, 4, this.url_);
            }
            h0.serializeStringMapTo(nVar, internalGetCdata(), CdataDefaultEntryHolder.defaultEntry, 5);
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                nVar.J0(6, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                nVar.J0(7, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements EventOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private w0 cdata_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int method_;
            private int type_;
            private Object url_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18808c0;
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

            private w0 internalGetCdata() {
                w0 w0Var = this.cdata_;
                return w0Var == null ? w0.g(CdataDefaultEntryHolder.defaultEntry) : w0Var;
            }

            private w0 internalGetMutableCdata() {
                onChanged();
                if (this.cdata_ == null) {
                    this.cdata_ = w0.p(CdataDefaultEntryHolder.defaultEntry);
                }
                if (!this.cdata_.m()) {
                    this.cdata_ = this.cdata_.f();
                }
                return this.cdata_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.api_.add(num);
                }
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

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
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

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCdata() {
                internalGetMutableCdata().l().clear();
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

            public Builder clearMethod() {
                this.method_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = Event.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public boolean containsCdata(String str) {
                str.getClass();
                return internalGetCdata().i().containsKey(str);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Event.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<ApiFramework> getApiList() {
                return new j0.h(this.api_, Event.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<Integer> getApiValueList() {
                return DesugarCollections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            @Deprecated
            public Map<String, String> getCdata() {
                return getCdataMap();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getCdataCount() {
                return internalGetCdata().i().size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public Map<String, String> getCdataMap() {
                return internalGetCdata().i();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getCdataOrDefault(String str, String str2) {
                str.getClass();
                Map mapI = internalGetCdata().i();
                return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getCdataOrThrow(String str) {
                str.getClass();
                Map mapI = internalGetCdata().i();
                if (mapI.containsKey(str)) {
                    return (String) mapI.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f18808c0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public EventTrackingMethod getMethod() {
                EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(this.method_);
                return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getMethodValue() {
                return this.method_;
            }

            @Deprecated
            public Map<String, String> getMutableCdata() {
                return internalGetMutableCdata().l();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public EventType getType() {
                EventType eventTypeValueOf = EventType.valueOf(this.type_);
                return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18810d0.d(Event.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMapField(int i10) {
                if (i10 == 5) {
                    return internalGetCdata();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMutableMapField(int i10) {
                if (i10 == 5) {
                    return internalGetMutableCdata();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
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

            public Builder putAllCdata(Map<String, String> map) {
                internalGetMutableCdata().l().putAll(map);
                return this;
            }

            public Builder putCdata(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableCdata().l().put(str, str2);
                return this;
            }

            public Builder removeCdata(String str) {
                str.getClass();
                internalGetMutableCdata().l().remove(str);
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

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
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

            public Builder setMethod(EventTrackingMethod eventTrackingMethod) {
                eventTrackingMethod.getClass();
                this.method_ = eventTrackingMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setMethodValue(int i10) {
                this.method_ = i10;
                onChanged();
                return this;
            }

            public Builder setType(EventType eventType) {
                eventType.getClass();
                this.type_ = eventType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.url_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 0;
                this.method_ = 0;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.url_ = "";
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Event build() {
                Event eventBuildPartial = buildPartial();
                if (eventBuildPartial.isInitialized()) {
                    return eventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Event buildPartial() {
                Event event = new Event(this);
                event.type_ = this.type_;
                event.method_ = this.method_;
                if ((this.bitField0_ & 1) != 0) {
                    this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    this.bitField0_ &= -2;
                }
                event.api_ = this.api_;
                event.url_ = this.url_;
                event.cdata_ = internalGetCdata();
                event.cdata_.n();
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    event.ext_ = this.ext_;
                } else {
                    event.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    event.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -5;
                    }
                    event.extProto_ = this.extProto_;
                }
                onBuilt();
                return event;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Event getDefaultInstanceForType() {
                return Event.getDefaultInstance();
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
                this.type_ = 0;
                this.method_ = 0;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.bitField0_ &= -2;
                this.url_ = "";
                internalGetMutableCdata().a();
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var == null) {
                    this.extProto_ = list;
                    this.bitField0_ &= -5;
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
                if (message instanceof Event) {
                    return mergeFrom((Event) message);
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
                this.type_ = 0;
                this.method_ = 0;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.url_ = "";
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Event event) {
                if (event == Event.getDefaultInstance()) {
                    return this;
                }
                if (event.type_ != 0) {
                    setTypeValue(event.getTypeValue());
                }
                if (event.method_ != 0) {
                    setMethodValue(event.getMethodValue());
                }
                if (!event.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = event.api_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(event.api_);
                    }
                    onChanged();
                }
                if (!event.getUrl().isEmpty()) {
                    this.url_ = event.url_;
                    onChanged();
                }
                internalGetMutableCdata().o(event.internalGetCdata());
                if (event.hasExt()) {
                    mergeExt(event.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!event.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = event.extProto_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(event.extProto_);
                        }
                        onChanged();
                    }
                } else if (!event.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(event.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = event.extProto_;
                        this.bitField0_ &= -5;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) event).unknownFields);
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
            public com.explorestack.protobuf.adcom.Ad.Event.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Event.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Event r3 = (com.explorestack.protobuf.adcom.Ad.Event) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Event r4 = (com.explorestack.protobuf.adcom.Ad.Event) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Event.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Event$Builder");
            }
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Event(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Event parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Event) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Event getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Event parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Event() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.method_ = 0;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.url_ = "";
            this.extProto_ = list;
        }

        public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Event parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(bArr, wVar);
        }

        public static Event parseFrom(InputStream inputStream) throws IOException {
            return (Event) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Event) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Event parseFrom(l lVar) throws IOException {
            return (Event) h0.parseWithIOException(PARSER, lVar);
        }

        private Event(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            if (iK == 8) {
                                this.type_ = lVar.t();
                            } else if (iK == 16) {
                                this.method_ = lVar.t();
                            } else if (iK == 24) {
                                int iT = lVar.t();
                                if ((i10 & 1) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.api_.add(Integer.valueOf(iT));
                            } else if (iK == 26) {
                                int iP = lVar.p(lVar.C());
                                while (lVar.d() > 0) {
                                    int iT2 = lVar.t();
                                    if ((i10 & 1) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.api_.add(Integer.valueOf(iT2));
                                }
                                lVar.o(iP);
                            } else if (iK == 34) {
                                this.url_ = lVar.J();
                            } else if (iK == 42) {
                                if ((i10 & 2) == 0) {
                                    this.cdata_ = w0.p(CdataDefaultEntryHolder.defaultEntry);
                                    i10 |= 2;
                                }
                                u0 u0Var = (u0) lVar.A(CdataDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                this.cdata_.l().put(u0Var.i(), u0Var.k());
                            } else if (iK == 50) {
                                if ((i10 & 4) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 4;
                                }
                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                            } else if (iK != 58) {
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
                        this.api_ = DesugarCollections.unmodifiableList(this.api_);
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
                this.api_ = DesugarCollections.unmodifiableList(this.api_);
            }
            if ((i10 & 4) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Event parseFrom(l lVar, w wVar) throws IOException {
            return (Event) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface EventOrBuilder extends MessageOrBuilder {
        boolean containsCdata(String str);

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        @Deprecated
        Map<String, String> getCdata();

        int getCdataCount();

        Map<String, String> getCdataMap();

        String getCdataOrDefault(String str, String str2);

        String getCdataOrThrow(String str);

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

        EventTrackingMethod getMethod();

        int getMethodValue();

        EventType getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Video extends h0 implements VideoOrBuilder {
        public static final int ADM_FIELD_NUMBER = 4;
        public static final int API_FIELD_NUMBER = 2;
        public static final int CURL_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object adm_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private volatile Object curl_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private p0 mime_;
        private int typeMemoizedSerializedSize;
        private List<Integer> type_;
        private static final j0.h.a api_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Ad.Video.1
            @Override // com.explorestack.protobuf.j0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final j0.h.a type_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Ad.Video.2
            @Override // com.explorestack.protobuf.j0.h.a
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType videoCreativeTypeValueOf = VideoCreativeType.valueOf(num.intValue());
                return videoCreativeTypeValueOf == null ? VideoCreativeType.UNRECOGNIZED : videoCreativeTypeValueOf;
            }
        };
        private static final Video DEFAULT_INSTANCE = new Video();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Ad.Video.3
            @Override // com.explorestack.protobuf.p1
            public Video parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Video(lVar, wVar);
            }
        };

        public static final class Builder extends h0.b implements VideoOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private int bitField0_;
            private Object curl_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private p0 mime_;
            private List<Integer> type_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new o0(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.A0;
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

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.api_.add(num);
                }
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

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addAllType(Iterable<? extends VideoCreativeType> iterable) {
                ensureTypeIsMutable();
                Iterator<? extends VideoCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.type_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
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

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add(str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.c(byteString);
                onChanged();
                return this;
            }

            public Builder addType(VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i10) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder clearAdm() {
                this.adm_ = Video.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearCurl() {
                this.curl_ = Video.getDefaultInstance().getCurl();
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

            public Builder clearMime() {
                this.mime_ = o0.f19269e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getAdm() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adm_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Video.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<ApiFramework> getApiList() {
                return new j0.h(this.api_, Video.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Integer> getApiValueList() {
                return DesugarCollections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getCurl() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.curl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.A0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getMime(int i10) {
                return (String) this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public VideoCreativeType getType(int i10) {
                return (VideoCreativeType) Video.type_converter_.convert(this.type_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<VideoCreativeType> getTypeList() {
                return new j0.h(this.type_, Video.type_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getTypeValue(int i10) {
                return this.type_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Integer> getTypeValueList() {
                return DesugarCollections.unmodifiableList(this.type_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.B0.d(Video.class, Builder.class);
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

            public Builder setAdm(String str) {
                str.getClass();
                this.adm_ = str;
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.adm_ = byteString;
                onChanged();
                return this;
            }

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setCurl(String str) {
                str.getClass();
                this.curl_ = str;
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.curl_ = byteString;
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

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setType(int i10, VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10, int i11) {
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public t1 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.mime_ = o0.f19269e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.adm_ = "";
                this.curl_ = "";
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Video build() {
                Video videoBuildPartial = buildPartial();
                if (videoBuildPartial.isInitialized()) {
                    return videoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Video buildPartial() {
                Video video = new Video(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                video.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                video.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = DesugarCollections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                video.type_ = this.type_;
                video.adm_ = this.adm_;
                video.curl_ = this.curl_;
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    video.ext_ = this.ext_;
                } else {
                    video.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    video.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    video.extProto_ = this.extProto_;
                }
                onBuilt();
                return video;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Video getDefaultInstanceForType() {
                return Video.getDefaultInstance();
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
                this.mime_ = o0.f19269e;
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.bitField0_ = i10 & (-8);
                this.adm_ = "";
                this.curl_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var == null) {
                    this.extProto_ = list;
                    this.bitField0_ = i10 & (-16);
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
                if (message instanceof Video) {
                    return mergeFrom((Video) message);
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

            public Builder mergeFrom(Video video) {
                if (video == Video.getDefaultInstance()) {
                    return this;
                }
                if (!video.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = video.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(video.mime_);
                    }
                    onChanged();
                }
                if (!video.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = video.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(video.api_);
                    }
                    onChanged();
                }
                if (!video.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = video.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(video.type_);
                    }
                    onChanged();
                }
                if (!video.getAdm().isEmpty()) {
                    this.adm_ = video.adm_;
                    onChanged();
                }
                if (!video.getCurl().isEmpty()) {
                    this.curl_ = video.curl_;
                    onChanged();
                }
                if (video.hasExt()) {
                    mergeExt(video.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!video.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = video.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(video.extProto_);
                        }
                        onChanged();
                    }
                } else if (!video.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(video.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = video.extProto_;
                        this.bitField0_ &= -9;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) video).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.mime_ = o0.f19269e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.adm_ = "";
                this.curl_ = "";
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
            public com.explorestack.protobuf.adcom.Ad.Video.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Ad.Video.access$18800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Video r3 = (com.explorestack.protobuf.adcom.Ad.Video) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Video r4 = (com.explorestack.protobuf.adcom.Ad.Video) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Video.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Ad$Video$Builder");
            }
        }

        public static Video getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.A0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Video parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Video) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return super.equals(obj);
            }
            Video video = (Video) obj;
            if (getMimeList().equals(video.getMimeList()) && this.api_.equals(video.api_) && this.type_.equals(video.type_) && getAdm().equals(video.getAdm()) && getCurl().equals(video.getCurl()) && hasExt() == video.hasExt()) {
                return (!hasExt() || getExt().equals(video.getExt())) && getExtProtoList().equals(video.getExtProtoList()) && this.unknownFields.equals(video.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adm_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<ApiFramework> getApiList() {
            return new j0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.curl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getMime(int i10) {
            return (String) this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
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
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.mime_.getRaw(i11));
            }
            int size = iComputeStringSizeNoTag + getMimeList().size();
            int iM = 0;
            for (int i12 = 0; i12 < this.api_.size(); i12++) {
                iM += n.m(this.api_.get(i12).intValue());
            }
            int iZ = size + iM;
            if (!getApiList().isEmpty()) {
                iZ = iZ + 1 + n.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            int iM2 = 0;
            for (int i13 = 0; i13 < this.type_.size(); i13++) {
                iM2 += n.m(this.type_.get(i13).intValue());
            }
            int iG = iZ + iM2;
            if (!getTypeList().isEmpty()) {
                iG = iG + 1 + n.Z(iM2);
            }
            this.typeMemoizedSerializedSize = iM2;
            if (!getAdmBytes().isEmpty()) {
                iG += h0.computeStringSize(4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                iG += h0.computeStringSize(5, this.curl_);
            }
            for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                iG += n.G(6, this.extProto_.get(i14));
            }
            if (this.ext_ != null) {
                iG += n.G(7, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public VideoCreativeType getType(int i10) {
            return (VideoCreativeType) type_converter_.convert(this.type_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<VideoCreativeType> getTypeList() {
            return new j0.h(this.type_, type_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getTypeValue(int i10) {
            return this.type_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getMimeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.type_.hashCode();
            }
            int iHashCode2 = (((((((iHashCode * 37) + 4) * 53) + getAdm().hashCode()) * 37) + 5) * 53) + getCurl().hashCode();
            if (hasExt()) {
                iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.B0.d(Video.class, Builder.class);
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
            return new Video();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.mime_.size(); i10++) {
                h0.writeString(nVar, 1, this.mime_.getRaw(i10));
            }
            if (getApiList().size() > 0) {
                nVar.X0(18);
                nVar.X0(this.apiMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.api_.size(); i11++) {
                nVar.w0(this.api_.get(i11).intValue());
            }
            if (getTypeList().size() > 0) {
                nVar.X0(26);
                nVar.X0(this.typeMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.type_.size(); i12++) {
                nVar.w0(this.type_.get(i12).intValue());
            }
            if (!getAdmBytes().isEmpty()) {
                h0.writeString(nVar, 4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                h0.writeString(nVar, 5, this.curl_);
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                nVar.J0(6, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                nVar.J0(7, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(Video video) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(video);
        }

        public static Video parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(byteBuffer, wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public t1 getMimeList() {
            return this.mime_;
        }

        private Video(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Video parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Video) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Video parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Video getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Video parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Video() {
            this.memoizedIsInitialized = (byte) -1;
            this.mime_ = o0.f19269e;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.type_ = list;
            this.adm_ = "";
            this.curl_ = "";
            this.extProto_ = list;
        }

        public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Video parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(bArr, wVar);
        }

        public static Video parseFrom(InputStream inputStream) throws IOException {
            return (Video) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Video) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Video parseFrom(l lVar) throws IOException {
            return (Video) h0.parseWithIOException(PARSER, lVar);
        }

        private Video(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                String strJ = lVar.J();
                                if ((i10 & 1) == 0) {
                                    this.mime_ = new o0();
                                    i10 |= 1;
                                }
                                this.mime_.add(strJ);
                            } else if (iK == 16) {
                                int iT = lVar.t();
                                if ((i10 & 2) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.api_.add(Integer.valueOf(iT));
                            } else if (iK == 18) {
                                int iP = lVar.p(lVar.C());
                                while (lVar.d() > 0) {
                                    int iT2 = lVar.t();
                                    if ((i10 & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(iT2));
                                }
                                lVar.o(iP);
                            } else if (iK == 24) {
                                int iT3 = lVar.t();
                                if ((i10 & 4) == 0) {
                                    this.type_ = new ArrayList();
                                    i10 |= 4;
                                }
                                this.type_.add(Integer.valueOf(iT3));
                            } else if (iK == 26) {
                                int iP2 = lVar.p(lVar.C());
                                while (lVar.d() > 0) {
                                    int iT4 = lVar.t();
                                    if ((i10 & 4) == 0) {
                                        this.type_ = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.type_.add(Integer.valueOf(iT4));
                                }
                                lVar.o(iP2);
                            } else if (iK == 34) {
                                this.adm_ = lVar.J();
                            } else if (iK == 42) {
                                this.curl_ = lVar.J();
                            } else if (iK == 50) {
                                if ((i10 & 8) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 8;
                                }
                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                            } else if (iK != 58) {
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
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    }
                    if ((i10 & 4) != 0) {
                        this.type_ = DesugarCollections.unmodifiableList(this.type_);
                    }
                    if ((i10 & 8) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if ((i10 & 2) != 0) {
                this.api_ = DesugarCollections.unmodifiableList(this.api_);
            }
            if ((i10 & 4) != 0) {
                this.type_ = DesugarCollections.unmodifiableList(this.type_);
            }
            if ((i10 & 8) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Video parseFrom(l lVar, w wVar) throws IOException {
            return (Video) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface VideoOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        String getCurl();

        ByteString getCurlBytes();

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

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        VideoCreativeType getType(int i10);

        int getTypeCount();

        List<VideoCreativeType> getTypeList();

        int getTypeValue(int i10);

        List<Integer> getTypeValueList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f18804a0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Ad parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ad) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Ad parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return super.equals(obj);
        }
        Ad ad2 = (Ad) obj;
        if (!getId().equals(ad2.getId()) || !m4441getAdomainList().equals(ad2.m4441getAdomainList()) || !m4442getBundleList().equals(ad2.m4442getBundleList()) || !getIurl().equals(ad2.getIurl()) || !m4443getCatList().equals(ad2.m4443getCatList()) || this.cattax_ != ad2.cattax_ || !getLang().equals(ad2.getLang()) || getSecure() != ad2.getSecure() || this.mrating_ != ad2.mrating_ || !getInit().equals(ad2.getInit()) || !getLastmod().equals(ad2.getLastmod()) || hasDisplay() != ad2.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(ad2.getDisplay())) || hasVideo() != ad2.hasVideo()) {
            return false;
        }
        if ((hasVideo() && !getVideo().equals(ad2.getVideo())) || hasAudit() != ad2.hasAudit()) {
            return false;
        }
        if ((!hasAudit() || getAudit().equals(ad2.getAudit())) && hasExt() == ad2.hasExt()) {
            return (!hasExt() || getExt().equals(ad2.getExt())) && getExtProtoList().equals(ad2.getExtProtoList()) && this.unknownFields.equals(ad2.unknownFields);
        }
        return false;
    }

    public String getAdomain(int i10) {
        return (String) this.adomain_.get(i10);
    }

    public ByteString getAdomainBytes(int i10) {
        return this.adomain_.getByteString(i10);
    }

    public int getAdomainCount() {
        return this.adomain_.size();
    }

    public Audit getAudit() {
        Audit audit = this.audit_;
        return audit == null ? Audit.getDefaultInstance() : audit;
    }

    public AuditOrBuilder getAuditOrBuilder() {
        return getAudit();
    }

    public String getBundle(int i10) {
        return (String) this.bundle_.get(i10);
    }

    public ByteString getBundleBytes(int i10) {
        return this.bundle_.getByteString(i10);
    }

    public int getBundleCount() {
        return this.bundle_.size();
    }

    public String getCat(int i10) {
        return (String) this.cat_.get(i10);
    }

    public ByteString getCatBytes(int i10) {
        return this.cat_.getByteString(i10);
    }

    public int getCatCount() {
        return this.cat_.size();
    }

    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
    }

    public int getCattaxValue() {
        return this.cattax_;
    }

    public Display getDisplay() {
        Display display = this.display_;
        return display == null ? Display.getDefaultInstance() : display;
    }

    public DisplayOrBuilder getDisplayOrBuilder() {
        return getDisplay();
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

    public String getInit() {
        Object obj = this.init_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.init_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getInitBytes() {
        Object obj = this.init_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.init_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getIurl() {
        Object obj = this.iurl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.iurl_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIurlBytes() {
        Object obj = this.iurl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.iurl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getLang() {
        Object obj = this.lang_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lang_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getLangBytes() {
        Object obj = this.lang_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.lang_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getLastmod() {
        Object obj = this.lastmod_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lastmod_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getLastmodBytes() {
        Object obj = this.lastmod_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.lastmod_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public MediaRating getMrating() {
        MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
        return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
    }

    public int getMratingValue() {
        return this.mrating_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    public boolean getSecure() {
        return this.secure_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.adomain_.size(); i11++) {
            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.adomain_.getRaw(i11));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + m4441getAdomainList().size();
        int iComputeStringSizeNoTag2 = 0;
        for (int i12 = 0; i12 < this.bundle_.size(); i12++) {
            iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.bundle_.getRaw(i12));
        }
        int size2 = size + iComputeStringSizeNoTag2 + m4442getBundleList().size();
        if (!getIurlBytes().isEmpty()) {
            size2 += h0.computeStringSize(4, this.iurl_);
        }
        int iComputeStringSizeNoTag3 = 0;
        for (int i13 = 0; i13 < this.cat_.size(); i13++) {
            iComputeStringSizeNoTag3 += h0.computeStringSizeNoTag(this.cat_.getRaw(i13));
        }
        int size3 = size2 + iComputeStringSizeNoTag3 + m4443getCatList().size();
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size3 += n.l(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            size3 += h0.computeStringSize(7, this.lang_);
        }
        boolean z10 = this.secure_;
        if (z10) {
            size3 += n.e(9, z10);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            size3 += n.l(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            size3 += h0.computeStringSize(11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            size3 += h0.computeStringSize(12, this.lastmod_);
        }
        if (this.display_ != null) {
            size3 += n.G(13, getDisplay());
        }
        if (this.video_ != null) {
            size3 += n.G(14, getVideo());
        }
        if (this.audit_ != null) {
            size3 += n.G(16, getAudit());
        }
        for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
            size3 += n.G(17, this.extProto_.get(i14));
        }
        if (this.ext_ != null) {
            size3 += n.G(18, getExt());
        }
        int serializedSize = size3 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public Video getVideo() {
        Video video = this.video_;
        return video == null ? Video.getDefaultInstance() : video;
    }

    public VideoOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    public boolean hasAudit() {
        return this.audit_ != null;
    }

    public boolean hasDisplay() {
        return this.display_ != null;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode();
        if (getAdomainCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + m4441getAdomainList().hashCode();
        }
        if (getBundleCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m4442getBundleList().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getIurl().hashCode();
        if (getCatCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + m4443getCatList().hashCode();
        }
        int iHashCode3 = (((((((((((((((((((((((iHashCode2 * 37) + 6) * 53) + this.cattax_) * 37) + 7) * 53) + getLang().hashCode()) * 37) + 9) * 53) + j0.d(getSecure())) * 37) + 10) * 53) + this.mrating_) * 37) + 11) * 53) + getInit().hashCode()) * 37) + 12) * 53) + getLastmod().hashCode();
        if (hasDisplay()) {
            iHashCode3 = (((iHashCode3 * 37) + 13) * 53) + getDisplay().hashCode();
        }
        if (hasVideo()) {
            iHashCode3 = (((iHashCode3 * 37) + 14) * 53) + getVideo().hashCode();
        }
        if (hasAudit()) {
            iHashCode3 = (((iHashCode3 * 37) + 16) * 53) + getAudit().hashCode();
        }
        if (hasExt()) {
            iHashCode3 = (((iHashCode3 * 37) + 18) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode3 = (((iHashCode3 * 37) + 17) * 53) + getExtProtoList().hashCode();
        }
        int iHashCode4 = (iHashCode3 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return b.f18806b0.d(Ad.class, Builder.class);
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
        return new Ad();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getIdBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.id_);
        }
        for (int i10 = 0; i10 < this.adomain_.size(); i10++) {
            h0.writeString(nVar, 2, this.adomain_.getRaw(i10));
        }
        for (int i11 = 0; i11 < this.bundle_.size(); i11++) {
            h0.writeString(nVar, 3, this.bundle_.getRaw(i11));
        }
        if (!getIurlBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.iurl_);
        }
        for (int i12 = 0; i12 < this.cat_.size(); i12++) {
            h0.writeString(nVar, 5, this.cat_.getRaw(i12));
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            nVar.v0(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            h0.writeString(nVar, 7, this.lang_);
        }
        boolean z10 = this.secure_;
        if (z10) {
            nVar.n0(9, z10);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            nVar.v0(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            h0.writeString(nVar, 11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            h0.writeString(nVar, 12, this.lastmod_);
        }
        if (this.display_ != null) {
            nVar.J0(13, getDisplay());
        }
        if (this.video_ != null) {
            nVar.J0(14, getVideo());
        }
        if (this.audit_ != null) {
            nVar.J0(16, getAudit());
        }
        for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
            nVar.J0(17, this.extProto_.get(i13));
        }
        if (this.ext_ != null) {
            nVar.J0(18, getExt());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static Builder newBuilder(Ad ad2) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(ad2);
    }

    public static Ad parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(byteBuffer, wVar);
    }

    /* JADX INFO: renamed from: getAdomainList, reason: merged with bridge method [inline-methods] */
    public t1 m4441getAdomainList() {
        return this.adomain_;
    }

    /* JADX INFO: renamed from: getBundleList, reason: merged with bridge method [inline-methods] */
    public t1 m4442getBundleList() {
        return this.bundle_;
    }

    /* JADX INFO: renamed from: getCatList, reason: merged with bridge method [inline-methods] */
    public t1 m4443getCatList() {
        return this.cat_;
    }

    private Ad(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Ad parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Ad) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Ad parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Ad getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Ad parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Ad() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        p0 p0Var = o0.f19269e;
        this.adomain_ = p0Var;
        this.bundle_ = p0Var;
        this.iurl_ = "";
        this.cat_ = p0Var;
        this.cattax_ = 0;
        this.lang_ = "";
        this.mrating_ = 0;
        this.init_ = "";
        this.lastmod_ = "";
        this.extProto_ = Collections.EMPTY_LIST;
    }

    public static Ad parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Ad parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(bArr, wVar);
    }

    public static Ad parseFrom(InputStream inputStream) throws IOException {
        return (Ad) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Ad parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Ad) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Ad parseFrom(l lVar) throws IOException {
        return (Ad) h0.parseWithIOException(PARSER, lVar);
    }

    public static Ad parseFrom(l lVar, w wVar) throws IOException {
        return (Ad) h0.parseWithIOException(PARSER, lVar, wVar);
    }

    private Ad(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            String strJ = lVar.J();
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.adomain_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.adomain_.add(strJ);
                            break;
                        case 26:
                            String strJ2 = lVar.J();
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.bundle_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.bundle_.add(strJ2);
                            break;
                        case 34:
                            this.iurl_ = lVar.J();
                            break;
                        case 42:
                            String strJ3 = lVar.J();
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 == 0) {
                                this.cat_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.cat_.add(strJ3);
                            break;
                        case 48:
                            this.cattax_ = lVar.t();
                            break;
                        case 58:
                            this.lang_ = lVar.J();
                            break;
                        case 72:
                            this.secure_ = lVar.q();
                            break;
                        case 80:
                            this.mrating_ = lVar.t();
                            break;
                        case 90:
                            this.init_ = lVar.J();
                            break;
                        case 98:
                            this.lastmod_ = lVar.J();
                            break;
                        case 106:
                            Display display = this.display_;
                            Display.Builder builder = display != null ? display.toBuilder() : null;
                            Display display2 = (Display) lVar.A(Display.parser(), wVar);
                            this.display_ = display2;
                            if (builder != null) {
                                builder.mergeFrom(display2);
                                this.display_ = builder.buildPartial();
                            }
                            break;
                        case 114:
                            Video video = this.video_;
                            Video.Builder builder2 = video != null ? video.toBuilder() : null;
                            Video video2 = (Video) lVar.A(Video.parser(), wVar);
                            this.video_ = video2;
                            if (builder2 != null) {
                                builder2.mergeFrom(video2);
                                this.video_ = builder2.buildPartial();
                            }
                            break;
                        case 130:
                            Audit audit = this.audit_;
                            Audit.Builder builder3 = audit != null ? audit.toBuilder() : null;
                            Audit audit2 = (Audit) lVar.A(Audit.parser(), wVar);
                            this.audit_ = audit2;
                            if (builder3 != null) {
                                builder3.mergeFrom(audit2);
                                this.audit_ = builder3.buildPartial();
                            }
                            break;
                        case 138:
                            int i14 = (i10 == true ? 1 : 0) & 8;
                            i10 = i10;
                            if (i14 == 0) {
                                this.extProto_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 8;
                            }
                            this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                            break;
                        case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                            Struct struct = this.ext_;
                            Struct.Builder builder4 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.ext_ = struct2;
                            if (builder4 != null) {
                                builder4.mergeFrom(struct2);
                                this.ext_ = builder4.buildPartial();
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
                    this.adomain_ = this.adomain_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.bundle_ = this.bundle_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 4) != 0) {
                    this.cat_ = this.cat_.getUnmodifiableView();
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
            this.adomain_ = this.adomain_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 2) != 0) {
            this.bundle_ = this.bundle_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 4) != 0) {
            this.cat_ = this.cat_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 8) != 0) {
            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
