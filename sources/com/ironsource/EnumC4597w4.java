package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public enum EnumC4597w4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f45705b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f45711a;

    /* JADX INFO: renamed from: com.ironsource.w4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4597w4 a(@Nullable String str) {
            EnumC4597w4 enumC4597w4;
            EnumC4597w4[] enumC4597w4ArrValues = EnumC4597w4.values();
            int length = enumC4597w4ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    enumC4597w4 = null;
                    break;
                }
                enumC4597w4 = enumC4597w4ArrValues[i10];
                if (Intrinsics.areEqual(enumC4597w4.b(), str)) {
                    break;
                }
                i10++;
            }
            return enumC4597w4 == null ? EnumC4597w4.NONE : enumC4597w4;
        }

        private a() {
        }
    }

    EnumC4597w4(String str) {
        this.f45711a = str;
    }

    @NotNull
    public final String b() {
        return this.f45711a;
    }

    @NotNull
    public static final EnumC4597w4 a(@Nullable String str) {
        return f45705b.a(str);
    }
}
