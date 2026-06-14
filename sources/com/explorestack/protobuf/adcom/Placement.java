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
public final class Placement extends h0 implements d {
    public static final int ADMX_FIELD_NUMBER = 14;
    public static final int BADV_FIELD_NUMBER = 9;
    public static final int BAPP_FIELD_NUMBER = 10;
    public static final int BATTR_FIELD_NUMBER = 11;
    public static final int BCAT_FIELD_NUMBER = 6;
    public static final int CATTAX_FIELD_NUMBER = 7;
    public static final int CURLX_FIELD_NUMBER = 15;
    public static final int DISPLAY_FIELD_NUMBER = 16;
    public static final int EXT_FIELD_NUMBER = 20;
    public static final int EXT_PROTO_FIELD_NUMBER = 19;
    public static final int REWARD_FIELD_NUMBER = 5;
    public static final int SDKVER_FIELD_NUMBER = 4;
    public static final int SDK_FIELD_NUMBER = 3;
    public static final int SECURE_FIELD_NUMBER = 13;
    public static final int SSAI_FIELD_NUMBER = 2;
    public static final int TAGID_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 17;
    public static final int WLANG_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    private boolean admx_;
    private p0 badv_;
    private p0 bapp_;
    private int battrMemoizedSerializedSize;
    private List<Integer> battr_;
    private p0 bcat_;
    private int cattax_;
    private boolean curlx_;
    private DisplayPlacement display_;
    private List<Any> extProto_;
    private Struct ext_;
    private byte memoizedIsInitialized;
    private boolean reward_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private boolean secure_;
    private int ssai_;
    private volatile Object tagid_;
    private VideoPlacement video_;
    private p0 wlang_;
    private static final j0.h.a battr_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.1
        @Override // com.explorestack.protobuf.j0.h.a
        public CreativeAttribute convert(Integer num) {
            CreativeAttribute creativeAttributeValueOf = CreativeAttribute.valueOf(num.intValue());
            return creativeAttributeValueOf == null ? CreativeAttribute.UNRECOGNIZED : creativeAttributeValueOf;
        }
    };
    private static final Placement DEFAULT_INSTANCE = new Placement();
    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.2
        @Override // com.explorestack.protobuf.p1
        public Placement parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Placement(lVar, wVar);
        }
    };

    public static final class Builder extends h0.b implements d {
        private boolean admx_;
        private p0 badv_;
        private p0 bapp_;
        private List<Integer> battr_;
        private p0 bcat_;
        private int bitField0_;
        private int cattax_;
        private boolean curlx_;
        private a2 displayBuilder_;
        private DisplayPlacement display_;
        private a2 extBuilder_;
        private v1 extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private boolean reward_;
        private Object sdk_;
        private Object sdkver_;
        private boolean secure_;
        private int ssai_;
        private Object tagid_;
        private a2 videoBuilder_;
        private VideoPlacement video_;
        private p0 wlang_;

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
            if ((this.bitField0_ & 32) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 32;
            }
        }

        private void ensureWlangIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.wlang_ = new o0(this.wlang_);
                this.bitField0_ |= 16;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.E;
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
                this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
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

        public Builder addAllWlang(Iterable<String> iterable) {
            ensureWlangIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.wlang_);
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

        public Builder addWlang(String str) {
            str.getClass();
            ensureWlangIsMutable();
            this.wlang_.add(str);
            onChanged();
            return this;
        }

        public Builder addWlangBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureWlangIsMutable();
            this.wlang_.c(byteString);
            onChanged();
            return this;
        }

        public Builder clearAdmx() {
            this.admx_ = false;
            onChanged();
            return this;
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

        public Builder clearCurlx() {
            this.curlx_ = false;
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
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearReward() {
            this.reward_ = false;
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = Placement.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = Placement.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
            onChanged();
            return this;
        }

        public Builder clearSsai() {
            this.ssai_ = 0;
            onChanged();
            return this;
        }

        public Builder clearTagid() {
            this.tagid_ = Placement.getDefaultInstance().getTagid();
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

        public Builder clearWlang() {
            this.wlang_ = o0.f19269e;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public boolean getAdmx() {
            return this.admx_;
        }

        public String getBadv(int i10) {
            return (String) this.badv_.get(i10);
        }

        public ByteString getBadvBytes(int i10) {
            return this.badv_.getByteString(i10);
        }

        public int getBadvCount() {
            return this.badv_.size();
        }

        public String getBapp(int i10) {
            return (String) this.bapp_.get(i10);
        }

        public ByteString getBappBytes(int i10) {
            return this.bapp_.getByteString(i10);
        }

        public int getBappCount() {
            return this.bapp_.size();
        }

        public CreativeAttribute getBattr(int i10) {
            return (CreativeAttribute) Placement.battr_converter_.convert(this.battr_.get(i10));
        }

        public int getBattrCount() {
            return this.battr_.size();
        }

        public List<CreativeAttribute> getBattrList() {
            return new j0.h(this.battr_, Placement.battr_converter_);
        }

        public int getBattrValue(int i10) {
            return this.battr_.get(i10).intValue();
        }

        public List<Integer> getBattrValueList() {
            return DesugarCollections.unmodifiableList(this.battr_);
        }

        public String getBcat(int i10) {
            return (String) this.bcat_.get(i10);
        }

        public ByteString getBcatBytes(int i10) {
            return this.bcat_.getByteString(i10);
        }

        public int getBcatCount() {
            return this.bcat_.size();
        }

        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        public int getCattaxValue() {
            return this.cattax_;
        }

        public boolean getCurlx() {
            return this.curlx_;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.E;
        }

        public DisplayPlacement getDisplay() {
            a2 a2Var = this.displayBuilder_;
            if (a2Var != null) {
                return (DisplayPlacement) a2Var.e();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        public DisplayPlacement.Builder getDisplayBuilder() {
            onChanged();
            return (DisplayPlacement.Builder) getDisplayFieldBuilder().d();
        }

        public DisplayPlacementOrBuilder getDisplayOrBuilder() {
            a2 a2Var = this.displayBuilder_;
            if (a2Var != null) {
                return (DisplayPlacementOrBuilder) a2Var.f();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
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

        public boolean getReward() {
            return this.reward_;
        }

        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean getSecure() {
            return this.secure_;
        }

        public int getSsai() {
            return this.ssai_;
        }

        public String getTagid() {
            Object obj = this.tagid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tagid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTagidBytes() {
            Object obj = this.tagid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tagid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public VideoPlacement getVideo() {
            a2 a2Var = this.videoBuilder_;
            if (a2Var != null) {
                return (VideoPlacement) a2Var.e();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        public VideoPlacement.Builder getVideoBuilder() {
            onChanged();
            return (VideoPlacement.Builder) getVideoFieldBuilder().d();
        }

        public VideoPlacementOrBuilder getVideoOrBuilder() {
            a2 a2Var = this.videoBuilder_;
            if (a2Var != null) {
                return (VideoPlacementOrBuilder) a2Var.f();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        public String getWlang(int i10) {
            return (String) this.wlang_.get(i10);
        }

        public ByteString getWlangBytes(int i10) {
            return this.wlang_.getByteString(i10);
        }

        public int getWlangCount() {
            return this.wlang_.size();
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
            return b.F.d(Placement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeDisplay(DisplayPlacement displayPlacement) {
            a2 a2Var = this.displayBuilder_;
            if (a2Var != null) {
                a2Var.g(displayPlacement);
                return this;
            }
            DisplayPlacement displayPlacement2 = this.display_;
            if (displayPlacement2 != null) {
                this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
            } else {
                this.display_ = displayPlacement;
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

        public Builder mergeVideo(VideoPlacement videoPlacement) {
            a2 a2Var = this.videoBuilder_;
            if (a2Var != null) {
                a2Var.g(videoPlacement);
                return this;
            }
            VideoPlacement videoPlacement2 = this.video_;
            if (videoPlacement2 != null) {
                this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
            } else {
                this.video_ = videoPlacement;
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

        public Builder setAdmx(boolean z10) {
            this.admx_ = z10;
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

        public Builder setCurlx(boolean z10) {
            this.curlx_ = z10;
            onChanged();
            return this;
        }

        public Builder setDisplay(DisplayPlacement displayPlacement) {
            a2 a2Var = this.displayBuilder_;
            if (a2Var != null) {
                a2Var.i(displayPlacement);
                return this;
            }
            displayPlacement.getClass();
            this.display_ = displayPlacement;
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

        public Builder setReward(boolean z10) {
            this.reward_ = z10;
            onChanged();
            return this;
        }

        public Builder setSdk(String str) {
            str.getClass();
            this.sdk_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.sdk_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdkver(String str) {
            str.getClass();
            this.sdkver_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSecure(boolean z10) {
            this.secure_ = z10;
            onChanged();
            return this;
        }

        public Builder setSsai(int i10) {
            this.ssai_ = i10;
            onChanged();
            return this;
        }

        public Builder setTagid(String str) {
            str.getClass();
            this.tagid_ = str;
            onChanged();
            return this;
        }

        public Builder setTagidBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.tagid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setVideo(VideoPlacement videoPlacement) {
            a2 a2Var = this.videoBuilder_;
            if (a2Var != null) {
                a2Var.i(videoPlacement);
                return this;
            }
            videoPlacement.getClass();
            this.video_ = videoPlacement;
            onChanged();
            return this;
        }

        public Builder setWlang(int i10, String str) {
            str.getClass();
            ensureWlangIsMutable();
            this.wlang_.set(i10, str);
            onChanged();
            return this;
        }

        /* JADX INFO: renamed from: getBadvList, reason: merged with bridge method [inline-methods] */
        public t1 m4461getBadvList() {
            return this.badv_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getBappList, reason: merged with bridge method [inline-methods] */
        public t1 m4462getBappList() {
            return this.bapp_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getBcatList, reason: merged with bridge method [inline-methods] */
        public t1 m4463getBcatList() {
            return this.bcat_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getWlangList, reason: merged with bridge method [inline-methods] */
        public t1 m4464getWlangList() {
            return this.wlang_.getUnmodifiableView();
        }

        private Builder() {
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            p0 p0Var = o0.f19269e;
            this.bcat_ = p0Var;
            this.cattax_ = 0;
            this.badv_ = p0Var;
            this.bapp_ = p0Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = p0Var;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement build() {
            Placement placementBuildPartial = buildPartial();
            if (placementBuildPartial.isInitialized()) {
                return placementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) placementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement buildPartial() {
            Placement placement = new Placement(this);
            placement.tagid_ = this.tagid_;
            placement.ssai_ = this.ssai_;
            placement.sdk_ = this.sdk_;
            placement.sdkver_ = this.sdkver_;
            placement.reward_ = this.reward_;
            if ((this.bitField0_ & 1) != 0) {
                this.bcat_ = this.bcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            placement.bcat_ = this.bcat_;
            placement.cattax_ = this.cattax_;
            if ((this.bitField0_ & 2) != 0) {
                this.badv_ = this.badv_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            placement.badv_ = this.badv_;
            if ((this.bitField0_ & 4) != 0) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            placement.bapp_ = this.bapp_;
            if ((this.bitField0_ & 8) != 0) {
                this.battr_ = DesugarCollections.unmodifiableList(this.battr_);
                this.bitField0_ &= -9;
            }
            placement.battr_ = this.battr_;
            if ((this.bitField0_ & 16) != 0) {
                this.wlang_ = this.wlang_.getUnmodifiableView();
                this.bitField0_ &= -17;
            }
            placement.wlang_ = this.wlang_;
            placement.secure_ = this.secure_;
            placement.admx_ = this.admx_;
            placement.curlx_ = this.curlx_;
            a2 a2Var = this.displayBuilder_;
            if (a2Var == null) {
                placement.display_ = this.display_;
            } else {
                placement.display_ = (DisplayPlacement) a2Var.a();
            }
            a2 a2Var2 = this.videoBuilder_;
            if (a2Var2 == null) {
                placement.video_ = this.video_;
            } else {
                placement.video_ = (VideoPlacement) a2Var2.a();
            }
            a2 a2Var3 = this.extBuilder_;
            if (a2Var3 == null) {
                placement.ext_ = this.ext_;
            } else {
                placement.ext_ = (Struct) a2Var3.a();
            }
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var != null) {
                placement.extProto_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 32) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -33;
                }
                placement.extProto_ = this.extProto_;
            }
            onBuilt();
            return placement;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Placement getDefaultInstanceForType() {
            return Placement.getDefaultInstance();
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
            this.tagid_ = "";
            this.ssai_ = 0;
            this.sdk_ = "";
            this.sdkver_ = "";
            this.reward_ = false;
            p0 p0Var = o0.f19269e;
            this.bcat_ = p0Var;
            int i10 = this.bitField0_;
            this.cattax_ = 0;
            this.badv_ = p0Var;
            this.bapp_ = p0Var;
            this.bitField0_ = i10 & (-8);
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = p0Var;
            this.bitField0_ = i10 & (-32);
            this.secure_ = false;
            this.admx_ = false;
            this.curlx_ = false;
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
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            v1 v1Var = this.extProtoBuilder_;
            if (v1Var == null) {
                this.extProto_ = list;
                this.bitField0_ = i10 & (-64);
                return this;
            }
            v1Var.g();
            return this;
        }

        public Builder setDisplay(DisplayPlacement.Builder builder) {
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

        public Builder setVideo(VideoPlacement.Builder builder) {
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
            if (message instanceof Placement) {
                return mergeFrom((Placement) message);
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

        public Builder mergeFrom(Placement placement) {
            if (placement == Placement.getDefaultInstance()) {
                return this;
            }
            if (!placement.getTagid().isEmpty()) {
                this.tagid_ = placement.tagid_;
                onChanged();
            }
            if (placement.getSsai() != 0) {
                setSsai(placement.getSsai());
            }
            if (!placement.getSdk().isEmpty()) {
                this.sdk_ = placement.sdk_;
                onChanged();
            }
            if (!placement.getSdkver().isEmpty()) {
                this.sdkver_ = placement.sdkver_;
                onChanged();
            }
            if (placement.getReward()) {
                setReward(placement.getReward());
            }
            if (!placement.bcat_.isEmpty()) {
                if (this.bcat_.isEmpty()) {
                    this.bcat_ = placement.bcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureBcatIsMutable();
                    this.bcat_.addAll(placement.bcat_);
                }
                onChanged();
            }
            if (placement.cattax_ != 0) {
                setCattaxValue(placement.getCattaxValue());
            }
            if (!placement.badv_.isEmpty()) {
                if (this.badv_.isEmpty()) {
                    this.badv_ = placement.badv_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBadvIsMutable();
                    this.badv_.addAll(placement.badv_);
                }
                onChanged();
            }
            if (!placement.bapp_.isEmpty()) {
                if (this.bapp_.isEmpty()) {
                    this.bapp_ = placement.bapp_;
                    this.bitField0_ &= -5;
                } else {
                    ensureBappIsMutable();
                    this.bapp_.addAll(placement.bapp_);
                }
                onChanged();
            }
            if (!placement.battr_.isEmpty()) {
                if (this.battr_.isEmpty()) {
                    this.battr_ = placement.battr_;
                    this.bitField0_ &= -9;
                } else {
                    ensureBattrIsMutable();
                    this.battr_.addAll(placement.battr_);
                }
                onChanged();
            }
            if (!placement.wlang_.isEmpty()) {
                if (this.wlang_.isEmpty()) {
                    this.wlang_ = placement.wlang_;
                    this.bitField0_ &= -17;
                } else {
                    ensureWlangIsMutable();
                    this.wlang_.addAll(placement.wlang_);
                }
                onChanged();
            }
            if (placement.getSecure()) {
                setSecure(placement.getSecure());
            }
            if (placement.getAdmx()) {
                setAdmx(placement.getAdmx());
            }
            if (placement.getCurlx()) {
                setCurlx(placement.getCurlx());
            }
            if (placement.hasDisplay()) {
                mergeDisplay(placement.getDisplay());
            }
            if (placement.hasVideo()) {
                mergeVideo(placement.getVideo());
            }
            if (placement.hasExt()) {
                mergeExt(placement.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!placement.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = placement.extProto_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(placement.extProto_);
                    }
                    onChanged();
                }
            } else if (!placement.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.t()) {
                    this.extProtoBuilder_.a(placement.extProto_);
                } else {
                    this.extProtoBuilder_.h();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = placement.extProto_;
                    this.bitField0_ &= -33;
                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) placement).unknownFields);
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
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            p0 p0Var = o0.f19269e;
            this.bcat_ = p0Var;
            this.cattax_ = 0;
            this.badv_ = p0Var;
            this.bapp_ = p0Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = p0Var;
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

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.adcom.Placement.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.access$22100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.adcom.Placement r3 = (com.explorestack.protobuf.adcom.Placement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.adcom.Placement r4 = (com.explorestack.protobuf.adcom.Placement) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$Builder");
        }
    }

    public static final class DisplayPlacement extends h0 implements DisplayPlacementOrBuilder {
        public static final int AMPREN_FIELD_NUMBER = 6;
        public static final int API_FIELD_NUMBER = 10;
        public static final int CLKTYPE_FIELD_NUMBER = 5;
        public static final int CONTEXT_FIELD_NUMBER = 8;
        public static final int CTYPE_FIELD_NUMBER = 11;
        public static final int DISPLAYFMT_FIELD_NUMBER = 16;
        public static final int EVENT_FIELD_NUMBER = 18;
        public static final int EXT_FIELD_NUMBER = 20;
        public static final int EXT_PROTO_FIELD_NUMBER = 19;
        public static final int H_FIELD_NUMBER = 13;
        public static final int IFRBUST_FIELD_NUMBER = 4;
        public static final int INSTL_FIELD_NUMBER = 2;
        public static final int MIME_FIELD_NUMBER = 9;
        public static final int NATIVEFMT_FIELD_NUMBER = 17;
        public static final int POS_FIELD_NUMBER = 1;
        public static final int PRIV_FIELD_NUMBER = 15;
        public static final int PTYPE_FIELD_NUMBER = 7;
        public static final int TOPFRAME_FIELD_NUMBER = 3;
        public static final int UNIT_FIELD_NUMBER = 14;
        public static final int W_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private int ampren_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private int clktype_;
        private int context_;
        private int ctypeMemoizedSerializedSize;
        private List<Integer> ctype_;
        private List<DisplayFormat> displayfmt_;
        private List<EventSpec> event_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private p0 ifrbust_;
        private boolean instl_;
        private byte memoizedIsInitialized;
        private p0 mime_;
        private NativeFormat nativefmt_;
        private int pos_;
        private boolean priv_;
        private int ptype_;
        private boolean topframe_;
        private int unit_;
        private int w_;
        private static final j0.h.a api_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.1
            @Override // com.explorestack.protobuf.j0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final j0.h.a ctype_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.2
            @Override // com.explorestack.protobuf.j0.h.a
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType displayCreativeTypeValueOf = DisplayCreativeType.valueOf(num.intValue());
                return displayCreativeTypeValueOf == null ? DisplayCreativeType.UNRECOGNIZED : displayCreativeTypeValueOf;
            }
        };
        private static final DisplayPlacement DEFAULT_INSTANCE = new DisplayPlacement();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.3
            @Override // com.explorestack.protobuf.p1
            public DisplayPlacement parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new DisplayPlacement(lVar, wVar);
            }
        };

        public static final class Builder extends h0.b implements DisplayPlacementOrBuilder {
            private int ampren_;
            private List<Integer> api_;
            private int bitField0_;
            private int clktype_;
            private int context_;
            private List<Integer> ctype_;
            private v1 displayfmtBuilder_;
            private List<DisplayFormat> displayfmt_;
            private v1 eventBuilder_;
            private List<EventSpec> event_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private p0 ifrbust_;
            private boolean instl_;
            private p0 mime_;
            private a2 nativefmtBuilder_;
            private NativeFormat nativefmt_;
            private int pos_;
            private boolean priv_;
            private int ptype_;
            private boolean topframe_;
            private int unit_;
            private int w_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureDisplayfmtIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.displayfmt_ = new ArrayList(this.displayfmt_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureIfrbustIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.ifrbust_ = new o0(this.ifrbust_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.mime_ = new o0(this.mime_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.G;
            }

            private v1 getDisplayfmtFieldBuilder() {
                if (this.displayfmtBuilder_ == null) {
                    this.displayfmtBuilder_ = new v1(this.displayfmt_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.displayfmt_ = null;
                }
                return this.displayfmtBuilder_;
            }

            private v1 getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new v1(this.event_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
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
                    this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private a2 getNativefmtFieldBuilder() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmtBuilder_ = new a2(getNativefmt(), getParentForChildren(), isClean());
                    this.nativefmt_ = null;
                }
                return this.nativefmtBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getDisplayfmtFieldBuilder();
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

            public Builder addAllCtype(Iterable<? extends DisplayCreativeType> iterable) {
                ensureCtypeIsMutable();
                Iterator<? extends DisplayCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.ctype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllDisplayfmt(Iterable<? extends DisplayFormat> iterable) {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureDisplayfmtIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.displayfmt_);
                onChanged();
                return this;
            }

            public Builder addAllEvent(Iterable<? extends EventSpec> iterable) {
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

            public Builder addAllIfrbust(Iterable<String> iterable) {
                ensureIfrbustIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.ifrbust_);
                onChanged();
                return this;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.mime_);
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

            public Builder addCtype(DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i10) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat displayFormat) {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var != null) {
                    v1Var.e(displayFormat);
                    return this;
                }
                displayFormat.getClass();
                ensureDisplayfmtIsMutable();
                this.displayfmt_.add(displayFormat);
                onChanged();
                return this;
            }

            public DisplayFormat.Builder addDisplayfmtBuilder() {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().c(DisplayFormat.getDefaultInstance());
            }

            public Builder addEvent(EventSpec eventSpec) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var != null) {
                    v1Var.e(eventSpec);
                    return this;
                }
                eventSpec.getClass();
                ensureEventIsMutable();
                this.event_.add(eventSpec);
                onChanged();
                return this;
            }

            public EventSpec.Builder addEventBuilder() {
                return (EventSpec.Builder) getEventFieldBuilder().c(EventSpec.getDefaultInstance());
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

            public Builder addIfrbust(String str) {
                str.getClass();
                ensureIfrbustIsMutable();
                this.ifrbust_.add(str);
                onChanged();
                return this;
            }

            public Builder addIfrbustBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureIfrbustIsMutable();
                this.ifrbust_.c(byteString);
                onChanged();
                return this;
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

            public Builder clearAmpren() {
                this.ampren_ = 0;
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContext() {
                this.context_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearDisplayfmt() {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.displayfmt_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
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
                this.bitField0_ &= -33;
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
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIfrbust() {
                this.ifrbust_ = o0.f19269e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearInstl() {
                this.instl_ = false;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = o0.f19269e;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearNativefmt() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                    onChanged();
                    return this;
                }
                this.nativefmt_ = null;
                this.nativefmtBuilder_ = null;
                return this;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPriv() {
                this.priv_ = false;
                onChanged();
                return this;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTopframe() {
                this.topframe_ = false;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getAmpren() {
                return this.ampren_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) DisplayPlacement.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<ApiFramework> getApiList() {
                return new j0.h(this.api_, DisplayPlacement.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Integer> getApiValueList() {
                return DesugarCollections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ClickType getClktype() {
                ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
                return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getClktypeValue() {
                return this.clktype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayContextType getContext() {
                DisplayContextType displayContextTypeValueOf = DisplayContextType.valueOf(this.context_);
                return displayContextTypeValueOf == null ? DisplayContextType.UNRECOGNIZED : displayContextTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getContextValue() {
                return this.context_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayCreativeType getCtype(int i10) {
                return (DisplayCreativeType) DisplayPlacement.ctype_converter_.convert(this.ctype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getCtypeCount() {
                return this.ctype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<DisplayCreativeType> getCtypeList() {
                return new j0.h(this.ctype_, DisplayPlacement.ctype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getCtypeValue(int i10) {
                return this.ctype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Integer> getCtypeValueList() {
                return DesugarCollections.unmodifiableList(this.ctype_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.G;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayFormat getDisplayfmt(int i10) {
                v1 v1Var = this.displayfmtBuilder_;
                return v1Var == null ? this.displayfmt_.get(i10) : (DisplayFormat) v1Var.n(i10);
            }

            public DisplayFormat.Builder getDisplayfmtBuilder(int i10) {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().k(i10);
            }

            public List<DisplayFormat.Builder> getDisplayfmtBuilderList() {
                return getDisplayfmtFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getDisplayfmtCount() {
                v1 v1Var = this.displayfmtBuilder_;
                return v1Var == null ? this.displayfmt_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<DisplayFormat> getDisplayfmtList() {
                v1 v1Var = this.displayfmtBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.displayfmt_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10) {
                v1 v1Var = this.displayfmtBuilder_;
                return v1Var == null ? this.displayfmt_.get(i10) : (DisplayFormatOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
                v1 v1Var = this.displayfmtBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.displayfmt_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public EventSpec getEvent(int i10) {
                v1 v1Var = this.eventBuilder_;
                return v1Var == null ? this.event_.get(i10) : (EventSpec) v1Var.n(i10);
            }

            public EventSpec.Builder getEventBuilder(int i10) {
                return (EventSpec.Builder) getEventFieldBuilder().k(i10);
            }

            public List<EventSpec.Builder> getEventBuilderList() {
                return getEventFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getEventCount() {
                v1 v1Var = this.eventBuilder_;
                return v1Var == null ? this.event_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<EventSpec> getEventList() {
                v1 v1Var = this.eventBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.event_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public EventSpecOrBuilder getEventOrBuilder(int i10) {
                v1 v1Var = this.eventBuilder_;
                return v1Var == null ? this.event_.get(i10) : (EventSpecOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
                v1 v1Var = this.eventBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.event_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public String getIfrbust(int i10) {
                return (String) this.ifrbust_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ByteString getIfrbustBytes(int i10) {
                return this.ifrbust_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getIfrbustCount() {
                return this.ifrbust_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getInstl() {
                return this.instl_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public String getMime(int i10) {
                return (String) this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public NativeFormat getNativefmt() {
                a2 a2Var = this.nativefmtBuilder_;
                if (a2Var != null) {
                    return (NativeFormat) a2Var.e();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            public NativeFormat.Builder getNativefmtBuilder() {
                onChanged();
                return (NativeFormat.Builder) getNativefmtFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public NativeFormatOrBuilder getNativefmtOrBuilder() {
                a2 a2Var = this.nativefmtBuilder_;
                if (a2Var != null) {
                    return (NativeFormatOrBuilder) a2Var.f();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public PlacementPosition getPos() {
                PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
                return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getPosValue() {
                return this.pos_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getPriv() {
                return this.priv_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayPlacementType getPtype() {
                DisplayPlacementType displayPlacementTypeValueOf = DisplayPlacementType.valueOf(this.ptype_);
                return displayPlacementTypeValueOf == null ? DisplayPlacementType.UNRECOGNIZED : displayPlacementTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getPtypeValue() {
                return this.ptype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getTopframe() {
                return this.topframe_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public SizeUnit getUnit() {
                SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
                return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getUnitValue() {
                return this.unit_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean hasNativefmt() {
                return (this.nativefmtBuilder_ == null && this.nativefmt_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.H.d(DisplayPlacement.class, Builder.class);
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

            public Builder mergeNativefmt(NativeFormat nativeFormat) {
                a2 a2Var = this.nativefmtBuilder_;
                if (a2Var != null) {
                    a2Var.g(nativeFormat);
                    return this;
                }
                NativeFormat nativeFormat2 = this.nativefmt_;
                if (nativeFormat2 != null) {
                    this.nativefmt_ = NativeFormat.newBuilder(nativeFormat2).mergeFrom(nativeFormat).buildPartial();
                } else {
                    this.nativefmt_ = nativeFormat;
                }
                onChanged();
                return this;
            }

            public Builder removeDisplayfmt(int i10) {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureDisplayfmtIsMutable();
                this.displayfmt_.remove(i10);
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

            public Builder setAmpren(int i10) {
                this.ampren_ = i10;
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

            public Builder setClktype(ClickType clickType) {
                clickType.getClass();
                this.clktype_ = clickType.getNumber();
                onChanged();
                return this;
            }

            public Builder setClktypeValue(int i10) {
                this.clktype_ = i10;
                onChanged();
                return this;
            }

            public Builder setContext(DisplayContextType displayContextType) {
                displayContextType.getClass();
                this.context_ = displayContextType.getNumber();
                onChanged();
                return this;
            }

            public Builder setContextValue(int i10) {
                this.context_ = i10;
                onChanged();
                return this;
            }

            public Builder setCtype(int i10, DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCtypeValue(int i10, int i11) {
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setDisplayfmt(int i10, DisplayFormat displayFormat) {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, displayFormat);
                    return this;
                }
                displayFormat.getClass();
                ensureDisplayfmtIsMutable();
                this.displayfmt_.set(i10, displayFormat);
                onChanged();
                return this;
            }

            public Builder setEvent(int i10, EventSpec eventSpec) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, eventSpec);
                    return this;
                }
                eventSpec.getClass();
                ensureEventIsMutable();
                this.event_.set(i10, eventSpec);
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

            public Builder setIfrbust(int i10, String str) {
                str.getClass();
                ensureIfrbustIsMutable();
                this.ifrbust_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setInstl(boolean z10) {
                this.instl_ = z10;
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

            public Builder setNativefmt(NativeFormat nativeFormat) {
                a2 a2Var = this.nativefmtBuilder_;
                if (a2Var != null) {
                    a2Var.i(nativeFormat);
                    return this;
                }
                nativeFormat.getClass();
                this.nativefmt_ = nativeFormat;
                onChanged();
                return this;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                placementPosition.getClass();
                this.pos_ = placementPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setPosValue(int i10) {
                this.pos_ = i10;
                onChanged();
                return this;
            }

            public Builder setPriv(boolean z10) {
                this.priv_ = z10;
                onChanged();
                return this;
            }

            public Builder setPtype(DisplayPlacementType displayPlacementType) {
                displayPlacementType.getClass();
                this.ptype_ = displayPlacementType.getNumber();
                onChanged();
                return this;
            }

            public Builder setPtypeValue(int i10) {
                this.ptype_ = i10;
                onChanged();
                return this;
            }

            public Builder setTopframe(boolean z10) {
                this.topframe_ = z10;
                onChanged();
                return this;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                sizeUnit.getClass();
                this.unit_ = sizeUnit.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnitValue(int i10) {
                this.unit_ = i10;
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public t1 getIfrbustList() {
                return this.ifrbust_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public t1 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.pos_ = 0;
                p0 p0Var = o0.f19269e;
                this.ifrbust_ = p0Var;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = p0Var;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.displayfmt_ = list;
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DisplayPlacement build() {
                DisplayPlacement displayPlacementBuildPartial = buildPartial();
                if (displayPlacementBuildPartial.isInitialized()) {
                    return displayPlacementBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayPlacementBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DisplayPlacement buildPartial() {
                DisplayPlacement displayPlacement = new DisplayPlacement(this);
                displayPlacement.pos_ = this.pos_;
                displayPlacement.instl_ = this.instl_;
                displayPlacement.topframe_ = this.topframe_;
                if ((this.bitField0_ & 1) != 0) {
                    this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                displayPlacement.ifrbust_ = this.ifrbust_;
                displayPlacement.clktype_ = this.clktype_;
                displayPlacement.ampren_ = this.ampren_;
                displayPlacement.ptype_ = this.ptype_;
                displayPlacement.context_ = this.context_;
                if ((this.bitField0_ & 2) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                displayPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 4) != 0) {
                    this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    this.bitField0_ &= -5;
                }
                displayPlacement.api_ = this.api_;
                if ((this.bitField0_ & 8) != 0) {
                    this.ctype_ = DesugarCollections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -9;
                }
                displayPlacement.ctype_ = this.ctype_;
                displayPlacement.w_ = this.w_;
                displayPlacement.h_ = this.h_;
                displayPlacement.unit_ = this.unit_;
                displayPlacement.priv_ = this.priv_;
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var != null) {
                    displayPlacement.displayfmt_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.displayfmt_ = DesugarCollections.unmodifiableList(this.displayfmt_);
                        this.bitField0_ &= -17;
                    }
                    displayPlacement.displayfmt_ = this.displayfmt_;
                }
                a2 a2Var = this.nativefmtBuilder_;
                if (a2Var == null) {
                    displayPlacement.nativefmt_ = this.nativefmt_;
                } else {
                    displayPlacement.nativefmt_ = (NativeFormat) a2Var.a();
                }
                v1 v1Var2 = this.eventBuilder_;
                if (v1Var2 != null) {
                    displayPlacement.event_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 32) != 0) {
                        this.event_ = DesugarCollections.unmodifiableList(this.event_);
                        this.bitField0_ &= -33;
                    }
                    displayPlacement.event_ = this.event_;
                }
                a2 a2Var2 = this.extBuilder_;
                if (a2Var2 == null) {
                    displayPlacement.ext_ = this.ext_;
                } else {
                    displayPlacement.ext_ = (Struct) a2Var2.a();
                }
                v1 v1Var3 = this.extProtoBuilder_;
                if (v1Var3 != null) {
                    displayPlacement.extProto_ = v1Var3.f();
                } else {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    displayPlacement.extProto_ = this.extProto_;
                }
                onBuilt();
                return displayPlacement;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public DisplayPlacement getDefaultInstanceForType() {
                return DisplayPlacement.getDefaultInstance();
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

            public DisplayFormat.Builder addDisplayfmtBuilder(int i10) {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().b(i10, DisplayFormat.getDefaultInstance());
            }

            public EventSpec.Builder addEventBuilder(int i10) {
                return (EventSpec.Builder) getEventFieldBuilder().b(i10, EventSpec.getDefaultInstance());
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
                this.pos_ = 0;
                this.instl_ = false;
                this.topframe_ = false;
                p0 p0Var = o0.f19269e;
                this.ifrbust_ = p0Var;
                int i10 = this.bitField0_;
                this.clktype_ = 0;
                this.ampren_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = p0Var;
                this.bitField0_ = i10 & (-4);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.bitField0_ = i10 & (-16);
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.priv_ = false;
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var == null) {
                    this.displayfmt_ = list;
                    this.bitField0_ = i10 & (-32);
                } else {
                    v1Var.g();
                }
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                } else {
                    this.nativefmt_ = null;
                    this.nativefmtBuilder_ = null;
                }
                v1 v1Var2 = this.eventBuilder_;
                if (v1Var2 == null) {
                    this.event_ = list;
                    this.bitField0_ &= -33;
                } else {
                    v1Var2.g();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                v1 v1Var3 = this.extProtoBuilder_;
                if (v1Var3 == null) {
                    this.extProto_ = list;
                    this.bitField0_ &= -65;
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

            public Builder setNativefmt(NativeFormat.Builder builder) {
                a2 a2Var = this.nativefmtBuilder_;
                if (a2Var == null) {
                    this.nativefmt_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addDisplayfmt(int i10, DisplayFormat displayFormat) {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var == null) {
                    displayFormat.getClass();
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i10, displayFormat);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, displayFormat);
                return this;
            }

            public Builder addEvent(int i10, EventSpec eventSpec) {
                v1 v1Var = this.eventBuilder_;
                if (v1Var == null) {
                    eventSpec.getClass();
                    ensureEventIsMutable();
                    this.event_.add(i10, eventSpec);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, eventSpec);
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
                if (message instanceof DisplayPlacement) {
                    return mergeFrom((DisplayPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDisplayfmt(int i10, DisplayFormat.Builder builder) {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder setEvent(int i10, EventSpec.Builder builder) {
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

            public Builder mergeFrom(DisplayPlacement displayPlacement) {
                if (displayPlacement == DisplayPlacement.getDefaultInstance()) {
                    return this;
                }
                if (displayPlacement.pos_ != 0) {
                    setPosValue(displayPlacement.getPosValue());
                }
                if (displayPlacement.getInstl()) {
                    setInstl(displayPlacement.getInstl());
                }
                if (displayPlacement.getTopframe()) {
                    setTopframe(displayPlacement.getTopframe());
                }
                if (!displayPlacement.ifrbust_.isEmpty()) {
                    if (this.ifrbust_.isEmpty()) {
                        this.ifrbust_ = displayPlacement.ifrbust_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureIfrbustIsMutable();
                        this.ifrbust_.addAll(displayPlacement.ifrbust_);
                    }
                    onChanged();
                }
                if (displayPlacement.clktype_ != 0) {
                    setClktypeValue(displayPlacement.getClktypeValue());
                }
                if (displayPlacement.getAmpren() != 0) {
                    setAmpren(displayPlacement.getAmpren());
                }
                if (displayPlacement.ptype_ != 0) {
                    setPtypeValue(displayPlacement.getPtypeValue());
                }
                if (displayPlacement.context_ != 0) {
                    setContextValue(displayPlacement.getContextValue());
                }
                if (!displayPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = displayPlacement.mime_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(displayPlacement.mime_);
                    }
                    onChanged();
                }
                if (!displayPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = displayPlacement.api_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(displayPlacement.api_);
                    }
                    onChanged();
                }
                if (!displayPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = displayPlacement.ctype_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(displayPlacement.ctype_);
                    }
                    onChanged();
                }
                if (displayPlacement.getW() != 0) {
                    setW(displayPlacement.getW());
                }
                if (displayPlacement.getH() != 0) {
                    setH(displayPlacement.getH());
                }
                if (displayPlacement.unit_ != 0) {
                    setUnitValue(displayPlacement.getUnitValue());
                }
                if (displayPlacement.getPriv()) {
                    setPriv(displayPlacement.getPriv());
                }
                if (this.displayfmtBuilder_ == null) {
                    if (!displayPlacement.displayfmt_.isEmpty()) {
                        if (this.displayfmt_.isEmpty()) {
                            this.displayfmt_ = displayPlacement.displayfmt_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureDisplayfmtIsMutable();
                            this.displayfmt_.addAll(displayPlacement.displayfmt_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.displayfmt_.isEmpty()) {
                    if (!this.displayfmtBuilder_.t()) {
                        this.displayfmtBuilder_.a(displayPlacement.displayfmt_);
                    } else {
                        this.displayfmtBuilder_.h();
                        this.displayfmtBuilder_ = null;
                        this.displayfmt_ = displayPlacement.displayfmt_;
                        this.bitField0_ &= -17;
                        this.displayfmtBuilder_ = h0.alwaysUseFieldBuilders ? getDisplayfmtFieldBuilder() : null;
                    }
                }
                if (displayPlacement.hasNativefmt()) {
                    mergeNativefmt(displayPlacement.getNativefmt());
                }
                if (this.eventBuilder_ == null) {
                    if (!displayPlacement.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = displayPlacement.event_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(displayPlacement.event_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.event_.isEmpty()) {
                    if (!this.eventBuilder_.t()) {
                        this.eventBuilder_.a(displayPlacement.event_);
                    } else {
                        this.eventBuilder_.h();
                        this.eventBuilder_ = null;
                        this.event_ = displayPlacement.event_;
                        this.bitField0_ &= -33;
                        this.eventBuilder_ = h0.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    }
                }
                if (displayPlacement.hasExt()) {
                    mergeExt(displayPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!displayPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = displayPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(displayPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(displayPlacement.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = displayPlacement.extProto_;
                        this.bitField0_ &= -65;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) displayPlacement).unknownFields);
                onChanged();
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat.Builder builder) {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addEvent(EventSpec.Builder builder) {
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

            private Builder(h0.c cVar) {
                super(cVar);
                this.pos_ = 0;
                p0 p0Var = o0.f19269e;
                this.ifrbust_ = p0Var;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = p0Var;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.displayfmt_ = list;
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addDisplayfmt(int i10, DisplayFormat.Builder builder) {
                v1 v1Var = this.displayfmtBuilder_;
                if (v1Var == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.d(i10, builder.build());
                return this;
            }

            public Builder addEvent(int i10, EventSpec.Builder builder) {
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
            public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.access$13500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Placement$DisplayPlacement r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Placement$DisplayPlacement r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$Builder");
            }
        }

        public static final class DisplayFormat extends h0 implements DisplayFormatOrBuilder {
            public static final int EXPDIR_FIELD_NUMBER = 5;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int HRATIO_FIELD_NUMBER = 4;
            public static final int H_FIELD_NUMBER = 2;
            public static final int WRATIO_FIELD_NUMBER = 3;
            public static final int W_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int expdirMemoizedSerializedSize;
            private List<Integer> expdir_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int hratio_;
            private byte memoizedIsInitialized;
            private int w_;
            private int wratio_;
            private static final j0.h.a expdir_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.1
                @Override // com.explorestack.protobuf.j0.h.a
                public ExpandableDirection convert(Integer num) {
                    ExpandableDirection expandableDirectionValueOf = ExpandableDirection.valueOf(num.intValue());
                    return expandableDirectionValueOf == null ? ExpandableDirection.UNRECOGNIZED : expandableDirectionValueOf;
                }
            };
            private static final DisplayFormat DEFAULT_INSTANCE = new DisplayFormat();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.2
                @Override // com.explorestack.protobuf.p1
                public DisplayFormat parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new DisplayFormat(lVar, wVar);
                }
            };

            public static DisplayFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.I;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DisplayFormat)) {
                    return super.equals(obj);
                }
                DisplayFormat displayFormat = (DisplayFormat) obj;
                if (getW() == displayFormat.getW() && getH() == displayFormat.getH() && getWratio() == displayFormat.getWratio() && getHratio() == displayFormat.getHratio() && this.expdir_.equals(displayFormat.expdir_) && hasExt() == displayFormat.hasExt()) {
                    return (!hasExt() || getExt().equals(displayFormat.getExt())) && getExtProtoList().equals(displayFormat.getExtProtoList()) && this.unknownFields.equals(displayFormat.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public ExpandableDirection getExpdir(int i10) {
                return (ExpandableDirection) expdir_converter_.convert(this.expdir_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExpdirCount() {
                return this.expdir_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<ExpandableDirection> getExpdirList() {
                return new j0.h(this.expdir_, expdir_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExpdirValue(int i10) {
                return this.expdir_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<Integer> getExpdirValueList() {
                return this.expdir_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getHratio() {
                return this.hratio_;
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
                int i11 = this.w_;
                int iY = i11 != 0 ? n.Y(1, i11) : 0;
                int i12 = this.h_;
                if (i12 != 0) {
                    iY += n.Y(2, i12);
                }
                int i13 = this.wratio_;
                if (i13 != 0) {
                    iY += n.Y(3, i13);
                }
                int i14 = this.hratio_;
                if (i14 != 0) {
                    iY += n.Y(4, i14);
                }
                int iM = 0;
                for (int i15 = 0; i15 < this.expdir_.size(); i15++) {
                    iM += n.m(this.expdir_.get(i15).intValue());
                }
                int iG = iY + iM;
                if (!getExpdirList().isEmpty()) {
                    iG = iG + 1 + n.Z(iM);
                }
                this.expdirMemoizedSerializedSize = iM;
                for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
                    iG += n.G(6, this.extProto_.get(i16));
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

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getWratio() {
                return this.wratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getW()) * 37) + 2) * 53) + getH()) * 37) + 3) * 53) + getWratio()) * 37) + 4) * 53) + getHratio();
                if (getExpdirCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + this.expdir_.hashCode();
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
                return b.J.d(DisplayFormat.class, Builder.class);
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
                return new DisplayFormat();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                getSerializedSize();
                int i10 = this.w_;
                if (i10 != 0) {
                    nVar.W0(1, i10);
                }
                int i11 = this.h_;
                if (i11 != 0) {
                    nVar.W0(2, i11);
                }
                int i12 = this.wratio_;
                if (i12 != 0) {
                    nVar.W0(3, i12);
                }
                int i13 = this.hratio_;
                if (i13 != 0) {
                    nVar.W0(4, i13);
                }
                if (getExpdirList().size() > 0) {
                    nVar.X0(42);
                    nVar.X0(this.expdirMemoizedSerializedSize);
                }
                for (int i14 = 0; i14 < this.expdir_.size(); i14++) {
                    nVar.w0(this.expdir_.get(i14).intValue());
                }
                for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                    nVar.J0(6, this.extProto_.get(i15));
                }
                if (this.ext_ != null) {
                    nVar.J0(7, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements DisplayFormatOrBuilder {
                private int bitField0_;
                private List<Integer> expdir_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private int h_;
                private int hratio_;
                private int w_;
                private int wratio_;

                private void ensureExpdirIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.expdir_ = new ArrayList(this.expdir_);
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
                    return b.I;
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

                public Builder addAllExpdir(Iterable<? extends ExpandableDirection> iterable) {
                    ensureExpdirIsMutable();
                    Iterator<? extends ExpandableDirection> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.expdir_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllExpdirValue(Iterable<Integer> iterable) {
                    ensureExpdirIsMutable();
                    for (Integer num : iterable) {
                        num.intValue();
                        this.expdir_.add(num);
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

                public Builder addExpdir(ExpandableDirection expandableDirection) {
                    expandableDirection.getClass();
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(expandableDirection.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addExpdirValue(int i10) {
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(i10));
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

                public Builder clearExpdir() {
                    this.expdir_ = Collections.EMPTY_LIST;
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

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.I;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public ExpandableDirection getExpdir(int i10) {
                    return (ExpandableDirection) DisplayFormat.expdir_converter_.convert(this.expdir_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExpdirCount() {
                    return this.expdir_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<ExpandableDirection> getExpdirList() {
                    return new j0.h(this.expdir_, DisplayFormat.expdir_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExpdirValue(int i10) {
                    return this.expdir_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<Integer> getExpdirValueList() {
                    return DesugarCollections.unmodifiableList(this.expdir_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getH() {
                    return this.h_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getHratio() {
                    return this.hratio_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getW() {
                    return this.w_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getWratio() {
                    return this.wratio_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.J.d(DisplayFormat.class, Builder.class);
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

                public Builder setExpdir(int i10, ExpandableDirection expandableDirection) {
                    expandableDirection.getClass();
                    ensureExpdirIsMutable();
                    this.expdir_.set(i10, Integer.valueOf(expandableDirection.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setExpdirValue(int i10, int i11) {
                    ensureExpdirIsMutable();
                    this.expdir_.set(i10, Integer.valueOf(i11));
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

                private Builder() {
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DisplayFormat build() {
                    DisplayFormat displayFormatBuildPartial = buildPartial();
                    if (displayFormatBuildPartial.isInitialized()) {
                        return displayFormatBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayFormatBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DisplayFormat buildPartial() {
                    DisplayFormat displayFormat = new DisplayFormat(this);
                    displayFormat.w_ = this.w_;
                    displayFormat.h_ = this.h_;
                    displayFormat.wratio_ = this.wratio_;
                    displayFormat.hratio_ = this.hratio_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.expdir_ = DesugarCollections.unmodifiableList(this.expdir_);
                        this.bitField0_ &= -2;
                    }
                    displayFormat.expdir_ = this.expdir_;
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        displayFormat.ext_ = this.ext_;
                    } else {
                        displayFormat.ext_ = (Struct) a2Var.a();
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        displayFormat.extProto_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        displayFormat.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return displayFormat;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public DisplayFormat getDefaultInstanceForType() {
                    return DisplayFormat.getDefaultInstance();
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
                    this.w_ = 0;
                    this.h_ = 0;
                    this.wratio_ = 0;
                    this.hratio_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
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
                        this.extProto_ = list;
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

                private Builder(h0.c cVar) {
                    super(cVar);
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
                    this.extProto_ = list;
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
                    if (message instanceof DisplayFormat) {
                        return mergeFrom((DisplayFormat) message);
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

                public Builder mergeFrom(DisplayFormat displayFormat) {
                    if (displayFormat == DisplayFormat.getDefaultInstance()) {
                        return this;
                    }
                    if (displayFormat.getW() != 0) {
                        setW(displayFormat.getW());
                    }
                    if (displayFormat.getH() != 0) {
                        setH(displayFormat.getH());
                    }
                    if (displayFormat.getWratio() != 0) {
                        setWratio(displayFormat.getWratio());
                    }
                    if (displayFormat.getHratio() != 0) {
                        setHratio(displayFormat.getHratio());
                    }
                    if (!displayFormat.expdir_.isEmpty()) {
                        if (this.expdir_.isEmpty()) {
                            this.expdir_ = displayFormat.expdir_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExpdirIsMutable();
                            this.expdir_.addAll(displayFormat.expdir_);
                        }
                        onChanged();
                    }
                    if (displayFormat.hasExt()) {
                        mergeExt(displayFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!displayFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = displayFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(displayFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!displayFormat.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(displayFormat.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = displayFormat.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) displayFormat).unknownFields);
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
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat$Builder");
                }
            }

            public static Builder newBuilder(DisplayFormat displayFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayFormat);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteBuffer, wVar);
            }

            private DisplayFormat(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (DisplayFormat) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static DisplayFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public DisplayFormat getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static DisplayFormat parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DisplayFormat() {
                this.memoizedIsInitialized = (byte) -1;
                List list = Collections.EMPTY_LIST;
                this.expdir_ = list;
                this.extProto_ = list;
            }

            public static DisplayFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static DisplayFormat parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(bArr, wVar);
            }

            public static DisplayFormat parseFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) h0.parseWithIOException(PARSER, inputStream);
            }

            private DisplayFormat(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.w_ = lVar.L();
                                } else if (iK == 16) {
                                    this.h_ = lVar.L();
                                } else if (iK == 24) {
                                    this.wratio_ = lVar.L();
                                } else if (iK == 32) {
                                    this.hratio_ = lVar.L();
                                } else if (iK == 40) {
                                    int iT = lVar.t();
                                    if ((i10 & 1) == 0) {
                                        this.expdir_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.expdir_.add(Integer.valueOf(iT));
                                } else if (iK == 42) {
                                    int iP = lVar.p(lVar.C());
                                    while (lVar.d() > 0) {
                                        int iT2 = lVar.t();
                                        if ((i10 & 1) == 0) {
                                            this.expdir_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.expdir_.add(Integer.valueOf(iT2));
                                    }
                                    lVar.o(iP);
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
                            this.expdir_ = DesugarCollections.unmodifiableList(this.expdir_);
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
                    this.expdir_ = DesugarCollections.unmodifiableList(this.expdir_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static DisplayFormat parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (DisplayFormat) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static DisplayFormat parseFrom(l lVar) throws IOException {
                return (DisplayFormat) h0.parseWithIOException(PARSER, lVar);
            }

            public static DisplayFormat parseFrom(l lVar, w wVar) throws IOException {
                return (DisplayFormat) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface DisplayFormatOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            ExpandableDirection getExpdir(int i10);

            int getExpdirCount();

            List<ExpandableDirection> getExpdirList();

            int getExpdirValue(int i10);

            List<Integer> getExpdirValueList();

            Struct getExt();

            e2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            int getH();

            int getHratio();

            int getW();

            int getWratio();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class EventSpec extends h0 implements EventSpecOrBuilder {
            public static final int API_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 9;
            public static final int EXT_PROTO_FIELD_NUMBER = 8;
            public static final int JSTRK_FIELD_NUMBER = 4;
            public static final int METHOD_FIELD_NUMBER = 2;
            public static final int PXTRK_FIELD_NUMBER = 6;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int WJS_FIELD_NUMBER = 5;
            public static final int WPX_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private int apiMemoizedSerializedSize;
            private List<Integer> api_;
            private List<Any> extProto_;
            private Struct ext_;
            private p0 jstrk_;
            private byte memoizedIsInitialized;
            private int methodMemoizedSerializedSize;
            private List<Integer> method_;
            private p0 pxtrk_;
            private int type_;
            private boolean wjs_;
            private boolean wpx_;
            private static final j0.h.a method_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.1
                @Override // com.explorestack.protobuf.j0.h.a
                public EventTrackingMethod convert(Integer num) {
                    EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(num.intValue());
                    return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
                }
            };
            private static final j0.h.a api_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.2
                @Override // com.explorestack.protobuf.j0.h.a
                public ApiFramework convert(Integer num) {
                    ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                    return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
                }
            };
            private static final EventSpec DEFAULT_INSTANCE = new EventSpec();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.3
                @Override // com.explorestack.protobuf.p1
                public EventSpec parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new EventSpec(lVar, wVar);
                }
            };

            public static final class Builder extends h0.b implements EventSpecOrBuilder {
                private List<Integer> api_;
                private int bitField0_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private p0 jstrk_;
                private List<Integer> method_;
                private p0 pxtrk_;
                private int type_;
                private boolean wjs_;
                private boolean wpx_;

                private void ensureApiIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.api_ = new ArrayList(this.api_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 16) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 16;
                    }
                }

                private void ensureJstrkIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.jstrk_ = new o0(this.jstrk_);
                        this.bitField0_ |= 4;
                    }
                }

                private void ensureMethodIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.method_ = new ArrayList(this.method_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensurePxtrkIsMutable() {
                    if ((this.bitField0_ & 8) == 0) {
                        this.pxtrk_ = new o0(this.pxtrk_);
                        this.bitField0_ |= 8;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.U;
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

                public Builder addAllJstrk(Iterable<String> iterable) {
                    ensureJstrkIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.jstrk_);
                    onChanged();
                    return this;
                }

                public Builder addAllMethod(Iterable<? extends EventTrackingMethod> iterable) {
                    ensureMethodIsMutable();
                    Iterator<? extends EventTrackingMethod> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.method_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllMethodValue(Iterable<Integer> iterable) {
                    ensureMethodIsMutable();
                    for (Integer num : iterable) {
                        num.intValue();
                        this.method_.add(num);
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllPxtrk(Iterable<String> iterable) {
                    ensurePxtrkIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.pxtrk_);
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

                public Builder addJstrk(String str) {
                    str.getClass();
                    ensureJstrkIsMutable();
                    this.jstrk_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addJstrkBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    ensureJstrkIsMutable();
                    this.jstrk_.c(byteString);
                    onChanged();
                    return this;
                }

                public Builder addMethod(EventTrackingMethod eventTrackingMethod) {
                    eventTrackingMethod.getClass();
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(eventTrackingMethod.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addMethodValue(int i10) {
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(i10));
                    onChanged();
                    return this;
                }

                public Builder addPxtrk(String str) {
                    str.getClass();
                    ensurePxtrkIsMutable();
                    this.pxtrk_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addPxtrkBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    ensurePxtrkIsMutable();
                    this.pxtrk_.c(byteString);
                    onChanged();
                    return this;
                }

                public Builder clearApi() {
                    this.api_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
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

                public Builder clearJstrk() {
                    this.jstrk_ = o0.f19269e;
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearMethod() {
                    this.method_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearPxtrk() {
                    this.pxtrk_ = o0.f19269e;
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWjs() {
                    this.wjs_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearWpx() {
                    this.wpx_ = false;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ApiFramework getApi(int i10) {
                    return (ApiFramework) EventSpec.api_converter_.convert(this.api_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getApiCount() {
                    return this.api_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<ApiFramework> getApiList() {
                    return new j0.h(this.api_, EventSpec.api_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getApiValue(int i10) {
                    return this.api_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Integer> getApiValueList() {
                    return DesugarCollections.unmodifiableList(this.api_);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.U;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public String getJstrk(int i10) {
                    return (String) this.jstrk_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ByteString getJstrkBytes(int i10) {
                    return this.jstrk_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getJstrkCount() {
                    return this.jstrk_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public EventTrackingMethod getMethod(int i10) {
                    return (EventTrackingMethod) EventSpec.method_converter_.convert(this.method_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getMethodCount() {
                    return this.method_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<EventTrackingMethod> getMethodList() {
                    return new j0.h(this.method_, EventSpec.method_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getMethodValue(int i10) {
                    return this.method_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Integer> getMethodValueList() {
                    return DesugarCollections.unmodifiableList(this.method_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public String getPxtrk(int i10) {
                    return (String) this.pxtrk_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ByteString getPxtrkBytes(int i10) {
                    return this.pxtrk_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getPxtrkCount() {
                    return this.pxtrk_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public EventType getType() {
                    EventType eventTypeValueOf = EventType.valueOf(this.type_);
                    return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getTypeValue() {
                    return this.type_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean getWjs() {
                    return this.wjs_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean getWpx() {
                    return this.wpx_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.V.d(EventSpec.class, Builder.class);
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

                public Builder setJstrk(int i10, String str) {
                    str.getClass();
                    ensureJstrkIsMutable();
                    this.jstrk_.set(i10, str);
                    onChanged();
                    return this;
                }

                public Builder setMethod(int i10, EventTrackingMethod eventTrackingMethod) {
                    eventTrackingMethod.getClass();
                    ensureMethodIsMutable();
                    this.method_.set(i10, Integer.valueOf(eventTrackingMethod.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setMethodValue(int i10, int i11) {
                    ensureMethodIsMutable();
                    this.method_.set(i10, Integer.valueOf(i11));
                    onChanged();
                    return this;
                }

                public Builder setPxtrk(int i10, String str) {
                    str.getClass();
                    ensurePxtrkIsMutable();
                    this.pxtrk_.set(i10, str);
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

                public Builder setWjs(boolean z10) {
                    this.wjs_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setWpx(boolean z10) {
                    this.wpx_ = z10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public t1 getJstrkList() {
                    return this.jstrk_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public t1 getPxtrkList() {
                    return this.pxtrk_.getUnmodifiableView();
                }

                private Builder() {
                    this.type_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    this.api_ = list;
                    p0 p0Var = o0.f19269e;
                    this.jstrk_ = p0Var;
                    this.pxtrk_ = p0Var;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EventSpec build() {
                    EventSpec eventSpecBuildPartial = buildPartial();
                    if (eventSpecBuildPartial.isInitialized()) {
                        return eventSpecBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventSpecBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EventSpec buildPartial() {
                    EventSpec eventSpec = new EventSpec(this);
                    eventSpec.type_ = this.type_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.method_ = DesugarCollections.unmodifiableList(this.method_);
                        this.bitField0_ &= -2;
                    }
                    eventSpec.method_ = this.method_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.api_ = DesugarCollections.unmodifiableList(this.api_);
                        this.bitField0_ &= -3;
                    }
                    eventSpec.api_ = this.api_;
                    if ((this.bitField0_ & 4) != 0) {
                        this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        this.bitField0_ &= -5;
                    }
                    eventSpec.jstrk_ = this.jstrk_;
                    eventSpec.wjs_ = this.wjs_;
                    if ((this.bitField0_ & 8) != 0) {
                        this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                        this.bitField0_ &= -9;
                    }
                    eventSpec.pxtrk_ = this.pxtrk_;
                    eventSpec.wpx_ = this.wpx_;
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        eventSpec.ext_ = this.ext_;
                    } else {
                        eventSpec.ext_ = (Struct) a2Var.a();
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        eventSpec.extProto_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 16) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -17;
                        }
                        eventSpec.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return eventSpec;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public EventSpec getDefaultInstanceForType() {
                    return EventSpec.getDefaultInstance();
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
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    int i10 = this.bitField0_;
                    this.api_ = list;
                    this.bitField0_ = i10 & (-4);
                    p0 p0Var = o0.f19269e;
                    this.jstrk_ = p0Var;
                    this.wjs_ = false;
                    this.pxtrk_ = p0Var;
                    this.bitField0_ = i10 & (-16);
                    this.wpx_ = false;
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
                    if (message instanceof EventSpec) {
                        return mergeFrom((EventSpec) message);
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

                public Builder mergeFrom(EventSpec eventSpec) {
                    if (eventSpec == EventSpec.getDefaultInstance()) {
                        return this;
                    }
                    if (eventSpec.type_ != 0) {
                        setTypeValue(eventSpec.getTypeValue());
                    }
                    if (!eventSpec.method_.isEmpty()) {
                        if (this.method_.isEmpty()) {
                            this.method_ = eventSpec.method_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMethodIsMutable();
                            this.method_.addAll(eventSpec.method_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.api_.isEmpty()) {
                        if (this.api_.isEmpty()) {
                            this.api_ = eventSpec.api_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureApiIsMutable();
                            this.api_.addAll(eventSpec.api_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.jstrk_.isEmpty()) {
                        if (this.jstrk_.isEmpty()) {
                            this.jstrk_ = eventSpec.jstrk_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureJstrkIsMutable();
                            this.jstrk_.addAll(eventSpec.jstrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWjs()) {
                        setWjs(eventSpec.getWjs());
                    }
                    if (!eventSpec.pxtrk_.isEmpty()) {
                        if (this.pxtrk_.isEmpty()) {
                            this.pxtrk_ = eventSpec.pxtrk_;
                            this.bitField0_ &= -9;
                        } else {
                            ensurePxtrkIsMutable();
                            this.pxtrk_.addAll(eventSpec.pxtrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWpx()) {
                        setWpx(eventSpec.getWpx());
                    }
                    if (eventSpec.hasExt()) {
                        mergeExt(eventSpec.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!eventSpec.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = eventSpec.extProto_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(eventSpec.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!eventSpec.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(eventSpec.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = eventSpec.extProto_;
                            this.bitField0_ &= -17;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) eventSpec).unknownFields);
                    onChanged();
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.type_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    this.api_ = list;
                    p0 p0Var = o0.f19269e;
                    this.jstrk_ = p0Var;
                    this.pxtrk_ = p0Var;
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
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec$Builder");
                }
            }

            public static EventSpec getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.U;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EventSpec) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EventSpec)) {
                    return super.equals(obj);
                }
                EventSpec eventSpec = (EventSpec) obj;
                if (this.type_ == eventSpec.type_ && this.method_.equals(eventSpec.method_) && this.api_.equals(eventSpec.api_) && getJstrkList().equals(eventSpec.getJstrkList()) && getWjs() == eventSpec.getWjs() && getPxtrkList().equals(eventSpec.getPxtrkList()) && getWpx() == eventSpec.getWpx() && hasExt() == eventSpec.hasExt()) {
                    return (!hasExt() || getExt().equals(eventSpec.getExt())) && getExtProtoList().equals(eventSpec.getExtProtoList()) && this.unknownFields.equals(eventSpec.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<ApiFramework> getApiList() {
                return new j0.h(this.api_, api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Integer> getApiValueList() {
                return this.api_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public String getJstrk(int i10) {
                return (String) this.jstrk_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ByteString getJstrkBytes(int i10) {
                return this.jstrk_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getJstrkCount() {
                return this.jstrk_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public EventTrackingMethod getMethod(int i10) {
                return (EventTrackingMethod) method_converter_.convert(this.method_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getMethodCount() {
                return this.method_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<EventTrackingMethod> getMethodList() {
                return new j0.h(this.method_, method_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getMethodValue(int i10) {
                return this.method_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Integer> getMethodValueList() {
                return this.method_;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public String getPxtrk(int i10) {
                return (String) this.pxtrk_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ByteString getPxtrkBytes(int i10) {
                return this.pxtrk_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getPxtrkCount() {
                return this.pxtrk_.size();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iL = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? n.l(1, this.type_) : 0;
                int iM = 0;
                for (int i11 = 0; i11 < this.method_.size(); i11++) {
                    iM += n.m(this.method_.get(i11).intValue());
                }
                int iZ = iL + iM;
                if (!getMethodList().isEmpty()) {
                    iZ = iZ + 1 + n.Z(iM);
                }
                this.methodMemoizedSerializedSize = iM;
                int iM2 = 0;
                for (int i12 = 0; i12 < this.api_.size(); i12++) {
                    iM2 += n.m(this.api_.get(i12).intValue());
                }
                int iZ2 = iZ + iM2;
                if (!getApiList().isEmpty()) {
                    iZ2 = iZ2 + 1 + n.Z(iM2);
                }
                this.apiMemoizedSerializedSize = iM2;
                int iComputeStringSizeNoTag = 0;
                for (int i13 = 0; i13 < this.jstrk_.size(); i13++) {
                    iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.jstrk_.getRaw(i13));
                }
                int size = iZ2 + iComputeStringSizeNoTag + getJstrkList().size();
                boolean z10 = this.wjs_;
                if (z10) {
                    size += n.e(5, z10);
                }
                int iComputeStringSizeNoTag2 = 0;
                for (int i14 = 0; i14 < this.pxtrk_.size(); i14++) {
                    iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.pxtrk_.getRaw(i14));
                }
                int size2 = size + iComputeStringSizeNoTag2 + getPxtrkList().size();
                boolean z11 = this.wpx_;
                if (z11) {
                    size2 += n.e(7, z11);
                }
                for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                    size2 += n.G(8, this.extProto_.get(i15));
                }
                if (this.ext_ != null) {
                    size2 += n.G(9, getExt());
                }
                int serializedSize = size2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public EventType getType() {
                EventType eventTypeValueOf = EventType.valueOf(this.type_);
                return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean getWjs() {
                return this.wjs_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean getWpx() {
                return this.wpx_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_;
                if (getMethodCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + this.method_.hashCode();
                }
                if (getApiCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + this.api_.hashCode();
                }
                if (getJstrkCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getJstrkList().hashCode();
                }
                int iD = (((iHashCode * 37) + 5) * 53) + j0.d(getWjs());
                if (getPxtrkCount() > 0) {
                    iD = (((iD * 37) + 6) * 53) + getPxtrkList().hashCode();
                }
                int iD2 = (((iD * 37) + 7) * 53) + j0.d(getWpx());
                if (hasExt()) {
                    iD2 = (((iD2 * 37) + 9) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iD2 = (((iD2 * 37) + 8) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = (iD2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return b.V.d(EventSpec.class, Builder.class);
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
                return new EventSpec();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                getSerializedSize();
                if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                    nVar.v0(1, this.type_);
                }
                if (getMethodList().size() > 0) {
                    nVar.X0(18);
                    nVar.X0(this.methodMemoizedSerializedSize);
                }
                for (int i10 = 0; i10 < this.method_.size(); i10++) {
                    nVar.w0(this.method_.get(i10).intValue());
                }
                if (getApiList().size() > 0) {
                    nVar.X0(26);
                    nVar.X0(this.apiMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.api_.size(); i11++) {
                    nVar.w0(this.api_.get(i11).intValue());
                }
                for (int i12 = 0; i12 < this.jstrk_.size(); i12++) {
                    h0.writeString(nVar, 4, this.jstrk_.getRaw(i12));
                }
                boolean z10 = this.wjs_;
                if (z10) {
                    nVar.n0(5, z10);
                }
                for (int i13 = 0; i13 < this.pxtrk_.size(); i13++) {
                    h0.writeString(nVar, 6, this.pxtrk_.getRaw(i13));
                }
                boolean z11 = this.wpx_;
                if (z11) {
                    nVar.n0(7, z11);
                }
                for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                    nVar.J0(8, this.extProto_.get(i14));
                }
                if (this.ext_ != null) {
                    nVar.J0(9, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static Builder newBuilder(EventSpec eventSpec) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventSpec);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteBuffer, wVar);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public t1 getJstrkList() {
                return this.jstrk_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public t1 getPxtrkList() {
                return this.pxtrk_;
            }

            private EventSpec(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (EventSpec) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static EventSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public EventSpec getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static EventSpec parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private EventSpec() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = 0;
                List list = Collections.EMPTY_LIST;
                this.method_ = list;
                this.api_ = list;
                p0 p0Var = o0.f19269e;
                this.jstrk_ = p0Var;
                this.pxtrk_ = p0Var;
                this.extProto_ = list;
            }

            public static EventSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static EventSpec parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(bArr, wVar);
            }

            public static EventSpec parseFrom(InputStream inputStream) throws IOException {
                return (EventSpec) h0.parseWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (EventSpec) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static EventSpec parseFrom(l lVar) throws IOException {
                return (EventSpec) h0.parseWithIOException(PARSER, lVar);
            }

            private EventSpec(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                case 8:
                                    this.type_ = lVar.t();
                                    break;
                                case 16:
                                    int iT = lVar.t();
                                    if ((i10 & 1) == 0) {
                                        this.method_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.method_.add(Integer.valueOf(iT));
                                    break;
                                case 18:
                                    int iP = lVar.p(lVar.C());
                                    while (lVar.d() > 0) {
                                        int iT2 = lVar.t();
                                        if ((i10 & 1) == 0) {
                                            this.method_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.method_.add(Integer.valueOf(iT2));
                                    }
                                    lVar.o(iP);
                                    break;
                                case 24:
                                    int iT3 = lVar.t();
                                    if ((i10 & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(iT3));
                                    break;
                                case 26:
                                    int iP2 = lVar.p(lVar.C());
                                    while (lVar.d() > 0) {
                                        int iT4 = lVar.t();
                                        if ((i10 & 2) == 0) {
                                            this.api_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.api_.add(Integer.valueOf(iT4));
                                    }
                                    lVar.o(iP2);
                                    break;
                                case 34:
                                    String strJ = lVar.J();
                                    if ((i10 & 4) == 0) {
                                        this.jstrk_ = new o0();
                                        i10 |= 4;
                                    }
                                    this.jstrk_.add(strJ);
                                    break;
                                case 40:
                                    this.wjs_ = lVar.q();
                                    break;
                                case 50:
                                    String strJ2 = lVar.J();
                                    if ((i10 & 8) == 0) {
                                        this.pxtrk_ = new o0();
                                        i10 |= 8;
                                    }
                                    this.pxtrk_.add(strJ2);
                                    break;
                                case 56:
                                    this.wpx_ = lVar.q();
                                    break;
                                case 66:
                                    if ((i10 & 16) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                    break;
                                case 74:
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
                        if ((i10 & 1) != 0) {
                            this.method_ = DesugarCollections.unmodifiableList(this.method_);
                        }
                        if ((i10 & 2) != 0) {
                            this.api_ = DesugarCollections.unmodifiableList(this.api_);
                        }
                        if ((i10 & 4) != 0) {
                            this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        }
                        if ((i10 & 8) != 0) {
                            this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
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
                    this.method_ = DesugarCollections.unmodifiableList(this.method_);
                }
                if ((i10 & 2) != 0) {
                    this.api_ = DesugarCollections.unmodifiableList(this.api_);
                }
                if ((i10 & 4) != 0) {
                    this.jstrk_ = this.jstrk_.getUnmodifiableView();
                }
                if ((i10 & 8) != 0) {
                    this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                }
                if ((i10 & 16) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static EventSpec parseFrom(l lVar, w wVar) throws IOException {
                return (EventSpec) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface EventSpecOrBuilder extends MessageOrBuilder {
            ApiFramework getApi(int i10);

            int getApiCount();

            List<ApiFramework> getApiList();

            int getApiValue(int i10);

            List<Integer> getApiValueList();

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

            String getJstrk(int i10);

            ByteString getJstrkBytes(int i10);

            int getJstrkCount();

            List<String> getJstrkList();

            EventTrackingMethod getMethod(int i10);

            int getMethodCount();

            List<EventTrackingMethod> getMethodList();

            int getMethodValue(int i10);

            List<Integer> getMethodValueList();

            String getPxtrk(int i10);

            ByteString getPxtrkBytes(int i10);

            int getPxtrkCount();

            List<String> getPxtrkList();

            EventType getType();

            int getTypeValue();

            boolean getWjs();

            boolean getWpx();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class NativeFormat extends h0 implements NativeFormatOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 1;
            public static final int EXT_FIELD_NUMBER = 3;
            public static final int EXT_PROTO_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<AssetFormat> asset_;
            private List<Any> extProto_;
            private Struct ext_;
            private byte memoizedIsInitialized;
            private static final NativeFormat DEFAULT_INSTANCE = new NativeFormat();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.1
                @Override // com.explorestack.protobuf.p1
                public NativeFormat parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new NativeFormat(lVar, wVar);
                }
            };

            public static final class AssetFormat extends h0 implements AssetFormatOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                public static final int EXT_FIELD_NUMBER = 8;
                public static final int EXT_PROTO_FIELD_NUMBER = 7;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMG_FIELD_NUMBER = 4;
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                private DataAssetFormat data_;
                private List<Any> extProto_;
                private Struct ext_;
                private int id_;
                private ImageAssetFormat img_;
                private byte memoizedIsInitialized;
                private boolean req_;
                private TitleAssetFormat title_;
                private VideoPlacement video_;
                private static final AssetFormat DEFAULT_INSTANCE = new AssetFormat();
                private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.1
                    @Override // com.explorestack.protobuf.p1
                    public AssetFormat parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new AssetFormat(lVar, wVar);
                    }
                };

                public static final class DataAssetFormat extends h0 implements DataAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private static final DataAssetFormat DEFAULT_INSTANCE = new DataAssetFormat();
                    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.1
                        @Override // com.explorestack.protobuf.p1
                        public DataAssetFormat parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                            return new DataAssetFormat(lVar, wVar);
                        }
                    };

                    public static DataAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.S;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) h0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static p1 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataAssetFormat)) {
                            return super.equals(obj);
                        }
                        DataAssetFormat dataAssetFormat = (DataAssetFormat) obj;
                        if (this.type_ == dataAssetFormat.type_ && getLen() == dataAssetFormat.getLen() && hasExt() == dataAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(dataAssetFormat.getExt())) && getExtProtoList().equals(dataAssetFormat.getExtProtoList()) && this.unknownFields.equals(dataAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public e2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
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
                        int iL = this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber() ? n.l(1, this.type_) : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iL += n.Y(2, i11);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iL += n.G(3, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iL += n.G(4, getExt());
                        }
                        int serializedSize = iL + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                        return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final r2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + getLen();
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
                        return b.T.d(DataAssetFormat.class, Builder.class);
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
                        return new DataAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(n nVar) throws IOException {
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            nVar.v0(1, this.type_);
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

                    public static final class Builder extends h0.b implements DataAssetFormatOrBuilder {
                        private int bitField0_;
                        private a2 extBuilder_;
                        private v1 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.S;
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

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.S;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public e2 getExtOrBuilder() {
                            a2 a2Var = this.extBuilder_;
                            if (a2Var != null) {
                                return (e2) a2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.size() : v1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                            return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.h0.b
                        protected h0.f internalGetFieldAccessorTable() {
                            return b.T.d(DataAssetFormat.class, Builder.class);
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

                        private Builder() {
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAssetFormat build() {
                            DataAssetFormat dataAssetFormatBuildPartial = buildPartial();
                            if (dataAssetFormatBuildPartial.isInitialized()) {
                                return dataAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAssetFormat buildPartial() {
                            DataAssetFormat dataAssetFormat = new DataAssetFormat(this);
                            dataAssetFormat.type_ = this.type_;
                            dataAssetFormat.len_ = this.len_;
                            a2 a2Var = this.extBuilder_;
                            if (a2Var == null) {
                                dataAssetFormat.ext_ = this.ext_;
                            } else {
                                dataAssetFormat.ext_ = (Struct) a2Var.a();
                            }
                            v1 v1Var = this.extProtoBuilder_;
                            if (v1Var != null) {
                                dataAssetFormat.extProto_ = v1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                dataAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return dataAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public DataAssetFormat getDefaultInstanceForType() {
                            return DataAssetFormat.getDefaultInstance();
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
                            this.type_ = 0;
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
                            if (message instanceof DataAssetFormat) {
                                return mergeFrom((DataAssetFormat) message);
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

                        public Builder mergeFrom(DataAssetFormat dataAssetFormat) {
                            if (dataAssetFormat == DataAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (dataAssetFormat.type_ != 0) {
                                setTypeValue(dataAssetFormat.getTypeValue());
                            }
                            if (dataAssetFormat.getLen() != 0) {
                                setLen(dataAssetFormat.getLen());
                            }
                            if (dataAssetFormat.hasExt()) {
                                mergeExt(dataAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(dataAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((h0) dataAssetFormat).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.access$5600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat$Builder");
                        }
                    }

                    public static Builder newBuilder(DataAssetFormat dataAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAssetFormat);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteBuffer, wVar);
                    }

                    private DataAssetFormat(h0.b bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                        return (DataAssetFormat) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public DataAssetFormat getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteString, wVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private DataAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.type_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.h0
                    public Builder newBuilderForType(h0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(bArr, wVar);
                    }

                    public static DataAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) h0.parseWithIOException(PARSER, inputStream);
                    }

                    private DataAssetFormat(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        if (iK == 8) {
                                            this.type_ = lVar.t();
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

                    public static DataAssetFormat parseFrom(InputStream inputStream, w wVar) throws IOException {
                        return (DataAssetFormat) h0.parseWithIOException(PARSER, inputStream, wVar);
                    }

                    public static DataAssetFormat parseFrom(l lVar) throws IOException {
                        return (DataAssetFormat) h0.parseWithIOException(PARSER, lVar);
                    }

                    public static DataAssetFormat parseFrom(l lVar, w wVar) throws IOException {
                        return (DataAssetFormat) h0.parseWithIOException(PARSER, lVar, wVar);
                    }
                }

                public interface DataAssetFormatOrBuilder extends MessageOrBuilder {
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

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class ImageAssetFormat extends h0 implements ImageAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 10;
                    public static final int EXT_PROTO_FIELD_NUMBER = 9;
                    public static final int HMIN_FIELD_NUMBER = 6;
                    public static final int HRATIO_FIELD_NUMBER = 8;
                    public static final int H_FIELD_NUMBER = 4;
                    public static final int MIME_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 1;
                    public static final int WMIN_FIELD_NUMBER = 5;
                    public static final int WRATIO_FIELD_NUMBER = 7;
                    public static final int W_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int h_;
                    private int hmin_;
                    private int hratio_;
                    private byte memoizedIsInitialized;
                    private p0 mime_;
                    private int type_;
                    private int w_;
                    private int wmin_;
                    private int wratio_;
                    private static final ImageAssetFormat DEFAULT_INSTANCE = new ImageAssetFormat();
                    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.1
                        @Override // com.explorestack.protobuf.p1
                        public ImageAssetFormat parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                            return new ImageAssetFormat(lVar, wVar);
                        }
                    };

                    public static final class Builder extends h0.b implements ImageAssetFormatOrBuilder {
                        private int bitField0_;
                        private a2 extBuilder_;
                        private v1 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int hmin_;
                        private int hratio_;
                        private p0 mime_;
                        private int type_;
                        private int w_;
                        private int wmin_;
                        private int wratio_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 2) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 2;
                            }
                        }

                        private void ensureMimeIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.mime_ = new o0(this.mime_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.Q;
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

                        public Builder addAllMime(Iterable<String> iterable) {
                            ensureMimeIsMutable();
                            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.mime_);
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

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearHmin() {
                            this.hmin_ = 0;
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

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearWmin() {
                            this.wmin_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearWratio() {
                            this.wratio_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.Q;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public e2 getExtOrBuilder() {
                            a2 a2Var = this.extBuilder_;
                            if (a2Var != null) {
                                return (e2) a2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.size() : v1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getHmin() {
                            return this.hmin_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getHratio() {
                            return this.hratio_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public String getMime(int i10) {
                            return (String) this.mime_.get(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public ByteString getMimeBytes(int i10) {
                            return this.mime_.getByteString(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getMimeCount() {
                            return this.mime_.size();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public NativeImageAssetType getType() {
                            NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                            return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getWmin() {
                            return this.wmin_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getWratio() {
                            return this.wratio_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.h0.b
                        protected h0.f internalGetFieldAccessorTable() {
                            return b.R.d(ImageAssetFormat.class, Builder.class);
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

                        public Builder setHmin(int i10) {
                            this.hmin_ = i10;
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

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setWmin(int i10) {
                            this.wmin_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setWratio(int i10) {
                            this.wratio_ = i10;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public t1 getMimeList() {
                            return this.mime_.getUnmodifiableView();
                        }

                        private Builder() {
                            this.type_ = 0;
                            this.mime_ = o0.f19269e;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAssetFormat build() {
                            ImageAssetFormat imageAssetFormatBuildPartial = buildPartial();
                            if (imageAssetFormatBuildPartial.isInitialized()) {
                                return imageAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) imageAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAssetFormat buildPartial() {
                            ImageAssetFormat imageAssetFormat = new ImageAssetFormat(this);
                            imageAssetFormat.type_ = this.type_;
                            if ((this.bitField0_ & 1) != 0) {
                                this.mime_ = this.mime_.getUnmodifiableView();
                                this.bitField0_ &= -2;
                            }
                            imageAssetFormat.mime_ = this.mime_;
                            imageAssetFormat.w_ = this.w_;
                            imageAssetFormat.h_ = this.h_;
                            imageAssetFormat.wmin_ = this.wmin_;
                            imageAssetFormat.hmin_ = this.hmin_;
                            imageAssetFormat.wratio_ = this.wratio_;
                            imageAssetFormat.hratio_ = this.hratio_;
                            a2 a2Var = this.extBuilder_;
                            if (a2Var == null) {
                                imageAssetFormat.ext_ = this.ext_;
                            } else {
                                imageAssetFormat.ext_ = (Struct) a2Var.a();
                            }
                            v1 v1Var = this.extProtoBuilder_;
                            if (v1Var != null) {
                                imageAssetFormat.extProto_ = v1Var.f();
                            } else {
                                if ((this.bitField0_ & 2) != 0) {
                                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -3;
                                }
                                imageAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return imageAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public ImageAssetFormat getDefaultInstanceForType() {
                            return ImageAssetFormat.getDefaultInstance();
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
                            this.mime_ = o0.f19269e;
                            int i10 = this.bitField0_;
                            this.bitField0_ = i10 & (-2);
                            this.w_ = 0;
                            this.h_ = 0;
                            this.wmin_ = 0;
                            this.hmin_ = 0;
                            this.wratio_ = 0;
                            this.hratio_ = 0;
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
                            if (message instanceof ImageAssetFormat) {
                                return mergeFrom((ImageAssetFormat) message);
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
                            this.mime_ = o0.f19269e;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(ImageAssetFormat imageAssetFormat) {
                            if (imageAssetFormat == ImageAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (imageAssetFormat.type_ != 0) {
                                setTypeValue(imageAssetFormat.getTypeValue());
                            }
                            if (!imageAssetFormat.mime_.isEmpty()) {
                                if (this.mime_.isEmpty()) {
                                    this.mime_ = imageAssetFormat.mime_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureMimeIsMutable();
                                    this.mime_.addAll(imageAssetFormat.mime_);
                                }
                                onChanged();
                            }
                            if (imageAssetFormat.getW() != 0) {
                                setW(imageAssetFormat.getW());
                            }
                            if (imageAssetFormat.getH() != 0) {
                                setH(imageAssetFormat.getH());
                            }
                            if (imageAssetFormat.getWmin() != 0) {
                                setWmin(imageAssetFormat.getWmin());
                            }
                            if (imageAssetFormat.getHmin() != 0) {
                                setHmin(imageAssetFormat.getHmin());
                            }
                            if (imageAssetFormat.getWratio() != 0) {
                                setWratio(imageAssetFormat.getWratio());
                            }
                            if (imageAssetFormat.getHratio() != 0) {
                                setHratio(imageAssetFormat.getHratio());
                            }
                            if (imageAssetFormat.hasExt()) {
                                mergeExt(imageAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAssetFormat.extProto_;
                                        this.bitField0_ &= -3;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(imageAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAssetFormat.extProto_;
                                    this.bitField0_ &= -3;
                                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((h0) imageAssetFormat).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.access$4300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat$Builder");
                        }
                    }

                    public static ImageAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.Q;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) h0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static p1 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAssetFormat)) {
                            return super.equals(obj);
                        }
                        ImageAssetFormat imageAssetFormat = (ImageAssetFormat) obj;
                        if (this.type_ == imageAssetFormat.type_ && getMimeList().equals(imageAssetFormat.getMimeList()) && getW() == imageAssetFormat.getW() && getH() == imageAssetFormat.getH() && getWmin() == imageAssetFormat.getWmin() && getHmin() == imageAssetFormat.getHmin() && getWratio() == imageAssetFormat.getWratio() && getHratio() == imageAssetFormat.getHratio() && hasExt() == imageAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(imageAssetFormat.getExt())) && getExtProtoList().equals(imageAssetFormat.getExtProtoList()) && this.unknownFields.equals(imageAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public e2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getH() {
                        return this.h_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getHmin() {
                        return this.hmin_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getHratio() {
                        return this.hratio_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public String getMime(int i10) {
                        return (String) this.mime_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public ByteString getMimeBytes(int i10) {
                        return this.mime_.getByteString(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
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
                        int iL = this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber() ? n.l(1, this.type_) : 0;
                        int iComputeStringSizeNoTag = 0;
                        for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.mime_.getRaw(i11));
                        }
                        int size = iL + iComputeStringSizeNoTag + getMimeList().size();
                        int i12 = this.w_;
                        if (i12 != 0) {
                            size += n.Y(3, i12);
                        }
                        int i13 = this.h_;
                        if (i13 != 0) {
                            size += n.Y(4, i13);
                        }
                        int i14 = this.wmin_;
                        if (i14 != 0) {
                            size += n.Y(5, i14);
                        }
                        int i15 = this.hmin_;
                        if (i15 != 0) {
                            size += n.Y(6, i15);
                        }
                        int i16 = this.wratio_;
                        if (i16 != 0) {
                            size += n.Y(7, i16);
                        }
                        int i17 = this.hratio_;
                        if (i17 != 0) {
                            size += n.Y(8, i17);
                        }
                        for (int i18 = 0; i18 < this.extProto_.size(); i18++) {
                            size += n.G(9, this.extProto_.get(i18));
                        }
                        if (this.ext_ != null) {
                            size += n.G(10, getExt());
                        }
                        int serializedSize = size + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public NativeImageAssetType getType() {
                        NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                        return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final r2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getWmin() {
                        return this.wmin_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getWratio() {
                        return this.wratio_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_;
                        if (getMimeCount() > 0) {
                            iHashCode = (((iHashCode * 37) + 2) * 53) + getMimeList().hashCode();
                        }
                        int w10 = (((((((((((((((((((((((iHashCode * 37) + 3) * 53) + getW()) * 37) + 4) * 53) + getH()) * 37) + 5) * 53) + getWmin()) * 37) + 6) * 53) + getHmin()) * 37) + 7) * 53) + getWratio()) * 37) + 8) * 53) + getHratio();
                        if (hasExt()) {
                            w10 = (((w10 * 37) + 10) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            w10 = (((w10 * 37) + 9) * 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = (w10 * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.h0
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.R.d(ImageAssetFormat.class, Builder.class);
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
                        return new ImageAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(n nVar) throws IOException {
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            nVar.v0(1, this.type_);
                        }
                        for (int i10 = 0; i10 < this.mime_.size(); i10++) {
                            h0.writeString(nVar, 2, this.mime_.getRaw(i10));
                        }
                        int i11 = this.w_;
                        if (i11 != 0) {
                            nVar.W0(3, i11);
                        }
                        int i12 = this.h_;
                        if (i12 != 0) {
                            nVar.W0(4, i12);
                        }
                        int i13 = this.wmin_;
                        if (i13 != 0) {
                            nVar.W0(5, i13);
                        }
                        int i14 = this.hmin_;
                        if (i14 != 0) {
                            nVar.W0(6, i14);
                        }
                        int i15 = this.wratio_;
                        if (i15 != 0) {
                            nVar.W0(7, i15);
                        }
                        int i16 = this.hratio_;
                        if (i16 != 0) {
                            nVar.W0(8, i16);
                        }
                        for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
                            nVar.J0(9, this.extProto_.get(i17));
                        }
                        if (this.ext_ != null) {
                            nVar.J0(10, getExt());
                        }
                        this.unknownFields.writeTo(nVar);
                    }

                    public static Builder newBuilder(ImageAssetFormat imageAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAssetFormat);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteBuffer, wVar);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public t1 getMimeList() {
                        return this.mime_;
                    }

                    private ImageAssetFormat(h0.b bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                        return (ImageAssetFormat) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public ImageAssetFormat getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteString, wVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private ImageAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.type_ = 0;
                        this.mime_ = o0.f19269e;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.h0
                    public Builder newBuilderForType(h0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(bArr, wVar);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) h0.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream, w wVar) throws IOException {
                        return (ImageAssetFormat) h0.parseWithIOException(PARSER, inputStream, wVar);
                    }

                    private ImageAssetFormat(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        case 8:
                                            this.type_ = lVar.t();
                                            break;
                                        case 18:
                                            String strJ = lVar.J();
                                            if ((i10 & 1) == 0) {
                                                this.mime_ = new o0();
                                                i10 |= 1;
                                            }
                                            this.mime_.add(strJ);
                                            break;
                                        case 24:
                                            this.w_ = lVar.L();
                                            break;
                                        case 32:
                                            this.h_ = lVar.L();
                                            break;
                                        case 40:
                                            this.wmin_ = lVar.L();
                                            break;
                                        case 48:
                                            this.hmin_ = lVar.L();
                                            break;
                                        case 56:
                                            this.wratio_ = lVar.L();
                                            break;
                                        case 64:
                                            this.hratio_ = lVar.L();
                                            break;
                                        case 74:
                                            if ((i10 & 2) == 0) {
                                                this.extProto_ = new ArrayList();
                                                i10 |= 2;
                                            }
                                            this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                            break;
                                        case 82:
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
                                if ((i10 & 1) != 0) {
                                    this.mime_ = this.mime_.getUnmodifiableView();
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
                            this.mime_ = this.mime_.getUnmodifiableView();
                        }
                        if ((i10 & 2) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                    }

                    public static ImageAssetFormat parseFrom(l lVar) throws IOException {
                        return (ImageAssetFormat) h0.parseWithIOException(PARSER, lVar);
                    }

                    public static ImageAssetFormat parseFrom(l lVar, w wVar) throws IOException {
                        return (ImageAssetFormat) h0.parseWithIOException(PARSER, lVar, wVar);
                    }
                }

                public interface ImageAssetFormatOrBuilder extends MessageOrBuilder {
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

                    int getHmin();

                    int getHratio();

                    String getMime(int i10);

                    ByteString getMimeBytes(int i10);

                    int getMimeCount();

                    List<String> getMimeList();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    int getW();

                    int getWmin();

                    int getWratio();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class TitleAssetFormat extends h0 implements TitleAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 3;
                    public static final int EXT_PROTO_FIELD_NUMBER = 2;
                    public static final int LEN_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private static final TitleAssetFormat DEFAULT_INSTANCE = new TitleAssetFormat();
                    private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.1
                        @Override // com.explorestack.protobuf.p1
                        public TitleAssetFormat parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                            return new TitleAssetFormat(lVar, wVar);
                        }
                    };

                    public static TitleAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.O;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) h0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static p1 parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAssetFormat)) {
                            return super.equals(obj);
                        }
                        TitleAssetFormat titleAssetFormat = (TitleAssetFormat) obj;
                        if (getLen() == titleAssetFormat.getLen() && hasExt() == titleAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(titleAssetFormat.getExt())) && getExtProtoList().equals(titleAssetFormat.getExtProtoList()) && this.unknownFields.equals(titleAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public e2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
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
                        int i11 = this.len_;
                        int iY = i11 != 0 ? n.Y(1, i11) : 0;
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iY += n.G(2, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iY += n.G(3, getExt());
                        }
                        int serializedSize = iY + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    public final r2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getLen();
                        if (hasExt()) {
                            iHashCode = (((iHashCode * 37) + 3) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            iHashCode = (((iHashCode * 37) + 2) * 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.h0
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.P.d(TitleAssetFormat.class, Builder.class);
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
                        return new TitleAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(n nVar) throws IOException {
                        int i10 = this.len_;
                        if (i10 != 0) {
                            nVar.W0(1, i10);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            nVar.J0(2, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            nVar.J0(3, getExt());
                        }
                        this.unknownFields.writeTo(nVar);
                    }

                    public static final class Builder extends h0.b implements TitleAssetFormatOrBuilder {
                        private int bitField0_;
                        private a2 extBuilder_;
                        private v1 extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.O;
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

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.O;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public e2 getExtOrBuilder() {
                            a2 a2Var = this.extBuilder_;
                            if (a2Var != null) {
                                return (e2) a2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.size() : v1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            v1 v1Var = this.extProtoBuilder_;
                            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.h0.b
                        protected h0.f internalGetFieldAccessorTable() {
                            return b.P.d(TitleAssetFormat.class, Builder.class);
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

                        private Builder() {
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAssetFormat build() {
                            TitleAssetFormat titleAssetFormatBuildPartial = buildPartial();
                            if (titleAssetFormatBuildPartial.isInitialized()) {
                                return titleAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAssetFormat buildPartial() {
                            TitleAssetFormat titleAssetFormat = new TitleAssetFormat(this);
                            titleAssetFormat.len_ = this.len_;
                            a2 a2Var = this.extBuilder_;
                            if (a2Var == null) {
                                titleAssetFormat.ext_ = this.ext_;
                            } else {
                                titleAssetFormat.ext_ = (Struct) a2Var.a();
                            }
                            v1 v1Var = this.extProtoBuilder_;
                            if (v1Var != null) {
                                titleAssetFormat.extProto_ = v1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                titleAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return titleAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public TitleAssetFormat getDefaultInstanceForType() {
                            return TitleAssetFormat.getDefaultInstance();
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

                        private Builder(h0.c cVar) {
                            super(cVar);
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
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
                            if (message instanceof TitleAssetFormat) {
                                return mergeFrom((TitleAssetFormat) message);
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

                        public Builder mergeFrom(TitleAssetFormat titleAssetFormat) {
                            if (titleAssetFormat == TitleAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (titleAssetFormat.getLen() != 0) {
                                setLen(titleAssetFormat.getLen());
                            }
                            if (titleAssetFormat.hasExt()) {
                                mergeExt(titleAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(titleAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((h0) titleAssetFormat).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.access$2500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat$Builder");
                        }
                    }

                    public static Builder newBuilder(TitleAssetFormat titleAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAssetFormat);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteBuffer, wVar);
                    }

                    private TitleAssetFormat(h0.b bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                        return (TitleAssetFormat) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public TitleAssetFormat getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteString, wVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private TitleAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.h0
                    public Builder newBuilderForType(h0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(bArr, wVar);
                    }

                    public static TitleAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) h0.parseWithIOException(PARSER, inputStream);
                    }

                    private TitleAssetFormat(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                            if (iK == 8) {
                                                this.len_ = lVar.L();
                                            } else if (iK == 18) {
                                                if (!z11) {
                                                    this.extProto_ = new ArrayList();
                                                    z11 = true;
                                                }
                                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                            } else if (iK != 26) {
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

                    public static TitleAssetFormat parseFrom(InputStream inputStream, w wVar) throws IOException {
                        return (TitleAssetFormat) h0.parseWithIOException(PARSER, inputStream, wVar);
                    }

                    public static TitleAssetFormat parseFrom(l lVar) throws IOException {
                        return (TitleAssetFormat) h0.parseWithIOException(PARSER, lVar);
                    }

                    public static TitleAssetFormat parseFrom(l lVar, w wVar) throws IOException {
                        return (TitleAssetFormat) h0.parseWithIOException(PARSER, lVar, wVar);
                    }
                }

                public interface TitleAssetFormatOrBuilder extends MessageOrBuilder {
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

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static AssetFormat getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.M;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) h0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteBuffer);
                }

                public static p1 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AssetFormat)) {
                        return super.equals(obj);
                    }
                    AssetFormat assetFormat = (AssetFormat) obj;
                    if (getId() != assetFormat.getId() || getReq() != assetFormat.getReq() || hasTitle() != assetFormat.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(assetFormat.getTitle())) || hasImg() != assetFormat.hasImg()) {
                        return false;
                    }
                    if ((hasImg() && !getImg().equals(assetFormat.getImg())) || hasVideo() != assetFormat.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(assetFormat.getVideo())) || hasData() != assetFormat.hasData()) {
                        return false;
                    }
                    if ((!hasData() || getData().equals(assetFormat.getData())) && hasExt() == assetFormat.hasExt()) {
                        return (!hasExt() || getExt().equals(assetFormat.getExt())) && getExtProtoList().equals(assetFormat.getExtProtoList()) && this.unknownFields.equals(assetFormat.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public DataAssetFormat getData() {
                    DataAssetFormat dataAssetFormat = this.data_;
                    return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public DataAssetFormatOrBuilder getDataOrBuilder() {
                    return getData();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public e2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public ImageAssetFormat getImg() {
                    ImageAssetFormat imageAssetFormat = this.img_;
                    return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public ImageAssetFormatOrBuilder getImgOrBuilder() {
                    return getImg();
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public p1 getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
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
                    if (this.img_ != null) {
                        iY += n.G(4, getImg());
                    }
                    if (this.video_ != null) {
                        iY += n.G(5, getVideo());
                    }
                    if (this.data_ != null) {
                        iY += n.G(6, getData());
                    }
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        iY += n.G(7, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        iY += n.G(8, getExt());
                    }
                    int serializedSize = iY + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public TitleAssetFormat getTitle() {
                    TitleAssetFormat titleAssetFormat = this.title_;
                    return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final r2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public VideoPlacement getVideo() {
                    VideoPlacement videoPlacement = this.video_;
                    return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public VideoPlacementOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasData() {
                    return this.data_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasImg() {
                    return this.img_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasTitle() {
                    return this.title_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
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
                    if (hasImg()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + getImg().hashCode();
                    }
                    if (hasVideo()) {
                        iHashCode = (((iHashCode * 37) + 5) * 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        iHashCode = (((iHashCode * 37) + 6) * 53) + getData().hashCode();
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
                    return b.N.d(AssetFormat.class, Builder.class);
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
                    return new AssetFormat();
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
                    if (this.img_ != null) {
                        nVar.J0(4, getImg());
                    }
                    if (this.video_ != null) {
                        nVar.J0(5, getVideo());
                    }
                    if (this.data_ != null) {
                        nVar.J0(6, getData());
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        nVar.J0(7, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        nVar.J0(8, getExt());
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static final class Builder extends h0.b implements AssetFormatOrBuilder {
                    private int bitField0_;
                    private a2 dataBuilder_;
                    private DataAssetFormat data_;
                    private a2 extBuilder_;
                    private v1 extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private a2 imgBuilder_;
                    private ImageAssetFormat img_;
                    private boolean req_;
                    private a2 titleBuilder_;
                    private TitleAssetFormat title_;
                    private a2 videoBuilder_;
                    private VideoPlacement video_;

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
                        return b.M;
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

                    private a2 getImgFieldBuilder() {
                        if (this.imgBuilder_ == null) {
                            this.imgBuilder_ = new a2(getImg(), getParentForChildren(), isClean());
                            this.img_ = null;
                        }
                        return this.imgBuilder_;
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

                    public Builder clearImg() {
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                            onChanged();
                            return this;
                        }
                        this.img_ = null;
                        this.imgBuilder_ = null;
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

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public DataAssetFormat getData() {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var != null) {
                            return (DataAssetFormat) a2Var.e();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    public DataAssetFormat.Builder getDataBuilder() {
                        onChanged();
                        return (DataAssetFormat.Builder) getDataFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public DataAssetFormatOrBuilder getDataOrBuilder() {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var != null) {
                            return (DataAssetFormatOrBuilder) a2Var.f();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.M;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public e2 getExtOrBuilder() {
                        a2 a2Var = this.extBuilder_;
                        if (a2Var != null) {
                            return (e2) a2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public int getExtProtoCount() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.size() : v1Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        v1 v1Var = this.extProtoBuilder_;
                        return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public ImageAssetFormat getImg() {
                        a2 a2Var = this.imgBuilder_;
                        if (a2Var != null) {
                            return (ImageAssetFormat) a2Var.e();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    public ImageAssetFormat.Builder getImgBuilder() {
                        onChanged();
                        return (ImageAssetFormat.Builder) getImgFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public ImageAssetFormatOrBuilder getImgOrBuilder() {
                        a2 a2Var = this.imgBuilder_;
                        if (a2Var != null) {
                            return (ImageAssetFormatOrBuilder) a2Var.f();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean getReq() {
                        return this.req_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public TitleAssetFormat getTitle() {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var != null) {
                            return (TitleAssetFormat) a2Var.e();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    public TitleAssetFormat.Builder getTitleBuilder() {
                        onChanged();
                        return (TitleAssetFormat.Builder) getTitleFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var != null) {
                            return (TitleAssetFormatOrBuilder) a2Var.f();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public VideoPlacement getVideo() {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var != null) {
                            return (VideoPlacement) a2Var.e();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    public VideoPlacement.Builder getVideoBuilder() {
                        onChanged();
                        return (VideoPlacement.Builder) getVideoFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public VideoPlacementOrBuilder getVideoOrBuilder() {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var != null) {
                            return (VideoPlacementOrBuilder) a2Var.f();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasImg() {
                        return (this.imgBuilder_ == null && this.img_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasTitle() {
                        return (this.titleBuilder_ == null && this.title_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.h0.b
                    protected h0.f internalGetFieldAccessorTable() {
                        return b.N.d(AssetFormat.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeData(DataAssetFormat dataAssetFormat) {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var != null) {
                            a2Var.g(dataAssetFormat);
                            return this;
                        }
                        DataAssetFormat dataAssetFormat2 = this.data_;
                        if (dataAssetFormat2 != null) {
                            this.data_ = DataAssetFormat.newBuilder(dataAssetFormat2).mergeFrom(dataAssetFormat).buildPartial();
                        } else {
                            this.data_ = dataAssetFormat;
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

                    public Builder mergeImg(ImageAssetFormat imageAssetFormat) {
                        a2 a2Var = this.imgBuilder_;
                        if (a2Var != null) {
                            a2Var.g(imageAssetFormat);
                            return this;
                        }
                        ImageAssetFormat imageAssetFormat2 = this.img_;
                        if (imageAssetFormat2 != null) {
                            this.img_ = ImageAssetFormat.newBuilder(imageAssetFormat2).mergeFrom(imageAssetFormat).buildPartial();
                        } else {
                            this.img_ = imageAssetFormat;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeTitle(TitleAssetFormat titleAssetFormat) {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var != null) {
                            a2Var.g(titleAssetFormat);
                            return this;
                        }
                        TitleAssetFormat titleAssetFormat2 = this.title_;
                        if (titleAssetFormat2 != null) {
                            this.title_ = TitleAssetFormat.newBuilder(titleAssetFormat2).mergeFrom(titleAssetFormat).buildPartial();
                        } else {
                            this.title_ = titleAssetFormat;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeVideo(VideoPlacement videoPlacement) {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var != null) {
                            a2Var.g(videoPlacement);
                            return this;
                        }
                        VideoPlacement videoPlacement2 = this.video_;
                        if (videoPlacement2 != null) {
                            this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
                        } else {
                            this.video_ = videoPlacement;
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

                    public Builder setData(DataAssetFormat dataAssetFormat) {
                        a2 a2Var = this.dataBuilder_;
                        if (a2Var != null) {
                            a2Var.i(dataAssetFormat);
                            return this;
                        }
                        dataAssetFormat.getClass();
                        this.data_ = dataAssetFormat;
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

                    public Builder setImg(ImageAssetFormat imageAssetFormat) {
                        a2 a2Var = this.imgBuilder_;
                        if (a2Var != null) {
                            a2Var.i(imageAssetFormat);
                            return this;
                        }
                        imageAssetFormat.getClass();
                        this.img_ = imageAssetFormat;
                        onChanged();
                        return this;
                    }

                    public Builder setReq(boolean z10) {
                        this.req_ = z10;
                        onChanged();
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat titleAssetFormat) {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var != null) {
                            a2Var.i(titleAssetFormat);
                            return this;
                        }
                        titleAssetFormat.getClass();
                        this.title_ = titleAssetFormat;
                        onChanged();
                        return this;
                    }

                    public Builder setVideo(VideoPlacement videoPlacement) {
                        a2 a2Var = this.videoBuilder_;
                        if (a2Var != null) {
                            a2Var.i(videoPlacement);
                            return this;
                        }
                        videoPlacement.getClass();
                        this.video_ = videoPlacement;
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
                    public AssetFormat build() {
                        AssetFormat assetFormatBuildPartial = buildPartial();
                        if (assetFormatBuildPartial.isInitialized()) {
                            return assetFormatBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetFormatBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public AssetFormat buildPartial() {
                        AssetFormat assetFormat = new AssetFormat(this);
                        assetFormat.id_ = this.id_;
                        assetFormat.req_ = this.req_;
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var == null) {
                            assetFormat.title_ = this.title_;
                        } else {
                            assetFormat.title_ = (TitleAssetFormat) a2Var.a();
                        }
                        a2 a2Var2 = this.imgBuilder_;
                        if (a2Var2 == null) {
                            assetFormat.img_ = this.img_;
                        } else {
                            assetFormat.img_ = (ImageAssetFormat) a2Var2.a();
                        }
                        a2 a2Var3 = this.videoBuilder_;
                        if (a2Var3 == null) {
                            assetFormat.video_ = this.video_;
                        } else {
                            assetFormat.video_ = (VideoPlacement) a2Var3.a();
                        }
                        a2 a2Var4 = this.dataBuilder_;
                        if (a2Var4 == null) {
                            assetFormat.data_ = this.data_;
                        } else {
                            assetFormat.data_ = (DataAssetFormat) a2Var4.a();
                        }
                        a2 a2Var5 = this.extBuilder_;
                        if (a2Var5 == null) {
                            assetFormat.ext_ = this.ext_;
                        } else {
                            assetFormat.ext_ = (Struct) a2Var5.a();
                        }
                        v1 v1Var = this.extProtoBuilder_;
                        if (v1Var != null) {
                            assetFormat.extProto_ = v1Var.f();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            assetFormat.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return assetFormat;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public AssetFormat getDefaultInstanceForType() {
                        return AssetFormat.getDefaultInstance();
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
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                        } else {
                            this.img_ = null;
                            this.imgBuilder_ = null;
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

                    public Builder setData(DataAssetFormat.Builder builder) {
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

                    public Builder setImg(ImageAssetFormat.Builder builder) {
                        a2 a2Var = this.imgBuilder_;
                        if (a2Var == null) {
                            this.img_ = builder.build();
                            onChanged();
                            return this;
                        }
                        a2Var.i(builder.build());
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat.Builder builder) {
                        a2 a2Var = this.titleBuilder_;
                        if (a2Var == null) {
                            this.title_ = builder.build();
                            onChanged();
                            return this;
                        }
                        a2Var.i(builder.build());
                        return this;
                    }

                    public Builder setVideo(VideoPlacement.Builder builder) {
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
                        if (message instanceof AssetFormat) {
                            return mergeFrom((AssetFormat) message);
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

                    public Builder mergeFrom(AssetFormat assetFormat) {
                        if (assetFormat == AssetFormat.getDefaultInstance()) {
                            return this;
                        }
                        if (assetFormat.getId() != 0) {
                            setId(assetFormat.getId());
                        }
                        if (assetFormat.getReq()) {
                            setReq(assetFormat.getReq());
                        }
                        if (assetFormat.hasTitle()) {
                            mergeTitle(assetFormat.getTitle());
                        }
                        if (assetFormat.hasImg()) {
                            mergeImg(assetFormat.getImg());
                        }
                        if (assetFormat.hasVideo()) {
                            mergeVideo(assetFormat.getVideo());
                        }
                        if (assetFormat.hasData()) {
                            mergeData(assetFormat.getData());
                        }
                        if (assetFormat.hasExt()) {
                            mergeExt(assetFormat.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!assetFormat.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = assetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(assetFormat.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!assetFormat.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(assetFormat.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = assetFormat.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((h0) assetFormat).unknownFields);
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
                    public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.access$7200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$Builder");
                    }
                }

                public static Builder newBuilder(AssetFormat assetFormat) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetFormat);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteBuffer, wVar);
                }

                private AssetFormat(h0.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                    return (AssetFormat) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                }

                public static AssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public AssetFormat getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static AssetFormat parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteString, wVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private AssetFormat() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static AssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.h0
                public Builder newBuilderForType(h0.c cVar) {
                    return new Builder(cVar);
                }

                public static AssetFormat parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(bArr, wVar);
                }

                public static AssetFormat parseFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) h0.parseWithIOException(PARSER, inputStream);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private AssetFormat(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    if (iK == 8) {
                                        this.id_ = lVar.L();
                                    } else if (iK != 16) {
                                        if (iK == 26) {
                                            TitleAssetFormat titleAssetFormat = this.title_;
                                            TitleAssetFormat.Builder builder = titleAssetFormat != null ? titleAssetFormat.toBuilder() : null;
                                            TitleAssetFormat titleAssetFormat2 = (TitleAssetFormat) lVar.A(TitleAssetFormat.parser(), wVar);
                                            this.title_ = titleAssetFormat2;
                                            if (builder != null) {
                                                builder.mergeFrom(titleAssetFormat2);
                                                this.title_ = builder.buildPartial();
                                            }
                                        } else if (iK == 34) {
                                            ImageAssetFormat imageAssetFormat = this.img_;
                                            ImageAssetFormat.Builder builder2 = imageAssetFormat != null ? imageAssetFormat.toBuilder() : null;
                                            ImageAssetFormat imageAssetFormat2 = (ImageAssetFormat) lVar.A(ImageAssetFormat.parser(), wVar);
                                            this.img_ = imageAssetFormat2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(imageAssetFormat2);
                                                this.img_ = builder2.buildPartial();
                                            }
                                        } else if (iK == 42) {
                                            VideoPlacement videoPlacement = this.video_;
                                            VideoPlacement.Builder builder3 = videoPlacement != null ? videoPlacement.toBuilder() : null;
                                            VideoPlacement videoPlacement2 = (VideoPlacement) lVar.A(VideoPlacement.parser(), wVar);
                                            this.video_ = videoPlacement2;
                                            if (builder3 != null) {
                                                builder3.mergeFrom(videoPlacement2);
                                                this.video_ = builder3.buildPartial();
                                            }
                                        } else if (iK == 50) {
                                            DataAssetFormat dataAssetFormat = this.data_;
                                            DataAssetFormat.Builder builder4 = dataAssetFormat != null ? dataAssetFormat.toBuilder() : null;
                                            DataAssetFormat dataAssetFormat2 = (DataAssetFormat) lVar.A(DataAssetFormat.parser(), wVar);
                                            this.data_ = dataAssetFormat2;
                                            if (builder4 != null) {
                                                builder4.mergeFrom(dataAssetFormat2);
                                                this.data_ = builder4.buildPartial();
                                            }
                                        } else if (iK == 58) {
                                            if (b10 == false) {
                                                this.extProto_ = new ArrayList();
                                                b10 = true;
                                            }
                                            this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                        } else if (iK != 66) {
                                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                            }
                                        } else {
                                            Struct struct = this.ext_;
                                            Struct.Builder builder5 = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                            this.ext_ = struct2;
                                            if (builder5 != null) {
                                                builder5.mergeFrom(struct2);
                                                this.ext_ = builder5.buildPartial();
                                            }
                                        }
                                    } else {
                                        this.req_ = lVar.q();
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

                public static AssetFormat parseFrom(InputStream inputStream, w wVar) throws IOException {
                    return (AssetFormat) h0.parseWithIOException(PARSER, inputStream, wVar);
                }

                public static AssetFormat parseFrom(l lVar) throws IOException {
                    return (AssetFormat) h0.parseWithIOException(PARSER, lVar);
                }

                public static AssetFormat parseFrom(l lVar, w wVar) throws IOException {
                    return (AssetFormat) h0.parseWithIOException(PARSER, lVar, wVar);
                }
            }

            public interface AssetFormatOrBuilder extends MessageOrBuilder {
                AssetFormat.DataAssetFormat getData();

                AssetFormat.DataAssetFormatOrBuilder getDataOrBuilder();

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

                AssetFormat.ImageAssetFormat getImg();

                AssetFormat.ImageAssetFormatOrBuilder getImgOrBuilder();

                boolean getReq();

                AssetFormat.TitleAssetFormat getTitle();

                AssetFormat.TitleAssetFormatOrBuilder getTitleOrBuilder();

                VideoPlacement getVideo();

                VideoPlacementOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImg();

                boolean hasTitle();

                boolean hasVideo();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static NativeFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.K;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NativeFormat)) {
                    return super.equals(obj);
                }
                NativeFormat nativeFormat = (NativeFormat) obj;
                if (getAssetList().equals(nativeFormat.getAssetList()) && hasExt() == nativeFormat.hasExt()) {
                    return (!hasExt() || getExt().equals(nativeFormat.getExt())) && getExtProtoList().equals(nativeFormat.getExtProtoList()) && this.unknownFields.equals(nativeFormat.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public AssetFormat getAsset(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public int getAssetCount() {
                return this.asset_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<AssetFormat> getAssetList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public AssetFormatOrBuilder getAssetOrBuilder(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
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
                int iG = 0;
                for (int i11 = 0; i11 < this.asset_.size(); i11++) {
                    iG += n.G(1, this.asset_.get(i11));
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    iG += n.G(2, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    iG += n.G(3, getExt());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
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
                if (getAssetCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getAssetList().hashCode();
                }
                if (hasExt()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return b.L.d(NativeFormat.class, Builder.class);
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
                return new NativeFormat();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                for (int i10 = 0; i10 < this.asset_.size(); i10++) {
                    nVar.J0(1, this.asset_.get(i10));
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    nVar.J0(2, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    nVar.J0(3, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements NativeFormatOrBuilder {
                private v1 assetBuilder_;
                private List<AssetFormat> asset_;
                private int bitField0_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;

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
                    return b.K;
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
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllAsset(Iterable<? extends AssetFormat> iterable) {
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

                public Builder addAsset(AssetFormat assetFormat) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var != null) {
                        v1Var.e(assetFormat);
                        return this;
                    }
                    assetFormat.getClass();
                    ensureAssetIsMutable();
                    this.asset_.add(assetFormat);
                    onChanged();
                    return this;
                }

                public AssetFormat.Builder addAssetBuilder() {
                    return (AssetFormat.Builder) getAssetFieldBuilder().c(AssetFormat.getDefaultInstance());
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public AssetFormat getAsset(int i10) {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var == null ? this.asset_.get(i10) : (AssetFormat) v1Var.n(i10);
                }

                public AssetFormat.Builder getAssetBuilder(int i10) {
                    return (AssetFormat.Builder) getAssetFieldBuilder().k(i10);
                }

                public List<AssetFormat.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public int getAssetCount() {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var == null ? this.asset_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<AssetFormat> getAssetList() {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.asset_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public AssetFormatOrBuilder getAssetOrBuilder(int i10) {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var == null ? this.asset_.get(i10) : (AssetFormatOrBuilder) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                    v1 v1Var = this.assetBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.asset_);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.K;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.L.d(NativeFormat.class, Builder.class);
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

                public Builder setAsset(int i10, AssetFormat assetFormat) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, assetFormat);
                        return this;
                    }
                    assetFormat.getClass();
                    ensureAssetIsMutable();
                    this.asset_.set(i10, assetFormat);
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
                public NativeFormat build() {
                    NativeFormat nativeFormatBuildPartial = buildPartial();
                    if (nativeFormatBuildPartial.isInitialized()) {
                        return nativeFormatBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeFormatBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public NativeFormat buildPartial() {
                    NativeFormat nativeFormat = new NativeFormat(this);
                    int i10 = this.bitField0_;
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var == null) {
                        if ((i10 & 1) != 0) {
                            this.asset_ = DesugarCollections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        nativeFormat.asset_ = this.asset_;
                    } else {
                        nativeFormat.asset_ = v1Var.f();
                    }
                    a2 a2Var = this.extBuilder_;
                    if (a2Var == null) {
                        nativeFormat.ext_ = this.ext_;
                    } else {
                        nativeFormat.ext_ = (Struct) a2Var.a();
                    }
                    v1 v1Var2 = this.extProtoBuilder_;
                    if (v1Var2 != null) {
                        nativeFormat.extProto_ = v1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        nativeFormat.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return nativeFormat;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public NativeFormat getDefaultInstanceForType() {
                    return NativeFormat.getDefaultInstance();
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

                public AssetFormat.Builder addAssetBuilder(int i10) {
                    return (AssetFormat.Builder) getAssetFieldBuilder().b(i10, AssetFormat.getDefaultInstance());
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

                private Builder(h0.c cVar) {
                    super(cVar);
                    List list = Collections.EMPTY_LIST;
                    this.asset_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addAsset(int i10, AssetFormat assetFormat) {
                    v1 v1Var = this.assetBuilder_;
                    if (v1Var == null) {
                        assetFormat.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(i10, assetFormat);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, assetFormat);
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
                    if (message instanceof NativeFormat) {
                        return mergeFrom((NativeFormat) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAsset(int i10, AssetFormat.Builder builder) {
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

                public Builder mergeFrom(NativeFormat nativeFormat) {
                    if (nativeFormat == NativeFormat.getDefaultInstance()) {
                        return this;
                    }
                    if (this.assetBuilder_ == null) {
                        if (!nativeFormat.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = nativeFormat.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(nativeFormat.asset_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.asset_.isEmpty()) {
                        if (!this.assetBuilder_.t()) {
                            this.assetBuilder_.a(nativeFormat.asset_);
                        } else {
                            this.assetBuilder_.h();
                            this.assetBuilder_ = null;
                            this.asset_ = nativeFormat.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = h0.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        }
                    }
                    if (nativeFormat.hasExt()) {
                        mergeExt(nativeFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!nativeFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = nativeFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(nativeFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(nativeFormat.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = nativeFormat.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) nativeFormat).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAsset(AssetFormat.Builder builder) {
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

                public Builder addAsset(int i10, AssetFormat.Builder builder) {
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
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.access$8400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$Builder");
                }
            }

            public static Builder newBuilder(NativeFormat nativeFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(nativeFormat);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteBuffer, wVar);
            }

            private NativeFormat(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (NativeFormat) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static NativeFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public NativeFormat getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static NativeFormat parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private NativeFormat() {
                this.memoizedIsInitialized = (byte) -1;
                List list = Collections.EMPTY_LIST;
                this.asset_ = list;
                this.extProto_ = list;
            }

            public static NativeFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static NativeFormat parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(bArr, wVar);
            }

            public static NativeFormat parseFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) h0.parseWithIOException(PARSER, inputStream);
            }

            private NativeFormat(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        if ((i10 & 1) == 0) {
                                            this.asset_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.asset_.add((AssetFormat) lVar.A(AssetFormat.parser(), wVar));
                                    } else if (iK == 18) {
                                        if ((i10 & 2) == 0) {
                                            this.extProto_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                    } else if (iK != 26) {
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
                            this.asset_ = DesugarCollections.unmodifiableList(this.asset_);
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
                    this.asset_ = DesugarCollections.unmodifiableList(this.asset_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static NativeFormat parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (NativeFormat) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static NativeFormat parseFrom(l lVar) throws IOException {
                return (NativeFormat) h0.parseWithIOException(PARSER, lVar);
            }

            public static NativeFormat parseFrom(l lVar, w wVar) throws IOException {
                return (NativeFormat) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface NativeFormatOrBuilder extends MessageOrBuilder {
            NativeFormat.AssetFormat getAsset(int i10);

            int getAssetCount();

            List<NativeFormat.AssetFormat> getAssetList();

            NativeFormat.AssetFormatOrBuilder getAssetOrBuilder(int i10);

            List<? extends NativeFormat.AssetFormatOrBuilder> getAssetOrBuilderList();

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

        public static DisplayPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.G;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayPlacement)) {
                return super.equals(obj);
            }
            DisplayPlacement displayPlacement = (DisplayPlacement) obj;
            if (this.pos_ != displayPlacement.pos_ || getInstl() != displayPlacement.getInstl() || getTopframe() != displayPlacement.getTopframe() || !getIfrbustList().equals(displayPlacement.getIfrbustList()) || this.clktype_ != displayPlacement.clktype_ || getAmpren() != displayPlacement.getAmpren() || this.ptype_ != displayPlacement.ptype_ || this.context_ != displayPlacement.context_ || !getMimeList().equals(displayPlacement.getMimeList()) || !this.api_.equals(displayPlacement.api_) || !this.ctype_.equals(displayPlacement.ctype_) || getW() != displayPlacement.getW() || getH() != displayPlacement.getH() || this.unit_ != displayPlacement.unit_ || getPriv() != displayPlacement.getPriv() || !getDisplayfmtList().equals(displayPlacement.getDisplayfmtList()) || hasNativefmt() != displayPlacement.hasNativefmt()) {
                return false;
            }
            if ((!hasNativefmt() || getNativefmt().equals(displayPlacement.getNativefmt())) && getEventList().equals(displayPlacement.getEventList()) && hasExt() == displayPlacement.hasExt()) {
                return (!hasExt() || getExt().equals(displayPlacement.getExt())) && getExtProtoList().equals(displayPlacement.getExtProtoList()) && this.unknownFields.equals(displayPlacement.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getAmpren() {
            return this.ampren_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<ApiFramework> getApiList() {
            return new j0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ClickType getClktype() {
            ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
            return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getClktypeValue() {
            return this.clktype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayContextType getContext() {
            DisplayContextType displayContextTypeValueOf = DisplayContextType.valueOf(this.context_);
            return displayContextTypeValueOf == null ? DisplayContextType.UNRECOGNIZED : displayContextTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getContextValue() {
            return this.context_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayCreativeType getCtype(int i10) {
            return (DisplayCreativeType) ctype_converter_.convert(this.ctype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getCtypeCount() {
            return this.ctype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<DisplayCreativeType> getCtypeList() {
            return new j0.h(this.ctype_, ctype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getCtypeValue(int i10) {
            return this.ctype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayFormat getDisplayfmt(int i10) {
            return this.displayfmt_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getDisplayfmtCount() {
            return this.displayfmt_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<DisplayFormat> getDisplayfmtList() {
            return this.displayfmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10) {
            return this.displayfmt_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
            return this.displayfmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public EventSpec getEvent(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getEventCount() {
            return this.event_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<EventSpec> getEventList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public EventSpecOrBuilder getEventOrBuilder(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public String getIfrbust(int i10) {
            return (String) this.ifrbust_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ByteString getIfrbustBytes(int i10) {
            return this.ifrbust_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getIfrbustCount() {
            return this.ifrbust_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getInstl() {
            return this.instl_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public String getMime(int i10) {
            return (String) this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public NativeFormat getNativefmt() {
            NativeFormat nativeFormat = this.nativefmt_;
            return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public NativeFormatOrBuilder getNativefmtOrBuilder() {
            return getNativefmt();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public PlacementPosition getPos() {
            PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
            return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getPosValue() {
            return this.pos_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getPriv() {
            return this.priv_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayPlacementType getPtype() {
            DisplayPlacementType displayPlacementTypeValueOf = DisplayPlacementType.valueOf(this.ptype_);
            return displayPlacementTypeValueOf == null ? DisplayPlacementType.UNRECOGNIZED : displayPlacementTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getPtypeValue() {
            return this.ptype_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber() ? n.l(1, this.pos_) : 0;
            boolean z10 = this.instl_;
            if (z10) {
                iL += n.e(2, z10);
            }
            boolean z11 = this.topframe_;
            if (z11) {
                iL += n.e(3, z11);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.ifrbust_.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.ifrbust_.getRaw(i11));
            }
            int size = iL + iComputeStringSizeNoTag + getIfrbustList().size();
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                size += n.l(5, this.clktype_);
            }
            int i12 = this.ampren_;
            if (i12 != 0) {
                size += n.Y(6, i12);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                size += n.l(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                size += n.l(8, this.context_);
            }
            int iComputeStringSizeNoTag2 = 0;
            for (int i13 = 0; i13 < this.mime_.size(); i13++) {
                iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.mime_.getRaw(i13));
            }
            int size2 = size + iComputeStringSizeNoTag2 + getMimeList().size();
            int iM = 0;
            for (int i14 = 0; i14 < this.api_.size(); i14++) {
                iM += n.m(this.api_.get(i14).intValue());
            }
            int iZ = size2 + iM;
            if (!getApiList().isEmpty()) {
                iZ = iZ + 1 + n.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            int iM2 = 0;
            for (int i15 = 0; i15 < this.ctype_.size(); i15++) {
                iM2 += n.m(this.ctype_.get(i15).intValue());
            }
            int iG = iZ + iM2;
            if (!getCtypeList().isEmpty()) {
                iG = iG + 1 + n.Z(iM2);
            }
            this.ctypeMemoizedSerializedSize = iM2;
            int i16 = this.w_;
            if (i16 != 0) {
                iG += n.Y(12, i16);
            }
            int i17 = this.h_;
            if (i17 != 0) {
                iG += n.Y(13, i17);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                iG += n.l(14, this.unit_);
            }
            boolean z12 = this.priv_;
            if (z12) {
                iG += n.e(15, z12);
            }
            for (int i18 = 0; i18 < this.displayfmt_.size(); i18++) {
                iG += n.G(16, this.displayfmt_.get(i18));
            }
            if (this.nativefmt_ != null) {
                iG += n.G(17, getNativefmt());
            }
            for (int i19 = 0; i19 < this.event_.size(); i19++) {
                iG += n.G(18, this.event_.get(i19));
            }
            for (int i20 = 0; i20 < this.extProto_.size(); i20++) {
                iG += n.G(19, this.extProto_.get(i20));
            }
            if (this.ext_ != null) {
                iG += n.G(20, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getTopframe() {
            return this.topframe_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public SizeUnit getUnit() {
            SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
            return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean hasNativefmt() {
            return this.nativefmt_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.pos_) * 37) + 2) * 53) + j0.d(getInstl())) * 37) + 3) * 53) + j0.d(getTopframe());
            if (getIfrbustCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getIfrbustList().hashCode();
            }
            int ampren = (((((((((((((((iHashCode * 37) + 5) * 53) + this.clktype_) * 37) + 6) * 53) + getAmpren()) * 37) + 7) * 53) + this.ptype_) * 37) + 8) * 53) + this.context_;
            if (getMimeCount() > 0) {
                ampren = (((ampren * 37) + 9) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                ampren = (((ampren * 37) + 10) * 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                ampren = (((ampren * 37) + 11) * 53) + this.ctype_.hashCode();
            }
            int w10 = (((((((((((((((ampren * 37) + 12) * 53) + getW()) * 37) + 13) * 53) + getH()) * 37) + 14) * 53) + this.unit_) * 37) + 15) * 53) + j0.d(getPriv());
            if (getDisplayfmtCount() > 0) {
                w10 = (((w10 * 37) + 16) * 53) + getDisplayfmtList().hashCode();
            }
            if (hasNativefmt()) {
                w10 = (((w10 * 37) + 17) * 53) + getNativefmt().hashCode();
            }
            if (getEventCount() > 0) {
                w10 = (((w10 * 37) + 18) * 53) + getEventList().hashCode();
            }
            if (hasExt()) {
                w10 = (((w10 * 37) + 20) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                w10 = (((w10 * 37) + 19) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (w10 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.H.d(DisplayPlacement.class, Builder.class);
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
            return new DisplayPlacement();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                nVar.v0(1, this.pos_);
            }
            boolean z10 = this.instl_;
            if (z10) {
                nVar.n0(2, z10);
            }
            boolean z11 = this.topframe_;
            if (z11) {
                nVar.n0(3, z11);
            }
            for (int i10 = 0; i10 < this.ifrbust_.size(); i10++) {
                h0.writeString(nVar, 4, this.ifrbust_.getRaw(i10));
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                nVar.v0(5, this.clktype_);
            }
            int i11 = this.ampren_;
            if (i11 != 0) {
                nVar.W0(6, i11);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                nVar.v0(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                nVar.v0(8, this.context_);
            }
            for (int i12 = 0; i12 < this.mime_.size(); i12++) {
                h0.writeString(nVar, 9, this.mime_.getRaw(i12));
            }
            if (getApiList().size() > 0) {
                nVar.X0(82);
                nVar.X0(this.apiMemoizedSerializedSize);
            }
            for (int i13 = 0; i13 < this.api_.size(); i13++) {
                nVar.w0(this.api_.get(i13).intValue());
            }
            if (getCtypeList().size() > 0) {
                nVar.X0(90);
                nVar.X0(this.ctypeMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.ctype_.size(); i14++) {
                nVar.w0(this.ctype_.get(i14).intValue());
            }
            int i15 = this.w_;
            if (i15 != 0) {
                nVar.W0(12, i15);
            }
            int i16 = this.h_;
            if (i16 != 0) {
                nVar.W0(13, i16);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                nVar.v0(14, this.unit_);
            }
            boolean z12 = this.priv_;
            if (z12) {
                nVar.n0(15, z12);
            }
            for (int i17 = 0; i17 < this.displayfmt_.size(); i17++) {
                nVar.J0(16, this.displayfmt_.get(i17));
            }
            if (this.nativefmt_ != null) {
                nVar.J0(17, getNativefmt());
            }
            for (int i18 = 0; i18 < this.event_.size(); i18++) {
                nVar.J0(18, this.event_.get(i18));
            }
            for (int i19 = 0; i19 < this.extProto_.size(); i19++) {
                nVar.J0(19, this.extProto_.get(i19));
            }
            if (this.ext_ != null) {
                nVar.J0(20, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(DisplayPlacement displayPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayPlacement);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteBuffer, wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public t1 getIfrbustList() {
            return this.ifrbust_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public t1 getMimeList() {
            return this.mime_;
        }

        private DisplayPlacement(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (DisplayPlacement) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static DisplayPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public DisplayPlacement getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DisplayPlacement parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DisplayPlacement() {
            this.memoizedIsInitialized = (byte) -1;
            this.pos_ = 0;
            p0 p0Var = o0.f19269e;
            this.ifrbust_ = p0Var;
            this.clktype_ = 0;
            this.ptype_ = 0;
            this.context_ = 0;
            this.mime_ = p0Var;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.ctype_ = list;
            this.unit_ = 0;
            this.displayfmt_ = list;
            this.event_ = list;
            this.extProto_ = list;
        }

        public static DisplayPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static DisplayPlacement parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(bArr, wVar);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) h0.parseWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (DisplayPlacement) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static DisplayPlacement parseFrom(l lVar) throws IOException {
            return (DisplayPlacement) h0.parseWithIOException(PARSER, lVar);
        }

        public static DisplayPlacement parseFrom(l lVar, w wVar) throws IOException {
            return (DisplayPlacement) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private DisplayPlacement(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            case 8:
                                this.pos_ = lVar.t();
                                break;
                            case 16:
                                this.instl_ = lVar.q();
                                break;
                            case 24:
                                this.topframe_ = lVar.q();
                                break;
                            case 34:
                                String strJ = lVar.J();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.ifrbust_ = new o0();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.ifrbust_.add(strJ);
                                break;
                            case 40:
                                this.clktype_ = lVar.t();
                                break;
                            case 48:
                                this.ampren_ = lVar.L();
                                break;
                            case 56:
                                this.ptype_ = lVar.t();
                                break;
                            case 64:
                                this.context_ = lVar.t();
                                break;
                            case 74:
                                String strJ2 = lVar.J();
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.mime_ = new o0();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.mime_.add(strJ2);
                                break;
                            case 80:
                                int iT = lVar.t();
                                int i13 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i13 == 0) {
                                    this.api_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.api_.add(Integer.valueOf(iT));
                                break;
                            case 82:
                                int iP = lVar.p(lVar.C());
                                i10 = i10;
                                while (lVar.d() > 0) {
                                    int iT2 = lVar.t();
                                    if (((i10 == true ? 1 : 0) & 4) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.api_.add(Integer.valueOf(iT2));
                                    i10 = i10;
                                }
                                lVar.o(iP);
                                break;
                            case 88:
                                int iT3 = lVar.t();
                                int i14 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i14 == 0) {
                                    this.ctype_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.ctype_.add(Integer.valueOf(iT3));
                                break;
                            case 90:
                                int iP2 = lVar.p(lVar.C());
                                i10 = i10;
                                while (lVar.d() > 0) {
                                    int iT4 = lVar.t();
                                    if (((i10 == true ? 1 : 0) & 8) == 0) {
                                        this.ctype_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8;
                                    }
                                    this.ctype_.add(Integer.valueOf(iT4));
                                    i10 = i10;
                                }
                                lVar.o(iP2);
                                break;
                            case 96:
                                this.w_ = lVar.L();
                                break;
                            case 104:
                                this.h_ = lVar.L();
                                break;
                            case 112:
                                this.unit_ = lVar.t();
                                break;
                            case 120:
                                this.priv_ = lVar.q();
                                break;
                            case 130:
                                int i15 = (i10 == true ? 1 : 0) & 16;
                                i10 = i10;
                                if (i15 == 0) {
                                    this.displayfmt_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 16;
                                }
                                this.displayfmt_.add((DisplayFormat) lVar.A(DisplayFormat.parser(), wVar));
                                break;
                            case 138:
                                NativeFormat nativeFormat = this.nativefmt_;
                                NativeFormat.Builder builder = nativeFormat != null ? nativeFormat.toBuilder() : null;
                                NativeFormat nativeFormat2 = (NativeFormat) lVar.A(NativeFormat.parser(), wVar);
                                this.nativefmt_ = nativeFormat2;
                                if (builder != null) {
                                    builder.mergeFrom(nativeFormat2);
                                    this.nativefmt_ = builder.buildPartial();
                                }
                                break;
                            case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                                int i16 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i16 == 0) {
                                    this.event_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.event_.add((EventSpec) lVar.A(EventSpec.parser(), wVar));
                                break;
                            case 154:
                                int i17 = (i10 == true ? 1 : 0) & 64;
                                i10 = i10;
                                if (i17 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 64;
                                }
                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                break;
                            case 162:
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
                        this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    }
                    if (((i10 == true ? 1 : 0) & 8) != 0) {
                        this.ctype_ = DesugarCollections.unmodifiableList(this.ctype_);
                    }
                    if (((i10 == true ? 1 : 0) & 16) != 0) {
                        this.displayfmt_ = DesugarCollections.unmodifiableList(this.displayfmt_);
                    }
                    if (((i10 == true ? 1 : 0) & 32) != 0) {
                        this.event_ = DesugarCollections.unmodifiableList(this.event_);
                    }
                    if (((i10 == true ? 1 : 0) & 64) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.api_ = DesugarCollections.unmodifiableList(this.api_);
            }
            if (((i10 == true ? 1 : 0) & 8) != 0) {
                this.ctype_ = DesugarCollections.unmodifiableList(this.ctype_);
            }
            if (((i10 == true ? 1 : 0) & 16) != 0) {
                this.displayfmt_ = DesugarCollections.unmodifiableList(this.displayfmt_);
            }
            if (((i10 == true ? 1 : 0) & 32) != 0) {
                this.event_ = DesugarCollections.unmodifiableList(this.event_);
            }
            if (((i10 == true ? 1 : 0) & 64) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface DisplayPlacementOrBuilder extends MessageOrBuilder {
        int getAmpren();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        ClickType getClktype();

        int getClktypeValue();

        DisplayContextType getContext();

        int getContextValue();

        DisplayCreativeType getCtype(int i10);

        int getCtypeCount();

        List<DisplayCreativeType> getCtypeList();

        int getCtypeValue(int i10);

        List<Integer> getCtypeValueList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        DisplayPlacement.DisplayFormat getDisplayfmt(int i10);

        int getDisplayfmtCount();

        List<DisplayPlacement.DisplayFormat> getDisplayfmtList();

        DisplayPlacement.DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10);

        List<? extends DisplayPlacement.DisplayFormatOrBuilder> getDisplayfmtOrBuilderList();

        DisplayPlacement.EventSpec getEvent(int i10);

        int getEventCount();

        List<DisplayPlacement.EventSpec> getEventList();

        DisplayPlacement.EventSpecOrBuilder getEventOrBuilder(int i10);

        List<? extends DisplayPlacement.EventSpecOrBuilder> getEventOrBuilderList();

        Struct getExt();

        e2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        int getH();

        String getIfrbust(int i10);

        ByteString getIfrbustBytes(int i10);

        int getIfrbustCount();

        List<String> getIfrbustList();

        boolean getInstl();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        DisplayPlacement.NativeFormat getNativefmt();

        DisplayPlacement.NativeFormatOrBuilder getNativefmtOrBuilder();

        PlacementPosition getPos();

        int getPosValue();

        boolean getPriv();

        DisplayPlacementType getPtype();

        int getPtypeValue();

        boolean getTopframe();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        boolean hasNativefmt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class VideoPlacement extends h0 implements VideoPlacementOrBuilder {
        public static final int API_FIELD_NUMBER = 11;
        public static final int BOXING_FIELD_NUMBER = 24;
        public static final int CLKTYPE_FIELD_NUMBER = 9;
        public static final int COMPTYPE_FIELD_NUMBER = 26;
        public static final int COMP_FIELD_NUMBER = 25;
        public static final int CTYPE_FIELD_NUMBER = 12;
        public static final int DELAY_FIELD_NUMBER = 3;
        public static final int DELIVERY_FIELD_NUMBER = 21;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int H_FIELD_NUMBER = 14;
        public static final int LINEAR_FIELD_NUMBER = 23;
        public static final int MAXBITR_FIELD_NUMBER = 20;
        public static final int MAXDUR_FIELD_NUMBER = 17;
        public static final int MAXEXT_FIELD_NUMBER = 18;
        public static final int MAXSEQ_FIELD_NUMBER = 22;
        public static final int MIME_FIELD_NUMBER = 10;
        public static final int MINBITR_FIELD_NUMBER = 19;
        public static final int MINDUR_FIELD_NUMBER = 16;
        public static final int PLAYEND_FIELD_NUMBER = 8;
        public static final int PLAYMETHOD_FIELD_NUMBER = 7;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int PTYPE_FIELD_NUMBER = 1;
        public static final int SKIPAFTER_FIELD_NUMBER = 6;
        public static final int SKIPMIN_FIELD_NUMBER = 5;
        public static final int SKIP_FIELD_NUMBER = 4;
        public static final int UNIT_FIELD_NUMBER = 15;
        public static final int W_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private boolean boxing_;
        private int clktype_;
        private List<Companion> comp_;
        private int comptypeMemoizedSerializedSize;
        private List<Integer> comptype_;
        private int ctypeMemoizedSerializedSize;
        private List<Integer> ctype_;
        private int delay_;
        private int deliveryMemoizedSerializedSize;
        private List<Integer> delivery_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private int linear_;
        private int maxbitr_;
        private int maxdur_;
        private int maxext_;
        private int maxseq_;
        private byte memoizedIsInitialized;
        private p0 mime_;
        private int minbitr_;
        private int mindur_;
        private int playend_;
        private int playmethod_;
        private int pos_;
        private int ptype_;
        private boolean skip_;
        private int skipafter_;
        private int skipmin_;
        private int unit_;
        private int w_;
        private static final j0.h.a api_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.1
            @Override // com.explorestack.protobuf.j0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final j0.h.a ctype_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.2
            @Override // com.explorestack.protobuf.j0.h.a
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType videoCreativeTypeValueOf = VideoCreativeType.valueOf(num.intValue());
                return videoCreativeTypeValueOf == null ? VideoCreativeType.UNRECOGNIZED : videoCreativeTypeValueOf;
            }
        };
        private static final j0.h.a delivery_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.3
            @Override // com.explorestack.protobuf.j0.h.a
            public DeliveryMethod convert(Integer num) {
                DeliveryMethod deliveryMethodValueOf = DeliveryMethod.valueOf(num.intValue());
                return deliveryMethodValueOf == null ? DeliveryMethod.UNRECOGNIZED : deliveryMethodValueOf;
            }
        };
        private static final j0.h.a comptype_converter_ = new j0.h.a() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.4
            @Override // com.explorestack.protobuf.j0.h.a
            public CompanionType convert(Integer num) {
                CompanionType companionTypeValueOf = CompanionType.valueOf(num.intValue());
                return companionTypeValueOf == null ? CompanionType.UNRECOGNIZED : companionTypeValueOf;
            }
        };
        private static final VideoPlacement DEFAULT_INSTANCE = new VideoPlacement();
        private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.5
            @Override // com.explorestack.protobuf.p1
            public VideoPlacement parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new VideoPlacement(lVar, wVar);
            }
        };

        public static final class Builder extends h0.b implements VideoPlacementOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private boolean boxing_;
            private int clktype_;
            private v1 compBuilder_;
            private List<Companion> comp_;
            private List<Integer> comptype_;
            private List<Integer> ctype_;
            private int delay_;
            private List<Integer> delivery_;
            private a2 extBuilder_;
            private v1 extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int linear_;
            private int maxbitr_;
            private int maxdur_;
            private int maxext_;
            private int maxseq_;
            private p0 mime_;
            private int minbitr_;
            private int mindur_;
            private int playend_;
            private int playmethod_;
            private int pos_;
            private int ptype_;
            private boolean skip_;
            private int skipafter_;
            private int skipmin_;
            private int unit_;
            private int w_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureCompIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.comp_ = new ArrayList(this.comp_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureComptypeIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.comptype_ = new ArrayList(this.comptype_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureDeliveryIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.delivery_ = new ArrayList(this.delivery_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new o0(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private v1 getCompFieldBuilder() {
                if (this.compBuilder_ == null) {
                    this.compBuilder_ = new v1(this.comp_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.comp_ = null;
                }
                return this.compBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.W;
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
                    this.extProtoBuilder_ = new v1(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getCompFieldBuilder();
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

            public Builder addAllComp(Iterable<? extends Companion> iterable) {
                v1 v1Var = this.compBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureCompIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.comp_);
                onChanged();
                return this;
            }

            public Builder addAllComptype(Iterable<? extends CompanionType> iterable) {
                ensureComptypeIsMutable();
                Iterator<? extends CompanionType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.comptype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllComptypeValue(Iterable<Integer> iterable) {
                ensureComptypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.comptype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllCtype(Iterable<? extends VideoCreativeType> iterable) {
                ensureCtypeIsMutable();
                Iterator<? extends VideoCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.ctype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllDelivery(Iterable<? extends DeliveryMethod> iterable) {
                ensureDeliveryIsMutable();
                Iterator<? extends DeliveryMethod> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllDeliveryValue(Iterable<Integer> iterable) {
                ensureDeliveryIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.delivery_.add(num);
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

            public Builder addComp(Companion companion) {
                v1 v1Var = this.compBuilder_;
                if (v1Var != null) {
                    v1Var.e(companion);
                    return this;
                }
                companion.getClass();
                ensureCompIsMutable();
                this.comp_.add(companion);
                onChanged();
                return this;
            }

            public Companion.Builder addCompBuilder() {
                return (Companion.Builder) getCompFieldBuilder().c(Companion.getDefaultInstance());
            }

            public Builder addComptype(CompanionType companionType) {
                companionType.getClass();
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(companionType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addComptypeValue(int i10) {
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addCtype(VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i10) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addDelivery(DeliveryMethod deliveryMethod) {
                deliveryMethod.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(deliveryMethod.getNumber()));
                onChanged();
                return this;
            }

            public Builder addDeliveryValue(int i10) {
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(i10));
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

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearBoxing() {
                this.boxing_ = false;
                onChanged();
                return this;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearComp() {
                v1 v1Var = this.compBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.comp_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearComptype() {
                this.comptype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearDelay() {
                this.delay_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDelivery() {
                this.delivery_ = Collections.EMPTY_LIST;
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
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLinear() {
                this.linear_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxbitr() {
                this.maxbitr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxdur() {
                this.maxdur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxext() {
                this.maxext_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxseq() {
                this.maxseq_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = o0.f19269e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearMinbitr() {
                this.minbitr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMindur() {
                this.mindur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlayend() {
                this.playend_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlaymethod() {
                this.playmethod_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSkip() {
                this.skip_ = false;
                onChanged();
                return this;
            }

            public Builder clearSkipafter() {
                this.skipafter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSkipmin() {
                this.skipmin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) VideoPlacement.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<ApiFramework> getApiList() {
                return new j0.h(this.api_, VideoPlacement.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getApiValueList() {
                return DesugarCollections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean getBoxing() {
                return this.boxing_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ClickType getClktype() {
                ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
                return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getClktypeValue() {
                return this.clktype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public Companion getComp(int i10) {
                v1 v1Var = this.compBuilder_;
                return v1Var == null ? this.comp_.get(i10) : (Companion) v1Var.n(i10);
            }

            public Companion.Builder getCompBuilder(int i10) {
                return (Companion.Builder) getCompFieldBuilder().k(i10);
            }

            public List<Companion.Builder> getCompBuilderList() {
                return getCompFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCompCount() {
                v1 v1Var = this.compBuilder_;
                return v1Var == null ? this.comp_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Companion> getCompList() {
                v1 v1Var = this.compBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.comp_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public CompanionOrBuilder getCompOrBuilder(int i10) {
                v1 v1Var = this.compBuilder_;
                return v1Var == null ? this.comp_.get(i10) : (CompanionOrBuilder) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
                v1 v1Var = this.compBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.comp_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public CompanionType getComptype(int i10) {
                return (CompanionType) VideoPlacement.comptype_converter_.convert(this.comptype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getComptypeCount() {
                return this.comptype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<CompanionType> getComptypeList() {
                return new j0.h(this.comptype_, VideoPlacement.comptype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getComptypeValue(int i10) {
                return this.comptype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getComptypeValueList() {
                return DesugarCollections.unmodifiableList(this.comptype_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public VideoCreativeType getCtype(int i10) {
                return (VideoCreativeType) VideoPlacement.ctype_converter_.convert(this.ctype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCtypeCount() {
                return this.ctype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<VideoCreativeType> getCtypeList() {
                return new j0.h(this.ctype_, VideoPlacement.ctype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCtypeValue(int i10) {
                return this.ctype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getCtypeValueList() {
                return DesugarCollections.unmodifiableList(this.ctype_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDelay() {
                return this.delay_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public DeliveryMethod getDelivery(int i10) {
                return (DeliveryMethod) VideoPlacement.delivery_converter_.convert(this.delivery_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<DeliveryMethod> getDeliveryList() {
                return new j0.h(this.delivery_, VideoPlacement.delivery_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDeliveryValue(int i10) {
                return this.delivery_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getDeliveryValueList() {
                return DesugarCollections.unmodifiableList(this.delivery_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.W;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getExtProtoCount() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Any> getExtProtoList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                v1 v1Var = this.extProtoBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public LinearityMode getLinear() {
                LinearityMode linearityModeValueOf = LinearityMode.valueOf(this.linear_);
                return linearityModeValueOf == null ? LinearityMode.UNRECOGNIZED : linearityModeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getLinearValue() {
                return this.linear_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxbitr() {
                return this.maxbitr_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxdur() {
                return this.maxdur_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxext() {
                return this.maxext_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxseq() {
                return this.maxseq_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public String getMime(int i10) {
                return (String) this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMinbitr() {
                return this.minbitr_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMindur() {
                return this.mindur_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlaybackCessationMode getPlayend() {
                PlaybackCessationMode playbackCessationModeValueOf = PlaybackCessationMode.valueOf(this.playend_);
                return playbackCessationModeValueOf == null ? PlaybackCessationMode.UNRECOGNIZED : playbackCessationModeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPlayendValue() {
                return this.playend_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlaybackMethod getPlaymethod() {
                PlaybackMethod playbackMethodValueOf = PlaybackMethod.valueOf(this.playmethod_);
                return playbackMethodValueOf == null ? PlaybackMethod.UNRECOGNIZED : playbackMethodValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPlaymethodValue() {
                return this.playmethod_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlacementPosition getPos() {
                PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
                return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPosValue() {
                return this.pos_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public VideoPlacementType getPtype() {
                VideoPlacementType videoPlacementTypeValueOf = VideoPlacementType.valueOf(this.ptype_);
                return videoPlacementTypeValueOf == null ? VideoPlacementType.UNRECOGNIZED : videoPlacementTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPtypeValue() {
                return this.ptype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean getSkip() {
                return this.skip_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getSkipafter() {
                return this.skipafter_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getSkipmin() {
                return this.skipmin_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public SizeUnit getUnit() {
                SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
                return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getUnitValue() {
                return this.unit_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return b.X.d(VideoPlacement.class, Builder.class);
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

            public Builder removeComp(int i10) {
                v1 v1Var = this.compBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureCompIsMutable();
                this.comp_.remove(i10);
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

            public Builder setBoxing(boolean z10) {
                this.boxing_ = z10;
                onChanged();
                return this;
            }

            public Builder setClktype(ClickType clickType) {
                clickType.getClass();
                this.clktype_ = clickType.getNumber();
                onChanged();
                return this;
            }

            public Builder setClktypeValue(int i10) {
                this.clktype_ = i10;
                onChanged();
                return this;
            }

            public Builder setComp(int i10, Companion companion) {
                v1 v1Var = this.compBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, companion);
                    return this;
                }
                companion.getClass();
                ensureCompIsMutable();
                this.comp_.set(i10, companion);
                onChanged();
                return this;
            }

            public Builder setComptype(int i10, CompanionType companionType) {
                companionType.getClass();
                ensureComptypeIsMutable();
                this.comptype_.set(i10, Integer.valueOf(companionType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setComptypeValue(int i10, int i11) {
                ensureComptypeIsMutable();
                this.comptype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setCtype(int i10, VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCtypeValue(int i10, int i11) {
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setDelay(int i10) {
                this.delay_ = i10;
                onChanged();
                return this;
            }

            public Builder setDelivery(int i10, DeliveryMethod deliveryMethod) {
                deliveryMethod.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.set(i10, Integer.valueOf(deliveryMethod.getNumber()));
                onChanged();
                return this;
            }

            public Builder setDeliveryValue(int i10, int i11) {
                ensureDeliveryIsMutable();
                this.delivery_.set(i10, Integer.valueOf(i11));
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

            public Builder setLinear(LinearityMode linearityMode) {
                linearityMode.getClass();
                this.linear_ = linearityMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setLinearValue(int i10) {
                this.linear_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxbitr(int i10) {
                this.maxbitr_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxdur(int i10) {
                this.maxdur_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxext(int i10) {
                this.maxext_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxseq(int i10) {
                this.maxseq_ = i10;
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

            public Builder setMinbitr(int i10) {
                this.minbitr_ = i10;
                onChanged();
                return this;
            }

            public Builder setMindur(int i10) {
                this.mindur_ = i10;
                onChanged();
                return this;
            }

            public Builder setPlayend(PlaybackCessationMode playbackCessationMode) {
                playbackCessationMode.getClass();
                this.playend_ = playbackCessationMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setPlayendValue(int i10) {
                this.playend_ = i10;
                onChanged();
                return this;
            }

            public Builder setPlaymethod(PlaybackMethod playbackMethod) {
                playbackMethod.getClass();
                this.playmethod_ = playbackMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setPlaymethodValue(int i10) {
                this.playmethod_ = i10;
                onChanged();
                return this;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                placementPosition.getClass();
                this.pos_ = placementPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setPosValue(int i10) {
                this.pos_ = i10;
                onChanged();
                return this;
            }

            public Builder setPtype(VideoPlacementType videoPlacementType) {
                videoPlacementType.getClass();
                this.ptype_ = videoPlacementType.getNumber();
                onChanged();
                return this;
            }

            public Builder setPtypeValue(int i10) {
                this.ptype_ = i10;
                onChanged();
                return this;
            }

            public Builder setSkip(boolean z10) {
                this.skip_ = z10;
                onChanged();
                return this;
            }

            public Builder setSkipafter(int i10) {
                this.skipafter_ = i10;
                onChanged();
                return this;
            }

            public Builder setSkipmin(int i10) {
                this.skipmin_ = i10;
                onChanged();
                return this;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                sizeUnit.getClass();
                this.unit_ = sizeUnit.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnitValue(int i10) {
                this.unit_ = i10;
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public t1 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = o0.f19269e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.delivery_ = list;
                this.linear_ = 0;
                this.comp_ = list;
                this.comptype_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public VideoPlacement build() {
                VideoPlacement videoPlacementBuildPartial = buildPartial();
                if (videoPlacementBuildPartial.isInitialized()) {
                    return videoPlacementBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoPlacementBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public VideoPlacement buildPartial() {
                VideoPlacement videoPlacement = new VideoPlacement(this);
                videoPlacement.ptype_ = this.ptype_;
                videoPlacement.pos_ = this.pos_;
                videoPlacement.delay_ = this.delay_;
                videoPlacement.skip_ = this.skip_;
                videoPlacement.skipmin_ = this.skipmin_;
                videoPlacement.skipafter_ = this.skipafter_;
                videoPlacement.playmethod_ = this.playmethod_;
                videoPlacement.playend_ = this.playend_;
                videoPlacement.clktype_ = this.clktype_;
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                videoPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                videoPlacement.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.ctype_ = DesugarCollections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -5;
                }
                videoPlacement.ctype_ = this.ctype_;
                videoPlacement.w_ = this.w_;
                videoPlacement.h_ = this.h_;
                videoPlacement.unit_ = this.unit_;
                videoPlacement.mindur_ = this.mindur_;
                videoPlacement.maxdur_ = this.maxdur_;
                videoPlacement.maxext_ = this.maxext_;
                videoPlacement.minbitr_ = this.minbitr_;
                videoPlacement.maxbitr_ = this.maxbitr_;
                if ((this.bitField0_ & 8) != 0) {
                    this.delivery_ = DesugarCollections.unmodifiableList(this.delivery_);
                    this.bitField0_ &= -9;
                }
                videoPlacement.delivery_ = this.delivery_;
                videoPlacement.maxseq_ = this.maxseq_;
                videoPlacement.linear_ = this.linear_;
                videoPlacement.boxing_ = this.boxing_;
                v1 v1Var = this.compBuilder_;
                if (v1Var != null) {
                    videoPlacement.comp_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.comp_ = DesugarCollections.unmodifiableList(this.comp_);
                        this.bitField0_ &= -17;
                    }
                    videoPlacement.comp_ = this.comp_;
                }
                if ((this.bitField0_ & 32) != 0) {
                    this.comptype_ = DesugarCollections.unmodifiableList(this.comptype_);
                    this.bitField0_ &= -33;
                }
                videoPlacement.comptype_ = this.comptype_;
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    videoPlacement.ext_ = this.ext_;
                } else {
                    videoPlacement.ext_ = (Struct) a2Var.a();
                }
                v1 v1Var2 = this.extProtoBuilder_;
                if (v1Var2 != null) {
                    videoPlacement.extProto_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    videoPlacement.extProto_ = this.extProto_;
                }
                onBuilt();
                return videoPlacement;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public VideoPlacement getDefaultInstanceForType() {
                return VideoPlacement.getDefaultInstance();
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

            public Companion.Builder addCompBuilder(int i10) {
                return (Companion.Builder) getCompFieldBuilder().b(i10, Companion.getDefaultInstance());
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
                this.ptype_ = 0;
                this.pos_ = 0;
                this.delay_ = 0;
                this.skip_ = false;
                this.skipmin_ = 0;
                this.skipafter_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = o0.f19269e;
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.mindur_ = 0;
                this.maxdur_ = 0;
                this.maxext_ = 0;
                this.minbitr_ = 0;
                this.maxbitr_ = 0;
                this.delivery_ = list;
                this.bitField0_ = i10 & (-16);
                this.maxseq_ = 0;
                this.linear_ = 0;
                this.boxing_ = false;
                v1 v1Var = this.compBuilder_;
                if (v1Var == null) {
                    this.comp_ = list;
                    this.bitField0_ = i10 & (-32);
                } else {
                    v1Var.g();
                }
                this.comptype_ = list;
                int i11 = this.bitField0_;
                this.bitField0_ = i11 & (-33);
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                v1 v1Var2 = this.extProtoBuilder_;
                if (v1Var2 == null) {
                    this.extProto_ = list;
                    this.bitField0_ = i11 & (-97);
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

            public Builder addComp(int i10, Companion companion) {
                v1 v1Var = this.compBuilder_;
                if (v1Var == null) {
                    companion.getClass();
                    ensureCompIsMutable();
                    this.comp_.add(i10, companion);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, companion);
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
                if (message instanceof VideoPlacement) {
                    return mergeFrom((VideoPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setComp(int i10, Companion.Builder builder) {
                v1 v1Var = this.compBuilder_;
                if (v1Var == null) {
                    ensureCompIsMutable();
                    this.comp_.set(i10, builder.build());
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

            public Builder mergeFrom(VideoPlacement videoPlacement) {
                if (videoPlacement == VideoPlacement.getDefaultInstance()) {
                    return this;
                }
                if (videoPlacement.ptype_ != 0) {
                    setPtypeValue(videoPlacement.getPtypeValue());
                }
                if (videoPlacement.pos_ != 0) {
                    setPosValue(videoPlacement.getPosValue());
                }
                if (videoPlacement.getDelay() != 0) {
                    setDelay(videoPlacement.getDelay());
                }
                if (videoPlacement.getSkip()) {
                    setSkip(videoPlacement.getSkip());
                }
                if (videoPlacement.getSkipmin() != 0) {
                    setSkipmin(videoPlacement.getSkipmin());
                }
                if (videoPlacement.getSkipafter() != 0) {
                    setSkipafter(videoPlacement.getSkipafter());
                }
                if (videoPlacement.playmethod_ != 0) {
                    setPlaymethodValue(videoPlacement.getPlaymethodValue());
                }
                if (videoPlacement.playend_ != 0) {
                    setPlayendValue(videoPlacement.getPlayendValue());
                }
                if (videoPlacement.clktype_ != 0) {
                    setClktypeValue(videoPlacement.getClktypeValue());
                }
                if (!videoPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = videoPlacement.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(videoPlacement.mime_);
                    }
                    onChanged();
                }
                if (!videoPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = videoPlacement.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(videoPlacement.api_);
                    }
                    onChanged();
                }
                if (!videoPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = videoPlacement.ctype_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(videoPlacement.ctype_);
                    }
                    onChanged();
                }
                if (videoPlacement.getW() != 0) {
                    setW(videoPlacement.getW());
                }
                if (videoPlacement.getH() != 0) {
                    setH(videoPlacement.getH());
                }
                if (videoPlacement.unit_ != 0) {
                    setUnitValue(videoPlacement.getUnitValue());
                }
                if (videoPlacement.getMindur() != 0) {
                    setMindur(videoPlacement.getMindur());
                }
                if (videoPlacement.getMaxdur() != 0) {
                    setMaxdur(videoPlacement.getMaxdur());
                }
                if (videoPlacement.getMaxext() != 0) {
                    setMaxext(videoPlacement.getMaxext());
                }
                if (videoPlacement.getMinbitr() != 0) {
                    setMinbitr(videoPlacement.getMinbitr());
                }
                if (videoPlacement.getMaxbitr() != 0) {
                    setMaxbitr(videoPlacement.getMaxbitr());
                }
                if (!videoPlacement.delivery_.isEmpty()) {
                    if (this.delivery_.isEmpty()) {
                        this.delivery_ = videoPlacement.delivery_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureDeliveryIsMutable();
                        this.delivery_.addAll(videoPlacement.delivery_);
                    }
                    onChanged();
                }
                if (videoPlacement.getMaxseq() != 0) {
                    setMaxseq(videoPlacement.getMaxseq());
                }
                if (videoPlacement.linear_ != 0) {
                    setLinearValue(videoPlacement.getLinearValue());
                }
                if (videoPlacement.getBoxing()) {
                    setBoxing(videoPlacement.getBoxing());
                }
                if (this.compBuilder_ == null) {
                    if (!videoPlacement.comp_.isEmpty()) {
                        if (this.comp_.isEmpty()) {
                            this.comp_ = videoPlacement.comp_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureCompIsMutable();
                            this.comp_.addAll(videoPlacement.comp_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.comp_.isEmpty()) {
                    if (!this.compBuilder_.t()) {
                        this.compBuilder_.a(videoPlacement.comp_);
                    } else {
                        this.compBuilder_.h();
                        this.compBuilder_ = null;
                        this.comp_ = videoPlacement.comp_;
                        this.bitField0_ &= -17;
                        this.compBuilder_ = h0.alwaysUseFieldBuilders ? getCompFieldBuilder() : null;
                    }
                }
                if (!videoPlacement.comptype_.isEmpty()) {
                    if (this.comptype_.isEmpty()) {
                        this.comptype_ = videoPlacement.comptype_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureComptypeIsMutable();
                        this.comptype_.addAll(videoPlacement.comptype_);
                    }
                    onChanged();
                }
                if (videoPlacement.hasExt()) {
                    mergeExt(videoPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!videoPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = videoPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(videoPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(videoPlacement.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = videoPlacement.extProto_;
                        this.bitField0_ &= -65;
                        this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) videoPlacement).unknownFields);
                onChanged();
                return this;
            }

            public Builder addComp(Companion.Builder builder) {
                v1 v1Var = this.compBuilder_;
                if (v1Var == null) {
                    ensureCompIsMutable();
                    this.comp_.add(builder.build());
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

            public Builder addComp(int i10, Companion.Builder builder) {
                v1 v1Var = this.compBuilder_;
                if (v1Var == null) {
                    ensureCompIsMutable();
                    this.comp_.add(i10, builder.build());
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
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = o0.f19269e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.delivery_ = list;
                this.linear_ = 0;
                this.comp_ = list;
                this.comptype_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.adcom.Placement.VideoPlacement.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.VideoPlacement.access$19000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Placement$VideoPlacement r3 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Placement$VideoPlacement r4 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$VideoPlacement$Builder");
            }
        }

        public static final class Companion extends h0 implements CompanionOrBuilder {
            public static final int DISPLAY_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int VCM_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private DisplayPlacement display_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private int vcm_;
            private static final Companion DEFAULT_INSTANCE = new Companion();
            private static final p1 PARSER = new com.explorestack.protobuf.b() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.1
                @Override // com.explorestack.protobuf.p1
                public Companion parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Companion(lVar, wVar);
                }
            };

            public static Companion getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.Y;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Companion parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Companion) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Companion)) {
                    return super.equals(obj);
                }
                Companion companion = (Companion) obj;
                if (!getId().equals(companion.getId()) || getVcm() != companion.getVcm() || hasDisplay() != companion.hasDisplay()) {
                    return false;
                }
                if ((!hasDisplay() || getDisplay().equals(companion.getDisplay())) && hasExt() == companion.hasExt()) {
                    return (!hasExt() || getExt().equals(companion.getExt())) && getExtProtoList().equals(companion.getExtProtoList()) && this.unknownFields.equals(companion.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public DisplayPlacement getDisplay() {
                DisplayPlacement displayPlacement = this.display_;
                return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                return getDisplay();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public e2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
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
                int i11 = this.vcm_;
                if (i11 != 0) {
                    iComputeStringSize += n.Y(2, i11);
                }
                if (this.display_ != null) {
                    iComputeStringSize += n.G(3, getDisplay());
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

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public int getVcm() {
                return this.vcm_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public boolean hasDisplay() {
                return this.display_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getVcm();
                if (hasDisplay()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getDisplay().hashCode();
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
                return b.Z.d(Companion.class, Builder.class);
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
                return new Companion();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.id_);
                }
                int i10 = this.vcm_;
                if (i10 != 0) {
                    nVar.W0(2, i10);
                }
                if (this.display_ != null) {
                    nVar.J0(3, getDisplay());
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    nVar.J0(4, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    nVar.J0(5, getExt());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements CompanionOrBuilder {
                private int bitField0_;
                private a2 displayBuilder_;
                private DisplayPlacement display_;
                private a2 extBuilder_;
                private v1 extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private int vcm_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.Y;
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
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Companion.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearVcm() {
                    this.vcm_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.Y;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public DisplayPlacement getDisplay() {
                    a2 a2Var = this.displayBuilder_;
                    if (a2Var != null) {
                        return (DisplayPlacement) a2Var.e();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                public DisplayPlacement.Builder getDisplayBuilder() {
                    onChanged();
                    return (DisplayPlacement.Builder) getDisplayFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                    a2 a2Var = this.displayBuilder_;
                    if (a2Var != null) {
                        return (DisplayPlacementOrBuilder) a2Var.f();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public e2 getExtOrBuilder() {
                    a2 a2Var = this.extBuilder_;
                    if (a2Var != null) {
                        return (e2) a2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public int getExtProtoCount() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.size() : v1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public List<Any> getExtProtoList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.extProto_) : v1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var == null ? this.extProto_.get(i10) : (e) v1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    v1 v1Var = this.extProtoBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public int getVcm() {
                    return this.vcm_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public boolean hasDisplay() {
                    return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return b.Z.d(Companion.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeDisplay(DisplayPlacement displayPlacement) {
                    a2 a2Var = this.displayBuilder_;
                    if (a2Var != null) {
                        a2Var.g(displayPlacement);
                        return this;
                    }
                    DisplayPlacement displayPlacement2 = this.display_;
                    if (displayPlacement2 != null) {
                        this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
                    } else {
                        this.display_ = displayPlacement;
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

                public Builder setDisplay(DisplayPlacement displayPlacement) {
                    a2 a2Var = this.displayBuilder_;
                    if (a2Var != null) {
                        a2Var.i(displayPlacement);
                        return this;
                    }
                    displayPlacement.getClass();
                    this.display_ = displayPlacement;
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

                public Builder setVcm(int i10) {
                    this.vcm_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.id_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Companion build() {
                    Companion companionBuildPartial = buildPartial();
                    if (companionBuildPartial.isInitialized()) {
                        return companionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) companionBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Companion buildPartial() {
                    Companion companion = new Companion(this);
                    companion.id_ = this.id_;
                    companion.vcm_ = this.vcm_;
                    a2 a2Var = this.displayBuilder_;
                    if (a2Var == null) {
                        companion.display_ = this.display_;
                    } else {
                        companion.display_ = (DisplayPlacement) a2Var.a();
                    }
                    a2 a2Var2 = this.extBuilder_;
                    if (a2Var2 == null) {
                        companion.ext_ = this.ext_;
                    } else {
                        companion.ext_ = (Struct) a2Var2.a();
                    }
                    v1 v1Var = this.extProtoBuilder_;
                    if (v1Var != null) {
                        companion.extProto_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        companion.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return companion;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Companion getDefaultInstanceForType() {
                    return Companion.getDefaultInstance();
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
                    this.vcm_ = 0;
                    if (this.displayBuilder_ == null) {
                        this.display_ = null;
                    } else {
                        this.display_ = null;
                        this.displayBuilder_ = null;
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

                public Builder setDisplay(DisplayPlacement.Builder builder) {
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

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.id_ = "";
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
                    if (message instanceof Companion) {
                        return mergeFrom((Companion) message);
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

                public Builder mergeFrom(Companion companion) {
                    if (companion == Companion.getDefaultInstance()) {
                        return this;
                    }
                    if (!companion.getId().isEmpty()) {
                        this.id_ = companion.id_;
                        onChanged();
                    }
                    if (companion.getVcm() != 0) {
                        setVcm(companion.getVcm());
                    }
                    if (companion.hasDisplay()) {
                        mergeDisplay(companion.getDisplay());
                    }
                    if (companion.hasExt()) {
                        mergeExt(companion.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!companion.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = companion.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(companion.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!companion.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(companion.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = companion.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = h0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) companion).unknownFields);
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
                public com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.access$15200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion r3 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion r4 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion$Builder");
                }
            }

            public static Builder newBuilder(Companion companion) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(companion);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Companion(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Companion parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Companion) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Companion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Companion getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Companion parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Companion() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Companion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Companion parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(bArr, wVar);
            }

            public static Companion parseFrom(InputStream inputStream) throws IOException {
                return (Companion) h0.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Companion(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.id_ = lVar.J();
                                } else if (iK != 16) {
                                    if (iK == 26) {
                                        DisplayPlacement displayPlacement = this.display_;
                                        DisplayPlacement.Builder builder = displayPlacement != null ? displayPlacement.toBuilder() : null;
                                        DisplayPlacement displayPlacement2 = (DisplayPlacement) lVar.A(DisplayPlacement.parser(), wVar);
                                        this.display_ = displayPlacement2;
                                        if (builder != null) {
                                            builder.mergeFrom(displayPlacement2);
                                            this.display_ = builder.buildPartial();
                                        }
                                    } else if (iK == 34) {
                                        if (b10 == false) {
                                            this.extProto_ = new ArrayList();
                                            b10 = true;
                                        }
                                        this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                    } else if (iK != 42) {
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
                                    this.vcm_ = lVar.L();
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

            public static Companion parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Companion) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Companion parseFrom(l lVar) throws IOException {
                return (Companion) h0.parseWithIOException(PARSER, lVar);
            }

            public static Companion parseFrom(l lVar, w wVar) throws IOException {
                return (Companion) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface CompanionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            DisplayPlacement getDisplay();

            DisplayPlacementOrBuilder getDisplayOrBuilder();

            Struct getExt();

            e2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            int getVcm();

            boolean hasDisplay();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static VideoPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.W;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoPlacement)) {
                return super.equals(obj);
            }
            VideoPlacement videoPlacement = (VideoPlacement) obj;
            if (this.ptype_ == videoPlacement.ptype_ && this.pos_ == videoPlacement.pos_ && getDelay() == videoPlacement.getDelay() && getSkip() == videoPlacement.getSkip() && getSkipmin() == videoPlacement.getSkipmin() && getSkipafter() == videoPlacement.getSkipafter() && this.playmethod_ == videoPlacement.playmethod_ && this.playend_ == videoPlacement.playend_ && this.clktype_ == videoPlacement.clktype_ && getMimeList().equals(videoPlacement.getMimeList()) && this.api_.equals(videoPlacement.api_) && this.ctype_.equals(videoPlacement.ctype_) && getW() == videoPlacement.getW() && getH() == videoPlacement.getH() && this.unit_ == videoPlacement.unit_ && getMindur() == videoPlacement.getMindur() && getMaxdur() == videoPlacement.getMaxdur() && getMaxext() == videoPlacement.getMaxext() && getMinbitr() == videoPlacement.getMinbitr() && getMaxbitr() == videoPlacement.getMaxbitr() && this.delivery_.equals(videoPlacement.delivery_) && getMaxseq() == videoPlacement.getMaxseq() && this.linear_ == videoPlacement.linear_ && getBoxing() == videoPlacement.getBoxing() && getCompList().equals(videoPlacement.getCompList()) && this.comptype_.equals(videoPlacement.comptype_) && hasExt() == videoPlacement.hasExt()) {
                return (!hasExt() || getExt().equals(videoPlacement.getExt())) && getExtProtoList().equals(videoPlacement.getExtProtoList()) && this.unknownFields.equals(videoPlacement.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<ApiFramework> getApiList() {
            return new j0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean getBoxing() {
            return this.boxing_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ClickType getClktype() {
            ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
            return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getClktypeValue() {
            return this.clktype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Companion getComp(int i10) {
            return this.comp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCompCount() {
            return this.comp_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Companion> getCompList() {
            return this.comp_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public CompanionOrBuilder getCompOrBuilder(int i10) {
            return this.comp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
            return this.comp_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public CompanionType getComptype(int i10) {
            return (CompanionType) comptype_converter_.convert(this.comptype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getComptypeCount() {
            return this.comptype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<CompanionType> getComptypeList() {
            return new j0.h(this.comptype_, comptype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getComptypeValue(int i10) {
            return this.comptype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getComptypeValueList() {
            return this.comptype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public VideoCreativeType getCtype(int i10) {
            return (VideoCreativeType) ctype_converter_.convert(this.ctype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCtypeCount() {
            return this.ctype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<VideoCreativeType> getCtypeList() {
            return new j0.h(this.ctype_, ctype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCtypeValue(int i10) {
            return this.ctype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDelay() {
            return this.delay_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public DeliveryMethod getDelivery(int i10) {
            return (DeliveryMethod) delivery_converter_.convert(this.delivery_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDeliveryCount() {
            return this.delivery_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<DeliveryMethod> getDeliveryList() {
            return new j0.h(this.delivery_, delivery_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDeliveryValue(int i10) {
            return this.delivery_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getDeliveryValueList() {
            return this.delivery_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public LinearityMode getLinear() {
            LinearityMode linearityModeValueOf = LinearityMode.valueOf(this.linear_);
            return linearityModeValueOf == null ? LinearityMode.UNRECOGNIZED : linearityModeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getLinearValue() {
            return this.linear_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxbitr() {
            return this.maxbitr_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxdur() {
            return this.maxdur_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxext() {
            return this.maxext_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxseq() {
            return this.maxseq_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public String getMime(int i10) {
            return (String) this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMinbitr() {
            return this.minbitr_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMindur() {
            return this.mindur_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlaybackCessationMode getPlayend() {
            PlaybackCessationMode playbackCessationModeValueOf = PlaybackCessationMode.valueOf(this.playend_);
            return playbackCessationModeValueOf == null ? PlaybackCessationMode.UNRECOGNIZED : playbackCessationModeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPlayendValue() {
            return this.playend_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlaybackMethod getPlaymethod() {
            PlaybackMethod playbackMethodValueOf = PlaybackMethod.valueOf(this.playmethod_);
            return playbackMethodValueOf == null ? PlaybackMethod.UNRECOGNIZED : playbackMethodValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPlaymethodValue() {
            return this.playmethod_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlacementPosition getPos() {
            PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
            return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPosValue() {
            return this.pos_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public VideoPlacementType getPtype() {
            VideoPlacementType videoPlacementTypeValueOf = VideoPlacementType.valueOf(this.ptype_);
            return videoPlacementTypeValueOf == null ? VideoPlacementType.UNRECOGNIZED : videoPlacementTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPtypeValue() {
            return this.ptype_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber() ? n.l(1, this.ptype_) : 0;
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                iL += n.l(2, this.pos_);
            }
            int i11 = this.delay_;
            if (i11 != 0) {
                iL += n.x(3, i11);
            }
            boolean z10 = this.skip_;
            if (z10) {
                iL += n.e(4, z10);
            }
            int i12 = this.skipmin_;
            if (i12 != 0) {
                iL += n.Y(5, i12);
            }
            int i13 = this.skipafter_;
            if (i13 != 0) {
                iL += n.Y(6, i13);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                iL += n.l(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                iL += n.l(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                iL += n.l(9, this.clktype_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i14 = 0; i14 < this.mime_.size(); i14++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.mime_.getRaw(i14));
            }
            int size = iL + iComputeStringSizeNoTag + getMimeList().size();
            int iM = 0;
            for (int i15 = 0; i15 < this.api_.size(); i15++) {
                iM += n.m(this.api_.get(i15).intValue());
            }
            int iZ = size + iM;
            if (!getApiList().isEmpty()) {
                iZ = iZ + 1 + n.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            int iM2 = 0;
            for (int i16 = 0; i16 < this.ctype_.size(); i16++) {
                iM2 += n.m(this.ctype_.get(i16).intValue());
            }
            int iY = iZ + iM2;
            if (!getCtypeList().isEmpty()) {
                iY = iY + 1 + n.Z(iM2);
            }
            this.ctypeMemoizedSerializedSize = iM2;
            int i17 = this.w_;
            if (i17 != 0) {
                iY += n.Y(13, i17);
            }
            int i18 = this.h_;
            if (i18 != 0) {
                iY += n.Y(14, i18);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                iY += n.l(15, this.unit_);
            }
            int i19 = this.mindur_;
            if (i19 != 0) {
                iY += n.Y(16, i19);
            }
            int i20 = this.maxdur_;
            if (i20 != 0) {
                iY += n.Y(17, i20);
            }
            int i21 = this.maxext_;
            if (i21 != 0) {
                iY += n.x(18, i21);
            }
            int i22 = this.minbitr_;
            if (i22 != 0) {
                iY += n.Y(19, i22);
            }
            int i23 = this.maxbitr_;
            if (i23 != 0) {
                iY += n.Y(20, i23);
            }
            int iM3 = 0;
            for (int i24 = 0; i24 < this.delivery_.size(); i24++) {
                iM3 += n.m(this.delivery_.get(i24).intValue());
            }
            int iG = iY + iM3;
            if (!getDeliveryList().isEmpty()) {
                iG = iG + 2 + n.Z(iM3);
            }
            this.deliveryMemoizedSerializedSize = iM3;
            int i25 = this.maxseq_;
            if (i25 != 0) {
                iG += n.Y(22, i25);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                iG += n.l(23, this.linear_);
            }
            boolean z11 = this.boxing_;
            if (z11) {
                iG += n.e(24, z11);
            }
            for (int i26 = 0; i26 < this.comp_.size(); i26++) {
                iG += n.G(25, this.comp_.get(i26));
            }
            int iM4 = 0;
            for (int i27 = 0; i27 < this.comptype_.size(); i27++) {
                iM4 += n.m(this.comptype_.get(i27).intValue());
            }
            int iG2 = iG + iM4;
            if (!getComptypeList().isEmpty()) {
                iG2 = iG2 + 2 + n.Z(iM4);
            }
            this.comptypeMemoizedSerializedSize = iM4;
            for (int i28 = 0; i28 < this.extProto_.size(); i28++) {
                iG2 += n.G(27, this.extProto_.get(i28));
            }
            if (this.ext_ != null) {
                iG2 += n.G(28, getExt());
            }
            int serializedSize = iG2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean getSkip() {
            return this.skip_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getSkipafter() {
            return this.skipafter_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getSkipmin() {
            return this.skipmin_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public SizeUnit getUnit() {
            SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
            return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.ptype_) * 37) + 2) * 53) + this.pos_) * 37) + 3) * 53) + getDelay()) * 37) + 4) * 53) + j0.d(getSkip())) * 37) + 5) * 53) + getSkipmin()) * 37) + 6) * 53) + getSkipafter()) * 37) + 7) * 53) + this.playmethod_) * 37) + 8) * 53) + this.playend_) * 37) + 9) * 53) + this.clktype_;
            if (getMimeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + this.ctype_.hashCode();
            }
            int w10 = (((((((((((((((((((((((((((((((iHashCode * 37) + 13) * 53) + getW()) * 37) + 14) * 53) + getH()) * 37) + 15) * 53) + this.unit_) * 37) + 16) * 53) + getMindur()) * 37) + 17) * 53) + getMaxdur()) * 37) + 18) * 53) + getMaxext()) * 37) + 19) * 53) + getMinbitr()) * 37) + 20) * 53) + getMaxbitr();
            if (getDeliveryCount() > 0) {
                w10 = (((w10 * 37) + 21) * 53) + this.delivery_.hashCode();
            }
            int maxseq = (((((((((((w10 * 37) + 22) * 53) + getMaxseq()) * 37) + 23) * 53) + this.linear_) * 37) + 24) * 53) + j0.d(getBoxing());
            if (getCompCount() > 0) {
                maxseq = (((maxseq * 37) + 25) * 53) + getCompList().hashCode();
            }
            if (getComptypeCount() > 0) {
                maxseq = (((maxseq * 37) + 26) * 53) + this.comptype_.hashCode();
            }
            if (hasExt()) {
                maxseq = (((maxseq * 37) + 28) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                maxseq = (((maxseq * 37) + 27) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (maxseq * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return b.X.d(VideoPlacement.class, Builder.class);
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
            return new VideoPlacement();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            if (this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber()) {
                nVar.v0(1, this.ptype_);
            }
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                nVar.v0(2, this.pos_);
            }
            int i10 = this.delay_;
            if (i10 != 0) {
                nVar.F0(3, i10);
            }
            boolean z10 = this.skip_;
            if (z10) {
                nVar.n0(4, z10);
            }
            int i11 = this.skipmin_;
            if (i11 != 0) {
                nVar.W0(5, i11);
            }
            int i12 = this.skipafter_;
            if (i12 != 0) {
                nVar.W0(6, i12);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                nVar.v0(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                nVar.v0(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                nVar.v0(9, this.clktype_);
            }
            for (int i13 = 0; i13 < this.mime_.size(); i13++) {
                h0.writeString(nVar, 10, this.mime_.getRaw(i13));
            }
            if (getApiList().size() > 0) {
                nVar.X0(90);
                nVar.X0(this.apiMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.api_.size(); i14++) {
                nVar.w0(this.api_.get(i14).intValue());
            }
            if (getCtypeList().size() > 0) {
                nVar.X0(98);
                nVar.X0(this.ctypeMemoizedSerializedSize);
            }
            for (int i15 = 0; i15 < this.ctype_.size(); i15++) {
                nVar.w0(this.ctype_.get(i15).intValue());
            }
            int i16 = this.w_;
            if (i16 != 0) {
                nVar.W0(13, i16);
            }
            int i17 = this.h_;
            if (i17 != 0) {
                nVar.W0(14, i17);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                nVar.v0(15, this.unit_);
            }
            int i18 = this.mindur_;
            if (i18 != 0) {
                nVar.W0(16, i18);
            }
            int i19 = this.maxdur_;
            if (i19 != 0) {
                nVar.W0(17, i19);
            }
            int i20 = this.maxext_;
            if (i20 != 0) {
                nVar.F0(18, i20);
            }
            int i21 = this.minbitr_;
            if (i21 != 0) {
                nVar.W0(19, i21);
            }
            int i22 = this.maxbitr_;
            if (i22 != 0) {
                nVar.W0(20, i22);
            }
            if (getDeliveryList().size() > 0) {
                nVar.X0(170);
                nVar.X0(this.deliveryMemoizedSerializedSize);
            }
            for (int i23 = 0; i23 < this.delivery_.size(); i23++) {
                nVar.w0(this.delivery_.get(i23).intValue());
            }
            int i24 = this.maxseq_;
            if (i24 != 0) {
                nVar.W0(22, i24);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                nVar.v0(23, this.linear_);
            }
            boolean z11 = this.boxing_;
            if (z11) {
                nVar.n0(24, z11);
            }
            for (int i25 = 0; i25 < this.comp_.size(); i25++) {
                nVar.J0(25, this.comp_.get(i25));
            }
            if (getComptypeList().size() > 0) {
                nVar.X0(210);
                nVar.X0(this.comptypeMemoizedSerializedSize);
            }
            for (int i26 = 0; i26 < this.comptype_.size(); i26++) {
                nVar.w0(this.comptype_.get(i26).intValue());
            }
            for (int i27 = 0; i27 < this.extProto_.size(); i27++) {
                nVar.J0(27, this.extProto_.get(i27));
            }
            if (this.ext_ != null) {
                nVar.J0(28, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(VideoPlacement videoPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoPlacement);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteBuffer, wVar);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public t1 getMimeList() {
            return this.mime_;
        }

        private VideoPlacement(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (VideoPlacement) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static VideoPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public VideoPlacement getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static VideoPlacement parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private VideoPlacement() {
            this.memoizedIsInitialized = (byte) -1;
            this.ptype_ = 0;
            this.pos_ = 0;
            this.playmethod_ = 0;
            this.playend_ = 0;
            this.clktype_ = 0;
            this.mime_ = o0.f19269e;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.ctype_ = list;
            this.unit_ = 0;
            this.delivery_ = list;
            this.linear_ = 0;
            this.comp_ = list;
            this.comptype_ = list;
            this.extProto_ = list;
        }

        public static VideoPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static VideoPlacement parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(bArr, wVar);
        }

        public static VideoPlacement parseFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) h0.parseWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (VideoPlacement) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static VideoPlacement parseFrom(l lVar) throws IOException {
            return (VideoPlacement) h0.parseWithIOException(PARSER, lVar);
        }

        public static VideoPlacement parseFrom(l lVar, w wVar) throws IOException {
            return (VideoPlacement) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private VideoPlacement(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            case 8:
                                this.ptype_ = lVar.t();
                                break;
                            case 16:
                                this.pos_ = lVar.t();
                                break;
                            case 24:
                                this.delay_ = lVar.y();
                                break;
                            case 32:
                                this.skip_ = lVar.q();
                                break;
                            case 40:
                                this.skipmin_ = lVar.L();
                                break;
                            case 48:
                                this.skipafter_ = lVar.L();
                                break;
                            case 56:
                                this.playmethod_ = lVar.t();
                                break;
                            case 64:
                                this.playend_ = lVar.t();
                                break;
                            case 72:
                                this.clktype_ = lVar.t();
                                break;
                            case 82:
                                String strJ = lVar.J();
                                if ((i10 & 1) == 0) {
                                    this.mime_ = new o0();
                                    i10 |= 1;
                                }
                                this.mime_.add(strJ);
                                break;
                            case 88:
                                int iT = lVar.t();
                                if ((i10 & 2) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.api_.add(Integer.valueOf(iT));
                                break;
                            case 90:
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
                                break;
                            case 96:
                                int iT3 = lVar.t();
                                if ((i10 & 4) == 0) {
                                    this.ctype_ = new ArrayList();
                                    i10 |= 4;
                                }
                                this.ctype_.add(Integer.valueOf(iT3));
                                break;
                            case 98:
                                int iP2 = lVar.p(lVar.C());
                                while (lVar.d() > 0) {
                                    int iT4 = lVar.t();
                                    if ((i10 & 4) == 0) {
                                        this.ctype_ = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.ctype_.add(Integer.valueOf(iT4));
                                }
                                lVar.o(iP2);
                                break;
                            case 104:
                                this.w_ = lVar.L();
                                break;
                            case 112:
                                this.h_ = lVar.L();
                                break;
                            case 120:
                                this.unit_ = lVar.t();
                                break;
                            case 128:
                                this.mindur_ = lVar.L();
                                break;
                            case 136:
                                this.maxdur_ = lVar.L();
                                break;
                            case 144:
                                this.maxext_ = lVar.y();
                                break;
                            case 152:
                                this.minbitr_ = lVar.L();
                                break;
                            case 160:
                                this.maxbitr_ = lVar.L();
                                break;
                            case 168:
                                int iT5 = lVar.t();
                                if ((i10 & 8) == 0) {
                                    this.delivery_ = new ArrayList();
                                    i10 |= 8;
                                }
                                this.delivery_.add(Integer.valueOf(iT5));
                                break;
                            case 170:
                                int iP3 = lVar.p(lVar.C());
                                while (lVar.d() > 0) {
                                    int iT6 = lVar.t();
                                    if ((i10 & 8) == 0) {
                                        this.delivery_ = new ArrayList();
                                        i10 |= 8;
                                    }
                                    this.delivery_.add(Integer.valueOf(iT6));
                                }
                                lVar.o(iP3);
                                break;
                            case 176:
                                this.maxseq_ = lVar.L();
                                break;
                            case 184:
                                this.linear_ = lVar.t();
                                break;
                            case 192:
                                this.boxing_ = lVar.q();
                                break;
                            case 202:
                                if ((i10 & 16) == 0) {
                                    this.comp_ = new ArrayList();
                                    i10 |= 16;
                                }
                                this.comp_.add((Companion) lVar.A(Companion.parser(), wVar));
                                break;
                            case 208:
                                int iT7 = lVar.t();
                                if ((i10 & 32) == 0) {
                                    this.comptype_ = new ArrayList();
                                    i10 |= 32;
                                }
                                this.comptype_.add(Integer.valueOf(iT7));
                                break;
                            case 210:
                                int iP4 = lVar.p(lVar.C());
                                while (lVar.d() > 0) {
                                    int iT8 = lVar.t();
                                    if ((i10 & 32) == 0) {
                                        this.comptype_ = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.comptype_.add(Integer.valueOf(iT8));
                                }
                                lVar.o(iP4);
                                break;
                            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                if ((i10 & 64) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 64;
                                }
                                this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                                break;
                            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
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
                    if ((i10 & 1) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.api_ = DesugarCollections.unmodifiableList(this.api_);
                    }
                    if ((i10 & 4) != 0) {
                        this.ctype_ = DesugarCollections.unmodifiableList(this.ctype_);
                    }
                    if ((i10 & 8) != 0) {
                        this.delivery_ = DesugarCollections.unmodifiableList(this.delivery_);
                    }
                    if ((i10 & 16) != 0) {
                        this.comp_ = DesugarCollections.unmodifiableList(this.comp_);
                    }
                    if ((i10 & 32) != 0) {
                        this.comptype_ = DesugarCollections.unmodifiableList(this.comptype_);
                    }
                    if ((i10 & 64) != 0) {
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
                this.ctype_ = DesugarCollections.unmodifiableList(this.ctype_);
            }
            if ((i10 & 8) != 0) {
                this.delivery_ = DesugarCollections.unmodifiableList(this.delivery_);
            }
            if ((i10 & 16) != 0) {
                this.comp_ = DesugarCollections.unmodifiableList(this.comp_);
            }
            if ((i10 & 32) != 0) {
                this.comptype_ = DesugarCollections.unmodifiableList(this.comptype_);
            }
            if ((i10 & 64) != 0) {
                this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface VideoPlacementOrBuilder extends MessageOrBuilder {
        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        boolean getBoxing();

        ClickType getClktype();

        int getClktypeValue();

        VideoPlacement.Companion getComp(int i10);

        int getCompCount();

        List<VideoPlacement.Companion> getCompList();

        VideoPlacement.CompanionOrBuilder getCompOrBuilder(int i10);

        List<? extends VideoPlacement.CompanionOrBuilder> getCompOrBuilderList();

        CompanionType getComptype(int i10);

        int getComptypeCount();

        List<CompanionType> getComptypeList();

        int getComptypeValue(int i10);

        List<Integer> getComptypeValueList();

        VideoCreativeType getCtype(int i10);

        int getCtypeCount();

        List<VideoCreativeType> getCtypeList();

        int getCtypeValue(int i10);

        List<Integer> getCtypeValueList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        int getDelay();

        DeliveryMethod getDelivery(int i10);

        int getDeliveryCount();

        List<DeliveryMethod> getDeliveryList();

        int getDeliveryValue(int i10);

        List<Integer> getDeliveryValueList();

        Struct getExt();

        e2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        int getH();

        LinearityMode getLinear();

        int getLinearValue();

        int getMaxbitr();

        int getMaxdur();

        int getMaxext();

        int getMaxseq();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        int getMinbitr();

        int getMindur();

        PlaybackCessationMode getPlayend();

        int getPlayendValue();

        PlaybackMethod getPlaymethod();

        int getPlaymethodValue();

        PlacementPosition getPos();

        int getPosValue();

        VideoPlacementType getPtype();

        int getPtypeValue();

        boolean getSkip();

        int getSkipafter();

        int getSkipmin();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Placement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.E;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Placement) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return super.equals(obj);
        }
        Placement placement = (Placement) obj;
        if (!getTagid().equals(placement.getTagid()) || getSsai() != placement.getSsai() || !getSdk().equals(placement.getSdk()) || !getSdkver().equals(placement.getSdkver()) || getReward() != placement.getReward() || !m4459getBcatList().equals(placement.m4459getBcatList()) || this.cattax_ != placement.cattax_ || !m4457getBadvList().equals(placement.m4457getBadvList()) || !m4458getBappList().equals(placement.m4458getBappList()) || !this.battr_.equals(placement.battr_) || !m4460getWlangList().equals(placement.m4460getWlangList()) || getSecure() != placement.getSecure() || getAdmx() != placement.getAdmx() || getCurlx() != placement.getCurlx() || hasDisplay() != placement.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(placement.getDisplay())) || hasVideo() != placement.hasVideo()) {
            return false;
        }
        if ((!hasVideo() || getVideo().equals(placement.getVideo())) && hasExt() == placement.hasExt()) {
            return (!hasExt() || getExt().equals(placement.getExt())) && getExtProtoList().equals(placement.getExtProtoList()) && this.unknownFields.equals(placement.unknownFields);
        }
        return false;
    }

    public boolean getAdmx() {
        return this.admx_;
    }

    public String getBadv(int i10) {
        return (String) this.badv_.get(i10);
    }

    public ByteString getBadvBytes(int i10) {
        return this.badv_.getByteString(i10);
    }

    public int getBadvCount() {
        return this.badv_.size();
    }

    public String getBapp(int i10) {
        return (String) this.bapp_.get(i10);
    }

    public ByteString getBappBytes(int i10) {
        return this.bapp_.getByteString(i10);
    }

    public int getBappCount() {
        return this.bapp_.size();
    }

    public CreativeAttribute getBattr(int i10) {
        return (CreativeAttribute) battr_converter_.convert(this.battr_.get(i10));
    }

    public int getBattrCount() {
        return this.battr_.size();
    }

    public List<CreativeAttribute> getBattrList() {
        return new j0.h(this.battr_, battr_converter_);
    }

    public int getBattrValue(int i10) {
        return this.battr_.get(i10).intValue();
    }

    public List<Integer> getBattrValueList() {
        return this.battr_;
    }

    public String getBcat(int i10) {
        return (String) this.bcat_.get(i10);
    }

    public ByteString getBcatBytes(int i10) {
        return this.bcat_.getByteString(i10);
    }

    public int getBcatCount() {
        return this.bcat_.size();
    }

    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
    }

    public int getCattaxValue() {
        return this.cattax_;
    }

    public boolean getCurlx() {
        return this.curlx_;
    }

    public DisplayPlacement getDisplay() {
        DisplayPlacement displayPlacement = this.display_;
        return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
    }

    public DisplayPlacementOrBuilder getDisplayOrBuilder() {
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

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    public boolean getReward() {
        return this.reward_;
    }

    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int iComputeStringSize = !getTagidBytes().isEmpty() ? h0.computeStringSize(1, this.tagid_) : 0;
        int i11 = this.ssai_;
        if (i11 != 0) {
            iComputeStringSize += n.Y(2, i11);
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(4, this.sdkver_);
        }
        boolean z10 = this.reward_;
        if (z10) {
            iComputeStringSize += n.e(5, z10);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i12 = 0; i12 < this.bcat_.size(); i12++) {
            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.bcat_.getRaw(i12));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + m4459getBcatList().size();
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size += n.l(7, this.cattax_);
        }
        int iComputeStringSizeNoTag2 = 0;
        for (int i13 = 0; i13 < this.badv_.size(); i13++) {
            iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.badv_.getRaw(i13));
        }
        int size2 = size + iComputeStringSizeNoTag2 + m4457getBadvList().size();
        int iComputeStringSizeNoTag3 = 0;
        for (int i14 = 0; i14 < this.bapp_.size(); i14++) {
            iComputeStringSizeNoTag3 += h0.computeStringSizeNoTag(this.bapp_.getRaw(i14));
        }
        int size3 = size2 + iComputeStringSizeNoTag3 + m4458getBappList().size();
        int iM = 0;
        for (int i15 = 0; i15 < this.battr_.size(); i15++) {
            iM += n.m(this.battr_.get(i15).intValue());
        }
        int iZ = size3 + iM;
        if (!getBattrList().isEmpty()) {
            iZ = iZ + 1 + n.Z(iM);
        }
        this.battrMemoizedSerializedSize = iM;
        int iComputeStringSizeNoTag4 = 0;
        for (int i16 = 0; i16 < this.wlang_.size(); i16++) {
            iComputeStringSizeNoTag4 += h0.computeStringSizeNoTag(this.wlang_.getRaw(i16));
        }
        int size4 = iZ + iComputeStringSizeNoTag4 + m4460getWlangList().size();
        boolean z11 = this.secure_;
        if (z11) {
            size4 += n.e(13, z11);
        }
        boolean z12 = this.admx_;
        if (z12) {
            size4 += n.e(14, z12);
        }
        boolean z13 = this.curlx_;
        if (z13) {
            size4 += n.e(15, z13);
        }
        if (this.display_ != null) {
            size4 += n.G(16, getDisplay());
        }
        if (this.video_ != null) {
            size4 += n.G(17, getVideo());
        }
        for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
            size4 += n.G(19, this.extProto_.get(i17));
        }
        if (this.ext_ != null) {
            size4 += n.G(20, getExt());
        }
        int serializedSize = size4 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public int getSsai() {
        return this.ssai_;
    }

    public String getTagid() {
        Object obj = this.tagid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tagid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTagidBytes() {
        Object obj = this.tagid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tagid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public VideoPlacement getVideo() {
        VideoPlacement videoPlacement = this.video_;
        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
    }

    public VideoPlacementOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    public String getWlang(int i10) {
        return (String) this.wlang_.get(i10);
    }

    public ByteString getWlangBytes(int i10) {
        return this.wlang_.getByteString(i10);
    }

    public int getWlangCount() {
        return this.wlang_.size();
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
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTagid().hashCode()) * 37) + 2) * 53) + getSsai()) * 37) + 3) * 53) + getSdk().hashCode()) * 37) + 4) * 53) + getSdkver().hashCode()) * 37) + 5) * 53) + j0.d(getReward());
        if (getBcatCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + m4459getBcatList().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 7) * 53) + this.cattax_;
        if (getBadvCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m4457getBadvList().hashCode();
        }
        if (getBappCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 10) * 53) + m4458getBappList().hashCode();
        }
        if (getBattrCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 11) * 53) + this.battr_.hashCode();
        }
        if (getWlangCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 12) * 53) + m4460getWlangList().hashCode();
        }
        int iD = (((((((((((iHashCode2 * 37) + 13) * 53) + j0.d(getSecure())) * 37) + 14) * 53) + j0.d(getAdmx())) * 37) + 15) * 53) + j0.d(getCurlx());
        if (hasDisplay()) {
            iD = (((iD * 37) + 16) * 53) + getDisplay().hashCode();
        }
        if (hasVideo()) {
            iD = (((iD * 37) + 17) * 53) + getVideo().hashCode();
        }
        if (hasExt()) {
            iD = (((iD * 37) + 20) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iD = (((iD * 37) + 19) * 53) + getExtProtoList().hashCode();
        }
        int iHashCode3 = (iD * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return b.F.d(Placement.class, Builder.class);
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
        return new Placement();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        getSerializedSize();
        if (!getTagidBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.tagid_);
        }
        int i10 = this.ssai_;
        if (i10 != 0) {
            nVar.W0(2, i10);
        }
        if (!getSdkBytes().isEmpty()) {
            h0.writeString(nVar, 3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.sdkver_);
        }
        boolean z10 = this.reward_;
        if (z10) {
            nVar.n0(5, z10);
        }
        for (int i11 = 0; i11 < this.bcat_.size(); i11++) {
            h0.writeString(nVar, 6, this.bcat_.getRaw(i11));
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            nVar.v0(7, this.cattax_);
        }
        for (int i12 = 0; i12 < this.badv_.size(); i12++) {
            h0.writeString(nVar, 9, this.badv_.getRaw(i12));
        }
        for (int i13 = 0; i13 < this.bapp_.size(); i13++) {
            h0.writeString(nVar, 10, this.bapp_.getRaw(i13));
        }
        if (getBattrList().size() > 0) {
            nVar.X0(90);
            nVar.X0(this.battrMemoizedSerializedSize);
        }
        for (int i14 = 0; i14 < this.battr_.size(); i14++) {
            nVar.w0(this.battr_.get(i14).intValue());
        }
        for (int i15 = 0; i15 < this.wlang_.size(); i15++) {
            h0.writeString(nVar, 12, this.wlang_.getRaw(i15));
        }
        boolean z11 = this.secure_;
        if (z11) {
            nVar.n0(13, z11);
        }
        boolean z12 = this.admx_;
        if (z12) {
            nVar.n0(14, z12);
        }
        boolean z13 = this.curlx_;
        if (z13) {
            nVar.n0(15, z13);
        }
        if (this.display_ != null) {
            nVar.J0(16, getDisplay());
        }
        if (this.video_ != null) {
            nVar.J0(17, getVideo());
        }
        for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
            nVar.J0(19, this.extProto_.get(i16));
        }
        if (this.ext_ != null) {
            nVar.J0(20, getExt());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static Builder newBuilder(Placement placement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(placement);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer, wVar);
    }

    /* JADX INFO: renamed from: getBadvList, reason: merged with bridge method [inline-methods] */
    public t1 m4457getBadvList() {
        return this.badv_;
    }

    /* JADX INFO: renamed from: getBappList, reason: merged with bridge method [inline-methods] */
    public t1 m4458getBappList() {
        return this.bapp_;
    }

    /* JADX INFO: renamed from: getBcatList, reason: merged with bridge method [inline-methods] */
    public t1 m4459getBcatList() {
        return this.bcat_;
    }

    /* JADX INFO: renamed from: getWlangList, reason: merged with bridge method [inline-methods] */
    public t1 m4460getWlangList() {
        return this.wlang_;
    }

    private Placement(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Placement parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Placement) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Placement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Placement parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Placement() {
        this.memoizedIsInitialized = (byte) -1;
        this.tagid_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        p0 p0Var = o0.f19269e;
        this.bcat_ = p0Var;
        this.cattax_ = 0;
        this.badv_ = p0Var;
        this.bapp_ = p0Var;
        List list = Collections.EMPTY_LIST;
        this.battr_ = list;
        this.wlang_ = p0Var;
        this.extProto_ = list;
    }

    public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Placement parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr, wVar);
    }

    public static Placement parseFrom(InputStream inputStream) throws IOException {
        return (Placement) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Placement) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Placement parseFrom(l lVar) throws IOException {
        return (Placement) h0.parseWithIOException(PARSER, lVar);
    }

    public static Placement parseFrom(l lVar, w wVar) throws IOException {
        return (Placement) h0.parseWithIOException(PARSER, lVar, wVar);
    }

    private Placement(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            this.tagid_ = lVar.J();
                            break;
                        case 16:
                            this.ssai_ = lVar.L();
                            break;
                        case 26:
                            this.sdk_ = lVar.J();
                            break;
                        case 34:
                            this.sdkver_ = lVar.J();
                            break;
                        case 40:
                            this.reward_ = lVar.q();
                            break;
                        case 50:
                            String strJ = lVar.J();
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.bcat_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.bcat_.add(strJ);
                            break;
                        case 56:
                            this.cattax_ = lVar.t();
                            break;
                        case 74:
                            String strJ2 = lVar.J();
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.badv_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.badv_.add(strJ2);
                            break;
                        case 82:
                            String strJ3 = lVar.J();
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 == 0) {
                                this.bapp_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.bapp_.add(strJ3);
                            break;
                        case 88:
                            int iT = lVar.t();
                            int i14 = (i10 == true ? 1 : 0) & 8;
                            i10 = i10;
                            if (i14 == 0) {
                                this.battr_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 8;
                            }
                            this.battr_.add(Integer.valueOf(iT));
                            break;
                        case 90:
                            int iP = lVar.p(lVar.C());
                            i10 = i10;
                            while (lVar.d() > 0) {
                                int iT2 = lVar.t();
                                if (((i10 == true ? 1 : 0) & 8) == 0) {
                                    this.battr_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.battr_.add(Integer.valueOf(iT2));
                                i10 = i10;
                            }
                            lVar.o(iP);
                            break;
                        case 98:
                            String strJ4 = lVar.J();
                            int i15 = (i10 == true ? 1 : 0) & 16;
                            i10 = i10;
                            if (i15 == 0) {
                                this.wlang_ = new o0();
                                i10 = (i10 == true ? 1 : 0) | 16;
                            }
                            this.wlang_.add(strJ4);
                            break;
                        case 104:
                            this.secure_ = lVar.q();
                            break;
                        case 112:
                            this.admx_ = lVar.q();
                            break;
                        case 120:
                            this.curlx_ = lVar.q();
                            break;
                        case 130:
                            DisplayPlacement displayPlacement = this.display_;
                            DisplayPlacement.Builder builder = displayPlacement != null ? displayPlacement.toBuilder() : null;
                            DisplayPlacement displayPlacement2 = (DisplayPlacement) lVar.A(DisplayPlacement.parser(), wVar);
                            this.display_ = displayPlacement2;
                            if (builder != null) {
                                builder.mergeFrom(displayPlacement2);
                                this.display_ = builder.buildPartial();
                            }
                            break;
                        case 138:
                            VideoPlacement videoPlacement = this.video_;
                            VideoPlacement.Builder builder2 = videoPlacement != null ? videoPlacement.toBuilder() : null;
                            VideoPlacement videoPlacement2 = (VideoPlacement) lVar.A(VideoPlacement.parser(), wVar);
                            this.video_ = videoPlacement2;
                            if (builder2 != null) {
                                builder2.mergeFrom(videoPlacement2);
                                this.video_ = builder2.buildPartial();
                            }
                            break;
                        case 154:
                            int i16 = (i10 == true ? 1 : 0) & 32;
                            i10 = i10;
                            if (i16 == 0) {
                                this.extProto_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 32;
                            }
                            this.extProto_.add((Any) lVar.A(Any.parser(), wVar));
                            break;
                        case 162:
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
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 4) != 0) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 8) != 0) {
                    this.battr_ = DesugarCollections.unmodifiableList(this.battr_);
                }
                if (((i10 == true ? 1 : 0) & 16) != 0) {
                    this.wlang_ = this.wlang_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 32) != 0) {
                    this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.bcat_ = this.bcat_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 2) != 0) {
            this.badv_ = this.badv_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 4) != 0) {
            this.bapp_ = this.bapp_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 8) != 0) {
            this.battr_ = DesugarCollections.unmodifiableList(this.battr_);
        }
        if (((i10 == true ? 1 : 0) & 16) != 0) {
            this.wlang_ = this.wlang_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 32) != 0) {
            this.extProto_ = DesugarCollections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
