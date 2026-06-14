package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f26687e = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26690d;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.internal.CheckableImageButton.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f26692b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel) {
            this.f26692b = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f26692b ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isCheckable() {
        return this.f26689c;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f26688b;
    }

    public boolean isPressable() {
        return this.f26690d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f26688b) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f26687e;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f26692b);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f26692b = this.f26688b;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f26689c != z10) {
            this.f26689c = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f26689c || this.f26688b == z10) {
            return;
        }
        this.f26688b = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f26690d = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f26690d) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f26688b);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26689c = true;
        this.f26690d = true;
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.CheckableImageButton.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(CheckableImageButton.this.isCheckable());
                accessibilityNodeInfoCompat.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }
}
