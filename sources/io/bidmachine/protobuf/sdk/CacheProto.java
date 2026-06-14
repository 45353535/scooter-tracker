package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.u;
import com.explorestack.protobuf.w;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#bidmachine/protobuf/sdk/cache.proto\u0012\u001dbidmachine.protobuf.sdk.cache\"á\n\n\nAssetCache\u001a¬\u0002\n\rConfiguration\u0012Y\n\u0013clean_configuration\u0018\u0001 \u0001(\u000b2<.bidmachine.protobuf.sdk.cache.AssetCache.CleanConfiguration\u0012c\n\u0018connection_configuration\u0018\u0002 \u0001(\u000b2A.bidmachine.protobuf.sdk.cache.AssetCache.ConnectionConfiguration\u0012[\n\u0014policy_configuration\u0018\u0003 \u0001(\u000b2=.bidmachine.protobuf.sdk.cache.AssetCache.PolicyConfiguration\u001ak\n\u0012CleanConfiguration\u0012\u001a\n\u0012trigger_on_startup\u0018\u0001 \u0001(\b\u0012\u001a\n\u0012trigger_on_caching\u0018\u0002 \u0001(\b\u0012\u001d\n\u0015trigger_on_disk_issue\u0018\u0003 \u0001(\b\u001a_\n\u0017ConnectionConfiguration\u0012\u001f\n\u0017head_request_timeout_ms\u0018\u0001 \u0001(\u0003\u0012#\n\u001bdownload_request_timeout_ms\u0018\u0002 \u0001(\u0003\u001a½\u0001\n\u0013PolicyConfiguration\u0012Q\n\u000fdownload_policy\u0018\u0001 \u0001(\u000b28.bidmachine.protobuf.sdk.cache.AssetCache.DownloadPolicy\u0012S\n\u0011eviction_policies\u0018\u0002 \u0003(\u000b28.bidmachine.protobuf.sdk.cache.AssetCache.EvictionPolicy\u001a«\u0003\n\u000eEvictionPolicy\u0012\r\n\u0005score\u0018\u0001 \u0001(\u0001\u0012 \n\u0018min_disk_applied_percent\u0018\u0002 \u0001(\u0001\u0012 \n\u0018max_disk_applied_percent\u0018\u0003 \u0001(\u0001\u0012N\n\u000fmax_ttl_seconds\u0018\u0004 \u0001(\u000b25.bidmachine.protobuf.sdk.cache.AssetCache.PolicyLimit\u0012L\n\rmin_frequency\u0018\u0005 \u0001(\u000b25.bidmachine.protobuf.sdk.cache.AssetCache.PolicyLimit\u0012S\n\u0014max_image_size_bytes\u0018\u0006 \u0001(\u000b25.bidmachine.protobuf.sdk.cache.AssetCache.PolicyLimit\u0012S\n\u0014max_video_size_bytes\u0018\u0007 \u0001(\u000b25.bidmachine.protobuf.sdk.cache.AssetCache.PolicyLimit\u001aµ\u0001\n\u000eDownloadPolicy\u0012O\n\u0010max_ping_time_ms\u0018\u0001 \u0001(\u000b25.bidmachine.protobuf.sdk.cache.AssetCache.PolicyLimit\u0012R\n\u0013max_file_size_bytes\u0018\u0002 \u0001(\u000b25.bidmachine.protobuf.sdk.cache.AssetCache.PolicyLimit\u001a0\n\u000bPolicyLimit\u0012\u0011\n\tthreshold\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006weight\u0018\u0002 \u0001(\u0001B*\n\u001aio.bidmachine.protobuf.sdkB\nCacheProtoP\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_cache_AssetCache_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_fieldAccessorTable = new h0.f(descriptor2, new String[0]);
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_fieldAccessorTable = new h0.f(descriptor3, new String[]{"CleanConfiguration", "ConnectionConfiguration", "PolicyConfiguration"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_fieldAccessorTable = new h0.f(descriptor4, new String[]{"TriggerOnStartup", "TriggerOnCaching", "TriggerOnDiskIssue"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_fieldAccessorTable = new h0.f(descriptor5, new String[]{"HeadRequestTimeoutMs", "DownloadRequestTimeoutMs"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_fieldAccessorTable = new h0.f(descriptor6, new String[]{"DownloadPolicy", "EvictionPolicies"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(4);
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_fieldAccessorTable = new h0.f(descriptor7, new String[]{"Score", "MinDiskAppliedPercent", "MaxDiskAppliedPercent", "MaxTtlSeconds", "MinFrequency", "MaxImageSizeBytes", "MaxVideoSizeBytes"});
        Descriptors.Descriptor descriptor8 = descriptor2.getNestedTypes().get(5);
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_fieldAccessorTable = new h0.f(descriptor8, new String[]{"MaxPingTimeMs", "MaxFileSizeBytes"});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(6);
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_fieldAccessorTable = new h0.f(descriptor9, new String[]{"Threshold", "Weight"});
    }

    private CacheProto() {
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
