package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class JvmProtoBufUtil {

    @NotNull
    private static final ExtensionRegistryLite EXTENSION_REGISTRY;

    @NotNull
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    static {
        ExtensionRegistryLite extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
        Intrinsics.checkNotNullExpressionValue(extensionRegistryLiteNewInstance, "apply(...)");
        EXTENSION_REGISTRY = extensionRegistryLiteNewInstance;
    }

    private JvmProtoBufUtil() {
    }

    public static /* synthetic */ JvmMemberSignature.Field getJvmFieldSignature$default(JvmProtoBufUtil jvmProtoBufUtil, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z10);
    }

    public static final boolean isMovedFromInterfaceCompanion(@NotNull ProtoBuf.Property proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Flags.BooleanFlagField is_moved_from_interface_companion = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object extension = proto.getExtension(JvmProtoBuf.flags);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        Boolean bool = is_moved_from_interface_companion.get(((Number) extension).intValue());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    private final String mapTypeDefault(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.hasClassName()) {
            return ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName()));
        }
        return null;
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(@NotNull String[] data, @NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bArrDecodeBytes = BitEncoding.decodeBytes(data);
        Intrinsics.checkNotNullExpressionValue(bArrDecodeBytes, "decodeBytes(...)");
        return readClassDataFrom(bArrDecodeBytes, strings);
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom(@NotNull String[] data, @NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.decodeBytes(data));
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strings), ProtoBuf.Function.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    private final JvmNameResolver readNameResolver(InputStream inputStream, String[] strArr) throws IOException {
        JvmProtoBuf.StringTableTypes delimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, EXTENSION_REGISTRY);
        Intrinsics.checkNotNullExpressionValue(delimitedFrom, "parseDelimitedFrom(...)");
        return new JvmNameResolver(delimitedFrom, strArr);
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(@NotNull String[] data, @NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bArrDecodeBytes = BitEncoding.decodeBytes(data);
        Intrinsics.checkNotNullExpressionValue(bArrDecodeBytes, "decodeBytes(...)");
        return readPackageDataFrom(bArrDecodeBytes, strings);
    }

    @NotNull
    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return EXTENSION_REGISTRY;
    }

    @Nullable
    public final JvmMemberSignature.Method getJvmConstructorSignature(@NotNull ProtoBuf.Constructor proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> constructorSignature = JvmProtoBuf.constructorSignature;
        Intrinsics.checkNotNullExpressionValue(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(proto, constructorSignature);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                Intrinsics.checkNotNull(valueParameter);
                String strMapTypeDefault = jvmProtoBufUtil.mapTypeDefault(ProtoTypeTableUtilKt.type(valueParameter, typeTable), nameResolver);
                if (strMapTypeDefault == null) {
                    return null;
                }
                arrayList.add(strMapTypeDefault);
            }
            strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strJoinToString$default = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(string, strJoinToString$default);
    }

    @Nullable
    public final JvmMemberSignature.Field getJvmFieldSignature(@NotNull ProtoBuf.Property proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, boolean z10) {
        String strMapTypeDefault;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z10) {
            return null;
        }
        int name = (field == null || !field.hasName()) ? proto.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            strMapTypeDefault = mapTypeDefault(ProtoTypeTableUtilKt.returnType(proto, typeTable), nameResolver);
            if (strMapTypeDefault == null) {
                return null;
            }
        } else {
            strMapTypeDefault = nameResolver.getString(field.getDesc());
        }
        return new JvmMemberSignature.Field(nameResolver.getString(name), strMapTypeDefault);
    }

    @Nullable
    public final JvmMemberSignature.Method getJvmMethodSignature(@NotNull ProtoBuf.Function proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        String string;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> methodSignature = JvmProtoBuf.methodSignature;
        Intrinsics.checkNotNullExpressionValue(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(proto, methodSignature);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? proto.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List listListOfNotNull = CollectionsKt.listOfNotNull(ProtoTypeTableUtilKt.receiverType(proto, typeTable));
            List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                Intrinsics.checkNotNull(valueParameter);
                arrayList.add(ProtoTypeTableUtilKt.type(valueParameter, typeTable));
            }
            List listPlus = CollectionsKt.plus((Collection) listListOfNotNull, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
            Iterator it = listPlus.iterator();
            while (it.hasNext()) {
                String strMapTypeDefault = INSTANCE.mapTypeDefault((ProtoBuf.Type) it.next(), nameResolver);
                if (strMapTypeDefault == null) {
                    return null;
                }
                arrayList2.add(strMapTypeDefault);
            }
            String strMapTypeDefault2 = mapTypeDefault(ProtoTypeTableUtilKt.returnType(proto, typeTable), nameResolver);
            if (strMapTypeDefault2 == null) {
                return null;
            }
            string = CollectionsKt.joinToString$default(arrayList2, "", "(", ")", 0, null, null, 56, null) + strMapTypeDefault2;
        } else {
            string = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(nameResolver.getString(name), string);
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(@NotNull byte[] bytes, @NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strings), ProtoBuf.Class.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(@NotNull byte[] bytes, @NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strings), ProtoBuf.Package.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }
}
