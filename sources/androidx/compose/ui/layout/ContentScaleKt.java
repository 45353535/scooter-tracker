package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"computeFillHeight", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillHeight-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMaxDimension-iLBOSCw", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContentScaleKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m3007computeFillHeightiLBOSCw(long j10, long j11) {
        return Size.m1437getHeightimpl(j11) / Size.m1437getHeightimpl(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m3008computeFillMaxDimensioniLBOSCw(long j10, long j11) {
        return Math.max(m3010computeFillWidthiLBOSCw(j10, j11), m3007computeFillHeightiLBOSCw(j10, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m3009computeFillMinDimensioniLBOSCw(long j10, long j11) {
        return Math.min(m3010computeFillWidthiLBOSCw(j10, j11), m3007computeFillHeightiLBOSCw(j10, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m3010computeFillWidthiLBOSCw(long j10, long j11) {
        return Size.m1440getWidthimpl(j11) / Size.m1440getWidthimpl(j10);
    }
}
