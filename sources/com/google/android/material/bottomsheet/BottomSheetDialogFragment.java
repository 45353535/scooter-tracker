package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes9.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25682b;

    private class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        private BottomSheetDismissCallback() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i10) {
            if (i10 == 5) {
                BottomSheetDialogFragment.this.c();
            }
        }
    }

    public BottomSheetDialogFragment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f25682b) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void d(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f25682b = z10;
        if (bottomSheetBehavior.getState() == 5) {
            c();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).h();
        }
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetDismissCallback());
        bottomSheetBehavior.setState(5);
    }

    private boolean e(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof BottomSheetDialog)) {
            return false;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        if (!behavior.isHideable() || !bottomSheetDialog.getDismissWithAnimation()) {
            return false;
        }
        d(behavior, z10);
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (e(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (e(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }

    @SuppressLint({"ValidFragment"})
    public BottomSheetDialogFragment(@LayoutRes int i10) {
        super(i10);
    }
}
