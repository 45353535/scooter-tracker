package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import j$.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialBackOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BackCallbackDelegate f26943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaterialBackHandler f26944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f26945c;

    @RequiresApi(33)
    private static class Api33BackCallbackDelegate implements BackCallbackDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OnBackInvokedCallback f26946a;

        private Api33BackCallbackDelegate() {
        }

        OnBackInvokedCallback a(final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: com.google.android.material.motion.b
                public final void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }
            };
        }

        boolean b() {
            return this.f26946a != null;
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void startListeningForBackCallbacks(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f26946a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackA = a(materialBackHandler);
                this.f26946a = onBackInvokedCallbackA;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackA);
            }
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void stopListeningForBackCallbacks(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f26946a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f26946a);
            this.f26946a = null;
        }
    }

    @RequiresApi(34)
    private static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        private Api34BackCallbackDelegate() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        OnBackInvokedCallback a(final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                public void onBackCancelled() {
                    if (Api34BackCallbackDelegate.this.b()) {
                        materialBackHandler.cancelBackProgress();
                    }
                }

                public void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }

                public void onBackProgressed(@NonNull BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.b()) {
                        materialBackHandler.updateBackProgress(new BackEventCompat(backEvent));
                    }
                }

                public void onBackStarted(@NonNull BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.b()) {
                        materialBackHandler.startBackProgress(new BackEventCompat(backEvent));
                    }
                }
            };
        }
    }

    private interface BackCallbackDelegate {
        void startListeningForBackCallbacks(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z10);

        void stopListeningForBackCallbacks(@NonNull View view);
    }

    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(@NonNull T t10) {
        this(t10, t10);
    }

    private static BackCallbackDelegate a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new Api34BackCallbackDelegate();
        }
        if (i10 >= 33) {
            return new Api33BackCallbackDelegate();
        }
        return null;
    }

    private void b(boolean z10) {
        BackCallbackDelegate backCallbackDelegate = this.f26943a;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.startListeningForBackCallbacks(this.f26944b, this.f26945c, z10);
        }
    }

    public boolean shouldListenForBackCallbacks() {
        return this.f26943a != null;
    }

    public void startListeningForBackCallbacks() {
        b(false);
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        b(true);
    }

    public void stopListeningForBackCallbacks() {
        BackCallbackDelegate backCallbackDelegate = this.f26943a;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.stopListeningForBackCallbacks(this.f26945c);
        }
    }

    public MaterialBackOrchestrator(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view) {
        this.f26943a = a();
        this.f26944b = materialBackHandler;
        this.f26945c = view;
    }
}
