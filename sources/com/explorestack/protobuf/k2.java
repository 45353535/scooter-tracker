package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Descriptors.Descriptor f19143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final h0.f f19144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Descriptors.FileDescriptor f19145c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fgoogle/protobuf/timestamp.proto\u0012\u000fgoogle.protobuf\"+\n\tTimestamp\u0012\u000f\n\u0007seconds\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005nanos\u0018\u0002 \u0001(\u0005B\u0085\u0001\n\u0013com.google.protobufB\u000eTimestampProtoP\u0001Z2google.golang.org/protobuf/types/known/timestamppbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        f19143a = descriptor;
        f19144b = new h0.f(descriptor, new String[]{"Seconds", "Nanos"});
    }

    public static Descriptors.FileDescriptor a() {
        return f19145c;
    }
}
