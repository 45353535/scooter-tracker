package io.bidmachine.protobuf.sessionmetrics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u;
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionMetricsOuterClass {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n)bidmachine/protobuf/session_metrics.proto\u0012\u000esessionmetrics\"Õ\u0002\n\tUserState\u0012 \n\u0018last_processed_timestamp\u0018\u0001 \u0001(\u0003\u0012?\n\u000bimpressions\u0018\u0002 \u0003(\u000b2*.sessionmetrics.UserState.ImpressionsEntry\u0012>\n\u000bad_requests\u0018\u0003 \u0003(\u000b2).sessionmetrics.UserState.AdRequestsEntry\u001aV\n\u0010ImpressionsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u00121\n\u0005value\u0018\u0002 \u0001(\u000b2\".sessionmetrics.AdDomainTimestamps:\u00028\u0001\u001aM\n\u000fAdRequestsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012)\n\u0005value\u0018\u0002 \u0001(\u000b2\u001a.sessionmetrics.Timestamps:\u00028\u0001\"·\u0005\n\u000bUserSession\u0012\u0015\n\rlast_activity\u0018\u0001 \u0001(\u0003\u0012E\n\u0012metrics_by_ad_type\u0018\u0003 \u0003(\u000b2).sessionmetrics.UserSession.AdTypeMetrics\u0012\u0015\n\rsession_start\u0018\u0004 \u0001(\u0003\u0012%\n\u001dlast_request_rejection_reason\u0018\u0005 \u0001(\t\u001a@\n\u0004Ecpm\u0012\u0014\n\ffirst_prices\u0018\u0001 \u0003(\u0001\u0012\u0013\n\u000blast_prices\u0018\u0002 \u0003(\u0001\u0012\r\n\u0005count\u0018\u0003 \u0001(\u0005\u001aX\n\u0007Auction\u0012\u0019\n\u0011source_request_id\u0018\u0001 \u0001(\f\u0012\u0018\n\u0010winner_bidder_id\u0018\u0002 \u0001(\r\u0012\u0018\n\u0010losers_bidder_id\u0018\u0003 \u0003(\r\u001aï\u0002\n\rAdTypeMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012\u0013\n\u000bimpressions\u0018\u0002 \u0001(\u0005\u0012\u0013\n\u000bad_requests\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004bids\u0018\u0004 \u0001(\u0005\u0012\f\n\u0004wins\u0018\u0005 \u0001(\u0005\u0012\u000e\n\u0006losses\u0018\u0006 \u0001(\u0005\u0012\r\n\u0005lurls\u0018\u0007 \u0001(\u0005\u0012\r\n\u0005nurls\u0018\b \u0001(\u0005\u0012\u001c\n\u0014cumulative_bid_price\u0018\t \u0001(\u0002\u0012\u001d\n\u0015cumulative_lurl_price\u0018\n \u0001(\u0002\u0012\u001d\n\u0015cumulative_nurl_price\u0018\u000b \u0001(\u0002\u0012.\n\u0004ecpm\u0018\f \u0001(\u000b2 .sessionmetrics.UserSession.Ecpm\u00125\n\bauctions\u0018\r \u0003(\u000b2#.sessionmetrics.UserSession.Auction\"\u009f\u0001\n\nTimestamps\u0012\u0016\n\u000elast_timestamp\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006deltas\u0018\u0002 \u0003(\r\u00129\n\u000bday_buckets\u0018\u0003 \u0003(\u000b2$.sessionmetrics.Timestamps.DayBucket\u001a.\n\tDayBucket\u0012\u0012\n\nstart_time\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005count\u0018\u0002 \u0001(\u0005\"©\u0001\n\u0012AdDomainTimestamps\u0012E\n\nad_domains\u0018\u0001 \u0003(\u000b21.sessionmetrics.AdDomainTimestamps.AdDomainsEntry\u001aL\n\u000eAdDomainsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012)\n\u0005value\u0018\u0002 \u0001(\u000b2\u001a.sessionmetrics.Timestamps:\u00028\u0001\"B\n\rWindowMetrics\u0012\u000f\n\u0007last_1h\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007last_1d\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007last_7d\u0018\u0003 \u0001(\u0005\"Ö\u0001\n\u0011ImpressionMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012@\n\u0007domains\u0018\u0002 \u0003(\u000b2/.sessionmetrics.ImpressionMetrics.DomainMetrics\u001aV\n\rDomainMetrics\u0012\u000e\n\u0006domain\u0018\u0001 \u0001(\t\u00125\n\u000ewindow_metrics\u0018\u0002 \u0001(\u000b2\u001d.sessionmetrics.WindowMetrics\"\u008b\u0001\n\u0010AdRequestMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u00125\n\u000ewindow_metrics\u0018\u0002 \u0001(\u000b2\u001d.sessionmetrics.WindowMetrics\u0012\u0017\n\u000flast_timestamps\u0018\u0003 \u0003(\u0003\"&\n\u000eSegmentMetrics\u0012\u0014\n\fis_purchaser\u0018\u0001 \u0001(\b\"î\u0001\n\u000eSessionMetrics\u00126\n\u000bimpressions\u0018\u0001 \u0003(\u000b2!.sessionmetrics.ImpressionMetrics\u00125\n\u000bad_requests\u0018\u0002 \u0003(\u000b2 .sessionmetrics.AdRequestMetrics\u00124\n\u000fcurrent_session\u0018\u0003 \u0001(\u000b2\u001b.sessionmetrics.UserSession\u00127\n\u000fsegment_metrics\u0018\u0004 \u0001(\u000b2\u001e.sessionmetrics.SegmentMetrics\"1\n\u000bUserIdQuery\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\t\u0012\u0011\n\ttimestamp\u0018\u0002 \u0001(\u0003\"X\n\tAdRequest\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\t\u0012'\n\u0007ad_type\u0018\u0002 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012\u0011\n\ttimestamp\u0018\u0003 \u0001(\u0003*A\n\u0006AdType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0010\n\fINTERSTITIAL\u0010\u0001\u0012\f\n\bREWARDED\u0010\u0002\u0012\n\n\u0006BANNER\u0010\u00032²\u0001\n\u000eSessionService\u0012P\n\u0011GetSessionMetrics\u0012\u001b.sessionmetrics.UserIdQuery\u001a\u001e.sessionmetrics.SessionMetrics\u0012N\n\u0011RegisterAdRequest\u0012\u0019.sessionmetrics.AdRequest\u001a\u001e.sessionmetrics.SessionMetricsB'\n%io.bidmachine.protobuf.sessionmetricsb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor;
    private static final h0.f internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
    private static final h0.f internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdRequestMetrics_descriptor;
    private static final h0.f internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdRequest_descriptor;
    private static final h0.f internal_static_sessionmetrics_AdRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
    private static final h0.f internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_ImpressionMetrics_descriptor;
    private static final h0.f internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_SegmentMetrics_descriptor;
    private static final h0.f internal_static_sessionmetrics_SegmentMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_SessionMetrics_descriptor;
    private static final h0.f internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
    private static final h0.f internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_Timestamps_descriptor;
    private static final h0.f internal_static_sessionmetrics_Timestamps_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserIdQuery_descriptor;
    private static final h0.f internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
    private static final h0.f internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_Auction_descriptor;
    private static final h0.f internal_static_sessionmetrics_UserSession_Auction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
    private static final h0.f internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_descriptor;
    private static final h0.f internal_static_sessionmetrics_UserSession_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor;
    private static final h0.f internal_static_sessionmetrics_UserState_AdRequestsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor;
    private static final h0.f internal_static_sessionmetrics_UserState_ImpressionsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_descriptor;
    private static final h0.f internal_static_sessionmetrics_UserState_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_WindowMetrics_descriptor;
    private static final h0.f internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable;

    public static final class AdDomainTimestamps extends h0 implements AdDomainTimestampsOrBuilder {
        public static final int AD_DOMAINS_FIELD_NUMBER = 1;
        private static final AdDomainTimestamps DEFAULT_INSTANCE = new AdDomainTimestamps();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps.1
            @Override // com.explorestack.protobuf.p1
            public AdDomainTimestamps parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new AdDomainTimestamps(lVar, wVar);
            }
        };
        private static final long serialVersionUID = 0;
        private w0 adDomains_;
        private byte memoizedIsInitialized;

        private static final class AdDomainsDefaultEntryHolder {
            static final u0 defaultEntry = u0.n(SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor, z2.b.f19481l, "", z2.b.f19483n, Timestamps.getDefaultInstance());

            private AdDomainsDefaultEntryHolder() {
            }
        }

        public static AdDomainTimestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w0 internalGetAdDomains() {
            w0 w0Var = this.adDomains_;
            return w0Var == null ? w0.g(AdDomainsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdDomainTimestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdDomainTimestamps) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdDomainTimestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public boolean containsAdDomains(String str) {
            str.getClass();
            return internalGetAdDomains().i().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdDomainTimestamps)) {
                return super.equals(obj);
            }
            AdDomainTimestamps adDomainTimestamps = (AdDomainTimestamps) obj;
            return internalGetAdDomains().equals(adDomainTimestamps.internalGetAdDomains()) && this.unknownFields.equals(adDomainTimestamps.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        @Deprecated
        public Map<String, Timestamps> getAdDomains() {
            return getAdDomainsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public int getAdDomainsCount() {
            return internalGetAdDomains().i().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public Map<String, Timestamps> getAdDomainsMap() {
            return internalGetAdDomains().i();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps) {
            str.getClass();
            Map mapI = internalGetAdDomains().i();
            return mapI.containsKey(str) ? (Timestamps) mapI.get(str) : timestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
        public Timestamps getAdDomainsOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetAdDomains().i();
            if (mapI.containsKey(str)) {
                return (Timestamps) mapI.get(str);
            }
            throw new IllegalArgumentException();
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
            for (Map.Entry entry : internalGetAdDomains().i().entrySet()) {
                iG += n.G(1, AdDomainsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
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
            int iHashCode = 779 + getDescriptor().hashCode();
            if (!internalGetAdDomains().i().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + internalGetAdDomains().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable.d(AdDomainTimestamps.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0
        protected w0 internalGetMapField(int i10) {
            if (i10 == 1) {
                return internalGetAdDomains();
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
            return new AdDomainTimestamps();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            h0.serializeStringMapTo(nVar, internalGetAdDomains(), AdDomainsDefaultEntryHolder.defaultEntry, 1);
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements AdDomainTimestampsOrBuilder {
            private w0 adDomains_;
            private int bitField0_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
            }

            private w0 internalGetAdDomains() {
                w0 w0Var = this.adDomains_;
                return w0Var == null ? w0.g(AdDomainsDefaultEntryHolder.defaultEntry) : w0Var;
            }

            private w0 internalGetMutableAdDomains() {
                onChanged();
                if (this.adDomains_ == null) {
                    this.adDomains_ = w0.p(AdDomainsDefaultEntryHolder.defaultEntry);
                }
                if (!this.adDomains_.m()) {
                    this.adDomains_ = this.adDomains_.f();
                }
                return this.adDomains_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearAdDomains() {
                internalGetMutableAdDomains().l().clear();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public boolean containsAdDomains(String str) {
                str.getClass();
                return internalGetAdDomains().i().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            @Deprecated
            public Map<String, Timestamps> getAdDomains() {
                return getAdDomainsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public int getAdDomainsCount() {
                return internalGetAdDomains().i().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public Map<String, Timestamps> getAdDomainsMap() {
                return internalGetAdDomains().i();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps) {
                str.getClass();
                Map mapI = internalGetAdDomains().i();
                return mapI.containsKey(str) ? (Timestamps) mapI.get(str) : timestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestampsOrBuilder
            public Timestamps getAdDomainsOrThrow(String str) {
                str.getClass();
                Map mapI = internalGetAdDomains().i();
                if (mapI.containsKey(str)) {
                    return (Timestamps) mapI.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
            }

            @Deprecated
            public Map<String, Timestamps> getMutableAdDomains() {
                return internalGetMutableAdDomains().l();
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable.d(AdDomainTimestamps.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMapField(int i10) {
                if (i10 == 1) {
                    return internalGetAdDomains();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMutableMapField(int i10) {
                if (i10 == 1) {
                    return internalGetMutableAdDomains();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAdDomains(String str, Timestamps timestamps) {
                str.getClass();
                timestamps.getClass();
                internalGetMutableAdDomains().l().put(str, timestamps);
                return this;
            }

            public Builder putAllAdDomains(Map<String, Timestamps> map) {
                internalGetMutableAdDomains().l().putAll(map);
                return this;
            }

            public Builder removeAdDomains(String str) {
                str.getClass();
                internalGetMutableAdDomains().l().remove(str);
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
            public AdDomainTimestamps build() {
                AdDomainTimestamps adDomainTimestampsBuildPartial = buildPartial();
                if (adDomainTimestampsBuildPartial.isInitialized()) {
                    return adDomainTimestampsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adDomainTimestampsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdDomainTimestamps buildPartial() {
                AdDomainTimestamps adDomainTimestamps = new AdDomainTimestamps(this);
                adDomainTimestamps.adDomains_ = internalGetAdDomains();
                adDomainTimestamps.adDomains_.n();
                onBuilt();
                return adDomainTimestamps;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public AdDomainTimestamps getDefaultInstanceForType() {
                return AdDomainTimestamps.getDefaultInstance();
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
                internalGetMutableAdDomains().a();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdDomainTimestamps) {
                    return mergeFrom((AdDomainTimestamps) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdDomainTimestamps adDomainTimestamps) {
                if (adDomainTimestamps == AdDomainTimestamps.getDefaultInstance()) {
                    return this;
                }
                internalGetMutableAdDomains().o(adDomainTimestamps.internalGetAdDomains());
                mergeUnknownFields(((h0) adDomainTimestamps).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps.access$12800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdDomainTimestamps r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdDomainTimestamps r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdDomainTimestamps.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdDomainTimestamps$Builder");
            }
        }

        public static Builder newBuilder(AdDomainTimestamps adDomainTimestamps) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adDomainTimestamps);
        }

        public static AdDomainTimestamps parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(byteBuffer, wVar);
        }

        private AdDomainTimestamps(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdDomainTimestamps parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdDomainTimestamps) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static AdDomainTimestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdDomainTimestamps getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdDomainTimestamps parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdDomainTimestamps() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdDomainTimestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static AdDomainTimestamps parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (AdDomainTimestamps) PARSER.parseFrom(bArr, wVar);
        }

        private AdDomainTimestamps(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                if (iK != 10) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    if (!z11) {
                                        this.adDomains_ = w0.p(AdDomainsDefaultEntryHolder.defaultEntry);
                                        z11 = true;
                                    }
                                    u0 u0Var = (u0) lVar.A(AdDomainsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                    this.adDomains_.l().put(u0Var.i(), u0Var.k());
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

        public static AdDomainTimestamps parseFrom(InputStream inputStream) throws IOException {
            return (AdDomainTimestamps) h0.parseWithIOException(PARSER, inputStream);
        }

        public static AdDomainTimestamps parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdDomainTimestamps) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static AdDomainTimestamps parseFrom(l lVar) throws IOException {
            return (AdDomainTimestamps) h0.parseWithIOException(PARSER, lVar);
        }

        public static AdDomainTimestamps parseFrom(l lVar, w wVar) throws IOException {
            return (AdDomainTimestamps) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface AdDomainTimestampsOrBuilder extends MessageOrBuilder {
        boolean containsAdDomains(String str);

        @Deprecated
        Map<String, Timestamps> getAdDomains();

        int getAdDomainsCount();

        Map<String, Timestamps> getAdDomainsMap();

        Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps);

        Timestamps getAdDomainsOrThrow(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class AdRequest extends h0 implements AdRequestOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 2;
        private static final AdRequest DEFAULT_INSTANCE = new AdRequest();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest.1
            @Override // com.explorestack.protobuf.p1
            public AdRequest parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new AdRequest(lVar, wVar);
            }
        };
        public static final int TIMESTAMP_FIELD_NUMBER = 3;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int adType_;
        private byte memoizedIsInitialized;
        private long timestamp_;
        private volatile Object userId_;

        public static AdRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRequest) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdRequest)) {
                return super.equals(obj);
            }
            AdRequest adRequest = (AdRequest) obj;
            return getUserId().equals(adRequest.getUserId()) && this.adType_ == adRequest.adType_ && getTimestamp() == adRequest.getTimestamp() && this.unknownFields.equals(adRequest.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
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
            int iComputeStringSize = !getUserIdBytes().isEmpty() ? h0.computeStringSize(1, this.userId_) : 0;
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                iComputeStringSize += n.l(2, this.adType_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                iComputeStringSize += n.z(3, j10);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserId().hashCode()) * 37) + 2) * 53) + this.adType_) * 37) + 3) * 53) + j0.i(getTimestamp())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_fieldAccessorTable.d(AdRequest.class, Builder.class);
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
            return new AdRequest();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getUserIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.userId_);
            }
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                nVar.v0(2, this.adType_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                nVar.H0(3, j10);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements AdRequestOrBuilder {
            private int adType_;
            private long timestamp_;
            private Object userId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = AdRequest.getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestOrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequest_fieldAccessorTable.d(AdRequest.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            public Builder setTimestamp(long j10) {
                this.timestamp_ = j10;
                onChanged();
                return this;
            }

            public Builder setUserId(String str) {
                str.getClass();
                this.userId_ = str;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.userId_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.userId_ = "";
                this.adType_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequest build() {
                AdRequest adRequestBuildPartial = buildPartial();
                if (adRequestBuildPartial.isInitialized()) {
                    return adRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adRequestBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequest buildPartial() {
                AdRequest adRequest = new AdRequest(this);
                adRequest.userId_ = this.userId_;
                adRequest.adType_ = this.adType_;
                adRequest.timestamp_ = this.timestamp_;
                onBuilt();
                return adRequest;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public AdRequest getDefaultInstanceForType() {
                return AdRequest.getDefaultInstance();
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
                this.userId_ = "";
                this.adType_ = 0;
                this.timestamp_ = 0L;
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.userId_ = "";
                this.adType_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdRequest) {
                    return mergeFrom((AdRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdRequest adRequest) {
                if (adRequest == AdRequest.getDefaultInstance()) {
                    return this;
                }
                if (!adRequest.getUserId().isEmpty()) {
                    this.userId_ = adRequest.userId_;
                    onChanged();
                }
                if (adRequest.adType_ != 0) {
                    setAdTypeValue(adRequest.getAdTypeValue());
                }
                if (adRequest.getTimestamp() != 0) {
                    setTimestamp(adRequest.getTimestamp());
                }
                mergeUnknownFields(((h0) adRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest.access$22900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequest r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequest r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequest.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequest$Builder");
            }
        }

        public static Builder newBuilder(AdRequest adRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adRequest);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(byteBuffer, wVar);
        }

        private AdRequest(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdRequest) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static AdRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdRequest parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
            this.adType_ = 0;
        }

        public static AdRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static AdRequest parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (AdRequest) PARSER.parseFrom(bArr, wVar);
        }

        public static AdRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdRequest) h0.parseWithIOException(PARSER, inputStream);
        }

        private AdRequest(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.userId_ = lVar.J();
                            } else if (iK == 16) {
                                this.adType_ = lVar.t();
                            } else if (iK != 24) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.timestamp_ = lVar.z();
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

        public static AdRequest parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdRequest) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static AdRequest parseFrom(l lVar) throws IOException {
            return (AdRequest) h0.parseWithIOException(PARSER, lVar);
        }

        public static AdRequest parseFrom(l lVar, w wVar) throws IOException {
            return (AdRequest) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public static final class AdRequestMetrics extends h0 implements AdRequestMetricsOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 1;
        public static final int LAST_TIMESTAMPS_FIELD_NUMBER = 3;
        public static final int WINDOW_METRICS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int adType_;
        private int lastTimestampsMemoizedSerializedSize;
        private j0.i lastTimestamps_;
        private byte memoizedIsInitialized;
        private WindowMetrics windowMetrics_;
        private static final AdRequestMetrics DEFAULT_INSTANCE = new AdRequestMetrics();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics.1
            @Override // com.explorestack.protobuf.p1
            public AdRequestMetrics parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new AdRequestMetrics(lVar, wVar);
            }
        };

        public static AdRequestMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdRequestMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRequestMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdRequestMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdRequestMetrics)) {
                return super.equals(obj);
            }
            AdRequestMetrics adRequestMetrics = (AdRequestMetrics) obj;
            if (this.adType_ == adRequestMetrics.adType_ && hasWindowMetrics() == adRequestMetrics.hasWindowMetrics()) {
                return (!hasWindowMetrics() || getWindowMetrics().equals(adRequestMetrics.getWindowMetrics())) && getLastTimestampsList().equals(adRequestMetrics.getLastTimestampsList()) && this.unknownFields.equals(adRequestMetrics.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public long getLastTimestamps(int i10) {
            return this.lastTimestamps_.getLong(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public int getLastTimestampsCount() {
            return this.lastTimestamps_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public List<Long> getLastTimestampsList() {
            return this.lastTimestamps_;
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
            int iL = this.adType_ != AdType.UNKNOWN.getNumber() ? n.l(1, this.adType_) : 0;
            if (this.windowMetrics_ != null) {
                iL += n.G(2, getWindowMetrics());
            }
            int iA = 0;
            for (int i11 = 0; i11 < this.lastTimestamps_.size(); i11++) {
                iA += n.A(this.lastTimestamps_.getLong(i11));
            }
            int iY = iL + iA;
            if (!getLastTimestampsList().isEmpty()) {
                iY = iY + 1 + n.y(iA);
            }
            this.lastTimestampsMemoizedSerializedSize = iA;
            int serializedSize = iY + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public WindowMetrics getWindowMetrics() {
            WindowMetrics windowMetrics = this.windowMetrics_;
            return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
            return getWindowMetrics();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
        public boolean hasWindowMetrics() {
            return this.windowMetrics_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.adType_;
            if (hasWindowMetrics()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getWindowMetrics().hashCode();
            }
            if (getLastTimestampsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getLastTimestampsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable.d(AdRequestMetrics.class, Builder.class);
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
            return new AdRequestMetrics();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                nVar.v0(1, this.adType_);
            }
            if (this.windowMetrics_ != null) {
                nVar.J0(2, getWindowMetrics());
            }
            if (getLastTimestampsList().size() > 0) {
                nVar.X0(26);
                nVar.X0(this.lastTimestampsMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.lastTimestamps_.size(); i10++) {
                nVar.I0(this.lastTimestamps_.getLong(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements AdRequestMetricsOrBuilder {
            private int adType_;
            private int bitField0_;
            private j0.i lastTimestamps_;
            private a2 windowMetricsBuilder_;
            private WindowMetrics windowMetrics_;

            private void ensureLastTimestampsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.lastTimestamps_ = h0.mutableCopy(this.lastTimestamps_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
            }

            private a2 getWindowMetricsFieldBuilder() {
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetricsBuilder_ = new a2(getWindowMetrics(), getParentForChildren(), isClean());
                    this.windowMetrics_ = null;
                }
                return this.windowMetricsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder addAllLastTimestamps(Iterable<? extends Long> iterable) {
                ensureLastTimestampsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.lastTimestamps_);
                onChanged();
                return this;
            }

            public Builder addLastTimestamps(long j10) {
                ensureLastTimestampsIsMutable();
                this.lastTimestamps_.addLong(j10);
                onChanged();
                return this;
            }

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLastTimestamps() {
                this.lastTimestamps_ = h0.emptyLongList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearWindowMetrics() {
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetrics_ = null;
                    onChanged();
                    return this;
                }
                this.windowMetrics_ = null;
                this.windowMetricsBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public long getLastTimestamps(int i10) {
                return this.lastTimestamps_.getLong(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public int getLastTimestampsCount() {
                return this.lastTimestamps_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public List<Long> getLastTimestampsList() {
                return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.lastTimestamps_) : this.lastTimestamps_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public WindowMetrics getWindowMetrics() {
                a2 a2Var = this.windowMetricsBuilder_;
                if (a2Var != null) {
                    return (WindowMetrics) a2Var.e();
                }
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            public WindowMetrics.Builder getWindowMetricsBuilder() {
                onChanged();
                return (WindowMetrics.Builder) getWindowMetricsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                a2 a2Var = this.windowMetricsBuilder_;
                if (a2Var != null) {
                    return (WindowMetricsOrBuilder) a2Var.f();
                }
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetricsOrBuilder
            public boolean hasWindowMetrics() {
                return (this.windowMetricsBuilder_ == null && this.windowMetrics_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable.d(AdRequestMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeWindowMetrics(WindowMetrics windowMetrics) {
                a2 a2Var = this.windowMetricsBuilder_;
                if (a2Var != null) {
                    a2Var.g(windowMetrics);
                    return this;
                }
                WindowMetrics windowMetrics2 = this.windowMetrics_;
                if (windowMetrics2 != null) {
                    this.windowMetrics_ = WindowMetrics.newBuilder(windowMetrics2).mergeFrom(windowMetrics).buildPartial();
                } else {
                    this.windowMetrics_ = windowMetrics;
                }
                onChanged();
                return this;
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            public Builder setLastTimestamps(int i10, long j10) {
                ensureLastTimestampsIsMutable();
                this.lastTimestamps_.setLong(i10, j10);
                onChanged();
                return this;
            }

            public Builder setWindowMetrics(WindowMetrics windowMetrics) {
                a2 a2Var = this.windowMetricsBuilder_;
                if (a2Var != null) {
                    a2Var.i(windowMetrics);
                    return this;
                }
                windowMetrics.getClass();
                this.windowMetrics_ = windowMetrics;
                onChanged();
                return this;
            }

            private Builder() {
                this.adType_ = 0;
                this.lastTimestamps_ = h0.emptyLongList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequestMetrics build() {
                AdRequestMetrics adRequestMetricsBuildPartial = buildPartial();
                if (adRequestMetricsBuildPartial.isInitialized()) {
                    return adRequestMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adRequestMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequestMetrics buildPartial() {
                AdRequestMetrics adRequestMetrics = new AdRequestMetrics(this);
                adRequestMetrics.adType_ = this.adType_;
                a2 a2Var = this.windowMetricsBuilder_;
                if (a2Var == null) {
                    adRequestMetrics.windowMetrics_ = this.windowMetrics_;
                } else {
                    adRequestMetrics.windowMetrics_ = (WindowMetrics) a2Var.a();
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.lastTimestamps_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                adRequestMetrics.lastTimestamps_ = this.lastTimestamps_;
                onBuilt();
                return adRequestMetrics;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public AdRequestMetrics getDefaultInstanceForType() {
                return AdRequestMetrics.getDefaultInstance();
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
                this.adType_ = 0;
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetrics_ = null;
                } else {
                    this.windowMetrics_ = null;
                    this.windowMetricsBuilder_ = null;
                }
                this.lastTimestamps_ = h0.emptyLongList();
                this.bitField0_ &= -2;
                return this;
            }

            public Builder setWindowMetrics(WindowMetrics.Builder builder) {
                a2 a2Var = this.windowMetricsBuilder_;
                if (a2Var == null) {
                    this.windowMetrics_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.adType_ = 0;
                this.lastTimestamps_ = h0.emptyLongList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdRequestMetrics) {
                    return mergeFrom((AdRequestMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdRequestMetrics adRequestMetrics) {
                if (adRequestMetrics == AdRequestMetrics.getDefaultInstance()) {
                    return this;
                }
                if (adRequestMetrics.adType_ != 0) {
                    setAdTypeValue(adRequestMetrics.getAdTypeValue());
                }
                if (adRequestMetrics.hasWindowMetrics()) {
                    mergeWindowMetrics(adRequestMetrics.getWindowMetrics());
                }
                if (!adRequestMetrics.lastTimestamps_.isEmpty()) {
                    if (this.lastTimestamps_.isEmpty()) {
                        this.lastTimestamps_ = adRequestMetrics.lastTimestamps_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureLastTimestampsIsMutable();
                        this.lastTimestamps_.addAll(adRequestMetrics.lastTimestamps_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((h0) adRequestMetrics).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics.access$17700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequestMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequestMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdRequestMetrics.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$AdRequestMetrics$Builder");
            }
        }

        public static Builder newBuilder(AdRequestMetrics adRequestMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adRequestMetrics);
        }

        public static AdRequestMetrics parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(byteBuffer, wVar);
        }

        private AdRequestMetrics(h0.b bVar) {
            super(bVar);
            this.lastTimestampsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdRequestMetrics parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdRequestMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static AdRequestMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdRequestMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdRequestMetrics parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AdRequestMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        private AdRequestMetrics() {
            this.lastTimestampsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.adType_ = 0;
            this.lastTimestamps_ = h0.emptyLongList();
        }

        public static AdRequestMetrics parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (AdRequestMetrics) PARSER.parseFrom(bArr, wVar);
        }

        public static AdRequestMetrics parseFrom(InputStream inputStream) throws IOException {
            return (AdRequestMetrics) h0.parseWithIOException(PARSER, inputStream);
        }

        public static AdRequestMetrics parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdRequestMetrics) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        private AdRequestMetrics(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.adType_ = lVar.t();
                            } else if (iK == 18) {
                                WindowMetrics windowMetrics = this.windowMetrics_;
                                WindowMetrics.Builder builder = windowMetrics != null ? windowMetrics.toBuilder() : null;
                                WindowMetrics windowMetrics2 = (WindowMetrics) lVar.A(WindowMetrics.parser(), wVar);
                                this.windowMetrics_ = windowMetrics2;
                                if (builder != null) {
                                    builder.mergeFrom(windowMetrics2);
                                    this.windowMetrics_ = builder.buildPartial();
                                }
                            } else if (iK == 24) {
                                if (!z11) {
                                    this.lastTimestamps_ = h0.newLongList();
                                    z11 = true;
                                }
                                this.lastTimestamps_.addLong(lVar.z());
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                int iP = lVar.p(lVar.C());
                                if (!z11 && lVar.d() > 0) {
                                    this.lastTimestamps_ = h0.newLongList();
                                    z11 = true;
                                }
                                while (lVar.d() > 0) {
                                    this.lastTimestamps_.addLong(lVar.z());
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
                    if (z11) {
                        this.lastTimestamps_.makeImmutable();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.lastTimestamps_.makeImmutable();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static AdRequestMetrics parseFrom(l lVar) throws IOException {
            return (AdRequestMetrics) h0.parseWithIOException(PARSER, lVar);
        }

        public static AdRequestMetrics parseFrom(l lVar, w wVar) throws IOException {
            return (AdRequestMetrics) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface AdRequestMetricsOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        long getLastTimestamps(int i10);

        int getLastTimestampsCount();

        List<Long> getLastTimestampsList();

        WindowMetrics getWindowMetrics();

        WindowMetricsOrBuilder getWindowMetricsOrBuilder();

        boolean hasWindowMetrics();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public interface AdRequestOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        long getTimestamp();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum AdType implements j0.c {
        UNKNOWN(0),
        INTERSTITIAL(1),
        REWARDED(2),
        BANNER(3),
        UNRECOGNIZED(-1);

        public static final int BANNER_VALUE = 3;
        public static final int INTERSTITIAL_VALUE = 1;
        public static final int REWARDED_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private final int value;
        private static final j0.d internalValueMap = new j0.d() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.AdType.1
            public AdType findValueByNumber(int i10) {
                return AdType.forNumber(i10);
            }
        };
        private static final AdType[] VALUES = values();

        AdType(int i10) {
            this.value = i10;
        }

        public static AdType forNumber(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return INTERSTITIAL;
            }
            if (i10 == 2) {
                return REWARDED;
            }
            if (i10 != 3) {
                return null;
            }
            return BANNER;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SessionMetricsOuterClass.getDescriptor().getEnumTypes().get(0);
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
        public static AdType valueOf(int i10) {
            return forNumber(i10);
        }

        public static AdType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class ImpressionMetrics extends h0 implements ImpressionMetricsOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 1;
        public static final int DOMAINS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int adType_;
        private List<DomainMetrics> domains_;
        private byte memoizedIsInitialized;
        private static final ImpressionMetrics DEFAULT_INSTANCE = new ImpressionMetrics();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.1
            @Override // com.explorestack.protobuf.p1
            public ImpressionMetrics parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new ImpressionMetrics(lVar, wVar);
            }
        };

        public static final class DomainMetrics extends h0 implements DomainMetricsOrBuilder {
            public static final int DOMAIN_FIELD_NUMBER = 1;
            public static final int WINDOW_METRICS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private volatile Object domain_;
            private byte memoizedIsInitialized;
            private WindowMetrics windowMetrics_;
            private static final DomainMetrics DEFAULT_INSTANCE = new DomainMetrics();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics.1
                @Override // com.explorestack.protobuf.p1
                public DomainMetrics parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new DomainMetrics(lVar, wVar);
                }
            };

            public static DomainMetrics getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DomainMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DomainMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DomainMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DomainMetrics)) {
                    return super.equals(obj);
                }
                DomainMetrics domainMetrics = (DomainMetrics) obj;
                if (getDomain().equals(domainMetrics.getDomain()) && hasWindowMetrics() == domainMetrics.hasWindowMetrics()) {
                    return (!hasWindowMetrics() || getWindowMetrics().equals(domainMetrics.getWindowMetrics())) && this.unknownFields.equals(domainMetrics.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
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
                int iComputeStringSize = !getDomainBytes().isEmpty() ? h0.computeStringSize(1, this.domain_) : 0;
                if (this.windowMetrics_ != null) {
                    iComputeStringSize += n.G(2, getWindowMetrics());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public WindowMetrics getWindowMetrics() {
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                return getWindowMetrics();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
            public boolean hasWindowMetrics() {
                return this.windowMetrics_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getDomain().hashCode();
                if (hasWindowMetrics()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getWindowMetrics().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable.d(DomainMetrics.class, Builder.class);
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
                return new DomainMetrics();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getDomainBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.domain_);
                }
                if (this.windowMetrics_ != null) {
                    nVar.J0(2, getWindowMetrics());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements DomainMetricsOrBuilder {
                private Object domain_;
                private a2 windowMetricsBuilder_;
                private WindowMetrics windowMetrics_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
                }

                private a2 getWindowMetricsFieldBuilder() {
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetricsBuilder_ = new a2(getWindowMetrics(), getParentForChildren(), isClean());
                        this.windowMetrics_ = null;
                    }
                    return this.windowMetricsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearDomain() {
                    this.domain_ = DomainMetrics.getDefaultInstance().getDomain();
                    onChanged();
                    return this;
                }

                public Builder clearWindowMetrics() {
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetrics_ = null;
                        onChanged();
                        return this;
                    }
                    this.windowMetrics_ = null;
                    this.windowMetricsBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public WindowMetrics getWindowMetrics() {
                    a2 a2Var = this.windowMetricsBuilder_;
                    if (a2Var != null) {
                        return (WindowMetrics) a2Var.e();
                    }
                    WindowMetrics windowMetrics = this.windowMetrics_;
                    return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
                }

                public WindowMetrics.Builder getWindowMetricsBuilder() {
                    onChanged();
                    return (WindowMetrics.Builder) getWindowMetricsFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                    a2 a2Var = this.windowMetricsBuilder_;
                    if (a2Var != null) {
                        return (WindowMetricsOrBuilder) a2Var.f();
                    }
                    WindowMetrics windowMetrics = this.windowMetrics_;
                    return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetricsOrBuilder
                public boolean hasWindowMetrics() {
                    return (this.windowMetricsBuilder_ == null && this.windowMetrics_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable.d(DomainMetrics.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeWindowMetrics(WindowMetrics windowMetrics) {
                    a2 a2Var = this.windowMetricsBuilder_;
                    if (a2Var != null) {
                        a2Var.g(windowMetrics);
                        return this;
                    }
                    WindowMetrics windowMetrics2 = this.windowMetrics_;
                    if (windowMetrics2 != null) {
                        this.windowMetrics_ = WindowMetrics.newBuilder(windowMetrics2).mergeFrom(windowMetrics).buildPartial();
                    } else {
                        this.windowMetrics_ = windowMetrics;
                    }
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
                    a.checkByteStringIsUtf8(byteString);
                    this.domain_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setWindowMetrics(WindowMetrics windowMetrics) {
                    a2 a2Var = this.windowMetricsBuilder_;
                    if (a2Var != null) {
                        a2Var.i(windowMetrics);
                        return this;
                    }
                    windowMetrics.getClass();
                    this.windowMetrics_ = windowMetrics;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.domain_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DomainMetrics build() {
                    DomainMetrics domainMetricsBuildPartial = buildPartial();
                    if (domainMetricsBuildPartial.isInitialized()) {
                        return domainMetricsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) domainMetricsBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DomainMetrics buildPartial() {
                    DomainMetrics domainMetrics = new DomainMetrics(this);
                    domainMetrics.domain_ = this.domain_;
                    a2 a2Var = this.windowMetricsBuilder_;
                    if (a2Var == null) {
                        domainMetrics.windowMetrics_ = this.windowMetrics_;
                    } else {
                        domainMetrics.windowMetrics_ = (WindowMetrics) a2Var.a();
                    }
                    onBuilt();
                    return domainMetrics;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public DomainMetrics getDefaultInstanceForType() {
                    return DomainMetrics.getDefaultInstance();
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
                    this.domain_ = "";
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetrics_ = null;
                        return this;
                    }
                    this.windowMetrics_ = null;
                    this.windowMetricsBuilder_ = null;
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.domain_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder setWindowMetrics(WindowMetrics.Builder builder) {
                    a2 a2Var = this.windowMetricsBuilder_;
                    if (a2Var == null) {
                        this.windowMetrics_ = builder.build();
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
                    if (message instanceof DomainMetrics) {
                        return mergeFrom((DomainMetrics) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(DomainMetrics domainMetrics) {
                    if (domainMetrics == DomainMetrics.getDefaultInstance()) {
                        return this;
                    }
                    if (!domainMetrics.getDomain().isEmpty()) {
                        this.domain_ = domainMetrics.domain_;
                        onChanged();
                    }
                    if (domainMetrics.hasWindowMetrics()) {
                        mergeWindowMetrics(domainMetrics.getWindowMetrics());
                    }
                    mergeUnknownFields(((h0) domainMetrics).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics.access$15300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics$DomainMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics$DomainMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.DomainMetrics.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics$DomainMetrics$Builder");
                }
            }

            public static Builder newBuilder(DomainMetrics domainMetrics) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(domainMetrics);
            }

            public static DomainMetrics parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(byteBuffer, wVar);
            }

            private DomainMetrics(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DomainMetrics parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (DomainMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static DomainMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public DomainMetrics getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static DomainMetrics parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DomainMetrics() {
                this.memoizedIsInitialized = (byte) -1;
                this.domain_ = "";
            }

            public static DomainMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static DomainMetrics parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (DomainMetrics) PARSER.parseFrom(bArr, wVar);
            }

            public static DomainMetrics parseFrom(InputStream inputStream) throws IOException {
                return (DomainMetrics) h0.parseWithIOException(PARSER, inputStream);
            }

            private DomainMetrics(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.domain_ = lVar.J();
                                } else if (iK != 18) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    WindowMetrics windowMetrics = this.windowMetrics_;
                                    WindowMetrics.Builder builder = windowMetrics != null ? windowMetrics.toBuilder() : null;
                                    WindowMetrics windowMetrics2 = (WindowMetrics) lVar.A(WindowMetrics.parser(), wVar);
                                    this.windowMetrics_ = windowMetrics2;
                                    if (builder != null) {
                                        builder.mergeFrom(windowMetrics2);
                                        this.windowMetrics_ = builder.buildPartial();
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

            public static DomainMetrics parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (DomainMetrics) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static DomainMetrics parseFrom(l lVar) throws IOException {
                return (DomainMetrics) h0.parseWithIOException(PARSER, lVar);
            }

            public static DomainMetrics parseFrom(l lVar, w wVar) throws IOException {
                return (DomainMetrics) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface DomainMetricsOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            String getDomain();

            ByteString getDomainBytes();

            WindowMetrics getWindowMetrics();

            WindowMetricsOrBuilder getWindowMetricsOrBuilder();

            boolean hasWindowMetrics();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static ImpressionMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ImpressionMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImpressionMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ImpressionMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ImpressionMetrics)) {
                return super.equals(obj);
            }
            ImpressionMetrics impressionMetrics = (ImpressionMetrics) obj;
            return this.adType_ == impressionMetrics.adType_ && getDomainsList().equals(impressionMetrics.getDomainsList()) && this.unknownFields.equals(impressionMetrics.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public DomainMetrics getDomains(int i10) {
            return this.domains_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public int getDomainsCount() {
            return this.domains_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public List<DomainMetrics> getDomainsList() {
            return this.domains_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public DomainMetricsOrBuilder getDomainsOrBuilder(int i10) {
            return this.domains_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
        public List<? extends DomainMetricsOrBuilder> getDomainsOrBuilderList() {
            return this.domains_;
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
            int iL = this.adType_ != AdType.UNKNOWN.getNumber() ? n.l(1, this.adType_) : 0;
            for (int i11 = 0; i11 < this.domains_.size(); i11++) {
                iL += n.G(2, this.domains_.get(i11));
            }
            int serializedSize = iL + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.adType_;
            if (getDomainsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDomainsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable.d(ImpressionMetrics.class, Builder.class);
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
            return new ImpressionMetrics();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                nVar.v0(1, this.adType_);
            }
            for (int i10 = 0; i10 < this.domains_.size(); i10++) {
                nVar.J0(2, this.domains_.get(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ImpressionMetricsOrBuilder {
            private int adType_;
            private int bitField0_;
            private v1 domainsBuilder_;
            private List<DomainMetrics> domains_;

            private void ensureDomainsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.domains_ = new ArrayList(this.domains_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
            }

            private v1 getDomainsFieldBuilder() {
                if (this.domainsBuilder_ == null) {
                    this.domainsBuilder_ = new v1(this.domains_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.domains_ = null;
                }
                return this.domainsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getDomainsFieldBuilder();
                }
            }

            public Builder addAllDomains(Iterable<? extends DomainMetrics> iterable) {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureDomainsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.domains_);
                onChanged();
                return this;
            }

            public Builder addDomains(DomainMetrics domainMetrics) {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var != null) {
                    v1Var.e(domainMetrics);
                    return this;
                }
                domainMetrics.getClass();
                ensureDomainsIsMutable();
                this.domains_.add(domainMetrics);
                onChanged();
                return this;
            }

            public DomainMetrics.Builder addDomainsBuilder() {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().c(DomainMetrics.getDefaultInstance());
            }

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDomains() {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.domains_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public DomainMetrics getDomains(int i10) {
                v1 v1Var = this.domainsBuilder_;
                return v1Var == null ? this.domains_.get(i10) : (DomainMetrics) v1Var.n(i10);
            }

            public DomainMetrics.Builder getDomainsBuilder(int i10) {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().k(i10);
            }

            public List<DomainMetrics.Builder> getDomainsBuilderList() {
                return getDomainsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public int getDomainsCount() {
                v1 v1Var = this.domainsBuilder_;
                return v1Var == null ? this.domains_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public List<DomainMetrics> getDomainsList() {
                v1 v1Var = this.domainsBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.domains_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public DomainMetricsOrBuilder getDomainsOrBuilder(int i10) {
                v1 v1Var = this.domainsBuilder_;
                return v1Var == null ? this.domains_.get(i10) : (DomainMetricsOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetricsOrBuilder
            public List<? extends DomainMetricsOrBuilder> getDomainsOrBuilderList() {
                v1 v1Var = this.domainsBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.domains_);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable.d(ImpressionMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeDomains(int i10) {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureDomainsIsMutable();
                this.domains_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            public Builder setDomains(int i10, DomainMetrics domainMetrics) {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, domainMetrics);
                    return this;
                }
                domainMetrics.getClass();
                ensureDomainsIsMutable();
                this.domains_.set(i10, domainMetrics);
                onChanged();
                return this;
            }

            private Builder() {
                this.adType_ = 0;
                this.domains_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionMetrics build() {
                ImpressionMetrics impressionMetricsBuildPartial = buildPartial();
                if (impressionMetricsBuildPartial.isInitialized()) {
                    return impressionMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) impressionMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionMetrics buildPartial() {
                ImpressionMetrics impressionMetrics = new ImpressionMetrics(this);
                impressionMetrics.adType_ = this.adType_;
                v1 v1Var = this.domainsBuilder_;
                if (v1Var != null) {
                    impressionMetrics.domains_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.domains_ = DesugarCollections.unmodifiableList(this.domains_);
                        this.bitField0_ &= -2;
                    }
                    impressionMetrics.domains_ = this.domains_;
                }
                onBuilt();
                return impressionMetrics;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public ImpressionMetrics getDefaultInstanceForType() {
                return ImpressionMetrics.getDefaultInstance();
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

            public DomainMetrics.Builder addDomainsBuilder(int i10) {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().b(i10, DomainMetrics.getDefaultInstance());
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
                this.adType_ = 0;
                v1 v1Var = this.domainsBuilder_;
                if (v1Var == null) {
                    this.domains_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                v1Var.g();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.adType_ = 0;
                this.domains_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addDomains(int i10, DomainMetrics domainMetrics) {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var == null) {
                    domainMetrics.getClass();
                    ensureDomainsIsMutable();
                    this.domains_.add(i10, domainMetrics);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, domainMetrics);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ImpressionMetrics) {
                    return mergeFrom((ImpressionMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDomains(int i10, DomainMetrics.Builder builder) {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var == null) {
                    ensureDomainsIsMutable();
                    this.domains_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(ImpressionMetrics impressionMetrics) {
                if (impressionMetrics == ImpressionMetrics.getDefaultInstance()) {
                    return this;
                }
                if (impressionMetrics.adType_ != 0) {
                    setAdTypeValue(impressionMetrics.getAdTypeValue());
                }
                if (this.domainsBuilder_ == null) {
                    if (!impressionMetrics.domains_.isEmpty()) {
                        if (this.domains_.isEmpty()) {
                            this.domains_ = impressionMetrics.domains_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDomainsIsMutable();
                            this.domains_.addAll(impressionMetrics.domains_);
                        }
                        onChanged();
                    }
                } else if (!impressionMetrics.domains_.isEmpty()) {
                    if (!this.domainsBuilder_.t()) {
                        this.domainsBuilder_.a(impressionMetrics.domains_);
                    } else {
                        this.domainsBuilder_.h();
                        this.domainsBuilder_ = null;
                        this.domains_ = impressionMetrics.domains_;
                        this.bitField0_ &= -2;
                        this.domainsBuilder_ = h0.alwaysUseFieldBuilders ? getDomainsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) impressionMetrics).unknownFields);
                onChanged();
                return this;
            }

            public Builder addDomains(DomainMetrics.Builder builder) {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var == null) {
                    ensureDomainsIsMutable();
                    this.domains_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addDomains(int i10, DomainMetrics.Builder builder) {
                v1 v1Var = this.domainsBuilder_;
                if (v1Var == null) {
                    ensureDomainsIsMutable();
                    this.domains_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.access$16400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.ImpressionMetrics.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$ImpressionMetrics$Builder");
            }
        }

        public static Builder newBuilder(ImpressionMetrics impressionMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(impressionMetrics);
        }

        public static ImpressionMetrics parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(byteBuffer, wVar);
        }

        private ImpressionMetrics(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ImpressionMetrics parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (ImpressionMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static ImpressionMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ImpressionMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ImpressionMetrics parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ImpressionMetrics() {
            this.memoizedIsInitialized = (byte) -1;
            this.adType_ = 0;
            this.domains_ = Collections.EMPTY_LIST;
        }

        public static ImpressionMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static ImpressionMetrics parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (ImpressionMetrics) PARSER.parseFrom(bArr, wVar);
        }

        public static ImpressionMetrics parseFrom(InputStream inputStream) throws IOException {
            return (ImpressionMetrics) h0.parseWithIOException(PARSER, inputStream);
        }

        private ImpressionMetrics(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.adType_ = lVar.t();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.domains_ = new ArrayList();
                                    z11 = true;
                                }
                                this.domains_.add((DomainMetrics) lVar.A(DomainMetrics.parser(), wVar));
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
                        this.domains_ = DesugarCollections.unmodifiableList(this.domains_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.domains_ = DesugarCollections.unmodifiableList(this.domains_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static ImpressionMetrics parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (ImpressionMetrics) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static ImpressionMetrics parseFrom(l lVar) throws IOException {
            return (ImpressionMetrics) h0.parseWithIOException(PARSER, lVar);
        }

        public static ImpressionMetrics parseFrom(l lVar, w wVar) throws IOException {
            return (ImpressionMetrics) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ImpressionMetricsOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        ImpressionMetrics.DomainMetrics getDomains(int i10);

        int getDomainsCount();

        List<ImpressionMetrics.DomainMetrics> getDomainsList();

        ImpressionMetrics.DomainMetricsOrBuilder getDomainsOrBuilder(int i10);

        List<? extends ImpressionMetrics.DomainMetricsOrBuilder> getDomainsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class SegmentMetrics extends h0 implements SegmentMetricsOrBuilder {
        public static final int IS_PURCHASER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private boolean isPurchaser_;
        private byte memoizedIsInitialized;
        private static final SegmentMetrics DEFAULT_INSTANCE = new SegmentMetrics();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SegmentMetrics.1
            @Override // com.explorestack.protobuf.p1
            public SegmentMetrics parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new SegmentMetrics(lVar, wVar);
            }
        };

        public static SegmentMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_SegmentMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SegmentMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SegmentMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SegmentMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SegmentMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SegmentMetrics)) {
                return super.equals(obj);
            }
            SegmentMetrics segmentMetrics = (SegmentMetrics) obj;
            return getIsPurchaser() == segmentMetrics.getIsPurchaser() && this.unknownFields.equals(segmentMetrics.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SegmentMetricsOrBuilder
        public boolean getIsPurchaser() {
            return this.isPurchaser_;
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
            boolean z10 = this.isPurchaser_;
            int iE = (z10 ? n.e(1, z10) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iE;
            return iE;
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
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getIsPurchaser())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_SegmentMetrics_fieldAccessorTable.d(SegmentMetrics.class, Builder.class);
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
            return new SegmentMetrics();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            boolean z10 = this.isPurchaser_;
            if (z10) {
                nVar.n0(1, z10);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements SegmentMetricsOrBuilder {
            private boolean isPurchaser_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SegmentMetrics_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearIsPurchaser() {
                this.isPurchaser_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SegmentMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SegmentMetricsOrBuilder
            public boolean getIsPurchaser() {
                return this.isPurchaser_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SegmentMetrics_fieldAccessorTable.d(SegmentMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setIsPurchaser(boolean z10) {
                this.isPurchaser_ = z10;
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
            public SegmentMetrics build() {
                SegmentMetrics segmentMetricsBuildPartial = buildPartial();
                if (segmentMetricsBuildPartial.isInitialized()) {
                    return segmentMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) segmentMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SegmentMetrics buildPartial() {
                SegmentMetrics segmentMetrics = new SegmentMetrics(this);
                segmentMetrics.isPurchaser_ = this.isPurchaser_;
                onBuilt();
                return segmentMetrics;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public SegmentMetrics getDefaultInstanceForType() {
                return SegmentMetrics.getDefaultInstance();
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
                this.isPurchaser_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SegmentMetrics) {
                    return mergeFrom((SegmentMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SegmentMetrics segmentMetrics) {
                if (segmentMetrics == SegmentMetrics.getDefaultInstance()) {
                    return this;
                }
                if (segmentMetrics.getIsPurchaser()) {
                    setIsPurchaser(segmentMetrics.getIsPurchaser());
                }
                mergeUnknownFields(((h0) segmentMetrics).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SegmentMetrics.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SegmentMetrics.access$19000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SegmentMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SegmentMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SegmentMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SegmentMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SegmentMetrics.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SegmentMetrics$Builder");
            }
        }

        public static Builder newBuilder(SegmentMetrics segmentMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(segmentMetrics);
        }

        public static SegmentMetrics parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (SegmentMetrics) PARSER.parseFrom(byteBuffer, wVar);
        }

        private SegmentMetrics(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SegmentMetrics parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (SegmentMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static SegmentMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SegmentMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SegmentMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SegmentMetrics parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (SegmentMetrics) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SegmentMetrics() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SegmentMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SegmentMetrics) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static SegmentMetrics parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (SegmentMetrics) PARSER.parseFrom(bArr, wVar);
        }

        private SegmentMetrics(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                if (iK != 8) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.isPurchaser_ = lVar.q();
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        }
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

        public static SegmentMetrics parseFrom(InputStream inputStream) throws IOException {
            return (SegmentMetrics) h0.parseWithIOException(PARSER, inputStream);
        }

        public static SegmentMetrics parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (SegmentMetrics) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static SegmentMetrics parseFrom(l lVar) throws IOException {
            return (SegmentMetrics) h0.parseWithIOException(PARSER, lVar);
        }

        public static SegmentMetrics parseFrom(l lVar, w wVar) throws IOException {
            return (SegmentMetrics) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface SegmentMetricsOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        boolean getIsPurchaser();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class SessionMetrics extends h0 implements SessionMetricsOrBuilder {
        public static final int AD_REQUESTS_FIELD_NUMBER = 2;
        public static final int CURRENT_SESSION_FIELD_NUMBER = 3;
        public static final int IMPRESSIONS_FIELD_NUMBER = 1;
        public static final int SEGMENT_METRICS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private List<AdRequestMetrics> adRequests_;
        private UserSession currentSession_;
        private List<ImpressionMetrics> impressions_;
        private byte memoizedIsInitialized;
        private SegmentMetrics segmentMetrics_;
        private static final SessionMetrics DEFAULT_INSTANCE = new SessionMetrics();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics.1
            @Override // com.explorestack.protobuf.p1
            public SessionMetrics parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new SessionMetrics(lVar, wVar);
            }
        };

        public static SessionMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionMetrics)) {
                return super.equals(obj);
            }
            SessionMetrics sessionMetrics = (SessionMetrics) obj;
            if (!getImpressionsList().equals(sessionMetrics.getImpressionsList()) || !getAdRequestsList().equals(sessionMetrics.getAdRequestsList()) || hasCurrentSession() != sessionMetrics.hasCurrentSession()) {
                return false;
            }
            if ((!hasCurrentSession() || getCurrentSession().equals(sessionMetrics.getCurrentSession())) && hasSegmentMetrics() == sessionMetrics.hasSegmentMetrics()) {
                return (!hasSegmentMetrics() || getSegmentMetrics().equals(sessionMetrics.getSegmentMetrics())) && this.unknownFields.equals(sessionMetrics.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public AdRequestMetrics getAdRequests(int i10) {
            return this.adRequests_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public int getAdRequestsCount() {
            return this.adRequests_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public List<AdRequestMetrics> getAdRequestsList() {
            return this.adRequests_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10) {
            return this.adRequests_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList() {
            return this.adRequests_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public UserSession getCurrentSession() {
            UserSession userSession = this.currentSession_;
            return userSession == null ? UserSession.getDefaultInstance() : userSession;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public UserSessionOrBuilder getCurrentSessionOrBuilder() {
            return getCurrentSession();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public ImpressionMetrics getImpressions(int i10) {
            return this.impressions_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public int getImpressionsCount() {
            return this.impressions_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public List<ImpressionMetrics> getImpressionsList() {
            return this.impressions_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10) {
            return this.impressions_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList() {
            return this.impressions_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public SegmentMetrics getSegmentMetrics() {
            SegmentMetrics segmentMetrics = this.segmentMetrics_;
            return segmentMetrics == null ? SegmentMetrics.getDefaultInstance() : segmentMetrics;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public SegmentMetricsOrBuilder getSegmentMetricsOrBuilder() {
            return getSegmentMetrics();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.impressions_.size(); i11++) {
                iG += n.G(1, this.impressions_.get(i11));
            }
            for (int i12 = 0; i12 < this.adRequests_.size(); i12++) {
                iG += n.G(2, this.adRequests_.get(i12));
            }
            if (this.currentSession_ != null) {
                iG += n.G(3, getCurrentSession());
            }
            if (this.segmentMetrics_ != null) {
                iG += n.G(4, getSegmentMetrics());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public boolean hasCurrentSession() {
            return this.currentSession_ != null;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
        public boolean hasSegmentMetrics() {
            return this.segmentMetrics_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getImpressionsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getImpressionsList().hashCode();
            }
            if (getAdRequestsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAdRequestsList().hashCode();
            }
            if (hasCurrentSession()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getCurrentSession().hashCode();
            }
            if (hasSegmentMetrics()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSegmentMetrics().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable.d(SessionMetrics.class, Builder.class);
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
            return new SessionMetrics();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            for (int i10 = 0; i10 < this.impressions_.size(); i10++) {
                nVar.J0(1, this.impressions_.get(i10));
            }
            for (int i11 = 0; i11 < this.adRequests_.size(); i11++) {
                nVar.J0(2, this.adRequests_.get(i11));
            }
            if (this.currentSession_ != null) {
                nVar.J0(3, getCurrentSession());
            }
            if (this.segmentMetrics_ != null) {
                nVar.J0(4, getSegmentMetrics());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements SessionMetricsOrBuilder {
            private v1 adRequestsBuilder_;
            private List<AdRequestMetrics> adRequests_;
            private int bitField0_;
            private a2 currentSessionBuilder_;
            private UserSession currentSession_;
            private v1 impressionsBuilder_;
            private List<ImpressionMetrics> impressions_;
            private a2 segmentMetricsBuilder_;
            private SegmentMetrics segmentMetrics_;

            private void ensureAdRequestsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.adRequests_ = new ArrayList(this.adRequests_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureImpressionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.impressions_ = new ArrayList(this.impressions_);
                    this.bitField0_ |= 1;
                }
            }

            private v1 getAdRequestsFieldBuilder() {
                if (this.adRequestsBuilder_ == null) {
                    this.adRequestsBuilder_ = new v1(this.adRequests_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.adRequests_ = null;
                }
                return this.adRequestsBuilder_;
            }

            private a2 getCurrentSessionFieldBuilder() {
                if (this.currentSessionBuilder_ == null) {
                    this.currentSessionBuilder_ = new a2(getCurrentSession(), getParentForChildren(), isClean());
                    this.currentSession_ = null;
                }
                return this.currentSessionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_descriptor;
            }

            private v1 getImpressionsFieldBuilder() {
                if (this.impressionsBuilder_ == null) {
                    this.impressionsBuilder_ = new v1(this.impressions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.impressions_ = null;
                }
                return this.impressionsBuilder_;
            }

            private a2 getSegmentMetricsFieldBuilder() {
                if (this.segmentMetricsBuilder_ == null) {
                    this.segmentMetricsBuilder_ = new a2(getSegmentMetrics(), getParentForChildren(), isClean());
                    this.segmentMetrics_ = null;
                }
                return this.segmentMetricsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getImpressionsFieldBuilder();
                    getAdRequestsFieldBuilder();
                }
            }

            public Builder addAdRequests(AdRequestMetrics adRequestMetrics) {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var != null) {
                    v1Var.e(adRequestMetrics);
                    return this;
                }
                adRequestMetrics.getClass();
                ensureAdRequestsIsMutable();
                this.adRequests_.add(adRequestMetrics);
                onChanged();
                return this;
            }

            public AdRequestMetrics.Builder addAdRequestsBuilder() {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().c(AdRequestMetrics.getDefaultInstance());
            }

            public Builder addAllAdRequests(Iterable<? extends AdRequestMetrics> iterable) {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureAdRequestsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.adRequests_);
                onChanged();
                return this;
            }

            public Builder addAllImpressions(Iterable<? extends ImpressionMetrics> iterable) {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureImpressionsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.impressions_);
                onChanged();
                return this;
            }

            public Builder addImpressions(ImpressionMetrics impressionMetrics) {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var != null) {
                    v1Var.e(impressionMetrics);
                    return this;
                }
                impressionMetrics.getClass();
                ensureImpressionsIsMutable();
                this.impressions_.add(impressionMetrics);
                onChanged();
                return this;
            }

            public ImpressionMetrics.Builder addImpressionsBuilder() {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().c(ImpressionMetrics.getDefaultInstance());
            }

            public Builder clearAdRequests() {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.adRequests_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearCurrentSession() {
                if (this.currentSessionBuilder_ == null) {
                    this.currentSession_ = null;
                    onChanged();
                    return this;
                }
                this.currentSession_ = null;
                this.currentSessionBuilder_ = null;
                return this;
            }

            public Builder clearImpressions() {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.impressions_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSegmentMetrics() {
                if (this.segmentMetricsBuilder_ == null) {
                    this.segmentMetrics_ = null;
                    onChanged();
                    return this;
                }
                this.segmentMetrics_ = null;
                this.segmentMetricsBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public AdRequestMetrics getAdRequests(int i10) {
                v1 v1Var = this.adRequestsBuilder_;
                return v1Var == null ? this.adRequests_.get(i10) : (AdRequestMetrics) v1Var.n(i10);
            }

            public AdRequestMetrics.Builder getAdRequestsBuilder(int i10) {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().k(i10);
            }

            public List<AdRequestMetrics.Builder> getAdRequestsBuilderList() {
                return getAdRequestsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public int getAdRequestsCount() {
                v1 v1Var = this.adRequestsBuilder_;
                return v1Var == null ? this.adRequests_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public List<AdRequestMetrics> getAdRequestsList() {
                v1 v1Var = this.adRequestsBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.adRequests_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10) {
                v1 v1Var = this.adRequestsBuilder_;
                return v1Var == null ? this.adRequests_.get(i10) : (AdRequestMetricsOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList() {
                v1 v1Var = this.adRequestsBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.adRequests_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public UserSession getCurrentSession() {
                a2 a2Var = this.currentSessionBuilder_;
                if (a2Var != null) {
                    return (UserSession) a2Var.e();
                }
                UserSession userSession = this.currentSession_;
                return userSession == null ? UserSession.getDefaultInstance() : userSession;
            }

            public UserSession.Builder getCurrentSessionBuilder() {
                onChanged();
                return (UserSession.Builder) getCurrentSessionFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public UserSessionOrBuilder getCurrentSessionOrBuilder() {
                a2 a2Var = this.currentSessionBuilder_;
                if (a2Var != null) {
                    return (UserSessionOrBuilder) a2Var.f();
                }
                UserSession userSession = this.currentSession_;
                return userSession == null ? UserSession.getDefaultInstance() : userSession;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public ImpressionMetrics getImpressions(int i10) {
                v1 v1Var = this.impressionsBuilder_;
                return v1Var == null ? this.impressions_.get(i10) : (ImpressionMetrics) v1Var.n(i10);
            }

            public ImpressionMetrics.Builder getImpressionsBuilder(int i10) {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().k(i10);
            }

            public List<ImpressionMetrics.Builder> getImpressionsBuilderList() {
                return getImpressionsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public int getImpressionsCount() {
                v1 v1Var = this.impressionsBuilder_;
                return v1Var == null ? this.impressions_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public List<ImpressionMetrics> getImpressionsList() {
                v1 v1Var = this.impressionsBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.impressions_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10) {
                v1 v1Var = this.impressionsBuilder_;
                return v1Var == null ? this.impressions_.get(i10) : (ImpressionMetricsOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList() {
                v1 v1Var = this.impressionsBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.impressions_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public SegmentMetrics getSegmentMetrics() {
                a2 a2Var = this.segmentMetricsBuilder_;
                if (a2Var != null) {
                    return (SegmentMetrics) a2Var.e();
                }
                SegmentMetrics segmentMetrics = this.segmentMetrics_;
                return segmentMetrics == null ? SegmentMetrics.getDefaultInstance() : segmentMetrics;
            }

            public SegmentMetrics.Builder getSegmentMetricsBuilder() {
                onChanged();
                return (SegmentMetrics.Builder) getSegmentMetricsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public SegmentMetricsOrBuilder getSegmentMetricsOrBuilder() {
                a2 a2Var = this.segmentMetricsBuilder_;
                if (a2Var != null) {
                    return (SegmentMetricsOrBuilder) a2Var.f();
                }
                SegmentMetrics segmentMetrics = this.segmentMetrics_;
                return segmentMetrics == null ? SegmentMetrics.getDefaultInstance() : segmentMetrics;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public boolean hasCurrentSession() {
                return (this.currentSessionBuilder_ == null && this.currentSession_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetricsOrBuilder
            public boolean hasSegmentMetrics() {
                return (this.segmentMetricsBuilder_ == null && this.segmentMetrics_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable.d(SessionMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCurrentSession(UserSession userSession) {
                a2 a2Var = this.currentSessionBuilder_;
                if (a2Var != null) {
                    a2Var.g(userSession);
                    return this;
                }
                UserSession userSession2 = this.currentSession_;
                if (userSession2 != null) {
                    this.currentSession_ = UserSession.newBuilder(userSession2).mergeFrom(userSession).buildPartial();
                } else {
                    this.currentSession_ = userSession;
                }
                onChanged();
                return this;
            }

            public Builder mergeSegmentMetrics(SegmentMetrics segmentMetrics) {
                a2 a2Var = this.segmentMetricsBuilder_;
                if (a2Var != null) {
                    a2Var.g(segmentMetrics);
                    return this;
                }
                SegmentMetrics segmentMetrics2 = this.segmentMetrics_;
                if (segmentMetrics2 != null) {
                    this.segmentMetrics_ = SegmentMetrics.newBuilder(segmentMetrics2).mergeFrom(segmentMetrics).buildPartial();
                } else {
                    this.segmentMetrics_ = segmentMetrics;
                }
                onChanged();
                return this;
            }

            public Builder removeAdRequests(int i10) {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureAdRequestsIsMutable();
                this.adRequests_.remove(i10);
                onChanged();
                return this;
            }

            public Builder removeImpressions(int i10) {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureImpressionsIsMutable();
                this.impressions_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAdRequests(int i10, AdRequestMetrics adRequestMetrics) {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, adRequestMetrics);
                    return this;
                }
                adRequestMetrics.getClass();
                ensureAdRequestsIsMutable();
                this.adRequests_.set(i10, adRequestMetrics);
                onChanged();
                return this;
            }

            public Builder setCurrentSession(UserSession userSession) {
                a2 a2Var = this.currentSessionBuilder_;
                if (a2Var != null) {
                    a2Var.i(userSession);
                    return this;
                }
                userSession.getClass();
                this.currentSession_ = userSession;
                onChanged();
                return this;
            }

            public Builder setImpressions(int i10, ImpressionMetrics impressionMetrics) {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, impressionMetrics);
                    return this;
                }
                impressionMetrics.getClass();
                ensureImpressionsIsMutable();
                this.impressions_.set(i10, impressionMetrics);
                onChanged();
                return this;
            }

            public Builder setSegmentMetrics(SegmentMetrics segmentMetrics) {
                a2 a2Var = this.segmentMetricsBuilder_;
                if (a2Var != null) {
                    a2Var.i(segmentMetrics);
                    return this;
                }
                segmentMetrics.getClass();
                this.segmentMetrics_ = segmentMetrics;
                onChanged();
                return this;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.impressions_ = list;
                this.adRequests_ = list;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionMetrics build() {
                SessionMetrics sessionMetricsBuildPartial = buildPartial();
                if (sessionMetricsBuildPartial.isInitialized()) {
                    return sessionMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionMetrics buildPartial() {
                SessionMetrics sessionMetrics = new SessionMetrics(this);
                int i10 = this.bitField0_;
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.impressions_ = DesugarCollections.unmodifiableList(this.impressions_);
                        this.bitField0_ &= -2;
                    }
                    sessionMetrics.impressions_ = this.impressions_;
                } else {
                    sessionMetrics.impressions_ = v1Var.f();
                }
                v1 v1Var2 = this.adRequestsBuilder_;
                if (v1Var2 != null) {
                    sessionMetrics.adRequests_ = v1Var2.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.adRequests_ = DesugarCollections.unmodifiableList(this.adRequests_);
                        this.bitField0_ &= -3;
                    }
                    sessionMetrics.adRequests_ = this.adRequests_;
                }
                a2 a2Var = this.currentSessionBuilder_;
                if (a2Var == null) {
                    sessionMetrics.currentSession_ = this.currentSession_;
                } else {
                    sessionMetrics.currentSession_ = (UserSession) a2Var.a();
                }
                a2 a2Var2 = this.segmentMetricsBuilder_;
                if (a2Var2 == null) {
                    sessionMetrics.segmentMetrics_ = this.segmentMetrics_;
                } else {
                    sessionMetrics.segmentMetrics_ = (SegmentMetrics) a2Var2.a();
                }
                onBuilt();
                return sessionMetrics;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public SessionMetrics getDefaultInstanceForType() {
                return SessionMetrics.getDefaultInstance();
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

            public AdRequestMetrics.Builder addAdRequestsBuilder(int i10) {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().b(i10, AdRequestMetrics.getDefaultInstance());
            }

            public ImpressionMetrics.Builder addImpressionsBuilder(int i10) {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().b(i10, ImpressionMetrics.getDefaultInstance());
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
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var == null) {
                    this.impressions_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    v1Var.g();
                }
                v1 v1Var2 = this.adRequestsBuilder_;
                if (v1Var2 == null) {
                    this.adRequests_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                } else {
                    v1Var2.g();
                }
                if (this.currentSessionBuilder_ == null) {
                    this.currentSession_ = null;
                } else {
                    this.currentSession_ = null;
                    this.currentSessionBuilder_ = null;
                }
                if (this.segmentMetricsBuilder_ == null) {
                    this.segmentMetrics_ = null;
                    return this;
                }
                this.segmentMetrics_ = null;
                this.segmentMetricsBuilder_ = null;
                return this;
            }

            public Builder setCurrentSession(UserSession.Builder builder) {
                a2 a2Var = this.currentSessionBuilder_;
                if (a2Var == null) {
                    this.currentSession_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setSegmentMetrics(SegmentMetrics.Builder builder) {
                a2 a2Var = this.segmentMetricsBuilder_;
                if (a2Var == null) {
                    this.segmentMetrics_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                List list = Collections.EMPTY_LIST;
                this.impressions_ = list;
                this.adRequests_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addAdRequests(int i10, AdRequestMetrics adRequestMetrics) {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var == null) {
                    adRequestMetrics.getClass();
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(i10, adRequestMetrics);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, adRequestMetrics);
                return this;
            }

            public Builder addImpressions(int i10, ImpressionMetrics impressionMetrics) {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var == null) {
                    impressionMetrics.getClass();
                    ensureImpressionsIsMutable();
                    this.impressions_.add(i10, impressionMetrics);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, impressionMetrics);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionMetrics) {
                    return mergeFrom((SessionMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAdRequests(int i10, AdRequestMetrics.Builder builder) {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder setImpressions(int i10, ImpressionMetrics.Builder builder) {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(SessionMetrics sessionMetrics) {
                if (sessionMetrics == SessionMetrics.getDefaultInstance()) {
                    return this;
                }
                if (this.impressionsBuilder_ == null) {
                    if (!sessionMetrics.impressions_.isEmpty()) {
                        if (this.impressions_.isEmpty()) {
                            this.impressions_ = sessionMetrics.impressions_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureImpressionsIsMutable();
                            this.impressions_.addAll(sessionMetrics.impressions_);
                        }
                        onChanged();
                    }
                } else if (!sessionMetrics.impressions_.isEmpty()) {
                    if (!this.impressionsBuilder_.t()) {
                        this.impressionsBuilder_.a(sessionMetrics.impressions_);
                    } else {
                        this.impressionsBuilder_.h();
                        this.impressionsBuilder_ = null;
                        this.impressions_ = sessionMetrics.impressions_;
                        this.bitField0_ &= -2;
                        this.impressionsBuilder_ = h0.alwaysUseFieldBuilders ? getImpressionsFieldBuilder() : null;
                    }
                }
                if (this.adRequestsBuilder_ == null) {
                    if (!sessionMetrics.adRequests_.isEmpty()) {
                        if (this.adRequests_.isEmpty()) {
                            this.adRequests_ = sessionMetrics.adRequests_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureAdRequestsIsMutable();
                            this.adRequests_.addAll(sessionMetrics.adRequests_);
                        }
                        onChanged();
                    }
                } else if (!sessionMetrics.adRequests_.isEmpty()) {
                    if (!this.adRequestsBuilder_.t()) {
                        this.adRequestsBuilder_.a(sessionMetrics.adRequests_);
                    } else {
                        this.adRequestsBuilder_.h();
                        this.adRequestsBuilder_ = null;
                        this.adRequests_ = sessionMetrics.adRequests_;
                        this.bitField0_ &= -3;
                        this.adRequestsBuilder_ = h0.alwaysUseFieldBuilders ? getAdRequestsFieldBuilder() : null;
                    }
                }
                if (sessionMetrics.hasCurrentSession()) {
                    mergeCurrentSession(sessionMetrics.getCurrentSession());
                }
                if (sessionMetrics.hasSegmentMetrics()) {
                    mergeSegmentMetrics(sessionMetrics.getSegmentMetrics());
                }
                mergeUnknownFields(((h0) sessionMetrics).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdRequests(AdRequestMetrics.Builder builder) {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addImpressions(ImpressionMetrics.Builder builder) {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addAdRequests(int i10, AdRequestMetrics.Builder builder) {
                v1 v1Var = this.adRequestsBuilder_;
                if (v1Var == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.d(i10, builder.build());
                return this;
            }

            public Builder addImpressions(int i10, ImpressionMetrics.Builder builder) {
                v1 v1Var = this.impressionsBuilder_;
                if (v1Var == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics.access$20500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SessionMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SessionMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.SessionMetrics.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$SessionMetrics$Builder");
            }
        }

        public static Builder newBuilder(SessionMetrics sessionMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionMetrics);
        }

        public static SessionMetrics parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(byteBuffer, wVar);
        }

        private SessionMetrics(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionMetrics parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (SessionMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static SessionMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SessionMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SessionMetrics parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SessionMetrics() {
            this.memoizedIsInitialized = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.impressions_ = list;
            this.adRequests_ = list;
        }

        public static SessionMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static SessionMetrics parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (SessionMetrics) PARSER.parseFrom(bArr, wVar);
        }

        public static SessionMetrics parseFrom(InputStream inputStream) throws IOException {
            return (SessionMetrics) h0.parseWithIOException(PARSER, inputStream);
        }

        private SessionMetrics(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.impressions_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.impressions_.add((ImpressionMetrics) lVar.A(ImpressionMetrics.parser(), wVar));
                            } else if (iK != 18) {
                                if (iK == 26) {
                                    UserSession userSession = this.currentSession_;
                                    UserSession.Builder builder = userSession != null ? userSession.toBuilder() : null;
                                    UserSession userSession2 = (UserSession) lVar.A(UserSession.parser(), wVar);
                                    this.currentSession_ = userSession2;
                                    if (builder != null) {
                                        builder.mergeFrom(userSession2);
                                        this.currentSession_ = builder.buildPartial();
                                    }
                                } else if (iK != 34) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    SegmentMetrics segmentMetrics = this.segmentMetrics_;
                                    SegmentMetrics.Builder builder2 = segmentMetrics != null ? segmentMetrics.toBuilder() : null;
                                    SegmentMetrics segmentMetrics2 = (SegmentMetrics) lVar.A(SegmentMetrics.parser(), wVar);
                                    this.segmentMetrics_ = segmentMetrics2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(segmentMetrics2);
                                        this.segmentMetrics_ = builder2.buildPartial();
                                    }
                                }
                            } else {
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.adRequests_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.adRequests_.add((AdRequestMetrics) lVar.A(AdRequestMetrics.parser(), wVar));
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
                        this.impressions_ = DesugarCollections.unmodifiableList(this.impressions_);
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.adRequests_ = DesugarCollections.unmodifiableList(this.adRequests_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.impressions_ = DesugarCollections.unmodifiableList(this.impressions_);
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.adRequests_ = DesugarCollections.unmodifiableList(this.adRequests_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static SessionMetrics parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (SessionMetrics) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static SessionMetrics parseFrom(l lVar) throws IOException {
            return (SessionMetrics) h0.parseWithIOException(PARSER, lVar);
        }

        public static SessionMetrics parseFrom(l lVar, w wVar) throws IOException {
            return (SessionMetrics) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface SessionMetricsOrBuilder extends MessageOrBuilder {
        AdRequestMetrics getAdRequests(int i10);

        int getAdRequestsCount();

        List<AdRequestMetrics> getAdRequestsList();

        AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10);

        List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList();

        UserSession getCurrentSession();

        UserSessionOrBuilder getCurrentSessionOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        ImpressionMetrics getImpressions(int i10);

        int getImpressionsCount();

        List<ImpressionMetrics> getImpressionsList();

        ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10);

        List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList();

        SegmentMetrics getSegmentMetrics();

        SegmentMetricsOrBuilder getSegmentMetricsOrBuilder();

        boolean hasCurrentSession();

        boolean hasSegmentMetrics();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Timestamps extends h0 implements TimestampsOrBuilder {
        public static final int DAY_BUCKETS_FIELD_NUMBER = 3;
        public static final int DELTAS_FIELD_NUMBER = 2;
        public static final int LAST_TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<DayBucket> dayBuckets_;
        private int deltasMemoizedSerializedSize;
        private j0.g deltas_;
        private long lastTimestamp_;
        private byte memoizedIsInitialized;
        private static final Timestamps DEFAULT_INSTANCE = new Timestamps();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.1
            @Override // com.explorestack.protobuf.p1
            public Timestamps parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Timestamps(lVar, wVar);
            }
        };

        public static final class DayBucket extends h0 implements DayBucketOrBuilder {
            public static final int COUNT_FIELD_NUMBER = 2;
            private static final DayBucket DEFAULT_INSTANCE = new DayBucket();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket.1
                @Override // com.explorestack.protobuf.p1
                public DayBucket parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new DayBucket(lVar, wVar);
                }
            };
            public static final int START_TIME_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int count_;
            private byte memoizedIsInitialized;
            private long startTime_;

            public static DayBucket getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DayBucket parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DayBucket) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DayBucket parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DayBucket)) {
                    return super.equals(obj);
                }
                DayBucket dayBucket = (DayBucket) obj;
                return getStartTime() == dayBucket.getStartTime() && getCount() == dayBucket.getCount() && this.unknownFields.equals(dayBucket.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucketOrBuilder
            public int getCount() {
                return this.count_;
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
                long j10 = this.startTime_;
                int iZ = j10 != 0 ? n.z(1, j10) : 0;
                int i11 = this.count_;
                if (i11 != 0) {
                    iZ += n.x(2, i11);
                }
                int serializedSize = iZ + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucketOrBuilder
            public long getStartTime() {
                return this.startTime_;
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
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(getStartTime())) * 37) + 2) * 53) + getCount()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable.d(DayBucket.class, Builder.class);
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
                return new DayBucket();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                long j10 = this.startTime_;
                if (j10 != 0) {
                    nVar.H0(1, j10);
                }
                int i10 = this.count_;
                if (i10 != 0) {
                    nVar.F0(2, i10);
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements DayBucketOrBuilder {
                private int count_;
                private long startTime_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearCount() {
                    this.count_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearStartTime() {
                    this.startTime_ = 0L;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucketOrBuilder
                public int getCount() {
                    return this.count_;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucketOrBuilder
                public long getStartTime() {
                    return this.startTime_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable.d(DayBucket.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setCount(int i10) {
                    this.count_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setStartTime(long j10) {
                    this.startTime_ = j10;
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
                public DayBucket build() {
                    DayBucket dayBucketBuildPartial = buildPartial();
                    if (dayBucketBuildPartial.isInitialized()) {
                        return dayBucketBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) dayBucketBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DayBucket buildPartial() {
                    DayBucket dayBucket = new DayBucket(this);
                    dayBucket.startTime_ = this.startTime_;
                    dayBucket.count_ = this.count_;
                    onBuilt();
                    return dayBucket;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public DayBucket getDefaultInstanceForType() {
                    return DayBucket.getDefaultInstance();
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
                    this.startTime_ = 0L;
                    this.count_ = 0;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof DayBucket) {
                        return mergeFrom((DayBucket) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(DayBucket dayBucket) {
                    if (dayBucket == DayBucket.getDefaultInstance()) {
                        return this;
                    }
                    if (dayBucket.getStartTime() != 0) {
                        setStartTime(dayBucket.getStartTime());
                    }
                    if (dayBucket.getCount() != 0) {
                        setCount(dayBucket.getCount());
                    }
                    mergeUnknownFields(((h0) dayBucket).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps$DayBucket r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps$DayBucket r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.DayBucket.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps$DayBucket$Builder");
                }
            }

            public static Builder newBuilder(DayBucket dayBucket) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(dayBucket);
            }

            public static DayBucket parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(byteBuffer, wVar);
            }

            private DayBucket(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DayBucket parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (DayBucket) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static DayBucket parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public DayBucket getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static DayBucket parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DayBucket() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DayBucket parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static DayBucket parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (DayBucket) PARSER.parseFrom(bArr, wVar);
            }

            private DayBucket(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.startTime_ = lVar.z();
                                } else if (iK != 16) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.count_ = lVar.y();
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

            public static DayBucket parseFrom(InputStream inputStream) throws IOException {
                return (DayBucket) h0.parseWithIOException(PARSER, inputStream);
            }

            public static DayBucket parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (DayBucket) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static DayBucket parseFrom(l lVar) throws IOException {
                return (DayBucket) h0.parseWithIOException(PARSER, lVar);
            }

            public static DayBucket parseFrom(l lVar, w wVar) throws IOException {
                return (DayBucket) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface DayBucketOrBuilder extends MessageOrBuilder {
            int getCount();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            long getStartTime();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Timestamps) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Timestamps)) {
                return super.equals(obj);
            }
            Timestamps timestamps = (Timestamps) obj;
            return getLastTimestamp() == timestamps.getLastTimestamp() && getDeltasList().equals(timestamps.getDeltasList()) && getDayBucketsList().equals(timestamps.getDayBucketsList()) && this.unknownFields.equals(timestamps.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public DayBucket getDayBuckets(int i10) {
            return this.dayBuckets_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public int getDayBucketsCount() {
            return this.dayBuckets_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public List<DayBucket> getDayBucketsList() {
            return this.dayBuckets_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public DayBucketOrBuilder getDayBucketsOrBuilder(int i10) {
            return this.dayBuckets_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public List<? extends DayBucketOrBuilder> getDayBucketsOrBuilderList() {
            return this.dayBuckets_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public int getDeltas(int i10) {
            return this.deltas_.getInt(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public int getDeltasCount() {
            return this.deltas_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public List<Integer> getDeltasList() {
            return this.deltas_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
        public long getLastTimestamp() {
            return this.lastTimestamp_;
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
            long j10 = this.lastTimestamp_;
            int iZ = j10 != 0 ? n.z(1, j10) : 0;
            int iZ2 = 0;
            for (int i11 = 0; i11 < this.deltas_.size(); i11++) {
                iZ2 += n.Z(this.deltas_.getInt(i11));
            }
            int iG = iZ + iZ2;
            if (!getDeltasList().isEmpty()) {
                iG = iG + 1 + n.y(iZ2);
            }
            this.deltasMemoizedSerializedSize = iZ2;
            for (int i12 = 0; i12 < this.dayBuckets_.size(); i12++) {
                iG += n.G(3, this.dayBuckets_.get(i12));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(getLastTimestamp());
            if (getDeltasCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDeltasList().hashCode();
            }
            if (getDayBucketsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDayBucketsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_fieldAccessorTable.d(Timestamps.class, Builder.class);
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
            return new Timestamps();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            long j10 = this.lastTimestamp_;
            if (j10 != 0) {
                nVar.H0(1, j10);
            }
            if (getDeltasList().size() > 0) {
                nVar.X0(18);
                nVar.X0(this.deltasMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.deltas_.size(); i10++) {
                nVar.X0(this.deltas_.getInt(i10));
            }
            for (int i11 = 0; i11 < this.dayBuckets_.size(); i11++) {
                nVar.J0(3, this.dayBuckets_.get(i11));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements TimestampsOrBuilder {
            private int bitField0_;
            private v1 dayBucketsBuilder_;
            private List<DayBucket> dayBuckets_;
            private j0.g deltas_;
            private long lastTimestamp_;

            private void ensureDayBucketsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.dayBuckets_ = new ArrayList(this.dayBuckets_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureDeltasIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.deltas_ = h0.mutableCopy(this.deltas_);
                    this.bitField0_ |= 1;
                }
            }

            private v1 getDayBucketsFieldBuilder() {
                if (this.dayBucketsBuilder_ == null) {
                    this.dayBucketsBuilder_ = new v1(this.dayBuckets_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.dayBuckets_ = null;
                }
                return this.dayBucketsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getDayBucketsFieldBuilder();
                }
            }

            public Builder addAllDayBuckets(Iterable<? extends DayBucket> iterable) {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureDayBucketsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.dayBuckets_);
                onChanged();
                return this;
            }

            public Builder addAllDeltas(Iterable<? extends Integer> iterable) {
                ensureDeltasIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.deltas_);
                onChanged();
                return this;
            }

            public Builder addDayBuckets(DayBucket dayBucket) {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var != null) {
                    v1Var.e(dayBucket);
                    return this;
                }
                dayBucket.getClass();
                ensureDayBucketsIsMutable();
                this.dayBuckets_.add(dayBucket);
                onChanged();
                return this;
            }

            public DayBucket.Builder addDayBucketsBuilder() {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().c(DayBucket.getDefaultInstance());
            }

            public Builder addDeltas(int i10) {
                ensureDeltasIsMutable();
                this.deltas_.addInt(i10);
                onChanged();
                return this;
            }

            public Builder clearDayBuckets() {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.dayBuckets_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearDeltas() {
                this.deltas_ = h0.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearLastTimestamp() {
                this.lastTimestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public DayBucket getDayBuckets(int i10) {
                v1 v1Var = this.dayBucketsBuilder_;
                return v1Var == null ? this.dayBuckets_.get(i10) : (DayBucket) v1Var.n(i10);
            }

            public DayBucket.Builder getDayBucketsBuilder(int i10) {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().k(i10);
            }

            public List<DayBucket.Builder> getDayBucketsBuilderList() {
                return getDayBucketsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public int getDayBucketsCount() {
                v1 v1Var = this.dayBucketsBuilder_;
                return v1Var == null ? this.dayBuckets_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public List<DayBucket> getDayBucketsList() {
                v1 v1Var = this.dayBucketsBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.dayBuckets_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public DayBucketOrBuilder getDayBucketsOrBuilder(int i10) {
                v1 v1Var = this.dayBucketsBuilder_;
                return v1Var == null ? this.dayBuckets_.get(i10) : (DayBucketOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public List<? extends DayBucketOrBuilder> getDayBucketsOrBuilderList() {
                v1 v1Var = this.dayBucketsBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.dayBuckets_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public int getDeltas(int i10) {
                return this.deltas_.getInt(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public int getDeltasCount() {
                return this.deltas_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public List<Integer> getDeltasList() {
                return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.deltas_) : this.deltas_;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.TimestampsOrBuilder
            public long getLastTimestamp() {
                return this.lastTimestamp_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_Timestamps_fieldAccessorTable.d(Timestamps.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeDayBuckets(int i10) {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureDayBucketsIsMutable();
                this.dayBuckets_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setDayBuckets(int i10, DayBucket dayBucket) {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, dayBucket);
                    return this;
                }
                dayBucket.getClass();
                ensureDayBucketsIsMutable();
                this.dayBuckets_.set(i10, dayBucket);
                onChanged();
                return this;
            }

            public Builder setDeltas(int i10, int i11) {
                ensureDeltasIsMutable();
                this.deltas_.setInt(i10, i11);
                onChanged();
                return this;
            }

            public Builder setLastTimestamp(long j10) {
                this.lastTimestamp_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.deltas_ = h0.emptyIntList();
                this.dayBuckets_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Timestamps build() {
                Timestamps timestampsBuildPartial = buildPartial();
                if (timestampsBuildPartial.isInitialized()) {
                    return timestampsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) timestampsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Timestamps buildPartial() {
                Timestamps timestamps = new Timestamps(this);
                timestamps.lastTimestamp_ = this.lastTimestamp_;
                if ((this.bitField0_ & 1) != 0) {
                    this.deltas_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                timestamps.deltas_ = this.deltas_;
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var != null) {
                    timestamps.dayBuckets_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.dayBuckets_ = DesugarCollections.unmodifiableList(this.dayBuckets_);
                        this.bitField0_ &= -3;
                    }
                    timestamps.dayBuckets_ = this.dayBuckets_;
                }
                onBuilt();
                return timestamps;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Timestamps getDefaultInstanceForType() {
                return Timestamps.getDefaultInstance();
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

            public DayBucket.Builder addDayBucketsBuilder(int i10) {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().b(i10, DayBucket.getDefaultInstance());
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
                this.lastTimestamp_ = 0L;
                this.deltas_ = h0.emptyIntList();
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var == null) {
                    this.dayBuckets_ = Collections.EMPTY_LIST;
                    this.bitField0_ = i10 & (-4);
                    return this;
                }
                v1Var.g();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.deltas_ = h0.emptyIntList();
                this.dayBuckets_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addDayBuckets(int i10, DayBucket dayBucket) {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var == null) {
                    dayBucket.getClass();
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(i10, dayBucket);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, dayBucket);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Timestamps) {
                    return mergeFrom((Timestamps) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDayBuckets(int i10, DayBucket.Builder builder) {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Timestamps timestamps) {
                if (timestamps == Timestamps.getDefaultInstance()) {
                    return this;
                }
                if (timestamps.getLastTimestamp() != 0) {
                    setLastTimestamp(timestamps.getLastTimestamp());
                }
                if (!timestamps.deltas_.isEmpty()) {
                    if (this.deltas_.isEmpty()) {
                        this.deltas_ = timestamps.deltas_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureDeltasIsMutable();
                        this.deltas_.addAll(timestamps.deltas_);
                    }
                    onChanged();
                }
                if (this.dayBucketsBuilder_ == null) {
                    if (!timestamps.dayBuckets_.isEmpty()) {
                        if (this.dayBuckets_.isEmpty()) {
                            this.dayBuckets_ = timestamps.dayBuckets_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureDayBucketsIsMutable();
                            this.dayBuckets_.addAll(timestamps.dayBuckets_);
                        }
                        onChanged();
                    }
                } else if (!timestamps.dayBuckets_.isEmpty()) {
                    if (!this.dayBucketsBuilder_.t()) {
                        this.dayBucketsBuilder_.a(timestamps.dayBuckets_);
                    } else {
                        this.dayBucketsBuilder_.h();
                        this.dayBucketsBuilder_ = null;
                        this.dayBuckets_ = timestamps.dayBuckets_;
                        this.bitField0_ &= -3;
                        this.dayBucketsBuilder_ = h0.alwaysUseFieldBuilders ? getDayBucketsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) timestamps).unknownFields);
                onChanged();
                return this;
            }

            public Builder addDayBuckets(DayBucket.Builder builder) {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addDayBuckets(int i10, DayBucket.Builder builder) {
                v1 v1Var = this.dayBucketsBuilder_;
                if (v1Var == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.access$11300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.Timestamps.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$Timestamps$Builder");
            }
        }

        public static Builder newBuilder(Timestamps timestamps) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timestamps);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Timestamps(h0.b bVar) {
            super(bVar);
            this.deltasMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Timestamps) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Timestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Timestamps getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Timestamps parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Timestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        private Timestamps() {
            this.deltasMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.deltas_ = h0.emptyIntList();
            this.dayBuckets_ = Collections.EMPTY_LIST;
        }

        public static Timestamps parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Timestamps) PARSER.parseFrom(bArr, wVar);
        }

        public static Timestamps parseFrom(InputStream inputStream) throws IOException {
            return (Timestamps) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Timestamps parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Timestamps) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        private Timestamps(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.lastTimestamp_ = lVar.z();
                            } else if (iK == 16) {
                                if ((i10 & 1) == 0) {
                                    this.deltas_ = h0.newIntList();
                                    i10 |= 1;
                                }
                                this.deltas_.addInt(lVar.L());
                            } else if (iK == 18) {
                                int iP = lVar.p(lVar.C());
                                if ((i10 & 1) == 0 && lVar.d() > 0) {
                                    this.deltas_ = h0.newIntList();
                                    i10 |= 1;
                                }
                                while (lVar.d() > 0) {
                                    this.deltas_.addInt(lVar.L());
                                }
                                lVar.o(iP);
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.dayBuckets_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.dayBuckets_.add((DayBucket) lVar.A(DayBucket.parser(), wVar));
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
                        this.deltas_.makeImmutable();
                    }
                    if ((i10 & 2) != 0) {
                        this.dayBuckets_ = DesugarCollections.unmodifiableList(this.dayBuckets_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.deltas_.makeImmutable();
            }
            if ((i10 & 2) != 0) {
                this.dayBuckets_ = DesugarCollections.unmodifiableList(this.dayBuckets_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Timestamps parseFrom(l lVar) throws IOException {
            return (Timestamps) h0.parseWithIOException(PARSER, lVar);
        }

        public static Timestamps parseFrom(l lVar, w wVar) throws IOException {
            return (Timestamps) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface TimestampsOrBuilder extends MessageOrBuilder {
        Timestamps.DayBucket getDayBuckets(int i10);

        int getDayBucketsCount();

        List<Timestamps.DayBucket> getDayBucketsList();

        Timestamps.DayBucketOrBuilder getDayBucketsOrBuilder(int i10);

        List<? extends Timestamps.DayBucketOrBuilder> getDayBucketsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        int getDeltas(int i10);

        int getDeltasCount();

        List<Integer> getDeltasList();

        long getLastTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserIdQuery extends h0 implements UserIdQueryOrBuilder {
        private static final UserIdQuery DEFAULT_INSTANCE = new UserIdQuery();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery.1
            @Override // com.explorestack.protobuf.p1
            public UserIdQuery parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new UserIdQuery(lVar, wVar);
            }
        };
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long timestamp_;
        private volatile Object userId_;

        public static UserIdQuery getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserIdQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserIdQuery) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserIdQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserIdQuery)) {
                return super.equals(obj);
            }
            UserIdQuery userIdQuery = (UserIdQuery) obj;
            return getUserId().equals(userIdQuery.getUserId()) && getTimestamp() == userIdQuery.getTimestamp() && this.unknownFields.equals(userIdQuery.unknownFields);
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
            int iComputeStringSize = !getUserIdBytes().isEmpty() ? h0.computeStringSize(1, this.userId_) : 0;
            long j10 = this.timestamp_;
            if (j10 != 0) {
                iComputeStringSize += n.z(2, j10);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserId().hashCode()) * 37) + 2) * 53) + j0.i(getTimestamp())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable.d(UserIdQuery.class, Builder.class);
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
            return new UserIdQuery();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getUserIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.userId_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                nVar.H0(2, j10);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements UserIdQueryOrBuilder {
            private long timestamp_;
            private Object userId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearTimestamp() {
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = UserIdQuery.getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQueryOrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable.d(UserIdQuery.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setTimestamp(long j10) {
                this.timestamp_ = j10;
                onChanged();
                return this;
            }

            public Builder setUserId(String str) {
                str.getClass();
                this.userId_ = str;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.userId_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.userId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserIdQuery build() {
                UserIdQuery userIdQueryBuildPartial = buildPartial();
                if (userIdQueryBuildPartial.isInitialized()) {
                    return userIdQueryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userIdQueryBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserIdQuery buildPartial() {
                UserIdQuery userIdQuery = new UserIdQuery(this);
                userIdQuery.userId_ = this.userId_;
                userIdQuery.timestamp_ = this.timestamp_;
                onBuilt();
                return userIdQuery;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public UserIdQuery getDefaultInstanceForType() {
                return UserIdQuery.getDefaultInstance();
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
                this.userId_ = "";
                this.timestamp_ = 0L;
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.userId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserIdQuery) {
                    return mergeFrom((UserIdQuery) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserIdQuery userIdQuery) {
                if (userIdQuery == UserIdQuery.getDefaultInstance()) {
                    return this;
                }
                if (!userIdQuery.getUserId().isEmpty()) {
                    this.userId_ = userIdQuery.userId_;
                    onChanged();
                }
                if (userIdQuery.getTimestamp() != 0) {
                    setTimestamp(userIdQuery.getTimestamp());
                }
                mergeUnknownFields(((h0) userIdQuery).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery.access$21600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserIdQuery r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserIdQuery r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserIdQuery.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserIdQuery$Builder");
            }
        }

        public static Builder newBuilder(UserIdQuery userIdQuery) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userIdQuery);
        }

        public static UserIdQuery parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(byteBuffer, wVar);
        }

        private UserIdQuery(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserIdQuery parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (UserIdQuery) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static UserIdQuery parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public UserIdQuery getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserIdQuery parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserIdQuery() {
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
        }

        public static UserIdQuery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static UserIdQuery parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (UserIdQuery) PARSER.parseFrom(bArr, wVar);
        }

        public static UserIdQuery parseFrom(InputStream inputStream) throws IOException {
            return (UserIdQuery) h0.parseWithIOException(PARSER, inputStream);
        }

        private UserIdQuery(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.userId_ = lVar.J();
                            } else if (iK != 16) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.timestamp_ = lVar.z();
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

        public static UserIdQuery parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (UserIdQuery) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static UserIdQuery parseFrom(l lVar) throws IOException {
            return (UserIdQuery) h0.parseWithIOException(PARSER, lVar);
        }

        public static UserIdQuery parseFrom(l lVar, w wVar) throws IOException {
            return (UserIdQuery) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface UserIdQueryOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        long getTimestamp();

        String getUserId();

        ByteString getUserIdBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserSession extends h0 implements UserSessionOrBuilder {
        public static final int LAST_ACTIVITY_FIELD_NUMBER = 1;
        public static final int LAST_REQUEST_REJECTION_REASON_FIELD_NUMBER = 5;
        public static final int METRICS_BY_AD_TYPE_FIELD_NUMBER = 3;
        public static final int SESSION_START_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private long lastActivity_;
        private volatile Object lastRequestRejectionReason_;
        private byte memoizedIsInitialized;
        private List<AdTypeMetrics> metricsByAdType_;
        private long sessionStart_;
        private static final UserSession DEFAULT_INSTANCE = new UserSession();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.1
            @Override // com.explorestack.protobuf.p1
            public UserSession parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new UserSession(lVar, wVar);
            }
        };

        public static final class AdTypeMetrics extends h0 implements AdTypeMetricsOrBuilder {
            public static final int AD_REQUESTS_FIELD_NUMBER = 3;
            public static final int AD_TYPE_FIELD_NUMBER = 1;
            public static final int AUCTIONS_FIELD_NUMBER = 13;
            public static final int BIDS_FIELD_NUMBER = 4;
            public static final int CUMULATIVE_BID_PRICE_FIELD_NUMBER = 9;
            public static final int CUMULATIVE_LURL_PRICE_FIELD_NUMBER = 10;
            public static final int CUMULATIVE_NURL_PRICE_FIELD_NUMBER = 11;
            public static final int ECPM_FIELD_NUMBER = 12;
            public static final int IMPRESSIONS_FIELD_NUMBER = 2;
            public static final int LOSSES_FIELD_NUMBER = 6;
            public static final int LURLS_FIELD_NUMBER = 7;
            public static final int NURLS_FIELD_NUMBER = 8;
            public static final int WINS_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private int adRequests_;
            private int adType_;
            private List<Auction> auctions_;
            private int bids_;
            private float cumulativeBidPrice_;
            private float cumulativeLurlPrice_;
            private float cumulativeNurlPrice_;
            private Ecpm ecpm_;
            private int impressions_;
            private int losses_;
            private int lurls_;
            private byte memoizedIsInitialized;
            private int nurls_;
            private int wins_;
            private static final AdTypeMetrics DEFAULT_INSTANCE = new AdTypeMetrics();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics.1
                @Override // com.explorestack.protobuf.p1
                public AdTypeMetrics parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new AdTypeMetrics(lVar, wVar);
                }
            };

            public static AdTypeMetrics getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdTypeMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdTypeMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdTypeMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdTypeMetrics)) {
                    return super.equals(obj);
                }
                AdTypeMetrics adTypeMetrics = (AdTypeMetrics) obj;
                if (this.adType_ == adTypeMetrics.adType_ && getImpressions() == adTypeMetrics.getImpressions() && getAdRequests() == adTypeMetrics.getAdRequests() && getBids() == adTypeMetrics.getBids() && getWins() == adTypeMetrics.getWins() && getLosses() == adTypeMetrics.getLosses() && getLurls() == adTypeMetrics.getLurls() && getNurls() == adTypeMetrics.getNurls() && Float.floatToIntBits(getCumulativeBidPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeBidPrice()) && Float.floatToIntBits(getCumulativeLurlPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeLurlPrice()) && Float.floatToIntBits(getCumulativeNurlPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeNurlPrice()) && hasEcpm() == adTypeMetrics.hasEcpm()) {
                    return (!hasEcpm() || getEcpm().equals(adTypeMetrics.getEcpm())) && getAuctionsList().equals(adTypeMetrics.getAuctionsList()) && this.unknownFields.equals(adTypeMetrics.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getAdRequests() {
                return this.adRequests_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public Auction getAuctions(int i10) {
                return this.auctions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getAuctionsCount() {
                return this.auctions_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public List<Auction> getAuctionsList() {
                return this.auctions_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public AuctionOrBuilder getAuctionsOrBuilder(int i10) {
                return this.auctions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public List<? extends AuctionOrBuilder> getAuctionsOrBuilderList() {
                return this.auctions_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getBids() {
                return this.bids_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeBidPrice() {
                return this.cumulativeBidPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeLurlPrice() {
                return this.cumulativeLurlPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeNurlPrice() {
                return this.cumulativeNurlPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public Ecpm getEcpm() {
                Ecpm ecpm = this.ecpm_;
                return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public EcpmOrBuilder getEcpmOrBuilder() {
                return getEcpm();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getImpressions() {
                return this.impressions_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getLosses() {
                return this.losses_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getLurls() {
                return this.lurls_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getNurls() {
                return this.nurls_;
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
                int iL = this.adType_ != AdType.UNKNOWN.getNumber() ? n.l(1, this.adType_) : 0;
                int i11 = this.impressions_;
                if (i11 != 0) {
                    iL += n.x(2, i11);
                }
                int i12 = this.adRequests_;
                if (i12 != 0) {
                    iL += n.x(3, i12);
                }
                int i13 = this.bids_;
                if (i13 != 0) {
                    iL += n.x(4, i13);
                }
                int i14 = this.wins_;
                if (i14 != 0) {
                    iL += n.x(5, i14);
                }
                int i15 = this.losses_;
                if (i15 != 0) {
                    iL += n.x(6, i15);
                }
                int i16 = this.lurls_;
                if (i16 != 0) {
                    iL += n.x(7, i16);
                }
                int i17 = this.nurls_;
                if (i17 != 0) {
                    iL += n.x(8, i17);
                }
                float f10 = this.cumulativeBidPrice_;
                if (f10 != 0.0f) {
                    iL += n.r(9, f10);
                }
                float f11 = this.cumulativeLurlPrice_;
                if (f11 != 0.0f) {
                    iL += n.r(10, f11);
                }
                float f12 = this.cumulativeNurlPrice_;
                if (f12 != 0.0f) {
                    iL += n.r(11, f12);
                }
                if (this.ecpm_ != null) {
                    iL += n.G(12, getEcpm());
                }
                for (int i18 = 0; i18 < this.auctions_.size(); i18++) {
                    iL += n.G(13, this.auctions_.get(i18));
                }
                int serializedSize = iL + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public int getWins() {
                return this.wins_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
            public boolean hasEcpm() {
                return this.ecpm_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.adType_) * 37) + 2) * 53) + getImpressions()) * 37) + 3) * 53) + getAdRequests()) * 37) + 4) * 53) + getBids()) * 37) + 5) * 53) + getWins()) * 37) + 6) * 53) + getLosses()) * 37) + 7) * 53) + getLurls()) * 37) + 8) * 53) + getNurls()) * 37) + 9) * 53) + Float.floatToIntBits(getCumulativeBidPrice())) * 37) + 10) * 53) + Float.floatToIntBits(getCumulativeLurlPrice())) * 37) + 11) * 53) + Float.floatToIntBits(getCumulativeNurlPrice());
                if (hasEcpm()) {
                    iHashCode = (((iHashCode * 37) + 12) * 53) + getEcpm().hashCode();
                }
                if (getAuctionsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 13) * 53) + getAuctionsList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable.d(AdTypeMetrics.class, Builder.class);
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
                return new AdTypeMetrics();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                    nVar.v0(1, this.adType_);
                }
                int i10 = this.impressions_;
                if (i10 != 0) {
                    nVar.F0(2, i10);
                }
                int i11 = this.adRequests_;
                if (i11 != 0) {
                    nVar.F0(3, i11);
                }
                int i12 = this.bids_;
                if (i12 != 0) {
                    nVar.F0(4, i12);
                }
                int i13 = this.wins_;
                if (i13 != 0) {
                    nVar.F0(5, i13);
                }
                int i14 = this.losses_;
                if (i14 != 0) {
                    nVar.F0(6, i14);
                }
                int i15 = this.lurls_;
                if (i15 != 0) {
                    nVar.F0(7, i15);
                }
                int i16 = this.nurls_;
                if (i16 != 0) {
                    nVar.F0(8, i16);
                }
                float f10 = this.cumulativeBidPrice_;
                if (f10 != 0.0f) {
                    nVar.B0(9, f10);
                }
                float f11 = this.cumulativeLurlPrice_;
                if (f11 != 0.0f) {
                    nVar.B0(10, f11);
                }
                float f12 = this.cumulativeNurlPrice_;
                if (f12 != 0.0f) {
                    nVar.B0(11, f12);
                }
                if (this.ecpm_ != null) {
                    nVar.J0(12, getEcpm());
                }
                for (int i17 = 0; i17 < this.auctions_.size(); i17++) {
                    nVar.J0(13, this.auctions_.get(i17));
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements AdTypeMetricsOrBuilder {
                private int adRequests_;
                private int adType_;
                private v1 auctionsBuilder_;
                private List<Auction> auctions_;
                private int bids_;
                private int bitField0_;
                private float cumulativeBidPrice_;
                private float cumulativeLurlPrice_;
                private float cumulativeNurlPrice_;
                private a2 ecpmBuilder_;
                private Ecpm ecpm_;
                private int impressions_;
                private int losses_;
                private int lurls_;
                private int nurls_;
                private int wins_;

                private void ensureAuctionsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.auctions_ = new ArrayList(this.auctions_);
                        this.bitField0_ |= 1;
                    }
                }

                private v1 getAuctionsFieldBuilder() {
                    if (this.auctionsBuilder_ == null) {
                        this.auctionsBuilder_ = new v1(this.auctions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.auctions_ = null;
                    }
                    return this.auctionsBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
                }

                private a2 getEcpmFieldBuilder() {
                    if (this.ecpmBuilder_ == null) {
                        this.ecpmBuilder_ = new a2(getEcpm(), getParentForChildren(), isClean());
                        this.ecpm_ = null;
                    }
                    return this.ecpmBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        getAuctionsFieldBuilder();
                    }
                }

                public Builder addAllAuctions(Iterable<? extends Auction> iterable) {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureAuctionsIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.auctions_);
                    onChanged();
                    return this;
                }

                public Builder addAuctions(Auction auction) {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var != null) {
                        v1Var.e(auction);
                        return this;
                    }
                    auction.getClass();
                    ensureAuctionsIsMutable();
                    this.auctions_.add(auction);
                    onChanged();
                    return this;
                }

                public Auction.Builder addAuctionsBuilder() {
                    return (Auction.Builder) getAuctionsFieldBuilder().c(Auction.getDefaultInstance());
                }

                public Builder clearAdRequests() {
                    this.adRequests_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearAdType() {
                    this.adType_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearAuctions() {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.auctions_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearBids() {
                    this.bids_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeBidPrice() {
                    this.cumulativeBidPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeLurlPrice() {
                    this.cumulativeLurlPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeNurlPrice() {
                    this.cumulativeNurlPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearEcpm() {
                    if (this.ecpmBuilder_ == null) {
                        this.ecpm_ = null;
                        onChanged();
                        return this;
                    }
                    this.ecpm_ = null;
                    this.ecpmBuilder_ = null;
                    return this;
                }

                public Builder clearImpressions() {
                    this.impressions_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLosses() {
                    this.losses_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLurls() {
                    this.lurls_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearNurls() {
                    this.nurls_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWins() {
                    this.wins_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getAdRequests() {
                    return this.adRequests_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public AdType getAdType() {
                    AdType adTypeValueOf = AdType.valueOf(this.adType_);
                    return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getAdTypeValue() {
                    return this.adType_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public Auction getAuctions(int i10) {
                    v1 v1Var = this.auctionsBuilder_;
                    return v1Var == null ? this.auctions_.get(i10) : (Auction) v1Var.n(i10);
                }

                public Auction.Builder getAuctionsBuilder(int i10) {
                    return (Auction.Builder) getAuctionsFieldBuilder().k(i10);
                }

                public List<Auction.Builder> getAuctionsBuilderList() {
                    return getAuctionsFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getAuctionsCount() {
                    v1 v1Var = this.auctionsBuilder_;
                    return v1Var == null ? this.auctions_.size() : v1Var.m();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public List<Auction> getAuctionsList() {
                    v1 v1Var = this.auctionsBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.auctions_) : v1Var.p();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public AuctionOrBuilder getAuctionsOrBuilder(int i10) {
                    v1 v1Var = this.auctionsBuilder_;
                    return v1Var == null ? this.auctions_.get(i10) : (AuctionOrBuilder) v1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public List<? extends AuctionOrBuilder> getAuctionsOrBuilderList() {
                    v1 v1Var = this.auctionsBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.auctions_);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getBids() {
                    return this.bids_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeBidPrice() {
                    return this.cumulativeBidPrice_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeLurlPrice() {
                    return this.cumulativeLurlPrice_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeNurlPrice() {
                    return this.cumulativeNurlPrice_;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public Ecpm getEcpm() {
                    a2 a2Var = this.ecpmBuilder_;
                    if (a2Var != null) {
                        return (Ecpm) a2Var.e();
                    }
                    Ecpm ecpm = this.ecpm_;
                    return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
                }

                public Ecpm.Builder getEcpmBuilder() {
                    onChanged();
                    return (Ecpm.Builder) getEcpmFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public EcpmOrBuilder getEcpmOrBuilder() {
                    a2 a2Var = this.ecpmBuilder_;
                    if (a2Var != null) {
                        return (EcpmOrBuilder) a2Var.f();
                    }
                    Ecpm ecpm = this.ecpm_;
                    return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getImpressions() {
                    return this.impressions_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getLosses() {
                    return this.losses_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getLurls() {
                    return this.lurls_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getNurls() {
                    return this.nurls_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public int getWins() {
                    return this.wins_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetricsOrBuilder
                public boolean hasEcpm() {
                    return (this.ecpmBuilder_ == null && this.ecpm_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable.d(AdTypeMetrics.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeEcpm(Ecpm ecpm) {
                    a2 a2Var = this.ecpmBuilder_;
                    if (a2Var != null) {
                        a2Var.g(ecpm);
                        return this;
                    }
                    Ecpm ecpm2 = this.ecpm_;
                    if (ecpm2 != null) {
                        this.ecpm_ = Ecpm.newBuilder(ecpm2).mergeFrom(ecpm).buildPartial();
                    } else {
                        this.ecpm_ = ecpm;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeAuctions(int i10) {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureAuctionsIsMutable();
                    this.auctions_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setAdRequests(int i10) {
                    this.adRequests_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setAdType(AdType adType) {
                    adType.getClass();
                    this.adType_ = adType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setAdTypeValue(int i10) {
                    this.adType_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setAuctions(int i10, Auction auction) {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, auction);
                        return this;
                    }
                    auction.getClass();
                    ensureAuctionsIsMutable();
                    this.auctions_.set(i10, auction);
                    onChanged();
                    return this;
                }

                public Builder setBids(int i10) {
                    this.bids_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeBidPrice(float f10) {
                    this.cumulativeBidPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeLurlPrice(float f10) {
                    this.cumulativeLurlPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeNurlPrice(float f10) {
                    this.cumulativeNurlPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setEcpm(Ecpm ecpm) {
                    a2 a2Var = this.ecpmBuilder_;
                    if (a2Var != null) {
                        a2Var.i(ecpm);
                        return this;
                    }
                    ecpm.getClass();
                    this.ecpm_ = ecpm;
                    onChanged();
                    return this;
                }

                public Builder setImpressions(int i10) {
                    this.impressions_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLosses(int i10) {
                    this.losses_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLurls(int i10) {
                    this.lurls_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setNurls(int i10) {
                    this.nurls_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setWins(int i10) {
                    this.wins_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.adType_ = 0;
                    this.auctions_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdTypeMetrics build() {
                    AdTypeMetrics adTypeMetricsBuildPartial = buildPartial();
                    if (adTypeMetricsBuildPartial.isInitialized()) {
                        return adTypeMetricsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) adTypeMetricsBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdTypeMetrics buildPartial() {
                    AdTypeMetrics adTypeMetrics = new AdTypeMetrics(this);
                    adTypeMetrics.adType_ = this.adType_;
                    adTypeMetrics.impressions_ = this.impressions_;
                    adTypeMetrics.adRequests_ = this.adRequests_;
                    adTypeMetrics.bids_ = this.bids_;
                    adTypeMetrics.wins_ = this.wins_;
                    adTypeMetrics.losses_ = this.losses_;
                    adTypeMetrics.lurls_ = this.lurls_;
                    adTypeMetrics.nurls_ = this.nurls_;
                    adTypeMetrics.cumulativeBidPrice_ = this.cumulativeBidPrice_;
                    adTypeMetrics.cumulativeLurlPrice_ = this.cumulativeLurlPrice_;
                    adTypeMetrics.cumulativeNurlPrice_ = this.cumulativeNurlPrice_;
                    a2 a2Var = this.ecpmBuilder_;
                    if (a2Var == null) {
                        adTypeMetrics.ecpm_ = this.ecpm_;
                    } else {
                        adTypeMetrics.ecpm_ = (Ecpm) a2Var.a();
                    }
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var != null) {
                        adTypeMetrics.auctions_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.auctions_ = DesugarCollections.unmodifiableList(this.auctions_);
                            this.bitField0_ &= -2;
                        }
                        adTypeMetrics.auctions_ = this.auctions_;
                    }
                    onBuilt();
                    return adTypeMetrics;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public AdTypeMetrics getDefaultInstanceForType() {
                    return AdTypeMetrics.getDefaultInstance();
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

                public Auction.Builder addAuctionsBuilder(int i10) {
                    return (Auction.Builder) getAuctionsFieldBuilder().b(i10, Auction.getDefaultInstance());
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
                    this.adType_ = 0;
                    this.impressions_ = 0;
                    this.adRequests_ = 0;
                    this.bids_ = 0;
                    this.wins_ = 0;
                    this.losses_ = 0;
                    this.lurls_ = 0;
                    this.nurls_ = 0;
                    this.cumulativeBidPrice_ = 0.0f;
                    this.cumulativeLurlPrice_ = 0.0f;
                    this.cumulativeNurlPrice_ = 0.0f;
                    if (this.ecpmBuilder_ == null) {
                        this.ecpm_ = null;
                    } else {
                        this.ecpm_ = null;
                        this.ecpmBuilder_ = null;
                    }
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var == null) {
                        this.auctions_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        return this;
                    }
                    v1Var.g();
                    return this;
                }

                public Builder setEcpm(Ecpm.Builder builder) {
                    a2 a2Var = this.ecpmBuilder_;
                    if (a2Var == null) {
                        this.ecpm_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.adType_ = 0;
                    this.auctions_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addAuctions(int i10, Auction auction) {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var == null) {
                        auction.getClass();
                        ensureAuctionsIsMutable();
                        this.auctions_.add(i10, auction);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, auction);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AdTypeMetrics) {
                        return mergeFrom((AdTypeMetrics) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAuctions(int i10, Auction.Builder builder) {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var == null) {
                        ensureAuctionsIsMutable();
                        this.auctions_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(AdTypeMetrics adTypeMetrics) {
                    if (adTypeMetrics == AdTypeMetrics.getDefaultInstance()) {
                        return this;
                    }
                    if (adTypeMetrics.adType_ != 0) {
                        setAdTypeValue(adTypeMetrics.getAdTypeValue());
                    }
                    if (adTypeMetrics.getImpressions() != 0) {
                        setImpressions(adTypeMetrics.getImpressions());
                    }
                    if (adTypeMetrics.getAdRequests() != 0) {
                        setAdRequests(adTypeMetrics.getAdRequests());
                    }
                    if (adTypeMetrics.getBids() != 0) {
                        setBids(adTypeMetrics.getBids());
                    }
                    if (adTypeMetrics.getWins() != 0) {
                        setWins(adTypeMetrics.getWins());
                    }
                    if (adTypeMetrics.getLosses() != 0) {
                        setLosses(adTypeMetrics.getLosses());
                    }
                    if (adTypeMetrics.getLurls() != 0) {
                        setLurls(adTypeMetrics.getLurls());
                    }
                    if (adTypeMetrics.getNurls() != 0) {
                        setNurls(adTypeMetrics.getNurls());
                    }
                    if (adTypeMetrics.getCumulativeBidPrice() != 0.0f) {
                        setCumulativeBidPrice(adTypeMetrics.getCumulativeBidPrice());
                    }
                    if (adTypeMetrics.getCumulativeLurlPrice() != 0.0f) {
                        setCumulativeLurlPrice(adTypeMetrics.getCumulativeLurlPrice());
                    }
                    if (adTypeMetrics.getCumulativeNurlPrice() != 0.0f) {
                        setCumulativeNurlPrice(adTypeMetrics.getCumulativeNurlPrice());
                    }
                    if (adTypeMetrics.hasEcpm()) {
                        mergeEcpm(adTypeMetrics.getEcpm());
                    }
                    if (this.auctionsBuilder_ == null) {
                        if (!adTypeMetrics.auctions_.isEmpty()) {
                            if (this.auctions_.isEmpty()) {
                                this.auctions_ = adTypeMetrics.auctions_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAuctionsIsMutable();
                                this.auctions_.addAll(adTypeMetrics.auctions_);
                            }
                            onChanged();
                        }
                    } else if (!adTypeMetrics.auctions_.isEmpty()) {
                        if (!this.auctionsBuilder_.t()) {
                            this.auctionsBuilder_.a(adTypeMetrics.auctions_);
                        } else {
                            this.auctionsBuilder_.h();
                            this.auctionsBuilder_ = null;
                            this.auctions_ = adTypeMetrics.auctions_;
                            this.bitField0_ &= -2;
                            this.auctionsBuilder_ = h0.alwaysUseFieldBuilders ? getAuctionsFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) adTypeMetrics).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAuctions(Auction.Builder builder) {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var == null) {
                        ensureAuctionsIsMutable();
                        this.auctions_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                public Builder addAuctions(int i10, Auction.Builder builder) {
                    v1 v1Var = this.auctionsBuilder_;
                    if (v1Var == null) {
                        ensureAuctionsIsMutable();
                        this.auctions_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics.access$7500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$AdTypeMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$AdTypeMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AdTypeMetrics.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$AdTypeMetrics$Builder");
                }
            }

            public static Builder newBuilder(AdTypeMetrics adTypeMetrics) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adTypeMetrics);
            }

            public static AdTypeMetrics parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(byteBuffer, wVar);
            }

            private AdTypeMetrics(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AdTypeMetrics parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (AdTypeMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static AdTypeMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdTypeMetrics getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdTypeMetrics parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdTypeMetrics() {
                this.memoizedIsInitialized = (byte) -1;
                this.adType_ = 0;
                this.auctions_ = Collections.EMPTY_LIST;
            }

            public static AdTypeMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static AdTypeMetrics parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (AdTypeMetrics) PARSER.parseFrom(bArr, wVar);
            }

            public static AdTypeMetrics parseFrom(InputStream inputStream) throws IOException {
                return (AdTypeMetrics) h0.parseWithIOException(PARSER, inputStream);
            }

            private AdTypeMetrics(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.adType_ = lVar.t();
                                    break;
                                case 16:
                                    this.impressions_ = lVar.y();
                                    break;
                                case 24:
                                    this.adRequests_ = lVar.y();
                                    break;
                                case 32:
                                    this.bids_ = lVar.y();
                                    break;
                                case 40:
                                    this.wins_ = lVar.y();
                                    break;
                                case 48:
                                    this.losses_ = lVar.y();
                                    break;
                                case 56:
                                    this.lurls_ = lVar.y();
                                    break;
                                case 64:
                                    this.nurls_ = lVar.y();
                                    break;
                                case 77:
                                    this.cumulativeBidPrice_ = lVar.w();
                                    break;
                                case 85:
                                    this.cumulativeLurlPrice_ = lVar.w();
                                    break;
                                case 93:
                                    this.cumulativeNurlPrice_ = lVar.w();
                                    break;
                                case 98:
                                    Ecpm ecpm = this.ecpm_;
                                    Ecpm.Builder builder = ecpm != null ? ecpm.toBuilder() : null;
                                    Ecpm ecpm2 = (Ecpm) lVar.A(Ecpm.parser(), wVar);
                                    this.ecpm_ = ecpm2;
                                    if (builder != null) {
                                        builder.mergeFrom(ecpm2);
                                        this.ecpm_ = builder.buildPartial();
                                    }
                                    break;
                                case 106:
                                    if (!z11) {
                                        this.auctions_ = new ArrayList();
                                        z11 = true;
                                    }
                                    this.auctions_.add((Auction) lVar.A(Auction.parser(), wVar));
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
                            this.auctions_ = DesugarCollections.unmodifiableList(this.auctions_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    this.auctions_ = DesugarCollections.unmodifiableList(this.auctions_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static AdTypeMetrics parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (AdTypeMetrics) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static AdTypeMetrics parseFrom(l lVar) throws IOException {
                return (AdTypeMetrics) h0.parseWithIOException(PARSER, lVar);
            }

            public static AdTypeMetrics parseFrom(l lVar, w wVar) throws IOException {
                return (AdTypeMetrics) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface AdTypeMetricsOrBuilder extends MessageOrBuilder {
            int getAdRequests();

            AdType getAdType();

            int getAdTypeValue();

            Auction getAuctions(int i10);

            int getAuctionsCount();

            List<Auction> getAuctionsList();

            AuctionOrBuilder getAuctionsOrBuilder(int i10);

            List<? extends AuctionOrBuilder> getAuctionsOrBuilderList();

            int getBids();

            float getCumulativeBidPrice();

            float getCumulativeLurlPrice();

            float getCumulativeNurlPrice();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            Ecpm getEcpm();

            EcpmOrBuilder getEcpmOrBuilder();

            int getImpressions();

            int getLosses();

            int getLurls();

            int getNurls();

            int getWins();

            boolean hasEcpm();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Auction extends h0 implements AuctionOrBuilder {
            public static final int LOSERS_BIDDER_ID_FIELD_NUMBER = 3;
            public static final int SOURCE_REQUEST_ID_FIELD_NUMBER = 1;
            public static final int WINNER_BIDDER_ID_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int losersBidderIdMemoizedSerializedSize;
            private j0.g losersBidderId_;
            private byte memoizedIsInitialized;
            private ByteString sourceRequestId_;
            private int winnerBidderId_;
            private static final Auction DEFAULT_INSTANCE = new Auction();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction.1
                @Override // com.explorestack.protobuf.p1
                public Auction parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Auction(lVar, wVar);
                }
            };

            public static Auction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Auction parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Auction) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Auction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Auction)) {
                    return super.equals(obj);
                }
                Auction auction = (Auction) obj;
                return getSourceRequestId().equals(auction.getSourceRequestId()) && getWinnerBidderId() == auction.getWinnerBidderId() && getLosersBidderIdList().equals(auction.getLosersBidderIdList()) && this.unknownFields.equals(auction.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public int getLosersBidderId(int i10) {
                return this.losersBidderId_.getInt(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public int getLosersBidderIdCount() {
                return this.losersBidderId_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public List<Integer> getLosersBidderIdList() {
                return this.losersBidderId_;
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
                int iH = !this.sourceRequestId_.isEmpty() ? n.h(1, this.sourceRequestId_) : 0;
                int i11 = this.winnerBidderId_;
                if (i11 != 0) {
                    iH += n.Y(2, i11);
                }
                int iZ = 0;
                for (int i12 = 0; i12 < this.losersBidderId_.size(); i12++) {
                    iZ += n.Z(this.losersBidderId_.getInt(i12));
                }
                int iY = iH + iZ;
                if (!getLosersBidderIdList().isEmpty()) {
                    iY = iY + 1 + n.y(iZ);
                }
                this.losersBidderIdMemoizedSerializedSize = iZ;
                int serializedSize = iY + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public ByteString getSourceRequestId() {
                return this.sourceRequestId_;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
            public int getWinnerBidderId() {
                return this.winnerBidderId_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSourceRequestId().hashCode()) * 37) + 2) * 53) + getWinnerBidderId();
                if (getLosersBidderIdCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getLosersBidderIdList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_fieldAccessorTable.d(Auction.class, Builder.class);
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
                return new Auction();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                getSerializedSize();
                if (!this.sourceRequestId_.isEmpty()) {
                    nVar.r0(1, this.sourceRequestId_);
                }
                int i10 = this.winnerBidderId_;
                if (i10 != 0) {
                    nVar.W0(2, i10);
                }
                if (getLosersBidderIdList().size() > 0) {
                    nVar.X0(26);
                    nVar.X0(this.losersBidderIdMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.losersBidderId_.size(); i11++) {
                    nVar.X0(this.losersBidderId_.getInt(i11));
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements AuctionOrBuilder {
                private int bitField0_;
                private j0.g losersBidderId_;
                private ByteString sourceRequestId_;
                private int winnerBidderId_;

                private void ensureLosersBidderIdIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.losersBidderId_ = h0.mutableCopy(this.losersBidderId_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder addAllLosersBidderId(Iterable<? extends Integer> iterable) {
                    ensureLosersBidderIdIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.losersBidderId_);
                    onChanged();
                    return this;
                }

                public Builder addLosersBidderId(int i10) {
                    ensureLosersBidderIdIsMutable();
                    this.losersBidderId_.addInt(i10);
                    onChanged();
                    return this;
                }

                public Builder clearLosersBidderId() {
                    this.losersBidderId_ = h0.emptyIntList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSourceRequestId() {
                    this.sourceRequestId_ = Auction.getDefaultInstance().getSourceRequestId();
                    onChanged();
                    return this;
                }

                public Builder clearWinnerBidderId() {
                    this.winnerBidderId_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public int getLosersBidderId(int i10) {
                    return this.losersBidderId_.getInt(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public int getLosersBidderIdCount() {
                    return this.losersBidderId_.size();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public List<Integer> getLosersBidderIdList() {
                    return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.losersBidderId_) : this.losersBidderId_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public ByteString getSourceRequestId() {
                    return this.sourceRequestId_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.AuctionOrBuilder
                public int getWinnerBidderId() {
                    return this.winnerBidderId_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Auction_fieldAccessorTable.d(Auction.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setLosersBidderId(int i10, int i11) {
                    ensureLosersBidderIdIsMutable();
                    this.losersBidderId_.setInt(i10, i11);
                    onChanged();
                    return this;
                }

                public Builder setSourceRequestId(ByteString byteString) {
                    byteString.getClass();
                    this.sourceRequestId_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setWinnerBidderId(int i10) {
                    this.winnerBidderId_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.sourceRequestId_ = ByteString.EMPTY;
                    this.losersBidderId_ = h0.emptyIntList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Auction build() {
                    Auction auctionBuildPartial = buildPartial();
                    if (auctionBuildPartial.isInitialized()) {
                        return auctionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) auctionBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Auction buildPartial() {
                    Auction auction = new Auction(this);
                    auction.sourceRequestId_ = this.sourceRequestId_;
                    auction.winnerBidderId_ = this.winnerBidderId_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.losersBidderId_.makeImmutable();
                        this.bitField0_ &= -2;
                    }
                    auction.losersBidderId_ = this.losersBidderId_;
                    onBuilt();
                    return auction;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Auction getDefaultInstanceForType() {
                    return Auction.getDefaultInstance();
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
                    this.sourceRequestId_ = ByteString.EMPTY;
                    this.winnerBidderId_ = 0;
                    this.losersBidderId_ = h0.emptyIntList();
                    this.bitField0_ &= -2;
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.sourceRequestId_ = ByteString.EMPTY;
                    this.losersBidderId_ = h0.emptyIntList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Auction) {
                        return mergeFrom((Auction) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Auction auction) {
                    if (auction == Auction.getDefaultInstance()) {
                        return this;
                    }
                    if (auction.getSourceRequestId() != ByteString.EMPTY) {
                        setSourceRequestId(auction.getSourceRequestId());
                    }
                    if (auction.getWinnerBidderId() != 0) {
                        setWinnerBidderId(auction.getWinnerBidderId());
                    }
                    if (!auction.losersBidderId_.isEmpty()) {
                        if (this.losersBidderId_.isEmpty()) {
                            this.losersBidderId_ = auction.losersBidderId_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureLosersBidderIdIsMutable();
                            this.losersBidderId_.addAll(auction.losersBidderId_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(((h0) auction).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction.access$4900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Auction r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Auction r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Auction.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Auction$Builder");
                }
            }

            public static Builder newBuilder(Auction auction) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(auction);
            }

            public static Auction parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Auction(h0.b bVar) {
                super(bVar);
                this.losersBidderIdMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Auction parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Auction) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Auction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Auction getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Auction parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Auction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            private Auction() {
                this.losersBidderIdMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.sourceRequestId_ = ByteString.EMPTY;
                this.losersBidderId_ = h0.emptyIntList();
            }

            public static Auction parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Auction) PARSER.parseFrom(bArr, wVar);
            }

            public static Auction parseFrom(InputStream inputStream) throws IOException {
                return (Auction) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Auction parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Auction) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            private Auction(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.sourceRequestId_ = lVar.r();
                                } else if (iK == 16) {
                                    this.winnerBidderId_ = lVar.L();
                                } else if (iK == 24) {
                                    if (!z11) {
                                        this.losersBidderId_ = h0.newIntList();
                                        z11 = true;
                                    }
                                    this.losersBidderId_.addInt(lVar.L());
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    int iP = lVar.p(lVar.C());
                                    if (!z11 && lVar.d() > 0) {
                                        this.losersBidderId_ = h0.newIntList();
                                        z11 = true;
                                    }
                                    while (lVar.d() > 0) {
                                        this.losersBidderId_.addInt(lVar.L());
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
                        if (z11) {
                            this.losersBidderId_.makeImmutable();
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    this.losersBidderId_.makeImmutable();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Auction parseFrom(l lVar) throws IOException {
                return (Auction) h0.parseWithIOException(PARSER, lVar);
            }

            public static Auction parseFrom(l lVar, w wVar) throws IOException {
                return (Auction) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface AuctionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            int getLosersBidderId(int i10);

            int getLosersBidderIdCount();

            List<Integer> getLosersBidderIdList();

            ByteString getSourceRequestId();

            int getWinnerBidderId();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Ecpm extends h0 implements EcpmOrBuilder {
            public static final int COUNT_FIELD_NUMBER = 3;
            public static final int FIRST_PRICES_FIELD_NUMBER = 1;
            public static final int LAST_PRICES_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int count_;
            private int firstPricesMemoizedSerializedSize;
            private j0.b firstPrices_;
            private int lastPricesMemoizedSerializedSize;
            private j0.b lastPrices_;
            private byte memoizedIsInitialized;
            private static final Ecpm DEFAULT_INSTANCE = new Ecpm();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm.1
                @Override // com.explorestack.protobuf.p1
                public Ecpm parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Ecpm(lVar, wVar);
                }
            };

            public static Ecpm getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Ecpm parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ecpm) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Ecpm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Ecpm)) {
                    return super.equals(obj);
                }
                Ecpm ecpm = (Ecpm) obj;
                return getFirstPricesList().equals(ecpm.getFirstPricesList()) && getLastPricesList().equals(ecpm.getLastPricesList()) && getCount() == ecpm.getCount() && this.unknownFields.equals(ecpm.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public int getCount() {
                return this.count_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public double getFirstPrices(int i10) {
                return this.firstPrices_.getDouble(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public int getFirstPricesCount() {
                return this.firstPrices_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public List<Double> getFirstPricesList() {
                return this.firstPrices_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public double getLastPrices(int i10) {
                return this.lastPrices_.getDouble(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public int getLastPricesCount() {
                return this.lastPrices_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
            public List<Double> getLastPricesList() {
                return this.lastPrices_;
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
                int size = getFirstPricesList().size() * 8;
                int iY = !getFirstPricesList().isEmpty() ? size + 1 + n.y(size) : size;
                this.firstPricesMemoizedSerializedSize = size;
                int size2 = getLastPricesList().size() * 8;
                int iX = iY + size2;
                if (!getLastPricesList().isEmpty()) {
                    iX = iX + 1 + n.y(size2);
                }
                this.lastPricesMemoizedSerializedSize = size2;
                int i11 = this.count_;
                if (i11 != 0) {
                    iX += n.x(3, i11);
                }
                int serializedSize = iX + this.unknownFields.getSerializedSize();
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
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getFirstPricesCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getFirstPricesList().hashCode();
                }
                if (getLastPricesCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getLastPricesList().hashCode();
                }
                int count = (((((iHashCode * 37) + 3) * 53) + getCount()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = count;
                return count;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable.d(Ecpm.class, Builder.class);
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
                return new Ecpm();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                getSerializedSize();
                if (getFirstPricesList().size() > 0) {
                    nVar.X0(10);
                    nVar.X0(this.firstPricesMemoizedSerializedSize);
                }
                for (int i10 = 0; i10 < this.firstPrices_.size(); i10++) {
                    nVar.u0(this.firstPrices_.getDouble(i10));
                }
                if (getLastPricesList().size() > 0) {
                    nVar.X0(18);
                    nVar.X0(this.lastPricesMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.lastPrices_.size(); i11++) {
                    nVar.u0(this.lastPrices_.getDouble(i11));
                }
                int i12 = this.count_;
                if (i12 != 0) {
                    nVar.F0(3, i12);
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements EcpmOrBuilder {
                private int bitField0_;
                private int count_;
                private j0.b firstPrices_;
                private j0.b lastPrices_;

                private void ensureFirstPricesIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.firstPrices_ = h0.mutableCopy(this.firstPrices_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureLastPricesIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.lastPrices_ = h0.mutableCopy(this.lastPrices_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder addAllFirstPrices(Iterable<? extends Double> iterable) {
                    ensureFirstPricesIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.firstPrices_);
                    onChanged();
                    return this;
                }

                public Builder addAllLastPrices(Iterable<? extends Double> iterable) {
                    ensureLastPricesIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.lastPrices_);
                    onChanged();
                    return this;
                }

                public Builder addFirstPrices(double d10) {
                    ensureFirstPricesIsMutable();
                    this.firstPrices_.addDouble(d10);
                    onChanged();
                    return this;
                }

                public Builder addLastPrices(double d10) {
                    ensureLastPricesIsMutable();
                    this.lastPrices_.addDouble(d10);
                    onChanged();
                    return this;
                }

                public Builder clearCount() {
                    this.count_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearFirstPrices() {
                    this.firstPrices_ = h0.emptyDoubleList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearLastPrices() {
                    this.lastPrices_ = h0.emptyDoubleList();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public int getCount() {
                    return this.count_;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public double getFirstPrices(int i10) {
                    return this.firstPrices_.getDouble(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public int getFirstPricesCount() {
                    return this.firstPrices_.size();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public List<Double> getFirstPricesList() {
                    return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.firstPrices_) : this.firstPrices_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public double getLastPrices(int i10) {
                    return this.lastPrices_.getDouble(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public int getLastPricesCount() {
                    return this.lastPrices_.size();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.EcpmOrBuilder
                public List<Double> getLastPricesList() {
                    return (this.bitField0_ & 2) != 0 ? DesugarCollections.unmodifiableList(this.lastPrices_) : this.lastPrices_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable.d(Ecpm.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setCount(int i10) {
                    this.count_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setFirstPrices(int i10, double d10) {
                    ensureFirstPricesIsMutable();
                    this.firstPrices_.setDouble(i10, d10);
                    onChanged();
                    return this;
                }

                public Builder setLastPrices(int i10, double d10) {
                    ensureLastPricesIsMutable();
                    this.lastPrices_.setDouble(i10, d10);
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.firstPrices_ = h0.emptyDoubleList();
                    this.lastPrices_ = h0.emptyDoubleList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Ecpm build() {
                    Ecpm ecpmBuildPartial = buildPartial();
                    if (ecpmBuildPartial.isInitialized()) {
                        return ecpmBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) ecpmBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Ecpm buildPartial() {
                    Ecpm ecpm = new Ecpm(this);
                    if ((this.bitField0_ & 1) != 0) {
                        this.firstPrices_.makeImmutable();
                        this.bitField0_ &= -2;
                    }
                    ecpm.firstPrices_ = this.firstPrices_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.lastPrices_.makeImmutable();
                        this.bitField0_ &= -3;
                    }
                    ecpm.lastPrices_ = this.lastPrices_;
                    ecpm.count_ = this.count_;
                    onBuilt();
                    return ecpm;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Ecpm getDefaultInstanceForType() {
                    return Ecpm.getDefaultInstance();
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
                    this.firstPrices_ = h0.emptyDoubleList();
                    this.bitField0_ &= -2;
                    this.lastPrices_ = h0.emptyDoubleList();
                    this.bitField0_ &= -3;
                    this.count_ = 0;
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.firstPrices_ = h0.emptyDoubleList();
                    this.lastPrices_ = h0.emptyDoubleList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Ecpm) {
                        return mergeFrom((Ecpm) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Ecpm ecpm) {
                    if (ecpm == Ecpm.getDefaultInstance()) {
                        return this;
                    }
                    if (!ecpm.firstPrices_.isEmpty()) {
                        if (this.firstPrices_.isEmpty()) {
                            this.firstPrices_ = ecpm.firstPrices_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFirstPricesIsMutable();
                            this.firstPrices_.addAll(ecpm.firstPrices_);
                        }
                        onChanged();
                    }
                    if (!ecpm.lastPrices_.isEmpty()) {
                        if (this.lastPrices_.isEmpty()) {
                            this.lastPrices_ = ecpm.lastPrices_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureLastPricesIsMutable();
                            this.lastPrices_.addAll(ecpm.lastPrices_);
                        }
                        onChanged();
                    }
                    if (ecpm.getCount() != 0) {
                        setCount(ecpm.getCount());
                    }
                    mergeUnknownFields(((h0) ecpm).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm.access$3000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Ecpm r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Ecpm r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Ecpm.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Ecpm$Builder");
                }
            }

            public static Builder newBuilder(Ecpm ecpm) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(ecpm);
            }

            public static Ecpm parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Ecpm(h0.b bVar) {
                super(bVar);
                this.firstPricesMemoizedSerializedSize = -1;
                this.lastPricesMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Ecpm parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Ecpm) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Ecpm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Ecpm getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Ecpm parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Ecpm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Ecpm parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Ecpm) PARSER.parseFrom(bArr, wVar);
            }

            private Ecpm() {
                this.firstPricesMemoizedSerializedSize = -1;
                this.lastPricesMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.firstPrices_ = h0.emptyDoubleList();
                this.lastPrices_ = h0.emptyDoubleList();
            }

            public static Ecpm parseFrom(InputStream inputStream) throws IOException {
                return (Ecpm) h0.parseWithIOException(PARSER, inputStream);
            }

            public static Ecpm parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Ecpm) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Ecpm parseFrom(l lVar) throws IOException {
                return (Ecpm) h0.parseWithIOException(PARSER, lVar);
            }

            private Ecpm(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                if (iK == 24) {
                                    this.count_ = lVar.y();
                                } else if (iK == 9) {
                                    if ((i10 & 1) == 0) {
                                        this.firstPrices_ = h0.newDoubleList();
                                        i10 |= 1;
                                    }
                                    this.firstPrices_.addDouble(lVar.s());
                                } else if (iK == 10) {
                                    int iP = lVar.p(lVar.C());
                                    if ((i10 & 1) == 0 && lVar.d() > 0) {
                                        this.firstPrices_ = h0.newDoubleList();
                                        i10 |= 1;
                                    }
                                    while (lVar.d() > 0) {
                                        this.firstPrices_.addDouble(lVar.s());
                                    }
                                    lVar.o(iP);
                                } else if (iK == 17) {
                                    if ((i10 & 2) == 0) {
                                        this.lastPrices_ = h0.newDoubleList();
                                        i10 |= 2;
                                    }
                                    this.lastPrices_.addDouble(lVar.s());
                                } else if (iK != 18) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    int iP2 = lVar.p(lVar.C());
                                    if ((i10 & 2) == 0 && lVar.d() > 0) {
                                        this.lastPrices_ = h0.newDoubleList();
                                        i10 |= 2;
                                    }
                                    while (lVar.d() > 0) {
                                        this.lastPrices_.addDouble(lVar.s());
                                    }
                                    lVar.o(iP2);
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
                            this.firstPrices_.makeImmutable();
                        }
                        if ((i10 & 2) != 0) {
                            this.lastPrices_.makeImmutable();
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.firstPrices_.makeImmutable();
                }
                if ((i10 & 2) != 0) {
                    this.lastPrices_.makeImmutable();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Ecpm parseFrom(l lVar, w wVar) throws IOException {
                return (Ecpm) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface EcpmOrBuilder extends MessageOrBuilder {
            int getCount();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            double getFirstPrices(int i10);

            int getFirstPricesCount();

            List<Double> getFirstPricesList();

            double getLastPrices(int i10);

            int getLastPricesCount();

            List<Double> getLastPricesList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static UserSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserSession) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserSession)) {
                return super.equals(obj);
            }
            UserSession userSession = (UserSession) obj;
            return getLastActivity() == userSession.getLastActivity() && getMetricsByAdTypeList().equals(userSession.getMetricsByAdTypeList()) && getSessionStart() == userSession.getSessionStart() && getLastRequestRejectionReason().equals(userSession.getLastRequestRejectionReason()) && this.unknownFields.equals(userSession.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public long getLastActivity() {
            return this.lastActivity_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public String getLastRequestRejectionReason() {
            Object obj = this.lastRequestRejectionReason_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastRequestRejectionReason_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public ByteString getLastRequestRejectionReasonBytes() {
            Object obj = this.lastRequestRejectionReason_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastRequestRejectionReason_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public AdTypeMetrics getMetricsByAdType(int i10) {
            return this.metricsByAdType_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public int getMetricsByAdTypeCount() {
            return this.metricsByAdType_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public List<AdTypeMetrics> getMetricsByAdTypeList() {
            return this.metricsByAdType_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10) {
            return this.metricsByAdType_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public List<? extends AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList() {
            return this.metricsByAdType_;
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
            long j10 = this.lastActivity_;
            int iZ = j10 != 0 ? n.z(1, j10) : 0;
            for (int i11 = 0; i11 < this.metricsByAdType_.size(); i11++) {
                iZ += n.G(3, this.metricsByAdType_.get(i11));
            }
            long j11 = this.sessionStart_;
            if (j11 != 0) {
                iZ += n.z(4, j11);
            }
            if (!getLastRequestRejectionReasonBytes().isEmpty()) {
                iZ += h0.computeStringSize(5, this.lastRequestRejectionReason_);
            }
            int serializedSize = iZ + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
        public long getSessionStart() {
            return this.sessionStart_;
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(getLastActivity());
            if (getMetricsByAdTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMetricsByAdTypeList().hashCode();
            }
            int i11 = (((((((((iHashCode * 37) + 4) * 53) + j0.i(getSessionStart())) * 37) + 5) * 53) + getLastRequestRejectionReason().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = i11;
            return i11;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_fieldAccessorTable.d(UserSession.class, Builder.class);
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
            return new UserSession();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            long j10 = this.lastActivity_;
            if (j10 != 0) {
                nVar.H0(1, j10);
            }
            for (int i10 = 0; i10 < this.metricsByAdType_.size(); i10++) {
                nVar.J0(3, this.metricsByAdType_.get(i10));
            }
            long j11 = this.sessionStart_;
            if (j11 != 0) {
                nVar.H0(4, j11);
            }
            if (!getLastRequestRejectionReasonBytes().isEmpty()) {
                h0.writeString(nVar, 5, this.lastRequestRejectionReason_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements UserSessionOrBuilder {
            private int bitField0_;
            private long lastActivity_;
            private Object lastRequestRejectionReason_;
            private v1 metricsByAdTypeBuilder_;
            private List<AdTypeMetrics> metricsByAdType_;
            private long sessionStart_;

            private void ensureMetricsByAdTypeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.metricsByAdType_ = new ArrayList(this.metricsByAdType_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_descriptor;
            }

            private v1 getMetricsByAdTypeFieldBuilder() {
                if (this.metricsByAdTypeBuilder_ == null) {
                    this.metricsByAdTypeBuilder_ = new v1(this.metricsByAdType_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.metricsByAdType_ = null;
                }
                return this.metricsByAdTypeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getMetricsByAdTypeFieldBuilder();
                }
            }

            public Builder addAllMetricsByAdType(Iterable<? extends AdTypeMetrics> iterable) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureMetricsByAdTypeIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.metricsByAdType_);
                onChanged();
                return this;
            }

            public Builder addMetricsByAdType(AdTypeMetrics adTypeMetrics) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var != null) {
                    v1Var.e(adTypeMetrics);
                    return this;
                }
                adTypeMetrics.getClass();
                ensureMetricsByAdTypeIsMutable();
                this.metricsByAdType_.add(adTypeMetrics);
                onChanged();
                return this;
            }

            public AdTypeMetrics.Builder addMetricsByAdTypeBuilder() {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().c(AdTypeMetrics.getDefaultInstance());
            }

            public Builder clearLastActivity() {
                this.lastActivity_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearLastRequestRejectionReason() {
                this.lastRequestRejectionReason_ = UserSession.getDefaultInstance().getLastRequestRejectionReason();
                onChanged();
                return this;
            }

            public Builder clearMetricsByAdType() {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.metricsByAdType_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSessionStart() {
                this.sessionStart_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public long getLastActivity() {
                return this.lastActivity_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public String getLastRequestRejectionReason() {
                Object obj = this.lastRequestRejectionReason_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastRequestRejectionReason_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public ByteString getLastRequestRejectionReasonBytes() {
                Object obj = this.lastRequestRejectionReason_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastRequestRejectionReason_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public AdTypeMetrics getMetricsByAdType(int i10) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                return v1Var == null ? this.metricsByAdType_.get(i10) : (AdTypeMetrics) v1Var.n(i10);
            }

            public AdTypeMetrics.Builder getMetricsByAdTypeBuilder(int i10) {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().k(i10);
            }

            public List<AdTypeMetrics.Builder> getMetricsByAdTypeBuilderList() {
                return getMetricsByAdTypeFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public int getMetricsByAdTypeCount() {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                return v1Var == null ? this.metricsByAdType_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public List<AdTypeMetrics> getMetricsByAdTypeList() {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.metricsByAdType_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                return v1Var == null ? this.metricsByAdType_.get(i10) : (AdTypeMetricsOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public List<? extends AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList() {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.metricsByAdType_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSessionOrBuilder
            public long getSessionStart() {
                return this.sessionStart_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserSession_fieldAccessorTable.d(UserSession.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeMetricsByAdType(int i10) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureMetricsByAdTypeIsMutable();
                this.metricsByAdType_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setLastActivity(long j10) {
                this.lastActivity_ = j10;
                onChanged();
                return this;
            }

            public Builder setLastRequestRejectionReason(String str) {
                str.getClass();
                this.lastRequestRejectionReason_ = str;
                onChanged();
                return this;
            }

            public Builder setLastRequestRejectionReasonBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.lastRequestRejectionReason_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMetricsByAdType(int i10, AdTypeMetrics adTypeMetrics) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, adTypeMetrics);
                    return this;
                }
                adTypeMetrics.getClass();
                ensureMetricsByAdTypeIsMutable();
                this.metricsByAdType_.set(i10, adTypeMetrics);
                onChanged();
                return this;
            }

            public Builder setSessionStart(long j10) {
                this.sessionStart_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.metricsByAdType_ = Collections.EMPTY_LIST;
                this.lastRequestRejectionReason_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserSession build() {
                UserSession userSessionBuildPartial = buildPartial();
                if (userSessionBuildPartial.isInitialized()) {
                    return userSessionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userSessionBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserSession buildPartial() {
                UserSession userSession = new UserSession(this);
                userSession.lastActivity_ = this.lastActivity_;
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var != null) {
                    userSession.metricsByAdType_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.metricsByAdType_ = DesugarCollections.unmodifiableList(this.metricsByAdType_);
                        this.bitField0_ &= -2;
                    }
                    userSession.metricsByAdType_ = this.metricsByAdType_;
                }
                userSession.sessionStart_ = this.sessionStart_;
                userSession.lastRequestRejectionReason_ = this.lastRequestRejectionReason_;
                onBuilt();
                return userSession;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public UserSession getDefaultInstanceForType() {
                return UserSession.getDefaultInstance();
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

            public AdTypeMetrics.Builder addMetricsByAdTypeBuilder(int i10) {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().b(i10, AdTypeMetrics.getDefaultInstance());
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
                this.lastActivity_ = 0L;
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var == null) {
                    this.metricsByAdType_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    v1Var.g();
                }
                this.sessionStart_ = 0L;
                this.lastRequestRejectionReason_ = "";
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.metricsByAdType_ = Collections.EMPTY_LIST;
                this.lastRequestRejectionReason_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addMetricsByAdType(int i10, AdTypeMetrics adTypeMetrics) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var == null) {
                    adTypeMetrics.getClass();
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(i10, adTypeMetrics);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, adTypeMetrics);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserSession) {
                    return mergeFrom((UserSession) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setMetricsByAdType(int i10, AdTypeMetrics.Builder builder) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(UserSession userSession) {
                if (userSession == UserSession.getDefaultInstance()) {
                    return this;
                }
                if (userSession.getLastActivity() != 0) {
                    setLastActivity(userSession.getLastActivity());
                }
                if (this.metricsByAdTypeBuilder_ == null) {
                    if (!userSession.metricsByAdType_.isEmpty()) {
                        if (this.metricsByAdType_.isEmpty()) {
                            this.metricsByAdType_ = userSession.metricsByAdType_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMetricsByAdTypeIsMutable();
                            this.metricsByAdType_.addAll(userSession.metricsByAdType_);
                        }
                        onChanged();
                    }
                } else if (!userSession.metricsByAdType_.isEmpty()) {
                    if (!this.metricsByAdTypeBuilder_.t()) {
                        this.metricsByAdTypeBuilder_.a(userSession.metricsByAdType_);
                    } else {
                        this.metricsByAdTypeBuilder_.h();
                        this.metricsByAdTypeBuilder_ = null;
                        this.metricsByAdType_ = userSession.metricsByAdType_;
                        this.bitField0_ &= -2;
                        this.metricsByAdTypeBuilder_ = h0.alwaysUseFieldBuilders ? getMetricsByAdTypeFieldBuilder() : null;
                    }
                }
                if (userSession.getSessionStart() != 0) {
                    setSessionStart(userSession.getSessionStart());
                }
                if (!userSession.getLastRequestRejectionReason().isEmpty()) {
                    this.lastRequestRejectionReason_ = userSession.lastRequestRejectionReason_;
                    onChanged();
                }
                mergeUnknownFields(((h0) userSession).unknownFields);
                onChanged();
                return this;
            }

            public Builder addMetricsByAdType(AdTypeMetrics.Builder builder) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addMetricsByAdType(int i10, AdTypeMetrics.Builder builder) {
                v1 v1Var = this.metricsByAdTypeBuilder_;
                if (v1Var == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.access$8700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserSession.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserSession$Builder");
            }
        }

        public static Builder newBuilder(UserSession userSession) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userSession);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(byteBuffer, wVar);
        }

        private UserSession(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (UserSession) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static UserSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public UserSession getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserSession parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserSession() {
            this.memoizedIsInitialized = (byte) -1;
            this.metricsByAdType_ = Collections.EMPTY_LIST;
            this.lastRequestRejectionReason_ = "";
        }

        public static UserSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static UserSession parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (UserSession) PARSER.parseFrom(bArr, wVar);
        }

        public static UserSession parseFrom(InputStream inputStream) throws IOException {
            return (UserSession) h0.parseWithIOException(PARSER, inputStream);
        }

        private UserSession(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.lastActivity_ = lVar.z();
                            } else if (iK == 26) {
                                if (!z11) {
                                    this.metricsByAdType_ = new ArrayList();
                                    z11 = true;
                                }
                                this.metricsByAdType_.add((AdTypeMetrics) lVar.A(AdTypeMetrics.parser(), wVar));
                            } else if (iK == 32) {
                                this.sessionStart_ = lVar.z();
                            } else if (iK != 42) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.lastRequestRejectionReason_ = lVar.J();
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
                        this.metricsByAdType_ = DesugarCollections.unmodifiableList(this.metricsByAdType_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.metricsByAdType_ = DesugarCollections.unmodifiableList(this.metricsByAdType_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static UserSession parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (UserSession) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static UserSession parseFrom(l lVar) throws IOException {
            return (UserSession) h0.parseWithIOException(PARSER, lVar);
        }

        public static UserSession parseFrom(l lVar, w wVar) throws IOException {
            return (UserSession) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface UserSessionOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        long getLastActivity();

        String getLastRequestRejectionReason();

        ByteString getLastRequestRejectionReasonBytes();

        UserSession.AdTypeMetrics getMetricsByAdType(int i10);

        int getMetricsByAdTypeCount();

        List<UserSession.AdTypeMetrics> getMetricsByAdTypeList();

        UserSession.AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10);

        List<? extends UserSession.AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList();

        long getSessionStart();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserState extends h0 implements UserStateOrBuilder {
        public static final int AD_REQUESTS_FIELD_NUMBER = 3;
        public static final int IMPRESSIONS_FIELD_NUMBER = 2;
        public static final int LAST_PROCESSED_TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private w0 adRequests_;
        private w0 impressions_;
        private long lastProcessedTimestamp_;
        private byte memoizedIsInitialized;
        private static final UserState DEFAULT_INSTANCE = new UserState();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState.1
            @Override // com.explorestack.protobuf.p1
            public UserState parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new UserState(lVar, wVar);
            }
        };

        private static final class AdRequestsDefaultEntryHolder {
            static final u0 defaultEntry = u0.n(SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor, z2.b.f19477h, 0, z2.b.f19483n, Timestamps.getDefaultInstance());

            private AdRequestsDefaultEntryHolder() {
            }
        }

        private static final class ImpressionsDefaultEntryHolder {
            static final u0 defaultEntry = u0.n(SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor, z2.b.f19477h, 0, z2.b.f19483n, AdDomainTimestamps.getDefaultInstance());

            private ImpressionsDefaultEntryHolder() {
            }
        }

        public static UserState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w0 internalGetAdRequests() {
            w0 w0Var = this.adRequests_;
            return w0Var == null ? w0.g(AdRequestsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w0 internalGetImpressions() {
            w0 w0Var = this.impressions_;
            return w0Var == null ? w0.g(ImpressionsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserState) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public boolean containsAdRequests(int i10) {
            return internalGetAdRequests().i().containsKey(Integer.valueOf(i10));
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public boolean containsImpressions(int i10) {
            return internalGetImpressions().i().containsKey(Integer.valueOf(i10));
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserState)) {
                return super.equals(obj);
            }
            UserState userState = (UserState) obj;
            return getLastProcessedTimestamp() == userState.getLastProcessedTimestamp() && internalGetImpressions().equals(userState.internalGetImpressions()) && internalGetAdRequests().equals(userState.internalGetAdRequests()) && this.unknownFields.equals(userState.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        @Deprecated
        public Map<Integer, Timestamps> getAdRequests() {
            return getAdRequestsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public int getAdRequestsCount() {
            return internalGetAdRequests().i().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public Map<Integer, Timestamps> getAdRequestsMap() {
            return internalGetAdRequests().i();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps) {
            Map mapI = internalGetAdRequests().i();
            return mapI.containsKey(Integer.valueOf(i10)) ? (Timestamps) mapI.get(Integer.valueOf(i10)) : timestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public Timestamps getAdRequestsOrThrow(int i10) {
            Map mapI = internalGetAdRequests().i();
            if (mapI.containsKey(Integer.valueOf(i10))) {
                return (Timestamps) mapI.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        @Deprecated
        public Map<Integer, AdDomainTimestamps> getImpressions() {
            return getImpressionsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public int getImpressionsCount() {
            return internalGetImpressions().i().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public Map<Integer, AdDomainTimestamps> getImpressionsMap() {
            return internalGetImpressions().i();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps) {
            Map mapI = internalGetImpressions().i();
            return mapI.containsKey(Integer.valueOf(i10)) ? (AdDomainTimestamps) mapI.get(Integer.valueOf(i10)) : adDomainTimestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public AdDomainTimestamps getImpressionsOrThrow(int i10) {
            Map mapI = internalGetImpressions().i();
            if (mapI.containsKey(Integer.valueOf(i10))) {
                return (AdDomainTimestamps) mapI.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
        public long getLastProcessedTimestamp() {
            return this.lastProcessedTimestamp_;
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
            long j10 = this.lastProcessedTimestamp_;
            int iZ = j10 != 0 ? n.z(1, j10) : 0;
            for (Map.Entry entry : internalGetImpressions().i().entrySet()) {
                iZ += n.G(2, ImpressionsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
            }
            for (Map.Entry entry2 : internalGetAdRequests().i().entrySet()) {
                iZ += n.G(3, AdRequestsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry2.getKey()).w(entry2.getValue()).build());
            }
            int serializedSize = iZ + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(getLastProcessedTimestamp());
            if (!internalGetImpressions().i().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + internalGetImpressions().hashCode();
            }
            if (!internalGetAdRequests().i().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetAdRequests().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_fieldAccessorTable.d(UserState.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0
        protected w0 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetImpressions();
            }
            if (i10 == 3) {
                return internalGetAdRequests();
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
            return new UserState();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            long j10 = this.lastProcessedTimestamp_;
            if (j10 != 0) {
                nVar.H0(1, j10);
            }
            h0.serializeIntegerMapTo(nVar, internalGetImpressions(), ImpressionsDefaultEntryHolder.defaultEntry, 2);
            h0.serializeIntegerMapTo(nVar, internalGetAdRequests(), AdRequestsDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements UserStateOrBuilder {
            private w0 adRequests_;
            private int bitField0_;
            private w0 impressions_;
            private long lastProcessedTimestamp_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_descriptor;
            }

            private w0 internalGetAdRequests() {
                w0 w0Var = this.adRequests_;
                return w0Var == null ? w0.g(AdRequestsDefaultEntryHolder.defaultEntry) : w0Var;
            }

            private w0 internalGetImpressions() {
                w0 w0Var = this.impressions_;
                return w0Var == null ? w0.g(ImpressionsDefaultEntryHolder.defaultEntry) : w0Var;
            }

            private w0 internalGetMutableAdRequests() {
                onChanged();
                if (this.adRequests_ == null) {
                    this.adRequests_ = w0.p(AdRequestsDefaultEntryHolder.defaultEntry);
                }
                if (!this.adRequests_.m()) {
                    this.adRequests_ = this.adRequests_.f();
                }
                return this.adRequests_;
            }

            private w0 internalGetMutableImpressions() {
                onChanged();
                if (this.impressions_ == null) {
                    this.impressions_ = w0.p(ImpressionsDefaultEntryHolder.defaultEntry);
                }
                if (!this.impressions_.m()) {
                    this.impressions_ = this.impressions_.f();
                }
                return this.impressions_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearAdRequests() {
                internalGetMutableAdRequests().l().clear();
                return this;
            }

            public Builder clearImpressions() {
                internalGetMutableImpressions().l().clear();
                return this;
            }

            public Builder clearLastProcessedTimestamp() {
                this.lastProcessedTimestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public boolean containsAdRequests(int i10) {
                return internalGetAdRequests().i().containsKey(Integer.valueOf(i10));
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public boolean containsImpressions(int i10) {
                return internalGetImpressions().i().containsKey(Integer.valueOf(i10));
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            @Deprecated
            public Map<Integer, Timestamps> getAdRequests() {
                return getAdRequestsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public int getAdRequestsCount() {
                return internalGetAdRequests().i().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public Map<Integer, Timestamps> getAdRequestsMap() {
                return internalGetAdRequests().i();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps) {
                Map mapI = internalGetAdRequests().i();
                return mapI.containsKey(Integer.valueOf(i10)) ? (Timestamps) mapI.get(Integer.valueOf(i10)) : timestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public Timestamps getAdRequestsOrThrow(int i10) {
                Map mapI = internalGetAdRequests().i();
                if (mapI.containsKey(Integer.valueOf(i10))) {
                    return (Timestamps) mapI.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            @Deprecated
            public Map<Integer, AdDomainTimestamps> getImpressions() {
                return getImpressionsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public int getImpressionsCount() {
                return internalGetImpressions().i().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public Map<Integer, AdDomainTimestamps> getImpressionsMap() {
                return internalGetImpressions().i();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps) {
                Map mapI = internalGetImpressions().i();
                return mapI.containsKey(Integer.valueOf(i10)) ? (AdDomainTimestamps) mapI.get(Integer.valueOf(i10)) : adDomainTimestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public AdDomainTimestamps getImpressionsOrThrow(int i10) {
                Map mapI = internalGetImpressions().i();
                if (mapI.containsKey(Integer.valueOf(i10))) {
                    return (AdDomainTimestamps) mapI.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserStateOrBuilder
            public long getLastProcessedTimestamp() {
                return this.lastProcessedTimestamp_;
            }

            @Deprecated
            public Map<Integer, Timestamps> getMutableAdRequests() {
                return internalGetMutableAdRequests().l();
            }

            @Deprecated
            public Map<Integer, AdDomainTimestamps> getMutableImpressions() {
                return internalGetMutableImpressions().l();
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_UserState_fieldAccessorTable.d(UserState.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMapField(int i10) {
                if (i10 == 2) {
                    return internalGetImpressions();
                }
                if (i10 == 3) {
                    return internalGetAdRequests();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMutableMapField(int i10) {
                if (i10 == 2) {
                    return internalGetMutableImpressions();
                }
                if (i10 == 3) {
                    return internalGetMutableAdRequests();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAdRequests(int i10, Timestamps timestamps) {
                timestamps.getClass();
                internalGetMutableAdRequests().l().put(Integer.valueOf(i10), timestamps);
                return this;
            }

            public Builder putAllAdRequests(Map<Integer, Timestamps> map) {
                internalGetMutableAdRequests().l().putAll(map);
                return this;
            }

            public Builder putAllImpressions(Map<Integer, AdDomainTimestamps> map) {
                internalGetMutableImpressions().l().putAll(map);
                return this;
            }

            public Builder putImpressions(int i10, AdDomainTimestamps adDomainTimestamps) {
                adDomainTimestamps.getClass();
                internalGetMutableImpressions().l().put(Integer.valueOf(i10), adDomainTimestamps);
                return this;
            }

            public Builder removeAdRequests(int i10) {
                internalGetMutableAdRequests().l().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder removeImpressions(int i10) {
                internalGetMutableImpressions().l().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder setLastProcessedTimestamp(long j10) {
                this.lastProcessedTimestamp_ = j10;
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
            public UserState build() {
                UserState userStateBuildPartial = buildPartial();
                if (userStateBuildPartial.isInitialized()) {
                    return userStateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userStateBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserState buildPartial() {
                UserState userState = new UserState(this);
                userState.lastProcessedTimestamp_ = this.lastProcessedTimestamp_;
                userState.impressions_ = internalGetImpressions();
                userState.impressions_.n();
                userState.adRequests_ = internalGetAdRequests();
                userState.adRequests_.n();
                onBuilt();
                return userState;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public UserState getDefaultInstanceForType() {
                return UserState.getDefaultInstance();
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
                this.lastProcessedTimestamp_ = 0L;
                internalGetMutableImpressions().a();
                internalGetMutableAdRequests().a();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserState) {
                    return mergeFrom((UserState) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserState userState) {
                if (userState == UserState.getDefaultInstance()) {
                    return this;
                }
                if (userState.getLastProcessedTimestamp() != 0) {
                    setLastProcessedTimestamp(userState.getLastProcessedTimestamp());
                }
                internalGetMutableImpressions().o(userState.internalGetImpressions());
                internalGetMutableAdRequests().o(userState.internalGetAdRequests());
                mergeUnknownFields(((h0) userState).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserState r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserState r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.UserState.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$UserState$Builder");
            }
        }

        public static Builder newBuilder(UserState userState) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userState);
        }

        public static UserState parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(byteBuffer, wVar);
        }

        private UserState(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserState parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (UserState) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static UserState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public UserState getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserState parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserState() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static UserState parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (UserState) PARSER.parseFrom(bArr, wVar);
        }

        private UserState(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                if (iK == 8) {
                                    this.lastProcessedTimestamp_ = lVar.z();
                                } else if (iK == 18) {
                                    if ((i10 & 1) == 0) {
                                        this.impressions_ = w0.p(ImpressionsDefaultEntryHolder.defaultEntry);
                                        i10 |= 1;
                                    }
                                    u0 u0Var = (u0) lVar.A(ImpressionsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                    this.impressions_.l().put(u0Var.i(), u0Var.k());
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    if ((i10 & 2) == 0) {
                                        this.adRequests_ = w0.p(AdRequestsDefaultEntryHolder.defaultEntry);
                                        i10 |= 2;
                                    }
                                    u0 u0Var2 = (u0) lVar.A(AdRequestsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                    this.adRequests_.l().put(u0Var2.i(), u0Var2.k());
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

        public static UserState parseFrom(InputStream inputStream) throws IOException {
            return (UserState) h0.parseWithIOException(PARSER, inputStream);
        }

        public static UserState parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (UserState) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static UserState parseFrom(l lVar) throws IOException {
            return (UserState) h0.parseWithIOException(PARSER, lVar);
        }

        public static UserState parseFrom(l lVar, w wVar) throws IOException {
            return (UserState) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface UserStateOrBuilder extends MessageOrBuilder {
        boolean containsAdRequests(int i10);

        boolean containsImpressions(int i10);

        @Deprecated
        Map<Integer, Timestamps> getAdRequests();

        int getAdRequestsCount();

        Map<Integer, Timestamps> getAdRequestsMap();

        Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps);

        Timestamps getAdRequestsOrThrow(int i10);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        @Deprecated
        Map<Integer, AdDomainTimestamps> getImpressions();

        int getImpressionsCount();

        Map<Integer, AdDomainTimestamps> getImpressionsMap();

        AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps);

        AdDomainTimestamps getImpressionsOrThrow(int i10);

        long getLastProcessedTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class WindowMetrics extends h0 implements WindowMetricsOrBuilder {
        public static final int LAST_1D_FIELD_NUMBER = 2;
        public static final int LAST_1H_FIELD_NUMBER = 1;
        public static final int LAST_7D_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int last1D_;
        private int last1H_;
        private int last7D_;
        private byte memoizedIsInitialized;
        private static final WindowMetrics DEFAULT_INSTANCE = new WindowMetrics();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics.1
            @Override // com.explorestack.protobuf.p1
            public WindowMetrics parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new WindowMetrics(lVar, wVar);
            }
        };

        public static WindowMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WindowMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WindowMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WindowMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WindowMetrics)) {
                return super.equals(obj);
            }
            WindowMetrics windowMetrics = (WindowMetrics) obj;
            return getLast1H() == windowMetrics.getLast1H() && getLast1D() == windowMetrics.getLast1D() && getLast7D() == windowMetrics.getLast7D() && this.unknownFields.equals(windowMetrics.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
        public int getLast1D() {
            return this.last1D_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
        public int getLast1H() {
            return this.last1H_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
        public int getLast7D() {
            return this.last7D_;
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
            int i11 = this.last1H_;
            int iX = i11 != 0 ? n.x(1, i11) : 0;
            int i12 = this.last1D_;
            if (i12 != 0) {
                iX += n.x(2, i12);
            }
            int i13 = this.last7D_;
            if (i13 != 0) {
                iX += n.x(3, i13);
            }
            int serializedSize = iX + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getLast1H()) * 37) + 2) * 53) + getLast1D()) * 37) + 3) * 53) + getLast7D()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable.d(WindowMetrics.class, Builder.class);
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
            return new WindowMetrics();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            int i10 = this.last1H_;
            if (i10 != 0) {
                nVar.F0(1, i10);
            }
            int i11 = this.last1D_;
            if (i11 != 0) {
                nVar.F0(2, i11);
            }
            int i12 = this.last7D_;
            if (i12 != 0) {
                nVar.F0(3, i12);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements WindowMetricsOrBuilder {
            private int last1D_;
            private int last1H_;
            private int last7D_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearLast1D() {
                this.last1D_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLast1H() {
                this.last1H_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLast7D() {
                this.last7D_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
            public int getLast1D() {
                return this.last1D_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
            public int getLast1H() {
                return this.last1H_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetricsOrBuilder
            public int getLast7D() {
                return this.last7D_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SessionMetricsOuterClass.internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable.d(WindowMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setLast1D(int i10) {
                this.last1D_ = i10;
                onChanged();
                return this;
            }

            public Builder setLast1H(int i10) {
                this.last1H_ = i10;
                onChanged();
                return this;
            }

            public Builder setLast7D(int i10) {
                this.last7D_ = i10;
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
            public WindowMetrics build() {
                WindowMetrics windowMetricsBuildPartial = buildPartial();
                if (windowMetricsBuildPartial.isInitialized()) {
                    return windowMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) windowMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public WindowMetrics buildPartial() {
                WindowMetrics windowMetrics = new WindowMetrics(this);
                windowMetrics.last1H_ = this.last1H_;
                windowMetrics.last1D_ = this.last1D_;
                windowMetrics.last7D_ = this.last7D_;
                onBuilt();
                return windowMetrics;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public WindowMetrics getDefaultInstanceForType() {
                return WindowMetrics.getDefaultInstance();
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
                this.last1H_ = 0;
                this.last1D_ = 0;
                this.last7D_ = 0;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WindowMetrics) {
                    return mergeFrom((WindowMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WindowMetrics windowMetrics) {
                if (windowMetrics == WindowMetrics.getDefaultInstance()) {
                    return this;
                }
                if (windowMetrics.getLast1H() != 0) {
                    setLast1H(windowMetrics.getLast1H());
                }
                if (windowMetrics.getLast1D() != 0) {
                    setLast1D(windowMetrics.getLast1D());
                }
                if (windowMetrics.getLast7D() != 0) {
                    setLast7D(windowMetrics.getLast7D());
                }
                mergeUnknownFields(((h0) windowMetrics).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics.access$14000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$WindowMetrics r3 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$WindowMetrics r4 = (io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass.WindowMetrics.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sessionmetrics.SessionMetricsOuterClass$WindowMetrics$Builder");
            }
        }

        public static Builder newBuilder(WindowMetrics windowMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(windowMetrics);
        }

        public static WindowMetrics parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(byteBuffer, wVar);
        }

        private WindowMetrics(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindowMetrics parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (WindowMetrics) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static WindowMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public WindowMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static WindowMetrics parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private WindowMetrics() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindowMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static WindowMetrics parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (WindowMetrics) PARSER.parseFrom(bArr, wVar);
        }

        private WindowMetrics(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.last1H_ = lVar.y();
                            } else if (iK == 16) {
                                this.last1D_ = lVar.y();
                            } else if (iK != 24) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.last7D_ = lVar.y();
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

        public static WindowMetrics parseFrom(InputStream inputStream) throws IOException {
            return (WindowMetrics) h0.parseWithIOException(PARSER, inputStream);
        }

        public static WindowMetrics parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (WindowMetrics) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static WindowMetrics parseFrom(l lVar) throws IOException {
            return (WindowMetrics) h0.parseWithIOException(PARSER, lVar);
        }

        public static WindowMetrics parseFrom(l lVar, w wVar) throws IOException {
            return (WindowMetrics) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface WindowMetricsOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        int getLast1D();

        int getLast1H();

        int getLast7D();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_sessionmetrics_UserState_descriptor = descriptor2;
        internal_static_sessionmetrics_UserState_fieldAccessorTable = new h0.f(descriptor2, new String[]{"LastProcessedTimestamp", "Impressions", "AdRequests"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor = descriptor3;
        internal_static_sessionmetrics_UserState_ImpressionsEntry_fieldAccessorTable = new h0.f(descriptor3, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor = descriptor4;
        internal_static_sessionmetrics_UserState_AdRequestsEntry_fieldAccessorTable = new h0.f(descriptor4, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(1);
        internal_static_sessionmetrics_UserSession_descriptor = descriptor5;
        internal_static_sessionmetrics_UserSession_fieldAccessorTable = new h0.f(descriptor5, new String[]{"LastActivity", "MetricsByAdType", "SessionStart", "LastRequestRejectionReason"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_sessionmetrics_UserSession_Ecpm_descriptor = descriptor6;
        internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable = new h0.f(descriptor6, new String[]{"FirstPrices", "LastPrices", "Count"});
        Descriptors.Descriptor descriptor7 = descriptor5.getNestedTypes().get(1);
        internal_static_sessionmetrics_UserSession_Auction_descriptor = descriptor7;
        internal_static_sessionmetrics_UserSession_Auction_fieldAccessorTable = new h0.f(descriptor7, new String[]{"SourceRequestId", "WinnerBidderId", "LosersBidderId"});
        Descriptors.Descriptor descriptor8 = descriptor5.getNestedTypes().get(2);
        internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor = descriptor8;
        internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable = new h0.f(descriptor8, new String[]{"AdType", "Impressions", "AdRequests", "Bids", "Wins", "Losses", "Lurls", "Nurls", "CumulativeBidPrice", "CumulativeLurlPrice", "CumulativeNurlPrice", "Ecpm", "Auctions"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(2);
        internal_static_sessionmetrics_Timestamps_descriptor = descriptor9;
        internal_static_sessionmetrics_Timestamps_fieldAccessorTable = new h0.f(descriptor9, new String[]{"LastTimestamp", "Deltas", "DayBuckets"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        internal_static_sessionmetrics_Timestamps_DayBucket_descriptor = descriptor10;
        internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable = new h0.f(descriptor10, new String[]{"StartTime", "Count"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(3);
        internal_static_sessionmetrics_AdDomainTimestamps_descriptor = descriptor11;
        internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable = new h0.f(descriptor11, new String[]{"AdDomains"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor = descriptor12;
        internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_fieldAccessorTable = new h0.f(descriptor12, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(4);
        internal_static_sessionmetrics_WindowMetrics_descriptor = descriptor13;
        internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable = new h0.f(descriptor13, new String[]{"Last1H", "Last1D", "Last7D"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(5);
        internal_static_sessionmetrics_ImpressionMetrics_descriptor = descriptor14;
        internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable = new h0.f(descriptor14, new String[]{"AdType", "Domains"});
        Descriptors.Descriptor descriptor15 = descriptor14.getNestedTypes().get(0);
        internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor = descriptor15;
        internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable = new h0.f(descriptor15, new String[]{"Domain", "WindowMetrics"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(6);
        internal_static_sessionmetrics_AdRequestMetrics_descriptor = descriptor16;
        internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable = new h0.f(descriptor16, new String[]{"AdType", "WindowMetrics", "LastTimestamps"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(7);
        internal_static_sessionmetrics_SegmentMetrics_descriptor = descriptor17;
        internal_static_sessionmetrics_SegmentMetrics_fieldAccessorTable = new h0.f(descriptor17, new String[]{"IsPurchaser"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(8);
        internal_static_sessionmetrics_SessionMetrics_descriptor = descriptor18;
        internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable = new h0.f(descriptor18, new String[]{"Impressions", "AdRequests", "CurrentSession", "SegmentMetrics"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(9);
        internal_static_sessionmetrics_UserIdQuery_descriptor = descriptor19;
        internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable = new h0.f(descriptor19, new String[]{"UserId", RtspHeaders.TIMESTAMP});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(10);
        internal_static_sessionmetrics_AdRequest_descriptor = descriptor20;
        internal_static_sessionmetrics_AdRequest_fieldAccessorTable = new h0.f(descriptor20, new String[]{"UserId", "AdType", RtspHeaders.TIMESTAMP});
    }

    private SessionMetricsOuterClass() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(w wVar) {
    }

    public static void registerAllExtensions(u uVar) {
        registerAllExtensions((w) uVar);
    }
}
