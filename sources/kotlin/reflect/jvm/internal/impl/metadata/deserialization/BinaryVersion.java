package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;

    @NotNull
    private final int[] numbers;
    private final int patch;

    @NotNull
    private final List<Integer> rest;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BinaryVersion(@NotNull int... numbers) {
        List<Integer> listEmptyList;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.numbers = numbers;
        Integer orNull = ArraysKt.getOrNull(numbers, 0);
        this.major = orNull != null ? orNull.intValue() : -1;
        Integer orNull2 = ArraysKt.getOrNull(numbers, 1);
        this.minor = orNull2 != null ? orNull2.intValue() : -1;
        Integer orNull3 = ArraysKt.getOrNull(numbers, 2);
        this.patch = orNull3 != null ? orNull3.intValue() : -1;
        if (numbers.length <= 3) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listEmptyList = CollectionsKt.toList(ArraysKt.asList(numbers).subList(3, numbers.length));
        }
        this.rest = listEmptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual(this.rest, binaryVersion.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i10 = this.major;
        int i11 = i10 + (i10 * 31) + this.minor;
        int i12 = i11 + (i11 * 31) + this.patch;
        return i12 + (i12 * 31) + this.rest.hashCode();
    }

    public final boolean isAtLeast(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isAtLeast(version.major, version.minor, version.patch);
    }

    public final boolean isAtMost(int i10, int i11, int i12) {
        int i13 = this.major;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.minor;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.patch <= i12;
    }

    protected final boolean isCompatibleTo(@NotNull BinaryVersion ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i10 = this.major;
        return i10 == 0 ? ourVersion.major == 0 && this.minor == ourVersion.minor : i10 == ourVersion.major && this.minor <= ourVersion.minor;
    }

    @NotNull
    public final int[] toArray() {
        return this.numbers;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i10 : array) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean isAtLeast(int i10, int i11, int i12) {
        int i13 = this.major;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.minor;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.patch >= i12;
    }
}
