package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FqNameUnsafe {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Name ROOT_NAME;

    @NotNull
    private static final Pattern SPLIT_BY_DOTS;

    @NotNull
    private final String fqName;

    @Nullable
    private transient FqNameUnsafe parent;

    @Nullable
    private transient FqName safe;

    @Nullable
    private transient Name shortName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FqNameUnsafe topLevel(@NotNull Name shortName) {
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            String strAsString = shortName.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            return new FqNameUnsafe(strAsString, FqName.ROOT.toUnsafe(), shortName, null);
        }

        private Companion() {
        }
    }

    static {
        Name nameSpecial = Name.special("<root>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(...)");
        ROOT_NAME = nameSpecial;
        Pattern patternCompile = Pattern.compile("\\.");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        SPLIT_BY_DOTS = patternCompile;
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    private final void compute() {
        int iIndexOfLastDotWithBackticksSupport = indexOfLastDotWithBackticksSupport(this.fqName);
        if (iIndexOfLastDotWithBackticksSupport < 0) {
            this.shortName = Name.guessByFirstCharacter(this.fqName);
            this.parent = FqName.ROOT.toUnsafe();
            return;
        }
        String strSubstring = this.fqName.substring(iIndexOfLastDotWithBackticksSupport + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        this.shortName = Name.guessByFirstCharacter(strSubstring);
        String strSubstring2 = this.fqName.substring(0, iIndexOfLastDotWithBackticksSupport);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        this.parent = new FqNameUnsafe(strSubstring2);
    }

    private final int indexOfLastDotWithBackticksSupport(String str) {
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z10) {
                return length;
            }
            if (cCharAt == '`') {
                z10 = !z10;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List<Name> pathSegments$collectSegmentsOf(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.isRoot()) {
            return new ArrayList();
        }
        List<Name> listPathSegments$collectSegmentsOf = pathSegments$collectSegmentsOf(fqNameUnsafe.parent());
        listPathSegments$collectSegmentsOf.add(fqNameUnsafe.shortName());
        return listPathSegments$collectSegmentsOf;
    }

    @NotNull
    public final String asString() {
        return this.fqName;
    }

    @NotNull
    public final FqNameUnsafe child(@NotNull Name name) {
        String strAsString;
        Intrinsics.checkNotNullParameter(name, "name");
        if (isRoot()) {
            strAsString = name.asString();
        } else {
            strAsString = this.fqName + '.' + name.asString();
        }
        Intrinsics.checkNotNull(strAsString);
        return new FqNameUnsafe(strAsString, this, name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && Intrinsics.areEqual(this.fqName, ((FqNameUnsafe) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.length() == 0;
    }

    public final boolean isSafe() {
        return this.safe != null || StringsKt.u0(asString(), '<', 0, false, 6, null) < 0;
    }

    @NotNull
    public final FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.parent;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        compute();
        FqNameUnsafe fqNameUnsafe2 = this.parent;
        Intrinsics.checkNotNull(fqNameUnsafe2);
        return fqNameUnsafe2;
    }

    @NotNull
    public final List<Name> pathSegments() {
        return pathSegments$collectSegmentsOf(this);
    }

    @NotNull
    public final Name shortName() {
        Name name = this.shortName;
        if (name != null) {
            return name;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        compute();
        Name name2 = this.shortName;
        Intrinsics.checkNotNull(name2);
        return name2;
    }

    @NotNull
    public final Name shortNameOrSpecial() {
        return isRoot() ? ROOT_NAME : shortName();
    }

    public final boolean startsWith(@NotNull Name segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (isRoot()) {
            return false;
        }
        int iU0 = StringsKt.u0(this.fqName, '.', 0, false, 6, null);
        if (iU0 == -1) {
            iU0 = this.fqName.length();
        }
        int i10 = iU0;
        String strAsString = segment.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return i10 == strAsString.length() && StringsKt.R(this.fqName, 0, strAsString, 0, i10, false, 16, null);
    }

    @NotNull
    public final FqName toSafe() {
        FqName fqName = this.safe;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.safe = fqName2;
        return fqName2;
    }

    @NotNull
    public String toString() {
        if (!isRoot()) {
            return this.fqName;
        }
        String strAsString = ROOT_NAME.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }

    public FqNameUnsafe(@NotNull String fqName, @NotNull FqName safe) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(safe, "safe");
        this.fqName = fqName;
        this.safe = safe;
    }

    public FqNameUnsafe(@NotNull String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = fqName;
    }

    private FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.fqName = str;
        this.parent = fqNameUnsafe;
        this.shortName = name;
    }
}
