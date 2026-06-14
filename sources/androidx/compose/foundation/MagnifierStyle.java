package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.webkit.Profile;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB<\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\nB:\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u001f\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/MagnifierStyle;", "", "size", "Landroidx/compose/ui/unit/DpSize;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "", "fishEyeEnabled", "(JFFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "useTextDefault", "(ZJFFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClippingEnabled$foundation_release", "()Z", "getCornerRadius-D9Ej5fM$foundation_release", "()F", "F", "getElevation-D9Ej5fM$foundation_release", "getFishEyeEnabled$foundation_release", "isSupported", "getSize-MYxV2XQ$foundation_release", "()J", "J", "getUseTextDefault$foundation_release", "equals", "other", "hashCode", "", "toString", "", y.f66058y, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MagnifierStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MagnifierStyle Default;

    @NotNull
    private static final MagnifierStyle TextDefault;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final boolean fishEyeEnabled;
    private final long size;
    private final boolean useTextDefault;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/MagnifierStyle$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/foundation/MagnifierStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/MagnifierStyle;", "TextDefault", "getTextDefault$annotations", "getTextDefault", "isStyleSupported", "", "style", "sdkVersion", "", "isStyleSupported$foundation_release", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getDefault$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getTextDefault$annotations() {
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(Companion companion, MagnifierStyle magnifierStyle, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = Build.VERSION.SDK_INT;
            }
            return companion.isStyleSupported$foundation_release(magnifierStyle, i10);
        }

        @NotNull
        public final MagnifierStyle getDefault() {
            return MagnifierStyle.Default;
        }

        @NotNull
        public final MagnifierStyle getTextDefault() {
            return MagnifierStyle.TextDefault;
        }

        public final boolean isStyleSupported$foundation_release(@NotNull MagnifierStyle style, int sdkVersion) {
            Intrinsics.checkNotNullParameter(style, "style");
            if (MagnifierKt.isPlatformMagnifierSupported(sdkVersion) && !style.getFishEyeEnabled()) {
                return style.getUseTextDefault() || Intrinsics.areEqual(style, getDefault()) || sdkVersion >= 29;
            }
            return false;
        }

        private Companion() {
        }
    }

    static {
        MagnifierStyle magnifierStyle = new MagnifierStyle(0L, 0.0f, 0.0f, false, false, 31, (DefaultConstructorMarker) null);
        Default = magnifierStyle;
        TextDefault = new MagnifierStyle(true, magnifierStyle.size, magnifierStyle.cornerRadius, magnifierStyle.elevation, magnifierStyle.clippingEnabled, magnifierStyle.fishEyeEnabled, (DefaultConstructorMarker) null);
    }

    @ExperimentalFoundationApi
    public /* synthetic */ MagnifierStyle(long j10, float f10, float f11, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, f10, f11, z10, z11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnifierStyle)) {
            return false;
        }
        MagnifierStyle magnifierStyle = (MagnifierStyle) other;
        return this.useTextDefault == magnifierStyle.useTextDefault && DpSize.m4046equalsimpl0(this.size, magnifierStyle.size) && Dp.m3956equalsimpl0(this.cornerRadius, magnifierStyle.cornerRadius) && Dp.m3956equalsimpl0(this.elevation, magnifierStyle.elevation) && this.clippingEnabled == magnifierStyle.clippingEnabled && this.fishEyeEnabled == magnifierStyle.fishEyeEnabled;
    }

    /* JADX INFO: renamed from: getClippingEnabled$foundation_release, reason: from getter */
    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM$foundation_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM$foundation_release, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: getFishEyeEnabled$foundation_release, reason: from getter */
    public final boolean getFishEyeEnabled() {
        return this.fishEyeEnabled;
    }

    /* JADX INFO: renamed from: getSize-MYxV2XQ$foundation_release, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getUseTextDefault$foundation_release, reason: from getter */
    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public int hashCode() {
        return (((((((((c.a(this.useTextDefault) * 31) + DpSize.m4051hashCodeimpl(this.size)) * 31) + Dp.m3957hashCodeimpl(this.cornerRadius)) * 31) + Dp.m3957hashCodeimpl(this.elevation)) * 31) + c.a(this.clippingEnabled)) * 31) + c.a(this.fishEyeEnabled);
    }

    public final boolean isSupported() {
        return Companion.isStyleSupported$foundation_release$default(INSTANCE, this, 0, 2, null);
    }

    @NotNull
    public String toString() {
        if (this.useTextDefault) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) DpSize.m4056toStringimpl(this.size)) + ", cornerRadius=" + ((Object) Dp.m3962toStringimpl(this.cornerRadius)) + ", elevation=" + ((Object) Dp.m3962toStringimpl(this.elevation)) + ", clippingEnabled=" + this.clippingEnabled + ", fishEyeEnabled=" + this.fishEyeEnabled + ')';
    }

    public /* synthetic */ MagnifierStyle(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, j10, f10, f11, z11, z12);
    }

    private MagnifierStyle(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12) {
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f10;
        this.elevation = f11;
        this.clippingEnabled = z11;
        this.fishEyeEnabled = z12;
    }

    public /* synthetic */ MagnifierStyle(long j10, float f10, float f11, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DpSize.INSTANCE.m4058getUnspecifiedMYxV2XQ() : j10, (i10 & 2) != 0 ? Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM() : f10, (i10 & 4) != 0 ? Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM() : f11, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (DefaultConstructorMarker) null);
    }

    private MagnifierStyle(long j10, float f10, float f11, boolean z10, boolean z11) {
        this(false, j10, f10, f11, z10, z11, (DefaultConstructorMarker) null);
    }
}
