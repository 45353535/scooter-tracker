package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    int mDefaultState = -1;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        ArrayList<Variant> mVariants = new ArrayList<>();

        State(Context context, XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.State_android_id) {
                    this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == R.styleable.State_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f10, float f11) {
            for (int i10 = 0; i10 < this.mVariants.size(); i10++) {
                if (this.mVariants.get(i10).match(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        Variant(Context context, XmlPullParser xmlPullParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean match(float f10, float f11) {
            if (!Float.isNaN(this.mMinWidth) && f10 < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f11 < this.mMinHeight) {
                return false;
            }
            if (Float.isNaN(this.mMaxWidth) || f10 <= this.mMaxWidth) {
                return Float.isNaN(this.mMaxHeight) || f11 <= this.mMaxHeight;
            }
            return false;
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) {
        load(context, xmlPullParser);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void load(android.content.Context r11, org.xmlpull.v1.XmlPullParser r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ConstraintLayoutStates"
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r12)
            int[] r3 = androidx.constraintlayout.widget.R.styleable.StateSet
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r2, r3)
            int r3 = r2.getIndexCount()
            r4 = 0
            r5 = r4
        L14:
            if (r5 >= r3) goto L29
            int r6 = r2.getIndex(r5)
            int r7 = androidx.constraintlayout.widget.R.styleable.StateSet_defaultState
            if (r6 != r7) goto L26
            int r7 = r10.mDefaultState
            int r6 = r2.getResourceId(r6, r7)
            r10.mDefaultState = r6
        L26:
            int r5 = r5 + 1
            goto L14
        L29:
            r2.recycle()
            int r2 = r12.getEventType()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r3 = 0
        L31:
            r5 = 1
            if (r2 == r5) goto La8
            java.lang.String r6 = "StateSet"
            r7 = 3
            r8 = 2
            if (r2 == r8) goto L4e
            if (r2 == r7) goto L3e
            goto L9c
        L3e:
            java.lang.String r2 = r12.getName()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            boolean r2 = r6.equals(r2)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            if (r2 == 0) goto L9c
            goto La8
        L4a:
            r11 = move-exception
            goto La1
        L4c:
            r11 = move-exception
            goto La5
        L4e:
            java.lang.String r2 = r12.getName()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            int r9 = r2.hashCode()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            switch(r9) {
                case 80204913: goto L75;
                case 1301459538: goto L6b;
                case 1382829617: goto L64;
                case 1901439077: goto L5a;
                default: goto L59;
            }     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
        L59:
            goto L7f
        L5a:
            java.lang.String r5 = "Variant"
            boolean r2 = r2.equals(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            if (r2 == 0) goto L7f
            r5 = r7
            goto L80
        L64:
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            if (r2 == 0) goto L7f
            goto L80
        L6b:
            java.lang.String r5 = "LayoutDescription"
            boolean r2 = r2.equals(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            if (r2 == 0) goto L7f
            r5 = r4
            goto L80
        L75:
            java.lang.String r5 = "State"
            boolean r2 = r2.equals(r5)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            if (r2 == 0) goto L7f
            r5 = r8
            goto L80
        L7f:
            r5 = -1
        L80:
            if (r5 == r8) goto L90
            if (r5 == r7) goto L85
            goto L9c
        L85:
            androidx.constraintlayout.widget.StateSet$Variant r2 = new androidx.constraintlayout.widget.StateSet$Variant     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r2.<init>(r11, r12)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            if (r3 == 0) goto L9c
            r3.add(r2)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            goto L9c
        L90:
            androidx.constraintlayout.widget.StateSet$State r3 = new androidx.constraintlayout.widget.StateSet$State     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r3.<init>(r11, r12)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r2 = r10.mStateList     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            int r5 = r3.mId     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            r2.put(r5, r3)     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
        L9c:
            int r2 = r12.next()     // Catch: java.io.IOException -> L4a org.xmlpull.v1.XmlPullParserException -> L4c
            goto L31
        La1:
            android.util.Log.e(r1, r0, r11)
            goto La8
        La5:
            android.util.Log.e(r1, r0, r11)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.StateSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public int convertToConstraintSet(int i10, int i11, float f10, float f11) {
        State state = this.mStateList.get(i11);
        if (state == null) {
            return i11;
        }
        if (f10 != -1.0f && f11 != -1.0f) {
            Variant variant = null;
            for (Variant variant2 : state.mVariants) {
                if (variant2.match(f10, f11)) {
                    if (i10 != variant2.mConstraintID) {
                        variant = variant2;
                    }
                }
            }
            return variant != null ? variant.mConstraintID : state.mConstraintID;
        }
        if (state.mConstraintID != i10) {
            Iterator<Variant> it = state.mVariants.iterator();
            while (it.hasNext()) {
                if (i10 == it.next().mConstraintID) {
                }
            }
            return state.mConstraintID;
        }
        return i10;
    }

    public boolean needsToChange(int i10, float f10, float f11) {
        int i11 = this.mCurrentStateId;
        if (i11 != i10) {
            return true;
        }
        State stateValueAt = i10 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i11);
        int i12 = this.mCurrentConstraintNumber;
        return (i12 == -1 || !stateValueAt.mVariants.get(i12).match(f10, f11)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(f10, f11);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i10, int i11, int i12) {
        return updateConstraints(-1, i10, i11, i12);
    }

    public int updateConstraints(int i10, int i11, float f10, float f11) {
        int iFindMatch;
        if (i10 == i11) {
            State stateValueAt = i11 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(this.mCurrentStateId);
            if (stateValueAt == null) {
                return -1;
            }
            return ((this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(i10).match(f10, f11)) && i10 != (iFindMatch = stateValueAt.findMatch(f10, f11))) ? iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID : i10;
        }
        State state = this.mStateList.get(i11);
        if (state == null) {
            return -1;
        }
        int iFindMatch2 = state.findMatch(f10, f11);
        return iFindMatch2 == -1 ? state.mConstraintID : state.mVariants.get(iFindMatch2).mConstraintID;
    }
}
