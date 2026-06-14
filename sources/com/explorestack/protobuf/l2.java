package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Descriptors.Descriptor f19209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final h0.f f19210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Descriptors.Descriptor f19211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final h0.f f19212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Descriptors.Descriptor f19213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final h0.f f19214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Descriptors.Descriptor f19215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final h0.f f19216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Descriptors.Descriptor f19217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final h0.f f19218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Descriptors.FileDescriptor f19219k = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001agoogle/protobuf/type.proto\u0012\u000fgoogle.protobuf\u001a\u0019google/protobuf/any.proto\u001a$google/protobuf/source_context.proto\"×\u0001\n\u0004Type\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012&\n\u0006fields\u0018\u0002 \u0003(\u000b2\u0016.google.protobuf.Field\u0012\u000e\n\u0006oneofs\u0018\u0003 \u0003(\t\u0012(\n\u0007options\u0018\u0004 \u0003(\u000b2\u0017.google.protobuf.Option\u00126\n\u000esource_context\u0018\u0005 \u0001(\u000b2\u001e.google.protobuf.SourceContext\u0012'\n\u0006syntax\u0018\u0006 \u0001(\u000e2\u0017.google.protobuf.Syntax\"Õ\u0005\n\u0005Field\u0012)\n\u0004kind\u0018\u0001 \u0001(\u000e2\u001b.google.protobuf.Field.Kind\u00127\n\u000bcardinality\u0018\u0002 \u0001(\u000e2\".google.protobuf.Field.Cardinality\u0012\u000e\n\u0006number\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004name\u0018\u0004 \u0001(\t\u0012\u0010\n\btype_url\u0018\u0006 \u0001(\t\u0012\u0013\n\u000boneof_index\u0018\u0007 \u0001(\u0005\u0012\u000e\n\u0006packed\u0018\b \u0001(\b\u0012(\n\u0007options\u0018\t \u0003(\u000b2\u0017.google.protobuf.Option\u0012\u0011\n\tjson_name\u0018\n \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u000b \u0001(\t\"È\u0002\n\u0004Kind\u0012\u0010\n\fTYPE_UNKNOWN\u0010\u0000\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"t\n\u000bCardinality\u0012\u0017\n\u0013CARDINALITY_UNKNOWN\u0010\u0000\u0012\u0018\n\u0014CARDINALITY_OPTIONAL\u0010\u0001\u0012\u0018\n\u0014CARDINALITY_REQUIRED\u0010\u0002\u0012\u0018\n\u0014CARDINALITY_REPEATED\u0010\u0003\"Î\u0001\n\u0004Enum\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012-\n\tenumvalue\u0018\u0002 \u0003(\u000b2\u001a.google.protobuf.EnumValue\u0012(\n\u0007options\u0018\u0003 \u0003(\u000b2\u0017.google.protobuf.Option\u00126\n\u000esource_context\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.SourceContext\u0012'\n\u0006syntax\u0018\u0005 \u0001(\u000e2\u0017.google.protobuf.Syntax\"S\n\tEnumValue\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0002 \u0001(\u0005\u0012(\n\u0007options\u0018\u0003 \u0003(\u000b2\u0017.google.protobuf.Option\";\n\u0006Option\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012#\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.Any*.\n\u0006Syntax\u0012\u0011\n\rSYNTAX_PROTO2\u0010\u0000\u0012\u0011\n\rSYNTAX_PROTO3\u0010\u0001B{\n\u0013com.google.protobufB\tTypeProtoP\u0001Z-google.golang.org/protobuf/types/known/typepbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[]{f.a(), c2.a()});

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        f19209a = descriptor;
        f19210b = new h0.f(descriptor, new String[]{"Name", "Fields", "Oneofs", "Options", "SourceContext", "Syntax"});
        Descriptors.Descriptor descriptor2 = a().getMessageTypes().get(1);
        f19211c = descriptor2;
        f19212d = new h0.f(descriptor2, new String[]{"Kind", "Cardinality", "Number", "Name", "TypeUrl", "OneofIndex", "Packed", "Options", "JsonName", "DefaultValue"});
        Descriptors.Descriptor descriptor3 = a().getMessageTypes().get(2);
        f19213e = descriptor3;
        f19214f = new h0.f(descriptor3, new String[]{"Name", "Enumvalue", "Options", "SourceContext", "Syntax"});
        Descriptors.Descriptor descriptor4 = a().getMessageTypes().get(3);
        f19215g = descriptor4;
        f19216h = new h0.f(descriptor4, new String[]{"Name", "Number", "Options"});
        Descriptors.Descriptor descriptor5 = a().getMessageTypes().get(4);
        f19217i = descriptor5;
        f19218j = new h0.f(descriptor5, new String[]{"Name", "Value"});
        f.a();
        c2.a();
    }

    public static Descriptors.FileDescriptor a() {
        return f19219k;
    }
}
