package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public enum EnumC4380j9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f43409b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43413a;

    /* JADX INFO: renamed from: com.ironsource.j9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4380j9 a(int i10) {
            EnumC4380j9 enumC4380j9;
            EnumC4380j9[] enumC4380j9ArrValues = EnumC4380j9.values();
            int length = enumC4380j9ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC4380j9 = null;
                    break;
                }
                enumC4380j9 = enumC4380j9ArrValues[i11];
                if (enumC4380j9.b() == i10) {
                    break;
                }
                i11++;
            }
            return enumC4380j9 == null ? EnumC4380j9.APP_ACTIVITY : enumC4380j9;
        }

        private a() {
        }
    }

    EnumC4380j9(int i10) {
        this.f43413a = i10;
    }

    public final int b() {
        return this.f43413a;
    }
}
