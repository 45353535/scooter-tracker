package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
@Encodable
public abstract class ProtoEncoderDoNotUse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ProtobufEncoder f24359a = ProtobufEncoder.builder().configureWith(AutoProtoEncoderDoNotUseEncoder.CONFIG).build();

    public static byte[] encode(Object obj) {
        return f24359a.encode(obj);
    }

    public abstract ClientMetrics getClientMetrics();

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        f24359a.encode(obj, outputStream);
    }
}
