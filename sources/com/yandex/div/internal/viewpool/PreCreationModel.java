package com.yandex.div.internal.viewpool;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.e2;
import yg.t2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0018¨\u0006#"}, d2 = {"Lcom/yandex/div/internal/viewpool/PreCreationModel;", "", "", "capacity", "min", "max", "<init>", "(III)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(IIIILyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/yandex/div/internal/viewpool/PreCreationModel;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCapacity", "getMin", "getMax", y.f66058y, "$serializer", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PreCreationModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int capacity;
    private final int max;
    private final int min;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/viewpool/PreCreationModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/div/internal/viewpool/PreCreationModel;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PreCreationModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PreCreationModel(int i10, int i11, int i12) {
        this.capacity = i10;
        this.min = i11;
        this.max = i12;
    }

    public static final /* synthetic */ void write$Self(PreCreationModel self, f output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.capacity);
        if (output.r(serialDesc, 1) || self.min != 0) {
            output.o(serialDesc, 1, self.min);
        }
        if (!output.r(serialDesc, 2) && self.max == Integer.MAX_VALUE) {
            return;
        }
        output.o(serialDesc, 2, self.max);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreCreationModel)) {
            return false;
        }
        PreCreationModel preCreationModel = (PreCreationModel) other;
        return this.capacity == preCreationModel.capacity && this.min == preCreationModel.min && this.max == preCreationModel.max;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public int hashCode() {
        return (((this.capacity * 31) + this.min) * 31) + this.max;
    }

    @NotNull
    public String toString() {
        return "PreCreationModel(capacity=" + this.capacity + ", min=" + this.min + ", max=" + this.max + ')';
    }

    public /* synthetic */ PreCreationModel(int i10, int i11, int i12, int i13, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, PreCreationModel$$serializer.INSTANCE.getDescriptor());
        }
        this.capacity = i11;
        if ((i10 & 2) == 0) {
            this.min = 0;
        } else {
            this.min = i12;
        }
        if ((i10 & 4) == 0) {
            this.max = Integer.MAX_VALUE;
        } else {
            this.max = i13;
        }
    }

    public /* synthetic */ PreCreationModel(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? Integer.MAX_VALUE : i12);
    }
}
