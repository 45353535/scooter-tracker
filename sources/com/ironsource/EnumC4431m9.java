package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public enum EnumC4431m9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f43719b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43724a;

    /* JADX INFO: renamed from: com.ironsource.m9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4431m9 a(int i10) {
            EnumC4431m9 enumC4431m9;
            EnumC4431m9[] enumC4431m9ArrValues = EnumC4431m9.values();
            int length = enumC4431m9ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC4431m9 = null;
                    break;
                }
                enumC4431m9 = enumC4431m9ArrValues[i11];
                if (enumC4431m9.f43724a == i10) {
                    break;
                }
                i11++;
            }
            return enumC4431m9 == null ? EnumC4431m9.NotSupported : enumC4431m9;
        }

        private a() {
        }
    }

    EnumC4431m9(int i10) {
        this.f43724a = i10;
    }

    public final int b() {
        return this.f43724a;
    }

    public final boolean b(@NotNull EnumC4431m9 instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.f43724a;
    }
}
