package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PropertiesConventionUtilKt {
    @NotNull
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return JvmAbi.isGetterName(strAsString) ? CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name)) : JvmAbi.isSetterName(strAsString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    @Nullable
    public static final Name propertyNameByGetMethodName(@NotNull Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Name namePropertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(methodName, "get", false, null, 12, null);
        return namePropertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(methodName, "is", false, null, 8, null) : namePropertyNameFromAccessorMethodName$default;
    }

    @Nullable
    public static final Name propertyNameBySetMethodName(@NotNull Name methodName, boolean z10) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return propertyNameFromAccessorMethodName$default(methodName, "set", false, z10 ? "is" : null, 4, null);
    }

    private static final Name propertyNameFromAccessorMethodName(Name name, String str, boolean z10, String str2) {
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
        if (!StringsKt.a0(identifier, str, false, 2, null) || identifier.length() == str.length()) {
            return null;
        }
        char cCharAt = identifier.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Name.identifier(str2 + StringsKt.P0(identifier, str));
        }
        if (!z10) {
            return name;
        }
        String strDecapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(StringsKt.P0(identifier, str), true);
        if (Name.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
            return Name.identifier(strDecapitalizeSmartForCompiler);
        }
        return null;
    }

    static /* synthetic */ Name propertyNameFromAccessorMethodName$default(Name name, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(name, str, z10, str2);
    }

    @NotNull
    public static final List<Name> propertyNamesBySetMethodName(@NotNull Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return CollectionsKt.listOfNotNull((Object[]) new Name[]{propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true)});
    }
}
