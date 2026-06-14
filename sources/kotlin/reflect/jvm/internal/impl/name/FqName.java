package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FqName {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final FqName ROOT = new FqName("");

    @NotNull
    private final FqNameUnsafe fqName;

    @Nullable
    private transient FqName parent;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FqName topLevel(@NotNull Name shortName) {
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            return new FqName(FqNameUnsafe.Companion.topLevel(shortName));
        }

        private Companion() {
        }
    }

    public FqName(@NotNull String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = new FqNameUnsafe(fqName, this);
    }

    @NotNull
    public final String asString() {
        return this.fqName.asString();
    }

    @NotNull
    public final FqName child(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new FqName(this.fqName.child(name), this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && Intrinsics.areEqual(this.fqName, ((FqName) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.isRoot();
    }

    @NotNull
    public final FqName parent() {
        FqName fqName = this.parent;
        if (fqName != null) {
            return fqName;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        FqName fqName2 = new FqName(this.fqName.parent());
        this.parent = fqName2;
        return fqName2;
    }

    @NotNull
    public final List<Name> pathSegments() {
        return this.fqName.pathSegments();
    }

    @NotNull
    public final Name shortName() {
        return this.fqName.shortName();
    }

    @NotNull
    public final Name shortNameOrSpecial() {
        return this.fqName.shortNameOrSpecial();
    }

    public final boolean startsWith(@NotNull Name segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        return this.fqName.startsWith(segment);
    }

    @NotNull
    public String toString() {
        return this.fqName.toString();
    }

    @NotNull
    public final FqNameUnsafe toUnsafe() {
        return this.fqName;
    }

    public FqName(@NotNull FqNameUnsafe fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = fqName;
    }

    private FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.fqName = fqNameUnsafe;
        this.parent = fqName;
    }
}
