package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.u;
import com.explorestack.protobuf.w;

/* JADX INFO: loaded from: classes3.dex */
public final class SDKErrorsProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$bidmachine/protobuf/sdk/errors.proto\u0012\u001ebidmachine.protobuf.sdk.errors\"·\u0001\n\u0005Error\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00129\n\u0005error\u0018\u0002 \u0001(\u000b2*.bidmachine.protobuf.sdk.errors.Error.Data\u0012:\n\u0006reason\u0018\u0003 \u0001(\u000b2*.bidmachine.protobuf.sdk.errors.Error.Data\u001a)\n\u0004Data\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0011\u0012\u0013\n\u000bdescription\u0018\u0002 \u0001(\t*¬\u0003\n\u0014ErrorReasonAnalytics\u0012\"\n\u001eERROR_REASON_ANALYTICS_INVALID\u0010\u0000\u0012%\n ERROR_REASON_ANALYTICS_UNDEFINED\u0010Ð\u000f\u0012-\n(ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED\u0010´\u0010\u0012.\n)ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT\u0010µ\u0010\u0012/\n*ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT\u0010¶\u0010\u0012,\n'ERROR_REASON_ANALYTICS_READER_UNDEFINED\u0010\u0098\u0011\u0012-\n(ERROR_REASON_ANALYTICS_READER_NO_CONTENT\u0010\u0099\u0011\u0012.\n)ERROR_REASON_ANALYTICS_READER_BAD_CONTENT\u0010\u009a\u0011\u0012,\n'ERROR_REASON_ANALYTICS_READER_NO_ACCESS\u0010\u009b\u0011B.\n\u001aio.bidmachine.protobuf.sdkB\u000eSDKErrorsProtoP\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
    static final h0.f internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable = new h0.f(descriptor2, new String[]{"Name", "Error", "Reason"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable = new h0.f(descriptor3, new String[]{"Code", "Description"});
    }

    private SDKErrorsProto() {
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
