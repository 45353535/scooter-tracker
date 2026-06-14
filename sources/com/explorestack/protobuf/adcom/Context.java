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
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Context extends h0 implements c {
    public static final int APP_FIELD_NUMBER = 1;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int EXT_FIELD_NUMBER = 7;
    public static final int EXT_PROTO_FIELD_NUMBER = 6;
    public static final int REGS_FIELD_NUMBER = 3;
    public static final int RESTRICTIONS_FIELD_NUMBER = 4;
    public static final int USER_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private App app_;
    private Device device_;
    private List<Any> extProto_;
    private Struct ext_;
    private byte memoizedIsInitialized;
    private Regs regs_;
    private Restrictions restrictions_;
    private User user_;
    private static final Context DEFAULT_INSTANCE = new Context();
    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.1
        @Override // com.explorestack.protobuf.p1
        public Context parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Context(lVar, wVar);
        }
    };

    public static final class App extends h0 implements AppOrBuilder {
        public static final int BUNDLE_FIELD_NUMBER = 12;
        public static final int CATTAX_FIELD_NUMBER = 9;
        public static final int CAT_FIELD_NUMBER = 6;
        public static final int CONTENT_FIELD_NUMBER = 4;
        public static final int DOMAIN_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 18;
        public static final int EXT_PROTO_FIELD_NUMBER = 17;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int KEYWORDS_FIELD_NUMBER = 11;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int PAGECAT_FIELD_NUMBER = 8;
        public static final int PAID_FIELD_NUMBER = 16;
        public static final int PRIVPOLICY_FIELD_NUMBER = 10;
        public static final int PUB_FIELD_NUMBER = 3;
        public static final int RELEASE_FIELD_NUMBER = 19;
        public static final int SECTCAT_FIELD_NUMBER = 7;
        public static final int STOREID_FIELD_NUMBER = 13;
        public static final int STOREURL_FIELD_NUMBER = 14;
        public static final int VER_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        private volatile Object bundle_;
        private p0 cat_;
        private int cattax_;
        private Content content_;
        private volatile Object domain_;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object id_;
        private volatile Object keywords_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private p0 pagecat_;
        private boolean paid_;
        private boolean privpolicy_;
        private Publisher pub_;
        private Release release_;
        private p0 sectcat_;
        private volatile Object storeid_;
        private volatile Object storeurl_;
        private volatile Object ver_;
        private static final App DEFAULT_INSTANCE = new App();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.App.1
            @Override // com.explorestack.protobuf.p1
            public App parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new App(lVar, wVar);
            }
        };

        public static final class Builder extends h0.b implements AppOrBuilder {
            private int bitField0_;
            private Object bundle_;
            private p0 cat_;
            private int cattax_;
            private a2 contentBuilder_;
            private Content content_;
            private Object domain_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object id_;
            private Object keywords_;
            private Object name_;
            private p0 pagecat_;
            private boolean paid_;
            private boolean privpolicy_;
            private a2 pubBuilder_;
            private Publisher pub_;
            private a2 releaseBuilder_;
            private Release release_;
            private p0 sectcat_;
            private Object storeid_;
            private Object storeurl_;
            private Object ver_;

            private void ensureCatIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.cat_ = new o0(this.cat_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensurePagecatIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.pagecat_ = new o0(this.pagecat_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureSectcatIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.sectcat_ = new o0(this.sectcat_);
                    this.bitField0_ |= 2;
                }
            }

            private a2 getContentFieldBuilder() {
                if (this.contentBuilder_ == null) {
                    this.contentBuilder_ = new a2(getContent(), getParentForChildren(), isClean());
                    this.content_ = null;
                }
                return this.contentBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18807c;
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

            private a2 getPubFieldBuilder() {
                if (this.pubBuilder_ == null) {
                    this.pubBuilder_ = new a2(getPub(), getParentForChildren(), isClean());
                    this.pub_ = null;
                }
                return this.pubBuilder_;
            }

            private a2 getReleaseFieldBuilder() {
                if (this.releaseBuilder_ == null) {
                    this.releaseBuilder_ = new a2(getRelease(), getParentForChildren(), isClean());
                    this.release_ = null;
                }
                return this.releaseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
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

            public Builder addAllPagecat(Iterable<String> iterable) {
                ensurePagecatIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.pagecat_);
                onChanged();
                return this;
            }

            public Builder addAllSectcat(Iterable<String> iterable) {
                ensureSectcatIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.sectcat_);
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

            public Builder addPagecat(String str) {
                str.getClass();
                ensurePagecatIsMutable();
                this.pagecat_.add(str);
                onChanged();
                return this;
            }

            public Builder addPagecatBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensurePagecatIsMutable();
                this.pagecat_.c(byteString);
                onChanged();
                return this;
            }

            public Builder addSectcat(String str) {
                str.getClass();
                ensureSectcatIsMutable();
                this.sectcat_.add(str);
                onChanged();
                return this;
            }

            public Builder addSectcatBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureSectcatIsMutable();
                this.sectcat_.c(byteString);
                onChanged();
                return this;
            }

            public Builder clearBundle() {
                this.bundle_ = App.getDefaultInstance().getBundle();
                onChanged();
                return this;
            }

            public Builder clearCat() {
                this.cat_ = o0.f19269e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCattax() {
                this.cattax_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContent() {
                if (this.contentBuilder_ == null) {
                    this.content_ = null;
                    onChanged();
                    return this;
                }
                this.content_ = null;
                this.contentBuilder_ = null;
                return this;
            }

            public Builder clearDomain() {
                this.domain_ = App.getDefaultInstance().getDomain();
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
                this.id_ = App.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearKeywords() {
                this.keywords_ = App.getDefaultInstance().getKeywords();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = App.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearPagecat() {
                this.pagecat_ = o0.f19269e;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPaid() {
                this.paid_ = false;
                onChanged();
                return this;
            }

            public Builder clearPrivpolicy() {
                this.privpolicy_ = false;
                onChanged();
                return this;
            }

            public Builder clearPub() {
                if (this.pubBuilder_ == null) {
                    this.pub_ = null;
                    onChanged();
                    return this;
                }
                this.pub_ = null;
                this.pubBuilder_ = null;
                return this;
            }

            public Builder clearRelease() {
                if (this.releaseBuilder_ == null) {
                    this.release_ = null;
                    onChanged();
                    return this;
                }
                this.release_ = null;
                this.releaseBuilder_ = null;
                return this;
            }

            public Builder clearSectcat() {
                this.sectcat_ = o0.f19269e;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearStoreid() {
                this.storeid_ = App.getDefaultInstance().getStoreid();
                onChanged();
                return this;
            }

            public Builder clearStoreurl() {
                this.storeurl_ = App.getDefaultInstance().getStoreurl();
                onChanged();
                return this;
            }

            public Builder clearVer() {
                this.ver_ = App.getDefaultInstance().getVer();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getBundle() {
                Object obj = this.bundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getBundleBytes() {
                Object obj = this.bundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getCat(int i10) {
                return (String) this.cat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getCatBytes(int i10) {
                return this.cat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Content getContent() {
                a2 a2Var = this.contentBuilder_;
                if (a2Var != null) {
                    return (Content) a2Var.e();
                }
                Content content = this.content_;
                return content == null ? Content.getDefaultInstance() : content;
            }

            public Content.Builder getContentBuilder() {
                onChanged();
                return (Content.Builder) getContentFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ContentOrBuilder getContentOrBuilder() {
                a2 a2Var = this.contentBuilder_;
                if (a2Var != null) {
                    return (ContentOrBuilder) a2Var.f();
                }
                Content content = this.content_;
                return content == null ? Content.getDefaultInstance() : content;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f18807c;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getPagecat(int i10) {
                return (String) this.pagecat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getPagecatBytes(int i10) {
                return this.pagecat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getPagecatCount() {
                return this.pagecat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean getPaid() {
                return this.paid_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean getPrivpolicy() {
                return this.privpolicy_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Publisher getPub() {
                a2 a2Var = this.pubBuilder_;
                if (a2Var != null) {
                    return (Publisher) a2Var.e();
                }
                Publisher publisher = this.pub_;
                return publisher == null ? Publisher.getDefaultInstance() : publisher;
            }

            public Publisher.Builder getPubBuilder() {
                onChanged();
                return (Publisher.Builder) getPubFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public PublisherOrBuilder getPubOrBuilder() {
                a2 a2Var = this.pubBuilder_;
                if (a2Var != null) {
                    return (PublisherOrBuilder) a2Var.f();
                }
                Publisher publisher = this.pub_;
                return publisher == null ? Publisher.getDefaultInstance() : publisher;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Release getRelease() {
                a2 a2Var = this.releaseBuilder_;
                if (a2Var != null) {
                    return (Release) a2Var.e();
                }
                Release release = this.release_;
                return release == null ? Release.getDefaultInstance() : release;
            }

            public Release.Builder getReleaseBuilder() {
                onChanged();
                return (Release.Builder) getReleaseFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ReleaseOrBuilder getReleaseOrBuilder() {
                a2 a2Var = this.releaseBuilder_;
                if (a2Var != null) {
                    return (ReleaseOrBuilder) a2Var.f();
                }
                Release release = this.release_;
                return release == null ? Release.getDefaultInstance() : release;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getSectcat(int i10) {
                return (String) this.sectcat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getSectcatBytes(int i10) {
                return this.sectcat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getSectcatCount() {
                return this.sectcat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getStoreid() {
                Object obj = this.storeid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storeid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getStoreidBytes() {
                Object obj = this.storeid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storeid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getStoreurl() {
                Object obj = this.storeurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storeurl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getStoreurlBytes() {
                Object obj = this.storeurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storeurl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getVer() {
                Object obj = this.ver_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ver_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getVerBytes() {
                Object obj = this.ver_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ver_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasContent() {
                return (this.contentBuilder_ == null && this.content_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasPub() {
                return (this.pubBuilder_ == null && this.pub_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasRelease() {
                return (this.releaseBuilder_ == null && this.release_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18809d.d(App.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeContent(Content content) {
                a2 a2Var = this.contentBuilder_;
                if (a2Var != null) {
                    a2Var.g(content);
                    return this;
                }
                Content content2 = this.content_;
                if (content2 != null) {
                    this.content_ = Content.newBuilder(content2).mergeFrom(content).buildPartial();
                } else {
                    this.content_ = content;
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

            public Builder mergePub(Publisher publisher) {
                a2 a2Var = this.pubBuilder_;
                if (a2Var != null) {
                    a2Var.g(publisher);
                    return this;
                }
                Publisher publisher2 = this.pub_;
                if (publisher2 != null) {
                    this.pub_ = Publisher.newBuilder(publisher2).mergeFrom(publisher).buildPartial();
                } else {
                    this.pub_ = publisher;
                }
                onChanged();
                return this;
            }

            public Builder mergeRelease(Release release) {
                a2 a2Var = this.releaseBuilder_;
                if (a2Var != null) {
                    a2Var.g(release);
                    return this;
                }
                Release release2 = this.release_;
                if (release2 != null) {
                    this.release_ = Release.newBuilder(release2).mergeFrom(release).buildPartial();
                } else {
                    this.release_ = release;
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

            public Builder setBundle(String str) {
                str.getClass();
                this.bundle_ = str;
                onChanged();
                return this;
            }

            public Builder setBundleBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.bundle_ = byteString;
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

            public Builder setContent(Content content) {
                a2 a2Var = this.contentBuilder_;
                if (a2Var != null) {
                    a2Var.i(content);
                    return this;
                }
                content.getClass();
                this.content_ = content;
                onChanged();
                return this;
            }

            public Builder setDomain(String str) {
                str.getClass();
                this.domain_ = str;
                onChanged();
                return this;
            }

            public Builder setDomainBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.domain_ = byteString;
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

            public Builder setKeywords(String str) {
                str.getClass();
                this.keywords_ = str;
                onChanged();
                return this;
            }

            public Builder setKeywordsBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.keywords_ = byteString;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPagecat(int i10, String str) {
                str.getClass();
                ensurePagecatIsMutable();
                this.pagecat_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setPaid(boolean z10) {
                this.paid_ = z10;
                onChanged();
                return this;
            }

            public Builder setPrivpolicy(boolean z10) {
                this.privpolicy_ = z10;
                onChanged();
                return this;
            }

            public Builder setPub(Publisher publisher) {
                a2 a2Var = this.pubBuilder_;
                if (a2Var != null) {
                    a2Var.i(publisher);
                    return this;
                }
                publisher.getClass();
                this.pub_ = publisher;
                onChanged();
                return this;
            }

            public Builder setRelease(Release release) {
                a2 a2Var = this.releaseBuilder_;
                if (a2Var != null) {
                    a2Var.i(release);
                    return this;
                }
                release.getClass();
                this.release_ = release;
                onChanged();
                return this;
            }

            public Builder setSectcat(int i10, String str) {
                str.getClass();
                ensureSectcatIsMutable();
                this.sectcat_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setStoreid(String str) {
                str.getClass();
                this.storeid_ = str;
                onChanged();
                return this;
            }

            public Builder setStoreidBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.storeid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStoreurl(String str) {
                str.getClass();
                this.storeurl_ = str;
                onChanged();
                return this;
            }

            public Builder setStoreurlBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.storeurl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVer(String str) {
                str.getClass();
                this.ver_ = str;
                onChanged();
                return this;
            }

            public Builder setVerBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.ver_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public t1 getCatList() {
                return this.cat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public t1 getPagecatList() {
                return this.pagecat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public t1 getSectcatList() {
                return this.sectcat_.getUnmodifiableView();
            }

            private Builder() {
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                p0 p0Var = o0.f19269e;
                this.cat_ = p0Var;
                this.sectcat_ = p0Var;
                this.pagecat_ = p0Var;
                this.cattax_ = 0;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public App build() {
                App appBuildPartial = buildPartial();
                if (appBuildPartial.isInitialized()) {
                    return appBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public App buildPartial() {
                App app = new App(this);
                app.id_ = this.id_;
                app.name_ = this.name_;
                a2 a2Var = this.pubBuilder_;
                if (a2Var == null) {
                    app.pub_ = this.pub_;
                } else {
                    app.pub_ = (Publisher) a2Var.a();
                }
                a2 a2Var2 = this.contentBuilder_;
                if (a2Var2 == null) {
                    app.content_ = this.content_;
                } else {
                    app.content_ = (Content) a2Var2.a();
                }
                app.domain_ = this.domain_;
                if ((this.bitField0_ & 1) != 0) {
                    this.cat_ = this.cat_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                app.cat_ = this.cat_;
                if ((this.bitField0_ & 2) != 0) {
                    this.sectcat_ = this.sectcat_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                app.sectcat_ = this.sectcat_;
                if ((this.bitField0_ & 4) != 0) {
                    this.pagecat_ = this.pagecat_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                app.pagecat_ = this.pagecat_;
                app.cattax_ = this.cattax_;
                app.privpolicy_ = this.privpolicy_;
                app.keywords_ = this.keywords_;
                app.bundle_ = this.bundle_;
                app.storeid_ = this.storeid_;
                app.storeurl_ = this.storeurl_;
                app.ver_ = this.ver_;
                app.paid_ = this.paid_;
                a2 a2Var3 = this.releaseBuilder_;
                if (a2Var3 == null) {
                    app.release_ = this.release_;
                } else {
                    app.release_ = (Release) a2Var3.a();
                }
                a2 a2Var4 = this.extBuilder_;
                if (a2Var4 == null) {
                    app.ext_ = this.ext_;
                } else {
                    app.ext_ = (Struct) a2Var4.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    app.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    app.extProto_ = this.extProto_;
                }
                onBuilt();
                return app;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public App getDefaultInstanceForType() {
                return App.getDefaultInstance();
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
                this.name_ = "";
                if (this.pubBuilder_ == null) {
                    this.pub_ = null;
                } else {
                    this.pub_ = null;
                    this.pubBuilder_ = null;
                }
                if (this.contentBuilder_ == null) {
                    this.content_ = null;
                } else {
                    this.content_ = null;
                    this.contentBuilder_ = null;
                }
                this.domain_ = "";
                p0 p0Var = o0.f19269e;
                this.cat_ = p0Var;
                int i10 = this.bitField0_;
                this.sectcat_ = p0Var;
                this.pagecat_ = p0Var;
                this.bitField0_ = i10 & (-8);
                this.cattax_ = 0;
                this.privpolicy_ = false;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.paid_ = false;
                if (this.releaseBuilder_ == null) {
                    this.release_ = null;
                } else {
                    this.release_ = null;
                    this.releaseBuilder_ = null;
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

            public Builder setContent(Content.Builder builder) {
                a2 a2Var = this.contentBuilder_;
                if (a2Var == null) {
                    this.content_ = builder.build();
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

            public Builder setPub(Publisher.Builder builder) {
                a2 a2Var = this.pubBuilder_;
                if (a2Var == null) {
                    this.pub_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setRelease(Release.Builder builder) {
                a2 a2Var = this.releaseBuilder_;
                if (a2Var == null) {
                    this.release_ = builder.build();
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
                if (message instanceof App) {
                    return mergeFrom((App) message);
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

            public Builder mergeFrom(App app) {
                if (app == App.getDefaultInstance()) {
                    return this;
                }
                if (!app.getId().isEmpty()) {
                    this.id_ = app.id_;
                    onChanged();
                }
                if (!app.getName().isEmpty()) {
                    this.name_ = app.name_;
                    onChanged();
                }
                if (app.hasPub()) {
                    mergePub(app.getPub());
                }
                if (app.hasContent()) {
                    mergeContent(app.getContent());
                }
                if (!app.getDomain().isEmpty()) {
                    this.domain_ = app.domain_;
                    onChanged();
                }
                if (!app.cat_.isEmpty()) {
                    if (this.cat_.isEmpty()) {
                        this.cat_ = app.cat_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureCatIsMutable();
                        this.cat_.addAll(app.cat_);
                    }
                    onChanged();
                }
                if (!app.sectcat_.isEmpty()) {
                    if (this.sectcat_.isEmpty()) {
                        this.sectcat_ = app.sectcat_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureSectcatIsMutable();
                        this.sectcat_.addAll(app.sectcat_);
                    }
                    onChanged();
                }
                if (!app.pagecat_.isEmpty()) {
                    if (this.pagecat_.isEmpty()) {
                        this.pagecat_ = app.pagecat_;
                        this.bitField0_ &= -5;
                    } else {
                        ensurePagecatIsMutable();
                        this.pagecat_.addAll(app.pagecat_);
                    }
                    onChanged();
                }
                if (app.cattax_ != 0) {
                    setCattaxValue(app.getCattaxValue());
                }
                if (app.getPrivpolicy()) {
                    setPrivpolicy(app.getPrivpolicy());
                }
                if (!app.getKeywords().isEmpty()) {
                    this.keywords_ = app.keywords_;
                    onChanged();
                }
                if (!app.getBundle().isEmpty()) {
                    this.bundle_ = app.bundle_;
                    onChanged();
                }
                if (!app.getStoreid().isEmpty()) {
                    this.storeid_ = app.storeid_;
                    onChanged();
                }
                if (!app.getStoreurl().isEmpty()) {
                    this.storeurl_ = app.storeurl_;
                    onChanged();
                }
                if (!app.getVer().isEmpty()) {
                    this.ver_ = app.ver_;
                    onChanged();
                }
                if (app.getPaid()) {
                    setPaid(app.getPaid());
                }
                if (app.hasRelease()) {
                    mergeRelease(app.getRelease());
                }
                if (app.hasExt()) {
                    mergeExt(app.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!app.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = app.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(app.extProto_);
                        }
                        onChanged();
                    }
                } else if (!app.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(app.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = app.extProto_;
                        this.bitField0_ &= -9;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) app).unknownFields);
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
                this.name_ = "";
                this.domain_ = "";
                p0 p0Var = o0.f19269e;
                this.cat_ = p0Var;
                this.sectcat_ = p0Var;
                this.pagecat_ = p0Var;
                this.cattax_ = 0;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
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
            public com.explorestack.protobuf.adcom.Context.App.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.App.access$12600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$App r3 = (com.explorestack.protobuf.adcom.Context.App) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$App r4 = (com.explorestack.protobuf.adcom.Context.App) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$App$Builder");
            }
        }

        public static final class Content extends h0 implements ContentOrBuilder {
            public static final int ALBUM_FIELD_NUMBER = 8;
            public static final int ARTIST_FIELD_NUMBER = 6;
            public static final int CATTAX_FIELD_NUMBER = 12;
            public static final int CAT_FIELD_NUMBER = 11;
            public static final int CONTEXT_FIELD_NUMBER = 14;
            public static final int DATA_FIELD_NUMBER = 25;
            public static final int EMBED_FIELD_NUMBER = 23;
            public static final int EPISODE_FIELD_NUMBER = 2;
            public static final int EXT_FIELD_NUMBER = 27;
            public static final int EXT_PROTO_FIELD_NUMBER = 26;
            public static final int GENRE_FIELD_NUMBER = 7;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ISRC_FIELD_NUMBER = 9;
            public static final int KEYWORDS_FIELD_NUMBER = 18;
            public static final int LANG_FIELD_NUMBER = 22;
            public static final int LEN_FIELD_NUMBER = 21;
            public static final int LIVE_FIELD_NUMBER = 19;
            public static final int MRATING_FIELD_NUMBER = 17;
            public static final int PRODQ_FIELD_NUMBER = 13;
            public static final int PRODUCER_FIELD_NUMBER = 24;
            public static final int RATING_FIELD_NUMBER = 15;
            public static final int SEASON_FIELD_NUMBER = 5;
            public static final int SERIES_FIELD_NUMBER = 4;
            public static final int SRCREL_FIELD_NUMBER = 20;
            public static final int TITLE_FIELD_NUMBER = 3;
            public static final int URATING_FIELD_NUMBER = 16;
            public static final int URL_FIELD_NUMBER = 10;
            private static final long serialVersionUID = 0;
            private volatile Object album_;
            private volatile Object artist_;
            private p0 cat_;
            private int cattax_;
            private int context_;
            private List<Data> data_;
            private boolean embed_;
            private int episode_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object genre_;
            private volatile Object id_;
            private volatile Object isrc_;
            private volatile Object keywords_;
            private volatile Object lang_;
            private int len_;
            private boolean live_;
            private byte memoizedIsInitialized;
            private int mrating_;
            private int prodq_;
            private Producer producer_;
            private volatile Object rating_;
            private volatile Object season_;
            private volatile Object series_;
            private int srcrel_;
            private volatile Object title_;
            private volatile Object urating_;
            private volatile Object url_;
            private static final Content DEFAULT_INSTANCE = new Content();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.App.Content.1
                @Override // com.explorestack.protobuf.p1
                public Content parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Content(lVar, wVar);
                }
            };

            public static final class Builder extends h0.b implements ContentOrBuilder {
                private Object album_;
                private Object artist_;
                private int bitField0_;
                private p0 cat_;
                private int cattax_;
                private int context_;
                private v1 dataBuilder_;
                private List<Data> data_;
                private boolean embed_;
                private int episode_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object genre_;
                private Object id_;
                private Object isrc_;
                private Object keywords_;
                private Object lang_;
                private int len_;
                private boolean live_;
                private int mrating_;
                private int prodq_;
                private a2 producerBuilder_;
                private Producer producer_;
                private Object rating_;
                private Object season_;
                private Object series_;
                private int srcrel_;
                private Object title_;
                private Object urating_;
                private Object url_;

                private void ensureCatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.cat_ = new o0(this.cat_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureDataIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.data_ = new ArrayList(this.data_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 4;
                    }
                }

                private v1 getDataFieldBuilder() {
                    if (this.dataBuilder_ == null) {
                        this.dataBuilder_ = new v1(this.data_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    return this.dataBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18815g;
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

                private a2 getProducerFieldBuilder() {
                    if (this.producerBuilder_ == null) {
                        this.producerBuilder_ = new a2(getProducer(), getParentForChildren(), isClean());
                        this.producer_ = null;
                    }
                    return this.producerBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        getDataFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllCat(Iterable<String> iterable) {
                    ensureCatIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.cat_);
                    onChanged();
                    return this;
                }

                public Builder addAllData(Iterable<? extends Data> iterable) {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureDataIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.data_);
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

                public Builder addData(Data data) {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var != null) {
                        v1Var.e(data);
                        return this;
                    }
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.add(data);
                    onChanged();
                    return this;
                }

                public Data.Builder addDataBuilder() {
                    return (Data.Builder) getDataFieldBuilder().c(Data.getDefaultInstance());
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

                public Builder clearAlbum() {
                    this.album_ = Content.getDefaultInstance().getAlbum();
                    onChanged();
                    return this;
                }

                public Builder clearArtist() {
                    this.artist_ = Content.getDefaultInstance().getArtist();
                    onChanged();
                    return this;
                }

                public Builder clearCat() {
                    this.cat_ = o0.f19269e;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearCattax() {
                    this.cattax_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearContext() {
                    this.context_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearData() {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.data_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearEmbed() {
                    this.embed_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearEpisode() {
                    this.episode_ = 0;
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

                public Builder clearGenre() {
                    this.genre_ = Content.getDefaultInstance().getGenre();
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Content.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearIsrc() {
                    this.isrc_ = Content.getDefaultInstance().getIsrc();
                    onChanged();
                    return this;
                }

                public Builder clearKeywords() {
                    this.keywords_ = Content.getDefaultInstance().getKeywords();
                    onChanged();
                    return this;
                }

                public Builder clearLang() {
                    this.lang_ = Content.getDefaultInstance().getLang();
                    onChanged();
                    return this;
                }

                public Builder clearLen() {
                    this.len_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLive() {
                    this.live_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearMrating() {
                    this.mrating_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProdq() {
                    this.prodq_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProducer() {
                    if (this.producerBuilder_ == null) {
                        this.producer_ = null;
                        onChanged();
                        return this;
                    }
                    this.producer_ = null;
                    this.producerBuilder_ = null;
                    return this;
                }

                public Builder clearRating() {
                    this.rating_ = Content.getDefaultInstance().getRating();
                    onChanged();
                    return this;
                }

                public Builder clearSeason() {
                    this.season_ = Content.getDefaultInstance().getSeason();
                    onChanged();
                    return this;
                }

                public Builder clearSeries() {
                    this.series_ = Content.getDefaultInstance().getSeries();
                    onChanged();
                    return this;
                }

                public Builder clearSrcrel() {
                    this.srcrel_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearTitle() {
                    this.title_ = Content.getDefaultInstance().getTitle();
                    onChanged();
                    return this;
                }

                public Builder clearUrating() {
                    this.urating_ = Content.getDefaultInstance().getUrating();
                    onChanged();
                    return this;
                }

                public Builder clearUrl() {
                    this.url_ = Content.getDefaultInstance().getUrl();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getAlbum() {
                    Object obj = this.album_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.album_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getAlbumBytes() {
                    Object obj = this.album_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.album_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getArtist() {
                    Object obj = this.artist_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.artist_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getArtistBytes() {
                    Object obj = this.artist_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.artist_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getCat(int i10) {
                    return (String) this.cat_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getCatBytes(int i10) {
                    return this.cat_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ContentContext getContext() {
                    ContentContext contentContextValueOf = ContentContext.valueOf(this.context_);
                    return contentContextValueOf == null ? ContentContext.UNRECOGNIZED : contentContextValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getContextValue() {
                    return this.context_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public Data getData(int i10) {
                    v1 v1Var = this.dataBuilder_;
                    return v1Var == null ? this.data_.get(i10) : (Data) v1Var.n(i10);
                }

                public Data.Builder getDataBuilder(int i10) {
                    return (Data.Builder) getDataFieldBuilder().k(i10);
                }

                public List<Data.Builder> getDataBuilderList() {
                    return getDataFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getDataCount() {
                    v1 v1Var = this.dataBuilder_;
                    return v1Var == null ? this.data_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<Data> getDataList() {
                    v1 v1Var = this.dataBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.data_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public DataOrBuilder getDataOrBuilder(int i10) {
                    v1 v1Var = this.dataBuilder_;
                    return v1Var == null ? this.data_.get(i10) : (DataOrBuilder) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<? extends DataOrBuilder> getDataOrBuilderList() {
                    v1 v1Var = this.dataBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.data_);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f18815g;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean getEmbed() {
                    return this.embed_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getEpisode() {
                    return this.episode_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getGenre() {
                    Object obj = this.genre_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.genre_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getGenreBytes() {
                    Object obj = this.genre_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.genre_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getIsrc() {
                    Object obj = this.isrc_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.isrc_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getIsrcBytes() {
                    Object obj = this.isrc_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.isrc_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getKeywords() {
                    Object obj = this.keywords_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.keywords_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getKeywordsBytes() {
                    Object obj = this.keywords_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.keywords_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getLang() {
                    Object obj = this.lang_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lang_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getLangBytes() {
                    Object obj = this.lang_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lang_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getLen() {
                    return this.len_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean getLive() {
                    return this.live_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public MediaRating getMrating() {
                    MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
                    return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getMratingValue() {
                    return this.mrating_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ProductionQuality getProdq() {
                    ProductionQuality productionQualityValueOf = ProductionQuality.valueOf(this.prodq_);
                    return productionQualityValueOf == null ? ProductionQuality.UNRECOGNIZED : productionQualityValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getProdqValue() {
                    return this.prodq_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public Producer getProducer() {
                    a2 a2Var = this.producerBuilder_;
                    if (a2Var != null) {
                        return (Producer) a2Var.e();
                    }
                    Producer producer = this.producer_;
                    return producer == null ? Producer.getDefaultInstance() : producer;
                }

                public Producer.Builder getProducerBuilder() {
                    onChanged();
                    return (Producer.Builder) getProducerFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ProducerOrBuilder getProducerOrBuilder() {
                    a2 a2Var = this.producerBuilder_;
                    if (a2Var != null) {
                        return (ProducerOrBuilder) a2Var.f();
                    }
                    Producer producer = this.producer_;
                    return producer == null ? Producer.getDefaultInstance() : producer;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getRating() {
                    Object obj = this.rating_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.rating_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getRatingBytes() {
                    Object obj = this.rating_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.rating_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getSeason() {
                    Object obj = this.season_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.season_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getSeasonBytes() {
                    Object obj = this.season_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.season_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getSeries() {
                    Object obj = this.series_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.series_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getSeriesBytes() {
                    Object obj = this.series_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.series_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getSrcrel() {
                    return this.srcrel_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getTitle() {
                    Object obj = this.title_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.title_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getTitleBytes() {
                    Object obj = this.title_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.title_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getUrating() {
                    Object obj = this.urating_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urating_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getUratingBytes() {
                    Object obj = this.urating_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.urating_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.url_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean hasProducer() {
                    return (this.producerBuilder_ == null && this.producer_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18817h.d(Content.class, Builder.class);
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

                public Builder mergeProducer(Producer producer) {
                    a2 a2Var = this.producerBuilder_;
                    if (a2Var != null) {
                        a2Var.g(producer);
                        return this;
                    }
                    Producer producer2 = this.producer_;
                    if (producer2 != null) {
                        this.producer_ = Producer.newBuilder(producer2).mergeFrom(producer).buildPartial();
                    } else {
                        this.producer_ = producer;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeData(int i10) {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureDataIsMutable();
                    this.data_.remove(i10);
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

                public Builder setAlbum(String str) {
                    str.getClass();
                    this.album_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAlbumBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.album_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setArtist(String str) {
                    str.getClass();
                    this.artist_ = str;
                    onChanged();
                    return this;
                }

                public Builder setArtistBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.artist_ = byteString;
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

                public Builder setContext(ContentContext contentContext) {
                    contentContext.getClass();
                    this.context_ = contentContext.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setContextValue(int i10) {
                    this.context_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setData(int i10, Data data) {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, data);
                        return this;
                    }
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i10, data);
                    onChanged();
                    return this;
                }

                public Builder setEmbed(boolean z10) {
                    this.embed_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setEpisode(int i10) {
                    this.episode_ = i10;
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

                public Builder setGenre(String str) {
                    str.getClass();
                    this.genre_ = str;
                    onChanged();
                    return this;
                }

                public Builder setGenreBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.genre_ = byteString;
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

                public Builder setIsrc(String str) {
                    str.getClass();
                    this.isrc_ = str;
                    onChanged();
                    return this;
                }

                public Builder setIsrcBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.isrc_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setKeywords(String str) {
                    str.getClass();
                    this.keywords_ = str;
                    onChanged();
                    return this;
                }

                public Builder setKeywordsBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.keywords_ = byteString;
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

                public Builder setLen(int i10) {
                    this.len_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLive(boolean z10) {
                    this.live_ = z10;
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

                public Builder setProdq(ProductionQuality productionQuality) {
                    productionQuality.getClass();
                    this.prodq_ = productionQuality.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setProdqValue(int i10) {
                    this.prodq_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setProducer(Producer producer) {
                    a2 a2Var = this.producerBuilder_;
                    if (a2Var != null) {
                        a2Var.i(producer);
                        return this;
                    }
                    producer.getClass();
                    this.producer_ = producer;
                    onChanged();
                    return this;
                }

                public Builder setRating(String str) {
                    str.getClass();
                    this.rating_ = str;
                    onChanged();
                    return this;
                }

                public Builder setRatingBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.rating_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSeason(String str) {
                    str.getClass();
                    this.season_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSeasonBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.season_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSeries(String str) {
                    str.getClass();
                    this.series_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSeriesBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.series_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSrcrel(int i10) {
                    this.srcrel_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setTitle(String str) {
                    str.getClass();
                    this.title_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTitleBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.title_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setUrating(String str) {
                    str.getClass();
                    this.urating_ = str;
                    onChanged();
                    return this;
                }

                public Builder setUratingBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.urating_ = byteString;
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

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public t1 getCatList() {
                    return this.cat_.getUnmodifiableView();
                }

                private Builder() {
                    this.id_ = "";
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = o0.f19269e;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.lang_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.data_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Content build() {
                    Content contentBuildPartial = buildPartial();
                    if (contentBuildPartial.isInitialized()) {
                        return contentBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) contentBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Content buildPartial() {
                    Content content = new Content(this);
                    content.id_ = this.id_;
                    content.episode_ = this.episode_;
                    content.title_ = this.title_;
                    content.series_ = this.series_;
                    content.season_ = this.season_;
                    content.artist_ = this.artist_;
                    content.genre_ = this.genre_;
                    content.album_ = this.album_;
                    content.isrc_ = this.isrc_;
                    content.url_ = this.url_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    content.cat_ = this.cat_;
                    content.cattax_ = this.cattax_;
                    content.prodq_ = this.prodq_;
                    content.context_ = this.context_;
                    content.rating_ = this.rating_;
                    content.urating_ = this.urating_;
                    content.mrating_ = this.mrating_;
                    content.keywords_ = this.keywords_;
                    content.live_ = this.live_;
                    content.srcrel_ = this.srcrel_;
                    content.len_ = this.len_;
                    content.lang_ = this.lang_;
                    content.embed_ = this.embed_;
                    a2 a2Var = this.producerBuilder_;
                    if (a2Var == null) {
                        content.producer_ = this.producer_;
                    } else {
                        content.producer_ = (Producer) a2Var.a();
                    }
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var != null) {
                        content.data_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.data_ = DesugarCollections.unmodifiableList(this.data_);
                            this.bitField0_ &= -3;
                        }
                        content.data_ = this.data_;
                    }
                    a2 a2Var2 = this.extBuilder_;
                    if (a2Var2 == null) {
                        content.ext_ = this.ext_;
                    } else {
                        content.ext_ = (Struct) a2Var2.a();
                    }
                    v1 v1Var2 = this.extProtoBuilder_;
                    if (v1Var2 != null) {
                        content.extProto_ = v1Var2.f();
                    } else {
                        if ((this.bitField0_ & 4) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -5;
                        }
                        content.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return content;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Content getDefaultInstanceForType() {
                    return Content.getDefaultInstance();
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

                public Data.Builder addDataBuilder(int i10) {
                    return (Data.Builder) getDataFieldBuilder().b(i10, Data.getDefaultInstance());
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
                    this.episode_ = 0;
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = o0.f19269e;
                    int i10 = this.bitField0_;
                    this.bitField0_ = i10 & (-2);
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.live_ = false;
                    this.srcrel_ = 0;
                    this.len_ = 0;
                    this.lang_ = "";
                    this.embed_ = false;
                    if (this.producerBuilder_ == null) {
                        this.producer_ = null;
                    } else {
                        this.producer_ = null;
                        this.producerBuilder_ = null;
                    }
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var == null) {
                        this.data_ = Collections.EMPTY_LIST;
                        this.bitField0_ = i10 & (-4);
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
                        this.bitField0_ &= -5;
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

                public Builder setProducer(Producer.Builder builder) {
                    a2 a2Var = this.producerBuilder_;
                    if (a2Var == null) {
                        this.producer_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder addData(int i10, Data data) {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var == null) {
                        data.getClass();
                        ensureDataIsMutable();
                        this.data_.add(i10, data);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, data);
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
                    if (message instanceof Content) {
                        return mergeFrom((Content) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setData(int i10, Data.Builder builder) {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var == null) {
                        ensureDataIsMutable();
                        this.data_.set(i10, builder.build());
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

                public Builder mergeFrom(Content content) {
                    if (content == Content.getDefaultInstance()) {
                        return this;
                    }
                    if (!content.getId().isEmpty()) {
                        this.id_ = content.id_;
                        onChanged();
                    }
                    if (content.getEpisode() != 0) {
                        setEpisode(content.getEpisode());
                    }
                    if (!content.getTitle().isEmpty()) {
                        this.title_ = content.title_;
                        onChanged();
                    }
                    if (!content.getSeries().isEmpty()) {
                        this.series_ = content.series_;
                        onChanged();
                    }
                    if (!content.getSeason().isEmpty()) {
                        this.season_ = content.season_;
                        onChanged();
                    }
                    if (!content.getArtist().isEmpty()) {
                        this.artist_ = content.artist_;
                        onChanged();
                    }
                    if (!content.getGenre().isEmpty()) {
                        this.genre_ = content.genre_;
                        onChanged();
                    }
                    if (!content.getAlbum().isEmpty()) {
                        this.album_ = content.album_;
                        onChanged();
                    }
                    if (!content.getIsrc().isEmpty()) {
                        this.isrc_ = content.isrc_;
                        onChanged();
                    }
                    if (!content.getUrl().isEmpty()) {
                        this.url_ = content.url_;
                        onChanged();
                    }
                    if (!content.cat_.isEmpty()) {
                        if (this.cat_.isEmpty()) {
                            this.cat_ = content.cat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCatIsMutable();
                            this.cat_.addAll(content.cat_);
                        }
                        onChanged();
                    }
                    if (content.cattax_ != 0) {
                        setCattaxValue(content.getCattaxValue());
                    }
                    if (content.prodq_ != 0) {
                        setProdqValue(content.getProdqValue());
                    }
                    if (content.context_ != 0) {
                        setContextValue(content.getContextValue());
                    }
                    if (!content.getRating().isEmpty()) {
                        this.rating_ = content.rating_;
                        onChanged();
                    }
                    if (!content.getUrating().isEmpty()) {
                        this.urating_ = content.urating_;
                        onChanged();
                    }
                    if (content.mrating_ != 0) {
                        setMratingValue(content.getMratingValue());
                    }
                    if (!content.getKeywords().isEmpty()) {
                        this.keywords_ = content.keywords_;
                        onChanged();
                    }
                    if (content.getLive()) {
                        setLive(content.getLive());
                    }
                    if (content.getSrcrel() != 0) {
                        setSrcrel(content.getSrcrel());
                    }
                    if (content.getLen() != 0) {
                        setLen(content.getLen());
                    }
                    if (!content.getLang().isEmpty()) {
                        this.lang_ = content.lang_;
                        onChanged();
                    }
                    if (content.getEmbed()) {
                        setEmbed(content.getEmbed());
                    }
                    if (content.hasProducer()) {
                        mergeProducer(content.getProducer());
                    }
                    if (this.dataBuilder_ == null) {
                        if (!content.data_.isEmpty()) {
                            if (this.data_.isEmpty()) {
                                this.data_ = content.data_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureDataIsMutable();
                                this.data_.addAll(content.data_);
                            }
                            onChanged();
                        }
                    } else if (!content.data_.isEmpty()) {
                        if (!this.dataBuilder_.t()) {
                            this.dataBuilder_.a(content.data_);
                        } else {
                            this.dataBuilder_.h();
                            this.dataBuilder_ = null;
                            this.data_ = content.data_;
                            this.bitField0_ &= -3;
                            this.dataBuilder_ = h0.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                        }
                    }
                    if (content.hasExt()) {
                        mergeExt(content.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!content.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = content.extProto_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(content.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!content.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(content.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = content.extProto_;
                            this.bitField0_ &= -5;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) content).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addData(Data.Builder builder) {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var == null) {
                        ensureDataIsMutable();
                        this.data_.add(builder.build());
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

                public Builder addData(int i10, Data.Builder builder) {
                    v1 v1Var = this.dataBuilder_;
                    if (v1Var == null) {
                        ensureDataIsMutable();
                        this.data_.add(i10, builder.build());
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

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.id_ = "";
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = o0.f19269e;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.lang_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.data_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.adcom.Context.App.Content.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.App.Content.access$7200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$App$Content r3 = (com.explorestack.protobuf.adcom.Context.App.Content) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$App$Content r4 = (com.explorestack.protobuf.adcom.Context.App.Content) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Content.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$App$Content$Builder");
                }
            }

            public static final class Producer extends h0 implements ProducerOrBuilder {
                public static final int CATTAX_FIELD_NUMBER = 5;
                public static final int CAT_FIELD_NUMBER = 4;
                public static final int DOMAIN_FIELD_NUMBER = 3;
                public static final int EXT_FIELD_NUMBER = 7;
                public static final int EXT_PROTO_FIELD_NUMBER = 6;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int NAME_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private p0 cat_;
                private int cattax_;
                private volatile Object domain_;
                private List<Any> extProto_;
                private Struct ext_;
                private volatile Object id_;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private static final Producer DEFAULT_INSTANCE = new Producer();
                private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.App.Content.Producer.1
                    @Override // com.explorestack.protobuf.p1
                    public Producer parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new Producer(lVar, wVar);
                    }
                };

                public static final class Builder extends h0.b implements ProducerOrBuilder {
                    private int bitField0_;
                    private p0 cat_;
                    private int cattax_;
                    private Object domain_;
                    private a2 extBuilder_;
                    private v1 extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private Object id_;
                    private Object name_;

                    private void ensureCatIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.cat_ = new o0(this.cat_);
                            this.bitField0_ |= 1;
                        }
                    }

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 2) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 2;
                        }
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f18819i;
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

                    public Builder clearCat() {
                        this.cat_ = o0.f19269e;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearCattax() {
                        this.cattax_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearDomain() {
                        this.domain_ = Producer.getDefaultInstance().getDomain();
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
                        this.id_ = Producer.getDefaultInstance().getId();
                        onChanged();
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Producer.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getCat(int i10) {
                        return (String) this.cat_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getCatBytes(int i10) {
                        return this.cat_.getByteString(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getCatCount() {
                        return this.cat_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public CategoryTaxonomy getCattax() {
                        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getCattaxValue() {
                        return this.cattax_;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f18819i;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getDomain() {
                        Object obj = this.domain_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.domain_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getDomainBytes() {
                        Object obj = this.domain_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.domain_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public e2 getExtOrBuilder() {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var != null) {
                            return (e2) a2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getExtProtoCount() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.size() : v1Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public List<Any> getExtProtoList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getId() {
                        Object obj = this.id_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.id_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getIdBytes() {
                        Object obj = this.id_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.id_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.h0.b
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.f18821j.d(Producer.class, Builder.class);
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

                    public Builder setDomain(String str) {
                        str.getClass();
                        this.domain_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDomainBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.domain_ = byteString;
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

                    public Builder setName(String str) {
                        str.getClass();
                        this.name_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setNameBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.name_ = byteString;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public t1 getCatList() {
                        return this.cat_.getUnmodifiableView();
                    }

                    private Builder() {
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = o0.f19269e;
                        this.cattax_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Producer build() {
                        Producer producerBuildPartial = buildPartial();
                        if (producerBuildPartial.isInitialized()) {
                            return producerBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) producerBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Producer buildPartial() {
                        Producer producer = new Producer(this);
                        producer.id_ = this.id_;
                        producer.name_ = this.name_;
                        producer.domain_ = this.domain_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.cat_ = this.cat_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        producer.cat_ = this.cat_;
                        producer.cattax_ = this.cattax_;
                        a2 a2Var = this.extBuilder_;
                        if (a2Var == null) {
                            producer.ext_ = this.ext_;
                        } else {
                            producer.ext_ = (Struct) a2Var.a();
                        }
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            producer.extProto_ = v1Var.f();
                        } else {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            producer.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return producer;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Producer getDefaultInstanceForType() {
                        return Producer.getDefaultInstance();
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
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = o0.f19269e;
                        int i10 = this.bitField0_;
                        this.bitField0_ = i10 & (-2);
                        this.cattax_ = 0;
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
                        if (message instanceof Producer) {
                            return mergeFrom((Producer) message);
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

                    public Builder mergeFrom(Producer producer) {
                        if (producer == Producer.getDefaultInstance()) {
                            return this;
                        }
                        if (!producer.getId().isEmpty()) {
                            this.id_ = producer.id_;
                            onChanged();
                        }
                        if (!producer.getName().isEmpty()) {
                            this.name_ = producer.name_;
                            onChanged();
                        }
                        if (!producer.getDomain().isEmpty()) {
                            this.domain_ = producer.domain_;
                            onChanged();
                        }
                        if (!producer.cat_.isEmpty()) {
                            if (this.cat_.isEmpty()) {
                                this.cat_ = producer.cat_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureCatIsMutable();
                                this.cat_.addAll(producer.cat_);
                            }
                            onChanged();
                        }
                        if (producer.cattax_ != 0) {
                            setCattaxValue(producer.getCattaxValue());
                        }
                        if (producer.hasExt()) {
                            mergeExt(producer.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!producer.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = producer.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(producer.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!producer.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(producer.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = producer.extProto_;
                                this.bitField0_ &= -3;
                                this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((h0) producer).unknownFields);
                        onChanged();
                        return this;
                    }

                    private Builder(h0.c cVar) {
                        super(cVar);
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = o0.f19269e;
                        this.cattax_ = 0;
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
                    public com.explorestack.protobuf.adcom.Context.App.Content.Producer.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.App.Content.Producer.access$3200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Context$App$Content$Producer r3 = (com.explorestack.protobuf.adcom.Context.App.Content.Producer) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Context$App$Content$Producer r4 = (com.explorestack.protobuf.adcom.Context.App.Content.Producer) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Content.Producer.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$App$Content$Producer$Builder");
                    }
                }

                public static Producer getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18819i;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Producer parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Producer) h0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Producer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteBuffer);
                }

                public static p1 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Producer)) {
                        return super.equals(obj);
                    }
                    Producer producer = (Producer) obj;
                    if (getId().equals(producer.getId()) && getName().equals(producer.getName()) && getDomain().equals(producer.getDomain()) && getCatList().equals(producer.getCatList()) && this.cattax_ == producer.cattax_ && hasExt() == producer.hasExt()) {
                        return (!hasExt() || getExt().equals(producer.getExt())) && getExtProtoList().equals(producer.getExtProtoList()) && this.unknownFields.equals(producer.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getCat(int i10) {
                    return (String) this.cat_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getCatBytes(int i10) {
                    return this.cat_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public e2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
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
                    if (!getNameBytes().isEmpty()) {
                        iComputeStringSize += h0.computeStringSize(2, this.name_);
                    }
                    if (!getDomainBytes().isEmpty()) {
                        iComputeStringSize += h0.computeStringSize(3, this.domain_);
                    }
                    int iComputeStringSizeNoTag = 0;
                    for (int i11 = 0; i11 < this.cat_.size(); i11++) {
                        iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.cat_.getRaw(i11));
                    }
                    int size = iComputeStringSize + iComputeStringSizeNoTag + getCatList().size();
                    if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                        size += n.l(5, this.cattax_);
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

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final r2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode()) * 37) + 3) * 53) + getDomain().hashCode();
                    if (getCatCount() > 0) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + getCatList().hashCode();
                    }
                    int iHashCode2 = (((iHashCode * 37) + 5) * 53) + this.cattax_;
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
                    return b.f18821j.d(Producer.class, Builder.class);
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
                    return new Producer();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(n nVar) throws IOException {
                    if (!getIdBytes().isEmpty()) {
                        h0.writeString(nVar, 1, this.id_);
                    }
                    if (!getNameBytes().isEmpty()) {
                        h0.writeString(nVar, 2, this.name_);
                    }
                    if (!getDomainBytes().isEmpty()) {
                        h0.writeString(nVar, 3, this.domain_);
                    }
                    for (int i10 = 0; i10 < this.cat_.size(); i10++) {
                        h0.writeString(nVar, 4, this.cat_.getRaw(i10));
                    }
                    if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                        nVar.v0(5, this.cattax_);
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        nVar.J0(6, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        nVar.J0(7, getExt());
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static Builder newBuilder(Producer producer) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(producer);
                }

                public static Producer parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteBuffer, wVar);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public t1 getCatList() {
                    return this.cat_;
                }

                private Producer(h0.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Producer parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Producer) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                }

                public static Producer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Producer getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Producer parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteString, wVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Producer() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = o0.f19269e;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static Producer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.h0
                public Builder newBuilderForType(h0.c cVar) {
                    return new Builder(cVar);
                }

                public static Producer parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(bArr, wVar);
                }

                public static Producer parseFrom(InputStream inputStream) throws IOException {
                    return (Producer) h0.parseWithIOException(PARSER, inputStream);
                }

                public static Producer parseFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Producer) h0.parseWithIOException(PARSER, inputStream, wVar);
                }

                public static Producer parseFrom(l lVar) throws IOException {
                    return (Producer) h0.parseWithIOException(PARSER, lVar);
                }

                private Producer(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        this.name_ = lVar.J();
                                    } else if (iK == 26) {
                                        this.domain_ = lVar.J();
                                    } else if (iK == 34) {
                                        String strJ = lVar.J();
                                        if ((i10 & 1) == 0) {
                                            this.cat_ = new o0();
                                            i10 |= 1;
                                        }
                                        this.cat_.add(strJ);
                                    } else if (iK == 40) {
                                        this.cattax_ = lVar.t();
                                    } else if (iK == 50) {
                                        if ((i10 & 2) == 0) {
                                            this.extProto_ = new ArrayList();
                                            i10 |= 2;
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
                                this.cat_ = this.cat_.getUnmodifiableView();
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
                        this.cat_ = this.cat_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                }

                public static Producer parseFrom(l lVar, w wVar) throws IOException {
                    return (Producer) h0.parseWithIOException(PARSER, lVar, wVar);
                }
            }

            public interface ProducerOrBuilder extends MessageOrBuilder {
                String getCat(int i10);

                ByteString getCatBytes(int i10);

                int getCatCount();

                List<String> getCatList();

                CategoryTaxonomy getCattax();

                int getCattaxValue();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

                String getDomain();

                ByteString getDomainBytes();

                Struct getExt();

                e2 getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                e getExtProtoOrBuilder(int i10);

                List<? extends e> getExtProtoOrBuilderList();

                String getId();

                ByteString getIdBytes();

                String getName();

                ByteString getNameBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static Content getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18815g;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Content parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Content) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return super.equals(obj);
                }
                Content content = (Content) obj;
                if (!getId().equals(content.getId()) || getEpisode() != content.getEpisode() || !getTitle().equals(content.getTitle()) || !getSeries().equals(content.getSeries()) || !getSeason().equals(content.getSeason()) || !getArtist().equals(content.getArtist()) || !getGenre().equals(content.getGenre()) || !getAlbum().equals(content.getAlbum()) || !getIsrc().equals(content.getIsrc()) || !getUrl().equals(content.getUrl()) || !getCatList().equals(content.getCatList()) || this.cattax_ != content.cattax_ || this.prodq_ != content.prodq_ || this.context_ != content.context_ || !getRating().equals(content.getRating()) || !getUrating().equals(content.getUrating()) || this.mrating_ != content.mrating_ || !getKeywords().equals(content.getKeywords()) || getLive() != content.getLive() || getSrcrel() != content.getSrcrel() || getLen() != content.getLen() || !getLang().equals(content.getLang()) || getEmbed() != content.getEmbed() || hasProducer() != content.hasProducer()) {
                    return false;
                }
                if ((!hasProducer() || getProducer().equals(content.getProducer())) && getDataList().equals(content.getDataList()) && hasExt() == content.hasExt()) {
                    return (!hasExt() || getExt().equals(content.getExt())) && getExtProtoList().equals(content.getExtProtoList()) && this.unknownFields.equals(content.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getAlbum() {
                Object obj = this.album_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.album_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getAlbumBytes() {
                Object obj = this.album_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.album_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getArtist() {
                Object obj = this.artist_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.artist_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getArtistBytes() {
                Object obj = this.artist_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.artist_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getCat(int i10) {
                return (String) this.cat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getCatBytes(int i10) {
                return this.cat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ContentContext getContext() {
                ContentContext contentContextValueOf = ContentContext.valueOf(this.context_);
                return contentContextValueOf == null ? ContentContext.UNRECOGNIZED : contentContextValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getContextValue() {
                return this.context_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Data getData(int i10) {
                return this.data_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getDataCount() {
                return this.data_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<Data> getDataList() {
                return this.data_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public DataOrBuilder getDataOrBuilder(int i10) {
                return this.data_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<? extends DataOrBuilder> getDataOrBuilderList() {
                return this.data_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean getEmbed() {
                return this.embed_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getEpisode() {
                return this.episode_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getGenre() {
                Object obj = this.genre_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.genre_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getGenreBytes() {
                Object obj = this.genre_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.genre_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getIsrc() {
                Object obj = this.isrc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.isrc_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getIsrcBytes() {
                Object obj = this.isrc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.isrc_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getLang() {
                Object obj = this.lang_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getLangBytes() {
                Object obj = this.lang_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getLen() {
                return this.len_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean getLive() {
                return this.live_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public MediaRating getMrating() {
                MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
                return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getMratingValue() {
                return this.mrating_;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ProductionQuality getProdq() {
                ProductionQuality productionQualityValueOf = ProductionQuality.valueOf(this.prodq_);
                return productionQualityValueOf == null ? ProductionQuality.UNRECOGNIZED : productionQualityValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getProdqValue() {
                return this.prodq_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Producer getProducer() {
                Producer producer = this.producer_;
                return producer == null ? Producer.getDefaultInstance() : producer;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ProducerOrBuilder getProducerOrBuilder() {
                return getProducer();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getRating() {
                Object obj = this.rating_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.rating_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getRatingBytes() {
                Object obj = this.rating_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.rating_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getSeason() {
                Object obj = this.season_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.season_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getSeasonBytes() {
                Object obj = this.season_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.season_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
                int i11 = this.episode_;
                if (i11 != 0) {
                    iComputeStringSize += n.Y(2, i11);
                }
                if (!getTitleBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(3, this.title_);
                }
                if (!getSeriesBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(4, this.series_);
                }
                if (!getSeasonBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(5, this.season_);
                }
                if (!getArtistBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(6, this.artist_);
                }
                if (!getGenreBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(7, this.genre_);
                }
                if (!getAlbumBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(8, this.album_);
                }
                if (!getIsrcBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(9, this.isrc_);
                }
                if (!getUrlBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(10, this.url_);
                }
                int iComputeStringSizeNoTag = 0;
                for (int i12 = 0; i12 < this.cat_.size(); i12++) {
                    iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.cat_.getRaw(i12));
                }
                int size = iComputeStringSize + iComputeStringSizeNoTag + getCatList().size();
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    size += n.l(12, this.cattax_);
                }
                if (this.prodq_ != ProductionQuality.PRODUCTION_QUALITY_INVALID.getNumber()) {
                    size += n.l(13, this.prodq_);
                }
                if (this.context_ != ContentContext.CONTENT_CONTEXT_INVALID.getNumber()) {
                    size += n.l(14, this.context_);
                }
                if (!getRatingBytes().isEmpty()) {
                    size += h0.computeStringSize(15, this.rating_);
                }
                if (!getUratingBytes().isEmpty()) {
                    size += h0.computeStringSize(16, this.urating_);
                }
                if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
                    size += n.l(17, this.mrating_);
                }
                if (!getKeywordsBytes().isEmpty()) {
                    size += h0.computeStringSize(18, this.keywords_);
                }
                boolean z10 = this.live_;
                if (z10) {
                    size += n.e(19, z10);
                }
                int i13 = this.srcrel_;
                if (i13 != 0) {
                    size += n.Y(20, i13);
                }
                int i14 = this.len_;
                if (i14 != 0) {
                    size += n.Y(21, i14);
                }
                if (!getLangBytes().isEmpty()) {
                    size += h0.computeStringSize(22, this.lang_);
                }
                boolean z11 = this.embed_;
                if (z11) {
                    size += n.e(23, z11);
                }
                if (this.producer_ != null) {
                    size += n.G(24, getProducer());
                }
                for (int i15 = 0; i15 < this.data_.size(); i15++) {
                    size += n.G(25, this.data_.get(i15));
                }
                for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
                    size += n.G(26, this.extProto_.get(i16));
                }
                if (this.ext_ != null) {
                    size += n.G(27, getExt());
                }
                int serializedSize = size + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getSeries() {
                Object obj = this.series_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.series_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getSeriesBytes() {
                Object obj = this.series_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.series_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getSrcrel() {
                return this.srcrel_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getUrating() {
                Object obj = this.urating_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.urating_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getUratingBytes() {
                Object obj = this.urating_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.urating_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean hasProducer() {
                return this.producer_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getEpisode()) * 37) + 3) * 53) + getTitle().hashCode()) * 37) + 4) * 53) + getSeries().hashCode()) * 37) + 5) * 53) + getSeason().hashCode()) * 37) + 6) * 53) + getArtist().hashCode()) * 37) + 7) * 53) + getGenre().hashCode()) * 37) + 8) * 53) + getAlbum().hashCode()) * 37) + 9) * 53) + getIsrc().hashCode()) * 37) + 10) * 53) + getUrl().hashCode();
                if (getCatCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 11) * 53) + getCatList().hashCode();
                }
                int iHashCode2 = (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 37) + 12) * 53) + this.cattax_) * 37) + 13) * 53) + this.prodq_) * 37) + 14) * 53) + this.context_) * 37) + 15) * 53) + getRating().hashCode()) * 37) + 16) * 53) + getUrating().hashCode()) * 37) + 17) * 53) + this.mrating_) * 37) + 18) * 53) + getKeywords().hashCode()) * 37) + 19) * 53) + j0.d(getLive())) * 37) + 20) * 53) + getSrcrel()) * 37) + 21) * 53) + getLen()) * 37) + 22) * 53) + getLang().hashCode()) * 37) + 23) * 53) + j0.d(getEmbed());
                if (hasProducer()) {
                    iHashCode2 = (((iHashCode2 * 37) + 24) * 53) + getProducer().hashCode();
                }
                if (getDataCount() > 0) {
                    iHashCode2 = (((iHashCode2 * 37) + 25) * 53) + getDataList().hashCode();
                }
                if (hasExt()) {
                    iHashCode2 = (((iHashCode2 * 37) + 27) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode2 = (((iHashCode2 * 37) + 26) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18817h.d(Content.class, Builder.class);
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
                return new Content();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.id_);
                }
                int i10 = this.episode_;
                if (i10 != 0) {
                    nVar.W0(2, i10);
                }
                if (!getTitleBytes().isEmpty()) {
                    h0.writeString(nVar, 3, this.title_);
                }
                if (!getSeriesBytes().isEmpty()) {
                    h0.writeString(nVar, 4, this.series_);
                }
                if (!getSeasonBytes().isEmpty()) {
                    h0.writeString(nVar, 5, this.season_);
                }
                if (!getArtistBytes().isEmpty()) {
                    h0.writeString(nVar, 6, this.artist_);
                }
                if (!getGenreBytes().isEmpty()) {
                    h0.writeString(nVar, 7, this.genre_);
                }
                if (!getAlbumBytes().isEmpty()) {
                    h0.writeString(nVar, 8, this.album_);
                }
                if (!getIsrcBytes().isEmpty()) {
                    h0.writeString(nVar, 9, this.isrc_);
                }
                if (!getUrlBytes().isEmpty()) {
                    h0.writeString(nVar, 10, this.url_);
                }
                for (int i11 = 0; i11 < this.cat_.size(); i11++) {
                    h0.writeString(nVar, 11, this.cat_.getRaw(i11));
                }
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    nVar.v0(12, this.cattax_);
                }
                if (this.prodq_ != ProductionQuality.PRODUCTION_QUALITY_INVALID.getNumber()) {
                    nVar.v0(13, this.prodq_);
                }
                if (this.context_ != ContentContext.CONTENT_CONTEXT_INVALID.getNumber()) {
                    nVar.v0(14, this.context_);
                }
                if (!getRatingBytes().isEmpty()) {
                    h0.writeString(nVar, 15, this.rating_);
                }
                if (!getUratingBytes().isEmpty()) {
                    h0.writeString(nVar, 16, this.urating_);
                }
                if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
                    nVar.v0(17, this.mrating_);
                }
                if (!getKeywordsBytes().isEmpty()) {
                    h0.writeString(nVar, 18, this.keywords_);
                }
                boolean z10 = this.live_;
                if (z10) {
                    nVar.n0(19, z10);
                }
                int i12 = this.srcrel_;
                if (i12 != 0) {
                    nVar.W0(20, i12);
                }
                int i13 = this.len_;
                if (i13 != 0) {
                    nVar.W0(21, i13);
                }
                if (!getLangBytes().isEmpty()) {
                    h0.writeString(nVar, 22, this.lang_);
                }
                boolean z11 = this.embed_;
                if (z11) {
                    nVar.n0(23, z11);
                }
                if (this.producer_ != null) {
                    nVar.J0(24, getProducer());
                }
                for (int i14 = 0; i14 < this.data_.size(); i14++) {
                    nVar.J0(25, this.data_.get(i14));
                }
                for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                    nVar.J0(26, this.extProto_.get(i15));
                }
                if (this.ext_ != null) {
                    nVar.J0(27, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static Builder newBuilder(Content content) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(content);
            }

            public static Content parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteBuffer, wVar);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public t1 getCatList() {
                return this.cat_;
            }

            private Content(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Content parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Content) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Content getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Content parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Content() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.title_ = "";
                this.series_ = "";
                this.season_ = "";
                this.artist_ = "";
                this.genre_ = "";
                this.album_ = "";
                this.isrc_ = "";
                this.url_ = "";
                this.cat_ = o0.f19269e;
                this.cattax_ = 0;
                this.prodq_ = 0;
                this.context_ = 0;
                this.rating_ = "";
                this.urating_ = "";
                this.mrating_ = 0;
                this.keywords_ = "";
                this.lang_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
            }

            public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Content parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(bArr, wVar);
            }

            public static Content parseFrom(InputStream inputStream) throws IOException {
                return (Content) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Content parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Content) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Content parseFrom(l lVar) throws IOException {
                return (Content) h0.parseWithIOException(PARSER, lVar);
            }

            public static Content parseFrom(l lVar, w wVar) throws IOException {
                return (Content) h0.parseWithIOException(PARSER, lVar, wVar);
            }

            private Content(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.episode_ = lVar.L();
                                    break;
                                case 26:
                                    this.title_ = lVar.J();
                                    break;
                                case 34:
                                    this.series_ = lVar.J();
                                    break;
                                case 42:
                                    this.season_ = lVar.J();
                                    break;
                                case 50:
                                    this.artist_ = lVar.J();
                                    break;
                                case 58:
                                    this.genre_ = lVar.J();
                                    break;
                                case 66:
                                    this.album_ = lVar.J();
                                    break;
                                case 74:
                                    this.isrc_ = lVar.J();
                                    break;
                                case 82:
                                    this.url_ = lVar.J();
                                    break;
                                case 90:
                                    String strJ = lVar.J();
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 == 0) {
                                        this.cat_ = new o0();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.cat_.add(strJ);
                                    break;
                                case 96:
                                    this.cattax_ = lVar.t();
                                    break;
                                case 104:
                                    this.prodq_ = lVar.t();
                                    break;
                                case 112:
                                    this.context_ = lVar.t();
                                    break;
                                case 122:
                                    this.rating_ = lVar.J();
                                    break;
                                case 130:
                                    this.urating_ = lVar.J();
                                    break;
                                case 136:
                                    this.mrating_ = lVar.t();
                                    break;
                                case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                                    this.keywords_ = lVar.J();
                                    break;
                                case 152:
                                    this.live_ = lVar.q();
                                    break;
                                case 160:
                                    this.srcrel_ = lVar.L();
                                    break;
                                case 168:
                                    this.len_ = lVar.L();
                                    break;
                                case 178:
                                    this.lang_ = lVar.J();
                                    break;
                                case 184:
                                    this.embed_ = lVar.q();
                                    break;
                                case 194:
                                    Producer producer = this.producer_;
                                    Producer.Builder builder = producer != null ? producer.toBuilder() : null;
                                    Producer producer2 = (Producer) lVar.A(Producer.parser(), wVar);
                                    this.producer_ = producer2;
                                    if (builder != null) {
                                        builder.mergeFrom(producer2);
                                        this.producer_ = builder.buildPartial();
                                    }
                                    break;
                                case 202:
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.data_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.data_.add((Data) lVar.A(Data.parser(), wVar));
                                    break;
                                case 210:
                                    int i13 = (i10 == true ? 1 : 0) & 4;
                                    i10 = i10;
                                    if (i13 == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                    break;
                                case MRAID_JS_DOES_NOT_EXIST_VALUE:
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
                            this.cat_ = this.cat_.getUnmodifiableView();
                        }
                        if (((i10 == true ? 1 : 0) & 2) != 0) {
                            this.data_ = DesugarCollections.unmodifiableList(this.data_);
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
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.data_ = DesugarCollections.unmodifiableList(this.data_);
                }
                if (((i10 == true ? 1 : 0) & 4) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }
        }

        public interface ContentOrBuilder extends MessageOrBuilder {
            String getAlbum();

            ByteString getAlbumBytes();

            String getArtist();

            ByteString getArtistBytes();

            String getCat(int i10);

            ByteString getCatBytes(int i10);

            int getCatCount();

            List<String> getCatList();

            CategoryTaxonomy getCattax();

            int getCattaxValue();

            ContentContext getContext();

            int getContextValue();

            Data getData(int i10);

            int getDataCount();

            List<Data> getDataList();

            DataOrBuilder getDataOrBuilder(int i10);

            List<? extends DataOrBuilder> getDataOrBuilderList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            boolean getEmbed();

            int getEpisode();

            Struct getExt();

            e2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            String getGenre();

            ByteString getGenreBytes();

            String getId();

            ByteString getIdBytes();

            String getIsrc();

            ByteString getIsrcBytes();

            String getKeywords();

            ByteString getKeywordsBytes();

            String getLang();

            ByteString getLangBytes();

            int getLen();

            boolean getLive();

            MediaRating getMrating();

            int getMratingValue();

            ProductionQuality getProdq();

            int getProdqValue();

            Content.Producer getProducer();

            Content.ProducerOrBuilder getProducerOrBuilder();

            String getRating();

            ByteString getRatingBytes();

            String getSeason();

            ByteString getSeasonBytes();

            String getSeries();

            ByteString getSeriesBytes();

            int getSrcrel();

            String getTitle();

            ByteString getTitleBytes();

            String getUrating();

            ByteString getUratingBytes();

            String getUrl();

            ByteString getUrlBytes();

            boolean hasExt();

            boolean hasProducer();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Publisher extends h0 implements PublisherOrBuilder {
            public static final int CATTAX_FIELD_NUMBER = 5;
            public static final int CAT_FIELD_NUMBER = 4;
            public static final int DOMAIN_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private p0 cat_;
            private int cattax_;
            private volatile Object domain_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private static final Publisher DEFAULT_INSTANCE = new Publisher();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.App.Publisher.1
                @Override // com.explorestack.protobuf.p1
                public Publisher parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Publisher(lVar, wVar);
                }
            };

            public static final class Builder extends h0.b implements PublisherOrBuilder {
                private int bitField0_;
                private p0 cat_;
                private int cattax_;
                private Object domain_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object name_;

                private void ensureCatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.cat_ = new o0(this.cat_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18811e;
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

                public Builder clearCat() {
                    this.cat_ = o0.f19269e;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearCattax() {
                    this.cattax_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearDomain() {
                    this.domain_ = Publisher.getDefaultInstance().getDomain();
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
                    this.id_ = Publisher.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = Publisher.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getCat(int i10) {
                    return (String) this.cat_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getCatBytes(int i10) {
                    return this.cat_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f18811e;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18813f.d(Publisher.class, Builder.class);
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

                public Builder setDomain(String str) {
                    str.getClass();
                    this.domain_ = str;
                    onChanged();
                    return this;
                }

                public Builder setDomainBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.domain_ = byteString;
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

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public t1 getCatList() {
                    return this.cat_.getUnmodifiableView();
                }

                private Builder() {
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = o0.f19269e;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Publisher build() {
                    Publisher publisherBuildPartial = buildPartial();
                    if (publisherBuildPartial.isInitialized()) {
                        return publisherBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) publisherBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Publisher buildPartial() {
                    Publisher publisher = new Publisher(this);
                    publisher.id_ = this.id_;
                    publisher.name_ = this.name_;
                    publisher.domain_ = this.domain_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    publisher.cat_ = this.cat_;
                    publisher.cattax_ = this.cattax_;
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        publisher.ext_ = this.ext_;
                    } else {
                        publisher.ext_ = (Struct) a2Var.a();
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        publisher.extProto_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        publisher.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return publisher;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Publisher getDefaultInstanceForType() {
                    return Publisher.getDefaultInstance();
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
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = o0.f19269e;
                    int i10 = this.bitField0_;
                    this.bitField0_ = i10 & (-2);
                    this.cattax_ = 0;
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
                    if (message instanceof Publisher) {
                        return mergeFrom((Publisher) message);
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

                public Builder mergeFrom(Publisher publisher) {
                    if (publisher == Publisher.getDefaultInstance()) {
                        return this;
                    }
                    if (!publisher.getId().isEmpty()) {
                        this.id_ = publisher.id_;
                        onChanged();
                    }
                    if (!publisher.getName().isEmpty()) {
                        this.name_ = publisher.name_;
                        onChanged();
                    }
                    if (!publisher.getDomain().isEmpty()) {
                        this.domain_ = publisher.domain_;
                        onChanged();
                    }
                    if (!publisher.cat_.isEmpty()) {
                        if (this.cat_.isEmpty()) {
                            this.cat_ = publisher.cat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCatIsMutable();
                            this.cat_.addAll(publisher.cat_);
                        }
                        onChanged();
                    }
                    if (publisher.cattax_ != 0) {
                        setCattaxValue(publisher.getCattaxValue());
                    }
                    if (publisher.hasExt()) {
                        mergeExt(publisher.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!publisher.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = publisher.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(publisher.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!publisher.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(publisher.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = publisher.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) publisher).unknownFields);
                    onChanged();
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = o0.f19269e;
                    this.cattax_ = 0;
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
                public com.explorestack.protobuf.adcom.Context.App.Publisher.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.App.Publisher.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$App$Publisher r3 = (com.explorestack.protobuf.adcom.Context.App.Publisher) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$App$Publisher r4 = (com.explorestack.protobuf.adcom.Context.App.Publisher) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Publisher.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$App$Publisher$Builder");
                }
            }

            public static Publisher getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18811e;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Publisher parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Publisher) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Publisher parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Publisher)) {
                    return super.equals(obj);
                }
                Publisher publisher = (Publisher) obj;
                if (getId().equals(publisher.getId()) && getName().equals(publisher.getName()) && getDomain().equals(publisher.getDomain()) && getCatList().equals(publisher.getCatList()) && this.cattax_ == publisher.cattax_ && hasExt() == publisher.hasExt()) {
                    return (!hasExt() || getExt().equals(publisher.getExt())) && getExtProtoList().equals(publisher.getExtProtoList()) && this.unknownFields.equals(publisher.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getCat(int i10) {
                return (String) this.cat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getCatBytes(int i10) {
                return this.cat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
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
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(2, this.name_);
                }
                if (!getDomainBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(3, this.domain_);
                }
                int iComputeStringSizeNoTag = 0;
                for (int i11 = 0; i11 < this.cat_.size(); i11++) {
                    iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.cat_.getRaw(i11));
                }
                int size = iComputeStringSize + iComputeStringSizeNoTag + getCatList().size();
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    size += n.l(5, this.cattax_);
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

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode()) * 37) + 3) * 53) + getDomain().hashCode();
                if (getCatCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getCatList().hashCode();
                }
                int iHashCode2 = (((iHashCode * 37) + 5) * 53) + this.cattax_;
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
                return b.f18813f.d(Publisher.class, Builder.class);
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
                return new Publisher();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.id_);
                }
                if (!getNameBytes().isEmpty()) {
                    h0.writeString(nVar, 2, this.name_);
                }
                if (!getDomainBytes().isEmpty()) {
                    h0.writeString(nVar, 3, this.domain_);
                }
                for (int i10 = 0; i10 < this.cat_.size(); i10++) {
                    h0.writeString(nVar, 4, this.cat_.getRaw(i10));
                }
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    nVar.v0(5, this.cattax_);
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    nVar.J0(6, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    nVar.J0(7, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static Builder newBuilder(Publisher publisher) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(publisher);
            }

            public static Publisher parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteBuffer, wVar);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public t1 getCatList() {
                return this.cat_;
            }

            private Publisher(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Publisher parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Publisher) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Publisher parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Publisher getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Publisher parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Publisher() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                this.cat_ = o0.f19269e;
                this.cattax_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Publisher parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Publisher parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(bArr, wVar);
            }

            public static Publisher parseFrom(InputStream inputStream) throws IOException {
                return (Publisher) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Publisher parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Publisher) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Publisher parseFrom(l lVar) throws IOException {
                return (Publisher) h0.parseWithIOException(PARSER, lVar);
            }

            private Publisher(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.name_ = lVar.J();
                                } else if (iK == 26) {
                                    this.domain_ = lVar.J();
                                } else if (iK == 34) {
                                    String strJ = lVar.J();
                                    if ((i10 & 1) == 0) {
                                        this.cat_ = new o0();
                                        i10 |= 1;
                                    }
                                    this.cat_.add(strJ);
                                } else if (iK == 40) {
                                    this.cattax_ = lVar.t();
                                } else if (iK == 50) {
                                    if ((i10 & 2) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 2;
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
                            this.cat_ = this.cat_.getUnmodifiableView();
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
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Publisher parseFrom(l lVar, w wVar) throws IOException {
                return (Publisher) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface PublisherOrBuilder extends MessageOrBuilder {
            String getCat(int i10);

            ByteString getCatBytes(int i10);

            int getCatCount();

            List<String> getCatList();

            CategoryTaxonomy getCattax();

            int getCattaxValue();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            String getDomain();

            ByteString getDomainBytes();

            Struct getExt();

            e2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getName();

            ByteString getNameBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Release extends h0 implements ReleaseOrBuilder {
            private static final Release DEFAULT_INSTANCE = new Release();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.App.Release.1
                @Override // com.explorestack.protobuf.p1
                public Release parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Release(lVar, wVar);
                }
            };
            public static final int SIGNATURESHA1_FIELD_NUMBER = 2;
            public static final int SIGNATURESHA256_FIELD_NUMBER = 3;
            public static final int TYPE_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private volatile Object signatureSHA1_;
            private volatile Object signatureSHA256_;
            private volatile Object type_;

            public static Release getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18823k;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Release parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Release) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Release parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Release)) {
                    return super.equals(obj);
                }
                Release release = (Release) obj;
                return getType().equals(release.getType()) && getSignatureSHA1().equals(release.getSignatureSHA1()) && getSignatureSHA256().equals(release.getSignatureSHA256()) && this.unknownFields.equals(release.unknownFields);
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
                if (!getSignatureSHA1Bytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(2, this.signatureSHA1_);
                }
                if (!getSignatureSHA256Bytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(3, this.signatureSHA256_);
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getSignatureSHA1() {
                Object obj = this.signatureSHA1_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signatureSHA1_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public ByteString getSignatureSHA1Bytes() {
                Object obj = this.signatureSHA1_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signatureSHA1_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getSignatureSHA256() {
                Object obj = this.signatureSHA256_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signatureSHA256_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public ByteString getSignatureSHA256Bytes() {
                Object obj = this.signatureSHA256_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signatureSHA256_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
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

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode()) * 37) + 2) * 53) + getSignatureSHA1().hashCode()) * 37) + 3) * 53) + getSignatureSHA256().hashCode()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18825l.d(Release.class, Builder.class);
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
                return new Release();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getTypeBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.type_);
                }
                if (!getSignatureSHA1Bytes().isEmpty()) {
                    h0.writeString(nVar, 2, this.signatureSHA1_);
                }
                if (!getSignatureSHA256Bytes().isEmpty()) {
                    h0.writeString(nVar, 3, this.signatureSHA256_);
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements ReleaseOrBuilder {
                private Object signatureSHA1_;
                private Object signatureSHA256_;
                private Object type_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18823k;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearSignatureSHA1() {
                    this.signatureSHA1_ = Release.getDefaultInstance().getSignatureSHA1();
                    onChanged();
                    return this;
                }

                public Builder clearSignatureSHA256() {
                    this.signatureSHA256_ = Release.getDefaultInstance().getSignatureSHA256();
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = Release.getDefaultInstance().getType();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f18823k;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getSignatureSHA1() {
                    Object obj = this.signatureSHA1_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.signatureSHA1_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getSignatureSHA1Bytes() {
                    Object obj = this.signatureSHA1_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.signatureSHA1_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getSignatureSHA256() {
                    Object obj = this.signatureSHA256_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.signatureSHA256_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getSignatureSHA256Bytes() {
                    Object obj = this.signatureSHA256_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.signatureSHA256_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getType() {
                    Object obj = this.type_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.type_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getTypeBytes() {
                    Object obj = this.type_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.type_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18825l.d(Release.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setSignatureSHA1(String str) {
                    str.getClass();
                    this.signatureSHA1_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA1Bytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.signatureSHA1_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA256(String str) {
                    str.getClass();
                    this.signatureSHA256_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA256Bytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.signatureSHA256_ = byteString;
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

                private Builder() {
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Release build() {
                    Release releaseBuildPartial = buildPartial();
                    if (releaseBuildPartial.isInitialized()) {
                        return releaseBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) releaseBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Release buildPartial() {
                    Release release = new Release(this);
                    release.type_ = this.type_;
                    release.signatureSHA1_ = this.signatureSHA1_;
                    release.signatureSHA256_ = this.signatureSHA256_;
                    onBuilt();
                    return release;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Release getDefaultInstanceForType() {
                    return Release.getDefaultInstance();
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
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Release) {
                        return mergeFrom((Release) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Release release) {
                    if (release == Release.getDefaultInstance()) {
                        return this;
                    }
                    if (!release.getType().isEmpty()) {
                        this.type_ = release.type_;
                        onChanged();
                    }
                    if (!release.getSignatureSHA1().isEmpty()) {
                        this.signatureSHA1_ = release.signatureSHA1_;
                        onChanged();
                    }
                    if (!release.getSignatureSHA256().isEmpty()) {
                        this.signatureSHA256_ = release.signatureSHA256_;
                        onChanged();
                    }
                    mergeUnknownFields(((h0) release).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.adcom.Context.App.Release.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.App.Release.access$9600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$App$Release r3 = (com.explorestack.protobuf.adcom.Context.App.Release) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$App$Release r4 = (com.explorestack.protobuf.adcom.Context.App.Release) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Release.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$App$Release$Builder");
                }
            }

            public static Builder newBuilder(Release release) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(release);
            }

            public static Release parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Release(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Release parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Release) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Release parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Release getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Release parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Release() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = "";
                this.signatureSHA1_ = "";
                this.signatureSHA256_ = "";
            }

            public static Release parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Release parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(bArr, wVar);
            }

            public static Release parseFrom(InputStream inputStream) throws IOException {
                return (Release) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Release parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Release) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            private Release(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.type_ = lVar.J();
                                } else if (iK == 18) {
                                    this.signatureSHA1_ = lVar.J();
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.signatureSHA256_ = lVar.J();
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

            public static Release parseFrom(l lVar) throws IOException {
                return (Release) h0.parseWithIOException(PARSER, lVar);
            }

            public static Release parseFrom(l lVar, w wVar) throws IOException {
                return (Release) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface ReleaseOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            String getSignatureSHA1();

            ByteString getSignatureSHA1Bytes();

            String getSignatureSHA256();

            ByteString getSignatureSHA256Bytes();

            String getType();

            ByteString getTypeBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static App getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18807c;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (App) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof App)) {
                return super.equals(obj);
            }
            App app = (App) obj;
            if (!getId().equals(app.getId()) || !getName().equals(app.getName()) || hasPub() != app.hasPub()) {
                return false;
            }
            if ((hasPub() && !getPub().equals(app.getPub())) || hasContent() != app.hasContent()) {
                return false;
            }
            if ((hasContent() && !getContent().equals(app.getContent())) || !getDomain().equals(app.getDomain()) || !getCatList().equals(app.getCatList()) || !getSectcatList().equals(app.getSectcatList()) || !getPagecatList().equals(app.getPagecatList()) || this.cattax_ != app.cattax_ || getPrivpolicy() != app.getPrivpolicy() || !getKeywords().equals(app.getKeywords()) || !getBundle().equals(app.getBundle()) || !getStoreid().equals(app.getStoreid()) || !getStoreurl().equals(app.getStoreurl()) || !getVer().equals(app.getVer()) || getPaid() != app.getPaid() || hasRelease() != app.hasRelease()) {
                return false;
            }
            if ((!hasRelease() || getRelease().equals(app.getRelease())) && hasExt() == app.hasExt()) {
                return (!hasExt() || getExt().equals(app.getExt())) && getExtProtoList().equals(app.getExtProtoList()) && this.unknownFields.equals(app.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getCat(int i10) {
            return (String) this.cat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getCatBytes(int i10) {
            return this.cat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getCatCount() {
            return this.cat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Content getContent() {
            Content content = this.content_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ContentOrBuilder getContentOrBuilder() {
            return getContent();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getDomain() {
            Object obj = this.domain_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domain_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getDomainBytes() {
            Object obj = this.domain_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domain_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getKeywords() {
            Object obj = this.keywords_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keywords_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getKeywordsBytes() {
            Object obj = this.keywords_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keywords_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getPagecat(int i10) {
            return (String) this.pagecat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getPagecatBytes(int i10) {
            return this.pagecat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getPagecatCount() {
            return this.pagecat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean getPaid() {
            return this.paid_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean getPrivpolicy() {
            return this.privpolicy_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Publisher getPub() {
            Publisher publisher = this.pub_;
            return publisher == null ? Publisher.getDefaultInstance() : publisher;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public PublisherOrBuilder getPubOrBuilder() {
            return getPub();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Release getRelease() {
            Release release = this.release_;
            return release == null ? Release.getDefaultInstance() : release;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ReleaseOrBuilder getReleaseOrBuilder() {
            return getRelease();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getSectcat(int i10) {
            return (String) this.sectcat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getSectcatBytes(int i10) {
            return this.sectcat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getSectcatCount() {
            return this.sectcat_.size();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
            if (!getNameBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.name_);
            }
            if (this.pub_ != null) {
                iComputeStringSize += n.G(3, getPub());
            }
            if (this.content_ != null) {
                iComputeStringSize += n.G(4, getContent());
            }
            if (!getDomainBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(5, this.domain_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.cat_.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.cat_.getRaw(i11));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + getCatList().size();
            int iComputeStringSizeNoTag2 = 0;
            for (int i12 = 0; i12 < this.sectcat_.size(); i12++) {
                iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.sectcat_.getRaw(i12));
            }
            int size2 = size + iComputeStringSizeNoTag2 + getSectcatList().size();
            int iComputeStringSizeNoTag3 = 0;
            for (int i13 = 0; i13 < this.pagecat_.size(); i13++) {
                iComputeStringSizeNoTag3 += h0.computeStringSizeNoTag(this.pagecat_.getRaw(i13));
            }
            int size3 = size2 + iComputeStringSizeNoTag3 + getPagecatList().size();
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                size3 += n.l(9, this.cattax_);
            }
            boolean z10 = this.privpolicy_;
            if (z10) {
                size3 += n.e(10, z10);
            }
            if (!getKeywordsBytes().isEmpty()) {
                size3 += h0.computeStringSize(11, this.keywords_);
            }
            if (!getBundleBytes().isEmpty()) {
                size3 += h0.computeStringSize(12, this.bundle_);
            }
            if (!getStoreidBytes().isEmpty()) {
                size3 += h0.computeStringSize(13, this.storeid_);
            }
            if (!getStoreurlBytes().isEmpty()) {
                size3 += h0.computeStringSize(14, this.storeurl_);
            }
            if (!getVerBytes().isEmpty()) {
                size3 += h0.computeStringSize(15, this.ver_);
            }
            boolean z11 = this.paid_;
            if (z11) {
                size3 += n.e(16, z11);
            }
            for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                size3 += n.G(17, this.extProto_.get(i14));
            }
            if (this.ext_ != null) {
                size3 += n.G(18, getExt());
            }
            if (this.release_ != null) {
                size3 += n.G(19, getRelease());
            }
            int serializedSize = size3 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getStoreid() {
            Object obj = this.storeid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getStoreidBytes() {
            Object obj = this.storeid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getStoreurl() {
            Object obj = this.storeurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeurl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getStoreurlBytes() {
            Object obj = this.storeurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeurl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getVer() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasContent() {
            return this.content_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasPub() {
            return this.pub_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasRelease() {
            return this.release_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode();
            if (hasPub()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPub().hashCode();
            }
            if (hasContent()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getContent().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 5) * 53) + getDomain().hashCode();
            if (getCatCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getCatList().hashCode();
            }
            if (getSectcatCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getSectcatList().hashCode();
            }
            if (getPagecatCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 8) * 53) + getPagecatList().hashCode();
            }
            int iD = (((((((((((((((((((((((((((((((iHashCode2 * 37) + 9) * 53) + this.cattax_) * 37) + 10) * 53) + j0.d(getPrivpolicy())) * 37) + 11) * 53) + getKeywords().hashCode()) * 37) + 12) * 53) + getBundle().hashCode()) * 37) + 13) * 53) + getStoreid().hashCode()) * 37) + 14) * 53) + getStoreurl().hashCode()) * 37) + 15) * 53) + getVer().hashCode()) * 37) + 16) * 53) + j0.d(getPaid());
            if (hasRelease()) {
                iD = (((iD * 37) + 19) * 53) + getRelease().hashCode();
            }
            if (hasExt()) {
                iD = (((iD * 37) + 18) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iD = (((iD * 37) + 17) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = (iD * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.f18809d.d(App.class, Builder.class);
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
            return new App();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.id_);
            }
            if (!getNameBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.name_);
            }
            if (this.pub_ != null) {
                nVar.J0(3, getPub());
            }
            if (this.content_ != null) {
                nVar.J0(4, getContent());
            }
            if (!getDomainBytes().isEmpty()) {
                h0.writeString(nVar, 5, this.domain_);
            }
            for (int i10 = 0; i10 < this.cat_.size(); i10++) {
                h0.writeString(nVar, 6, this.cat_.getRaw(i10));
            }
            for (int i11 = 0; i11 < this.sectcat_.size(); i11++) {
                h0.writeString(nVar, 7, this.sectcat_.getRaw(i11));
            }
            for (int i12 = 0; i12 < this.pagecat_.size(); i12++) {
                h0.writeString(nVar, 8, this.pagecat_.getRaw(i12));
            }
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                nVar.v0(9, this.cattax_);
            }
            boolean z10 = this.privpolicy_;
            if (z10) {
                nVar.n0(10, z10);
            }
            if (!getKeywordsBytes().isEmpty()) {
                h0.writeString(nVar, 11, this.keywords_);
            }
            if (!getBundleBytes().isEmpty()) {
                h0.writeString(nVar, 12, this.bundle_);
            }
            if (!getStoreidBytes().isEmpty()) {
                h0.writeString(nVar, 13, this.storeid_);
            }
            if (!getStoreurlBytes().isEmpty()) {
                h0.writeString(nVar, 14, this.storeurl_);
            }
            if (!getVerBytes().isEmpty()) {
                h0.writeString(nVar, 15, this.ver_);
            }
            boolean z11 = this.paid_;
            if (z11) {
                nVar.n0(16, z11);
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                nVar.J0(17, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                nVar.J0(18, getExt());
            }
            if (this.release_ != null) {
                nVar.J0(19, getRelease());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(App app) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
        }

        public static App parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteBuffer, wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public t1 getCatList() {
            return this.cat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public t1 getPagecatList() {
            return this.pagecat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public t1 getSectcatList() {
            return this.sectcat_;
        }

        private App(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static App parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (App) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public App getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static App parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private App() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.name_ = "";
            this.domain_ = "";
            p0 p0Var = o0.f19269e;
            this.cat_ = p0Var;
            this.sectcat_ = p0Var;
            this.pagecat_ = p0Var;
            this.cattax_ = 0;
            this.keywords_ = "";
            this.bundle_ = "";
            this.storeid_ = "";
            this.storeurl_ = "";
            this.ver_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static App parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(bArr, wVar);
        }

        public static App parseFrom(InputStream inputStream) throws IOException {
            return (App) h0.parseWithIOException(PARSER, inputStream);
        }

        public static App parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (App) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static App parseFrom(l lVar) throws IOException {
            return (App) h0.parseWithIOException(PARSER, lVar);
        }

        public static App parseFrom(l lVar, w wVar) throws IOException {
            return (App) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private App(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.name_ = lVar.J();
                                break;
                            case 26:
                                Publisher publisher = this.pub_;
                                Publisher.Builder builder = publisher != null ? publisher.toBuilder() : null;
                                Publisher publisher2 = (Publisher) lVar.A(Publisher.parser(), wVar);
                                this.pub_ = publisher2;
                                if (builder != null) {
                                    builder.mergeFrom(publisher2);
                                    this.pub_ = builder.buildPartial();
                                }
                                break;
                            case 34:
                                Content content = this.content_;
                                Content.Builder builder2 = content != null ? content.toBuilder() : null;
                                Content content2 = (Content) lVar.A(Content.parser(), wVar);
                                this.content_ = content2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(content2);
                                    this.content_ = builder2.buildPartial();
                                }
                                break;
                            case 42:
                                this.domain_ = lVar.J();
                                break;
                            case 50:
                                String strJ = lVar.J();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.cat_ = new o0();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.cat_.add(strJ);
                                break;
                            case 58:
                                String strJ2 = lVar.J();
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.sectcat_ = new o0();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.sectcat_.add(strJ2);
                                break;
                            case 66:
                                String strJ3 = lVar.J();
                                int i13 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i13 == 0) {
                                    this.pagecat_ = new o0();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.pagecat_.add(strJ3);
                                break;
                            case 72:
                                this.cattax_ = lVar.t();
                                break;
                            case 80:
                                this.privpolicy_ = lVar.q();
                                break;
                            case 90:
                                this.keywords_ = lVar.J();
                                break;
                            case 98:
                                this.bundle_ = lVar.J();
                                break;
                            case 106:
                                this.storeid_ = lVar.J();
                                break;
                            case 114:
                                this.storeurl_ = lVar.J();
                                break;
                            case 122:
                                this.ver_ = lVar.J();
                                break;
                            case 128:
                                this.paid_ = lVar.q();
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
                                Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.ext_ = struct2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(struct2);
                                    this.ext_ = builder3.buildPartial();
                                }
                                break;
                            case 154:
                                Release release = this.release_;
                                Release.Builder builder4 = release != null ? release.toBuilder() : null;
                                Release release2 = (Release) lVar.A(Release.parser(), wVar);
                                this.release_ = release2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(release2);
                                    this.release_ = builder4.buildPartial();
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
                        this.cat_ = this.cat_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.sectcat_ = this.sectcat_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.pagecat_ = this.pagecat_.getUnmodifiableView();
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
                this.cat_ = this.cat_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.sectcat_ = this.sectcat_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.pagecat_ = this.pagecat_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 8) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface AppOrBuilder extends MessageOrBuilder {
        String getBundle();

        ByteString getBundleBytes();

        String getCat(int i10);

        ByteString getCatBytes(int i10);

        int getCatCount();

        List<String> getCatList();

        CategoryTaxonomy getCattax();

        int getCattaxValue();

        App.Content getContent();

        App.ContentOrBuilder getContentOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getDomain();

        ByteString getDomainBytes();

        Struct getExt();

        e2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        String getId();

        ByteString getIdBytes();

        String getKeywords();

        ByteString getKeywordsBytes();

        String getName();

        ByteString getNameBytes();

        String getPagecat(int i10);

        ByteString getPagecatBytes(int i10);

        int getPagecatCount();

        List<String> getPagecatList();

        boolean getPaid();

        boolean getPrivpolicy();

        App.Publisher getPub();

        App.PublisherOrBuilder getPubOrBuilder();

        App.Release getRelease();

        App.ReleaseOrBuilder getReleaseOrBuilder();

        String getSectcat(int i10);

        ByteString getSectcatBytes(int i10);

        int getSectcatCount();

        List<String> getSectcatList();

        String getStoreid();

        ByteString getStoreidBytes();

        String getStoreurl();

        ByteString getStoreurlBytes();

        String getVer();

        ByteString getVerBytes();

        boolean hasContent();

        boolean hasExt();

        boolean hasPub();

        boolean hasRelease();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Data extends h0 implements DataOrBuilder {
        public static final int EXT_FIELD_NUMBER = 5;
        public static final int EXT_PROTO_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int SEGMENT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private List<Segment> segment_;
        private static final Data DEFAULT_INSTANCE = new Data();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.Data.1
            @Override // com.explorestack.protobuf.p1
            public Data parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Data(lVar, wVar);
            }
        };

        public static final class Segment extends h0 implements SegmentOrBuilder {
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int VALUE_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private volatile Object value_;
            private static final Segment DEFAULT_INSTANCE = new Segment();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.Data.Segment.1
                @Override // com.explorestack.protobuf.p1
                public Segment parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Segment(lVar, wVar);
                }
            };

            public static Segment getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18831o;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Segment parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Segment) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Segment parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Segment)) {
                    return super.equals(obj);
                }
                Segment segment = (Segment) obj;
                if (getId().equals(segment.getId()) && getName().equals(segment.getName()) && getValue().equals(segment.getValue()) && hasExt() == segment.hasExt()) {
                    return (!hasExt() || getExt().equals(segment.getExt())) && getExtProtoList().equals(segment.getExtProtoList()) && this.unknownFields.equals(segment.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
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
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(2, this.name_);
                }
                if (!getValueBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(3, this.value_);
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

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode()) * 37) + 3) * 53) + getValue().hashCode();
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
                return b.f18833p.d(Segment.class, Builder.class);
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
                return new Segment();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.id_);
                }
                if (!getNameBytes().isEmpty()) {
                    h0.writeString(nVar, 2, this.name_);
                }
                if (!getValueBytes().isEmpty()) {
                    h0.writeString(nVar, 3, this.value_);
                }
                for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                    nVar.J0(4, this.extProto_.get(i10));
                }
                if (this.ext_ != null) {
                    nVar.J0(5, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements SegmentOrBuilder {
                private int bitField0_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object name_;
                private Object value_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18831o;
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

                public Builder clearId() {
                    this.id_ = Segment.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = Segment.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder clearValue() {
                    this.value_ = Segment.getDefaultInstance().getValue();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f18831o;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18833p.d(Segment.class, Builder.class);
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

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
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
                    this.id_ = "";
                    this.name_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Segment build() {
                    Segment segmentBuildPartial = buildPartial();
                    if (segmentBuildPartial.isInitialized()) {
                        return segmentBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) segmentBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Segment buildPartial() {
                    Segment segment = new Segment(this);
                    segment.id_ = this.id_;
                    segment.name_ = this.name_;
                    segment.value_ = this.value_;
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        segment.ext_ = this.ext_;
                    } else {
                        segment.ext_ = (Struct) a2Var.a();
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        segment.extProto_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        segment.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return segment;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Segment getDefaultInstanceForType() {
                    return Segment.getDefaultInstance();
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
                    this.name_ = "";
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
                    if (message instanceof Segment) {
                        return mergeFrom((Segment) message);
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
                    this.name_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Segment segment) {
                    if (segment == Segment.getDefaultInstance()) {
                        return this;
                    }
                    if (!segment.getId().isEmpty()) {
                        this.id_ = segment.id_;
                        onChanged();
                    }
                    if (!segment.getName().isEmpty()) {
                        this.name_ = segment.name_;
                        onChanged();
                    }
                    if (!segment.getValue().isEmpty()) {
                        this.value_ = segment.value_;
                        onChanged();
                    }
                    if (segment.hasExt()) {
                        mergeExt(segment.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!segment.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = segment.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(segment.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!segment.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(segment.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = segment.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) segment).unknownFields);
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
                public com.explorestack.protobuf.adcom.Context.Data.Segment.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.Data.Segment.access$15000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$Data$Segment r3 = (com.explorestack.protobuf.adcom.Context.Data.Segment) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$Data$Segment r4 = (com.explorestack.protobuf.adcom.Context.Data.Segment) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Data.Segment.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Data$Segment$Builder");
                }
            }

            public static Builder newBuilder(Segment segment) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(segment);
            }

            public static Segment parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Segment(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Segment parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Segment) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Segment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Segment getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Segment parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Segment() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.name_ = "";
                this.value_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Segment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Segment parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(bArr, wVar);
            }

            public static Segment parseFrom(InputStream inputStream) throws IOException {
                return (Segment) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Segment parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Segment) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            private Segment(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        this.id_ = lVar.J();
                                    } else if (iK == 18) {
                                        this.name_ = lVar.J();
                                    } else if (iK == 26) {
                                        this.value_ = lVar.J();
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

            public static Segment parseFrom(l lVar) throws IOException {
                return (Segment) h0.parseWithIOException(PARSER, lVar);
            }

            public static Segment parseFrom(l lVar, w wVar) throws IOException {
                return (Segment) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface SegmentOrBuilder extends MessageOrBuilder {
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

            String getId();

            ByteString getIdBytes();

            String getName();

            ByteString getNameBytes();

            String getValue();

            ByteString getValueBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18827m;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Data) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return super.equals(obj);
            }
            Data data = (Data) obj;
            if (getId().equals(data.getId()) && getName().equals(data.getName()) && getSegmentList().equals(data.getSegmentList()) && hasExt() == data.hasExt()) {
                return (!hasExt() || getExt().equals(data.getExt())) && getExtProtoList().equals(data.getExtProtoList()) && this.unknownFields.equals(data.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Segment getSegment(int i10) {
            return this.segment_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public int getSegmentCount() {
            return this.segment_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<Segment> getSegmentList() {
            return this.segment_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public SegmentOrBuilder getSegmentOrBuilder(int i10) {
            return this.segment_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<? extends SegmentOrBuilder> getSegmentOrBuilderList() {
            return this.segment_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
            if (!getNameBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.name_);
            }
            for (int i11 = 0; i11 < this.segment_.size(); i11++) {
                iComputeStringSize += n.G(3, this.segment_.get(i11));
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

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode();
            if (getSegmentCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getSegmentList().hashCode();
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
            return b.f18829n.d(Data.class, Builder.class);
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
            return new Data();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.id_);
            }
            if (!getNameBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.name_);
            }
            for (int i10 = 0; i10 < this.segment_.size(); i10++) {
                nVar.J0(3, this.segment_.get(i10));
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                nVar.J0(4, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                nVar.J0(5, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements DataOrBuilder {
            private int bitField0_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object id_;
            private Object name_;
            private v1 segmentBuilder_;
            private List<Segment> segment_;

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureSegmentIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.segment_ = new ArrayList(this.segment_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18827m;
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

            private v1 getSegmentFieldBuilder() {
                if (this.segmentBuilder_ == null) {
                    this.segmentBuilder_ = new v1(this.segment_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.segment_ = null;
                }
                return this.segmentBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getSegmentFieldBuilder();
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

            public Builder addAllSegment(Iterable<? extends Segment> iterable) {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureSegmentIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.segment_);
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

            public Builder addSegment(Segment segment) {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var != null) {
                    v1Var.e(segment);
                    return this;
                }
                segment.getClass();
                ensureSegmentIsMutable();
                this.segment_.add(segment);
                onChanged();
                return this;
            }

            public Segment.Builder addSegmentBuilder() {
                return (Segment.Builder) getSegmentFieldBuilder().c(Segment.getDefaultInstance());
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
                this.id_ = Data.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = Data.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearSegment() {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.segment_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f18827m;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public Segment getSegment(int i10) {
                v1 v1Var = this.segmentBuilder_;
                return v1Var == null ? this.segment_.get(i10) : (Segment) v1Var.n(i10);
            }

            public Segment.Builder getSegmentBuilder(int i10) {
                return (Segment.Builder) getSegmentFieldBuilder().k(i10);
            }

            public List<Segment.Builder> getSegmentBuilderList() {
                return getSegmentFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public int getSegmentCount() {
                v1 v1Var = this.segmentBuilder_;
                return v1Var == null ? this.segment_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<Segment> getSegmentList() {
                v1 v1Var = this.segmentBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.segment_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public SegmentOrBuilder getSegmentOrBuilder(int i10) {
                v1 v1Var = this.segmentBuilder_;
                return v1Var == null ? this.segment_.get(i10) : (SegmentOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<? extends SegmentOrBuilder> getSegmentOrBuilderList() {
                v1 v1Var = this.segmentBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.segment_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18829n.d(Data.class, Builder.class);
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

            public Builder removeSegment(int i10) {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureSegmentIsMutable();
                this.segment_.remove(i10);
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

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSegment(int i10, Segment segment) {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, segment);
                    return this;
                }
                segment.getClass();
                ensureSegmentIsMutable();
                this.segment_.set(i10, segment);
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.name_ = "";
                List list = Collections.EMPTY_LIST;
                this.segment_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data build() {
                Data dataBuildPartial = buildPartial();
                if (dataBuildPartial.isInitialized()) {
                    return dataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data buildPartial() {
                Data data = new Data(this);
                data.id_ = this.id_;
                data.name_ = this.name_;
                v1 v1Var = this.segmentBuilder_;
                if (v1Var != null) {
                    data.segment_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.segment_ = DesugarCollections.unmodifiableList(this.segment_);
                        this.bitField0_ &= -2;
                    }
                    data.segment_ = this.segment_;
                }
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    data.ext_ = this.ext_;
                } else {
                    data.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var2 = this.extProtoBuilder_;
                if (v1Var2 != null) {
                    data.extProto_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    data.extProto_ = this.extProto_;
                }
                onBuilt();
                return data;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Data getDefaultInstanceForType() {
                return Data.getDefaultInstance();
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

            public Segment.Builder addSegmentBuilder(int i10) {
                return (Segment.Builder) getSegmentFieldBuilder().b(i10, Segment.getDefaultInstance());
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
                this.name_ = "";
                v1 v1Var = this.segmentBuilder_;
                if (v1Var == null) {
                    this.segment_ = Collections.EMPTY_LIST;
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

            public Builder addSegment(int i10, Segment segment) {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var == null) {
                    segment.getClass();
                    ensureSegmentIsMutable();
                    this.segment_.add(i10, segment);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, segment);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Data) {
                    return mergeFrom((Data) message);
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

            public Builder setSegment(int i10, Segment.Builder builder) {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var == null) {
                    ensureSegmentIsMutable();
                    this.segment_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.name_ = "";
                List list = Collections.EMPTY_LIST;
                this.segment_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Data data) {
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (!data.getId().isEmpty()) {
                    this.id_ = data.id_;
                    onChanged();
                }
                if (!data.getName().isEmpty()) {
                    this.name_ = data.name_;
                    onChanged();
                }
                if (this.segmentBuilder_ == null) {
                    if (!data.segment_.isEmpty()) {
                        if (this.segment_.isEmpty()) {
                            this.segment_ = data.segment_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSegmentIsMutable();
                            this.segment_.addAll(data.segment_);
                        }
                        onChanged();
                    }
                } else if (!data.segment_.isEmpty()) {
                    if (!this.segmentBuilder_.t()) {
                        this.segmentBuilder_.a(data.segment_);
                    } else {
                        this.segmentBuilder_.h();
                        this.segmentBuilder_ = null;
                        this.segment_ = data.segment_;
                        this.bitField0_ &= -2;
                        this.segmentBuilder_ = h0.alwaysUseFieldBuilders ? getSegmentFieldBuilder() : null;
                    }
                }
                if (data.hasExt()) {
                    mergeExt(data.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!data.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = data.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(data.extProto_);
                        }
                        onChanged();
                    }
                } else if (!data.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(data.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = data.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) data).unknownFields);
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

            public Builder addSegment(Segment.Builder builder) {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var == null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(builder.build());
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

            public Builder addSegment(int i10, Segment.Builder builder) {
                v1 v1Var = this.segmentBuilder_;
                if (v1Var == null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(i10, builder.build());
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
            public com.explorestack.protobuf.adcom.Context.Data.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.Data.access$16700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Data r3 = (com.explorestack.protobuf.adcom.Context.Data) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Data r4 = (com.explorestack.protobuf.adcom.Context.Data) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Data.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Data$Builder");
            }
        }

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Data(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Data parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Data) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Data parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Data() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.segment_ = list;
            this.extProto_ = list;
        }

        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Data parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr, wVar);
        }

        public static Data parseFrom(InputStream inputStream) throws IOException {
            return (Data) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Data) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        private Data(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.id_ = lVar.J();
                                } else if (iK == 18) {
                                    this.name_ = lVar.J();
                                } else if (iK == 26) {
                                    if ((i10 & 1) == 0) {
                                        this.segment_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.segment_.add((Segment) lVar.A(Segment.parser(), wVar));
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
                        this.segment_ = DesugarCollections.unmodifiableList(this.segment_);
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
                this.segment_ = DesugarCollections.unmodifiableList(this.segment_);
            }
            if ((i10 & 2) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Data parseFrom(l lVar) throws IOException {
            return (Data) h0.parseWithIOException(PARSER, lVar);
        }

        public static Data parseFrom(l lVar, w wVar) throws IOException {
            return (Data) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface DataOrBuilder extends MessageOrBuilder {
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

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        Data.Segment getSegment(int i10);

        int getSegmentCount();

        List<Data.Segment> getSegmentList();

        Data.SegmentOrBuilder getSegmentOrBuilder(int i10);

        List<? extends Data.SegmentOrBuilder> getSegmentOrBuilderList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Device extends h0 implements DeviceOrBuilder {
        public static final int AUDIOCONTEXT_FIELD_NUMBER = 30;
        public static final int CARRIER_FIELD_NUMBER = 21;
        public static final int CONNECTION_FIELD_NUMBER = 29;
        public static final int CONTYPE_FIELD_NUMBER = 24;
        public static final int DNT_FIELD_NUMBER = 4;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int GEOFETCH_FIELD_NUMBER = 25;
        public static final int GEO_FIELD_NUMBER = 26;
        public static final int HWV_FIELD_NUMBER = 10;
        public static final int H_FIELD_NUMBER = 11;
        public static final int IFA_FIELD_NUMBER = 3;
        public static final int IPTR_FIELD_NUMBER = 20;
        public static final int IPV6_FIELD_NUMBER = 18;
        public static final int IP_FIELD_NUMBER = 17;
        public static final int JS_FIELD_NUMBER = 15;
        public static final int LANG_FIELD_NUMBER = 16;
        public static final int LMT_FIELD_NUMBER = 5;
        public static final int MAKE_FIELD_NUMBER = 6;
        public static final int MCCMNCSIM_FIELD_NUMBER = 23;
        public static final int MCCMNC_FIELD_NUMBER = 22;
        public static final int MODEL_FIELD_NUMBER = 7;
        public static final int OSV_FIELD_NUMBER = 9;
        public static final int OS_FIELD_NUMBER = 8;
        public static final int PPI_FIELD_NUMBER = 13;
        public static final int PXRATIO_FIELD_NUMBER = 14;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UA_FIELD_NUMBER = 2;
        public static final int W_FIELD_NUMBER = 12;
        public static final int XFF_FIELD_NUMBER = 19;
        private static final long serialVersionUID = 0;
        private AudioContext audioContext_;
        private volatile Object carrier_;
        private Connection connection_;
        private int contype_;
        private boolean dnt_;
        private List<Any> extProto_;
        private Struct ext_;
        private Geo geo_;
        private boolean geofetch_;
        private int h_;
        private volatile Object hwv_;
        private volatile Object ifa_;
        private volatile Object ip_;
        private boolean iptr_;
        private volatile Object ipv6_;
        private boolean js_;
        private volatile Object lang_;
        private boolean lmt_;
        private volatile Object make_;
        private volatile Object mccmnc_;
        private volatile Object mccmncsim_;
        private byte memoizedIsInitialized;
        private volatile Object model_;
        private int os_;
        private volatile Object osv_;
        private int ppi_;
        private float pxratio_;
        private int type_;
        private volatile Object ua_;
        private int w_;
        private volatile Object xff_;
        private static final Device DEFAULT_INSTANCE = new Device();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.Device.1
            @Override // com.explorestack.protobuf.p1
            public Device parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Device(lVar, wVar);
            }
        };

        public static final class AudioContext extends h0 implements AudioContextOrBuilder {
            public static final int ISAUDIOPLAYING_FIELD_NUMBER = 1;
            public static final int VOLUMELEVEL_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private boolean isAudioPlaying_;
            private byte memoizedIsInitialized;
            private float volumelevel_;
            private static final AudioContext DEFAULT_INSTANCE = new AudioContext();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.Device.AudioContext.1
                @Override // com.explorestack.protobuf.p1
                public AudioContext parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new AudioContext(lVar, wVar);
                }
            };

            public static AudioContext getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18847w;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AudioContext parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AudioContext) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AudioContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AudioContext)) {
                    return super.equals(obj);
                }
                AudioContext audioContext = (AudioContext) obj;
                return getIsAudioPlaying() == audioContext.getIsAudioPlaying() && Float.floatToIntBits(getVolumelevel()) == Float.floatToIntBits(audioContext.getVolumelevel()) && this.unknownFields.equals(audioContext.unknownFields);
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
            public boolean getIsAudioPlaying() {
                return this.isAudioPlaying_;
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
                boolean z10 = this.isAudioPlaying_;
                int iE = z10 ? n.e(1, z10) : 0;
                float f10 = this.volumelevel_;
                if (f10 != 0.0f) {
                    iE += n.r(2, f10);
                }
                int serializedSize = iE + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
            public float getVolumelevel() {
                return this.volumelevel_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getIsAudioPlaying())) * 37) + 2) * 53) + Float.floatToIntBits(getVolumelevel())) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18849x.d(AudioContext.class, Builder.class);
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
                return new AudioContext();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                boolean z10 = this.isAudioPlaying_;
                if (z10) {
                    nVar.n0(1, z10);
                }
                float f10 = this.volumelevel_;
                if (f10 != 0.0f) {
                    nVar.B0(2, f10);
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements AudioContextOrBuilder {
                private boolean isAudioPlaying_;
                private float volumelevel_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18847w;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearIsAudioPlaying() {
                    this.isAudioPlaying_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearVolumelevel() {
                    this.volumelevel_ = 0.0f;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f18847w;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
                public boolean getIsAudioPlaying() {
                    return this.isAudioPlaying_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
                public float getVolumelevel() {
                    return this.volumelevel_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18849x.d(AudioContext.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setIsAudioPlaying(boolean z10) {
                    this.isAudioPlaying_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setVolumelevel(float f10) {
                    this.volumelevel_ = f10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AudioContext build() {
                    AudioContext audioContextBuildPartial = buildPartial();
                    if (audioContextBuildPartial.isInitialized()) {
                        return audioContextBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioContextBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AudioContext buildPartial() {
                    AudioContext audioContext = new AudioContext(this);
                    audioContext.isAudioPlaying_ = this.isAudioPlaying_;
                    audioContext.volumelevel_ = this.volumelevel_;
                    onBuilt();
                    return audioContext;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public AudioContext getDefaultInstanceForType() {
                    return AudioContext.getDefaultInstance();
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

                private Builder(h0.c cVar) {
                    super(cVar);
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.isAudioPlaying_ = false;
                    this.volumelevel_ = 0.0f;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AudioContext) {
                        return mergeFrom((AudioContext) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AudioContext audioContext) {
                    if (audioContext == AudioContext.getDefaultInstance()) {
                        return this;
                    }
                    if (audioContext.getIsAudioPlaying()) {
                        setIsAudioPlaying(audioContext.getIsAudioPlaying());
                    }
                    if (audioContext.getVolumelevel() != 0.0f) {
                        setVolumelevel(audioContext.getVolumelevel());
                    }
                    mergeUnknownFields(((h0) audioContext).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.Device.AudioContext.access$21500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$Device$AudioContext r3 = (com.explorestack.protobuf.adcom.Context.Device.AudioContext) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$Device$AudioContext r4 = (com.explorestack.protobuf.adcom.Context.Device.AudioContext) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Device$AudioContext$Builder");
                }
            }

            public static Builder newBuilder(AudioContext audioContext) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioContext);
            }

            public static AudioContext parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteBuffer, wVar);
            }

            private AudioContext(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AudioContext parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (AudioContext) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static AudioContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AudioContext getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AudioContext parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AudioContext() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AudioContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static AudioContext parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(bArr, wVar);
            }

            private AudioContext(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.isAudioPlaying_ = lVar.q();
                                } else if (iK != 21) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.volumelevel_ = lVar.w();
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

            public static AudioContext parseFrom(InputStream inputStream) throws IOException {
                return (AudioContext) h0.parseWithIOException(PARSER, inputStream);
            }

            public static AudioContext parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (AudioContext) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static AudioContext parseFrom(l lVar) throws IOException {
                return (AudioContext) h0.parseWithIOException(PARSER, lVar);
            }

            public static AudioContext parseFrom(l lVar, w wVar) throws IOException {
                return (AudioContext) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface AudioContextOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            boolean getIsAudioPlaying();

            float getVolumelevel();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Connection extends h0 implements ConnectionOrBuilder {
            private static final Connection DEFAULT_INSTANCE = new Connection();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.Device.Connection.1
                @Override // com.explorestack.protobuf.p1
                public Connection parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Connection(lVar, wVar);
                }
            };
            public static final int PROXY_FIELD_NUMBER = 2;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VPN_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int proxy_;
            private int type_;
            private int vpn_;

            public static Connection getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18843u;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Connection parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Connection) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Connection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Connection)) {
                    return super.equals(obj);
                }
                Connection connection = (Connection) obj;
                return this.type_ == connection.type_ && this.proxy_ == connection.proxy_ && this.vpn_ == connection.vpn_ && this.unknownFields.equals(connection.unknownFields);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionStatus getProxy() {
                ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.proxy_);
                return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getProxyValue() {
                return this.proxy_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iL = this.type_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber() ? n.l(1, this.type_) : 0;
                int i11 = this.proxy_;
                ConnectionStatus connectionStatus = ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
                if (i11 != connectionStatus.getNumber()) {
                    iL += n.l(2, this.proxy_);
                }
                if (this.vpn_ != connectionStatus.getNumber()) {
                    iL += n.l(3, this.vpn_);
                }
                int serializedSize = iL + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionType getType() {
                ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.type_);
                return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionStatus getVpn() {
                ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.vpn_);
                return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getVpnValue() {
                return this.vpn_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + this.proxy_) * 37) + 3) * 53) + this.vpn_) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18845v.d(Connection.class, Builder.class);
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
                return new Connection();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (this.type_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                    nVar.v0(1, this.type_);
                }
                int i10 = this.proxy_;
                ConnectionStatus connectionStatus = ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
                if (i10 != connectionStatus.getNumber()) {
                    nVar.v0(2, this.proxy_);
                }
                if (this.vpn_ != connectionStatus.getNumber()) {
                    nVar.v0(3, this.vpn_);
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements ConnectionOrBuilder {
                private int proxy_;
                private int type_;
                private int vpn_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f18843u;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearProxy() {
                    this.proxy_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearVpn() {
                    this.vpn_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f18843u;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionStatus getProxy() {
                    ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.proxy_);
                    return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getProxyValue() {
                    return this.proxy_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionType getType() {
                    ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.type_);
                    return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getTypeValue() {
                    return this.type_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionStatus getVpn() {
                    ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.vpn_);
                    return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getVpnValue() {
                    return this.vpn_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.f18845v.d(Connection.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setProxy(ConnectionStatus connectionStatus) {
                    connectionStatus.getClass();
                    this.proxy_ = connectionStatus.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setProxyValue(int i10) {
                    this.proxy_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setType(ConnectionType connectionType) {
                    connectionType.getClass();
                    this.type_ = connectionType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setTypeValue(int i10) {
                    this.type_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setVpn(ConnectionStatus connectionStatus) {
                    connectionStatus.getClass();
                    this.vpn_ = connectionStatus.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setVpnValue(int i10) {
                    this.vpn_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Connection build() {
                    Connection connectionBuildPartial = buildPartial();
                    if (connectionBuildPartial.isInitialized()) {
                        return connectionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Connection buildPartial() {
                    Connection connection = new Connection(this);
                    connection.type_ = this.type_;
                    connection.proxy_ = this.proxy_;
                    connection.vpn_ = this.vpn_;
                    onBuilt();
                    return connection;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Connection getDefaultInstanceForType() {
                    return Connection.getDefaultInstance();
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
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Connection) {
                        return mergeFrom((Connection) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Connection connection) {
                    if (connection == Connection.getDefaultInstance()) {
                        return this;
                    }
                    if (connection.type_ != 0) {
                        setTypeValue(connection.getTypeValue());
                    }
                    if (connection.proxy_ != 0) {
                        setProxyValue(connection.getProxyValue());
                    }
                    if (connection.vpn_ != 0) {
                        setVpnValue(connection.getVpnValue());
                    }
                    mergeUnknownFields(((h0) connection).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.adcom.Context.Device.Connection.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.Device.Connection.access$20600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$Device$Connection r3 = (com.explorestack.protobuf.adcom.Context.Device.Connection) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$Device$Connection r4 = (com.explorestack.protobuf.adcom.Context.Device.Connection) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Device.Connection.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Device$Connection$Builder");
                }
            }

            public static Builder newBuilder(Connection connection) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(connection);
            }

            public static Connection parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Connection(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Connection parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Connection) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Connection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Connection getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Connection parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Connection() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = 0;
                this.proxy_ = 0;
                this.vpn_ = 0;
            }

            public static Connection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Connection parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(bArr, wVar);
            }

            public static Connection parseFrom(InputStream inputStream) throws IOException {
                return (Connection) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Connection parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Connection) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            private Connection(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.type_ = lVar.t();
                                } else if (iK == 16) {
                                    this.proxy_ = lVar.t();
                                } else if (iK != 24) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.vpn_ = lVar.t();
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

            public static Connection parseFrom(l lVar) throws IOException {
                return (Connection) h0.parseWithIOException(PARSER, lVar);
            }

            public static Connection parseFrom(l lVar, w wVar) throws IOException {
                return (Connection) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface ConnectionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            ConnectionStatus getProxy();

            int getProxyValue();

            ConnectionType getType();

            int getTypeValue();

            ConnectionStatus getVpn();

            int getVpnValue();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18839s;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return super.equals(obj);
            }
            Device device = (Device) obj;
            if (this.type_ != device.type_ || !getUa().equals(device.getUa()) || !getIfa().equals(device.getIfa()) || getDnt() != device.getDnt() || getLmt() != device.getLmt() || !getMake().equals(device.getMake()) || !getModel().equals(device.getModel()) || this.os_ != device.os_ || !getOsv().equals(device.getOsv()) || !getHwv().equals(device.getHwv()) || getH() != device.getH() || getW() != device.getW() || getPpi() != device.getPpi() || Float.floatToIntBits(getPxratio()) != Float.floatToIntBits(device.getPxratio()) || getJs() != device.getJs() || !getLang().equals(device.getLang()) || !getIp().equals(device.getIp()) || !getIpv6().equals(device.getIpv6()) || !getXff().equals(device.getXff()) || getIptr() != device.getIptr() || !getCarrier().equals(device.getCarrier()) || !getMccmnc().equals(device.getMccmnc()) || !getMccmncsim().equals(device.getMccmncsim()) || this.contype_ != device.contype_ || getGeofetch() != device.getGeofetch() || hasGeo() != device.hasGeo()) {
                return false;
            }
            if ((hasGeo() && !getGeo().equals(device.getGeo())) || hasConnection() != device.hasConnection()) {
                return false;
            }
            if ((hasConnection() && !getConnection().equals(device.getConnection())) || hasAudioContext() != device.hasAudioContext()) {
                return false;
            }
            if ((!hasAudioContext() || getAudioContext().equals(device.getAudioContext())) && hasExt() == device.hasExt()) {
                return (!hasExt() || getExt().equals(device.getExt())) && getExtProtoList().equals(device.getExtProtoList()) && this.unknownFields.equals(device.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public AudioContext getAudioContext() {
            AudioContext audioContext = this.audioContext_;
            return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public AudioContextOrBuilder getAudioContextOrBuilder() {
            return getAudioContext();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getCarrier() {
            Object obj = this.carrier_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.carrier_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getCarrierBytes() {
            Object obj = this.carrier_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.carrier_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Connection getConnection() {
            Connection connection = this.connection_;
            return connection == null ? Connection.getDefaultInstance() : connection;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ConnectionOrBuilder getConnectionOrBuilder() {
            return getConnection();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ConnectionType getContype() {
            ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
            return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getContypeValue() {
            return this.contype_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getDnt() {
            return this.dnt_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public GeoOrBuilder getGeoOrBuilder() {
            return getGeo();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getGeofetch() {
            return this.geofetch_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getHwv() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.hwv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIfa() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIp() {
            Object obj = this.ip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIpBytes() {
            Object obj = this.ip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ip_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getIptr() {
            return this.iptr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIpv6() {
            Object obj = this.ipv6_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ipv6_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIpv6Bytes() {
            Object obj = this.ipv6_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ipv6_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getJs() {
            return this.js_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getLang() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lang_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getLmt() {
            return this.lmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMake() {
            Object obj = this.make_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.make_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMccmnc() {
            Object obj = this.mccmnc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mccmnc_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMccmncBytes() {
            Object obj = this.mccmnc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mccmnc_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMccmncsim() {
            Object obj = this.mccmncsim_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mccmncsim_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMccmncsimBytes() {
            Object obj = this.mccmncsim_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mccmncsim_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.model_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public OS getOs() {
            OS osValueOf = OS.valueOf(this.os_);
            return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getOsv() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getPpi() {
            return this.ppi_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public float getPxratio() {
            return this.pxratio_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.type_ != DeviceType.DEVICE_TYPE_INVALID.getNumber() ? n.l(1, this.type_) : 0;
            if (!getUaBytes().isEmpty()) {
                iL += h0.computeStringSize(2, this.ua_);
            }
            if (!getIfaBytes().isEmpty()) {
                iL += h0.computeStringSize(3, this.ifa_);
            }
            boolean z10 = this.dnt_;
            if (z10) {
                iL += n.e(4, z10);
            }
            boolean z11 = this.lmt_;
            if (z11) {
                iL += n.e(5, z11);
            }
            if (!getMakeBytes().isEmpty()) {
                iL += h0.computeStringSize(6, this.make_);
            }
            if (!getModelBytes().isEmpty()) {
                iL += h0.computeStringSize(7, this.model_);
            }
            if (this.os_ != OS.OS_INVALID.getNumber()) {
                iL += n.l(8, this.os_);
            }
            if (!getOsvBytes().isEmpty()) {
                iL += h0.computeStringSize(9, this.osv_);
            }
            if (!getHwvBytes().isEmpty()) {
                iL += h0.computeStringSize(10, this.hwv_);
            }
            int i11 = this.h_;
            if (i11 != 0) {
                iL += n.Y(11, i11);
            }
            int i12 = this.w_;
            if (i12 != 0) {
                iL += n.Y(12, i12);
            }
            int i13 = this.ppi_;
            if (i13 != 0) {
                iL += n.Y(13, i13);
            }
            float f10 = this.pxratio_;
            if (f10 != 0.0f) {
                iL += n.r(14, f10);
            }
            boolean z12 = this.js_;
            if (z12) {
                iL += n.e(15, z12);
            }
            if (!getLangBytes().isEmpty()) {
                iL += h0.computeStringSize(16, this.lang_);
            }
            if (!getIpBytes().isEmpty()) {
                iL += h0.computeStringSize(17, this.ip_);
            }
            if (!getIpv6Bytes().isEmpty()) {
                iL += h0.computeStringSize(18, this.ipv6_);
            }
            if (!getXffBytes().isEmpty()) {
                iL += h0.computeStringSize(19, this.xff_);
            }
            boolean z13 = this.iptr_;
            if (z13) {
                iL += n.e(20, z13);
            }
            if (!getCarrierBytes().isEmpty()) {
                iL += h0.computeStringSize(21, this.carrier_);
            }
            if (!getMccmncBytes().isEmpty()) {
                iL += h0.computeStringSize(22, this.mccmnc_);
            }
            if (!getMccmncsimBytes().isEmpty()) {
                iL += h0.computeStringSize(23, this.mccmncsim_);
            }
            if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                iL += n.l(24, this.contype_);
            }
            boolean z14 = this.geofetch_;
            if (z14) {
                iL += n.e(25, z14);
            }
            if (this.geo_ != null) {
                iL += n.G(26, getGeo());
            }
            for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                iL += n.G(27, this.extProto_.get(i14));
            }
            if (this.ext_ != null) {
                iL += n.G(28, getExt());
            }
            if (this.connection_ != null) {
                iL += n.G(29, getConnection());
            }
            if (this.audioContext_ != null) {
                iL += n.G(30, getAudioContext());
            }
            int serializedSize = iL + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public DeviceType getType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.type_);
            return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getUa() {
            Object obj = this.ua_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ua_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getUaBytes() {
            Object obj = this.ua_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ua_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getXff() {
            Object obj = this.xff_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.xff_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getXffBytes() {
            Object obj = this.xff_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.xff_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasAudioContext() {
            return this.audioContext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasConnection() {
            return this.connection_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasGeo() {
            return this.geo_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + getUa().hashCode()) * 37) + 3) * 53) + getIfa().hashCode()) * 37) + 4) * 53) + j0.d(getDnt())) * 37) + 5) * 53) + j0.d(getLmt())) * 37) + 6) * 53) + getMake().hashCode()) * 37) + 7) * 53) + getModel().hashCode()) * 37) + 8) * 53) + this.os_) * 37) + 9) * 53) + getOsv().hashCode()) * 37) + 10) * 53) + getHwv().hashCode()) * 37) + 11) * 53) + getH()) * 37) + 12) * 53) + getW()) * 37) + 13) * 53) + getPpi()) * 37) + 14) * 53) + Float.floatToIntBits(getPxratio())) * 37) + 15) * 53) + j0.d(getJs())) * 37) + 16) * 53) + getLang().hashCode()) * 37) + 17) * 53) + getIp().hashCode()) * 37) + 18) * 53) + getIpv6().hashCode()) * 37) + 19) * 53) + getXff().hashCode()) * 37) + 20) * 53) + j0.d(getIptr())) * 37) + 21) * 53) + getCarrier().hashCode()) * 37) + 22) * 53) + getMccmnc().hashCode()) * 37) + 23) * 53) + getMccmncsim().hashCode()) * 37) + 24) * 53) + this.contype_) * 37) + 25) * 53) + j0.d(getGeofetch());
            if (hasGeo()) {
                iHashCode = (((iHashCode * 37) + 26) * 53) + getGeo().hashCode();
            }
            if (hasConnection()) {
                iHashCode = (((iHashCode * 37) + 29) * 53) + getConnection().hashCode();
            }
            if (hasAudioContext()) {
                iHashCode = (((iHashCode * 37) + 30) * 53) + getAudioContext().hashCode();
            }
            if (hasExt()) {
                iHashCode = (((iHashCode * 37) + 28) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode = (((iHashCode * 37) + 27) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.f18841t.d(Device.class, Builder.class);
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
            return new Device();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.type_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
                nVar.v0(1, this.type_);
            }
            if (!getUaBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.ua_);
            }
            if (!getIfaBytes().isEmpty()) {
                h0.writeString(nVar, 3, this.ifa_);
            }
            boolean z10 = this.dnt_;
            if (z10) {
                nVar.n0(4, z10);
            }
            boolean z11 = this.lmt_;
            if (z11) {
                nVar.n0(5, z11);
            }
            if (!getMakeBytes().isEmpty()) {
                h0.writeString(nVar, 6, this.make_);
            }
            if (!getModelBytes().isEmpty()) {
                h0.writeString(nVar, 7, this.model_);
            }
            if (this.os_ != OS.OS_INVALID.getNumber()) {
                nVar.v0(8, this.os_);
            }
            if (!getOsvBytes().isEmpty()) {
                h0.writeString(nVar, 9, this.osv_);
            }
            if (!getHwvBytes().isEmpty()) {
                h0.writeString(nVar, 10, this.hwv_);
            }
            int i10 = this.h_;
            if (i10 != 0) {
                nVar.W0(11, i10);
            }
            int i11 = this.w_;
            if (i11 != 0) {
                nVar.W0(12, i11);
            }
            int i12 = this.ppi_;
            if (i12 != 0) {
                nVar.W0(13, i12);
            }
            float f10 = this.pxratio_;
            if (f10 != 0.0f) {
                nVar.B0(14, f10);
            }
            boolean z12 = this.js_;
            if (z12) {
                nVar.n0(15, z12);
            }
            if (!getLangBytes().isEmpty()) {
                h0.writeString(nVar, 16, this.lang_);
            }
            if (!getIpBytes().isEmpty()) {
                h0.writeString(nVar, 17, this.ip_);
            }
            if (!getIpv6Bytes().isEmpty()) {
                h0.writeString(nVar, 18, this.ipv6_);
            }
            if (!getXffBytes().isEmpty()) {
                h0.writeString(nVar, 19, this.xff_);
            }
            boolean z13 = this.iptr_;
            if (z13) {
                nVar.n0(20, z13);
            }
            if (!getCarrierBytes().isEmpty()) {
                h0.writeString(nVar, 21, this.carrier_);
            }
            if (!getMccmncBytes().isEmpty()) {
                h0.writeString(nVar, 22, this.mccmnc_);
            }
            if (!getMccmncsimBytes().isEmpty()) {
                h0.writeString(nVar, 23, this.mccmncsim_);
            }
            if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                nVar.v0(24, this.contype_);
            }
            boolean z14 = this.geofetch_;
            if (z14) {
                nVar.n0(25, z14);
            }
            if (this.geo_ != null) {
                nVar.J0(26, getGeo());
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                nVar.J0(27, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                nVar.J0(28, getExt());
            }
            if (this.connection_ != null) {
                nVar.J0(29, getConnection());
            }
            if (this.audioContext_ != null) {
                nVar.J0(30, getAudioContext());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements DeviceOrBuilder {
            private a2 audioContextBuilder_;
            private AudioContext audioContext_;
            private int bitField0_;
            private Object carrier_;
            private a2 connectionBuilder_;
            private Connection connection_;
            private int contype_;
            private boolean dnt_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private a2 geoBuilder_;
            private Geo geo_;
            private boolean geofetch_;
            private int h_;
            private Object hwv_;
            private Object ifa_;
            private Object ip_;
            private boolean iptr_;
            private Object ipv6_;
            private boolean js_;
            private Object lang_;
            private boolean lmt_;
            private Object make_;
            private Object mccmnc_;
            private Object mccmncsim_;
            private Object model_;
            private int os_;
            private Object osv_;
            private int ppi_;
            private float pxratio_;
            private int type_;
            private Object ua_;
            private int w_;
            private Object xff_;

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 1;
                }
            }

            private a2 getAudioContextFieldBuilder() {
                if (this.audioContextBuilder_ == null) {
                    this.audioContextBuilder_ = new a2(getAudioContext(), getParentForChildren(), isClean());
                    this.audioContext_ = null;
                }
                return this.audioContextBuilder_;
            }

            private a2 getConnectionFieldBuilder() {
                if (this.connectionBuilder_ == null) {
                    this.connectionBuilder_ = new a2(getConnection(), getParentForChildren(), isClean());
                    this.connection_ = null;
                }
                return this.connectionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18839s;
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

            private a2 getGeoFieldBuilder() {
                if (this.geoBuilder_ == null) {
                    this.geoBuilder_ = new a2(getGeo(), getParentForChildren(), isClean());
                    this.geo_ = null;
                }
                return this.geoBuilder_;
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

            public Builder clearAudioContext() {
                if (this.audioContextBuilder_ == null) {
                    this.audioContext_ = null;
                    onChanged();
                    return this;
                }
                this.audioContext_ = null;
                this.audioContextBuilder_ = null;
                return this;
            }

            public Builder clearCarrier() {
                this.carrier_ = Device.getDefaultInstance().getCarrier();
                onChanged();
                return this;
            }

            public Builder clearConnection() {
                if (this.connectionBuilder_ == null) {
                    this.connection_ = null;
                    onChanged();
                    return this;
                }
                this.connection_ = null;
                this.connectionBuilder_ = null;
                return this;
            }

            public Builder clearContype() {
                this.contype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDnt() {
                this.dnt_ = false;
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

            public Builder clearGeo() {
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                    onChanged();
                    return this;
                }
                this.geo_ = null;
                this.geoBuilder_ = null;
                return this;
            }

            public Builder clearGeofetch() {
                this.geofetch_ = false;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHwv() {
                this.hwv_ = Device.getDefaultInstance().getHwv();
                onChanged();
                return this;
            }

            public Builder clearIfa() {
                this.ifa_ = Device.getDefaultInstance().getIfa();
                onChanged();
                return this;
            }

            public Builder clearIp() {
                this.ip_ = Device.getDefaultInstance().getIp();
                onChanged();
                return this;
            }

            public Builder clearIptr() {
                this.iptr_ = false;
                onChanged();
                return this;
            }

            public Builder clearIpv6() {
                this.ipv6_ = Device.getDefaultInstance().getIpv6();
                onChanged();
                return this;
            }

            public Builder clearJs() {
                this.js_ = false;
                onChanged();
                return this;
            }

            public Builder clearLang() {
                this.lang_ = Device.getDefaultInstance().getLang();
                onChanged();
                return this;
            }

            public Builder clearLmt() {
                this.lmt_ = false;
                onChanged();
                return this;
            }

            public Builder clearMake() {
                this.make_ = Device.getDefaultInstance().getMake();
                onChanged();
                return this;
            }

            public Builder clearMccmnc() {
                this.mccmnc_ = Device.getDefaultInstance().getMccmnc();
                onChanged();
                return this;
            }

            public Builder clearMccmncsim() {
                this.mccmncsim_ = Device.getDefaultInstance().getMccmncsim();
                onChanged();
                return this;
            }

            public Builder clearModel() {
                this.model_ = Device.getDefaultInstance().getModel();
                onChanged();
                return this;
            }

            public Builder clearOs() {
                this.os_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOsv() {
                this.osv_ = Device.getDefaultInstance().getOsv();
                onChanged();
                return this;
            }

            public Builder clearPpi() {
                this.ppi_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPxratio() {
                this.pxratio_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUa() {
                this.ua_ = Device.getDefaultInstance().getUa();
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            public Builder clearXff() {
                this.xff_ = Device.getDefaultInstance().getXff();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public AudioContext getAudioContext() {
                a2 a2Var = this.audioContextBuilder_;
                if (a2Var != null) {
                    return (AudioContext) a2Var.e();
                }
                AudioContext audioContext = this.audioContext_;
                return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
            }

            public AudioContext.Builder getAudioContextBuilder() {
                onChanged();
                return (AudioContext.Builder) getAudioContextFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public AudioContextOrBuilder getAudioContextOrBuilder() {
                a2 a2Var = this.audioContextBuilder_;
                if (a2Var != null) {
                    return (AudioContextOrBuilder) a2Var.f();
                }
                AudioContext audioContext = this.audioContext_;
                return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getCarrier() {
                Object obj = this.carrier_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.carrier_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getCarrierBytes() {
                Object obj = this.carrier_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.carrier_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public Connection getConnection() {
                a2 a2Var = this.connectionBuilder_;
                if (a2Var != null) {
                    return (Connection) a2Var.e();
                }
                Connection connection = this.connection_;
                return connection == null ? Connection.getDefaultInstance() : connection;
            }

            public Connection.Builder getConnectionBuilder() {
                onChanged();
                return (Connection.Builder) getConnectionFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ConnectionOrBuilder getConnectionOrBuilder() {
                a2 a2Var = this.connectionBuilder_;
                if (a2Var != null) {
                    return (ConnectionOrBuilder) a2Var.f();
                }
                Connection connection = this.connection_;
                return connection == null ? Connection.getDefaultInstance() : connection;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ConnectionType getContype() {
                ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
                return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getContypeValue() {
                return this.contype_;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f18839s;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getDnt() {
                return this.dnt_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public Geo getGeo() {
                a2 a2Var = this.geoBuilder_;
                if (a2Var != null) {
                    return (Geo) a2Var.e();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            public Geo.Builder getGeoBuilder() {
                onChanged();
                return (Geo.Builder) getGeoFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public GeoOrBuilder getGeoOrBuilder() {
                a2 a2Var = this.geoBuilder_;
                if (a2Var != null) {
                    return (GeoOrBuilder) a2Var.f();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getGeofetch() {
                return this.geofetch_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getHwv() {
                Object obj = this.hwv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.hwv_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getHwvBytes() {
                Object obj = this.hwv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.hwv_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIfa() {
                Object obj = this.ifa_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ifa_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIfaBytes() {
                Object obj = this.ifa_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ifa_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIp() {
                Object obj = this.ip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ip_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIpBytes() {
                Object obj = this.ip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ip_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getIptr() {
                return this.iptr_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIpv6() {
                Object obj = this.ipv6_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ipv6_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIpv6Bytes() {
                Object obj = this.ipv6_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ipv6_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getJs() {
                return this.js_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getLang() {
                Object obj = this.lang_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getLangBytes() {
                Object obj = this.lang_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getLmt() {
                return this.lmt_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMake() {
                Object obj = this.make_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.make_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMakeBytes() {
                Object obj = this.make_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.make_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMccmnc() {
                Object obj = this.mccmnc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mccmnc_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMccmncBytes() {
                Object obj = this.mccmnc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mccmnc_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMccmncsim() {
                Object obj = this.mccmncsim_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mccmncsim_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMccmncsimBytes() {
                Object obj = this.mccmncsim_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mccmncsim_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getModel() {
                Object obj = this.model_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.model_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getModelBytes() {
                Object obj = this.model_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.model_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public OS getOs() {
                OS osValueOf = OS.valueOf(this.os_);
                return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getOsValue() {
                return this.os_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getOsv() {
                Object obj = this.osv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.osv_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getOsvBytes() {
                Object obj = this.osv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.osv_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getPpi() {
                return this.ppi_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public float getPxratio() {
                return this.pxratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public DeviceType getType() {
                DeviceType deviceTypeValueOf = DeviceType.valueOf(this.type_);
                return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getUa() {
                Object obj = this.ua_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ua_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getUaBytes() {
                Object obj = this.ua_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ua_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getXff() {
                Object obj = this.xff_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.xff_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getXffBytes() {
                Object obj = this.xff_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.xff_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasAudioContext() {
                return (this.audioContextBuilder_ == null && this.audioContext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasConnection() {
                return (this.connectionBuilder_ == null && this.connection_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasGeo() {
                return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18841t.d(Device.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAudioContext(AudioContext audioContext) {
                a2 a2Var = this.audioContextBuilder_;
                if (a2Var != null) {
                    a2Var.g(audioContext);
                    return this;
                }
                AudioContext audioContext2 = this.audioContext_;
                if (audioContext2 != null) {
                    this.audioContext_ = AudioContext.newBuilder(audioContext2).mergeFrom(audioContext).buildPartial();
                } else {
                    this.audioContext_ = audioContext;
                }
                onChanged();
                return this;
            }

            public Builder mergeConnection(Connection connection) {
                a2 a2Var = this.connectionBuilder_;
                if (a2Var != null) {
                    a2Var.g(connection);
                    return this;
                }
                Connection connection2 = this.connection_;
                if (connection2 != null) {
                    this.connection_ = Connection.newBuilder(connection2).mergeFrom(connection).buildPartial();
                } else {
                    this.connection_ = connection;
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

            public Builder mergeGeo(Geo geo) {
                a2 a2Var = this.geoBuilder_;
                if (a2Var != null) {
                    a2Var.g(geo);
                    return this;
                }
                Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
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

            public Builder setAudioContext(AudioContext audioContext) {
                a2 a2Var = this.audioContextBuilder_;
                if (a2Var != null) {
                    a2Var.i(audioContext);
                    return this;
                }
                audioContext.getClass();
                this.audioContext_ = audioContext;
                onChanged();
                return this;
            }

            public Builder setCarrier(String str) {
                str.getClass();
                this.carrier_ = str;
                onChanged();
                return this;
            }

            public Builder setCarrierBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.carrier_ = byteString;
                onChanged();
                return this;
            }

            public Builder setConnection(Connection connection) {
                a2 a2Var = this.connectionBuilder_;
                if (a2Var != null) {
                    a2Var.i(connection);
                    return this;
                }
                connection.getClass();
                this.connection_ = connection;
                onChanged();
                return this;
            }

            public Builder setContype(ConnectionType connectionType) {
                connectionType.getClass();
                this.contype_ = connectionType.getNumber();
                onChanged();
                return this;
            }

            public Builder setContypeValue(int i10) {
                this.contype_ = i10;
                onChanged();
                return this;
            }

            public Builder setDnt(boolean z10) {
                this.dnt_ = z10;
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

            public Builder setGeo(Geo geo) {
                a2 a2Var = this.geoBuilder_;
                if (a2Var != null) {
                    a2Var.i(geo);
                    return this;
                }
                geo.getClass();
                this.geo_ = geo;
                onChanged();
                return this;
            }

            public Builder setGeofetch(boolean z10) {
                this.geofetch_ = z10;
                onChanged();
                return this;
            }

            public Builder setH(int i10) {
                this.h_ = i10;
                onChanged();
                return this;
            }

            public Builder setHwv(String str) {
                str.getClass();
                this.hwv_ = str;
                onChanged();
                return this;
            }

            public Builder setHwvBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.hwv_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIfa(String str) {
                str.getClass();
                this.ifa_ = str;
                onChanged();
                return this;
            }

            public Builder setIfaBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.ifa_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIp(String str) {
                str.getClass();
                this.ip_ = str;
                onChanged();
                return this;
            }

            public Builder setIpBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.ip_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIptr(boolean z10) {
                this.iptr_ = z10;
                onChanged();
                return this;
            }

            public Builder setIpv6(String str) {
                str.getClass();
                this.ipv6_ = str;
                onChanged();
                return this;
            }

            public Builder setIpv6Bytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.ipv6_ = byteString;
                onChanged();
                return this;
            }

            public Builder setJs(boolean z10) {
                this.js_ = z10;
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

            public Builder setLmt(boolean z10) {
                this.lmt_ = z10;
                onChanged();
                return this;
            }

            public Builder setMake(String str) {
                str.getClass();
                this.make_ = str;
                onChanged();
                return this;
            }

            public Builder setMakeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.make_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMccmnc(String str) {
                str.getClass();
                this.mccmnc_ = str;
                onChanged();
                return this;
            }

            public Builder setMccmncBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.mccmnc_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMccmncsim(String str) {
                str.getClass();
                this.mccmncsim_ = str;
                onChanged();
                return this;
            }

            public Builder setMccmncsimBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.mccmncsim_ = byteString;
                onChanged();
                return this;
            }

            public Builder setModel(String str) {
                str.getClass();
                this.model_ = str;
                onChanged();
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.model_ = byteString;
                onChanged();
                return this;
            }

            public Builder setOs(OS os) {
                os.getClass();
                this.os_ = os.getNumber();
                onChanged();
                return this;
            }

            public Builder setOsValue(int i10) {
                this.os_ = i10;
                onChanged();
                return this;
            }

            public Builder setOsv(String str) {
                str.getClass();
                this.osv_ = str;
                onChanged();
                return this;
            }

            public Builder setOsvBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.osv_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPpi(int i10) {
                this.ppi_ = i10;
                onChanged();
                return this;
            }

            public Builder setPxratio(float f10) {
                this.pxratio_ = f10;
                onChanged();
                return this;
            }

            public Builder setType(DeviceType deviceType) {
                deviceType.getClass();
                this.type_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            public Builder setUa(String str) {
                str.getClass();
                this.ua_ = str;
                onChanged();
                return this;
            }

            public Builder setUaBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.ua_ = byteString;
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            public Builder setXff(String str) {
                str.getClass();
                this.xff_ = str;
                onChanged();
                return this;
            }

            public Builder setXffBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.xff_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Device build() {
                Device deviceBuildPartial = buildPartial();
                if (deviceBuildPartial.isInitialized()) {
                    return deviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Device buildPartial() {
                Device device = new Device(this);
                device.type_ = this.type_;
                device.ua_ = this.ua_;
                device.ifa_ = this.ifa_;
                device.dnt_ = this.dnt_;
                device.lmt_ = this.lmt_;
                device.make_ = this.make_;
                device.model_ = this.model_;
                device.os_ = this.os_;
                device.osv_ = this.osv_;
                device.hwv_ = this.hwv_;
                device.h_ = this.h_;
                device.w_ = this.w_;
                device.ppi_ = this.ppi_;
                device.pxratio_ = this.pxratio_;
                device.js_ = this.js_;
                device.lang_ = this.lang_;
                device.ip_ = this.ip_;
                device.ipv6_ = this.ipv6_;
                device.xff_ = this.xff_;
                device.iptr_ = this.iptr_;
                device.carrier_ = this.carrier_;
                device.mccmnc_ = this.mccmnc_;
                device.mccmncsim_ = this.mccmncsim_;
                device.contype_ = this.contype_;
                device.geofetch_ = this.geofetch_;
                a2 a2Var = this.geoBuilder_;
                if (a2Var == null) {
                    device.geo_ = this.geo_;
                } else {
                    device.geo_ = (Geo) a2Var.a();
                }
                a2 a2Var2 = this.connectionBuilder_;
                if (a2Var2 == null) {
                    device.connection_ = this.connection_;
                } else {
                    device.connection_ = (Connection) a2Var2.a();
                }
                a2 a2Var3 = this.audioContextBuilder_;
                if (a2Var3 == null) {
                    device.audioContext_ = this.audioContext_;
                } else {
                    device.audioContext_ = (AudioContext) a2Var3.a();
                }
                a2 a2Var4 = this.extBuilder_;
                if (a2Var4 == null) {
                    device.ext_ = this.ext_;
                } else {
                    device.ext_ = (Struct) a2Var4.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    device.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    device.extProto_ = this.extProto_;
                }
                onBuilt();
                return device;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Device getDefaultInstanceForType() {
                return Device.getDefaultInstance();
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
                this.ua_ = "";
                this.ifa_ = "";
                this.dnt_ = false;
                this.lmt_ = false;
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.h_ = 0;
                this.w_ = 0;
                this.ppi_ = 0;
                this.pxratio_ = 0.0f;
                this.js_ = false;
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.iptr_ = false;
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.geofetch_ = false;
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                if (this.connectionBuilder_ == null) {
                    this.connection_ = null;
                } else {
                    this.connection_ = null;
                    this.connectionBuilder_ = null;
                }
                if (this.audioContextBuilder_ == null) {
                    this.audioContext_ = null;
                } else {
                    this.audioContext_ = null;
                    this.audioContextBuilder_ = null;
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

            public Builder setAudioContext(AudioContext.Builder builder) {
                a2 a2Var = this.audioContextBuilder_;
                if (a2Var == null) {
                    this.audioContext_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setConnection(Connection.Builder builder) {
                a2 a2Var = this.connectionBuilder_;
                if (a2Var == null) {
                    this.connection_ = builder.build();
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

            public Builder setGeo(Geo.Builder builder) {
                a2 a2Var = this.geoBuilder_;
                if (a2Var == null) {
                    this.geo_ = builder.build();
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
                if (message instanceof Device) {
                    return mergeFrom((Device) message);
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

            public Builder mergeFrom(Device device) {
                if (device == Device.getDefaultInstance()) {
                    return this;
                }
                if (device.type_ != 0) {
                    setTypeValue(device.getTypeValue());
                }
                if (!device.getUa().isEmpty()) {
                    this.ua_ = device.ua_;
                    onChanged();
                }
                if (!device.getIfa().isEmpty()) {
                    this.ifa_ = device.ifa_;
                    onChanged();
                }
                if (device.getDnt()) {
                    setDnt(device.getDnt());
                }
                if (device.getLmt()) {
                    setLmt(device.getLmt());
                }
                if (!device.getMake().isEmpty()) {
                    this.make_ = device.make_;
                    onChanged();
                }
                if (!device.getModel().isEmpty()) {
                    this.model_ = device.model_;
                    onChanged();
                }
                if (device.os_ != 0) {
                    setOsValue(device.getOsValue());
                }
                if (!device.getOsv().isEmpty()) {
                    this.osv_ = device.osv_;
                    onChanged();
                }
                if (!device.getHwv().isEmpty()) {
                    this.hwv_ = device.hwv_;
                    onChanged();
                }
                if (device.getH() != 0) {
                    setH(device.getH());
                }
                if (device.getW() != 0) {
                    setW(device.getW());
                }
                if (device.getPpi() != 0) {
                    setPpi(device.getPpi());
                }
                if (device.getPxratio() != 0.0f) {
                    setPxratio(device.getPxratio());
                }
                if (device.getJs()) {
                    setJs(device.getJs());
                }
                if (!device.getLang().isEmpty()) {
                    this.lang_ = device.lang_;
                    onChanged();
                }
                if (!device.getIp().isEmpty()) {
                    this.ip_ = device.ip_;
                    onChanged();
                }
                if (!device.getIpv6().isEmpty()) {
                    this.ipv6_ = device.ipv6_;
                    onChanged();
                }
                if (!device.getXff().isEmpty()) {
                    this.xff_ = device.xff_;
                    onChanged();
                }
                if (device.getIptr()) {
                    setIptr(device.getIptr());
                }
                if (!device.getCarrier().isEmpty()) {
                    this.carrier_ = device.carrier_;
                    onChanged();
                }
                if (!device.getMccmnc().isEmpty()) {
                    this.mccmnc_ = device.mccmnc_;
                    onChanged();
                }
                if (!device.getMccmncsim().isEmpty()) {
                    this.mccmncsim_ = device.mccmncsim_;
                    onChanged();
                }
                if (device.contype_ != 0) {
                    setContypeValue(device.getContypeValue());
                }
                if (device.getGeofetch()) {
                    setGeofetch(device.getGeofetch());
                }
                if (device.hasGeo()) {
                    mergeGeo(device.getGeo());
                }
                if (device.hasConnection()) {
                    mergeConnection(device.getConnection());
                }
                if (device.hasAudioContext()) {
                    mergeAudioContext(device.getAudioContext());
                }
                if (device.hasExt()) {
                    mergeExt(device.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!device.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = device.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(device.extProto_);
                        }
                        onChanged();
                    }
                } else if (!device.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(device.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = device.extProto_;
                        this.bitField0_ &= -2;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) device).unknownFields);
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

            private Builder(h0.c cVar) {
                super(cVar);
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.adcom.Context.Device.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.Device.access$25300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Device r3 = (com.explorestack.protobuf.adcom.Context.Device) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Device r4 = (com.explorestack.protobuf.adcom.Context.Device) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Device.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Device$Builder");
            }
        }

        public static Builder newBuilder(Device device) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Device(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Device parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Device) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Device getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Device parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Device() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.ua_ = "";
            this.ifa_ = "";
            this.make_ = "";
            this.model_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.hwv_ = "";
            this.lang_ = "";
            this.ip_ = "";
            this.ipv6_ = "";
            this.xff_ = "";
            this.carrier_ = "";
            this.mccmnc_ = "";
            this.mccmncsim_ = "";
            this.contype_ = 0;
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Device parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(bArr, wVar);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Device) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Device parseFrom(l lVar) throws IOException {
            return (Device) h0.parseWithIOException(PARSER, lVar);
        }

        public static Device parseFrom(l lVar, w wVar) throws IOException {
            return (Device) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Device(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.type_ = lVar.t();
                                break;
                            case 18:
                                this.ua_ = lVar.J();
                                break;
                            case 26:
                                this.ifa_ = lVar.J();
                                break;
                            case 32:
                                this.dnt_ = lVar.q();
                                break;
                            case 40:
                                this.lmt_ = lVar.q();
                                break;
                            case 50:
                                this.make_ = lVar.J();
                                break;
                            case 58:
                                this.model_ = lVar.J();
                                break;
                            case 64:
                                this.os_ = lVar.t();
                                break;
                            case 74:
                                this.osv_ = lVar.J();
                                break;
                            case 82:
                                this.hwv_ = lVar.J();
                                break;
                            case 88:
                                this.h_ = lVar.L();
                                break;
                            case 96:
                                this.w_ = lVar.L();
                                break;
                            case 104:
                                this.ppi_ = lVar.L();
                                break;
                            case 117:
                                this.pxratio_ = lVar.w();
                                break;
                            case 120:
                                this.js_ = lVar.q();
                                break;
                            case 130:
                                this.lang_ = lVar.J();
                                break;
                            case 138:
                                this.ip_ = lVar.J();
                                break;
                            case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                                this.ipv6_ = lVar.J();
                                break;
                            case 154:
                                this.xff_ = lVar.J();
                                break;
                            case 160:
                                this.iptr_ = lVar.q();
                                break;
                            case 170:
                                this.carrier_ = lVar.J();
                                break;
                            case 178:
                                this.mccmnc_ = lVar.J();
                                break;
                            case 186:
                                this.mccmncsim_ = lVar.J();
                                break;
                            case 192:
                                this.contype_ = lVar.t();
                                break;
                            case 200:
                                this.geofetch_ = lVar.q();
                                break;
                            case 210:
                                Geo geo = this.geo_;
                                Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                                Geo geo2 = (Geo) lVar.A(Geo.parser(), wVar);
                                this.geo_ = geo2;
                                if (builder != null) {
                                    builder.mergeFrom(geo2);
                                    this.geo_ = builder.buildPartial();
                                }
                                break;
                            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                if (b10 == false) {
                                    this.extProto_ = new ArrayList();
                                    b10 = true;
                                }
                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                break;
                            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                Struct struct = this.ext_;
                                Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.ext_ = struct2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(struct2);
                                    this.ext_ = builder2.buildPartial();
                                }
                                break;
                            case 234:
                                Connection connection = this.connection_;
                                Connection.Builder builder3 = connection != null ? connection.toBuilder() : null;
                                Connection connection2 = (Connection) lVar.A(Connection.parser(), wVar);
                                this.connection_ = connection2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(connection2);
                                    this.connection_ = builder3.buildPartial();
                                }
                                break;
                            case 242:
                                AudioContext audioContext = this.audioContext_;
                                AudioContext.Builder builder4 = audioContext != null ? audioContext.toBuilder() : null;
                                AudioContext audioContext2 = (AudioContext) lVar.A(AudioContext.parser(), wVar);
                                this.audioContext_ = audioContext2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(audioContext2);
                                    this.audioContext_ = builder4.buildPartial();
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
    }

    public interface DeviceOrBuilder extends MessageOrBuilder {
        Device.AudioContext getAudioContext();

        Device.AudioContextOrBuilder getAudioContextOrBuilder();

        String getCarrier();

        ByteString getCarrierBytes();

        Device.Connection getConnection();

        Device.ConnectionOrBuilder getConnectionOrBuilder();

        ConnectionType getContype();

        int getContypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        boolean getDnt();

        Struct getExt();

        e2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        Geo getGeo();

        GeoOrBuilder getGeoOrBuilder();

        boolean getGeofetch();

        int getH();

        String getHwv();

        ByteString getHwvBytes();

        String getIfa();

        ByteString getIfaBytes();

        String getIp();

        ByteString getIpBytes();

        boolean getIptr();

        String getIpv6();

        ByteString getIpv6Bytes();

        boolean getJs();

        String getLang();

        ByteString getLangBytes();

        boolean getLmt();

        String getMake();

        ByteString getMakeBytes();

        String getMccmnc();

        ByteString getMccmncBytes();

        String getMccmncsim();

        ByteString getMccmncsimBytes();

        String getModel();

        ByteString getModelBytes();

        OS getOs();

        int getOsValue();

        String getOsv();

        ByteString getOsvBytes();

        int getPpi();

        float getPxratio();

        DeviceType getType();

        int getTypeValue();

        String getUa();

        ByteString getUaBytes();

        int getW();

        String getXff();

        ByteString getXffBytes();

        boolean hasAudioContext();

        boolean hasConnection();

        boolean hasExt();

        boolean hasGeo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Geo extends h0 implements GeoOrBuilder {
        public static final int ACCUR_FIELD_NUMBER = 4;
        public static final int CITY_FIELD_NUMBER = 10;
        public static final int COUNTRY_FIELD_NUMBER = 7;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int IPSERV_FIELD_NUMBER = 6;
        public static final int LASTFIX_FIELD_NUMBER = 5;
        public static final int LAT_FIELD_NUMBER = 2;
        public static final int LON_FIELD_NUMBER = 3;
        public static final int METRO_FIELD_NUMBER = 9;
        public static final int REGION_FIELD_NUMBER = 8;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UTCOFFSET_FIELD_NUMBER = 12;
        public static final int ZIP_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int accur_;
        private volatile Object city_;
        private volatile Object country_;
        private List<Any> extProto_;
        private Struct ext_;
        private int ipserv_;
        private long lastfix_;
        private float lat_;
        private float lon_;
        private byte memoizedIsInitialized;
        private volatile Object metro_;
        private volatile Object region_;
        private int type_;
        private int utcoffset_;
        private volatile Object zip_;
        private static final Geo DEFAULT_INSTANCE = new Geo();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.Geo.1
            @Override // com.explorestack.protobuf.p1
            public Geo parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Geo(lVar, wVar);
            }
        };

        public static Geo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18835q;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Geo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geo) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Geo)) {
                return super.equals(obj);
            }
            Geo geo = (Geo) obj;
            if (this.type_ == geo.type_ && Float.floatToIntBits(getLat()) == Float.floatToIntBits(geo.getLat()) && Float.floatToIntBits(getLon()) == Float.floatToIntBits(geo.getLon()) && getAccur() == geo.getAccur() && getLastfix() == geo.getLastfix() && this.ipserv_ == geo.ipserv_ && getCountry().equals(geo.getCountry()) && getRegion().equals(geo.getRegion()) && getMetro().equals(geo.getMetro()) && getCity().equals(geo.getCity()) && getZip().equals(geo.getZip()) && getUtcoffset() == geo.getUtcoffset() && hasExt() == geo.hasExt()) {
                return (!hasExt() || getExt().equals(geo.getExt())) && getExtProtoList().equals(geo.getExtProtoList()) && this.unknownFields.equals(geo.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getAccur() {
            return this.accur_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getCountry() {
            Object obj = this.country_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.country_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getCountryBytes() {
            Object obj = this.country_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.country_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public IpLocationService getIpserv() {
            IpLocationService ipLocationServiceValueOf = IpLocationService.valueOf(this.ipserv_);
            return ipLocationServiceValueOf == null ? IpLocationService.UNRECOGNIZED : ipLocationServiceValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getIpservValue() {
            return this.ipserv_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public long getLastfix() {
            return this.lastfix_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public float getLat() {
            return this.lat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public float getLon() {
            return this.lon_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getMetro() {
            Object obj = this.metro_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.metro_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getMetroBytes() {
            Object obj = this.metro_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.metro_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getRegion() {
            Object obj = this.region_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.region_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getRegionBytes() {
            Object obj = this.region_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.region_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.type_ != LocationType.LOCATION_TYPE_INVALID.getNumber() ? n.l(1, this.type_) : 0;
            float f10 = this.lat_;
            if (f10 != 0.0f) {
                iL += n.r(2, f10);
            }
            float f11 = this.lon_;
            if (f11 != 0.0f) {
                iL += n.r(3, f11);
            }
            int i11 = this.accur_;
            if (i11 != 0) {
                iL += n.Y(4, i11);
            }
            long j10 = this.lastfix_;
            if (j10 != 0) {
                iL += n.a0(5, j10);
            }
            if (this.ipserv_ != IpLocationService.IP_LOCATION_SERVICE_INVALID.getNumber()) {
                iL += n.l(6, this.ipserv_);
            }
            if (!getCountryBytes().isEmpty()) {
                iL += h0.computeStringSize(7, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                iL += h0.computeStringSize(8, this.region_);
            }
            if (!getMetroBytes().isEmpty()) {
                iL += h0.computeStringSize(9, this.metro_);
            }
            if (!getCityBytes().isEmpty()) {
                iL += h0.computeStringSize(10, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                iL += h0.computeStringSize(11, this.zip_);
            }
            int i12 = this.utcoffset_;
            if (i12 != 0) {
                iL += n.x(12, i12);
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                iL += n.G(13, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                iL += n.G(14, getExt());
            }
            int serializedSize = iL + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public LocationType getType() {
            LocationType locationTypeValueOf = LocationType.valueOf(this.type_);
            return locationTypeValueOf == null ? LocationType.UNRECOGNIZED : locationTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getUtcoffset() {
            return this.utcoffset_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getZip() {
            Object obj = this.zip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.zip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getZipBytes() {
            Object obj = this.zip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.zip_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + Float.floatToIntBits(getLat())) * 37) + 3) * 53) + Float.floatToIntBits(getLon())) * 37) + 4) * 53) + getAccur()) * 37) + 5) * 53) + j0.i(getLastfix())) * 37) + 6) * 53) + this.ipserv_) * 37) + 7) * 53) + getCountry().hashCode()) * 37) + 8) * 53) + getRegion().hashCode()) * 37) + 9) * 53) + getMetro().hashCode()) * 37) + 10) * 53) + getCity().hashCode()) * 37) + 11) * 53) + getZip().hashCode()) * 37) + 12) * 53) + getUtcoffset();
            if (hasExt()) {
                iHashCode = (((iHashCode * 37) + 14) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode = (((iHashCode * 37) + 13) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.f18837r.d(Geo.class, Builder.class);
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
            return new Geo();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.type_ != LocationType.LOCATION_TYPE_INVALID.getNumber()) {
                nVar.v0(1, this.type_);
            }
            float f10 = this.lat_;
            if (f10 != 0.0f) {
                nVar.B0(2, f10);
            }
            float f11 = this.lon_;
            if (f11 != 0.0f) {
                nVar.B0(3, f11);
            }
            int i10 = this.accur_;
            if (i10 != 0) {
                nVar.W0(4, i10);
            }
            long j10 = this.lastfix_;
            if (j10 != 0) {
                nVar.Y0(5, j10);
            }
            if (this.ipserv_ != IpLocationService.IP_LOCATION_SERVICE_INVALID.getNumber()) {
                nVar.v0(6, this.ipserv_);
            }
            if (!getCountryBytes().isEmpty()) {
                h0.writeString(nVar, 7, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                h0.writeString(nVar, 8, this.region_);
            }
            if (!getMetroBytes().isEmpty()) {
                h0.writeString(nVar, 9, this.metro_);
            }
            if (!getCityBytes().isEmpty()) {
                h0.writeString(nVar, 10, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                h0.writeString(nVar, 11, this.zip_);
            }
            int i11 = this.utcoffset_;
            if (i11 != 0) {
                nVar.F0(12, i11);
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                nVar.J0(13, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                nVar.J0(14, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements GeoOrBuilder {
            private int accur_;
            private int bitField0_;
            private Object city_;
            private Object country_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int ipserv_;
            private long lastfix_;
            private float lat_;
            private float lon_;
            private Object metro_;
            private Object region_;
            private int type_;
            private int utcoffset_;
            private Object zip_;

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18835q;
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

            public Builder clearAccur() {
                this.accur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCity() {
                this.city_ = Geo.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder clearCountry() {
                this.country_ = Geo.getDefaultInstance().getCountry();
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

            public Builder clearIpserv() {
                this.ipserv_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLastfix() {
                this.lastfix_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearLat() {
                this.lat_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearLon() {
                this.lon_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMetro() {
                this.metro_ = Geo.getDefaultInstance().getMetro();
                onChanged();
                return this;
            }

            public Builder clearRegion() {
                this.region_ = Geo.getDefaultInstance().getRegion();
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUtcoffset() {
                this.utcoffset_ = 0;
                onChanged();
                return this;
            }

            public Builder clearZip() {
                this.zip_ = Geo.getDefaultInstance().getZip();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getAccur() {
                return this.accur_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getCountry() {
                Object obj = this.country_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.country_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getCountryBytes() {
                Object obj = this.country_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.country_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f18835q;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public IpLocationService getIpserv() {
                IpLocationService ipLocationServiceValueOf = IpLocationService.valueOf(this.ipserv_);
                return ipLocationServiceValueOf == null ? IpLocationService.UNRECOGNIZED : ipLocationServiceValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getIpservValue() {
                return this.ipserv_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public long getLastfix() {
                return this.lastfix_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public float getLat() {
                return this.lat_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public float getLon() {
                return this.lon_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getMetro() {
                Object obj = this.metro_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.metro_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getMetroBytes() {
                Object obj = this.metro_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.metro_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getRegion() {
                Object obj = this.region_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.region_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getRegionBytes() {
                Object obj = this.region_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.region_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public LocationType getType() {
                LocationType locationTypeValueOf = LocationType.valueOf(this.type_);
                return locationTypeValueOf == null ? LocationType.UNRECOGNIZED : locationTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getUtcoffset() {
                return this.utcoffset_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getZip() {
                Object obj = this.zip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.zip_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getZipBytes() {
                Object obj = this.zip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.zip_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18837r.d(Geo.class, Builder.class);
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

            public Builder setAccur(int i10) {
                this.accur_ = i10;
                onChanged();
                return this;
            }

            public Builder setCity(String str) {
                str.getClass();
                this.city_ = str;
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.city_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCountry(String str) {
                str.getClass();
                this.country_ = str;
                onChanged();
                return this;
            }

            public Builder setCountryBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.country_ = byteString;
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

            public Builder setIpserv(IpLocationService ipLocationService) {
                ipLocationService.getClass();
                this.ipserv_ = ipLocationService.getNumber();
                onChanged();
                return this;
            }

            public Builder setIpservValue(int i10) {
                this.ipserv_ = i10;
                onChanged();
                return this;
            }

            public Builder setLastfix(long j10) {
                this.lastfix_ = j10;
                onChanged();
                return this;
            }

            public Builder setLat(float f10) {
                this.lat_ = f10;
                onChanged();
                return this;
            }

            public Builder setLon(float f10) {
                this.lon_ = f10;
                onChanged();
                return this;
            }

            public Builder setMetro(String str) {
                str.getClass();
                this.metro_ = str;
                onChanged();
                return this;
            }

            public Builder setMetroBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.metro_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRegion(String str) {
                str.getClass();
                this.region_ = str;
                onChanged();
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.region_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(LocationType locationType) {
                locationType.getClass();
                this.type_ = locationType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            public Builder setUtcoffset(int i10) {
                this.utcoffset_ = i10;
                onChanged();
                return this;
            }

            public Builder setZip(String str) {
                str.getClass();
                this.zip_ = str;
                onChanged();
                return this;
            }

            public Builder setZipBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.zip_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Geo build() {
                Geo geoBuildPartial = buildPartial();
                if (geoBuildPartial.isInitialized()) {
                    return geoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) geoBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Geo buildPartial() {
                Geo geo = new Geo(this);
                geo.type_ = this.type_;
                geo.lat_ = this.lat_;
                geo.lon_ = this.lon_;
                geo.accur_ = this.accur_;
                geo.lastfix_ = this.lastfix_;
                geo.ipserv_ = this.ipserv_;
                geo.country_ = this.country_;
                geo.region_ = this.region_;
                geo.metro_ = this.metro_;
                geo.city_ = this.city_;
                geo.zip_ = this.zip_;
                geo.utcoffset_ = this.utcoffset_;
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    geo.ext_ = this.ext_;
                } else {
                    geo.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    geo.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    geo.extProto_ = this.extProto_;
                }
                onBuilt();
                return geo;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Geo getDefaultInstanceForType() {
                return Geo.getDefaultInstance();
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
                this.lat_ = 0.0f;
                this.lon_ = 0.0f;
                this.accur_ = 0;
                this.lastfix_ = 0L;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.utcoffset_ = 0;
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
                if (message instanceof Geo) {
                    return mergeFrom((Geo) message);
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

            public Builder mergeFrom(Geo geo) {
                if (geo == Geo.getDefaultInstance()) {
                    return this;
                }
                if (geo.type_ != 0) {
                    setTypeValue(geo.getTypeValue());
                }
                if (geo.getLat() != 0.0f) {
                    setLat(geo.getLat());
                }
                if (geo.getLon() != 0.0f) {
                    setLon(geo.getLon());
                }
                if (geo.getAccur() != 0) {
                    setAccur(geo.getAccur());
                }
                if (geo.getLastfix() != 0) {
                    setLastfix(geo.getLastfix());
                }
                if (geo.ipserv_ != 0) {
                    setIpservValue(geo.getIpservValue());
                }
                if (!geo.getCountry().isEmpty()) {
                    this.country_ = geo.country_;
                    onChanged();
                }
                if (!geo.getRegion().isEmpty()) {
                    this.region_ = geo.region_;
                    onChanged();
                }
                if (!geo.getMetro().isEmpty()) {
                    this.metro_ = geo.metro_;
                    onChanged();
                }
                if (!geo.getCity().isEmpty()) {
                    this.city_ = geo.city_;
                    onChanged();
                }
                if (!geo.getZip().isEmpty()) {
                    this.zip_ = geo.zip_;
                    onChanged();
                }
                if (geo.getUtcoffset() != 0) {
                    setUtcoffset(geo.getUtcoffset());
                }
                if (geo.hasExt()) {
                    mergeExt(geo.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!geo.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = geo.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(geo.extProto_);
                        }
                        onChanged();
                    }
                } else if (!geo.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(geo.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = geo.extProto_;
                        this.bitField0_ &= -2;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) geo).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.type_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
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
            public com.explorestack.protobuf.adcom.Context.Geo.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.Geo.access$19100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Geo r3 = (com.explorestack.protobuf.adcom.Context.Geo) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Geo r4 = (com.explorestack.protobuf.adcom.Context.Geo) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Geo.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Geo$Builder");
            }
        }

        public static Builder newBuilder(Geo geo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(geo);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Geo(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Geo parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Geo) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Geo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Geo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Geo parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Geo() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.ipserv_ = 0;
            this.country_ = "";
            this.region_ = "";
            this.metro_ = "";
            this.city_ = "";
            this.zip_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Geo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Geo parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(bArr, wVar);
        }

        public static Geo parseFrom(InputStream inputStream) throws IOException {
            return (Geo) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Geo parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Geo) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Geo parseFrom(l lVar) throws IOException {
            return (Geo) h0.parseWithIOException(PARSER, lVar);
        }

        public static Geo parseFrom(l lVar, w wVar) throws IOException {
            return (Geo) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private Geo(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.type_ = lVar.t();
                                break;
                            case 21:
                                this.lat_ = lVar.w();
                                break;
                            case 29:
                                this.lon_ = lVar.w();
                                break;
                            case 32:
                                this.accur_ = lVar.L();
                                break;
                            case 40:
                                this.lastfix_ = lVar.M();
                                break;
                            case 48:
                                this.ipserv_ = lVar.t();
                                break;
                            case 58:
                                this.country_ = lVar.J();
                                break;
                            case 66:
                                this.region_ = lVar.J();
                                break;
                            case 74:
                                this.metro_ = lVar.J();
                                break;
                            case 82:
                                this.city_ = lVar.J();
                                break;
                            case 90:
                                this.zip_ = lVar.J();
                                break;
                            case 96:
                                this.utcoffset_ = lVar.y();
                                break;
                            case 106:
                                if (!z11) {
                                    this.extProto_ = new ArrayList();
                                    z11 = true;
                                }
                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                break;
                            case 114:
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
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
    }

    public interface GeoOrBuilder extends MessageOrBuilder {
        int getAccur();

        String getCity();

        ByteString getCityBytes();

        String getCountry();

        ByteString getCountryBytes();

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

        IpLocationService getIpserv();

        int getIpservValue();

        long getLastfix();

        float getLat();

        float getLon();

        String getMetro();

        ByteString getMetroBytes();

        String getRegion();

        ByteString getRegionBytes();

        LocationType getType();

        int getTypeValue();

        int getUtcoffset();

        String getZip();

        ByteString getZipBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Regs extends h0 implements RegsOrBuilder {
        public static final int COPPA_FIELD_NUMBER = 1;
        public static final int EXT_FIELD_NUMBER = 4;
        public static final int EXT_PROTO_FIELD_NUMBER = 3;
        public static final int GDPR_FIELD_NUMBER = 2;
        public static final int GPP_FIELD_NUMBER = 5;
        public static final int GPP_SID_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private boolean coppa_;
        private List<Any> extProto_;
        private Struct ext_;
        private boolean gdpr_;
        private int gppSidMemoizedSerializedSize;
        private j0.g gppSid_;
        private volatile Object gpp_;
        private byte memoizedIsInitialized;
        private static final Regs DEFAULT_INSTANCE = new Regs();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.Regs.1
            @Override // com.explorestack.protobuf.p1
            public Regs parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Regs(lVar, wVar);
            }
        };

        public static Regs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18851y;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Regs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Regs) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Regs)) {
                return super.equals(obj);
            }
            Regs regs = (Regs) obj;
            if (getCoppa() == regs.getCoppa() && getGdpr() == regs.getGdpr() && getGpp().equals(regs.getGpp()) && getGppSidList().equals(regs.getGppSidList()) && hasExt() == regs.hasExt()) {
                return (!hasExt() || getExt().equals(regs.getExt())) && getExtProtoList().equals(regs.getExtProtoList()) && this.unknownFields.equals(regs.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean getCoppa() {
            return this.coppa_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean getGdpr() {
            return this.gdpr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public String getGpp() {
            Object obj = this.gpp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public ByteString getGppBytes() {
            Object obj = this.gpp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getGppSid(int i10) {
            return this.gppSid_.getInt(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getGppSidCount() {
            return this.gppSid_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<Integer> getGppSidList() {
            return this.gppSid_;
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
            boolean z10 = this.coppa_;
            int iE = z10 ? n.e(1, z10) : 0;
            boolean z11 = this.gdpr_;
            if (z11) {
                iE += n.e(2, z11);
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                iE += n.G(3, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                iE += n.G(4, getExt());
            }
            if (!getGppBytes().isEmpty()) {
                iE += h0.computeStringSize(5, this.gpp_);
            }
            int iZ = 0;
            for (int i12 = 0; i12 < this.gppSid_.size(); i12++) {
                iZ += n.Z(this.gppSid_.getInt(i12));
            }
            int iY = iE + iZ;
            if (!getGppSidList().isEmpty()) {
                iY = iY + 1 + n.y(iZ);
            }
            this.gppSidMemoizedSerializedSize = iZ;
            int serializedSize = iY + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getCoppa())) * 37) + 2) * 53) + j0.d(getGdpr())) * 37) + 5) * 53) + getGpp().hashCode();
            if (getGppSidCount() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getGppSidList().hashCode();
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
            return b.f18853z.d(Regs.class, Builder.class);
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
            return new Regs();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            boolean z10 = this.coppa_;
            if (z10) {
                nVar.n0(1, z10);
            }
            boolean z11 = this.gdpr_;
            if (z11) {
                nVar.n0(2, z11);
            }
            for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                nVar.J0(3, this.extProto_.get(i10));
            }
            if (this.ext_ != null) {
                nVar.J0(4, getExt());
            }
            if (!getGppBytes().isEmpty()) {
                h0.writeString(nVar, 5, this.gpp_);
            }
            if (getGppSidList().size() > 0) {
                nVar.X0(50);
                nVar.X0(this.gppSidMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.gppSid_.size(); i11++) {
                nVar.X0(this.gppSid_.getInt(i11));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements RegsOrBuilder {
            private int bitField0_;
            private boolean coppa_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private boolean gdpr_;
            private j0.g gppSid_;
            private Object gpp_;

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureGppSidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.gppSid_ = h0.mutableCopy(this.gppSid_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f18851y;
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

            public Builder addAllGppSid(Iterable<? extends Integer> iterable) {
                ensureGppSidIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.gppSid_);
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

            public Builder addGppSid(int i10) {
                ensureGppSidIsMutable();
                this.gppSid_.addInt(i10);
                onChanged();
                return this;
            }

            public Builder clearCoppa() {
                this.coppa_ = false;
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

            public Builder clearGdpr() {
                this.gdpr_ = false;
                onChanged();
                return this;
            }

            public Builder clearGpp() {
                this.gpp_ = Regs.getDefaultInstance().getGpp();
                onChanged();
                return this;
            }

            public Builder clearGppSid() {
                this.gppSid_ = h0.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean getCoppa() {
                return this.coppa_;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f18851y;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean getGdpr() {
                return this.gdpr_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public String getGpp() {
                Object obj = this.gpp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.gpp_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public ByteString getGppBytes() {
                Object obj = this.gpp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gpp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getGppSid(int i10) {
                return this.gppSid_.getInt(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getGppSidCount() {
                return this.gppSid_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<Integer> getGppSidList() {
                return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.gppSid_) : this.gppSid_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.f18853z.d(Regs.class, Builder.class);
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

            public Builder setCoppa(boolean z10) {
                this.coppa_ = z10;
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

            public Builder setGdpr(boolean z10) {
                this.gdpr_ = z10;
                onChanged();
                return this;
            }

            public Builder setGpp(String str) {
                str.getClass();
                this.gpp_ = str;
                onChanged();
                return this;
            }

            public Builder setGppBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.gpp_ = byteString;
                onChanged();
                return this;
            }

            public Builder setGppSid(int i10, int i11) {
                ensureGppSidIsMutable();
                this.gppSid_.setInt(i10, i11);
                onChanged();
                return this;
            }

            private Builder() {
                this.gpp_ = "";
                this.gppSid_ = h0.emptyIntList();
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Regs build() {
                Regs regsBuildPartial = buildPartial();
                if (regsBuildPartial.isInitialized()) {
                    return regsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) regsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Regs buildPartial() {
                Regs regs = new Regs(this);
                regs.coppa_ = this.coppa_;
                regs.gdpr_ = this.gdpr_;
                regs.gpp_ = this.gpp_;
                if ((this.bitField0_ & 1) != 0) {
                    this.gppSid_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                regs.gppSid_ = this.gppSid_;
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    regs.ext_ = this.ext_;
                } else {
                    regs.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    regs.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    regs.extProto_ = this.extProto_;
                }
                onBuilt();
                return regs;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Regs getDefaultInstanceForType() {
                return Regs.getDefaultInstance();
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
                this.coppa_ = false;
                this.gdpr_ = false;
                this.gpp_ = "";
                this.gppSid_ = h0.emptyIntList();
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
                if (message instanceof Regs) {
                    return mergeFrom((Regs) message);
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
                this.gpp_ = "";
                this.gppSid_ = h0.emptyIntList();
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Regs regs) {
                if (regs == Regs.getDefaultInstance()) {
                    return this;
                }
                if (regs.getCoppa()) {
                    setCoppa(regs.getCoppa());
                }
                if (regs.getGdpr()) {
                    setGdpr(regs.getGdpr());
                }
                if (!regs.getGpp().isEmpty()) {
                    this.gpp_ = regs.gpp_;
                    onChanged();
                }
                if (!regs.gppSid_.isEmpty()) {
                    if (this.gppSid_.isEmpty()) {
                        this.gppSid_ = regs.gppSid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureGppSidIsMutable();
                        this.gppSid_.addAll(regs.gppSid_);
                    }
                    onChanged();
                }
                if (regs.hasExt()) {
                    mergeExt(regs.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!regs.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = regs.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(regs.extProto_);
                        }
                        onChanged();
                    }
                } else if (!regs.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(regs.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = regs.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) regs).unknownFields);
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
            public com.explorestack.protobuf.adcom.Context.Regs.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.Regs.access$28100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Regs r3 = (com.explorestack.protobuf.adcom.Context.Regs) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Regs r4 = (com.explorestack.protobuf.adcom.Context.Regs) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Regs.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Regs$Builder");
            }
        }

        public static Builder newBuilder(Regs regs) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(regs);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Regs(h0.b bVar) {
            super(bVar);
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Regs parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Regs) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Regs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Regs getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Regs parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Regs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        private Regs() {
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.gpp_ = "";
            this.gppSid_ = h0.emptyIntList();
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Regs parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(bArr, wVar);
        }

        public static Regs parseFrom(InputStream inputStream) throws IOException {
            return (Regs) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Regs parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Regs) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Regs parseFrom(l lVar) throws IOException {
            return (Regs) h0.parseWithIOException(PARSER, lVar);
        }

        private Regs(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.coppa_ = lVar.q();
                            } else if (iK == 16) {
                                this.gdpr_ = lVar.q();
                            } else if (iK == 26) {
                                if ((i10 & 2) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                            } else if (iK == 34) {
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
                                }
                            } else if (iK == 42) {
                                this.gpp_ = lVar.J();
                            } else if (iK == 48) {
                                if ((i10 & 1) == 0) {
                                    this.gppSid_ = h0.newIntList();
                                    i10 |= 1;
                                }
                                this.gppSid_.addInt(lVar.L());
                            } else if (iK != 50) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                int iP = lVar.p(lVar.C());
                                if ((i10 & 1) == 0 && lVar.d() > 0) {
                                    this.gppSid_ = h0.newIntList();
                                    i10 |= 1;
                                }
                                while (lVar.d() > 0) {
                                    this.gppSid_.addInt(lVar.L());
                                }
                                lVar.o(iP);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    if ((i10 & 1) != 0) {
                        this.gppSid_.makeImmutable();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 2) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            if ((i10 & 1) != 0) {
                this.gppSid_.makeImmutable();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Regs parseFrom(l lVar, w wVar) throws IOException {
            return (Regs) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface RegsOrBuilder extends MessageOrBuilder {
        boolean getCoppa();

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

        boolean getGdpr();

        String getGpp();

        ByteString getGppBytes();

        int getGppSid(int i10);

        int getGppSidCount();

        List<Integer> getGppSidList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Restrictions extends h0 implements RestrictionsOrBuilder {
        public static final int BADV_FIELD_NUMBER = 3;
        public static final int BAPP_FIELD_NUMBER = 4;
        public static final int BATTR_FIELD_NUMBER = 5;
        public static final int BCAT_FIELD_NUMBER = 1;
        public static final int CATTAX_FIELD_NUMBER = 2;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private p0 badv_;
        private p0 bapp_;
        private int battrMemoizedSerializedSize;
        private List<Integer> battr_;
        private p0 bcat_;
        private int cattax_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private static final j0.h.a battr_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Context.Restrictions.1
            @Override // com.explorestack.protobuf.j0.h.a
            public CreativeAttribute convert(Integer num) {
                CreativeAttribute creativeAttributeValueOf = CreativeAttribute.valueOf(num.intValue());
                return creativeAttributeValueOf == null ? CreativeAttribute.UNRECOGNIZED : creativeAttributeValueOf;
            }
        };
        private static final Restrictions DEFAULT_INSTANCE = new Restrictions();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.Restrictions.2
            @Override // com.explorestack.protobuf.p1
            public Restrictions parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Restrictions(lVar, wVar);
            }
        };

        public static final class Builder extends h0.b implements RestrictionsOrBuilder {
            private p0 badv_;
            private p0 bapp_;
            private List<Integer> battr_;
            private p0 bcat_;
            private int bitField0_;
            private int cattax_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;

            private void ensureBadvIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.badv_ = new o0(this.badv_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureBappIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.bapp_ = new o0(this.bapp_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureBattrIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.battr_ = new ArrayList(this.battr_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureBcatIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.bcat_ = new o0(this.bcat_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.A;
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

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllBadv(Iterable<String> iterable) {
                ensureBadvIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.badv_);
                onChanged();
                return this;
            }

            public Builder addAllBapp(Iterable<String> iterable) {
                ensureBappIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.bapp_);
                onChanged();
                return this;
            }

            public Builder addAllBattr(Iterable<? extends CreativeAttribute> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends CreativeAttribute> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllBattrValue(Iterable<Integer> iterable) {
                ensureBattrIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.battr_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllBcat(Iterable<String> iterable) {
                ensureBcatIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.bcat_);
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

            public Builder addBadv(String str) {
                str.getClass();
                ensureBadvIsMutable();
                this.badv_.add(str);
                onChanged();
                return this;
            }

            public Builder addBadvBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureBadvIsMutable();
                this.badv_.c(byteString);
                onChanged();
                return this;
            }

            public Builder addBapp(String str) {
                str.getClass();
                ensureBappIsMutable();
                this.bapp_.add(str);
                onChanged();
                return this;
            }

            public Builder addBappBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureBappIsMutable();
                this.bapp_.c(byteString);
                onChanged();
                return this;
            }

            public Builder addBattr(CreativeAttribute creativeAttribute) {
                creativeAttribute.getClass();
                ensureBattrIsMutable();
                this.battr_.add(Integer.valueOf(creativeAttribute.getNumber()));
                onChanged();
                return this;
            }

            public Builder addBattrValue(int i10) {
                ensureBattrIsMutable();
                this.battr_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addBcat(String str) {
                str.getClass();
                ensureBcatIsMutable();
                this.bcat_.add(str);
                onChanged();
                return this;
            }

            public Builder addBcatBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureBcatIsMutable();
                this.bcat_.c(byteString);
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

            public Builder clearBadv() {
                this.badv_ = o0.f19269e;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearBapp() {
                this.bapp_ = o0.f19269e;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearBattr() {
                this.battr_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearBcat() {
                this.bcat_ = o0.f19269e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCattax() {
                this.cattax_ = 0;
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBadv(int i10) {
                return (String) this.badv_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBadvBytes(int i10) {
                return this.badv_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBadvCount() {
                return this.badv_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBapp(int i10) {
                return (String) this.bapp_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBappBytes(int i10) {
                return this.bapp_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBappCount() {
                return this.bapp_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public CreativeAttribute getBattr(int i10) {
                return (CreativeAttribute) Restrictions.battr_converter_.convert(this.battr_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBattrCount() {
                return this.battr_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<CreativeAttribute> getBattrList() {
                return new j0.h(this.battr_, Restrictions.battr_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBattrValue(int i10) {
                return this.battr_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<Integer> getBattrValueList() {
                return DesugarCollections.unmodifiableList(this.battr_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBcat(int i10) {
                return (String) this.bcat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBcatBytes(int i10) {
                return this.bcat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBcatCount() {
                return this.bcat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.A;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.B.d(Restrictions.class, Builder.class);
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

            public Builder setBadv(int i10, String str) {
                str.getClass();
                ensureBadvIsMutable();
                this.badv_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setBapp(int i10, String str) {
                str.getClass();
                ensureBappIsMutable();
                this.bapp_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setBattr(int i10, CreativeAttribute creativeAttribute) {
                creativeAttribute.getClass();
                ensureBattrIsMutable();
                this.battr_.set(i10, Integer.valueOf(creativeAttribute.getNumber()));
                onChanged();
                return this;
            }

            public Builder setBattrValue(int i10, int i11) {
                ensureBattrIsMutable();
                this.battr_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setBcat(int i10, String str) {
                str.getClass();
                ensureBcatIsMutable();
                this.bcat_.set(i10, str);
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public t1 getBadvList() {
                return this.badv_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public t1 getBappList() {
                return this.bapp_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public t1 getBcatList() {
                return this.bcat_.getUnmodifiableView();
            }

            private Builder() {
                p0 p0Var = o0.f19269e;
                this.bcat_ = p0Var;
                this.cattax_ = 0;
                this.badv_ = p0Var;
                this.bapp_ = p0Var;
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Restrictions build() {
                Restrictions restrictionsBuildPartial = buildPartial();
                if (restrictionsBuildPartial.isInitialized()) {
                    return restrictionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) restrictionsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Restrictions buildPartial() {
                Restrictions restrictions = new Restrictions(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                restrictions.bcat_ = this.bcat_;
                restrictions.cattax_ = this.cattax_;
                if ((this.bitField0_ & 2) != 0) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                restrictions.badv_ = this.badv_;
                if ((this.bitField0_ & 4) != 0) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                restrictions.bapp_ = this.bapp_;
                if ((this.bitField0_ & 8) != 0) {
                    this.battr_ = DesugarCollections.unmodifiableList(this.battr_);
                    this.bitField0_ &= -9;
                }
                restrictions.battr_ = this.battr_;
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    restrictions.ext_ = this.ext_;
                } else {
                    restrictions.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var != null) {
                    restrictions.extProto_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    restrictions.extProto_ = this.extProto_;
                }
                onBuilt();
                return restrictions;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Restrictions getDefaultInstanceForType() {
                return Restrictions.getDefaultInstance();
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
                p0 p0Var = o0.f19269e;
                this.bcat_ = p0Var;
                int i10 = this.bitField0_;
                this.cattax_ = 0;
                this.badv_ = p0Var;
                this.bapp_ = p0Var;
                this.bitField0_ = i10 & (-8);
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
                this.bitField0_ = i10 & (-16);
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                v1 v1Var = this.extProtoBuilder_;
                if (v1Var == null) {
                    this.extProto_ = list;
                    this.bitField0_ = i10 & (-32);
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
                if (message instanceof Restrictions) {
                    return mergeFrom((Restrictions) message);
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

            public Builder mergeFrom(Restrictions restrictions) {
                if (restrictions == Restrictions.getDefaultInstance()) {
                    return this;
                }
                if (!restrictions.bcat_.isEmpty()) {
                    if (this.bcat_.isEmpty()) {
                        this.bcat_ = restrictions.bcat_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureBcatIsMutable();
                        this.bcat_.addAll(restrictions.bcat_);
                    }
                    onChanged();
                }
                if (restrictions.cattax_ != 0) {
                    setCattaxValue(restrictions.getCattaxValue());
                }
                if (!restrictions.badv_.isEmpty()) {
                    if (this.badv_.isEmpty()) {
                        this.badv_ = restrictions.badv_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureBadvIsMutable();
                        this.badv_.addAll(restrictions.badv_);
                    }
                    onChanged();
                }
                if (!restrictions.bapp_.isEmpty()) {
                    if (this.bapp_.isEmpty()) {
                        this.bapp_ = restrictions.bapp_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureBappIsMutable();
                        this.bapp_.addAll(restrictions.bapp_);
                    }
                    onChanged();
                }
                if (!restrictions.battr_.isEmpty()) {
                    if (this.battr_.isEmpty()) {
                        this.battr_ = restrictions.battr_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureBattrIsMutable();
                        this.battr_.addAll(restrictions.battr_);
                    }
                    onChanged();
                }
                if (restrictions.hasExt()) {
                    mergeExt(restrictions.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!restrictions.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = restrictions.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(restrictions.extProto_);
                        }
                        onChanged();
                    }
                } else if (!restrictions.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(restrictions.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = restrictions.extProto_;
                        this.bitField0_ &= -17;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) restrictions).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                p0 p0Var = o0.f19269e;
                this.bcat_ = p0Var;
                this.cattax_ = 0;
                this.badv_ = p0Var;
                this.bapp_ = p0Var;
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
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
            public com.explorestack.protobuf.adcom.Context.Restrictions.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.Restrictions.access$30000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Restrictions r3 = (com.explorestack.protobuf.adcom.Context.Restrictions) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Restrictions r4 = (com.explorestack.protobuf.adcom.Context.Restrictions) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Restrictions.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Restrictions$Builder");
            }
        }

        public static Restrictions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.A;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Restrictions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Restrictions) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Restrictions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Restrictions)) {
                return super.equals(obj);
            }
            Restrictions restrictions = (Restrictions) obj;
            if (getBcatList().equals(restrictions.getBcatList()) && this.cattax_ == restrictions.cattax_ && getBadvList().equals(restrictions.getBadvList()) && getBappList().equals(restrictions.getBappList()) && this.battr_.equals(restrictions.battr_) && hasExt() == restrictions.hasExt()) {
                return (!hasExt() || getExt().equals(restrictions.getExt())) && getExtProtoList().equals(restrictions.getExtProtoList()) && this.unknownFields.equals(restrictions.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBadv(int i10) {
            return (String) this.badv_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBadvBytes(int i10) {
            return this.badv_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBadvCount() {
            return this.badv_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBapp(int i10) {
            return (String) this.bapp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBappBytes(int i10) {
            return this.bapp_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBappCount() {
            return this.bapp_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public CreativeAttribute getBattr(int i10) {
            return (CreativeAttribute) battr_converter_.convert(this.battr_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBattrCount() {
            return this.battr_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<CreativeAttribute> getBattrList() {
            return new j0.h(this.battr_, battr_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBattrValue(int i10) {
            return this.battr_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<Integer> getBattrValueList() {
            return this.battr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBcat(int i10) {
            return (String) this.bcat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBcatBytes(int i10) {
            return this.bcat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBcatCount() {
            return this.bcat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.bcat_.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.bcat_.getRaw(i11));
            }
            int size = iComputeStringSizeNoTag + getBcatList().size();
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                size += n.l(2, this.cattax_);
            }
            int iComputeStringSizeNoTag2 = 0;
            for (int i12 = 0; i12 < this.badv_.size(); i12++) {
                iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.badv_.getRaw(i12));
            }
            int size2 = size + iComputeStringSizeNoTag2 + getBadvList().size();
            int iComputeStringSizeNoTag3 = 0;
            for (int i13 = 0; i13 < this.bapp_.size(); i13++) {
                iComputeStringSizeNoTag3 += h0.computeStringSizeNoTag(this.bapp_.getRaw(i13));
            }
            int size3 = size2 + iComputeStringSizeNoTag3 + getBappList().size();
            int iM = 0;
            for (int i14 = 0; i14 < this.battr_.size(); i14++) {
                iM += n.m(this.battr_.get(i14).intValue());
            }
            int iG = size3 + iM;
            if (!getBattrList().isEmpty()) {
                iG = iG + 1 + n.Z(iM);
            }
            this.battrMemoizedSerializedSize = iM;
            for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                iG += n.G(6, this.extProto_.get(i15));
            }
            if (this.ext_ != null) {
                iG += n.G(7, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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
            if (getBcatCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBcatList().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 2) * 53) + this.cattax_;
            if (getBadvCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 3) * 53) + getBadvList().hashCode();
            }
            if (getBappCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 4) * 53) + getBappList().hashCode();
            }
            if (getBattrCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + this.battr_.hashCode();
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
            return b.B.d(Restrictions.class, Builder.class);
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
            return new Restrictions();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.bcat_.size(); i10++) {
                h0.writeString(nVar, 1, this.bcat_.getRaw(i10));
            }
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                nVar.v0(2, this.cattax_);
            }
            for (int i11 = 0; i11 < this.badv_.size(); i11++) {
                h0.writeString(nVar, 3, this.badv_.getRaw(i11));
            }
            for (int i12 = 0; i12 < this.bapp_.size(); i12++) {
                h0.writeString(nVar, 4, this.bapp_.getRaw(i12));
            }
            if (getBattrList().size() > 0) {
                nVar.X0(42);
                nVar.X0(this.battrMemoizedSerializedSize);
            }
            for (int i13 = 0; i13 < this.battr_.size(); i13++) {
                nVar.w0(this.battr_.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                nVar.J0(6, this.extProto_.get(i14));
            }
            if (this.ext_ != null) {
                nVar.J0(7, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(Restrictions restrictions) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(restrictions);
        }

        public static Restrictions parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteBuffer, wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public t1 getBadvList() {
            return this.badv_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public t1 getBappList() {
            return this.bapp_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public t1 getBcatList() {
            return this.bcat_;
        }

        private Restrictions(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Restrictions parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Restrictions) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Restrictions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Restrictions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Restrictions parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Restrictions() {
            this.memoizedIsInitialized = (byte) -1;
            p0 p0Var = o0.f19269e;
            this.bcat_ = p0Var;
            this.cattax_ = 0;
            this.badv_ = p0Var;
            this.bapp_ = p0Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.extProto_ = list;
        }

        public static Restrictions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Restrictions parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(bArr, wVar);
        }

        public static Restrictions parseFrom(InputStream inputStream) throws IOException {
            return (Restrictions) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Restrictions parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Restrictions) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Restrictions parseFrom(l lVar) throws IOException {
            return (Restrictions) h0.parseWithIOException(PARSER, lVar);
        }

        private Restrictions(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.bcat_ = new o0();
                                    i10 |= 1;
                                }
                                this.bcat_.add(strJ);
                            } else if (iK == 16) {
                                this.cattax_ = lVar.t();
                            } else if (iK == 26) {
                                String strJ2 = lVar.J();
                                if ((i10 & 2) == 0) {
                                    this.badv_ = new o0();
                                    i10 |= 2;
                                }
                                this.badv_.add(strJ2);
                            } else if (iK == 34) {
                                String strJ3 = lVar.J();
                                if ((i10 & 4) == 0) {
                                    this.bapp_ = new o0();
                                    i10 |= 4;
                                }
                                this.bapp_.add(strJ3);
                            } else if (iK == 40) {
                                int iT = lVar.t();
                                if ((i10 & 8) == 0) {
                                    this.battr_ = new ArrayList();
                                    i10 |= 8;
                                }
                                this.battr_.add(Integer.valueOf(iT));
                            } else if (iK == 42) {
                                int iP = lVar.p(lVar.C());
                                while (lVar.d() > 0) {
                                    int iT2 = lVar.t();
                                    if ((i10 & 8) == 0) {
                                        this.battr_ = new ArrayList();
                                        i10 |= 8;
                                    }
                                    this.battr_.add(Integer.valueOf(iT2));
                                }
                                lVar.o(iP);
                            } else if (iK == 50) {
                                if ((i10 & 16) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 16;
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
                        this.bcat_ = this.bcat_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.badv_ = this.badv_.getUnmodifiableView();
                    }
                    if ((i10 & 4) != 0) {
                        this.bapp_ = this.bapp_.getUnmodifiableView();
                    }
                    if ((i10 & 8) != 0) {
                        this.battr_ = DesugarCollections.unmodifiableList(this.battr_);
                    }
                    if ((i10 & 16) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.bcat_ = this.bcat_.getUnmodifiableView();
            }
            if ((i10 & 2) != 0) {
                this.badv_ = this.badv_.getUnmodifiableView();
            }
            if ((i10 & 4) != 0) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
            }
            if ((i10 & 8) != 0) {
                this.battr_ = DesugarCollections.unmodifiableList(this.battr_);
            }
            if ((i10 & 16) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Restrictions parseFrom(l lVar, w wVar) throws IOException {
            return (Restrictions) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface RestrictionsOrBuilder extends MessageOrBuilder {
        String getBadv(int i10);

        ByteString getBadvBytes(int i10);

        int getBadvCount();

        List<String> getBadvList();

        String getBapp(int i10);

        ByteString getBappBytes(int i10);

        int getBappCount();

        List<String> getBappList();

        CreativeAttribute getBattr(int i10);

        int getBattrCount();

        List<CreativeAttribute> getBattrList();

        int getBattrValue(int i10);

        List<Integer> getBattrValueList();

        String getBcat(int i10);

        ByteString getBcatBytes(int i10);

        int getBcatCount();

        List<String> getBcatList();

        CategoryTaxonomy getCattax();

        int getCattaxValue();

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

    public static final class User extends h0 implements UserOrBuilder {
        public static final int BUYERUID_FIELD_NUMBER = 2;
        public static final int CONSENT_FIELD_NUMBER = 6;
        public static final int DATA_FIELD_NUMBER = 8;
        public static final int EXT_FIELD_NUMBER = 10;
        public static final int EXT_PROTO_FIELD_NUMBER = 9;
        public static final int GENDER_FIELD_NUMBER = 4;
        public static final int GEO_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int KEYWORDS_FIELD_NUMBER = 5;
        public static final int YOB_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object buyeruid_;
        private volatile Object consent_;
        private List<Data> data_;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object gender_;
        private Geo geo_;
        private volatile Object id_;
        private volatile Object keywords_;
        private byte memoizedIsInitialized;
        private int yob_;
        private static final User DEFAULT_INSTANCE = new User();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Context.User.1
            @Override // com.explorestack.protobuf.p1
            public User parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new User(lVar, wVar);
            }
        };

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.C;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (User) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof User)) {
                return super.equals(obj);
            }
            User user = (User) obj;
            if (!getId().equals(user.getId()) || !getBuyeruid().equals(user.getBuyeruid()) || getYob() != user.getYob() || !getGender().equals(user.getGender()) || !getKeywords().equals(user.getKeywords()) || !getConsent().equals(user.getConsent()) || hasGeo() != user.hasGeo()) {
                return false;
            }
            if ((!hasGeo() || getGeo().equals(user.getGeo())) && getDataList().equals(user.getDataList()) && hasExt() == user.hasExt()) {
                return (!hasExt() || getExt().equals(user.getExt())) && getExtProtoList().equals(user.getExtProtoList()) && this.unknownFields.equals(user.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getBuyeruid() {
            Object obj = this.buyeruid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.buyeruid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getBuyeruidBytes() {
            Object obj = this.buyeruid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.buyeruid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getConsent() {
            Object obj = this.consent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.consent_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getConsentBytes() {
            Object obj = this.consent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consent_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Data getData(int i10) {
            return this.data_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<Data> getDataList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public DataOrBuilder getDataOrBuilder(int i10) {
            return this.data_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<? extends DataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getGender() {
            Object obj = this.gender_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gender_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getGenderBytes() {
            Object obj = this.gender_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gender_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public GeoOrBuilder getGeoOrBuilder() {
            return getGeo();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getKeywords() {
            Object obj = this.keywords_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keywords_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getKeywordsBytes() {
            Object obj = this.keywords_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keywords_ = byteStringCopyFromUtf8;
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
            if (!getBuyeruidBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.buyeruid_);
            }
            int i11 = this.yob_;
            if (i11 != 0) {
                iComputeStringSize += n.Y(3, i11);
            }
            if (!getGenderBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(4, this.gender_);
            }
            if (!getKeywordsBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(5, this.keywords_);
            }
            if (!getConsentBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(6, this.consent_);
            }
            if (this.geo_ != null) {
                iComputeStringSize += n.G(7, getGeo());
            }
            for (int i12 = 0; i12 < this.data_.size(); i12++) {
                iComputeStringSize += n.G(8, this.data_.get(i12));
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                iComputeStringSize += n.G(9, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                iComputeStringSize += n.G(10, getExt());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getYob() {
            return this.yob_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public boolean hasGeo() {
            return this.geo_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getBuyeruid().hashCode()) * 37) + 3) * 53) + getYob()) * 37) + 4) * 53) + getGender().hashCode()) * 37) + 5) * 53) + getKeywords().hashCode()) * 37) + 6) * 53) + getConsent().hashCode();
            if (hasGeo()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getGeo().hashCode();
            }
            if (getDataCount() > 0) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getDataList().hashCode();
            }
            if (hasExt()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.D.d(User.class, Builder.class);
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
            return new User();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.id_);
            }
            if (!getBuyeruidBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.buyeruid_);
            }
            int i10 = this.yob_;
            if (i10 != 0) {
                nVar.W0(3, i10);
            }
            if (!getGenderBytes().isEmpty()) {
                h0.writeString(nVar, 4, this.gender_);
            }
            if (!getKeywordsBytes().isEmpty()) {
                h0.writeString(nVar, 5, this.keywords_);
            }
            if (!getConsentBytes().isEmpty()) {
                h0.writeString(nVar, 6, this.consent_);
            }
            if (this.geo_ != null) {
                nVar.J0(7, getGeo());
            }
            for (int i11 = 0; i11 < this.data_.size(); i11++) {
                nVar.J0(8, this.data_.get(i11));
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                nVar.J0(9, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                nVar.J0(10, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements UserOrBuilder {
            private int bitField0_;
            private Object buyeruid_;
            private Object consent_;
            private v1 dataBuilder_;
            private List<Data> data_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object gender_;
            private a2 geoBuilder_;
            private Geo geo_;
            private Object id_;
            private Object keywords_;
            private int yob_;

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private v1 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new v1(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.C;
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

            private a2 getGeoFieldBuilder() {
                if (this.geoBuilder_ == null) {
                    this.geoBuilder_ = new a2(getGeo(), getParentForChildren(), isClean());
                    this.geo_ = null;
                }
                return this.geoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends Data> iterable) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureDataIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.data_);
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

            public Builder addData(Data data) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.e(data);
                    return this;
                }
                data.getClass();
                ensureDataIsMutable();
                this.data_.add(data);
                onChanged();
                return this;
            }

            public Data.Builder addDataBuilder() {
                return (Data.Builder) getDataFieldBuilder().c(Data.getDefaultInstance());
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

            public Builder clearBuyeruid() {
                this.buyeruid_ = User.getDefaultInstance().getBuyeruid();
                onChanged();
                return this;
            }

            public Builder clearConsent() {
                this.consent_ = User.getDefaultInstance().getConsent();
                onChanged();
                return this;
            }

            public Builder clearData() {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.data_ = Collections.EMPTY_LIST;
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

            public Builder clearGender() {
                this.gender_ = User.getDefaultInstance().getGender();
                onChanged();
                return this;
            }

            public Builder clearGeo() {
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                    onChanged();
                    return this;
                }
                this.geo_ = null;
                this.geoBuilder_ = null;
                return this;
            }

            public Builder clearId() {
                this.id_ = User.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearKeywords() {
                this.keywords_ = User.getDefaultInstance().getKeywords();
                onChanged();
                return this;
            }

            public Builder clearYob() {
                this.yob_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getBuyeruid() {
                Object obj = this.buyeruid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.buyeruid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getBuyeruidBytes() {
                Object obj = this.buyeruid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.buyeruid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getConsent() {
                Object obj = this.consent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.consent_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getConsentBytes() {
                Object obj = this.consent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consent_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public Data getData(int i10) {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.get(i10) : (Data) v1Var.n(i10);
            }

            public Data.Builder getDataBuilder(int i10) {
                return (Data.Builder) getDataFieldBuilder().k(i10);
            }

            public List<Data.Builder> getDataBuilderList() {
                return getDataFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getDataCount() {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<Data> getDataList() {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.data_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public DataOrBuilder getDataOrBuilder(int i10) {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.get(i10) : (DataOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<? extends DataOrBuilder> getDataOrBuilderList() {
                v1 v1Var = this.dataBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.C;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getGender() {
                Object obj = this.gender_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.gender_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getGenderBytes() {
                Object obj = this.gender_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gender_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public Geo getGeo() {
                a2 a2Var = this.geoBuilder_;
                if (a2Var != null) {
                    return (Geo) a2Var.e();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            public Geo.Builder getGeoBuilder() {
                onChanged();
                return (Geo.Builder) getGeoFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public GeoOrBuilder getGeoOrBuilder() {
                a2 a2Var = this.geoBuilder_;
                if (a2Var != null) {
                    return (GeoOrBuilder) a2Var.f();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getYob() {
                return this.yob_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public boolean hasGeo() {
                return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.D.d(User.class, Builder.class);
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

            public Builder mergeGeo(Geo geo) {
                a2 a2Var = this.geoBuilder_;
                if (a2Var != null) {
                    a2Var.g(geo);
                    return this;
                }
                Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
                }
                onChanged();
                return this;
            }

            public Builder removeData(int i10) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureDataIsMutable();
                this.data_.remove(i10);
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

            public Builder setBuyeruid(String str) {
                str.getClass();
                this.buyeruid_ = str;
                onChanged();
                return this;
            }

            public Builder setBuyeruidBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.buyeruid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setConsent(String str) {
                str.getClass();
                this.consent_ = str;
                onChanged();
                return this;
            }

            public Builder setConsentBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.consent_ = byteString;
                onChanged();
                return this;
            }

            public Builder setData(int i10, Data data) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, data);
                    return this;
                }
                data.getClass();
                ensureDataIsMutable();
                this.data_.set(i10, data);
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

            public Builder setGender(String str) {
                str.getClass();
                this.gender_ = str;
                onChanged();
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.gender_ = byteString;
                onChanged();
                return this;
            }

            public Builder setGeo(Geo geo) {
                a2 a2Var = this.geoBuilder_;
                if (a2Var != null) {
                    a2Var.i(geo);
                    return this;
                }
                geo.getClass();
                this.geo_ = geo;
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

            public Builder setKeywords(String str) {
                str.getClass();
                this.keywords_ = str;
                onChanged();
                return this;
            }

            public Builder setKeywordsBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.keywords_ = byteString;
                onChanged();
                return this;
            }

            public Builder setYob(int i10) {
                this.yob_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.buyeruid_ = "";
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public User build() {
                User userBuildPartial = buildPartial();
                if (userBuildPartial.isInitialized()) {
                    return userBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public User buildPartial() {
                User user = new User(this);
                user.id_ = this.id_;
                user.buyeruid_ = this.buyeruid_;
                user.yob_ = this.yob_;
                user.gender_ = this.gender_;
                user.keywords_ = this.keywords_;
                user.consent_ = this.consent_;
                a2 a2Var = this.geoBuilder_;
                if (a2Var == null) {
                    user.geo_ = this.geo_;
                } else {
                    user.geo_ = (Geo) a2Var.a();
                }
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    user.data_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = DesugarCollections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    user.data_ = this.data_;
                }
                a2 a2Var2 = this.extBuilder_;
                if (a2Var2 == null) {
                    user.ext_ = this.ext_;
                } else {
                    user.ext_ = (Struct) a2Var2.a();
                }
                v1 v1Var2 = this.extProtoBuilder_;
                if (v1Var2 != null) {
                    user.extProto_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    user.extProto_ = this.extProto_;
                }
                onBuilt();
                return user;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public User getDefaultInstanceForType() {
                return User.getDefaultInstance();
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

            public Data.Builder addDataBuilder(int i10) {
                return (Data.Builder) getDataFieldBuilder().b(i10, Data.getDefaultInstance());
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
                this.buyeruid_ = "";
                this.yob_ = 0;
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    this.data_ = Collections.EMPTY_LIST;
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

            public Builder setGeo(Geo.Builder builder) {
                a2 a2Var = this.geoBuilder_;
                if (a2Var == null) {
                    this.geo_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addData(int i10, Data data) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i10, data);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, data);
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
                if (message instanceof User) {
                    return mergeFrom((User) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(int i10, Data.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.set(i10, builder.build());
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

            public Builder mergeFrom(User user) {
                if (user == User.getDefaultInstance()) {
                    return this;
                }
                if (!user.getId().isEmpty()) {
                    this.id_ = user.id_;
                    onChanged();
                }
                if (!user.getBuyeruid().isEmpty()) {
                    this.buyeruid_ = user.buyeruid_;
                    onChanged();
                }
                if (user.getYob() != 0) {
                    setYob(user.getYob());
                }
                if (!user.getGender().isEmpty()) {
                    this.gender_ = user.gender_;
                    onChanged();
                }
                if (!user.getKeywords().isEmpty()) {
                    this.keywords_ = user.keywords_;
                    onChanged();
                }
                if (!user.getConsent().isEmpty()) {
                    this.consent_ = user.consent_;
                    onChanged();
                }
                if (user.hasGeo()) {
                    mergeGeo(user.getGeo());
                }
                if (this.dataBuilder_ == null) {
                    if (!user.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = user.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(user.data_);
                        }
                        onChanged();
                    }
                } else if (!user.data_.isEmpty()) {
                    if (!this.dataBuilder_.t()) {
                        this.dataBuilder_.a(user.data_);
                    } else {
                        this.dataBuilder_.h();
                        this.dataBuilder_ = null;
                        this.data_ = user.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = h0.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                if (user.hasExt()) {
                    mergeExt(user.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!user.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = user.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(user.extProto_);
                        }
                        onChanged();
                    }
                } else if (!user.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(user.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = user.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) user).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.buyeruid_ = "";
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addData(Data.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
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

            public Builder addData(int i10, Data.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(i10, builder.build());
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
            public com.explorestack.protobuf.adcom.Context.User.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.User.access$32300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$User r3 = (com.explorestack.protobuf.adcom.Context.User) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$User r4 = (com.explorestack.protobuf.adcom.Context.User) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.User.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$User$Builder");
            }
        }

        public static Builder newBuilder(User user) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(user);
        }

        public static User parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteBuffer, wVar);
        }

        private User(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static User parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (User) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public User getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static User parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private User() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.buyeruid_ = "";
            this.gender_ = "";
            this.keywords_ = "";
            this.consent_ = "";
            List list = Collections.EMPTY_LIST;
            this.data_ = list;
            this.extProto_ = list;
        }

        public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static User parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(bArr, wVar);
        }

        public static User parseFrom(InputStream inputStream) throws IOException {
            return (User) h0.parseWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (User) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static User parseFrom(l lVar) throws IOException {
            return (User) h0.parseWithIOException(PARSER, lVar);
        }

        public static User parseFrom(l lVar, w wVar) throws IOException {
            return (User) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private User(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.buyeruid_ = lVar.J();
                                break;
                            case 24:
                                this.yob_ = lVar.L();
                                break;
                            case 34:
                                this.gender_ = lVar.J();
                                break;
                            case 42:
                                this.keywords_ = lVar.J();
                                break;
                            case 50:
                                this.consent_ = lVar.J();
                                break;
                            case 58:
                                Geo geo = this.geo_;
                                Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                                Geo geo2 = (Geo) lVar.A(Geo.parser(), wVar);
                                this.geo_ = geo2;
                                if (builder != null) {
                                    builder.mergeFrom(geo2);
                                    this.geo_ = builder.buildPartial();
                                }
                                break;
                            case 66:
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.data_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.data_.add((Data) lVar.A(Data.parser(), wVar));
                                break;
                            case 74:
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                break;
                            case 82:
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
                        this.data_ = DesugarCollections.unmodifiableList(this.data_);
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
                this.data_ = DesugarCollections.unmodifiableList(this.data_);
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface UserOrBuilder extends MessageOrBuilder {
        String getBuyeruid();

        ByteString getBuyeruidBytes();

        String getConsent();

        ByteString getConsentBytes();

        Data getData(int i10);

        int getDataCount();

        List<Data> getDataList();

        DataOrBuilder getDataOrBuilder(int i10);

        List<? extends DataOrBuilder> getDataOrBuilderList();

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

        String getGender();

        ByteString getGenderBytes();

        Geo getGeo();

        GeoOrBuilder getGeoOrBuilder();

        String getId();

        ByteString getIdBytes();

        String getKeywords();

        ByteString getKeywordsBytes();

        int getYob();

        boolean hasExt();

        boolean hasGeo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f18803a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Context)) {
            return super.equals(obj);
        }
        Context context = (Context) obj;
        if (hasApp() != context.hasApp()) {
            return false;
        }
        if ((hasApp() && !getApp().equals(context.getApp())) || hasDevice() != context.hasDevice()) {
            return false;
        }
        if ((hasDevice() && !getDevice().equals(context.getDevice())) || hasRegs() != context.hasRegs()) {
            return false;
        }
        if ((hasRegs() && !getRegs().equals(context.getRegs())) || hasRestrictions() != context.hasRestrictions()) {
            return false;
        }
        if ((hasRestrictions() && !getRestrictions().equals(context.getRestrictions())) || hasUser() != context.hasUser()) {
            return false;
        }
        if ((!hasUser() || getUser().equals(context.getUser())) && hasExt() == context.hasExt()) {
            return (!hasExt() || getExt().equals(context.getExt())) && getExtProtoList().equals(context.getExtProtoList()) && this.unknownFields.equals(context.unknownFields);
        }
        return false;
    }

    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    public AppOrBuilder getAppOrBuilder() {
        return getApp();
    }

    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    public DeviceOrBuilder getDeviceOrBuilder() {
        return getDevice();
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

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    public Regs getRegs() {
        Regs regs = this.regs_;
        return regs == null ? Regs.getDefaultInstance() : regs;
    }

    public RegsOrBuilder getRegsOrBuilder() {
        return getRegs();
    }

    public Restrictions getRestrictions() {
        Restrictions restrictions = this.restrictions_;
        return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
    }

    public RestrictionsOrBuilder getRestrictionsOrBuilder() {
        return getRestrictions();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.app_ != null ? n.G(1, getApp()) : 0;
        if (this.device_ != null) {
            iG += n.G(2, getDevice());
        }
        if (this.regs_ != null) {
            iG += n.G(3, getRegs());
        }
        if (this.restrictions_ != null) {
            iG += n.G(4, getRestrictions());
        }
        if (this.user_ != null) {
            iG += n.G(5, getUser());
        }
        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
            iG += n.G(6, this.extProto_.get(i11));
        }
        if (this.ext_ != null) {
            iG += n.G(7, getExt());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    public UserOrBuilder getUserOrBuilder() {
        return getUser();
    }

    public boolean hasApp() {
        return this.app_ != null;
    }

    public boolean hasDevice() {
        return this.device_ != null;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public boolean hasRegs() {
        return this.regs_ != null;
    }

    public boolean hasRestrictions() {
        return this.restrictions_ != null;
    }

    public boolean hasUser() {
        return this.user_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasApp()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getApp().hashCode();
        }
        if (hasDevice()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getDevice().hashCode();
        }
        if (hasRegs()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getRegs().hashCode();
        }
        if (hasRestrictions()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getRestrictions().hashCode();
        }
        if (hasUser()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getUser().hashCode();
        }
        if (hasExt()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getExtProtoList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return b.f18805b.d(Context.class, Builder.class);
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
        return new Context();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.app_ != null) {
            nVar.J0(1, getApp());
        }
        if (this.device_ != null) {
            nVar.J0(2, getDevice());
        }
        if (this.regs_ != null) {
            nVar.J0(3, getRegs());
        }
        if (this.restrictions_ != null) {
            nVar.J0(4, getRestrictions());
        }
        if (this.user_ != null) {
            nVar.J0(5, getUser());
        }
        for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
            nVar.J0(6, this.extProto_.get(i10));
        }
        if (this.ext_ != null) {
            nVar.J0(7, getExt());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements c {
        private a2 appBuilder_;
        private App app_;
        private int bitField0_;
        private a2 deviceBuilder_;
        private Device device_;
        private a2 extBuilder_;
        private v1 extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private a2 regsBuilder_;
        private Regs regs_;
        private a2 restrictionsBuilder_;
        private Restrictions restrictions_;
        private a2 userBuilder_;
        private User user_;

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 1;
            }
        }

        private a2 getAppFieldBuilder() {
            if (this.appBuilder_ == null) {
                this.appBuilder_ = new a2(getApp(), getParentForChildren(), isClean());
                this.app_ = null;
            }
            return this.appBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f18803a;
        }

        private a2 getDeviceFieldBuilder() {
            if (this.deviceBuilder_ == null) {
                this.deviceBuilder_ = new a2(getDevice(), getParentForChildren(), isClean());
                this.device_ = null;
            }
            return this.deviceBuilder_;
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

        private a2 getRegsFieldBuilder() {
            if (this.regsBuilder_ == null) {
                this.regsBuilder_ = new a2(getRegs(), getParentForChildren(), isClean());
                this.regs_ = null;
            }
            return this.regsBuilder_;
        }

        private a2 getRestrictionsFieldBuilder() {
            if (this.restrictionsBuilder_ == null) {
                this.restrictionsBuilder_ = new a2(getRestrictions(), getParentForChildren(), isClean());
                this.restrictions_ = null;
            }
            return this.restrictionsBuilder_;
        }

        private a2 getUserFieldBuilder() {
            if (this.userBuilder_ == null) {
                this.userBuilder_ = new a2(getUser(), getParentForChildren(), isClean());
                this.user_ = null;
            }
            return this.userBuilder_;
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

        public Builder clearApp() {
            if (this.appBuilder_ == null) {
                this.app_ = null;
                onChanged();
                return this;
            }
            this.app_ = null;
            this.appBuilder_ = null;
            return this;
        }

        public Builder clearDevice() {
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
                onChanged();
                return this;
            }
            this.device_ = null;
            this.deviceBuilder_ = null;
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

        public Builder clearRegs() {
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
                onChanged();
                return this;
            }
            this.regs_ = null;
            this.regsBuilder_ = null;
            return this;
        }

        public Builder clearRestrictions() {
            if (this.restrictionsBuilder_ == null) {
                this.restrictions_ = null;
                onChanged();
                return this;
            }
            this.restrictions_ = null;
            this.restrictionsBuilder_ = null;
            return this;
        }

        public Builder clearUser() {
            if (this.userBuilder_ == null) {
                this.user_ = null;
                onChanged();
                return this;
            }
            this.user_ = null;
            this.userBuilder_ = null;
            return this;
        }

        public App getApp() {
            a2 a2Var = this.appBuilder_;
            if (a2Var != null) {
                return (App) a2Var.e();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        public App.Builder getAppBuilder() {
            onChanged();
            return (App.Builder) getAppFieldBuilder().d();
        }

        public AppOrBuilder getAppOrBuilder() {
            a2 a2Var = this.appBuilder_;
            if (a2Var != null) {
                return (AppOrBuilder) a2Var.f();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f18803a;
        }

        public Device getDevice() {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var != null) {
                return (Device) a2Var.e();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        public Device.Builder getDeviceBuilder() {
            onChanged();
            return (Device.Builder) getDeviceFieldBuilder().d();
        }

        public DeviceOrBuilder getDeviceOrBuilder() {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var != null) {
                return (DeviceOrBuilder) a2Var.f();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
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

        public Regs getRegs() {
            a2 a2Var = this.regsBuilder_;
            if (a2Var != null) {
                return (Regs) a2Var.e();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
        }

        public Regs.Builder getRegsBuilder() {
            onChanged();
            return (Regs.Builder) getRegsFieldBuilder().d();
        }

        public RegsOrBuilder getRegsOrBuilder() {
            a2 a2Var = this.regsBuilder_;
            if (a2Var != null) {
                return (RegsOrBuilder) a2Var.f();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
        }

        public Restrictions getRestrictions() {
            a2 a2Var = this.restrictionsBuilder_;
            if (a2Var != null) {
                return (Restrictions) a2Var.e();
            }
            Restrictions restrictions = this.restrictions_;
            return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
        }

        public Restrictions.Builder getRestrictionsBuilder() {
            onChanged();
            return (Restrictions.Builder) getRestrictionsFieldBuilder().d();
        }

        public RestrictionsOrBuilder getRestrictionsOrBuilder() {
            a2 a2Var = this.restrictionsBuilder_;
            if (a2Var != null) {
                return (RestrictionsOrBuilder) a2Var.f();
            }
            Restrictions restrictions = this.restrictions_;
            return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
        }

        public User getUser() {
            a2 a2Var = this.userBuilder_;
            if (a2Var != null) {
                return (User) a2Var.e();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public User.Builder getUserBuilder() {
            onChanged();
            return (User.Builder) getUserFieldBuilder().d();
        }

        public UserOrBuilder getUserOrBuilder() {
            a2 a2Var = this.userBuilder_;
            if (a2Var != null) {
                return (UserOrBuilder) a2Var.f();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public boolean hasApp() {
            return (this.appBuilder_ == null && this.app_ == null) ? false : true;
        }

        public boolean hasDevice() {
            return (this.deviceBuilder_ == null && this.device_ == null) ? false : true;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public boolean hasRegs() {
            return (this.regsBuilder_ == null && this.regs_ == null) ? false : true;
        }

        public boolean hasRestrictions() {
            return (this.restrictionsBuilder_ == null && this.restrictions_ == null) ? false : true;
        }

        public boolean hasUser() {
            return (this.userBuilder_ == null && this.user_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return b.f18805b.d(Context.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeApp(App app) {
            a2 a2Var = this.appBuilder_;
            if (a2Var != null) {
                a2Var.g(app);
                return this;
            }
            App app2 = this.app_;
            if (app2 != null) {
                this.app_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
            } else {
                this.app_ = app;
            }
            onChanged();
            return this;
        }

        public Builder mergeDevice(Device device) {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var != null) {
                a2Var.g(device);
                return this;
            }
            Device device2 = this.device_;
            if (device2 != null) {
                this.device_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
            } else {
                this.device_ = device;
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

        public Builder mergeRegs(Regs regs) {
            a2 a2Var = this.regsBuilder_;
            if (a2Var != null) {
                a2Var.g(regs);
                return this;
            }
            Regs regs2 = this.regs_;
            if (regs2 != null) {
                this.regs_ = Regs.newBuilder(regs2).mergeFrom(regs).buildPartial();
            } else {
                this.regs_ = regs;
            }
            onChanged();
            return this;
        }

        public Builder mergeRestrictions(Restrictions restrictions) {
            a2 a2Var = this.restrictionsBuilder_;
            if (a2Var != null) {
                a2Var.g(restrictions);
                return this;
            }
            Restrictions restrictions2 = this.restrictions_;
            if (restrictions2 != null) {
                this.restrictions_ = Restrictions.newBuilder(restrictions2).mergeFrom(restrictions).buildPartial();
            } else {
                this.restrictions_ = restrictions;
            }
            onChanged();
            return this;
        }

        public Builder mergeUser(User user) {
            a2 a2Var = this.userBuilder_;
            if (a2Var != null) {
                a2Var.g(user);
                return this;
            }
            User user2 = this.user_;
            if (user2 != null) {
                this.user_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
            } else {
                this.user_ = user;
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

        public Builder setApp(App app) {
            a2 a2Var = this.appBuilder_;
            if (a2Var != null) {
                a2Var.i(app);
                return this;
            }
            app.getClass();
            this.app_ = app;
            onChanged();
            return this;
        }

        public Builder setDevice(Device device) {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var != null) {
                a2Var.i(device);
                return this;
            }
            device.getClass();
            this.device_ = device;
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

        public Builder setRegs(Regs regs) {
            a2 a2Var = this.regsBuilder_;
            if (a2Var != null) {
                a2Var.i(regs);
                return this;
            }
            regs.getClass();
            this.regs_ = regs;
            onChanged();
            return this;
        }

        public Builder setRestrictions(Restrictions restrictions) {
            a2 a2Var = this.restrictionsBuilder_;
            if (a2Var != null) {
                a2Var.i(restrictions);
                return this;
            }
            restrictions.getClass();
            this.restrictions_ = restrictions;
            onChanged();
            return this;
        }

        public Builder setUser(User user) {
            a2 a2Var = this.userBuilder_;
            if (a2Var != null) {
                a2Var.i(user);
                return this;
            }
            user.getClass();
            this.user_ = user;
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
        public Context build() {
            Context contextBuildPartial = buildPartial();
            if (contextBuildPartial.isInitialized()) {
                return contextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Context buildPartial() {
            Context context = new Context(this);
            a2 a2Var = this.appBuilder_;
            if (a2Var == null) {
                context.app_ = this.app_;
            } else {
                context.app_ = (App) a2Var.a();
            }
            a2 a2Var2 = this.deviceBuilder_;
            if (a2Var2 == null) {
                context.device_ = this.device_;
            } else {
                context.device_ = (Device) a2Var2.a();
            }
            a2 a2Var3 = this.regsBuilder_;
            if (a2Var3 == null) {
                context.regs_ = this.regs_;
            } else {
                context.regs_ = (Regs) a2Var3.a();
            }
            a2 a2Var4 = this.restrictionsBuilder_;
            if (a2Var4 == null) {
                context.restrictions_ = this.restrictions_;
            } else {
                context.restrictions_ = (Restrictions) a2Var4.a();
            }
            a2 a2Var5 = this.userBuilder_;
            if (a2Var5 == null) {
                context.user_ = this.user_;
            } else {
                context.user_ = (User) a2Var5.a();
            }
            a2 a2Var6 = this.extBuilder_;
            if (a2Var6 == null) {
                context.ext_ = this.ext_;
            } else {
                context.ext_ = (Struct) a2Var6.a();
            }
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var != null) {
                context.extProto_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -2;
                }
                context.extProto_ = this.extProto_;
            }
            onBuilt();
            return context;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Context getDefaultInstanceForType() {
            return Context.getDefaultInstance();
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
            if (this.appBuilder_ == null) {
                this.app_ = null;
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
            } else {
                this.regs_ = null;
                this.regsBuilder_ = null;
            }
            if (this.restrictionsBuilder_ == null) {
                this.restrictions_ = null;
            } else {
                this.restrictions_ = null;
                this.restrictionsBuilder_ = null;
            }
            if (this.userBuilder_ == null) {
                this.user_ = null;
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
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

        public Builder setApp(App.Builder builder) {
            a2 a2Var = this.appBuilder_;
            if (a2Var == null) {
                this.app_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setDevice(Device.Builder builder) {
            a2 a2Var = this.deviceBuilder_;
            if (a2Var == null) {
                this.device_ = builder.build();
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

        public Builder setRegs(Regs.Builder builder) {
            a2 a2Var = this.regsBuilder_;
            if (a2Var == null) {
                this.regs_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setRestrictions(Restrictions.Builder builder) {
            a2 a2Var = this.restrictionsBuilder_;
            if (a2Var == null) {
                this.restrictions_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setUser(User.Builder builder) {
            a2 a2Var = this.userBuilder_;
            if (a2Var == null) {
                this.user_ = builder.build();
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
            if (message instanceof Context) {
                return mergeFrom((Context) message);
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

        public Builder mergeFrom(Context context) {
            if (context == Context.getDefaultInstance()) {
                return this;
            }
            if (context.hasApp()) {
                mergeApp(context.getApp());
            }
            if (context.hasDevice()) {
                mergeDevice(context.getDevice());
            }
            if (context.hasRegs()) {
                mergeRegs(context.getRegs());
            }
            if (context.hasRestrictions()) {
                mergeRestrictions(context.getRestrictions());
            }
            if (context.hasUser()) {
                mergeUser(context.getUser());
            }
            if (context.hasExt()) {
                mergeExt(context.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!context.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = context.extProto_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(context.extProto_);
                    }
                    onChanged();
                }
            } else if (!context.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.t()) {
                    this.extProtoBuilder_.a(context.extProto_);
                } else {
                    this.extProtoBuilder_.h();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = context.extProto_;
                    this.bitField0_ &= -2;
                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) context).unknownFields);
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
        public com.explorestack.protobuf.adcom.Context.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Context.access$34300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.adcom.Context r3 = (com.explorestack.protobuf.adcom.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.adcom.Context r4 = (com.explorestack.protobuf.adcom.Context) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Context$Builder");
        }
    }

    public static Builder newBuilder(Context context) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Context(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Context parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Context) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Context getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Context parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Context() {
        this.memoizedIsInitialized = (byte) -1;
        this.extProto_ = Collections.EMPTY_LIST;
    }

    public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Context parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(bArr, wVar);
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) h0.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Context(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        byte b10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            App app = this.app_;
                            App.Builder builder = app != null ? app.toBuilder() : null;
                            App app2 = (App) lVar.A(App.parser(), wVar);
                            this.app_ = app2;
                            if (builder != null) {
                                builder.mergeFrom(app2);
                                this.app_ = builder.buildPartial();
                            }
                        } else if (iK == 18) {
                            Device device = this.device_;
                            Device.Builder builder2 = device != null ? device.toBuilder() : null;
                            Device device2 = (Device) lVar.A(Device.parser(), wVar);
                            this.device_ = device2;
                            if (builder2 != null) {
                                builder2.mergeFrom(device2);
                                this.device_ = builder2.buildPartial();
                            }
                        } else if (iK == 26) {
                            Regs regs = this.regs_;
                            Regs.Builder builder3 = regs != null ? regs.toBuilder() : null;
                            Regs regs2 = (Regs) lVar.A(Regs.parser(), wVar);
                            this.regs_ = regs2;
                            if (builder3 != null) {
                                builder3.mergeFrom(regs2);
                                this.regs_ = builder3.buildPartial();
                            }
                        } else if (iK == 34) {
                            Restrictions restrictions = this.restrictions_;
                            Restrictions.Builder builder4 = restrictions != null ? restrictions.toBuilder() : null;
                            Restrictions restrictions2 = (Restrictions) lVar.A(Restrictions.parser(), wVar);
                            this.restrictions_ = restrictions2;
                            if (builder4 != null) {
                                builder4.mergeFrom(restrictions2);
                                this.restrictions_ = builder4.buildPartial();
                            }
                        } else if (iK == 42) {
                            User user = this.user_;
                            User.Builder builder5 = user != null ? user.toBuilder() : null;
                            User user2 = (User) lVar.A(User.parser(), wVar);
                            this.user_ = user2;
                            if (builder5 != null) {
                                builder5.mergeFrom(user2);
                                this.user_ = builder5.buildPartial();
                            }
                        } else if (iK == 50) {
                            if (b10 == false) {
                                this.extProto_ = new ArrayList();
                                b10 = true;
                            }
                            this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                        } else if (iK != 58) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Struct struct = this.ext_;
                            Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.ext_ = struct2;
                            if (builder6 != null) {
                                builder6.mergeFrom(struct2);
                                this.ext_ = builder6.buildPartial();
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

    public static Context parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Context) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Context parseFrom(l lVar) throws IOException {
        return (Context) h0.parseWithIOException(PARSER, lVar);
    }

    public static Context parseFrom(l lVar, w wVar) throws IOException {
        return (Context) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
