package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u000fB\u001b\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", y.f66058y, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class ParcelableSnapshotMutableState<T> extends MutableState<T> implements Parcelable {
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableState$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ParcelableSnapshotMutableState<Object>[] newArray(int size) {
            return new ParcelableSnapshotMutableState[size];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NotNull
        public ParcelableSnapshotMutableState<Object> createFromParcel(@NotNull Parcel parcel, @Nullable ClassLoader loader) {
            SnapshotMutationPolicy snapshotMutationPolicyNeverEqualPolicy;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (loader == null) {
                loader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
            }
            Object value = parcel.readValue(loader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                snapshotMutationPolicyNeverEqualPolicy = SnapshotStateKt.neverEqualPolicy();
            } else if (i10 == 1) {
                snapshotMutationPolicyNeverEqualPolicy = SnapshotStateKt.structuralEqualityPolicy();
            } else if (i10 == 2) {
                snapshotMutationPolicyNeverEqualPolicy = SnapshotStateKt.referentialEqualityPolicy();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(value, snapshotMutationPolicyNeverEqualPolicy);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ParcelableSnapshotMutableState<Object> createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return createFromParcel(parcel, (ClassLoader) null);
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "getCREATOR$annotations", "PolicyNeverEquals", "", "PolicyReferentialEquality", "PolicyStructuralEquality", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t10, @NotNull SnapshotMutationPolicy<T> policy) {
        super(t10, policy);
        Intrinsics.checkNotNullParameter(policy, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int i10;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(getValue());
        SnapshotMutationPolicy<T> policy = getPolicy();
        if (Intrinsics.areEqual(policy, SnapshotStateKt.neverEqualPolicy())) {
            i10 = 0;
        } else if (Intrinsics.areEqual(policy, SnapshotStateKt.structuralEqualityPolicy())) {
            i10 = 1;
        } else {
            if (!Intrinsics.areEqual(policy, SnapshotStateKt.referentialEqualityPolicy())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}
