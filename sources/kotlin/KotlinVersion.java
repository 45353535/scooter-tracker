package kotlin;

import com.taurusx.tax.f.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lkotlin/KotlinVersion;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "versionOf", "(III)I", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "compareTo", "(Lkotlin/KotlinVersion;)I", "isAtLeast", "(II)Z", "(III)Z", "I", "getMajor", "getMinor", "getPatch", "version", y.f66058y, "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final KotlinVersion CURRENT = c.a();

    /* JADX INFO: renamed from: kotlin.KotlinVersion$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public KotlinVersion(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.version = versionOf(i10, i11, i12);
    }

    private final int versionOf(int major, int minor, int patch) {
        if (major >= 0 && major < 256 && minor >= 0 && minor < 256 && patch >= 0 && patch < 256) {
            return (major << 16) + (minor << 8) + patch;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + major + '.' + minor + '.' + patch).toString());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        KotlinVersion kotlinVersion = other instanceof KotlinVersion ? (KotlinVersion) other : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getVersion() {
        return this.version;
    }

    public final boolean isAtLeast(int major, int minor) {
        int i10 = this.major;
        if (i10 <= major) {
            return i10 == major && this.minor >= minor;
        }
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    public KotlinVersion(int i10, int i11) {
        this(i10, i11, 0);
    }

    public final boolean isAtLeast(int major, int minor, int patch) {
        int i10 = this.major;
        if (i10 > major) {
            return true;
        }
        if (i10 != major) {
            return false;
        }
        int i11 = this.minor;
        if (i11 <= minor) {
            return i11 == minor && this.patch >= patch;
        }
        return true;
    }
}
