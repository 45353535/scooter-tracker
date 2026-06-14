package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ProtoTypeTableUtilKt {
    @Nullable
    public static final ProtoBuf.Type abbreviatedType(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.get(type.getAbbreviatedTypeId());
        }
        return null;
    }

    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Class r22, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(r22, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = r22.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = r22.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                Intrinsics.checkNotNull(num);
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @NotNull
    public static final ProtoBuf.Type expandedType(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeAlias, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            Intrinsics.checkNotNullExpressionValue(expandedType, "getExpandedType(...)");
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    @Nullable
    public static final ProtoBuf.Type flexibleUpperBound(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.get(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(@NotNull ProtoBuf.Function function) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    @Nullable
    public static final ProtoBuf.Type inlineClassUnderlyingType(@NotNull ProtoBuf.Class r12, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (r12.hasInlineClassUnderlyingType()) {
            return r12.getInlineClassUnderlyingType();
        }
        if (r12.hasInlineClassUnderlyingTypeId()) {
            return typeTable.get(r12.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type outerType(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.get(type.getOuterTypeId());
        }
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type receiverType(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type returnType(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    @NotNull
    public static final List<ProtoBuf.Type> supertypes(@NotNull ProtoBuf.Class r22, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(r22, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> supertypeList = r22.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = r22.getSupertypeIdList();
            Intrinsics.checkNotNullExpressionValue(supertypeIdList, "getSupertypeIdList(...)");
            List<Integer> list = supertypeIdList;
            supertypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                Intrinsics.checkNotNull(num);
                supertypeList.add(typeTable.get(num.intValue()));
            }
        }
        return supertypeList;
    }

    @Nullable
    public static final ProtoBuf.Type type(@NotNull ProtoBuf.Type.Argument argument, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(argument, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type underlyingType(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeAlias, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            Intrinsics.checkNotNullExpressionValue(underlyingType, "getUnderlyingType(...)");
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    @NotNull
    public static final List<ProtoBuf.Type> upperBounds(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            Intrinsics.checkNotNullExpressionValue(upperBoundIdList, "getUpperBoundIdList(...)");
            List<Integer> list = upperBoundIdList;
            upperBoundList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                Intrinsics.checkNotNull(num);
                upperBoundList.add(typeTable.get(num.intValue()));
            }
        }
        return upperBoundList;
    }

    @Nullable
    public static final ProtoBuf.Type varargElementType(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(valueParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final boolean hasReceiver(@NotNull ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    @Nullable
    public static final ProtoBuf.Type receiverType(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type type(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(valueParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    @NotNull
    public static final ProtoBuf.Type returnType(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                Intrinsics.checkNotNull(num);
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                Intrinsics.checkNotNull(num);
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }
}
