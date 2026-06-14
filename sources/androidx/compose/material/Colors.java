package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import io.appmetrica.analytics.impl.H2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0095\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020BH\u0016R4\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R4\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00108F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u000f\u0010\u001c\"\u0004\b\u001d\u0010\u001eR4\u0010\f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R4\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R4\u0010\n\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0018\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R4\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0018\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R4\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R4\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0018\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R4\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0018\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R4\u0010\b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0018\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/material/Colors;", "", "primary", "Landroidx/compose/ui/graphics/Color;", "primaryVariant", C4240b4.i.Y, "secondaryVariant", H2.f75840g, "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "isLight", "", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA$material_release", "(J)V", "background$delegate", "Landroidx/compose/runtime/MutableState;", "getError-0d7_KjU", "setError-8_81llA$material_release", "error$delegate", "()Z", "setLight$material_release", "(Z)V", "isLight$delegate", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material_release", "onBackground$delegate", "getOnError-0d7_KjU", "setOnError-8_81llA$material_release", "onError$delegate", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material_release", "onPrimary$delegate", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material_release", "onSecondary$delegate", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material_release", "onSurface$delegate", "getPrimary-0d7_KjU", "setPrimary-8_81llA$material_release", "primary$delegate", "getPrimaryVariant-0d7_KjU", "setPrimaryVariant-8_81llA$material_release", "primaryVariant$delegate", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material_release", "secondary$delegate", "getSecondaryVariant-0d7_KjU", "setSecondaryVariant-8_81llA$material_release", "secondaryVariant$delegate", "getSurface-0d7_KjU", "setSurface-8_81llA$material_release", "surface$delegate", MenuActionType.COPY, "copy-pvPzIIM", "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "toString", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Colors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: background$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState background;

    /* JADX INFO: renamed from: error$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState error;

    /* JADX INFO: renamed from: isLight$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isLight;

    /* JADX INFO: renamed from: onBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState onBackground;

    /* JADX INFO: renamed from: onError$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState onError;

    /* JADX INFO: renamed from: onPrimary$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState onPrimary;

    /* JADX INFO: renamed from: onSecondary$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState onSecondary;

    /* JADX INFO: renamed from: onSurface$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState onSurface;

    /* JADX INFO: renamed from: primary$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState primary;

    /* JADX INFO: renamed from: primaryVariant$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState primaryVariant;

    /* JADX INFO: renamed from: secondary$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState secondary;

    /* JADX INFO: renamed from: secondaryVariant$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState secondaryVariant;

    /* JADX INFO: renamed from: surface$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState surface;

    public /* synthetic */ Colors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-pvPzIIM, reason: not valid java name */
    public final Colors m954copypvPzIIM(long primary, long primaryVariant, long secondary, long secondaryVariant, long background, long surface, long error, long onPrimary, long onSecondary, long onBackground, long onSurface, long onError, boolean isLight) {
        return new Colors(primary, primaryVariant, secondary, secondaryVariant, background, surface, error, onPrimary, onSecondary, onBackground, onSurface, onError, isLight, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m955getBackground0d7_KjU() {
        return ((Color) this.background.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m956getError0d7_KjU() {
        return ((Color) this.error.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m957getOnBackground0d7_KjU() {
        return ((Color) this.onBackground.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m958getOnError0d7_KjU() {
        return ((Color) this.onError.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m959getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m960getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m961getOnSurface0d7_KjU() {
        return ((Color) this.onSurface.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m962getPrimary0d7_KjU() {
        return ((Color) this.primary.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPrimaryVariant-0d7_KjU, reason: not valid java name */
    public final long m963getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m964getSecondary0d7_KjU() {
        return ((Color) this.secondary.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSecondaryVariant-0d7_KjU, reason: not valid java name */
    public final long m965getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m966getSurface0d7_KjU() {
        return ((Color) this.surface.getValue()).m1614unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLight() {
        return ((Boolean) this.isLight.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: setBackground-8_81llA$material_release, reason: not valid java name */
    public final void m967setBackground8_81llA$material_release(long j10) {
        this.background.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setError-8_81llA$material_release, reason: not valid java name */
    public final void m968setError8_81llA$material_release(long j10) {
        this.error.setValue(Color.m1594boximpl(j10));
    }

    public final void setLight$material_release(boolean z10) {
        this.isLight.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: setOnBackground-8_81llA$material_release, reason: not valid java name */
    public final void m969setOnBackground8_81llA$material_release(long j10) {
        this.onBackground.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnError-8_81llA$material_release, reason: not valid java name */
    public final void m970setOnError8_81llA$material_release(long j10) {
        this.onError.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m971setOnPrimary8_81llA$material_release(long j10) {
        this.onPrimary.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m972setOnSecondary8_81llA$material_release(long j10) {
        this.onSecondary.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnSurface-8_81llA$material_release, reason: not valid java name */
    public final void m973setOnSurface8_81llA$material_release(long j10) {
        this.onSurface.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m974setPrimary8_81llA$material_release(long j10) {
        this.primary.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setPrimaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m975setPrimaryVariant8_81llA$material_release(long j10) {
        this.primaryVariant.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m976setSecondary8_81llA$material_release(long j10) {
        this.secondary.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setSecondaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m977setSecondaryVariant8_81llA$material_release(long j10) {
        this.secondaryVariant.setValue(Color.m1594boximpl(j10));
    }

    /* JADX INFO: renamed from: setSurface-8_81llA$material_release, reason: not valid java name */
    public final void m978setSurface8_81llA$material_release(long j10) {
        this.surface.setValue(Color.m1594boximpl(j10));
    }

    @NotNull
    public String toString() {
        return "Colors(primary=" + ((Object) Color.m1612toStringimpl(m962getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m1612toStringimpl(m963getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m1612toStringimpl(m964getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m1612toStringimpl(m965getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m1612toStringimpl(m955getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m1612toStringimpl(m966getSurface0d7_KjU())) + ", error=" + ((Object) Color.m1612toStringimpl(m956getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m1612toStringimpl(m959getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m1612toStringimpl(m960getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m1612toStringimpl(m957getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m1612toStringimpl(m961getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m1612toStringimpl(m958getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }

    private Colors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10) {
        this.primary = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.background = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.surface = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.error = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j20), SnapshotStateKt.structuralEqualityPolicy());
        this.onError = SnapshotStateKt.mutableStateOf(Color.m1594boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z10), SnapshotStateKt.structuralEqualityPolicy());
    }
}
