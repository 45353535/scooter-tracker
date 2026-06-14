package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5390r7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5422se f78123a;

    public C5390r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5490v7 fromModel(@NotNull C5366q7 c5366q7) {
        C5490v7 c5490v7 = new C5490v7();
        Boolean bool = c5366q7.f78036a;
        if (bool != null) {
            c5490v7.f78428a = this.f78123a.fromModel(bool).intValue();
        }
        Double d10 = c5366q7.f78038c;
        if (d10 != null) {
            c5490v7.f78430c = d10.doubleValue();
        }
        Double d11 = c5366q7.f78037b;
        if (d11 != null) {
            c5490v7.f78429b = d11.doubleValue();
        }
        Long l10 = c5366q7.f78043h;
        if (l10 != null) {
            c5490v7.f78435h = l10.longValue();
        }
        Integer num = c5366q7.f78041f;
        if (num != null) {
            c5490v7.f78433f = num.intValue();
        }
        Integer num2 = c5366q7.f78040e;
        if (num2 != null) {
            c5490v7.f78432e = num2.intValue();
        }
        Integer num3 = c5366q7.f78042g;
        if (num3 != null) {
            c5490v7.f78434g = num3.intValue();
        }
        Integer num4 = c5366q7.f78039d;
        if (num4 != null) {
            c5490v7.f78431d = num4.intValue();
        }
        String str = c5366q7.f78044i;
        if (str != null) {
            c5490v7.f78436i = str;
        }
        String str2 = c5366q7.f78045j;
        if (str2 != null) {
            c5490v7.f78437j = str2;
        }
        return c5490v7;
    }

    public C5390r7(@NotNull C5422se c5422se) {
        this.f78123a = c5422se;
    }

    public /* synthetic */ C5390r7(C5422se c5422se, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C5422se() : c5422se);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5366q7 toModel(@Nullable C5490v7 c5490v7) {
        if (c5490v7 == null) {
            return new C5366q7(null, null, null, null, null, null, null, null, null, null);
        }
        C5490v7 c5490v72 = new C5490v7();
        Boolean boolA = this.f78123a.a(c5490v7.f78428a);
        double d10 = c5490v7.f78430c;
        Double dValueOf = Double.valueOf(d10);
        if (d10 == c5490v72.f78430c) {
            dValueOf = null;
        }
        double d11 = c5490v7.f78429b;
        Double dValueOf2 = !(d11 == c5490v72.f78429b) ? Double.valueOf(d11) : null;
        long j10 = c5490v7.f78435h;
        Long lValueOf = j10 != c5490v72.f78435h ? Long.valueOf(j10) : null;
        int i10 = c5490v7.f78433f;
        Integer numValueOf = i10 != c5490v72.f78433f ? Integer.valueOf(i10) : null;
        int i11 = c5490v7.f78432e;
        Integer numValueOf2 = i11 != c5490v72.f78432e ? Integer.valueOf(i11) : null;
        int i12 = c5490v7.f78434g;
        Integer numValueOf3 = i12 != c5490v72.f78434g ? Integer.valueOf(i12) : null;
        int i13 = c5490v7.f78431d;
        Integer numValueOf4 = i13 != c5490v72.f78431d ? Integer.valueOf(i13) : null;
        String str = c5490v7.f78436i;
        String str2 = !Intrinsics.areEqual(str, c5490v72.f78436i) ? str : null;
        String str3 = c5490v7.f78437j;
        return new C5366q7(boolA, dValueOf2, dValueOf, numValueOf4, numValueOf2, numValueOf, numValueOf3, lValueOf, str2, !Intrinsics.areEqual(str3, c5490v72.f78437j) ? str3 : null);
    }
}
