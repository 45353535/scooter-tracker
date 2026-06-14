package com.skydoves.balloon;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public enum a {
    BOTTOM,
    TOP,
    START,
    END;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0790a f63586b = new C0790a(null);

    /* JADX INFO: renamed from: com.skydoves.balloon.a$a, reason: collision with other inner class name */
    public static final class C0790a {

        /* JADX INFO: renamed from: com.skydoves.balloon.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0791a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C0790a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(a aVar, boolean z10) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            if (z10) {
                int i10 = C0791a.$EnumSwitchMapping$0[aVar.ordinal()];
                if (i10 == 1) {
                    return a.END;
                }
                if (i10 == 2) {
                    return a.START;
                }
            }
            return aVar;
        }

        private C0790a() {
        }
    }
}
