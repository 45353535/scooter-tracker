package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private final ConstraintLayout mConstraintLayout;
    ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    static class State {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        ArrayList<Variant> mVariants = new ArrayList<>();

        State(Context context, XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
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
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
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
        ConstraintSet mConstraintSet;
        int mId;
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
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
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

    ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i10) {
        this.mConstraintLayout = constraintLayout;
        load(context, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void load(android.content.Context r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Error parsing resource: "
            java.lang.String r1 = "ConstraintLayoutStates"
            android.content.res.Resources r2 = r11.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r12)
            int r3 = r2.getEventType()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4 = 0
        L11:
            r5 = 1
            if (r3 == r5) goto Lab
            r6 = 2
            if (r3 == r6) goto L19
            goto L81
        L19:
            java.lang.String r3 = r2.getName()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            int r7 = r3.hashCode()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r8 = 4
            r9 = 3
            switch(r7) {
                case -1349929691: goto L53;
                case 80204913: goto L49;
                case 1382829617: goto L40;
                case 1657696882: goto L36;
                case 1901439077: goto L27;
                default: goto L26;
            }     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
        L26:
            goto L5d
        L27:
            java.lang.String r5 = "Variant"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r9
            goto L5e
        L31:
            r11 = move-exception
            goto L86
        L33:
            r11 = move-exception
            goto L99
        L36:
            java.lang.String r5 = "layoutDescription"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = 0
            goto L5e
        L40:
            java.lang.String r7 = "StateSet"
            boolean r3 = r3.equals(r7)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            goto L5e
        L49:
            java.lang.String r5 = "State"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r6
            goto L5e
        L53:
            java.lang.String r5 = "ConstraintSet"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r8
            goto L5e
        L5d:
            r5 = -1
        L5e:
            if (r5 == r6) goto L74
            if (r5 == r9) goto L69
            if (r5 == r8) goto L65
            goto L81
        L65:
            r10.parseConstraintSet(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L81
        L69:
            androidx.constraintlayout.widget.ConstraintLayoutStates$Variant r3 = new androidx.constraintlayout.widget.ConstraintLayoutStates$Variant     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r3.<init>(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r4 == 0) goto L81
            r4.add(r3)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L81
        L74:
            androidx.constraintlayout.widget.ConstraintLayoutStates$State r3 = new androidx.constraintlayout.widget.ConstraintLayoutStates$State     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r3.<init>(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates$State> r4 = r10.mStateList     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            int r5 = r3.mId     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4.put(r5, r3)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4 = r3
        L81:
            int r3 = r2.next()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L11
        L86:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
            goto Lab
        L99:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayoutStates.load(android.content.Context, int):void");
    }

    private void parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.load(context, xmlPullParser);
                this.mConstraintSetMap.put(identifier, constraintSet);
                return;
            }
        }
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

    public void updateConstraints(int i10, float f10, float f11) {
        int iFindMatch;
        int i11 = this.mCurrentStateId;
        if (i11 == i10) {
            State stateValueAt = i10 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i11);
            int i12 = this.mCurrentConstraintNumber;
            if ((i12 == -1 || !stateValueAt.mVariants.get(i12).match(f10, f11)) && this.mCurrentConstraintNumber != (iFindMatch = stateValueAt.findMatch(f10, f11))) {
                ConstraintSet constraintSet = iFindMatch == -1 ? this.mDefaultConstraintSet : stateValueAt.mVariants.get(iFindMatch).mConstraintSet;
                int i13 = iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID;
                if (constraintSet == null) {
                    return;
                }
                this.mCurrentConstraintNumber = iFindMatch;
                ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
                if (constraintsChangedListener != null) {
                    constraintsChangedListener.preLayoutChange(-1, i13);
                }
                constraintSet.applyTo(this.mConstraintLayout);
                ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.postLayoutChange(-1, i13);
                    return;
                }
                return;
            }
            return;
        }
        this.mCurrentStateId = i10;
        State state = this.mStateList.get(i10);
        int iFindMatch2 = state.findMatch(f10, f11);
        ConstraintSet constraintSet2 = iFindMatch2 == -1 ? state.mConstraintSet : state.mVariants.get(iFindMatch2).mConstraintSet;
        int i14 = iFindMatch2 == -1 ? state.mConstraintID : state.mVariants.get(iFindMatch2).mConstraintID;
        if (constraintSet2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
            return;
        }
        this.mCurrentConstraintNumber = iFindMatch2;
        ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i10, i14);
        }
        constraintSet2.applyTo(this.mConstraintLayout);
        ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i10, i14);
        }
    }
}
