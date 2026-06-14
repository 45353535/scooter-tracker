package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5189j7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5422se f77503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5390r7 f77504b;

    public C5189j7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5465u7 fromModel(@NotNull C5241l7 c5241l7) {
        C5465u7 c5465u7 = new C5465u7();
        Integer num = c5241l7.f77647a;
        if (num != null) {
            c5465u7.f78330a = num.intValue();
        }
        String str = c5241l7.f77648b;
        if (str != null) {
            c5465u7.f78331b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c5241l7.f77649c;
        if (str2 != null) {
            c5465u7.f78332c = StringUtils.correctIllFormedString(str2);
        }
        Long l10 = c5241l7.f77650d;
        if (l10 != null) {
            c5465u7.f78333d = l10.longValue();
        }
        C5366q7 c5366q7 = c5241l7.f77651e;
        if (c5366q7 != null) {
            c5465u7.f78334e = this.f77504b.fromModel(c5366q7);
        }
        String str3 = c5241l7.f77652f;
        if (str3 != null) {
            c5465u7.f78335f = str3;
        }
        String str4 = c5241l7.f77653g;
        if (str4 != null) {
            c5465u7.f78336g = str4;
        }
        Long l11 = c5241l7.f77654h;
        if (l11 != null) {
            c5465u7.f78337h = l11.longValue();
        }
        Integer num2 = c5241l7.f77655i;
        if (num2 != null) {
            c5465u7.f78338i = num2.intValue();
        }
        Integer num3 = c5241l7.f77656j;
        if (num3 != null) {
            c5465u7.f78339j = num3.intValue();
        }
        String str5 = c5241l7.f77657k;
        if (str5 != null) {
            c5465u7.f78340k = str5;
        }
        N8 n82 = c5241l7.f77658l;
        if (n82 != null) {
            c5465u7.f78341l = n82.f76159a;
        }
        String str6 = c5241l7.f77659m;
        if (str6 != null) {
            c5465u7.f78342m = str6;
        }
        EnumC5218ka enumC5218ka = c5241l7.f77660n;
        if (enumC5218ka != null) {
            c5465u7.f78343n = enumC5218ka.f77603a;
        }
        EnumC5442t9 enumC5442t9 = c5241l7.f77661o;
        if (enumC5442t9 != null) {
            c5465u7.f78344o = enumC5442t9.f78288a;
        }
        Boolean bool = c5241l7.f77662p;
        if (bool != null) {
            c5465u7.f78345p = this.f77503a.fromModel(bool).intValue();
        }
        Integer num4 = c5241l7.f77663q;
        if (num4 != null) {
            c5465u7.f78346q = num4.intValue();
        }
        byte[] bArr = c5241l7.f77664r;
        if (bArr != null) {
            c5465u7.f78347r = bArr;
        }
        return c5465u7;
    }

    public C5189j7(@NotNull C5422se c5422se, @NotNull C5390r7 c5390r7) {
        this.f77503a = c5422se;
        this.f77504b = c5390r7;
    }

    public /* synthetic */ C5189j7(C5422se c5422se, C5390r7 c5390r7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C5422se() : c5422se, (i10 & 2) != 0 ? new C5390r7(null, 1, null) : c5390r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5241l7 toModel(@NotNull C5465u7 c5465u7) {
        EnumC5442t9 enumC5442t9;
        C5465u7 c5465u72 = new C5465u7();
        int i10 = c5465u7.f78330a;
        Integer numValueOf = i10 != c5465u72.f78330a ? Integer.valueOf(i10) : null;
        String str = c5465u7.f78331b;
        String str2 = !Intrinsics.areEqual(str, c5465u72.f78331b) ? str : null;
        String str3 = c5465u7.f78332c;
        String str4 = !Intrinsics.areEqual(str3, c5465u72.f78332c) ? str3 : null;
        long j10 = c5465u7.f78333d;
        Long lValueOf = j10 != c5465u72.f78333d ? Long.valueOf(j10) : null;
        C5366q7 model = this.f77504b.toModel(c5465u7.f78334e);
        String str5 = c5465u7.f78335f;
        String str6 = !Intrinsics.areEqual(str5, c5465u72.f78335f) ? str5 : null;
        String str7 = c5465u7.f78336g;
        String str8 = !Intrinsics.areEqual(str7, c5465u72.f78336g) ? str7 : null;
        long j11 = c5465u7.f78337h;
        Long lValueOf2 = Long.valueOf(j11);
        if (j11 == c5465u72.f78337h) {
            lValueOf2 = null;
        }
        int i11 = c5465u7.f78338i;
        Integer numValueOf2 = i11 != c5465u72.f78338i ? Integer.valueOf(i11) : null;
        int i12 = c5465u7.f78339j;
        Integer numValueOf3 = i12 != c5465u72.f78339j ? Integer.valueOf(i12) : null;
        String str9 = c5465u7.f78340k;
        String str10 = !Intrinsics.areEqual(str9, c5465u72.f78340k) ? str9 : null;
        int i13 = c5465u7.f78341l;
        Integer numValueOf4 = Integer.valueOf(i13);
        if (i13 == c5465u72.f78341l) {
            numValueOf4 = null;
        }
        N8 n8A = numValueOf4 != null ? N8.a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = c5465u7.f78342m;
        String str12 = !Intrinsics.areEqual(str11, c5465u72.f78342m) ? str11 : null;
        int i14 = c5465u7.f78343n;
        Integer numValueOf5 = Integer.valueOf(i14);
        if (i14 == c5465u72.f78343n) {
            numValueOf5 = null;
        }
        EnumC5218ka enumC5218kaA = numValueOf5 != null ? EnumC5218ka.a(Integer.valueOf(numValueOf5.intValue())) : null;
        int i15 = c5465u7.f78344o;
        Integer numValueOf6 = Integer.valueOf(i15);
        if (i15 == c5465u72.f78344o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            EnumC5442t9[] enumC5442t9ArrValues = EnumC5442t9.values();
            int length = enumC5442t9ArrValues.length;
            int i16 = 0;
            while (true) {
                if (i16 < length) {
                    enumC5442t9 = enumC5442t9ArrValues[i16];
                    EnumC5442t9[] enumC5442t9Arr = enumC5442t9ArrValues;
                    if (enumC5442t9.f78288a == iIntValue) {
                        break;
                    }
                    i16++;
                    enumC5442t9ArrValues = enumC5442t9Arr;
                } else {
                    enumC5442t9 = EnumC5442t9.NATIVE;
                    break;
                }
            }
        } else {
            enumC5442t9 = null;
        }
        Boolean boolA = this.f77503a.a(c5465u7.f78345p);
        int i17 = c5465u7.f78346q;
        Integer numValueOf7 = i17 != c5465u72.f78346q ? Integer.valueOf(i17) : null;
        byte[] bArr = c5465u7.f78347r;
        return new C5241l7(numValueOf, str2, str4, lValueOf, model, str6, str8, lValueOf2, numValueOf2, numValueOf3, str10, n8A, str12, enumC5218kaA, enumC5442t9, boolA, numValueOf7, !Arrays.equals(bArr, c5465u72.f78347r) ? bArr : null);
    }
}
