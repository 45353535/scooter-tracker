package io.sentry.android.core.internal.gestures;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements Window.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Window.Callback f82508b;

    public k(Window.Callback callback) {
        this.f82508b = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f82508b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f82508b.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f82508b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f82508b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f82508b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f82508b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f82508b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f82508b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f82508b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f82508b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f82508b.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        return this.f82508b.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f82508b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f82508b.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f82508b.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f82508b.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f82508b.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f82508b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f82508b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this.f82508b.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f82508b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f82508b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f82508b.onWindowStartingActionMode(callback, i10);
    }
}
