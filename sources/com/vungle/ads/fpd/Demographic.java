package com.vungle.ads.fpd;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.t2;
import yg.x0;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b \u0010\u0003R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u0012\u0004\b!\u0010\u0003¨\u0006$"}, d2 = {"Lcom/vungle/ads/fpd/Demographic;", "", "<init>", "()V", "", "seen1", "ageRange", "gender", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/fpd/Demographic;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/vungle/ads/fpd/LiftoffGender;", "setGender", "(Lcom/vungle/ads/fpd/LiftoffGender;)Lcom/vungle/ads/fpd/Demographic;", "age", "setAgeRange", "(I)Lcom/vungle/ads/fpd/Demographic;", "lengthOfResidence", "setLengthOfResidence", "homeValue", "setMedianHomeValueUSD", "housingCost", "setMonthlyHousingCosts", "Ljava/lang/Integer;", "getAgeRange$annotations", "getGender$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Demographic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Integer ageRange;

    @Nullable
    private Integer gender;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/Demographic$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Demographic;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Demographic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Demographic() {
    }

    private static /* synthetic */ void getAgeRange$annotations() {
    }

    private static /* synthetic */ void getGender$annotations() {
    }

    public static final void write$Self(@NotNull Demographic self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.r(serialDesc, 0) || self.ageRange != null) {
            output.h(serialDesc, 0, x0.f119093a, self.ageRange);
        }
        if (!output.r(serialDesc, 1) && self.gender == null) {
            return;
        }
        output.h(serialDesc, 1, x0.f119093a, self.gender);
    }

    @NotNull
    public final Demographic setAgeRange(int age) {
        this.ageRange = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    @NotNull
    public final Demographic setGender(@NotNull LiftoffGender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.gender = Integer.valueOf(gender.getValue());
        return this;
    }

    @NotNull
    public final Demographic setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    @NotNull
    public final Demographic setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    @NotNull
    public final Demographic setMonthlyHousingCosts(int housingCost) {
        return this;
    }

    public /* synthetic */ Demographic(int i10, Integer num, Integer num2, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i10 & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num2;
        }
    }
}
