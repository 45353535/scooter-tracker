package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o0;
import com.explorestack.protobuf.p0;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.t1;
import com.explorestack.protobuf.w;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SdkAnalyticContext extends h0 implements SdkAnalyticContextOrBuilder {
    public static final int APP_VER_FIELD_NUMBER = 13;
    public static final int BM_IFV_FIELD_NUMBER = 12;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    public static final int CONTYPE_FIELD_NUMBER = 10;
    public static final int DCID_FIELD_NUMBER = 15;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int EXPERIMENTS_FIELD_NUMBER = 17;
    public static final int EXT_FIELD_NUMBER = 16;
    public static final int GEO_FIELD_NUMBER = 5;
    public static final int HWV_FIELD_NUMBER = 20;
    public static final int IFA_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 11;
    public static final int MAKE_FIELD_NUMBER = 18;
    public static final int MODEL_FIELD_NUMBER = 19;
    public static final int OSV_FIELD_NUMBER = 4;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int SDKVER_FIELD_NUMBER = 7;
    public static final int SDK_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 14;
    public static final int SOURCE_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object appVer_;
    private volatile Object bmIfv_;
    private volatile Object bundle_;
    private int contype_;
    private volatile Object dcid_;
    private int deviceType_;
    private p0 experiments_;
    private Struct ext_;
    private Context.Geo geo_;
    private volatile Object hwv_;
    private volatile Object ifa_;
    private volatile Object ifv_;
    private volatile Object make_;
    private byte memoizedIsInitialized;
    private volatile Object model_;
    private int os_;
    private volatile Object osv_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private volatile Object sessionId_;
    private volatile Object sourceId_;
    private static final SdkAnalyticContext DEFAULT_INSTANCE = new SdkAnalyticContext();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.SdkAnalyticContext.1
        @Override // com.explorestack.protobuf.p1
        public SdkAnalyticContext parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new SdkAnalyticContext(lVar, wVar);
        }
    };

    public static final class Builder extends h0.b implements SdkAnalyticContextOrBuilder {
        private Object appVer_;
        private int bitField0_;
        private Object bmIfv_;
        private Object bundle_;
        private int contype_;
        private Object dcid_;
        private int deviceType_;
        private p0 experiments_;
        private a2 extBuilder_;
        private Struct ext_;
        private a2 geoBuilder_;
        private Context.Geo geo_;
        private Object hwv_;
        private Object ifa_;
        private Object ifv_;
        private Object make_;
        private Object model_;
        private int os_;
        private Object osv_;
        private Object sdk_;
        private Object sdkver_;
        private Object sessionId_;
        private Object sourceId_;

        private void ensureExperimentsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.experiments_ = new o0(this.experiments_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
        }

        private a2 getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private a2 getGeoFieldBuilder() {
            if (this.geoBuilder_ == null) {
                this.geoBuilder_ = new a2(getGeo(), getParentForChildren(), isClean());
                this.geo_ = null;
            }
            return this.geoBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder addAllExperiments(Iterable<String> iterable) {
            ensureExperimentsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.experiments_);
            onChanged();
            return this;
        }

        public Builder addExperiments(String str) {
            str.getClass();
            ensureExperimentsIsMutable();
            this.experiments_.add(str);
            onChanged();
            return this;
        }

        public Builder addExperimentsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureExperimentsIsMutable();
            this.experiments_.c(byteString);
            onChanged();
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = SdkAnalyticContext.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = SdkAnalyticContext.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = SdkAnalyticContext.getDefaultInstance().getBundle();
            onChanged();
            return this;
        }

        public Builder clearContype() {
            this.contype_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDcid() {
            this.dcid_ = SdkAnalyticContext.getDefaultInstance().getDcid();
            onChanged();
            return this;
        }

        public Builder clearDeviceType() {
            this.deviceType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearExperiments() {
            this.experiments_ = o0.f19269e;
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

        public Builder clearHwv() {
            this.hwv_ = SdkAnalyticContext.getDefaultInstance().getHwv();
            onChanged();
            return this;
        }

        public Builder clearIfa() {
            this.ifa_ = SdkAnalyticContext.getDefaultInstance().getIfa();
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = SdkAnalyticContext.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearMake() {
            this.make_ = SdkAnalyticContext.getDefaultInstance().getMake();
            onChanged();
            return this;
        }

        public Builder clearModel() {
            this.model_ = SdkAnalyticContext.getDefaultInstance().getModel();
            onChanged();
            return this;
        }

        public Builder clearOs() {
            this.os_ = 0;
            onChanged();
            return this;
        }

        public Builder clearOsv() {
            this.osv_ = SdkAnalyticContext.getDefaultInstance().getOsv();
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = SdkAnalyticContext.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = SdkAnalyticContext.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = SdkAnalyticContext.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        public Builder clearSourceId() {
            this.sourceId_ = SdkAnalyticContext.getDefaultInstance().getSourceId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ConnectionType getContype() {
            ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
            return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public int getContypeValue() {
            return this.contype_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getDcid() {
            Object obj = this.dcid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.dcid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getDcidBytes() {
            Object obj = this.dcid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dcid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
            return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public int getDeviceTypeValue() {
            return this.deviceType_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getExperiments(int i10) {
            return (String) this.experiments_.get(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getExperimentsBytes(int i10) {
            return this.experiments_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public int getExperimentsCount() {
            return this.experiments_.size();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
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

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public e2 getExtOrBuilder() {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public Context.Geo getGeo() {
            a2 a2Var = this.geoBuilder_;
            if (a2Var != null) {
                return (Context.Geo) a2Var.e();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        public Context.Geo.Builder getGeoBuilder() {
            onChanged();
            return (Context.Geo.Builder) getGeoFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public Context.GeoOrBuilder getGeoOrBuilder() {
            a2 a2Var = this.geoBuilder_;
            if (a2Var != null) {
                return (Context.GeoOrBuilder) a2Var.f();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getHwv() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.hwv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getIfa() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getMake() {
            Object obj = this.make_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.make_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.model_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public OS getOs() {
            OS osValueOf = OS.valueOf(this.os_);
            return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getOsv() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getSourceId() {
            Object obj = this.sourceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sourceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getSourceIdBytes() {
            Object obj = this.sourceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sourceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public boolean hasGeo() {
            return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable.d(SdkAnalyticContext.class, Builder.class);
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

        public Builder mergeGeo(Context.Geo geo) {
            a2 a2Var = this.geoBuilder_;
            if (a2Var != null) {
                a2Var.g(geo);
                return this;
            }
            Context.Geo geo2 = this.geo_;
            if (geo2 != null) {
                this.geo_ = Context.Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
            } else {
                this.geo_ = geo;
            }
            onChanged();
            return this;
        }

        public Builder setAppVer(String str) {
            str.getClass();
            this.appVer_ = str;
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appVer_ = byteString;
            onChanged();
            return this;
        }

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
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
            a.checkByteStringIsUtf8(byteString);
            this.bundle_ = byteString;
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

        public Builder setDcid(String str) {
            str.getClass();
            this.dcid_ = str;
            onChanged();
            return this;
        }

        public Builder setDcidBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.dcid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDeviceType(DeviceType deviceType) {
            deviceType.getClass();
            this.deviceType_ = deviceType.getNumber();
            onChanged();
            return this;
        }

        public Builder setDeviceTypeValue(int i10) {
            this.deviceType_ = i10;
            onChanged();
            return this;
        }

        public Builder setExperiments(int i10, String str) {
            str.getClass();
            ensureExperimentsIsMutable();
            this.experiments_.set(i10, str);
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

        public Builder setGeo(Context.Geo geo) {
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

        public Builder setHwv(String str) {
            str.getClass();
            this.hwv_ = str;
            onChanged();
            return this;
        }

        public Builder setHwvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.ifa_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
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
            a.checkByteStringIsUtf8(byteString);
            this.make_ = byteString;
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.osv_ = byteString;
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
            a.checkByteStringIsUtf8(byteString);
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
            a.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSourceId(String str) {
            str.getClass();
            this.sourceId_ = str;
            onChanged();
            return this;
        }

        public Builder setSourceIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sourceId_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public t1 getExperimentsList() {
            return this.experiments_.getUnmodifiableView();
        }

        private Builder() {
            this.sourceId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            this.experiments_ = o0.f19269e;
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SdkAnalyticContext build() {
            SdkAnalyticContext sdkAnalyticContextBuildPartial = buildPartial();
            if (sdkAnalyticContextBuildPartial.isInitialized()) {
                return sdkAnalyticContextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sdkAnalyticContextBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SdkAnalyticContext buildPartial() {
            SdkAnalyticContext sdkAnalyticContext = new SdkAnalyticContext(this);
            sdkAnalyticContext.sourceId_ = this.sourceId_;
            sdkAnalyticContext.bundle_ = this.bundle_;
            sdkAnalyticContext.os_ = this.os_;
            sdkAnalyticContext.osv_ = this.osv_;
            a2 a2Var = this.geoBuilder_;
            if (a2Var == null) {
                sdkAnalyticContext.geo_ = this.geo_;
            } else {
                sdkAnalyticContext.geo_ = (Context.Geo) a2Var.a();
            }
            sdkAnalyticContext.sdk_ = this.sdk_;
            sdkAnalyticContext.sdkver_ = this.sdkver_;
            sdkAnalyticContext.ifa_ = this.ifa_;
            sdkAnalyticContext.ifv_ = this.ifv_;
            sdkAnalyticContext.bmIfv_ = this.bmIfv_;
            sdkAnalyticContext.deviceType_ = this.deviceType_;
            sdkAnalyticContext.contype_ = this.contype_;
            sdkAnalyticContext.appVer_ = this.appVer_;
            sdkAnalyticContext.sessionId_ = this.sessionId_;
            sdkAnalyticContext.dcid_ = this.dcid_;
            a2 a2Var2 = this.extBuilder_;
            if (a2Var2 == null) {
                sdkAnalyticContext.ext_ = this.ext_;
            } else {
                sdkAnalyticContext.ext_ = (Struct) a2Var2.a();
            }
            if ((this.bitField0_ & 1) != 0) {
                this.experiments_ = this.experiments_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            sdkAnalyticContext.experiments_ = this.experiments_;
            sdkAnalyticContext.make_ = this.make_;
            sdkAnalyticContext.model_ = this.model_;
            sdkAnalyticContext.hwv_ = this.hwv_;
            onBuilt();
            return sdkAnalyticContext;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public SdkAnalyticContext getDefaultInstanceForType() {
            return SdkAnalyticContext.getDefaultInstance();
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
            this.sourceId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            this.experiments_ = o0.f19269e;
            this.bitField0_ &= -2;
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
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

        public Builder setGeo(Context.Geo.Builder builder) {
            a2 a2Var = this.geoBuilder_;
            if (a2Var == null) {
                this.geo_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SdkAnalyticContext) {
                return mergeFrom((SdkAnalyticContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SdkAnalyticContext sdkAnalyticContext) {
            if (sdkAnalyticContext == SdkAnalyticContext.getDefaultInstance()) {
                return this;
            }
            if (!sdkAnalyticContext.getSourceId().isEmpty()) {
                this.sourceId_ = sdkAnalyticContext.sourceId_;
                onChanged();
            }
            if (!sdkAnalyticContext.getBundle().isEmpty()) {
                this.bundle_ = sdkAnalyticContext.bundle_;
                onChanged();
            }
            if (sdkAnalyticContext.os_ != 0) {
                setOsValue(sdkAnalyticContext.getOsValue());
            }
            if (!sdkAnalyticContext.getOsv().isEmpty()) {
                this.osv_ = sdkAnalyticContext.osv_;
                onChanged();
            }
            if (sdkAnalyticContext.hasGeo()) {
                mergeGeo(sdkAnalyticContext.getGeo());
            }
            if (!sdkAnalyticContext.getSdk().isEmpty()) {
                this.sdk_ = sdkAnalyticContext.sdk_;
                onChanged();
            }
            if (!sdkAnalyticContext.getSdkver().isEmpty()) {
                this.sdkver_ = sdkAnalyticContext.sdkver_;
                onChanged();
            }
            if (!sdkAnalyticContext.getIfa().isEmpty()) {
                this.ifa_ = sdkAnalyticContext.ifa_;
                onChanged();
            }
            if (!sdkAnalyticContext.getIfv().isEmpty()) {
                this.ifv_ = sdkAnalyticContext.ifv_;
                onChanged();
            }
            if (!sdkAnalyticContext.getBmIfv().isEmpty()) {
                this.bmIfv_ = sdkAnalyticContext.bmIfv_;
                onChanged();
            }
            if (sdkAnalyticContext.deviceType_ != 0) {
                setDeviceTypeValue(sdkAnalyticContext.getDeviceTypeValue());
            }
            if (sdkAnalyticContext.contype_ != 0) {
                setContypeValue(sdkAnalyticContext.getContypeValue());
            }
            if (!sdkAnalyticContext.getAppVer().isEmpty()) {
                this.appVer_ = sdkAnalyticContext.appVer_;
                onChanged();
            }
            if (!sdkAnalyticContext.getSessionId().isEmpty()) {
                this.sessionId_ = sdkAnalyticContext.sessionId_;
                onChanged();
            }
            if (!sdkAnalyticContext.getDcid().isEmpty()) {
                this.dcid_ = sdkAnalyticContext.dcid_;
                onChanged();
            }
            if (sdkAnalyticContext.hasExt()) {
                mergeExt(sdkAnalyticContext.getExt());
            }
            if (!sdkAnalyticContext.experiments_.isEmpty()) {
                if (this.experiments_.isEmpty()) {
                    this.experiments_ = sdkAnalyticContext.experiments_;
                    this.bitField0_ &= -2;
                } else {
                    ensureExperimentsIsMutable();
                    this.experiments_.addAll(sdkAnalyticContext.experiments_);
                }
                onChanged();
            }
            if (!sdkAnalyticContext.getMake().isEmpty()) {
                this.make_ = sdkAnalyticContext.make_;
                onChanged();
            }
            if (!sdkAnalyticContext.getModel().isEmpty()) {
                this.model_ = sdkAnalyticContext.model_;
                onChanged();
            }
            if (!sdkAnalyticContext.getHwv().isEmpty()) {
                this.hwv_ = sdkAnalyticContext.hwv_;
                onChanged();
            }
            mergeUnknownFields(((h0) sdkAnalyticContext).unknownFields);
            onChanged();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.sourceId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            this.experiments_ = o0.f19269e;
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.SdkAnalyticContext.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.SdkAnalyticContext.access$2500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.SdkAnalyticContext r3 = (io.bidmachine.protobuf.SdkAnalyticContext) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.SdkAnalyticContext r4 = (io.bidmachine.protobuf.SdkAnalyticContext) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticContext.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.SdkAnalyticContext$Builder");
        }
    }

    public static SdkAnalyticContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SdkAnalyticContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticContext) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkAnalyticContext)) {
            return super.equals(obj);
        }
        SdkAnalyticContext sdkAnalyticContext = (SdkAnalyticContext) obj;
        if (!getSourceId().equals(sdkAnalyticContext.getSourceId()) || !getBundle().equals(sdkAnalyticContext.getBundle()) || this.os_ != sdkAnalyticContext.os_ || !getOsv().equals(sdkAnalyticContext.getOsv()) || hasGeo() != sdkAnalyticContext.hasGeo()) {
            return false;
        }
        if ((!hasGeo() || getGeo().equals(sdkAnalyticContext.getGeo())) && getSdk().equals(sdkAnalyticContext.getSdk()) && getSdkver().equals(sdkAnalyticContext.getSdkver()) && getIfa().equals(sdkAnalyticContext.getIfa()) && getIfv().equals(sdkAnalyticContext.getIfv()) && getBmIfv().equals(sdkAnalyticContext.getBmIfv()) && this.deviceType_ == sdkAnalyticContext.deviceType_ && this.contype_ == sdkAnalyticContext.contype_ && getAppVer().equals(sdkAnalyticContext.getAppVer()) && getSessionId().equals(sdkAnalyticContext.getSessionId()) && getDcid().equals(sdkAnalyticContext.getDcid()) && hasExt() == sdkAnalyticContext.hasExt()) {
            return (!hasExt() || getExt().equals(sdkAnalyticContext.getExt())) && getExperimentsList().equals(sdkAnalyticContext.getExperimentsList()) && getMake().equals(sdkAnalyticContext.getMake()) && getModel().equals(sdkAnalyticContext.getModel()) && getHwv().equals(sdkAnalyticContext.getHwv()) && this.unknownFields.equals(sdkAnalyticContext.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVer_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getBundle() {
        Object obj = this.bundle_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bundle_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getBundleBytes() {
        Object obj = this.bundle_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bundle_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ConnectionType getContype() {
        ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
        return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public int getContypeValue() {
        return this.contype_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getDcid() {
        Object obj = this.dcid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.dcid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getDcidBytes() {
        Object obj = this.dcid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.dcid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public DeviceType getDeviceType() {
        DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
        return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public int getDeviceTypeValue() {
        return this.deviceType_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getExperiments(int i10) {
        return (String) this.experiments_.get(i10);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getExperimentsBytes(int i10) {
        return this.experiments_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public int getExperimentsCount() {
        return this.experiments_.size();
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public e2 getExtOrBuilder() {
        return getExt();
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public Context.Geo getGeo() {
        Context.Geo geo = this.geo_;
        return geo == null ? Context.Geo.getDefaultInstance() : geo;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public Context.GeoOrBuilder getGeoOrBuilder() {
        return getGeo();
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getHwv() {
        Object obj = this.hwv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.hwv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getHwvBytes() {
        Object obj = this.hwv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.hwv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getIfa() {
        Object obj = this.ifa_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifa_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getIfaBytes() {
        Object obj = this.ifa_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifa_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getMake() {
        Object obj = this.make_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.make_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getMakeBytes() {
        Object obj = this.make_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.make_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getModel() {
        Object obj = this.model_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.model_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getModelBytes() {
        Object obj = this.model_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.model_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public OS getOs() {
        OS osValueOf = OS.valueOf(this.os_);
        return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public int getOsValue() {
        return this.os_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getOsv() {
        Object obj = this.osv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
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

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getSourceIdBytes().isEmpty() ? h0.computeStringSize(1, this.sourceId_) : 0;
        if (!getBundleBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            iComputeStringSize += n.l(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(4, this.osv_);
        }
        if (this.geo_ != null) {
            iComputeStringSize += n.G(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            iComputeStringSize += n.l(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            iComputeStringSize += n.l(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(14, this.sessionId_);
        }
        if (!getDcidBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(15, this.dcid_);
        }
        if (this.ext_ != null) {
            iComputeStringSize += n.G(16, getExt());
        }
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.experiments_.size(); i11++) {
            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.experiments_.getRaw(i11));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + (getExperimentsList().size() * 2);
        if (!getMakeBytes().isEmpty()) {
            size += h0.computeStringSize(18, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            size += h0.computeStringSize(19, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            size += h0.computeStringSize(20, this.hwv_);
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getSourceId() {
        Object obj = this.sourceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sourceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getSourceIdBytes() {
        Object obj = this.sourceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sourceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public boolean hasGeo() {
        return this.geo_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSourceId().hashCode()) * 37) + 2) * 53) + getBundle().hashCode()) * 37) + 3) * 53) + this.os_) * 37) + 4) * 53) + getOsv().hashCode();
        if (hasGeo()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getGeo().hashCode();
        }
        int iHashCode2 = (((((((((((((((((((((((((((((((((((((((iHashCode * 37) + 6) * 53) + getSdk().hashCode()) * 37) + 7) * 53) + getSdkver().hashCode()) * 37) + 8) * 53) + getIfa().hashCode()) * 37) + 11) * 53) + getIfv().hashCode()) * 37) + 12) * 53) + getBmIfv().hashCode()) * 37) + 9) * 53) + this.deviceType_) * 37) + 10) * 53) + this.contype_) * 37) + 13) * 53) + getAppVer().hashCode()) * 37) + 14) * 53) + getSessionId().hashCode()) * 37) + 15) * 53) + getDcid().hashCode();
        if (hasExt()) {
            iHashCode2 = (((iHashCode2 * 37) + 16) * 53) + getExt().hashCode();
        }
        if (getExperimentsCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 17) * 53) + getExperimentsList().hashCode();
        }
        int iHashCode3 = (((((((((((((iHashCode2 * 37) + 18) * 53) + getMake().hashCode()) * 37) + 19) * 53) + getModel().hashCode()) * 37) + 20) * 53) + getHwv().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable.d(SdkAnalyticContext.class, Builder.class);
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
        return new SdkAnalyticContext();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getSourceIdBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.sourceId_);
        }
        if (!getBundleBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            nVar.v0(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.osv_);
        }
        if (this.geo_ != null) {
            nVar.J0(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            h0.writeString(nVar, 6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            h0.writeString(nVar, 7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            h0.writeString(nVar, 8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            nVar.v0(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            nVar.v0(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            h0.writeString(nVar, 11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            h0.writeString(nVar, 12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            h0.writeString(nVar, 13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            h0.writeString(nVar, 14, this.sessionId_);
        }
        if (!getDcidBytes().isEmpty()) {
            h0.writeString(nVar, 15, this.dcid_);
        }
        if (this.ext_ != null) {
            nVar.J0(16, getExt());
        }
        for (int i10 = 0; i10 < this.experiments_.size(); i10++) {
            h0.writeString(nVar, 17, this.experiments_.getRaw(i10));
        }
        if (!getMakeBytes().isEmpty()) {
            h0.writeString(nVar, 18, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            h0.writeString(nVar, 19, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            h0.writeString(nVar, 20, this.hwv_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static Builder newBuilder(SdkAnalyticContext sdkAnalyticContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sdkAnalyticContext);
    }

    public static SdkAnalyticContext parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(byteBuffer, wVar);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public t1 getExperimentsList() {
        return this.experiments_;
    }

    private SdkAnalyticContext(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SdkAnalyticContext parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (SdkAnalyticContext) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static SdkAnalyticContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SdkAnalyticContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SdkAnalyticContext parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SdkAnalyticContext() {
        this.memoizedIsInitialized = (byte) -1;
        this.sourceId_ = "";
        this.bundle_ = "";
        this.os_ = 0;
        this.osv_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        this.ifa_ = "";
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.deviceType_ = 0;
        this.contype_ = 0;
        this.appVer_ = "";
        this.sessionId_ = "";
        this.dcid_ = "";
        this.experiments_ = o0.f19269e;
        this.make_ = "";
        this.model_ = "";
        this.hwv_ = "";
    }

    public static SdkAnalyticContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static SdkAnalyticContext parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(bArr, wVar);
    }

    public static SdkAnalyticContext parseFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticContext) h0.parseWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticContext parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (SdkAnalyticContext) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static SdkAnalyticContext parseFrom(l lVar) throws IOException {
        return (SdkAnalyticContext) h0.parseWithIOException(PARSER, lVar);
    }

    public static SdkAnalyticContext parseFrom(l lVar, w wVar) throws IOException {
        return (SdkAnalyticContext) h0.parseWithIOException(PARSER, lVar, wVar);
    }

    private SdkAnalyticContext(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                        case 10:
                            this.sourceId_ = lVar.J();
                            break;
                        case 18:
                            this.bundle_ = lVar.J();
                            break;
                        case 24:
                            this.os_ = lVar.t();
                            break;
                        case 34:
                            this.osv_ = lVar.J();
                            break;
                        case 42:
                            Context.Geo geo = this.geo_;
                            Context.Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                            Context.Geo geo2 = (Context.Geo) lVar.A(Context.Geo.parser(), wVar);
                            this.geo_ = geo2;
                            if (builder != null) {
                                builder.mergeFrom(geo2);
                                this.geo_ = builder.buildPartial();
                            }
                            break;
                        case 50:
                            this.sdk_ = lVar.J();
                            break;
                        case 58:
                            this.sdkver_ = lVar.J();
                            break;
                        case 66:
                            this.ifa_ = lVar.J();
                            break;
                        case 72:
                            this.deviceType_ = lVar.t();
                            break;
                        case 80:
                            this.contype_ = lVar.t();
                            break;
                        case 90:
                            this.ifv_ = lVar.J();
                            break;
                        case 98:
                            this.bmIfv_ = lVar.J();
                            break;
                        case 106:
                            this.appVer_ = lVar.J();
                            break;
                        case 114:
                            this.sessionId_ = lVar.J();
                            break;
                        case 122:
                            this.dcid_ = lVar.J();
                            break;
                        case 130:
                            Struct struct = this.ext_;
                            Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.ext_ = struct2;
                            if (builder2 != null) {
                                builder2.mergeFrom(struct2);
                                this.ext_ = builder2.buildPartial();
                            }
                            break;
                        case 138:
                            String strJ = lVar.J();
                            z11 = z11;
                            if (!z11) {
                                this.experiments_ = new o0();
                                z11 = true;
                            }
                            this.experiments_.add(strJ);
                            break;
                        case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                            this.make_ = lVar.J();
                            break;
                        case 154:
                            this.model_ = lVar.J();
                            break;
                        case 162:
                            this.hwv_ = lVar.J();
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
                    this.experiments_ = this.experiments_.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.experiments_ = this.experiments_.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
