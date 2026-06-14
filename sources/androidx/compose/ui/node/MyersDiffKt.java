package androidx.compose.ui.node;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0013\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a]\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0014H\u0000\u001a]\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0016\u001aU\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00142\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"applyDiff", "", "oldSize", "", "newSize", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", ToolBar.BACKWARD, "", "oldStart", "oldEnd", "newStart", "newEnd", "cb", ToolBar.FORWARD, "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MyersDiffKt {
    private static final void applyDiff(int i10, int i11, IntStack intStack, DiffCallback diffCallback) {
        while (intStack.isNotEmpty()) {
            int iPop = intStack.pop();
            int iPop2 = intStack.pop();
            int iPop3 = intStack.pop();
            while (i10 > iPop3) {
                i10--;
                diffCallback.remove(i10);
            }
            while (i11 > iPop2) {
                i11--;
                diffCallback.insert(i10, i11);
            }
            while (true) {
                int i12 = iPop - 1;
                if (iPop > 0) {
                    i10--;
                    i11--;
                    diffCallback.same(i10, i11);
                    iPop = i12;
                }
            }
        }
        while (i10 > 0) {
            i10--;
            diffCallback.remove(i10);
        }
        while (i11 > 0) {
            i11--;
            diffCallback.insert(i10, i11);
        }
    }

    /* JADX INFO: renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m3158backward4l5_RBY(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iM3091getimpl;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = i17 % 2 == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && CenteredArray.m3091getimpl(iArr2, i19 + 1) < CenteredArray.m3091getimpl(iArr2, i19 - 1))) {
                iM3091getimpl = CenteredArray.m3091getimpl(iArr2, i19 + 1);
                i15 = iM3091getimpl;
            } else {
                iM3091getimpl = CenteredArray.m3091getimpl(iArr2, i19 - 1);
                i15 = iM3091getimpl - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = (i14 == 0 || i15 != iM3091getimpl) ? i20 : i20 + 1;
            while (i15 > i10 && i20 > i12) {
                if (!diffCallback.areItemsTheSame(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            CenteredArray.m3094setimpl(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (CenteredArray.m3091getimpl(iArr, i16) >= i15) {
                    fillSnake(i15, i20, iM3091getimpl, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i10, int i11, DiffCallback diffCallback) {
        int i12 = ((i10 + i11) + 1) / 2;
        IntStack intStack = new IntStack(i12 * 3);
        IntStack intStack2 = new IntStack(i12 * 4);
        intStack2.pushRange(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrM3088constructorimpl = CenteredArray.m3088constructorimpl(new int[i13]);
        int[] iArrM3088constructorimpl2 = CenteredArray.m3088constructorimpl(new int[i13]);
        int[] iArrM3254constructorimpl = Snake.m3254constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            DiffCallback diffCallback2 = diffCallback;
            if (m3160midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback2, iArrM3088constructorimpl, iArrM3088constructorimpl2, iArrM3254constructorimpl)) {
                if (Snake.m3257getDiagonalSizeimpl(iArrM3254constructorimpl) > 0) {
                    Snake.m3252addDiagonalToStackimpl(iArrM3254constructorimpl, intStack);
                }
                intStack2.pushRange(iPop4, Snake.m3262getStartXimpl(iArrM3254constructorimpl), iPop2, Snake.m3263getStartYimpl(iArrM3254constructorimpl));
                intStack2.pushRange(Snake.m3258getEndXimpl(iArrM3254constructorimpl), iPop3, Snake.m3259getEndYimpl(iArrM3254constructorimpl), iPop);
            }
            diffCallback = diffCallback2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i10, i11, 0);
        return intStack;
    }

    public static final void executeDiff(int i10, int i11, @NotNull DiffCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        applyDiff(i10, i11, calculateDiff(i10, i11, callback), callback);
    }

    public static final void fillSnake(int i10, int i11, int i12, int i13, boolean z10, @NotNull int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data[0] = i10;
        data[1] = i11;
        data[2] = i12;
        data[3] = i13;
        data[4] = z10 ? 1 : 0;
    }

    /* JADX INFO: renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m3159forward4l5_RBY(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iM3091getimpl;
        int i15;
        int i16 = (i11 - i10) - (i13 - i12);
        boolean z10 = Math.abs(i16) % 2 == 1;
        int i17 = -i14;
        for (int i18 = i17; i18 <= i14; i18 += 2) {
            if (i18 == i17 || (i18 != i14 && CenteredArray.m3091getimpl(iArr, i18 + 1) > CenteredArray.m3091getimpl(iArr, i18 - 1))) {
                iM3091getimpl = CenteredArray.m3091getimpl(iArr, i18 + 1);
                i15 = iM3091getimpl;
            } else {
                iM3091getimpl = CenteredArray.m3091getimpl(iArr, i18 - 1);
                i15 = iM3091getimpl + 1;
            }
            int i19 = (i12 + (i15 - i10)) - i18;
            int i20 = (i14 == 0 || i15 != iM3091getimpl) ? i19 : i19 - 1;
            while (i15 < i11 && i19 < i13) {
                if (!diffCallback.areItemsTheSame(i15, i19)) {
                    break;
                }
                i15++;
                i19++;
            }
            CenteredArray.m3094setimpl(iArr, i18, i15);
            if (z10) {
                int i21 = i16 - i18;
                if (i21 >= i17 + 1 && i21 <= i14 - 1) {
                    if (CenteredArray.m3091getimpl(iArr2, i21) <= i15) {
                        fillSnake(iM3091getimpl, i20, i15, i19, false, iArr3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m3160midPointq5eDKzI(int i10, int i11, int i12, int i13, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m3094setimpl(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            CenteredArray.m3094setimpl(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (m3159forward4l5_RBY(i10, i11, i12, i13, diffCallback, iArr4, iArr5, i17, iArr3) || m3158backward4l5_RBY(i10, i11, i12, i13, diffCallback, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i17++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
