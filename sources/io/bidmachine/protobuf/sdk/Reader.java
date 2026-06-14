package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.d2;
import com.explorestack.protobuf.g;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.k;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.n2;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.sdk.Error;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Reader extends h0 implements ReaderOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int RECORDS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Record> records_;
    private Timestamp timestamp_;
    private static final Reader DEFAULT_INSTANCE = new Reader();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Reader.1
        @Override // com.explorestack.protobuf.p1
        public Reader parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Reader(lVar, wVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.Reader$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase;

        static {
            int[] iArr = new int[Rule.RuleOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase = iArr;
            try {
                iArr[Rule.RuleOneofCase.GENERAL_RULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[Rule.RuleOneofCase.IOS_LOG_RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[Rule.RuleOneofCase.PUR_RULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[Rule.RuleOneofCase.RULEONEOF_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Configuration extends h0 implements ConfigurationOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int RULES_FIELD_NUMBER = 5;
        public static final int UNIQUE_ONLY_FIELD_NUMBER = 4;
        public static final int UPDATE_INTERVAL_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private StringValue name_;
        private List<Rule> rules_;
        private BoolValue uniqueOnly_;
        private UInt32Value updateInterval_;
        private StringValue url_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Reader.Configuration.1
            @Override // com.explorestack.protobuf.p1
            public Configuration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Configuration(lVar, wVar);
            }
        };

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
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
            if (hasName() != configuration.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(configuration.getName())) || hasUrl() != configuration.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(configuration.getUrl())) || hasUpdateInterval() != configuration.hasUpdateInterval()) {
                return false;
            }
            if ((!hasUpdateInterval() || getUpdateInterval().equals(configuration.getUpdateInterval())) && hasUniqueOnly() == configuration.hasUniqueOnly()) {
                return (!hasUniqueOnly() || getUniqueOnly().equals(configuration.getUniqueOnly())) && getRulesList().equals(configuration.getRulesList()) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public StringValue getName() {
            StringValue stringValue = this.name_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public d2 getNameOrBuilder() {
            return getName();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public Rule getRules(int i10) {
            return this.rules_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public int getRulesCount() {
            return this.rules_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public List<Rule> getRulesList() {
            return this.rules_;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public RuleOrBuilder getRulesOrBuilder(int i10) {
            return this.rules_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public List<? extends RuleOrBuilder> getRulesOrBuilderList() {
            return this.rules_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.name_ != null ? n.G(1, getName()) : 0;
            if (this.url_ != null) {
                iG += n.G(2, getUrl());
            }
            if (this.updateInterval_ != null) {
                iG += n.G(3, getUpdateInterval());
            }
            if (this.uniqueOnly_ != null) {
                iG += n.G(4, getUniqueOnly());
            }
            for (int i11 = 0; i11 < this.rules_.size(); i11++) {
                iG += n.G(5, this.rules_.get(i11));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public BoolValue getUniqueOnly() {
            BoolValue boolValue = this.uniqueOnly_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public g getUniqueOnlyOrBuilder() {
            return getUniqueOnly();
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public UInt32Value getUpdateInterval() {
            UInt32Value uInt32Value = this.updateInterval_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public n2 getUpdateIntervalOrBuilder() {
            return getUpdateInterval();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public StringValue getUrl() {
            StringValue stringValue = this.url_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public d2 getUrlOrBuilder() {
            return getUrl();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasName() {
            return this.name_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasUniqueOnly() {
            return this.uniqueOnly_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasUpdateInterval() {
            return this.updateInterval_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasUrl() {
            return this.url_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasUrl()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getUrl().hashCode();
            }
            if (hasUpdateInterval()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getUpdateInterval().hashCode();
            }
            if (hasUniqueOnly()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getUniqueOnly().hashCode();
            }
            if (getRulesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getRulesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
            if (this.name_ != null) {
                nVar.J0(1, getName());
            }
            if (this.url_ != null) {
                nVar.J0(2, getUrl());
            }
            if (this.updateInterval_ != null) {
                nVar.J0(3, getUpdateInterval());
            }
            if (this.uniqueOnly_ != null) {
                nVar.J0(4, getUniqueOnly());
            }
            for (int i10 = 0; i10 < this.rules_.size(); i10++) {
                nVar.J0(5, this.rules_.get(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ConfigurationOrBuilder {
            private int bitField0_;
            private a2 nameBuilder_;
            private StringValue name_;
            private v1 rulesBuilder_;
            private List<Rule> rules_;
            private a2 uniqueOnlyBuilder_;
            private BoolValue uniqueOnly_;
            private a2 updateIntervalBuilder_;
            private UInt32Value updateInterval_;
            private a2 urlBuilder_;
            private StringValue url_;

            private void ensureRulesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.rules_ = new ArrayList(this.rules_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
            }

            private a2 getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new a2(getName(), getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            private v1 getRulesFieldBuilder() {
                if (this.rulesBuilder_ == null) {
                    this.rulesBuilder_ = new v1(this.rules_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.rules_ = null;
                }
                return this.rulesBuilder_;
            }

            private a2 getUniqueOnlyFieldBuilder() {
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnlyBuilder_ = new a2(getUniqueOnly(), getParentForChildren(), isClean());
                    this.uniqueOnly_ = null;
                }
                return this.uniqueOnlyBuilder_;
            }

            private a2 getUpdateIntervalFieldBuilder() {
                if (this.updateIntervalBuilder_ == null) {
                    this.updateIntervalBuilder_ = new a2(getUpdateInterval(), getParentForChildren(), isClean());
                    this.updateInterval_ = null;
                }
                return this.updateIntervalBuilder_;
            }

            private a2 getUrlFieldBuilder() {
                if (this.urlBuilder_ == null) {
                    this.urlBuilder_ = new a2(getUrl(), getParentForChildren(), isClean());
                    this.url_ = null;
                }
                return this.urlBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getRulesFieldBuilder();
                }
            }

            public Builder addAllRules(Iterable<? extends Rule> iterable) {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureRulesIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.rules_);
                onChanged();
                return this;
            }

            public Builder addRules(Rule rule) {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var != null) {
                    v1Var.e(rule);
                    return this;
                }
                rule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(rule);
                onChanged();
                return this;
            }

            public Rule.Builder addRulesBuilder() {
                return (Rule.Builder) getRulesFieldBuilder().c(Rule.getDefaultInstance());
            }

            public Builder clearName() {
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                    onChanged();
                    return this;
                }
                this.name_ = null;
                this.nameBuilder_ = null;
                return this;
            }

            public Builder clearRules() {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.rules_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUniqueOnly() {
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnly_ = null;
                    onChanged();
                    return this;
                }
                this.uniqueOnly_ = null;
                this.uniqueOnlyBuilder_ = null;
                return this;
            }

            public Builder clearUpdateInterval() {
                if (this.updateIntervalBuilder_ == null) {
                    this.updateInterval_ = null;
                    onChanged();
                    return this;
                }
                this.updateInterval_ = null;
                this.updateIntervalBuilder_ = null;
                return this;
            }

            public Builder clearUrl() {
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                    onChanged();
                    return this;
                }
                this.url_ = null;
                this.urlBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public StringValue getName() {
                a2 a2Var = this.nameBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getNameBuilder() {
                onChanged();
                return (StringValue.Builder) getNameFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public d2 getNameOrBuilder() {
                a2 a2Var = this.nameBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public Rule getRules(int i10) {
                v1 v1Var = this.rulesBuilder_;
                return v1Var == null ? this.rules_.get(i10) : (Rule) v1Var.n(i10);
            }

            public Rule.Builder getRulesBuilder(int i10) {
                return (Rule.Builder) getRulesFieldBuilder().k(i10);
            }

            public List<Rule.Builder> getRulesBuilderList() {
                return getRulesFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public int getRulesCount() {
                v1 v1Var = this.rulesBuilder_;
                return v1Var == null ? this.rules_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public List<Rule> getRulesList() {
                v1 v1Var = this.rulesBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.rules_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public RuleOrBuilder getRulesOrBuilder(int i10) {
                v1 v1Var = this.rulesBuilder_;
                return v1Var == null ? this.rules_.get(i10) : (RuleOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public List<? extends RuleOrBuilder> getRulesOrBuilderList() {
                v1 v1Var = this.rulesBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.rules_);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public BoolValue getUniqueOnly() {
                a2 a2Var = this.uniqueOnlyBuilder_;
                if (a2Var != null) {
                    return (BoolValue) a2Var.e();
                }
                BoolValue boolValue = this.uniqueOnly_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public BoolValue.Builder getUniqueOnlyBuilder() {
                onChanged();
                return (BoolValue.Builder) getUniqueOnlyFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public g getUniqueOnlyOrBuilder() {
                a2 a2Var = this.uniqueOnlyBuilder_;
                if (a2Var != null) {
                    return (g) a2Var.f();
                }
                BoolValue boolValue = this.uniqueOnly_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public UInt32Value getUpdateInterval() {
                a2 a2Var = this.updateIntervalBuilder_;
                if (a2Var != null) {
                    return (UInt32Value) a2Var.e();
                }
                UInt32Value uInt32Value = this.updateInterval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getUpdateIntervalBuilder() {
                onChanged();
                return (UInt32Value.Builder) getUpdateIntervalFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public n2 getUpdateIntervalOrBuilder() {
                a2 a2Var = this.updateIntervalBuilder_;
                if (a2Var != null) {
                    return (n2) a2Var.f();
                }
                UInt32Value uInt32Value = this.updateInterval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public StringValue getUrl() {
                a2 a2Var = this.urlBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getUrlBuilder() {
                onChanged();
                return (StringValue.Builder) getUrlFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public d2 getUrlOrBuilder() {
                a2 a2Var = this.urlBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasName() {
                return (this.nameBuilder_ == null && this.name_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUniqueOnly() {
                return (this.uniqueOnlyBuilder_ == null && this.uniqueOnly_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUpdateInterval() {
                return (this.updateIntervalBuilder_ == null && this.updateInterval_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUrl() {
                return (this.urlBuilder_ == null && this.url_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeName(StringValue stringValue) {
                a2 a2Var = this.nameBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.name_;
                if (stringValue2 != null) {
                    this.name_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.name_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeUniqueOnly(BoolValue boolValue) {
                a2 a2Var = this.uniqueOnlyBuilder_;
                if (a2Var != null) {
                    a2Var.g(boolValue);
                    return this;
                }
                BoolValue boolValue2 = this.uniqueOnly_;
                if (boolValue2 != null) {
                    this.uniqueOnly_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                } else {
                    this.uniqueOnly_ = boolValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeUpdateInterval(UInt32Value uInt32Value) {
                a2 a2Var = this.updateIntervalBuilder_;
                if (a2Var != null) {
                    a2Var.g(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.updateInterval_;
                if (uInt32Value2 != null) {
                    this.updateInterval_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.updateInterval_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeUrl(StringValue stringValue) {
                a2 a2Var = this.urlBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.url_;
                if (stringValue2 != null) {
                    this.url_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.url_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder removeRules(int i10) {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureRulesIsMutable();
                this.rules_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setName(StringValue stringValue) {
                a2 a2Var = this.nameBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.name_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setRules(int i10, Rule rule) {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, rule);
                    return this;
                }
                rule.getClass();
                ensureRulesIsMutable();
                this.rules_.set(i10, rule);
                onChanged();
                return this;
            }

            public Builder setUniqueOnly(BoolValue boolValue) {
                a2 a2Var = this.uniqueOnlyBuilder_;
                if (a2Var != null) {
                    a2Var.i(boolValue);
                    return this;
                }
                boolValue.getClass();
                this.uniqueOnly_ = boolValue;
                onChanged();
                return this;
            }

            public Builder setUpdateInterval(UInt32Value uInt32Value) {
                a2 a2Var = this.updateIntervalBuilder_;
                if (a2Var != null) {
                    a2Var.i(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.updateInterval_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setUrl(StringValue stringValue) {
                a2 a2Var = this.urlBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.url_ = stringValue;
                onChanged();
                return this;
            }

            private Builder() {
                this.rules_ = Collections.EMPTY_LIST;
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
                a2 a2Var = this.nameBuilder_;
                if (a2Var == null) {
                    configuration.name_ = this.name_;
                } else {
                    configuration.name_ = (StringValue) a2Var.a();
                }
                a2 a2Var2 = this.urlBuilder_;
                if (a2Var2 == null) {
                    configuration.url_ = this.url_;
                } else {
                    configuration.url_ = (StringValue) a2Var2.a();
                }
                a2 a2Var3 = this.updateIntervalBuilder_;
                if (a2Var3 == null) {
                    configuration.updateInterval_ = this.updateInterval_;
                } else {
                    configuration.updateInterval_ = (UInt32Value) a2Var3.a();
                }
                a2 a2Var4 = this.uniqueOnlyBuilder_;
                if (a2Var4 == null) {
                    configuration.uniqueOnly_ = this.uniqueOnly_;
                } else {
                    configuration.uniqueOnly_ = (BoolValue) a2Var4.a();
                }
                v1 v1Var = this.rulesBuilder_;
                if (v1Var != null) {
                    configuration.rules_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.rules_ = DesugarCollections.unmodifiableList(this.rules_);
                        this.bitField0_ &= -2;
                    }
                    configuration.rules_ = this.rules_;
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

            public Rule.Builder addRulesBuilder(int i10) {
                return (Rule.Builder) getRulesFieldBuilder().b(i10, Rule.getDefaultInstance());
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
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                } else {
                    this.name_ = null;
                    this.nameBuilder_ = null;
                }
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                } else {
                    this.url_ = null;
                    this.urlBuilder_ = null;
                }
                if (this.updateIntervalBuilder_ == null) {
                    this.updateInterval_ = null;
                } else {
                    this.updateInterval_ = null;
                    this.updateIntervalBuilder_ = null;
                }
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnly_ = null;
                } else {
                    this.uniqueOnly_ = null;
                    this.uniqueOnlyBuilder_ = null;
                }
                v1 v1Var = this.rulesBuilder_;
                if (v1Var == null) {
                    this.rules_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                v1Var.g();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.rules_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setName(StringValue.Builder builder) {
                a2 a2Var = this.nameBuilder_;
                if (a2Var == null) {
                    this.name_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setUniqueOnly(BoolValue.Builder builder) {
                a2 a2Var = this.uniqueOnlyBuilder_;
                if (a2Var == null) {
                    this.uniqueOnly_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setUpdateInterval(UInt32Value.Builder builder) {
                a2 a2Var = this.updateIntervalBuilder_;
                if (a2Var == null) {
                    this.updateInterval_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setUrl(StringValue.Builder builder) {
                a2 a2Var = this.urlBuilder_;
                if (a2Var == null) {
                    this.url_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addRules(int i10, Rule rule) {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var == null) {
                    rule.getClass();
                    ensureRulesIsMutable();
                    this.rules_.add(i10, rule);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, rule);
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

            public Builder setRules(int i10, Rule.Builder builder) {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var == null) {
                    ensureRulesIsMutable();
                    this.rules_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasName()) {
                    mergeName(configuration.getName());
                }
                if (configuration.hasUrl()) {
                    mergeUrl(configuration.getUrl());
                }
                if (configuration.hasUpdateInterval()) {
                    mergeUpdateInterval(configuration.getUpdateInterval());
                }
                if (configuration.hasUniqueOnly()) {
                    mergeUniqueOnly(configuration.getUniqueOnly());
                }
                if (this.rulesBuilder_ == null) {
                    if (!configuration.rules_.isEmpty()) {
                        if (this.rules_.isEmpty()) {
                            this.rules_ = configuration.rules_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureRulesIsMutable();
                            this.rules_.addAll(configuration.rules_);
                        }
                        onChanged();
                    }
                } else if (!configuration.rules_.isEmpty()) {
                    if (!this.rulesBuilder_.t()) {
                        this.rulesBuilder_.a(configuration.rules_);
                    } else {
                        this.rulesBuilder_.h();
                        this.rulesBuilder_ = null;
                        this.rules_ = configuration.rules_;
                        this.bitField0_ &= -2;
                        this.rulesBuilder_ = h0.alwaysUseFieldBuilders ? getRulesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) configuration).unknownFields);
                onChanged();
                return this;
            }

            public Builder addRules(Rule.Builder builder) {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var == null) {
                    ensureRulesIsMutable();
                    this.rules_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addRules(int i10, Rule.Builder builder) {
                v1 v1Var = this.rulesBuilder_;
                if (v1Var == null) {
                    ensureRulesIsMutable();
                    this.rules_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sdk.Reader.Configuration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Reader.Configuration.access$1100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Reader$Configuration r3 = (io.bidmachine.protobuf.sdk.Reader.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Reader$Configuration r4 = (io.bidmachine.protobuf.sdk.Reader.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Configuration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Reader$Configuration$Builder");
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
            this.rules_ = Collections.EMPTY_LIST;
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
                        if (iK != 0) {
                            if (iK == 10) {
                                StringValue stringValue = this.name_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.name_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.name_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                StringValue stringValue3 = this.url_;
                                StringValue.Builder builder2 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.url_ = stringValue4;
                                if (builder2 != null) {
                                    builder2.mergeFrom(stringValue4);
                                    this.url_ = builder2.buildPartial();
                                }
                            } else if (iK == 26) {
                                UInt32Value uInt32Value = this.updateInterval_;
                                UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                UInt32Value uInt32Value2 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                this.updateInterval_ = uInt32Value2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(uInt32Value2);
                                    this.updateInterval_ = builder3.buildPartial();
                                }
                            } else if (iK == 34) {
                                BoolValue boolValue = this.uniqueOnly_;
                                BoolValue.Builder builder4 = boolValue != null ? boolValue.toBuilder() : null;
                                BoolValue boolValue2 = (BoolValue) lVar.A(BoolValue.parser(), wVar);
                                this.uniqueOnly_ = boolValue2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(boolValue2);
                                    this.uniqueOnly_ = builder4.buildPartial();
                                }
                            } else if (iK != 42) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (b10 == false) {
                                    this.rules_ = new ArrayList();
                                    b10 = true;
                                }
                                this.rules_.add((Rule) lVar.A(Rule.parser(), wVar));
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
                        this.rules_ = DesugarCollections.unmodifiableList(this.rules_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (b10 != false) {
                this.rules_ = DesugarCollections.unmodifiableList(this.rules_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Configuration parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Configuration parseFrom(l lVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, lVar);
        }

        public static Configuration parseFrom(l lVar, w wVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        StringValue getName();

        d2 getNameOrBuilder();

        Rule getRules(int i10);

        int getRulesCount();

        List<Rule> getRulesList();

        RuleOrBuilder getRulesOrBuilder(int i10);

        List<? extends RuleOrBuilder> getRulesOrBuilderList();

        BoolValue getUniqueOnly();

        g getUniqueOnlyOrBuilder();

        UInt32Value getUpdateInterval();

        n2 getUpdateIntervalOrBuilder();

        StringValue getUrl();

        d2 getUrlOrBuilder();

        boolean hasName();

        boolean hasUniqueOnly();

        boolean hasUpdateInterval();

        boolean hasUrl();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Record extends h0 implements RecordOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int RAW_DATA_FIELD_NUMBER = 2;
        public static final int RULE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Error error_;
        private byte memoizedIsInitialized;
        private BytesValue rawData_;
        private Rule rule_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Reader.Record.1
            @Override // com.explorestack.protobuf.p1
            public Record parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Record(lVar, wVar);
            }
        };

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Record parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Record) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Record)) {
                return super.equals(obj);
            }
            Record record = (Record) obj;
            if (hasRule() != record.hasRule()) {
                return false;
            }
            if ((hasRule() && !getRule().equals(record.getRule())) || hasRawData() != record.hasRawData()) {
                return false;
            }
            if ((!hasRawData() || getRawData().equals(record.getRawData())) && hasError() == record.hasError()) {
                return (!hasError() || getError().equals(record.getError())) && this.unknownFields.equals(record.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public Error getError() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            return getError();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public BytesValue getRawData() {
            BytesValue bytesValue = this.rawData_;
            return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public k getRawDataOrBuilder() {
            return getRawData();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public Rule getRule() {
            Rule rule = this.rule_;
            return rule == null ? Rule.getDefaultInstance() : rule;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public RuleOrBuilder getRuleOrBuilder() {
            return getRule();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.rule_ != null ? n.G(1, getRule()) : 0;
            if (this.rawData_ != null) {
                iG += n.G(2, getRawData());
            }
            if (this.error_ != null) {
                iG += n.G(3, getError());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasRawData() {
            return this.rawData_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasRule() {
            return this.rule_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasRule()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getRule().hashCode();
            }
            if (hasRawData()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getRawData().hashCode();
            }
            if (hasError()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getError().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable.d(Record.class, Builder.class);
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
            return new Record();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.rule_ != null) {
                nVar.J0(1, getRule());
            }
            if (this.rawData_ != null) {
                nVar.J0(2, getRawData());
            }
            if (this.error_ != null) {
                nVar.J0(3, getError());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements RecordOrBuilder {
            private a2 errorBuilder_;
            private Error error_;
            private a2 rawDataBuilder_;
            private BytesValue rawData_;
            private a2 ruleBuilder_;
            private Rule rule_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
            }

            private a2 getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new a2(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            private a2 getRawDataFieldBuilder() {
                if (this.rawDataBuilder_ == null) {
                    this.rawDataBuilder_ = new a2(getRawData(), getParentForChildren(), isClean());
                    this.rawData_ = null;
                }
                return this.rawDataBuilder_;
            }

            private a2 getRuleFieldBuilder() {
                if (this.ruleBuilder_ == null) {
                    this.ruleBuilder_ = new a2(getRule(), getParentForChildren(), isClean());
                    this.rule_ = null;
                }
                return this.ruleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
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

            public Builder clearRawData() {
                if (this.rawDataBuilder_ == null) {
                    this.rawData_ = null;
                    onChanged();
                    return this;
                }
                this.rawData_ = null;
                this.rawDataBuilder_ = null;
                return this;
            }

            public Builder clearRule() {
                if (this.ruleBuilder_ == null) {
                    this.rule_ = null;
                    onChanged();
                    return this;
                }
                this.rule_ = null;
                this.ruleBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                a2 a2Var = this.errorBuilder_;
                if (a2Var != null) {
                    return (ErrorOrBuilder) a2Var.f();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public BytesValue getRawData() {
                a2 a2Var = this.rawDataBuilder_;
                if (a2Var != null) {
                    return (BytesValue) a2Var.e();
                }
                BytesValue bytesValue = this.rawData_;
                return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
            }

            public BytesValue.Builder getRawDataBuilder() {
                onChanged();
                return (BytesValue.Builder) getRawDataFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public k getRawDataOrBuilder() {
                a2 a2Var = this.rawDataBuilder_;
                if (a2Var != null) {
                    return (k) a2Var.f();
                }
                BytesValue bytesValue = this.rawData_;
                return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public Rule getRule() {
                a2 a2Var = this.ruleBuilder_;
                if (a2Var != null) {
                    return (Rule) a2Var.e();
                }
                Rule rule = this.rule_;
                return rule == null ? Rule.getDefaultInstance() : rule;
            }

            public Rule.Builder getRuleBuilder() {
                onChanged();
                return (Rule.Builder) getRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public RuleOrBuilder getRuleOrBuilder() {
                a2 a2Var = this.ruleBuilder_;
                if (a2Var != null) {
                    return (RuleOrBuilder) a2Var.f();
                }
                Rule rule = this.rule_;
                return rule == null ? Rule.getDefaultInstance() : rule;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasError() {
                return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasRawData() {
                return (this.rawDataBuilder_ == null && this.rawData_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasRule() {
                return (this.ruleBuilder_ == null && this.rule_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable.d(Record.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
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

            public Builder mergeRawData(BytesValue bytesValue) {
                a2 a2Var = this.rawDataBuilder_;
                if (a2Var != null) {
                    a2Var.g(bytesValue);
                    return this;
                }
                BytesValue bytesValue2 = this.rawData_;
                if (bytesValue2 != null) {
                    this.rawData_ = BytesValue.newBuilder(bytesValue2).mergeFrom(bytesValue).buildPartial();
                } else {
                    this.rawData_ = bytesValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeRule(Rule rule) {
                a2 a2Var = this.ruleBuilder_;
                if (a2Var != null) {
                    a2Var.g(rule);
                    return this;
                }
                Rule rule2 = this.rule_;
                if (rule2 != null) {
                    this.rule_ = Rule.newBuilder(rule2).mergeFrom(rule).buildPartial();
                } else {
                    this.rule_ = rule;
                }
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

            public Builder setRawData(BytesValue bytesValue) {
                a2 a2Var = this.rawDataBuilder_;
                if (a2Var != null) {
                    a2Var.i(bytesValue);
                    return this;
                }
                bytesValue.getClass();
                this.rawData_ = bytesValue;
                onChanged();
                return this;
            }

            public Builder setRule(Rule rule) {
                a2 a2Var = this.ruleBuilder_;
                if (a2Var != null) {
                    a2Var.i(rule);
                    return this;
                }
                rule.getClass();
                this.rule_ = rule;
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
            public Record build() {
                Record recordBuildPartial = buildPartial();
                if (recordBuildPartial.isInitialized()) {
                    return recordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) recordBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record buildPartial() {
                Record record = new Record(this);
                a2 a2Var = this.ruleBuilder_;
                if (a2Var == null) {
                    record.rule_ = this.rule_;
                } else {
                    record.rule_ = (Rule) a2Var.a();
                }
                a2 a2Var2 = this.rawDataBuilder_;
                if (a2Var2 == null) {
                    record.rawData_ = this.rawData_;
                } else {
                    record.rawData_ = (BytesValue) a2Var2.a();
                }
                a2 a2Var3 = this.errorBuilder_;
                if (a2Var3 == null) {
                    record.error_ = this.error_;
                } else {
                    record.error_ = (Error) a2Var3.a();
                }
                onBuilt();
                return record;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Record getDefaultInstanceForType() {
                return Record.getDefaultInstance();
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
                if (this.ruleBuilder_ == null) {
                    this.rule_ = null;
                } else {
                    this.rule_ = null;
                    this.ruleBuilder_ = null;
                }
                if (this.rawDataBuilder_ == null) {
                    this.rawData_ = null;
                } else {
                    this.rawData_ = null;
                    this.rawDataBuilder_ = null;
                }
                if (this.errorBuilder_ == null) {
                    this.error_ = null;
                    return this;
                }
                this.error_ = null;
                this.errorBuilder_ = null;
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

            public Builder setRawData(BytesValue.Builder builder) {
                a2 a2Var = this.rawDataBuilder_;
                if (a2Var == null) {
                    this.rawData_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setRule(Rule.Builder builder) {
                a2 a2Var = this.ruleBuilder_;
                if (a2Var == null) {
                    this.rule_ = builder.build();
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
                if (message instanceof Record) {
                    return mergeFrom((Record) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Record record) {
                if (record == Record.getDefaultInstance()) {
                    return this;
                }
                if (record.hasRule()) {
                    mergeRule(record.getRule());
                }
                if (record.hasRawData()) {
                    mergeRawData(record.getRawData());
                }
                if (record.hasError()) {
                    mergeError(record.getError());
                }
                mergeUnknownFields(((h0) record).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.Reader.Record.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Reader.Record.access$6200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Reader$Record r3 = (io.bidmachine.protobuf.sdk.Reader.Record) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Reader$Record r4 = (io.bidmachine.protobuf.sdk.Reader.Record) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Record.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Reader$Record$Builder");
            }
        }

        public static Builder newBuilder(Record record) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(record);
        }

        public static Record parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Record(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Record) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Record parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Record getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Record parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Record() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Record parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr, wVar);
        }

        private Record(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    Rule rule = this.rule_;
                                    Rule.Builder builder = rule != null ? rule.toBuilder() : null;
                                    Rule rule2 = (Rule) lVar.A(Rule.parser(), wVar);
                                    this.rule_ = rule2;
                                    if (builder != null) {
                                        builder.mergeFrom(rule2);
                                        this.rule_ = builder.buildPartial();
                                    }
                                } else if (iK == 18) {
                                    BytesValue bytesValue = this.rawData_;
                                    BytesValue.Builder builder2 = bytesValue != null ? bytesValue.toBuilder() : null;
                                    BytesValue bytesValue2 = (BytesValue) lVar.A(BytesValue.parser(), wVar);
                                    this.rawData_ = bytesValue2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(bytesValue2);
                                        this.rawData_ = builder2.buildPartial();
                                    }
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    Error error = this.error_;
                                    Error.Builder builder3 = error != null ? error.toBuilder() : null;
                                    Error error2 = (Error) lVar.A(Error.parser(), wVar);
                                    this.error_ = error2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(error2);
                                        this.error_ = builder3.buildPartial();
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

        public static Record parseFrom(InputStream inputStream) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Record parseFrom(l lVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, lVar);
        }

        public static Record parseFrom(l lVar, w wVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface RecordOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        Error getError();

        ErrorOrBuilder getErrorOrBuilder();

        BytesValue getRawData();

        k getRawDataOrBuilder();

        Rule getRule();

        RuleOrBuilder getRuleOrBuilder();

        boolean hasError();

        boolean hasRawData();

        boolean hasRule();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Rule extends h0 implements RuleOrBuilder {
        public static final int GENERAL_RULE_FIELD_NUMBER = 1;
        public static final int IOS_LOG_RULE_FIELD_NUMBER = 2;
        public static final int PUR_RULE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int ruleOneofCase_;
        private Object ruleOneof_;
        private static final Rule DEFAULT_INSTANCE = new Rule();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.1
            @Override // com.explorestack.protobuf.p1
            public Rule parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Rule(lVar, wVar);
            }
        };

        public static final class GeneralRule extends h0 implements GeneralRuleOrBuilder {
            private static final GeneralRule DEFAULT_INSTANCE = new GeneralRule();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.1
                @Override // com.explorestack.protobuf.p1
                public GeneralRule parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new GeneralRule(lVar, wVar);
                }
            };
            public static final int PATH_FIELD_NUMBER = 2;
            public static final int TAG_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private StringValue path_;
            private StringValue tag_;

            public static GeneralRule getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static GeneralRule parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GeneralRule) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static GeneralRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GeneralRule)) {
                    return super.equals(obj);
                }
                GeneralRule generalRule = (GeneralRule) obj;
                if (hasTag() != generalRule.hasTag()) {
                    return false;
                }
                if ((!hasTag() || getTag().equals(generalRule.getTag())) && hasPath() == generalRule.hasPath()) {
                    return (!hasPath() || getPath().equals(generalRule.getPath())) && this.unknownFields.equals(generalRule.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public StringValue getPath() {
                StringValue stringValue = this.path_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public d2 getPathOrBuilder() {
                return getPath();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.tag_ != null ? n.G(1, getTag()) : 0;
                if (this.path_ != null) {
                    iG += n.G(2, getPath());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public StringValue getTag() {
                StringValue stringValue = this.tag_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public d2 getTagOrBuilder() {
                return getTag();
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public boolean hasPath() {
                return this.path_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public boolean hasTag() {
                return this.tag_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasTag()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTag().hashCode();
                }
                if (hasPath()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getPath().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable.d(GeneralRule.class, Builder.class);
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
                return new GeneralRule();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (this.tag_ != null) {
                    nVar.J0(1, getTag());
                }
                if (this.path_ != null) {
                    nVar.J0(2, getPath());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements GeneralRuleOrBuilder {
                private a2 pathBuilder_;
                private StringValue path_;
                private a2 tagBuilder_;
                private StringValue tag_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
                }

                private a2 getPathFieldBuilder() {
                    if (this.pathBuilder_ == null) {
                        this.pathBuilder_ = new a2(getPath(), getParentForChildren(), isClean());
                        this.path_ = null;
                    }
                    return this.pathBuilder_;
                }

                private a2 getTagFieldBuilder() {
                    if (this.tagBuilder_ == null) {
                        this.tagBuilder_ = new a2(getTag(), getParentForChildren(), isClean());
                        this.tag_ = null;
                    }
                    return this.tagBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearPath() {
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                        onChanged();
                        return this;
                    }
                    this.path_ = null;
                    this.pathBuilder_ = null;
                    return this;
                }

                public Builder clearTag() {
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                        onChanged();
                        return this;
                    }
                    this.tag_ = null;
                    this.tagBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public StringValue getPath() {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getPathBuilder() {
                    onChanged();
                    return (StringValue.Builder) getPathFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public d2 getPathOrBuilder() {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public StringValue getTag() {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getTagBuilder() {
                    onChanged();
                    return (StringValue.Builder) getTagFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public d2 getTagOrBuilder() {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public boolean hasPath() {
                    return (this.pathBuilder_ == null && this.path_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public boolean hasTag() {
                    return (this.tagBuilder_ == null && this.tag_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable.d(GeneralRule.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergePath(StringValue stringValue) {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.path_;
                    if (stringValue2 != null) {
                        this.path_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.path_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeTag(StringValue stringValue) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.tag_;
                    if (stringValue2 != null) {
                        this.tag_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.tag_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setPath(StringValue stringValue) {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.path_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setTag(StringValue stringValue) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.tag_ = stringValue;
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
                public GeneralRule build() {
                    GeneralRule generalRuleBuildPartial = buildPartial();
                    if (generalRuleBuildPartial.isInitialized()) {
                        return generalRuleBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) generalRuleBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public GeneralRule buildPartial() {
                    GeneralRule generalRule = new GeneralRule(this);
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var == null) {
                        generalRule.tag_ = this.tag_;
                    } else {
                        generalRule.tag_ = (StringValue) a2Var.a();
                    }
                    a2 a2Var2 = this.pathBuilder_;
                    if (a2Var2 == null) {
                        generalRule.path_ = this.path_;
                    } else {
                        generalRule.path_ = (StringValue) a2Var2.a();
                    }
                    onBuilt();
                    return generalRule;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public GeneralRule getDefaultInstanceForType() {
                    return GeneralRule.getDefaultInstance();
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
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                        return this;
                    }
                    this.path_ = null;
                    this.pathBuilder_ = null;
                    return this;
                }

                public Builder setPath(StringValue.Builder builder) {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var == null) {
                        this.path_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setTag(StringValue.Builder builder) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var == null) {
                        this.tag_ = builder.build();
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
                    if (message instanceof GeneralRule) {
                        return mergeFrom((GeneralRule) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(GeneralRule generalRule) {
                    if (generalRule == GeneralRule.getDefaultInstance()) {
                        return this;
                    }
                    if (generalRule.hasTag()) {
                        mergeTag(generalRule.getTag());
                    }
                    if (generalRule.hasPath()) {
                        mergePath(generalRule.getPath());
                    }
                    mergeUnknownFields(((h0) generalRule).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.access$2000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sdk.Reader$Rule$GeneralRule r3 = (io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sdk.Reader$Rule$GeneralRule r4 = (io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Reader$Rule$GeneralRule$Builder");
                }
            }

            public static Builder newBuilder(GeneralRule generalRule) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(generalRule);
            }

            public static GeneralRule parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(byteBuffer, wVar);
            }

            private GeneralRule(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GeneralRule parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (GeneralRule) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static GeneralRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public GeneralRule getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static GeneralRule parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private GeneralRule() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GeneralRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static GeneralRule parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (GeneralRule) PARSER.parseFrom(bArr, wVar);
            }

            private GeneralRule(l lVar, w wVar) throws InvalidProtocolBufferException {
                StringValue.Builder builder;
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
                                    StringValue stringValue = this.tag_;
                                    builder = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                    this.tag_ = stringValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(stringValue2);
                                        this.tag_ = builder.buildPartial();
                                    }
                                } else if (iK != 18) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    StringValue stringValue3 = this.path_;
                                    builder = stringValue3 != null ? stringValue3.toBuilder() : null;
                                    StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                    this.path_ = stringValue4;
                                    if (builder != null) {
                                        builder.mergeFrom(stringValue4);
                                        this.path_ = builder.buildPartial();
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
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static GeneralRule parseFrom(InputStream inputStream) throws IOException {
                return (GeneralRule) h0.parseWithIOException(PARSER, inputStream);
            }

            public static GeneralRule parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (GeneralRule) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static GeneralRule parseFrom(l lVar) throws IOException {
                return (GeneralRule) h0.parseWithIOException(PARSER, lVar);
            }

            public static GeneralRule parseFrom(l lVar, w wVar) throws IOException {
                return (GeneralRule) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface GeneralRuleOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            StringValue getPath();

            d2 getPathOrBuilder();

            StringValue getTag();

            d2 getTagOrBuilder();

            boolean hasPath();

            boolean hasTag();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class IOSLogRule extends h0 implements IOSLogRuleOrBuilder {
            public static final int LEVELS_FIELD_NUMBER = 2;
            public static final int SOURCES_FIELD_NUMBER = 3;
            public static final int TAG_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private List<StringValue> levels_;
            private byte memoizedIsInitialized;
            private List<StringValue> sources_;
            private StringValue tag_;
            private static final IOSLogRule DEFAULT_INSTANCE = new IOSLogRule();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.1
                @Override // com.explorestack.protobuf.p1
                public IOSLogRule parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new IOSLogRule(lVar, wVar);
                }
            };

            public static IOSLogRule getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static IOSLogRule parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (IOSLogRule) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static IOSLogRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof IOSLogRule)) {
                    return super.equals(obj);
                }
                IOSLogRule iOSLogRule = (IOSLogRule) obj;
                if (hasTag() != iOSLogRule.hasTag()) {
                    return false;
                }
                return (!hasTag() || getTag().equals(iOSLogRule.getTag())) && getLevelsList().equals(iOSLogRule.getLevelsList()) && getSourcesList().equals(iOSLogRule.getSourcesList()) && this.unknownFields.equals(iOSLogRule.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getLevels(int i10) {
                return this.levels_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public int getLevelsCount() {
                return this.levels_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<StringValue> getLevelsList() {
                return this.levels_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public d2 getLevelsOrBuilder(int i10) {
                return this.levels_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<? extends d2> getLevelsOrBuilderList() {
                return this.levels_;
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
                int iG = this.tag_ != null ? n.G(1, getTag()) : 0;
                for (int i11 = 0; i11 < this.levels_.size(); i11++) {
                    iG += n.G(2, this.levels_.get(i11));
                }
                for (int i12 = 0; i12 < this.sources_.size(); i12++) {
                    iG += n.G(3, this.sources_.get(i12));
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getSources(int i10) {
                return this.sources_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public int getSourcesCount() {
                return this.sources_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<StringValue> getSourcesList() {
                return this.sources_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public d2 getSourcesOrBuilder(int i10) {
                return this.sources_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<? extends d2> getSourcesOrBuilderList() {
                return this.sources_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getTag() {
                StringValue stringValue = this.tag_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public d2 getTagOrBuilder() {
                return getTag();
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public boolean hasTag() {
                return this.tag_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasTag()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTag().hashCode();
                }
                if (getLevelsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getLevelsList().hashCode();
                }
                if (getSourcesCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getSourcesList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable.d(IOSLogRule.class, Builder.class);
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
                return new IOSLogRule();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (this.tag_ != null) {
                    nVar.J0(1, getTag());
                }
                for (int i10 = 0; i10 < this.levels_.size(); i10++) {
                    nVar.J0(2, this.levels_.get(i10));
                }
                for (int i11 = 0; i11 < this.sources_.size(); i11++) {
                    nVar.J0(3, this.sources_.get(i11));
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements IOSLogRuleOrBuilder {
                private int bitField0_;
                private v1 levelsBuilder_;
                private List<StringValue> levels_;
                private v1 sourcesBuilder_;
                private List<StringValue> sources_;
                private a2 tagBuilder_;
                private StringValue tag_;

                private void ensureLevelsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.levels_ = new ArrayList(this.levels_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureSourcesIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.sources_ = new ArrayList(this.sources_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
                }

                private v1 getLevelsFieldBuilder() {
                    if (this.levelsBuilder_ == null) {
                        this.levelsBuilder_ = new v1(this.levels_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.levels_ = null;
                    }
                    return this.levelsBuilder_;
                }

                private v1 getSourcesFieldBuilder() {
                    if (this.sourcesBuilder_ == null) {
                        this.sourcesBuilder_ = new v1(this.sources_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.sources_ = null;
                    }
                    return this.sourcesBuilder_;
                }

                private a2 getTagFieldBuilder() {
                    if (this.tagBuilder_ == null) {
                        this.tagBuilder_ = new a2(getTag(), getParentForChildren(), isClean());
                        this.tag_ = null;
                    }
                    return this.tagBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        getLevelsFieldBuilder();
                        getSourcesFieldBuilder();
                    }
                }

                public Builder addAllLevels(Iterable<? extends StringValue> iterable) {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureLevelsIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.levels_);
                    onChanged();
                    return this;
                }

                public Builder addAllSources(Iterable<? extends StringValue> iterable) {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureSourcesIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.sources_);
                    onChanged();
                    return this;
                }

                public Builder addLevels(StringValue stringValue) {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var != null) {
                        v1Var.e(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    ensureLevelsIsMutable();
                    this.levels_.add(stringValue);
                    onChanged();
                    return this;
                }

                public StringValue.Builder addLevelsBuilder() {
                    return (StringValue.Builder) getLevelsFieldBuilder().c(StringValue.getDefaultInstance());
                }

                public Builder addSources(StringValue stringValue) {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var != null) {
                        v1Var.e(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    ensureSourcesIsMutable();
                    this.sources_.add(stringValue);
                    onChanged();
                    return this;
                }

                public StringValue.Builder addSourcesBuilder() {
                    return (StringValue.Builder) getSourcesFieldBuilder().c(StringValue.getDefaultInstance());
                }

                public Builder clearLevels() {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.levels_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSources() {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.sources_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearTag() {
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                        onChanged();
                        return this;
                    }
                    this.tag_ = null;
                    this.tagBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getLevels(int i10) {
                    v1 v1Var = this.levelsBuilder_;
                    return v1Var == null ? this.levels_.get(i10) : (StringValue) v1Var.n(i10);
                }

                public StringValue.Builder getLevelsBuilder(int i10) {
                    return (StringValue.Builder) getLevelsFieldBuilder().k(i10);
                }

                public List<StringValue.Builder> getLevelsBuilderList() {
                    return getLevelsFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public int getLevelsCount() {
                    v1 v1Var = this.levelsBuilder_;
                    return v1Var == null ? this.levels_.size() : v1Var.m();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<StringValue> getLevelsList() {
                    v1 v1Var = this.levelsBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.levels_) : v1Var.p();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public d2 getLevelsOrBuilder(int i10) {
                    v1 v1Var = this.levelsBuilder_;
                    return v1Var == null ? this.levels_.get(i10) : (d2) v1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<? extends d2> getLevelsOrBuilderList() {
                    v1 v1Var = this.levelsBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.levels_);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getSources(int i10) {
                    v1 v1Var = this.sourcesBuilder_;
                    return v1Var == null ? this.sources_.get(i10) : (StringValue) v1Var.n(i10);
                }

                public StringValue.Builder getSourcesBuilder(int i10) {
                    return (StringValue.Builder) getSourcesFieldBuilder().k(i10);
                }

                public List<StringValue.Builder> getSourcesBuilderList() {
                    return getSourcesFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public int getSourcesCount() {
                    v1 v1Var = this.sourcesBuilder_;
                    return v1Var == null ? this.sources_.size() : v1Var.m();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<StringValue> getSourcesList() {
                    v1 v1Var = this.sourcesBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.sources_) : v1Var.p();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public d2 getSourcesOrBuilder(int i10) {
                    v1 v1Var = this.sourcesBuilder_;
                    return v1Var == null ? this.sources_.get(i10) : (d2) v1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<? extends d2> getSourcesOrBuilderList() {
                    v1 v1Var = this.sourcesBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.sources_);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getTag() {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getTagBuilder() {
                    onChanged();
                    return (StringValue.Builder) getTagFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public d2 getTagOrBuilder() {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public boolean hasTag() {
                    return (this.tagBuilder_ == null && this.tag_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable.d(IOSLogRule.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeTag(StringValue stringValue) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.tag_;
                    if (stringValue2 != null) {
                        this.tag_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.tag_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeLevels(int i10) {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureLevelsIsMutable();
                    this.levels_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder removeSources(int i10) {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureSourcesIsMutable();
                    this.sources_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setLevels(int i10, StringValue stringValue) {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    ensureLevelsIsMutable();
                    this.levels_.set(i10, stringValue);
                    onChanged();
                    return this;
                }

                public Builder setSources(int i10, StringValue stringValue) {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    ensureSourcesIsMutable();
                    this.sources_.set(i10, stringValue);
                    onChanged();
                    return this;
                }

                public Builder setTag(StringValue stringValue) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.tag_ = stringValue;
                    onChanged();
                    return this;
                }

                private Builder() {
                    List<StringValue> list = Collections.EMPTY_LIST;
                    this.levels_ = list;
                    this.sources_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public IOSLogRule build() {
                    IOSLogRule iOSLogRuleBuildPartial = buildPartial();
                    if (iOSLogRuleBuildPartial.isInitialized()) {
                        return iOSLogRuleBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) iOSLogRuleBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public IOSLogRule buildPartial() {
                    IOSLogRule iOSLogRule = new IOSLogRule(this);
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var == null) {
                        iOSLogRule.tag_ = this.tag_;
                    } else {
                        iOSLogRule.tag_ = (StringValue) a2Var.a();
                    }
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var != null) {
                        iOSLogRule.levels_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.levels_ = DesugarCollections.unmodifiableList(this.levels_);
                            this.bitField0_ &= -2;
                        }
                        iOSLogRule.levels_ = this.levels_;
                    }
                    v1 v1Var2 = this.sourcesBuilder_;
                    if (v1Var2 != null) {
                        iOSLogRule.sources_ = v1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.sources_ = DesugarCollections.unmodifiableList(this.sources_);
                            this.bitField0_ &= -3;
                        }
                        iOSLogRule.sources_ = this.sources_;
                    }
                    onBuilt();
                    return iOSLogRule;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public IOSLogRule getDefaultInstanceForType() {
                    return IOSLogRule.getDefaultInstance();
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

                public StringValue.Builder addLevelsBuilder(int i10) {
                    return (StringValue.Builder) getLevelsFieldBuilder().b(i10, StringValue.getDefaultInstance());
                }

                public StringValue.Builder addSourcesBuilder(int i10) {
                    return (StringValue.Builder) getSourcesFieldBuilder().b(i10, StringValue.getDefaultInstance());
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
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var == null) {
                        this.levels_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        v1Var.g();
                    }
                    v1 v1Var2 = this.sourcesBuilder_;
                    if (v1Var2 == null) {
                        this.sources_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -3;
                        return this;
                    }
                    v1Var2.g();
                    return this;
                }

                public Builder setTag(StringValue.Builder builder) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var == null) {
                        this.tag_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    List<StringValue> list = Collections.EMPTY_LIST;
                    this.levels_ = list;
                    this.sources_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addLevels(int i10, StringValue stringValue) {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var == null) {
                        stringValue.getClass();
                        ensureLevelsIsMutable();
                        this.levels_.add(i10, stringValue);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, stringValue);
                    return this;
                }

                public Builder addSources(int i10, StringValue stringValue) {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var == null) {
                        stringValue.getClass();
                        ensureSourcesIsMutable();
                        this.sources_.add(i10, stringValue);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, stringValue);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof IOSLogRule) {
                        return mergeFrom((IOSLogRule) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setLevels(int i10, StringValue.Builder builder) {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var == null) {
                        ensureLevelsIsMutable();
                        this.levels_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                public Builder setSources(int i10, StringValue.Builder builder) {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var == null) {
                        ensureSourcesIsMutable();
                        this.sources_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(IOSLogRule iOSLogRule) {
                    if (iOSLogRule == IOSLogRule.getDefaultInstance()) {
                        return this;
                    }
                    if (iOSLogRule.hasTag()) {
                        mergeTag(iOSLogRule.getTag());
                    }
                    if (this.levelsBuilder_ == null) {
                        if (!iOSLogRule.levels_.isEmpty()) {
                            if (this.levels_.isEmpty()) {
                                this.levels_ = iOSLogRule.levels_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureLevelsIsMutable();
                                this.levels_.addAll(iOSLogRule.levels_);
                            }
                            onChanged();
                        }
                    } else if (!iOSLogRule.levels_.isEmpty()) {
                        if (!this.levelsBuilder_.t()) {
                            this.levelsBuilder_.a(iOSLogRule.levels_);
                        } else {
                            this.levelsBuilder_.h();
                            this.levelsBuilder_ = null;
                            this.levels_ = iOSLogRule.levels_;
                            this.bitField0_ &= -2;
                            this.levelsBuilder_ = h0.alwaysUseFieldBuilders ? getLevelsFieldBuilder() : null;
                        }
                    }
                    if (this.sourcesBuilder_ == null) {
                        if (!iOSLogRule.sources_.isEmpty()) {
                            if (this.sources_.isEmpty()) {
                                this.sources_ = iOSLogRule.sources_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureSourcesIsMutable();
                                this.sources_.addAll(iOSLogRule.sources_);
                            }
                            onChanged();
                        }
                    } else if (!iOSLogRule.sources_.isEmpty()) {
                        if (!this.sourcesBuilder_.t()) {
                            this.sourcesBuilder_.a(iOSLogRule.sources_);
                        } else {
                            this.sourcesBuilder_.h();
                            this.sourcesBuilder_ = null;
                            this.sources_ = iOSLogRule.sources_;
                            this.bitField0_ &= -3;
                            this.sourcesBuilder_ = h0.alwaysUseFieldBuilders ? getSourcesFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) iOSLogRule).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addLevels(StringValue.Builder builder) {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var == null) {
                        ensureLevelsIsMutable();
                        this.levels_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                public Builder addSources(StringValue.Builder builder) {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var == null) {
                        ensureSourcesIsMutable();
                        this.sources_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                public Builder addLevels(int i10, StringValue.Builder builder) {
                    v1 v1Var = this.levelsBuilder_;
                    if (v1Var == null) {
                        ensureLevelsIsMutable();
                        this.levels_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, builder.build());
                    return this;
                }

                public Builder addSources(int i10, StringValue.Builder builder) {
                    v1 v1Var = this.sourcesBuilder_;
                    if (v1Var == null) {
                        ensureSourcesIsMutable();
                        this.sources_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.access$3200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sdk.Reader$Rule$IOSLogRule r3 = (io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sdk.Reader$Rule$IOSLogRule r4 = (io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Reader$Rule$IOSLogRule$Builder");
                }
            }

            public static Builder newBuilder(IOSLogRule iOSLogRule) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(iOSLogRule);
            }

            public static IOSLogRule parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(byteBuffer, wVar);
            }

            private IOSLogRule(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static IOSLogRule parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (IOSLogRule) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static IOSLogRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public IOSLogRule getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static IOSLogRule parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private IOSLogRule() {
                this.memoizedIsInitialized = (byte) -1;
                List<StringValue> list = Collections.EMPTY_LIST;
                this.levels_ = list;
                this.sources_ = list;
            }

            public static IOSLogRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static IOSLogRule parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (IOSLogRule) PARSER.parseFrom(bArr, wVar);
            }

            public static IOSLogRule parseFrom(InputStream inputStream) throws IOException {
                return (IOSLogRule) h0.parseWithIOException(PARSER, inputStream);
            }

            private IOSLogRule(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        StringValue stringValue = this.tag_;
                                        StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                        this.tag_ = stringValue2;
                                        if (builder != null) {
                                            builder.mergeFrom(stringValue2);
                                            this.tag_ = builder.buildPartial();
                                        }
                                    } else if (iK == 18) {
                                        if ((i10 & 1) == 0) {
                                            this.levels_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.levels_.add((StringValue) lVar.A(StringValue.parser(), wVar));
                                    } else if (iK != 26) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        if ((i10 & 2) == 0) {
                                            this.sources_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.sources_.add((StringValue) lVar.A(StringValue.parser(), wVar));
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
                            this.levels_ = DesugarCollections.unmodifiableList(this.levels_);
                        }
                        if ((i10 & 2) != 0) {
                            this.sources_ = DesugarCollections.unmodifiableList(this.sources_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.levels_ = DesugarCollections.unmodifiableList(this.levels_);
                }
                if ((i10 & 2) != 0) {
                    this.sources_ = DesugarCollections.unmodifiableList(this.sources_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static IOSLogRule parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (IOSLogRule) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static IOSLogRule parseFrom(l lVar) throws IOException {
                return (IOSLogRule) h0.parseWithIOException(PARSER, lVar);
            }

            public static IOSLogRule parseFrom(l lVar, w wVar) throws IOException {
                return (IOSLogRule) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface IOSLogRuleOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            StringValue getLevels(int i10);

            int getLevelsCount();

            List<StringValue> getLevelsList();

            d2 getLevelsOrBuilder(int i10);

            List<? extends d2> getLevelsOrBuilderList();

            StringValue getSources(int i10);

            int getSourcesCount();

            List<StringValue> getSourcesList();

            d2 getSourcesOrBuilder(int i10);

            List<? extends d2> getSourcesOrBuilderList();

            StringValue getTag();

            d2 getTagOrBuilder();

            boolean hasTag();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class PurRule extends h0 implements PurRuleOrBuilder {
            private static final PurRule DEFAULT_INSTANCE = new PurRule();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.PurRule.1
                @Override // com.explorestack.protobuf.p1
                public PurRule parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new PurRule(lVar, wVar);
                }
            };
            public static final int PATH_FIELD_NUMBER = 2;
            public static final int QUERY_FIELD_NUMBER = 3;
            public static final int SHOULD_REPORT_FIELD_NUMBER = 4;
            public static final int TAG_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private StringValue path_;
            private StringValue query_;
            private BoolValue shouldReport_;
            private StringValue tag_;

            public static PurRule getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static PurRule parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (PurRule) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static PurRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (PurRule) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PurRule)) {
                    return super.equals(obj);
                }
                PurRule purRule = (PurRule) obj;
                if (hasTag() != purRule.hasTag()) {
                    return false;
                }
                if ((hasTag() && !getTag().equals(purRule.getTag())) || hasPath() != purRule.hasPath()) {
                    return false;
                }
                if ((hasPath() && !getPath().equals(purRule.getPath())) || hasQuery() != purRule.hasQuery()) {
                    return false;
                }
                if ((!hasQuery() || getQuery().equals(purRule.getQuery())) && hasShouldReport() == purRule.hasShouldReport()) {
                    return (!hasShouldReport() || getShouldReport().equals(purRule.getShouldReport())) && this.unknownFields.equals(purRule.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public StringValue getPath() {
                StringValue stringValue = this.path_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public d2 getPathOrBuilder() {
                return getPath();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public StringValue getQuery() {
                StringValue stringValue = this.query_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public d2 getQueryOrBuilder() {
                return getQuery();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.tag_ != null ? n.G(1, getTag()) : 0;
                if (this.path_ != null) {
                    iG += n.G(2, getPath());
                }
                if (this.query_ != null) {
                    iG += n.G(3, getQuery());
                }
                if (this.shouldReport_ != null) {
                    iG += n.G(4, getShouldReport());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public BoolValue getShouldReport() {
                BoolValue boolValue = this.shouldReport_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public g getShouldReportOrBuilder() {
                return getShouldReport();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public StringValue getTag() {
                StringValue stringValue = this.tag_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public d2 getTagOrBuilder() {
                return getTag();
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public boolean hasPath() {
                return this.path_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public boolean hasQuery() {
                return this.query_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public boolean hasShouldReport() {
                return this.shouldReport_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public boolean hasTag() {
                return this.tag_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasTag()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTag().hashCode();
                }
                if (hasPath()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getPath().hashCode();
                }
                if (hasQuery()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getQuery().hashCode();
                }
                if (hasShouldReport()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getShouldReport().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_fieldAccessorTable.d(PurRule.class, Builder.class);
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
                return new PurRule();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (this.tag_ != null) {
                    nVar.J0(1, getTag());
                }
                if (this.path_ != null) {
                    nVar.J0(2, getPath());
                }
                if (this.query_ != null) {
                    nVar.J0(3, getQuery());
                }
                if (this.shouldReport_ != null) {
                    nVar.J0(4, getShouldReport());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements PurRuleOrBuilder {
                private a2 pathBuilder_;
                private StringValue path_;
                private a2 queryBuilder_;
                private StringValue query_;
                private a2 shouldReportBuilder_;
                private BoolValue shouldReport_;
                private a2 tagBuilder_;
                private StringValue tag_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor;
                }

                private a2 getPathFieldBuilder() {
                    if (this.pathBuilder_ == null) {
                        this.pathBuilder_ = new a2(getPath(), getParentForChildren(), isClean());
                        this.path_ = null;
                    }
                    return this.pathBuilder_;
                }

                private a2 getQueryFieldBuilder() {
                    if (this.queryBuilder_ == null) {
                        this.queryBuilder_ = new a2(getQuery(), getParentForChildren(), isClean());
                        this.query_ = null;
                    }
                    return this.queryBuilder_;
                }

                private a2 getShouldReportFieldBuilder() {
                    if (this.shouldReportBuilder_ == null) {
                        this.shouldReportBuilder_ = new a2(getShouldReport(), getParentForChildren(), isClean());
                        this.shouldReport_ = null;
                    }
                    return this.shouldReportBuilder_;
                }

                private a2 getTagFieldBuilder() {
                    if (this.tagBuilder_ == null) {
                        this.tagBuilder_ = new a2(getTag(), getParentForChildren(), isClean());
                        this.tag_ = null;
                    }
                    return this.tagBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearPath() {
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                        onChanged();
                        return this;
                    }
                    this.path_ = null;
                    this.pathBuilder_ = null;
                    return this;
                }

                public Builder clearQuery() {
                    if (this.queryBuilder_ == null) {
                        this.query_ = null;
                        onChanged();
                        return this;
                    }
                    this.query_ = null;
                    this.queryBuilder_ = null;
                    return this;
                }

                public Builder clearShouldReport() {
                    if (this.shouldReportBuilder_ == null) {
                        this.shouldReport_ = null;
                        onChanged();
                        return this;
                    }
                    this.shouldReport_ = null;
                    this.shouldReportBuilder_ = null;
                    return this;
                }

                public Builder clearTag() {
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                        onChanged();
                        return this;
                    }
                    this.tag_ = null;
                    this.tagBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public StringValue getPath() {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getPathBuilder() {
                    onChanged();
                    return (StringValue.Builder) getPathFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public d2 getPathOrBuilder() {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public StringValue getQuery() {
                    a2 a2Var = this.queryBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.query_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getQueryBuilder() {
                    onChanged();
                    return (StringValue.Builder) getQueryFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public d2 getQueryOrBuilder() {
                    a2 a2Var = this.queryBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.query_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public BoolValue getShouldReport() {
                    a2 a2Var = this.shouldReportBuilder_;
                    if (a2Var != null) {
                        return (BoolValue) a2Var.e();
                    }
                    BoolValue boolValue = this.shouldReport_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }

                public BoolValue.Builder getShouldReportBuilder() {
                    onChanged();
                    return (BoolValue.Builder) getShouldReportFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public g getShouldReportOrBuilder() {
                    a2 a2Var = this.shouldReportBuilder_;
                    if (a2Var != null) {
                        return (g) a2Var.f();
                    }
                    BoolValue boolValue = this.shouldReport_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public StringValue getTag() {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        return (StringValue) a2Var.e();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getTagBuilder() {
                    onChanged();
                    return (StringValue.Builder) getTagFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public d2 getTagOrBuilder() {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        return (d2) a2Var.f();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public boolean hasPath() {
                    return (this.pathBuilder_ == null && this.path_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public boolean hasQuery() {
                    return (this.queryBuilder_ == null && this.query_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public boolean hasShouldReport() {
                    return (this.shouldReportBuilder_ == null && this.shouldReport_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public boolean hasTag() {
                    return (this.tagBuilder_ == null && this.tag_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_fieldAccessorTable.d(PurRule.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergePath(StringValue stringValue) {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.path_;
                    if (stringValue2 != null) {
                        this.path_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.path_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeQuery(StringValue stringValue) {
                    a2 a2Var = this.queryBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.query_;
                    if (stringValue2 != null) {
                        this.query_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.query_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeShouldReport(BoolValue boolValue) {
                    a2 a2Var = this.shouldReportBuilder_;
                    if (a2Var != null) {
                        a2Var.g(boolValue);
                        return this;
                    }
                    BoolValue boolValue2 = this.shouldReport_;
                    if (boolValue2 != null) {
                        this.shouldReport_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.shouldReport_ = boolValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeTag(StringValue stringValue) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        a2Var.g(stringValue);
                        return this;
                    }
                    StringValue stringValue2 = this.tag_;
                    if (stringValue2 != null) {
                        this.tag_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.tag_ = stringValue;
                    }
                    onChanged();
                    return this;
                }

                public Builder setPath(StringValue stringValue) {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.path_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setQuery(StringValue stringValue) {
                    a2 a2Var = this.queryBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.query_ = stringValue;
                    onChanged();
                    return this;
                }

                public Builder setShouldReport(BoolValue boolValue) {
                    a2 a2Var = this.shouldReportBuilder_;
                    if (a2Var != null) {
                        a2Var.i(boolValue);
                        return this;
                    }
                    boolValue.getClass();
                    this.shouldReport_ = boolValue;
                    onChanged();
                    return this;
                }

                public Builder setTag(StringValue stringValue) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var != null) {
                        a2Var.i(stringValue);
                        return this;
                    }
                    stringValue.getClass();
                    this.tag_ = stringValue;
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
                public PurRule build() {
                    PurRule purRuleBuildPartial = buildPartial();
                    if (purRuleBuildPartial.isInitialized()) {
                        return purRuleBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) purRuleBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public PurRule buildPartial() {
                    PurRule purRule = new PurRule(this);
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var == null) {
                        purRule.tag_ = this.tag_;
                    } else {
                        purRule.tag_ = (StringValue) a2Var.a();
                    }
                    a2 a2Var2 = this.pathBuilder_;
                    if (a2Var2 == null) {
                        purRule.path_ = this.path_;
                    } else {
                        purRule.path_ = (StringValue) a2Var2.a();
                    }
                    a2 a2Var3 = this.queryBuilder_;
                    if (a2Var3 == null) {
                        purRule.query_ = this.query_;
                    } else {
                        purRule.query_ = (StringValue) a2Var3.a();
                    }
                    a2 a2Var4 = this.shouldReportBuilder_;
                    if (a2Var4 == null) {
                        purRule.shouldReport_ = this.shouldReport_;
                    } else {
                        purRule.shouldReport_ = (BoolValue) a2Var4.a();
                    }
                    onBuilt();
                    return purRule;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public PurRule getDefaultInstanceForType() {
                    return PurRule.getDefaultInstance();
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
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                    } else {
                        this.path_ = null;
                        this.pathBuilder_ = null;
                    }
                    if (this.queryBuilder_ == null) {
                        this.query_ = null;
                    } else {
                        this.query_ = null;
                        this.queryBuilder_ = null;
                    }
                    if (this.shouldReportBuilder_ == null) {
                        this.shouldReport_ = null;
                        return this;
                    }
                    this.shouldReport_ = null;
                    this.shouldReportBuilder_ = null;
                    return this;
                }

                public Builder setPath(StringValue.Builder builder) {
                    a2 a2Var = this.pathBuilder_;
                    if (a2Var == null) {
                        this.path_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setQuery(StringValue.Builder builder) {
                    a2 a2Var = this.queryBuilder_;
                    if (a2Var == null) {
                        this.query_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setShouldReport(BoolValue.Builder builder) {
                    a2 a2Var = this.shouldReportBuilder_;
                    if (a2Var == null) {
                        this.shouldReport_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setTag(StringValue.Builder builder) {
                    a2 a2Var = this.tagBuilder_;
                    if (a2Var == null) {
                        this.tag_ = builder.build();
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
                    if (message instanceof PurRule) {
                        return mergeFrom((PurRule) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(PurRule purRule) {
                    if (purRule == PurRule.getDefaultInstance()) {
                        return this;
                    }
                    if (purRule.hasTag()) {
                        mergeTag(purRule.getTag());
                    }
                    if (purRule.hasPath()) {
                        mergePath(purRule.getPath());
                    }
                    if (purRule.hasQuery()) {
                        mergeQuery(purRule.getQuery());
                    }
                    if (purRule.hasShouldReport()) {
                        mergeShouldReport(purRule.getShouldReport());
                    }
                    mergeUnknownFields(((h0) purRule).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.sdk.Reader.Rule.PurRule.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Reader.Rule.PurRule.access$4300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sdk.Reader$Rule$PurRule r3 = (io.bidmachine.protobuf.sdk.Reader.Rule.PurRule) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sdk.Reader$Rule$PurRule r4 = (io.bidmachine.protobuf.sdk.Reader.Rule.PurRule) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Rule.PurRule.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Reader$Rule$PurRule$Builder");
                }
            }

            public static Builder newBuilder(PurRule purRule) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(purRule);
            }

            public static PurRule parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (PurRule) PARSER.parseFrom(byteBuffer, wVar);
            }

            private PurRule(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static PurRule parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (PurRule) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static PurRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (PurRule) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public PurRule getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static PurRule parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (PurRule) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private PurRule() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static PurRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (PurRule) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static PurRule parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (PurRule) PARSER.parseFrom(bArr, wVar);
            }

            private PurRule(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    StringValue stringValue = this.tag_;
                                    StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                    this.tag_ = stringValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(stringValue2);
                                        this.tag_ = builder.buildPartial();
                                    }
                                } else if (iK == 18) {
                                    StringValue stringValue3 = this.path_;
                                    StringValue.Builder builder2 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                    StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                    this.path_ = stringValue4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(stringValue4);
                                        this.path_ = builder2.buildPartial();
                                    }
                                } else if (iK == 26) {
                                    StringValue stringValue5 = this.query_;
                                    StringValue.Builder builder3 = stringValue5 != null ? stringValue5.toBuilder() : null;
                                    StringValue stringValue6 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                    this.query_ = stringValue6;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(stringValue6);
                                        this.query_ = builder3.buildPartial();
                                    }
                                } else if (iK != 34) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    BoolValue boolValue = this.shouldReport_;
                                    BoolValue.Builder builder4 = boolValue != null ? boolValue.toBuilder() : null;
                                    BoolValue boolValue2 = (BoolValue) lVar.A(BoolValue.parser(), wVar);
                                    this.shouldReport_ = boolValue2;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(boolValue2);
                                        this.shouldReport_ = builder4.buildPartial();
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
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static PurRule parseFrom(InputStream inputStream) throws IOException {
                return (PurRule) h0.parseWithIOException(PARSER, inputStream);
            }

            public static PurRule parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (PurRule) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static PurRule parseFrom(l lVar) throws IOException {
                return (PurRule) h0.parseWithIOException(PARSER, lVar);
            }

            public static PurRule parseFrom(l lVar, w wVar) throws IOException {
                return (PurRule) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface PurRuleOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            StringValue getPath();

            d2 getPathOrBuilder();

            StringValue getQuery();

            d2 getQueryOrBuilder();

            BoolValue getShouldReport();

            g getShouldReportOrBuilder();

            StringValue getTag();

            d2 getTagOrBuilder();

            boolean hasPath();

            boolean hasQuery();

            boolean hasShouldReport();

            boolean hasTag();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public enum RuleOneofCase implements j0.c {
            GENERAL_RULE(1),
            IOS_LOG_RULE(2),
            PUR_RULE(3),
            RULEONEOF_NOT_SET(0);

            private final int value;

            RuleOneofCase(int i10) {
                this.value = i10;
            }

            public static RuleOneofCase forNumber(int i10) {
                if (i10 == 0) {
                    return RULEONEOF_NOT_SET;
                }
                if (i10 == 1) {
                    return GENERAL_RULE;
                }
                if (i10 == 2) {
                    return IOS_LOG_RULE;
                }
                if (i10 != 3) {
                    return null;
                }
                return PUR_RULE;
            }

            @Override // com.explorestack.protobuf.j0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static RuleOneofCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public static Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Rule parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Rule) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return super.equals(obj);
            }
            Rule rule = (Rule) obj;
            if (!getRuleOneofCase().equals(rule.getRuleOneofCase())) {
                return false;
            }
            int i10 = this.ruleOneofCase_;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && !getPurRule().equals(rule.getPurRule())) {
                        return false;
                    }
                } else if (!getIosLogRule().equals(rule.getIosLogRule())) {
                    return false;
                }
            } else if (!getGeneralRule().equals(rule.getGeneralRule())) {
                return false;
            }
            return this.unknownFields.equals(rule.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public GeneralRule getGeneralRule() {
            return this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public GeneralRuleOrBuilder getGeneralRuleOrBuilder() {
            return this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public IOSLogRule getIosLogRule() {
            return this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public IOSLogRuleOrBuilder getIosLogRuleOrBuilder() {
            return this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public PurRule getPurRule() {
            return this.ruleOneofCase_ == 3 ? (PurRule) this.ruleOneof_ : PurRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public PurRuleOrBuilder getPurRuleOrBuilder() {
            return this.ruleOneofCase_ == 3 ? (PurRule) this.ruleOneof_ : PurRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public RuleOneofCase getRuleOneofCase() {
            return RuleOneofCase.forNumber(this.ruleOneofCase_);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.ruleOneofCase_ == 1 ? n.G(1, (GeneralRule) this.ruleOneof_) : 0;
            if (this.ruleOneofCase_ == 2) {
                iG += n.G(2, (IOSLogRule) this.ruleOneof_);
            }
            if (this.ruleOneofCase_ == 3) {
                iG += n.G(3, (PurRule) this.ruleOneof_);
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public boolean hasGeneralRule() {
            return this.ruleOneofCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public boolean hasIosLogRule() {
            return this.ruleOneofCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public boolean hasPurRule() {
            return this.ruleOneofCase_ == 3;
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
            int i12 = this.ruleOneofCase_;
            if (i12 == 1) {
                i10 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getGeneralRule().hashCode();
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i10 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getPurRule().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i10 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getIosLogRule().hashCode();
            }
            iHashCode2 = i10 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable.d(Rule.class, Builder.class);
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
            return new Rule();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.ruleOneofCase_ == 1) {
                nVar.J0(1, (GeneralRule) this.ruleOneof_);
            }
            if (this.ruleOneofCase_ == 2) {
                nVar.J0(2, (IOSLogRule) this.ruleOneof_);
            }
            if (this.ruleOneofCase_ == 3) {
                nVar.J0(3, (PurRule) this.ruleOneof_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements RuleOrBuilder {
            private a2 generalRuleBuilder_;
            private a2 iosLogRuleBuilder_;
            private a2 purRuleBuilder_;
            private int ruleOneofCase_;
            private Object ruleOneof_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
            }

            private a2 getGeneralRuleFieldBuilder() {
                if (this.generalRuleBuilder_ == null) {
                    if (this.ruleOneofCase_ != 1) {
                        this.ruleOneof_ = GeneralRule.getDefaultInstance();
                    }
                    this.generalRuleBuilder_ = new a2((GeneralRule) this.ruleOneof_, getParentForChildren(), isClean());
                    this.ruleOneof_ = null;
                }
                this.ruleOneofCase_ = 1;
                onChanged();
                return this.generalRuleBuilder_;
            }

            private a2 getIosLogRuleFieldBuilder() {
                if (this.iosLogRuleBuilder_ == null) {
                    if (this.ruleOneofCase_ != 2) {
                        this.ruleOneof_ = IOSLogRule.getDefaultInstance();
                    }
                    this.iosLogRuleBuilder_ = new a2((IOSLogRule) this.ruleOneof_, getParentForChildren(), isClean());
                    this.ruleOneof_ = null;
                }
                this.ruleOneofCase_ = 2;
                onChanged();
                return this.iosLogRuleBuilder_;
            }

            private a2 getPurRuleFieldBuilder() {
                if (this.purRuleBuilder_ == null) {
                    if (this.ruleOneofCase_ != 3) {
                        this.ruleOneof_ = PurRule.getDefaultInstance();
                    }
                    this.purRuleBuilder_ = new a2((PurRule) this.ruleOneof_, getParentForChildren(), isClean());
                    this.ruleOneof_ = null;
                }
                this.ruleOneofCase_ = 3;
                onChanged();
                return this.purRuleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearGeneralRule() {
                a2 a2Var = this.generalRuleBuilder_;
                if (a2Var == null) {
                    if (this.ruleOneofCase_ == 1) {
                        this.ruleOneofCase_ = 0;
                        this.ruleOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.ruleOneofCase_ == 1) {
                    this.ruleOneofCase_ = 0;
                    this.ruleOneof_ = null;
                }
                a2Var.b();
                return this;
            }

            public Builder clearIosLogRule() {
                a2 a2Var = this.iosLogRuleBuilder_;
                if (a2Var == null) {
                    if (this.ruleOneofCase_ == 2) {
                        this.ruleOneofCase_ = 0;
                        this.ruleOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.ruleOneofCase_ == 2) {
                    this.ruleOneofCase_ = 0;
                    this.ruleOneof_ = null;
                }
                a2Var.b();
                return this;
            }

            public Builder clearPurRule() {
                a2 a2Var = this.purRuleBuilder_;
                if (a2Var == null) {
                    if (this.ruleOneofCase_ == 3) {
                        this.ruleOneofCase_ = 0;
                        this.ruleOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.ruleOneofCase_ == 3) {
                    this.ruleOneofCase_ = 0;
                    this.ruleOneof_ = null;
                }
                a2Var.b();
                return this;
            }

            public Builder clearRuleOneof() {
                this.ruleOneofCase_ = 0;
                this.ruleOneof_ = null;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public GeneralRule getGeneralRule() {
                a2 a2Var = this.generalRuleBuilder_;
                return a2Var == null ? this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance() : this.ruleOneofCase_ == 1 ? (GeneralRule) a2Var.e() : GeneralRule.getDefaultInstance();
            }

            public GeneralRule.Builder getGeneralRuleBuilder() {
                return (GeneralRule.Builder) getGeneralRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public GeneralRuleOrBuilder getGeneralRuleOrBuilder() {
                a2 a2Var;
                int i10 = this.ruleOneofCase_;
                return (i10 != 1 || (a2Var = this.generalRuleBuilder_) == null) ? i10 == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance() : (GeneralRuleOrBuilder) a2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public IOSLogRule getIosLogRule() {
                a2 a2Var = this.iosLogRuleBuilder_;
                return a2Var == null ? this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance() : this.ruleOneofCase_ == 2 ? (IOSLogRule) a2Var.e() : IOSLogRule.getDefaultInstance();
            }

            public IOSLogRule.Builder getIosLogRuleBuilder() {
                return (IOSLogRule.Builder) getIosLogRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public IOSLogRuleOrBuilder getIosLogRuleOrBuilder() {
                a2 a2Var;
                int i10 = this.ruleOneofCase_;
                return (i10 != 2 || (a2Var = this.iosLogRuleBuilder_) == null) ? i10 == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance() : (IOSLogRuleOrBuilder) a2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public PurRule getPurRule() {
                a2 a2Var = this.purRuleBuilder_;
                return a2Var == null ? this.ruleOneofCase_ == 3 ? (PurRule) this.ruleOneof_ : PurRule.getDefaultInstance() : this.ruleOneofCase_ == 3 ? (PurRule) a2Var.e() : PurRule.getDefaultInstance();
            }

            public PurRule.Builder getPurRuleBuilder() {
                return (PurRule.Builder) getPurRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public PurRuleOrBuilder getPurRuleOrBuilder() {
                a2 a2Var;
                int i10 = this.ruleOneofCase_;
                return (i10 != 3 || (a2Var = this.purRuleBuilder_) == null) ? i10 == 3 ? (PurRule) this.ruleOneof_ : PurRule.getDefaultInstance() : (PurRuleOrBuilder) a2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public RuleOneofCase getRuleOneofCase() {
                return RuleOneofCase.forNumber(this.ruleOneofCase_);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public boolean hasGeneralRule() {
                return this.ruleOneofCase_ == 1;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public boolean hasIosLogRule() {
                return this.ruleOneofCase_ == 2;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public boolean hasPurRule() {
                return this.ruleOneofCase_ == 3;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable.d(Rule.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeGeneralRule(GeneralRule generalRule) {
                a2 a2Var = this.generalRuleBuilder_;
                if (a2Var == null) {
                    if (this.ruleOneofCase_ != 1 || this.ruleOneof_ == GeneralRule.getDefaultInstance()) {
                        this.ruleOneof_ = generalRule;
                    } else {
                        this.ruleOneof_ = GeneralRule.newBuilder((GeneralRule) this.ruleOneof_).mergeFrom(generalRule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.ruleOneofCase_ == 1) {
                        a2Var.g(generalRule);
                    }
                    this.generalRuleBuilder_.i(generalRule);
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder mergeIosLogRule(IOSLogRule iOSLogRule) {
                a2 a2Var = this.iosLogRuleBuilder_;
                if (a2Var == null) {
                    if (this.ruleOneofCase_ != 2 || this.ruleOneof_ == IOSLogRule.getDefaultInstance()) {
                        this.ruleOneof_ = iOSLogRule;
                    } else {
                        this.ruleOneof_ = IOSLogRule.newBuilder((IOSLogRule) this.ruleOneof_).mergeFrom(iOSLogRule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.ruleOneofCase_ == 2) {
                        a2Var.g(iOSLogRule);
                    }
                    this.iosLogRuleBuilder_.i(iOSLogRule);
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            public Builder mergePurRule(PurRule purRule) {
                a2 a2Var = this.purRuleBuilder_;
                if (a2Var == null) {
                    if (this.ruleOneofCase_ != 3 || this.ruleOneof_ == PurRule.getDefaultInstance()) {
                        this.ruleOneof_ = purRule;
                    } else {
                        this.ruleOneof_ = PurRule.newBuilder((PurRule) this.ruleOneof_).mergeFrom(purRule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.ruleOneofCase_ == 3) {
                        a2Var.g(purRule);
                    }
                    this.purRuleBuilder_.i(purRule);
                }
                this.ruleOneofCase_ = 3;
                return this;
            }

            public Builder setGeneralRule(GeneralRule generalRule) {
                a2 a2Var = this.generalRuleBuilder_;
                if (a2Var == null) {
                    generalRule.getClass();
                    this.ruleOneof_ = generalRule;
                    onChanged();
                } else {
                    a2Var.i(generalRule);
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder setIosLogRule(IOSLogRule iOSLogRule) {
                a2 a2Var = this.iosLogRuleBuilder_;
                if (a2Var == null) {
                    iOSLogRule.getClass();
                    this.ruleOneof_ = iOSLogRule;
                    onChanged();
                } else {
                    a2Var.i(iOSLogRule);
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            public Builder setPurRule(PurRule purRule) {
                a2 a2Var = this.purRuleBuilder_;
                if (a2Var == null) {
                    purRule.getClass();
                    this.ruleOneof_ = purRule;
                    onChanged();
                } else {
                    a2Var.i(purRule);
                }
                this.ruleOneofCase_ = 3;
                return this;
            }

            private Builder() {
                this.ruleOneofCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rule build() {
                Rule ruleBuildPartial = buildPartial();
                if (ruleBuildPartial.isInitialized()) {
                    return ruleBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ruleBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rule buildPartial() {
                Rule rule = new Rule(this);
                if (this.ruleOneofCase_ == 1) {
                    a2 a2Var = this.generalRuleBuilder_;
                    if (a2Var == null) {
                        rule.ruleOneof_ = this.ruleOneof_;
                    } else {
                        rule.ruleOneof_ = a2Var.a();
                    }
                }
                if (this.ruleOneofCase_ == 2) {
                    a2 a2Var2 = this.iosLogRuleBuilder_;
                    if (a2Var2 == null) {
                        rule.ruleOneof_ = this.ruleOneof_;
                    } else {
                        rule.ruleOneof_ = a2Var2.a();
                    }
                }
                if (this.ruleOneofCase_ == 3) {
                    a2 a2Var3 = this.purRuleBuilder_;
                    if (a2Var3 == null) {
                        rule.ruleOneof_ = this.ruleOneof_;
                    } else {
                        rule.ruleOneof_ = a2Var3.a();
                    }
                }
                rule.ruleOneofCase_ = this.ruleOneofCase_;
                onBuilt();
                return rule;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Rule getDefaultInstanceForType() {
                return Rule.getDefaultInstance();
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
                this.ruleOneofCase_ = 0;
                this.ruleOneof_ = null;
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.ruleOneofCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Rule) {
                    return mergeFrom((Rule) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setGeneralRule(GeneralRule.Builder builder) {
                a2 a2Var = this.generalRuleBuilder_;
                if (a2Var == null) {
                    this.ruleOneof_ = builder.build();
                    onChanged();
                } else {
                    a2Var.i(builder.build());
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder setIosLogRule(IOSLogRule.Builder builder) {
                a2 a2Var = this.iosLogRuleBuilder_;
                if (a2Var == null) {
                    this.ruleOneof_ = builder.build();
                    onChanged();
                } else {
                    a2Var.i(builder.build());
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            public Builder setPurRule(PurRule.Builder builder) {
                a2 a2Var = this.purRuleBuilder_;
                if (a2Var == null) {
                    this.ruleOneof_ = builder.build();
                    onChanged();
                } else {
                    a2Var.i(builder.build());
                }
                this.ruleOneofCase_ = 3;
                return this;
            }

            public Builder mergeFrom(Rule rule) {
                if (rule == Rule.getDefaultInstance()) {
                    return this;
                }
                int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[rule.getRuleOneofCase().ordinal()];
                if (i10 == 1) {
                    mergeGeneralRule(rule.getGeneralRule());
                } else if (i10 == 2) {
                    mergeIosLogRule(rule.getIosLogRule());
                } else if (i10 == 3) {
                    mergePurRule(rule.getPurRule());
                }
                mergeUnknownFields(((h0) rule).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.Reader.Rule.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Reader.Rule.access$5200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Reader$Rule r3 = (io.bidmachine.protobuf.sdk.Reader.Rule) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Reader$Rule r4 = (io.bidmachine.protobuf.sdk.Reader.Rule) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Rule.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Reader$Rule$Builder");
            }
        }

        public static Builder newBuilder(Rule rule) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rule);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Rule(h0.b bVar) {
            super(bVar);
            this.ruleOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Rule parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Rule) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Rule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Rule getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Rule parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Rule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        private Rule() {
            this.ruleOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Rule parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Rule) PARSER.parseFrom(bArr, wVar);
        }

        public static Rule parseFrom(InputStream inputStream) throws IOException {
            return (Rule) h0.parseWithIOException(PARSER, inputStream);
        }

        private Rule(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                GeneralRule.Builder builder = this.ruleOneofCase_ == 1 ? ((GeneralRule) this.ruleOneof_).toBuilder() : null;
                                MessageLite messageLiteA = lVar.A(GeneralRule.parser(), wVar);
                                this.ruleOneof_ = messageLiteA;
                                if (builder != null) {
                                    builder.mergeFrom((GeneralRule) messageLiteA);
                                    this.ruleOneof_ = builder.buildPartial();
                                }
                                this.ruleOneofCase_ = 1;
                            } else if (iK == 18) {
                                IOSLogRule.Builder builder2 = this.ruleOneofCase_ == 2 ? ((IOSLogRule) this.ruleOneof_).toBuilder() : null;
                                MessageLite messageLiteA2 = lVar.A(IOSLogRule.parser(), wVar);
                                this.ruleOneof_ = messageLiteA2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((IOSLogRule) messageLiteA2);
                                    this.ruleOneof_ = builder2.buildPartial();
                                }
                                this.ruleOneofCase_ = 2;
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                PurRule.Builder builder3 = this.ruleOneofCase_ == 3 ? ((PurRule) this.ruleOneof_).toBuilder() : null;
                                MessageLite messageLiteA3 = lVar.A(PurRule.parser(), wVar);
                                this.ruleOneof_ = messageLiteA3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((PurRule) messageLiteA3);
                                    this.ruleOneof_ = builder3.buildPartial();
                                }
                                this.ruleOneofCase_ = 3;
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

        public static Rule parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Rule) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Rule parseFrom(l lVar) throws IOException {
            return (Rule) h0.parseWithIOException(PARSER, lVar);
        }

        public static Rule parseFrom(l lVar, w wVar) throws IOException {
            return (Rule) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface RuleOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        Rule.GeneralRule getGeneralRule();

        Rule.GeneralRuleOrBuilder getGeneralRuleOrBuilder();

        Rule.IOSLogRule getIosLogRule();

        Rule.IOSLogRuleOrBuilder getIosLogRuleOrBuilder();

        Rule.PurRule getPurRule();

        Rule.PurRuleOrBuilder getPurRuleOrBuilder();

        Rule.RuleOneofCase getRuleOneofCase();

        boolean hasGeneralRule();

        boolean hasIosLogRule();

        boolean hasPurRule();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Reader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Reader parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Reader) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Reader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reader)) {
            return super.equals(obj);
        }
        Reader reader = (Reader) obj;
        if (getName().equals(reader.getName()) && hasTimestamp() == reader.hasTimestamp()) {
            return (!hasTimestamp() || getTimestamp().equals(reader.getTimestamp())) && getRecordsList().equals(reader.getRecordsList()) && this.unknownFields.equals(reader.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public Record getRecords(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
        return this.records_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? h0.computeStringSize(1, this.name_) : 0;
        if (this.timestamp_ != null) {
            iComputeStringSize += n.G(2, getTimestamp());
        }
        for (int i11 = 0; i11 < this.records_.size(); i11++) {
            iComputeStringSize += n.G(3, this.records_.get(i11));
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public j2 getTimestampOrBuilder() {
        return getTimestamp();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public boolean hasTimestamp() {
        return this.timestamp_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (hasTimestamp()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getTimestamp().hashCode();
        }
        if (getRecordsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getRecordsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable.d(Reader.class, Builder.class);
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
        return new Reader();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getNameBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.name_);
        }
        if (this.timestamp_ != null) {
            nVar.J0(2, getTimestamp());
        }
        for (int i10 = 0; i10 < this.records_.size(); i10++) {
            nVar.J0(3, this.records_.get(i10));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements ReaderOrBuilder {
        private int bitField0_;
        private Object name_;
        private v1 recordsBuilder_;
        private List<Record> records_;
        private a2 timestampBuilder_;
        private Timestamp timestamp_;

        private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.records_ = new ArrayList(this.records_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
        }

        private v1 getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
                this.recordsBuilder_ = new v1(this.records_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.records_ = null;
            }
            return this.recordsBuilder_;
        }

        private a2 getTimestampFieldBuilder() {
            if (this.timestampBuilder_ == null) {
                this.timestampBuilder_ = new a2(getTimestamp(), getParentForChildren(), isClean());
                this.timestamp_ = null;
            }
            return this.timestampBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getRecordsFieldBuilder();
            }
        }

        public Builder addAllRecords(Iterable<? extends Record> iterable) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureRecordsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.records_);
            onChanged();
            return this;
        }

        public Builder addRecords(Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.e(record);
                return this;
            }
            record.getClass();
            ensureRecordsIsMutable();
            this.records_.add(record);
            onChanged();
            return this;
        }

        public Record.Builder addRecordsBuilder() {
            return (Record.Builder) getRecordsFieldBuilder().c(Record.getDefaultInstance());
        }

        public Builder clearName() {
            this.name_ = Reader.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder clearRecords() {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.records_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearTimestamp() {
            if (this.timestampBuilder_ == null) {
                this.timestamp_ = null;
                onChanged();
                return this;
            }
            this.timestamp_ = null;
            this.timestampBuilder_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public Record getRecords(int i10) {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.get(i10) : (Record) v1Var.n(i10);
        }

        public Record.Builder getRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().k(i10);
        }

        public List<Record.Builder> getRecordsBuilderList() {
            return getRecordsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public int getRecordsCount() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public List<Record> getRecordsList() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.records_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i10) {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.get(i10) : (RecordOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.records_);
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public Timestamp getTimestamp() {
            a2 a2Var = this.timestampBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getTimestampFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public j2 getTimestampOrBuilder() {
            a2 a2Var = this.timestampBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public boolean hasTimestamp() {
            return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable.d(Reader.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeTimestamp(Timestamp timestamp) {
            a2 a2Var = this.timestampBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 != null) {
                this.timestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.timestamp_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder removeRecords(int i10) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureRecordsIsMutable();
            this.records_.remove(i10);
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
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        public Builder setRecords(int i10, Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, record);
                return this;
            }
            record.getClass();
            ensureRecordsIsMutable();
            this.records_.set(i10, record);
            onChanged();
            return this;
        }

        public Builder setTimestamp(Timestamp timestamp) {
            a2 a2Var = this.timestampBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.timestamp_ = timestamp;
            onChanged();
            return this;
        }

        private Builder() {
            this.name_ = "";
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Reader build() {
            Reader readerBuildPartial = buildPartial();
            if (readerBuildPartial.isInitialized()) {
                return readerBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) readerBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Reader buildPartial() {
            Reader reader = new Reader(this);
            reader.name_ = this.name_;
            a2 a2Var = this.timestampBuilder_;
            if (a2Var == null) {
                reader.timestamp_ = this.timestamp_;
            } else {
                reader.timestamp_ = (Timestamp) a2Var.a();
            }
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                reader.records_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.records_ = DesugarCollections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                reader.records_ = this.records_;
            }
            onBuilt();
            return reader;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Reader getDefaultInstanceForType() {
            return Reader.getDefaultInstance();
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

        public Record.Builder addRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().b(i10, Record.getDefaultInstance());
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
            this.name_ = "";
            if (this.timestampBuilder_ == null) {
                this.timestamp_ = null;
            } else {
                this.timestamp_ = null;
                this.timestampBuilder_ = null;
            }
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                this.records_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            v1Var.g();
            return this;
        }

        public Builder setTimestamp(Timestamp.Builder builder) {
            a2 a2Var = this.timestampBuilder_;
            if (a2Var == null) {
                this.timestamp_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.name_ = "";
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addRecords(int i10, Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.add(i10, record);
                onChanged();
                return this;
            }
            v1Var.d(i10, record);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Reader) {
                return mergeFrom((Reader) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRecords(int i10, Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(Reader reader) {
            if (reader == Reader.getDefaultInstance()) {
                return this;
            }
            if (!reader.getName().isEmpty()) {
                this.name_ = reader.name_;
                onChanged();
            }
            if (reader.hasTimestamp()) {
                mergeTimestamp(reader.getTimestamp());
            }
            if (this.recordsBuilder_ == null) {
                if (!reader.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = reader.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(reader.records_);
                    }
                    onChanged();
                }
            } else if (!reader.records_.isEmpty()) {
                if (!this.recordsBuilder_.t()) {
                    this.recordsBuilder_.a(reader.records_);
                } else {
                    this.recordsBuilder_.h();
                    this.recordsBuilder_ = null;
                    this.records_ = reader.records_;
                    this.bitField0_ &= -2;
                    this.recordsBuilder_ = h0.alwaysUseFieldBuilders ? getRecordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) reader).unknownFields);
            onChanged();
            return this;
        }

        public Builder addRecords(Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addRecords(int i10, Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.sdk.Reader.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Reader.access$7300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Reader r3 = (io.bidmachine.protobuf.sdk.Reader) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Reader r4 = (io.bidmachine.protobuf.sdk.Reader) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Reader.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Reader$Builder");
        }
    }

    public static Builder newBuilder(Reader reader) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(reader);
    }

    public static Reader parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Reader(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Reader parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Reader) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Reader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Reader getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Reader parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Reader() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.records_ = Collections.EMPTY_LIST;
    }

    public static Reader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Reader parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Reader) PARSER.parseFrom(bArr, wVar);
    }

    public static Reader parseFrom(InputStream inputStream) throws IOException {
        return (Reader) h0.parseWithIOException(PARSER, inputStream);
    }

    private Reader(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.name_ = lVar.J();
                            } else if (iK == 18) {
                                Timestamp timestamp = this.timestamp_;
                                Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                                this.timestamp_ = timestamp2;
                                if (builder != null) {
                                    builder.mergeFrom(timestamp2);
                                    this.timestamp_ = builder.buildPartial();
                                }
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.records_ = new ArrayList();
                                    z11 = true;
                                }
                                this.records_.add((Record) lVar.A(Record.parser(), wVar));
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
                    this.records_ = DesugarCollections.unmodifiableList(this.records_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.records_ = DesugarCollections.unmodifiableList(this.records_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Reader parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Reader) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Reader parseFrom(l lVar) throws IOException {
        return (Reader) h0.parseWithIOException(PARSER, lVar);
    }

    public static Reader parseFrom(l lVar, w wVar) throws IOException {
        return (Reader) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
