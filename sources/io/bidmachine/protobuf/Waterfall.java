package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.DoubleValue;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.d2;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.n2;
import com.explorestack.protobuf.o2;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.q;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import io.bidmachine.protobuf.AdExtension;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class Waterfall extends h0 implements WaterfallOrBuilder {
    private static final Waterfall DEFAULT_INSTANCE = new Waterfall();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.1
        @Override // com.explorestack.protobuf.p1
        public Waterfall parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Waterfall(lVar, wVar);
        }
    };
    public static final int REQUEST_FIELD_NUMBER = 1;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;

    /* JADX INFO: renamed from: io.bidmachine.protobuf.Waterfall$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase = iArr;
            try {
                iArr[PayloadCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[PayloadCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class Configuration extends h0 implements ConfigurationOrBuilder {
        public static final int AD_UNITS_FIELD_NUMBER = 8;
        public static final int CACHE_SIZE_FIELD_NUMBER = 7;
        public static final int FORMAT_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MAX_RETRY_DEGREE_FIELD_NUMBER = 6;
        public static final int REFRESH_TIMEOUT_FIELD_NUMBER = 3;
        public static final int REFRESH_URL_FIELD_NUMBER = 4;
        public static final int RETRY_BASE_FIELD_NUMBER = 5;
        public static final int SERVER_PARAMS_FIELD_NUMBER = 10;
        public static final int SHOULD_BREAK_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private List<AdUnit> adUnits_;
        private UInt32Value cacheSize_;
        private volatile Object format_;
        private volatile Object id_;
        private UInt32Value maxRetryDegree_;
        private byte memoizedIsInitialized;
        private UInt64Value refreshTimeout_;
        private StringValue refreshUrl_;
        private UInt32Value retryBase_;
        private StringValue serverParams_;
        private boolean shouldBreak_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.Configuration.1
            @Override // com.explorestack.protobuf.p1
            public Configuration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Configuration(lVar, wVar);
            }
        };

        public static final class AdUnit extends h0 implements AdUnitOrBuilder {
            public static final int AD_UNIT_ID_FIELD_NUMBER = 3;
            public static final int CUSTOM_TARGETING_FIELD_NUMBER = 6;
            public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
            public static final int OVERRIDE_CALLBACKS_FIELD_NUMBER = 1;
            public static final int PRICE_FIELD_NUMBER = 5;
            public static final int REQUEST_AGENT_FIELD_NUMBER = 4;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 9;
            public static final int SLEEP_TIME_AFTER_FIELD_NUMBER = 8;
            public static final int SLEEP_TIME_BEFORE_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private volatile Object adUnitId_;
            private w0 customTargeting_;
            private int expirationTime_;
            private byte memoizedIsInitialized;
            private boolean overrideCallbacks_;
            private double price_;
            private volatile Object requestAgent_;
            private StringValue serverParams_;
            private UInt32Value sleepTimeAfter_;
            private UInt32Value sleepTimeBefore_;
            private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.1
                @Override // com.explorestack.protobuf.p1
                public AdUnit parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new AdUnit(lVar, wVar);
                }
            };

            private static final class CustomTargetingDefaultEntryHolder {
                static final u0 defaultEntry;

                static {
                    Descriptors.Descriptor descriptor = WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_CustomTargetingEntry_descriptor;
                    z2.b bVar = z2.b.f19481l;
                    defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
                }

                private CustomTargetingDefaultEntryHolder() {
                }
            }

            public static AdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public w0 internalGetCustomTargeting() {
                w0 w0Var = this.customTargeting_;
                return w0Var == null ? w0.g(CustomTargetingDefaultEntryHolder.defaultEntry) : w0Var;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean containsCustomTargeting(String str) {
                str.getClass();
                return internalGetCustomTargeting().i().containsKey(str);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdUnit)) {
                    return super.equals(obj);
                }
                AdUnit adUnit = (AdUnit) obj;
                if (getOverrideCallbacks() != adUnit.getOverrideCallbacks() || getExpirationTime() != adUnit.getExpirationTime() || !getAdUnitId().equals(adUnit.getAdUnitId()) || !getRequestAgent().equals(adUnit.getRequestAgent()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(adUnit.getPrice()) || !internalGetCustomTargeting().equals(adUnit.internalGetCustomTargeting()) || hasSleepTimeBefore() != adUnit.hasSleepTimeBefore()) {
                    return false;
                }
                if ((hasSleepTimeBefore() && !getSleepTimeBefore().equals(adUnit.getSleepTimeBefore())) || hasSleepTimeAfter() != adUnit.hasSleepTimeAfter()) {
                    return false;
                }
                if ((!hasSleepTimeAfter() || getSleepTimeAfter().equals(adUnit.getSleepTimeAfter())) && hasServerParams() == adUnit.hasServerParams()) {
                    return (!hasServerParams() || getServerParams().equals(adUnit.getServerParams())) && this.unknownFields.equals(adUnit.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adUnitId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getCustomTargeting() {
                return getCustomTargetingMap();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public int getCustomTargetingCount() {
                return internalGetCustomTargeting().i().size();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public Map<String, String> getCustomTargetingMap() {
                return internalGetCustomTargeting().i();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getCustomTargetingOrDefault(String str, String str2) {
                str.getClass();
                Map mapI = internalGetCustomTargeting().i();
                return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getCustomTargetingOrThrow(String str) {
                str.getClass();
                Map mapI = internalGetCustomTargeting().i();
                if (mapI.containsKey(str)) {
                    return (String) mapI.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public int getExpirationTime() {
                return this.expirationTime_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean getOverrideCallbacks() {
                return this.overrideCallbacks_;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public String getRequestAgent() {
                Object obj = this.requestAgent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.requestAgent_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public ByteString getRequestAgentBytes() {
                Object obj = this.requestAgent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.requestAgent_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                boolean z10 = this.overrideCallbacks_;
                int iE = z10 ? n.e(1, z10) : 0;
                int i11 = this.expirationTime_;
                if (i11 != 0) {
                    iE += n.Y(2, i11);
                }
                if (!getAdUnitIdBytes().isEmpty()) {
                    iE += h0.computeStringSize(3, this.adUnitId_);
                }
                if (!getRequestAgentBytes().isEmpty()) {
                    iE += h0.computeStringSize(4, this.requestAgent_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iE += n.j(5, d10);
                }
                for (Map.Entry entry : internalGetCustomTargeting().i().entrySet()) {
                    iE += n.G(6, CustomTargetingDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
                }
                if (this.sleepTimeBefore_ != null) {
                    iE += n.G(7, getSleepTimeBefore());
                }
                if (this.sleepTimeAfter_ != null) {
                    iE += n.G(8, getSleepTimeAfter());
                }
                if (this.serverParams_ != null) {
                    iE += n.G(9, getServerParams());
                }
                int serializedSize = iE + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public d2 getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public UInt32Value getSleepTimeAfter() {
                UInt32Value uInt32Value = this.sleepTimeAfter_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public n2 getSleepTimeAfterOrBuilder() {
                return getSleepTimeAfter();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public UInt32Value getSleepTimeBefore() {
                UInt32Value uInt32Value = this.sleepTimeBefore_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public n2 getSleepTimeBeforeOrBuilder() {
                return getSleepTimeBefore();
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasServerParams() {
                return this.serverParams_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasSleepTimeAfter() {
                return this.sleepTimeAfter_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
            public boolean hasSleepTimeBefore() {
                return this.sleepTimeBefore_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getOverrideCallbacks())) * 37) + 2) * 53) + getExpirationTime()) * 37) + 3) * 53) + getAdUnitId().hashCode()) * 37) + 4) * 53) + getRequestAgent().hashCode()) * 37) + 5) * 53) + j0.i(Double.doubleToLongBits(getPrice()));
                if (!internalGetCustomTargeting().i().isEmpty()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + internalGetCustomTargeting().hashCode();
                }
                if (hasSleepTimeBefore()) {
                    iHashCode = (((iHashCode * 37) + 7) * 53) + getSleepTimeBefore().hashCode();
                }
                if (hasSleepTimeAfter()) {
                    iHashCode = (((iHashCode * 37) + 8) * 53) + getSleepTimeAfter().hashCode();
                }
                if (hasServerParams()) {
                    iHashCode = (((iHashCode * 37) + 9) * 53) + getServerParams().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_fieldAccessorTable.d(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.h0
            protected w0 internalGetMapField(int i10) {
                if (i10 == 6) {
                    return internalGetCustomTargeting();
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
                return new AdUnit();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                boolean z10 = this.overrideCallbacks_;
                if (z10) {
                    nVar.n0(1, z10);
                }
                int i10 = this.expirationTime_;
                if (i10 != 0) {
                    nVar.W0(2, i10);
                }
                if (!getAdUnitIdBytes().isEmpty()) {
                    h0.writeString(nVar, 3, this.adUnitId_);
                }
                if (!getRequestAgentBytes().isEmpty()) {
                    h0.writeString(nVar, 4, this.requestAgent_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    nVar.t0(5, d10);
                }
                h0.serializeStringMapTo(nVar, internalGetCustomTargeting(), CustomTargetingDefaultEntryHolder.defaultEntry, 6);
                if (this.sleepTimeBefore_ != null) {
                    nVar.J0(7, getSleepTimeBefore());
                }
                if (this.sleepTimeAfter_ != null) {
                    nVar.J0(8, getSleepTimeAfter());
                }
                if (this.serverParams_ != null) {
                    nVar.J0(9, getServerParams());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements AdUnitOrBuilder {
                private Object adUnitId_;
                private int bitField0_;
                private w0 customTargeting_;
                private int expirationTime_;
                private boolean overrideCallbacks_;
                private double price_;
                private Object requestAgent_;
                private a2 serverParamsBuilder_;
                private StringValue serverParams_;
                private a2 sleepTimeAfterBuilder_;
                private UInt32Value sleepTimeAfter_;
                private a2 sleepTimeBeforeBuilder_;
                private UInt32Value sleepTimeBefore_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_descriptor;
                }

                private a2 getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new a2(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private a2 getSleepTimeAfterFieldBuilder() {
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfterBuilder_ = new a2(getSleepTimeAfter(), getParentForChildren(), isClean());
                        this.sleepTimeAfter_ = null;
                    }
                    return this.sleepTimeAfterBuilder_;
                }

                private a2 getSleepTimeBeforeFieldBuilder() {
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBeforeBuilder_ = new a2(getSleepTimeBefore(), getParentForChildren(), isClean());
                        this.sleepTimeBefore_ = null;
                    }
                    return this.sleepTimeBeforeBuilder_;
                }

                private w0 internalGetCustomTargeting() {
                    w0 w0Var = this.customTargeting_;
                    return w0Var == null ? w0.g(CustomTargetingDefaultEntryHolder.defaultEntry) : w0Var;
                }

                private w0 internalGetMutableCustomTargeting() {
                    onChanged();
                    if (this.customTargeting_ == null) {
                        this.customTargeting_ = w0.p(CustomTargetingDefaultEntryHolder.defaultEntry);
                    }
                    if (!this.customTargeting_.m()) {
                        this.customTargeting_ = this.customTargeting_.f();
                    }
                    return this.customTargeting_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = AdUnit.getDefaultInstance().getAdUnitId();
                    onChanged();
                    return this;
                }

                public Builder clearCustomTargeting() {
                    internalGetMutableCustomTargeting().l().clear();
                    return this;
                }

                public Builder clearExpirationTime() {
                    this.expirationTime_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearOverrideCallbacks() {
                    this.overrideCallbacks_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearRequestAgent() {
                    this.requestAgent_ = AdUnit.getDefaultInstance().getRequestAgent();
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                public Builder clearSleepTimeAfter() {
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfter_ = null;
                        onChanged();
                        return this;
                    }
                    this.sleepTimeAfter_ = null;
                    this.sleepTimeAfterBuilder_ = null;
                    return this;
                }

                public Builder clearSleepTimeBefore() {
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBefore_ = null;
                        onChanged();
                        return this;
                    }
                    this.sleepTimeBefore_ = null;
                    this.sleepTimeBeforeBuilder_ = null;
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean containsCustomTargeting(String str) {
                    str.getClass();
                    return internalGetCustomTargeting().i().containsKey(str);
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adUnitId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                @Deprecated
                public Map<String, String> getCustomTargeting() {
                    return getCustomTargetingMap();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public int getCustomTargetingCount() {
                    return internalGetCustomTargeting().i().size();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public Map<String, String> getCustomTargetingMap() {
                    return internalGetCustomTargeting().i();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getCustomTargetingOrDefault(String str, String str2) {
                    str.getClass();
                    Map mapI = internalGetCustomTargeting().i();
                    return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getCustomTargetingOrThrow(String str) {
                    str.getClass();
                    Map mapI = internalGetCustomTargeting().i();
                    if (mapI.containsKey(str)) {
                        return (String) mapI.get(str);
                    }
                    throw new IllegalArgumentException();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_descriptor;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public int getExpirationTime() {
                    return this.expirationTime_;
                }

                @Deprecated
                public Map<String, String> getMutableCustomTargeting() {
                    return internalGetMutableCustomTargeting().l();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean getOverrideCallbacks() {
                    return this.overrideCallbacks_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public String getRequestAgent() {
                    Object obj = this.requestAgent_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.requestAgent_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public ByteString getRequestAgentBytes() {
                    Object obj = this.requestAgent_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.requestAgent_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public StringValue getServerParams() {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return (StringValue.Builder) getServerParamsFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public d2 getServerParamsOrBuilder() {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public UInt32Value getSleepTimeAfter() {
                    a2 a2Var = this.sleepTimeAfterBuilder_;
                    if (a2Var != null) {
                        return (UInt32Value) a2Var.e();
                    }
                    UInt32Value uInt32Value = this.sleepTimeAfter_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                public UInt32Value.Builder getSleepTimeAfterBuilder() {
                    onChanged();
                    return (UInt32Value.Builder) getSleepTimeAfterFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public n2 getSleepTimeAfterOrBuilder() {
                    a2 a2Var = this.sleepTimeAfterBuilder_;
                    if (a2Var != null) {
                        return (n2) a2Var.f();
                    }
                    UInt32Value uInt32Value = this.sleepTimeAfter_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public UInt32Value getSleepTimeBefore() {
                    a2 a2Var = this.sleepTimeBeforeBuilder_;
                    if (a2Var != null) {
                        return (UInt32Value) a2Var.e();
                    }
                    UInt32Value uInt32Value = this.sleepTimeBefore_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                public UInt32Value.Builder getSleepTimeBeforeBuilder() {
                    onChanged();
                    return (UInt32Value.Builder) getSleepTimeBeforeFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public n2 getSleepTimeBeforeOrBuilder() {
                    a2 a2Var = this.sleepTimeBeforeBuilder_;
                    if (a2Var != null) {
                        return (n2) a2Var.f();
                    }
                    UInt32Value uInt32Value = this.sleepTimeBefore_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasServerParams() {
                    return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasSleepTimeAfter() {
                    return (this.sleepTimeAfterBuilder_ == null && this.sleepTimeAfter_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Configuration.AdUnitOrBuilder
                public boolean hasSleepTimeBefore() {
                    return (this.sleepTimeBeforeBuilder_ == null && this.sleepTimeBefore_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_fieldAccessorTable.d(AdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected w0 internalGetMapField(int i10) {
                    if (i10 == 6) {
                        return internalGetCustomTargeting();
                    }
                    throw new RuntimeException("Invalid map field number: " + i10);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected w0 internalGetMutableMapField(int i10) {
                    if (i10 == 6) {
                        return internalGetMutableCustomTargeting();
                    }
                    throw new RuntimeException("Invalid map field number: " + i10);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.serverParams_;
                    if (stringValue2 != null) {
                        this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.serverParams_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeSleepTimeAfter(UInt32Value uInt32Value) {
                    a2 a2Var = this.sleepTimeAfterBuilder_;
                    if (a2Var != null) {
                        a2Var.g(uInt32Value);
                        return this;
                    }
                    UInt32Value uInt32Value2 = this.sleepTimeAfter_;
                    if (uInt32Value2 != null) {
                        this.sleepTimeAfter_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.sleepTimeAfter_ = uInt32Value;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeSleepTimeBefore(UInt32Value uInt32Value) {
                    a2 a2Var = this.sleepTimeBeforeBuilder_;
                    if (a2Var != null) {
                        a2Var.g(uInt32Value);
                        return this;
                    }
                    UInt32Value uInt32Value2 = this.sleepTimeBefore_;
                    if (uInt32Value2 != null) {
                        this.sleepTimeBefore_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.sleepTimeBefore_ = uInt32Value;
                    }
                    onChanged();
                    return this;
                }

                public Builder putAllCustomTargeting(Map<String, String> map) {
                    internalGetMutableCustomTargeting().l().putAll(map);
                    return this;
                }

                public Builder putCustomTargeting(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    internalGetMutableCustomTargeting().l().put(str, str2);
                    return this;
                }

                public Builder removeCustomTargeting(String str) {
                    str.getClass();
                    internalGetMutableCustomTargeting().l().remove(str);
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setExpirationTime(int i10) {
                    this.expirationTime_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setOverrideCallbacks(boolean z10) {
                    this.overrideCallbacks_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setRequestAgent(String str) {
                    str.getClass();
                    this.requestAgent_ = str;
                    onChanged();
                    return this;
                }

                public Builder setRequestAgentBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.requestAgent_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.serverParams_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setSleepTimeAfter(UInt32Value uInt32Value) {
                    a2 a2Var = this.sleepTimeAfterBuilder_;
                    if (a2Var != null) {
                        a2Var.i(uInt32Value);
                        return this;
                    }
                    uInt32Value.getClass();
                    this.sleepTimeAfter_ = uInt32Value;
                    onChanged();
                    return this;
                }

                public Builder setSleepTimeBefore(UInt32Value uInt32Value) {
                    a2 a2Var = this.sleepTimeBeforeBuilder_;
                    if (a2Var != null) {
                        a2Var.i(uInt32Value);
                        return this;
                    }
                    uInt32Value.getClass();
                    this.sleepTimeBefore_ = uInt32Value;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit build() {
                    AdUnit adUnitBuildPartial = buildPartial();
                    if (adUnitBuildPartial.isInitialized()) {
                        return adUnitBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit buildPartial() {
                    AdUnit adUnit = new AdUnit(this);
                    adUnit.overrideCallbacks_ = this.overrideCallbacks_;
                    adUnit.expirationTime_ = this.expirationTime_;
                    adUnit.adUnitId_ = this.adUnitId_;
                    adUnit.requestAgent_ = this.requestAgent_;
                    adUnit.price_ = this.price_;
                    adUnit.customTargeting_ = internalGetCustomTargeting();
                    adUnit.customTargeting_.n();
                    a2 a2Var = this.sleepTimeBeforeBuilder_;
                    if (a2Var == null) {
                        adUnit.sleepTimeBefore_ = this.sleepTimeBefore_;
                    } else {
                        adUnit.sleepTimeBefore_ = (UInt32Value) a2Var.a();
                    }
                    a2 a2Var2 = this.sleepTimeAfterBuilder_;
                    if (a2Var2 == null) {
                        adUnit.sleepTimeAfter_ = this.sleepTimeAfter_;
                    } else {
                        adUnit.sleepTimeAfter_ = (UInt32Value) a2Var2.a();
                    }
                    a2 a2Var3 = this.serverParamsBuilder_;
                    if (a2Var3 == null) {
                        adUnit.serverParams_ = this.serverParams_;
                    } else {
                        adUnit.serverParams_ = (StringValue) a2Var3.a();
                    }
                    onBuilt();
                    return adUnit;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public AdUnit getDefaultInstanceForType() {
                    return AdUnit.getDefaultInstance();
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
                    this.overrideCallbacks_ = false;
                    this.expirationTime_ = 0;
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    this.price_ = 0.0d;
                    internalGetMutableCustomTargeting().a();
                    if (this.sleepTimeBeforeBuilder_ == null) {
                        this.sleepTimeBefore_ = null;
                    } else {
                        this.sleepTimeBefore_ = null;
                        this.sleepTimeBeforeBuilder_ = null;
                    }
                    if (this.sleepTimeAfterBuilder_ == null) {
                        this.sleepTimeAfter_ = null;
                    } else {
                        this.sleepTimeAfter_ = null;
                        this.sleepTimeAfterBuilder_ = null;
                    }
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var == null) {
                        this.serverParams_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setSleepTimeAfter(UInt32Value.Builder builder) {
                    a2 a2Var = this.sleepTimeAfterBuilder_;
                    if (a2Var == null) {
                        this.sleepTimeAfter_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setSleepTimeBefore(UInt32Value.Builder builder) {
                    a2 a2Var = this.sleepTimeBeforeBuilder_;
                    if (a2Var == null) {
                        this.sleepTimeBefore_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.adUnitId_ = "";
                    this.requestAgent_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AdUnit) {
                        return mergeFrom((AdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AdUnit adUnit) {
                    if (adUnit == AdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (adUnit.getOverrideCallbacks()) {
                        setOverrideCallbacks(adUnit.getOverrideCallbacks());
                    }
                    if (adUnit.getExpirationTime() != 0) {
                        setExpirationTime(adUnit.getExpirationTime());
                    }
                    if (!adUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = adUnit.adUnitId_;
                        onChanged();
                    }
                    if (!adUnit.getRequestAgent().isEmpty()) {
                        this.requestAgent_ = adUnit.requestAgent_;
                        onChanged();
                    }
                    if (adUnit.getPrice() != 0.0d) {
                        setPrice(adUnit.getPrice());
                    }
                    internalGetMutableCustomTargeting().o(adUnit.internalGetCustomTargeting());
                    if (adUnit.hasSleepTimeBefore()) {
                        mergeSleepTimeBefore(adUnit.getSleepTimeBefore());
                    }
                    if (adUnit.hasSleepTimeAfter()) {
                        mergeSleepTimeAfter(adUnit.getSleepTimeAfter());
                    }
                    if (adUnit.hasServerParams()) {
                        mergeServerParams(adUnit.getServerParams());
                    }
                    mergeUnknownFields(((h0) adUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.access$1500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Configuration$AdUnit r3 = (io.bidmachine.protobuf.Waterfall.Configuration.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.Waterfall$Configuration$AdUnit r4 = (io.bidmachine.protobuf.Waterfall.Configuration.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Configuration.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Configuration$AdUnit$Builder");
                }
            }

            public static Builder newBuilder(AdUnit adUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteBuffer, wVar);
            }

            private AdUnit(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (AdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdUnit parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
                this.requestAgent_ = "";
            }

            public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static AdUnit parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(bArr, wVar);
            }

            public static AdUnit parseFrom(InputStream inputStream) throws IOException {
                return (AdUnit) h0.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private AdUnit(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.overrideCallbacks_ = lVar.q();
                                } else if (iK == 16) {
                                    this.expirationTime_ = lVar.L();
                                } else if (iK == 26) {
                                    this.adUnitId_ = lVar.J();
                                } else if (iK == 34) {
                                    this.requestAgent_ = lVar.J();
                                } else if (iK == 41) {
                                    this.price_ = lVar.s();
                                } else if (iK != 50) {
                                    if (iK == 58) {
                                        UInt32Value uInt32Value = this.sleepTimeBefore_;
                                        UInt32Value.Builder builder = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                        UInt32Value uInt32Value2 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                        this.sleepTimeBefore_ = uInt32Value2;
                                        if (builder != null) {
                                            builder.mergeFrom(uInt32Value2);
                                            this.sleepTimeBefore_ = builder.buildPartial();
                                        }
                                    } else if (iK == 66) {
                                        UInt32Value uInt32Value3 = this.sleepTimeAfter_;
                                        UInt32Value.Builder builder2 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                        UInt32Value uInt32Value4 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                        this.sleepTimeAfter_ = uInt32Value4;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(uInt32Value4);
                                            this.sleepTimeAfter_ = builder2.buildPartial();
                                        }
                                    } else if (iK != 74) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        StringValue stringValue = this.serverParams_;
                                        StringValue.Builder builder3 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                        this.serverParams_ = stringValue2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(stringValue2);
                                            this.serverParams_ = builder3.buildPartial();
                                        }
                                    }
                                } else {
                                    if (b10 == false) {
                                        this.customTargeting_ = w0.p(CustomTargetingDefaultEntryHolder.defaultEntry);
                                        b10 = true;
                                    }
                                    u0 u0Var = (u0) lVar.A(CustomTargetingDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                    this.customTargeting_.l().put(u0Var.i(), u0Var.k());
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

            public static AdUnit parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (AdUnit) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static AdUnit parseFrom(l lVar) throws IOException {
                return (AdUnit) h0.parseWithIOException(PARSER, lVar);
            }

            public static AdUnit parseFrom(l lVar, w wVar) throws IOException {
                return (AdUnit) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface AdUnitOrBuilder extends MessageOrBuilder {
            boolean containsCustomTargeting(String str);

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            @Deprecated
            Map<String, String> getCustomTargeting();

            int getCustomTargetingCount();

            Map<String, String> getCustomTargetingMap();

            String getCustomTargetingOrDefault(String str, String str2);

            String getCustomTargetingOrThrow(String str);

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            int getExpirationTime();

            boolean getOverrideCallbacks();

            double getPrice();

            String getRequestAgent();

            ByteString getRequestAgentBytes();

            StringValue getServerParams();

            d2 getServerParamsOrBuilder();

            UInt32Value getSleepTimeAfter();

            n2 getSleepTimeAfterOrBuilder();

            UInt32Value getSleepTimeBefore();

            n2 getSleepTimeBeforeOrBuilder();

            boolean hasServerParams();

            boolean hasSleepTimeAfter();

            boolean hasSleepTimeBefore();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            if (!getId().equals(configuration.getId()) || !getFormat().equals(configuration.getFormat()) || hasRefreshTimeout() != configuration.hasRefreshTimeout()) {
                return false;
            }
            if ((hasRefreshTimeout() && !getRefreshTimeout().equals(configuration.getRefreshTimeout())) || hasRefreshUrl() != configuration.hasRefreshUrl()) {
                return false;
            }
            if ((hasRefreshUrl() && !getRefreshUrl().equals(configuration.getRefreshUrl())) || hasRetryBase() != configuration.hasRetryBase()) {
                return false;
            }
            if ((hasRetryBase() && !getRetryBase().equals(configuration.getRetryBase())) || hasMaxRetryDegree() != configuration.hasMaxRetryDegree()) {
                return false;
            }
            if ((hasMaxRetryDegree() && !getMaxRetryDegree().equals(configuration.getMaxRetryDegree())) || hasCacheSize() != configuration.hasCacheSize()) {
                return false;
            }
            if ((!hasCacheSize() || getCacheSize().equals(configuration.getCacheSize())) && getAdUnitsList().equals(configuration.getAdUnitsList()) && getShouldBreak() == configuration.getShouldBreak() && hasServerParams() == configuration.hasServerParams()) {
                return (!hasServerParams() || getServerParams().equals(configuration.getServerParams())) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public AdUnit getAdUnits(int i10) {
            return this.adUnits_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public int getAdUnitsCount() {
            return this.adUnits_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public List<AdUnit> getAdUnitsList() {
            return this.adUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
            return this.adUnits_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            return this.adUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getCacheSize() {
            UInt32Value uInt32Value = this.cacheSize_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public n2 getCacheSizeOrBuilder() {
            return getCacheSize();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public String getFormat() {
            Object obj = this.format_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.format_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public ByteString getFormatBytes() {
            Object obj = this.format_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.format_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getMaxRetryDegree() {
            UInt32Value uInt32Value = this.maxRetryDegree_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public n2 getMaxRetryDegreeOrBuilder() {
            return getMaxRetryDegree();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt64Value getRefreshTimeout() {
            UInt64Value uInt64Value = this.refreshTimeout_;
            return uInt64Value == null ? UInt64Value.getDefaultInstance() : uInt64Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public o2 getRefreshTimeoutOrBuilder() {
            return getRefreshTimeout();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public StringValue getRefreshUrl() {
            StringValue stringValue = this.refreshUrl_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public d2 getRefreshUrlOrBuilder() {
            return getRefreshUrl();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public UInt32Value getRetryBase() {
            UInt32Value uInt32Value = this.retryBase_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public n2 getRetryBaseOrBuilder() {
            return getRetryBase();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.id_) : 0;
            if (!getFormatBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.format_);
            }
            if (this.refreshTimeout_ != null) {
                iComputeStringSize += n.G(3, getRefreshTimeout());
            }
            if (this.refreshUrl_ != null) {
                iComputeStringSize += n.G(4, getRefreshUrl());
            }
            if (this.retryBase_ != null) {
                iComputeStringSize += n.G(5, getRetryBase());
            }
            if (this.maxRetryDegree_ != null) {
                iComputeStringSize += n.G(6, getMaxRetryDegree());
            }
            if (this.cacheSize_ != null) {
                iComputeStringSize += n.G(7, getCacheSize());
            }
            for (int i11 = 0; i11 < this.adUnits_.size(); i11++) {
                iComputeStringSize += n.G(8, this.adUnits_.get(i11));
            }
            boolean z10 = this.shouldBreak_;
            if (z10) {
                iComputeStringSize += n.e(9, z10);
            }
            if (this.serverParams_ != null) {
                iComputeStringSize += n.G(10, getServerParams());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public StringValue getServerParams() {
            StringValue stringValue = this.serverParams_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public d2 getServerParamsOrBuilder() {
            return getServerParams();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean getShouldBreak() {
            return this.shouldBreak_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasCacheSize() {
            return this.cacheSize_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasMaxRetryDegree() {
            return this.maxRetryDegree_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRefreshTimeout() {
            return this.refreshTimeout_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRefreshUrl() {
            return this.refreshUrl_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasRetryBase() {
            return this.retryBase_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
        public boolean hasServerParams() {
            return this.serverParams_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getFormat().hashCode();
            if (hasRefreshTimeout()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getRefreshTimeout().hashCode();
            }
            if (hasRefreshUrl()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getRefreshUrl().hashCode();
            }
            if (hasRetryBase()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getRetryBase().hashCode();
            }
            if (hasMaxRetryDegree()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getMaxRetryDegree().hashCode();
            }
            if (hasCacheSize()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getCacheSize().hashCode();
            }
            if (getAdUnitsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getAdUnitsList().hashCode();
            }
            int iD = (((iHashCode * 37) + 9) * 53) + j0.d(getShouldBreak());
            if (hasServerParams()) {
                iD = (((iD * 37) + 10) * 53) + getServerParams().hashCode();
            }
            int iHashCode2 = (iD * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
            return new Configuration();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.id_);
            }
            if (!getFormatBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.format_);
            }
            if (this.refreshTimeout_ != null) {
                nVar.J0(3, getRefreshTimeout());
            }
            if (this.refreshUrl_ != null) {
                nVar.J0(4, getRefreshUrl());
            }
            if (this.retryBase_ != null) {
                nVar.J0(5, getRetryBase());
            }
            if (this.maxRetryDegree_ != null) {
                nVar.J0(6, getMaxRetryDegree());
            }
            if (this.cacheSize_ != null) {
                nVar.J0(7, getCacheSize());
            }
            for (int i10 = 0; i10 < this.adUnits_.size(); i10++) {
                nVar.J0(8, this.adUnits_.get(i10));
            }
            boolean z10 = this.shouldBreak_;
            if (z10) {
                nVar.n0(9, z10);
            }
            if (this.serverParams_ != null) {
                nVar.J0(10, getServerParams());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ConfigurationOrBuilder {
            private v1 adUnitsBuilder_;
            private List<AdUnit> adUnits_;
            private int bitField0_;
            private a2 cacheSizeBuilder_;
            private UInt32Value cacheSize_;
            private Object format_;
            private Object id_;
            private a2 maxRetryDegreeBuilder_;
            private UInt32Value maxRetryDegree_;
            private a2 refreshTimeoutBuilder_;
            private UInt64Value refreshTimeout_;
            private a2 refreshUrlBuilder_;
            private StringValue refreshUrl_;
            private a2 retryBaseBuilder_;
            private UInt32Value retryBase_;
            private a2 serverParamsBuilder_;
            private StringValue serverParams_;
            private boolean shouldBreak_;

            private void ensureAdUnitsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.adUnits_ = new ArrayList(this.adUnits_);
                    this.bitField0_ |= 1;
                }
            }

            private v1 getAdUnitsFieldBuilder() {
                if (this.adUnitsBuilder_ == null) {
                    this.adUnitsBuilder_ = new v1(this.adUnits_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.adUnits_ = null;
                }
                return this.adUnitsBuilder_;
            }

            private a2 getCacheSizeFieldBuilder() {
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSizeBuilder_ = new a2(getCacheSize(), getParentForChildren(), isClean());
                    this.cacheSize_ = null;
                }
                return this.cacheSizeBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_descriptor;
            }

            private a2 getMaxRetryDegreeFieldBuilder() {
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegreeBuilder_ = new a2(getMaxRetryDegree(), getParentForChildren(), isClean());
                    this.maxRetryDegree_ = null;
                }
                return this.maxRetryDegreeBuilder_;
            }

            private a2 getRefreshTimeoutFieldBuilder() {
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeoutBuilder_ = new a2(getRefreshTimeout(), getParentForChildren(), isClean());
                    this.refreshTimeout_ = null;
                }
                return this.refreshTimeoutBuilder_;
            }

            private a2 getRefreshUrlFieldBuilder() {
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrlBuilder_ = new a2(getRefreshUrl(), getParentForChildren(), isClean());
                    this.refreshUrl_ = null;
                }
                return this.refreshUrlBuilder_;
            }

            private a2 getRetryBaseFieldBuilder() {
                if (this.retryBaseBuilder_ == null) {
                    this.retryBaseBuilder_ = new a2(getRetryBase(), getParentForChildren(), isClean());
                    this.retryBase_ = null;
                }
                return this.retryBaseBuilder_;
            }

            private a2 getServerParamsFieldBuilder() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParamsBuilder_ = new a2(getServerParams(), getParentForChildren(), isClean());
                    this.serverParams_ = null;
                }
                return this.serverParamsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getAdUnitsFieldBuilder();
                }
            }

            public Builder addAdUnits(AdUnit adUnit) {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.e(adUnit);
                    return this;
                }
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.add(adUnit);
                onChanged();
                return this;
            }

            public AdUnit.Builder addAdUnitsBuilder() {
                return (AdUnit.Builder) getAdUnitsFieldBuilder().c(AdUnit.getDefaultInstance());
            }

            public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureAdUnitsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.adUnits_);
                onChanged();
                return this;
            }

            public Builder clearAdUnits() {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.adUnits_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCacheSize() {
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSize_ = null;
                    onChanged();
                    return this;
                }
                this.cacheSize_ = null;
                this.cacheSizeBuilder_ = null;
                return this;
            }

            public Builder clearFormat() {
                this.format_ = Configuration.getDefaultInstance().getFormat();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = Configuration.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearMaxRetryDegree() {
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegree_ = null;
                    onChanged();
                    return this;
                }
                this.maxRetryDegree_ = null;
                this.maxRetryDegreeBuilder_ = null;
                return this;
            }

            public Builder clearRefreshTimeout() {
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeout_ = null;
                    onChanged();
                    return this;
                }
                this.refreshTimeout_ = null;
                this.refreshTimeoutBuilder_ = null;
                return this;
            }

            public Builder clearRefreshUrl() {
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrl_ = null;
                    onChanged();
                    return this;
                }
                this.refreshUrl_ = null;
                this.refreshUrlBuilder_ = null;
                return this;
            }

            public Builder clearRetryBase() {
                if (this.retryBaseBuilder_ == null) {
                    this.retryBase_ = null;
                    onChanged();
                    return this;
                }
                this.retryBase_ = null;
                this.retryBaseBuilder_ = null;
                return this;
            }

            public Builder clearServerParams() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    onChanged();
                    return this;
                }
                this.serverParams_ = null;
                this.serverParamsBuilder_ = null;
                return this;
            }

            public Builder clearShouldBreak() {
                this.shouldBreak_ = false;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public AdUnit getAdUnits(int i10) {
                v1 v1Var = this.adUnitsBuilder_;
                return v1Var == null ? this.adUnits_.get(i10) : (AdUnit) v1Var.n(i10);
            }

            public AdUnit.Builder getAdUnitsBuilder(int i10) {
                return (AdUnit.Builder) getAdUnitsFieldBuilder().k(i10);
            }

            public List<AdUnit.Builder> getAdUnitsBuilderList() {
                return getAdUnitsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public int getAdUnitsCount() {
                v1 v1Var = this.adUnitsBuilder_;
                return v1Var == null ? this.adUnits_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public List<AdUnit> getAdUnitsList() {
                v1 v1Var = this.adUnitsBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.adUnits_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
                v1 v1Var = this.adUnitsBuilder_;
                return v1Var == null ? this.adUnits_.get(i10) : (AdUnitOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
                v1 v1Var = this.adUnitsBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.adUnits_);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getCacheSize() {
                a2 a2Var = this.cacheSizeBuilder_;
                if (a2Var != null) {
                    return (UInt32Value) a2Var.e();
                }
                UInt32Value uInt32Value = this.cacheSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getCacheSizeBuilder() {
                onChanged();
                return (UInt32Value.Builder) getCacheSizeFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public n2 getCacheSizeOrBuilder() {
                a2 a2Var = this.cacheSizeBuilder_;
                if (a2Var != null) {
                    return (n2) a2Var.f();
                }
                UInt32Value uInt32Value = this.cacheSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public String getFormat() {
                Object obj = this.format_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.format_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public ByteString getFormatBytes() {
                Object obj = this.format_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.format_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getMaxRetryDegree() {
                a2 a2Var = this.maxRetryDegreeBuilder_;
                if (a2Var != null) {
                    return (UInt32Value) a2Var.e();
                }
                UInt32Value uInt32Value = this.maxRetryDegree_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getMaxRetryDegreeBuilder() {
                onChanged();
                return (UInt32Value.Builder) getMaxRetryDegreeFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public n2 getMaxRetryDegreeOrBuilder() {
                a2 a2Var = this.maxRetryDegreeBuilder_;
                if (a2Var != null) {
                    return (n2) a2Var.f();
                }
                UInt32Value uInt32Value = this.maxRetryDegree_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt64Value getRefreshTimeout() {
                a2 a2Var = this.refreshTimeoutBuilder_;
                if (a2Var != null) {
                    return (UInt64Value) a2Var.e();
                }
                UInt64Value uInt64Value = this.refreshTimeout_;
                return uInt64Value == null ? UInt64Value.getDefaultInstance() : uInt64Value;
            }

            public UInt64Value.Builder getRefreshTimeoutBuilder() {
                onChanged();
                return (UInt64Value.Builder) getRefreshTimeoutFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public o2 getRefreshTimeoutOrBuilder() {
                a2 a2Var = this.refreshTimeoutBuilder_;
                if (a2Var != null) {
                    return (o2) a2Var.f();
                }
                UInt64Value uInt64Value = this.refreshTimeout_;
                return uInt64Value == null ? UInt64Value.getDefaultInstance() : uInt64Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public StringValue getRefreshUrl() {
                a2 a2Var = this.refreshUrlBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.refreshUrl_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getRefreshUrlBuilder() {
                onChanged();
                return (StringValue.Builder) getRefreshUrlFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public d2 getRefreshUrlOrBuilder() {
                a2 a2Var = this.refreshUrlBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.refreshUrl_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public UInt32Value getRetryBase() {
                a2 a2Var = this.retryBaseBuilder_;
                if (a2Var != null) {
                    return (UInt32Value) a2Var.e();
                }
                UInt32Value uInt32Value = this.retryBase_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getRetryBaseBuilder() {
                onChanged();
                return (UInt32Value.Builder) getRetryBaseFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public n2 getRetryBaseOrBuilder() {
                a2 a2Var = this.retryBaseBuilder_;
                if (a2Var != null) {
                    return (n2) a2Var.f();
                }
                UInt32Value uInt32Value = this.retryBase_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public StringValue getServerParams() {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getServerParamsBuilder() {
                onChanged();
                return (StringValue.Builder) getServerParamsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public d2 getServerParamsOrBuilder() {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean getShouldBreak() {
                return this.shouldBreak_;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasCacheSize() {
                return (this.cacheSizeBuilder_ == null && this.cacheSize_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasMaxRetryDegree() {
                return (this.maxRetryDegreeBuilder_ == null && this.maxRetryDegree_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRefreshTimeout() {
                return (this.refreshTimeoutBuilder_ == null && this.refreshTimeout_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRefreshUrl() {
                return (this.refreshUrlBuilder_ == null && this.refreshUrl_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasRetryBase() {
                return (this.retryBaseBuilder_ == null && this.retryBase_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ConfigurationOrBuilder
            public boolean hasServerParams() {
                return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCacheSize(UInt32Value uInt32Value) {
                a2 a2Var = this.cacheSizeBuilder_;
                if (a2Var != null) {
                    a2Var.g(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.cacheSize_;
                if (uInt32Value2 != null) {
                    this.cacheSize_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.cacheSize_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeMaxRetryDegree(UInt32Value uInt32Value) {
                a2 a2Var = this.maxRetryDegreeBuilder_;
                if (a2Var != null) {
                    a2Var.g(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.maxRetryDegree_;
                if (uInt32Value2 != null) {
                    this.maxRetryDegree_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.maxRetryDegree_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeRefreshTimeout(UInt64Value uInt64Value) {
                a2 a2Var = this.refreshTimeoutBuilder_;
                if (a2Var != null) {
                    a2Var.g(uInt64Value);
                    return this;
                }
                UInt64Value uInt64Value2 = this.refreshTimeout_;
                if (uInt64Value2 != null) {
                    this.refreshTimeout_ = UInt64Value.newBuilder(uInt64Value2).mergeFrom(uInt64Value).buildPartial();
                } else {
                    this.refreshTimeout_ = uInt64Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeRefreshUrl(StringValue stringValue) {
                a2 a2Var = this.refreshUrlBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.refreshUrl_;
                if (stringValue2 != null) {
                    this.refreshUrl_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.refreshUrl_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeRetryBase(UInt32Value uInt32Value) {
                a2 a2Var = this.retryBaseBuilder_;
                if (a2Var != null) {
                    a2Var.g(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.retryBase_;
                if (uInt32Value2 != null) {
                    this.retryBase_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.retryBase_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeServerParams(StringValue stringValue) {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.serverParams_;
                if (stringValue2 != null) {
                    this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.serverParams_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder removeAdUnits(int i10) {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureAdUnitsIsMutable();
                this.adUnits_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAdUnits(int i10, AdUnit adUnit) {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, adUnit);
                    return this;
                }
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i10, adUnit);
                onChanged();
                return this;
            }

            public Builder setCacheSize(UInt32Value uInt32Value) {
                a2 a2Var = this.cacheSizeBuilder_;
                if (a2Var != null) {
                    a2Var.i(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.cacheSize_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setFormat(String str) {
                str.getClass();
                this.format_ = str;
                onChanged();
                return this;
            }

            public Builder setFormatBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.format_ = byteString;
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
                a.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMaxRetryDegree(UInt32Value uInt32Value) {
                a2 a2Var = this.maxRetryDegreeBuilder_;
                if (a2Var != null) {
                    a2Var.i(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.maxRetryDegree_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setRefreshTimeout(UInt64Value uInt64Value) {
                a2 a2Var = this.refreshTimeoutBuilder_;
                if (a2Var != null) {
                    a2Var.i(uInt64Value);
                    return this;
                }
                uInt64Value.getClass();
                this.refreshTimeout_ = uInt64Value;
                onChanged();
                return this;
            }

            public Builder setRefreshUrl(StringValue stringValue) {
                a2 a2Var = this.refreshUrlBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.refreshUrl_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setRetryBase(UInt32Value uInt32Value) {
                a2 a2Var = this.retryBaseBuilder_;
                if (a2Var != null) {
                    a2Var.i(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.retryBase_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setServerParams(StringValue stringValue) {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.serverParams_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setShouldBreak(boolean z10) {
                this.shouldBreak_ = z10;
                onChanged();
                return this;
            }

            private Builder() {
                this.id_ = "";
                this.format_ = "";
                this.adUnits_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration build() {
                Configuration configurationBuildPartial = buildPartial();
                if (configurationBuildPartial.isInitialized()) {
                    return configurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                configuration.id_ = this.id_;
                configuration.format_ = this.format_;
                a2 a2Var = this.refreshTimeoutBuilder_;
                if (a2Var == null) {
                    configuration.refreshTimeout_ = this.refreshTimeout_;
                } else {
                    configuration.refreshTimeout_ = (UInt64Value) a2Var.a();
                }
                a2 a2Var2 = this.refreshUrlBuilder_;
                if (a2Var2 == null) {
                    configuration.refreshUrl_ = this.refreshUrl_;
                } else {
                    configuration.refreshUrl_ = (StringValue) a2Var2.a();
                }
                a2 a2Var3 = this.retryBaseBuilder_;
                if (a2Var3 == null) {
                    configuration.retryBase_ = this.retryBase_;
                } else {
                    configuration.retryBase_ = (UInt32Value) a2Var3.a();
                }
                a2 a2Var4 = this.maxRetryDegreeBuilder_;
                if (a2Var4 == null) {
                    configuration.maxRetryDegree_ = this.maxRetryDegree_;
                } else {
                    configuration.maxRetryDegree_ = (UInt32Value) a2Var4.a();
                }
                a2 a2Var5 = this.cacheSizeBuilder_;
                if (a2Var5 == null) {
                    configuration.cacheSize_ = this.cacheSize_;
                } else {
                    configuration.cacheSize_ = (UInt32Value) a2Var5.a();
                }
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var != null) {
                    configuration.adUnits_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
                        this.bitField0_ &= -2;
                    }
                    configuration.adUnits_ = this.adUnits_;
                }
                configuration.shouldBreak_ = this.shouldBreak_;
                a2 a2Var6 = this.serverParamsBuilder_;
                if (a2Var6 == null) {
                    configuration.serverParams_ = this.serverParams_;
                } else {
                    configuration.serverParams_ = (StringValue) a2Var6.a();
                }
                onBuilt();
                return configuration;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Configuration getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
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

            public AdUnit.Builder addAdUnitsBuilder(int i10) {
                return (AdUnit.Builder) getAdUnitsFieldBuilder().b(i10, AdUnit.getDefaultInstance());
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
                this.format_ = "";
                if (this.refreshTimeoutBuilder_ == null) {
                    this.refreshTimeout_ = null;
                } else {
                    this.refreshTimeout_ = null;
                    this.refreshTimeoutBuilder_ = null;
                }
                if (this.refreshUrlBuilder_ == null) {
                    this.refreshUrl_ = null;
                } else {
                    this.refreshUrl_ = null;
                    this.refreshUrlBuilder_ = null;
                }
                if (this.retryBaseBuilder_ == null) {
                    this.retryBase_ = null;
                } else {
                    this.retryBase_ = null;
                    this.retryBaseBuilder_ = null;
                }
                if (this.maxRetryDegreeBuilder_ == null) {
                    this.maxRetryDegree_ = null;
                } else {
                    this.maxRetryDegree_ = null;
                    this.maxRetryDegreeBuilder_ = null;
                }
                if (this.cacheSizeBuilder_ == null) {
                    this.cacheSize_ = null;
                } else {
                    this.cacheSize_ = null;
                    this.cacheSizeBuilder_ = null;
                }
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var == null) {
                    this.adUnits_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    v1Var.g();
                }
                this.shouldBreak_ = false;
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    return this;
                }
                this.serverParams_ = null;
                this.serverParamsBuilder_ = null;
                return this;
            }

            public Builder setCacheSize(UInt32Value.Builder builder) {
                a2 a2Var = this.cacheSizeBuilder_;
                if (a2Var == null) {
                    this.cacheSize_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setMaxRetryDegree(UInt32Value.Builder builder) {
                a2 a2Var = this.maxRetryDegreeBuilder_;
                if (a2Var == null) {
                    this.maxRetryDegree_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setRefreshTimeout(UInt64Value.Builder builder) {
                a2 a2Var = this.refreshTimeoutBuilder_;
                if (a2Var == null) {
                    this.refreshTimeout_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setRefreshUrl(StringValue.Builder builder) {
                a2 a2Var = this.refreshUrlBuilder_;
                if (a2Var == null) {
                    this.refreshUrl_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setRetryBase(UInt32Value.Builder builder) {
                a2 a2Var = this.retryBaseBuilder_;
                if (a2Var == null) {
                    this.retryBase_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setServerParams(StringValue.Builder builder) {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var == null) {
                    this.serverParams_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addAdUnits(int i10, AdUnit adUnit) {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var == null) {
                    adUnit.getClass();
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(i10, adUnit);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, adUnit);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAdUnits(int i10, AdUnit.Builder builder) {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.format_ = "";
                this.adUnits_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (!configuration.getId().isEmpty()) {
                    this.id_ = configuration.id_;
                    onChanged();
                }
                if (!configuration.getFormat().isEmpty()) {
                    this.format_ = configuration.format_;
                    onChanged();
                }
                if (configuration.hasRefreshTimeout()) {
                    mergeRefreshTimeout(configuration.getRefreshTimeout());
                }
                if (configuration.hasRefreshUrl()) {
                    mergeRefreshUrl(configuration.getRefreshUrl());
                }
                if (configuration.hasRetryBase()) {
                    mergeRetryBase(configuration.getRetryBase());
                }
                if (configuration.hasMaxRetryDegree()) {
                    mergeMaxRetryDegree(configuration.getMaxRetryDegree());
                }
                if (configuration.hasCacheSize()) {
                    mergeCacheSize(configuration.getCacheSize());
                }
                if (this.adUnitsBuilder_ == null) {
                    if (!configuration.adUnits_.isEmpty()) {
                        if (this.adUnits_.isEmpty()) {
                            this.adUnits_ = configuration.adUnits_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAdUnitsIsMutable();
                            this.adUnits_.addAll(configuration.adUnits_);
                        }
                        onChanged();
                    }
                } else if (!configuration.adUnits_.isEmpty()) {
                    if (!this.adUnitsBuilder_.t()) {
                        this.adUnitsBuilder_.a(configuration.adUnits_);
                    } else {
                        this.adUnitsBuilder_.h();
                        this.adUnitsBuilder_ = null;
                        this.adUnits_ = configuration.adUnits_;
                        this.bitField0_ &= -2;
                        this.adUnitsBuilder_ = h0.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                    }
                }
                if (configuration.getShouldBreak()) {
                    setShouldBreak(configuration.getShouldBreak());
                }
                if (configuration.hasServerParams()) {
                    mergeServerParams(configuration.getServerParams());
                }
                mergeUnknownFields(((h0) configuration).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdUnits(AdUnit.Builder builder) {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addAdUnits(int i10, AdUnit.Builder builder) {
                v1 v1Var = this.adUnitsBuilder_;
                if (v1Var == null) {
                    ensureAdUnitsIsMutable();
                    this.adUnits_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.Waterfall.Configuration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.Configuration.access$3500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Configuration r3 = (io.bidmachine.protobuf.Waterfall.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.Waterfall$Configuration r4 = (io.bidmachine.protobuf.Waterfall.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Configuration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Configuration$Builder");
            }
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Configuration(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Configuration) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Configuration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Configuration parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Configuration() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.format_ = "";
            this.adUnits_ = Collections.EMPTY_LIST;
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Configuration parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr, wVar);
        }

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Configuration(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            case 10:
                                this.id_ = lVar.J();
                                break;
                            case 18:
                                this.format_ = lVar.J();
                                break;
                            case 26:
                                UInt64Value uInt64Value = this.refreshTimeout_;
                                UInt64Value.Builder builder = uInt64Value != null ? uInt64Value.toBuilder() : null;
                                UInt64Value uInt64Value2 = (UInt64Value) lVar.A(UInt64Value.parser(), wVar);
                                this.refreshTimeout_ = uInt64Value2;
                                if (builder != null) {
                                    builder.mergeFrom(uInt64Value2);
                                    this.refreshTimeout_ = builder.buildPartial();
                                }
                                break;
                            case 34:
                                StringValue stringValue = this.refreshUrl_;
                                StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.refreshUrl_ = stringValue2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(stringValue2);
                                    this.refreshUrl_ = builder2.buildPartial();
                                }
                                break;
                            case 42:
                                UInt32Value uInt32Value = this.retryBase_;
                                UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                UInt32Value uInt32Value2 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                this.retryBase_ = uInt32Value2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(uInt32Value2);
                                    this.retryBase_ = builder3.buildPartial();
                                }
                                break;
                            case 50:
                                UInt32Value uInt32Value3 = this.maxRetryDegree_;
                                UInt32Value.Builder builder4 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                UInt32Value uInt32Value4 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                this.maxRetryDegree_ = uInt32Value4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(uInt32Value4);
                                    this.maxRetryDegree_ = builder4.buildPartial();
                                }
                                break;
                            case 58:
                                UInt32Value uInt32Value5 = this.cacheSize_;
                                UInt32Value.Builder builder5 = uInt32Value5 != null ? uInt32Value5.toBuilder() : null;
                                UInt32Value uInt32Value6 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                this.cacheSize_ = uInt32Value6;
                                if (builder5 != null) {
                                    builder5.mergeFrom(uInt32Value6);
                                    this.cacheSize_ = builder5.buildPartial();
                                }
                                break;
                            case 66:
                                if (b10 == false) {
                                    this.adUnits_ = new ArrayList();
                                    b10 = true;
                                }
                                this.adUnits_.add((AdUnit) lVar.A(AdUnit.parser(), wVar));
                                break;
                            case 72:
                                this.shouldBreak_ = lVar.q();
                                break;
                            case 82:
                                StringValue stringValue3 = this.serverParams_;
                                StringValue.Builder builder6 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.serverParams_ = stringValue4;
                                if (builder6 != null) {
                                    builder6.mergeFrom(stringValue4);
                                    this.serverParams_ = builder6.buildPartial();
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
                        this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (b10 != false) {
                this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Configuration parseFrom(l lVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, lVar);
        }

        public static Configuration parseFrom(l lVar, w wVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        Configuration.AdUnit getAdUnits(int i10);

        int getAdUnitsCount();

        List<Configuration.AdUnit> getAdUnitsList();

        Configuration.AdUnitOrBuilder getAdUnitsOrBuilder(int i10);

        List<? extends Configuration.AdUnitOrBuilder> getAdUnitsOrBuilderList();

        UInt32Value getCacheSize();

        n2 getCacheSizeOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getFormat();

        ByteString getFormatBytes();

        String getId();

        ByteString getIdBytes();

        UInt32Value getMaxRetryDegree();

        n2 getMaxRetryDegreeOrBuilder();

        UInt64Value getRefreshTimeout();

        o2 getRefreshTimeoutOrBuilder();

        StringValue getRefreshUrl();

        d2 getRefreshUrlOrBuilder();

        UInt32Value getRetryBase();

        n2 getRetryBaseOrBuilder();

        StringValue getServerParams();

        d2 getServerParamsOrBuilder();

        boolean getShouldBreak();

        boolean hasCacheSize();

        boolean hasMaxRetryDegree();

        boolean hasRefreshTimeout();

        boolean hasRefreshUrl();

        boolean hasRetryBase();

        boolean hasServerParams();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Context extends h0 implements ContextOrBuilder {
        public static final int CONFIGURATIONS_FIELD_NUMBER = 1;
        public static final int EVENT_CONFIG_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<Configuration> configurations_;
        private AdExtension.EventConfiguration eventConfig_;
        private byte memoizedIsInitialized;
        private static final Context DEFAULT_INSTANCE = new Context();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.Context.1
            @Override // com.explorestack.protobuf.p1
            public Context parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Context(lVar, wVar);
            }
        };

        public static Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
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
            if (getConfigurationsList().equals(context.getConfigurationsList()) && hasEventConfig() == context.hasEventConfig()) {
                return (!hasEventConfig() || getEventConfig().equals(context.getEventConfig())) && this.unknownFields.equals(context.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public Configuration getConfigurations(int i10) {
            return this.configurations_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public int getConfigurationsCount() {
            return this.configurations_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public List<Configuration> getConfigurationsList() {
            return this.configurations_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public ConfigurationOrBuilder getConfigurationsOrBuilder(int i10) {
            return this.configurations_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList() {
            return this.configurations_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public AdExtension.EventConfiguration getEventConfig() {
            AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder() {
            return getEventConfig();
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
            for (int i11 = 0; i11 < this.configurations_.size(); i11++) {
                iG += n.G(1, this.configurations_.get(i11));
            }
            if (this.eventConfig_ != null) {
                iG += n.G(2, getEventConfig());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
        public boolean hasEventConfig() {
            return this.eventConfig_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getConfigurationsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getConfigurationsList().hashCode();
            }
            if (hasEventConfig()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEventConfig().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_fieldAccessorTable.d(Context.class, Builder.class);
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
            for (int i10 = 0; i10 < this.configurations_.size(); i10++) {
                nVar.J0(1, this.configurations_.get(i10));
            }
            if (this.eventConfig_ != null) {
                nVar.J0(2, getEventConfig());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ContextOrBuilder {
            private int bitField0_;
            private v1 configurationsBuilder_;
            private List<Configuration> configurations_;
            private a2 eventConfigBuilder_;
            private AdExtension.EventConfiguration eventConfig_;

            private void ensureConfigurationsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.configurations_ = new ArrayList(this.configurations_);
                    this.bitField0_ |= 1;
                }
            }

            private v1 getConfigurationsFieldBuilder() {
                if (this.configurationsBuilder_ == null) {
                    this.configurationsBuilder_ = new v1(this.configurations_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.configurations_ = null;
                }
                return this.configurationsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
            }

            private a2 getEventConfigFieldBuilder() {
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfigBuilder_ = new a2(getEventConfig(), getParentForChildren(), isClean());
                    this.eventConfig_ = null;
                }
                return this.eventConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getConfigurationsFieldBuilder();
                }
            }

            public Builder addAllConfigurations(Iterable<? extends Configuration> iterable) {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureConfigurationsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.configurations_);
                onChanged();
                return this;
            }

            public Builder addConfigurations(Configuration configuration) {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var != null) {
                    v1Var.e(configuration);
                    return this;
                }
                configuration.getClass();
                ensureConfigurationsIsMutable();
                this.configurations_.add(configuration);
                onChanged();
                return this;
            }

            public Configuration.Builder addConfigurationsBuilder() {
                return (Configuration.Builder) getConfigurationsFieldBuilder().c(Configuration.getDefaultInstance());
            }

            public Builder clearConfigurations() {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.configurations_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearEventConfig() {
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfig_ = null;
                    onChanged();
                    return this;
                }
                this.eventConfig_ = null;
                this.eventConfigBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public Configuration getConfigurations(int i10) {
                v1 v1Var = this.configurationsBuilder_;
                return v1Var == null ? this.configurations_.get(i10) : (Configuration) v1Var.n(i10);
            }

            public Configuration.Builder getConfigurationsBuilder(int i10) {
                return (Configuration.Builder) getConfigurationsFieldBuilder().k(i10);
            }

            public List<Configuration.Builder> getConfigurationsBuilderList() {
                return getConfigurationsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public int getConfigurationsCount() {
                v1 v1Var = this.configurationsBuilder_;
                return v1Var == null ? this.configurations_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public List<Configuration> getConfigurationsList() {
                v1 v1Var = this.configurationsBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.configurations_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public ConfigurationOrBuilder getConfigurationsOrBuilder(int i10) {
                v1 v1Var = this.configurationsBuilder_;
                return v1Var == null ? this.configurations_.get(i10) : (ConfigurationOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList() {
                v1 v1Var = this.configurationsBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.configurations_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public AdExtension.EventConfiguration getEventConfig() {
                a2 a2Var = this.eventConfigBuilder_;
                if (a2Var != null) {
                    return (AdExtension.EventConfiguration) a2Var.e();
                }
                AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
            }

            public AdExtension.EventConfiguration.Builder getEventConfigBuilder() {
                onChanged();
                return (AdExtension.EventConfiguration.Builder) getEventConfigFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder() {
                a2 a2Var = this.eventConfigBuilder_;
                if (a2Var != null) {
                    return (AdExtension.EventConfigurationOrBuilder) a2Var.f();
                }
                AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ContextOrBuilder
            public boolean hasEventConfig() {
                return (this.eventConfigBuilder_ == null && this.eventConfig_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Context_fieldAccessorTable.d(Context.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEventConfig(AdExtension.EventConfiguration eventConfiguration) {
                a2 a2Var = this.eventConfigBuilder_;
                if (a2Var != null) {
                    a2Var.g(eventConfiguration);
                    return this;
                }
                AdExtension.EventConfiguration eventConfiguration2 = this.eventConfig_;
                if (eventConfiguration2 != null) {
                    this.eventConfig_ = AdExtension.EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
                } else {
                    this.eventConfig_ = eventConfiguration;
                }
                onChanged();
                return this;
            }

            public Builder removeConfigurations(int i10) {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureConfigurationsIsMutable();
                this.configurations_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setConfigurations(int i10, Configuration configuration) {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, configuration);
                    return this;
                }
                configuration.getClass();
                ensureConfigurationsIsMutable();
                this.configurations_.set(i10, configuration);
                onChanged();
                return this;
            }

            public Builder setEventConfig(AdExtension.EventConfiguration eventConfiguration) {
                a2 a2Var = this.eventConfigBuilder_;
                if (a2Var != null) {
                    a2Var.i(eventConfiguration);
                    return this;
                }
                eventConfiguration.getClass();
                this.eventConfig_ = eventConfiguration;
                onChanged();
                return this;
            }

            private Builder() {
                this.configurations_ = Collections.EMPTY_LIST;
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
                int i10 = this.bitField0_;
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.configurations_ = DesugarCollections.unmodifiableList(this.configurations_);
                        this.bitField0_ &= -2;
                    }
                    context.configurations_ = this.configurations_;
                } else {
                    context.configurations_ = v1Var.f();
                }
                a2 a2Var = this.eventConfigBuilder_;
                if (a2Var == null) {
                    context.eventConfig_ = this.eventConfig_;
                } else {
                    context.eventConfig_ = (AdExtension.EventConfiguration) a2Var.a();
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

            public Configuration.Builder addConfigurationsBuilder(int i10) {
                return (Configuration.Builder) getConfigurationsFieldBuilder().b(i10, Configuration.getDefaultInstance());
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
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var == null) {
                    this.configurations_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    v1Var.g();
                }
                if (this.eventConfigBuilder_ == null) {
                    this.eventConfig_ = null;
                    return this;
                }
                this.eventConfig_ = null;
                this.eventConfigBuilder_ = null;
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.configurations_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setEventConfig(AdExtension.EventConfiguration.Builder builder) {
                a2 a2Var = this.eventConfigBuilder_;
                if (a2Var == null) {
                    this.eventConfig_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addConfigurations(int i10, Configuration configuration) {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var == null) {
                    configuration.getClass();
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(i10, configuration);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, configuration);
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

            public Builder setConfigurations(int i10, Configuration.Builder builder) {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.set(i10, builder.build());
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
                if (this.configurationsBuilder_ == null) {
                    if (!context.configurations_.isEmpty()) {
                        if (this.configurations_.isEmpty()) {
                            this.configurations_ = context.configurations_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureConfigurationsIsMutable();
                            this.configurations_.addAll(context.configurations_);
                        }
                        onChanged();
                    }
                } else if (!context.configurations_.isEmpty()) {
                    if (!this.configurationsBuilder_.t()) {
                        this.configurationsBuilder_.a(context.configurations_);
                    } else {
                        this.configurationsBuilder_.h();
                        this.configurationsBuilder_ = null;
                        this.configurations_ = context.configurations_;
                        this.bitField0_ &= -2;
                        this.configurationsBuilder_ = h0.alwaysUseFieldBuilders ? getConfigurationsFieldBuilder() : null;
                    }
                }
                if (context.hasEventConfig()) {
                    mergeEventConfig(context.getEventConfig());
                }
                mergeUnknownFields(((h0) context).unknownFields);
                onChanged();
                return this;
            }

            public Builder addConfigurations(Configuration.Builder builder) {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addConfigurations(int i10, Configuration.Builder builder) {
                v1 v1Var = this.configurationsBuilder_;
                if (v1Var == null) {
                    ensureConfigurationsIsMutable();
                    this.configurations_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.Waterfall.Context.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.Context.access$11200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Context r3 = (io.bidmachine.protobuf.Waterfall.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.Waterfall$Context r4 = (io.bidmachine.protobuf.Waterfall.Context) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Context.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Context$Builder");
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
            this.configurations_ = Collections.EMPTY_LIST;
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

        private Context(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                if (!z11) {
                                    this.configurations_ = new ArrayList();
                                    z11 = true;
                                }
                                this.configurations_.add((Configuration) lVar.A(Configuration.parser(), wVar));
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                AdExtension.EventConfiguration eventConfiguration = this.eventConfig_;
                                AdExtension.EventConfiguration.Builder builder = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                                AdExtension.EventConfiguration eventConfiguration2 = (AdExtension.EventConfiguration) lVar.A(AdExtension.EventConfiguration.parser(), wVar);
                                this.eventConfig_ = eventConfiguration2;
                                if (builder != null) {
                                    builder.mergeFrom(eventConfiguration2);
                                    this.eventConfig_ = builder.buildPartial();
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
                        this.configurations_ = DesugarCollections.unmodifiableList(this.configurations_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.configurations_ = DesugarCollections.unmodifiableList(this.configurations_);
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

    public interface ContextOrBuilder extends MessageOrBuilder {
        Configuration getConfigurations(int i10);

        int getConfigurationsCount();

        List<Configuration> getConfigurationsList();

        ConfigurationOrBuilder getConfigurationsOrBuilder(int i10);

        List<? extends ConfigurationOrBuilder> getConfigurationsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        AdExtension.EventConfiguration getEventConfig();

        AdExtension.EventConfigurationOrBuilder getEventConfigOrBuilder();

        boolean hasEventConfig();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum PayloadCase implements j0.c {
        REQUEST(1),
        RESPONSE(2),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }

        public static PayloadCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 1) {
                return REQUEST;
            }
            if (i10 != 2) {
                return null;
            }
            return RESPONSE;
        }

        @Override // com.explorestack.protobuf.j0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static final class Result extends h0 implements ResultOrBuilder {
        public static final int AD_UNIT_RESULTS_FIELD_NUMBER = 4;
        public static final int CACHED_AD_UNITS_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 2;
        public static final int FORMAT_FIELD_NUMBER = 3;
        public static final int SERVER_PARAMS_FIELD_NUMBER = 6;
        public static final int WATERFALL_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<AdUnit> adUnitResults_;
        private List<CachedAdUnit> cachedAdUnits_;
        private Struct ext_;
        private StringValue format_;
        private byte memoizedIsInitialized;
        private StringValue serverParams_;
        private volatile Object waterfallId_;
        private static final Result DEFAULT_INSTANCE = new Result();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.Result.1
            @Override // com.explorestack.protobuf.p1
            public Result parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Result(lVar, wVar);
            }
        };

        public static final class AdUnit extends h0 implements AdUnitOrBuilder {
            public static final int AD_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_UNIT_ID_FIELD_NUMBER = 1;
            public static final int ERROR_FIELD_NUMBER = 6;
            public static final int ESTIMATED_PRICE_FIELD_NUMBER = 3;
            public static final int PRICE_FIELD_NUMBER = 2;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 7;
            public static final int STATUS_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private StringValue adResponse_;
            private volatile Object adUnitId_;
            private Error error_;
            private EstimatedPrice estimatedPrice_;
            private byte memoizedIsInitialized;
            private double price_;
            private StringValue serverParams_;
            private int status_;
            private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.1
                @Override // com.explorestack.protobuf.p1
                public AdUnit parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new AdUnit(lVar, wVar);
                }
            };

            public static final class Error extends h0 implements ErrorOrBuilder {
                public static final int CODE_FIELD_NUMBER = 1;
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private int code_;
                private volatile Object description_;
                private byte memoizedIsInitialized;
                private static final Error DEFAULT_INSTANCE = new Error();
                private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.1
                    @Override // com.explorestack.protobuf.p1
                    public Error parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new Error(lVar, wVar);
                    }
                };

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Error) h0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteBuffer);
                }

                public static p1 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Error)) {
                        return super.equals(obj);
                    }
                    Error error = (Error) obj;
                    return getCode() == error.getCode() && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields);
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public int getCode() {
                    return this.code_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.description_ = byteStringCopyFromUtf8;
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
                    int i11 = this.code_;
                    int iR = i11 != 0 ? n.R(1, i11) : 0;
                    if (!getDescriptionBytes().isEmpty()) {
                        iR += h0.computeStringSize(2, this.description_);
                    }
                    int serializedSize = iR + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
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
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCode()) * 37) + 2) * 53) + getDescription().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.h0
                protected h0.f internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_fieldAccessorTable.d(Error.class, Builder.class);
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
                    return new Error();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(n nVar) throws IOException {
                    int i10 = this.code_;
                    if (i10 != 0) {
                        nVar.Q0(1, i10);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        h0.writeString(nVar, 2, this.description_);
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static final class Builder extends h0.b implements ErrorOrBuilder {
                    private int code_;
                    private Object description_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = h0.alwaysUseFieldBuilders;
                    }

                    public Builder clearCode() {
                        this.code_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                    public int getCode() {
                        return this.code_;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                    public String getDescription() {
                        Object obj = this.description_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.description_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnit.ErrorOrBuilder
                    public ByteString getDescriptionBytes() {
                        Object obj = this.description_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.description_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_descriptor;
                    }

                    @Override // com.explorestack.protobuf.h0.b
                    protected h0.f internalGetFieldAccessorTable() {
                        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_fieldAccessorTable.d(Error.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder setCode(int i10) {
                        this.code_ = i10;
                        onChanged();
                        return this;
                    }

                    public Builder setDescription(String str) {
                        str.getClass();
                        this.description_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDescriptionBytes(ByteString byteString) {
                        byteString.getClass();
                        a.checkByteStringIsUtf8(byteString);
                        this.description_ = byteString;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error build() {
                        Error errorBuildPartial = buildPartial();
                        if (errorBuildPartial.isInitialized()) {
                            return errorBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error buildPartial() {
                        Error error = new Error(this);
                        error.code_ = this.code_;
                        error.description_ = this.description_;
                        onBuilt();
                        return error;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Error getDefaultInstanceForType() {
                        return Error.getDefaultInstance();
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
                        this.code_ = 0;
                        this.description_ = "";
                        return this;
                    }

                    private Builder(h0.c cVar) {
                        super(cVar);
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo4427clone() {
                        return (Builder) super.mo4427clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Error) {
                            return mergeFrom((Error) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Error error) {
                        if (error == Error.getDefaultInstance()) {
                            return this;
                        }
                        if (error.getCode() != 0) {
                            setCode(error.getCode());
                        }
                        if (!error.getDescription().isEmpty()) {
                            this.description_ = error.description_;
                            onChanged();
                        }
                        mergeUnknownFields(((h0) error).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.access$5600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error r3 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error r4 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Error.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Result$AdUnit$Error$Builder");
                    }
                }

                public static Builder newBuilder(Error error) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
                }

                public static Error parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteBuffer, wVar);
                }

                private Error(h0.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Error parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Error) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                }

                public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Error getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Error parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(byteString, wVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Error() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.description_ = "";
                }

                public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.h0
                public Builder newBuilderForType(h0.c cVar) {
                    return new Builder(cVar);
                }

                public static Error parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                    return (Error) PARSER.parseFrom(bArr, wVar);
                }

                public static Error parseFrom(InputStream inputStream) throws IOException {
                    return (Error) h0.parseWithIOException(PARSER, inputStream);
                }

                private Error(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        this.code_ = lVar.G();
                                    } else if (iK != 18) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        this.description_ = lVar.J();
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

                public static Error parseFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Error) h0.parseWithIOException(PARSER, inputStream, wVar);
                }

                public static Error parseFrom(l lVar) throws IOException {
                    return (Error) h0.parseWithIOException(PARSER, lVar);
                }

                public static Error parseFrom(l lVar, w wVar) throws IOException {
                    return (Error) h0.parseWithIOException(PARSER, lVar, wVar);
                }
            }

            public interface ErrorOrBuilder extends MessageOrBuilder {
                int getCode();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

                String getDescription();

                ByteString getDescriptionBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public enum Status implements j0.c {
                STATUS_INVALID(0),
                STATUS_SUCCESS(1),
                STATUS_ERROR(2),
                STATUS_SKIPPED(3),
                UNRECOGNIZED(-1);

                public static final int STATUS_ERROR_VALUE = 2;
                public static final int STATUS_INVALID_VALUE = 0;
                public static final int STATUS_SKIPPED_VALUE = 3;
                public static final int STATUS_SUCCESS_VALUE = 1;
                private final int value;
                private static final j0.d internalValueMap = new j0.d() { // from class: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Status.1
                    public Status findValueByNumber(int i10) {
                        return Status.forNumber(i10);
                    }
                };
                private static final Status[] VALUES = values();

                Status(int i10) {
                    this.value = i10;
                }

                public static Status forNumber(int i10) {
                    if (i10 == 0) {
                        return STATUS_INVALID;
                    }
                    if (i10 == 1) {
                        return STATUS_SUCCESS;
                    }
                    if (i10 == 2) {
                        return STATUS_ERROR;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return STATUS_SKIPPED;
                }

                public static final Descriptors.EnumDescriptor getDescriptor() {
                    return AdUnit.getDescriptor().getEnumTypes().get(0);
                }

                public static j0.d internalGetValueMap() {
                    return internalValueMap;
                }

                public final Descriptors.EnumDescriptor getDescriptorForType() {
                    return getDescriptor();
                }

                @Override // com.explorestack.protobuf.j0.c
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.value;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                    if (this != UNRECOGNIZED) {
                        return getDescriptor().getValues().get(ordinal());
                    }
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }

                @Deprecated
                public static Status valueOf(int i10) {
                    return forNumber(i10);
                }

                public static Status valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                    if (enumValueDescriptor.getType() == getDescriptor()) {
                        if (enumValueDescriptor.getIndex() == -1) {
                            return UNRECOGNIZED;
                        }
                        return VALUES[enumValueDescriptor.getIndex()];
                    }
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
            }

            public static AdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdUnit)) {
                    return super.equals(obj);
                }
                AdUnit adUnit = (AdUnit) obj;
                if (!getAdUnitId().equals(adUnit.getAdUnitId()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(adUnit.getPrice()) || hasEstimatedPrice() != adUnit.hasEstimatedPrice()) {
                    return false;
                }
                if ((hasEstimatedPrice() && !getEstimatedPrice().equals(adUnit.getEstimatedPrice())) || hasAdResponse() != adUnit.hasAdResponse()) {
                    return false;
                }
                if ((hasAdResponse() && !getAdResponse().equals(adUnit.getAdResponse())) || this.status_ != adUnit.status_ || hasError() != adUnit.hasError()) {
                    return false;
                }
                if ((!hasError() || getError().equals(adUnit.getError())) && hasServerParams() == adUnit.hasServerParams()) {
                    return (!hasServerParams() || getServerParams().equals(adUnit.getServerParams())) && this.unknownFields.equals(adUnit.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public StringValue getAdResponse() {
                StringValue stringValue = this.adResponse_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public d2 getAdResponseOrBuilder() {
                return getAdResponse();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adUnitId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public Error getError() {
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public EstimatedPrice getEstimatedPrice() {
                EstimatedPrice estimatedPrice = this.estimatedPrice_;
                return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                return getEstimatedPrice();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getAdUnitIdBytes().isEmpty() ? h0.computeStringSize(1, this.adUnitId_) : 0;
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iComputeStringSize += n.j(2, d10);
                }
                if (this.estimatedPrice_ != null) {
                    iComputeStringSize += n.G(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    iComputeStringSize += n.G(4, getAdResponse());
                }
                if (this.status_ != Status.STATUS_INVALID.getNumber()) {
                    iComputeStringSize += n.l(5, this.status_);
                }
                if (this.error_ != null) {
                    iComputeStringSize += n.G(6, getError());
                }
                if (this.serverParams_ != null) {
                    iComputeStringSize += n.G(7, getServerParams());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public d2 getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public Status getStatus() {
                Status statusValueOf = Status.valueOf(this.status_);
                return statusValueOf == null ? Status.UNRECOGNIZED : statusValueOf;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public int getStatusValue() {
                return this.status_;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasAdResponse() {
                return this.adResponse_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasError() {
                return this.error_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasEstimatedPrice() {
                return this.estimatedPrice_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
            public boolean hasServerParams() {
                return this.serverParams_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdUnitId().hashCode()) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getPrice()));
                if (hasEstimatedPrice()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getEstimatedPrice().hashCode();
                }
                if (hasAdResponse()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getAdResponse().hashCode();
                }
                int iHashCode2 = (((iHashCode * 37) + 5) * 53) + this.status_;
                if (hasError()) {
                    iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getError().hashCode();
                }
                if (hasServerParams()) {
                    iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getServerParams().hashCode();
                }
                int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_fieldAccessorTable.d(AdUnit.class, Builder.class);
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
                return new AdUnit();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getAdUnitIdBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.adUnitId_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    nVar.t0(2, d10);
                }
                if (this.estimatedPrice_ != null) {
                    nVar.J0(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    nVar.J0(4, getAdResponse());
                }
                if (this.status_ != Status.STATUS_INVALID.getNumber()) {
                    nVar.v0(5, this.status_);
                }
                if (this.error_ != null) {
                    nVar.J0(6, getError());
                }
                if (this.serverParams_ != null) {
                    nVar.J0(7, getServerParams());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements AdUnitOrBuilder {
                private a2 adResponseBuilder_;
                private StringValue adResponse_;
                private Object adUnitId_;
                private a2 errorBuilder_;
                private Error error_;
                private a2 estimatedPriceBuilder_;
                private EstimatedPrice estimatedPrice_;
                private double price_;
                private a2 serverParamsBuilder_;
                private StringValue serverParams_;
                private int status_;

                private a2 getAdResponseFieldBuilder() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponseBuilder_ = new a2(getAdResponse(), getParentForChildren(), isClean());
                        this.adResponse_ = null;
                    }
                    return this.adResponseBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_descriptor;
                }

                private a2 getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new a2(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                private a2 getEstimatedPriceFieldBuilder() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPriceBuilder_ = new a2(getEstimatedPrice(), getParentForChildren(), isClean());
                        this.estimatedPrice_ = null;
                    }
                    return this.estimatedPriceBuilder_;
                }

                private a2 getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new a2(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearAdResponse() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                        onChanged();
                        return this;
                    }
                    this.adResponse_ = null;
                    this.adResponseBuilder_ = null;
                    return this;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = AdUnit.getDefaultInstance().getAdUnitId();
                    onChanged();
                    return this;
                }

                public Builder clearError() {
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                        onChanged();
                        return this;
                    }
                    this.error_ = null;
                    this.errorBuilder_ = null;
                    return this;
                }

                public Builder clearEstimatedPrice() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                        onChanged();
                        return this;
                    }
                    this.estimatedPrice_ = null;
                    this.estimatedPriceBuilder_ = null;
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                public Builder clearStatus() {
                    this.status_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public StringValue getAdResponse() {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.adResponse_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getAdResponseBuilder() {
                    onChanged();
                    return (StringValue.Builder) getAdResponseFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public d2 getAdResponseOrBuilder() {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.adResponse_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adUnitId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_descriptor;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public Error getError() {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var != null) {
                        return (Error) a2Var.e();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                public Error.Builder getErrorBuilder() {
                    onChanged();
                    return (Error.Builder) getErrorFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public ErrorOrBuilder getErrorOrBuilder() {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var != null) {
                        return (ErrorOrBuilder) a2Var.f();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public EstimatedPrice getEstimatedPrice() {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var != null) {
                        return (EstimatedPrice) a2Var.e();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
                }

                public EstimatedPrice.Builder getEstimatedPriceBuilder() {
                    onChanged();
                    return (EstimatedPrice.Builder) getEstimatedPriceFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var != null) {
                        return (EstimatedPriceOrBuilder) a2Var.f();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public StringValue getServerParams() {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return (StringValue.Builder) getServerParamsFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public d2 getServerParamsOrBuilder() {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public Status getStatus() {
                    Status statusValueOf = Status.valueOf(this.status_);
                    return statusValueOf == null ? Status.UNRECOGNIZED : statusValueOf;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public int getStatusValue() {
                    return this.status_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasAdResponse() {
                    return (this.adResponseBuilder_ == null && this.adResponse_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasError() {
                    return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasEstimatedPrice() {
                    return (this.estimatedPriceBuilder_ == null && this.estimatedPrice_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.AdUnitOrBuilder
                public boolean hasServerParams() {
                    return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_fieldAccessorTable.d(AdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAdResponse(StringValue stringValue) {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.adResponse_;
                    if (stringValue2 != null) {
                        this.adResponse_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.adResponse_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeError(Error error) {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var != null) {
                        a2Var.g(error);
                        return this;
                    }
                    Error error2 = this.error_;
                    if (error2 != null) {
                        this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
                    } else {
                        this.error_ = error;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeEstimatedPrice(EstimatedPrice estimatedPrice) {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var != null) {
                        a2Var.g(estimatedPrice);
                        return this;
                    }
                    EstimatedPrice estimatedPrice2 = this.estimatedPrice_;
                    if (estimatedPrice2 != null) {
                        this.estimatedPrice_ = EstimatedPrice.newBuilder(estimatedPrice2).mergeFrom(estimatedPrice).buildPartial();
                    } else {
                        this.estimatedPrice_ = estimatedPrice;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.serverParams_;
                    if (stringValue2 != null) {
                        this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.serverParams_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setAdResponse(StringValue stringValue) {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.adResponse_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setError(Error error) {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var != null) {
                        a2Var.i(error);
                        return this;
                    }
                    error.getClass();
                    this.error_ = error;
                    onChanged();
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice estimatedPrice) {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var != null) {
                        a2Var.i(estimatedPrice);
                        return this;
                    }
                    estimatedPrice.getClass();
                    this.estimatedPrice_ = estimatedPrice;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.serverParams_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setStatus(Status status) {
                    status.getClass();
                    this.status_ = status.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setStatusValue(int i10) {
                    this.status_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.adUnitId_ = "";
                    this.status_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit build() {
                    AdUnit adUnitBuildPartial = buildPartial();
                    if (adUnitBuildPartial.isInitialized()) {
                        return adUnitBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdUnit buildPartial() {
                    AdUnit adUnit = new AdUnit(this);
                    adUnit.adUnitId_ = this.adUnitId_;
                    adUnit.price_ = this.price_;
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var == null) {
                        adUnit.estimatedPrice_ = this.estimatedPrice_;
                    } else {
                        adUnit.estimatedPrice_ = (EstimatedPrice) a2Var.a();
                    }
                    a2 a2Var2 = this.adResponseBuilder_;
                    if (a2Var2 == null) {
                        adUnit.adResponse_ = this.adResponse_;
                    } else {
                        adUnit.adResponse_ = (StringValue) a2Var2.a();
                    }
                    adUnit.status_ = this.status_;
                    a2 a2Var3 = this.errorBuilder_;
                    if (a2Var3 == null) {
                        adUnit.error_ = this.error_;
                    } else {
                        adUnit.error_ = (Error) a2Var3.a();
                    }
                    a2 a2Var4 = this.serverParamsBuilder_;
                    if (a2Var4 == null) {
                        adUnit.serverParams_ = this.serverParams_;
                    } else {
                        adUnit.serverParams_ = (StringValue) a2Var4.a();
                    }
                    onBuilt();
                    return adUnit;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public AdUnit getDefaultInstanceForType() {
                    return AdUnit.getDefaultInstance();
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
                    this.adUnitId_ = "";
                    this.price_ = 0.0d;
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                    } else {
                        this.estimatedPrice_ = null;
                        this.estimatedPriceBuilder_ = null;
                    }
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                    } else {
                        this.adResponse_ = null;
                        this.adResponseBuilder_ = null;
                    }
                    this.status_ = 0;
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                public Builder setAdResponse(StringValue.Builder builder) {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var == null) {
                        this.adResponse_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setError(Error.Builder builder) {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var == null) {
                        this.error_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice.Builder builder) {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var == null) {
                        this.estimatedPrice_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var == null) {
                        this.serverParams_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.adUnitId_ = "";
                    this.status_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AdUnit) {
                        return mergeFrom((AdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AdUnit adUnit) {
                    if (adUnit == AdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (!adUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = adUnit.adUnitId_;
                        onChanged();
                    }
                    if (adUnit.getPrice() != 0.0d) {
                        setPrice(adUnit.getPrice());
                    }
                    if (adUnit.hasEstimatedPrice()) {
                        mergeEstimatedPrice(adUnit.getEstimatedPrice());
                    }
                    if (adUnit.hasAdResponse()) {
                        mergeAdResponse(adUnit.getAdResponse());
                    }
                    if (adUnit.status_ != 0) {
                        setStatusValue(adUnit.getStatusValue());
                    }
                    if (adUnit.hasError()) {
                        mergeError(adUnit.getError());
                    }
                    if (adUnit.hasServerParams()) {
                        mergeServerParams(adUnit.getServerParams());
                    }
                    mergeUnknownFields(((h0) adUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.Waterfall.Result.AdUnit.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.Result.AdUnit.access$7100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$AdUnit r3 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.Waterfall$Result$AdUnit r4 = (io.bidmachine.protobuf.Waterfall.Result.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Result$AdUnit$Builder");
                }
            }

            public static Builder newBuilder(AdUnit adUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
            }

            public static AdUnit parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteBuffer, wVar);
            }

            private AdUnit(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AdUnit parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (AdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdUnit parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
                this.status_ = 0;
            }

            public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static AdUnit parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (AdUnit) PARSER.parseFrom(bArr, wVar);
            }

            public static AdUnit parseFrom(InputStream inputStream) throws IOException {
                return (AdUnit) h0.parseWithIOException(PARSER, inputStream);
            }

            private AdUnit(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.adUnitId_ = lVar.J();
                                } else if (iK != 17) {
                                    if (iK == 26) {
                                        EstimatedPrice estimatedPrice = this.estimatedPrice_;
                                        EstimatedPrice.Builder builder = estimatedPrice != null ? estimatedPrice.toBuilder() : null;
                                        EstimatedPrice estimatedPrice2 = (EstimatedPrice) lVar.A(EstimatedPrice.parser(), wVar);
                                        this.estimatedPrice_ = estimatedPrice2;
                                        if (builder != null) {
                                            builder.mergeFrom(estimatedPrice2);
                                            this.estimatedPrice_ = builder.buildPartial();
                                        }
                                    } else if (iK == 34) {
                                        StringValue stringValue = this.adResponse_;
                                        StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                        this.adResponse_ = stringValue2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(stringValue2);
                                            this.adResponse_ = builder2.buildPartial();
                                        }
                                    } else if (iK == 40) {
                                        this.status_ = lVar.t();
                                    } else if (iK == 50) {
                                        Error error = this.error_;
                                        Error.Builder builder3 = error != null ? error.toBuilder() : null;
                                        Error error2 = (Error) lVar.A(Error.parser(), wVar);
                                        this.error_ = error2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(error2);
                                            this.error_ = builder3.buildPartial();
                                        }
                                    } else if (iK != 58) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        StringValue stringValue3 = this.serverParams_;
                                        StringValue.Builder builder4 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                        StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                        this.serverParams_ = stringValue4;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(stringValue4);
                                            this.serverParams_ = builder4.buildPartial();
                                        }
                                    }
                                } else {
                                    this.price_ = lVar.s();
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

            public static AdUnit parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (AdUnit) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static AdUnit parseFrom(l lVar) throws IOException {
                return (AdUnit) h0.parseWithIOException(PARSER, lVar);
            }

            public static AdUnit parseFrom(l lVar, w wVar) throws IOException {
                return (AdUnit) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface AdUnitOrBuilder extends MessageOrBuilder {
            StringValue getAdResponse();

            d2 getAdResponseOrBuilder();

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            AdUnit.Error getError();

            AdUnit.ErrorOrBuilder getErrorOrBuilder();

            EstimatedPrice getEstimatedPrice();

            EstimatedPriceOrBuilder getEstimatedPriceOrBuilder();

            double getPrice();

            StringValue getServerParams();

            d2 getServerParamsOrBuilder();

            AdUnit.Status getStatus();

            int getStatusValue();

            boolean hasAdResponse();

            boolean hasError();

            boolean hasEstimatedPrice();

            boolean hasServerParams();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class CachedAdUnit extends h0 implements CachedAdUnitOrBuilder {
            public static final int AD_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_UNIT_ID_FIELD_NUMBER = 1;
            public static final int ESTIMATED_PRICE_FIELD_NUMBER = 3;
            public static final int FROZEN_FIELD_NUMBER = 5;
            public static final int PRICE_FIELD_NUMBER = 2;
            public static final int SERVER_PARAMS_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private StringValue adResponse_;
            private volatile Object adUnitId_;
            private EstimatedPrice estimatedPrice_;
            private boolean frozen_;
            private byte memoizedIsInitialized;
            private double price_;
            private StringValue serverParams_;
            private static final CachedAdUnit DEFAULT_INSTANCE = new CachedAdUnit();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.1
                @Override // com.explorestack.protobuf.p1
                public CachedAdUnit parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new CachedAdUnit(lVar, wVar);
                }
            };

            public static CachedAdUnit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static CachedAdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CachedAdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static CachedAdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CachedAdUnit)) {
                    return super.equals(obj);
                }
                CachedAdUnit cachedAdUnit = (CachedAdUnit) obj;
                if (!getAdUnitId().equals(cachedAdUnit.getAdUnitId()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(cachedAdUnit.getPrice()) || hasEstimatedPrice() != cachedAdUnit.hasEstimatedPrice()) {
                    return false;
                }
                if ((hasEstimatedPrice() && !getEstimatedPrice().equals(cachedAdUnit.getEstimatedPrice())) || hasAdResponse() != cachedAdUnit.hasAdResponse()) {
                    return false;
                }
                if ((!hasAdResponse() || getAdResponse().equals(cachedAdUnit.getAdResponse())) && getFrozen() == cachedAdUnit.getFrozen() && hasServerParams() == cachedAdUnit.hasServerParams()) {
                    return (!hasServerParams() || getServerParams().equals(cachedAdUnit.getServerParams())) && this.unknownFields.equals(cachedAdUnit.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public StringValue getAdResponse() {
                StringValue stringValue = this.adResponse_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public d2 getAdResponseOrBuilder() {
                return getAdResponse();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public String getAdUnitId() {
                Object obj = this.adUnitId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adUnitId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public ByteString getAdUnitIdBytes() {
                Object obj = this.adUnitId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adUnitId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public EstimatedPrice getEstimatedPrice() {
                EstimatedPrice estimatedPrice = this.estimatedPrice_;
                return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                return getEstimatedPrice();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean getFrozen() {
                return this.frozen_;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getAdUnitIdBytes().isEmpty() ? h0.computeStringSize(1, this.adUnitId_) : 0;
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iComputeStringSize += n.j(2, d10);
                }
                if (this.estimatedPrice_ != null) {
                    iComputeStringSize += n.G(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    iComputeStringSize += n.G(4, getAdResponse());
                }
                boolean z10 = this.frozen_;
                if (z10) {
                    iComputeStringSize += n.e(5, z10);
                }
                if (this.serverParams_ != null) {
                    iComputeStringSize += n.G(6, getServerParams());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public StringValue getServerParams() {
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public d2 getServerParamsOrBuilder() {
                return getServerParams();
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasAdResponse() {
                return this.adResponse_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasEstimatedPrice() {
                return this.estimatedPrice_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
            public boolean hasServerParams() {
                return this.serverParams_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdUnitId().hashCode()) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getPrice()));
                if (hasEstimatedPrice()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getEstimatedPrice().hashCode();
                }
                if (hasAdResponse()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getAdResponse().hashCode();
                }
                int iD = (((iHashCode * 37) + 5) * 53) + j0.d(getFrozen());
                if (hasServerParams()) {
                    iD = (((iD * 37) + 6) * 53) + getServerParams().hashCode();
                }
                int iHashCode2 = (iD * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_fieldAccessorTable.d(CachedAdUnit.class, Builder.class);
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
                return new CachedAdUnit();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getAdUnitIdBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.adUnitId_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    nVar.t0(2, d10);
                }
                if (this.estimatedPrice_ != null) {
                    nVar.J0(3, getEstimatedPrice());
                }
                if (this.adResponse_ != null) {
                    nVar.J0(4, getAdResponse());
                }
                boolean z10 = this.frozen_;
                if (z10) {
                    nVar.n0(5, z10);
                }
                if (this.serverParams_ != null) {
                    nVar.J0(6, getServerParams());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements CachedAdUnitOrBuilder {
                private a2 adResponseBuilder_;
                private StringValue adResponse_;
                private Object adUnitId_;
                private a2 estimatedPriceBuilder_;
                private EstimatedPrice estimatedPrice_;
                private boolean frozen_;
                private double price_;
                private a2 serverParamsBuilder_;
                private StringValue serverParams_;

                private a2 getAdResponseFieldBuilder() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponseBuilder_ = new a2(getAdResponse(), getParentForChildren(), isClean());
                        this.adResponse_ = null;
                    }
                    return this.adResponseBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_descriptor;
                }

                private a2 getEstimatedPriceFieldBuilder() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPriceBuilder_ = new a2(getEstimatedPrice(), getParentForChildren(), isClean());
                        this.estimatedPrice_ = null;
                    }
                    return this.estimatedPriceBuilder_;
                }

                private a2 getServerParamsFieldBuilder() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParamsBuilder_ = new a2(getServerParams(), getParentForChildren(), isClean());
                        this.serverParams_ = null;
                    }
                    return this.serverParamsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearAdResponse() {
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                        onChanged();
                        return this;
                    }
                    this.adResponse_ = null;
                    this.adResponseBuilder_ = null;
                    return this;
                }

                public Builder clearAdUnitId() {
                    this.adUnitId_ = CachedAdUnit.getDefaultInstance().getAdUnitId();
                    onChanged();
                    return this;
                }

                public Builder clearEstimatedPrice() {
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                        onChanged();
                        return this;
                    }
                    this.estimatedPrice_ = null;
                    this.estimatedPriceBuilder_ = null;
                    return this;
                }

                public Builder clearFrozen() {
                    this.frozen_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearServerParams() {
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        onChanged();
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public StringValue getAdResponse() {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.adResponse_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getAdResponseBuilder() {
                    onChanged();
                    return (StringValue.Builder) getAdResponseFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public d2 getAdResponseOrBuilder() {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.adResponse_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public String getAdUnitId() {
                    Object obj = this.adUnitId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.adUnitId_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public ByteString getAdUnitIdBytes() {
                    Object obj = this.adUnitId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.adUnitId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_descriptor;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public EstimatedPrice getEstimatedPrice() {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var != null) {
                        return (EstimatedPrice) a2Var.e();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
                }

                public EstimatedPrice.Builder getEstimatedPriceBuilder() {
                    onChanged();
                    return (EstimatedPrice.Builder) getEstimatedPriceFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public EstimatedPriceOrBuilder getEstimatedPriceOrBuilder() {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var != null) {
                        return (EstimatedPriceOrBuilder) a2Var.f();
                    }
                    EstimatedPrice estimatedPrice = this.estimatedPrice_;
                    return estimatedPrice == null ? EstimatedPrice.getDefaultInstance() : estimatedPrice;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean getFrozen() {
                    return this.frozen_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public StringValue getServerParams() {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getServerParamsBuilder() {
                    onChanged();
                    return (StringValue.Builder) getServerParamsFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public d2 getServerParamsOrBuilder() {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.serverParams_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasAdResponse() {
                    return (this.adResponseBuilder_ == null && this.adResponse_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasEstimatedPrice() {
                    return (this.estimatedPriceBuilder_ == null && this.estimatedPrice_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.CachedAdUnitOrBuilder
                public boolean hasServerParams() {
                    return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_fieldAccessorTable.d(CachedAdUnit.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAdResponse(StringValue stringValue) {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.adResponse_;
                    if (stringValue2 != null) {
                        this.adResponse_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.adResponse_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeEstimatedPrice(EstimatedPrice estimatedPrice) {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var != null) {
                        a2Var.g(estimatedPrice);
                        return this;
                    }
                    EstimatedPrice estimatedPrice2 = this.estimatedPrice_;
                    if (estimatedPrice2 != null) {
                        this.estimatedPrice_ = EstimatedPrice.newBuilder(estimatedPrice2).mergeFrom(estimatedPrice).buildPartial();
                    } else {
                        this.estimatedPrice_ = estimatedPrice;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeServerParams(StringValue stringValue) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.serverParams_;
                    if (stringValue2 != null) {
                        this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.serverParams_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setAdResponse(StringValue stringValue) {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.adResponse_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitId(String str) {
                    str.getClass();
                    this.adUnitId_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAdUnitIdBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.adUnitId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice estimatedPrice) {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var != null) {
                        a2Var.i(estimatedPrice);
                        return this;
                    }
                    estimatedPrice.getClass();
                    this.estimatedPrice_ = estimatedPrice;
                    onChanged();
                    return this;
                }

                public Builder setFrozen(boolean z10) {
                    this.frozen_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setServerParams(StringValue stringValue) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.serverParams_ = stringValue;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.adUnitId_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public CachedAdUnit build() {
                    CachedAdUnit cachedAdUnitBuildPartial = buildPartial();
                    if (cachedAdUnitBuildPartial.isInitialized()) {
                        return cachedAdUnitBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) cachedAdUnitBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public CachedAdUnit buildPartial() {
                    CachedAdUnit cachedAdUnit = new CachedAdUnit(this);
                    cachedAdUnit.adUnitId_ = this.adUnitId_;
                    cachedAdUnit.price_ = this.price_;
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var == null) {
                        cachedAdUnit.estimatedPrice_ = this.estimatedPrice_;
                    } else {
                        cachedAdUnit.estimatedPrice_ = (EstimatedPrice) a2Var.a();
                    }
                    a2 a2Var2 = this.adResponseBuilder_;
                    if (a2Var2 == null) {
                        cachedAdUnit.adResponse_ = this.adResponse_;
                    } else {
                        cachedAdUnit.adResponse_ = (StringValue) a2Var2.a();
                    }
                    cachedAdUnit.frozen_ = this.frozen_;
                    a2 a2Var3 = this.serverParamsBuilder_;
                    if (a2Var3 == null) {
                        cachedAdUnit.serverParams_ = this.serverParams_;
                    } else {
                        cachedAdUnit.serverParams_ = (StringValue) a2Var3.a();
                    }
                    onBuilt();
                    return cachedAdUnit;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public CachedAdUnit getDefaultInstanceForType() {
                    return CachedAdUnit.getDefaultInstance();
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
                    this.adUnitId_ = "";
                    this.price_ = 0.0d;
                    if (this.estimatedPriceBuilder_ == null) {
                        this.estimatedPrice_ = null;
                    } else {
                        this.estimatedPrice_ = null;
                        this.estimatedPriceBuilder_ = null;
                    }
                    if (this.adResponseBuilder_ == null) {
                        this.adResponse_ = null;
                    } else {
                        this.adResponse_ = null;
                        this.adResponseBuilder_ = null;
                    }
                    this.frozen_ = false;
                    if (this.serverParamsBuilder_ == null) {
                        this.serverParams_ = null;
                        return this;
                    }
                    this.serverParams_ = null;
                    this.serverParamsBuilder_ = null;
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.adUnitId_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder setAdResponse(StringValue.Builder builder) {
                    a2 a2Var = this.adResponseBuilder_;
                    if (a2Var == null) {
                        this.adResponse_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setEstimatedPrice(EstimatedPrice.Builder builder) {
                    a2 a2Var = this.estimatedPriceBuilder_;
                    if (a2Var == null) {
                        this.estimatedPrice_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setServerParams(StringValue.Builder builder) {
                    a2 a2Var = this.serverParamsBuilder_;
                    if (a2Var == null) {
                        this.serverParams_ = builder.build();
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
                    if (message instanceof CachedAdUnit) {
                        return mergeFrom((CachedAdUnit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(CachedAdUnit cachedAdUnit) {
                    if (cachedAdUnit == CachedAdUnit.getDefaultInstance()) {
                        return this;
                    }
                    if (!cachedAdUnit.getAdUnitId().isEmpty()) {
                        this.adUnitId_ = cachedAdUnit.adUnitId_;
                        onChanged();
                    }
                    if (cachedAdUnit.getPrice() != 0.0d) {
                        setPrice(cachedAdUnit.getPrice());
                    }
                    if (cachedAdUnit.hasEstimatedPrice()) {
                        mergeEstimatedPrice(cachedAdUnit.getEstimatedPrice());
                    }
                    if (cachedAdUnit.hasAdResponse()) {
                        mergeAdResponse(cachedAdUnit.getAdResponse());
                    }
                    if (cachedAdUnit.getFrozen()) {
                        setFrozen(cachedAdUnit.getFrozen());
                    }
                    if (cachedAdUnit.hasServerParams()) {
                        mergeServerParams(cachedAdUnit.getServerParams());
                    }
                    mergeUnknownFields(((h0) cachedAdUnit).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.access$8500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit r3 = (io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit r4 = (io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.CachedAdUnit.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Result$CachedAdUnit$Builder");
                }
            }

            public static Builder newBuilder(CachedAdUnit cachedAdUnit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(cachedAdUnit);
            }

            public static CachedAdUnit parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(byteBuffer, wVar);
            }

            private CachedAdUnit(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static CachedAdUnit parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (CachedAdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static CachedAdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public CachedAdUnit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static CachedAdUnit parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private CachedAdUnit() {
                this.memoizedIsInitialized = (byte) -1;
                this.adUnitId_ = "";
            }

            public static CachedAdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static CachedAdUnit parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (CachedAdUnit) PARSER.parseFrom(bArr, wVar);
            }

            public static CachedAdUnit parseFrom(InputStream inputStream) throws IOException {
                return (CachedAdUnit) h0.parseWithIOException(PARSER, inputStream);
            }

            private CachedAdUnit(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.adUnitId_ = lVar.J();
                                } else if (iK != 17) {
                                    if (iK == 26) {
                                        EstimatedPrice estimatedPrice = this.estimatedPrice_;
                                        EstimatedPrice.Builder builder = estimatedPrice != null ? estimatedPrice.toBuilder() : null;
                                        EstimatedPrice estimatedPrice2 = (EstimatedPrice) lVar.A(EstimatedPrice.parser(), wVar);
                                        this.estimatedPrice_ = estimatedPrice2;
                                        if (builder != null) {
                                            builder.mergeFrom(estimatedPrice2);
                                            this.estimatedPrice_ = builder.buildPartial();
                                        }
                                    } else if (iK == 34) {
                                        StringValue stringValue = this.adResponse_;
                                        StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                        this.adResponse_ = stringValue2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(stringValue2);
                                            this.adResponse_ = builder2.buildPartial();
                                        }
                                    } else if (iK == 40) {
                                        this.frozen_ = lVar.q();
                                    } else if (iK != 50) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        StringValue stringValue3 = this.serverParams_;
                                        StringValue.Builder builder3 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                        StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                        this.serverParams_ = stringValue4;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(stringValue4);
                                            this.serverParams_ = builder3.buildPartial();
                                        }
                                    }
                                } else {
                                    this.price_ = lVar.s();
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

            public static CachedAdUnit parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (CachedAdUnit) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static CachedAdUnit parseFrom(l lVar) throws IOException {
                return (CachedAdUnit) h0.parseWithIOException(PARSER, lVar);
            }

            public static CachedAdUnit parseFrom(l lVar, w wVar) throws IOException {
                return (CachedAdUnit) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface CachedAdUnitOrBuilder extends MessageOrBuilder {
            StringValue getAdResponse();

            d2 getAdResponseOrBuilder();

            String getAdUnitId();

            ByteString getAdUnitIdBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            EstimatedPrice getEstimatedPrice();

            EstimatedPriceOrBuilder getEstimatedPriceOrBuilder();

            boolean getFrozen();

            double getPrice();

            StringValue getServerParams();

            d2 getServerParamsOrBuilder();

            boolean hasAdResponse();

            boolean hasEstimatedPrice();

            boolean hasServerParams();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class EstimatedPrice extends h0 implements EstimatedPriceOrBuilder {
            public static final int CURRENCY_FIELD_NUMBER = 3;
            private static final EstimatedPrice DEFAULT_INSTANCE = new EstimatedPrice();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.1
                @Override // com.explorestack.protobuf.p1
                public EstimatedPrice parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new EstimatedPrice(lVar, wVar);
                }
            };
            public static final int PRECISION_FIELD_NUMBER = 2;
            public static final int VALUE_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private StringValue currency_;
            private byte memoizedIsInitialized;
            private UInt32Value precision_;
            private DoubleValue value_;

            public static EstimatedPrice getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EstimatedPrice parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EstimatedPrice) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EstimatedPrice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EstimatedPrice)) {
                    return super.equals(obj);
                }
                EstimatedPrice estimatedPrice = (EstimatedPrice) obj;
                if (hasValue() != estimatedPrice.hasValue()) {
                    return false;
                }
                if ((hasValue() && !getValue().equals(estimatedPrice.getValue())) || hasPrecision() != estimatedPrice.hasPrecision()) {
                    return false;
                }
                if ((!hasPrecision() || getPrecision().equals(estimatedPrice.getPrecision())) && hasCurrency() == estimatedPrice.hasCurrency()) {
                    return (!hasCurrency() || getCurrency().equals(estimatedPrice.getCurrency())) && this.unknownFields.equals(estimatedPrice.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public StringValue getCurrency() {
                StringValue stringValue = this.currency_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public d2 getCurrencyOrBuilder() {
                return getCurrency();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public UInt32Value getPrecision() {
                UInt32Value uInt32Value = this.precision_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public n2 getPrecisionOrBuilder() {
                return getPrecision();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.value_ != null ? n.G(1, getValue()) : 0;
                if (this.precision_ != null) {
                    iG += n.G(2, getPrecision());
                }
                if (this.currency_ != null) {
                    iG += n.G(3, getCurrency());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public DoubleValue getValue() {
                DoubleValue doubleValue = this.value_;
                return doubleValue == null ? DoubleValue.getDefaultInstance() : doubleValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public q getValueOrBuilder() {
                return getValue();
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasCurrency() {
                return this.currency_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasPrecision() {
                return this.precision_ != null;
            }

            @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
            public boolean hasValue() {
                return this.value_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasValue()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getValue().hashCode();
                }
                if (hasPrecision()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getPrecision().hashCode();
                }
                if (hasCurrency()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getCurrency().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_fieldAccessorTable.d(EstimatedPrice.class, Builder.class);
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
                return new EstimatedPrice();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (this.value_ != null) {
                    nVar.J0(1, getValue());
                }
                if (this.precision_ != null) {
                    nVar.J0(2, getPrecision());
                }
                if (this.currency_ != null) {
                    nVar.J0(3, getCurrency());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements EstimatedPriceOrBuilder {
                private a2 currencyBuilder_;
                private StringValue currency_;
                private a2 precisionBuilder_;
                private UInt32Value precision_;
                private a2 valueBuilder_;
                private DoubleValue value_;

                private a2 getCurrencyFieldBuilder() {
                    if (this.currencyBuilder_ == null) {
                        this.currencyBuilder_ = new a2(getCurrency(), getParentForChildren(), isClean());
                        this.currency_ = null;
                    }
                    return this.currencyBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_descriptor;
                }

                private a2 getPrecisionFieldBuilder() {
                    if (this.precisionBuilder_ == null) {
                        this.precisionBuilder_ = new a2(getPrecision(), getParentForChildren(), isClean());
                        this.precision_ = null;
                    }
                    return this.precisionBuilder_;
                }

                private a2 getValueFieldBuilder() {
                    if (this.valueBuilder_ == null) {
                        this.valueBuilder_ = new a2(getValue(), getParentForChildren(), isClean());
                        this.value_ = null;
                    }
                    return this.valueBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearCurrency() {
                    if (this.currencyBuilder_ == null) {
                        this.currency_ = null;
                        onChanged();
                        return this;
                    }
                    this.currency_ = null;
                    this.currencyBuilder_ = null;
                    return this;
                }

                public Builder clearPrecision() {
                    if (this.precisionBuilder_ == null) {
                        this.precision_ = null;
                        onChanged();
                        return this;
                    }
                    this.precision_ = null;
                    this.precisionBuilder_ = null;
                    return this;
                }

                public Builder clearValue() {
                    if (this.valueBuilder_ == null) {
                        this.value_ = null;
                        onChanged();
                        return this;
                    }
                    this.value_ = null;
                    this.valueBuilder_ = null;
                    return this;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public StringValue getCurrency() {
                    a2 a2Var = this.currencyBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.currency_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getCurrencyBuilder() {
                    onChanged();
                    return (StringValue.Builder) getCurrencyFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public d2 getCurrencyOrBuilder() {
                    a2 a2Var = this.currencyBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.currency_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_descriptor;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public UInt32Value getPrecision() {
                    a2 a2Var = this.precisionBuilder_;
                    if (a2Var != null) {
                        return (UInt32Value) a2Var.e();
                    }
                    UInt32Value uInt32Value = this.precision_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                public UInt32Value.Builder getPrecisionBuilder() {
                    onChanged();
                    return (UInt32Value.Builder) getPrecisionFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public n2 getPrecisionOrBuilder() {
                    a2 a2Var = this.precisionBuilder_;
                    if (a2Var != null) {
                        return (n2) a2Var.f();
                    }
                    UInt32Value uInt32Value = this.precision_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public DoubleValue getValue() {
                    a2 a2Var = this.valueBuilder_;
                    if (a2Var != null) {
                        return (DoubleValue) a2Var.e();
                    }
                    DoubleValue doubleValue = this.value_;
                    return doubleValue == null ? DoubleValue.getDefaultInstance() : doubleValue;
                }

                public DoubleValue.Builder getValueBuilder() {
                    onChanged();
                    return (DoubleValue.Builder) getValueFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public q getValueOrBuilder() {
                    a2 a2Var = this.valueBuilder_;
                    if (a2Var != null) {
                        return (q) a2Var.f();
                    }
                    DoubleValue doubleValue = this.value_;
                    return doubleValue == null ? DoubleValue.getDefaultInstance() : doubleValue;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasCurrency() {
                    return (this.currencyBuilder_ == null && this.currency_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasPrecision() {
                    return (this.precisionBuilder_ == null && this.precision_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.Waterfall.Result.EstimatedPriceOrBuilder
                public boolean hasValue() {
                    return (this.valueBuilder_ == null && this.value_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_fieldAccessorTable.d(EstimatedPrice.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeCurrency(StringValue stringValue) {
                    a2 a2Var = this.currencyBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.currency_;
                    if (stringValue2 != null) {
                        this.currency_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.currency_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergePrecision(UInt32Value uInt32Value) {
                    a2 a2Var = this.precisionBuilder_;
                    if (a2Var != null) {
                        a2Var.g(uInt32Value);
                        return this;
                    }
                    UInt32Value uInt32Value2 = this.precision_;
                    if (uInt32Value2 != null) {
                        this.precision_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.precision_ = uInt32Value;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeValue(DoubleValue doubleValue) {
                    a2 a2Var = this.valueBuilder_;
                    if (a2Var != null) {
                        a2Var.g(doubleValue);
                        return this;
                    }
                    DoubleValue doubleValue2 = this.value_;
                    if (doubleValue2 != null) {
                        this.value_ = DoubleValue.newBuilder(doubleValue2).mergeFrom(doubleValue).buildPartial();
                    } else {
                        this.value_ = doubleValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setCurrency(StringValue stringValue) {
                    a2 a2Var = this.currencyBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.currency_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setPrecision(UInt32Value uInt32Value) {
                    a2 a2Var = this.precisionBuilder_;
                    if (a2Var != null) {
                        a2Var.i(uInt32Value);
                        return this;
                    }
                    uInt32Value.getClass();
                    this.precision_ = uInt32Value;
                    onChanged();
                    return this;
                }

                public Builder setValue(DoubleValue doubleValue) {
                    a2 a2Var = this.valueBuilder_;
                    if (a2Var != null) {
                        a2Var.i(doubleValue);
                        return this;
                    }
                    doubleValue.getClass();
                    this.value_ = doubleValue;
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
                public EstimatedPrice build() {
                    EstimatedPrice estimatedPriceBuildPartial = buildPartial();
                    if (estimatedPriceBuildPartial.isInitialized()) {
                        return estimatedPriceBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) estimatedPriceBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EstimatedPrice buildPartial() {
                    EstimatedPrice estimatedPrice = new EstimatedPrice(this);
                    a2 a2Var = this.valueBuilder_;
                    if (a2Var == null) {
                        estimatedPrice.value_ = this.value_;
                    } else {
                        estimatedPrice.value_ = (DoubleValue) a2Var.a();
                    }
                    a2 a2Var2 = this.precisionBuilder_;
                    if (a2Var2 == null) {
                        estimatedPrice.precision_ = this.precision_;
                    } else {
                        estimatedPrice.precision_ = (UInt32Value) a2Var2.a();
                    }
                    a2 a2Var3 = this.currencyBuilder_;
                    if (a2Var3 == null) {
                        estimatedPrice.currency_ = this.currency_;
                    } else {
                        estimatedPrice.currency_ = (StringValue) a2Var3.a();
                    }
                    onBuilt();
                    return estimatedPrice;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public EstimatedPrice getDefaultInstanceForType() {
                    return EstimatedPrice.getDefaultInstance();
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
                    if (this.valueBuilder_ == null) {
                        this.value_ = null;
                    } else {
                        this.value_ = null;
                        this.valueBuilder_ = null;
                    }
                    if (this.precisionBuilder_ == null) {
                        this.precision_ = null;
                    } else {
                        this.precision_ = null;
                        this.precisionBuilder_ = null;
                    }
                    if (this.currencyBuilder_ == null) {
                        this.currency_ = null;
                        return this;
                    }
                    this.currency_ = null;
                    this.currencyBuilder_ = null;
                    return this;
                }

                public Builder setCurrency(StringValue.Builder builder) {
                    a2 a2Var = this.currencyBuilder_;
                    if (a2Var == null) {
                        this.currency_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setPrecision(UInt32Value.Builder builder) {
                    a2 a2Var = this.precisionBuilder_;
                    if (a2Var == null) {
                        this.precision_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setValue(DoubleValue.Builder builder) {
                    a2 a2Var = this.valueBuilder_;
                    if (a2Var == null) {
                        this.value_ = builder.build();
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
                    if (message instanceof EstimatedPrice) {
                        return mergeFrom((EstimatedPrice) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(EstimatedPrice estimatedPrice) {
                    if (estimatedPrice == EstimatedPrice.getDefaultInstance()) {
                        return this;
                    }
                    if (estimatedPrice.hasValue()) {
                        mergeValue(estimatedPrice.getValue());
                    }
                    if (estimatedPrice.hasPrecision()) {
                        mergePrecision(estimatedPrice.getPrecision());
                    }
                    if (estimatedPrice.hasCurrency()) {
                        mergeCurrency(estimatedPrice.getCurrency());
                    }
                    mergeUnknownFields(((h0) estimatedPrice).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.access$4700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice r3 = (io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice r4 = (io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.EstimatedPrice.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Result$EstimatedPrice$Builder");
                }
            }

            public static Builder newBuilder(EstimatedPrice estimatedPrice) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(estimatedPrice);
            }

            public static EstimatedPrice parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(byteBuffer, wVar);
            }

            private EstimatedPrice(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EstimatedPrice parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (EstimatedPrice) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static EstimatedPrice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public EstimatedPrice getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static EstimatedPrice parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private EstimatedPrice() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EstimatedPrice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static EstimatedPrice parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (EstimatedPrice) PARSER.parseFrom(bArr, wVar);
            }

            private EstimatedPrice(l lVar, w wVar) throws InvalidProtocolBufferException {
                this();
                wVar.getClass();
                r2.b bVarG = r2.g();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            try {
                                int iK = lVar.K();
                                if (iK != 0) {
                                    if (iK == 10) {
                                        DoubleValue doubleValue = this.value_;
                                        DoubleValue.Builder builder = doubleValue != null ? doubleValue.toBuilder() : null;
                                        DoubleValue doubleValue2 = (DoubleValue) lVar.A(DoubleValue.parser(), wVar);
                                        this.value_ = doubleValue2;
                                        if (builder != null) {
                                            builder.mergeFrom(doubleValue2);
                                            this.value_ = builder.buildPartial();
                                        }
                                    } else if (iK == 18) {
                                        UInt32Value uInt32Value = this.precision_;
                                        UInt32Value.Builder builder2 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                        UInt32Value uInt32Value2 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                        this.precision_ = uInt32Value2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(uInt32Value2);
                                            this.precision_ = builder2.buildPartial();
                                        }
                                    } else if (iK != 26) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        StringValue stringValue = this.currency_;
                                        StringValue.Builder builder3 = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                        this.currency_ = stringValue2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(stringValue2);
                                            this.currency_ = builder3.buildPartial();
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
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static EstimatedPrice parseFrom(InputStream inputStream) throws IOException {
                return (EstimatedPrice) h0.parseWithIOException(PARSER, inputStream);
            }

            public static EstimatedPrice parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (EstimatedPrice) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static EstimatedPrice parseFrom(l lVar) throws IOException {
                return (EstimatedPrice) h0.parseWithIOException(PARSER, lVar);
            }

            public static EstimatedPrice parseFrom(l lVar, w wVar) throws IOException {
                return (EstimatedPrice) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface EstimatedPriceOrBuilder extends MessageOrBuilder {
            StringValue getCurrency();

            d2 getCurrencyOrBuilder();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            UInt32Value getPrecision();

            n2 getPrecisionOrBuilder();

            DoubleValue getValue();

            q getValueOrBuilder();

            boolean hasCurrency();

            boolean hasPrecision();

            boolean hasValue();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Result getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Result parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Result) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Result parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return super.equals(obj);
            }
            Result result = (Result) obj;
            if (!getWaterfallId().equals(result.getWaterfallId()) || hasExt() != result.hasExt()) {
                return false;
            }
            if ((hasExt() && !getExt().equals(result.getExt())) || hasFormat() != result.hasFormat()) {
                return false;
            }
            if ((!hasFormat() || getFormat().equals(result.getFormat())) && getAdUnitResultsList().equals(result.getAdUnitResultsList()) && getCachedAdUnitsList().equals(result.getCachedAdUnitsList()) && hasServerParams() == result.hasServerParams()) {
                return (!hasServerParams() || getServerParams().equals(result.getServerParams())) && this.unknownFields.equals(result.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public AdUnit getAdUnitResults(int i10) {
            return this.adUnitResults_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public int getAdUnitResultsCount() {
            return this.adUnitResults_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<AdUnit> getAdUnitResultsList() {
            return this.adUnitResults_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public AdUnitOrBuilder getAdUnitResultsOrBuilder(int i10) {
            return this.adUnitResults_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitResultsOrBuilderList() {
            return this.adUnitResults_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public CachedAdUnit getCachedAdUnits(int i10) {
            return this.cachedAdUnits_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public int getCachedAdUnitsCount() {
            return this.cachedAdUnits_.size();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<CachedAdUnit> getCachedAdUnitsList() {
            return this.cachedAdUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i10) {
            return this.cachedAdUnits_.get(i10);
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public List<? extends CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList() {
            return this.cachedAdUnits_;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public e2 getExtOrBuilder() {
            return getExt();
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StringValue getFormat() {
            StringValue stringValue = this.format_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public d2 getFormatOrBuilder() {
            return getFormat();
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
            int iComputeStringSize = !getWaterfallIdBytes().isEmpty() ? h0.computeStringSize(1, this.waterfallId_) : 0;
            if (this.ext_ != null) {
                iComputeStringSize += n.G(2, getExt());
            }
            if (this.format_ != null) {
                iComputeStringSize += n.G(3, getFormat());
            }
            for (int i11 = 0; i11 < this.adUnitResults_.size(); i11++) {
                iComputeStringSize += n.G(4, this.adUnitResults_.get(i11));
            }
            for (int i12 = 0; i12 < this.cachedAdUnits_.size(); i12++) {
                iComputeStringSize += n.G(5, this.cachedAdUnits_.get(i12));
            }
            if (this.serverParams_ != null) {
                iComputeStringSize += n.G(6, getServerParams());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public StringValue getServerParams() {
            StringValue stringValue = this.serverParams_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public d2 getServerParamsOrBuilder() {
            return getServerParams();
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public String getWaterfallId() {
            Object obj = this.waterfallId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.waterfallId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public ByteString getWaterfallIdBytes() {
            Object obj = this.waterfallId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.waterfallId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasFormat() {
            return this.format_ != null;
        }

        @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
        public boolean hasServerParams() {
            return this.serverParams_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getWaterfallId().hashCode();
            if (hasExt()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getExt().hashCode();
            }
            if (hasFormat()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getFormat().hashCode();
            }
            if (getAdUnitResultsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getAdUnitResultsList().hashCode();
            }
            if (getCachedAdUnitsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getCachedAdUnitsList().hashCode();
            }
            if (hasServerParams()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getServerParams().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_fieldAccessorTable.d(Result.class, Builder.class);
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
            return new Result();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getWaterfallIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.waterfallId_);
            }
            if (this.ext_ != null) {
                nVar.J0(2, getExt());
            }
            if (this.format_ != null) {
                nVar.J0(3, getFormat());
            }
            for (int i10 = 0; i10 < this.adUnitResults_.size(); i10++) {
                nVar.J0(4, this.adUnitResults_.get(i10));
            }
            for (int i11 = 0; i11 < this.cachedAdUnits_.size(); i11++) {
                nVar.J0(5, this.cachedAdUnits_.get(i11));
            }
            if (this.serverParams_ != null) {
                nVar.J0(6, getServerParams());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ResultOrBuilder {
            private v1 adUnitResultsBuilder_;
            private List<AdUnit> adUnitResults_;
            private int bitField0_;
            private v1 cachedAdUnitsBuilder_;
            private List<CachedAdUnit> cachedAdUnits_;
            private a2 extBuilder_;
            private Struct ext_;
            private a2 formatBuilder_;
            private StringValue format_;
            private a2 serverParamsBuilder_;
            private StringValue serverParams_;
            private Object waterfallId_;

            private void ensureAdUnitResultsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.adUnitResults_ = new ArrayList(this.adUnitResults_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureCachedAdUnitsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.cachedAdUnits_ = new ArrayList(this.cachedAdUnits_);
                    this.bitField0_ |= 2;
                }
            }

            private v1 getAdUnitResultsFieldBuilder() {
                if (this.adUnitResultsBuilder_ == null) {
                    this.adUnitResultsBuilder_ = new v1(this.adUnitResults_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.adUnitResults_ = null;
                }
                return this.adUnitResultsBuilder_;
            }

            private v1 getCachedAdUnitsFieldBuilder() {
                if (this.cachedAdUnitsBuilder_ == null) {
                    this.cachedAdUnitsBuilder_ = new v1(this.cachedAdUnits_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.cachedAdUnits_ = null;
                }
                return this.cachedAdUnitsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
            }

            private a2 getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private a2 getFormatFieldBuilder() {
                if (this.formatBuilder_ == null) {
                    this.formatBuilder_ = new a2(getFormat(), getParentForChildren(), isClean());
                    this.format_ = null;
                }
                return this.formatBuilder_;
            }

            private a2 getServerParamsFieldBuilder() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParamsBuilder_ = new a2(getServerParams(), getParentForChildren(), isClean());
                    this.serverParams_ = null;
                }
                return this.serverParamsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getAdUnitResultsFieldBuilder();
                    getCachedAdUnitsFieldBuilder();
                }
            }

            public Builder addAdUnitResults(AdUnit adUnit) {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var != null) {
                    v1Var.e(adUnit);
                    return this;
                }
                adUnit.getClass();
                ensureAdUnitResultsIsMutable();
                this.adUnitResults_.add(adUnit);
                onChanged();
                return this;
            }

            public AdUnit.Builder addAdUnitResultsBuilder() {
                return (AdUnit.Builder) getAdUnitResultsFieldBuilder().c(AdUnit.getDefaultInstance());
            }

            public Builder addAllAdUnitResults(Iterable<? extends AdUnit> iterable) {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureAdUnitResultsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.adUnitResults_);
                onChanged();
                return this;
            }

            public Builder addAllCachedAdUnits(Iterable<? extends CachedAdUnit> iterable) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureCachedAdUnitsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.cachedAdUnits_);
                onChanged();
                return this;
            }

            public Builder addCachedAdUnits(CachedAdUnit cachedAdUnit) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.e(cachedAdUnit);
                    return this;
                }
                cachedAdUnit.getClass();
                ensureCachedAdUnitsIsMutable();
                this.cachedAdUnits_.add(cachedAdUnit);
                onChanged();
                return this;
            }

            public CachedAdUnit.Builder addCachedAdUnitsBuilder() {
                return (CachedAdUnit.Builder) getCachedAdUnitsFieldBuilder().c(CachedAdUnit.getDefaultInstance());
            }

            public Builder clearAdUnitResults() {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.adUnitResults_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCachedAdUnits() {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.cachedAdUnits_ = Collections.EMPTY_LIST;
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

            public Builder clearFormat() {
                if (this.formatBuilder_ == null) {
                    this.format_ = null;
                    onChanged();
                    return this;
                }
                this.format_ = null;
                this.formatBuilder_ = null;
                return this;
            }

            public Builder clearServerParams() {
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    onChanged();
                    return this;
                }
                this.serverParams_ = null;
                this.serverParamsBuilder_ = null;
                return this;
            }

            public Builder clearWaterfallId() {
                this.waterfallId_ = Result.getDefaultInstance().getWaterfallId();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public AdUnit getAdUnitResults(int i10) {
                v1 v1Var = this.adUnitResultsBuilder_;
                return v1Var == null ? this.adUnitResults_.get(i10) : (AdUnit) v1Var.n(i10);
            }

            public AdUnit.Builder getAdUnitResultsBuilder(int i10) {
                return (AdUnit.Builder) getAdUnitResultsFieldBuilder().k(i10);
            }

            public List<AdUnit.Builder> getAdUnitResultsBuilderList() {
                return getAdUnitResultsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public int getAdUnitResultsCount() {
                v1 v1Var = this.adUnitResultsBuilder_;
                return v1Var == null ? this.adUnitResults_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<AdUnit> getAdUnitResultsList() {
                v1 v1Var = this.adUnitResultsBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.adUnitResults_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public AdUnitOrBuilder getAdUnitResultsOrBuilder(int i10) {
                v1 v1Var = this.adUnitResultsBuilder_;
                return v1Var == null ? this.adUnitResults_.get(i10) : (AdUnitOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<? extends AdUnitOrBuilder> getAdUnitResultsOrBuilderList() {
                v1 v1Var = this.adUnitResultsBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.adUnitResults_);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public CachedAdUnit getCachedAdUnits(int i10) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                return v1Var == null ? this.cachedAdUnits_.get(i10) : (CachedAdUnit) v1Var.n(i10);
            }

            public CachedAdUnit.Builder getCachedAdUnitsBuilder(int i10) {
                return (CachedAdUnit.Builder) getCachedAdUnitsFieldBuilder().k(i10);
            }

            public List<CachedAdUnit.Builder> getCachedAdUnitsBuilderList() {
                return getCachedAdUnitsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public int getCachedAdUnitsCount() {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                return v1Var == null ? this.cachedAdUnits_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<CachedAdUnit> getCachedAdUnitsList() {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.cachedAdUnits_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i10) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                return v1Var == null ? this.cachedAdUnits_.get(i10) : (CachedAdUnitOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public List<? extends CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList() {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.cachedAdUnits_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
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

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public e2 getExtOrBuilder() {
                a2 a2Var = this.extBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StringValue getFormat() {
                a2 a2Var = this.formatBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.format_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getFormatBuilder() {
                onChanged();
                return (StringValue.Builder) getFormatFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public d2 getFormatOrBuilder() {
                a2 a2Var = this.formatBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.format_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public StringValue getServerParams() {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getServerParamsBuilder() {
                onChanged();
                return (StringValue.Builder) getServerParamsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public d2 getServerParamsOrBuilder() {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.serverParams_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public String getWaterfallId() {
                Object obj = this.waterfallId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.waterfallId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public ByteString getWaterfallIdBytes() {
                Object obj = this.waterfallId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.waterfallId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasFormat() {
                return (this.formatBuilder_ == null && this.format_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.Waterfall.ResultOrBuilder
            public boolean hasServerParams() {
                return (this.serverParamsBuilder_ == null && this.serverParams_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_Result_fieldAccessorTable.d(Result.class, Builder.class);
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

            public Builder mergeFormat(StringValue stringValue) {
                a2 a2Var = this.formatBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.format_;
                if (stringValue2 != null) {
                    this.format_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.format_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeServerParams(StringValue stringValue) {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.serverParams_;
                if (stringValue2 != null) {
                    this.serverParams_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.serverParams_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder removeAdUnitResults(int i10) {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureAdUnitResultsIsMutable();
                this.adUnitResults_.remove(i10);
                onChanged();
                return this;
            }

            public Builder removeCachedAdUnits(int i10) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureCachedAdUnitsIsMutable();
                this.cachedAdUnits_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAdUnitResults(int i10, AdUnit adUnit) {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, adUnit);
                    return this;
                }
                adUnit.getClass();
                ensureAdUnitResultsIsMutable();
                this.adUnitResults_.set(i10, adUnit);
                onChanged();
                return this;
            }

            public Builder setCachedAdUnits(int i10, CachedAdUnit cachedAdUnit) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, cachedAdUnit);
                    return this;
                }
                cachedAdUnit.getClass();
                ensureCachedAdUnitsIsMutable();
                this.cachedAdUnits_.set(i10, cachedAdUnit);
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

            public Builder setFormat(StringValue stringValue) {
                a2 a2Var = this.formatBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.format_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setServerParams(StringValue stringValue) {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.serverParams_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setWaterfallId(String str) {
                str.getClass();
                this.waterfallId_ = str;
                onChanged();
                return this;
            }

            public Builder setWaterfallIdBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.waterfallId_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.waterfallId_ = "";
                List list = Collections.EMPTY_LIST;
                this.adUnitResults_ = list;
                this.cachedAdUnits_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Result build() {
                Result resultBuildPartial = buildPartial();
                if (resultBuildPartial.isInitialized()) {
                    return resultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resultBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Result buildPartial() {
                Result result = new Result(this);
                result.waterfallId_ = this.waterfallId_;
                a2 a2Var = this.extBuilder_;
                if (a2Var == null) {
                    result.ext_ = this.ext_;
                } else {
                    result.ext_ = (Struct) a2Var.a();
                }
                a2 a2Var2 = this.formatBuilder_;
                if (a2Var2 == null) {
                    result.format_ = this.format_;
                } else {
                    result.format_ = (StringValue) a2Var2.a();
                }
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var != null) {
                    result.adUnitResults_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.adUnitResults_ = DesugarCollections.unmodifiableList(this.adUnitResults_);
                        this.bitField0_ &= -2;
                    }
                    result.adUnitResults_ = this.adUnitResults_;
                }
                v1 v1Var2 = this.cachedAdUnitsBuilder_;
                if (v1Var2 != null) {
                    result.cachedAdUnits_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.cachedAdUnits_ = DesugarCollections.unmodifiableList(this.cachedAdUnits_);
                        this.bitField0_ &= -3;
                    }
                    result.cachedAdUnits_ = this.cachedAdUnits_;
                }
                a2 a2Var3 = this.serverParamsBuilder_;
                if (a2Var3 == null) {
                    result.serverParams_ = this.serverParams_;
                } else {
                    result.serverParams_ = (StringValue) a2Var3.a();
                }
                onBuilt();
                return result;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Result getDefaultInstanceForType() {
                return Result.getDefaultInstance();
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

            public AdUnit.Builder addAdUnitResultsBuilder(int i10) {
                return (AdUnit.Builder) getAdUnitResultsFieldBuilder().b(i10, AdUnit.getDefaultInstance());
            }

            public CachedAdUnit.Builder addCachedAdUnitsBuilder(int i10) {
                return (CachedAdUnit.Builder) getCachedAdUnitsFieldBuilder().b(i10, CachedAdUnit.getDefaultInstance());
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
                this.waterfallId_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                if (this.formatBuilder_ == null) {
                    this.format_ = null;
                } else {
                    this.format_ = null;
                    this.formatBuilder_ = null;
                }
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var == null) {
                    this.adUnitResults_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    v1Var.g();
                }
                v1 v1Var2 = this.cachedAdUnitsBuilder_;
                if (v1Var2 == null) {
                    this.cachedAdUnits_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                } else {
                    v1Var2.g();
                }
                if (this.serverParamsBuilder_ == null) {
                    this.serverParams_ = null;
                    return this;
                }
                this.serverParams_ = null;
                this.serverParamsBuilder_ = null;
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

            public Builder setFormat(StringValue.Builder builder) {
                a2 a2Var = this.formatBuilder_;
                if (a2Var == null) {
                    this.format_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setServerParams(StringValue.Builder builder) {
                a2 a2Var = this.serverParamsBuilder_;
                if (a2Var == null) {
                    this.serverParams_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addAdUnitResults(int i10, AdUnit adUnit) {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var == null) {
                    adUnit.getClass();
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(i10, adUnit);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, adUnit);
                return this;
            }

            public Builder addCachedAdUnits(int i10, CachedAdUnit cachedAdUnit) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var == null) {
                    cachedAdUnit.getClass();
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(i10, cachedAdUnit);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, cachedAdUnit);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Result) {
                    return mergeFrom((Result) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAdUnitResults(int i10, AdUnit.Builder builder) {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder setCachedAdUnits(int i10, CachedAdUnit.Builder builder) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.waterfallId_ = "";
                List list = Collections.EMPTY_LIST;
                this.adUnitResults_ = list;
                this.cachedAdUnits_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Result result) {
                if (result == Result.getDefaultInstance()) {
                    return this;
                }
                if (!result.getWaterfallId().isEmpty()) {
                    this.waterfallId_ = result.waterfallId_;
                    onChanged();
                }
                if (result.hasExt()) {
                    mergeExt(result.getExt());
                }
                if (result.hasFormat()) {
                    mergeFormat(result.getFormat());
                }
                if (this.adUnitResultsBuilder_ == null) {
                    if (!result.adUnitResults_.isEmpty()) {
                        if (this.adUnitResults_.isEmpty()) {
                            this.adUnitResults_ = result.adUnitResults_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAdUnitResultsIsMutable();
                            this.adUnitResults_.addAll(result.adUnitResults_);
                        }
                        onChanged();
                    }
                } else if (!result.adUnitResults_.isEmpty()) {
                    if (!this.adUnitResultsBuilder_.t()) {
                        this.adUnitResultsBuilder_.a(result.adUnitResults_);
                    } else {
                        this.adUnitResultsBuilder_.h();
                        this.adUnitResultsBuilder_ = null;
                        this.adUnitResults_ = result.adUnitResults_;
                        this.bitField0_ &= -2;
                        this.adUnitResultsBuilder_ = h0.alwaysUseFieldBuilders ? getAdUnitResultsFieldBuilder() : null;
                    }
                }
                if (this.cachedAdUnitsBuilder_ == null) {
                    if (!result.cachedAdUnits_.isEmpty()) {
                        if (this.cachedAdUnits_.isEmpty()) {
                            this.cachedAdUnits_ = result.cachedAdUnits_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureCachedAdUnitsIsMutable();
                            this.cachedAdUnits_.addAll(result.cachedAdUnits_);
                        }
                        onChanged();
                    }
                } else if (!result.cachedAdUnits_.isEmpty()) {
                    if (!this.cachedAdUnitsBuilder_.t()) {
                        this.cachedAdUnitsBuilder_.a(result.cachedAdUnits_);
                    } else {
                        this.cachedAdUnitsBuilder_.h();
                        this.cachedAdUnitsBuilder_ = null;
                        this.cachedAdUnits_ = result.cachedAdUnits_;
                        this.bitField0_ &= -3;
                        this.cachedAdUnitsBuilder_ = h0.alwaysUseFieldBuilders ? getCachedAdUnitsFieldBuilder() : null;
                    }
                }
                if (result.hasServerParams()) {
                    mergeServerParams(result.getServerParams());
                }
                mergeUnknownFields(((h0) result).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdUnitResults(AdUnit.Builder builder) {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addCachedAdUnits(CachedAdUnit.Builder builder) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addAdUnitResults(int i10, AdUnit.Builder builder) {
                v1 v1Var = this.adUnitResultsBuilder_;
                if (v1Var == null) {
                    ensureAdUnitResultsIsMutable();
                    this.adUnitResults_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.d(i10, builder.build());
                return this;
            }

            public Builder addCachedAdUnits(int i10, CachedAdUnit.Builder builder) {
                v1 v1Var = this.cachedAdUnitsBuilder_;
                if (v1Var == null) {
                    ensureCachedAdUnitsIsMutable();
                    this.cachedAdUnits_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.Waterfall.Result.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.Result.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.Waterfall$Result r3 = (io.bidmachine.protobuf.Waterfall.Result) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.Waterfall$Result r4 = (io.bidmachine.protobuf.Waterfall.Result) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Result.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Result$Builder");
            }
        }

        public static Builder newBuilder(Result result) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(result);
        }

        public static Result parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Result(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Result parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Result) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Result parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Result getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Result parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Result() {
            this.memoizedIsInitialized = (byte) -1;
            this.waterfallId_ = "";
            List list = Collections.EMPTY_LIST;
            this.adUnitResults_ = list;
            this.cachedAdUnits_ = list;
        }

        public static Result parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Result parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Result) PARSER.parseFrom(bArr, wVar);
        }

        public static Result parseFrom(InputStream inputStream) throws IOException {
            return (Result) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Result parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Result) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        private Result(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            if (iK != 10) {
                                if (iK == 18) {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
                                    }
                                } else if (iK == 26) {
                                    StringValue stringValue = this.format_;
                                    StringValue.Builder builder2 = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                    this.format_ = stringValue2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(stringValue2);
                                        this.format_ = builder2.buildPartial();
                                    }
                                } else if (iK == 34) {
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 == 0) {
                                        this.adUnitResults_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.adUnitResults_.add((AdUnit) lVar.A(AdUnit.parser(), wVar));
                                } else if (iK == 42) {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.cachedAdUnits_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.cachedAdUnits_.add((CachedAdUnit) lVar.A(CachedAdUnit.parser(), wVar));
                                } else if (iK != 50) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    StringValue stringValue3 = this.serverParams_;
                                    StringValue.Builder builder3 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                    StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                    this.serverParams_ = stringValue4;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(stringValue4);
                                        this.serverParams_ = builder3.buildPartial();
                                    }
                                }
                            } else {
                                this.waterfallId_ = lVar.J();
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
                        this.adUnitResults_ = DesugarCollections.unmodifiableList(this.adUnitResults_);
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.cachedAdUnits_ = DesugarCollections.unmodifiableList(this.cachedAdUnits_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.adUnitResults_ = DesugarCollections.unmodifiableList(this.adUnitResults_);
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.cachedAdUnits_ = DesugarCollections.unmodifiableList(this.cachedAdUnits_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Result parseFrom(l lVar) throws IOException {
            return (Result) h0.parseWithIOException(PARSER, lVar);
        }

        public static Result parseFrom(l lVar, w wVar) throws IOException {
            return (Result) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ResultOrBuilder extends MessageOrBuilder {
        Result.AdUnit getAdUnitResults(int i10);

        int getAdUnitResultsCount();

        List<Result.AdUnit> getAdUnitResultsList();

        Result.AdUnitOrBuilder getAdUnitResultsOrBuilder(int i10);

        List<? extends Result.AdUnitOrBuilder> getAdUnitResultsOrBuilderList();

        Result.CachedAdUnit getCachedAdUnits(int i10);

        int getCachedAdUnitsCount();

        List<Result.CachedAdUnit> getCachedAdUnitsList();

        Result.CachedAdUnitOrBuilder getCachedAdUnitsOrBuilder(int i10);

        List<? extends Result.CachedAdUnitOrBuilder> getCachedAdUnitsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        Struct getExt();

        e2 getExtOrBuilder();

        StringValue getFormat();

        d2 getFormatOrBuilder();

        StringValue getServerParams();

        d2 getServerParamsOrBuilder();

        String getWaterfallId();

        ByteString getWaterfallIdBytes();

        boolean hasExt();

        boolean hasFormat();

        boolean hasServerParams();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Waterfall getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Waterfall parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Waterfall) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Waterfall parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Waterfall)) {
            return super.equals(obj);
        }
        Waterfall waterfall = (Waterfall) obj;
        if (!getPayloadCase().equals(waterfall.getPayloadCase())) {
            return false;
        }
        int i10 = this.payloadCase_;
        if (i10 != 1) {
            if (i10 == 2 && !getResponse().equals(waterfall.getResponse())) {
                return false;
            }
        } else if (!getRequest().equals(waterfall.getRequest())) {
            return false;
        }
        return this.unknownFields.equals(waterfall.unknownFields);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public Result getRequest() {
        return this.payloadCase_ == 1 ? (Result) this.payload_ : Result.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public ResultOrBuilder getRequestOrBuilder() {
        return this.payloadCase_ == 1 ? (Result) this.payload_ : Result.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public Configuration getResponse() {
        return this.payloadCase_ == 2 ? (Configuration) this.payload_ : Configuration.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public ConfigurationOrBuilder getResponseOrBuilder() {
        return this.payloadCase_ == 2 ? (Configuration) this.payload_ : Configuration.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.payloadCase_ == 1 ? n.G(1, (Result) this.payload_) : 0;
        if (this.payloadCase_ == 2) {
            iG += n.G(2, (Configuration) this.payload_);
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public boolean hasRequest() {
        return this.payloadCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.WaterfallOrBuilder
    public boolean hasResponse() {
        return this.payloadCase_ == 2;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = 779 + getDescriptor().hashCode();
        int i12 = this.payloadCase_;
        if (i12 != 1) {
            if (i12 == 2) {
                i10 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getResponse().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        i10 = ((iHashCode2 * 37) + 1) * 53;
        iHashCode = getRequest().hashCode();
        iHashCode2 = i10 + iHashCode;
        int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_fieldAccessorTable.d(Waterfall.class, Builder.class);
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
        return new Waterfall();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.payloadCase_ == 1) {
            nVar.J0(1, (Result) this.payload_);
        }
        if (this.payloadCase_ == 2) {
            nVar.J0(2, (Configuration) this.payload_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements WaterfallOrBuilder {
        private int payloadCase_;
        private Object payload_;
        private a2 requestBuilder_;
        private a2 responseBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
        }

        private a2 getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadCase_ != 1) {
                    this.payload_ = Result.getDefaultInstance();
                }
                this.requestBuilder_ = new a2((Result) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 1;
            onChanged();
            return this.requestBuilder_;
        }

        private a2 getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadCase_ != 2) {
                    this.payload_ = Configuration.getDefaultInstance();
                }
                this.responseBuilder_ = new a2((Configuration) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 2;
            onChanged();
            return this.responseBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequest() {
            a2 a2Var = this.requestBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearResponse() {
            a2 a2Var = this.responseBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            a2Var.b();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_descriptor;
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public Result getRequest() {
            a2 a2Var = this.requestBuilder_;
            return a2Var == null ? this.payloadCase_ == 1 ? (Result) this.payload_ : Result.getDefaultInstance() : this.payloadCase_ == 1 ? (Result) a2Var.e() : Result.getDefaultInstance();
        }

        public Result.Builder getRequestBuilder() {
            return (Result.Builder) getRequestFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public ResultOrBuilder getRequestOrBuilder() {
            a2 a2Var;
            int i10 = this.payloadCase_;
            return (i10 != 1 || (a2Var = this.requestBuilder_) == null) ? i10 == 1 ? (Result) this.payload_ : Result.getDefaultInstance() : (ResultOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public Configuration getResponse() {
            a2 a2Var = this.responseBuilder_;
            return a2Var == null ? this.payloadCase_ == 2 ? (Configuration) this.payload_ : Configuration.getDefaultInstance() : this.payloadCase_ == 2 ? (Configuration) a2Var.e() : Configuration.getDefaultInstance();
        }

        public Configuration.Builder getResponseBuilder() {
            return (Configuration.Builder) getResponseFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public ConfigurationOrBuilder getResponseOrBuilder() {
            a2 a2Var;
            int i10 = this.payloadCase_;
            return (i10 != 2 || (a2Var = this.responseBuilder_) == null) ? i10 == 2 ? (Configuration) this.payload_ : Configuration.getDefaultInstance() : (ConfigurationOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public boolean hasRequest() {
            return this.payloadCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.WaterfallOrBuilder
        public boolean hasResponse() {
            return this.payloadCase_ == 2;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return WaterfallProto.internal_static_bidmachine_protobuf_Waterfall_fieldAccessorTable.d(Waterfall.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeRequest(Result result) {
            a2 a2Var = this.requestBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ != 1 || this.payload_ == Result.getDefaultInstance()) {
                    this.payload_ = result;
                } else {
                    this.payload_ = Result.newBuilder((Result) this.payload_).mergeFrom(result).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 1) {
                    a2Var.g(result);
                }
                this.requestBuilder_.i(result);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder mergeResponse(Configuration configuration) {
            a2 a2Var = this.responseBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ != 2 || this.payload_ == Configuration.getDefaultInstance()) {
                    this.payload_ = configuration;
                } else {
                    this.payload_ = Configuration.newBuilder((Configuration) this.payload_).mergeFrom(configuration).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 2) {
                    a2Var.g(configuration);
                }
                this.responseBuilder_.i(configuration);
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder setRequest(Result result) {
            a2 a2Var = this.requestBuilder_;
            if (a2Var == null) {
                result.getClass();
                this.payload_ = result;
                onChanged();
            } else {
                a2Var.i(result);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setResponse(Configuration configuration) {
            a2 a2Var = this.responseBuilder_;
            if (a2Var == null) {
                configuration.getClass();
                this.payload_ = configuration;
                onChanged();
            } else {
                a2Var.i(configuration);
            }
            this.payloadCase_ = 2;
            return this;
        }

        private Builder() {
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Waterfall build() {
            Waterfall waterfallBuildPartial = buildPartial();
            if (waterfallBuildPartial.isInitialized()) {
                return waterfallBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) waterfallBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Waterfall buildPartial() {
            Waterfall waterfall = new Waterfall(this);
            if (this.payloadCase_ == 1) {
                a2 a2Var = this.requestBuilder_;
                if (a2Var == null) {
                    waterfall.payload_ = this.payload_;
                } else {
                    waterfall.payload_ = a2Var.a();
                }
            }
            if (this.payloadCase_ == 2) {
                a2 a2Var2 = this.responseBuilder_;
                if (a2Var2 == null) {
                    waterfall.payload_ = this.payload_;
                } else {
                    waterfall.payload_ = a2Var2.a();
                }
            }
            waterfall.payloadCase_ = this.payloadCase_;
            onBuilt();
            return waterfall;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Waterfall getDefaultInstanceForType() {
            return Waterfall.getDefaultInstance();
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
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Waterfall) {
                return mergeFrom((Waterfall) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRequest(Result.Builder builder) {
            a2 a2Var = this.requestBuilder_;
            if (a2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setResponse(Configuration.Builder builder) {
            a2 a2Var = this.responseBuilder_;
            if (a2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder mergeFrom(Waterfall waterfall) {
            if (waterfall == Waterfall.getDefaultInstance()) {
                return this;
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$Waterfall$PayloadCase[waterfall.getPayloadCase().ordinal()];
            if (i10 == 1) {
                mergeRequest(waterfall.getRequest());
            } else if (i10 == 2) {
                mergeResponse(waterfall.getResponse());
            }
            mergeUnknownFields(((h0) waterfall).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.Waterfall.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Waterfall.access$12100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.Waterfall r3 = (io.bidmachine.protobuf.Waterfall) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.Waterfall r4 = (io.bidmachine.protobuf.Waterfall) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Waterfall.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Waterfall$Builder");
        }
    }

    public static Builder newBuilder(Waterfall waterfall) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(waterfall);
    }

    public static Waterfall parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Waterfall(h0.b bVar) {
        super(bVar);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Waterfall parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Waterfall) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Waterfall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Waterfall getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Waterfall parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Waterfall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private Waterfall() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Waterfall parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Waterfall) PARSER.parseFrom(bArr, wVar);
    }

    public static Waterfall parseFrom(InputStream inputStream) throws IOException {
        return (Waterfall) h0.parseWithIOException(PARSER, inputStream);
    }

    private Waterfall(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            Result.Builder builder = this.payloadCase_ == 1 ? ((Result) this.payload_).toBuilder() : null;
                            MessageLite messageLiteA = lVar.A(Result.parser(), wVar);
                            this.payload_ = messageLiteA;
                            if (builder != null) {
                                builder.mergeFrom((Result) messageLiteA);
                                this.payload_ = builder.buildPartial();
                            }
                            this.payloadCase_ = 1;
                        } else if (iK != 18) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Configuration.Builder builder2 = this.payloadCase_ == 2 ? ((Configuration) this.payload_).toBuilder() : null;
                            MessageLite messageLiteA2 = lVar.A(Configuration.parser(), wVar);
                            this.payload_ = messageLiteA2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Configuration) messageLiteA2);
                                this.payload_ = builder2.buildPartial();
                            }
                            this.payloadCase_ = 2;
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

    public static Waterfall parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Waterfall) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Waterfall parseFrom(l lVar) throws IOException {
        return (Waterfall) h0.parseWithIOException(PARSER, lVar);
    }

    public static Waterfall parseFrom(l lVar, w wVar) throws IOException {
        return (Waterfall) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
