package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.ThemeUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/core/splashscreen/SplashScreen;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "impl", "Landroidx/core/splashscreen/SplashScreen$Impl;", "setKeepOnScreenCondition", "", "condition", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "setOnExitAnimationListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "install", y.f66058y, "OnExitAnimationListener", "KeepOnScreenCondition", "Impl", "Impl31", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CustomSplashScreen"})
public final class SplashScreen {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float MASK_FACTOR = 0.6666667f;

    @NotNull
    private final Impl impl;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Companion;", "", "<init>", "()V", "MASK_FACTOR", "", "installSplashScreen", "Landroidx/core/splashscreen/SplashScreen;", "Landroid/app/Activity;", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SplashScreen installSplashScreen(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            SplashScreen splashScreen = new SplashScreen(activity, null);
            splashScreen.install();
            return splashScreen;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010-\u001a\u00020.H\u0016J\u001c\u0010/\u001a\u00020.2\n\u00100\u001a\u000601R\u0002022\u0006\u00103\u001a\u000204H\u0004J\u0010\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020$H\u0016J\u0010\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020*H\u0016J\u0018\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "finalThemeId", "", "getFinalThemeId", "()I", "setFinalThemeId", "(I)V", "backgroundResId", "getBackgroundResId", "()Ljava/lang/Integer;", "setBackgroundResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "hasBackground", "", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "splashScreenWaitPredicate", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "getSplashScreenWaitPredicate", "()Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "setSplashScreenWaitPredicate", "(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V", "animationListener", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "mSplashScreenViewProvider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "install", "", "setPostSplashScreenTheme", "currentTheme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "typedValue", "Landroid/util/TypedValue;", "setKeepOnScreenCondition", "keepOnScreenCondition", "setOnExitAnimationListener", "exitAnimationListener", "displaySplashScreenIcon", "splashScreenView", "Landroid/view/View;", "dispatchOnExitAnimation", "splashScreenViewProvider", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static class Impl {

        @NotNull
        private final Activity activity;

        @Nullable
        private OnExitAnimationListener animationListener;

        @Nullable
        private Integer backgroundColor;

        @Nullable
        private Integer backgroundResId;
        private int finalThemeId;
        private boolean hasBackground;

        @Nullable
        private Drawable icon;

        @Nullable
        private SplashScreenViewProvider mSplashScreenViewProvider;

        @NotNull
        private KeepOnScreenCondition splashScreenWaitPredicate;

        public Impl(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.splashScreenWaitPredicate = new KeepOnScreenCondition() { // from class: androidx.core.splashscreen.a
                @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
                public final boolean shouldKeepOnScreen() {
                    return SplashScreen.Impl.splashScreenWaitPredicate$lambda$0();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void dispatchOnExitAnimation$lambda$3(SplashScreenViewProvider splashScreenViewProvider, OnExitAnimationListener onExitAnimationListener) {
            splashScreenViewProvider.getView().bringToFront();
            onExitAnimationListener.onSplashScreenExit(splashScreenViewProvider);
        }

        private final void displaySplashScreenIcon(View splashScreenView, Drawable icon) {
            float dimension;
            ImageView imageView = (ImageView) splashScreenView.findViewById(R.id.splashscreen_icon_view);
            if (this.hasBackground) {
                Drawable drawable = AppCompatResources.getDrawable(imageView.getContext(), R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * SplashScreen.MASK_FACTOR;
                if (drawable != null) {
                    imageView.setBackground(new MaskedDrawable(drawable, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * SplashScreen.MASK_FACTOR;
            }
            imageView.setImageDrawable(new MaskedDrawable(icon, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean splashScreenWaitPredicate$lambda$0() {
            return false;
        }

        public final void dispatchOnExitAnimation(@NotNull final SplashScreenViewProvider splashScreenViewProvider) {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
            final OnExitAnimationListener onExitAnimationListener = this.animationListener;
            if (onExitAnimationListener == null) {
                return;
            }
            this.animationListener = null;
            splashScreenViewProvider.getView().postOnAnimation(new Runnable() { // from class: androidx.core.splashscreen.b
                @Override // java.lang.Runnable
                public final void run() {
                    SplashScreen.Impl.dispatchOnExitAnimation$lambda$3(splashScreenViewProvider, onExitAnimationListener);
                }
            });
        }

        @NotNull
        public final Activity getActivity() {
            return this.activity;
        }

        @Nullable
        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        public final Integer getBackgroundResId() {
            return this.backgroundResId;
        }

        public final int getFinalThemeId() {
            return this.finalThemeId;
        }

        public final boolean getHasBackground() {
            return this.hasBackground;
        }

        @Nullable
        public final Drawable getIcon() {
            return this.icon;
        }

        @NotNull
        public final KeepOnScreenCondition getSplashScreenWaitPredicate() {
            return this.splashScreenWaitPredicate;
        }

        public void install() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.activity.getTheme();
            if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
                this.backgroundResId = Integer.valueOf(typedValue.resourceId);
                this.backgroundColor = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.icon = AppCompatResources.getDrawable(this.activity, typedValue.resourceId);
            }
            if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
                this.hasBackground = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
            }
            Intrinsics.checkNotNull(theme);
            setPostSplashScreenTheme(theme, typedValue);
        }

        public final void setBackgroundColor(@Nullable Integer num) {
            this.backgroundColor = num;
        }

        public final void setBackgroundResId(@Nullable Integer num) {
            this.backgroundResId = num;
        }

        public final void setFinalThemeId(int i10) {
            this.finalThemeId = i10;
        }

        public final void setHasBackground(boolean z10) {
            this.hasBackground = z10;
        }

        public final void setIcon(@Nullable Drawable drawable) {
            this.icon = drawable;
        }

        public void setKeepOnScreenCondition(@NotNull KeepOnScreenCondition keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
            final View viewFindViewById = this.activity.findViewById(android.R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (this.this$0.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        return false;
                    }
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    SplashScreenViewProvider splashScreenViewProvider = this.this$0.mSplashScreenViewProvider;
                    if (splashScreenViewProvider == null) {
                        return true;
                    }
                    this.this$0.dispatchOnExitAnimation(splashScreenViewProvider);
                    return true;
                }
            });
        }

        public void setOnExitAnimationListener(@NotNull OnExitAnimationListener exitAnimationListener) {
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            this.animationListener = exitAnimationListener;
            final SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(this.activity);
            Integer num = this.backgroundResId;
            Integer num2 = this.backgroundColor;
            View view = splashScreenViewProvider.getView();
            if (num != null && num.intValue() != 0) {
                view.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                view.setBackgroundColor(num2.intValue());
            } else {
                view.setBackground(this.activity.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.icon;
            if (drawable != null) {
                displaySplashScreenIcon(view, drawable);
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    if (view2.isAttachedToWindow()) {
                        view2.removeOnLayoutChangeListener(this);
                        if (!this.this$0.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                            this.this$0.dispatchOnExitAnimation(splashScreenViewProvider);
                        } else {
                            this.this$0.mSplashScreenViewProvider = splashScreenViewProvider;
                        }
                    }
                }
            });
        }

        protected final void setPostSplashScreenTheme(@NotNull Resources.Theme currentTheme, @NotNull TypedValue typedValue) {
            Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
            Intrinsics.checkNotNullParameter(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.finalThemeId = i10;
                if (i10 != 0) {
                    this.activity.setTheme(i10);
                }
            }
        }

        public final void setSplashScreenWaitPredicate(@NotNull KeepOnScreenCondition keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "<set-?>");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(31)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001aH\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl31;", "Landroidx/core/splashscreen/SplashScreen$Impl;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setPreDrawListener", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "mDecorFitWindowInsets", "", "getMDecorFitWindowInsets", "()Z", "setMDecorFitWindowInsets", "(Z)V", "hierarchyListener", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getHierarchyListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "computeDecorFitsWindow", "child", "Landroid/window/SplashScreenView;", "install", "", "setKeepOnScreenCondition", "keepOnScreenCondition", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "setOnExitAnimationListener", "exitAnimationListener", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "applyAppSystemUiTheme", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Impl31 extends Impl {

        @NotNull
        private final ViewGroup.OnHierarchyChangeListener hierarchyListener;
        private boolean mDecorFitWindowInsets;

        @Nullable
        private ViewTreeObserver.OnPreDrawListener preDrawListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl31(@NotNull final Activity activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.mDecorFitWindowInsets = true;
            this.hierarchyListener = new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(View parent, View child) {
                    if (j.a(child)) {
                        SplashScreen.Impl31 impl31 = this.this$0;
                        impl31.setMDecorFitWindowInsets(impl31.computeDecorFitsWindow(k.a(child)));
                        View decorView = activity.getWindow().getDecorView();
                        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(View parent, View child) {
                }
            };
        }

        private final void applyAppSystemUiTheme() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = getActivity().getTheme();
            Window window = getActivity().getWindow();
            if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            View decorView = window.getDecorView();
            Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            Intrinsics.checkNotNull(theme);
            ThemeUtils.Api31.applyThemesSystemBarAppearance(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.mDecorFitWindowInsets);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setOnExitAnimationListener$lambda$0(Impl31 impl31, OnExitAnimationListener onExitAnimationListener, SplashScreenView splashScreenView) {
            Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
            if (Build.VERSION.SDK_INT < 33) {
                impl31.applyAppSystemUiTheme();
            }
            onExitAnimationListener.onSplashScreenExit(new SplashScreenViewProvider(splashScreenView, impl31.getActivity()));
        }

        public final boolean computeDecorFitsWindow(@NotNull SplashScreenView child) {
            Intrinsics.checkNotNullParameter(child, "child");
            WindowInsets windowInsetsBuild = h.a().build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsBuild, "build(...)");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        @NotNull
        public final ViewGroup.OnHierarchyChangeListener getHierarchyListener() {
            return this.hierarchyListener;
        }

        public final boolean getMDecorFitWindowInsets() {
            return this.mDecorFitWindowInsets;
        }

        @Nullable
        public final ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
            return this.preDrawListener;
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void install() {
            Resources.Theme theme = getActivity().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            setPostSplashScreenTheme(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = getActivity().getWindow().getDecorView();
                Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.hierarchyListener);
            }
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setKeepOnScreenCondition(@NotNull KeepOnScreenCondition keepOnScreenCondition) {
            Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
            setSplashScreenWaitPredicate(keepOnScreenCondition);
            final View viewFindViewById = getActivity().findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.preDrawListener != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
            }
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (this.this$0.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        return false;
                    }
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            };
            this.preDrawListener = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }

        public final void setMDecorFitWindowInsets(boolean z10) {
            this.mDecorFitWindowInsets = z10;
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setOnExitAnimationListener(@NotNull final OnExitAnimationListener exitAnimationListener) {
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            getActivity().getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: androidx.core.splashscreen.i
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    SplashScreen.Impl31.setOnExitAnimationListener$lambda$0(this.f4522a, exitAnimationListener, splashScreenView);
                }
            });
        }

        public final void setPreDrawListener(@Nullable ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.preDrawListener = onPreDrawListener;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "", "shouldKeepOnScreen", "", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface KeepOnScreenCondition {
        @MainThread
        boolean shouldKeepOnScreen();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "", "onSplashScreenExit", "", "splashScreenViewProvider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnExitAnimationListener {
        @MainThread
        void onSplashScreenExit(@NotNull SplashScreenViewProvider splashScreenViewProvider);
    }

    public /* synthetic */ SplashScreen(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void install() {
        this.impl.install();
    }

    @NotNull
    public static final SplashScreen installSplashScreen(@NotNull Activity activity) {
        return INSTANCE.installSplashScreen(activity);
    }

    public final void setKeepOnScreenCondition(@NotNull KeepOnScreenCondition condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.impl.setKeepOnScreenCondition(condition);
    }

    public final void setOnExitAnimationListener(@NotNull OnExitAnimationListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.impl.setOnExitAnimationListener(listener);
    }

    private SplashScreen(Activity activity) {
        this.impl = Build.VERSION.SDK_INT >= 31 ? new Impl31(activity) : new Impl(activity);
    }
}
