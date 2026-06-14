package kotlin.reflect.jvm.internal.impl.name;

import androidx.compose.foundation.c;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ClassId {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean isLocal;

    @NotNull
    private final FqName packageFqName;

    @NotNull
    private final FqName relativeClassName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ClassId fromString$default(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.fromString(str, z10);
        }

        @NotNull
        public final ClassId fromString(@NotNull String string, boolean z10) {
            String strW;
            String str;
            Intrinsics.checkNotNullParameter(string, "string");
            int iU0 = StringsKt.u0(string, '`', 0, false, 6, null);
            if (iU0 == -1) {
                iU0 = string.length();
            }
            int iC0 = StringsKt.C0(string, "/", iU0, false, 4, null);
            if (iC0 == -1) {
                strW = StringsKt.W(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iC0);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strV = StringsKt.V(strSubstring, IOUtils.DIR_SEPARATOR_UNIX, '.', false, 4, null);
                String strSubstring2 = string.substring(iC0 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strW = StringsKt.W(strSubstring2, "`", "", false, 4, null);
                str = strV;
            }
            return new ClassId(new FqName(str), new FqName(strW), z10);
        }

        @NotNull
        public final ClassId topLevel(@NotNull FqName topLevelFqName) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            return new ClassId(topLevelFqName.parent(), topLevelFqName.shortName());
        }

        private Companion() {
        }
    }

    public ClassId(@NotNull FqName packageFqName, @NotNull FqName relativeClassName, boolean z10) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        this.packageFqName = packageFqName;
        this.relativeClassName = relativeClassName;
        this.isLocal = z10;
        relativeClassName.isRoot();
    }

    private static final String asString$escapeSlashes(FqName fqName) {
        String strAsString = fqName.asString();
        if (!StringsKt.f0(strAsString, IOUtils.DIR_SEPARATOR_UNIX, false, 2, null)) {
            return strAsString;
        }
        return '`' + strAsString + '`';
    }

    @NotNull
    public static final ClassId topLevel(@NotNull FqName fqName) {
        return Companion.topLevel(fqName);
    }

    @NotNull
    public final FqName asSingleFqName() {
        if (this.packageFqName.isRoot()) {
            return this.relativeClassName;
        }
        return new FqName(this.packageFqName.asString() + '.' + this.relativeClassName.asString());
    }

    @NotNull
    public final String asString() {
        if (this.packageFqName.isRoot()) {
            return asString$escapeSlashes(this.relativeClassName);
        }
        return StringsKt.V(this.packageFqName.asString(), '.', IOUtils.DIR_SEPARATOR_UNIX, false, 4, null) + "/" + asString$escapeSlashes(this.relativeClassName);
    }

    @NotNull
    public final ClassId createNestedClassId(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ClassId(this.packageFqName, this.relativeClassName.child(name), this.isLocal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return Intrinsics.areEqual(this.packageFqName, classId.packageFqName) && Intrinsics.areEqual(this.relativeClassName, classId.relativeClassName) && this.isLocal == classId.isLocal;
    }

    @Nullable
    public final ClassId getOuterClassId() {
        FqName fqNameParent = this.relativeClassName.parent();
        if (fqNameParent.isRoot()) {
            return null;
        }
        return new ClassId(this.packageFqName, fqNameParent, this.isLocal);
    }

    @NotNull
    public final FqName getPackageFqName() {
        return this.packageFqName;
    }

    @NotNull
    public final FqName getRelativeClassName() {
        return this.relativeClassName;
    }

    @NotNull
    public final Name getShortClassName() {
        return this.relativeClassName.shortName();
    }

    public int hashCode() {
        return (((this.packageFqName.hashCode() * 31) + this.relativeClassName.hashCode()) * 31) + c.a(this.isLocal);
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    public final boolean isNestedClass() {
        return !this.relativeClassName.parent().isRoot();
    }

    @NotNull
    public String toString() {
        if (!this.packageFqName.isRoot()) {
            return asString();
        }
        return IOUtils.DIR_SEPARATOR_UNIX + asString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(@NotNull FqName packageFqName, @NotNull Name topLevelName) {
        this(packageFqName, FqName.Companion.topLevel(topLevelName), false);
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
    }
}
