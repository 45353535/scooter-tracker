package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MotionSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleArrayMap f25297a = new SimpleArrayMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SimpleArrayMap f25298b = new SimpleArrayMap();

    private static void a(MotionSpec motionSpec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            motionSpec.setTiming(objectAnimator.getPropertyName(), MotionTiming.a(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    private PropertyValuesHolder[] b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i10 = 0; i10 < propertyValuesHolderArr.length; i10++) {
            propertyValuesHolderArr2[i10] = propertyValuesHolderArr[i10].clone();
        }
        return propertyValuesHolderArr2;
    }

    private static MotionSpec c(List list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(motionSpec, (Animator) list.get(i10));
        }
        return motionSpec;
    }

    @Nullable
    public static MotionSpec createFromAttribute(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    @Nullable
    public static MotionSpec createFromResource(@NonNull Context context, @AnimatorRes int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.f25297a.equals(((MotionSpec) obj).f25297a);
        }
        return false;
    }

    @NonNull
    public <T> ObjectAnimator getAnimator(@NonNull String str, @NonNull T t10, @NonNull Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t10, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @NonNull
    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return b((PropertyValuesHolder[]) this.f25298b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return (MotionTiming) this.f25297a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int size = this.f25297a.getSize();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            MotionTiming motionTiming = (MotionTiming) this.f25297a.valueAt(i10);
            jMax = Math.max(jMax, motionTiming.getDelay() + motionTiming.getDuration());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.f25298b.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.f25297a.get(str) != null;
    }

    public int hashCode() {
        return this.f25297a.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f25298b.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, @Nullable MotionTiming motionTiming) {
        this.f25297a.put(str, motionTiming);
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f25297a + "}\n";
    }
}
