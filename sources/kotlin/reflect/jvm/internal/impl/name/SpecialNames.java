package kotlin.reflect.jvm.internal.impl.name;

import com.taurusx.tax.f.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpecialNames {

    @NotNull
    public static final Name ANONYMOUS;

    @NotNull
    public static final FqName ANONYMOUS_FQ_NAME;

    @NotNull
    public static final Name ARRAY;

    @NotNull
    public static final Name DEFAULT_NAME_FOR_COMPANION_OBJECT;

    @NotNull
    public static final Name DESTRUCT;

    @NotNull
    public static final Name ENUM_GET_ENTRIES;

    @NotNull
    public static final Name IMPLICIT_SET_PARAMETER;

    @NotNull
    public static final Name INIT;

    @NotNull
    public static final SpecialNames INSTANCE = new SpecialNames();

    @NotNull
    public static final Name ITERATOR;

    @NotNull
    public static final Name LOCAL;

    @NotNull
    public static final Name NO_NAME_PROVIDED;

    @NotNull
    public static final Name RECEIVER;

    @NotNull
    public static final Name ROOT_PACKAGE;

    @NotNull
    public static final Name SAFE_IDENTIFIER_FOR_NO_NAME;

    @NotNull
    public static final Name THIS;

    @NotNull
    public static final Name UNARY;

    @NotNull
    public static final Name UNDERSCORE_FOR_UNUSED_VAR;

    static {
        Name nameSpecial = Name.special("<no name provided>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(...)");
        NO_NAME_PROVIDED = nameSpecial;
        Name nameSpecial2 = Name.special("<root package>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial2, "special(...)");
        ROOT_PACKAGE = nameSpecial2;
        Name nameIdentifier = Name.identifier(y.f66058y);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        DEFAULT_NAME_FOR_COMPANION_OBJECT = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        SAFE_IDENTIFIER_FOR_NO_NAME = nameIdentifier2;
        Name nameSpecial3 = Name.special("<anonymous>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial3, "special(...)");
        ANONYMOUS = nameSpecial3;
        FqName.Companion companion = FqName.Companion;
        Name nameSpecial4 = Name.special("<anonymous>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial4, "special(...)");
        ANONYMOUS_FQ_NAME = companion.topLevel(nameSpecial4);
        Name nameSpecial5 = Name.special("<unary>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial5, "special(...)");
        UNARY = nameSpecial5;
        Name nameSpecial6 = Name.special("<this>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial6, "special(...)");
        THIS = nameSpecial6;
        Name nameSpecial7 = Name.special("<init>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial7, "special(...)");
        INIT = nameSpecial7;
        Name nameSpecial8 = Name.special("<iterator>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial8, "special(...)");
        ITERATOR = nameSpecial8;
        Name nameSpecial9 = Name.special("<destruct>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial9, "special(...)");
        DESTRUCT = nameSpecial9;
        Name nameSpecial10 = Name.special("<local>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial10, "special(...)");
        LOCAL = nameSpecial10;
        Name nameSpecial11 = Name.special("<unused var>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial11, "special(...)");
        UNDERSCORE_FOR_UNUSED_VAR = nameSpecial11;
        Name nameSpecial12 = Name.special("<set-?>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial12, "special(...)");
        IMPLICIT_SET_PARAMETER = nameSpecial12;
        Name nameSpecial13 = Name.special("<array>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial13, "special(...)");
        ARRAY = nameSpecial13;
        Name nameSpecial14 = Name.special("<receiver>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial14, "special(...)");
        RECEIVER = nameSpecial14;
        Name nameSpecial15 = Name.special("<get-entries>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial15, "special(...)");
        ENUM_GET_ENTRIES = nameSpecial15;
    }

    private SpecialNames() {
    }

    @NotNull
    public static final Name safeIdentifier(@Nullable Name name) {
        return (name == null || name.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : name;
    }

    public final boolean isSafeIdentifier(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString.length() > 0 && !name.isSpecial();
    }
}
