package com.explorestack.protobuf;

import androidx.compose.material.TextFieldImplKt;
import androidx.work.WorkInfo;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.r2;
import com.google.common.base.Ascii;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DescriptorProtos {
    private static final Descriptors.Descriptor A;
    private static final h0.f B;
    private static final Descriptors.Descriptor C;
    private static final h0.f D;
    private static final Descriptors.Descriptor E;
    private static final h0.f F;
    private static final Descriptors.Descriptor G;
    private static final h0.f H;
    private static final Descriptors.Descriptor I;
    private static final h0.f J;
    private static final Descriptors.Descriptor K;
    private static final h0.f L;
    private static final Descriptors.Descriptor M;
    private static final h0.f N;
    private static final Descriptors.Descriptor O;
    private static final h0.f P;
    private static final Descriptors.Descriptor Q;
    private static final h0.f R;
    private static final Descriptors.Descriptor S;
    private static final h0.f T;
    private static final Descriptors.Descriptor U;
    private static final h0.f V;
    private static final Descriptors.Descriptor W;
    private static final h0.f X;
    private static final Descriptors.Descriptor Y;
    private static final h0.f Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Descriptors.Descriptor f18311a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Descriptors.Descriptor f18312a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0.f f18313b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final h0.f f18314b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Descriptors.Descriptor f18315c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static Descriptors.FileDescriptor f18316c0 = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n google/protobuf/descriptor.proto\u0012\u000fgoogle.protobuf\"G\n\u0011FileDescriptorSet\u00122\n\u0004file\u0018\u0001 \u0003(\u000b2$.google.protobuf.FileDescriptorProto\"Û\u0003\n\u0013FileDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007package\u0018\u0002 \u0001(\t\u0012\u0012\n\ndependency\u0018\u0003 \u0003(\t\u0012\u0019\n\u0011public_dependency\u0018\n \u0003(\u0005\u0012\u0017\n\u000fweak_dependency\u0018\u000b \u0003(\u0005\u00126\n\fmessage_type\u0018\u0004 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0005 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u00128\n\u0007service\u0018\u0006 \u0003(\u000b2'.google.protobuf.ServiceDescriptorProto\u00128\n\textension\u0018\u0007 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u0012-\n\u0007options\u0018\b \u0001(\u000b2\u001c.google.protobuf.FileOptions\u00129\n\u0010source_code_info\u0018\t \u0001(\u000b2\u001f.google.protobuf.SourceCodeInfo\u0012\u000e\n\u0006syntax\u0018\f \u0001(\t\"©\u0005\n\u000fDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00124\n\u0005field\u0018\u0002 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00128\n\textension\u0018\u0006 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00125\n\u000bnested_type\u0018\u0003 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0004 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u0012H\n\u000fextension_range\u0018\u0005 \u0003(\u000b2/.google.protobuf.DescriptorProto.ExtensionRange\u00129\n\noneof_decl\u0018\b \u0003(\u000b2%.google.protobuf.OneofDescriptorProto\u00120\n\u0007options\u0018\u0007 \u0001(\u000b2\u001f.google.protobuf.MessageOptions\u0012F\n\u000ereserved_range\u0018\t \u0003(\u000b2..google.protobuf.DescriptorProto.ReservedRange\u0012\u0015\n\rreserved_name\u0018\n \u0003(\t\u001ae\n\u000eExtensionRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\u00127\n\u0007options\u0018\u0003 \u0001(\u000b2&.google.protobuf.ExtensionRangeOptions\u001a+\n\rReservedRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\"g\n\u0015ExtensionRangeOptions\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Õ\u0005\n\u0014FieldDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0003 \u0001(\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000e2+.google.protobuf.FieldDescriptorProto.Label\u00128\n\u0004type\u0018\u0005 \u0001(\u000e2*.google.protobuf.FieldDescriptorProto.Type\u0012\u0011\n\ttype_name\u0018\u0006 \u0001(\t\u0012\u0010\n\bextendee\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012\u0013\n\u000boneof_index\u0018\t \u0001(\u0005\u0012\u0011\n\tjson_name\u0018\n \u0001(\t\u0012.\n\u0007options\u0018\b \u0001(\u000b2\u001d.google.protobuf.FieldOptions\u0012\u0017\n\u000fproto3_optional\u0018\u0011 \u0001(\b\"¶\u0002\n\u0004Type\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"C\n\u0005Label\u0012\u0012\n\u000eLABEL_OPTIONAL\u0010\u0001\u0012\u0012\n\u000eLABEL_REQUIRED\u0010\u0002\u0012\u0012\n\u000eLABEL_REPEATED\u0010\u0003\"T\n\u0014OneofDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012.\n\u0007options\u0018\u0002 \u0001(\u000b2\u001d.google.protobuf.OneofOptions\"¤\u0002\n\u0013EnumDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000b2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.EnumOptions\u0012N\n\u000ereserved_range\u0018\u0004 \u0003(\u000b26.google.protobuf.EnumDescriptorProto.EnumReservedRange\u0012\u0015\n\rreserved_name\u0018\u0005 \u0003(\t\u001a/\n\u0011EnumReservedRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007options\u0018\u0003 \u0001(\u000b2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000b2&.google.protobuf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000b2\u001f.google.protobuf.ServiceOptions\"Á\u0001\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\ninput_type\u0018\u0002 \u0001(\t\u0012\u0013\n\u000boutput_type\u0018\u0003 \u0001(\t\u0012/\n\u0007options\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.MethodOptions\u0012\u001f\n\u0010client_streaming\u0018\u0005 \u0001(\b:\u0005false\u0012\u001f\n\u0010server_streaming\u0018\u0006 \u0001(\b:\u0005false\"¥\u0006\n\u000bFileOptions\u0012\u0014\n\fjava_package\u0018\u0001 \u0001(\t\u0012\u001c\n\u0014java_outer_classname\u0018\b \u0001(\t\u0012\"\n\u0013java_multiple_files\u0018\n \u0001(\b:\u0005false\u0012)\n\u001djava_generate_equals_and_hash\u0018\u0014 \u0001(\bB\u0002\u0018\u0001\u0012%\n\u0016java_string_check_utf8\u0018\u001b \u0001(\b:\u0005false\u0012F\n\foptimize_for\u0018\t \u0001(\u000e2).google.protobuf.FileOptions.OptimizeMode:\u0005SPEED\u0012\u0012\n\ngo_package\u0018\u000b \u0001(\t\u0012\"\n\u0013cc_generic_services\u0018\u0010 \u0001(\b:\u0005false\u0012$\n\u0015java_generic_services\u0018\u0011 \u0001(\b:\u0005false\u0012\"\n\u0013py_generic_services\u0018\u0012 \u0001(\b:\u0005false\u0012#\n\u0014php_generic_services\u0018* \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0017 \u0001(\b:\u0005false\u0012\u001e\n\u0010cc_enable_arenas\u0018\u001f \u0001(\b:\u0004true\u0012\u0019\n\u0011objc_class_prefix\u0018$ \u0001(\t\u0012\u0018\n\u0010csharp_namespace\u0018% \u0001(\t\u0012\u0014\n\fswift_prefix\u0018' \u0001(\t\u0012\u0018\n\u0010php_class_prefix\u0018( \u0001(\t\u0012\u0015\n\rphp_namespace\u0018) \u0001(\t\u0012\u001e\n\u0016php_metadata_namespace\u0018, \u0001(\t\u0012\u0014\n\fruby_package\u0018- \u0001(\t\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\":\n\fOptimizeMode\u0012\t\n\u0005SPEED\u0010\u0001\u0012\r\n\tCODE_SIZE\u0010\u0002\u0012\u0010\n\fLITE_RUNTIME\u0010\u0003*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b&\u0010'\"\u0084\u0002\n\u000eMessageOptions\u0012&\n\u0017message_set_wire_format\u0018\u0001 \u0001(\b:\u0005false\u0012.\n\u001fno_standard_descriptor_accessor\u0018\u0002 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u0011\n\tmap_entry\u0018\u0007 \u0001(\b\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005J\u0004\b\u0005\u0010\u0006J\u0004\b\u0006\u0010\u0007J\u0004\b\b\u0010\tJ\u0004\b\t\u0010\n\"\u009e\u0003\n\fFieldOptions\u0012:\n\u0005ctype\u0018\u0001 \u0001(\u000e2#.google.protobuf.FieldOptions.CType:\u0006STRING\u0012\u000e\n\u0006packed\u0018\u0002 \u0001(\b\u0012?\n\u0006jstype\u0018\u0006 \u0001(\u000e2$.google.protobuf.FieldOptions.JSType:\tJS_NORMAL\u0012\u0013\n\u0004lazy\u0018\u0005 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u0013\n\u0004weak\u0018\n \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"/\n\u0005CType\u0012\n\n\u0006STRING\u0010\u0000\u0012\b\n\u0004CORD\u0010\u0001\u0012\u0010\n\fSTRING_PIECE\u0010\u0002\"5\n\u0006JSType\u0012\r\n\tJS_NORMAL\u0010\u0000\u0012\r\n\tJS_STRING\u0010\u0001\u0012\r\n\tJS_NUMBER\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005\"^\n\fOneofOptions\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0093\u0001\n\u000bEnumOptions\u0012\u0013\n\u000ballow_alias\u0018\u0002 \u0001(\b\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0005\u0010\u0006\"}\n\u0010EnumValueOptions\u0012\u0019\n\ndeprecated\u0018\u0001 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"{\n\u000eServiceOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u00ad\u0002\n\rMethodOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012_\n\u0011idempotency_level\u0018\" \u0001(\u000e2/.google.protobuf.MethodOptions.IdempotencyLevel:\u0013IDEMPOTENCY_UNKNOWN\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"P\n\u0010IdempotencyLevel\u0012\u0017\n\u0013IDEMPOTENCY_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fNO_SIDE_EFFECTS\u0010\u0001\u0012\u000e\n\nIDEMPOTENT\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u009e\u0002\n\u0013UninterpretedOption\u0012;\n\u0004name\u0018\u0002 \u0003(\u000b2-.google.protobuf.UninterpretedOption.NamePart\u0012\u0018\n\u0010identifier_value\u0018\u0003 \u0001(\t\u0012\u001a\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004\u0012\u001a\n\u0012negative_int_value\u0018\u0005 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018\u0006 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0007 \u0001(\f\u0012\u0017\n\u000faggregate_value\u0018\b \u0001(\t\u001a3\n\bNamePart\u0012\u0011\n\tname_part\u0018\u0001 \u0002(\t\u0012\u0014\n\fis_extension\u0018\u0002 \u0002(\b\"Õ\u0001\n\u000eSourceCodeInfo\u0012:\n\blocation\u0018\u0001 \u0003(\u000b2(.google.protobuf.SourceCodeInfo.Location\u001a\u0086\u0001\n\bLocation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0010\n\u0004span\u0018\u0002 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0018\n\u0010leading_comments\u0018\u0003 \u0001(\t\u0012\u0019\n\u0011trailing_comments\u0018\u0004 \u0001(\t\u0012!\n\u0019leading_detached_comments\u0018\u0006 \u0003(\t\"§\u0001\n\u0011GeneratedCodeInfo\u0012A\n\nannotation\u0018\u0001 \u0003(\u000b2-.google.protobuf.GeneratedCodeInfo.Annotation\u001aO\n\nAnnotation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0013\n\u000bsource_file\u0018\u0002 \u0001(\t\u0012\r\n\u0005begin\u0018\u0003 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0004 \u0001(\u0005B~\n\u0013com.google.protobufB\u0010DescriptorProtosH\u0001Z-google.golang.org/protobuf/types/descriptorpbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001aGoogle.Protobuf.Reflection"}, new Descriptors.FileDescriptor[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h0.f f18317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Descriptors.Descriptor f18318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h0.f f18319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Descriptors.Descriptor f18320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h0.f f18321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Descriptors.Descriptor f18322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h0.f f18323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Descriptors.Descriptor f18324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final h0.f f18325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Descriptors.Descriptor f18326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final h0.f f18327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Descriptors.Descriptor f18328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final h0.f f18329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Descriptors.Descriptor f18330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final h0.f f18331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Descriptors.Descriptor f18332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final h0.f f18333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Descriptors.Descriptor f18334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final h0.f f18335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Descriptors.Descriptor f18336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final h0.f f18337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Descriptors.Descriptor f18338y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final h0.f f18339z;

    public static final class FieldDescriptorProto extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final FieldDescriptorProto f18340o = new FieldDescriptorProto();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final p1 f18341p = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f18345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile Object f18347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile Object f18348h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile Object f18349i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f18350j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private volatile Object f18351k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private FieldOptions f18352l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f18353m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private byte f18354n;

        public enum Label implements j0.c {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);

            public static final int LABEL_OPTIONAL_VALUE = 1;
            public static final int LABEL_REPEATED_VALUE = 3;
            public static final int LABEL_REQUIRED_VALUE = 2;
            private final int value;
            private static final j0.d internalValueMap = new a();
            private static final Label[] VALUES = values();

            static class a implements j0.d {
                a() {
                }
            }

            Label(int i10) {
                this.value = i10;
            }

            public static Label forNumber(int i10) {
                if (i10 == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i10 == 2) {
                    return LABEL_REQUIRED;
                }
                if (i10 != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FieldDescriptorProto.getDescriptor().getEnumTypes().get(1);
            }

            public static j0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.explorestack.protobuf.j0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Label valueOf(int i10) {
                return forNumber(i10);
            }

            public static Label valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum Type implements j0.c {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            public static final int TYPE_BOOL_VALUE = 8;
            public static final int TYPE_BYTES_VALUE = 12;
            public static final int TYPE_DOUBLE_VALUE = 1;
            public static final int TYPE_ENUM_VALUE = 14;
            public static final int TYPE_FIXED32_VALUE = 7;
            public static final int TYPE_FIXED64_VALUE = 6;
            public static final int TYPE_FLOAT_VALUE = 2;
            public static final int TYPE_GROUP_VALUE = 10;
            public static final int TYPE_INT32_VALUE = 5;
            public static final int TYPE_INT64_VALUE = 3;
            public static final int TYPE_MESSAGE_VALUE = 11;
            public static final int TYPE_SFIXED32_VALUE = 15;
            public static final int TYPE_SFIXED64_VALUE = 16;
            public static final int TYPE_SINT32_VALUE = 17;
            public static final int TYPE_SINT64_VALUE = 18;
            public static final int TYPE_STRING_VALUE = 9;
            public static final int TYPE_UINT32_VALUE = 13;
            public static final int TYPE_UINT64_VALUE = 4;
            private final int value;
            private static final j0.d internalValueMap = new a();
            private static final Type[] VALUES = values();

            static class a implements j0.d {
                a() {
                }
            }

            Type(int i10) {
                this.value = i10;
            }

            public static Type forNumber(int i10) {
                switch (i10) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FieldDescriptorProto.getDescriptor().getEnumTypes().get(0);
            }

            public static j0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.explorestack.protobuf.j0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Type valueOf(int i10) {
                return forNumber(i10);
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public FieldDescriptorProto parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new FieldDescriptorProto(lVar, wVar);
            }
        }

        public static FieldDescriptorProto E() {
            return f18340o;
        }

        public static b a0() {
            return f18340o.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18326m;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public FieldDescriptorProto getDefaultInstanceForType() {
            return f18340o;
        }

        public String G() {
            Object obj = this.f18349i;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18349i = stringUtf8;
            }
            return stringUtf8;
        }

        public String H() {
            Object obj = this.f18348h;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18348h = stringUtf8;
            }
            return stringUtf8;
        }

        public String I() {
            Object obj = this.f18351k;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18351k = stringUtf8;
            }
            return stringUtf8;
        }

        public Label J() {
            Label labelValueOf = Label.valueOf(this.f18345e);
            return labelValueOf == null ? Label.LABEL_OPTIONAL : labelValueOf;
        }

        public int K() {
            return this.f18344d;
        }

        public int L() {
            return this.f18350j;
        }

        public FieldOptions M() {
            FieldOptions fieldOptions = this.f18352l;
            return fieldOptions == null ? FieldOptions.D() : fieldOptions;
        }

        public boolean N() {
            return this.f18353m;
        }

        public Type O() {
            Type typeValueOf = Type.valueOf(this.f18346f);
            return typeValueOf == null ? Type.TYPE_DOUBLE : typeValueOf;
        }

        public String P() {
            Object obj = this.f18347g;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18347g = stringUtf8;
            }
            return stringUtf8;
        }

        public boolean Q() {
            return (this.f18342b & 64) != 0;
        }

        public boolean S() {
            return (this.f18342b & 32) != 0;
        }

        public boolean T() {
            return (this.f18342b & 256) != 0;
        }

        public boolean U() {
            return (this.f18342b & 2) != 0;
        }

        public boolean V() {
            return (this.f18342b & 128) != 0;
        }

        public boolean W() {
            return (this.f18342b & 512) != 0;
        }

        public boolean X() {
            return (this.f18342b & 1024) != 0;
        }

        public boolean Y() {
            return (this.f18342b & 8) != 0;
        }

        public boolean Z() {
            return (this.f18342b & 16) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return a0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18340o ? new b() : new b().u(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldDescriptorProto)) {
                return super.equals(obj);
            }
            FieldDescriptorProto fieldDescriptorProto = (FieldDescriptorProto) obj;
            if (hasName() != fieldDescriptorProto.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(fieldDescriptorProto.getName())) || U() != fieldDescriptorProto.U()) {
                return false;
            }
            if ((U() && K() != fieldDescriptorProto.K()) || hasLabel() != fieldDescriptorProto.hasLabel()) {
                return false;
            }
            if ((hasLabel() && this.f18345e != fieldDescriptorProto.f18345e) || Y() != fieldDescriptorProto.Y()) {
                return false;
            }
            if ((Y() && this.f18346f != fieldDescriptorProto.f18346f) || Z() != fieldDescriptorProto.Z()) {
                return false;
            }
            if ((Z() && !P().equals(fieldDescriptorProto.P())) || S() != fieldDescriptorProto.S()) {
                return false;
            }
            if ((S() && !H().equals(fieldDescriptorProto.H())) || Q() != fieldDescriptorProto.Q()) {
                return false;
            }
            if ((Q() && !G().equals(fieldDescriptorProto.G())) || V() != fieldDescriptorProto.V()) {
                return false;
            }
            if ((V() && L() != fieldDescriptorProto.L()) || T() != fieldDescriptorProto.T()) {
                return false;
            }
            if ((T() && !I().equals(fieldDescriptorProto.I())) || W() != fieldDescriptorProto.W()) {
                return false;
            }
            if ((!W() || M().equals(fieldDescriptorProto.M())) && X() == fieldDescriptorProto.X()) {
                return (!X() || N() == fieldDescriptorProto.N()) && this.unknownFields.equals(fieldDescriptorProto.unknownFields);
            }
            return false;
        }

        public String getName() {
            Object obj = this.f18343c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18343c = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18341p;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18342b & 1) != 0 ? h0.computeStringSize(1, this.f18343c) : 0;
            if ((this.f18342b & 32) != 0) {
                iComputeStringSize += h0.computeStringSize(2, this.f18348h);
            }
            if ((this.f18342b & 2) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.x(3, this.f18344d);
            }
            if ((this.f18342b & 4) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.l(4, this.f18345e);
            }
            if ((this.f18342b & 8) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.l(5, this.f18346f);
            }
            if ((this.f18342b & 16) != 0) {
                iComputeStringSize += h0.computeStringSize(6, this.f18347g);
            }
            if ((this.f18342b & 64) != 0) {
                iComputeStringSize += h0.computeStringSize(7, this.f18349i);
            }
            if ((this.f18342b & 512) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.G(8, M());
            }
            if ((this.f18342b & 128) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.x(9, this.f18350j);
            }
            if ((this.f18342b & 256) != 0) {
                iComputeStringSize += h0.computeStringSize(10, this.f18351k);
            }
            if ((this.f18342b & 1024) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(17, this.f18353m);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasLabel() {
            return (this.f18342b & 4) != 0;
        }

        public boolean hasName() {
            return (this.f18342b & 1) != 0;
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
            if (U()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + K();
            }
            if (hasLabel()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + this.f18345e;
            }
            if (Y()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + this.f18346f;
            }
            if (Z()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + P().hashCode();
            }
            if (S()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + H().hashCode();
            }
            if (Q()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + G().hashCode();
            }
            if (V()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + L();
            }
            if (T()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + I().hashCode();
            }
            if (W()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + M().hashCode();
            }
            if (X()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + j0.d(N());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18327n.d(FieldDescriptorProto.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18354n;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!W() || M().isInitialized()) {
                this.f18354n = (byte) 1;
                return true;
            }
            this.f18354n = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new FieldDescriptorProto();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            if ((this.f18342b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18343c);
            }
            if ((this.f18342b & 32) != 0) {
                h0.writeString(nVar, 2, this.f18348h);
            }
            if ((this.f18342b & 2) != 0) {
                nVar.F0(3, this.f18344d);
            }
            if ((this.f18342b & 4) != 0) {
                nVar.v0(4, this.f18345e);
            }
            if ((this.f18342b & 8) != 0) {
                nVar.v0(5, this.f18346f);
            }
            if ((this.f18342b & 16) != 0) {
                h0.writeString(nVar, 6, this.f18347g);
            }
            if ((this.f18342b & 64) != 0) {
                h0.writeString(nVar, 7, this.f18349i);
            }
            if ((this.f18342b & 512) != 0) {
                nVar.J0(8, M());
            }
            if ((this.f18342b & 128) != 0) {
                nVar.F0(9, this.f18350j);
            }
            if ((this.f18342b & 256) != 0) {
                h0.writeString(nVar, 10, this.f18351k);
            }
            if ((this.f18342b & 1024) != 0) {
                nVar.n0(17, this.f18353m);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18355b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18356c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18357d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f18358e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f18359f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Object f18360g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Object f18361h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Object f18362i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f18363j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Object f18364k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private FieldOptions f18365l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private a2 f18366m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private boolean f18367n;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            private a2 r() {
                if (this.f18366m == null) {
                    this.f18366m = new a2(q(), getParentForChildren(), isClean());
                    this.f18365l = null;
                }
                return this.f18366m;
            }

            public b A(int i10) {
                this.f18355b |= 2;
                this.f18357d = i10;
                onChanged();
                return this;
            }

            public b B(int i10) {
                this.f18355b |= 128;
                this.f18363j = i10;
                onChanged();
                return this;
            }

            public b C(boolean z10) {
                this.f18355b |= 1024;
                this.f18367n = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public b E(Type type) {
                type.getClass();
                this.f18355b |= 8;
                this.f18359f = type.getNumber();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18326m;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public FieldDescriptorProto build() {
                FieldDescriptorProto fieldDescriptorProtoBuildPartial = buildPartial();
                if (fieldDescriptorProtoBuildPartial.isInitialized()) {
                    return fieldDescriptorProtoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fieldDescriptorProtoBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18327n.d(FieldDescriptorProto.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return !s() || q().isInitialized();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public FieldDescriptorProto buildPartial() {
                FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto(this);
                int i10 = this.f18355b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                fieldDescriptorProto.f18343c = this.f18356c;
                if ((i10 & 2) != 0) {
                    fieldDescriptorProto.f18344d = this.f18357d;
                    i11 |= 2;
                }
                if ((i10 & 4) != 0) {
                    i11 |= 4;
                }
                fieldDescriptorProto.f18345e = this.f18358e;
                if ((i10 & 8) != 0) {
                    i11 |= 8;
                }
                fieldDescriptorProto.f18346f = this.f18359f;
                if ((i10 & 16) != 0) {
                    i11 |= 16;
                }
                fieldDescriptorProto.f18347g = this.f18360g;
                if ((i10 & 32) != 0) {
                    i11 |= 32;
                }
                fieldDescriptorProto.f18348h = this.f18361h;
                if ((i10 & 64) != 0) {
                    i11 |= 64;
                }
                fieldDescriptorProto.f18349i = this.f18362i;
                if ((i10 & 128) != 0) {
                    fieldDescriptorProto.f18350j = this.f18363j;
                    i11 |= 128;
                }
                if ((i10 & 256) != 0) {
                    i11 |= 256;
                }
                fieldDescriptorProto.f18351k = this.f18364k;
                if ((i10 & 512) != 0) {
                    a2 a2Var = this.f18366m;
                    if (a2Var == null) {
                        fieldDescriptorProto.f18352l = this.f18365l;
                    } else {
                        fieldDescriptorProto.f18352l = (FieldOptions) a2Var.a();
                    }
                    i11 |= 512;
                }
                if ((i10 & 1024) != 0) {
                    fieldDescriptorProto.f18353m = this.f18367n;
                    i11 |= 1024;
                }
                fieldDescriptorProto.f18342b = i11;
                onBuilt();
                return fieldDescriptorProto;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f18356c = "";
                int i10 = this.f18355b;
                this.f18357d = 0;
                this.f18358e = 1;
                this.f18359f = 1;
                this.f18360g = "";
                this.f18361h = "";
                this.f18362i = "";
                this.f18363j = 0;
                this.f18364k = "";
                this.f18355b = i10 & WorkInfo.STOP_REASON_UNKNOWN;
                a2 a2Var = this.f18366m;
                if (a2Var == null) {
                    this.f18365l = null;
                } else {
                    a2Var.b();
                }
                int i11 = this.f18355b;
                this.f18367n = false;
                this.f18355b = i11 & (-1537);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public FieldDescriptorProto getDefaultInstanceForType() {
                return FieldDescriptorProto.E();
            }

            public FieldOptions q() {
                a2 a2Var = this.f18366m;
                if (a2Var != null) {
                    return (FieldOptions) a2Var.e();
                }
                FieldOptions fieldOptions = this.f18365l;
                return fieldOptions == null ? FieldOptions.D() : fieldOptions;
            }

            public boolean s() {
                return (this.f18355b & 512) != 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.FieldDescriptorProto.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.FieldDescriptorProto.f18341p     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$FieldDescriptorProto r3 = (com.explorestack.protobuf.DescriptorProtos.FieldDescriptorProto) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.u(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$FieldDescriptorProto r4 = (com.explorestack.protobuf.DescriptorProtos.FieldDescriptorProto) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.u(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.FieldDescriptorProto.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$FieldDescriptorProto$b");
            }

            public b u(FieldDescriptorProto fieldDescriptorProto) {
                if (fieldDescriptorProto == FieldDescriptorProto.E()) {
                    return this;
                }
                if (fieldDescriptorProto.hasName()) {
                    this.f18355b |= 1;
                    this.f18356c = fieldDescriptorProto.f18343c;
                    onChanged();
                }
                if (fieldDescriptorProto.U()) {
                    A(fieldDescriptorProto.K());
                }
                if (fieldDescriptorProto.hasLabel()) {
                    z(fieldDescriptorProto.J());
                }
                if (fieldDescriptorProto.Y()) {
                    E(fieldDescriptorProto.O());
                }
                if (fieldDescriptorProto.Z()) {
                    this.f18355b |= 16;
                    this.f18360g = fieldDescriptorProto.f18347g;
                    onChanged();
                }
                if (fieldDescriptorProto.S()) {
                    this.f18355b |= 32;
                    this.f18361h = fieldDescriptorProto.f18348h;
                    onChanged();
                }
                if (fieldDescriptorProto.Q()) {
                    this.f18355b |= 64;
                    this.f18362i = fieldDescriptorProto.f18349i;
                    onChanged();
                }
                if (fieldDescriptorProto.V()) {
                    B(fieldDescriptorProto.L());
                }
                if (fieldDescriptorProto.T()) {
                    this.f18355b |= 256;
                    this.f18364k = fieldDescriptorProto.f18351k;
                    onChanged();
                }
                if (fieldDescriptorProto.W()) {
                    w(fieldDescriptorProto.M());
                }
                if (fieldDescriptorProto.X()) {
                    C(fieldDescriptorProto.N());
                }
                mergeUnknownFields(fieldDescriptorProto.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof FieldDescriptorProto) {
                    return u((FieldDescriptorProto) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b w(FieldOptions fieldOptions) {
                FieldOptions fieldOptions2;
                a2 a2Var = this.f18366m;
                if (a2Var == null) {
                    if ((this.f18355b & 512) == 0 || (fieldOptions2 = this.f18365l) == null || fieldOptions2 == FieldOptions.D()) {
                        this.f18365l = fieldOptions;
                    } else {
                        this.f18365l = FieldOptions.V(this.f18365l).F(fieldOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(fieldOptions);
                }
                this.f18355b |= 512;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b z(Label label) {
                label.getClass();
                this.f18355b |= 4;
                this.f18358e = label.getNumber();
                onChanged();
                return this;
            }

            private b() {
                this.f18356c = "";
                this.f18358e = 1;
                this.f18359f = 1;
                this.f18360g = "";
                this.f18361h = "";
                this.f18362i = "";
                this.f18364k = "";
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18356c = "";
                this.f18358e = 1;
                this.f18359f = 1;
                this.f18360g = "";
                this.f18361h = "";
                this.f18362i = "";
                this.f18364k = "";
                maybeForceBuilderInitialization();
            }
        }

        private FieldDescriptorProto(h0.b bVar) {
            super(bVar);
            this.f18354n = (byte) -1;
        }

        private FieldDescriptorProto() {
            this.f18354n = (byte) -1;
            this.f18343c = "";
            this.f18345e = 1;
            this.f18346f = 1;
            this.f18347g = "";
            this.f18348h = "";
            this.f18349i = "";
            this.f18351k = "";
        }

        private FieldDescriptorProto(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                                break;
                            case 10:
                                ByteString byteStringR = lVar.r();
                                this.f18342b = 1 | this.f18342b;
                                this.f18343c = byteStringR;
                                break;
                            case 18:
                                ByteString byteStringR2 = lVar.r();
                                this.f18342b |= 32;
                                this.f18348h = byteStringR2;
                                break;
                            case 24:
                                this.f18342b |= 2;
                                this.f18344d = lVar.y();
                                break;
                            case 32:
                                int iT = lVar.t();
                                if (Label.valueOf(iT) == null) {
                                    bVarG.E(4, iT);
                                } else {
                                    this.f18342b |= 4;
                                    this.f18345e = iT;
                                }
                                break;
                            case 40:
                                int iT2 = lVar.t();
                                if (Type.valueOf(iT2) == null) {
                                    bVarG.E(5, iT2);
                                } else {
                                    this.f18342b |= 8;
                                    this.f18346f = iT2;
                                }
                                break;
                            case 50:
                                ByteString byteStringR3 = lVar.r();
                                this.f18342b |= 16;
                                this.f18347g = byteStringR3;
                                break;
                            case 58:
                                ByteString byteStringR4 = lVar.r();
                                this.f18342b |= 64;
                                this.f18349i = byteStringR4;
                                break;
                            case 66:
                                FieldOptions.b builder = (this.f18342b & 512) != 0 ? this.f18352l.toBuilder() : null;
                                FieldOptions fieldOptions = (FieldOptions) lVar.A(FieldOptions.f18369m, wVar);
                                this.f18352l = fieldOptions;
                                if (builder != null) {
                                    builder.F(fieldOptions);
                                    this.f18352l = builder.buildPartial();
                                }
                                this.f18342b |= 512;
                                break;
                            case 72:
                                this.f18342b |= 128;
                                this.f18350j = lVar.y();
                                break;
                            case 82:
                                ByteString byteStringR5 = lVar.r();
                                this.f18342b |= 256;
                                this.f18351k = byteStringR5;
                                break;
                            case 136:
                                this.f18342b |= 1024;
                                this.f18353m = lVar.q();
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
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class FieldOptions extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final FieldOptions f18368l = new FieldOptions();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final p1 f18369m = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f18374g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f18375h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f18376i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f18377j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private byte f18378k;

        public enum CType implements j0.c {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);

            public static final int CORD_VALUE = 1;
            public static final int STRING_PIECE_VALUE = 2;
            public static final int STRING_VALUE = 0;
            private final int value;
            private static final j0.d internalValueMap = new a();
            private static final CType[] VALUES = values();

            static class a implements j0.d {
                a() {
                }
            }

            CType(int i10) {
                this.value = i10;
            }

            public static CType forNumber(int i10) {
                if (i10 == 0) {
                    return STRING;
                }
                if (i10 == 1) {
                    return CORD;
                }
                if (i10 != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FieldOptions.getDescriptor().getEnumTypes().get(0);
            }

            public static j0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.explorestack.protobuf.j0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static CType valueOf(int i10) {
                return forNumber(i10);
            }

            public static CType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum JSType implements j0.c {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);

            public static final int JS_NORMAL_VALUE = 0;
            public static final int JS_NUMBER_VALUE = 2;
            public static final int JS_STRING_VALUE = 1;
            private final int value;
            private static final j0.d internalValueMap = new a();
            private static final JSType[] VALUES = values();

            static class a implements j0.d {
                a() {
                }
            }

            JSType(int i10) {
                this.value = i10;
            }

            public static JSType forNumber(int i10) {
                if (i10 == 0) {
                    return JS_NORMAL;
                }
                if (i10 == 1) {
                    return JS_STRING;
                }
                if (i10 != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FieldOptions.getDescriptor().getEnumTypes().get(1);
            }

            public static j0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.explorestack.protobuf.j0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static JSType valueOf(int i10) {
                return forNumber(i10);
            }

            public static JSType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public FieldOptions parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new FieldOptions(lVar, wVar);
            }
        }

        public static FieldOptions D() {
            return f18368l;
        }

        public static b U() {
            return f18368l.toBuilder();
        }

        public static b V(FieldOptions fieldOptions) {
            return f18368l.toBuilder().F(fieldOptions);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.E;
        }

        public CType C() {
            CType cTypeValueOf = CType.valueOf(this.f18371d);
            return cTypeValueOf == null ? CType.STRING : cTypeValueOf;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public FieldOptions getDefaultInstanceForType() {
            return f18368l;
        }

        public boolean F() {
            return this.f18375h;
        }

        public JSType G() {
            JSType jSTypeValueOf = JSType.valueOf(this.f18373f);
            return jSTypeValueOf == null ? JSType.JS_NORMAL : jSTypeValueOf;
        }

        public boolean H() {
            return this.f18374g;
        }

        public boolean I() {
            return this.f18372e;
        }

        public q J(int i10) {
            return (q) this.f18377j.get(i10);
        }

        public int K() {
            return this.f18377j.size();
        }

        public List L() {
            return this.f18377j;
        }

        public boolean M() {
            return this.f18376i;
        }

        public boolean N() {
            return (this.f18370c & 1) != 0;
        }

        public boolean O() {
            return (this.f18370c & 16) != 0;
        }

        public boolean P() {
            return (this.f18370c & 4) != 0;
        }

        public boolean Q() {
            return (this.f18370c & 8) != 0;
        }

        public boolean S() {
            return (this.f18370c & 2) != 0;
        }

        public boolean T() {
            return (this.f18370c & 32) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return U();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18368l ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldOptions)) {
                return super.equals(obj);
            }
            FieldOptions fieldOptions = (FieldOptions) obj;
            if (N() != fieldOptions.N()) {
                return false;
            }
            if ((N() && this.f18371d != fieldOptions.f18371d) || S() != fieldOptions.S()) {
                return false;
            }
            if ((S() && I() != fieldOptions.I()) || P() != fieldOptions.P()) {
                return false;
            }
            if ((P() && this.f18373f != fieldOptions.f18373f) || Q() != fieldOptions.Q()) {
                return false;
            }
            if ((Q() && H() != fieldOptions.H()) || O() != fieldOptions.O()) {
                return false;
            }
            if ((!O() || F() == fieldOptions.F()) && T() == fieldOptions.T()) {
                return (!T() || M() == fieldOptions.M()) && L().equals(fieldOptions.L()) && this.unknownFields.equals(fieldOptions.unknownFields) && m().equals(fieldOptions.m());
            }
            return false;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18369m;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = (this.f18370c & 1) != 0 ? com.explorestack.protobuf.n.l(1, this.f18371d) : 0;
            if ((this.f18370c & 2) != 0) {
                iL += com.explorestack.protobuf.n.e(2, this.f18372e);
            }
            if ((this.f18370c & 16) != 0) {
                iL += com.explorestack.protobuf.n.e(3, this.f18375h);
            }
            if ((this.f18370c & 8) != 0) {
                iL += com.explorestack.protobuf.n.e(5, this.f18374g);
            }
            if ((this.f18370c & 4) != 0) {
                iL += com.explorestack.protobuf.n.l(6, this.f18373f);
            }
            if ((this.f18370c & 32) != 0) {
                iL += com.explorestack.protobuf.n.e(10, this.f18376i);
            }
            for (int i11 = 0; i11 < this.f18377j.size(); i11++) {
                iL += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18377j.get(i11));
            }
            int iL2 = iL + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL2;
            return iL2;
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
            if (N()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.f18371d;
            }
            if (S()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + j0.d(I());
            }
            if (P()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + this.f18373f;
            }
            if (Q()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + j0.d(H());
            }
            if (O()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + j0.d(F());
            }
            if (T()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + j0.d(M());
            }
            if (K() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + L().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.F.d(FieldOptions.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18378k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < K(); i10++) {
                if (!J(i10).isInitialized()) {
                    this.f18378k = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18378k = (byte) 1;
                return true;
            }
            this.f18378k = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new FieldOptions();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            h0.e.a aVarN = n();
            if ((this.f18370c & 1) != 0) {
                nVar.v0(1, this.f18371d);
            }
            if ((this.f18370c & 2) != 0) {
                nVar.n0(2, this.f18372e);
            }
            if ((this.f18370c & 16) != 0) {
                nVar.n0(3, this.f18375h);
            }
            if ((this.f18370c & 8) != 0) {
                nVar.n0(5, this.f18374g);
            }
            if ((this.f18370c & 4) != 0) {
                nVar.v0(6, this.f18373f);
            }
            if ((this.f18370c & 32) != 0) {
                nVar.n0(10, this.f18376i);
            }
            for (int i10 = 0; i10 < this.f18377j.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18377j.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18379c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18380d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f18381e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f18382f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f18383g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f18384h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f18385i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List f18386j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private v1 f18387k;

            private v1 D() {
                if (this.f18387k == null) {
                    this.f18387k = new v1(this.f18386j, (this.f18379c & 64) != 0, getParentForChildren(), isClean());
                    this.f18386j = null;
                }
                return this.f18387k;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18379c & 64) == 0) {
                    this.f18386j = new ArrayList(this.f18386j);
                    this.f18379c |= 64;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public FieldOptions getDefaultInstanceForType() {
                return FieldOptions.D();
            }

            public q B(int i10) {
                v1 v1Var = this.f18387k;
                return v1Var == null ? (q) this.f18386j.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18387k;
                return v1Var == null ? this.f18386j.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.FieldOptions.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.FieldOptions.f18369m     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$FieldOptions r3 = (com.explorestack.protobuf.DescriptorProtos.FieldOptions) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$FieldOptions r4 = (com.explorestack.protobuf.DescriptorProtos.FieldOptions) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.FieldOptions.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$FieldOptions$b");
            }

            public b F(FieldOptions fieldOptions) {
                if (fieldOptions == FieldOptions.D()) {
                    return this;
                }
                if (fieldOptions.N()) {
                    I(fieldOptions.C());
                }
                if (fieldOptions.S()) {
                    N(fieldOptions.I());
                }
                if (fieldOptions.P()) {
                    L(fieldOptions.G());
                }
                if (fieldOptions.Q()) {
                    M(fieldOptions.H());
                }
                if (fieldOptions.O()) {
                    J(fieldOptions.F());
                }
                if (fieldOptions.T()) {
                    Q(fieldOptions.M());
                }
                if (this.f18387k == null) {
                    if (!fieldOptions.f18377j.isEmpty()) {
                        if (this.f18386j.isEmpty()) {
                            this.f18386j = fieldOptions.f18377j;
                            this.f18379c &= -65;
                        } else {
                            z();
                            this.f18386j.addAll(fieldOptions.f18377j);
                        }
                        onChanged();
                    }
                } else if (!fieldOptions.f18377j.isEmpty()) {
                    if (this.f18387k.t()) {
                        this.f18387k.h();
                        this.f18387k = null;
                        this.f18386j = fieldOptions.f18377j;
                        this.f18379c &= -65;
                        this.f18387k = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18387k.a(fieldOptions.f18377j);
                    }
                }
                o(fieldOptions);
                mergeUnknownFields(fieldOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof FieldOptions) {
                    return F((FieldOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b I(CType cType) {
                cType.getClass();
                this.f18379c |= 1;
                this.f18380d = cType.getNumber();
                onChanged();
                return this;
            }

            public b J(boolean z10) {
                this.f18379c |= 16;
                this.f18384h = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            public b L(JSType jSType) {
                jSType.getClass();
                this.f18379c |= 4;
                this.f18382f = jSType.getNumber();
                onChanged();
                return this;
            }

            public b M(boolean z10) {
                this.f18379c |= 8;
                this.f18383g = z10;
                onChanged();
                return this;
            }

            public b N(boolean z10) {
                this.f18379c |= 2;
                this.f18381e = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            public b Q(boolean z10) {
                this.f18379c |= 32;
                this.f18385i = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.E;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.F.d(FieldOptions.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public FieldOptions build() {
                FieldOptions fieldOptionsBuildPartial = buildPartial();
                if (fieldOptionsBuildPartial.isInitialized()) {
                    return fieldOptionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fieldOptionsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public FieldOptions buildPartial() {
                FieldOptions fieldOptions = new FieldOptions(this);
                int i10 = this.f18379c;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                fieldOptions.f18371d = this.f18380d;
                if ((i10 & 2) != 0) {
                    fieldOptions.f18372e = this.f18381e;
                    i11 |= 2;
                }
                if ((i10 & 4) != 0) {
                    i11 |= 4;
                }
                fieldOptions.f18373f = this.f18382f;
                if ((i10 & 8) != 0) {
                    fieldOptions.f18374g = this.f18383g;
                    i11 |= 8;
                }
                if ((i10 & 16) != 0) {
                    fieldOptions.f18375h = this.f18384h;
                    i11 |= 16;
                }
                if ((i10 & 32) != 0) {
                    fieldOptions.f18376i = this.f18385i;
                    i11 |= 32;
                }
                v1 v1Var = this.f18387k;
                if (v1Var == null) {
                    if ((this.f18379c & 64) != 0) {
                        this.f18386j = DesugarCollections.unmodifiableList(this.f18386j);
                        this.f18379c &= -65;
                    }
                    fieldOptions.f18377j = this.f18386j;
                } else {
                    fieldOptions.f18377j = v1Var.f();
                }
                fieldOptions.f18370c = i11;
                onBuilt();
                return fieldOptions;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                this.f18380d = 0;
                int i10 = this.f18379c;
                this.f18381e = false;
                this.f18382f = 0;
                this.f18383g = false;
                this.f18384h = false;
                this.f18385i = false;
                this.f18379c = i10 & (-64);
                v1 v1Var = this.f18387k;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18386j = Collections.EMPTY_LIST;
                this.f18379c = i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18380d = 0;
                this.f18382f = 0;
                this.f18386j = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18380d = 0;
                this.f18382f = 0;
                this.f18386j = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private FieldOptions(h0.d dVar) {
            super(dVar);
            this.f18378k = (byte) -1;
        }

        private FieldOptions() {
            this.f18378k = (byte) -1;
            this.f18371d = 0;
            this.f18373f = 0;
            this.f18377j = Collections.EMPTY_LIST;
        }

        private FieldOptions(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = lVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    int iT = lVar.t();
                                    if (CType.valueOf(iT) == null) {
                                        bVarG.E(1, iT);
                                    } else {
                                        this.f18370c = 1 | this.f18370c;
                                        this.f18371d = iT;
                                    }
                                } else if (iK == 16) {
                                    this.f18370c |= 2;
                                    this.f18372e = lVar.q();
                                } else if (iK == 24) {
                                    this.f18370c |= 16;
                                    this.f18375h = lVar.q();
                                } else if (iK == 40) {
                                    this.f18370c |= 8;
                                    this.f18374g = lVar.q();
                                } else if (iK == 48) {
                                    int iT2 = lVar.t();
                                    if (JSType.valueOf(iT2) == null) {
                                        bVarG.E(6, iT2);
                                    } else {
                                        this.f18370c |= 4;
                                        this.f18373f = iT2;
                                    }
                                } else if (iK == 80) {
                                    this.f18370c |= 32;
                                    this.f18376i = lVar.q();
                                } else if (iK != 7994) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    if ((c10 & '@') == 0) {
                                        this.f18377j = new ArrayList();
                                        c10 = '@';
                                    }
                                    this.f18377j.add(lVar.A(q.f18724l, wVar));
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
                    if ((c10 & '@') != 0) {
                        this.f18377j = DesugarCollections.unmodifiableList(this.f18377j);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((c10 & '@') != 0) {
                this.f18377j = DesugarCollections.unmodifiableList(this.f18377j);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class FileOptions extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile Object f18390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile Object f18391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f18393g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f18394h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f18395i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile Object f18396j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f18397k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f18398l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f18399m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f18400n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f18401o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f18402p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private volatile Object f18403q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private volatile Object f18404r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private volatile Object f18405s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private volatile Object f18406t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private volatile Object f18407u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private volatile Object f18408v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private volatile Object f18409w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private List f18410x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private byte f18411y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final FileOptions f18388z = new FileOptions();
        public static final p1 A = new a();

        public enum OptimizeMode implements j0.c {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);

            public static final int CODE_SIZE_VALUE = 2;
            public static final int LITE_RUNTIME_VALUE = 3;
            public static final int SPEED_VALUE = 1;
            private final int value;
            private static final j0.d internalValueMap = new a();
            private static final OptimizeMode[] VALUES = values();

            static class a implements j0.d {
                a() {
                }
            }

            OptimizeMode(int i10) {
                this.value = i10;
            }

            public static OptimizeMode forNumber(int i10) {
                if (i10 == 1) {
                    return SPEED;
                }
                if (i10 == 2) {
                    return CODE_SIZE;
                }
                if (i10 != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FileOptions.getDescriptor().getEnumTypes().get(0);
            }

            public static j0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.explorestack.protobuf.j0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static OptimizeMode valueOf(int i10) {
                return forNumber(i10);
            }

            public static OptimizeMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public FileOptions parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new FileOptions(lVar, wVar);
            }
        }

        public static b Z0() {
            return f18388z.toBuilder();
        }

        public static b a1(FileOptions fileOptions) {
            return f18388z.toBuilder().F(fileOptions);
        }

        public static FileOptions e0() {
            return f18388z;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.A;
        }

        public String A0() {
            Object obj = this.f18409w;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18409w = stringUtf8;
            }
            return stringUtf8;
        }

        public String B0() {
            Object obj = this.f18405s;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18405s = stringUtf8;
            }
            return stringUtf8;
        }

        public q C0(int i10) {
            return (q) this.f18410x.get(i10);
        }

        public int D0() {
            return this.f18410x.size();
        }

        public List E0() {
            return this.f18410x;
        }

        public boolean F0() {
            return (this.f18389c & 4096) != 0;
        }

        public boolean G0() {
            return (this.f18389c & 128) != 0;
        }

        public boolean H0() {
            return (this.f18389c & 16384) != 0;
        }

        public boolean I0() {
            return (this.f18389c & 2048) != 0;
        }

        public boolean J0() {
            return (this.f18389c & 64) != 0;
        }

        public boolean K0() {
            return (this.f18389c & 8) != 0;
        }

        public boolean L0() {
            return (this.f18389c & 256) != 0;
        }

        public boolean M0() {
            return (this.f18389c & 4) != 0;
        }

        public boolean N0() {
            return (this.f18389c & 2) != 0;
        }

        public boolean O0() {
            return (this.f18389c & 1) != 0;
        }

        public boolean P0() {
            return (this.f18389c & 16) != 0;
        }

        public boolean Q0() {
            return (this.f18389c & 8192) != 0;
        }

        public boolean R0() {
            return (this.f18389c & 32) != 0;
        }

        public boolean S0() {
            return (this.f18389c & 65536) != 0;
        }

        public boolean T0() {
            return (this.f18389c & 1024) != 0;
        }

        public boolean U0() {
            return (this.f18389c & 262144) != 0;
        }

        public boolean V0() {
            return (this.f18389c & 131072) != 0;
        }

        public boolean W0() {
            return (this.f18389c & 512) != 0;
        }

        public boolean X0() {
            return (this.f18389c & 524288) != 0;
        }

        public boolean Y0() {
            return (this.f18389c & 32768) != 0;
        }

        public boolean b0() {
            return this.f18402p;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return Z0();
        }

        public boolean c0() {
            return this.f18397k;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        public String d0() {
            Object obj = this.f18404r;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18404r = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18388z ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileOptions)) {
                return super.equals(obj);
            }
            FileOptions fileOptions = (FileOptions) obj;
            if (O0() != fileOptions.O0()) {
                return false;
            }
            if ((O0() && !m0().equals(fileOptions.m0())) || N0() != fileOptions.N0()) {
                return false;
            }
            if ((N0() && !l0().equals(fileOptions.l0())) || M0() != fileOptions.M0()) {
                return false;
            }
            if ((M0() && k0() != fileOptions.k0()) || K0() != fileOptions.K0()) {
                return false;
            }
            if ((K0() && i0() != fileOptions.i0()) || P0() != fileOptions.P0()) {
                return false;
            }
            if ((P0() && o0() != fileOptions.o0()) || R0() != fileOptions.R0()) {
                return false;
            }
            if ((R0() && this.f18395i != fileOptions.f18395i) || J0() != fileOptions.J0()) {
                return false;
            }
            if ((J0() && !h0().equals(fileOptions.h0())) || G0() != fileOptions.G0()) {
                return false;
            }
            if ((G0() && c0() != fileOptions.c0()) || L0() != fileOptions.L0()) {
                return false;
            }
            if ((L0() && j0() != fileOptions.j0()) || W0() != fileOptions.W0()) {
                return false;
            }
            if ((W0() && z0() != fileOptions.z0()) || T0() != fileOptions.T0()) {
                return false;
            }
            if ((T0() && w0() != fileOptions.w0()) || I0() != fileOptions.I0()) {
                return false;
            }
            if ((I0() && g0() != fileOptions.g0()) || F0() != fileOptions.F0()) {
                return false;
            }
            if ((F0() && b0() != fileOptions.b0()) || Q0() != fileOptions.Q0()) {
                return false;
            }
            if ((Q0() && !p0().equals(fileOptions.p0())) || H0() != fileOptions.H0()) {
                return false;
            }
            if ((H0() && !d0().equals(fileOptions.d0())) || Y0() != fileOptions.Y0()) {
                return false;
            }
            if ((Y0() && !B0().equals(fileOptions.B0())) || S0() != fileOptions.S0()) {
                return false;
            }
            if ((S0() && !v0().equals(fileOptions.v0())) || V0() != fileOptions.V0()) {
                return false;
            }
            if ((V0() && !y0().equals(fileOptions.y0())) || U0() != fileOptions.U0()) {
                return false;
            }
            if ((!U0() || x0().equals(fileOptions.x0())) && X0() == fileOptions.X0()) {
                return (!X0() || A0().equals(fileOptions.A0())) && E0().equals(fileOptions.E0()) && this.unknownFields.equals(fileOptions.unknownFields) && m().equals(fileOptions.m());
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public FileOptions getDefaultInstanceForType() {
            return f18388z;
        }

        public boolean g0() {
            return this.f18401o;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return A;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18389c & 1) != 0 ? h0.computeStringSize(1, this.f18390d) : 0;
            if ((this.f18389c & 2) != 0) {
                iComputeStringSize += h0.computeStringSize(8, this.f18391e);
            }
            if ((this.f18389c & 32) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.l(9, this.f18395i);
            }
            if ((this.f18389c & 4) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(10, this.f18392f);
            }
            if ((this.f18389c & 64) != 0) {
                iComputeStringSize += h0.computeStringSize(11, this.f18396j);
            }
            if ((this.f18389c & 128) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(16, this.f18397k);
            }
            if ((this.f18389c & 256) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(17, this.f18398l);
            }
            if ((this.f18389c & 512) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(18, this.f18399m);
            }
            if ((this.f18389c & 8) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(20, this.f18393g);
            }
            if ((this.f18389c & 2048) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(23, this.f18401o);
            }
            if ((this.f18389c & 16) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(27, this.f18394h);
            }
            if ((this.f18389c & 4096) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(31, this.f18402p);
            }
            if ((this.f18389c & 8192) != 0) {
                iComputeStringSize += h0.computeStringSize(36, this.f18403q);
            }
            if ((this.f18389c & 16384) != 0) {
                iComputeStringSize += h0.computeStringSize(37, this.f18404r);
            }
            if ((this.f18389c & 32768) != 0) {
                iComputeStringSize += h0.computeStringSize(39, this.f18405s);
            }
            if ((this.f18389c & 65536) != 0) {
                iComputeStringSize += h0.computeStringSize(40, this.f18406t);
            }
            if ((this.f18389c & 131072) != 0) {
                iComputeStringSize += h0.computeStringSize(41, this.f18407u);
            }
            if ((this.f18389c & 1024) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(42, this.f18400n);
            }
            if ((this.f18389c & 262144) != 0) {
                iComputeStringSize += h0.computeStringSize(44, this.f18408v);
            }
            if ((this.f18389c & 524288) != 0) {
                iComputeStringSize += h0.computeStringSize(45, this.f18409w);
            }
            for (int i11 = 0; i11 < this.f18410x.size(); i11++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18410x.get(i11));
            }
            int iL = iComputeStringSize + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL;
            return iL;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public String h0() {
            Object obj = this.f18396j;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18396j = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (O0()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m0().hashCode();
            }
            if (N0()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + l0().hashCode();
            }
            if (M0()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + j0.d(k0());
            }
            if (K0()) {
                iHashCode = (((iHashCode * 37) + 20) * 53) + j0.d(i0());
            }
            if (P0()) {
                iHashCode = (((iHashCode * 37) + 27) * 53) + j0.d(o0());
            }
            if (R0()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + this.f18395i;
            }
            if (J0()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + h0().hashCode();
            }
            if (G0()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + j0.d(c0());
            }
            if (L0()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + j0.d(j0());
            }
            if (W0()) {
                iHashCode = (((iHashCode * 37) + 18) * 53) + j0.d(z0());
            }
            if (T0()) {
                iHashCode = (((iHashCode * 37) + 42) * 53) + j0.d(w0());
            }
            if (I0()) {
                iHashCode = (((iHashCode * 37) + 23) * 53) + j0.d(g0());
            }
            if (F0()) {
                iHashCode = (((iHashCode * 37) + 31) * 53) + j0.d(b0());
            }
            if (Q0()) {
                iHashCode = (((iHashCode * 37) + 36) * 53) + p0().hashCode();
            }
            if (H0()) {
                iHashCode = (((iHashCode * 37) + 37) * 53) + d0().hashCode();
            }
            if (Y0()) {
                iHashCode = (((iHashCode * 37) + 39) * 53) + B0().hashCode();
            }
            if (S0()) {
                iHashCode = (((iHashCode * 37) + 40) * 53) + v0().hashCode();
            }
            if (V0()) {
                iHashCode = (((iHashCode * 37) + 41) * 53) + y0().hashCode();
            }
            if (U0()) {
                iHashCode = (((iHashCode * 37) + 44) * 53) + x0().hashCode();
            }
            if (X0()) {
                iHashCode = (((iHashCode * 37) + 45) * 53) + A0().hashCode();
            }
            if (D0() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + E0().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        public boolean i0() {
            return this.f18393g;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.B.d(FileOptions.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18411y;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < D0(); i10++) {
                if (!C0(i10).isInitialized()) {
                    this.f18411y = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18411y = (byte) 1;
                return true;
            }
            this.f18411y = (byte) 0;
            return false;
        }

        public boolean j0() {
            return this.f18398l;
        }

        public boolean k0() {
            return this.f18392f;
        }

        public String l0() {
            Object obj = this.f18391e;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18391e = stringUtf8;
            }
            return stringUtf8;
        }

        public String m0() {
            Object obj = this.f18390d;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18390d = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new FileOptions();
        }

        public boolean o0() {
            return this.f18394h;
        }

        public String p0() {
            Object obj = this.f18403q;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18403q = stringUtf8;
            }
            return stringUtf8;
        }

        public OptimizeMode q0() {
            OptimizeMode optimizeModeValueOf = OptimizeMode.valueOf(this.f18395i);
            return optimizeModeValueOf == null ? OptimizeMode.SPEED : optimizeModeValueOf;
        }

        public String v0() {
            Object obj = this.f18406t;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18406t = stringUtf8;
            }
            return stringUtf8;
        }

        public boolean w0() {
            return this.f18400n;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            h0.e.a aVarN = n();
            if ((this.f18389c & 1) != 0) {
                h0.writeString(nVar, 1, this.f18390d);
            }
            if ((this.f18389c & 2) != 0) {
                h0.writeString(nVar, 8, this.f18391e);
            }
            if ((this.f18389c & 32) != 0) {
                nVar.v0(9, this.f18395i);
            }
            if ((this.f18389c & 4) != 0) {
                nVar.n0(10, this.f18392f);
            }
            if ((this.f18389c & 64) != 0) {
                h0.writeString(nVar, 11, this.f18396j);
            }
            if ((this.f18389c & 128) != 0) {
                nVar.n0(16, this.f18397k);
            }
            if ((this.f18389c & 256) != 0) {
                nVar.n0(17, this.f18398l);
            }
            if ((this.f18389c & 512) != 0) {
                nVar.n0(18, this.f18399m);
            }
            if ((this.f18389c & 8) != 0) {
                nVar.n0(20, this.f18393g);
            }
            if ((this.f18389c & 2048) != 0) {
                nVar.n0(23, this.f18401o);
            }
            if ((this.f18389c & 16) != 0) {
                nVar.n0(27, this.f18394h);
            }
            if ((this.f18389c & 4096) != 0) {
                nVar.n0(31, this.f18402p);
            }
            if ((this.f18389c & 8192) != 0) {
                h0.writeString(nVar, 36, this.f18403q);
            }
            if ((this.f18389c & 16384) != 0) {
                h0.writeString(nVar, 37, this.f18404r);
            }
            if ((this.f18389c & 32768) != 0) {
                h0.writeString(nVar, 39, this.f18405s);
            }
            if ((this.f18389c & 65536) != 0) {
                h0.writeString(nVar, 40, this.f18406t);
            }
            if ((this.f18389c & 131072) != 0) {
                h0.writeString(nVar, 41, this.f18407u);
            }
            if ((this.f18389c & 1024) != 0) {
                nVar.n0(42, this.f18400n);
            }
            if ((this.f18389c & 262144) != 0) {
                h0.writeString(nVar, 44, this.f18408v);
            }
            if ((this.f18389c & 524288) != 0) {
                h0.writeString(nVar, 45, this.f18409w);
            }
            for (int i10 = 0; i10 < this.f18410x.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18410x.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        public String x0() {
            Object obj = this.f18408v;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18408v = stringUtf8;
            }
            return stringUtf8;
        }

        public String y0() {
            Object obj = this.f18407u;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18407u = stringUtf8;
            }
            return stringUtf8;
        }

        public boolean z0() {
            return this.f18399m;
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18412c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Object f18413d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Object f18414e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f18415f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f18416g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f18417h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f18418i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Object f18419j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f18420k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private boolean f18421l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private boolean f18422m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private boolean f18423n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private boolean f18424o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private boolean f18425p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private Object f18426q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private Object f18427r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private Object f18428s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private Object f18429t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private Object f18430u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private Object f18431v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private Object f18432w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private List f18433x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private v1 f18434y;

            private v1 D() {
                if (this.f18434y == null) {
                    this.f18434y = new v1(this.f18433x, (this.f18412c & 1048576) != 0, getParentForChildren(), isClean());
                    this.f18433x = null;
                }
                return this.f18434y;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18412c & 1048576) == 0) {
                    this.f18433x = new ArrayList(this.f18433x);
                    this.f18412c |= 1048576;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public FileOptions getDefaultInstanceForType() {
                return FileOptions.e0();
            }

            public q B(int i10) {
                v1 v1Var = this.f18434y;
                return v1Var == null ? (q) this.f18433x.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18434y;
                return v1Var == null ? this.f18433x.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.FileOptions.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.FileOptions.A     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$FileOptions r3 = (com.explorestack.protobuf.DescriptorProtos.FileOptions) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$FileOptions r4 = (com.explorestack.protobuf.DescriptorProtos.FileOptions) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.FileOptions.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$FileOptions$b");
            }

            public b F(FileOptions fileOptions) {
                if (fileOptions == FileOptions.e0()) {
                    return this;
                }
                if (fileOptions.O0()) {
                    this.f18412c |= 1;
                    this.f18413d = fileOptions.f18390d;
                    onChanged();
                }
                if (fileOptions.N0()) {
                    this.f18412c |= 2;
                    this.f18414e = fileOptions.f18391e;
                    onChanged();
                }
                if (fileOptions.M0()) {
                    O(fileOptions.k0());
                }
                if (fileOptions.K0()) {
                    M(fileOptions.i0());
                }
                if (fileOptions.P0()) {
                    P(fileOptions.o0());
                }
                if (fileOptions.R0()) {
                    Q(fileOptions.q0());
                }
                if (fileOptions.J0()) {
                    this.f18412c |= 64;
                    this.f18419j = fileOptions.f18396j;
                    onChanged();
                }
                if (fileOptions.G0()) {
                    J(fileOptions.c0());
                }
                if (fileOptions.L0()) {
                    N(fileOptions.j0());
                }
                if (fileOptions.W0()) {
                    S(fileOptions.z0());
                }
                if (fileOptions.T0()) {
                    R(fileOptions.w0());
                }
                if (fileOptions.I0()) {
                    K(fileOptions.g0());
                }
                if (fileOptions.F0()) {
                    I(fileOptions.b0());
                }
                if (fileOptions.Q0()) {
                    this.f18412c |= 8192;
                    this.f18426q = fileOptions.f18403q;
                    onChanged();
                }
                if (fileOptions.H0()) {
                    this.f18412c |= 16384;
                    this.f18427r = fileOptions.f18404r;
                    onChanged();
                }
                if (fileOptions.Y0()) {
                    this.f18412c |= 32768;
                    this.f18428s = fileOptions.f18405s;
                    onChanged();
                }
                if (fileOptions.S0()) {
                    this.f18412c |= 65536;
                    this.f18429t = fileOptions.f18406t;
                    onChanged();
                }
                if (fileOptions.V0()) {
                    this.f18412c |= 131072;
                    this.f18430u = fileOptions.f18407u;
                    onChanged();
                }
                if (fileOptions.U0()) {
                    this.f18412c |= 262144;
                    this.f18431v = fileOptions.f18408v;
                    onChanged();
                }
                if (fileOptions.X0()) {
                    this.f18412c |= 524288;
                    this.f18432w = fileOptions.f18409w;
                    onChanged();
                }
                if (this.f18434y == null) {
                    if (!fileOptions.f18410x.isEmpty()) {
                        if (this.f18433x.isEmpty()) {
                            this.f18433x = fileOptions.f18410x;
                            this.f18412c &= -1048577;
                        } else {
                            z();
                            this.f18433x.addAll(fileOptions.f18410x);
                        }
                        onChanged();
                    }
                } else if (!fileOptions.f18410x.isEmpty()) {
                    if (this.f18434y.t()) {
                        this.f18434y.h();
                        this.f18434y = null;
                        this.f18433x = fileOptions.f18410x;
                        this.f18412c = (-1048577) & this.f18412c;
                        this.f18434y = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18434y.a(fileOptions.f18410x);
                    }
                }
                o(fileOptions);
                mergeUnknownFields(fileOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof FileOptions) {
                    return F((FileOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b I(boolean z10) {
                this.f18412c |= 4096;
                this.f18425p = z10;
                onChanged();
                return this;
            }

            public b J(boolean z10) {
                this.f18412c |= 128;
                this.f18420k = z10;
                onChanged();
                return this;
            }

            public b K(boolean z10) {
                this.f18412c |= 2048;
                this.f18424o = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            public b M(boolean z10) {
                this.f18412c |= 8;
                this.f18416g = z10;
                onChanged();
                return this;
            }

            public b N(boolean z10) {
                this.f18412c |= 256;
                this.f18421l = z10;
                onChanged();
                return this;
            }

            public b O(boolean z10) {
                this.f18412c |= 4;
                this.f18415f = z10;
                onChanged();
                return this;
            }

            public b P(boolean z10) {
                this.f18412c |= 16;
                this.f18417h = z10;
                onChanged();
                return this;
            }

            public b Q(OptimizeMode optimizeMode) {
                optimizeMode.getClass();
                this.f18412c |= 32;
                this.f18418i = optimizeMode.getNumber();
                onChanged();
                return this;
            }

            public b R(boolean z10) {
                this.f18412c |= 1024;
                this.f18423n = z10;
                onChanged();
                return this;
            }

            public b S(boolean z10) {
                this.f18412c |= 512;
                this.f18422m = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.A;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.B.d(FileOptions.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public FileOptions build() {
                FileOptions fileOptionsBuildPartial = buildPartial();
                if (fileOptionsBuildPartial.isInitialized()) {
                    return fileOptionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileOptionsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public FileOptions buildPartial() {
                FileOptions fileOptions = new FileOptions(this);
                int i10 = this.f18412c;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                fileOptions.f18390d = this.f18413d;
                if ((i10 & 2) != 0) {
                    i11 |= 2;
                }
                fileOptions.f18391e = this.f18414e;
                if ((i10 & 4) != 0) {
                    fileOptions.f18392f = this.f18415f;
                    i11 |= 4;
                }
                if ((i10 & 8) != 0) {
                    fileOptions.f18393g = this.f18416g;
                    i11 |= 8;
                }
                if ((i10 & 16) != 0) {
                    fileOptions.f18394h = this.f18417h;
                    i11 |= 16;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 32;
                }
                fileOptions.f18395i = this.f18418i;
                if ((i10 & 64) != 0) {
                    i11 |= 64;
                }
                fileOptions.f18396j = this.f18419j;
                if ((i10 & 128) != 0) {
                    fileOptions.f18397k = this.f18420k;
                    i11 |= 128;
                }
                if ((i10 & 256) != 0) {
                    fileOptions.f18398l = this.f18421l;
                    i11 |= 256;
                }
                if ((i10 & 512) != 0) {
                    fileOptions.f18399m = this.f18422m;
                    i11 |= 512;
                }
                if ((i10 & 1024) != 0) {
                    fileOptions.f18400n = this.f18423n;
                    i11 |= 1024;
                }
                if ((i10 & 2048) != 0) {
                    fileOptions.f18401o = this.f18424o;
                    i11 |= 2048;
                }
                if ((i10 & 4096) != 0) {
                    i11 |= 4096;
                }
                fileOptions.f18402p = this.f18425p;
                if ((i10 & 8192) != 0) {
                    i11 |= 8192;
                }
                fileOptions.f18403q = this.f18426q;
                if ((i10 & 16384) != 0) {
                    i11 |= 16384;
                }
                fileOptions.f18404r = this.f18427r;
                if ((i10 & 32768) != 0) {
                    i11 |= 32768;
                }
                fileOptions.f18405s = this.f18428s;
                if ((i10 & 65536) != 0) {
                    i11 |= 65536;
                }
                fileOptions.f18406t = this.f18429t;
                if ((i10 & 131072) != 0) {
                    i11 |= 131072;
                }
                fileOptions.f18407u = this.f18430u;
                if ((i10 & 262144) != 0) {
                    i11 |= 262144;
                }
                fileOptions.f18408v = this.f18431v;
                if ((i10 & 524288) != 0) {
                    i11 |= 524288;
                }
                fileOptions.f18409w = this.f18432w;
                v1 v1Var = this.f18434y;
                if (v1Var == null) {
                    if ((this.f18412c & 1048576) != 0) {
                        this.f18433x = DesugarCollections.unmodifiableList(this.f18433x);
                        this.f18412c &= -1048577;
                    }
                    fileOptions.f18410x = this.f18433x;
                } else {
                    fileOptions.f18410x = v1Var.f();
                }
                fileOptions.f18389c = i11;
                onBuilt();
                return fileOptions;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                this.f18413d = "";
                int i10 = this.f18412c;
                this.f18414e = "";
                this.f18415f = false;
                this.f18416g = false;
                this.f18417h = false;
                this.f18418i = 1;
                this.f18419j = "";
                this.f18420k = false;
                this.f18421l = false;
                this.f18422m = false;
                this.f18423n = false;
                this.f18424o = false;
                this.f18425p = true;
                this.f18426q = "";
                this.f18427r = "";
                this.f18428s = "";
                this.f18429t = "";
                this.f18430u = "";
                this.f18431v = "";
                this.f18432w = "";
                this.f18412c = (-1048576) & i10;
                v1 v1Var = this.f18434y;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18433x = Collections.EMPTY_LIST;
                this.f18412c = (-2097152) & i10;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18413d = "";
                this.f18414e = "";
                this.f18418i = 1;
                this.f18419j = "";
                this.f18425p = true;
                this.f18426q = "";
                this.f18427r = "";
                this.f18428s = "";
                this.f18429t = "";
                this.f18430u = "";
                this.f18431v = "";
                this.f18432w = "";
                this.f18433x = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18413d = "";
                this.f18414e = "";
                this.f18418i = 1;
                this.f18419j = "";
                this.f18425p = true;
                this.f18426q = "";
                this.f18427r = "";
                this.f18428s = "";
                this.f18429t = "";
                this.f18430u = "";
                this.f18431v = "";
                this.f18432w = "";
                this.f18433x = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private FileOptions(h0.d dVar) {
            super(dVar);
            this.f18411y = (byte) -1;
        }

        private FileOptions() {
            this.f18411y = (byte) -1;
            this.f18390d = "";
            this.f18391e = "";
            this.f18395i = 1;
            this.f18396j = "";
            this.f18402p = true;
            this.f18403q = "";
            this.f18404r = "";
            this.f18405s = "";
            this.f18406t = "";
            this.f18407u = "";
            this.f18408v = "";
            this.f18409w = "";
            this.f18410x = Collections.EMPTY_LIST;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
        private FileOptions(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (true) {
                ?? unknownField = 1048576;
                if (!z10) {
                    try {
                        try {
                            try {
                                int iK = lVar.K();
                                switch (iK) {
                                    case 0:
                                        z10 = true;
                                        break;
                                    case 10:
                                        ByteString byteStringR = lVar.r();
                                        this.f18389c = 1 | this.f18389c;
                                        this.f18390d = byteStringR;
                                        break;
                                    case 66:
                                        ByteString byteStringR2 = lVar.r();
                                        this.f18389c |= 2;
                                        this.f18391e = byteStringR2;
                                        break;
                                    case 72:
                                        int iT = lVar.t();
                                        if (OptimizeMode.valueOf(iT) == null) {
                                            bVarG.E(9, iT);
                                        } else {
                                            this.f18389c |= 32;
                                            this.f18395i = iT;
                                        }
                                        break;
                                    case 80:
                                        this.f18389c |= 4;
                                        this.f18392f = lVar.q();
                                        break;
                                    case 90:
                                        ByteString byteStringR3 = lVar.r();
                                        this.f18389c |= 64;
                                        this.f18396j = byteStringR3;
                                        break;
                                    case 128:
                                        this.f18389c |= 128;
                                        this.f18397k = lVar.q();
                                        break;
                                    case 136:
                                        this.f18389c |= 256;
                                        this.f18398l = lVar.q();
                                        break;
                                    case 144:
                                        this.f18389c |= 512;
                                        this.f18399m = lVar.q();
                                        break;
                                    case 160:
                                        this.f18389c |= 8;
                                        this.f18393g = lVar.q();
                                        break;
                                    case 184:
                                        this.f18389c |= 2048;
                                        this.f18401o = lVar.q();
                                        break;
                                    case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                                        this.f18389c |= 16;
                                        this.f18394h = lVar.q();
                                        break;
                                    case 248:
                                        this.f18389c |= 4096;
                                        this.f18402p = lVar.q();
                                        break;
                                    case 290:
                                        ByteString byteStringR4 = lVar.r();
                                        this.f18389c |= 8192;
                                        this.f18403q = byteStringR4;
                                        break;
                                    case 298:
                                        ByteString byteStringR5 = lVar.r();
                                        this.f18389c |= 16384;
                                        this.f18404r = byteStringR5;
                                        break;
                                    case 314:
                                        ByteString byteStringR6 = lVar.r();
                                        this.f18389c |= 32768;
                                        this.f18405s = byteStringR6;
                                        break;
                                    case 322:
                                        ByteString byteStringR7 = lVar.r();
                                        this.f18389c |= 65536;
                                        this.f18406t = byteStringR7;
                                        break;
                                    case 330:
                                        ByteString byteStringR8 = lVar.r();
                                        this.f18389c |= 131072;
                                        this.f18407u = byteStringR8;
                                        break;
                                    case 336:
                                        this.f18389c |= 1024;
                                        this.f18400n = lVar.q();
                                        break;
                                    case 354:
                                        ByteString byteStringR9 = lVar.r();
                                        this.f18389c |= 262144;
                                        this.f18408v = byteStringR9;
                                        break;
                                    case 362:
                                        ByteString byteStringR10 = lVar.r();
                                        this.f18389c |= 524288;
                                        this.f18409w = byteStringR10;
                                        break;
                                    case 7994:
                                        if ((c10 & Ascii.MIN) == 0) {
                                            this.f18410x = new ArrayList();
                                            c10 = 0;
                                        }
                                        this.f18410x.add(lVar.A(q.f18724l, wVar));
                                        break;
                                    default:
                                        unknownField = parseUnknownField(lVar, bVarG, wVar, iK);
                                        if (unknownField == 0) {
                                            z10 = true;
                                        }
                                        break;
                                }
                            } catch (IOException e10) {
                                throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                            }
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if ((c10 & unknownField) != 0) {
                            this.f18410x = DesugarCollections.unmodifiableList(this.f18410x);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } else {
                    if ((c10 & Ascii.MIN) != 0) {
                        this.f18410x = DesugarCollections.unmodifiableList(this.f18410x);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    return;
                }
            }
        }
    }

    public static final class MethodOptions extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final MethodOptions f18435h = new MethodOptions();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final p1 f18436i = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f18439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f18440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f18441g;

        public enum IdempotencyLevel implements j0.c {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);

            public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
            public static final int IDEMPOTENT_VALUE = 2;
            public static final int NO_SIDE_EFFECTS_VALUE = 1;
            private final int value;
            private static final j0.d internalValueMap = new a();
            private static final IdempotencyLevel[] VALUES = values();

            static class a implements j0.d {
                a() {
                }
            }

            IdempotencyLevel(int i10) {
                this.value = i10;
            }

            public static IdempotencyLevel forNumber(int i10) {
                if (i10 == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i10 == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i10 != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return MethodOptions.getDescriptor().getEnumTypes().get(0);
            }

            public static j0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.explorestack.protobuf.j0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static IdempotencyLevel valueOf(int i10) {
                return forNumber(i10);
            }

            public static IdempotencyLevel valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public MethodOptions parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new MethodOptions(lVar, wVar);
            }
        }

        public static b H() {
            return f18435h.toBuilder();
        }

        public static b I(MethodOptions methodOptions) {
            return f18435h.toBuilder().F(methodOptions);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.O;
        }

        public static MethodOptions v() {
            return f18435h;
        }

        public boolean A() {
            return this.f18438d;
        }

        public IdempotencyLevel B() {
            IdempotencyLevel idempotencyLevelValueOf = IdempotencyLevel.valueOf(this.f18439e);
            return idempotencyLevelValueOf == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : idempotencyLevelValueOf;
        }

        public q C(int i10) {
            return (q) this.f18440f.get(i10);
        }

        public int D() {
            return this.f18440f.size();
        }

        public List E() {
            return this.f18440f;
        }

        public boolean F() {
            return (this.f18437c & 1) != 0;
        }

        public boolean G() {
            return (this.f18437c & 2) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return H();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18435h ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MethodOptions)) {
                return super.equals(obj);
            }
            MethodOptions methodOptions = (MethodOptions) obj;
            if (F() != methodOptions.F()) {
                return false;
            }
            if ((!F() || A() == methodOptions.A()) && G() == methodOptions.G()) {
                return (!G() || this.f18439e == methodOptions.f18439e) && E().equals(methodOptions.E()) && this.unknownFields.equals(methodOptions.unknownFields) && m().equals(methodOptions.m());
            }
            return false;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18436i;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f18437c & 1) != 0 ? com.explorestack.protobuf.n.e(33, this.f18438d) : 0;
            if ((this.f18437c & 2) != 0) {
                iE += com.explorestack.protobuf.n.l(34, this.f18439e);
            }
            for (int i11 = 0; i11 < this.f18440f.size(); i11++) {
                iE += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18440f.get(i11));
            }
            int iL = iE + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL;
            return iL;
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
            if (F()) {
                iHashCode = (((iHashCode * 37) + 33) * 53) + j0.d(A());
            }
            if (G()) {
                iHashCode = (((iHashCode * 37) + 34) * 53) + this.f18439e;
            }
            if (D() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + E().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.P.d(MethodOptions.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18441g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < D(); i10++) {
                if (!C(i10).isInitialized()) {
                    this.f18441g = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18441g = (byte) 1;
                return true;
            }
            this.f18441g = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new MethodOptions();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            h0.e.a aVarN = n();
            if ((this.f18437c & 1) != 0) {
                nVar.n0(33, this.f18438d);
            }
            if ((this.f18437c & 2) != 0) {
                nVar.v0(34, this.f18439e);
            }
            for (int i10 = 0; i10 < this.f18440f.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18440f.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public MethodOptions getDefaultInstanceForType() {
            return f18435h;
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18442c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f18443d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f18444e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List f18445f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private v1 f18446g;

            private v1 D() {
                if (this.f18446g == null) {
                    this.f18446g = new v1(this.f18445f, (this.f18442c & 4) != 0, getParentForChildren(), isClean());
                    this.f18445f = null;
                }
                return this.f18446g;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18442c & 4) == 0) {
                    this.f18445f = new ArrayList(this.f18445f);
                    this.f18442c |= 4;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public MethodOptions getDefaultInstanceForType() {
                return MethodOptions.v();
            }

            public q B(int i10) {
                v1 v1Var = this.f18446g;
                return v1Var == null ? (q) this.f18445f.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18446g;
                return v1Var == null ? this.f18445f.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.MethodOptions.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.MethodOptions.f18436i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$MethodOptions r3 = (com.explorestack.protobuf.DescriptorProtos.MethodOptions) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$MethodOptions r4 = (com.explorestack.protobuf.DescriptorProtos.MethodOptions) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.MethodOptions.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$MethodOptions$b");
            }

            public b F(MethodOptions methodOptions) {
                if (methodOptions == MethodOptions.v()) {
                    return this;
                }
                if (methodOptions.F()) {
                    I(methodOptions.A());
                }
                if (methodOptions.G()) {
                    K(methodOptions.B());
                }
                if (this.f18446g == null) {
                    if (!methodOptions.f18440f.isEmpty()) {
                        if (this.f18445f.isEmpty()) {
                            this.f18445f = methodOptions.f18440f;
                            this.f18442c &= -5;
                        } else {
                            z();
                            this.f18445f.addAll(methodOptions.f18440f);
                        }
                        onChanged();
                    }
                } else if (!methodOptions.f18440f.isEmpty()) {
                    if (this.f18446g.t()) {
                        this.f18446g.h();
                        this.f18446g = null;
                        this.f18445f = methodOptions.f18440f;
                        this.f18442c &= -5;
                        this.f18446g = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18446g.a(methodOptions.f18440f);
                    }
                }
                o(methodOptions);
                mergeUnknownFields(methodOptions.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof MethodOptions) {
                    return F((MethodOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b I(boolean z10) {
                this.f18442c |= 1;
                this.f18443d = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            public b K(IdempotencyLevel idempotencyLevel) {
                idempotencyLevel.getClass();
                this.f18442c |= 2;
                this.f18444e = idempotencyLevel.getNumber();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.O;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.P.d(MethodOptions.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public MethodOptions build() {
                MethodOptions methodOptionsBuildPartial = buildPartial();
                if (methodOptionsBuildPartial.isInitialized()) {
                    return methodOptionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) methodOptionsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public MethodOptions buildPartial() {
                int i10;
                MethodOptions methodOptions = new MethodOptions(this);
                int i11 = this.f18442c;
                if ((i11 & 1) != 0) {
                    methodOptions.f18438d = this.f18443d;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    i10 |= 2;
                }
                methodOptions.f18439e = this.f18444e;
                v1 v1Var = this.f18446g;
                if (v1Var == null) {
                    if ((this.f18442c & 4) != 0) {
                        this.f18445f = DesugarCollections.unmodifiableList(this.f18445f);
                        this.f18442c &= -5;
                    }
                    methodOptions.f18440f = this.f18445f;
                } else {
                    methodOptions.f18440f = v1Var.f();
                }
                methodOptions.f18437c = i10;
                onBuilt();
                return methodOptions;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                this.f18443d = false;
                int i10 = this.f18442c;
                this.f18444e = 0;
                this.f18442c = i10 & (-4);
                v1 v1Var = this.f18446g;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18445f = Collections.EMPTY_LIST;
                this.f18442c = i10 & (-8);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18444e = 0;
                this.f18445f = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18444e = 0;
                this.f18445f = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private MethodOptions(h0.d dVar) {
            super(dVar);
            this.f18441g = (byte) -1;
        }

        private MethodOptions() {
            this.f18441g = (byte) -1;
            this.f18439e = 0;
            this.f18440f = Collections.EMPTY_LIST;
        }

        private MethodOptions(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 264) {
                                this.f18437c |= 1;
                                this.f18438d = lVar.q();
                            } else if (iK == 272) {
                                int iT = lVar.t();
                                if (IdempotencyLevel.valueOf(iT) == null) {
                                    bVarG.E(34, iT);
                                } else {
                                    this.f18437c |= 2;
                                    this.f18439e = iT;
                                }
                            } else if (iK != 7994) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((c10 & 4) == 0) {
                                    this.f18440f = new ArrayList();
                                    c10 = 4;
                                }
                                this.f18440f.add(lVar.A(q.f18724l, wVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((c10 & 4) != 0) {
                        this.f18440f = DesugarCollections.unmodifiableList(this.f18440f);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((c10 & 4) != 0) {
                this.f18440f = DesugarCollections.unmodifiableList(this.f18440f);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class b extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final b f18447n = new b();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final p1 f18448o = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f18451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f18452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f18453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f18454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List f18455h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f18456i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private j f18457j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List f18458k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private p0 f18459l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f18460m;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new b(lVar, wVar);
            }
        }

        public static final class c extends h0 implements MessageOrBuilder {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final c f18480g = new c();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final p1 f18481h = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18482b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18483c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18484d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private g f18485e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private byte f18486f;

            static class a extends com.explorestack.protobuf.b {
                a() {
                }

                @Override // com.explorestack.protobuf.p1
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                    return new c(lVar, wVar);
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.f18320g;
            }

            public static c n() {
                return f18480g;
            }

            public static C0316b x() {
                return f18480g.toBuilder();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public C0316b newBuilderForType() {
                return x();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public C0316b newBuilderForType(h0.c cVar) {
                return new C0316b(cVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public C0316b toBuilder() {
                return this == f18480g ? new C0316b() : new C0316b().u(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (v() != cVar.v()) {
                    return false;
                }
                if ((v() && s() != cVar.s()) || t() != cVar.t()) {
                    return false;
                }
                if ((!t() || q() == cVar.q()) && u() == cVar.u()) {
                    return (!u() || r().equals(cVar.r())) && this.unknownFields.equals(cVar.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return f18481h;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iX = (this.f18482b & 1) != 0 ? com.explorestack.protobuf.n.x(1, this.f18483c) : 0;
                if ((this.f18482b & 2) != 0) {
                    iX += com.explorestack.protobuf.n.x(2, this.f18484d);
                }
                if ((this.f18482b & 4) != 0) {
                    iX += com.explorestack.protobuf.n.G(3, r());
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
                if (v()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + s();
                }
                if (t()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + q();
                }
                if (u()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + r().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18321h.d(c.class, C0316b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f18486f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!u() || r().isInitialized()) {
                    this.f18486f = (byte) 1;
                    return true;
                }
                this.f18486f = (byte) 0;
                return false;
            }

            @Override // com.explorestack.protobuf.h0
            protected Object newInstance(h0.g gVar) {
                return new c();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return f18480g;
            }

            public int q() {
                return this.f18484d;
            }

            public g r() {
                g gVar = this.f18485e;
                return gVar == null ? g.s() : gVar;
            }

            public int s() {
                return this.f18483c;
            }

            public boolean t() {
                return (this.f18482b & 2) != 0;
            }

            public boolean u() {
                return (this.f18482b & 4) != 0;
            }

            public boolean v() {
                return (this.f18482b & 1) != 0;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(com.explorestack.protobuf.n nVar) {
                if ((this.f18482b & 1) != 0) {
                    nVar.F0(1, this.f18483c);
                }
                if ((this.f18482b & 2) != 0) {
                    nVar.F0(2, this.f18484d);
                }
                if ((this.f18482b & 4) != 0) {
                    nVar.J0(3, r());
                }
                this.unknownFields.writeTo(nVar);
            }

            /* JADX INFO: renamed from: com.explorestack.protobuf.DescriptorProtos$b$c$b, reason: collision with other inner class name */
            public static final class C0316b extends h0.b implements MessageOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f18487b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f18488c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f18489d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private g f18490e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private a2 f18491f;

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        r();
                    }
                }

                private a2 r() {
                    if (this.f18491f == null) {
                        this.f18491f = new a2(q(), getParentForChildren(), isClean());
                        this.f18490e = null;
                    }
                    return this.f18491f;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
                public C0316b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C0316b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                public C0316b B(int i10) {
                    this.f18487b |= 1;
                    this.f18488c = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
                public final C0316b setUnknownFields(r2 r2Var) {
                    return (C0316b) super.setUnknownFields(r2Var);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public C0316b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0316b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.f18320g;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) cVarBuildPartial);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return DescriptorProtos.f18321h.d(c.class, C0316b.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return !s() || q().isInitialized();
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c buildPartial() {
                    int i10;
                    c cVar = new c(this);
                    int i11 = this.f18487b;
                    if ((i11 & 1) != 0) {
                        cVar.f18483c = this.f18488c;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        cVar.f18484d = this.f18489d;
                        i10 |= 2;
                    }
                    if ((i11 & 4) != 0) {
                        a2 a2Var = this.f18491f;
                        if (a2Var == null) {
                            cVar.f18485e = this.f18490e;
                        } else {
                            cVar.f18485e = (g) a2Var.a();
                        }
                        i10 |= 4;
                    }
                    cVar.f18482b = i10;
                    onBuilt();
                    return cVar;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public C0316b clear() {
                    super.clear();
                    this.f18488c = 0;
                    int i10 = this.f18487b;
                    this.f18489d = 0;
                    this.f18487b = i10 & (-4);
                    a2 a2Var = this.f18491f;
                    if (a2Var == null) {
                        this.f18490e = null;
                    } else {
                        a2Var.b();
                    }
                    this.f18487b &= -5;
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public C0316b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C0316b) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public C0316b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C0316b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public C0316b mo4427clone() {
                    return (C0316b) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public c getDefaultInstanceForType() {
                    return c.n();
                }

                public g q() {
                    a2 a2Var = this.f18491f;
                    if (a2Var != null) {
                        return (g) a2Var.e();
                    }
                    g gVar = this.f18490e;
                    return gVar == null ? g.s() : gVar;
                }

                public boolean s() {
                    return (this.f18487b & 4) != 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.DescriptorProtos.b.c.C0316b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.b.c.f18481h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        com.explorestack.protobuf.DescriptorProtos$b$c r3 = (com.explorestack.protobuf.DescriptorProtos.b.c) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.u(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        com.explorestack.protobuf.DescriptorProtos$b$c r4 = (com.explorestack.protobuf.DescriptorProtos.b.c) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.u(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.b.c.C0316b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$b$c$b");
                }

                public C0316b u(c cVar) {
                    if (cVar == c.n()) {
                        return this;
                    }
                    if (cVar.v()) {
                        B(cVar.s());
                    }
                    if (cVar.t()) {
                        y(cVar.q());
                    }
                    if (cVar.u()) {
                        w(cVar.r());
                    }
                    mergeUnknownFields(cVar.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public C0316b mergeFrom(Message message) {
                    if (message instanceof c) {
                        return u((c) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public C0316b w(g gVar) {
                    g gVar2;
                    a2 a2Var = this.f18491f;
                    if (a2Var == null) {
                        if ((this.f18487b & 4) == 0 || (gVar2 = this.f18490e) == null || gVar2 == g.s()) {
                            this.f18490e = gVar;
                        } else {
                            this.f18490e = g.B(this.f18490e).F(gVar).buildPartial();
                        }
                        onChanged();
                    } else {
                        a2Var.g(gVar);
                    }
                    this.f18487b |= 4;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public final C0316b mergeUnknownFields(r2 r2Var) {
                    return (C0316b) super.mergeUnknownFields(r2Var);
                }

                public C0316b y(int i10) {
                    this.f18487b |= 2;
                    this.f18489d = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public C0316b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0316b) super.setField(fieldDescriptor, obj);
                }

                private C0316b() {
                    maybeForceBuilderInitialization();
                }

                private C0316b(h0.c cVar) {
                    super(cVar);
                    maybeForceBuilderInitialization();
                }
            }

            private c(h0.b bVar) {
                super(bVar);
                this.f18486f = (byte) -1;
            }

            private c() {
                this.f18486f = (byte) -1;
            }

            private c(com.explorestack.protobuf.l lVar, w wVar) {
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
                                    this.f18482b |= 1;
                                    this.f18483c = lVar.y();
                                } else if (iK == 16) {
                                    this.f18482b |= 2;
                                    this.f18484d = lVar.y();
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    g.b builder = (this.f18482b & 4) != 0 ? this.f18485e.toBuilder() : null;
                                    g gVar = (g) lVar.A(g.f18563f, wVar);
                                    this.f18485e = gVar;
                                    if (builder != null) {
                                        builder.F(gVar);
                                        this.f18485e = builder.buildPartial();
                                    }
                                    this.f18482b |= 4;
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
        }

        public static final class d extends h0 implements MessageOrBuilder {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final d f18492f = new d();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final p1 f18493g = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18494b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18495c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18496d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private byte f18497e;

            static class a extends com.explorestack.protobuf.b {
                a() {
                }

                @Override // com.explorestack.protobuf.p1
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public d parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                    return new d(lVar, wVar);
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.f18322i;
            }

            public static d m() {
                return f18492f;
            }

            public static C0317b t() {
                return f18492f.toBuilder();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return super.equals(obj);
                }
                d dVar = (d) obj;
                if (s() != dVar.s()) {
                    return false;
                }
                if ((!s() || q() == dVar.q()) && r() == dVar.r()) {
                    return (!r() || o() == dVar.o()) && this.unknownFields.equals(dVar.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return f18493g;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iX = (this.f18494b & 1) != 0 ? com.explorestack.protobuf.n.x(1, this.f18495c) : 0;
                if ((this.f18494b & 2) != 0) {
                    iX += com.explorestack.protobuf.n.x(2, this.f18496d);
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
                if (s()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + q();
                }
                if (r()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + o();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18323j.d(d.class, C0317b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f18497e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f18497e = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public d getDefaultInstanceForType() {
                return f18492f;
            }

            @Override // com.explorestack.protobuf.h0
            protected Object newInstance(h0.g gVar) {
                return new d();
            }

            public int o() {
                return this.f18496d;
            }

            public int q() {
                return this.f18495c;
            }

            public boolean r() {
                return (this.f18494b & 2) != 0;
            }

            public boolean s() {
                return (this.f18494b & 1) != 0;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0317b newBuilderForType() {
                return t();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public C0317b newBuilderForType(h0.c cVar) {
                return new C0317b(cVar);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(com.explorestack.protobuf.n nVar) {
                if ((this.f18494b & 1) != 0) {
                    nVar.F0(1, this.f18495c);
                }
                if ((this.f18494b & 2) != 0) {
                    nVar.F0(2, this.f18496d);
                }
                this.unknownFields.writeTo(nVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public C0317b toBuilder() {
                return this == f18492f ? new C0317b() : new C0317b().r(this);
            }

            /* JADX INFO: renamed from: com.explorestack.protobuf.DescriptorProtos$b$d$b, reason: collision with other inner class name */
            public static final class C0317b extends h0.b implements MessageOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f18498b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f18499c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f18500d;

                private void maybeForceBuilderInitialization() {
                    boolean z10 = h0.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public C0317b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0317b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.f18322i;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public d build() {
                    d dVarBuildPartial = buildPartial();
                    if (dVarBuildPartial.isInitialized()) {
                        return dVarBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) dVarBuildPartial);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return DescriptorProtos.f18323j.d(d.class, C0317b.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public d buildPartial() {
                    int i10;
                    d dVar = new d(this);
                    int i11 = this.f18498b;
                    if ((i11 & 1) != 0) {
                        dVar.f18495c = this.f18499c;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        dVar.f18496d = this.f18500d;
                        i10 |= 2;
                    }
                    dVar.f18494b = i10;
                    onBuilt();
                    return dVar;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public C0317b clear() {
                    super.clear();
                    this.f18499c = 0;
                    int i10 = this.f18498b;
                    this.f18500d = 0;
                    this.f18498b = i10 & (-4);
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public C0317b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C0317b) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public C0317b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C0317b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public C0317b mo4427clone() {
                    return (C0317b) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public d getDefaultInstanceForType() {
                    return d.m();
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.DescriptorProtos.b.d.C0317b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.b.d.f18493g     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        com.explorestack.protobuf.DescriptorProtos$b$d r3 = (com.explorestack.protobuf.DescriptorProtos.b.d) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.r(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        com.explorestack.protobuf.DescriptorProtos$b$d r4 = (com.explorestack.protobuf.DescriptorProtos.b.d) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.r(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.b.d.C0317b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$b$d$b");
                }

                public C0317b r(d dVar) {
                    if (dVar == d.m()) {
                        return this;
                    }
                    if (dVar.s()) {
                        x(dVar.q());
                    }
                    if (dVar.r()) {
                        u(dVar.o());
                    }
                    mergeUnknownFields(dVar.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public C0317b mergeFrom(Message message) {
                    if (message instanceof d) {
                        return r((d) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C0317b mergeUnknownFields(r2 r2Var) {
                    return (C0317b) super.mergeUnknownFields(r2Var);
                }

                public C0317b u(int i10) {
                    this.f18498b |= 2;
                    this.f18500d = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public C0317b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0317b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public C0317b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C0317b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                public C0317b x(int i10) {
                    this.f18498b |= 1;
                    this.f18499c = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public final C0317b setUnknownFields(r2 r2Var) {
                    return (C0317b) super.setUnknownFields(r2Var);
                }

                private C0317b() {
                    maybeForceBuilderInitialization();
                }

                private C0317b(h0.c cVar) {
                    super(cVar);
                    maybeForceBuilderInitialization();
                }
            }

            private d(h0.b bVar) {
                super(bVar);
                this.f18497e = (byte) -1;
            }

            private d() {
                this.f18497e = (byte) -1;
            }

            private d(com.explorestack.protobuf.l lVar, w wVar) {
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
                                    this.f18494b |= 1;
                                    this.f18495c = lVar.y();
                                } else if (iK != 16) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.f18494b |= 2;
                                    this.f18496d = lVar.y();
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
        }

        public static b H() {
            return f18447n;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18318e;
        }

        public static C0315b i0() {
            return f18447n.toBuilder();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b getDefaultInstanceForType() {
            return f18447n;
        }

        public c J(int i10) {
            return (c) this.f18454g.get(i10);
        }

        public int K() {
            return this.f18454g.size();
        }

        public List L() {
            return this.f18454g;
        }

        public FieldDescriptorProto M(int i10) {
            return (FieldDescriptorProto) this.f18452e.get(i10);
        }

        public int N() {
            return this.f18452e.size();
        }

        public List O() {
            return this.f18452e;
        }

        public c P(int i10) {
            return (c) this.f18455h.get(i10);
        }

        public int Q() {
            return this.f18455h.size();
        }

        public List S() {
            return this.f18455h;
        }

        public FieldDescriptorProto T(int i10) {
            return (FieldDescriptorProto) this.f18451d.get(i10);
        }

        public int U() {
            return this.f18451d.size();
        }

        public List V() {
            return this.f18451d;
        }

        public b W(int i10) {
            return (b) this.f18453f.get(i10);
        }

        public int X() {
            return this.f18453f.size();
        }

        public List Y() {
            return this.f18453f;
        }

        public l Z(int i10) {
            return (l) this.f18456i.get(i10);
        }

        public int a0() {
            return this.f18456i.size();
        }

        public List b0() {
            return this.f18456i;
        }

        public j c0() {
            j jVar = this.f18457j;
            return jVar == null ? j.A() : jVar;
        }

        public int d0() {
            return this.f18459l.size();
        }

        public t1 e0() {
            return this.f18459l;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return super.equals(obj);
            }
            b bVar = (b) obj;
            if (hasName() != bVar.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(bVar.getName())) && V().equals(bVar.V()) && O().equals(bVar.O()) && Y().equals(bVar.Y()) && L().equals(bVar.L()) && S().equals(bVar.S()) && b0().equals(bVar.b0()) && h0() == bVar.h0()) {
                return (!h0() || c0().equals(bVar.c0())) && g0().equals(bVar.g0()) && e0().equals(bVar.e0()) && this.unknownFields.equals(bVar.unknownFields);
            }
            return false;
        }

        public int f0() {
            return this.f18458k.size();
        }

        public List g0() {
            return this.f18458k;
        }

        public String getName() {
            Object obj = this.f18450c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18450c = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18448o;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18449b & 1) != 0 ? h0.computeStringSize(1, this.f18450c) : 0;
            for (int i11 = 0; i11 < this.f18451d.size(); i11++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(2, (MessageLite) this.f18451d.get(i11));
            }
            for (int i12 = 0; i12 < this.f18453f.size(); i12++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(3, (MessageLite) this.f18453f.get(i12));
            }
            for (int i13 = 0; i13 < this.f18454g.size(); i13++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(4, (MessageLite) this.f18454g.get(i13));
            }
            for (int i14 = 0; i14 < this.f18455h.size(); i14++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(5, (MessageLite) this.f18455h.get(i14));
            }
            for (int i15 = 0; i15 < this.f18452e.size(); i15++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(6, (MessageLite) this.f18452e.get(i15));
            }
            if ((this.f18449b & 2) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.G(7, c0());
            }
            for (int i16 = 0; i16 < this.f18456i.size(); i16++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(8, (MessageLite) this.f18456i.get(i16));
            }
            for (int i17 = 0; i17 < this.f18458k.size(); i17++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(9, (MessageLite) this.f18458k.get(i17));
            }
            int iComputeStringSizeNoTag = 0;
            for (int i18 = 0; i18 < this.f18459l.size(); i18++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.f18459l.getRaw(i18));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + e0().size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean h0() {
            return (this.f18449b & 2) != 0;
        }

        public boolean hasName() {
            return (this.f18449b & 1) != 0;
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
            if (U() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + V().hashCode();
            }
            if (N() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + O().hashCode();
            }
            if (X() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Y().hashCode();
            }
            if (K() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + L().hashCode();
            }
            if (Q() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + S().hashCode();
            }
            if (a0() > 0) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + b0().hashCode();
            }
            if (h0()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + c0().hashCode();
            }
            if (f0() > 0) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + g0().hashCode();
            }
            if (d0() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + e0().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18319f.d(b.class, C0315b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18460m;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < U(); i10++) {
                if (!T(i10).isInitialized()) {
                    this.f18460m = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < N(); i11++) {
                if (!M(i11).isInitialized()) {
                    this.f18460m = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < X(); i12++) {
                if (!W(i12).isInitialized()) {
                    this.f18460m = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < K(); i13++) {
                if (!J(i13).isInitialized()) {
                    this.f18460m = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < Q(); i14++) {
                if (!P(i14).isInitialized()) {
                    this.f18460m = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < a0(); i15++) {
                if (!Z(i15).isInitialized()) {
                    this.f18460m = (byte) 0;
                    return false;
                }
            }
            if (!h0() || c0().isInitialized()) {
                this.f18460m = (byte) 1;
                return true;
            }
            this.f18460m = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public C0315b newBuilderForType() {
            return i0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public C0315b newBuilderForType(h0.c cVar) {
            return new C0315b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public C0315b toBuilder() {
            return this == f18447n ? new C0315b() : new C0315b().V(this);
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new b();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            if ((this.f18449b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18450c);
            }
            for (int i10 = 0; i10 < this.f18451d.size(); i10++) {
                nVar.J0(2, (MessageLite) this.f18451d.get(i10));
            }
            for (int i11 = 0; i11 < this.f18453f.size(); i11++) {
                nVar.J0(3, (MessageLite) this.f18453f.get(i11));
            }
            for (int i12 = 0; i12 < this.f18454g.size(); i12++) {
                nVar.J0(4, (MessageLite) this.f18454g.get(i12));
            }
            for (int i13 = 0; i13 < this.f18455h.size(); i13++) {
                nVar.J0(5, (MessageLite) this.f18455h.get(i13));
            }
            for (int i14 = 0; i14 < this.f18452e.size(); i14++) {
                nVar.J0(6, (MessageLite) this.f18452e.get(i14));
            }
            if ((this.f18449b & 2) != 0) {
                nVar.J0(7, c0());
            }
            for (int i15 = 0; i15 < this.f18456i.size(); i15++) {
                nVar.J0(8, (MessageLite) this.f18456i.get(i15));
            }
            for (int i16 = 0; i16 < this.f18458k.size(); i16++) {
                nVar.J0(9, (MessageLite) this.f18458k.get(i16));
            }
            for (int i17 = 0; i17 < this.f18459l.size(); i17++) {
                h0.writeString(nVar, 10, this.f18459l.getRaw(i17));
            }
            this.unknownFields.writeTo(nVar);
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.DescriptorProtos$b$b, reason: collision with other inner class name */
        public static final class C0315b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18461b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18462c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List f18463d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private v1 f18464e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List f18465f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private v1 f18466g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List f18467h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private v1 f18468i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List f18469j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private v1 f18470k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private List f18471l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private v1 f18472m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List f18473n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private v1 f18474o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private j f18475p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private a2 f18476q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private List f18477r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private v1 f18478s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private p0 f18479t;

            private v1 A() {
                if (this.f18470k == null) {
                    this.f18470k = new v1(this.f18469j, (this.f18461b & 16) != 0, getParentForChildren(), isClean());
                    this.f18469j = null;
                }
                return this.f18470k;
            }

            private v1 D() {
                if (this.f18466g == null) {
                    this.f18466g = new v1(this.f18465f, (this.f18461b & 4) != 0, getParentForChildren(), isClean());
                    this.f18465f = null;
                }
                return this.f18466g;
            }

            private v1 G() {
                if (this.f18472m == null) {
                    this.f18472m = new v1(this.f18471l, (this.f18461b & 32) != 0, getParentForChildren(), isClean());
                    this.f18471l = null;
                }
                return this.f18472m;
            }

            private v1 J() {
                if (this.f18464e == null) {
                    this.f18464e = new v1(this.f18463d, (this.f18461b & 2) != 0, getParentForChildren(), isClean());
                    this.f18463d = null;
                }
                return this.f18464e;
            }

            private v1 M() {
                if (this.f18468i == null) {
                    this.f18468i = new v1(this.f18467h, (this.f18461b & 8) != 0, getParentForChildren(), isClean());
                    this.f18467h = null;
                }
                return this.f18468i;
            }

            private v1 P() {
                if (this.f18474o == null) {
                    this.f18474o = new v1(this.f18473n, (this.f18461b & 64) != 0, getParentForChildren(), isClean());
                    this.f18473n = null;
                }
                return this.f18474o;
            }

            private a2 R() {
                if (this.f18476q == null) {
                    this.f18476q = new a2(Q(), getParentForChildren(), isClean());
                    this.f18475p = null;
                }
                return this.f18476q;
            }

            private v1 S() {
                if (this.f18478s == null) {
                    this.f18478s = new v1(this.f18477r, (this.f18461b & 256) != 0, getParentForChildren(), isClean());
                    this.f18477r = null;
                }
                return this.f18478s;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    J();
                    D();
                    M();
                    A();
                    G();
                    P();
                    R();
                    S();
                }
            }

            private void p() {
                if ((this.f18461b & 16) == 0) {
                    this.f18469j = new ArrayList(this.f18469j);
                    this.f18461b |= 16;
                }
            }

            private void q() {
                if ((this.f18461b & 4) == 0) {
                    this.f18465f = new ArrayList(this.f18465f);
                    this.f18461b |= 4;
                }
            }

            private void r() {
                if ((this.f18461b & 32) == 0) {
                    this.f18471l = new ArrayList(this.f18471l);
                    this.f18461b |= 32;
                }
            }

            private void s() {
                if ((this.f18461b & 2) == 0) {
                    this.f18463d = new ArrayList(this.f18463d);
                    this.f18461b |= 2;
                }
            }

            private void t() {
                if ((this.f18461b & 8) == 0) {
                    this.f18467h = new ArrayList(this.f18467h);
                    this.f18461b |= 8;
                }
            }

            private void u() {
                if ((this.f18461b & 64) == 0) {
                    this.f18473n = new ArrayList(this.f18473n);
                    this.f18461b |= 64;
                }
            }

            private void v() {
                if ((this.f18461b & 512) == 0) {
                    this.f18479t = new o0(this.f18479t);
                    this.f18461b |= 512;
                }
            }

            private void w() {
                if ((this.f18461b & 256) == 0) {
                    this.f18477r = new ArrayList(this.f18477r);
                    this.f18461b |= 256;
                }
            }

            public FieldDescriptorProto B(int i10) {
                v1 v1Var = this.f18466g;
                return v1Var == null ? (FieldDescriptorProto) this.f18465f.get(i10) : (FieldDescriptorProto) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18466g;
                return v1Var == null ? this.f18465f.size() : v1Var.m();
            }

            public c E(int i10) {
                v1 v1Var = this.f18472m;
                return v1Var == null ? (c) this.f18471l.get(i10) : (c) v1Var.n(i10);
            }

            public int F() {
                v1 v1Var = this.f18472m;
                return v1Var == null ? this.f18471l.size() : v1Var.m();
            }

            public FieldDescriptorProto H(int i10) {
                v1 v1Var = this.f18464e;
                return v1Var == null ? (FieldDescriptorProto) this.f18463d.get(i10) : (FieldDescriptorProto) v1Var.n(i10);
            }

            public int I() {
                v1 v1Var = this.f18464e;
                return v1Var == null ? this.f18463d.size() : v1Var.m();
            }

            public b K(int i10) {
                v1 v1Var = this.f18468i;
                return v1Var == null ? (b) this.f18467h.get(i10) : (b) v1Var.n(i10);
            }

            public int L() {
                v1 v1Var = this.f18468i;
                return v1Var == null ? this.f18467h.size() : v1Var.m();
            }

            public l N(int i10) {
                v1 v1Var = this.f18474o;
                return v1Var == null ? (l) this.f18473n.get(i10) : (l) v1Var.n(i10);
            }

            public int O() {
                v1 v1Var = this.f18474o;
                return v1Var == null ? this.f18473n.size() : v1Var.m();
            }

            public j Q() {
                a2 a2Var = this.f18476q;
                if (a2Var != null) {
                    return (j) a2Var.e();
                }
                j jVar = this.f18475p;
                return jVar == null ? j.A() : jVar;
            }

            public boolean T() {
                return (this.f18461b & 128) != 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.b.C0315b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.b.f18448o     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$b r3 = (com.explorestack.protobuf.DescriptorProtos.b) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.V(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$b r4 = (com.explorestack.protobuf.DescriptorProtos.b) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.V(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.b.C0315b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$b$b");
            }

            public C0315b V(b bVar) {
                if (bVar == b.H()) {
                    return this;
                }
                if (bVar.hasName()) {
                    this.f18461b |= 1;
                    this.f18462c = bVar.f18450c;
                    onChanged();
                }
                if (this.f18464e == null) {
                    if (!bVar.f18451d.isEmpty()) {
                        if (this.f18463d.isEmpty()) {
                            this.f18463d = bVar.f18451d;
                            this.f18461b &= -3;
                        } else {
                            s();
                            this.f18463d.addAll(bVar.f18451d);
                        }
                        onChanged();
                    }
                } else if (!bVar.f18451d.isEmpty()) {
                    if (this.f18464e.t()) {
                        this.f18464e.h();
                        this.f18464e = null;
                        this.f18463d = bVar.f18451d;
                        this.f18461b &= -3;
                        this.f18464e = h0.alwaysUseFieldBuilders ? J() : null;
                    } else {
                        this.f18464e.a(bVar.f18451d);
                    }
                }
                if (this.f18466g == null) {
                    if (!bVar.f18452e.isEmpty()) {
                        if (this.f18465f.isEmpty()) {
                            this.f18465f = bVar.f18452e;
                            this.f18461b &= -5;
                        } else {
                            q();
                            this.f18465f.addAll(bVar.f18452e);
                        }
                        onChanged();
                    }
                } else if (!bVar.f18452e.isEmpty()) {
                    if (this.f18466g.t()) {
                        this.f18466g.h();
                        this.f18466g = null;
                        this.f18465f = bVar.f18452e;
                        this.f18461b &= -5;
                        this.f18466g = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18466g.a(bVar.f18452e);
                    }
                }
                if (this.f18468i == null) {
                    if (!bVar.f18453f.isEmpty()) {
                        if (this.f18467h.isEmpty()) {
                            this.f18467h = bVar.f18453f;
                            this.f18461b &= -9;
                        } else {
                            t();
                            this.f18467h.addAll(bVar.f18453f);
                        }
                        onChanged();
                    }
                } else if (!bVar.f18453f.isEmpty()) {
                    if (this.f18468i.t()) {
                        this.f18468i.h();
                        this.f18468i = null;
                        this.f18467h = bVar.f18453f;
                        this.f18461b &= -9;
                        this.f18468i = h0.alwaysUseFieldBuilders ? M() : null;
                    } else {
                        this.f18468i.a(bVar.f18453f);
                    }
                }
                if (this.f18470k == null) {
                    if (!bVar.f18454g.isEmpty()) {
                        if (this.f18469j.isEmpty()) {
                            this.f18469j = bVar.f18454g;
                            this.f18461b &= -17;
                        } else {
                            p();
                            this.f18469j.addAll(bVar.f18454g);
                        }
                        onChanged();
                    }
                } else if (!bVar.f18454g.isEmpty()) {
                    if (this.f18470k.t()) {
                        this.f18470k.h();
                        this.f18470k = null;
                        this.f18469j = bVar.f18454g;
                        this.f18461b &= -17;
                        this.f18470k = h0.alwaysUseFieldBuilders ? A() : null;
                    } else {
                        this.f18470k.a(bVar.f18454g);
                    }
                }
                if (this.f18472m == null) {
                    if (!bVar.f18455h.isEmpty()) {
                        if (this.f18471l.isEmpty()) {
                            this.f18471l = bVar.f18455h;
                            this.f18461b &= -33;
                        } else {
                            r();
                            this.f18471l.addAll(bVar.f18455h);
                        }
                        onChanged();
                    }
                } else if (!bVar.f18455h.isEmpty()) {
                    if (this.f18472m.t()) {
                        this.f18472m.h();
                        this.f18472m = null;
                        this.f18471l = bVar.f18455h;
                        this.f18461b &= -33;
                        this.f18472m = h0.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.f18472m.a(bVar.f18455h);
                    }
                }
                if (this.f18474o == null) {
                    if (!bVar.f18456i.isEmpty()) {
                        if (this.f18473n.isEmpty()) {
                            this.f18473n = bVar.f18456i;
                            this.f18461b &= -65;
                        } else {
                            u();
                            this.f18473n.addAll(bVar.f18456i);
                        }
                        onChanged();
                    }
                } else if (!bVar.f18456i.isEmpty()) {
                    if (this.f18474o.t()) {
                        this.f18474o.h();
                        this.f18474o = null;
                        this.f18473n = bVar.f18456i;
                        this.f18461b &= -65;
                        this.f18474o = h0.alwaysUseFieldBuilders ? P() : null;
                    } else {
                        this.f18474o.a(bVar.f18456i);
                    }
                }
                if (bVar.h0()) {
                    X(bVar.c0());
                }
                if (this.f18478s == null) {
                    if (!bVar.f18458k.isEmpty()) {
                        if (this.f18477r.isEmpty()) {
                            this.f18477r = bVar.f18458k;
                            this.f18461b &= -257;
                        } else {
                            w();
                            this.f18477r.addAll(bVar.f18458k);
                        }
                        onChanged();
                    }
                } else if (!bVar.f18458k.isEmpty()) {
                    if (this.f18478s.t()) {
                        this.f18478s.h();
                        this.f18478s = null;
                        this.f18477r = bVar.f18458k;
                        this.f18461b &= -257;
                        this.f18478s = h0.alwaysUseFieldBuilders ? S() : null;
                    } else {
                        this.f18478s.a(bVar.f18458k);
                    }
                }
                if (!bVar.f18459l.isEmpty()) {
                    if (this.f18479t.isEmpty()) {
                        this.f18479t = bVar.f18459l;
                        this.f18461b &= -513;
                    } else {
                        v();
                        this.f18479t.addAll(bVar.f18459l);
                    }
                    onChanged();
                }
                mergeUnknownFields(bVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public C0315b mergeFrom(Message message) {
                if (message instanceof b) {
                    return V((b) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public C0315b X(j jVar) {
                j jVar2;
                a2 a2Var = this.f18476q;
                if (a2Var == null) {
                    if ((this.f18461b & 128) == 0 || (jVar2 = this.f18475p) == null || jVar2 == j.A()) {
                        this.f18475p = jVar;
                    } else {
                        this.f18475p = j.O(this.f18475p).F(jVar).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(jVar);
                }
                this.f18461b |= 128;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final C0315b mergeUnknownFields(r2 r2Var) {
                return (C0315b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public C0315b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C0315b) super.setField(fieldDescriptor, obj);
            }

            public C0315b a0(String str) {
                str.getClass();
                this.f18461b |= 1;
                this.f18462c = str;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public C0315b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C0315b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
            public final C0315b setUnknownFields(r2 r2Var) {
                return (C0315b) super.setUnknownFields(r2Var);
            }

            public C0315b g(c cVar) {
                v1 v1Var = this.f18472m;
                if (v1Var != null) {
                    v1Var.e(cVar);
                    return this;
                }
                cVar.getClass();
                r();
                this.f18471l.add(cVar);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18318e;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public C0315b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C0315b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarBuildPartial = buildPartial();
                if (bVarBuildPartial.isInitialized()) {
                    return bVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18319f.d(b.class, C0315b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < I(); i10++) {
                    if (!H(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < C(); i11++) {
                    if (!B(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < L(); i12++) {
                    if (!K(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < z(); i13++) {
                    if (!y(i13).isInitialized()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < F(); i14++) {
                    if (!E(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < O(); i15++) {
                    if (!N(i15).isInitialized()) {
                        return false;
                    }
                }
                return !T() || Q().isInitialized();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b buildPartial() {
                b bVar = new b(this);
                int i10 = this.f18461b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                bVar.f18450c = this.f18462c;
                v1 v1Var = this.f18464e;
                if (v1Var == null) {
                    if ((this.f18461b & 2) != 0) {
                        this.f18463d = DesugarCollections.unmodifiableList(this.f18463d);
                        this.f18461b &= -3;
                    }
                    bVar.f18451d = this.f18463d;
                } else {
                    bVar.f18451d = v1Var.f();
                }
                v1 v1Var2 = this.f18466g;
                if (v1Var2 == null) {
                    if ((this.f18461b & 4) != 0) {
                        this.f18465f = DesugarCollections.unmodifiableList(this.f18465f);
                        this.f18461b &= -5;
                    }
                    bVar.f18452e = this.f18465f;
                } else {
                    bVar.f18452e = v1Var2.f();
                }
                v1 v1Var3 = this.f18468i;
                if (v1Var3 == null) {
                    if ((this.f18461b & 8) != 0) {
                        this.f18467h = DesugarCollections.unmodifiableList(this.f18467h);
                        this.f18461b &= -9;
                    }
                    bVar.f18453f = this.f18467h;
                } else {
                    bVar.f18453f = v1Var3.f();
                }
                v1 v1Var4 = this.f18470k;
                if (v1Var4 == null) {
                    if ((this.f18461b & 16) != 0) {
                        this.f18469j = DesugarCollections.unmodifiableList(this.f18469j);
                        this.f18461b &= -17;
                    }
                    bVar.f18454g = this.f18469j;
                } else {
                    bVar.f18454g = v1Var4.f();
                }
                v1 v1Var5 = this.f18472m;
                if (v1Var5 == null) {
                    if ((this.f18461b & 32) != 0) {
                        this.f18471l = DesugarCollections.unmodifiableList(this.f18471l);
                        this.f18461b &= -33;
                    }
                    bVar.f18455h = this.f18471l;
                } else {
                    bVar.f18455h = v1Var5.f();
                }
                v1 v1Var6 = this.f18474o;
                if (v1Var6 == null) {
                    if ((this.f18461b & 64) != 0) {
                        this.f18473n = DesugarCollections.unmodifiableList(this.f18473n);
                        this.f18461b &= -65;
                    }
                    bVar.f18456i = this.f18473n;
                } else {
                    bVar.f18456i = v1Var6.f();
                }
                if ((i10 & 128) != 0) {
                    a2 a2Var = this.f18476q;
                    if (a2Var == null) {
                        bVar.f18457j = this.f18475p;
                    } else {
                        bVar.f18457j = (j) a2Var.a();
                    }
                    i11 |= 2;
                }
                v1 v1Var7 = this.f18478s;
                if (v1Var7 == null) {
                    if ((this.f18461b & 256) != 0) {
                        this.f18477r = DesugarCollections.unmodifiableList(this.f18477r);
                        this.f18461b &= -257;
                    }
                    bVar.f18458k = this.f18477r;
                } else {
                    bVar.f18458k = v1Var7.f();
                }
                if ((this.f18461b & 512) != 0) {
                    this.f18479t = this.f18479t.getUnmodifiableView();
                    this.f18461b &= -513;
                }
                bVar.f18459l = this.f18479t;
                bVar.f18449b = i11;
                onBuilt();
                return bVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public C0315b clear() {
                super.clear();
                this.f18462c = "";
                int i10 = this.f18461b;
                this.f18461b = i10 & (-2);
                v1 v1Var = this.f18464e;
                if (v1Var == null) {
                    this.f18463d = Collections.EMPTY_LIST;
                    this.f18461b = i10 & (-4);
                } else {
                    v1Var.g();
                }
                v1 v1Var2 = this.f18466g;
                if (v1Var2 == null) {
                    this.f18465f = Collections.EMPTY_LIST;
                    this.f18461b &= -5;
                } else {
                    v1Var2.g();
                }
                v1 v1Var3 = this.f18468i;
                if (v1Var3 == null) {
                    this.f18467h = Collections.EMPTY_LIST;
                    this.f18461b &= -9;
                } else {
                    v1Var3.g();
                }
                v1 v1Var4 = this.f18470k;
                if (v1Var4 == null) {
                    this.f18469j = Collections.EMPTY_LIST;
                    this.f18461b &= -17;
                } else {
                    v1Var4.g();
                }
                v1 v1Var5 = this.f18472m;
                if (v1Var5 == null) {
                    this.f18471l = Collections.EMPTY_LIST;
                    this.f18461b &= -33;
                } else {
                    v1Var5.g();
                }
                v1 v1Var6 = this.f18474o;
                if (v1Var6 == null) {
                    this.f18473n = Collections.EMPTY_LIST;
                    this.f18461b &= -65;
                } else {
                    v1Var6.g();
                }
                a2 a2Var = this.f18476q;
                if (a2Var == null) {
                    this.f18475p = null;
                } else {
                    a2Var.b();
                }
                int i11 = this.f18461b;
                this.f18461b = i11 & (-129);
                v1 v1Var7 = this.f18478s;
                if (v1Var7 == null) {
                    this.f18477r = Collections.EMPTY_LIST;
                    this.f18461b = i11 & (-385);
                } else {
                    v1Var7.g();
                }
                this.f18479t = o0.f19269e;
                this.f18461b &= -513;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public C0315b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C0315b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0315b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C0315b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0315b mo4427clone() {
                return (C0315b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b getDefaultInstanceForType() {
                return b.H();
            }

            public c y(int i10) {
                v1 v1Var = this.f18470k;
                return v1Var == null ? (c) this.f18469j.get(i10) : (c) v1Var.n(i10);
            }

            public int z() {
                v1 v1Var = this.f18470k;
                return v1Var == null ? this.f18469j.size() : v1Var.m();
            }

            private C0315b() {
                this.f18462c = "";
                List list = Collections.EMPTY_LIST;
                this.f18463d = list;
                this.f18465f = list;
                this.f18467h = list;
                this.f18469j = list;
                this.f18471l = list;
                this.f18473n = list;
                this.f18477r = list;
                this.f18479t = o0.f19269e;
                maybeForceBuilderInitialization();
            }

            private C0315b(h0.c cVar) {
                super(cVar);
                this.f18462c = "";
                List list = Collections.EMPTY_LIST;
                this.f18463d = list;
                this.f18465f = list;
                this.f18467h = list;
                this.f18469j = list;
                this.f18471l = list;
                this.f18473n = list;
                this.f18477r = list;
                this.f18479t = o0.f19269e;
                maybeForceBuilderInitialization();
            }
        }

        private b(h0.b bVar) {
            super(bVar);
            this.f18460m = (byte) -1;
        }

        private b() {
            this.f18460m = (byte) -1;
            this.f18450c = "";
            List list = Collections.EMPTY_LIST;
            this.f18451d = list;
            this.f18452e = list;
            this.f18453f = list;
            this.f18454g = list;
            this.f18455h = list;
            this.f18456i = list;
            this.f18458k = list;
            this.f18459l = o0.f19269e;
        }

        private b(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                                break;
                            case 10:
                                ByteString byteStringR = lVar.r();
                                this.f18449b = 1 | this.f18449b;
                                this.f18450c = byteStringR;
                                break;
                            case 18:
                                if ((i10 & 2) == 0) {
                                    this.f18451d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f18451d.add(lVar.A(FieldDescriptorProto.f18341p, wVar));
                                break;
                            case 26:
                                if ((i10 & 8) == 0) {
                                    this.f18453f = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f18453f.add(lVar.A(f18448o, wVar));
                                break;
                            case 34:
                                if ((i10 & 16) == 0) {
                                    this.f18454g = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f18454g.add(lVar.A(c.f18502j, wVar));
                                break;
                            case 42:
                                if ((i10 & 32) == 0) {
                                    this.f18455h = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f18455h.add(lVar.A(c.f18481h, wVar));
                                break;
                            case 50:
                                if ((i10 & 4) == 0) {
                                    this.f18452e = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f18452e.add(lVar.A(FieldDescriptorProto.f18341p, wVar));
                                break;
                            case 58:
                                j.b builder = (this.f18449b & 2) != 0 ? this.f18457j.toBuilder() : null;
                                j jVar = (j) lVar.A(j.f18626k, wVar);
                                this.f18457j = jVar;
                                if (builder != null) {
                                    builder.F(jVar);
                                    this.f18457j = builder.buildPartial();
                                }
                                this.f18449b |= 2;
                                break;
                            case 66:
                                if ((i10 & 64) == 0) {
                                    this.f18456i = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f18456i.add(lVar.A(l.f18660g, wVar));
                                break;
                            case 74:
                                if ((i10 & 256) == 0) {
                                    this.f18458k = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f18458k.add(lVar.A(d.f18493g, wVar));
                                break;
                            case 82:
                                ByteString byteStringR2 = lVar.r();
                                if ((i10 & 512) == 0) {
                                    this.f18459l = new o0();
                                    i10 |= 512;
                                }
                                this.f18459l.c(byteStringR2);
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
                    if ((i10 & 2) != 0) {
                        this.f18451d = DesugarCollections.unmodifiableList(this.f18451d);
                    }
                    if ((i10 & 8) != 0) {
                        this.f18453f = DesugarCollections.unmodifiableList(this.f18453f);
                    }
                    if ((i10 & 16) != 0) {
                        this.f18454g = DesugarCollections.unmodifiableList(this.f18454g);
                    }
                    if ((i10 & 32) != 0) {
                        this.f18455h = DesugarCollections.unmodifiableList(this.f18455h);
                    }
                    if ((i10 & 4) != 0) {
                        this.f18452e = DesugarCollections.unmodifiableList(this.f18452e);
                    }
                    if ((i10 & 64) != 0) {
                        this.f18456i = DesugarCollections.unmodifiableList(this.f18456i);
                    }
                    if ((i10 & 256) != 0) {
                        this.f18458k = DesugarCollections.unmodifiableList(this.f18458k);
                    }
                    if ((i10 & 512) != 0) {
                        this.f18459l = this.f18459l.getUnmodifiableView();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 2) != 0) {
                this.f18451d = DesugarCollections.unmodifiableList(this.f18451d);
            }
            if ((i10 & 8) != 0) {
                this.f18453f = DesugarCollections.unmodifiableList(this.f18453f);
            }
            if ((i10 & 16) != 0) {
                this.f18454g = DesugarCollections.unmodifiableList(this.f18454g);
            }
            if ((i10 & 32) != 0) {
                this.f18455h = DesugarCollections.unmodifiableList(this.f18455h);
            }
            if ((i10 & 4) != 0) {
                this.f18452e = DesugarCollections.unmodifiableList(this.f18452e);
            }
            if ((i10 & 64) != 0) {
                this.f18456i = DesugarCollections.unmodifiableList(this.f18456i);
            }
            if ((i10 & 256) != 0) {
                this.f18458k = DesugarCollections.unmodifiableList(this.f18458k);
            }
            if ((i10 & 512) != 0) {
                this.f18459l = this.f18459l.getUnmodifiableView();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class c extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f18501i = new c();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final p1 f18502j = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f18505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f18506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f18507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p0 f18508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f18509h;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new c(lVar, wVar);
            }
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.DescriptorProtos$c$c, reason: collision with other inner class name */
        public static final class C0318c extends h0 implements MessageOrBuilder {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final C0318c f18519f = new C0318c();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final p1 f18520g = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18521b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18522c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18523d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private byte f18524e;

            /* JADX INFO: renamed from: com.explorestack.protobuf.DescriptorProtos$c$c$a */
            static class a extends com.explorestack.protobuf.b {
                a() {
                }

                @Override // com.explorestack.protobuf.p1
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public C0318c parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                    return new C0318c(lVar, wVar);
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.f18332s;
            }

            public static C0318c m() {
                return f18519f;
            }

            public static b t() {
                return f18519f.toBuilder();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof C0318c)) {
                    return super.equals(obj);
                }
                C0318c c0318c = (C0318c) obj;
                if (s() != c0318c.s()) {
                    return false;
                }
                if ((!s() || q() == c0318c.q()) && r() == c0318c.r()) {
                    return (!r() || o() == c0318c.o()) && this.unknownFields.equals(c0318c.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return f18520g;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iX = (this.f18521b & 1) != 0 ? com.explorestack.protobuf.n.x(1, this.f18522c) : 0;
                if ((this.f18521b & 2) != 0) {
                    iX += com.explorestack.protobuf.n.x(2, this.f18523d);
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
                if (s()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + q();
                }
                if (r()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + o();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18333t.d(C0318c.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f18524e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f18524e = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0318c getDefaultInstanceForType() {
                return f18519f;
            }

            @Override // com.explorestack.protobuf.h0
            protected Object newInstance(h0.g gVar) {
                return new C0318c();
            }

            public int o() {
                return this.f18523d;
            }

            public int q() {
                return this.f18522c;
            }

            public boolean r() {
                return (this.f18521b & 2) != 0;
            }

            public boolean s() {
                return (this.f18521b & 1) != 0;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return t();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType(h0.c cVar) {
                return new b(cVar);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(com.explorestack.protobuf.n nVar) {
                if ((this.f18521b & 1) != 0) {
                    nVar.F0(1, this.f18522c);
                }
                if ((this.f18521b & 2) != 0) {
                    nVar.F0(2, this.f18523d);
                }
                this.unknownFields.writeTo(nVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return this == f18519f ? new b() : new b().r(this);
            }

            /* JADX INFO: renamed from: com.explorestack.protobuf.DescriptorProtos$c$c$b */
            public static final class b extends h0.b implements MessageOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f18525b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f18526c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f18527d;

                private void maybeForceBuilderInitialization() {
                    boolean z10 = h0.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.f18332s;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public C0318c build() {
                    C0318c c0318cBuildPartial = buildPartial();
                    if (c0318cBuildPartial.isInitialized()) {
                        return c0318cBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) c0318cBuildPartial);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return DescriptorProtos.f18333t.d(C0318c.class, b.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public C0318c buildPartial() {
                    int i10;
                    C0318c c0318c = new C0318c(this);
                    int i11 = this.f18525b;
                    if ((i11 & 1) != 0) {
                        c0318c.f18522c = this.f18526c;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        c0318c.f18523d = this.f18527d;
                        i10 |= 2;
                    }
                    c0318c.f18521b = i10;
                    onBuilt();
                    return c0318c;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b clear() {
                    super.clear();
                    this.f18526c = 0;
                    int i10 = this.f18525b;
                    this.f18527d = 0;
                    this.f18525b = i10 & (-4);
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public b mo4427clone() {
                    return (b) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public C0318c getDefaultInstanceForType() {
                    return C0318c.m();
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.DescriptorProtos.c.C0318c.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.c.C0318c.f18520g     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        com.explorestack.protobuf.DescriptorProtos$c$c r3 = (com.explorestack.protobuf.DescriptorProtos.c.C0318c) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.r(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        com.explorestack.protobuf.DescriptorProtos$c$c r4 = (com.explorestack.protobuf.DescriptorProtos.c.C0318c) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.r(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.c.C0318c.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$c$c$b");
                }

                public b r(C0318c c0318c) {
                    if (c0318c == C0318c.m()) {
                        return this;
                    }
                    if (c0318c.s()) {
                        x(c0318c.q());
                    }
                    if (c0318c.r()) {
                        u(c0318c.o());
                    }
                    mergeUnknownFields(c0318c.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(Message message) {
                    if (message instanceof C0318c) {
                        return r((C0318c) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final b mergeUnknownFields(r2 r2Var) {
                    return (b) super.mergeUnknownFields(r2Var);
                }

                public b u(int i10) {
                    this.f18525b |= 2;
                    this.f18527d = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                public b x(int i10) {
                    this.f18525b |= 1;
                    this.f18526c = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r2 r2Var) {
                    return (b) super.setUnknownFields(r2Var);
                }

                private b() {
                    maybeForceBuilderInitialization();
                }

                private b(h0.c cVar) {
                    super(cVar);
                    maybeForceBuilderInitialization();
                }
            }

            private C0318c(h0.b bVar) {
                super(bVar);
                this.f18524e = (byte) -1;
            }

            private C0318c() {
                this.f18524e = (byte) -1;
            }

            private C0318c(com.explorestack.protobuf.l lVar, w wVar) {
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
                                    this.f18521b |= 1;
                                    this.f18522c = lVar.y();
                                } else if (iK != 16) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.f18521b |= 2;
                                    this.f18523d = lVar.y();
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
        }

        public static b I() {
            return f18501i.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18330q;
        }

        public static c u() {
            return f18501i;
        }

        public int A() {
            return this.f18508g.size();
        }

        public t1 B() {
            return this.f18508g;
        }

        public int C() {
            return this.f18507f.size();
        }

        public List D() {
            return this.f18507f;
        }

        public e E(int i10) {
            return (e) this.f18505d.get(i10);
        }

        public int F() {
            return this.f18505d.size();
        }

        public List G() {
            return this.f18505d;
        }

        public boolean H() {
            return (this.f18503b & 2) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return I();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18501i ? new b() : new b().B(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return super.equals(obj);
            }
            c cVar = (c) obj;
            if (hasName() != cVar.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(cVar.getName())) && G().equals(cVar.G()) && H() == cVar.H()) {
                return (!H() || x().equals(cVar.x())) && D().equals(cVar.D()) && B().equals(cVar.B()) && this.unknownFields.equals(cVar.unknownFields);
            }
            return false;
        }

        public String getName() {
            Object obj = this.f18504c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18504c = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18502j;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18503b & 1) != 0 ? h0.computeStringSize(1, this.f18504c) : 0;
            for (int i11 = 0; i11 < this.f18505d.size(); i11++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(2, (MessageLite) this.f18505d.get(i11));
            }
            if ((this.f18503b & 2) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.G(3, x());
            }
            for (int i12 = 0; i12 < this.f18507f.size(); i12++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(4, (MessageLite) this.f18507f.get(i12));
            }
            int iComputeStringSizeNoTag = 0;
            for (int i13 = 0; i13 < this.f18508g.size(); i13++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.f18508g.getRaw(i13));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + B().size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.f18503b & 1) != 0;
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
            if (F() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + G().hashCode();
            }
            if (H()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + x().hashCode();
            }
            if (C() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + D().hashCode();
            }
            if (A() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + B().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18331r.d(c.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18509h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < F(); i10++) {
                if (!E(i10).isInitialized()) {
                    this.f18509h = (byte) 0;
                    return false;
                }
            }
            if (!H() || x().isInitialized()) {
                this.f18509h = (byte) 1;
                return true;
            }
            this.f18509h = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new c();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public c getDefaultInstanceForType() {
            return f18501i;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            if ((this.f18503b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18504c);
            }
            for (int i10 = 0; i10 < this.f18505d.size(); i10++) {
                nVar.J0(2, (MessageLite) this.f18505d.get(i10));
            }
            if ((this.f18503b & 2) != 0) {
                nVar.J0(3, x());
            }
            for (int i11 = 0; i11 < this.f18507f.size(); i11++) {
                nVar.J0(4, (MessageLite) this.f18507f.get(i11));
            }
            for (int i12 = 0; i12 < this.f18508g.size(); i12++) {
                h0.writeString(nVar, 5, this.f18508g.getRaw(i12));
            }
            this.unknownFields.writeTo(nVar);
        }

        public d x() {
            d dVar = this.f18506e;
            return dVar == null ? d.x() : dVar;
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18510b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18511c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List f18512d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private v1 f18513e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private d f18514f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private a2 f18515g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List f18516h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private v1 f18517i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private p0 f18518j;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    y();
                    u();
                    v();
                }
            }

            private void p() {
                if ((this.f18510b & 16) == 0) {
                    this.f18518j = new o0(this.f18518j);
                    this.f18510b |= 16;
                }
            }

            private void q() {
                if ((this.f18510b & 8) == 0) {
                    this.f18516h = new ArrayList(this.f18516h);
                    this.f18510b |= 8;
                }
            }

            private void r() {
                if ((this.f18510b & 2) == 0) {
                    this.f18512d = new ArrayList(this.f18512d);
                    this.f18510b |= 2;
                }
            }

            private a2 u() {
                if (this.f18515g == null) {
                    this.f18515g = new a2(t(), getParentForChildren(), isClean());
                    this.f18514f = null;
                }
                return this.f18515g;
            }

            private v1 v() {
                if (this.f18517i == null) {
                    this.f18517i = new v1(this.f18516h, (this.f18510b & 8) != 0, getParentForChildren(), isClean());
                    this.f18516h = null;
                }
                return this.f18517i;
            }

            private v1 y() {
                if (this.f18513e == null) {
                    this.f18513e = new v1(this.f18512d, (this.f18510b & 2) != 0, getParentForChildren(), isClean());
                    this.f18512d = null;
                }
                return this.f18513e;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.c.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.c.f18502j     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$c r3 = (com.explorestack.protobuf.DescriptorProtos.c) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.B(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$c r4 = (com.explorestack.protobuf.DescriptorProtos.c) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.B(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.c.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$c$b");
            }

            public b B(c cVar) {
                if (cVar == c.u()) {
                    return this;
                }
                if (cVar.hasName()) {
                    this.f18510b |= 1;
                    this.f18511c = cVar.f18504c;
                    onChanged();
                }
                if (this.f18513e == null) {
                    if (!cVar.f18505d.isEmpty()) {
                        if (this.f18512d.isEmpty()) {
                            this.f18512d = cVar.f18505d;
                            this.f18510b &= -3;
                        } else {
                            r();
                            this.f18512d.addAll(cVar.f18505d);
                        }
                        onChanged();
                    }
                } else if (!cVar.f18505d.isEmpty()) {
                    if (this.f18513e.t()) {
                        this.f18513e.h();
                        this.f18513e = null;
                        this.f18512d = cVar.f18505d;
                        this.f18510b &= -3;
                        this.f18513e = h0.alwaysUseFieldBuilders ? y() : null;
                    } else {
                        this.f18513e.a(cVar.f18505d);
                    }
                }
                if (cVar.H()) {
                    D(cVar.x());
                }
                if (this.f18517i == null) {
                    if (!cVar.f18507f.isEmpty()) {
                        if (this.f18516h.isEmpty()) {
                            this.f18516h = cVar.f18507f;
                            this.f18510b &= -9;
                        } else {
                            q();
                            this.f18516h.addAll(cVar.f18507f);
                        }
                        onChanged();
                    }
                } else if (!cVar.f18507f.isEmpty()) {
                    if (this.f18517i.t()) {
                        this.f18517i.h();
                        this.f18517i = null;
                        this.f18516h = cVar.f18507f;
                        this.f18510b &= -9;
                        this.f18517i = h0.alwaysUseFieldBuilders ? v() : null;
                    } else {
                        this.f18517i.a(cVar.f18507f);
                    }
                }
                if (!cVar.f18508g.isEmpty()) {
                    if (this.f18518j.isEmpty()) {
                        this.f18518j = cVar.f18508g;
                        this.f18510b &= -17;
                    } else {
                        p();
                        this.f18518j.addAll(cVar.f18508g);
                    }
                    onChanged();
                }
                mergeUnknownFields(cVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof c) {
                    return B((c) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b D(d dVar) {
                d dVar2;
                a2 a2Var = this.f18515g;
                if (a2Var == null) {
                    if ((this.f18510b & 4) == 0 || (dVar2 = this.f18514f) == null || dVar2 == d.x()) {
                        this.f18514f = dVar;
                    } else {
                        this.f18514f = d.I(this.f18514f).F(dVar).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(dVar);
                }
                this.f18510b |= 4;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18330q;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarBuildPartial = buildPartial();
                if (cVarBuildPartial.isInitialized()) {
                    return cVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18331r.d(c.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < x(); i10++) {
                    if (!w(i10).isInitialized()) {
                        return false;
                    }
                }
                return !z() || t().isInitialized();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c buildPartial() {
                c cVar = new c(this);
                int i10 = this.f18510b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                cVar.f18504c = this.f18511c;
                v1 v1Var = this.f18513e;
                if (v1Var == null) {
                    if ((this.f18510b & 2) != 0) {
                        this.f18512d = DesugarCollections.unmodifiableList(this.f18512d);
                        this.f18510b &= -3;
                    }
                    cVar.f18505d = this.f18512d;
                } else {
                    cVar.f18505d = v1Var.f();
                }
                if ((i10 & 4) != 0) {
                    a2 a2Var = this.f18515g;
                    if (a2Var == null) {
                        cVar.f18506e = this.f18514f;
                    } else {
                        cVar.f18506e = (d) a2Var.a();
                    }
                    i11 |= 2;
                }
                v1 v1Var2 = this.f18517i;
                if (v1Var2 == null) {
                    if ((this.f18510b & 8) != 0) {
                        this.f18516h = DesugarCollections.unmodifiableList(this.f18516h);
                        this.f18510b &= -9;
                    }
                    cVar.f18507f = this.f18516h;
                } else {
                    cVar.f18507f = v1Var2.f();
                }
                if ((this.f18510b & 16) != 0) {
                    this.f18518j = this.f18518j.getUnmodifiableView();
                    this.f18510b &= -17;
                }
                cVar.f18508g = this.f18518j;
                cVar.f18503b = i11;
                onBuilt();
                return cVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f18511c = "";
                int i10 = this.f18510b;
                this.f18510b = i10 & (-2);
                v1 v1Var = this.f18513e;
                if (v1Var == null) {
                    this.f18512d = Collections.EMPTY_LIST;
                    this.f18510b = i10 & (-4);
                } else {
                    v1Var.g();
                }
                a2 a2Var = this.f18515g;
                if (a2Var == null) {
                    this.f18514f = null;
                } else {
                    a2Var.b();
                }
                int i11 = this.f18510b;
                this.f18510b = i11 & (-5);
                v1 v1Var2 = this.f18517i;
                if (v1Var2 == null) {
                    this.f18516h = Collections.EMPTY_LIST;
                    this.f18510b = i11 & (-13);
                } else {
                    v1Var2.g();
                }
                this.f18518j = o0.f19269e;
                this.f18510b &= -17;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return c.u();
            }

            public d t() {
                a2 a2Var = this.f18515g;
                if (a2Var != null) {
                    return (d) a2Var.e();
                }
                d dVar = this.f18514f;
                return dVar == null ? d.x() : dVar;
            }

            public e w(int i10) {
                v1 v1Var = this.f18513e;
                return v1Var == null ? (e) this.f18512d.get(i10) : (e) v1Var.n(i10);
            }

            public int x() {
                v1 v1Var = this.f18513e;
                return v1Var == null ? this.f18512d.size() : v1Var.m();
            }

            public boolean z() {
                return (this.f18510b & 4) != 0;
            }

            private b() {
                this.f18511c = "";
                List list = Collections.EMPTY_LIST;
                this.f18512d = list;
                this.f18516h = list;
                this.f18518j = o0.f19269e;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18511c = "";
                List list = Collections.EMPTY_LIST;
                this.f18512d = list;
                this.f18516h = list;
                this.f18518j = o0.f19269e;
                maybeForceBuilderInitialization();
            }
        }

        private c(h0.b bVar) {
            super(bVar);
            this.f18509h = (byte) -1;
        }

        private c() {
            this.f18509h = (byte) -1;
            this.f18504c = "";
            List list = Collections.EMPTY_LIST;
            this.f18505d = list;
            this.f18507f = list;
            this.f18508g = o0.f19269e;
        }

        private c(com.explorestack.protobuf.l lVar, w wVar) {
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
                                ByteString byteStringR = lVar.r();
                                this.f18503b = 1 | this.f18503b;
                                this.f18504c = byteStringR;
                            } else if (iK == 18) {
                                if ((i10 & 2) == 0) {
                                    this.f18505d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f18505d.add(lVar.A(e.f18541h, wVar));
                            } else if (iK == 26) {
                                d.b builder = (this.f18503b & 2) != 0 ? this.f18506e.toBuilder() : null;
                                d dVar = (d) lVar.A(d.f18529i, wVar);
                                this.f18506e = dVar;
                                if (builder != null) {
                                    builder.F(dVar);
                                    this.f18506e = builder.buildPartial();
                                }
                                this.f18503b |= 2;
                            } else if (iK == 34) {
                                if ((i10 & 8) == 0) {
                                    this.f18507f = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f18507f.add(lVar.A(C0318c.f18520g, wVar));
                            } else if (iK != 42) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                ByteString byteStringR2 = lVar.r();
                                if ((i10 & 16) == 0) {
                                    this.f18508g = new o0();
                                    i10 |= 16;
                                }
                                this.f18508g.c(byteStringR2);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 2) != 0) {
                        this.f18505d = DesugarCollections.unmodifiableList(this.f18505d);
                    }
                    if ((i10 & 8) != 0) {
                        this.f18507f = DesugarCollections.unmodifiableList(this.f18507f);
                    }
                    if ((i10 & 16) != 0) {
                        this.f18508g = this.f18508g.getUnmodifiableView();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 2) != 0) {
                this.f18505d = DesugarCollections.unmodifiableList(this.f18505d);
            }
            if ((i10 & 8) != 0) {
                this.f18507f = DesugarCollections.unmodifiableList(this.f18507f);
            }
            if ((i10 & 16) != 0) {
                this.f18508g = this.f18508g.getUnmodifiableView();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class d extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final d f18528h = new d();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final p1 f18529i = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f18533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f18534g;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new d(lVar, wVar);
            }
        }

        public static b H() {
            return f18528h.toBuilder();
        }

        public static b I(d dVar) {
            return f18528h.toBuilder().F(dVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.I;
        }

        public static d x() {
            return f18528h;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public d getDefaultInstanceForType() {
            return f18528h;
        }

        public boolean B() {
            return this.f18532e;
        }

        public q C(int i10) {
            return (q) this.f18533f.get(i10);
        }

        public int D() {
            return this.f18533f.size();
        }

        public List E() {
            return this.f18533f;
        }

        public boolean F() {
            return (this.f18530c & 1) != 0;
        }

        public boolean G() {
            return (this.f18530c & 2) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return H();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18528h ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return super.equals(obj);
            }
            d dVar = (d) obj;
            if (F() != dVar.F()) {
                return false;
            }
            if ((!F() || v() == dVar.v()) && G() == dVar.G()) {
                return (!G() || B() == dVar.B()) && E().equals(dVar.E()) && this.unknownFields.equals(dVar.unknownFields) && m().equals(dVar.m());
            }
            return false;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18529i;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f18530c & 1) != 0 ? com.explorestack.protobuf.n.e(2, this.f18531d) : 0;
            if ((2 & this.f18530c) != 0) {
                iE += com.explorestack.protobuf.n.e(3, this.f18532e);
            }
            for (int i11 = 0; i11 < this.f18533f.size(); i11++) {
                iE += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18533f.get(i11));
            }
            int iL = iE + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL;
            return iL;
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
            if (F()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + j0.d(v());
            }
            if (G()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + j0.d(B());
            }
            if (D() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + E().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.J.d(d.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18534g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < D(); i10++) {
                if (!C(i10).isInitialized()) {
                    this.f18534g = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18534g = (byte) 1;
                return true;
            }
            this.f18534g = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new d();
        }

        public boolean v() {
            return this.f18531d;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            h0.e.a aVarN = n();
            if ((this.f18530c & 1) != 0) {
                nVar.n0(2, this.f18531d);
            }
            if ((this.f18530c & 2) != 0) {
                nVar.n0(3, this.f18532e);
            }
            for (int i10 = 0; i10 < this.f18533f.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18533f.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18535c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f18536d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f18537e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List f18538f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private v1 f18539g;

            private v1 D() {
                if (this.f18539g == null) {
                    this.f18539g = new v1(this.f18538f, (this.f18535c & 4) != 0, getParentForChildren(), isClean());
                    this.f18538f = null;
                }
                return this.f18539g;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18535c & 4) == 0) {
                    this.f18538f = new ArrayList(this.f18538f);
                    this.f18535c |= 4;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public d getDefaultInstanceForType() {
                return d.x();
            }

            public q B(int i10) {
                v1 v1Var = this.f18539g;
                return v1Var == null ? (q) this.f18538f.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18539g;
                return v1Var == null ? this.f18538f.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.d.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.d.f18529i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$d r3 = (com.explorestack.protobuf.DescriptorProtos.d) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$d r4 = (com.explorestack.protobuf.DescriptorProtos.d) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.d.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$d$b");
            }

            public b F(d dVar) {
                if (dVar == d.x()) {
                    return this;
                }
                if (dVar.F()) {
                    I(dVar.v());
                }
                if (dVar.G()) {
                    J(dVar.B());
                }
                if (this.f18539g == null) {
                    if (!dVar.f18533f.isEmpty()) {
                        if (this.f18538f.isEmpty()) {
                            this.f18538f = dVar.f18533f;
                            this.f18535c &= -5;
                        } else {
                            z();
                            this.f18538f.addAll(dVar.f18533f);
                        }
                        onChanged();
                    }
                } else if (!dVar.f18533f.isEmpty()) {
                    if (this.f18539g.t()) {
                        this.f18539g.h();
                        this.f18539g = null;
                        this.f18538f = dVar.f18533f;
                        this.f18535c &= -5;
                        this.f18539g = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18539g.a(dVar.f18533f);
                    }
                }
                o(dVar);
                mergeUnknownFields(dVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof d) {
                    return F((d) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b I(boolean z10) {
                this.f18535c |= 1;
                this.f18536d = z10;
                onChanged();
                return this;
            }

            public b J(boolean z10) {
                this.f18535c |= 2;
                this.f18537e = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.I;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.J.d(d.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public d build() {
                d dVarBuildPartial = buildPartial();
                if (dVarBuildPartial.isInitialized()) {
                    return dVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public d buildPartial() {
                int i10;
                d dVar = new d(this);
                int i11 = this.f18535c;
                if ((i11 & 1) != 0) {
                    dVar.f18531d = this.f18536d;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    dVar.f18532e = this.f18537e;
                    i10 |= 2;
                }
                v1 v1Var = this.f18539g;
                if (v1Var == null) {
                    if ((this.f18535c & 4) != 0) {
                        this.f18538f = DesugarCollections.unmodifiableList(this.f18538f);
                        this.f18535c &= -5;
                    }
                    dVar.f18533f = this.f18538f;
                } else {
                    dVar.f18533f = v1Var.f();
                }
                dVar.f18530c = i10;
                onBuilt();
                return dVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                this.f18536d = false;
                int i10 = this.f18535c;
                this.f18537e = false;
                this.f18535c = i10 & (-4);
                v1 v1Var = this.f18539g;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18538f = Collections.EMPTY_LIST;
                this.f18535c = i10 & (-8);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18538f = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18538f = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private d(h0.d dVar) {
            super(dVar);
            this.f18534g = (byte) -1;
        }

        private d() {
            this.f18534g = (byte) -1;
            this.f18533f = Collections.EMPTY_LIST;
        }

        private d(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 16) {
                                this.f18530c |= 1;
                                this.f18531d = lVar.q();
                            } else if (iK == 24) {
                                this.f18530c |= 2;
                                this.f18532e = lVar.q();
                            } else if (iK != 7994) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((c10 & 4) == 0) {
                                    this.f18533f = new ArrayList();
                                    c10 = 4;
                                }
                                this.f18533f.add(lVar.A(q.f18724l, wVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((c10 & 4) != 0) {
                        this.f18533f = DesugarCollections.unmodifiableList(this.f18533f);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((c10 & 4) != 0) {
                this.f18533f = DesugarCollections.unmodifiableList(this.f18533f);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class e extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final e f18540g = new e();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final p1 f18541h = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f f18545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f18546f;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public e parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new e(lVar, wVar);
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18334u;
        }

        public static e o() {
            return f18540g;
        }

        public static b v() {
            return f18540g.toBuilder();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18540g ? new b() : new b().u(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return super.equals(obj);
            }
            e eVar = (e) obj;
            if (hasName() != eVar.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(eVar.getName())) || t() != eVar.t()) {
                return false;
            }
            if ((!t() || r() == eVar.r()) && u() == eVar.u()) {
                return (!u() || s().equals(eVar.s())) && this.unknownFields.equals(eVar.unknownFields);
            }
            return false;
        }

        public String getName() {
            Object obj = this.f18543c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18543c = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18541h;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18542b & 1) != 0 ? h0.computeStringSize(1, this.f18543c) : 0;
            if ((this.f18542b & 2) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.x(2, this.f18544d);
            }
            if ((this.f18542b & 4) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.G(3, s());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.f18542b & 1) != 0;
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
            if (t()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + r();
            }
            if (u()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + s().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18335v.d(e.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18546f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!u() || s().isInitialized()) {
                this.f18546f = (byte) 1;
                return true;
            }
            this.f18546f = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new e();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public e getDefaultInstanceForType() {
            return f18540g;
        }

        public int r() {
            return this.f18544d;
        }

        public f s() {
            f fVar = this.f18545e;
            return fVar == null ? f.u() : fVar;
        }

        public boolean t() {
            return (this.f18542b & 2) != 0;
        }

        public boolean u() {
            return (this.f18542b & 4) != 0;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            if ((this.f18542b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18543c);
            }
            if ((this.f18542b & 2) != 0) {
                nVar.F0(2, this.f18544d);
            }
            if ((this.f18542b & 4) != 0) {
                nVar.J0(3, s());
            }
            this.unknownFields.writeTo(nVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return v();
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18547b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18548c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18549d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private f f18550e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private a2 f18551f;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            private a2 r() {
                if (this.f18551f == null) {
                    this.f18551f = new a2(q(), getParentForChildren(), isClean());
                    this.f18550e = null;
                }
                return this.f18551f;
            }

            public b A(int i10) {
                this.f18547b |= 2;
                this.f18549d = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18334u;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public e build() {
                e eVarBuildPartial = buildPartial();
                if (eVarBuildPartial.isInitialized()) {
                    return eVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18335v.d(e.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return !s() || q().isInitialized();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e buildPartial() {
                e eVar = new e(this);
                int i10 = this.f18547b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                eVar.f18543c = this.f18548c;
                if ((i10 & 2) != 0) {
                    eVar.f18544d = this.f18549d;
                    i11 |= 2;
                }
                if ((i10 & 4) != 0) {
                    a2 a2Var = this.f18551f;
                    if (a2Var == null) {
                        eVar.f18545e = this.f18550e;
                    } else {
                        eVar.f18545e = (f) a2Var.a();
                    }
                    i11 |= 4;
                }
                eVar.f18542b = i11;
                onBuilt();
                return eVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f18548c = "";
                int i10 = this.f18547b;
                this.f18549d = 0;
                this.f18547b = i10 & (-4);
                a2 a2Var = this.f18551f;
                if (a2Var == null) {
                    this.f18550e = null;
                } else {
                    a2Var.b();
                }
                this.f18547b &= -5;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public e getDefaultInstanceForType() {
                return e.o();
            }

            public f q() {
                a2 a2Var = this.f18551f;
                if (a2Var != null) {
                    return (f) a2Var.e();
                }
                f fVar = this.f18550e;
                return fVar == null ? f.u() : fVar;
            }

            public boolean s() {
                return (this.f18547b & 4) != 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.e.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.e.f18541h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$e r3 = (com.explorestack.protobuf.DescriptorProtos.e) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.u(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$e r4 = (com.explorestack.protobuf.DescriptorProtos.e) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.u(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.e.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$e$b");
            }

            public b u(e eVar) {
                if (eVar == e.o()) {
                    return this;
                }
                if (eVar.hasName()) {
                    this.f18547b |= 1;
                    this.f18548c = eVar.f18543c;
                    onChanged();
                }
                if (eVar.t()) {
                    A(eVar.r());
                }
                if (eVar.u()) {
                    w(eVar.s());
                }
                mergeUnknownFields(eVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof e) {
                    return u((e) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b w(f fVar) {
                f fVar2;
                a2 a2Var = this.f18551f;
                if (a2Var == null) {
                    if ((this.f18547b & 4) == 0 || (fVar2 = this.f18550e) == null || fVar2 == f.u()) {
                        this.f18550e = fVar;
                    } else {
                        this.f18550e = f.F(this.f18550e).F(fVar).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(fVar);
                }
                this.f18547b |= 4;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b z(String str) {
                str.getClass();
                this.f18547b |= 1;
                this.f18548c = str;
                onChanged();
                return this;
            }

            private b() {
                this.f18548c = "";
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18548c = "";
                maybeForceBuilderInitialization();
            }
        }

        private e(h0.b bVar) {
            super(bVar);
            this.f18546f = (byte) -1;
        }

        private e() {
            this.f18546f = (byte) -1;
            this.f18543c = "";
        }

        private e(com.explorestack.protobuf.l lVar, w wVar) {
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
                                ByteString byteStringR = lVar.r();
                                this.f18542b = 1 | this.f18542b;
                                this.f18543c = byteStringR;
                            } else if (iK == 16) {
                                this.f18542b |= 2;
                                this.f18544d = lVar.y();
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                f.b builder = (this.f18542b & 4) != 0 ? this.f18545e.toBuilder() : null;
                                f fVar = (f) lVar.A(f.f18553h, wVar);
                                this.f18545e = fVar;
                                if (builder != null) {
                                    builder.F(fVar);
                                    this.f18545e = builder.buildPartial();
                                }
                                this.f18542b |= 4;
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
    }

    public static final class f extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final f f18552g = new f();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final p1 f18553h = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f18556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f18557f;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new f(lVar, wVar);
            }
        }

        public static b E() {
            return f18552g.toBuilder();
        }

        public static b F(f fVar) {
            return f18552g.toBuilder().F(fVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.K;
        }

        public static f u() {
            return f18552g;
        }

        public q A(int i10) {
            return (q) this.f18556e.get(i10);
        }

        public int B() {
            return this.f18556e.size();
        }

        public List C() {
            return this.f18556e;
        }

        public boolean D() {
            return (this.f18554c & 1) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return E();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18552g ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return super.equals(obj);
            }
            f fVar = (f) obj;
            if (D() != fVar.D()) {
                return false;
            }
            return (!D() || x() == fVar.x()) && C().equals(fVar.C()) && this.unknownFields.equals(fVar.unknownFields) && m().equals(fVar.m());
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18553h;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f18554c & 1) != 0 ? com.explorestack.protobuf.n.e(1, this.f18555d) : 0;
            for (int i11 = 0; i11 < this.f18556e.size(); i11++) {
                iE += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18556e.get(i11));
            }
            int iL = iE + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL;
            return iL;
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
            if (D()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + j0.d(x());
            }
            if (B() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + C().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.L.d(f.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18557f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < B(); i10++) {
                if (!A(i10).isInitialized()) {
                    this.f18557f = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18557f = (byte) 1;
                return true;
            }
            this.f18557f = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new f();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public f getDefaultInstanceForType() {
            return f18552g;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            h0.e.a aVarN = n();
            if ((this.f18554c & 1) != 0) {
                nVar.n0(1, this.f18555d);
            }
            for (int i10 = 0; i10 < this.f18556e.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18556e.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        public boolean x() {
            return this.f18555d;
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18558c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f18559d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private List f18560e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private v1 f18561f;

            private v1 D() {
                if (this.f18561f == null) {
                    this.f18561f = new v1(this.f18560e, (this.f18558c & 2) != 0, getParentForChildren(), isClean());
                    this.f18560e = null;
                }
                return this.f18561f;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18558c & 2) == 0) {
                    this.f18560e = new ArrayList(this.f18560e);
                    this.f18558c |= 2;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public f getDefaultInstanceForType() {
                return f.u();
            }

            public q B(int i10) {
                v1 v1Var = this.f18561f;
                return v1Var == null ? (q) this.f18560e.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18561f;
                return v1Var == null ? this.f18560e.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.f.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.f.f18553h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$f r3 = (com.explorestack.protobuf.DescriptorProtos.f) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$f r4 = (com.explorestack.protobuf.DescriptorProtos.f) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.f.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$f$b");
            }

            public b F(f fVar) {
                if (fVar == f.u()) {
                    return this;
                }
                if (fVar.D()) {
                    I(fVar.x());
                }
                if (this.f18561f == null) {
                    if (!fVar.f18556e.isEmpty()) {
                        if (this.f18560e.isEmpty()) {
                            this.f18560e = fVar.f18556e;
                            this.f18558c &= -3;
                        } else {
                            z();
                            this.f18560e.addAll(fVar.f18556e);
                        }
                        onChanged();
                    }
                } else if (!fVar.f18556e.isEmpty()) {
                    if (this.f18561f.t()) {
                        this.f18561f.h();
                        this.f18561f = null;
                        this.f18560e = fVar.f18556e;
                        this.f18558c &= -3;
                        this.f18561f = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18561f.a(fVar.f18556e);
                    }
                }
                o(fVar);
                mergeUnknownFields(fVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof f) {
                    return F((f) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b I(boolean z10) {
                this.f18558c |= 1;
                this.f18559d = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.K;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.L.d(f.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public f build() {
                f fVarBuildPartial = buildPartial();
                if (fVarBuildPartial.isInitialized()) {
                    return fVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public f buildPartial() {
                f fVar = new f(this);
                int i10 = 1;
                if ((this.f18558c & 1) != 0) {
                    fVar.f18555d = this.f18559d;
                } else {
                    i10 = 0;
                }
                v1 v1Var = this.f18561f;
                if (v1Var == null) {
                    if ((this.f18558c & 2) != 0) {
                        this.f18560e = DesugarCollections.unmodifiableList(this.f18560e);
                        this.f18558c &= -3;
                    }
                    fVar.f18556e = this.f18560e;
                } else {
                    fVar.f18556e = v1Var.f();
                }
                fVar.f18554c = i10;
                onBuilt();
                return fVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                this.f18559d = false;
                int i10 = this.f18558c;
                this.f18558c = i10 & (-2);
                v1 v1Var = this.f18561f;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18560e = Collections.EMPTY_LIST;
                this.f18558c = i10 & (-4);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18560e = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18560e = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private f(h0.d dVar) {
            super(dVar);
            this.f18557f = (byte) -1;
        }

        private f() {
            this.f18557f = (byte) -1;
            this.f18556e = Collections.EMPTY_LIST;
        }

        private f(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f18554c |= 1;
                                this.f18555d = lVar.q();
                            } else if (iK != 7994) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((c10 & 2) == 0) {
                                    this.f18556e = new ArrayList();
                                    c10 = 2;
                                }
                                this.f18556e.add(lVar.A(q.f18724l, wVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((c10 & 2) != 0) {
                        this.f18556e = DesugarCollections.unmodifiableList(this.f18556e);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((c10 & 2) != 0) {
                this.f18556e = DesugarCollections.unmodifiableList(this.f18556e);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class g extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final g f18562e = new g();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final p1 f18563f = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f18564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f18565d;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new g(lVar, wVar);
            }
        }

        public static b A() {
            return f18562e.toBuilder();
        }

        public static b B(g gVar) {
            return f18562e.toBuilder().F(gVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18324k;
        }

        public static g s() {
            return f18562e;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return A();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18562e ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return super.equals(obj);
            }
            g gVar = (g) obj;
            return x().equals(gVar.x()) && this.unknownFields.equals(gVar.unknownFields) && m().equals(gVar.m());
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18563f;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.f18564c.size(); i11++) {
                iG += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18564c.get(i11));
            }
            int iL = iG + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL;
            return iL;
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
            if (v() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + x().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18325l.d(g.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18565d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < v(); i10++) {
                if (!u(i10).isInitialized()) {
                    this.f18565d = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18565d = (byte) 1;
                return true;
            }
            this.f18565d = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new g();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public g getDefaultInstanceForType() {
            return f18562e;
        }

        public q u(int i10) {
            return (q) this.f18564c.get(i10);
        }

        public int v() {
            return this.f18564c.size();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            h0.e.a aVarN = n();
            for (int i10 = 0; i10 < this.f18564c.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18564c.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        public List x() {
            return this.f18564c;
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18566c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List f18567d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private v1 f18568e;

            private v1 D() {
                if (this.f18568e == null) {
                    this.f18568e = new v1(this.f18567d, (this.f18566c & 1) != 0, getParentForChildren(), isClean());
                    this.f18567d = null;
                }
                return this.f18568e;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18566c & 1) == 0) {
                    this.f18567d = new ArrayList(this.f18567d);
                    this.f18566c |= 1;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public g getDefaultInstanceForType() {
                return g.s();
            }

            public q B(int i10) {
                v1 v1Var = this.f18568e;
                return v1Var == null ? (q) this.f18567d.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18568e;
                return v1Var == null ? this.f18567d.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.g.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.g.f18563f     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$g r3 = (com.explorestack.protobuf.DescriptorProtos.g) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$g r4 = (com.explorestack.protobuf.DescriptorProtos.g) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.g.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$g$b");
            }

            public b F(g gVar) {
                if (gVar == g.s()) {
                    return this;
                }
                if (this.f18568e == null) {
                    if (!gVar.f18564c.isEmpty()) {
                        if (this.f18567d.isEmpty()) {
                            this.f18567d = gVar.f18564c;
                            this.f18566c &= -2;
                        } else {
                            z();
                            this.f18567d.addAll(gVar.f18564c);
                        }
                        onChanged();
                    }
                } else if (!gVar.f18564c.isEmpty()) {
                    if (this.f18568e.t()) {
                        this.f18568e.h();
                        this.f18568e = null;
                        this.f18567d = gVar.f18564c;
                        this.f18566c &= -2;
                        this.f18568e = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18568e.a(gVar.f18564c);
                    }
                }
                o(gVar);
                mergeUnknownFields(gVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof g) {
                    return F((g) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18324k;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18325l.d(g.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public g build() {
                g gVarBuildPartial = buildPartial();
                if (gVarBuildPartial.isInitialized()) {
                    return gVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public g buildPartial() {
                g gVar = new g(this);
                int i10 = this.f18566c;
                v1 v1Var = this.f18568e;
                if (v1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.f18567d = DesugarCollections.unmodifiableList(this.f18567d);
                        this.f18566c &= -2;
                    }
                    gVar.f18564c = this.f18567d;
                } else {
                    gVar.f18564c = v1Var.f();
                }
                onBuilt();
                return gVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                v1 v1Var = this.f18568e;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18567d = Collections.EMPTY_LIST;
                this.f18566c &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18567d = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18567d = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private g(h0.d dVar) {
            super(dVar);
            this.f18565d = (byte) -1;
        }

        private g() {
            this.f18565d = (byte) -1;
            this.f18564c = Collections.EMPTY_LIST;
        }

        private g(com.explorestack.protobuf.l lVar, w wVar) {
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
                                if (iK != 7994) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    if (!z11) {
                                        this.f18564c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f18564c.add(lVar.A(q.f18724l, wVar));
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
                        this.f18564c = DesugarCollections.unmodifiableList(this.f18564c);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.f18564c = DesugarCollections.unmodifiableList(this.f18564c);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class h extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final h f18569p = new h();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final p1 f18570q = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile Object f18573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p0 f18574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private j0.g f18575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j0.g f18576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List f18577h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f18578i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f18579j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List f18580k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private FileOptions f18581l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private p f18582m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private volatile Object f18583n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private byte f18584o;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new h(lVar, wVar);
            }
        }

        public static h K() {
            return f18569p;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18315c;
        }

        public static b q0() {
            return f18569p.toBuilder();
        }

        public static h x0(ByteString byteString, w wVar) {
            return (h) f18570q.parseFrom(byteString, wVar);
        }

        public static h y0(byte[] bArr) {
            return (h) f18570q.parseFrom(bArr);
        }

        public static h z0(byte[] bArr, w wVar) {
            return (h) f18570q.parseFrom(bArr, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18569p ? new b() : new b().P(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public h getDefaultInstanceForType() {
            return f18569p;
        }

        public String M(int i10) {
            return (String) this.f18574e.get(i10);
        }

        public int N() {
            return this.f18574e.size();
        }

        public t1 O() {
            return this.f18574e;
        }

        public c P(int i10) {
            return (c) this.f18578i.get(i10);
        }

        public int Q() {
            return this.f18578i.size();
        }

        public List S() {
            return this.f18578i;
        }

        public FieldDescriptorProto T(int i10) {
            return (FieldDescriptorProto) this.f18580k.get(i10);
        }

        public int U() {
            return this.f18580k.size();
        }

        public List V() {
            return this.f18580k;
        }

        public b W(int i10) {
            return (b) this.f18577h.get(i10);
        }

        public int X() {
            return this.f18577h.size();
        }

        public List Y() {
            return this.f18577h;
        }

        public FileOptions Z() {
            FileOptions fileOptions = this.f18581l;
            return fileOptions == null ? FileOptions.e0() : fileOptions;
        }

        public String a0() {
            Object obj = this.f18573d;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18573d = stringUtf8;
            }
            return stringUtf8;
        }

        public int b0(int i10) {
            return this.f18575f.getInt(i10);
        }

        public int c0() {
            return this.f18575f.size();
        }

        public List d0() {
            return this.f18575f;
        }

        public n e0(int i10) {
            return (n) this.f18579j.get(i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return super.equals(obj);
            }
            h hVar = (h) obj;
            if (hasName() != hVar.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(hVar.getName())) || m0() != hVar.m0()) {
                return false;
            }
            if ((m0() && !a0().equals(hVar.a0())) || !O().equals(hVar.O()) || !d0().equals(hVar.d0()) || !k0().equals(hVar.k0()) || !Y().equals(hVar.Y()) || !S().equals(hVar.S()) || !g0().equals(hVar.g0()) || !V().equals(hVar.V()) || l0() != hVar.l0()) {
                return false;
            }
            if ((l0() && !Z().equals(hVar.Z())) || o0() != hVar.o0()) {
                return false;
            }
            if ((!o0() || h0().equals(hVar.h0())) && p0() == hVar.p0()) {
                return (!p0() || i0().equals(hVar.i0())) && this.unknownFields.equals(hVar.unknownFields);
            }
            return false;
        }

        public int f0() {
            return this.f18579j.size();
        }

        public List g0() {
            return this.f18579j;
        }

        public String getName() {
            Object obj = this.f18572c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18572c = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18570q;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18571b & 1) != 0 ? h0.computeStringSize(1, this.f18572c) : 0;
            if ((this.f18571b & 2) != 0) {
                iComputeStringSize += h0.computeStringSize(2, this.f18573d);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.f18574e.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.f18574e.getRaw(i11));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + O().size();
            for (int i12 = 0; i12 < this.f18577h.size(); i12++) {
                size += com.explorestack.protobuf.n.G(4, (MessageLite) this.f18577h.get(i12));
            }
            for (int i13 = 0; i13 < this.f18578i.size(); i13++) {
                size += com.explorestack.protobuf.n.G(5, (MessageLite) this.f18578i.get(i13));
            }
            for (int i14 = 0; i14 < this.f18579j.size(); i14++) {
                size += com.explorestack.protobuf.n.G(6, (MessageLite) this.f18579j.get(i14));
            }
            for (int i15 = 0; i15 < this.f18580k.size(); i15++) {
                size += com.explorestack.protobuf.n.G(7, (MessageLite) this.f18580k.get(i15));
            }
            if ((this.f18571b & 4) != 0) {
                size += com.explorestack.protobuf.n.G(8, Z());
            }
            if ((this.f18571b & 8) != 0) {
                size += com.explorestack.protobuf.n.G(9, h0());
            }
            int iY = 0;
            for (int i16 = 0; i16 < this.f18575f.size(); i16++) {
                iY += com.explorestack.protobuf.n.y(this.f18575f.getInt(i16));
            }
            int size2 = size + iY + d0().size();
            int iY2 = 0;
            for (int i17 = 0; i17 < this.f18576g.size(); i17++) {
                iY2 += com.explorestack.protobuf.n.y(this.f18576g.getInt(i17));
            }
            int size3 = size2 + iY2 + k0().size();
            if ((this.f18571b & 16) != 0) {
                size3 += h0.computeStringSize(12, this.f18583n);
            }
            int serializedSize = size3 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public p h0() {
            p pVar = this.f18582m;
            return pVar == null ? p.l() : pVar;
        }

        public boolean hasName() {
            return (this.f18571b & 1) != 0;
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
            if (m0()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + a0().hashCode();
            }
            if (N() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + O().hashCode();
            }
            if (c0() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + d0().hashCode();
            }
            if (j0() > 0) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + k0().hashCode();
            }
            if (X() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Y().hashCode();
            }
            if (Q() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + S().hashCode();
            }
            if (f0() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + g0().hashCode();
            }
            if (U() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + V().hashCode();
            }
            if (l0()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + Z().hashCode();
            }
            if (o0()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + h0().hashCode();
            }
            if (p0()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + i0().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public String i0() {
            Object obj = this.f18583n;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18583n = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18317d.d(h.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18584o;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < X(); i10++) {
                if (!W(i10).isInitialized()) {
                    this.f18584o = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < Q(); i11++) {
                if (!P(i11).isInitialized()) {
                    this.f18584o = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < f0(); i12++) {
                if (!e0(i12).isInitialized()) {
                    this.f18584o = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < U(); i13++) {
                if (!T(i13).isInitialized()) {
                    this.f18584o = (byte) 0;
                    return false;
                }
            }
            if (!l0() || Z().isInitialized()) {
                this.f18584o = (byte) 1;
                return true;
            }
            this.f18584o = (byte) 0;
            return false;
        }

        public int j0() {
            return this.f18576g.size();
        }

        public List k0() {
            return this.f18576g;
        }

        public boolean l0() {
            return (this.f18571b & 4) != 0;
        }

        public boolean m0() {
            return (this.f18571b & 2) != 0;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new h();
        }

        public boolean o0() {
            return (this.f18571b & 8) != 0;
        }

        public boolean p0() {
            return (this.f18571b & 16) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return q0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            if ((this.f18571b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18572c);
            }
            if ((this.f18571b & 2) != 0) {
                h0.writeString(nVar, 2, this.f18573d);
            }
            for (int i10 = 0; i10 < this.f18574e.size(); i10++) {
                h0.writeString(nVar, 3, this.f18574e.getRaw(i10));
            }
            for (int i11 = 0; i11 < this.f18577h.size(); i11++) {
                nVar.J0(4, (MessageLite) this.f18577h.get(i11));
            }
            for (int i12 = 0; i12 < this.f18578i.size(); i12++) {
                nVar.J0(5, (MessageLite) this.f18578i.get(i12));
            }
            for (int i13 = 0; i13 < this.f18579j.size(); i13++) {
                nVar.J0(6, (MessageLite) this.f18579j.get(i13));
            }
            for (int i14 = 0; i14 < this.f18580k.size(); i14++) {
                nVar.J0(7, (MessageLite) this.f18580k.get(i14));
            }
            if ((this.f18571b & 4) != 0) {
                nVar.J0(8, Z());
            }
            if ((this.f18571b & 8) != 0) {
                nVar.J0(9, h0());
            }
            for (int i15 = 0; i15 < this.f18575f.size(); i15++) {
                nVar.F0(10, this.f18575f.getInt(i15));
            }
            for (int i16 = 0; i16 < this.f18576g.size(); i16++) {
                nVar.F0(11, this.f18576g.getInt(i16));
            }
            if ((this.f18571b & 16) != 0) {
                h0.writeString(nVar, 12, this.f18583n);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18585b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18586c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Object f18587d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private p0 f18588e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private j0.g f18589f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private j0.g f18590g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List f18591h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private v1 f18592i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List f18593j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private v1 f18594k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private List f18595l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private v1 f18596m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List f18597n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private v1 f18598o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private FileOptions f18599p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private a2 f18600q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private p f18601r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private a2 f18602s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private Object f18603t;

            private v1 C() {
                if (this.f18598o == null) {
                    this.f18598o = new v1(this.f18597n, (this.f18585b & 256) != 0, getParentForChildren(), isClean());
                    this.f18597n = null;
                }
                return this.f18598o;
            }

            private v1 F() {
                if (this.f18592i == null) {
                    this.f18592i = new v1(this.f18591h, (this.f18585b & 32) != 0, getParentForChildren(), isClean());
                    this.f18591h = null;
                }
                return this.f18592i;
            }

            private a2 H() {
                if (this.f18600q == null) {
                    this.f18600q = new a2(G(), getParentForChildren(), isClean());
                    this.f18599p = null;
                }
                return this.f18600q;
            }

            private v1 K() {
                if (this.f18596m == null) {
                    this.f18596m = new v1(this.f18595l, (this.f18585b & 128) != 0, getParentForChildren(), isClean());
                    this.f18595l = null;
                }
                return this.f18596m;
            }

            private a2 M() {
                if (this.f18602s == null) {
                    this.f18602s = new a2(L(), getParentForChildren(), isClean());
                    this.f18601r = null;
                }
                return this.f18602s;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    F();
                    z();
                    K();
                    C();
                    H();
                    M();
                }
            }

            private void p() {
                if ((this.f18585b & 4) == 0) {
                    this.f18588e = new o0(this.f18588e);
                    this.f18585b |= 4;
                }
            }

            private void q() {
                if ((this.f18585b & 64) == 0) {
                    this.f18593j = new ArrayList(this.f18593j);
                    this.f18585b |= 64;
                }
            }

            private void r() {
                if ((this.f18585b & 256) == 0) {
                    this.f18597n = new ArrayList(this.f18597n);
                    this.f18585b |= 256;
                }
            }

            private void s() {
                if ((this.f18585b & 32) == 0) {
                    this.f18591h = new ArrayList(this.f18591h);
                    this.f18585b |= 32;
                }
            }

            private void t() {
                if ((this.f18585b & 8) == 0) {
                    this.f18589f = h0.mutableCopy(this.f18589f);
                    this.f18585b |= 8;
                }
            }

            private void u() {
                if ((this.f18585b & 128) == 0) {
                    this.f18595l = new ArrayList(this.f18595l);
                    this.f18585b |= 128;
                }
            }

            private void v() {
                if ((this.f18585b & 16) == 0) {
                    this.f18590g = h0.mutableCopy(this.f18590g);
                    this.f18585b |= 16;
                }
            }

            private v1 z() {
                if (this.f18594k == null) {
                    this.f18594k = new v1(this.f18593j, (this.f18585b & 64) != 0, getParentForChildren(), isClean());
                    this.f18593j = null;
                }
                return this.f18594k;
            }

            public FieldDescriptorProto A(int i10) {
                v1 v1Var = this.f18598o;
                return v1Var == null ? (FieldDescriptorProto) this.f18597n.get(i10) : (FieldDescriptorProto) v1Var.n(i10);
            }

            public int B() {
                v1 v1Var = this.f18598o;
                return v1Var == null ? this.f18597n.size() : v1Var.m();
            }

            public b D(int i10) {
                v1 v1Var = this.f18592i;
                return v1Var == null ? (b) this.f18591h.get(i10) : (b) v1Var.n(i10);
            }

            public int E() {
                v1 v1Var = this.f18592i;
                return v1Var == null ? this.f18591h.size() : v1Var.m();
            }

            public FileOptions G() {
                a2 a2Var = this.f18600q;
                if (a2Var != null) {
                    return (FileOptions) a2Var.e();
                }
                FileOptions fileOptions = this.f18599p;
                return fileOptions == null ? FileOptions.e0() : fileOptions;
            }

            public n I(int i10) {
                v1 v1Var = this.f18596m;
                return v1Var == null ? (n) this.f18595l.get(i10) : (n) v1Var.n(i10);
            }

            public int J() {
                v1 v1Var = this.f18596m;
                return v1Var == null ? this.f18595l.size() : v1Var.m();
            }

            public p L() {
                a2 a2Var = this.f18602s;
                if (a2Var != null) {
                    return (p) a2Var.e();
                }
                p pVar = this.f18601r;
                return pVar == null ? p.l() : pVar;
            }

            public boolean N() {
                return (this.f18585b & 512) != 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.h.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.h.f18570q     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$h r3 = (com.explorestack.protobuf.DescriptorProtos.h) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.P(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$h r4 = (com.explorestack.protobuf.DescriptorProtos.h) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.P(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.h.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$h$b");
            }

            public b P(h hVar) {
                if (hVar == h.K()) {
                    return this;
                }
                if (hVar.hasName()) {
                    this.f18585b |= 1;
                    this.f18586c = hVar.f18572c;
                    onChanged();
                }
                if (hVar.m0()) {
                    this.f18585b |= 2;
                    this.f18587d = hVar.f18573d;
                    onChanged();
                }
                if (!hVar.f18574e.isEmpty()) {
                    if (this.f18588e.isEmpty()) {
                        this.f18588e = hVar.f18574e;
                        this.f18585b &= -5;
                    } else {
                        p();
                        this.f18588e.addAll(hVar.f18574e);
                    }
                    onChanged();
                }
                if (!hVar.f18575f.isEmpty()) {
                    if (this.f18589f.isEmpty()) {
                        this.f18589f = hVar.f18575f;
                        this.f18585b &= -9;
                    } else {
                        t();
                        this.f18589f.addAll(hVar.f18575f);
                    }
                    onChanged();
                }
                if (!hVar.f18576g.isEmpty()) {
                    if (this.f18590g.isEmpty()) {
                        this.f18590g = hVar.f18576g;
                        this.f18585b &= -17;
                    } else {
                        v();
                        this.f18590g.addAll(hVar.f18576g);
                    }
                    onChanged();
                }
                if (this.f18592i == null) {
                    if (!hVar.f18577h.isEmpty()) {
                        if (this.f18591h.isEmpty()) {
                            this.f18591h = hVar.f18577h;
                            this.f18585b &= -33;
                        } else {
                            s();
                            this.f18591h.addAll(hVar.f18577h);
                        }
                        onChanged();
                    }
                } else if (!hVar.f18577h.isEmpty()) {
                    if (this.f18592i.t()) {
                        this.f18592i.h();
                        this.f18592i = null;
                        this.f18591h = hVar.f18577h;
                        this.f18585b &= -33;
                        this.f18592i = h0.alwaysUseFieldBuilders ? F() : null;
                    } else {
                        this.f18592i.a(hVar.f18577h);
                    }
                }
                if (this.f18594k == null) {
                    if (!hVar.f18578i.isEmpty()) {
                        if (this.f18593j.isEmpty()) {
                            this.f18593j = hVar.f18578i;
                            this.f18585b &= -65;
                        } else {
                            q();
                            this.f18593j.addAll(hVar.f18578i);
                        }
                        onChanged();
                    }
                } else if (!hVar.f18578i.isEmpty()) {
                    if (this.f18594k.t()) {
                        this.f18594k.h();
                        this.f18594k = null;
                        this.f18593j = hVar.f18578i;
                        this.f18585b &= -65;
                        this.f18594k = h0.alwaysUseFieldBuilders ? z() : null;
                    } else {
                        this.f18594k.a(hVar.f18578i);
                    }
                }
                if (this.f18596m == null) {
                    if (!hVar.f18579j.isEmpty()) {
                        if (this.f18595l.isEmpty()) {
                            this.f18595l = hVar.f18579j;
                            this.f18585b &= -129;
                        } else {
                            u();
                            this.f18595l.addAll(hVar.f18579j);
                        }
                        onChanged();
                    }
                } else if (!hVar.f18579j.isEmpty()) {
                    if (this.f18596m.t()) {
                        this.f18596m.h();
                        this.f18596m = null;
                        this.f18595l = hVar.f18579j;
                        this.f18585b &= -129;
                        this.f18596m = h0.alwaysUseFieldBuilders ? K() : null;
                    } else {
                        this.f18596m.a(hVar.f18579j);
                    }
                }
                if (this.f18598o == null) {
                    if (!hVar.f18580k.isEmpty()) {
                        if (this.f18597n.isEmpty()) {
                            this.f18597n = hVar.f18580k;
                            this.f18585b &= -257;
                        } else {
                            r();
                            this.f18597n.addAll(hVar.f18580k);
                        }
                        onChanged();
                    }
                } else if (!hVar.f18580k.isEmpty()) {
                    if (this.f18598o.t()) {
                        this.f18598o.h();
                        this.f18598o = null;
                        this.f18597n = hVar.f18580k;
                        this.f18585b &= -257;
                        this.f18598o = h0.alwaysUseFieldBuilders ? C() : null;
                    } else {
                        this.f18598o.a(hVar.f18580k);
                    }
                }
                if (hVar.l0()) {
                    R(hVar.Z());
                }
                if (hVar.o0()) {
                    S(hVar.h0());
                }
                if (hVar.p0()) {
                    this.f18585b |= 2048;
                    this.f18603t = hVar.f18583n;
                    onChanged();
                }
                mergeUnknownFields(hVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof h) {
                    return P((h) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b R(FileOptions fileOptions) {
                FileOptions fileOptions2;
                a2 a2Var = this.f18600q;
                if (a2Var == null) {
                    if ((this.f18585b & 512) == 0 || (fileOptions2 = this.f18599p) == null || fileOptions2 == FileOptions.e0()) {
                        this.f18599p = fileOptions;
                    } else {
                        this.f18599p = FileOptions.a1(this.f18599p).F(fileOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(fileOptions);
                }
                this.f18585b |= 512;
                return this;
            }

            public b S(p pVar) {
                p pVar2;
                a2 a2Var = this.f18602s;
                if (a2Var == null) {
                    if ((this.f18585b & 1024) == 0 || (pVar2 = this.f18601r) == null || pVar2 == p.l()) {
                        this.f18601r = pVar;
                    } else {
                        this.f18601r = p.r(this.f18601r).t(pVar).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(pVar);
                }
                this.f18585b |= 1024;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            public b V(String str) {
                str.getClass();
                this.f18585b |= 1;
                this.f18586c = str;
                onChanged();
                return this;
            }

            public b W(String str) {
                str.getClass();
                this.f18585b |= 2;
                this.f18587d = str;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            public b g(b bVar) {
                v1 v1Var = this.f18592i;
                if (v1Var != null) {
                    v1Var.e(bVar);
                    return this;
                }
                bVar.getClass();
                s();
                this.f18591h.add(bVar);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18315c;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public h build() {
                h hVarBuildPartial = buildPartial();
                if (hVarBuildPartial.isInitialized()) {
                    return hVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18317d.d(h.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < E(); i10++) {
                    if (!D(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < y(); i11++) {
                    if (!x(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < J(); i12++) {
                    if (!I(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < B(); i13++) {
                    if (!A(i13).isInitialized()) {
                        return false;
                    }
                }
                return !N() || G().isInitialized();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public h buildPartial() {
                h hVar = new h(this);
                int i10 = this.f18585b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                hVar.f18572c = this.f18586c;
                if ((i10 & 2) != 0) {
                    i11 |= 2;
                }
                hVar.f18573d = this.f18587d;
                if ((this.f18585b & 4) != 0) {
                    this.f18588e = this.f18588e.getUnmodifiableView();
                    this.f18585b &= -5;
                }
                hVar.f18574e = this.f18588e;
                if ((this.f18585b & 8) != 0) {
                    this.f18589f.makeImmutable();
                    this.f18585b &= -9;
                }
                hVar.f18575f = this.f18589f;
                if ((this.f18585b & 16) != 0) {
                    this.f18590g.makeImmutable();
                    this.f18585b &= -17;
                }
                hVar.f18576g = this.f18590g;
                v1 v1Var = this.f18592i;
                if (v1Var == null) {
                    if ((this.f18585b & 32) != 0) {
                        this.f18591h = DesugarCollections.unmodifiableList(this.f18591h);
                        this.f18585b &= -33;
                    }
                    hVar.f18577h = this.f18591h;
                } else {
                    hVar.f18577h = v1Var.f();
                }
                v1 v1Var2 = this.f18594k;
                if (v1Var2 == null) {
                    if ((this.f18585b & 64) != 0) {
                        this.f18593j = DesugarCollections.unmodifiableList(this.f18593j);
                        this.f18585b &= -65;
                    }
                    hVar.f18578i = this.f18593j;
                } else {
                    hVar.f18578i = v1Var2.f();
                }
                v1 v1Var3 = this.f18596m;
                if (v1Var3 == null) {
                    if ((this.f18585b & 128) != 0) {
                        this.f18595l = DesugarCollections.unmodifiableList(this.f18595l);
                        this.f18585b &= -129;
                    }
                    hVar.f18579j = this.f18595l;
                } else {
                    hVar.f18579j = v1Var3.f();
                }
                v1 v1Var4 = this.f18598o;
                if (v1Var4 == null) {
                    if ((this.f18585b & 256) != 0) {
                        this.f18597n = DesugarCollections.unmodifiableList(this.f18597n);
                        this.f18585b &= -257;
                    }
                    hVar.f18580k = this.f18597n;
                } else {
                    hVar.f18580k = v1Var4.f();
                }
                if ((i10 & 512) != 0) {
                    a2 a2Var = this.f18600q;
                    if (a2Var == null) {
                        hVar.f18581l = this.f18599p;
                    } else {
                        hVar.f18581l = (FileOptions) a2Var.a();
                    }
                    i11 |= 4;
                }
                if ((i10 & 1024) != 0) {
                    a2 a2Var2 = this.f18602s;
                    if (a2Var2 == null) {
                        hVar.f18582m = this.f18601r;
                    } else {
                        hVar.f18582m = (p) a2Var2.a();
                    }
                    i11 |= 8;
                }
                if ((i10 & 2048) != 0) {
                    i11 |= 16;
                }
                hVar.f18583n = this.f18603t;
                hVar.f18571b = i11;
                onBuilt();
                return hVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f18586c = "";
                int i10 = this.f18585b;
                this.f18587d = "";
                this.f18585b = i10 & (-4);
                this.f18588e = o0.f19269e;
                this.f18585b = i10 & (-8);
                this.f18589f = h0.emptyIntList();
                this.f18585b &= -9;
                this.f18590g = h0.emptyIntList();
                int i11 = this.f18585b;
                this.f18585b = i11 & (-17);
                v1 v1Var = this.f18592i;
                if (v1Var == null) {
                    this.f18591h = Collections.EMPTY_LIST;
                    this.f18585b = i11 & (-49);
                } else {
                    v1Var.g();
                }
                v1 v1Var2 = this.f18594k;
                if (v1Var2 == null) {
                    this.f18593j = Collections.EMPTY_LIST;
                    this.f18585b &= -65;
                } else {
                    v1Var2.g();
                }
                v1 v1Var3 = this.f18596m;
                if (v1Var3 == null) {
                    this.f18595l = Collections.EMPTY_LIST;
                    this.f18585b &= -129;
                } else {
                    v1Var3.g();
                }
                v1 v1Var4 = this.f18598o;
                if (v1Var4 == null) {
                    this.f18597n = Collections.EMPTY_LIST;
                    this.f18585b &= -257;
                } else {
                    v1Var4.g();
                }
                a2 a2Var = this.f18600q;
                if (a2Var == null) {
                    this.f18599p = null;
                } else {
                    a2Var.b();
                }
                this.f18585b &= -513;
                a2 a2Var2 = this.f18602s;
                if (a2Var2 == null) {
                    this.f18601r = null;
                } else {
                    a2Var2.b();
                }
                int i12 = this.f18585b;
                this.f18603t = "";
                this.f18585b = i12 & (-3073);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public h getDefaultInstanceForType() {
                return h.K();
            }

            public c x(int i10) {
                v1 v1Var = this.f18594k;
                return v1Var == null ? (c) this.f18593j.get(i10) : (c) v1Var.n(i10);
            }

            public int y() {
                v1 v1Var = this.f18594k;
                return v1Var == null ? this.f18593j.size() : v1Var.m();
            }

            private b() {
                this.f18586c = "";
                this.f18587d = "";
                this.f18588e = o0.f19269e;
                this.f18589f = h0.emptyIntList();
                this.f18590g = h0.emptyIntList();
                List list = Collections.EMPTY_LIST;
                this.f18591h = list;
                this.f18593j = list;
                this.f18595l = list;
                this.f18597n = list;
                this.f18603t = "";
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18586c = "";
                this.f18587d = "";
                this.f18588e = o0.f19269e;
                this.f18589f = h0.emptyIntList();
                this.f18590g = h0.emptyIntList();
                List list = Collections.EMPTY_LIST;
                this.f18591h = list;
                this.f18593j = list;
                this.f18595l = list;
                this.f18597n = list;
                this.f18603t = "";
                maybeForceBuilderInitialization();
            }
        }

        private h(h0.b bVar) {
            super(bVar);
            this.f18584o = (byte) -1;
        }

        private h() {
            this.f18584o = (byte) -1;
            this.f18572c = "";
            this.f18573d = "";
            this.f18574e = o0.f19269e;
            this.f18575f = h0.emptyIntList();
            this.f18576g = h0.emptyIntList();
            List list = Collections.EMPTY_LIST;
            this.f18577h = list;
            this.f18578i = list;
            this.f18579j = list;
            this.f18580k = list;
            this.f18583n = "";
        }

        private h(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                                break;
                            case 10:
                                ByteString byteStringR = lVar.r();
                                this.f18571b |= 1;
                                this.f18572c = byteStringR;
                                break;
                            case 18:
                                ByteString byteStringR2 = lVar.r();
                                this.f18571b |= 2;
                                this.f18573d = byteStringR2;
                                break;
                            case 26:
                                ByteString byteStringR3 = lVar.r();
                                int i11 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.f18574e = new o0();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.f18574e.c(byteStringR3);
                                break;
                            case 34:
                                int i12 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.f18577h = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f18577h.add(lVar.A(b.f18448o, wVar));
                                break;
                            case 42:
                                int i13 = (i10 == true ? 1 : 0) & 64;
                                i10 = i10;
                                if (i13 == 0) {
                                    this.f18578i = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 64;
                                }
                                this.f18578i.add(lVar.A(c.f18502j, wVar));
                                break;
                            case 50:
                                int i14 = (i10 == true ? 1 : 0) & 128;
                                i10 = i10;
                                if (i14 == 0) {
                                    this.f18579j = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 128;
                                }
                                this.f18579j.add(lVar.A(n.f18677h, wVar));
                                break;
                            case 58:
                                int i15 = (i10 == true ? 1 : 0) & 256;
                                i10 = i10;
                                if (i15 == 0) {
                                    this.f18580k = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 256;
                                }
                                this.f18580k.add(lVar.A(FieldDescriptorProto.f18341p, wVar));
                                break;
                            case 66:
                                FileOptions.b builder = (this.f18571b & 4) != 0 ? this.f18581l.toBuilder() : null;
                                FileOptions fileOptions = (FileOptions) lVar.A(FileOptions.A, wVar);
                                this.f18581l = fileOptions;
                                if (builder != null) {
                                    builder.F(fileOptions);
                                    this.f18581l = builder.buildPartial();
                                }
                                this.f18571b |= 4;
                                break;
                            case 74:
                                p.b builder2 = (this.f18571b & 8) != 0 ? this.f18582m.toBuilder() : null;
                                p pVar = (p) lVar.A(p.f18700e, wVar);
                                this.f18582m = pVar;
                                if (builder2 != null) {
                                    builder2.t(pVar);
                                    this.f18582m = builder2.buildPartial();
                                }
                                this.f18571b |= 8;
                                break;
                            case 80:
                                int i16 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i16 == 0) {
                                    this.f18575f = h0.newIntList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.f18575f.addInt(lVar.y());
                                break;
                            case 82:
                                int iP = lVar.p(lVar.C());
                                int i17 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i17 == 0) {
                                    i10 = i10;
                                    if (lVar.d() > 0) {
                                        this.f18575f = h0.newIntList();
                                        i10 = (i10 == true ? 1 : 0) | 8;
                                    }
                                }
                                while (lVar.d() > 0) {
                                    this.f18575f.addInt(lVar.y());
                                }
                                lVar.o(iP);
                                break;
                            case 88:
                                int i18 = (i10 == true ? 1 : 0) & 16;
                                i10 = i10;
                                if (i18 == 0) {
                                    this.f18576g = h0.newIntList();
                                    i10 = (i10 == true ? 1 : 0) | 16;
                                }
                                this.f18576g.addInt(lVar.y());
                                break;
                            case 90:
                                int iP2 = lVar.p(lVar.C());
                                int i19 = (i10 == true ? 1 : 0) & 16;
                                i10 = i10;
                                if (i19 == 0) {
                                    i10 = i10;
                                    if (lVar.d() > 0) {
                                        this.f18576g = h0.newIntList();
                                        i10 = (i10 == true ? 1 : 0) | 16;
                                    }
                                }
                                while (lVar.d() > 0) {
                                    this.f18576g.addInt(lVar.y());
                                }
                                lVar.o(iP2);
                                break;
                            case 98:
                                ByteString byteStringR4 = lVar.r();
                                this.f18571b |= 16;
                                this.f18583n = byteStringR4;
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
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.f18574e = this.f18574e.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 32) != 0) {
                        this.f18577h = DesugarCollections.unmodifiableList(this.f18577h);
                    }
                    if (((i10 == true ? 1 : 0) & 64) != 0) {
                        this.f18578i = DesugarCollections.unmodifiableList(this.f18578i);
                    }
                    if (((i10 == true ? 1 : 0) & 128) != 0) {
                        this.f18579j = DesugarCollections.unmodifiableList(this.f18579j);
                    }
                    if (((i10 == true ? 1 : 0) & 256) != 0) {
                        this.f18580k = DesugarCollections.unmodifiableList(this.f18580k);
                    }
                    if (((i10 == true ? 1 : 0) & 8) != 0) {
                        this.f18575f.makeImmutable();
                    }
                    if (((i10 == true ? 1 : 0) & 16) != 0) {
                        this.f18576g.makeImmutable();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.f18574e = this.f18574e.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 32) != 0) {
                this.f18577h = DesugarCollections.unmodifiableList(this.f18577h);
            }
            if (((i10 == true ? 1 : 0) & 64) != 0) {
                this.f18578i = DesugarCollections.unmodifiableList(this.f18578i);
            }
            if (((i10 == true ? 1 : 0) & 128) != 0) {
                this.f18579j = DesugarCollections.unmodifiableList(this.f18579j);
            }
            if (((i10 == true ? 1 : 0) & 256) != 0) {
                this.f18580k = DesugarCollections.unmodifiableList(this.f18580k);
            }
            if (((i10 == true ? 1 : 0) & 8) != 0) {
                this.f18575f.makeImmutable();
            }
            if (((i10 == true ? 1 : 0) & 16) != 0) {
                this.f18576g.makeImmutable();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class i extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final i f18604d = new i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final p1 f18605e = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f18606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte f18607c;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new i(lVar, wVar);
            }
        }

        public static final class b extends h0 implements MessageOrBuilder {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final b f18608i = new b();

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final p1 f18609j = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18610b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private j0.g f18611c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18612d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private volatile Object f18613e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f18614f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f18615g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte f18616h;

            static class a extends com.explorestack.protobuf.b {
                a() {
                }

                @Override // com.explorestack.protobuf.p1
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public b parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                    return new b(lVar, wVar);
                }
            }

            public static C0319b E() {
                return f18608i.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.f18312a0;
            }

            public static b s() {
                return f18608i;
            }

            public String A() {
                Object obj = this.f18613e;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f18613e = stringUtf8;
                }
                return stringUtf8;
            }

            public boolean B() {
                return (this.f18610b & 2) != 0;
            }

            public boolean C() {
                return (this.f18610b & 4) != 0;
            }

            public boolean D() {
                return (this.f18610b & 1) != 0;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public C0319b newBuilderForType() {
                return E();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public C0319b newBuilderForType(h0.c cVar) {
                return new C0319b(cVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public C0319b toBuilder() {
                return this == f18608i ? new C0319b() : new C0319b().s(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return super.equals(obj);
                }
                b bVar = (b) obj;
                if (!x().equals(bVar.x()) || D() != bVar.D()) {
                    return false;
                }
                if ((D() && !A().equals(bVar.A())) || B() != bVar.B()) {
                    return false;
                }
                if ((!B() || r() == bVar.r()) && C() == bVar.C()) {
                    return (!C() || u() == bVar.u()) && this.unknownFields.equals(bVar.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return f18609j;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iY = 0;
                for (int i11 = 0; i11 < this.f18611c.size(); i11++) {
                    iY += com.explorestack.protobuf.n.y(this.f18611c.getInt(i11));
                }
                int iY2 = !x().isEmpty() ? iY + 1 + com.explorestack.protobuf.n.y(iY) : iY;
                this.f18612d = iY;
                if ((this.f18610b & 1) != 0) {
                    iY2 += h0.computeStringSize(2, this.f18613e);
                }
                if ((this.f18610b & 2) != 0) {
                    iY2 += com.explorestack.protobuf.n.x(3, this.f18614f);
                }
                if ((this.f18610b & 4) != 0) {
                    iY2 += com.explorestack.protobuf.n.x(4, this.f18615g);
                }
                int serializedSize = iY2 + this.unknownFields.getSerializedSize();
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
                if (v() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + x().hashCode();
                }
                if (D()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + A().hashCode();
                }
                if (B()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + r();
                }
                if (C()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + u();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18314b0.d(b.class, C0319b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f18616h;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f18616h = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.h0
            protected Object newInstance(h0.g gVar) {
                return new b();
            }

            public int r() {
                return this.f18614f;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b getDefaultInstanceForType() {
                return f18608i;
            }

            public int u() {
                return this.f18615g;
            }

            public int v() {
                return this.f18611c.size();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
                getSerializedSize();
                if (x().size() > 0) {
                    nVar.X0(10);
                    nVar.X0(this.f18612d);
                }
                for (int i10 = 0; i10 < this.f18611c.size(); i10++) {
                    nVar.G0(this.f18611c.getInt(i10));
                }
                if ((this.f18610b & 1) != 0) {
                    h0.writeString(nVar, 2, this.f18613e);
                }
                if ((this.f18610b & 2) != 0) {
                    nVar.F0(3, this.f18614f);
                }
                if ((this.f18610b & 4) != 0) {
                    nVar.F0(4, this.f18615g);
                }
                this.unknownFields.writeTo(nVar);
            }

            public List x() {
                return this.f18611c;
            }

            /* JADX INFO: renamed from: com.explorestack.protobuf.DescriptorProtos$i$b$b, reason: collision with other inner class name */
            public static final class C0319b extends h0.b implements MessageOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f18617b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private j0.g f18618c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private Object f18619d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private int f18620e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f18621f;

                private void maybeForceBuilderInitialization() {
                    boolean z10 = h0.alwaysUseFieldBuilders;
                }

                private void p() {
                    if ((this.f18617b & 1) == 0) {
                        this.f18618c = h0.mutableCopy(this.f18618c);
                        this.f18617b |= 1;
                    }
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public C0319b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0319b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.f18312a0;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public b build() {
                    b bVarBuildPartial = buildPartial();
                    if (bVarBuildPartial.isInitialized()) {
                        return bVarBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) bVarBuildPartial);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return DescriptorProtos.f18314b0.d(b.class, C0319b.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public b buildPartial() {
                    b bVar = new b(this);
                    int i10 = this.f18617b;
                    if ((i10 & 1) != 0) {
                        this.f18618c.makeImmutable();
                        this.f18617b &= -2;
                    }
                    bVar.f18611c = this.f18618c;
                    int i11 = (i10 & 2) != 0 ? 1 : 0;
                    bVar.f18613e = this.f18619d;
                    if ((i10 & 4) != 0) {
                        bVar.f18614f = this.f18620e;
                        i11 |= 2;
                    }
                    if ((i10 & 8) != 0) {
                        bVar.f18615g = this.f18621f;
                        i11 |= 4;
                    }
                    bVar.f18610b = i11;
                    onBuilt();
                    return bVar;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public C0319b clear() {
                    super.clear();
                    this.f18618c = h0.emptyIntList();
                    int i10 = this.f18617b;
                    this.f18619d = "";
                    this.f18620e = 0;
                    this.f18621f = 0;
                    this.f18617b = i10 & (-16);
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public C0319b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C0319b) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public C0319b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C0319b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public C0319b mo4427clone() {
                    return (C0319b) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public b getDefaultInstanceForType() {
                    return b.s();
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.DescriptorProtos.i.b.C0319b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.i.b.f18609j     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        com.explorestack.protobuf.DescriptorProtos$i$b r3 = (com.explorestack.protobuf.DescriptorProtos.i.b) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.s(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        com.explorestack.protobuf.DescriptorProtos$i$b r4 = (com.explorestack.protobuf.DescriptorProtos.i.b) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.s(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.i.b.C0319b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$i$b$b");
                }

                public C0319b s(b bVar) {
                    if (bVar == b.s()) {
                        return this;
                    }
                    if (!bVar.f18611c.isEmpty()) {
                        if (this.f18618c.isEmpty()) {
                            this.f18618c = bVar.f18611c;
                            this.f18617b &= -2;
                        } else {
                            p();
                            this.f18618c.addAll(bVar.f18611c);
                        }
                        onChanged();
                    }
                    if (bVar.D()) {
                        this.f18617b |= 2;
                        this.f18619d = bVar.f18613e;
                        onChanged();
                    }
                    if (bVar.B()) {
                        v(bVar.r());
                    }
                    if (bVar.C()) {
                        w(bVar.u());
                    }
                    mergeUnknownFields(bVar.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public C0319b mergeFrom(Message message) {
                    if (message instanceof b) {
                        return s((b) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C0319b mergeUnknownFields(r2 r2Var) {
                    return (C0319b) super.mergeUnknownFields(r2Var);
                }

                public C0319b v(int i10) {
                    this.f18617b |= 4;
                    this.f18620e = i10;
                    onChanged();
                    return this;
                }

                public C0319b w(int i10) {
                    this.f18617b |= 8;
                    this.f18621f = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public C0319b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C0319b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public C0319b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C0319b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public final C0319b setUnknownFields(r2 r2Var) {
                    return (C0319b) super.setUnknownFields(r2Var);
                }

                private C0319b() {
                    this.f18618c = h0.emptyIntList();
                    this.f18619d = "";
                    maybeForceBuilderInitialization();
                }

                private C0319b(h0.c cVar) {
                    super(cVar);
                    this.f18618c = h0.emptyIntList();
                    this.f18619d = "";
                    maybeForceBuilderInitialization();
                }
            }

            private b(h0.b bVar) {
                super(bVar);
                this.f18612d = -1;
                this.f18616h = (byte) -1;
            }

            private b() {
                this.f18612d = -1;
                this.f18616h = (byte) -1;
                this.f18611c = h0.emptyIntList();
                this.f18613e = "";
            }

            private b(com.explorestack.protobuf.l lVar, w wVar) {
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
                                    if (iK == 8) {
                                        if (!z11) {
                                            this.f18611c = h0.newIntList();
                                            z11 = true;
                                        }
                                        this.f18611c.addInt(lVar.y());
                                    } else if (iK == 10) {
                                        int iP = lVar.p(lVar.C());
                                        if (!z11 && lVar.d() > 0) {
                                            this.f18611c = h0.newIntList();
                                            z11 = true;
                                        }
                                        while (lVar.d() > 0) {
                                            this.f18611c.addInt(lVar.y());
                                        }
                                        lVar.o(iP);
                                    } else if (iK == 18) {
                                        ByteString byteStringR = lVar.r();
                                        this.f18610b = 1 | this.f18610b;
                                        this.f18613e = byteStringR;
                                    } else if (iK == 24) {
                                        this.f18610b |= 2;
                                        this.f18614f = lVar.y();
                                    } else if (iK != 32) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        this.f18610b |= 4;
                                        this.f18615g = lVar.y();
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
                            this.f18611c.makeImmutable();
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    this.f18611c.makeImmutable();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.Y;
        }

        public static i n() {
            return f18604d;
        }

        public static c q() {
            return f18604d.toBuilder();
        }

        public static c r(i iVar) {
            return f18604d.toBuilder().t(iVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return super.equals(obj);
            }
            i iVar = (i) obj;
            return m().equals(iVar.m()) && this.unknownFields.equals(iVar.unknownFields);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18605e;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.f18606b.size(); i11++) {
                iG += com.explorestack.protobuf.n.G(1, (MessageLite) this.f18606b.get(i11));
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
            if (l() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.Z.d(i.class, c.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18607c;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f18607c = (byte) 1;
            return true;
        }

        public int l() {
            return this.f18606b.size();
        }

        public List m() {
            return this.f18606b;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new i();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public i getDefaultInstanceForType() {
            return f18604d;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public c newBuilderForType() {
            return q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public c newBuilderForType(h0.c cVar) {
            return new c(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public c toBuilder() {
            return this == f18604d ? new c() : new c().t(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            for (int i10 = 0; i10 < this.f18606b.size(); i10++) {
                nVar.J0(1, (MessageLite) this.f18606b.get(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class c extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18622b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List f18623c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private v1 f18624d;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    q();
                }
            }

            private void p() {
                if ((this.f18622b & 1) == 0) {
                    this.f18623c = new ArrayList(this.f18623c);
                    this.f18622b |= 1;
                }
            }

            private v1 q() {
                if (this.f18624d == null) {
                    this.f18624d = new v1(this.f18623c, (this.f18622b & 1) != 0, getParentForChildren(), isClean());
                    this.f18623c = null;
                }
                return this.f18624d;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public c addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (c) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.Y;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public i build() {
                i iVarBuildPartial = buildPartial();
                if (iVarBuildPartial.isInitialized()) {
                    return iVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) iVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.Z.d(i.class, c.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public i buildPartial() {
                i iVar = new i(this);
                int i10 = this.f18622b;
                v1 v1Var = this.f18624d;
                if (v1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.f18623c = DesugarCollections.unmodifiableList(this.f18623c);
                        this.f18622b &= -2;
                    }
                    iVar.f18606b = this.f18623c;
                } else {
                    iVar.f18606b = v1Var.f();
                }
                onBuilt();
                return iVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public c clear() {
                super.clear();
                v1 v1Var = this.f18624d;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18623c = Collections.EMPTY_LIST;
                this.f18622b &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public c clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (c) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public c clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (c) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public c mo4427clone() {
                return (c) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public i getDefaultInstanceForType() {
                return i.n();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.i.c mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.i.f18605e     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$i r3 = (com.explorestack.protobuf.DescriptorProtos.i) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.t(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$i r4 = (com.explorestack.protobuf.DescriptorProtos.i) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.t(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.i.c.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$i$c");
            }

            public c t(i iVar) {
                if (iVar == i.n()) {
                    return this;
                }
                if (this.f18624d == null) {
                    if (!iVar.f18606b.isEmpty()) {
                        if (this.f18623c.isEmpty()) {
                            this.f18623c = iVar.f18606b;
                            this.f18622b &= -2;
                        } else {
                            p();
                            this.f18623c.addAll(iVar.f18606b);
                        }
                        onChanged();
                    }
                } else if (!iVar.f18606b.isEmpty()) {
                    if (this.f18624d.t()) {
                        this.f18624d.h();
                        this.f18624d = null;
                        this.f18623c = iVar.f18606b;
                        this.f18622b &= -2;
                        this.f18624d = h0.alwaysUseFieldBuilders ? q() : null;
                    } else {
                        this.f18624d.a(iVar.f18606b);
                    }
                }
                mergeUnknownFields(iVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public c mergeFrom(Message message) {
                if (message instanceof i) {
                    return t((i) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final c mergeUnknownFields(r2 r2Var) {
                return (c) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public c setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (c) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public c setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (c) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final c setUnknownFields(r2 r2Var) {
                return (c) super.setUnknownFields(r2Var);
            }

            private c() {
                this.f18623c = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private c(h0.c cVar) {
                super(cVar);
                this.f18623c = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private i(h0.b bVar) {
            super(bVar);
            this.f18607c = (byte) -1;
        }

        private i() {
            this.f18607c = (byte) -1;
            this.f18606b = Collections.EMPTY_LIST;
        }

        private i(com.explorestack.protobuf.l lVar, w wVar) {
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
                                        this.f18606b = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f18606b.add(lVar.A(b.f18609j, wVar));
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
                        this.f18606b = DesugarCollections.unmodifiableList(this.f18606b);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.f18606b = DesugarCollections.unmodifiableList(this.f18606b);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class j extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final j f18625j = new j();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final p1 f18626k = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f18631g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List f18632h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte f18633i;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public j parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new j(lVar, wVar);
            }
        }

        public static j A() {
            return f18625j;
        }

        public static b N() {
            return f18625j.toBuilder();
        }

        public static b O(j jVar) {
            return f18625j.toBuilder().F(jVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.C;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public j getDefaultInstanceForType() {
            return f18625j;
        }

        public boolean C() {
            return this.f18630f;
        }

        public boolean D() {
            return this.f18631g;
        }

        public boolean E() {
            return this.f18628d;
        }

        public boolean F() {
            return this.f18629e;
        }

        public q G(int i10) {
            return (q) this.f18632h.get(i10);
        }

        public int H() {
            return this.f18632h.size();
        }

        public List I() {
            return this.f18632h;
        }

        public boolean J() {
            return (this.f18627c & 4) != 0;
        }

        public boolean K() {
            return (this.f18627c & 8) != 0;
        }

        public boolean L() {
            return (this.f18627c & 1) != 0;
        }

        public boolean M() {
            return (this.f18627c & 2) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return N();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18625j ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return super.equals(obj);
            }
            j jVar = (j) obj;
            if (L() != jVar.L()) {
                return false;
            }
            if ((L() && E() != jVar.E()) || M() != jVar.M()) {
                return false;
            }
            if ((M() && F() != jVar.F()) || J() != jVar.J()) {
                return false;
            }
            if ((!J() || C() == jVar.C()) && K() == jVar.K()) {
                return (!K() || D() == jVar.D()) && I().equals(jVar.I()) && this.unknownFields.equals(jVar.unknownFields) && m().equals(jVar.m());
            }
            return false;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18626k;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f18627c & 1) != 0 ? com.explorestack.protobuf.n.e(1, this.f18628d) : 0;
            if ((this.f18627c & 2) != 0) {
                iE += com.explorestack.protobuf.n.e(2, this.f18629e);
            }
            if ((this.f18627c & 4) != 0) {
                iE += com.explorestack.protobuf.n.e(3, this.f18630f);
            }
            if ((this.f18627c & 8) != 0) {
                iE += com.explorestack.protobuf.n.e(7, this.f18631g);
            }
            for (int i11 = 0; i11 < this.f18632h.size(); i11++) {
                iE += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18632h.get(i11));
            }
            int iL = iE + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL;
            return iL;
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
            if (L()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + j0.d(E());
            }
            if (M()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + j0.d(F());
            }
            if (J()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + j0.d(C());
            }
            if (K()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + j0.d(D());
            }
            if (H() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + I().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.D.d(j.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18633i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < H(); i10++) {
                if (!G(i10).isInitialized()) {
                    this.f18633i = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18633i = (byte) 1;
                return true;
            }
            this.f18633i = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new j();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            h0.e.a aVarN = n();
            if ((this.f18627c & 1) != 0) {
                nVar.n0(1, this.f18628d);
            }
            if ((this.f18627c & 2) != 0) {
                nVar.n0(2, this.f18629e);
            }
            if ((this.f18627c & 4) != 0) {
                nVar.n0(3, this.f18630f);
            }
            if ((this.f18627c & 8) != 0) {
                nVar.n0(7, this.f18631g);
            }
            for (int i10 = 0; i10 < this.f18632h.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18632h.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18634c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f18635d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f18636e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f18637f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f18638g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List f18639h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private v1 f18640i;

            private v1 D() {
                if (this.f18640i == null) {
                    this.f18640i = new v1(this.f18639h, (this.f18634c & 16) != 0, getParentForChildren(), isClean());
                    this.f18639h = null;
                }
                return this.f18640i;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18634c & 16) == 0) {
                    this.f18639h = new ArrayList(this.f18639h);
                    this.f18634c |= 16;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public j getDefaultInstanceForType() {
                return j.A();
            }

            public q B(int i10) {
                v1 v1Var = this.f18640i;
                return v1Var == null ? (q) this.f18639h.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18640i;
                return v1Var == null ? this.f18639h.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.j.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.j.f18626k     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$j r3 = (com.explorestack.protobuf.DescriptorProtos.j) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$j r4 = (com.explorestack.protobuf.DescriptorProtos.j) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.j.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$j$b");
            }

            public b F(j jVar) {
                if (jVar == j.A()) {
                    return this;
                }
                if (jVar.L()) {
                    L(jVar.E());
                }
                if (jVar.M()) {
                    M(jVar.F());
                }
                if (jVar.J()) {
                    I(jVar.C());
                }
                if (jVar.K()) {
                    K(jVar.D());
                }
                if (this.f18640i == null) {
                    if (!jVar.f18632h.isEmpty()) {
                        if (this.f18639h.isEmpty()) {
                            this.f18639h = jVar.f18632h;
                            this.f18634c &= -17;
                        } else {
                            z();
                            this.f18639h.addAll(jVar.f18632h);
                        }
                        onChanged();
                    }
                } else if (!jVar.f18632h.isEmpty()) {
                    if (this.f18640i.t()) {
                        this.f18640i.h();
                        this.f18640i = null;
                        this.f18639h = jVar.f18632h;
                        this.f18634c &= -17;
                        this.f18640i = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18640i.a(jVar.f18632h);
                    }
                }
                o(jVar);
                mergeUnknownFields(jVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof j) {
                    return F((j) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b I(boolean z10) {
                this.f18634c |= 4;
                this.f18637f = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            public b K(boolean z10) {
                this.f18634c |= 8;
                this.f18638g = z10;
                onChanged();
                return this;
            }

            public b L(boolean z10) {
                this.f18634c |= 1;
                this.f18635d = z10;
                onChanged();
                return this;
            }

            public b M(boolean z10) {
                this.f18634c |= 2;
                this.f18636e = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.C;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.D.d(j.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public j build() {
                j jVarBuildPartial = buildPartial();
                if (jVarBuildPartial.isInitialized()) {
                    return jVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) jVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public j buildPartial() {
                int i10;
                j jVar = new j(this);
                int i11 = this.f18634c;
                if ((i11 & 1) != 0) {
                    jVar.f18628d = this.f18635d;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    jVar.f18629e = this.f18636e;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    jVar.f18630f = this.f18637f;
                    i10 |= 4;
                }
                if ((i11 & 8) != 0) {
                    jVar.f18631g = this.f18638g;
                    i10 |= 8;
                }
                v1 v1Var = this.f18640i;
                if (v1Var == null) {
                    if ((this.f18634c & 16) != 0) {
                        this.f18639h = DesugarCollections.unmodifiableList(this.f18639h);
                        this.f18634c &= -17;
                    }
                    jVar.f18632h = this.f18639h;
                } else {
                    jVar.f18632h = v1Var.f();
                }
                jVar.f18627c = i10;
                onBuilt();
                return jVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                this.f18635d = false;
                int i10 = this.f18634c;
                this.f18636e = false;
                this.f18637f = false;
                this.f18638g = false;
                this.f18634c = i10 & (-16);
                v1 v1Var = this.f18640i;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18639h = Collections.EMPTY_LIST;
                this.f18634c = i10 & (-32);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18639h = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18639h = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private j(h0.d dVar) {
            super(dVar);
            this.f18633i = (byte) -1;
        }

        private j() {
            this.f18633i = (byte) -1;
            this.f18632h = Collections.EMPTY_LIST;
        }

        private j(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = lVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f18627c |= 1;
                                    this.f18628d = lVar.q();
                                } else if (iK == 16) {
                                    this.f18627c |= 2;
                                    this.f18629e = lVar.q();
                                } else if (iK == 24) {
                                    this.f18627c |= 4;
                                    this.f18630f = lVar.q();
                                } else if (iK == 56) {
                                    this.f18627c |= 8;
                                    this.f18631g = lVar.q();
                                } else if (iK != 7994) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    if ((c10 & 16) == 0) {
                                        this.f18632h = new ArrayList();
                                        c10 = 16;
                                    }
                                    this.f18632h.add(lVar.A(q.f18724l, wVar));
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
                    if ((c10 & 16) != 0) {
                        this.f18632h = DesugarCollections.unmodifiableList(this.f18632h);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((c10 & 16) != 0) {
                this.f18632h = DesugarCollections.unmodifiableList(this.f18632h);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class k extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final k f18641j = new k();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final p1 f18642k = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile Object f18645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile Object f18646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MethodOptions f18647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f18648g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f18649h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte f18650i;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public k parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new k(lVar, wVar);
            }
        }

        public static b J() {
            return f18641j.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18338y;
        }

        public static k v() {
            return f18641j;
        }

        public String A() {
            Object obj = this.f18645d;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18645d = stringUtf8;
            }
            return stringUtf8;
        }

        public MethodOptions B() {
            MethodOptions methodOptions = this.f18647f;
            return methodOptions == null ? MethodOptions.v() : methodOptions;
        }

        public String C() {
            Object obj = this.f18646e;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18646e = stringUtf8;
            }
            return stringUtf8;
        }

        public boolean D() {
            return this.f18649h;
        }

        public boolean E() {
            return (this.f18643b & 16) != 0;
        }

        public boolean F() {
            return (this.f18643b & 2) != 0;
        }

        public boolean G() {
            return (this.f18643b & 8) != 0;
        }

        public boolean H() {
            return (this.f18643b & 4) != 0;
        }

        public boolean I() {
            return (this.f18643b & 32) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return J();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18641j ? new b() : new b().u(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return super.equals(obj);
            }
            k kVar = (k) obj;
            if (hasName() != kVar.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(kVar.getName())) || F() != kVar.F()) {
                return false;
            }
            if ((F() && !A().equals(kVar.A())) || H() != kVar.H()) {
                return false;
            }
            if ((H() && !C().equals(kVar.C())) || G() != kVar.G()) {
                return false;
            }
            if ((G() && !B().equals(kVar.B())) || E() != kVar.E()) {
                return false;
            }
            if ((!E() || u() == kVar.u()) && I() == kVar.I()) {
                return (!I() || D() == kVar.D()) && this.unknownFields.equals(kVar.unknownFields);
            }
            return false;
        }

        public String getName() {
            Object obj = this.f18644c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18644c = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18642k;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18643b & 1) != 0 ? h0.computeStringSize(1, this.f18644c) : 0;
            if ((this.f18643b & 2) != 0) {
                iComputeStringSize += h0.computeStringSize(2, this.f18645d);
            }
            if ((this.f18643b & 4) != 0) {
                iComputeStringSize += h0.computeStringSize(3, this.f18646e);
            }
            if ((this.f18643b & 8) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.G(4, B());
            }
            if ((this.f18643b & 16) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(5, this.f18648g);
            }
            if ((this.f18643b & 32) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.e(6, this.f18649h);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.f18643b & 1) != 0;
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
            if (F()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + A().hashCode();
            }
            if (H()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + C().hashCode();
            }
            if (G()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + B().hashCode();
            }
            if (E()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + j0.d(u());
            }
            if (I()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + j0.d(D());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18339z.d(k.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18650i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!G() || B().isInitialized()) {
                this.f18650i = (byte) 1;
                return true;
            }
            this.f18650i = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new k();
        }

        public boolean u() {
            return this.f18648g;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            if ((this.f18643b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18644c);
            }
            if ((this.f18643b & 2) != 0) {
                h0.writeString(nVar, 2, this.f18645d);
            }
            if ((this.f18643b & 4) != 0) {
                h0.writeString(nVar, 3, this.f18646e);
            }
            if ((this.f18643b & 8) != 0) {
                nVar.J0(4, B());
            }
            if ((this.f18643b & 16) != 0) {
                nVar.n0(5, this.f18648g);
            }
            if ((this.f18643b & 32) != 0) {
                nVar.n0(6, this.f18649h);
            }
            this.unknownFields.writeTo(nVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public k getDefaultInstanceForType() {
            return f18641j;
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18651b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18652c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Object f18653d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Object f18654e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private MethodOptions f18655f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private a2 f18656g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f18657h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f18658i;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            private a2 r() {
                if (this.f18656g == null) {
                    this.f18656g = new a2(q(), getParentForChildren(), isClean());
                    this.f18655f = null;
                }
                return this.f18656g;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public b B(boolean z10) {
                this.f18651b |= 32;
                this.f18658i = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18338y;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public k build() {
                k kVarBuildPartial = buildPartial();
                if (kVarBuildPartial.isInitialized()) {
                    return kVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) kVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18339z.d(k.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return !s() || q().isInitialized();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public k buildPartial() {
                k kVar = new k(this);
                int i10 = this.f18651b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                kVar.f18644c = this.f18652c;
                if ((i10 & 2) != 0) {
                    i11 |= 2;
                }
                kVar.f18645d = this.f18653d;
                if ((i10 & 4) != 0) {
                    i11 |= 4;
                }
                kVar.f18646e = this.f18654e;
                if ((i10 & 8) != 0) {
                    a2 a2Var = this.f18656g;
                    if (a2Var == null) {
                        kVar.f18647f = this.f18655f;
                    } else {
                        kVar.f18647f = (MethodOptions) a2Var.a();
                    }
                    i11 |= 8;
                }
                if ((i10 & 16) != 0) {
                    kVar.f18648g = this.f18657h;
                    i11 |= 16;
                }
                if ((i10 & 32) != 0) {
                    kVar.f18649h = this.f18658i;
                    i11 |= 32;
                }
                kVar.f18643b = i11;
                onBuilt();
                return kVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f18652c = "";
                int i10 = this.f18651b;
                this.f18653d = "";
                this.f18654e = "";
                this.f18651b = i10 & (-8);
                a2 a2Var = this.f18656g;
                if (a2Var == null) {
                    this.f18655f = null;
                } else {
                    a2Var.b();
                }
                int i11 = this.f18651b;
                this.f18657h = false;
                this.f18658i = false;
                this.f18651b = i11 & (-57);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public k getDefaultInstanceForType() {
                return k.v();
            }

            public MethodOptions q() {
                a2 a2Var = this.f18656g;
                if (a2Var != null) {
                    return (MethodOptions) a2Var.e();
                }
                MethodOptions methodOptions = this.f18655f;
                return methodOptions == null ? MethodOptions.v() : methodOptions;
            }

            public boolean s() {
                return (this.f18651b & 8) != 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.k.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.k.f18642k     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$k r3 = (com.explorestack.protobuf.DescriptorProtos.k) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.u(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$k r4 = (com.explorestack.protobuf.DescriptorProtos.k) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.u(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.k.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$k$b");
            }

            public b u(k kVar) {
                if (kVar == k.v()) {
                    return this;
                }
                if (kVar.hasName()) {
                    this.f18651b |= 1;
                    this.f18652c = kVar.f18644c;
                    onChanged();
                }
                if (kVar.F()) {
                    this.f18651b |= 2;
                    this.f18653d = kVar.f18645d;
                    onChanged();
                }
                if (kVar.H()) {
                    this.f18651b |= 4;
                    this.f18654e = kVar.f18646e;
                    onChanged();
                }
                if (kVar.G()) {
                    w(kVar.B());
                }
                if (kVar.E()) {
                    y(kVar.u());
                }
                if (kVar.I()) {
                    B(kVar.D());
                }
                mergeUnknownFields(kVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof k) {
                    return u((k) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b w(MethodOptions methodOptions) {
                MethodOptions methodOptions2;
                a2 a2Var = this.f18656g;
                if (a2Var == null) {
                    if ((this.f18651b & 8) == 0 || (methodOptions2 = this.f18655f) == null || methodOptions2 == MethodOptions.v()) {
                        this.f18655f = methodOptions;
                    } else {
                        this.f18655f = MethodOptions.I(this.f18655f).F(methodOptions).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(methodOptions);
                }
                this.f18651b |= 8;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b y(boolean z10) {
                this.f18651b |= 16;
                this.f18657h = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            private b() {
                this.f18652c = "";
                this.f18653d = "";
                this.f18654e = "";
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18652c = "";
                this.f18653d = "";
                this.f18654e = "";
                maybeForceBuilderInitialization();
            }
        }

        private k(h0.b bVar) {
            super(bVar);
            this.f18650i = (byte) -1;
        }

        private k() {
            this.f18650i = (byte) -1;
            this.f18644c = "";
            this.f18645d = "";
            this.f18646e = "";
        }

        private k(com.explorestack.protobuf.l lVar, w wVar) {
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
                                ByteString byteStringR = lVar.r();
                                this.f18643b = 1 | this.f18643b;
                                this.f18644c = byteStringR;
                            } else if (iK == 18) {
                                ByteString byteStringR2 = lVar.r();
                                this.f18643b |= 2;
                                this.f18645d = byteStringR2;
                            } else if (iK == 26) {
                                ByteString byteStringR3 = lVar.r();
                                this.f18643b |= 4;
                                this.f18646e = byteStringR3;
                            } else if (iK == 34) {
                                MethodOptions.b builder = (this.f18643b & 8) != 0 ? this.f18647f.toBuilder() : null;
                                MethodOptions methodOptions = (MethodOptions) lVar.A(MethodOptions.f18436i, wVar);
                                this.f18647f = methodOptions;
                                if (builder != null) {
                                    builder.F(methodOptions);
                                    this.f18647f = builder.buildPartial();
                                }
                                this.f18643b |= 8;
                            } else if (iK == 40) {
                                this.f18643b |= 16;
                                this.f18648g = lVar.q();
                            } else if (iK != 48) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.f18643b |= 32;
                                this.f18649h = lVar.q();
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
    }

    public static final class l extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final l f18659f = new l();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final p1 f18660g = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m f18663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f18664e;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public l parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new l(lVar, wVar);
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18328o;
        }

        public static l n() {
            return f18659f;
        }

        public static b s() {
            return f18659f.toBuilder();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return super.equals(obj);
            }
            l lVar = (l) obj;
            if (hasName() != lVar.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(lVar.getName())) && r() == lVar.r()) {
                return (!r() || q().equals(lVar.q())) && this.unknownFields.equals(lVar.unknownFields);
            }
            return false;
        }

        public String getName() {
            Object obj = this.f18662c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18662c = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18660g;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18661b & 1) != 0 ? h0.computeStringSize(1, this.f18662c) : 0;
            if ((this.f18661b & 2) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.G(2, q());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.f18661b & 1) != 0;
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
            if (r()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + q().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18329p.d(l.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18664e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!r() || q().isInitialized()) {
                this.f18664e = (byte) 1;
                return true;
            }
            this.f18664e = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new l();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public l getDefaultInstanceForType() {
            return f18659f;
        }

        public m q() {
            m mVar = this.f18663d;
            return mVar == null ? m.s() : mVar;
        }

        public boolean r() {
            return (this.f18661b & 2) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return s();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18659f ? new b() : new b().u(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            if ((this.f18661b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18662c);
            }
            if ((this.f18661b & 2) != 0) {
                nVar.J0(2, q());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18665b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18666c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private m f18667d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private a2 f18668e;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            private a2 r() {
                if (this.f18668e == null) {
                    this.f18668e = new a2(q(), getParentForChildren(), isClean());
                    this.f18667d = null;
                }
                return this.f18668e;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18328o;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public l build() {
                l lVarBuildPartial = buildPartial();
                if (lVarBuildPartial.isInitialized()) {
                    return lVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18329p.d(l.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return !s() || q().isInitialized();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public l buildPartial() {
                l lVar = new l(this);
                int i10 = this.f18665b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                lVar.f18662c = this.f18666c;
                if ((i10 & 2) != 0) {
                    a2 a2Var = this.f18668e;
                    if (a2Var == null) {
                        lVar.f18663d = this.f18667d;
                    } else {
                        lVar.f18663d = (m) a2Var.a();
                    }
                    i11 |= 2;
                }
                lVar.f18661b = i11;
                onBuilt();
                return lVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f18666c = "";
                this.f18665b &= -2;
                a2 a2Var = this.f18668e;
                if (a2Var == null) {
                    this.f18667d = null;
                } else {
                    a2Var.b();
                }
                this.f18665b &= -3;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public l getDefaultInstanceForType() {
                return l.n();
            }

            public m q() {
                a2 a2Var = this.f18668e;
                if (a2Var != null) {
                    return (m) a2Var.e();
                }
                m mVar = this.f18667d;
                return mVar == null ? m.s() : mVar;
            }

            public boolean s() {
                return (this.f18665b & 2) != 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.l.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.l.f18660g     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$l r3 = (com.explorestack.protobuf.DescriptorProtos.l) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.u(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$l r4 = (com.explorestack.protobuf.DescriptorProtos.l) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.u(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.l.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$l$b");
            }

            public b u(l lVar) {
                if (lVar == l.n()) {
                    return this;
                }
                if (lVar.hasName()) {
                    this.f18665b |= 1;
                    this.f18666c = lVar.f18662c;
                    onChanged();
                }
                if (lVar.r()) {
                    w(lVar.q());
                }
                mergeUnknownFields(lVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof l) {
                    return u((l) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b w(m mVar) {
                m mVar2;
                a2 a2Var = this.f18668e;
                if (a2Var == null) {
                    if ((this.f18665b & 2) == 0 || (mVar2 = this.f18667d) == null || mVar2 == m.s()) {
                        this.f18667d = mVar;
                    } else {
                        this.f18667d = m.B(this.f18667d).F(mVar).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(mVar);
                }
                this.f18665b |= 2;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            private b() {
                this.f18666c = "";
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18666c = "";
                maybeForceBuilderInitialization();
            }
        }

        private l(h0.b bVar) {
            super(bVar);
            this.f18664e = (byte) -1;
        }

        private l() {
            this.f18664e = (byte) -1;
            this.f18662c = "";
        }

        private l(com.explorestack.protobuf.l lVar, w wVar) {
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
                                ByteString byteStringR = lVar.r();
                                this.f18661b = 1 | this.f18661b;
                                this.f18662c = byteStringR;
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                m.b builder = (this.f18661b & 2) != 0 ? this.f18663d.toBuilder() : null;
                                m mVar = (m) lVar.A(m.f18670f, wVar);
                                this.f18663d = mVar;
                                if (builder != null) {
                                    builder.F(mVar);
                                    this.f18663d = builder.buildPartial();
                                }
                                this.f18661b |= 2;
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
    }

    public static final class m extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final m f18669e = new m();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final p1 f18670f = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f18671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f18672d;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public m parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new m(lVar, wVar);
            }
        }

        public static b A() {
            return f18669e.toBuilder();
        }

        public static b B(m mVar) {
            return f18669e.toBuilder().F(mVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.G;
        }

        public static m s() {
            return f18669e;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return A();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18669e ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return super.equals(obj);
            }
            m mVar = (m) obj;
            return x().equals(mVar.x()) && this.unknownFields.equals(mVar.unknownFields) && m().equals(mVar.m());
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18670f;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.f18671c.size(); i11++) {
                iG += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18671c.get(i11));
            }
            int iL = iG + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL;
            return iL;
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
            if (v() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + x().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.H.d(m.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18672d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < v(); i10++) {
                if (!u(i10).isInitialized()) {
                    this.f18672d = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18672d = (byte) 1;
                return true;
            }
            this.f18672d = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new m();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public m getDefaultInstanceForType() {
            return f18669e;
        }

        public q u(int i10) {
            return (q) this.f18671c.get(i10);
        }

        public int v() {
            return this.f18671c.size();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            h0.e.a aVarN = n();
            for (int i10 = 0; i10 < this.f18671c.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18671c.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        public List x() {
            return this.f18671c;
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18673c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List f18674d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private v1 f18675e;

            private v1 D() {
                if (this.f18675e == null) {
                    this.f18675e = new v1(this.f18674d, (this.f18673c & 1) != 0, getParentForChildren(), isClean());
                    this.f18674d = null;
                }
                return this.f18675e;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18673c & 1) == 0) {
                    this.f18674d = new ArrayList(this.f18674d);
                    this.f18673c |= 1;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public m getDefaultInstanceForType() {
                return m.s();
            }

            public q B(int i10) {
                v1 v1Var = this.f18675e;
                return v1Var == null ? (q) this.f18674d.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18675e;
                return v1Var == null ? this.f18674d.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.m.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.m.f18670f     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$m r3 = (com.explorestack.protobuf.DescriptorProtos.m) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$m r4 = (com.explorestack.protobuf.DescriptorProtos.m) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.m.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$m$b");
            }

            public b F(m mVar) {
                if (mVar == m.s()) {
                    return this;
                }
                if (this.f18675e == null) {
                    if (!mVar.f18671c.isEmpty()) {
                        if (this.f18674d.isEmpty()) {
                            this.f18674d = mVar.f18671c;
                            this.f18673c &= -2;
                        } else {
                            z();
                            this.f18674d.addAll(mVar.f18671c);
                        }
                        onChanged();
                    }
                } else if (!mVar.f18671c.isEmpty()) {
                    if (this.f18675e.t()) {
                        this.f18675e.h();
                        this.f18675e = null;
                        this.f18674d = mVar.f18671c;
                        this.f18673c &= -2;
                        this.f18675e = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18675e.a(mVar.f18671c);
                    }
                }
                o(mVar);
                mergeUnknownFields(mVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof m) {
                    return F((m) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.G;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.H.d(m.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public m build() {
                m mVarBuildPartial = buildPartial();
                if (mVarBuildPartial.isInitialized()) {
                    return mVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) mVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public m buildPartial() {
                m mVar = new m(this);
                int i10 = this.f18673c;
                v1 v1Var = this.f18675e;
                if (v1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.f18674d = DesugarCollections.unmodifiableList(this.f18674d);
                        this.f18673c &= -2;
                    }
                    mVar.f18671c = this.f18674d;
                } else {
                    mVar.f18671c = v1Var.f();
                }
                onBuilt();
                return mVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                v1 v1Var = this.f18675e;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18674d = Collections.EMPTY_LIST;
                this.f18673c &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18674d = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18674d = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private m(h0.d dVar) {
            super(dVar);
            this.f18672d = (byte) -1;
        }

        private m() {
            this.f18672d = (byte) -1;
            this.f18671c = Collections.EMPTY_LIST;
        }

        private m(com.explorestack.protobuf.l lVar, w wVar) {
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
                                if (iK != 7994) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    if (!z11) {
                                        this.f18671c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f18671c.add(lVar.A(q.f18724l, wVar));
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
                        this.f18671c = DesugarCollections.unmodifiableList(this.f18671c);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.f18671c = DesugarCollections.unmodifiableList(this.f18671c);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class n extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final n f18676g = new n();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final p1 f18677h = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f18680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private o f18681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f18682f;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new n(lVar, wVar);
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.f18336w;
        }

        public static n q() {
            return f18676g;
        }

        public static b v() {
            return f18676g.toBuilder();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18676g ? new b() : new b().w(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return super.equals(obj);
            }
            n nVar = (n) obj;
            if (hasName() != nVar.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(nVar.getName())) && getMethodList().equals(nVar.getMethodList()) && u() == nVar.u()) {
                return (!u() || t().equals(nVar.t())) && this.unknownFields.equals(nVar.unknownFields);
            }
            return false;
        }

        public int getMethodCount() {
            return this.f18680d.size();
        }

        public List getMethodList() {
            return this.f18680d;
        }

        public String getName() {
            Object obj = this.f18679c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18679c = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18677h;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18678b & 1) != 0 ? h0.computeStringSize(1, this.f18679c) : 0;
            for (int i11 = 0; i11 < this.f18680d.size(); i11++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(2, (MessageLite) this.f18680d.get(i11));
            }
            if ((this.f18678b & 2) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.G(3, t());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasName() {
            return (this.f18678b & 1) != 0;
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
            if (getMethodCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMethodList().hashCode();
            }
            if (u()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + t().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.f18337x.d(n.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18682f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getMethodCount(); i10++) {
                if (!s(i10).isInitialized()) {
                    this.f18682f = (byte) 0;
                    return false;
                }
            }
            if (!u() || t().isInitialized()) {
                this.f18682f = (byte) 1;
                return true;
            }
            this.f18682f = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new n();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public n getDefaultInstanceForType() {
            return f18676g;
        }

        public k s(int i10) {
            return (k) this.f18680d.get(i10);
        }

        public o t() {
            o oVar = this.f18681e;
            return oVar == null ? o.u() : oVar;
        }

        public boolean u() {
            return (this.f18678b & 2) != 0;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            if ((this.f18678b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18679c);
            }
            for (int i10 = 0; i10 < this.f18680d.size(); i10++) {
                nVar.J0(2, (MessageLite) this.f18680d.get(i10));
            }
            if ((this.f18678b & 2) != 0) {
                nVar.J0(3, t());
            }
            this.unknownFields.writeTo(nVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return v();
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18683b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18684c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List f18685d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private v1 f18686e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private o f18687f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private a2 f18688g;

            private void ensureMethodIsMutable() {
                if ((this.f18683b & 2) == 0) {
                    this.f18685d = new ArrayList(this.f18685d);
                    this.f18683b |= 2;
                }
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    r();
                    t();
                }
            }

            private v1 r() {
                if (this.f18686e == null) {
                    this.f18686e = new v1(this.f18685d, (this.f18683b & 2) != 0, getParentForChildren(), isClean());
                    this.f18685d = null;
                }
                return this.f18686e;
            }

            private a2 t() {
                if (this.f18688g == null) {
                    this.f18688g = new a2(s(), getParentForChildren(), isClean());
                    this.f18687f = null;
                }
                return this.f18688g;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.f18336w;
            }

            public int getMethodCount() {
                v1 v1Var = this.f18686e;
                return v1Var == null ? this.f18685d.size() : v1Var.m();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public n build() {
                n nVarBuildPartial = buildPartial();
                if (nVarBuildPartial.isInitialized()) {
                    return nVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) nVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.f18337x.d(n.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getMethodCount(); i10++) {
                    if (!q(i10).isInitialized()) {
                        return false;
                    }
                }
                return !u() || s().isInitialized();
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public n buildPartial() {
                n nVar = new n(this);
                int i10 = this.f18683b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                nVar.f18679c = this.f18684c;
                v1 v1Var = this.f18686e;
                if (v1Var == null) {
                    if ((this.f18683b & 2) != 0) {
                        this.f18685d = DesugarCollections.unmodifiableList(this.f18685d);
                        this.f18683b &= -3;
                    }
                    nVar.f18680d = this.f18685d;
                } else {
                    nVar.f18680d = v1Var.f();
                }
                if ((i10 & 4) != 0) {
                    a2 a2Var = this.f18688g;
                    if (a2Var == null) {
                        nVar.f18681e = this.f18687f;
                    } else {
                        nVar.f18681e = (o) a2Var.a();
                    }
                    i11 |= 2;
                }
                nVar.f18678b = i11;
                onBuilt();
                return nVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f18684c = "";
                int i10 = this.f18683b;
                this.f18683b = i10 & (-2);
                v1 v1Var = this.f18686e;
                if (v1Var == null) {
                    this.f18685d = Collections.EMPTY_LIST;
                    this.f18683b = i10 & (-4);
                } else {
                    v1Var.g();
                }
                a2 a2Var = this.f18688g;
                if (a2Var == null) {
                    this.f18687f = null;
                } else {
                    a2Var.b();
                }
                this.f18683b &= -5;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public n getDefaultInstanceForType() {
                return n.q();
            }

            public k q(int i10) {
                v1 v1Var = this.f18686e;
                return v1Var == null ? (k) this.f18685d.get(i10) : (k) v1Var.n(i10);
            }

            public o s() {
                a2 a2Var = this.f18688g;
                if (a2Var != null) {
                    return (o) a2Var.e();
                }
                o oVar = this.f18687f;
                return oVar == null ? o.u() : oVar;
            }

            public boolean u() {
                return (this.f18683b & 4) != 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.n.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.n.f18677h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$n r3 = (com.explorestack.protobuf.DescriptorProtos.n) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.w(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$n r4 = (com.explorestack.protobuf.DescriptorProtos.n) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.w(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.n.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$n$b");
            }

            public b w(n nVar) {
                if (nVar == n.q()) {
                    return this;
                }
                if (nVar.hasName()) {
                    this.f18683b |= 1;
                    this.f18684c = nVar.f18679c;
                    onChanged();
                }
                if (this.f18686e == null) {
                    if (!nVar.f18680d.isEmpty()) {
                        if (this.f18685d.isEmpty()) {
                            this.f18685d = nVar.f18680d;
                            this.f18683b &= -3;
                        } else {
                            ensureMethodIsMutable();
                            this.f18685d.addAll(nVar.f18680d);
                        }
                        onChanged();
                    }
                } else if (!nVar.f18680d.isEmpty()) {
                    if (this.f18686e.t()) {
                        this.f18686e.h();
                        this.f18686e = null;
                        this.f18685d = nVar.f18680d;
                        this.f18683b &= -3;
                        this.f18686e = h0.alwaysUseFieldBuilders ? r() : null;
                    } else {
                        this.f18686e.a(nVar.f18680d);
                    }
                }
                if (nVar.u()) {
                    y(nVar.t());
                }
                mergeUnknownFields(nVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof n) {
                    return w((n) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b y(o oVar) {
                o oVar2;
                a2 a2Var = this.f18688g;
                if (a2Var == null) {
                    if ((this.f18683b & 4) == 0 || (oVar2 = this.f18687f) == null || oVar2 == o.u()) {
                        this.f18687f = oVar;
                    } else {
                        this.f18687f = o.F(this.f18687f).F(oVar).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(oVar);
                }
                this.f18683b |= 4;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            private b() {
                this.f18684c = "";
                this.f18685d = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18684c = "";
                this.f18685d = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private n(h0.b bVar) {
            super(bVar);
            this.f18682f = (byte) -1;
        }

        private n() {
            this.f18682f = (byte) -1;
            this.f18679c = "";
            this.f18680d = Collections.EMPTY_LIST;
        }

        private n(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                ByteString byteStringR = lVar.r();
                                this.f18678b = 1 | this.f18678b;
                                this.f18679c = byteStringR;
                            } else if (iK == 18) {
                                if ((c10 & 2) == 0) {
                                    this.f18680d = new ArrayList();
                                    c10 = 2;
                                }
                                this.f18680d.add(lVar.A(k.f18642k, wVar));
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                o.b builder = (this.f18678b & 2) != 0 ? this.f18681e.toBuilder() : null;
                                o oVar = (o) lVar.A(o.f18690h, wVar);
                                this.f18681e = oVar;
                                if (builder != null) {
                                    builder.F(oVar);
                                    this.f18681e = builder.buildPartial();
                                }
                                this.f18678b |= 2;
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((c10 & 2) != 0) {
                        this.f18680d = DesugarCollections.unmodifiableList(this.f18680d);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((c10 & 2) != 0) {
                this.f18680d = DesugarCollections.unmodifiableList(this.f18680d);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class o extends h0.e implements MessageOrBuilder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o f18689g = new o();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final p1 f18690h = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f18693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f18694f;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public o parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new o(lVar, wVar);
            }
        }

        public static b E() {
            return f18689g.toBuilder();
        }

        public static b F(o oVar) {
            return f18689g.toBuilder().F(oVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.M;
        }

        public static o u() {
            return f18689g;
        }

        public q A(int i10) {
            return (q) this.f18693e.get(i10);
        }

        public int B() {
            return this.f18693e.size();
        }

        public List C() {
            return this.f18693e;
        }

        public boolean D() {
            return (this.f18691c & 1) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return E();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18689g ? new b() : new b().F(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return super.equals(obj);
            }
            o oVar = (o) obj;
            if (D() != oVar.D()) {
                return false;
            }
            return (!D() || x() == oVar.x()) && C().equals(oVar.C()) && this.unknownFields.equals(oVar.unknownFields) && m().equals(oVar.m());
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18690h;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f18691c & 1) != 0 ? com.explorestack.protobuf.n.e(33, this.f18692d) : 0;
            for (int i11 = 0; i11 < this.f18693e.size(); i11++) {
                iE += com.explorestack.protobuf.n.G(999, (MessageLite) this.f18693e.get(i11));
            }
            int iL = iE + l() + this.unknownFields.getSerializedSize();
            this.memoizedSize = iL;
            return iL;
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
            if (D()) {
                iHashCode = (((iHashCode * 37) + 33) * 53) + j0.d(x());
            }
            if (B() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + C().hashCode();
            }
            int iHashFields = (AbstractMessage.hashFields(iHashCode, m()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.N.d(o.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18694f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < B(); i10++) {
                if (!A(i10).isInitialized()) {
                    this.f18694f = (byte) 0;
                    return false;
                }
            }
            if (k()) {
                this.f18694f = (byte) 1;
                return true;
            }
            this.f18694f = (byte) 0;
            return false;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new o();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public o getDefaultInstanceForType() {
            return f18689g;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            h0.e.a aVarN = n();
            if ((this.f18691c & 1) != 0) {
                nVar.n0(33, this.f18692d);
            }
            for (int i10 = 0; i10 < this.f18693e.size(); i10++) {
                nVar.J0(999, (MessageLite) this.f18693e.get(i10));
            }
            aVarN.a(536870912, nVar);
            this.unknownFields.writeTo(nVar);
        }

        public boolean x() {
            return this.f18692d;
        }

        public static final class b extends h0.d implements MessageOrBuilder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f18695c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f18696d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private List f18697e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private v1 f18698f;

            private v1 D() {
                if (this.f18698f == null) {
                    this.f18698f = new v1(this.f18697e, (this.f18695c & 2) != 0, getParentForChildren(), isClean());
                    this.f18697e = null;
                }
                return this.f18698f;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    D();
                }
            }

            private void z() {
                if ((this.f18695c & 2) == 0) {
                    this.f18697e = new ArrayList(this.f18697e);
                    this.f18695c |= 2;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public o getDefaultInstanceForType() {
                return o.u();
            }

            public q B(int i10) {
                v1 v1Var = this.f18698f;
                return v1Var == null ? (q) this.f18697e.get(i10) : (q) v1Var.n(i10);
            }

            public int C() {
                v1 v1Var = this.f18698f;
                return v1Var == null ? this.f18697e.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.o.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.o.f18690h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$o r3 = (com.explorestack.protobuf.DescriptorProtos.o) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.F(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$o r4 = (com.explorestack.protobuf.DescriptorProtos.o) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.F(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.o.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$o$b");
            }

            public b F(o oVar) {
                if (oVar == o.u()) {
                    return this;
                }
                if (oVar.D()) {
                    I(oVar.x());
                }
                if (this.f18698f == null) {
                    if (!oVar.f18693e.isEmpty()) {
                        if (this.f18697e.isEmpty()) {
                            this.f18697e = oVar.f18693e;
                            this.f18695c &= -3;
                        } else {
                            z();
                            this.f18697e.addAll(oVar.f18693e);
                        }
                        onChanged();
                    }
                } else if (!oVar.f18693e.isEmpty()) {
                    if (this.f18698f.t()) {
                        this.f18698f.h();
                        this.f18698f = null;
                        this.f18697e = oVar.f18693e;
                        this.f18695c &= -3;
                        this.f18698f = h0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f18698f.a(oVar.f18693e);
                    }
                }
                o(oVar);
                mergeUnknownFields(oVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof o) {
                    return F((o) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b I(boolean z10) {
                this.f18695c |= 1;
                this.f18696d = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.p(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.q(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.M;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.N.d(o.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.h(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public o build() {
                o oVarBuildPartial = buildPartial();
                if (oVarBuildPartial.isInitialized()) {
                    return oVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public o buildPartial() {
                o oVar = new o(this);
                int i10 = 1;
                if ((this.f18695c & 1) != 0) {
                    oVar.f18692d = this.f18696d;
                } else {
                    i10 = 0;
                }
                v1 v1Var = this.f18698f;
                if (v1Var == null) {
                    if ((this.f18695c & 2) != 0) {
                        this.f18697e = DesugarCollections.unmodifiableList(this.f18697e);
                        this.f18695c &= -3;
                    }
                    oVar.f18693e = this.f18697e;
                } else {
                    oVar.f18693e = v1Var.f();
                }
                oVar.f18691c = i10;
                onBuilt();
                return oVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.j();
                this.f18696d = false;
                int i10 = this.f18695c;
                this.f18695c = i10 & (-2);
                v1 v1Var = this.f18698f;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18697e = Collections.EMPTY_LIST;
                this.f18695c = i10 & (-4);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.k(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            private b() {
                this.f18697e = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18697e = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private o(h0.d dVar) {
            super(dVar);
            this.f18694f = (byte) -1;
        }

        private o() {
            this.f18694f = (byte) -1;
            this.f18693e = Collections.EMPTY_LIST;
        }

        private o(com.explorestack.protobuf.l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 264) {
                                this.f18691c |= 1;
                                this.f18692d = lVar.q();
                            } else if (iK != 7994) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((c10 & 2) == 0) {
                                    this.f18693e = new ArrayList();
                                    c10 = 2;
                                }
                                this.f18693e.add(lVar.A(q.f18724l, wVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((c10 & 2) != 0) {
                        this.f18693e = DesugarCollections.unmodifiableList(this.f18693e);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((c10 & 2) != 0) {
                this.f18693e = DesugarCollections.unmodifiableList(this.f18693e);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class p extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final p f18699d = new p();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final p1 f18700e = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f18701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte f18702c;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new p(lVar, wVar);
            }
        }

        public static final class c extends h0 implements MessageOrBuilder {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final c f18706k = new c();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final p1 f18707l = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18708b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private j0.g f18709c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f18710d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private j0.g f18711e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f18712f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private volatile Object f18713g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private volatile Object f18714h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private p0 f18715i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private byte f18716j;

            static class a extends com.explorestack.protobuf.b {
                a() {
                }

                @Override // com.explorestack.protobuf.p1
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                    return new c(lVar, wVar);
                }
            }

            public static b K() {
                return f18706k.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.W;
            }

            public static c v() {
                return f18706k;
            }

            public String A() {
                Object obj = this.f18713g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f18713g = stringUtf8;
                }
                return stringUtf8;
            }

            public int B() {
                return this.f18715i.size();
            }

            public t1 C() {
                return this.f18715i;
            }

            public int D() {
                return this.f18709c.size();
            }

            public List E() {
                return this.f18709c;
            }

            public int F() {
                return this.f18711e.size();
            }

            public List G() {
                return this.f18711e;
            }

            public String H() {
                Object obj = this.f18714h;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f18714h = stringUtf8;
                }
                return stringUtf8;
            }

            public boolean I() {
                return (this.f18708b & 1) != 0;
            }

            public boolean J() {
                return (this.f18708b & 2) != 0;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return K();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType(h0.c cVar) {
                return new b(cVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return this == f18706k ? new b() : new b().u(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (!E().equals(cVar.E()) || !G().equals(cVar.G()) || I() != cVar.I()) {
                    return false;
                }
                if ((!I() || A().equals(cVar.A())) && J() == cVar.J()) {
                    return (!J() || H().equals(cVar.H())) && C().equals(cVar.C()) && this.unknownFields.equals(cVar.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return f18707l;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iY = 0;
                for (int i11 = 0; i11 < this.f18709c.size(); i11++) {
                    iY += com.explorestack.protobuf.n.y(this.f18709c.getInt(i11));
                }
                int iY2 = !E().isEmpty() ? iY + 1 + com.explorestack.protobuf.n.y(iY) : iY;
                this.f18710d = iY;
                int iY3 = 0;
                for (int i12 = 0; i12 < this.f18711e.size(); i12++) {
                    iY3 += com.explorestack.protobuf.n.y(this.f18711e.getInt(i12));
                }
                int iComputeStringSize = iY2 + iY3;
                if (!G().isEmpty()) {
                    iComputeStringSize = iComputeStringSize + 1 + com.explorestack.protobuf.n.y(iY3);
                }
                this.f18712f = iY3;
                if ((this.f18708b & 1) != 0) {
                    iComputeStringSize += h0.computeStringSize(3, this.f18713g);
                }
                if ((this.f18708b & 2) != 0) {
                    iComputeStringSize += h0.computeStringSize(4, this.f18714h);
                }
                int iComputeStringSizeNoTag = 0;
                for (int i13 = 0; i13 < this.f18715i.size(); i13++) {
                    iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.f18715i.getRaw(i13));
                }
                int size = iComputeStringSize + iComputeStringSizeNoTag + C().size() + this.unknownFields.getSerializedSize();
                this.memoizedSize = size;
                return size;
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
                if (D() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + E().hashCode();
                }
                if (F() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + G().hashCode();
                }
                if (I()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + A().hashCode();
                }
                if (J()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + H().hashCode();
                }
                if (B() > 0) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + C().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.X.d(c.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f18716j;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f18716j = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.h0
            protected Object newInstance(h0.g gVar) {
                return new c();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
                getSerializedSize();
                if (E().size() > 0) {
                    nVar.X0(10);
                    nVar.X0(this.f18710d);
                }
                for (int i10 = 0; i10 < this.f18709c.size(); i10++) {
                    nVar.G0(this.f18709c.getInt(i10));
                }
                if (G().size() > 0) {
                    nVar.X0(18);
                    nVar.X0(this.f18712f);
                }
                for (int i11 = 0; i11 < this.f18711e.size(); i11++) {
                    nVar.G0(this.f18711e.getInt(i11));
                }
                if ((this.f18708b & 1) != 0) {
                    h0.writeString(nVar, 3, this.f18713g);
                }
                if ((this.f18708b & 2) != 0) {
                    h0.writeString(nVar, 4, this.f18714h);
                }
                for (int i12 = 0; i12 < this.f18715i.size(); i12++) {
                    h0.writeString(nVar, 6, this.f18715i.getRaw(i12));
                }
                this.unknownFields.writeTo(nVar);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return f18706k;
            }

            public static final class b extends h0.b implements MessageOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f18717b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private j0.g f18718c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private j0.g f18719d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Object f18720e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private Object f18721f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private p0 f18722g;

                private void maybeForceBuilderInitialization() {
                    boolean z10 = h0.alwaysUseFieldBuilders;
                }

                private void p() {
                    if ((this.f18717b & 16) == 0) {
                        this.f18722g = new o0(this.f18722g);
                        this.f18717b |= 16;
                    }
                }

                private void q() {
                    if ((this.f18717b & 1) == 0) {
                        this.f18718c = h0.mutableCopy(this.f18718c);
                        this.f18717b |= 1;
                    }
                }

                private void r() {
                    if ((this.f18717b & 2) == 0) {
                        this.f18719d = h0.mutableCopy(this.f18719d);
                        this.f18717b |= 2;
                    }
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.W;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) cVarBuildPartial);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return DescriptorProtos.X.d(c.class, b.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c buildPartial() {
                    c cVar = new c(this);
                    int i10 = this.f18717b;
                    if ((i10 & 1) != 0) {
                        this.f18718c.makeImmutable();
                        this.f18717b &= -2;
                    }
                    cVar.f18709c = this.f18718c;
                    if ((this.f18717b & 2) != 0) {
                        this.f18719d.makeImmutable();
                        this.f18717b &= -3;
                    }
                    cVar.f18711e = this.f18719d;
                    int i11 = (i10 & 4) != 0 ? 1 : 0;
                    cVar.f18713g = this.f18720e;
                    if ((i10 & 8) != 0) {
                        i11 |= 2;
                    }
                    cVar.f18714h = this.f18721f;
                    if ((this.f18717b & 16) != 0) {
                        this.f18722g = this.f18722g.getUnmodifiableView();
                        this.f18717b &= -17;
                    }
                    cVar.f18715i = this.f18722g;
                    cVar.f18708b = i11;
                    onBuilt();
                    return cVar;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b clear() {
                    super.clear();
                    this.f18718c = h0.emptyIntList();
                    this.f18717b &= -2;
                    this.f18719d = h0.emptyIntList();
                    int i10 = this.f18717b;
                    this.f18720e = "";
                    this.f18721f = "";
                    this.f18717b = i10 & (-15);
                    this.f18722g = o0.f19269e;
                    this.f18717b = i10 & (-31);
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public b mo4427clone() {
                    return (b) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public c getDefaultInstanceForType() {
                    return c.v();
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.DescriptorProtos.p.c.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.p.c.f18707l     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        com.explorestack.protobuf.DescriptorProtos$p$c r3 = (com.explorestack.protobuf.DescriptorProtos.p.c) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.u(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        com.explorestack.protobuf.DescriptorProtos$p$c r4 = (com.explorestack.protobuf.DescriptorProtos.p.c) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.u(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.p.c.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$p$c$b");
                }

                public b u(c cVar) {
                    if (cVar == c.v()) {
                        return this;
                    }
                    if (!cVar.f18709c.isEmpty()) {
                        if (this.f18718c.isEmpty()) {
                            this.f18718c = cVar.f18709c;
                            this.f18717b &= -2;
                        } else {
                            q();
                            this.f18718c.addAll(cVar.f18709c);
                        }
                        onChanged();
                    }
                    if (!cVar.f18711e.isEmpty()) {
                        if (this.f18719d.isEmpty()) {
                            this.f18719d = cVar.f18711e;
                            this.f18717b &= -3;
                        } else {
                            r();
                            this.f18719d.addAll(cVar.f18711e);
                        }
                        onChanged();
                    }
                    if (cVar.I()) {
                        this.f18717b |= 4;
                        this.f18720e = cVar.f18713g;
                        onChanged();
                    }
                    if (cVar.J()) {
                        this.f18717b |= 8;
                        this.f18721f = cVar.f18714h;
                        onChanged();
                    }
                    if (!cVar.f18715i.isEmpty()) {
                        if (this.f18722g.isEmpty()) {
                            this.f18722g = cVar.f18715i;
                            this.f18717b &= -17;
                        } else {
                            p();
                            this.f18722g.addAll(cVar.f18715i);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(cVar.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(Message message) {
                    if (message instanceof c) {
                        return u((c) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public final b mergeUnknownFields(r2 r2Var) {
                    return (b) super.mergeUnknownFields(r2Var);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r2 r2Var) {
                    return (b) super.setUnknownFields(r2Var);
                }

                private b() {
                    this.f18718c = h0.emptyIntList();
                    this.f18719d = h0.emptyIntList();
                    this.f18720e = "";
                    this.f18721f = "";
                    this.f18722g = o0.f19269e;
                    maybeForceBuilderInitialization();
                }

                private b(h0.c cVar) {
                    super(cVar);
                    this.f18718c = h0.emptyIntList();
                    this.f18719d = h0.emptyIntList();
                    this.f18720e = "";
                    this.f18721f = "";
                    this.f18722g = o0.f19269e;
                    maybeForceBuilderInitialization();
                }
            }

            private c(h0.b bVar) {
                super(bVar);
                this.f18710d = -1;
                this.f18712f = -1;
                this.f18716j = (byte) -1;
            }

            private c() {
                this.f18710d = -1;
                this.f18712f = -1;
                this.f18716j = (byte) -1;
                this.f18709c = h0.emptyIntList();
                this.f18711e = h0.emptyIntList();
                this.f18713g = "";
                this.f18714h = "";
                this.f18715i = o0.f19269e;
            }

            private c(com.explorestack.protobuf.l lVar, w wVar) {
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
                                    if ((i10 & 1) == 0) {
                                        this.f18709c = h0.newIntList();
                                        i10 |= 1;
                                    }
                                    this.f18709c.addInt(lVar.y());
                                } else if (iK == 10) {
                                    int iP = lVar.p(lVar.C());
                                    if ((i10 & 1) == 0 && lVar.d() > 0) {
                                        this.f18709c = h0.newIntList();
                                        i10 |= 1;
                                    }
                                    while (lVar.d() > 0) {
                                        this.f18709c.addInt(lVar.y());
                                    }
                                    lVar.o(iP);
                                } else if (iK == 16) {
                                    if ((i10 & 2) == 0) {
                                        this.f18711e = h0.newIntList();
                                        i10 |= 2;
                                    }
                                    this.f18711e.addInt(lVar.y());
                                } else if (iK == 18) {
                                    int iP2 = lVar.p(lVar.C());
                                    if ((i10 & 2) == 0 && lVar.d() > 0) {
                                        this.f18711e = h0.newIntList();
                                        i10 |= 2;
                                    }
                                    while (lVar.d() > 0) {
                                        this.f18711e.addInt(lVar.y());
                                    }
                                    lVar.o(iP2);
                                } else if (iK == 26) {
                                    ByteString byteStringR = lVar.r();
                                    this.f18708b = 1 | this.f18708b;
                                    this.f18713g = byteStringR;
                                } else if (iK == 34) {
                                    ByteString byteStringR2 = lVar.r();
                                    this.f18708b |= 2;
                                    this.f18714h = byteStringR2;
                                } else if (iK != 50) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    ByteString byteStringR3 = lVar.r();
                                    if ((i10 & 16) == 0) {
                                        this.f18715i = new o0();
                                        i10 |= 16;
                                    }
                                    this.f18715i.c(byteStringR3);
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
                            this.f18709c.makeImmutable();
                        }
                        if ((i10 & 2) != 0) {
                            this.f18711e.makeImmutable();
                        }
                        if ((i10 & 16) != 0) {
                            this.f18715i = this.f18715i.getUnmodifiableView();
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.f18709c.makeImmutable();
                }
                if ((i10 & 2) != 0) {
                    this.f18711e.makeImmutable();
                }
                if ((i10 & 16) != 0) {
                    this.f18715i = this.f18715i.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.U;
        }

        public static p l() {
            return f18699d;
        }

        public static b q() {
            return f18699d.toBuilder();
        }

        public static b r(p pVar) {
            return f18699d.toBuilder().t(pVar);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof p)) {
                return super.equals(obj);
            }
            p pVar = (p) obj;
            return o().equals(pVar.o()) && this.unknownFields.equals(pVar.unknownFields);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18700e;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.f18701b.size(); i11++) {
                iG += com.explorestack.protobuf.n.G(1, (MessageLite) this.f18701b.get(i11));
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
            if (n() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + o().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.V.d(p.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18702c;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f18702c = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public p getDefaultInstanceForType() {
            return f18699d;
        }

        public int n() {
            return this.f18701b.size();
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new p();
        }

        public List o() {
            return this.f18701b;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18699d ? new b() : new b().t(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) {
            for (int i10 = 0; i10 < this.f18701b.size(); i10++) {
                nVar.J0(1, (MessageLite) this.f18701b.get(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18703b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List f18704c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private v1 f18705d;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            private void p() {
                if ((this.f18703b & 1) == 0) {
                    this.f18704c = new ArrayList(this.f18704c);
                    this.f18703b |= 1;
                }
            }

            private v1 r() {
                if (this.f18705d == null) {
                    this.f18705d = new v1(this.f18704c, (this.f18703b & 1) != 0, getParentForChildren(), isClean());
                    this.f18704c = null;
                }
                return this.f18705d;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.U;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public p build() {
                p pVarBuildPartial = buildPartial();
                if (pVarBuildPartial.isInitialized()) {
                    return pVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.V.d(p.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public p buildPartial() {
                p pVar = new p(this);
                int i10 = this.f18703b;
                v1 v1Var = this.f18705d;
                if (v1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.f18704c = DesugarCollections.unmodifiableList(this.f18704c);
                        this.f18703b &= -2;
                    }
                    pVar.f18701b = this.f18704c;
                } else {
                    pVar.f18701b = v1Var.f();
                }
                onBuilt();
                return pVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                v1 v1Var = this.f18705d;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18704c = Collections.EMPTY_LIST;
                this.f18703b &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public p getDefaultInstanceForType() {
                return p.l();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.p.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.p.f18700e     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$p r3 = (com.explorestack.protobuf.DescriptorProtos.p) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.t(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$p r4 = (com.explorestack.protobuf.DescriptorProtos.p) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.t(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.p.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$p$b");
            }

            public b t(p pVar) {
                if (pVar == p.l()) {
                    return this;
                }
                if (this.f18705d == null) {
                    if (!pVar.f18701b.isEmpty()) {
                        if (this.f18704c.isEmpty()) {
                            this.f18704c = pVar.f18701b;
                            this.f18703b &= -2;
                        } else {
                            p();
                            this.f18704c.addAll(pVar.f18701b);
                        }
                        onChanged();
                    }
                } else if (!pVar.f18701b.isEmpty()) {
                    if (this.f18705d.t()) {
                        this.f18705d.h();
                        this.f18705d = null;
                        this.f18704c = pVar.f18701b;
                        this.f18703b &= -2;
                        this.f18705d = h0.alwaysUseFieldBuilders ? r() : null;
                    } else {
                        this.f18705d.a(pVar.f18701b);
                    }
                }
                mergeUnknownFields(pVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof p) {
                    return t((p) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            private b() {
                this.f18704c = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18704c = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private p(h0.b bVar) {
            super(bVar);
            this.f18702c = (byte) -1;
        }

        private p() {
            this.f18702c = (byte) -1;
            this.f18701b = Collections.EMPTY_LIST;
        }

        private p(com.explorestack.protobuf.l lVar, w wVar) {
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
                                        this.f18701b = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f18701b.add(lVar.A(c.f18707l, wVar));
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
                        this.f18701b = DesugarCollections.unmodifiableList(this.f18701b);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.f18701b = DesugarCollections.unmodifiableList(this.f18701b);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public static final class q extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final q f18723k = new q();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final p1 f18724l = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f18726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile Object f18727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f18728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f18729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private double f18730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ByteString f18731h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile Object f18732i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f18733j;

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public q parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new q(lVar, wVar);
            }
        }

        public static final class c extends h0 implements MessageOrBuilder {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final c f18743f = new c();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final p1 f18744g = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18745b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private volatile Object f18746c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f18747d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private byte f18748e;

            static class a extends com.explorestack.protobuf.b {
                a() {
                }

                @Override // com.explorestack.protobuf.p1
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                    return new c(lVar, wVar);
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DescriptorProtos.S;
            }

            public static c n() {
                return f18743f;
            }

            public static b u() {
                return f18743f.toBuilder();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return this == f18743f ? new b() : new b().t(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (t() != cVar.t()) {
                    return false;
                }
                if ((!t() || r().equals(cVar.r())) && s() == cVar.s()) {
                    return (!s() || q() == cVar.q()) && this.unknownFields.equals(cVar.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return f18744g;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = (this.f18745b & 1) != 0 ? h0.computeStringSize(1, this.f18746c) : 0;
                if ((this.f18745b & 2) != 0) {
                    iComputeStringSize += com.explorestack.protobuf.n.e(2, this.f18747d);
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
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
                if (t()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + r().hashCode();
                }
                if (s()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + j0.d(q());
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.T.d(c.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f18748e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!t()) {
                    this.f18748e = (byte) 0;
                    return false;
                }
                if (s()) {
                    this.f18748e = (byte) 1;
                    return true;
                }
                this.f18748e = (byte) 0;
                return false;
            }

            @Override // com.explorestack.protobuf.h0
            protected Object newInstance(h0.g gVar) {
                return new c();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return f18743f;
            }

            public boolean q() {
                return this.f18747d;
            }

            public String r() {
                Object obj = this.f18746c;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f18746c = stringUtf8;
                }
                return stringUtf8;
            }

            public boolean s() {
                return (this.f18745b & 2) != 0;
            }

            public boolean t() {
                return (this.f18745b & 1) != 0;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return u();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
                if ((this.f18745b & 1) != 0) {
                    h0.writeString(nVar, 1, this.f18746c);
                }
                if ((this.f18745b & 2) != 0) {
                    nVar.n0(2, this.f18747d);
                }
                this.unknownFields.writeTo(nVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType(h0.c cVar) {
                return new b(cVar);
            }

            public static final class b extends h0.b implements MessageOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f18749b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private Object f18750c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f18751d;

                private void maybeForceBuilderInitialization() {
                    boolean z10 = h0.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DescriptorProtos.S;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) cVarBuildPartial);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return DescriptorProtos.T.d(c.class, b.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return r() && q();
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c buildPartial() {
                    c cVar = new c(this);
                    int i10 = this.f18749b;
                    int i11 = (i10 & 1) != 0 ? 1 : 0;
                    cVar.f18746c = this.f18750c;
                    if ((i10 & 2) != 0) {
                        cVar.f18747d = this.f18751d;
                        i11 |= 2;
                    }
                    cVar.f18745b = i11;
                    onBuilt();
                    return cVar;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b clear() {
                    super.clear();
                    this.f18750c = "";
                    int i10 = this.f18749b;
                    this.f18751d = false;
                    this.f18749b = i10 & (-4);
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public b mo4427clone() {
                    return (b) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public c getDefaultInstanceForType() {
                    return c.n();
                }

                public boolean q() {
                    return (this.f18749b & 2) != 0;
                }

                public boolean r() {
                    return (this.f18749b & 1) != 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.DescriptorProtos.q.c.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.q.c.f18744g     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        com.explorestack.protobuf.DescriptorProtos$q$c r3 = (com.explorestack.protobuf.DescriptorProtos.q.c) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.t(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        com.explorestack.protobuf.DescriptorProtos$q$c r4 = (com.explorestack.protobuf.DescriptorProtos.q.c) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.t(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.q.c.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$q$c$b");
                }

                public b t(c cVar) {
                    if (cVar == c.n()) {
                        return this;
                    }
                    if (cVar.t()) {
                        this.f18749b |= 1;
                        this.f18750c = cVar.f18746c;
                        onChanged();
                    }
                    if (cVar.s()) {
                        x(cVar.q());
                    }
                    mergeUnknownFields(cVar.unknownFields);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(Message message) {
                    if (message instanceof c) {
                        return t((c) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public final b mergeUnknownFields(r2 r2Var) {
                    return (b) super.mergeUnknownFields(r2Var);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                public b x(boolean z10) {
                    this.f18749b |= 2;
                    this.f18751d = z10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r2 r2Var) {
                    return (b) super.setUnknownFields(r2Var);
                }

                private b() {
                    this.f18750c = "";
                    maybeForceBuilderInitialization();
                }

                private b(h0.c cVar) {
                    super(cVar);
                    this.f18750c = "";
                    maybeForceBuilderInitialization();
                }
            }

            private c(h0.b bVar) {
                super(bVar);
                this.f18748e = (byte) -1;
            }

            private c() {
                this.f18748e = (byte) -1;
                this.f18746c = "";
            }

            private c(com.explorestack.protobuf.l lVar, w wVar) {
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
                                    ByteString byteStringR = lVar.r();
                                    this.f18745b = 1 | this.f18745b;
                                    this.f18746c = byteStringR;
                                } else if (iK != 16) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.f18745b |= 2;
                                    this.f18747d = lVar.q();
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
        }

        public static b O() {
            return f18723k.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DescriptorProtos.Q;
        }

        public static q x() {
            return f18723k;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public q getDefaultInstanceForType() {
            return f18723k;
        }

        public double B() {
            return this.f18730g;
        }

        public String C() {
            Object obj = this.f18727d;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18727d = stringUtf8;
            }
            return stringUtf8;
        }

        public c D(int i10) {
            return (c) this.f18726c.get(i10);
        }

        public int E() {
            return this.f18726c.size();
        }

        public List F() {
            return this.f18726c;
        }

        public long G() {
            return this.f18729f;
        }

        public long H() {
            return this.f18728e;
        }

        public ByteString I() {
            return this.f18731h;
        }

        public boolean J() {
            return (this.f18725b & 32) != 0;
        }

        public boolean K() {
            return (this.f18725b & 8) != 0;
        }

        public boolean L() {
            return (this.f18725b & 1) != 0;
        }

        public boolean M() {
            return (this.f18725b & 4) != 0;
        }

        public boolean N() {
            return (this.f18725b & 2) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return O();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18723k ? new b() : new b().v(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return super.equals(obj);
            }
            q qVar = (q) obj;
            if (!F().equals(qVar.F()) || L() != qVar.L()) {
                return false;
            }
            if ((L() && !C().equals(qVar.C())) || N() != qVar.N()) {
                return false;
            }
            if ((N() && H() != qVar.H()) || M() != qVar.M()) {
                return false;
            }
            if ((M() && G() != qVar.G()) || K() != qVar.K()) {
                return false;
            }
            if ((K() && Double.doubleToLongBits(B()) != Double.doubleToLongBits(qVar.B())) || hasStringValue() != qVar.hasStringValue()) {
                return false;
            }
            if ((!hasStringValue() || I().equals(qVar.I())) && J() == qVar.J()) {
                return (!J() || v().equals(qVar.v())) && this.unknownFields.equals(qVar.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18724l;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = 0;
            for (int i11 = 0; i11 < this.f18726c.size(); i11++) {
                iComputeStringSize += com.explorestack.protobuf.n.G(2, (MessageLite) this.f18726c.get(i11));
            }
            if ((this.f18725b & 1) != 0) {
                iComputeStringSize += h0.computeStringSize(3, this.f18727d);
            }
            if ((this.f18725b & 2) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.a0(4, this.f18728e);
            }
            if ((this.f18725b & 4) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.z(5, this.f18729f);
            }
            if ((this.f18725b & 8) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.j(6, this.f18730g);
            }
            if ((this.f18725b & 16) != 0) {
                iComputeStringSize += com.explorestack.protobuf.n.h(7, this.f18731h);
            }
            if ((this.f18725b & 32) != 0) {
                iComputeStringSize += h0.computeStringSize(8, this.f18732i);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasStringValue() {
            return (this.f18725b & 16) != 0;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (E() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + F().hashCode();
            }
            if (L()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + C().hashCode();
            }
            if (N()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + j0.i(H());
            }
            if (M()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + j0.i(G());
            }
            if (K()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + j0.i(Double.doubleToLongBits(B()));
            }
            if (hasStringValue()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + I().hashCode();
            }
            if (J()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + v().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return DescriptorProtos.R.d(q.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18733j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < E(); i10++) {
                if (!D(i10).isInitialized()) {
                    this.f18733j = (byte) 0;
                    return false;
                }
            }
            this.f18733j = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new q();
        }

        public String v() {
            Object obj = this.f18732i;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18732i = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(com.explorestack.protobuf.n nVar) throws IOException {
            for (int i10 = 0; i10 < this.f18726c.size(); i10++) {
                nVar.J0(2, (MessageLite) this.f18726c.get(i10));
            }
            if ((this.f18725b & 1) != 0) {
                h0.writeString(nVar, 3, this.f18727d);
            }
            if ((this.f18725b & 2) != 0) {
                nVar.Y0(4, this.f18728e);
            }
            if ((this.f18725b & 4) != 0) {
                nVar.H0(5, this.f18729f);
            }
            if ((this.f18725b & 8) != 0) {
                nVar.t0(6, this.f18730g);
            }
            if ((this.f18725b & 16) != 0) {
                nVar.r0(7, this.f18731h);
            }
            if ((this.f18725b & 32) != 0) {
                h0.writeString(nVar, 8, this.f18732i);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18734b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List f18735c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private v1 f18736d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Object f18737e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private long f18738f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private long f18739g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private double f18740h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private ByteString f18741i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Object f18742j;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    t();
                }
            }

            private void p() {
                if ((this.f18734b & 1) == 0) {
                    this.f18735c = new ArrayList(this.f18735c);
                    this.f18734b |= 1;
                }
            }

            private v1 t() {
                if (this.f18736d == null) {
                    this.f18736d = new v1(this.f18735c, (this.f18734b & 1) != 0, getParentForChildren(), isClean());
                    this.f18735c = null;
                }
                return this.f18736d;
            }

            public b A(long j10) {
                this.f18734b |= 8;
                this.f18739g = j10;
                onChanged();
                return this;
            }

            public b B(long j10) {
                this.f18734b |= 4;
                this.f18738f = j10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public b D(ByteString byteString) {
                byteString.getClass();
                this.f18734b |= 32;
                this.f18741i = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DescriptorProtos.Q;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public q build() {
                q qVarBuildPartial = buildPartial();
                if (qVarBuildPartial.isInitialized()) {
                    return qVarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) qVarBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return DescriptorProtos.R.d(q.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < s(); i10++) {
                    if (!r(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public q buildPartial() {
                q qVar = new q(this);
                int i10 = this.f18734b;
                v1 v1Var = this.f18736d;
                if (v1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.f18735c = DesugarCollections.unmodifiableList(this.f18735c);
                        this.f18734b &= -2;
                    }
                    qVar.f18726c = this.f18735c;
                } else {
                    qVar.f18726c = v1Var.f();
                }
                int i11 = (i10 & 2) != 0 ? 1 : 0;
                qVar.f18727d = this.f18737e;
                if ((i10 & 4) != 0) {
                    qVar.f18728e = this.f18738f;
                    i11 |= 2;
                }
                if ((i10 & 8) != 0) {
                    qVar.f18729f = this.f18739g;
                    i11 |= 4;
                }
                if ((i10 & 16) != 0) {
                    qVar.f18730g = this.f18740h;
                    i11 |= 8;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 16;
                }
                qVar.f18731h = this.f18741i;
                if ((i10 & 64) != 0) {
                    i11 |= 32;
                }
                qVar.f18732i = this.f18742j;
                qVar.f18725b = i11;
                onBuilt();
                return qVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                v1 v1Var = this.f18736d;
                if (v1Var == null) {
                    this.f18735c = Collections.EMPTY_LIST;
                    this.f18734b &= -2;
                } else {
                    v1Var.g();
                }
                this.f18737e = "";
                int i10 = this.f18734b;
                this.f18738f = 0L;
                this.f18739g = 0L;
                this.f18740h = 0.0d;
                this.f18734b = i10 & (-31);
                this.f18741i = ByteString.EMPTY;
                this.f18742j = "";
                this.f18734b = i10 & (-127);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public q getDefaultInstanceForType() {
                return q.x();
            }

            public c r(int i10) {
                v1 v1Var = this.f18736d;
                return v1Var == null ? (c) this.f18735c.get(i10) : (c) v1Var.n(i10);
            }

            public int s() {
                v1 v1Var = this.f18736d;
                return v1Var == null ? this.f18735c.size() : v1Var.m();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.DescriptorProtos.q.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.DescriptorProtos.q.f18724l     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.DescriptorProtos$q r3 = (com.explorestack.protobuf.DescriptorProtos.q) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.v(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.DescriptorProtos$q r4 = (com.explorestack.protobuf.DescriptorProtos.q) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.v(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.DescriptorProtos.q.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.DescriptorProtos$q$b");
            }

            public b v(q qVar) {
                if (qVar == q.x()) {
                    return this;
                }
                if (this.f18736d == null) {
                    if (!qVar.f18726c.isEmpty()) {
                        if (this.f18735c.isEmpty()) {
                            this.f18735c = qVar.f18726c;
                            this.f18734b &= -2;
                        } else {
                            p();
                            this.f18735c.addAll(qVar.f18726c);
                        }
                        onChanged();
                    }
                } else if (!qVar.f18726c.isEmpty()) {
                    if (this.f18736d.t()) {
                        this.f18736d.h();
                        this.f18736d = null;
                        this.f18735c = qVar.f18726c;
                        this.f18734b &= -2;
                        this.f18736d = h0.alwaysUseFieldBuilders ? t() : null;
                    } else {
                        this.f18736d.a(qVar.f18726c);
                    }
                }
                if (qVar.L()) {
                    this.f18734b |= 2;
                    this.f18737e = qVar.f18727d;
                    onChanged();
                }
                if (qVar.N()) {
                    B(qVar.H());
                }
                if (qVar.M()) {
                    A(qVar.G());
                }
                if (qVar.K()) {
                    y(qVar.B());
                }
                if (qVar.hasStringValue()) {
                    D(qVar.I());
                }
                if (qVar.J()) {
                    this.f18734b |= 64;
                    this.f18742j = qVar.f18732i;
                    onChanged();
                }
                mergeUnknownFields(qVar.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof q) {
                    return v((q) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b y(double d10) {
                this.f18734b |= 16;
                this.f18740h = d10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            private b() {
                this.f18735c = Collections.EMPTY_LIST;
                this.f18737e = "";
                this.f18741i = ByteString.EMPTY;
                this.f18742j = "";
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18735c = Collections.EMPTY_LIST;
                this.f18737e = "";
                this.f18741i = ByteString.EMPTY;
                this.f18742j = "";
                maybeForceBuilderInitialization();
            }
        }

        private q(h0.b bVar) {
            super(bVar);
            this.f18733j = (byte) -1;
        }

        private q() {
            this.f18733j = (byte) -1;
            this.f18726c = Collections.EMPTY_LIST;
            this.f18727d = "";
            this.f18731h = ByteString.EMPTY;
            this.f18732i = "";
        }

        private q(com.explorestack.protobuf.l lVar, w wVar) {
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
                                if (iK == 18) {
                                    if (!z11) {
                                        this.f18726c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f18726c.add(lVar.A(c.f18744g, wVar));
                                } else if (iK == 26) {
                                    ByteString byteStringR = lVar.r();
                                    this.f18725b = 1 | this.f18725b;
                                    this.f18727d = byteStringR;
                                } else if (iK == 32) {
                                    this.f18725b |= 2;
                                    this.f18728e = lVar.M();
                                } else if (iK == 40) {
                                    this.f18725b |= 4;
                                    this.f18729f = lVar.z();
                                } else if (iK == 49) {
                                    this.f18725b |= 8;
                                    this.f18730g = lVar.s();
                                } else if (iK == 58) {
                                    this.f18725b |= 16;
                                    this.f18731h = lVar.r();
                                } else if (iK != 66) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    ByteString byteStringR2 = lVar.r();
                                    this.f18725b |= 32;
                                    this.f18732i = byteStringR2;
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
                        this.f18726c = DesugarCollections.unmodifiableList(this.f18726c);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.f18726c = DesugarCollections.unmodifiableList(this.f18726c);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    static {
        Descriptors.Descriptor descriptor = a0().getMessageTypes().get(0);
        f18311a = descriptor;
        f18313b = new h0.f(descriptor, new String[]{"File"});
        Descriptors.Descriptor descriptor2 = a0().getMessageTypes().get(1);
        f18315c = descriptor2;
        f18317d = new h0.f(descriptor2, new String[]{"Name", "Package", "Dependency", "PublicDependency", "WeakDependency", "MessageType", "EnumType", LogConstants.KEY_SERVICE, VastExtensionParentXmlManager.f66980w, "Options", "SourceCodeInfo", "Syntax"});
        Descriptors.Descriptor descriptor3 = a0().getMessageTypes().get(2);
        f18318e = descriptor3;
        f18319f = new h0.f(descriptor3, new String[]{"Name", "Field", VastExtensionParentXmlManager.f66980w, "NestedType", "EnumType", "ExtensionRange", "OneofDecl", "Options", "ReservedRange", "ReservedName"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        f18320g = descriptor4;
        f18321h = new h0.f(descriptor4, new String[]{"Start", "End", "Options"});
        Descriptors.Descriptor descriptor5 = descriptor3.getNestedTypes().get(1);
        f18322i = descriptor5;
        f18323j = new h0.f(descriptor5, new String[]{"Start", "End"});
        Descriptors.Descriptor descriptor6 = a0().getMessageTypes().get(3);
        f18324k = descriptor6;
        f18325l = new h0.f(descriptor6, new String[]{"UninterpretedOption"});
        Descriptors.Descriptor descriptor7 = a0().getMessageTypes().get(4);
        f18326m = descriptor7;
        f18327n = new h0.f(descriptor7, new String[]{"Name", "Number", TextFieldImplKt.LabelId, "Type", "TypeName", "Extendee", "DefaultValue", "OneofIndex", "JsonName", "Options", "Proto3Optional"});
        Descriptors.Descriptor descriptor8 = a0().getMessageTypes().get(5);
        f18328o = descriptor8;
        f18329p = new h0.f(descriptor8, new String[]{"Name", "Options"});
        Descriptors.Descriptor descriptor9 = a0().getMessageTypes().get(6);
        f18330q = descriptor9;
        f18331r = new h0.f(descriptor9, new String[]{"Name", "Value", "Options", "ReservedRange", "ReservedName"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        f18332s = descriptor10;
        f18333t = new h0.f(descriptor10, new String[]{"Start", "End"});
        Descriptors.Descriptor descriptor11 = a0().getMessageTypes().get(7);
        f18334u = descriptor11;
        f18335v = new h0.f(descriptor11, new String[]{"Name", "Number", "Options"});
        Descriptors.Descriptor descriptor12 = a0().getMessageTypes().get(8);
        f18336w = descriptor12;
        f18337x = new h0.f(descriptor12, new String[]{"Name", "Method", "Options"});
        Descriptors.Descriptor descriptor13 = a0().getMessageTypes().get(9);
        f18338y = descriptor13;
        f18339z = new h0.f(descriptor13, new String[]{"Name", "InputType", "OutputType", "Options", "ClientStreaming", "ServerStreaming"});
        Descriptors.Descriptor descriptor14 = a0().getMessageTypes().get(10);
        A = descriptor14;
        B = new h0.f(descriptor14, new String[]{"JavaPackage", "JavaOuterClassname", "JavaMultipleFiles", "JavaGenerateEqualsAndHash", "JavaStringCheckUtf8", "OptimizeFor", "GoPackage", "CcGenericServices", "JavaGenericServices", "PyGenericServices", "PhpGenericServices", "Deprecated", "CcEnableArenas", "ObjcClassPrefix", "CsharpNamespace", "SwiftPrefix", "PhpClassPrefix", "PhpNamespace", "PhpMetadataNamespace", "RubyPackage", "UninterpretedOption"});
        Descriptors.Descriptor descriptor15 = a0().getMessageTypes().get(11);
        C = descriptor15;
        D = new h0.f(descriptor15, new String[]{"MessageSetWireFormat", "NoStandardDescriptorAccessor", "Deprecated", "MapEntry", "UninterpretedOption"});
        Descriptors.Descriptor descriptor16 = a0().getMessageTypes().get(12);
        E = descriptor16;
        F = new h0.f(descriptor16, new String[]{"Ctype", "Packed", "Jstype", "Lazy", "Deprecated", "Weak", "UninterpretedOption"});
        Descriptors.Descriptor descriptor17 = a0().getMessageTypes().get(13);
        G = descriptor17;
        H = new h0.f(descriptor17, new String[]{"UninterpretedOption"});
        Descriptors.Descriptor descriptor18 = a0().getMessageTypes().get(14);
        I = descriptor18;
        J = new h0.f(descriptor18, new String[]{"AllowAlias", "Deprecated", "UninterpretedOption"});
        Descriptors.Descriptor descriptor19 = a0().getMessageTypes().get(15);
        K = descriptor19;
        L = new h0.f(descriptor19, new String[]{"Deprecated", "UninterpretedOption"});
        Descriptors.Descriptor descriptor20 = a0().getMessageTypes().get(16);
        M = descriptor20;
        N = new h0.f(descriptor20, new String[]{"Deprecated", "UninterpretedOption"});
        Descriptors.Descriptor descriptor21 = a0().getMessageTypes().get(17);
        O = descriptor21;
        P = new h0.f(descriptor21, new String[]{"Deprecated", "IdempotencyLevel", "UninterpretedOption"});
        Descriptors.Descriptor descriptor22 = a0().getMessageTypes().get(18);
        Q = descriptor22;
        R = new h0.f(descriptor22, new String[]{"Name", "IdentifierValue", "PositiveIntValue", "NegativeIntValue", "DoubleValue", "StringValue", "AggregateValue"});
        Descriptors.Descriptor descriptor23 = descriptor22.getNestedTypes().get(0);
        S = descriptor23;
        T = new h0.f(descriptor23, new String[]{"NamePart", "IsExtension"});
        Descriptors.Descriptor descriptor24 = a0().getMessageTypes().get(19);
        U = descriptor24;
        V = new h0.f(descriptor24, new String[]{"Location"});
        Descriptors.Descriptor descriptor25 = descriptor24.getNestedTypes().get(0);
        W = descriptor25;
        X = new h0.f(descriptor25, new String[]{"Path", "Span", "LeadingComments", "TrailingComments", "LeadingDetachedComments"});
        Descriptors.Descriptor descriptor26 = a0().getMessageTypes().get(20);
        Y = descriptor26;
        Z = new h0.f(descriptor26, new String[]{"Annotation"});
        Descriptors.Descriptor descriptor27 = descriptor26.getNestedTypes().get(0);
        f18312a0 = descriptor27;
        f18314b0 = new h0.f(descriptor27, new String[]{"Path", "SourceFile", "Begin", "End"});
    }

    public static Descriptors.FileDescriptor a0() {
        return f18316c0;
    }
}
