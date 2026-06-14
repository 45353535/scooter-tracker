package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
public class CheckableGroup<T extends MaterialCheckable<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26681a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f26682b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnCheckedStateChangeListener f26683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26685e;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(MaterialCheckable materialCheckable) {
        int id2 = materialCheckable.getId();
        if (this.f26682b.contains(Integer.valueOf(id2))) {
            return false;
        }
        MaterialCheckable materialCheckable2 = (MaterialCheckable) this.f26681a.get(Integer.valueOf(getSingleCheckedId()));
        if (materialCheckable2 != null) {
            g(materialCheckable2, false);
        }
        boolean zAdd = this.f26682b.add(Integer.valueOf(id2));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.f26683c;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(MaterialCheckable materialCheckable, boolean z10) {
        int id2 = materialCheckable.getId();
        if (!this.f26682b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && this.f26682b.size() == 1 && this.f26682b.contains(Integer.valueOf(id2))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = this.f26682b.remove(Integer.valueOf(id2));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t10) {
        this.f26681a.put(Integer.valueOf(t10.getId()), t10);
        if (t10.isChecked()) {
            e(t10);
        }
        t10.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(T t11, boolean z10) {
                if (!z10) {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.g(t11, checkableGroup.f26685e)) {
                        return;
                    }
                } else if (!CheckableGroup.this.e(t11)) {
                    return;
                }
                CheckableGroup.this.f();
            }
        });
    }

    public void check(@IdRes int i10) {
        MaterialCheckable materialCheckable = (MaterialCheckable) this.f26681a.get(Integer.valueOf(i10));
        if (materialCheckable != null && e(materialCheckable)) {
            f();
        }
    }

    public void clearCheck() {
        boolean zIsEmpty = this.f26682b.isEmpty();
        Iterator it = this.f26681a.values().iterator();
        while (it.hasNext()) {
            g((MaterialCheckable) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        f();
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.f26682b);
    }

    @NonNull
    public List<Integer> getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int getSingleCheckedId() {
        if (!this.f26684d || this.f26682b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f26682b.iterator().next()).intValue();
    }

    public boolean isSelectionRequired() {
        return this.f26685e;
    }

    public boolean isSingleSelection() {
        return this.f26684d;
    }

    public void removeCheckable(T t10) {
        t10.setInternalOnCheckedChangeListener(null);
        this.f26681a.remove(Integer.valueOf(t10.getId()));
        this.f26682b.remove(Integer.valueOf(t10.getId()));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.f26683c = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f26685e = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f26684d != z10) {
            this.f26684d = z10;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i10) {
        MaterialCheckable materialCheckable = (MaterialCheckable) this.f26681a.get(Integer.valueOf(i10));
        if (materialCheckable != null && g(materialCheckable, this.f26685e)) {
            f();
        }
    }
}
