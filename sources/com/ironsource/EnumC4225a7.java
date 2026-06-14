package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public enum EnumC4225a7 {
    SendEvent(0),
    NativeController(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42320b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42324a;

    /* JADX INFO: renamed from: com.ironsource.a7$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4225a7 a(int i10) {
            EnumC4225a7 enumC4225a7;
            EnumC4225a7[] enumC4225a7ArrValues = EnumC4225a7.values();
            int length = enumC4225a7ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC4225a7 = null;
                    break;
                }
                enumC4225a7 = enumC4225a7ArrValues[i11];
                if (enumC4225a7.b() == i10) {
                    break;
                }
                i11++;
            }
            return enumC4225a7 == null ? EnumC4225a7.SendEvent : enumC4225a7;
        }

        private a() {
        }
    }

    EnumC4225a7(int i10) {
        this.f42324a = i10;
    }

    public final int b() {
        return this.f42324a;
    }
}
