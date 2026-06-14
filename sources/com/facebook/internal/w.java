package com.facebook.internal;

import java.util.EnumSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public enum w {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f19982c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final EnumSet f19983d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19988b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumSet a(long j10) {
            EnumSet result = EnumSet.noneOf(w.class);
            for (w wVar : w.f19983d) {
                if ((wVar.h() & j10) != 0) {
                    result.add(wVar);
                }
            }
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }

        private a() {
        }
    }

    static {
        EnumSet enumSetAllOf = EnumSet.allOf(w.class);
        Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        f19983d = enumSetAllOf;
    }

    w(long j10) {
        this.f19988b = j10;
    }

    public final long h() {
        return this.f19988b;
    }
}
