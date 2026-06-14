package com.yandex.div.core.util.mask;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/util/mask/TextDiff;", "", "", "start", "added", "removed", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStart", "getAdded", "getRemoved", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TextDiff {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int added;
    private final int removed;
    private final int start;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/util/mask/TextDiff$Companion;", "", "()V", "build", "Lcom/yandex/div/core/util/mask/TextDiff;", "left", "", "right", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextDiff build(@NotNull String left, @NotNull String right) {
            if (left.length() > right.length()) {
                TextDiff textDiffBuild = build(right, left);
                return new TextDiff(textDiffBuild.getStart(), textDiffBuild.getRemoved(), textDiffBuild.getAdded());
            }
            int length = right.length() - 1;
            int length2 = right.length() - left.length();
            int i10 = 0;
            while (i10 < length && i10 < left.length() && left.charAt(i10) == right.charAt(i10)) {
                i10++;
            }
            while (true) {
                int i11 = length - length2;
                if (i11 < i10 || left.charAt(i11) != right.charAt(length)) {
                    break;
                }
                length--;
            }
            int i12 = (length + 1) - i10;
            return new TextDiff(i10, i12, i12 - length2);
        }

        private Companion() {
        }
    }

    public TextDiff(int i10, int i11, int i12) {
        this.start = i10;
        this.added = i11;
        this.removed = i12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDiff)) {
            return false;
        }
        TextDiff textDiff = (TextDiff) other;
        return this.start == textDiff.start && this.added == textDiff.added && this.removed == textDiff.removed;
    }

    public final int getAdded() {
        return this.added;
    }

    public final int getRemoved() {
        return this.removed;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.start * 31) + this.added) * 31) + this.removed;
    }

    @NotNull
    public String toString() {
        return "TextDiff(start=" + this.start + ", added=" + this.added + ", removed=" + this.removed + ')';
    }
}
