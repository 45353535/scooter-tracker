package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public enum T7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41797b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41802a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final T7 a(@Nullable Integer num) {
            T7 t72;
            T7[] t7ArrValues = T7.values();
            int length = t7ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    t72 = null;
                    break;
                }
                t72 = t7ArrValues[i10];
                int iB = t72.b();
                if (num != null && iB == num.intValue()) {
                    break;
                }
                i10++;
            }
            return t72 == null ? T7.UnknownProvider : t72;
        }

        private a() {
        }

        @NotNull
        public final T7 a(@NotNull String dynamicDemandSourceId) {
            Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            List listSplit$default = StringsKt.split$default(dynamicDemandSourceId, new String[]{"_"}, false, 0, 6, null);
            return listSplit$default.size() < 2 ? T7.UnknownProvider : a(StringsKt.toIntOrNull((String) listSplit$default.get(1)));
        }
    }

    T7(int i10) {
        this.f41802a = i10;
    }

    public final int b() {
        return this.f41802a;
    }
}
