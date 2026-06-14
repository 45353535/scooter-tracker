package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Descriptors.Descriptor f19012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final h0.f f19013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Descriptors.Descriptor f19014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final h0.f f19015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Descriptors.Descriptor f19016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final h0.f f19017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Descriptors.Descriptor f19018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final h0.f f19019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Descriptors.FileDescriptor f19020i = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001cgoogle/protobuf/struct.proto\u0012\u000fgoogle.protobuf\"\u0084\u0001\n\u0006Struct\u00123\n\u0006fields\u0018\u0001 \u0003(\u000b2#.google.protobuf.Struct.FieldsEntry\u001aE\n\u000bFieldsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012%\n\u0005value\u0018\u0002 \u0001(\u000b2\u0016.google.protobuf.Value:\u00028\u0001\"ê\u0001\n\u0005Value\u00120\n\nnull_value\u0018\u0001 \u0001(\u000e2\u001a.google.protobuf.NullValueH\u0000\u0012\u0016\n\fnumber_value\u0018\u0002 \u0001(\u0001H\u0000\u0012\u0016\n\fstring_value\u0018\u0003 \u0001(\tH\u0000\u0012\u0014\n\nbool_value\u0018\u0004 \u0001(\bH\u0000\u0012/\n\fstruct_value\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.StructH\u0000\u00120\n\nlist_value\u0018\u0006 \u0001(\u000b2\u001a.google.protobuf.ListValueH\u0000B\u0006\n\u0004kind\"3\n\tListValue\u0012&\n\u0006values\u0018\u0001 \u0003(\u000b2\u0016.google.protobuf.Value*\u001b\n\tNullValue\u0012\u000e\n\nNULL_VALUE\u0010\u0000B\u007f\n\u0013com.google.protobufB\u000bStructProtoP\u0001Z/google.golang.org/protobuf/types/known/structpbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        f19012a = descriptor;
        f19013b = new h0.f(descriptor, new String[]{"Fields"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f19014c = descriptor2;
        f19015d = new h0.f(descriptor2, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor3 = a().getMessageTypes().get(1);
        f19016e = descriptor3;
        f19017f = new h0.f(descriptor3, new String[]{"NullValue", "NumberValue", "StringValue", "BoolValue", "StructValue", "ListValue", "Kind"});
        Descriptors.Descriptor descriptor4 = a().getMessageTypes().get(2);
        f19018g = descriptor4;
        f19019h = new h0.f(descriptor4, new String[]{"Values"});
    }

    public static Descriptors.FileDescriptor a() {
        return f19020i;
    }
}
