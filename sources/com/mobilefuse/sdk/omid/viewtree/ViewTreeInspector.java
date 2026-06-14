package com.mobilefuse.sdk.omid.viewtree;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ViewTreeInspector {
    private static final String LOG_TAG = "mfsdk.ViewTreeInspector";
    private static final int MAX_DETECTION_LEVELS = 100;
    private static int NEXT_INSTANCE_ID = 1;
    private static final long OBSTRUCTIONS_CHECKING_DELAY = 200;

    @NonNull
    private final View adView;

    @NonNull
    private final Rect adViewVisibleRect;

    @NonNull
    private final ObstructionsChangeListener changeListener;
    private boolean checkingEnabled;
    private final int instanceId;

    @NonNull
    private final List<View> lastFriendlyObstructions;
    private final boolean logsEnabled;

    @NonNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NonNull
    private final Runnable checkObstructionsRunnable = new Runnable() { // from class: h5.b
        @Override // java.lang.Runnable
        public final void run() {
            ViewTreeInspector.a(this.f72955b);
        }
    };
    private int currentDetectionLevel = 0;

    public interface ObstructionsChangeListener {
        void onChanged(List<View> list) throws Throwable;
    }

    public ViewTreeInspector(@NonNull View view, @NonNull ObstructionsChangeListener obstructionsChangeListener) throws Throwable {
        this.adView = view;
        this.changeListener = obstructionsChangeListener;
        int i10 = NEXT_INSTANCE_ID;
        NEXT_INSTANCE_ID = i10 + 1;
        this.instanceId = i10;
        this.adViewVisibleRect = new Rect();
        this.lastFriendlyObstructions = new ArrayList();
        this.logsEnabled = Log.isLoggable(LOG_TAG, 2);
    }

    public static /* synthetic */ void a(ViewTreeInspector viewTreeInspector) {
        viewTreeInspector.getClass();
        try {
            viewTreeInspector.revealObstructions();
            viewTreeInspector.scheduleNextObstructionChecking();
        } catch (Throwable th2) {
            StabilityHelper.logException(viewTreeInspector, th2);
        }
    }

    @NonNull
    private List<View> detectAdViewTree() throws Throwable {
        this.currentDetectionLevel = 0;
        ArrayList arrayList = new ArrayList();
        this.adView.getGlobalVisibleRect(this.adViewVisibleRect);
        ViewParent parent = this.adView.getParent();
        if (parent instanceof ViewGroup) {
            detectViewGroup(arrayList, this.adView, (ViewGroup) parent);
        }
        return arrayList;
    }

    private void detectViewGroup(List<View> list, View view, ViewGroup viewGroup) throws Throwable {
        int i10 = this.currentDetectionLevel;
        if (i10 > 100) {
            return;
        }
        this.currentDetectionLevel = i10 + 1;
        int childCount = viewGroup.getChildCount();
        int iIndexOfChild = viewGroup.indexOfChild(view);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != view) {
                Rect rect = new Rect();
                childAt.getGlobalVisibleRect(rect);
                if (new Rect(this.adViewVisibleRect).intersect(rect) && viewIsOver(childAt, i11, view, iIndexOfChild) && verifyView(childAt)) {
                    list.add(childAt);
                }
            }
        }
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            detectViewGroup(list, viewGroup, (ViewGroup) parent);
        }
    }

    private boolean obstructionsChanged(List<View> list) throws Throwable {
        if (list.size() != this.lastFriendlyObstructions.size()) {
            return true;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            if (!this.lastFriendlyObstructions.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void revealObstructions() throws Throwable {
        logDebug("Check friendly obstructions");
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<View> listDetectAdViewTree = detectAdViewTree();
        boolean zObstructionsChanged = obstructionsChanged(listDetectAdViewTree);
        if (zObstructionsChanged) {
            this.lastFriendlyObstructions.clear();
            this.lastFriendlyObstructions.addAll(listDetectAdViewTree);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        logDebug("Completed friendly obstruction detection:");
        logDebug("    * processing time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    * found friendly obstructions count: ");
        sb2.append(listDetectAdViewTree.size());
        logDebug(sb2.toString());
        logDebug("    * found friendly obstructions:");
        Iterator<View> it = listDetectAdViewTree.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            logDebug("        #" + i10 + " - " + it.next().toString());
            i10++;
        }
        if (zObstructionsChanged) {
            this.changeListener.onChanged(listDetectAdViewTree);
        } else {
            logDebug("    *** Friendly obstructions are the same as last time. Don't dispatch change event.");
        }
    }

    private void scheduleNextObstructionChecking() throws Throwable {
        if (this.checkingEnabled) {
            this.handler.postDelayed(this.checkObstructionsRunnable, 200L);
        }
    }

    private boolean verifyView(View view) throws Throwable {
        if (!view.isShown() || view.getAlpha() == 0.0f || !viewHasTransparentBackground(view)) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (!view.isAttachedToWindow() || view.hasOnClickListeners()) {
            return false;
        }
        if (i10 < 30 || !view.hasOnLongClickListeners()) {
            return ((view instanceof ViewGroup) && viewGroupObstructionOverlapping((ViewGroup) view)) ? false : true;
        }
        return false;
    }

    private boolean viewGroupObstructionOverlapping(ViewGroup viewGroup) throws Throwable {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Rect rect = new Rect();
            childAt.getGlobalVisibleRect(rect);
            if (new Rect(this.adViewVisibleRect).intersect(rect)) {
                if (childAt.hasOnClickListeners()) {
                    return true;
                }
                if ((Build.VERSION.SDK_INT >= 30 && childAt.hasOnLongClickListeners()) || !viewHasTransparentBackground(childAt)) {
                    return true;
                }
                if ((childAt instanceof ViewGroup) && viewGroupObstructionOverlapping((ViewGroup) childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean viewHasTransparentBackground(View view) throws Throwable {
        Drawable background = view.getBackground();
        if (background == null || background.getAlpha() == 0 || background.getOpacity() == -2) {
            return true;
        }
        return (background instanceof ColorDrawable) && ((ColorDrawable) background).getAlpha() == 0;
    }

    private boolean viewIsOver(View view, int i10, View view2, int i11) throws Throwable {
        return view.getZ() > view2.getZ() || i10 > i11;
    }

    public void logDebug(String str) {
        if (this.logsEnabled) {
            Log.d("ViewTreeInspector", C4240b4.j.f42672d + this.instanceId + "]: " + str);
        }
    }

    public void startObstructionsChecking() throws Throwable {
        if (this.checkingEnabled) {
            return;
        }
        logDebug("Start friendly obstructions checking");
        this.handler.removeCallbacks(this.checkObstructionsRunnable);
        this.checkingEnabled = true;
        this.checkObstructionsRunnable.run();
    }

    public void stopObstructionsChecking() throws Throwable {
        if (this.checkingEnabled) {
            logDebug("Stop friendly obstructions checking");
            this.checkingEnabled = false;
            this.handler.removeCallbacks(this.checkObstructionsRunnable);
        }
    }
}
