package com.ironsource;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<AbstractC4643z> f44656a;

    /* JADX WARN: Multi-variable type inference failed */
    public pg(@NotNull List<? extends AbstractC4643z> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        this.f44656a = instances;
    }

    @NotNull
    public final List<AbstractC4643z> a() {
        return this.f44656a;
    }

    @NotNull
    public final List<AbstractC4643z> b() {
        return this.f44656a;
    }

    public final int c() {
        return this.f44656a.size();
    }

    @NotNull
    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC4643z abstractC4643z : this.f44656a) {
            arrayList.add(a(abstractC4643z.h(), abstractC4643z.r()));
        }
        return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg) && Intrinsics.areEqual(this.f44656a, ((pg) obj).f44656a);
    }

    public int hashCode() {
        return this.f44656a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WaterfallInstances(instances=" + this.f44656a + ")";
    }

    @NotNull
    public final pg a(@NotNull List<? extends AbstractC4643z> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return new pg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pg a(pg pgVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = pgVar.f44656a;
        }
        return pgVar.a(list);
    }

    private final String a(C4424m2 c4424m2, int i10) {
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), c4424m2.c()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }
}
