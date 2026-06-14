package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\r\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u0088\u0001\u0004\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "", "block", "update-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "update", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SkippableUpdater<T> {

    @NotNull
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m1239boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m1240constructorimpl(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1241equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && Intrinsics.areEqual(composer, ((SkippableUpdater) obj).getComposer());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1242equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.areEqual(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1243hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1244toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m1245updateimpl(Composer composer, @NotNull Function1<? super Updater<T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(509942095);
        block.invoke(Updater.m1247boximpl(Updater.m1248constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m1241equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m1243hashCodeimpl(this.composer);
    }

    public String toString() {
        return m1244toStringimpl(this.composer);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Composer getComposer() {
        return this.composer;
    }
}
