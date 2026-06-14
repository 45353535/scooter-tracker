package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Descriptors.Descriptor f18898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final h0.f f18899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Descriptors.FileDescriptor f18900c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$google/protobuf/source_context.proto\u0012\u000fgoogle.protobuf\"\"\n\rSourceContext\u0012\u0011\n\tfile_name\u0018\u0001 \u0001(\tB\u008a\u0001\n\u0013com.google.protobufB\u0012SourceContextProtoP\u0001Z6google.golang.org/protobuf/types/known/sourcecontextpb¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        f18898a = descriptor;
        f18899b = new h0.f(descriptor, new String[]{"FileName"});
    }

    public static Descriptors.FileDescriptor a() {
        return f18900c;
    }
}
