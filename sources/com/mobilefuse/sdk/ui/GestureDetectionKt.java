package com.mobilefuse.sdk.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.material.TextFieldImplKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aV\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"SWIPE_THRESHOLD", "", "SWIPE_VELOCITY_THRESHOLD", "createGestureDetector", "Landroid/view/GestureDetector;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "onSwipeDown", "Lkotlin/Function0;", "", "onSwipeUp", "onSwipeLeft", "onSwipeRight", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class GestureDetectionKt {
    private static final int SWIPE_THRESHOLD = 150;
    private static final int SWIPE_VELOCITY_THRESHOLD = 200;

    @NotNull
    public static final GestureDetector createGestureDetector(@NotNull Context context, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function02, @Nullable final Function0<Unit> function03, @Nullable final Function0<Unit> function04) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.mobilefuse.sdk.ui.GestureDetectionKt$createGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(@Nullable MotionEvent e12, @NotNull MotionEvent e22, float velocityX, float velocityY) {
                Intrinsics.checkNotNullParameter(e22, "e2");
                if (e12 == null) {
                    return false;
                }
                float y10 = e22.getY() - e12.getY();
                float x10 = e22.getX() - e12.getX();
                if (Math.abs(x10) <= Math.abs(y10)) {
                    float fAbs = Math.abs(y10);
                    float f10 = TextFieldImplKt.AnimationDuration;
                    if (fAbs > f10 && Math.abs(velocityY) > 200) {
                        if (y10 > f10) {
                            Function0 function05 = function0;
                            if (function05 != null) {
                            }
                        } else {
                            Function0 function06 = function02;
                            if (function06 != null) {
                            }
                        }
                        return true;
                    }
                } else if (Math.abs(x10) > TextFieldImplKt.AnimationDuration && Math.abs(velocityX) > 200) {
                    if (x10 > 0) {
                        Function0 function07 = function04;
                        if (function07 != null) {
                        }
                    } else {
                        Function0 function08 = function03;
                        if (function08 != null) {
                        }
                    }
                    return true;
                }
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(@NotNull MotionEvent e10) {
                Intrinsics.checkNotNullParameter(e10, "e");
                return false;
            }
        });
    }

    public static /* synthetic */ GestureDetector createGestureDetector$default(Context context, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        if ((i10 & 4) != 0) {
            function02 = null;
        }
        if ((i10 & 8) != 0) {
            function03 = null;
        }
        if ((i10 & 16) != 0) {
            function04 = null;
        }
        return createGestureDetector(context, function0, function02, function03, function04);
    }
}
